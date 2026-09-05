/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class00393
 *  minecraft.class00394
 *  minecraft.class00831
 *  minecraft.class02195
 *  minecraft.class03556
 *  minecraft.class03748
 *  minecraft.class06563
 *  minecraft.class07209
 *  minecraft.class07290
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00393;
import minecraft.class00394;
import minecraft.class00831;
import minecraft.class02195;
import minecraft.class03556;
import minecraft.class03748;
import minecraft.class06563;
import minecraft.class07209;
import minecraft.class07290;
import org.jspecify.annotations.Nullable;

public final class class07511
extends Record {
    private final class07209 pos;
    private final class06563 color;
    private final Optional<class00392> name;
    public static final Codec<class07511> N = RecordCodecBuilder.create(instance -> instance.group((App)class07209.field_25064.fieldOf("pos").forGetter(class07511::L), (App)class06563.field_41600.lenientOptionalFieldOf("color", (Object)class06563.field_7952).forGetter(class07511::u), (App)class03748.N.lenientOptionalFieldOf("name").forGetter(class07511::i)).apply(instance, class07511::new));

    public class07209 L() {
        return this.pos;
    }

    public class07511(class07209 class072092, class06563 class065632, Optional<class00392> optional) {
        this.pos = class072092;
        this.color = class065632;
        this.name = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07511.class, "pos;color;name", "pos", "color", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07511.class, "pos;color;name", "pos", "color", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07511.class, "pos;color;name", "pos", "color", "name"}, this);
    }

    public Optional<class00392> i() {
        return this.name;
    }

    public class06563 u() {
        return this.color;
    }

    public String y() {
        return "banner-" + this.pos.method_10263() + "," + this.pos.method_10264() + "," + this.pos.method_10260();
    }

    public static @Nullable class07511 N(class07290 class072902, class07209 class072092) {
        class00394 class003942 = class072902.method_8321(class072092);
        if (class003942 instanceof class00393) {
            class00393 class003932 = (class00393)class003942;
            class06563 class065632 = class003932.u();
            Optional<class00392> optional = Optional.ofNullable(class003932.method_5797());
            return new class07511(class072092, class065632, optional);
        }
        return null;
    }

    public class03556<class02195> N() {
        return switch (this.color) {
            default -> throw new MatchException(null, null);
            case class06563.field_7952 -> class00831.U;
            case class06563.field_7946 -> class00831.E;
            case class06563.field_7958 -> class00831.W;
            case class06563.field_7951 -> class00831.m;
            case class06563.field_7947 -> class00831.P;
            case class06563.field_7961 -> class00831.s;
            case class06563.field_7954 -> class00831.T;
            case class06563.field_7944 -> class00831.b;
            case class06563.field_7967 -> class00831.j;
            case class06563.field_7955 -> class00831.v;
            case class06563.field_7945 -> class00831.n;
            case class06563.field_7966 -> class00831.t;
            case class06563.field_7957 -> class00831.G;
            case class06563.field_7942 -> class00831.l;
            case class06563.field_7964 -> class00831.d;
            case class06563.field_7963 -> class00831.w;
        };
    }
}

