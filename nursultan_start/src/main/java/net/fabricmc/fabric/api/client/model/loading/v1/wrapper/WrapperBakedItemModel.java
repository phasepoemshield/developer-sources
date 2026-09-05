/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06584
 *  minecraft.class08898
 *  minecraft.class08910
 *  minecraft.class08943
 *  minecraft.class08961
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.model.loading.v1.wrapper;

import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class08898;
import minecraft.class08910;
import minecraft.class08943;
import minecraft.class08961;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public abstract class WrapperBakedItemModel
implements class08910 {
    protected class08910 wrapped;

    protected WrapperBakedItemModel() {
    }

    protected WrapperBakedItemModel(class08910 class089102) {
        this.wrapped = class089102;
    }

    public void method_65584(class08898 class088982, class06584 class065842, class08943 class089432, class03662 class036622, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        this.wrapped.method_65584(class088982, class065842, class089432, class036622, class034482, class089612, n);
    }
}

