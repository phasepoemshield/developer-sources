/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.EitherHolderType
 *  com.viaversion.viaversion.api.type.types.misc.HolderType
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.EitherHolderType;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;

public record Instrument1_21_2(Holder<SoundEvent> soundEvent, float useDuration, float range, Tag description) implements Copyable,
Rewritable
{
    public static final HolderType<Instrument1_21_2> TYPE = new HolderType<Instrument1_21_2>(){

        public Instrument1_21_2 readDirect(ByteBuf buffer) {
            Holder soundEvent = Types.SOUND_EVENT.read(buffer);
            float useDuration = Types.FLOAT.readPrimitive(buffer);
            float range = Types.FLOAT.readPrimitive(buffer);
            Tag description = (Tag)Types.TAG.read(buffer);
            return new Instrument1_21_2((Holder<SoundEvent>)soundEvent, useDuration, range, description);
        }

        protected Key identifier(Ops ops, int id) {
            return ops.context().registryAccess().registryKey("instrument", id);
        }

        public void writeDirect(Ops ops, Instrument1_21_2 value) {
            ops.writeMap(map -> map.write("sound_event", (Type)Types.SOUND_EVENT, value.soundEvent()).write("use_duration", (Type)Types.FLOAT, (Object)Float.valueOf(value.useDuration())).write("range", (Type)Types.FLOAT, (Object)Float.valueOf(value.range())).write("description", Types.TAG, (Object)value.description()));
        }

        public void writeDirect(ByteBuf buffer, Instrument1_21_2 value) {
            Types.SOUND_EVENT.write(buffer, value.soundEvent());
            Types.FLOAT.writePrimitive(buffer, value.useDuration());
            Types.FLOAT.writePrimitive(buffer, value.range());
            Types.TAG.write(buffer, (Object)value.description());
        }
    };
    public static final EitherHolderType<Instrument1_21_2> EITHER_HOLDER_TYPE = new EitherHolderType(TYPE);

    public Instrument1_21_2 rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        Holder soundEvent = SoundEvent.rewriteHolder(this.soundEvent, (Int2IntFunction)Rewritable.soundRewriteFunction(protocol, (boolean)clientbound));
        return soundEvent == this.soundEvent ? this : new Instrument1_21_2((Holder<SoundEvent>)soundEvent, this.useDuration, this.range, this.description);
    }

    public Instrument1_21_2 copy() {
        return new Instrument1_21_2(this.soundEvent, this.useDuration, this.range, this.description.copy());
    }
}

