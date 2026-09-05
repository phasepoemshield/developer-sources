/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00518
 *  minecraft.class01766
 *  minecraft.class01788
 *  minecraft.class05338
 *  minecraft.class05908
 *  minecraft.class05919
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06394
 *  minecraft.class06683
 *  minecraft.class07049
 *  minecraft.class07491
 *  minecraft.class07693
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import minecraft.class00518;
import minecraft.class00794;
import minecraft.class01766;
import minecraft.class01788;
import minecraft.class05338;
import minecraft.class05908;
import minecraft.class05919;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06394;
import minecraft.class06683;
import minecraft.class07049;
import minecraft.class07491;
import minecraft.class07693;

public final class class00805
extends Record
implements class05957 {
    private final Map<String, class05338> scores;
    private final class05919 entityTarget;
    public static final MapCodec<class00805> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.unboundedMap((Codec)Codec.STRING, (Codec)class05338.N).fieldOf("scores").forGetter(class00805::L), (App)class05919.field_45792.fieldOf("entity").forGetter(class00805::u)).apply(instance, class00805::new));

    public Map<String, class05338> L() {
        return this.scores;
    }

    public class00805(Map<String, class05338> map, class05919 class059192) {
        this.scores = map;
        this.entityTarget = class059192;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00805.class, "scores;entityTarget", "scores", "entityTarget"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00805.class, "scores;entityTarget", "scores", "entityTarget"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00805.class, "scores;entityTarget", "scores", "entityTarget"}, this);
    }

    public class05919 u() {
        return this.entityTarget;
    }

    public Set<class07491<?>> y() {
        return (Set)Stream.concat(Stream.of(this.entityTarget.N()), this.scores.values().stream().flatMap(class053382 -> class053382.N().stream())).collect(ImmutableSet.toImmutableSet());
    }

    public boolean test(class05908 class059082) {
        class07049 class070492 = (class07049)class059082.L(this.entityTarget.N());
        if (class070492 == null) {
            return false;
        }
        class06394 class063942 = class059082.u().method_14170();
        for (Map.Entry<String, class05338> entry : this.scores.entrySet()) {
            if (this.N(class059082, class070492, (class06683)class063942, entry.getKey(), entry.getValue())) continue;
            return false;
        }
        return true;
    }

    public class05955 N() {
        return class07693.B;
    }

    public static class00794 N(class05919 class059192) {
        return new class00794(class059192);
    }

    protected boolean N(class05908 class059082, class07049 class070492, class06683 class066832, String string, class05338 class053382) {
        class00518 class005182 = class066832.N(string);
        if (class005182 == null) {
            return false;
        }
        class01788 class017882 = class066832.y((class01766)class070492, class005182);
        if (class017882 == null) {
            return false;
        }
        return class053382.y(class059082, class017882.y());
    }
}

