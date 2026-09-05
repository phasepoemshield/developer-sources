/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;
import org.checkerframework.checker.nullness.qual.Nullable;

public record PiercingWeapon(boolean dealsKnockback, boolean dismounts, @Nullable Holder<SoundEvent> sound, @Nullable Holder<SoundEvent> hitSound) {
    public static final Type<PiercingWeapon> TYPE = new Type<PiercingWeapon>(PiercingWeapon.class){

        public void write(Ops ops, PiercingWeapon value) {
            ops.writeMap(map -> map.writeOptional("deals_knockback", (Type)Types.BOOLEAN, (Object)value.dealsKnockback, (Object)true).writeOptional("dismounts", (Type)Types.BOOLEAN, (Object)value.dismounts, (Object)false).writeOptional("sound", (Type)Types.SOUND_EVENT, value.sound).writeOptional("hit_sound", (Type)Types.SOUND_EVENT, value.hitSound));
        }

        public void write(ByteBuf buffer, PiercingWeapon value) {
            Types.BOOLEAN.write(buffer, Boolean.valueOf(value.dealsKnockback));
            Types.BOOLEAN.write(buffer, Boolean.valueOf(value.dismounts));
            Types.OPTIONAL_SOUND_EVENT.write(buffer, value.sound);
            Types.OPTIONAL_SOUND_EVENT.write(buffer, value.hitSound);
        }

        public PiercingWeapon read(ByteBuf buffer) {
            boolean dealsKnockback = Types.BOOLEAN.read(buffer);
            boolean dismounts = Types.BOOLEAN.read(buffer);
            Holder sound = Types.OPTIONAL_SOUND_EVENT.read(buffer);
            Holder hitSound = Types.OPTIONAL_SOUND_EVENT.read(buffer);
            return new PiercingWeapon(dealsKnockback, dismounts, (Holder<SoundEvent>)sound, (Holder<SoundEvent>)hitSound);
        }
    };
}

