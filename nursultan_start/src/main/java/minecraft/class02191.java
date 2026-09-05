/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00891
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00891;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06338;

public final class class02191
extends Record {
    final class03543<class00891> blocks;
    final Optional<Float> speed;
    final Optional<Boolean> correctForDrops;
    public static final Codec<class02191> u = RecordCodecBuilder.create(instance -> instance.group((App)class03541.N((class05946)class04227.Z).fieldOf("blocks").forGetter(class02191::N), (App)class06338.t.optionalFieldOf("speed").forGetter(class02191::y), (App)Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(class02191::L)).apply(instance, class02191::new));
    public static final class02362<class04247, class02191> i = class02362.N((class02362)class02389.L((class05946)class04227.Z), class02191::N, (class02362)class02389.E.N_33(class02389::N), class02191::y, (class02362)class02389.y.N_33(class02389::N), class02191::L, class02191::new);

    public Optional<Boolean> L() {
        return this.correctForDrops;
    }

    public class02191(class03543<class00891> class035432, Optional<Float> optional, Optional<Boolean> optional2) {
        this.blocks = class035432;
        this.speed = optional;
        this.correctForDrops = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02191.class, "blocks;speed;correctForDrops", "blocks", "speed", "correctForDrops"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02191.class, "blocks;speed;correctForDrops", "blocks", "speed", "correctForDrops"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02191.class, "blocks;speed;correctForDrops", "blocks", "speed", "correctForDrops"}, this);
    }

    public Optional<Float> y() {
        return this.speed;
    }

    public static class02191 y(class03543<class00891> class035432, float f) {
        return new class02191(class035432, Optional.of(Float.valueOf(f)), Optional.empty());
    }

    public class03543<class00891> N() {
        return this.blocks;
    }

    public static class02191 N(class03543<class00891> class035432, float f) {
        return new class02191(class035432, Optional.of(Float.valueOf(f)), Optional.of(true));
    }

    public static class02191 N(class03543<class00891> class035432) {
        return new class02191(class035432, Optional.empty(), Optional.of(false));
    }
}

