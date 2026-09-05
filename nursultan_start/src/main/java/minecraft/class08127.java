/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00851
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01408
 *  minecraft.class01929
 *  minecraft.class02013
 *  minecraft.class03798
 *  minecraft.class04111
 *  minecraft.class04711
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05253
 *  minecraft.class05441
 *  minecraft.class05946
 *  minecraft.class05952
 *  minecraft.class06273
 *  minecraft.class06345
 *  minecraft.class06378
 *  minecraft.class06570
 *  minecraft.class07310
 *  minecraft.class07621
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import minecraft.class00851;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01408;
import minecraft.class01929;
import minecraft.class02013;
import minecraft.class03798;
import minecraft.class04111;
import minecraft.class04711;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05253;
import minecraft.class05441;
import minecraft.class05946;
import minecraft.class05952;
import minecraft.class06273;
import minecraft.class06345;
import minecraft.class06378;
import minecraft.class06570;
import minecraft.class07310;
import minecraft.class07621;
import minecraft.class08092;
import minecraft.class08137;

public final class class08127
extends Record
implements class02013 {
    private final class01929 registries;

    public class08127(class01929 class019292) {
        this.registries = class019292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08127.class, "registries", "registries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08127.class, "registries", "registries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08127.class, "registries", "registries"}, this);
    }

    public class01929 N() {
        return this.registries;
    }

    public void method_10399(BiConsumer<class05946<class05074>, class05062> biConsumer) {
        biConsumer.accept((class05946<class05074>)class06273.Nc, class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class06570.wR).N((class08137)class07621.N((class06378)class04711.N((float)3.0f))))));
        biConsumer.accept((class05946<class05074>)class06273.Ne, class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class06570.wy))));
        biConsumer.accept((class05946<class05074>)class06273.NH, class05074.y().N(class05441.N().N(class03798.N((class07310)class06570.wN).N((class08137)class07621.N((class06378)class04711.N((float)1.0f))).y((class05952)class00851.N((class00891)class00869.sM).N(class01408.N().N((class08092)class05253.L, 3))))).N(class05441.N().N((class04111)class03798.N((class07310)class06570.wN).N((class08137)class07621.N((class06378)class06345.N((float)1.0f, (float)2.0f))))));
        biConsumer.accept((class05946<class05074>)class06273.NX, class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class06570.nL).N((class08137)class07621.N((class06378)class04711.N((float)4.0f))))));
    }
}

