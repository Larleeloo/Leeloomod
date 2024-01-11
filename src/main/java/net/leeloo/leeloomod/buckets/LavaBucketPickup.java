package net.leeloo.leeloomod.buckets;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;

    public interface LavaBucketPickup extends net.minecraftforge.common.extensions.IForgeBucketPickup {
        ItemStack pickupBlock(LevelAccessor pLevel, BlockPos pPos, BlockState pState);

    }
