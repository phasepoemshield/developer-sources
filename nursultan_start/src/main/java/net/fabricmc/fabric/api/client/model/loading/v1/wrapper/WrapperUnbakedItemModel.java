/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class08350
 *  minecraft.class08895
 *  minecraft.class08905
 *  minecraft.class08910
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1.wrapper;

import com.mojang.serialization.MapCodec;
import minecraft.class08350;
import minecraft.class08895;
import minecraft.class08905;
import minecraft.class08910;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public abstract class WrapperUnbakedItemModel
implements class08895 {
    protected class08895 wrapped;

    protected WrapperUnbakedItemModel() {
    }

    protected WrapperUnbakedItemModel(class08895 class088952) {
        this.wrapped = class088952;
    }

    public void method_62326(class08350 class083502) {
        this.wrapped.method_62326(class083502);
    }

    public MapCodec<? extends class08895> method_65585() {
        return this.wrapped.method_65585();
    }

    public class08910 method_65587(class08905 class089052) {
        return this.wrapped.method_65587(class089052);
    }
}

