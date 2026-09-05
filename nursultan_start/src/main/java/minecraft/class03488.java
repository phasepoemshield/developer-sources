/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00821
 *  minecraft.class00837
 *  minecraft.class00845
 *  minecraft.class01425
 *  minecraft.class05196
 *  minecraft.class05946
 *  minecraft.class06516
 *  minecraft.class06521
 *  minecraft.class06584
 *  minecraft.class06912
 *  minecraft.class06915
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00821;
import minecraft.class00837;
import minecraft.class00845;
import minecraft.class01425;
import minecraft.class05196;
import minecraft.class05946;
import minecraft.class06516;
import minecraft.class06521;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class06915;

public final class class03488
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final class05946<class06521<?>> recipeId;
    private final List<class00845> ingredients;
    public static final Codec<class03488> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class03488::N), (App)class06521.M.fieldOf("recipe_id").forGetter(class03488::y), (App)class00845.N.listOf().optionalFieldOf("ingredients", List.of()).forGetter(class03488::L)).apply(instance, class03488::new));

    public List<class00845> L() {
        return this.ingredients;
    }

    public class03488(Optional<class05196> optional, class05946<class06521<?>> class059462, List<class00845> list) {
        this.player = optional;
        this.recipeId = class059462;
        this.ingredients = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03488.class, "player;recipeId;ingredients", "player", "recipeId", "ingredients"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03488.class, "player;recipeId;ingredients", "player", "recipeId", "ingredients"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03488.class, "player;recipeId;ingredients", "player", "recipeId", "ingredients"}, this);
    }

    public static class06915<class03488> y(class05946<class06521<?>> class059462) {
        return class06912.NR.N((class06516)new class03488(Optional.empty(), class059462, List.of()));
    }

    public class05946<class06521<?>> y() {
        return this.recipeId;
    }

    boolean y(class05946<class06521<?>> class059462, List<class06584> list) {
        if (class059462 != this.recipeId) {
            return false;
        }
        ArrayList<class06584> arrayList = new ArrayList<class06584>(list);
        for (class00845 class008452 : this.ingredients) {
            boolean bl = false;
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                if (!class008452.test((class06584)iterator.next())) continue;
                iterator.remove();
                bl = true;
                break;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public static class06915<class03488> N(class05946<class06521<?>> class059462, List<class00837> list) {
        return class06912.Ni.N((class06516)new class03488(Optional.empty(), class059462, list.stream().map(class00837::y).toList()));
    }

    public static class06915<class03488> N(class05946<class06521<?>> class059462) {
        return class06912.Ni.N((class06516)new class03488(Optional.empty(), class059462, List.of()));
    }
}

