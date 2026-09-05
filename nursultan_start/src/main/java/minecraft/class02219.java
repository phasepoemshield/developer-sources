/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00816
 *  minecraft.class04995
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00816;
import minecraft.class04995;

public final class class02219
extends Record {
    private final class00816 x;
    private final class00816 y;
    private final class00816 z;
    private final class00816 speed;
    private final class00816 horizontalSpeed;
    private final class00816 verticalSpeed;
    private final class00816 fallDistance;
    public static final Codec<class02219> N = RecordCodecBuilder.create(instance -> instance.group((App)class00816.u.optionalFieldOf("x", (Object)class00816.L).forGetter(class02219::N), (App)class00816.u.optionalFieldOf("y", (Object)class00816.L).forGetter(class02219::y), (App)class00816.u.optionalFieldOf("z", (Object)class00816.L).forGetter(class02219::L), (App)class00816.u.optionalFieldOf("speed", (Object)class00816.L).forGetter(class02219::u), (App)class00816.u.optionalFieldOf("horizontal_speed", (Object)class00816.L).forGetter(class02219::i), (App)class00816.u.optionalFieldOf("vertical_speed", (Object)class00816.L).forGetter(class02219::R), (App)class00816.u.optionalFieldOf("fall_distance", (Object)class00816.L).forGetter(class02219::M)).apply(instance, class02219::new));

    public class00816 L() {
        return this.z;
    }

    public static class02219 L(class00816 class008162) {
        return new class02219(class00816.L, class00816.L, class00816.L, class00816.L, class00816.L, class008162, class00816.L);
    }

    public class00816 M() {
        return this.fallDistance;
    }

    public class02219(class00816 class008162, class00816 class008163, class00816 class008164, class00816 class008165, class00816 class008166, class00816 class008167, class00816 class008168) {
        this.x = class008162;
        this.y = class008163;
        this.z = class008164;
        this.speed = class008165;
        this.horizontalSpeed = class008166;
        this.verticalSpeed = class008167;
        this.fallDistance = class008168;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02219.class, "x;y;z;speed;horizontalSpeed;verticalSpeed;fallDistance", "x", "y", "z", "speed", "horizontalSpeed", "verticalSpeed", "fallDistance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02219.class, "x;y;z;speed;horizontalSpeed;verticalSpeed;fallDistance", "x", "y", "z", "speed", "horizontalSpeed", "verticalSpeed", "fallDistance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02219.class, "x;y;z;speed;horizontalSpeed;verticalSpeed;fallDistance", "x", "y", "z", "speed", "horizontalSpeed", "verticalSpeed", "fallDistance"}, this);
    }

    public class00816 i() {
        return this.horizontalSpeed;
    }

    public static class02219 u(class00816 class008162) {
        return new class02219(class00816.L, class00816.L, class00816.L, class00816.L, class00816.L, class00816.L, class008162);
    }

    public class00816 u() {
        return this.speed;
    }

    public static class02219 y(class00816 class008162) {
        return new class02219(class00816.L, class00816.L, class00816.L, class00816.L, class008162, class00816.L, class00816.L);
    }

    public class00816 y() {
        return this.y;
    }

    public static class02219 N(class00816 class008162) {
        return new class02219(class00816.L, class00816.L, class00816.L, class008162, class00816.L, class00816.L, class00816.L);
    }

    public class00816 N() {
        return this.x;
    }

    public boolean N(double d, double d2, double d3, double d4) {
        if (!(this.x.u(d) && this.y.u(d2) && this.z.u(d3))) {
            return false;
        }
        double d5 = class04995.R((double)d, (double)d2, (double)d3);
        if (!this.speed.i(d5)) {
            return false;
        }
        double d6 = class04995.i((double)d, (double)d3);
        if (!this.horizontalSpeed.i(d6)) {
            return false;
        }
        double d7 = Math.abs(d2);
        if (!this.verticalSpeed.u(d7)) {
            return false;
        }
        return this.fallDistance.u(d4);
    }

    public class00816 R() {
        return this.verticalSpeed;
    }
}

