package net.leeloo.leeloomod.worldgen;

import net.leeloo.leeloomod.LeelooMod;
import net.leeloo.leeloomod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ETHEREAL_ORE_PLACED_KEY = registerKey("ethereal_ore_placed");
    public static final ResourceKey<PlacedFeature> LAVA_SPONGE_PLACED_KEY = registerKey("lava_sponge_placed");
    public static final ResourceKey<PlacedFeature> STRANGE_STONE_PLACED_KEY = registerKey("strange_stone_placed");
    public static final ResourceKey<PlacedFeature> EMBEDDED_MAUVINITE_PLACED_KEY = registerKey("embedded_mauvinite_placed");
    public static final ResourceKey<PlacedFeature> EMBEDDED_AMBER_PLACED_KEY = registerKey("embedded_amber_placed");




    /***********************************/
/*    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SAPPHIRE_ORE_PLACED_KEY = registerKey("nether_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> END_SAPPHIRE_ORE_PLACED_KEY = registerKey("end_sapphire_ore_placed");
*/
    public static final ResourceKey<PlacedFeature> ETHEREAL_PLACED_KEY = registerKey("pine_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ETHEREAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ETHEREAL_ORE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3,0.1f,2), ModBlocks.ETHEREAL_ORE.get()));

        register(context, LAVA_SPONGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LAVA_SPONGE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-256), VerticalAnchor.absolute(200))));

        register(context, STRANGE_STONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_STRANGE_STONE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-256), VerticalAnchor.absolute(-64))));

        register(context, EMBEDDED_MAUVINITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_EMBEDDED_MAUVINITE_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-256), VerticalAnchor.absolute(-100))));

        register(context, EMBEDDED_AMBER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_EMBEDDED_AMBER_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-256), VerticalAnchor.absolute(200))));

/*
        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, NETHER_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, END_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
*/
        register(context, ETHEREAL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ETHEREAL_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(350))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(LeelooMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
