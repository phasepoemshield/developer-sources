/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06250;
import minecraft.class06338;

final class class06233
extends Record {
    final int from;
    final int to;
    final class06250 dimensions;
    private static final Codec<class06233> i = RecordCodecBuilder.create(instance -> instance.group((App)class06338.c.fieldOf("from").forGetter(class06233::N), (App)class06338.c.fieldOf("to").forGetter(class06233::y), (App)class06250.L.forGetter(class06233::L)).apply(instance, class06233::new));
    public static final Codec<class06233> u = i.validate(class062332 -> {
        if (class062332.from >= class062332.to) {
            return DataResult.error(() -> "Invalid range: [" + class062332.from + ";" + class062332.to + "]");
        }
        return DataResult.success((Object)class062332);
    });

    public class06250 L() {
        return this.dimensions;
    }

    private class06233(int n, int n2, class06250 class062502) {
        this.from = n;
        this.to = n2;
        this.dimensions = class062502;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06233.class, "from;to;dimensions", "from", "to", "dimensions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06233.class, "from;to;dimensions", "from", "to", "dimensions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06233.class, "from;to;dimensions", "from", "to", "dimensions"}, this);
    }

    public int y() {
        return this.to;
    }

    public int N() {
        return this.from;
    }
}

