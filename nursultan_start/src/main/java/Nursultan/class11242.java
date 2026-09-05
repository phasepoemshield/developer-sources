/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 *  Nursultan.class12003
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  Nursultan.class12038
 */
package Nursultan;

import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11192;
import Nursultan.class11200;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11270;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;

public class class11242
implements class11192<class11270> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public static Object y_0;
    public static Object y_1;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;

    public class11242(class11213 class112132) {
        this.u();
        this.N_2 = ((class09322)class11185.L_0).z("u_projection");
        this.N_3 = ((class09322)class11185.L_0).z("u_view");
        this.N_4 = ((class09322)class11185.L_0).z("invProjection");
        this.L_0 = ((class09322)class11185.L_0).z("invView");
        this.L_1 = ((class09322)class11185.L_0).i("dist");
        this.L_2 = ((class09322)class11185.L_0).L("texture_in");
        this.L_3 = ((class09322)class11185.L_0).L("depth_texture_in");
        this.N_0 = class112132;
        this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.L_0).N(4).N()).N(class112132).N();
    }

    static {
        class11242.N();
        class11242.R();
    }

    private void u() {
    }

    @Override
    public void execute(class11270 class112702) {
        class11176.y((class11213)this.N_0, 0.0f, 0.0f, 0.0f, class112702.i(), class112702.z(), -1);
        ((class11174)this.N_1).N(class093222 -> {
            ((class12038)this.N_2).N(class112702.R());
            ((class12038)this.N_3).N(class112702.M());
            ((class12003)this.L_2).N(0);
            ((class12003)this.L_3).N(6);
            ((class12038)this.N_4).N(class112702.L());
            ((class12038)this.L_0).N(class112702.E());
            ((class11200)this.L_1).N(class112702.u());
        });
    }

    private static void N() {
    }

    private static void R() {
        y_0 = 0;
        y_1 = 6;
    }
}

