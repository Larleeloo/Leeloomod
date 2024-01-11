package net.leeloo.leeloomod.datagen;

import net.leeloo.leeloomod.LeelooMod;
import net.leeloo.leeloomod.block.ModBlocks;
import net.leeloo.leeloomod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, LeelooMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.MAUVINITE_HELMET.get(),
                        ModItems.MAUVINITE_CHESTPLATE.get(),
                        ModItems.MAUVINITE_LEGGINGS.get(),
                        ModItems.MAUVINITE_BOOTS.get());

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_MUSIC_DISC.get());

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_MUSIC_DISC.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.PINE_LOG.get().asItem())
                .add(ModBlocks.PINE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PINE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PINE_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.PINE_PLANKS.get().asItem());
    }
}
