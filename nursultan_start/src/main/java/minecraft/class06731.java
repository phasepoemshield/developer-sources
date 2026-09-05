/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01368
 *  minecraft.class01374
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class01368;
import minecraft.class01374;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class06338;

public final class class06731
extends Record {
    private final Optional<class03556<class04891>> loop;
    private final Optional<class01374> mood;
    private final List<class01368> additions;
    public static final class06731 N = new class06731(Optional.empty(), Optional.empty(), List.of());
    public static final class06731 y = new class06731(Optional.empty(), Optional.of(class01374.y), List.of());
    public static final Codec<class06731> L = RecordCodecBuilder.create(instance -> instance.group((App)class04891.y.optionalFieldOf("loop").forGetter(class06731::N), (App)class01374.N.optionalFieldOf("mood").forGetter(class06731::y), (App)class06338.N((Codec)class01368.N).optionalFieldOf("additions", List.of()).forGetter(class06731::L)).apply(instance, class06731::new));

    public List<class01368> L() {
        return this.additions;
    }

    public class06731(Optional<class03556<class04891>> optional, Optional<class01374> optional2, List<class01368> list) {
        this.loop = optional;
        this.mood = optional2;
        this.additions = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06731.class, "loop;mood;additions", "loop", "mood", "additions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06731.class, "loop;mood;additions", "loop", "mood", "additions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06731.class, "loop;mood;additions", "loop", "mood", "additions"}, this);
    }

    public Optional<class01374> y() {
        return this.mood;
    }

    public Optional<class03556<class04891>> N() {
        return this.loop;
    }
}

