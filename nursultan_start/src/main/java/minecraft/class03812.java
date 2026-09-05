/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class03812
extends Record {
    private final String name;
    private final long size;
    public static final Codec<class03812> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.fieldOf("name").forGetter(class03812::N), (App)Codec.LONG.fieldOf("size").forGetter(class03812::y)).apply(instance, class03812::new));

    class03812(String string, long l) {
        this.name = string;
        this.size = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03812.class, "name;size", "name", "size"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03812.class, "name;size", "name", "size"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03812.class, "name;size", "name", "size"}, this);
    }

    public long y() {
        return this.size;
    }

    public String N() {
        return this.name;
    }
}

