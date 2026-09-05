/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Copyable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaaprilfools.api.minecraft.item;

import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Copyable;
import io.netty.buffer.ByteBuf;

public record WorldModifiers(int[] effects, boolean includeDescription) implements Copyable
{
    public static final Type<WorldModifiers> TYPE = new Type<WorldModifiers>(WorldModifiers.class){

        public void write(ByteBuf byteBuf, WorldModifiers worldModifiers) {
            int[] effects = worldModifiers.effects();
            Types.VAR_INT.writePrimitive(byteBuf, effects.length);
            for (int effect : effects) {
                Types.VAR_INT.writePrimitive(byteBuf, effect);
            }
            Types.BOOLEAN.write(byteBuf, Boolean.valueOf(worldModifiers.includeDescription()));
        }

        public WorldModifiers read(ByteBuf byteBuf) {
            int effectsLength = Types.VAR_INT.readPrimitive(byteBuf);
            int[] effects = new int[effectsLength];
            for (int i = 0; i < effectsLength; ++i) {
                effects[i] = Types.VAR_INT.readPrimitive(byteBuf);
            }
            boolean includeDescription = Types.BOOLEAN.read(byteBuf);
            return new WorldModifiers(effects, includeDescription);
        }
    };

    public WorldModifiers copy() {
        return new WorldModifiers((int[])Copyable.copy((Object)this.effects), this.includeDescription);
    }
}

