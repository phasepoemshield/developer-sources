/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00265;
import minecraft.class00273;
import minecraft.class00299;
import minecraft.class02362;
import minecraft.class04247;

public final class class00309
extends Record
implements class00265 {
    private final class00299 template;
    private final class00299 base;
    private final class00299 addition;
    private final class00299 result;
    private final class00299 craftingStation;
    public static final MapCodec<class00309> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00299.N.fieldOf("template").forGetter(class00309::y), (App)class00299.N.fieldOf("base").forGetter(class00309::L), (App)class00299.N.fieldOf("addition").forGetter(class00309::R), (App)class00299.N.fieldOf("result").forGetter(class00309::u), (App)class00299.N.fieldOf("crafting_station").forGetter(class00309::i)).apply(instance, class00309::new));
    public static final class02362<class04247, class00309> y = class02362.N(class00299.y, class00309::y, class00299.y, class00309::L, class00299.y, class00309::R, class00299.y, class00309::u, class00299.y, class00309::i, class00309::new);
    public static final class00273<class00309> L = new class00273<class00309>(N, y);

    public class00299 L() {
        return this.base;
    }

    public class00309(class00299 class002992, class00299 class002993, class00299 class002994, class00299 class002995, class00299 class002996) {
        this.template = class002992;
        this.base = class002993;
        this.addition = class002994;
        this.result = class002995;
        this.craftingStation = class002996;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00309.class, "template;base;addition;result;craftingStation", "template", "base", "addition", "result", "craftingStation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00309.class, "template;base;addition;result;craftingStation", "template", "base", "addition", "result", "craftingStation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00309.class, "template;base;addition;result;craftingStation", "template", "base", "addition", "result", "craftingStation"}, this);
    }

    @Override
    public class00299 i() {
        return this.craftingStation;
    }

    @Override
    public class00299 u() {
        return this.result;
    }

    public class00299 y() {
        return this.template;
    }

    public class00273<class00309> N() {
        return L;
    }

    public class00299 R() {
        return this.addition;
    }
}

