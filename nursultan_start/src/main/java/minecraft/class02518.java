/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02546
 *  minecraft.class02560
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02484;
import minecraft.class02525;
import minecraft.class02546;
import minecraft.class02560;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public final class class02518
extends Record
implements class02560 {
    private final class02546 amount;
    public static final MapCodec<class02518> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("amount").forGetter(class025182 -> class025182.amount)).apply(instance, class02518::new));

    public class02518(class02546 class025462) {
        this.amount = class025462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02518.class, "amount", "amount"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02518.class, "amount", "amount"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02518.class, "amount", "amount"}, this);
    }

    public class02546 y() {
        return this.amount;
    }

    public MapCodec<class02518> N() {
        return N;
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        class06584 class065842 = class025252.N();
        if (class065842.L(class02484.u) && class065842.L(class02484.i)) {
            class04770 class047702;
            class07438 class074382 = class025252.L();
            class04770 class047703 = class074382 instanceof class04770 ? (class047702 = (class04770)class074382) : null;
            int n2 = (int)this.amount.N(n);
            class065842.N(n2, class047822, class047703, class025252.u());
        }
    }
}

