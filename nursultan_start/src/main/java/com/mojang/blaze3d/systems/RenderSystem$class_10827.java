/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuFence;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class RenderSystem$class_10827
extends Record {
    final Runnable comp_3785;
    final GpuFence comp_3786;

    RenderSystem$class_10827(Runnable runnable, GpuFence gpuFence) {
        this.comp_3785 = runnable;
        this.comp_3786 = gpuFence;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderSystem$class_10827.class, "callback;fence", "comp_3785", "comp_3786"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderSystem$class_10827.class, "callback;fence", "comp_3785", "comp_3786"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderSystem$class_10827.class, "callback;fence", "comp_3785", "comp_3786"}, this);
    }

    public Runnable comp_3785() {
        return this.comp_3785;
    }

    public GpuFence comp_3786() {
        return this.comp_3786;
    }
}

