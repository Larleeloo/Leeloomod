package net.leeloo.leeloomod.item;

import net.leeloo.leeloomod.LeelooMod;
import net.leeloo.leeloomod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LeelooMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MAUVINITE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {


                        pOutput.accept(ModItems.MAUVINITE.get());
                        pOutput.accept(ModItems.MAUVINITE_BOOTS.get());
                        pOutput.accept(ModItems.MAUVINITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.MAUVINITE_HELMET.get());
                        pOutput.accept(ModItems.MAUVINITE_LEGGINGS.get());
                        pOutput.accept(ModItems.MAUVINITE_PICKAXE.get());
                        pOutput.accept(ModItems.MAUVINITE_SHARD.get());
                        pOutput.accept(ModItems.MAUVINITE_SWORD.get());
                        pOutput.accept(ModItems.MYSTERIOUS_FOSSIL.get());
                        pOutput.accept(ModItems.UNKNOWN_FOSSIL.get());
                        pOutput.accept(ModItems.AMBER.get());
                        pOutput.accept(ModItems.BLOCK_FAB.get());
                        pOutput.accept(ModItems.FAB_ACACIA.get());
                        pOutput.accept(ModItems.FAB_BIRCH.get());
                        pOutput.accept(ModItems.FAB_CHERRY.get());
                        pOutput.accept(ModItems.FAB_CRIMSON.get());
                        pOutput.accept(ModItems.FAB_DARK_OAK.get());
                        pOutput.accept(ModItems.FAB_JUNGLE.get());
                        pOutput.accept(ModItems.FAB_MANGROVE.get());
                        pOutput.accept(ModItems.FAB_OAK.get());
                        pOutput.accept(ModItems.FAB_SPRUCE.get());
                        pOutput.accept(ModItems.FAB_WARPED.get());



                        pOutput.accept(ModBlocks.STRANGE_STONE.get());
                        //pOutput.accept(ModBlocks.MAUVINITE_ORE.get());
                        pOutput.accept(ModBlocks.ENCAPSULATED_MAUVINITE.get());
                        pOutput.accept(ModBlocks.EMBEDDED_MAUVINITE.get());
                        pOutput.accept(ModBlocks.EMBEDDED_AMBER.get());
                        pOutput.accept(ModBlocks.AMBER_BLOCK.get());
                        pOutput.accept(ModBlocks.MAUVINITE_REFINER.get());
                        pOutput.accept(ModBlocks.LAVA_SPONGE_BLOCK.get());
                        pOutput.accept(ModBlocks.LAVA_SPONGE_BLOCK_FULL.get());

                        /**************************************/
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.PINE_CONE.get());
                        pOutput.accept(ModItems.SAPPHIRE_STAFF.get());

                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(ModItems.SAPPHIRE_HOE.get());

                        pOutput.accept(ModItems.SAPPHIRE_HELMET.get());
                        pOutput.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(ModItems.SAPPHIRE_BOOTS.get());

                        pOutput.accept(ModItems.STRAWBERRY_SEEDS.get());

                        pOutput.accept(ModItems.CORN.get());
                        pOutput.accept(ModItems.CORN_SEEDS.get());

                        pOutput.accept(ModItems.BAR_BRAWL_MUSIC_DISC.get());
                        pOutput.accept(ModItems.RHINO_SPANW_EGG.get());

                        pOutput.accept(ModItems.PINE_SIGN.get());
                        pOutput.accept(ModItems.PINE_HANGING_SIGN.get());

                        pOutput.accept(ModItems.PINE_BOAT.get());
                        pOutput.accept(ModItems.PINE_CHEST_BOAT.get());

                        pOutput.accept(ModItems.DICE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());

                        pOutput.accept(ModBlocks.CATMINT.get());
                        pOutput.accept(ModBlocks.GEM_POLISHING_STATION.get());

                        pOutput.accept(ModBlocks.PINE_LOG.get());
                        pOutput.accept(ModBlocks.PINE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINE_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINE_WOOD.get());

                        pOutput.accept(ModBlocks.PINE_PLANKS.get());
     /*                   pOutput.accept(ModBlocks.PINE_LEAVES.get());*/
/*
                        pOutput.accept(ModBlocks.PINE_SAPLING.get());*/

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
