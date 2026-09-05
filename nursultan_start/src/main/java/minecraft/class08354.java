/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class08280
 *  minecraft.class08500
 *  minecraft.class08923
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class08280;
import minecraft.class08500;
import minecraft.class08923;
import org.jspecify.annotations.Nullable;

public final class class08354
extends Record
implements Closeable {
    private final class08280 image;
    private final @Nullable class08500 metadata;

    public boolean L() {
        return this.metadata != null ? this.metadata.y() : false;
    }

    public class08354(class08280 class082802, @Nullable class08500 class085002) {
        this.image = class082802;
        this.metadata = class085002;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08354.class, "image;metadata", "image", "metadata"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08354.class, "image;metadata", "image", "metadata"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08354.class, "image;metadata", "image", "metadata"}, this);
    }

    public @Nullable class08500 i() {
        return this.metadata;
    }

    @Override
    public void close() {
        this.image.close();
    }

    public class08280 u() {
        return this.image;
    }

    public boolean y() {
        return this.metadata != null ? this.metadata.N() : false;
    }

    public static class08354 N() {
        return new class08354(class08923.N(), null);
    }

    public static class08354 N(class01089 class010892, class01894 class018942) throws IOException {
        class08280 class082802;
        class01079 class010792 = class010892.L(class018942);
        try (InputStream inputStream = class010792.method_14482();){
            class082802 = class08280.N((InputStream)inputStream);
        }
        inputStream = class010792.method_14481().N(class08500.i).orElse(null);
        return new class08354(class082802, (class08500)inputStream);
    }
}

