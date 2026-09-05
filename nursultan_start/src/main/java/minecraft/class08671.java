/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01127
 *  minecraft.class01138
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01540
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class03386
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class08649
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01127;
import minecraft.class01138;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01540;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class03386;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class08649;
import minecraft.class08672;
import org.joml.Quaternionfc;

public class class08671
extends class08672<class08649> {
    public class08671(class01422 class014222) {
        super(class014222);
    }

    @Override
    protected String y() {
        return "book model";
    }

    @Override
    protected float N(int n, int n2) {
        return 17 * n2;
    }

    @Override
    protected void N(class08649 class086492, class01421 class014212) {
        ((class03386)class06202.Nq().i_5).v().N(class01540.field_60028);
        class014212.N((Quaternionfc)class02058.u.N(180.0f));
        class014212.N((Quaternionfc)class02058.y.N(25.0f));
        float f = class086492.u();
        class014212.N((1.0f - f) * 0.2f, (1.0f - f) * 0.1f, (1.0f - f) * 0.25f);
        class014212.N((Quaternionfc)class02058.u.N(-(1.0f - f) * 90.0f - 90.0f));
        class014212.N((Quaternionfc)class02058.y.N(180.0f));
        float f2 = class086492.z();
        float f3 = class04995.N((float)(class04995.M((float)(f2 + 0.25f)) * 1.6f - 0.3f), (float)0.0f, (float)1.0f);
        float f4 = class04995.N((float)(class04995.M((float)(f2 + 0.75f)) * 1.6f - 0.3f), (float)0.0f, (float)1.0f);
        class01127 class011272 = class086492.y();
        class011272.method_2819(new class01138(0.0f, f3, f4, f));
        class01894 class018942 = class086492.L();
        class01391 class013912 = this.N.method_73477(class011272.method_23500(class018942));
        class011272.method_60879(class014212, class013912, 0xF000F0, class01384.u);
    }

    @Override
    public Class<class08649> N() {
        return class08649.class;
    }
}

