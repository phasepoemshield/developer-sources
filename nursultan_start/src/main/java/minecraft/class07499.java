/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00717
 *  minecraft.class02796
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class06925
 *  minecraft.class06984
 *  minecraft.class07692
 *  minecraft.class08152
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class00717;
import minecraft.class02796;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class06925;
import minecraft.class06984;
import minecraft.class07482;
import minecraft.class07692;
import minecraft.class08152;

public final class class07499
extends Record {
    private final int experience;
    private final List<class05946<class05074>> loot;
    private final List<class05946<class06521<?>>> recipes;
    private final Optional<class07692> function;
    public static final Codec<class07499> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.optionalFieldOf("experience", (Object)0).forGetter(class07499::N), (App)class05074.N.listOf().optionalFieldOf("loot", List.of()).forGetter(class07499::y), (App)class06521.M.listOf().optionalFieldOf("recipes", List.of()).forGetter(class07499::L), (App)class07692.N.optionalFieldOf("function").forGetter(class07499::u)).apply(instance, class07499::new));
    public static final class07499 y = new class07499(0, List.of(), List.of(), Optional.empty());

    public List<class05946<class06521<?>>> L() {
        return this.recipes;
    }

    public class07499(int n, List<class05946<class05074>> list, List<class05946<class06521<?>>> list2, Optional<class07692> optional) {
        this.experience = n;
        this.loot = list;
        this.recipes = list2;
        this.function = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07499.class, "experience;loot;recipes;function", "experience", "loot", "recipes", "function"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07499.class, "experience;loot;recipes;function", "experience", "loot", "recipes", "function"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07499.class, "experience;loot;recipes;function", "experience", "loot", "recipes", "function"}, this);
    }

    public Optional<class07692> u() {
        return this.function;
    }

    public List<class05946<class05074>> y() {
        return this.loot;
    }

    public void N(class04770 class047702) {
        class047702.method_7255(this.experience);
        class04782 class047822 = class047702.method_51469();
        class02796 class027962 = class047822.method_8503();
        class04162 class041622 = new class04160(class047822).N(class06551.N, (Object)class047702).N(class06551.B, (Object)class047702.method_73189()).N(class06925.m);
        boolean bl = false;
        for (class05946<class05074> var7 : this.loot) {
            for (class06584 class065842 : class027962.yd().N(var7).N(class041622)) {
                if (class047702.method_7270(class065842)) {
                    class047822.method_43128(null, class047702.method_23317(), class047702.method_23318(), class047702.method_23321(), class04909.sJ, class04911.field_15248, 0.2f, ((class047702.method_59922().z() - class047702.method_59922().z()) * 0.7f + 1.0f) * 2.0f);
                    bl = true;
                    continue;
                }
                class00717 class007172 = class047702.method_7328(class065842, false);
                if (class007172 == null) continue;
                class007172.u();
                class007172.N(class047702.method_5667());
            }
        }
        if (bl) {
            ((class07482)class047702.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
        }
        if (!this.recipes.isEmpty()) {
            class047702.method_7335(this.recipes);
        }
        this.function.flatMap(class076922 -> class076922.N(class027962.Nr())).ifPresent(class076842 -> class027962.Nr().N(class076842, class047702.method_64396().y().N((class08152)class06984.L)));
    }

    public int N() {
        return this.experience;
    }
}

