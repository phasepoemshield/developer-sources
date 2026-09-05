/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData$MappingType
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.RegistryKey
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.PotionEffect
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.ArrayType
 *  com.viaversion.viaversion.api.type.types.misc.HolderSetType
 *  com.viaversion.viaversion.api.type.types.misc.HolderType
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.RegistryKey;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.EnumTypes;
import com.viaversion.viaversion.api.minecraft.item.data.PotionEffect;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.ArrayType;
import com.viaversion.viaversion.api.type.types.misc.HolderSetType;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;

public record Consumable1_21_2(float consumeSeconds, int animationType, Holder<SoundEvent> sound, boolean hasConsumeParticles, ConsumeEffect<?>[] consumeEffects) implements Copyable,
Rewritable
{
    private static final HolderSetType REMOVE_EFFECTS_TYPE = new HolderSetType(){

        public void write(Ops ops, HolderSet value) {
            ops.writeMap(map -> map.write("effects", (Type)new HolderSetType((RegistryKey)EnumTypes.MOB_EFFECT), (Object)value));
        }
    };
    private static final Type<Float> TELEPORT_RANDOMLY_TYPE = new Type<Float>(Float.class){

        public void write(Ops ops, Float value) {
            ops.writeMap(map -> map.write("diameter", (Type)Types.FLOAT, (Object)Float.valueOf(16.0f)));
        }

        public void write(ByteBuf buffer, Float value) {
            Types.FLOAT.writePrimitive(buffer, value.floatValue());
        }

        public Float read(ByteBuf buffer) {
            return Float.valueOf(Types.FLOAT.readPrimitive(buffer));
        }
    };
    private static final HolderType<SoundEvent> PLAY_SOUND_TYPE = new HolderType<SoundEvent>(MappingData.MappingType.SOUND){

        public SoundEvent readDirect(ByteBuf buffer) {
            return (SoundEvent)Types.SOUND_EVENT.readDirect(buffer);
        }

        public void write(Ops ops, Holder<SoundEvent> value) {
            ops.writeMap(map -> map.write("sound", (Type)Types.SOUND_EVENT, (Object)value));
        }

        public void writeDirect(ByteBuf buffer, SoundEvent value) {
            Types.SOUND_EVENT.writeDirect(buffer, (Object)value);
        }
    };
    public static final Type<?>[] EFFECT_TYPES = new Type[]{ApplyStatusEffects.TYPE, REMOVE_EFFECTS_TYPE, Types.EMPTY, TELEPORT_RANDOMLY_TYPE, PLAY_SOUND_TYPE};
    public static final Type<Consumable1_21_2> TYPE = new Type<Consumable1_21_2>(Consumable1_21_2.class){

        public void write(Ops ops, Consumable1_21_2 value) {
            Holder defaultSound = Holder.of((int)ops.context().registryAccess().id(MappingData.MappingType.SOUND, "entity.generic.eat"));
            ops.writeMap(map -> map.writeOptional("consume_seconds", (Type)Types.FLOAT, (Object)Float.valueOf(value.consumeSeconds), (Object)Float.valueOf(1.6f)).writeOptional("animation", (Type)EnumTypes.ITEM_USE_ANIMATION, (Object)value.animationType, (Object)1).writeOptional("sound", (Type)Types.SOUND_EVENT, value.sound, (Object)defaultSound).writeOptional("has_consume_particles", (Type)Types.BOOLEAN, (Object)value.hasConsumeParticles, (Object)true).writeOptional("consume_effects", ConsumeEffect.ARRAY_TYPE, value.consumeEffects, (Object)new ConsumeEffect[0]));
        }

        public void write(ByteBuf buffer, Consumable1_21_2 value) {
            buffer.writeFloat(value.consumeSeconds);
            Types.VAR_INT.writePrimitive(buffer, value.animationType);
            Types.SOUND_EVENT.write(buffer, value.sound);
            buffer.writeBoolean(value.hasConsumeParticles);
            ConsumeEffect.ARRAY_TYPE.write(buffer, value.consumeEffects);
        }

        public Consumable1_21_2 read(ByteBuf buffer) {
            float consumeSeconds = buffer.readFloat();
            int animationType = Types.VAR_INT.readPrimitive(buffer);
            Holder sound = Types.SOUND_EVENT.read(buffer);
            boolean hasConsumeParticles = buffer.readBoolean();
            ConsumeEffect[] consumeEffects = (ConsumeEffect[])ConsumeEffect.ARRAY_TYPE.read(buffer);
            return new Consumable1_21_2(consumeSeconds, animationType, (Holder<SoundEvent>)sound, hasConsumeParticles, consumeEffects);
        }
    };

    public Consumable1_21_2 rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        Holder soundHolder = SoundEvent.rewriteHolder(this.sound, (Int2IntFunction)Rewritable.soundRewriteFunction(protocol, (boolean)clientbound));
        return soundHolder == this.sound ? this : new Consumable1_21_2(this.consumeSeconds, this.animationType, (Holder<SoundEvent>)soundHolder, this.hasConsumeParticles, this.consumeEffects);
    }

    public Consumable1_21_2 copy() {
        return new Consumable1_21_2(this.consumeSeconds, this.animationType, this.sound, this.hasConsumeParticles, (ConsumeEffect[])Copyable.copy(this.consumeEffects));
    }

    public record ConsumeEffect<T>(int id, Type<T> type, T value) {
        public static final Type<ConsumeEffect<?>> TYPE = new Type<ConsumeEffect<?>>(ConsumeEffect.class){

            public void write(Ops ops, ConsumeEffect<?> value) {
                this.writeGeneric(ops, value);
            }

            public void write(ByteBuf buffer, ConsumeEffect<?> value) {
                Types.VAR_INT.writePrimitive(buffer, value.id);
                value.writeValue(buffer);
            }

            public ConsumeEffect<?> read(ByteBuf buffer) {
                int effectType = Types.VAR_INT.readPrimitive(buffer);
                Type<?> type = EFFECT_TYPES[effectType];
                Object value = type.read(buffer);
                return ConsumeEffect.of(effectType, type, value);
            }

            private <E> void writeGeneric(Ops ops, ConsumeEffect<E> value) {
                ops.writeMap(map -> map.write("type", (Type)EnumTypes.CONSUME_EFFECT, (Object)value.id).writeInlinedMap(value.type, value.value));
            }
        };
        public static final Type<ConsumeEffect<?>[]> ARRAY_TYPE = new ArrayType(TYPE);

        static <T> ConsumeEffect<T> of(int id, Type<T> type, Object value) {
            return new ConsumeEffect<Object>(id, type, value);
        }

        void writeValue(ByteBuf buf) {
            this.type.write(buf, this.value);
        }
    }

    public record ApplyStatusEffects(PotionEffect[] effects, float probability) {
        public static final Type<ApplyStatusEffects> TYPE = new Type<ApplyStatusEffects>(ApplyStatusEffects.class){

            public void write(Ops ops, ApplyStatusEffects value) {
                ops.writeMap(map -> map.write("effects", PotionEffect.ARRAY_TYPE, (Object)value.effects).writeOptional("probability", (Type)Types.FLOAT, (Object)Float.valueOf(value.probability), (Object)Float.valueOf(1.0f)));
            }

            public void write(ByteBuf buffer, ApplyStatusEffects value) {
                PotionEffect.ARRAY_TYPE.write(buffer, (Object)value.effects);
                buffer.writeFloat(value.probability);
            }

            public ApplyStatusEffects read(ByteBuf buffer) {
                PotionEffect[] effects = (PotionEffect[])PotionEffect.ARRAY_TYPE.read(buffer);
                float probability = buffer.readFloat();
                return new ApplyStatusEffects(effects, probability);
            }
        };
    }
}

