/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.EntityESP
 *  Nursultan.class09079
 *  Nursultan.class09093
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11190
 *  Nursultan.class11213
 *  Nursultan.class11300
 *  Nursultan.class11517
 *  Nursultan.class11535
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class02834
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class07043
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07438
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.EntityESP;
import Nursultan.class09079;
import Nursultan.class09093;
import Nursultan.class11007;
import Nursultan.class11051;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11190;
import Nursultan.class11213;
import Nursultan.class11300;
import Nursultan.class11517;
import Nursultan.class11535;
import Nursultan.class11925;
import Nursultan.class11938;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class02834;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07043;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07438;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class class11045<T extends class07438>
extends class11051<T> {
    public class11045(EntityESP entityESP, String string, boolean bl) {
        super(entityESP, string, bl);
    }

    @Override
    public void y(class01054 class010542, class09093 class090932, Vector4f vector4f, T t) {
        float f = ((Float)((EntityESP)this.N_0).m().i()).floatValue();
        float f2 = (f - 4.0f) / 4.0f;
        float f3 = class090932.N(f, class09079.REGULAR, false) + f2 * 2.0f;
        float f4 = vector4f.x() + (vector4f.z() - vector4f.x()) * 0.5f;
        float f5 = vector4f.w() + f2 + 1.0f;
        for (class06584 class065842 : new class06584[]{t.method_6047(), t.method_6079()}) {
            if (class065842.R()) continue;
            class05216 class052162 = this.N(class065842);
            float f6 = class090932.y((class00392)class052162, f, class09079.REGULAR, false);
            class090932.y((class00392)class052162).N(f4 - f6 / 2.0f, f5).N(f).y(this.u(t)).u(f2).N(class09079.REGULAR).i(this.y(t)).L();
            f5 += f3;
        }
        vector4f.w = f5;
    }

    @Override
    public class05216 L(T t) {
        return super.L(t).i(" ").i(String.valueOf(class06541.field_1080) + "[" + String.valueOf(class06541.field_1061) + Math.round(t.method_6032()) + String.valueOf(class06541.field_1080) + "]");
    }

    @Override
    public void N(class01054 class010542, class09093 class090932, Vector4f vector4f, T t, int n, int n2) {
        float f = vector4f.x;
        float f2 = vector4f.y;
        float f3 = vector4f.w - f2;
        int n3 = -1291187702;
        float f4 = t.method_6032();
        float f5 = class04995.N((float)(f4 / Math.max(t.method_6063(), f4)), (float)0.0f, (float)1.0f);
        float f6 = f5 * f3;
        int n4 = class11300.N((int)n2, (int)n, (float)f5);
        class11174 class111742 = (class11174)class11190.y_3;
        class11176.N((class11213)class111742.u(), (float)(f - 5.0f), (float)(f2 - 1.0f), (float)3.0f, (float)(f3 + 2.0f), (int)n3);
        class11176.N((class11213)class111742.u(), (Matrix4f)((Matrix4f)class11925.y_3), (float)(f - 4.0f), (float)(f2 + f3 - f6), (float)1.0f, (float)f6, (int)n4, (int)n2);
        if (!((class11535)((EntityESP)this.N_0).L_2).U()) {
            vector4f.y = Math.round(vector4f.y - 4.0f);
        }
    }

    private class05216 N(class06584 class065842) {
        class05216 class052162 = class065842.d().L();
        if (class065842.c() <= 1) {
            return class052162;
        }
        return class052162.i(String.valueOf(class06541.field_1080) + " x" + class065842.c());
    }

    @Override
    public void L(class01054 class010542, class09093 class090932, Vector4f vector4f, T t) {
        int n = (Integer)((class11007)((Object)((class11517)((EntityESP)this.N_0).B_2).i())).N_0;
        int n2 = 0;
        boolean bl = false;
        for (class02834 class028342 : new class02834[]{class02834.field_49224, class02834.field_49219}) {
            for (class07085 class070852 : class028342.N()) {
                class06584 class065842;
                if (class070852.N() != class07043.field_6178 && class070852.N() != class07043.field_6177 || (class065842 = t.method_6118(class070852)).R()) continue;
                n2 += 16 * n;
                bl = true;
            }
        }
        if (!bl) {
            return;
        }
        float f = vector4f.x();
        float f2 = vector4f.y();
        float f3 = vector4f.z();
        float f4 = f + (f3 - f) * 0.5f;
        float f5 = Math.round(f4 - (float)n2 / 2.0f);
        float f6 = ((Float)((EntityESP)this.N_0).m().i()).floatValue();
        float f7 = (f6 - 4.0f) / 4.0f;
        int n3 = 20 * n;
        float f8 = Math.round(f2 - f7 - (float)(n3 - 4));
        class11176.N((class11213)((class11174)class11190.y_3).u(), (float)(f5 - 2.0f), (float)(f8 - 1.0f), (float)(n2 + 4), (float)(n3 - 3), (int)this.u(t));
        n2 = 0;
        class02834[] class02834Array = new class02834[]{class02834.field_49224, class02834.field_49219};
        int n4 = class02834Array.length;
        for (int i = 0; i < n4; ++i) {
            for (class07085 class070853 : class02834Array[i].N()) {
                class06584 class065843;
                if (class070853.N() != class07043.field_6178 && class070853.N() != class07043.field_6177 || (class065843 = t.method_6118(class070853)).R()) continue;
                class11938.k().N(class065843, f5 + (float)n2, f8, (float)(16 * n));
                n2 += 16 * n;
            }
        }
    }

    public boolean test(class07049 class070492) {
        return class070492 instanceof class07438;
    }
}

