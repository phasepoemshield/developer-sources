/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface FabricRenderState {
    default public <T> void setData(RenderStateDataKey<T> renderStateDataKey, @Nullable T t) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public <T> @Nullable T getData(RenderStateDataKey<T> renderStateDataKey) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public void clearExtraData() {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public <T> T getDataOrDefault(RenderStateDataKey<T> renderStateDataKey, T t) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }
}

