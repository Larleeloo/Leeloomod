package net.leeloo.leeloomod.block.custom;

import net.leeloo.leeloomod.block.ModBlocks;
import net.leeloo.leeloomod.buckets.LavaBucketPickup;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public class RadiantBlock extends Block {
    public static final int MAX_DEPTH = 6;
    public static final int MAX_COUNT = 64;
    private static final Direction[] ALL_DIRECTIONS = Direction.values();

    public RadiantBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
    }

    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        if (!pOldState.is(pState.getBlock())) {
            this.tryAbsorbLava(pLevel, pPos);
        }
    }

    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pBlock, BlockPos pFromPos, boolean pIsMoving) {
        this.tryAbsorbLava(pLevel, pPos);
        super.neighborChanged(pState, pLevel, pPos, pBlock, pFromPos, pIsMoving);
    }

    protected void tryAbsorbLava(Level pLevel, BlockPos pPos) {
        if (this.removeLavaBreadthFirstSearch(pLevel, pPos)) {
            pLevel.setBlock(pPos, ModBlocks.STRANGE_STONE.get().defaultBlockState(), 2);
            pLevel.levelEvent(2001, pPos, Block.getId(Blocks.LAVA.defaultBlockState()));
        }

    }

    private boolean removeLavaBreadthFirstSearch(Level pLevel, BlockPos pPos) {
        BlockState lavaSpongeState = Blocks.SPONGE.defaultBlockState();
        return BlockPos.breadthFirstTraversal(pPos, 600000, 6500000, (p_277519_, p_277492_) -> {
            for(Direction direction : ALL_DIRECTIONS) {
                p_277492_.accept(p_277519_.relative(direction));
            }

        }, (currentSearchBlockPos) -> {
            if (currentSearchBlockPos.equals(pPos)) {
                return true;
            } else {
                BlockState blockstate = pLevel.getBlockState(currentSearchBlockPos);
                FluidState fluidstate = pLevel.getFluidState(currentSearchBlockPos);
                if (!fluidstate.getType().isSame(Fluids.LAVA)) {
                    return false;
                } else {
                    Block block = blockstate.getBlock();
                    if (block instanceof LavaBucketPickup) {
                        LavaBucketPickup lavaBucketPickup = (LavaBucketPickup)block;
                        if (!lavaBucketPickup.pickupBlock(pLevel, currentSearchBlockPos, blockstate).isEmpty()) {
                            return true;
                        }
                    }

                    if (blockstate.getBlock() instanceof LiquidBlock) {
                        pLevel.setBlock(currentSearchBlockPos, Blocks.AIR.defaultBlockState(), 3);
                    } else {
                        if (!blockstate.is(Blocks.KELP) && !blockstate.is(Blocks.KELP_PLANT) && !blockstate.is(Blocks.SEAGRASS) && !blockstate.is(Blocks.TALL_SEAGRASS)) {
                            return false;
                        }

                        BlockEntity blockentity = blockstate.hasBlockEntity() ? pLevel.getBlockEntity(currentSearchBlockPos) : null;
                        dropResources(blockstate, pLevel, currentSearchBlockPos, blockentity);
                        pLevel.setBlock(currentSearchBlockPos, Blocks.AIR.defaultBlockState(), 3);
                    }

                    return true;
                }
            }
        }) > 1;
    }
}

