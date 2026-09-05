/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Copyable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.FireworkExplosion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Copyable;
import io.netty.buffer.ByteBuf;

public record Fireworks(int flightDuration, FireworkExplosion[] explosions) implements Copyable
{
    public static final Type<Fireworks> TYPE = new Type<Fireworks>(Fireworks.class){

        public void write(Ops ops, Fireworks value) {
            ops.writeMap(map -> map.writeOptional("flight_duration", (Type)Types.UNSIGNED_BYTE, (Object)((short)value.flightDuration), (Object)0).writeOptional("explosions", FireworkExplosion.ARRAY_TYPE, (Object)value.explosions, (Object)new FireworkExplosion[0]));
        }

        public void write(ByteBuf buffer, Fireworks value) {
            Types.VAR_INT.writePrimitive(buffer, value.flightDuration);
            FireworkExplosion.ARRAY_TYPE.write(buffer, (Object)value.explosions);
        }

        public Fireworks read(ByteBuf buffer) {
            int flightDuration = Types.VAR_INT.readPrimitive(buffer);
            FireworkExplosion[] explosions = (FireworkExplosion[])FireworkExplosion.ARRAY_TYPE.read(buffer);
            return new Fireworks(flightDuration, explosions);
        }
    };

    public Fireworks copy() {
        return new Fireworks(this.flightDuration, (FireworkExplosion[])Copyable.copy((Object)this.explosions));
    }
}

