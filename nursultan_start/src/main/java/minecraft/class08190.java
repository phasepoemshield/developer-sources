/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class08159
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class08159;

public final class class08190
extends Record
implements class08159 {
    private final class01894 id;
    public static final MapCodec<class08190> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("id").forGetter(class08190::y)).apply(instance, class08190::new));

    public class08190(class01894 class018942) {
        this.id = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08190.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08190.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08190.class, "id", "id"}, this);
    }

    public class01894 y() {
        return this.id;
    }

    public static class08190 N(String string) {
        return class08190.N(class01894.y((String)string));
    }

    public MapCodec<class08190> N() {
        return L;
    }

    public static class08190 N(class01894 class018942) {
        return new class08190(class018942);
    }
}

