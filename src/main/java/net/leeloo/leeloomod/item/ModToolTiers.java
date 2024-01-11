package net.leeloo.leeloomod.item;

import net.leeloo.leeloomod.LeelooMod;
import net.leeloo.leeloomod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(LeelooMod.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier MAUVINITE = TierSortingRegistry.registerTier(
            new ForgeTier(6, 10000, 15f, 5f, 30,
                    ModTags.Blocks.NEEDS_MAUVINITE_TOOL, () -> Ingredient.of(ModItems.MAUVINITE.get())),
            new ResourceLocation(LeelooMod.MOD_ID, "mauvinite"), List.of(Tiers.NETHERITE), List.of());

}
