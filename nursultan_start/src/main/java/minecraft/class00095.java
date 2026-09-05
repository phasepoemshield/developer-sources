/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02566
 *  minecraft.class04995
 *  minecraft.class06563
 */
package minecraft;

import minecraft.class00111;
import minecraft.class02566;
import minecraft.class04995;
import minecraft.class06563;

public class class00095 {
    public static final class06563[] N = new class06563[]{class06563.field_7952, class06563.field_7967, class06563.field_7951, class06563.field_7966, class06563.field_7955, class06563.field_7942, class06563.field_7961, class06563.field_7947, class06563.field_7946, class06563.field_7954, class06563.field_7964, class06563.field_7958};

    public static int N(class00111 class001112, float f) {
        int n = class04995.y((float)f);
        int n2 = n / class001112.field_60689;
        int n3 = class001112.field_60691.length;
        int n4 = n2 % n3;
        int n5 = (n2 + 1) % n3;
        float f2 = ((float)(n % class001112.field_60689) + class04995.M((float)f)) / (float)class001112.field_60689;
        int n6 = class001112.N(class001112.field_60691[n4]);
        int n7 = class001112.N(class001112.field_60691[n5]);
        return class02566.N((float)f2, (int)n6, (int)n7);
    }

    static int N(class06563 class065632, float f) {
        if (class065632 == class06563.field_7952) {
            return -1644826;
        }
        int n = class065632.L();
        return class02566.y((int)255, (int)class04995.y((float)((float)class02566.L((int)n) * f)), (int)class04995.y((float)((float)class02566.u((int)n) * f)), (int)class04995.y((float)((float)class02566.i((int)n) * f)));
    }
}

