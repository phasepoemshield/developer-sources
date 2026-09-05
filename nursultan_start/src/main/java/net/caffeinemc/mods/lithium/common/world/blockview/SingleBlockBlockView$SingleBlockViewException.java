/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.world.blockview;

public class SingleBlockBlockView$SingleBlockViewException
extends RuntimeException {
    public static final SingleBlockBlockView$SingleBlockViewException INSTANCE = new SingleBlockBlockView$SingleBlockViewException();

    private SingleBlockBlockView$SingleBlockViewException() {
        this.setStackTrace(new StackTraceElement[0]);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

