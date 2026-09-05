/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public record Weapon(int itemDamagePerAttack, float disableBlockingForSeconds) {
    public static final Type<Weapon> TYPE = new Type<Weapon>(Weapon.class){

        @Override
        public void write(Ops ops, Weapon weapon) {
            ops.writeMap(map -> map.writeOptional("item_damage_per_attack", (Type)Types.INT, (Object)weapon.itemDamagePerAttack, (Object)1).writeOptional("disable_blocking_for_seconds", (Type)Types.FLOAT, (Object)Float.valueOf(weapon.disableBlockingForSeconds), (Object)Float.valueOf(0.0f)));
        }

        @Override
        public void write(ByteBuf buffer, Weapon value) {
            Types.VAR_INT.writePrimitive(buffer, value.itemDamagePerAttack());
            buffer.writeFloat(value.disableBlockingForSeconds());
        }

        @Override
        public Weapon read(ByteBuf buffer) {
            int damagePerAttack = Types.VAR_INT.readPrimitive(buffer);
            float disableBlockingForSeconds = buffer.readFloat();
            return new Weapon(damagePerAttack, disableBlockingForSeconds);
        }
    };
}

