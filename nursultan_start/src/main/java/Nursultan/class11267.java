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

public class class11267
implements class11192<class11270> {
    public static Object N_0;
    public static Object N_1;
    public Object y_0;
    public Object y_1;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;

    private static void M() {
        N_0 = 0;
        N_1 = 6;
    }

    public class11267(class11213 class112132) {
        this.y();
        this.L_0 = ((class09322)class11185.u_1).z("u_projection");
        this.L_1 = ((class09322)class11185.u_1).z("u_view");
        this.L_2 = ((class09322)class11185.u_1).z("invProjection");
        this.L_3 = ((class09322)class11185.u_1).z("invView");
        this.L_4 = ((class09322)class11185.u_1).i("dist");
        this.L_5 = ((class09322)class11185.u_1).L("texture_in");
        this.L_6 = ((class09322)class11185.u_1).L("depth_texture_in");
        this.y_0 = class112132;
        this.y_1 = class11174.N().N(class11204.L().N(((class12036)class12019.N_0).L().N()).N((class09322)class11185.u_1).N(4).N()).N(class112132).N();
    }

    static {
        class11267.N();
        class11267.M();
    }

    private void y() {
    }

    @Override
    public void execute(class11270 class112702) {
        class11176.N((class11213)this.y_0, 0.0f, 0.0f, 1.0f, (float)class112702.i(), (float)class112702.z(), class112702.Z());
        ((class11174)this.y_1).N(class093222 -> {
            ((class12038)this.L_0).N(class112702.R());
            ((class12038)this.L_1).N(class112702.M());
            ((class12003)this.L_5).N(0);
            ((class12003)this.L_6).N(6);
            ((class12038)this.L_2).N(class112702.L());
            ((class12038)this.L_3).N(class112702.E());
            ((class11200)this.L_4).N(class112702.u());
        });
    }

    private static void N() {
    }
}

