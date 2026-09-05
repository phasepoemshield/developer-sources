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
import Nursultan.class11257;
import Nursultan.class11993;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;

public class class11248
implements class11192<class11257> {
    private static String[] Z;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
        }
    }

    public class11248(class11213 class112132, int n) {
        this.L();
        this.N_3 = ((class09322)class11185.L_4).z(Z[0]);
        this.N_4 = ((class09322)class11185.L_4).z(Z[1]);
        this.N_5 = ((class09322)class11185.L_4).L(Z[2]);
        this.N_6 = ((class09322)class11185.L_4).R(Z[3]);
        this.N_0 = class112132;
        this.N_1 = n;
        this.N_2 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.L_4).N(4).N()).N(class112132).N();
    }

    static {
        class11248.N();
        class11248.y();
    }

    private static void y() {
        Z = new String[4];
        class11248.Z[0] = "u_projection";
        class11248.Z[1] = "u_view";
        class11248.Z[2] = "textureIn";
        class11248.Z[3] = "texelSize";
    }

    private static void N() {
    }

    @Override
    public void execute(class11257 class112572) {
        class11176.N((class11213)this.N_0, 0.0f, 0.0f, 0.0f, (float)class112572.Z(), (float)class112572.i(), -1);
        ((class11174)this.N_2).N(class093222 -> {
            ((class12038)this.N_3).N(class112572.z());
            ((class12038)this.N_4).N(class112572.N());
            ((class12003)this.N_5).N(0);
            ((class11993)this.N_6).N((float)((Integer)this.N_1).intValue() / class112572.u(), (float)((Integer)this.N_1).intValue() / class112572.y());
        });
    }
}

