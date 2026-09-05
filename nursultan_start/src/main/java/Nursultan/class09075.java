/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09719
 *  minecraft.class00405
 */
package Nursultan;

import Nursultan.class09071;
import Nursultan.class09090;
import Nursultan.class09102;
import Nursultan.class09106;
import Nursultan.class09719;
import minecraft.class00405;

public class class09075
implements class09102 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = 0;
            this.N_4 = Float.valueOf(0.0f);
        }
    }

    class09075(class09106 class091062) {
        this.L();
        this.N_5 = class091062;
    }

    private void u() {
        float f = ((class09090)((class09106)this.N_5).N_0).R() - ((class09090)((class09106)this.N_5).N_0).N();
        if (f <= 0.0f) {
            return;
        }
        float f2 = ((class09071)this.N_0).N(((Float)this.N_1).floatValue());
        float f3 = ((class09090)((class09106)this.N_5).N_0).y() - ((Float)this.N_4).floatValue();
        float f4 = (float)Math.round(((Float)this.N_2).floatValue()) - ((Float)this.N_4).floatValue();
        float f5 = f3 + f + ((Float)this.N_4).floatValue() * 2.0f;
        float f6 = f4 + f2 + ((Float)this.N_4).floatValue() * 2.0f;
        ((class09106)this.N_5).N(f3, f4, f5, f6, (Integer)this.N_3);
    }

    @Override
    public void y() {
        this.u();
    }

    public void N(class09071 class090712, float f, float f2, int n, float f3) {
        this.N_0 = class090712;
        this.N_1 = Float.valueOf(f);
        this.N_2 = Float.valueOf(f2);
        this.N_3 = n;
        this.N_4 = Float.valueOf(f3);
    }

    @Override
    public void N() {
        this.u();
        this.N_2 = Float.valueOf(((Float)this.N_2).floatValue() + ((class09071)this.N_0).N(((Float)this.N_1).floatValue()));
    }

    @Override
    public void N(int n, class00405 class004052, boolean bl, class09719 class097192, float f) {
    }
}

