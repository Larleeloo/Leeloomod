package net.leeloo.leeloomod.worldgen;

import net.leeloo.leeloomod.LeelooMod;
import net.leeloo.leeloomod.block.ModBlocks;
import net.leeloo.leeloomod.worldgen.tree.custom.PineFoliagePlacer;
import net.leeloo.leeloomod.worldgen.tree.custom.PineTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ETHEREAL_ORE_KEY = registerKey("ethereal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LAVA_SPONGE_KEY = registerKey("lava_sponge_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_STRANGE_STONE_KEY = registerKey("strange_stone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EMBEDDED_MAUVINITE_KEY = registerKey("embedded_mauvinite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EMBEDDED_AMBER_KEY = registerKey("embedded_amber_ore");

    /**************************************************/
/*    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY = registerKey("nether_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAPPHIRE_ORE_KEY = registerKey("end_sapphire_ore");
*/
    public static final ResourceKey<ConfiguredFeature<?, ?>> ETHEREAL_KEY = registerKey("pine");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplacables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);
        RuleTest grassReplaceables = new BlockMatchTest(Blocks.GRASS_BLOCK);
        RuleTest airReplaceables = new BlockMatchTest(Blocks.AIR);


   /*     List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));*/

        List<OreConfiguration.TargetBlockState> overworldLavaSpongeOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.LAVA_SPONGE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.LAVA_SPONGE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(grassReplaceables,ModBlocks.LAVA_SPONGE_BLOCK.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldEmbeddedMauviniteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.EMBEDDED_MAUVINITE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.EMBEDDED_MAUVINITE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldEtherealOres = List.of(OreConfiguration.target(airReplaceables,
                        ModBlocks.ETHEREAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(grassReplaceables, ModBlocks.ETHEREAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldEmbeddedAmberOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.EMBEDDED_AMBER.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.EMBEDDED_AMBER.get().defaultBlockState()),
                OreConfiguration.target(grassReplaceables, ModBlocks.EMBEDDED_AMBER.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldStrangeStoneOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.STRANGE_STONE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.STRANGE_STONE.get().defaultBlockState()));

/*        register(context, OVERWORLD_ETHEREAL_ORE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PINE_LOG.get()),
                new PineTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(ModBlocks.ETHEREAL_ORE.get()),
                new PineFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());*/
        register(context, OVERWORLD_ETHEREAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldEtherealOres, 16));
        register(context, OVERWORLD_LAVA_SPONGE_KEY, Feature.ORE, new OreConfiguration(overworldLavaSpongeOres, 6));
        register(context, OVERWORLD_STRANGE_STONE_KEY, Feature.ORE, new OreConfiguration(overworldStrangeStoneOres, 9));
        register(context, OVERWORLD_EMBEDDED_AMBER_KEY, Feature.ORE, new OreConfiguration(overworldEmbeddedAmberOres, 6));
        register(context, OVERWORLD_EMBEDDED_MAUVINITE_KEY, Feature.ORE, new OreConfiguration(overworldEmbeddedMauviniteOres, 3));

   /*     register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 9));
        register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables,
                ModBlocks.NETHER_SAPPHIRE_ORE.get().defaultBlockState(), 9));
        register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.END_STONE_SAPPHIRE_ORE.get().defaultBlockState(), 9));

        */register(context, ETHEREAL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ETHEREAL_ORE.get()),
                new PineTrunkPlacer(1, 1, 1),

                BlockStateProvider.simple(ModBlocks.ETHEREAL_ORE.get()),
                new PineFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(LeelooMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
