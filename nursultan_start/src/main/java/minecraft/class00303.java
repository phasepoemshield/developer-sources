/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class06338
 *  minecraft.class06889
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class06338;
import minecraft.class06889;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;

public final class class00303
extends Record
implements class07126 {
    private final class06889 target;
    private final int color;
    private final int duration;
    public static final MapCodec<class00303> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06889.N.fieldOf("target").forGetter(class00303::N), (App)class06338.E.fieldOf("color").forGetter(class00303::y), (App)class06338.b.fieldOf("duration").forGetter(class00303::L)).apply(instance, class00303::new));
    public static final class02362<class04247, class00303> y = class02362.N((class02362)class06889.y, class00303::N, (class02362)class02389.M, class00303::y, (class02362)class02389.B, class00303::L, class00303::new);

    public int L() {
        return this.duration;
    }

    public class00303(class06889 class068892, int n, int n2) {
        this.target = class068892;
        this.color = n;
        this.duration = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00303.class, "target;color;duration", "target", "color", "duration"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00303.class, "target;color;duration", "target", "color", "duration"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00303.class, "target;color;duration", "target", "color", "duration"}, this);
    }

    public int y() {
        return this.color;
    }

    public class06889 N() {
        return this.target;
    }

    public class07103<class00303> method_10295() {
        return class07107.D;
    }
}

