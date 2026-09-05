/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntSortedMap
 *  minecraft.class01905
 *  minecraft.class01929
 *  minecraft.class02755
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class04227
 *  minecraft.class06581
 *  minecraft.class07310
 */
package Nursultan;

import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import minecraft.class01905;
import minecraft.class01929;
import minecraft.class02755;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class04227;
import minecraft.class06581;
import minecraft.class07310;

public class class09882 {
    private final class01905<class06581> N;
    private final class03767 y;
    private final Object2IntSortedMap<class06581> L = new Object2IntLinkedOpenHashMap();

    public class09882(class01929 class019292, class03767 class037672) {
        this.N = class019292.y(class04227.F);
        this.y = class037672;
    }

    public class09882 N(class07310 class073102, int n) {
        class06581 class065812 = class073102.B();
        this.N(n, class065812);
        return this;
    }

    private void N(int n, class06581 class065812) {
        if (class065812.N(this.y)) {
            this.L.put((Object)class065812, n);
        }
    }

    public class09882 N(class03530<class06581> class035302, int n) {
        this.N.N(class035302).ifPresent(class035522 -> {
            for (class03556 class035562 : class035522) {
                this.N(n, (class06581)class035562.N());
            }
        });
        return this;
    }

    public class09882 N(class03530<class06581> class035302) {
        this.L.keySet().removeIf(class065812 -> class065812.i().N(class035302));
        return this;
    }

    public class02755 N() {
        return new class02755(this.L);
    }
}

