/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01471
 *  minecraft.class04448
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01471;
import minecraft.class04448;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07209;

public final class class03649
extends Record {
    private final class01471 fallback;
    private final List<class04448> rules;
    public static final Codec<class03649> N = RecordCodecBuilder.create(instance -> instance.group((App)class01471.N.fieldOf("fallback").forGetter(class03649::N), (App)class04448.N.listOf().fieldOf("rules").forGetter(class03649::y)).apply(instance, class03649::new));

    public class03649(class01471 class014712, List<class04448> list) {
        this.fallback = class014712;
        this.rules = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03649.class, "fallback;rules", "fallback", "rules"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03649.class, "fallback;rules", "fallback", "rules"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03649.class, "fallback;rules", "fallback", "rules"}, this);
    }

    public List<class04448> y() {
        return this.rules;
    }

    public static class03649 N(class01471 class014712) {
        return new class03649(class014712, List.of());
    }

    public static class03649 N(class00891 class008912) {
        return class03649.N((class01471)class01471.N((class00891)class008912));
    }

    public class01471 N() {
        return this.fallback;
    }

    public class00500 N(class05974 class059742, class06069 class060692, class07209 class072092) {
        for (class04448 class044482 : this.rules) {
            if (!class044482.N().test((Object)class059742, (Object)class072092)) continue;
            return class044482.y().N(class060692, class072092);
        }
        return this.fallback.N(class060692, class072092);
    }
}

