/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00518
 *  minecraft.class01766
 *  minecraft.class01788
 *  minecraft.class05908
 *  minecraft.class05919
 *  minecraft.class06394
 *  minecraft.class07491
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class00518;
import minecraft.class01766;
import minecraft.class01788;
import minecraft.class05908;
import minecraft.class05919;
import minecraft.class06332;
import minecraft.class06339;
import minecraft.class06340;
import minecraft.class06341;
import minecraft.class06348;
import minecraft.class06378;
import minecraft.class06394;
import minecraft.class07491;

public final class class06362
extends Record
implements class06378 {
    private final class06348 target;
    private final String score;
    private final float scale;
    public static final MapCodec<class06362> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06332.N.fieldOf("target").forGetter(class06362::L), (App)Codec.STRING.fieldOf("score").forGetter(class06362::u), (App)Codec.FLOAT.fieldOf("scale").orElse((Object)Float.valueOf(1.0f)).forGetter(class06362::i)).apply(instance, class06362::new));

    public class06348 L() {
        return this.target;
    }

    public class06362(class06348 class063482, String string, float f) {
        this.target = class063482;
        this.score = string;
        this.scale = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06362.class, "target;score;scale", "target", "score", "scale"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06362.class, "target;score;scale", "target", "score", "scale"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06362.class, "target;score;scale", "target", "score", "scale"}, this);
    }

    public float i() {
        return this.scale;
    }

    public String u() {
        return this.score;
    }

    @Override
    public float y(class05908 class059082) {
        class01766 class017662 = this.target.N(class059082);
        if (class017662 == null) {
            return 0.0f;
        }
        class06394 class063942 = class059082.u().method_14170();
        class00518 class005182 = class063942.N(this.score);
        if (class005182 == null) {
            return 0.0f;
        }
        class01788 class017882 = class063942.y(class017662, class005182);
        if (class017882 == null) {
            return 0.0f;
        }
        return (float)class017882.y() * this.scale;
    }

    public Set<class07491<?>> y() {
        return this.target.y();
    }

    public static class06362 N(class05919 class059192, String string) {
        return class06362.N(class059192, string, 1.0f);
    }

    @Override
    public class06341 N() {
        return class06339.i;
    }

    public static class06362 N(class05919 class059192, String string, float f) {
        return new class06362(class06340.N(class059192), string, f);
    }
}

