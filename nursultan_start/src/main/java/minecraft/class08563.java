/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00608
 *  minecraft.class00753
 *  minecraft.class00816
 *  minecraft.class06889
 *  minecraft.class07376
 *  minecraft.class08165
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00608;
import minecraft.class00753;
import minecraft.class00816;
import minecraft.class06889;
import minecraft.class07376;
import minecraft.class08165;
import minecraft.class08568;
import minecraft.class08579;

public final class class08563
extends Record
implements class08568 {
    private final class00816 range;
    public static final MapCodec<class08563> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00816.u.fieldOf("range").forGetter(class08563::y)).apply(instance, class08563::new));

    public class08563(class00816 class008162) {
        this.range = class008162;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08563.class, "range", "range"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08563.class, "range", "range"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08563.class, "range", "range"}, this);
    }

    public class00816 y() {
        return this.range;
    }

    @Override
    public boolean test(class08579 class085792) {
        class08165 class081652 = (class08165)class085792.L().N(class00608.s, class06889.y((class00753)class085792.N()));
        float f = class07376.U[class081652.N()];
        return this.range.u((double)f);
    }

    public MapCodec<class08563> N() {
        return N;
    }
}

