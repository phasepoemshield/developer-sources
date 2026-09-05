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

public final class class00316
extends Record
implements class00265 {
    private final class00299 input;
    private final class00299 result;
    private final class00299 craftingStation;
    public static final MapCodec<class00316> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00299.N.fieldOf("input").forGetter(class00316::y), (App)class00299.N.fieldOf("result").forGetter(class00316::u), (App)class00299.N.fieldOf("crafting_station").forGetter(class00316::i)).apply(instance, class00316::new));
    public static final class02362<class04247, class00316> y = class02362.N(class00299.y, class00316::y, class00299.y, class00316::u, class00299.y, class00316::i, class00316::new);
    public static final class00273<class00316> L = new class00273<class00316>(N, y);

    public class00316(class00299 class002992, class00299 class002993, class00299 class002994) {
        this.input = class002992;
        this.result = class002993;
        this.craftingStation = class002994;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00316.class, "input;result;craftingStation", "input", "result", "craftingStation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00316.class, "input;result;craftingStation", "input", "result", "craftingStation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00316.class, "input;result;craftingStation", "input", "result", "craftingStation"}, this);
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
        return this.input;
    }

    public class00273<class00316> N() {
        return L;
    }
}

