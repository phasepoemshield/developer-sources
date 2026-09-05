/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public record AttackRange(float minRange, float maxRange, float minCreativeRange, float maxCreativeRange, float hitboxMargin, float mobFactor) {
    public static final Type<AttackRange> TYPE = new Type<AttackRange>(AttackRange.class){

        public void write(Ops ops, AttackRange AttackRange2) {
            ops.writeMap(map -> map.writeOptional("min_reach", (Type)Types.FLOAT, (Object)Float.valueOf(AttackRange2.minRange), (Object)Float.valueOf(0.0f)).writeOptional("max_reach", (Type)Types.FLOAT, (Object)Float.valueOf(AttackRange2.maxRange), (Object)Float.valueOf(3.0f)).writeOptional("min_creative_reach", (Type)Types.FLOAT, (Object)Float.valueOf(AttackRange2.minCreativeRange), (Object)Float.valueOf(0.0f)).writeOptional("max_creative_reach", (Type)Types.FLOAT, (Object)Float.valueOf(AttackRange2.maxCreativeRange), (Object)Float.valueOf(5.0f)).writeOptional("hitbox_margin", (Type)Types.FLOAT, (Object)Float.valueOf(AttackRange2.hitboxMargin), (Object)Float.valueOf(0.3f)).writeOptional("mob_factor", (Type)Types.FLOAT, (Object)Float.valueOf(AttackRange2.mobFactor), (Object)Float.valueOf(1.0f)));
        }

        public void write(ByteBuf buffer, AttackRange value) {
            Types.FLOAT.writePrimitive(buffer, value.minRange);
            Types.FLOAT.writePrimitive(buffer, value.maxRange);
            Types.FLOAT.writePrimitive(buffer, value.minCreativeRange);
            Types.FLOAT.writePrimitive(buffer, value.maxCreativeRange);
            Types.FLOAT.writePrimitive(buffer, value.hitboxMargin);
            Types.FLOAT.writePrimitive(buffer, value.mobFactor);
        }

        public AttackRange read(ByteBuf buffer) {
            float minRange = Types.FLOAT.readPrimitive(buffer);
            float maxRange = Types.FLOAT.readPrimitive(buffer);
            float minCreativeRange = Types.FLOAT.readPrimitive(buffer);
            float maxCreativeRange = Types.FLOAT.readPrimitive(buffer);
            float hitboxMargin = Types.FLOAT.readPrimitive(buffer);
            float mobFactor = Types.FLOAT.readPrimitive(buffer);
            return new AttackRange(minRange, maxRange, minCreativeRange, maxCreativeRange, hitboxMargin, mobFactor);
        }
    };
}

