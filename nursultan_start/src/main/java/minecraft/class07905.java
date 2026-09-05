/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class07931;

public final class class07905<Params, Result>
extends Record {
    private final class01894 name;
    private final class07931<Params, Result> contents;
    public static final Codec<class07905<?, ?>> N = class07905.N();

    public class07931<Params, Result> L() {
        return this.contents;
    }

    public class07905(class01894 class018942, class07931<Params, Result> class079312) {
        this.name = class018942;
        this.contents = class079312;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07905.class, "name;contents", "name", "contents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07905.class, "name;contents", "name", "contents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07905.class, "name;contents", "name", "contents"}, this);
    }

    public class01894 y() {
        return this.name;
    }

    public static <Params, Result> Codec<class07905<Params, Result>> N() {
        return RecordCodecBuilder.create(instance -> instance.group((App)class01894.N.fieldOf("name").forGetter(class07905::y), (App)class07931.N().forGetter(class07905::L)).apply(instance, class07905::new));
    }
}

