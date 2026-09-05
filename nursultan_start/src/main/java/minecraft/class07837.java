/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08774
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class08774;

public final class class07837
extends Record {
    private final int max;
    private final int online;
    private final List<class08774> sample;
    public static final Codec<class07837> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("max").forGetter(class07837::N), (App)Codec.INT.fieldOf("online").forGetter(class07837::y), (App)class08774.N.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(class07837::L)).apply(instance, class07837::new));

    public List<class08774> L() {
        return this.sample;
    }

    public class07837(int n, int n2, List<class08774> list) {
        this.max = n;
        this.online = n2;
        this.sample = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07837.class, "max;online;sample", "max", "online", "sample"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07837.class, "max;online;sample", "max", "online", "sample"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07837.class, "max;online;sample", "max", "online", "sample"}, this);
    }

    public int y() {
        return this.online;
    }

    public int N() {
        return this.max;
    }
}

