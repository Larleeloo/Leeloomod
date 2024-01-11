package net.leeloo.leeloomod;

import com.mojang.logging.LogUtils;
import net.leeloo.leeloomod.block.ModBlocks;
import net.leeloo.leeloomod.block.entity.ModBlockEntities;
import net.leeloo.leeloomod.entity.ModEntities;
import net.leeloo.leeloomod.entity.client.ModBoatRenderer;
import net.leeloo.leeloomod.entity.client.RhinoRenderer;
import net.leeloo.leeloomod.entity.client.TrexRenderer;
import net.leeloo.leeloomod.item.ModCreativeModTabs;
import net.leeloo.leeloomod.item.ModItems;
import net.leeloo.leeloomod.loot.ModLootModifiers;
import net.leeloo.leeloomod.recipe.ModRecipes;
import net.leeloo.leeloomod.screen.GemPolishingStationScreen;
import net.leeloo.leeloomod.screen.MauviniteRefiningScreen;
import net.leeloo.leeloomod.screen.ModMenuTypes;
import net.leeloo.leeloomod.sound.ModSounds;
import net.leeloo.leeloomod.util.ModWoodTypes;
import net.leeloo.leeloomod.villager.ModVillagers;
import net.leeloo.leeloomod.worldgen.biome.ModTerrablender;
import net.leeloo.leeloomod.worldgen.biome.surface.ModSurfaceRules;
import net.leeloo.leeloomod.worldgen.tree.ModFoliagePlacers;
import net.leeloo.leeloomod.worldgen.tree.ModTrunkPlacerTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LeelooMod.MOD_ID)
public class LeelooMod {
    public static final String MOD_ID = "leeloomod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LeelooMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLootModifiers.register(modEventBus);
        ModVillagers.register(modEventBus);

        ModSounds.register(modEventBus);
        ModEntities.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);
        ModTrunkPlacerTypes.register(modEventBus);

        ModFoliagePlacers.register(modEventBus);
        ModTerrablender.registerBiomes();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CATMINT.getId(), ModBlocks.POTTED_CATMINT);

            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, ModSurfaceRules.makeRules());
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.RAW_SAPPHIRE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.PINE);

            EntityRenderers.register(ModEntities.RHINO.get(), RhinoRenderer::new);
            EntityRenderers.register(ModEntities.TREX.get(), TrexRenderer::new);
            EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));

            EntityRenderers.register(ModEntities.DICE_PROJECTILE.get(), ThrownItemRenderer::new);

            MenuScreens.register(ModMenuTypes.GEM_POLISHING_MENU.get(), GemPolishingStationScreen::new);
            MenuScreens.register(ModMenuTypes.MAUVINITE_REFINING_MENU_TYPE.get(), MauviniteRefiningScreen::new);



            ItemBlockRenderTypes.setRenderLayer(ModBlocks.AMBER_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ETHEREAL_ORE.get(), RenderType.translucent());
        }
    }
}
