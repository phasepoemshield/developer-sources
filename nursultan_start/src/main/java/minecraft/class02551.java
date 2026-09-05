/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02525
 *  minecraft.class03556
 *  minecraft.class03689
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02525;
import minecraft.class02546;
import minecraft.class02560;
import minecraft.class03556;
import minecraft.class03689;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;

public final class class02551
extends Record
implements class02560 {
    private final class02546 minDamage;
    private final class02546 maxDamage;
    private final class03556<class03689> damageType;
    public static final MapCodec<class02551> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("min_damage").forGetter(class02551::y), (App)class02546.y.fieldOf("max_damage").forGetter(class02551::L), (App)class03689.y.fieldOf("damage_type").forGetter(class02551::u)).apply(instance, class02551::new));

    public class02546 L() {
        return this.maxDamage;
    }

    public class02551(class02546 class025462, class02546 class025463, class03556<class03689> class035562) {
        this.minDamage = class025462;
        this.maxDamage = class025463;
        this.damageType = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02551.class, "minDamage;maxDamage;damageType", "minDamage", "maxDamage", "damageType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02551.class, "minDamage;maxDamage;damageType", "minDamage", "maxDamage", "damageType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02551.class, "minDamage;maxDamage;damageType", "minDamage", "maxDamage", "damageType"}, this);
    }

    public class03556<class03689> u() {
        return this.damageType;
    }

    public class02546 y() {
        return this.minDamage;
    }

    @Override
    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        float f = class04995.y((class06069)class070492.method_59922(), (float)this.minDamage.N(n), (float)this.maxDamage.N(n));
        class070492.method_64397(class047822, new class07072(this.damageType, (class07049)class025252.L()), f);
    }

    public MapCodec<class02551> N() {
        return N;
    }
}

