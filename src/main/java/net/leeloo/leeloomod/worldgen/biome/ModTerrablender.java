package net.leeloo.leeloomod.worldgen.biome;

import net.leeloo.leeloomod.LeelooMod;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(LeelooMod.MOD_ID, "overworld"), 5));
    }
}
