/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.util.UInt32
 */
package net.caffeinemc.mods.sodium.client.gl.arena;

import net.caffeinemc.mods.sodium.client.gl.arena.GlBufferArena;
import net.caffeinemc.mods.sodium.client.util.UInt32;

public class GlBufferSegment {
    private final GlBufferArena arena;
    private boolean free = false;
    private int offset;
    private int length;
    private GlBufferSegment next;
    private GlBufferSegment prev;

    public GlBufferSegment(GlBufferArena glBufferArena, long l, long l2) {
        this.arena = glBufferArena;
        this.offset = UInt32.downcast((long)l);
        this.length = UInt32.downcast((long)l2);
    }

    public long getLength() {
        return UInt32.upcast((int)this.length);
    }

    public void delete() {
        this.arena.free(this);
    }

    protected void setLength(long l) {
        this.length = UInt32.downcast((long)l);
    }

    public long getOffset() {
        return UInt32.upcast((int)this.offset);
    }

    protected void setOffset(long l) {
        this.offset = UInt32.downcast((long)l);
    }

    protected GlBufferSegment getNext() {
        return this.next;
    }

    protected long getEnd() {
        return this.getOffset() + this.getLength();
    }

    protected void setNext(GlBufferSegment glBufferSegment) {
        this.next = glBufferSegment;
    }

    protected void mergeInto(GlBufferSegment glBufferSegment) {
        this.setLength(this.getLength() + glBufferSegment.getLength());
        this.setNext(glBufferSegment.getNext());
        if (this.getNext() != null) {
            this.getNext().setPrev(this);
        }
    }

    protected void setFree(boolean bl) {
        this.free = bl;
    }

    protected GlBufferSegment getPrev() {
        return this.prev;
    }

    protected boolean isFree() {
        return this.free;
    }

    protected void setPrev(GlBufferSegment glBufferSegment) {
        this.prev = glBufferSegment;
    }
}

