/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.transfer.v1.fluid.base;

import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.SingleFluidStorage;

class SingleFluidStorage$1
extends SingleFluidStorage {
    final /* synthetic */ long val$capacity;
    final /* synthetic */ Runnable val$onChange;

    SingleFluidStorage$1(long l, Runnable runnable) {
        this.val$capacity = l;
        this.val$onChange = runnable;
    }

    protected long getCapacity(FluidVariant fluidVariant) {
        return this.val$capacity;
    }

    public void onFinalCommit() {
        this.val$onChange.run();
    }
}

