/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl;

public abstract class GlObject {
    private static final int INVALID_HANDLE = Integer.MIN_VALUE;
    private int handle = Integer.MIN_VALUE;

    public final int handle() {
        this.checkHandle();
        return this.handle;
    }

    protected final void setHandle(int n) {
        this.handle = n;
    }

    protected final boolean isHandleValid() {
        return this.handle != Integer.MIN_VALUE;
    }

    protected final void checkHandle() {
        if (!this.isHandleValid()) {
            throw new IllegalStateException("Handle is not valid");
        }
    }

    public final void invalidateHandle() {
        this.handle = Integer.MIN_VALUE;
    }
}

