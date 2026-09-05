/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.util.UInt32
 */
package net.caffeinemc.mods.sodium.client.gl.arena;

import net.caffeinemc.mods.sodium.client.util.UInt32;

class PendingBufferCopyCommand {
    private final int readOffset;
    private final int writeOffset;
    private int length;

    PendingBufferCopyCommand(long l, long l2, long l3) {
        this.readOffset = UInt32.downcast((long)l);
        this.writeOffset = UInt32.downcast((long)l2);
        this.length = UInt32.downcast((long)l3);
    }

    public long getLength() {
        return UInt32.upcast((int)this.length);
    }

    public void setLength(long l) {
        this.length = UInt32.downcast((long)l);
    }

    public long getWriteOffset() {
        return UInt32.upcast((int)this.writeOffset);
    }

    public long getReadOffset() {
        return UInt32.upcast((int)this.readOffset);
    }
}

