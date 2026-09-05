/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00250
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07311
 *  minecraft.class08790
 *  minecraft.class08800
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class00250;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07311;
import minecraft.class08790;
import minecraft.class08800;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

public abstract class class00275
extends class04507<class00250, class08790> {
    public class00275(class04832 class048322) {
        super(class048322);
        this.field_4673 = 0.8f;
    }

    protected abstract class07311 method_64520();

    public void method_64519(class08790 class087902, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.N(0.0f, 0.375f, 0.0f);
        class014212.N((Quaternionfc)class02058.u.N(180.0f - class087902.N));
        float f = class087902.L;
        if (f > 0.0f) {
            class014212.N((Quaternionfc)class02058.y.N(class04995.m((double)f) * f * class087902.u / 10.0f * (float)class087902.y));
        }
        if (!class087902.R && !class04995.y((float)class087902.i, (float)0.0f)) {
            class014212.N((Quaternionfc)new Quaternionf().setAngleAxis(class087902.i * ((float)Math.PI / 180), 1.0f, 0.0f, 1.0f));
        }
        class014212.y(-1.0f, -1.0f, 1.0f);
        class014212.N((Quaternionfc)class02058.u.N(90.0f));
        class012372.N(this.method_64517(), (Object)class087902, class014212, this.method_64520(), class087902.G, class01384.u, class087902.l, null);
        this.method_64521(class087902, class014212, class012372, class087902.G);
        class014212.y();
        super.method_3936((class08800)class087902, class014212, class012372, class069592);
    }

    protected abstract class06078<class08790> method_64517();

    public /* synthetic */ void method_3936(class08800 class088002, class01421 class014212, class01237 class012372, class06959 class069592) {
        this.method_64519((class08790)class088002, class014212, class012372, class069592);
    }

    public /* synthetic */ class08800 method_55269() {
        return this.method_64522();
    }

    public void method_62354(class00250 class002502, class08790 class087902, float f) {
        super.method_62354((class07049)class002502, (class08800)class087902, f);
        class087902.N = class002502.method_61415(f);
        class087902.L = (float)class002502.G() - f;
        class087902.y = class002502.l();
        class087902.u = Math.max(class002502.t() - f, 0.0f);
        class087902.i = class002502.N(f);
        class087902.R = class002502.method_5869();
        class087902.M = class002502.N(0, f);
        class087902.B = class002502.N(1, f);
    }

    protected void method_64521(class08790 class087902, class01421 class014212, class01237 class012372, int n) {
    }

    public class08790 method_64522() {
        return new class08790();
    }
}

