/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02560
 *  minecraft.class04782
 *  minecraft.class06042
 *  minecraft.class06052
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07107
 *  minecraft.class07126
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02517;
import minecraft.class02525;
import minecraft.class02535;
import minecraft.class02538;
import minecraft.class02560;
import minecraft.class04782;
import minecraft.class06042;
import minecraft.class06052;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07107;
import minecraft.class07126;

public final class class02540
extends Record
implements class02560 {
    private final class07126 particle;
    private final class02535 horizontalPosition;
    private final class02535 verticalPosition;
    private final class02517 horizontalVelocity;
    private final class02517 verticalVelocity;
    private final class06052 speed;
    public static final MapCodec<class02540> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07107.yE.fieldOf("particle").forGetter(class02540::L), (App)class02535.N.fieldOf("horizontal_position").forGetter(class02540::u), (App)class02535.N.fieldOf("vertical_position").forGetter(class02540::i), (App)class02517.N.fieldOf("horizontal_velocity").forGetter(class02540::R), (App)class02517.N.fieldOf("vertical_velocity").forGetter(class02540::M), (App)class06052.L.optionalFieldOf("speed", (Object)class06042.N).forGetter(class02540::B)).apply(instance, class02540::new));

    public class07126 L() {
        return this.particle;
    }

    public class02517 M() {
        return this.verticalVelocity;
    }

    public class02540(class07126 class071262, class02535 class025352, class02535 class025353, class02517 class025172, class02517 class025173, class06052 class060522) {
        this.particle = class071262;
        this.horizontalPosition = class025352;
        this.verticalPosition = class025353;
        this.horizontalVelocity = class025172;
        this.verticalVelocity = class025173;
        this.speed = class060522;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02540.class, "particle;horizontalPosition;verticalPosition;horizontalVelocity;verticalVelocity;speed", "particle", "horizontalPosition", "verticalPosition", "horizontalVelocity", "verticalVelocity", "speed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02540.class, "particle;horizontalPosition;verticalPosition;horizontalVelocity;verticalVelocity;speed", "particle", "horizontalPosition", "verticalPosition", "horizontalVelocity", "verticalVelocity", "speed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02540.class, "particle;horizontalPosition;verticalPosition;horizontalVelocity;verticalVelocity;speed", "particle", "horizontalPosition", "verticalPosition", "horizontalVelocity", "verticalVelocity", "speed"}, this);
    }

    public class06052 B() {
        return this.speed;
    }

    public class02535 i() {
        return this.verticalPosition;
    }

    public class02535 u() {
        return this.horizontalPosition;
    }

    public static class02535 y() {
        return new class02535(class02538.field_51724, 0.0f, 1.0f);
    }

    public static class02517 y(float f) {
        return new class02517(f, (class06052)class06042.N);
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        class06069 class060692 = class070492.method_59922();
        class06889 class068893 = class070492.method_60478();
        float f = class070492.method_17681();
        float f2 = class070492.method_17682();
        class047822.method_65096(this.particle, this.horizontalPosition.N(class068892.N(), class068892.N(), f, class060692), this.verticalPosition.N(class068892.y(), class068892.y() + (double)(f2 / 2.0f), f2, class060692), this.horizontalPosition.N(class068892.L(), class068892.L(), f, class060692), 0, this.horizontalVelocity.N(class068893.N(), class060692), this.verticalVelocity.N(class068893.y(), class060692), this.horizontalVelocity.N(class068893.L(), class060692), (double)this.speed.N(class060692));
    }

    public static class02517 N(class06052 class060522) {
        return new class02517(0.0f, class060522);
    }

    public static class02535 N(float f) {
        return new class02535(class02538.field_51723, f, 1.0f);
    }

    public MapCodec<class02540> N() {
        return N;
    }

    public class02517 R() {
        return this.horizontalVelocity;
    }
}

