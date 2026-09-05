/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.SkyCustomization
 *  Nursultan.class09317
 *  Nursultan.class09322
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11192
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11925
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  Nursultan.class12043
 *  org.joml.Matrix4f
 */
package Nursultan;

import Nursultan.SkyCustomization;
import Nursultan.class09317;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11192;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11925;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;
import Nursultan.class12043;
import org.joml.Matrix4f;

public class class11430
implements class11192<class09317> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;

    public class11430(SkyCustomization skyCustomization, class11213 class112132) {
        this.u();
        this.y_3 = new Matrix4f();
        this.N_0 = ((class09322)class11185.i_0).z("u_projection");
        this.N_1 = ((class09322)class11185.i_0).z("u_view");
        this.N_2 = ((class09322)class11185.i_0).z("inv_view_proj");
        this.N_3 = ((class09322)class11185.i_0).N("aurora_a");
        this.N_4 = ((class09322)class11185.i_0).N("aurora_b");
        this.N_5 = ((class09322)class11185.i_0).N("params");
        this.y_0 = skyCustomization;
        this.y_1 = class112132;
        this.y_2 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.i_0).N(4).N()).N(class112132).N();
    }

    static {
        class11430.N();
    }

    private void u() {
    }

    public void execute(class09317 class093172) {
        int n = ((SkyCustomization)this.y_0).v().G();
        int n2 = ((SkyCustomization)this.y_0).v().u();
        ((Matrix4f)this.y_3).setOrtho(0.0f, (float)n, (float)n2, 0.0f, -1.0f, 1000.0f);
        class11176.N((class11213)((class11213)this.y_1), (float)0.0f, (float)0.0f, (float)0.0f, (float)n, (float)n2, (int)-1);
        float f = ((SkyCustomization)this.y_0).N(class093172.L().N(true));
        ((class11174)this.y_2).N(class093222 -> {
            ((class12038)this.N_0).N((Matrix4f)this.y_3);
            ((class12038)this.N_1).N((Matrix4f)class11925.y_3);
            ((class12038)this.N_2).N(class093172.y());
            ((class12043)this.N_3).N(((Integer)((SkyCustomization)this.y_0).n().i()).intValue());
            ((class12043)this.N_4).N(((Integer)((SkyCustomization)this.y_0).t().i()).intValue());
            ((class12043)this.N_5).N(f, 0.0f, 0.0f, 0.0f);
        });
    }

    private static void N() {
    }
}

