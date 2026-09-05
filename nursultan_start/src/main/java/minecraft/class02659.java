/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02013
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02702
 *  minecraft.class03247
 *  minecraft.class03254
 *  minecraft.class03270
 *  minecraft.class03367
 *  minecraft.class03556
 *  minecraft.class03798
 *  minecraft.class04111
 *  minecraft.class04227
 *  minecraft.class04711
 *  minecraft.class04829
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05441
 *  minecraft.class05946
 *  minecraft.class06273
 *  minecraft.class06378
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class07304
 *  minecraft.class07310
 *  minecraft.class07314
 *  minecraft.class07657
 *  minecraft.class08137
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02013;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02702;
import minecraft.class03247;
import minecraft.class03254;
import minecraft.class03270;
import minecraft.class03367;
import minecraft.class03556;
import minecraft.class03798;
import minecraft.class04111;
import minecraft.class04227;
import minecraft.class04711;
import minecraft.class04829;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05441;
import minecraft.class05946;
import minecraft.class06273;
import minecraft.class06378;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class07304;
import minecraft.class07310;
import minecraft.class07314;
import minecraft.class07657;
import minecraft.class08137;

public final class class02659
extends Record
implements class02013 {
    private final class01929 registries;

    public class02659(class01929 class019292) {
        this.registries = class019292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02659.class, "registries", "registries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02659.class, "registries", "registries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02659.class, "registries", "registries"}, this);
    }

    public class01929 N() {
        return this.registries;
    }

    public static class05062 N(class06581 class065812, class06581 class065813, class03254 class032542, class01921<class07304> class019212) {
        return class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).y(class07657.N((float)0.5f)).N((class04111)class03798.N((class07310)class065812).N((class08137)class02702.N((class02477)class02484.Nu, (Object)class032542)).N((class08137)new class04829().N((class03556)class019212.y(class07314.N), (class06378)class04711.N((float)4.0f)).N((class03556)class019212.y(class07314.i), (class06378)class04711.N((float)4.0f)).N((class03556)class019212.y(class07314.y), (class06378)class04711.N((float)4.0f))))).N(class05441.N().N((class06378)class04711.N((float)1.0f)).y(class07657.N((float)0.5f)).N((class04111)class03798.N((class07310)class065813).N((class08137)class02702.N((class02477)class02484.Nu, (Object)class032542)).N((class08137)new class04829().N((class03556)class019212.y(class07314.N), (class06378)class04711.N((float)4.0f)).N((class03556)class019212.y(class07314.i), (class06378)class04711.N((float)4.0f)).N((class03556)class019212.y(class07314.y), (class06378)class04711.N((float)4.0f)))));
    }

    public void method_10399(BiConsumer<class05946<class05074>, class05062> biConsumer) {
        class01921 class019212 = this.registries.y(class04227.yk);
        class01921 class019213 = this.registries.y(class04227.yw);
        class01921 class019214 = this.registries.y(class04227.yR);
        class03254 class032542 = new class03254((class03556)class019213.y(class03270.i), (class03556)class019212.y(class03247.T));
        class03254 class032543 = new class03254((class03556)class019213.y(class03270.i), (class03556)class019212.y(class03247.b));
        biConsumer.accept((class05946<class05074>)class06273.NZ, class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03367.N((class05074)class02659.N(class06570.bW, class06570.bm, class032543, (class01921<class07304>)class019214).L()).N(4)).N((class04111)class03367.N((class05074)class02659.N(class06570.bT, class06570.bb, class032542, (class01921<class07304>)class019214).L()).N(2)).N((class04111)class03367.N((class05074)class02659.N(class06570.bn, class06570.bt, class032542, (class01921<class07304>)class019214).L()).N(1))));
        biConsumer.accept((class05946<class05074>)class06273.NU, class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03367.N((class05946)class06273.NZ))).N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class06570.To).N(4)).N((class04111)class03798.N((class07310)class06570.To).N((class08137)new class04829().N((class03556)class019214.y(class07314.m), (class06378)class04711.N((float)1.0f)))).N((class04111)class03798.N((class07310)class06570.To).N((class08137)new class04829().N((class03556)class019214.y(class07314.T), (class06378)class04711.N((float)1.0f)))).N((class04111)class03798.N((class07310)class06570.TH))));
        biConsumer.accept((class05946<class05074>)class06273.Nz, class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03367.N((class05946)class06273.NZ))).N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class06570.sx).N(2)).N((class04111)class03798.N((class07310)class06570.sx).N((class08137)new class04829().N((class03556)class019214.y(class07314.d), (class06378)class04711.N((float)1.0f)))).N((class04111)class03798.N((class07310)class06570.sx).N((class08137)new class04829().N((class03556)class019214.y(class07314.w), (class06378)class04711.N((float)1.0f))))));
    }
}

