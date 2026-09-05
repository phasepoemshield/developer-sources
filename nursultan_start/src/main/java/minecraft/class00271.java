/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08790
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08790;

public abstract class class00271
extends class06078<class08790> {
    private final class01686 N;
    private final class01686 y;

    public class00271(class01686 class016862) {
        super(class016862);
        this.N = class016862.y("left_paddle");
        this.y = class016862.y("right_paddle");
    }

    private static void N(float f, int n, class01686 class016862) {
        class016862.i = class04995.y((float)((class04995.m((double)(-f)) + 1.0f) / 2.0f), (float)-1.0471976f, (float)-0.2617994f);
        class016862.R = class04995.y((float)((class04995.m((double)(-f + 1.0f)) + 1.0f) / 2.0f), (float)-0.7853982f, (float)0.7853982f);
        if (n == 1) {
            class016862.R = (float)Math.PI - class016862.R;
        }
    }

    public void method_2819(class08790 class087902) {
        super.method_2819((Object)class087902);
        class00271.N(class087902.M, 0, this.N);
        class00271.N(class087902.B, 1, this.y);
    }
}

