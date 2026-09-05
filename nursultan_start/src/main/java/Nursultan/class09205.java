/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09057
 *  Nursultan.class09063
 *  Nursultan.class09087
 *  Nursultan.class09322
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package Nursultan;

import Nursultan.class09057;
import Nursultan.class09063;
import Nursultan.class09087;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class12019;
import Nursultan.class12036;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class09205 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public static Object y_0;
    public static Object y_1;

    public class09205() {
        this.u();
        this.N_0 = class11213.N((class09087)((class09087)class09063.N_2), (int)256, (int)6);
        this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.Z_1).N(4).N()).N((class11213)this.N_0).N();
        this.N_2 = new Matrix4f();
        this.N_3 = new Matrix4f();
        this.N_4 = new Matrix4f();
    }

    static {
        class09205.N();
    }

    private void u() {
    }

    public void N(class09057 class090572, int n, int n2, float f, float f2, float f3, float f4, float f5, float f6) {
        if (class090572 == null || n <= 0 || n2 <= 0) {
            return;
        }
        float f7 = Math.clamp((float)f3, (float)0.0f, (float)1.0f);
        if (f7 <= 0.0f) {
            return;
        }
        this.N(n2, f, f2, f7, f4, f5, f6);
        ((Matrix4f)this.N_2).setOrtho(0.0f, (float)n, (float)n2, 0.0f, -10000.0f, 10000.0f);
        int n3 = Math.round(f7 * 255.0f);
        int n4 = n3 << 24 | n3 << 16 | n3 << 8 | n3;
        class11176.N((class11213)((class11213)this.N_0), (float)0.0f, (float)0.0f, (float)n, (float)n2, (float)0.0f, (float)1.0f, (float)1.0f, (float)0.0f, (int)n4);
        ((class11174)this.N_1).N(class093222 -> {
            class093222.z("u_projection").N((Matrix4f)this.N_2);
            class093222.z("u_view").N((Matrix4f)this.N_3);
            class093222.M("texture_in").N(class090572);
        });
    }

    private void N(int n, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = (f4 + f5) * 0.5f;
        float f8 = f7 + (1.0f - f7) * f3;
        float f9 = (1.0f - f6) * (float)Math.PI;
        float f10 = (1.0f - f3) * f9;
        float f11 = (float)n * 2.5f;
        ((Matrix4f)this.N_4).identity().m23(-1.0f / f11);
        ((Matrix4f)this.N_3).identity().translate(f, f2, 0.0f).mul((Matrix4fc)((Matrix4f)this.N_4)).rotateX(f10).scale(f8, f8, 1.0f).translate(-f, -f2, 0.0f);
    }

    private static void N() {
        y_0 = Float.valueOf(2.5f);
        y_1 = Float.valueOf(10000.0f);
    }
}

