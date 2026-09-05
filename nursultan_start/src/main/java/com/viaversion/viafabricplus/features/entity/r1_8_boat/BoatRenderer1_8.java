/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00275
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06959
 *  minecraft.class07311
 *  minecraft.class08790
 *  minecraft.class08800
 *  org.joml.Quaternionfc
 */
package com.viaversion.viafabricplus.features.entity.r1_8_boat;

import com.viaversion.viafabricplus.features.entity.r1_8_boat.BoatModel1_8;
import minecraft.class00275;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06959;
import minecraft.class07311;
import minecraft.class08790;
import minecraft.class08800;
import org.joml.Quaternionfc;

public final class BoatRenderer1_8
extends class00275 {
    private static final class01894 TEXTURE = class01894.N((String)"viafabricplus", (String)"textures/boat1_8.png");
    private final BoatModel1_8 model;

    public BoatRenderer1_8(class04832 class048322) {
        super(class048322);
        this.field_4673 = 0.5f;
        this.model = new BoatModel1_8(class048322.N(BoatModel1_8.MODEL_LAYER));
    }

    public class07311 method_64520() {
        return this.model.method_23500(TEXTURE);
    }

    public void method_64519(class08790 class087902, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.N(0.0, 0.25, 0.0);
        class014212.N((Quaternionfc)class02058.u.N(180.0f - class087902.N));
        if (class087902.L > 0.0f) {
            class014212.N((Quaternionfc)class02058.y.N(class04995.m((double)class087902.L) * class087902.L * class087902.u / 10.0f * (float)class087902.y));
        }
        class014212.y(-1.0f, -1.0f, 1.0f);
        this.model.setupAnim(class087902);
        class012372.N(this.method_64517(), (Object)class087902, class014212, this.method_64520(), class087902.G, class01384.u, class087902.l, null);
        class014212.y();
    }

    public class06078<class08790> method_64517() {
        return this.model;
    }

    public /* synthetic */ void method_3936(class08800 class088002, class01421 class014212, class01237 class012372, class06959 class069592) {
        this.method_64519((class08790)class088002, class014212, class012372, class069592);
    }

    public /* synthetic */ class08800 method_55269() {
        return super.method_64522();
    }
}

