package net.leeloo.leeloomod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class LeeloomodClientConfigs {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static{
        BUILDER.push("Configs for Leeloomod");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
