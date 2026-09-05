/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01215
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01215;

public final class class03932
extends Record {
    private final List<class01215> entries;
    private final boolean replace;
    public static final Codec<class03932> N = RecordCodecBuilder.create(instance -> instance.group((App)class01215.field_39265.listOf().fieldOf("values").forGetter(class03932::N), (App)Codec.BOOL.optionalFieldOf("replace", (Object)false).forGetter(class03932::y)).apply(instance, class03932::new));

    public class03932(List<class01215> list, boolean bl) {
        this.entries = list;
        this.replace = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03932.class, "entries;replace", "entries", "replace"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03932.class, "entries;replace", "entries", "replace"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03932.class, "entries;replace", "entries", "replace"}, this);
    }

    public boolean y() {
        return this.replace;
    }

    public List<class01215> N() {
        return this.entries;
    }
}

