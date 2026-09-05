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
 *  Nursultan.class11817
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05216
 *  minecraft.class07049
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.EntityESP;
import Nursultan.class09079;
import Nursultan.class09093;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11190;
import Nursultan.class11213;
import Nursultan.class11817;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05216;
import minecraft.class07049;
import org.joml.Vector4f;

public abstract class class11051<T extends class07049>
extends class11817 {
    public Object N_0;

    public class05216 L(T t) {
        return t.method_5476().L();
    }

    private void L() {
    }

    public void L(class01054 class010542, class09093 class090932, Vector4f vector4f, T t) {
    }

    public class11051(EntityESP entityESP, String string, boolean bl) {
        super(string, bl);
        this.L();
        this.N_0 = entityESP;
    }

    public int u(T t) {
        return -1442182646;
    }

    public int y(T t) {
        return -1;
    }

    public void y(class01054 class010542, class09093 class090932, Vector4f vector4f, T t) {
    }

    public void N(class01054 class010542, class09093 class090932, Vector4f vector4f, T t) {
        this.N(class010542, class090932, vector4f, t, this.L(t), this.y(t), this.u(t));
    }

    public void N(class01054 class010542, class09093 class090932, Vector4f vector4f, T t, int n) {
        this.L();
        float f = vector4f.x;
        float f2 = vector4f.y;
        float f3 = vector4f.z - f;
        float f4 = vector4f.w - f2;
        int n2 = -1291187702;
        float f5 = 1.0f;
        class11174 class111742 = (class11174)class11190.y_3;
        class11176.N((class11213)class111742.u(), (float)(f - 1.0f), (float)(f2 - 1.0f), (float)3.0f, (float)(f4 + 2.0f), (int)n2);
        class11176.N((class11213)class111742.u(), (float)(f - 1.0f + f3), (float)(f2 - 1.0f), (float)3.0f, (float)(f4 + 2.0f), (int)n2);
        class11176.N((class11213)class111742.u(), (float)(f + 2.0f), (float)(f2 - 1.0f), (float)(f3 - 3.0f), (float)3.0f, (int)n2);
        class11176.N((class11213)class111742.u(), (float)(f + 2.0f), (float)(f2 - 2.0f + f4), (float)(f3 - 3.0f), (float)3.0f, (int)n2);
        class11176.N((class11213)class111742.u(), (float)f, (float)f2, (float)1.0f, (float)f4, (int)n);
        class11176.N((class11213)class111742.u(), (float)(f + f3), (float)f2, (float)1.0f, (float)f4, (int)n);
        class11176.N((class11213)class111742.u(), (float)(f + 1.0f), (float)f2, (float)(f3 - 1.0f), (float)1.0f, (int)n);
        class11176.N((class11213)class111742.u(), (float)(f + 1.0f), (float)(f2 + f4 - 1.0f), (float)(f3 - 1.0f), (float)1.0f, (int)n);
        float f6 = (((Float)((EntityESP)this.N_0).m().i()).floatValue() - 4.0f) / 4.0f;
        vector4f.y = Math.round(vector4f.y - f6);
    }

    public void N(class01054 class010542, class09093 class090932, Vector4f vector4f, T t, int n, int n2) {
    }

    public void N(class01054 class010542, class09093 class090932, Vector4f vector4f, T t, class05216 class052162, int n, int n2) {
        this.L();
        float f = ((Float)((EntityESP)this.N_0).m().i()).floatValue();
        float f2 = (f - 4.0f) / 4.0f;
        float f3 = class090932.N(f, class09079.REGULAR, false) + f2;
        vector4f.y -= f3;
        float f4 = vector4f.x();
        float f5 = vector4f.y();
        float f6 = vector4f.z();
        float f7 = f4 + (f6 - f4) * 0.5f;
        float f8 = class090932.y((class00392)class052162, f, class09079.REGULAR, false);
        float f9 = f7 - f8 / 2.0f;
        class090932.y((class00392)class052162).N(f9, f5).N(f).y(n2).u(f2).N(class09079.REGULAR).i(n).L();
    }
}

