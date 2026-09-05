/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 *  Nursultan.class11993
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
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11270;
import Nursultan.class11993;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;

public class class11258
implements class11192<class11270> {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;

    public class11258(class11213 class112132) {
        this.y();
        this.y_2 = ((class09322)class11185.L_1).z("u_projection");
        this.y_3 = ((class09322)class11185.L_1).z("u_view");
        this.y_4 = ((class09322)class11185.L_1).L("texture_in");
        this.y_5 = ((class09322)class11185.L_1).R("texel_size");
        this.y_0 = class112132;
        this.y_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.L_1).N(4).N()).N(class112132).N();
    }

    static {
        class11258.N();
    }

    private void y() {
    }

    @Override
    public void execute(class11270 class112702) {
        class11176.y((class11213)this.y_0, 0.0f, 0.0f, 0.0f, class112702.i(), class112702.z(), -1);
        ((class11174)this.y_1).N(class093222 -> {
            ((class12038)this.y_2).N(class112702.R());
            ((class12038)this.y_3).N(class112702.M());
            ((class12003)this.y_4).N(0);
            ((class11993)this.y_5).N((float)class112702.U() * (2.0f / class112702.y()), (float)class112702.U() * (2.0f / class112702.N()));
        });
    }

    private static void N() {
        N_0 = 0;
    }
}

