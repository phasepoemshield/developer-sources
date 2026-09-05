/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.blockview.v2;

import org.jspecify.annotations.Nullable;

public interface RenderDataBlockEntity {
    default public @Nullable Object getRenderData() {
        return null;
    }
}

