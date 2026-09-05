/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks$DamageReduction
 *  com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks$ItemDamageFunction
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.BlocksAttacks;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;
import org.checkerframework.checker.nullness.qual.Nullable;

public record BlocksAttacks(float blockDelaySeconds, float disableCooldownScale, DamageReduction[] damageReductions, ItemDamageFunction itemDamage, @Nullable HolderSet bypassedBy, @Nullable Holder<SoundEvent> blockSound, @Nullable Holder<SoundEvent> disableSound) implements Rewritable
{
    public static final Type<BlocksAttacks> TYPE1_21_5 = new Type<BlocksAttacks>(BlocksAttacks.class){

        public void write(Ops ops, BlocksAttacks value) {
            DamageReduction[] defaultDamageReductions = new DamageReduction[]{new DamageReduction(90.0f, null, 0.0f, 1.0f)};
            ItemDamageFunction defaultItemDamage = new ItemDamageFunction(1.0f, 0.0f, 1.0f);
            ops.writeMap(map -> map.writeOptional("block_delay_seconds", (Type)Types.FLOAT, (Object)Float.valueOf(value.blockDelaySeconds()), (Object)Float.valueOf(0.0f)).writeOptional("disable_cooldown_scale", (Type)Types.FLOAT, (Object)Float.valueOf(value.disableCooldownScale()), (Object)Float.valueOf(1.0f)).writeOptional("damage_reductions", (Type)DamageReduction.ARRAY_TYPE, (Object)value.damageReductions(), (Object)defaultDamageReductions).writeOptional("item_damage", ItemDamageFunction.TYPE, (Object)value.itemDamage(), (Object)defaultItemDamage).writeOptional("bypassed_by", Types.TAG_KEY, value.bypassedBy() != null ? Key.of((String)value.bypassedBy().tagKey()) : null).writeOptional("block_sound", (Type)Types.SOUND_EVENT, value.blockSound()).writeOptional("disabled_sound", (Type)Types.SOUND_EVENT, value.disableSound()));
        }

        public void write(ByteBuf buffer, BlocksAttacks value) {
            buffer.writeFloat(value.blockDelaySeconds());
            buffer.writeFloat(value.disableCooldownScale());
            DamageReduction.ARRAY_TYPE.write(buffer, (Object[])value.damageReductions());
            ItemDamageFunction.TYPE.write(buffer, (Object)value.itemDamage());
            Types.OPTIONAL_STRING.write(buffer, value.bypassedBy() != null ? value.bypassedBy().tagKey() : null);
            Types.OPTIONAL_SOUND_EVENT.write(buffer, value.blockSound());
            Types.OPTIONAL_SOUND_EVENT.write(buffer, value.disableSound());
        }

        public BlocksAttacks read(ByteBuf buffer) {
            float blockDelaySeconds = buffer.readFloat();
            float disableCooldownScale = buffer.readFloat();
            DamageReduction[] damageReductions = (DamageReduction[])DamageReduction.ARRAY_TYPE.read(buffer);
            ItemDamageFunction itemDamage = (ItemDamageFunction)ItemDamageFunction.TYPE.read(buffer);
            String bypassedByTag = (String)Types.OPTIONAL_STRING.read(buffer);
            Holder blockSound = Types.OPTIONAL_SOUND_EVENT.read(buffer);
            Holder disableSound = Types.OPTIONAL_SOUND_EVENT.read(buffer);
            return new BlocksAttacks(blockDelaySeconds, disableCooldownScale, damageReductions, itemDamage, bypassedByTag != null ? HolderSet.of((String)bypassedByTag) : null, (Holder<SoundEvent>)blockSound, (Holder<SoundEvent>)disableSound);
        }
    };
    public static final Type<BlocksAttacks> TYPE26_1 = new Type<BlocksAttacks>(BlocksAttacks.class){

        public void write(Ops ops, BlocksAttacks value) {
            DamageReduction[] defaultDamageReductions = new DamageReduction[]{new DamageReduction(90.0f, null, 0.0f, 1.0f)};
            ItemDamageFunction defaultItemDamage = new ItemDamageFunction(1.0f, 0.0f, 1.0f);
            ops.writeMap(map -> map.writeOptional("block_delay_seconds", (Type)Types.FLOAT, (Object)Float.valueOf(value.blockDelaySeconds()), (Object)Float.valueOf(0.0f)).writeOptional("disable_cooldown_scale", (Type)Types.FLOAT, (Object)Float.valueOf(value.disableCooldownScale()), (Object)Float.valueOf(1.0f)).writeOptional("damage_reductions", (Type)DamageReduction.ARRAY_TYPE, (Object)value.damageReductions(), (Object)defaultDamageReductions).writeOptional("item_damage", ItemDamageFunction.TYPE, (Object)value.itemDamage(), (Object)defaultItemDamage).writeOptional("bypassed_by", Types.HOLDER_SET, (Object)value.bypassedBy()).writeOptional("block_sound", (Type)Types.SOUND_EVENT, value.blockSound()).writeOptional("disabled_sound", (Type)Types.SOUND_EVENT, value.disableSound()));
        }

        public void write(ByteBuf buffer, BlocksAttacks value) {
            buffer.writeFloat(value.blockDelaySeconds());
            buffer.writeFloat(value.disableCooldownScale());
            DamageReduction.ARRAY_TYPE.write(buffer, (Object[])value.damageReductions());
            ItemDamageFunction.TYPE.write(buffer, (Object)value.itemDamage());
            Types.OPTIONAL_HOLDER_SET.write(buffer, (Object)value.bypassedBy());
            Types.OPTIONAL_SOUND_EVENT.write(buffer, value.blockSound());
            Types.OPTIONAL_SOUND_EVENT.write(buffer, value.disableSound());
        }

        public BlocksAttacks read(ByteBuf buffer) {
            float blockDelaySeconds = buffer.readFloat();
            float disableCooldownScale = buffer.readFloat();
            DamageReduction[] damageReductions = (DamageReduction[])DamageReduction.ARRAY_TYPE.read(buffer);
            ItemDamageFunction itemDamage = (ItemDamageFunction)ItemDamageFunction.TYPE.read(buffer);
            HolderSet bypassedByTag = (HolderSet)Types.OPTIONAL_HOLDER_SET.read(buffer);
            Holder blockSound = Types.OPTIONAL_SOUND_EVENT.read(buffer);
            Holder disableSound = Types.OPTIONAL_SOUND_EVENT.read(buffer);
            return new BlocksAttacks(blockDelaySeconds, disableCooldownScale, damageReductions, itemDamage, bypassedByTag, (Holder<SoundEvent>)blockSound, (Holder<SoundEvent>)disableSound);
        }
    };

    public BlocksAttacks rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        Holder blockSound = SoundEvent.rewriteHolder(this.blockSound, (Int2IntFunction)Rewritable.soundRewriteFunction(protocol, (boolean)clientbound));
        Holder disableSound = SoundEvent.rewriteHolder(this.disableSound, (Int2IntFunction)Rewritable.soundRewriteFunction(protocol, (boolean)clientbound));
        return new BlocksAttacks(this.blockDelaySeconds, this.disableCooldownScale, this.damageReductions, this.itemDamage, this.bypassedBy, (Holder<SoundEvent>)blockSound, (Holder<SoundEvent>)disableSound);
    }
}

