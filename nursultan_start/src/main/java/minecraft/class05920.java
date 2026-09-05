/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00818
 *  minecraft.class00821
 *  minecraft.class00837
 *  minecraft.class00851
 *  minecraft.class00859
 *  minecraft.class00891
 *  minecraft.class01408
 *  minecraft.class01425
 *  minecraft.class04492
 *  minecraft.class05033
 *  minecraft.class05196
 *  minecraft.class06516
 *  minecraft.class06912
 *  minecraft.class06915
 *  minecraft.class06925
 *  minecraft.class07795
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Optional;
import minecraft.class00818;
import minecraft.class00821;
import minecraft.class00837;
import minecraft.class00851;
import minecraft.class00859;
import minecraft.class00891;
import minecraft.class01408;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class05033;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class05952;
import minecraft.class05957;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class06925;
import minecraft.class07795;
import minecraft.class08092;

public final class class05920
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class05196> location;
    public static final Codec<class05920> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class05920::N), (App)class05196.N.optionalFieldOf("location").forGetter(class05920::y)).apply(instance, class05920::new));

    private static class05920 L(class00818 class008182, class00837 class008372) {
        class05196 class051962 = class05196.N((class05957[])new class05957[]{class00859.N((class00818)class008182).build(), class07795.N((class00837)class008372).build()});
        return new class05920(Optional.empty(), Optional.of(class051962));
    }

    public class05920(Optional<class05196> optional, Optional<class05196> optional2) {
        this.player = optional;
        this.location = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05920.class, "player;location", "player", "location"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05920.class, "player;location", "player", "location"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05920.class, "player;location", "player", "location"}, this);
    }

    public Optional<class05196> y() {
        return this.location;
    }

    public static class06915<class05920> y(class00818 class008182, class00837 class008372) {
        return class06912.NL.N((class06516)class05920.L(class008182, class008372));
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class05908 class059082) {
        return this.location.isEmpty() || this.location.get().N(class059082);
    }

    public static class06915<class05920> N(class05952 ... class05952Array) {
        class05196 class051962 = class05196.N((class05957[])((class05957[])Arrays.stream(class05952Array).map(class05952::build).toArray(class05957[]::new)));
        return class06912.w.N((class06516)new class05920(Optional.empty(), Optional.of(class051962)));
    }

    public static <T extends Comparable<T> & class05033> class06915<class05920> N(class00891 class008912, class08092<T> class080922, T t) {
        return class05920.N(class008912, class080922, ((class05033)t).method_15434());
    }

    public static class06915<class05920> N(class00891 class008912, class08092<Integer> class080922, int n) {
        return class05920.N(class008912, class080922, String.valueOf(n));
    }

    public static class06915<class05920> N(class00891 class008912, class08092<Boolean> class080922, boolean bl) {
        return class05920.N(class008912, class080922, String.valueOf(bl));
    }

    public static <T extends Comparable<T>> class06915<class05920> N(class00891 class008912, class08092<T> class080922, String string) {
        class01408 class014082 = class01408.N().N(class080922, string);
        class05196 class051962 = class05196.N((class05957[])new class05957[]{class00851.N((class00891)class008912).N(class014082).build()});
        return class06912.w.N((class06516)new class05920(Optional.empty(), Optional.of(class051962)));
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        this.location.ifPresent(class051962 -> class044922.N(class051962, class06925.s, "location"));
    }

    public static class06915<class05920> N(class00891 class008912) {
        class05196 class051962 = class05196.N((class05957[])new class05957[]{class00851.N((class00891)class008912).build()});
        return class06912.w.N((class06516)new class05920(Optional.empty(), Optional.of(class051962)));
    }

    public static class06915<class05920> N(class00818 class008182, class00837 class008372) {
        return class06912.X.N((class06516)class05920.L(class008182, class008372));
    }
}

