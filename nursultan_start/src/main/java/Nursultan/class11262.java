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
import Nursultan.class11170;
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

public class class11262
implements class11192<class11270> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;

    public class11262(class11213 class112132, float[] fArray, float f) {
        this.y();
        this.N_5 = ((class09322)class11185.U_3).z("u_projection");
        this.N_6 = ((class09322)class11185.U_3).z("u_view");
        this.y_0 = ((class09322)class11185.U_3).L("texture_in");
        this.y_1 = ((class09322)class11185.U_3).R("texel_size");
        this.y_2 = ((class09322)class11185.U_3).R("direction");
        this.y_3 = ((class09322)class11185.U_3).L("radius");
        this.y_4 = ((class09322)class11185.U_3).y("weights");
        this.N_0 = class112132;
        this.N_2 = Float.valueOf(fArray[0]);
        this.N_3 = Float.valueOf(fArray[1]);
        this.N_4 = Float.valueOf(f);
        this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.U_3).N(4).N()).N(class112132).N();
    }

    static {
        class11262.N();
    }

    private void y() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = Float.valueOf(0.0f);
        }
    }

    private static void N() {
        L_0 = new float[]{1.0f, 0.0f};
        L_1 = new float[]{0.0f, 1.0f};
        L_2 = 0;
    }

    @Override
    public void execute(class11270 class112702) {
        class11176.y((class11213)this.N_0, 0.0f, 0.0f, 0.0f, class112702.i(), class112702.z(), -1);
        ((class11174)this.N_1).N(class093222 -> {
            ((class12038)this.N_5).N(class112702.R());
            ((class12038)this.N_6).N(class112702.M());
            ((class12003)this.y_0).N(0);
            ((class11993)this.y_1).N(((Float)this.N_4).floatValue() / class112702.y(), ((Float)this.N_4).floatValue() / class112702.N());
            ((class11993)this.y_2).N(((Float)this.N_2).floatValue(), ((Float)this.N_3).floatValue());
            ((class12003)this.y_3).N(class112702.U() - 1);
            ((class11170)this.y_4).N(class112702.B());
        });
    }
}

