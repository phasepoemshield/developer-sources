/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class class07824
extends Record {
    private final byte[] iconBytes;
    private static final String L = "data:image/png;base64,";
    public static final Codec<class07824> N = Codec.STRING.comapFlatMap(string -> {
        if (!string.startsWith(L)) {
            return DataResult.error(() -> "Unknown format");
        }
        try {
            String string2 = string.substring(L.length()).replaceAll("\n", "");
            byte[] byArray = Base64.getDecoder().decode(string2.getBytes(StandardCharsets.UTF_8));
            return DataResult.success((Object)((Object)new class07824(byArray)));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return DataResult.error(() -> "Malformed base64 server icon");
        }
    }, class078242 -> L + new String(Base64.getEncoder().encode(class078242.iconBytes), StandardCharsets.UTF_8));

    public class07824(byte[] byArray) {
        this.iconBytes = byArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07824.class, "iconBytes", "iconBytes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07824.class, "iconBytes", "iconBytes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07824.class, "iconBytes", "iconBytes"}, this);
    }

    public byte[] N() {
        return this.iconBytes;
    }
}

