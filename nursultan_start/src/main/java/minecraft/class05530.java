/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class03172
 *  net.jpountz.lz4.LZ4BlockInputStream
 *  net.jpountz.lz4.LZ4BlockOutputStream
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;
import minecraft.class03172;
import minecraft.class05518;
import net.jpountz.lz4.LZ4BlockInputStream;
import net.jpountz.lz4.LZ4BlockOutputStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05530 {
    private static final Logger M = LogUtils.getLogger();
    private static final Int2ObjectMap<class05530> B = new Int2ObjectOpenHashMap();
    private static final Object2ObjectMap<String, class05530> Z = new Object2ObjectOpenHashMap();
    public static final class05530 N = class05530.N(new class05530(1, null, inputStream -> new class03172((InputStream)new GZIPInputStream((InputStream)inputStream)), outputStream -> new BufferedOutputStream(new GZIPOutputStream((OutputStream)outputStream))));
    public static final class05530 y = class05530.N(new class05530(2, "deflate", inputStream -> new class03172((InputStream)new InflaterInputStream((InputStream)inputStream)), outputStream -> new BufferedOutputStream(new DeflaterOutputStream((OutputStream)outputStream))));
    public static final class05530 L = class05530.N(new class05530(3, "none", class03172::new, BufferedOutputStream::new));
    public static final class05530 u = class05530.N(new class05530(4, "lz4", inputStream -> new class03172((InputStream)new LZ4BlockInputStream(inputStream)), outputStream -> new BufferedOutputStream((OutputStream)new LZ4BlockOutputStream(outputStream))));
    public static final class05530 i = class05530.N(new class05530(127, null, inputStream -> {
        throw new UnsupportedOperationException();
    }, outputStream -> {
        throw new UnsupportedOperationException();
    }));
    public static final class05530 R;
    private static volatile class05530 z;
    private final int U;
    private final @Nullable String E;
    private final class05518<InputStream> W;
    private final class05518<OutputStream> m;

    private class05530(int n, @Nullable String string, class05518<InputStream> class055182, class05518<OutputStream> class055183) {
        this.U = n;
        this.E = string;
        this.W = class055182;
        this.m = class055183;
    }

    static {
        z = R = y;
    }

    public static boolean y(int n) {
        return B.containsKey(n);
    }

    public int y() {
        return this.U;
    }

    public static class05530 N() {
        return z;
    }

    public OutputStream N(OutputStream outputStream) throws IOException {
        return this.m.wrap(outputStream);
    }

    public InputStream N(InputStream inputStream) throws IOException {
        return this.W.wrap(inputStream);
    }

    public static void N(String string) {
        class05530 class055302 = (class05530)Z.get((Object)string);
        if (class055302 != null) {
            z = class055302;
        } else {
            M.error("Invalid `region-file-compression` value `{}` in server.properties. Please use one of: {}", (Object)string, (Object)String.join((CharSequence)", ", (Iterable<? extends CharSequence>)Z.keySet()));
        }
    }

    public static @Nullable class05530 N(int n) {
        return (class05530)B.get(n);
    }

    private static class05530 N(class05530 class055302) {
        B.put(class055302.U, (Object)class055302);
        if (class055302.E != null) {
            Z.put((Object)class055302.E, (Object)class055302);
        }
        return class055302;
    }
}

