/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01471
 *  minecraft.class02142
 *  minecraft.class06386
 *  minecraft.class07211
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01471;
import minecraft.class02142;
import minecraft.class04025;
import minecraft.class04031;
import minecraft.class06386;
import minecraft.class07211;

public final class class04055
extends Record
implements class06386 {
    private final List<class04031> layers;
    private final class07211 direction;
    private final class04025 allowedPlacement;
    private final boolean prioritizeTip;
    public static final Codec<class04055> N = RecordCodecBuilder.create(instance -> instance.group((App)class04031.N.listOf().fieldOf("layers").forGetter(class04055::N), (App)class07211.field_29502.fieldOf("direction").forGetter(class04055::y), (App)class04025.y.fieldOf("allowed_placement").forGetter(class04055::L), (App)Codec.BOOL.fieldOf("prioritize_tip").forGetter(class04055::i)).apply(instance, class04055::new));

    public class04025 L() {
        return this.allowedPlacement;
    }

    public class04055(List<class04031> list, class07211 class072112, class04025 class040252, boolean bl) {
        this.layers = list;
        this.direction = class072112;
        this.allowedPlacement = class040252;
        this.prioritizeTip = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04055.class, "layers;direction;allowedPlacement;prioritizeTip", "layers", "direction", "allowedPlacement", "prioritizeTip"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04055.class, "layers;direction;allowedPlacement;prioritizeTip", "layers", "direction", "allowedPlacement", "prioritizeTip"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04055.class, "layers;direction;allowedPlacement;prioritizeTip", "layers", "direction", "allowedPlacement", "prioritizeTip"}, this);
    }

    public boolean i() {
        return this.prioritizeTip;
    }

    public class07211 y() {
        return this.direction;
    }

    public static class04055 y(class02142 class021422, class01471 class014712) {
        return new class04055(List.of(class04055.N(class021422, class014712)), class07211.field_11036, class04025.L, false);
    }

    public List<class04031> N() {
        return this.layers;
    }

    public static class04031 N(class02142 class021422, class01471 class014712) {
        return new class04031(class021422, class014712);
    }
}

