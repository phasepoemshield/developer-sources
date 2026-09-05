/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02320;
import minecraft.class02339;
import minecraft.class06069;

final class class02351
extends Record
implements class02339 {
    private final int bonusMultiplier;
    public static final Codec<class02351> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("bonusMultiplier").forGetter(class02351::y)).apply(instance, class02351::new));
    public static final class02320 y = new class02320(class01894.y((String)"uniform_bonus_count"), N);

    class02351(int n) {
        this.bonusMultiplier = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02351.class, "bonusMultiplier", "bonusMultiplier"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02351.class, "bonusMultiplier", "bonusMultiplier"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02351.class, "bonusMultiplier", "bonusMultiplier"}, this);
    }

    public int y() {
        return this.bonusMultiplier;
    }

    @Override
    public class02320 N() {
        return y;
    }

    @Override
    public int N(class06069 class060692, int n, int n2) {
        return n + class060692.y(this.bonusMultiplier * n2 + 1);
    }
}

