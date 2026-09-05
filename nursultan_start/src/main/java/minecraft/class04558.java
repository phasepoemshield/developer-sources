/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00672
 *  minecraft.class00821
 *  minecraft.class00836
 *  minecraft.class03622
 *  minecraft.class03631
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00672;
import minecraft.class00821;
import minecraft.class00836;
import minecraft.class03622;
import minecraft.class03631;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import org.jspecify.annotations.Nullable;

public final class class04558
extends Record
implements class03622 {
    private final class00836 blocksSetOnFire;
    private final Optional<class00821> entityStruck;
    public static final MapCodec<class04558> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00836.u.optionalFieldOf("blocks_set_on_fire", (Object)class00836.L).forGetter(class04558::y), (App)class00821.N.optionalFieldOf("entity_struck").forGetter(class04558::L)).apply(instance, class04558::new));

    public Optional<class00821> L() {
        return this.entityStruck;
    }

    public class04558(class00836 class008362, Optional<class00821> optional) {
        this.blocksSetOnFire = class008362;
        this.entityStruck = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04558.class, "blocksSetOnFire;entityStruck", "blocksSetOnFire", "entityStruck"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04558.class, "blocksSetOnFire;entityStruck", "blocksSetOnFire", "entityStruck"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04558.class, "blocksSetOnFire;entityStruck", "blocksSetOnFire", "entityStruck"}, this);
    }

    public class00836 y() {
        return this.blocksSetOnFire;
    }

    public boolean N(class07049 class070493, class04782 class047822, @Nullable class06889 class068892) {
        if (!(class070493 instanceof class00672)) {
            return false;
        }
        class00672 class006722 = (class00672)class070493;
        return this.blocksSetOnFire.u(class006722.y()) && (this.entityStruck.isEmpty() || class006722.L().anyMatch(class070492 -> this.entityStruck.get().N(class047822, class068892, class070492)));
    }

    public static class04558 N(class00836 class008362) {
        return new class04558(class008362, Optional.empty());
    }

    public MapCodec<class04558> N() {
        return class03631.N;
    }
}

