/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02484
 *  minecraft.class02566
 *  minecraft.class02827
 *  minecraft.class03448
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02484;
import minecraft.class02566;
import minecraft.class02827;
import minecraft.class03448;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08843;
import org.jspecify.annotations.Nullable;

public final class class08821
extends Record
implements class08843 {
    private final int defaultColor;
    public static final MapCodec<class08821> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.E.fieldOf("default").forGetter(class08821::y)).apply(instance, class08821::new));

    public class08821() {
        this(-7697782);
    }

    public class08821(int n) {
        this.defaultColor = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08821.class, "defaultColor", "defaultColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08821.class, "defaultColor", "defaultColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08821.class, "defaultColor", "defaultColor"}, this);
    }

    public int y() {
        return this.defaultColor;
    }

    public MapCodec<class08821> N() {
        return N;
    }

    @Override
    public int N(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382) {
        class02827 class028272 = (class02827)class065842.method_58694(class02484.Ns);
        IntList intList = class028272 != null ? class028272.y() : IntList.of();
        int n = intList.size();
        if (n == 0) {
            return this.defaultColor;
        }
        if (n == 1) {
            return class02566.M((int)intList.getInt(0));
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < n; ++i) {
            int n5 = intList.getInt(i);
            n2 += class02566.L((int)n5);
            n3 += class02566.u((int)n5);
            n4 += class02566.i((int)n5);
        }
        return class02566.N((int)(n2 / n), (int)(n3 / n), (int)(n4 / n));
    }
}

