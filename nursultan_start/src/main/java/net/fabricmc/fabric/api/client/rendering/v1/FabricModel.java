/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class06271
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class01686;
import minecraft.class06271;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface FabricModel<S> {
    default public @Nullable class01686 getChildPart(String string) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public void copyTransforms(class06271<?> class062712) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }
}

