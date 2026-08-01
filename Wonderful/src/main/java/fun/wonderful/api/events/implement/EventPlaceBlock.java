package fun.wonderful.api.events.implement;

import fun.wonderful.api.events.Event;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class EventPlaceBlock
extends Event {
    private final Block block;
    private final BlockPos pos;

    @Generated
    public Block getBlock() {
        return this.block;
    }

    @Generated
    public BlockPos getPos() {
        return this.pos;
    }

    @Generated
    public EventPlaceBlock(Block block, BlockPos pos) {
        this.block = block;
        this.pos = pos;
    }
}