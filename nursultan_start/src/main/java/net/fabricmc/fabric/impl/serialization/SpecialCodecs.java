/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
package net.fabricmc.fabric.impl.serialization;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.stream.LongStream;
import net.fabricmc.fabric.impl.serialization.SpecialCodecs$1;
import net.fabricmc.fabric.impl.serialization.SpecialCodecs$2;

public interface SpecialCodecs {
    public static final Codec<long[]> LONG_ARRAY = Codec.LONG_STREAM.xmap(LongStream::toArray, LongStream::of);
    public static final Codec<byte[]> BYTE_ARRAY = Codec.BYTE_BUFFER.xmap(byteBuffer -> {
        if (byteBuffer.hasArray()) {
            return byteBuffer.array();
        }
        byte[] byArray = new byte[byteBuffer.capacity()];
        byteBuffer.get(byArray);
        return byArray;
    }, ByteBuffer::wrap);
    public static final MapCodec<Collection<String>> KEYS_EXTRACT = new SpecialCodecs$1();

    public static MapCodec<Boolean> contains(String string) {
        return new SpecialCodecs$2(string);
    }
}

