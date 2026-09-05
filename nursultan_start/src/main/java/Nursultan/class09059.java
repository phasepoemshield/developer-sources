/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09719
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11213
 *  minecraft.class00405
 */
package Nursultan;

import Nursultan.class09090;
import Nursultan.class09091;
import Nursultan.class09102;
import Nursultan.class09106;
import Nursultan.class09719;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11213;
import minecraft.class00405;

public class class09059
implements class09102 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
        }
    }

    class09059(class09106 class091062) {
        this.L();
        this.N_4 = class091062;
    }

    public void N(int n, int n2, float f, float f2) {
        this.N_0 = n;
        this.N_1 = n2;
        this.N_2 = Float.valueOf(f);
        this.N_3 = Float.valueOf(f2);
    }

    @Override
    public void N(int n, class00405 class004052, class09091 class090912, float f, float f2) {
        if (((Integer)((class09106)this.N_4).N_7).intValue() != class090912.M()) {
            ((class09106)this.N_4).U();
            ((class09106)this.N_4).N_7 = class090912.M();
        }
        float f3 = ((class09090)((class09106)this.N_4).N_0).y() + (((class09090)((class09106)this.N_4).N_0).R() - ((class09090)((class09106)this.N_4).N_0).N());
        float f4 = ((class09090)((class09106)this.N_4).N_0).u();
        float f5 = f3 + class090912.y() * f;
        float f6 = f4 + (class090912.u() - 7.0f) * f + 1.0f;
        float f7 = (class090912.R() - class090912.y()) * f;
        float f8 = (class090912.Z() - class090912.u()) * f;
        class11176.N((class11213)((class11174)class09106.y_7).u(), (float)f5, (float)f6, (float)f7, (float)f8, (float)class090912.L(), (float)class090912.z(), (float)class090912.N(), (float)class090912.i(), (int)class09106.N(class004052, (Integer)this.N_0));
    }

    @Override
    public void N(int n, class00405 class004052, boolean bl, class09719 class097192, float f) {
        if (!bl) {
            return;
        }
        ((class09106)this.N_4).N(class097192, class09106.N(class004052, (Integer)this.N_0), (Integer)this.N_1, ((Float)this.N_2).floatValue(), ((Float)this.N_3).floatValue());
    }
}

