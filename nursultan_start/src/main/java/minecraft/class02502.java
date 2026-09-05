/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00159
 *  minecraft.class00810
 *  minecraft.class01929
 *  minecraft.class01995
 *  minecraft.class02013
 *  minecraft.class03367
 *  minecraft.class03798
 *  minecraft.class04111
 *  minecraft.class04559
 *  minecraft.class04711
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05441
 *  minecraft.class05919
 *  minecraft.class05946
 *  minecraft.class06273
 *  minecraft.class06345
 *  minecraft.class06378
 *  minecraft.class06570
 *  minecraft.class07310
 *  minecraft.class07621
 *  minecraft.class07631
 *  minecraft.class07700
 *  minecraft.class08137
 *  minecraft.class08272
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.BiConsumer;
import minecraft.class00159;
import minecraft.class00810;
import minecraft.class01929;
import minecraft.class01995;
import minecraft.class02013;
import minecraft.class02471;
import minecraft.class02484;
import minecraft.class03367;
import minecraft.class03798;
import minecraft.class04111;
import minecraft.class04559;
import minecraft.class04711;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05441;
import minecraft.class05919;
import minecraft.class05946;
import minecraft.class06273;
import minecraft.class06345;
import minecraft.class06378;
import minecraft.class06570;
import minecraft.class07310;
import minecraft.class07621;
import minecraft.class07631;
import minecraft.class07700;
import minecraft.class08137;
import minecraft.class08272;

public final class class02502
extends Record
implements class02013 {
    private final class01929 registries;

    public class02502(class01929 class019292) {
        this.registries = class019292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02502.class, "registries", "registries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02502.class, "registries", "registries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02502.class, "registries", "registries"}, this);
    }

    public class01929 N() {
        return this.registries;
    }

    public void method_10399(BiConsumer<class05946<class05074>, class05062> biConsumer) {
        biConsumer.accept((class05946<class05074>)class06273.Nx, class05074.y().N(class05441.N().N((class06378)class04711.N((float)2.0f)).N((class04111)class03798.N((class07310)class06570.uc).N((class08137)class07621.N((class06378)class04711.N((float)1.0f)))).N((class04111)class03798.N((class07310)class06570.uX).N((class08137)class07621.N((class06378)class04711.N((float)1.0f))))));
        class08272.N.forEach((class065632, class073102) -> biConsumer.accept((class05946)class06273.yL.get(class065632), class05074.y().N(class05441.N().N((class06378)class06345.N((float)1.0f, (float)3.0f)).N((class04111)class03798.N((class07310)class073102)))));
        biConsumer.accept((class05946<class05074>)class06273.yy, class05074.y().N(class01995.method_46031((Map)class06273.yL)));
        biConsumer.accept((class05946<class05074>)class06273.ND, class05074.y().N(class05441.N().N((class04111)class04559.N((class04111[])new class04111[]{class03367.N((class05946)class06273.Nh).y(class07700.N((class05919)class05919.field_935, (class00810)class00810.N().N(class00159.N().N(class02471.N(class02484.NH, class07631.field_18109)).y()))), class03367.N((class05946)class06273.Nr).y(class07700.N((class05919)class05919.field_935, (class00810)class00810.N().N(class00159.N().N(class02471.N(class02484.NH, class07631.field_18110)).y())))}))));
        biConsumer.accept((class05946<class05074>)class06273.Nh, class05074.y().N(class05441.N().N((class06378)class04711.N((float)5.0f)).N((class04111)class03798.N((class07310)class06570.uX))));
        biConsumer.accept((class05946<class05074>)class06273.Nr, class05074.y().N(class05441.N().N((class06378)class04711.N((float)5.0f)).N((class04111)class03798.N((class07310)class06570.uc))));
        biConsumer.accept((class05946<class05074>)class06273.yN, class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class06570.Rf))));
    }
}

