/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
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
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04995;
import minecraft.class06271;
import minecraft.class06851;

public class class08842
extends class06271<Float> {
    private final class01686 N;

    public class08842(class01686 class016862) {
        super(class016862, class06851::u);
        this.N = class016862.y("flag");
    }

    public void method_2819(Float f) {
        super.method_2819((Object)f);
        this.N.i = (-0.0125f + 0.01f * class04995.P((double)((float)Math.PI * 2 * f.floatValue()))) * (float)Math.PI;
    }

    public static class04806 N(boolean bl) {
        class04792 class047922 = new class04792();
        class047922.N().N("flag", class04822.L().N(0, 0).N(-10.0f, 0.0f, -2.0f, 20.0f, 40.0f, 1.0f), class04838.N((float)0.0f, (float)(bl ? -44.0f : -20.5f), (float)(bl ? 0.0f : 10.5f)));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }
}

