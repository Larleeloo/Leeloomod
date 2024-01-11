package net.leeloo.leeloomod.util;

import net.leeloo.leeloomod.LeelooMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType PINE = WoodType.register(new WoodType(LeelooMod.MOD_ID + ":pine", BlockSetType.OAK));
}
