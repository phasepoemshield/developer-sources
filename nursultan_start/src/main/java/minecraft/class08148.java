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

public final class class08148
extends Record
implements class02560 {
    private final class06889 direction;
    private final class06889 coordinateScale;
    private final class02546 magnitude;
    public static final MapCodec<class08148> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06889.N.fieldOf("direction").forGetter(class08148::y), (App)class06889.N.fieldOf("coordinate_scale").forGetter(class08148::L), (App)class02546.y.fieldOf("magnitude").forGetter(class08148::u)).apply(instance, class08148::new));
    private static final int M = 10;

    public class06889 L() {
        return this.coordinateScale;
    }

    public class08148(class06889 class068892, class06889 class068893, class02546 class025462) {
        this.direction = class068892;
        this.coordinateScale = class068893;
        this.magnitude = class025462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08148.class, "direction;coordinateScale;magnitude", "direction", "coordinateScale", "magnitude"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08148.class, "direction;coordinateScale;magnitude", "direction", "coordinateScale", "magnitude"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08148.class, "direction;coordinateScale;magnitude", "direction", "coordinateScale", "magnitude"}, this);
    }

    public class02546 u() {
        return this.magnitude;
    }

    public class06889 y() {
        return this.direction;
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        class06889 class068893 = class070492.method_5720().z(this.direction).B(this.coordinateScale).L((double)this.magnitude.N(n));
        class070492.method_45319(class068893);
        class070492.field_6037 = true;
        class070492.field_64356 = true;
        if (class070492 instanceof class08036) {
            ((class08036)class070492).method_76731(10);
        }
    }

    public MapCodec<class08148> N() {
        return N;
    }
}

