/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.impl.registry.sync.RemappableRegistry$RemapMode
 */
package Nursultan;

import net.fabricmc.fabric.impl.registry.sync.RemappableRegistry;

public class class09397 {
    public static final /* synthetic */ int[] N;

    static {
        N = new int[RemappableRegistry.RemapMode.values().length];
        try {
            class09397.N[RemappableRegistry.RemapMode.AUTHORITATIVE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class09397.N[RemappableRegistry.RemapMode.REMOTE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

