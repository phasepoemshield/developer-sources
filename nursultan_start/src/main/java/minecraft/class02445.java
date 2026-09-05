/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02413
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04995
 *  minecraft.class06271
 *  minecraft.class06851
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02413;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04995;
import minecraft.class06271;
import minecraft.class06851;

public class class02445
extends class06271<class02413> {
    private static final String N = "bell_body";
    private final class01686 y;

    public class02445(class01686 class016862) {
        super(class016862, class06851::u);
        this.y = class016862.y(N);
    }

    public void method_2819(class02413 class024132) {
        super.method_2819((Object)class024132);
        float f = 0.0f;
        float f2 = 0.0f;
        if (class024132.y() != null) {
            float f3 = class04995.m((double)(class024132.N() / (float)Math.PI)) / (4.0f + class024132.N() / 3.0f);
            switch (class024132.y()) {
                case field_11043: {
                    f = -f3;
                    break;
                }
                case field_11035: {
                    f = f3;
                    break;
                }
                case field_11034: {
                    f2 = -f3;
                    break;
                }
                case field_11039: {
                    f2 = f3;
                }
            }
        }
        this.y.i = f;
        this.y.M = f2;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class047922.N().N(N, class04822.L().N(0, 0).N(-3.0f, -6.0f, -3.0f, 6.0f, 7.0f, 6.0f), class04838.N((float)8.0f, (float)12.0f, (float)8.0f)).N("bell_base", class04822.L().N(0, 13).N(4.0f, 4.0f, 4.0f, 8.0f, 2.0f, 8.0f), class04838.N((float)-8.0f, (float)-12.0f, (float)-8.0f));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }
}

