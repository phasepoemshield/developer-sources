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
 *  minecraft.class02546
 *  minecraft.class02560
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class08036
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
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08036;

public final class class06825
extends Record
implements class02560 {
    private final class02546 amount;
    public static final MapCodec<class06825> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("amount").forGetter(class06825::y)).apply(instance, class06825::new));

    public class06825(class02546 class025462) {
        this.amount = class025462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06825.class, "amount", "amount"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06825.class, "amount", "amount"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06825.class, "amount", "amount"}, this);
    }

    public class02546 y() {
        return this.amount;
    }

    public MapCodec<class06825> N() {
        return N;
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        if (class070492 instanceof class08036) {
            ((class08036)class070492).method_7322(this.amount.N(n));
        }
    }
}

