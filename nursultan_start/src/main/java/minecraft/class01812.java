/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02142
 *  minecraft.class03649
 *  minecraft.class04025
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02142;
import minecraft.class03649;
import minecraft.class04025;
import minecraft.class06386;

public final class class01812
extends Record
implements class06386 {
    private final class03649 stateProvider;
    private final class04025 target;
    private final class02142 radius;
    private final int halfHeight;
    public static final Codec<class01812> N = RecordCodecBuilder.create(instance -> instance.group((App)class03649.N.fieldOf("state_provider").forGetter(class01812::N), (App)class04025.y.fieldOf("target").forGetter(class01812::y), (App)class02142.N((int)0, (int)8).fieldOf("radius").forGetter(class01812::L), (App)Codec.intRange((int)0, (int)4).fieldOf("half_height").forGetter(class01812::i)).apply(instance, class01812::new));

    public class02142 L() {
        return this.radius;
    }

    public class01812(class03649 class036492, class04025 class040252, class02142 class021422, int n) {
        this.stateProvider = class036492;
        this.target = class040252;
        this.radius = class021422;
        this.halfHeight = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01812.class, "stateProvider;target;radius;halfHeight", "stateProvider", "target", "radius", "halfHeight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01812.class, "stateProvider;target;radius;halfHeight", "stateProvider", "target", "radius", "halfHeight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01812.class, "stateProvider;target;radius;halfHeight", "stateProvider", "target", "radius", "halfHeight"}, this);
    }

    public int i() {
        return this.halfHeight;
    }

    public class04025 y() {
        return this.target;
    }

    public class03649 N() {
        return this.stateProvider;
    }
}

