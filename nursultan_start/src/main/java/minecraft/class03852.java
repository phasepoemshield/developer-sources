/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class01894
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06244
 *  minecraft.class06271
 *  minecraft.class06851
 */
package minecraft;

import minecraft.class01686;
import minecraft.class01894;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06244;
import minecraft.class06271;
import minecraft.class06851;

public class class03852
extends class06271<class06244> {
    public static final class01894 N = class01894.y((String)"textures/entity/trident.png");

    public class03852(class01686 class016862) {
        super(class016862, class06851::u);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("pole", class04822.L().N(0, 6).N(-0.5f, 2.0f, -0.5f, 1.0f, 25.0f, 1.0f), class04838.N);
        class048392.N("base", class04822.L().N(4, 0).N(-1.5f, 0.0f, -0.5f, 3.0f, 2.0f, 1.0f), class04838.N);
        class048392.N("left_spike", class04822.L().N(4, 3).N(-2.5f, -3.0f, -0.5f, 1.0f, 4.0f, 1.0f), class04838.N);
        class048392.N("middle_spike", class04822.L().N(0, 0).N(-0.5f, -4.0f, -0.5f, 1.0f, 4.0f, 1.0f), class04838.N);
        class048392.N("right_spike", class04822.L().N(4, 3).N().N(1.5f, -3.0f, -0.5f, 1.0f, 4.0f, 1.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }
}

