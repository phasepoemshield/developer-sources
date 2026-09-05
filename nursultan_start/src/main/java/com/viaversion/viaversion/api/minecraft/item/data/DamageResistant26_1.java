/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.TransformingType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.TransformingType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;

public record DamageResistant26_1(HolderSet types) {
    public static final Type<DamageResistant26_1> TYPE = new TransformingType<HolderSet, DamageResistant26_1>(Types.HOLDER_SET, DamageResistant26_1.class, DamageResistant26_1::new, DamageResistant26_1::types){

        public void write(Ops ops, DamageResistant26_1 value) {
            ops.writeMap(map -> map.write("types", Types.HOLDER_SET, (Object)value.types));
        }
    };
}

