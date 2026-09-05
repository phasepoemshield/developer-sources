/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Strictness
 *  com.google.gson.stream.JsonReader
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.Strictness;
import com.google.gson.stream.JsonReader;
import com.mojang.serialization.Codec;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import minecraft.class04232;
import org.jspecify.annotations.Nullable;

public interface class04239<T>
extends Closeable {
    public static <T> class04239<T> N(Codec<T> codec, Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setStrictness(Strictness.LENIENT);
        return new class04232(jsonReader, codec);
    }

    public @Nullable T N() throws IOException;
}

