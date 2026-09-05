/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02142
 *  minecraft.class02715
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class07052
 *  minecraft.class07304
 *  minecraft.class07317
 *  minecraft.class07323
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;
import minecraft.class02142;
import minecraft.class02530;
import minecraft.class02715;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class07052;
import minecraft.class07304;
import minecraft.class07317;
import minecraft.class07323;

public final class class02515
extends Record
implements class02530 {
    private final class03543<class07304> enchantments;
    private final class02142 cost;
    public static final MapCodec<class02515> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03541.N((class05946)class04227.yR).fieldOf("enchantments").forGetter(class02515::y), (App)class02142.L.fieldOf("cost").forGetter(class02515::L)).apply(instance, class02515::new));

    public class02142 L() {
        return this.cost;
    }

    public class02515(class03543<class07304> class035432, class02142 class021422) {
        this.enchantments = class035432;
        this.cost = class021422;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02515.class, "enchantments;cost", "enchantments", "cost"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02515.class, "enchantments;cost", "enchantments", "cost"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02515.class, "enchantments;cost", "enchantments", "cost"}, this);
    }

    public class03543<class07304> y() {
        return this.enchantments;
    }

    public MapCodec<class02515> N() {
        return y;
    }

    @Override
    public void N(class06584 class065842, class02715 class027152, class06069 class060692, class07052 class070522) {
        for (class07317 class073172 : class07323.y((class06069)class060692, (class06584)class065842, (int)this.cost.N(class060692), (Stream)this.enchantments.N())) {
            class027152.y(class073172.y(), class073172.L());
        }
    }
}

