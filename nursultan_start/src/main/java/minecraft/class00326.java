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
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03767
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00265;
import minecraft.class00273;
import minecraft.class00299;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03767;
import minecraft.class04247;

public final class class00326
extends Record
implements class00265 {
    private final int width;
    private final int height;
    private final List<class00299> ingredients;
    private final class00299 result;
    private final class00299 craftingStation;
    public static final MapCodec<class00326> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.fieldOf("width").forGetter(class00326::y), (App)Codec.INT.fieldOf("height").forGetter(class00326::L), (App)class00299.N.listOf().fieldOf("ingredients").forGetter(class00326::R), (App)class00299.N.fieldOf("result").forGetter(class00326::u), (App)class00299.N.fieldOf("crafting_station").forGetter(class00326::i)).apply(instance, class00326::new));
    public static final class02362<class04247, class00326> y = class02362.N((class02362)class02389.B, class00326::y, (class02362)class02389.B, class00326::L, (class02362)class00299.y.N_33(class02389.N()), class00326::R, class00299.y, class00326::u, class00299.y, class00326::i, class00326::new);
    public static final class00273<class00326> L = new class00273<class00326>(N, y);

    public int L() {
        return this.height;
    }

    public class00326(int n, int n2, List<class00299> list, class00299 class002992, class00299 class002993) {
        if (list.size() != n * n2) {
            throw new IllegalArgumentException("Invalid shaped recipe display contents");
        }
        this.width = n;
        this.height = n2;
        this.ingredients = list;
        this.result = class002992;
        this.craftingStation = class002993;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00326.class, "width;height;ingredients;result;craftingStation", "width", "height", "ingredients", "result", "craftingStation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00326.class, "width;height;ingredients;result;craftingStation", "width", "height", "ingredients", "result", "craftingStation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00326.class, "width;height;ingredients;result;craftingStation", "width", "height", "ingredients", "result", "craftingStation"}, this);
    }

    @Override
    public class00299 i() {
        return this.craftingStation;
    }

    @Override
    public class00299 u() {
        return this.result;
    }

    public int y() {
        return this.width;
    }

    @Override
    public boolean N(class03767 class037672) {
        return this.ingredients.stream().allMatch(class002992 -> class002992.N(class037672)) && class00265.super.N(class037672);
    }

    public class00273<class00326> N() {
        return L;
    }

    public List<class00299> R() {
        return this.ingredients;
    }
}

