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
 *  minecraft.class03129
 *  minecraft.class04540
 *  minecraft.class05281
 *  minecraft.class05946
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import minecraft.class03129;
import minecraft.class04540;
import minecraft.class05281;
import minecraft.class05946;
import minecraft.class06069;

public final class class03146
extends Record
implements class03129 {
    private final class04540<List<class03129>> groups;
    static MapCodec<class03146> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04540.y((Codec)Codec.list((Codec)class03129.y)).fieldOf("groups").forGetter(class03146::L)).apply(instance, class03146::new));

    public class04540<List<class03129>> L() {
        return this.groups;
    }

    public class03146(class04540<List<class03129>> class045402) {
        this.groups = class045402;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03146.class, "groups", "groups"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03146.class, "groups", "groups"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03146.class, "groups", "groups"}, this);
    }

    public MapCodec<class03146> y() {
        return N;
    }

    public Stream<class05946<class05281>> N() {
        return this.groups.u().stream().flatMap(class045232 -> ((List)class045232.N()).stream()).flatMap(class03129::N);
    }

    public void N(class06069 class060692, BiConsumer<class05946<class05281>, class05946<class05281>> biConsumer) {
        this.groups.N(class060692).ifPresent(list -> list.forEach(class031292 -> class031292.N(class060692, biConsumer)));
    }
}

