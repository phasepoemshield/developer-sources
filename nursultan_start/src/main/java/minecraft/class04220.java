/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class04228
 *  minecraft.class04239
 */
package minecraft;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class04228;
import minecraft.class04239;

public class class04220<T>
implements Closeable {
    private static final Gson y = new Gson();
    private final Codec<T> L;
    final FileChannel N;
    private final AtomicInteger u = new AtomicInteger(1);

    public class04220(Codec<T> codec, FileChannel fileChannel) {
        this.L = codec;
        this.N = fileChannel;
    }

    @Override
    public void close() throws IOException {
        this.y();
    }

    void y() throws IOException {
        if (this.u.decrementAndGet() <= 0) {
            this.N.close();
        }
    }

    public class04239<T> N() throws IOException {
        if (this.u.get() <= 0) {
            throw new IOException("Event log has already been closed");
        }
        this.u.incrementAndGet();
        class04239 class042392 = class04239.N(this.L, (Reader)Channels.newReader((ReadableByteChannel)this.N, StandardCharsets.UTF_8));
        return new class04228(this, class042392);
    }

    public void N(T t) throws IOException {
        JsonElement jsonElement = (JsonElement)this.L.encodeStart((DynamicOps)JsonOps.INSTANCE, t).getOrThrow(IOException::new);
        this.N.position(this.N.size());
        Writer writer = Channels.newWriter((WritableByteChannel)this.N, StandardCharsets.UTF_8);
        y.toJson(jsonElement, y.newJsonWriter(writer));
        writer.write(10);
        writer.flush();
    }

    public static <T> class04220<T> N(Codec<T> codec, Path path) throws IOException {
        FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
        return new class04220<T>(codec, fileChannel);
    }
}

