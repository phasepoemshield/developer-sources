/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
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

public final class class00761
extends Record {
    private final class00816 x;
    private final class00816 y;
    private final class00816 z;
    private final class00816 horizontal;
    private final class00816 absolute;
    public static final Codec<class00761> N = RecordCodecBuilder.create(instance -> instance.group((App)class00816.u.optionalFieldOf("x", (Object)class00816.L).forGetter(class00761::N), (App)class00816.u.optionalFieldOf("y", (Object)class00816.L).forGetter(class00761::y), (App)class00816.u.optionalFieldOf("z", (Object)class00816.L).forGetter(class00761::L), (App)class00816.u.optionalFieldOf("horizontal", (Object)class00816.L).forGetter(class00761::u), (App)class00816.u.optionalFieldOf("absolute", (Object)class00816.L).forGetter(class00761::i)).apply(instance, class00761::new));

    public static class00761 L(class00816 class008162) {
        return new class00761(class00816.L, class00816.L, class00816.L, class00816.L, class008162);
    }

    public class00816 L() {
        return this.z;
    }

    public class00761(class00816 class008162, class00816 class008163, class00816 class008164, class00816 class008165, class00816 class008166) {
        this.x = class008162;
        this.y = class008163;
        this.z = class008164;
        this.horizontal = class008165;
        this.absolute = class008166;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00761.class, "x;y;z;horizontal;absolute", "x", "y", "z", "horizontal", "absolute"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00761.class, "x;y;z;horizontal;absolute", "x", "y", "z", "horizontal", "absolute"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00761.class, "x;y;z;horizontal;absolute", "x", "y", "z", "horizontal", "absolute"}, this);
    }

    public class00816 i() {
        return this.absolute;
    }

    public class00816 u() {
        return this.horizontal;
    }

    public class00816 y() {
        return this.y;
    }

    public static class00761 y(class00816 class008162) {
        return new class00761(class00816.L, class008162, class00816.L, class00816.L, class00816.L);
    }

    public boolean N(double d, double d2, double d3, double d4, double d5, double d6) {
        float f = (float)(d - d4);
        float f2 = (float)(d2 - d5);
        float f3 = (float)(d3 - d6);
        if (!(this.x.u(class04995.L((float)f)) && this.y.u(class04995.L((float)f2)) && this.z.u(class04995.L((float)f3)))) {
            return false;
        }
        if (!this.horizontal.i(f * f + f3 * f3)) {
            return false;
        }
        return this.absolute.i(f * f + f2 * f2 + f3 * f3);
    }

    public static class00761 N(class00816 class008162) {
        return new class00761(class00816.L, class00816.L, class00816.L, class008162, class00816.L);
    }

    public class00816 N() {
        return this.x;
    }
}

