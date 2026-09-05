/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package dev.isxander.yacl3.gui.image.impl;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class AnimatedDynamicTextureImage$AnimFrame
extends Record {
    final int durationMS;
    final int xOffset;
    final int yOffset;

    AnimatedDynamicTextureImage$AnimFrame(int n, int n2, int n3) {
        this.durationMS = n;
        this.xOffset = n2;
        this.yOffset = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{AnimatedDynamicTextureImage$AnimFrame.class, "durationMS;xOffset;yOffset", "durationMS", "xOffset", "yOffset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{AnimatedDynamicTextureImage$AnimFrame.class, "durationMS;xOffset;yOffset", "durationMS", "xOffset", "yOffset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{AnimatedDynamicTextureImage$AnimFrame.class, "durationMS;xOffset;yOffset", "durationMS", "xOffset", "yOffset"}, this);
    }

    public int durationMS() {
        return this.durationMS;
    }

    public int xOffset() {
        return this.xOffset;
    }

    public int yOffset() {
        return this.yOffset;
    }
}

