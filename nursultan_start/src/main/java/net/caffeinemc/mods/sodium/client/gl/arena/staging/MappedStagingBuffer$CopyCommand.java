/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.arena.staging;

import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;

final class MappedStagingBuffer$CopyCommand {
    final GlBuffer buffer;
    final long readOffset;
    final long writeOffset;
    long bytes;

    MappedStagingBuffer$CopyCommand(GlBuffer glBuffer, long l, long l2, long l3) {
        this.buffer = glBuffer;
        this.readOffset = l;
        this.writeOffset = l2;
        this.bytes = l3;
    }

    public MappedStagingBuffer$CopyCommand(MappedStagingBuffer$CopyCommand mappedStagingBuffer$CopyCommand) {
        this.buffer = mappedStagingBuffer$CopyCommand.buffer;
        this.writeOffset = mappedStagingBuffer$CopyCommand.writeOffset;
        this.readOffset = mappedStagingBuffer$CopyCommand.readOffset;
        this.bytes = mappedStagingBuffer$CopyCommand.bytes;
    }
}

