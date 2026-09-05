/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.KineticWeapon$Condition
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.KineticWeapon;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;
import org.checkerframework.checker.nullness.qual.Nullable;

public record KineticWeapon(int contactCooldownTicks, int delayTicks, // Could not load outer class - annotation placement on inner may be incorrect
@Nullable KineticWeapon.Condition dismountConditions, // Could not load outer class - annotation placement on inner may be incorrect
@Nullable KineticWeapon.Condition knockbackConditions, // Could not load outer class - annotation placement on inner may be incorrect
@Nullable KineticWeapon.Condition damageConditions, float forwardMovement, float damageMultiplier, @Nullable Holder<SoundEvent> sound, @Nullable Holder<SoundEvent> hitSound) {
    public static final Type<KineticWeapon> TYPE = new Type<KineticWeapon>(KineticWeapon.class){

        public void write(Ops ops, KineticWeapon value) {
            ops.writeMap(map -> map.writeOptional("contact_cooldown_ticks", (Type)Types.INT, (Object)value.contactCooldownTicks, (Object)10).writeOptional("delay_ticks", (Type)Types.INT, (Object)value.delayTicks, (Object)0).writeOptional("dismount_conditions", Condition.TYPE, (Object)value.dismountConditions).writeOptional("knockback_conditions", Condition.TYPE, (Object)value.knockbackConditions).writeOptional("damage_conditions", Condition.TYPE, (Object)value.damageConditions).writeOptional("forward_movement", (Type)Types.FLOAT, (Object)Float.valueOf(value.forwardMovement), (Object)Float.valueOf(0.0f)).writeOptional("damage_multiplier", (Type)Types.FLOAT, (Object)Float.valueOf(value.damageMultiplier), (Object)Float.valueOf(1.0f)).writeOptional("sound", (Type)Types.SOUND_EVENT, value.sound).writeOptional("hit_sound", (Type)Types.SOUND_EVENT, value.hitSound));
        }

        public void write(ByteBuf buffer, KineticWeapon value) {
            Types.VAR_INT.writePrimitive(buffer, value.contactCooldownTicks);
            Types.VAR_INT.writePrimitive(buffer, value.delayTicks);
            Condition.OPTIONAL_TYPE.write(buffer, (Object)value.dismountConditions);
            Condition.OPTIONAL_TYPE.write(buffer, (Object)value.knockbackConditions);
            Condition.OPTIONAL_TYPE.write(buffer, (Object)value.damageConditions);
            Types.FLOAT.writePrimitive(buffer, value.forwardMovement);
            Types.FLOAT.writePrimitive(buffer, value.damageMultiplier);
            Types.OPTIONAL_SOUND_EVENT.write(buffer, value.sound);
            Types.OPTIONAL_SOUND_EVENT.write(buffer, value.hitSound);
        }

        public KineticWeapon read(ByteBuf buffer) {
            int contactCooldownTicks = Types.VAR_INT.readPrimitive(buffer);
            int delayTicks = Types.VAR_INT.readPrimitive(buffer);
            Condition dismountConditions = (Condition)Condition.OPTIONAL_TYPE.read(buffer);
            Condition knockbackConditions = (Condition)Condition.OPTIONAL_TYPE.read(buffer);
            Condition damageConditions = (Condition)Condition.OPTIONAL_TYPE.read(buffer);
            float forwardMovement = Types.FLOAT.readPrimitive(buffer);
            float damageMultiplier = Types.FLOAT.readPrimitive(buffer);
            Holder sound = Types.OPTIONAL_SOUND_EVENT.read(buffer);
            Holder hitSound = Types.OPTIONAL_SOUND_EVENT.read(buffer);
            return new KineticWeapon(contactCooldownTicks, delayTicks, dismountConditions, knockbackConditions, damageConditions, forwardMovement, damageMultiplier, (Holder<SoundEvent>)sound, (Holder<SoundEvent>)hitSound);
        }
    };
}

