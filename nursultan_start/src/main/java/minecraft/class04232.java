/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  com.google.gson.stream.JsonReader
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.EOFException;
import java.io.IOException;
import minecraft.class04239;
import org.jspecify.annotations.Nullable;

class class04232<T>
implements class04239<T> {
    final /* synthetic */ JsonReader N;
    final /* synthetic */ Codec y;

    class04232(JsonReader jsonReader, Codec codec) {
        this.N = jsonReader;
        this.y = codec;
    }

    @Override
    public void close() throws IOException {
        this.N.close();
    }

    @Override
    public @Nullable T N() throws IOException {
        try {
            if (!this.N.hasNext()) {
                return null;
            }
            JsonElement jsonElement = JsonParser.parseReader((JsonReader)this.N);
            return (T)this.y.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).getOrThrow(IOException::new);
        }
        catch (JsonParseException jsonParseException) {
            throw new IOException(jsonParseException);
        }
        catch (EOFException eOFException) {
            return null;
        }
    }
}

