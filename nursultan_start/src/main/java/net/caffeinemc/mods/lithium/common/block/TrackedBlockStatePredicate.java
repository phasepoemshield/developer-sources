/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlags
 */
package net.caffeinemc.mods.lithium.common.block;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import minecraft.class00500;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;

public abstract class TrackedBlockStatePredicate
implements Predicate<class00500> {
    public static final AtomicBoolean FULLY_INITIALIZED = new AtomicBoolean(false);
    private final int index;

    public TrackedBlockStatePredicate(int n) {
        if (FULLY_INITIALIZED.get()) {
            throw new IllegalStateException("Lithium Cached BlockState Flags: Cannot register more flags after assuming to be fully initialized.");
        }
        this.index = n;
    }

    static {
        if (!BlockStateFlags.ENABLED) {
            System.out.println("Lithium Cached BlockState Flags are disabled!");
        }
    }

    public int getIndex() {
        return this.index;
    }
}

