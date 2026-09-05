/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class07414
extends Record {
    private final String title;
    private final String version;
    public static final MapCodec<class07414> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("title").forGetter(class07414::N), (App)Codec.STRING.fieldOf("version").forGetter(class07414::y)).apply(instance, class07414::new));

    public class07414(String string, String string2) {
        this.title = string;
        this.version = string2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07414.class, "title;version", "title", "version"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07414.class, "title;version", "title", "version"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07414.class, "title;version", "title", "version"}, this);
    }

    public String y() {
        return this.version;
    }

    public String N() {
        return this.title;
    }
}

