/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00429
 *  minecraft.class00457
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class06715
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07209
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import minecraft.class00429;
import minecraft.class00457;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01383;
import minecraft.class01634;
import minecraft.class01857;
import minecraft.class06715;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07209;

public class class01648
implements class01857 {
    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class01634 class016342;
        class07209 class072093;
        int n3 = class00429.P.L();
        double d4 = 1.0 / (double)(n3 * 2);
        HashMap hashMap = new HashMap();
        class004572.N(class00429.P, (class072092, n, n2) -> {
            long l = n2 - n;
            class01634 class016342 = hashMap.getOrDefault(class072092, class01634.L);
            hashMap.put(class072092, class016342.N((int)l));
        });
        for (Map.Entry entry : hashMap.entrySet()) {
            class072093 = (class07209)entry.getKey();
            class016342 = (class01634)((Object)entry.getValue());
            class06724.N((class00734)new class00734(class072093).M(0.002).B(d4 * (double)class016342.y()), (class06747)class06747.N((int)-1));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            class072093 = (class07209)entry.getKey();
            class016342 = (class01634)((Object)entry.getValue());
            class06724.N((String)String.valueOf(class016342.N()), (class06889)class06889.y((class00753)class072093), (class06715)class06715.N());
        }
    }
}

