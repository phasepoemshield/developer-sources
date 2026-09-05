/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 */
package net.fabricmc.fabric.api.resource.conditions.v1;

import com.mojang.serialization.MapCodec;
import minecraft.class01894;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;

class ResourceConditionType$1
implements ResourceConditionType<T> {
    final /* synthetic */ class01894 val$id;
    final /* synthetic */ MapCodec val$codec;

    ResourceConditionType$1(class01894 class018942, MapCodec mapCodec) {
        this.val$id = class018942;
        this.val$codec = mapCodec;
    }

    @Override
    public class01894 id() {
        return this.val$id;
    }

    @Override
    public MapCodec<T> codec() {
        return this.val$codec;
    }
}

