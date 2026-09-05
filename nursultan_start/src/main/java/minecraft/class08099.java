/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00810
 *  minecraft.class00829
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02013
 *  minecraft.class02055
 *  minecraft.class03367
 *  minecraft.class03798
 *  minecraft.class04111
 *  minecraft.class04227
 *  minecraft.class04559
 *  minecraft.class04711
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05441
 *  minecraft.class05919
 *  minecraft.class05946
 *  minecraft.class05952
 *  minecraft.class06273
 *  minecraft.class06378
 *  minecraft.class06570
 *  minecraft.class07078
 *  minecraft.class07310
 *  minecraft.class07700
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import minecraft.class00810;
import minecraft.class00829;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02013;
import minecraft.class02055;
import minecraft.class03367;
import minecraft.class03798;
import minecraft.class04111;
import minecraft.class04227;
import minecraft.class04559;
import minecraft.class04711;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05441;
import minecraft.class05919;
import minecraft.class05946;
import minecraft.class05952;
import minecraft.class06273;
import minecraft.class06378;
import minecraft.class06570;
import minecraft.class07078;
import minecraft.class07310;
import minecraft.class07700;
import minecraft.class08114;

public final class class08099
extends Record
implements class02013 {
    private final class01929 registries;
    private static final List<class08114> y = List.of(new class08114((class05946<class05074>)class06273.yi, class07078.Nr, class06570.GO), new class08114((class05946<class05074>)class06273.yR, class07078.q, class06570.GY), new class08114((class05946<class05074>)class06273.yM, class07078.ym, class06570.Gl), new class08114((class05946<class05074>)class06273.yB, class07078.yA, class06570.Gd), new class08114((class05946<class05074>)class06273.yZ, class07078.yx, class06570.Gk));

    public class08099(class01929 class019292) {
        this.registries = class019292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08099.class, "registries", "registries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08099.class, "registries", "registries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08099.class, "registries", "registries"}, this);
    }

    public class01929 N() {
        return this.registries;
    }

    public void method_10399(BiConsumer<class05946<class05074>, class05062> biConsumer) {
        class01921 class019212 = this.registries.y(class04227.I);
        ArrayList<class04111> arrayList = new ArrayList<class04111>(y.size());
        for (class08114 class081142 : y) {
            biConsumer.accept(class081142.N(), class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class081142.L()))));
            class05952 class059522 = class07700.N((class05919)class05919.field_935, (class00810)class00810.N().N(class00829.N((class02055)class019212, class081142.y())));
            arrayList.add(class03367.N(class081142.N()).y(class059522));
        }
        biConsumer.accept((class05946<class05074>)class06273.yu, class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class04559.N((class04111[])((class04111[])arrayList.toArray(class04111[]::new))))));
    }
}

