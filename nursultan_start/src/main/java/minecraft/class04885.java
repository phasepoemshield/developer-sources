/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04877;

final class class04885
extends Record {
    final int id;
    final class04877 raid;
    public static final Codec<class04885> L = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("id").forGetter(class04885::N), (App)class04877.y.forGetter(class04885::y)).apply(instance, class04885::new));

    private class04885(int n, class04877 class048772) {
        this.id = n;
        this.raid = class048772;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04885.class, "id;raid", "id", "raid"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04885.class, "id;raid", "id", "raid"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04885.class, "id;raid", "id", "raid"}, this);
    }

    public class04877 y() {
        return this.raid;
    }

    public int N() {
        return this.id;
    }

    public static class04885 N(Int2ObjectMap.Entry<class04877> entry) {
        return new class04885(entry.getIntKey(), (class04877)entry.getValue());
    }
}

