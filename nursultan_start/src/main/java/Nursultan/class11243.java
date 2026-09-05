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
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11257;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;

public class class11243
implements class11192<class11257> {
    private static String[] R;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;

    public class11243(class11213 class112132) {
        this.R();
        this.N_2 = ((class09322)class11185.L_3).z(R[0]);
        this.N_3 = ((class09322)class11185.L_3).z(R[1]);
        this.N_4 = ((class09322)class11185.L_3).L(R[2]);
        this.N_0 = class112132;
        this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.L_3).N(4).N()).N(class112132).N();
    }

    static {
        class11243.N();
        class11243.u();
    }

    private static void u() {
        R = new String[3];
        class11243.R[0] = "u_projection";
        class11243.R[1] = "u_view";
        class11243.R[2] = "textureIn";
    }

    @Override
    public void execute(class11257 class112572) {
        class11176.N((class11213)this.N_0, 0.0f, 0.0f, 0.0f, (float)class112572.Z(), (float)class112572.i(), -1);
        ((class11174)this.N_1).N(class093222 -> {
            ((class12038)this.N_2).N(class112572.z());
            ((class12038)this.N_3).N(class112572.N());
            ((class12003)this.N_4).N(0);
        });
    }

    private static void N() {
    }

    private void R() {
    }
}

