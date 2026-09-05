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
 *  minecraft.class02530
 *  minecraft.class02715
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class07052
 *  minecraft.class07304
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02142;
import minecraft.class02530;
import minecraft.class02715;
import minecraft.class03556;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class07052;
import minecraft.class07304;

public final class class02555
extends Record
implements class02530 {
    private final class03556<class07304> enchantment;
    private final class02142 level;
    public static final MapCodec<class02555> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07304.L.fieldOf("enchantment").forGetter(class02555::y), (App)class02142.L.fieldOf("level").forGetter(class02555::L)).apply(instance, class02555::new));

    public class02142 L() {
        return this.level;
    }

    public class02555(class03556<class07304> class035562, class02142 class021422) {
        this.enchantment = class035562;
        this.level = class021422;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02555.class, "enchantment;level", "enchantment", "level"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02555.class, "enchantment;level", "enchantment", "level"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02555.class, "enchantment;level", "enchantment", "level"}, this);
    }

    public class03556<class07304> y() {
        return this.enchantment;
    }

    public MapCodec<class02555> N() {
        return y;
    }

    public void N(class06584 class065842, class02715 class027152, class06069 class060692, class07052 class070522) {
        class027152.y(this.enchantment, class04995.N((int)this.level.N(class060692), (int)((class07304)this.enchantment.N()).u(), (int)((class07304)this.enchantment.N()).i()));
    }
}

