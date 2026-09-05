/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.EitherHolder
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.TransformingType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.EitherHolderType
 *  com.viaversion.viaversion.api.type.types.misc.HolderType
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.EitherHolder;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.TransformingType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.EitherHolderType;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;

public record JukeboxPlayable(EitherHolder<JukeboxSong> song, boolean showInTooltip) implements Rewritable
{
    public static final Type<JukeboxPlayable> TYPE1_21 = new Type<JukeboxPlayable>(JukeboxPlayable.class){

        public void write(ByteBuf buffer, JukeboxPlayable value) {
            EitherHolderType.write((ByteBuf)buffer, value.song, JukeboxSong.TYPE);
            buffer.writeBoolean(value.showInTooltip);
        }

        public JukeboxPlayable read(ByteBuf buffer) {
            EitherHolder song = EitherHolderType.read((ByteBuf)buffer, JukeboxSong.TYPE);
            boolean showInTooltip = buffer.readBoolean();
            return new JukeboxPlayable((EitherHolder<JukeboxSong>)song, showInTooltip);
        }
    };
    public static final Type<JukeboxPlayable> TYPE1_21_5 = TransformingType.of((Type)new EitherHolderType(JukeboxSong.TYPE), JukeboxPlayable.class, song -> new JukeboxPlayable((EitherHolder<JukeboxSong>)song, true), JukeboxPlayable::song);

    public JukeboxPlayable(Holder<JukeboxSong> song, boolean showInTooltip) {
        this((EitherHolder<JukeboxSong>)EitherHolder.of(song), showInTooltip);
    }

    public JukeboxPlayable(String resourceKey, boolean showInTooltip) {
        this((EitherHolder<JukeboxSong>)EitherHolder.of((String)resourceKey), showInTooltip);
    }

    public JukeboxPlayable rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        if (this.song.hasKey()) {
            return this;
        }
        Holder songHolder = this.song.holder();
        if (songHolder.hasId()) {
            return this;
        }
        JukeboxSong rewrittenSong = ((JukeboxSong)((Object)songHolder.value())).rewrite(connection, protocol, clientbound);
        return rewrittenSong == songHolder.value() ? this : new JukeboxPlayable((Holder<JukeboxSong>)Holder.of((Object)((Object)rewrittenSong)), this.showInTooltip);
    }

    public record JukeboxSong(Holder<SoundEvent> soundEvent, Tag description, float lengthInSeconds, int comparatorOutput) implements Rewritable
    {
        public static final HolderType<JukeboxSong> TYPE = new HolderType<JukeboxSong>(){

            public JukeboxSong readDirect(ByteBuf buffer) {
                Holder soundEvent = Types.SOUND_EVENT.read(buffer);
                Tag description = (Tag)Types.TAG.read(buffer);
                float lengthInSeconds = buffer.readFloat();
                int useDuration = Types.VAR_INT.readPrimitive(buffer);
                return new JukeboxSong((Holder<SoundEvent>)soundEvent, description, lengthInSeconds, useDuration);
            }

            protected Key identifier(Ops ops, int id) {
                return ops.context().registryAccess().registryKey("jukebox_song", id);
            }

            public void writeDirect(Ops ops, JukeboxSong value) {
                ops.writeMap(map -> map.write("sound_event", (Type)Types.SOUND_EVENT, value.soundEvent).write("description", Types.TAG, (Object)value.description).write("length_in_seconds", (Type)Types.FLOAT, (Object)Float.valueOf(value.lengthInSeconds)).write("comparator_output", (Type)Types.INT, (Object)value.comparatorOutput));
            }

            public void writeDirect(ByteBuf buffer, JukeboxSong value) {
                Types.SOUND_EVENT.write(buffer, value.soundEvent);
                Types.TAG.write(buffer, (Object)value.description);
                buffer.writeFloat(value.lengthInSeconds);
                Types.VAR_INT.writePrimitive(buffer, value.comparatorOutput);
            }
        };

        public JukeboxSong rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
            Holder soundEvent = SoundEvent.rewriteHolder(this.soundEvent, (Int2IntFunction)Rewritable.soundRewriteFunction(protocol, (boolean)clientbound));
            return soundEvent == this.soundEvent ? this : new JukeboxSong((Holder<SoundEvent>)soundEvent, this.description, this.lengthInSeconds, this.comparatorOutput);
        }
    }
}

