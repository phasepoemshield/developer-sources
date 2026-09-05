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

public class class11425
implements class11192<class09317> {
    public Object N_0;
    public Object N_1;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public Object y_7;

    public class11425(SkyCustomization skyCustomization, class11213 class112132) {
        this.R();
        this.y_1 = new Matrix4f();
        this.y_2 = ((class09322)class11185.M_0).z("u_projection");
        this.y_3 = ((class09322)class11185.M_0).z("u_view");
        this.y_4 = ((class09322)class11185.M_0).z("inv_view_proj");
        this.y_5 = ((class09322)class11185.M_0).N("aurora_a");
        this.y_6 = ((class09322)class11185.M_0).N("aurora_b");
        this.y_7 = ((class09322)class11185.M_0).N("params");
        this.N_0 = skyCustomization;
        this.N_1 = class112132;
        this.y_0 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.M_0).N(4).N()).N(class112132).N();
    }

    static {
        class11425.N();
    }

    private static void N() {
    }

    public void execute(class09317 class093172) {
        int n = ((SkyCustomization)this.N_0).b().G();
        int n2 = ((SkyCustomization)this.N_0).b().u();
        ((Matrix4f)this.y_1).setOrtho(0.0f, (float)n, (float)n2, 0.0f, -1.0f, 1000.0f);
        class11176.N((class11213)((class11213)this.N_1), (float)0.0f, (float)0.0f, (float)0.0f, (float)n, (float)n2, (int)-1);
        float f = ((SkyCustomization)this.N_0).N(class093172.L().N(true));
        ((class11174)this.y_0).N(class093222 -> {
            ((class12038)this.y_2).N((Matrix4f)this.y_1);
            ((class12038)this.y_3).N((Matrix4f)class11925.y_3);
            ((class12038)this.y_4).N(class093172.y());
            ((class12043)this.y_5).N(((Integer)((SkyCustomization)this.N_0).n().i()).intValue());
            ((class12043)this.y_6).N(((Integer)((SkyCustomization)this.N_0).t().i()).intValue());
            ((class12043)this.y_7).N(f, ((Float)((SkyCustomization)this.N_0).m().i()).floatValue(), ((Float)((SkyCustomization)this.N_0).T().i()).floatValue(), ((Float)((SkyCustomization)this.N_0).P().i()).floatValue());
        });
    }

    private void R() {
    }
}

