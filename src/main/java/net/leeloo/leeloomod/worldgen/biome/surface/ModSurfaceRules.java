package net.leeloo.leeloomod.worldgen.biome.surface;


import net.leeloo.leeloomod.block.ModBlocks;
import net.leeloo.leeloomod.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource SAPPHIRE = makeStateRule(ModBlocks.SAPPHIRE_BLOCK.get());
    private static final SurfaceRules.RuleSource RAW_SAPPHIRE = makeStateRule(ModBlocks.RAW_SAPPHIRE_BLOCK.get());


    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.ConditionSource isAtGen115 = SurfaceRules.yBlockCheck(VerticalAnchor.aboveBottom(115),384);
        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);
        //SurfaceRules.RuleSource peak = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtGen115, SAPPHIRE), RAW_SAPPHIRE);

        return SurfaceRules.sequence(
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.TEST_BIOME),
                        (SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(), grassSurface ))),
                SurfaceRules.ifTrue(isAtGen115, SAPPHIRE)));

    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
