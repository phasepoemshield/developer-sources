/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07323
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class04782;
import minecraft.class05298;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07323;
import minecraft.class07438;

public interface class05293 {
    public static final int u = 10;
    public static final float i = 0.2f;

    public static boolean N(class04782 class047822, class07438 class074382, class07438 class074383) {
        float f = (float)class074382.method_45325(class05298.u);
        float f2 = !class074382.method_6109() && (int)f > 0 ? f / 2.0f + (float)class047822.field_9229.y((int)f) : f;
        class07072 class070722 = class074382.method_48923().y(class074382);
        boolean bl = class074383.method_64397(class047822, class070722, f2);
        if (bl) {
            class07323.N((class04782)class047822, (class07049)class074383, (class07072)class070722);
            if (!class074382.method_6109()) {
                class05293.N(class074382, class074383);
            }
        }
        return bl;
    }

    public static void N(class07438 class074382, class07438 class074383) {
        double d;
        double d2 = class074382.method_45325(class05298.i);
        double d3 = d2 - (d = class074383.method_45325(class05298.b));
        if (d3 <= 0.0) {
            return;
        }
        double d4 = class074383.method_23317() - class074382.method_23317();
        double d5 = class074383.method_23321() - class074382.method_23321();
        float f = class074382.method_73183().field_9229.y(21) - 10;
        double d6 = d3 * (double)(class074382.method_73183().field_9229.z() * 0.5f + 0.2f);
        class06889 class068892 = new class06889(d4, 0.0, d5).u().L(d6).y(f);
        double d7 = d3 * (double)class074382.method_73183().field_9229.z() * 0.5;
        class074383.method_5762(class068892.M, d7, class068892.Z);
        class074383.field_6037 = true;
    }

    public int W();
}

