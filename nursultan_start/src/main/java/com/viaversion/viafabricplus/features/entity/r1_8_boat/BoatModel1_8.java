/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class01686
 *  minecraft.class01894
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06078
 *  minecraft.class08790
 */
package com.viaversion.viafabricplus.features.entity.r1_8_boat;

import minecraft.class01134;
import minecraft.class01686;
import minecraft.class01894;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class08790;

public final class BoatModel1_8
extends class06078<class08790> {
    public static final class01134 MODEL_LAYER = new class01134(class01894.N((String)"viafabricplus", (String)"boat1_8"), "main");

    public BoatModel1_8(class01686 class016862) {
        super(class016862);
    }

    public void setupAnim(class08790 class087902) {
    }

    public /* synthetic */ void method_2819(Object object) {
        this.setupAnim((class08790)object);
    }

    public static class04806 getTexturedModelData() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        float f = 24.0f;
        float f2 = 6.0f;
        float f3 = 20.0f;
        float f4 = 4.0f;
        class048392.N("bottom", class04822.L().N(0, 8).N(-12.0f, -8.0f, -3.0f, 24.0f, 16.0f, 4.0f), class04838.N((float)0.0f, (float)4.0f, (float)0.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class048392.N("back", class04822.L().N(0, 0).N(-10.0f, -7.0f, -1.0f, 20.0f, 6.0f, 2.0f), class04838.N((float)-11.0f, (float)4.0f, (float)0.0f, (float)0.0f, (float)4.712389f, (float)0.0f));
        class048392.N("front", class04822.L().N(0, 0).N(-10.0f, -7.0f, -1.0f, 20.0f, 6.0f, 2.0f), class04838.N((float)11.0f, (float)4.0f, (float)0.0f, (float)0.0f, (float)1.5707964f, (float)0.0f));
        class048392.N("right", class04822.L().N(0, 0).N(-10.0f, -7.0f, -1.0f, 20.0f, 6.0f, 2.0f), class04838.N((float)0.0f, (float)4.0f, (float)-9.0f, (float)0.0f, (float)((float)Math.PI), (float)0.0f));
        class048392.N("left", class04822.L().N(0, 0).N(-10.0f, -7.0f, -1.0f, 20.0f, 6.0f, 2.0f), class04838.N((float)0.0f, (float)4.0f, (float)9.0f));
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }
}

