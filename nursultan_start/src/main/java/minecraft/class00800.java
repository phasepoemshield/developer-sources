/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02710
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07304
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00836;
import minecraft.class02710;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class07304;

public final class class00800
extends Record {
    private final Optional<class03543<class07304>> enchantments;
    private final class00836 level;
    public static final Codec<class00800> N = RecordCodecBuilder.create(instance -> instance.group((App)class03541.N((class05946)class04227.yR).optionalFieldOf("enchantments").forGetter(class00800::N), (App)class00836.u.optionalFieldOf("levels", (Object)class00836.L).forGetter(class00800::y)).apply(instance, class00800::new));

    public class00800(Optional<class03543<class07304>> optional, class00836 class008362) {
        this.enchantments = optional;
        this.level = class008362;
    }

    public class00800(class03543<class07304> class035432, class00836 class008362) {
        this(Optional.of(class035432), class008362);
    }

    public class00800(class03556<class07304> class035562, class00836 class008362) {
        this(Optional.of(class03543.N((class03556[])new class03556[]{class035562})), class008362);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00800.class, "enchantments;level", "enchantments", "level"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00800.class, "enchantments;level", "enchantments", "level"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00800.class, "enchantments;level", "enchantments", "level"}, this);
    }

    public class00836 y() {
        return this.level;
    }

    private boolean N(class02710 class027102, class03556<class07304> class035562) {
        int n = class027102.N(class035562);
        if (n == 0) {
            return false;
        }
        if (this.level == class00836.L) {
            return true;
        }
        return this.level.u(n);
    }

    public Optional<class03543<class07304>> N() {
        return this.enchantments;
    }

    public boolean N(class02710 class027102) {
        if (this.enchantments.isPresent()) {
            for (class03556 class035562 : this.enchantments.get()) {
                if (!this.N(class027102, (class03556<class07304>)class035562)) continue;
                return true;
            }
            return false;
        }
        if (this.level != class00836.L) {
            for (Object2IntMap.Entry entry : class027102.y()) {
                if (!this.level.u(entry.getIntValue())) continue;
                return true;
            }
            return false;
        }
        return !class027102.u();
    }
}

