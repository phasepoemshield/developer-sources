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
 *  Nursultan.class12043
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
import Nursultan.class11257;
import Nursultan.class11993;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;
import Nursultan.class12043;

public class class11224
implements class11192<class11257> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;

    public class11224(class11213 class112132) {
        this.N();
        this.N_2 = ((class09322)class11185.U_0).z("u_projection");
        this.y_0 = ((class09322)class11185.U_0).z("u_view");
        this.y_1 = ((class09322)class11185.U_0).L("texture_in");
        this.y_2 = ((class09322)class11185.U_0).L("u_texture_in");
        this.y_3 = ((class09322)class11185.U_0).R("texel_size");
        this.y_4 = ((class09322)class11185.U_0).N("color");
        this.y_5 = ((class09322)class11185.U_0).y("weights");
        this.N_0 = class112132;
        this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.U_0).N(4).N()).N(class112132).N();
    }

    @Override
    public void execute(class11257 class112572) {
        class11176.N((class11213)this.N_0, 0.0f, 0.0f, 0.0f, (float)class112572.Z(), (float)class112572.i(), -1);
        ((class11174)this.N_1).N(class093222 -> {
            ((class12038)this.N_2).N(class112572.z());
            ((class12038)this.y_0).N(class112572.N());
            ((class12003)this.y_1).N(0);
            ((class12003)this.y_2).N(6);
            ((class11993)this.y_3).N(2.0f / class112572.u(), 2.0f / class112572.y());
            ((class12043)this.y_4).N(class112572.R());
            ((class11170)this.y_5).N(class112572.M());
        });
    }

    private void N() {
    }
}

