package net.leeloo.leeloomod.util;

import net.leeloo.leeloomod.LeelooMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("needs_sapphire_tool");

        public static final TagKey<Block> NEEDS_MAUVINITE_TOOL = tag("needs_mauvinite_tool");



        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(LeelooMod.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> MAUVINITE_ARMOR_TAG = tag("mauvinite_armor_tag");
        public static final TagKey<Item> MAUVINITE_ITEM_TAG = tag("mauvinite_item_tag");
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(LeelooMod.MOD_ID, name));
        }
    }

    public static class Biomes {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(LeelooMod.MOD_ID, name));
        }
    }
}
