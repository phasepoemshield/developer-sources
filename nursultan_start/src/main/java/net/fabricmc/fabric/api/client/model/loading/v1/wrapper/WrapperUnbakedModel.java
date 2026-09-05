/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00140
 *  minecraft.class00167
 *  minecraft.class01894
 *  minecraft.class03702
 *  minecraft.class08534
 *  minecraft.class08814
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.model.loading.v1.wrapper;

import minecraft.class00140;
import minecraft.class00167;
import minecraft.class01894;
import minecraft.class03702;
import minecraft.class08534;
import minecraft.class08814;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public abstract class WrapperUnbakedModel
implements class00167 {
    protected class00167 wrapped;

    protected WrapperUnbakedModel() {
    }

    protected WrapperUnbakedModel(class00167 class001672) {
        this.wrapped = class001672;
    }

    public @Nullable Boolean comp_3741() {
        return this.wrapped.comp_3741();
    }

    public class08814 comp_3743() {
        return this.wrapped.comp_3743();
    }

    public @Nullable class01894 comp_3744() {
        return this.wrapped.comp_3744();
    }

    public @Nullable class03702 comp_3742() {
        return this.wrapped.comp_3742();
    }

    public @Nullable class00140 comp_3740() {
        return this.wrapped.comp_3740();
    }

    public @Nullable class08534 comp_3739() {
        return this.wrapped.comp_3739();
    }
}

