/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectOpenHashMap
 *  com.viaversion.viaversion.util.Copyable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectOpenHashMap;
import com.viaversion.viaversion.util.Copyable;
import io.netty.buffer.ByteBuf;
import java.util.Map;

public record BlockStateProperties(Map<String, String> properties) implements Copyable
{
    public static final Type<BlockStateProperties> TYPE = new Type<BlockStateProperties>(BlockStateProperties.class){

        public void write(Ops ops, BlockStateProperties value) {
            ops.writeMap(map -> {
                for (Map.Entry<String, String> entry : value.properties.entrySet()) {
                    map.write(Types.STRING, (Object)entry.getKey(), Types.STRING, (Object)entry.getValue());
                }
            });
        }

        public void write(ByteBuf buffer, BlockStateProperties value) {
            Types.VAR_INT.writePrimitive(buffer, value.properties.size());
            for (Map.Entry<String, String> entry : value.properties.entrySet()) {
                Types.STRING.write(buffer, (Object)entry.getKey());
                Types.STRING.write(buffer, (Object)entry.getValue());
            }
        }

        public BlockStateProperties read(ByteBuf buffer) {
            int size = Types.VAR_INT.readPrimitive(buffer);
            Object2ObjectOpenHashMap properties = new Object2ObjectOpenHashMap();
            for (int i = 0; i < size; ++i) {
                properties.put((String)Types.STRING.read(buffer), (String)Types.STRING.read(buffer));
            }
            return new BlockStateProperties((Map<String, String>)properties);
        }
    };

    public BlockStateProperties copy() {
        return new BlockStateProperties((Map<String, String>)new Object2ObjectOpenHashMap(this.properties));
    }
}

