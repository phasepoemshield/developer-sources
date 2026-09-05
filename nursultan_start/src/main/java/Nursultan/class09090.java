/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09719
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class05197
 */
package Nursultan;

import Nursultan.class09071;
import Nursultan.class09091;
import Nursultan.class09094;
import Nursultan.class09102;
import Nursultan.class09103;
import Nursultan.class09719;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05197;

public class class09090 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public boolean L_init;

    public float L() {
        return ((Float)this.N_4).floatValue();
    }

    public float M() {
        return ((Float)this.y_0).floatValue();
    }

    public class09090() {
        this.z();
        this.N_0 = new class09094(this);
        this.N_1 = new class09719();
    }

    private void B() {
        if ((Integer)this.y_5 != -1) {
            this.L_2 = Float.valueOf(((Float)this.L_2).floatValue() + (float)Math.round(((Float)this.y_6).floatValue()));
            this.y_6 = Float.valueOf(0.0f);
        }
    }

    public float i() {
        return ((Float)this.y_3).floatValue();
    }

    private void z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = Float.valueOf(0.0f);
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = Float.valueOf(0.0f);
            this.L_2 = Float.valueOf(0.0f);
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_1 = Float.valueOf(0.0f);
            this.y_2 = Float.valueOf(0.0f);
            this.y_3 = Float.valueOf(0.0f);
            this.y_4 = Float.valueOf(0.0f);
            this.y_5 = 0;
            this.y_6 = Float.valueOf(0.0f);
        }
    }

    public float u() {
        return ((Float)this.y_2).floatValue();
    }

    public float y() {
        return ((Float)this.y_1).floatValue();
    }

    public void N(class09071 class090712, float f, float f2, String string, float f3, float f4, class09102 class091022) {
        int n;
        this.N(class090712, f, f2, f3, f4, class091022);
        for (int i = 0; i < string.length(); i += Character.charCount(n)) {
            n = string.codePointAt(i);
            this.N(null, n);
        }
        this.B();
        class091022.y();
        this.W();
    }

    void N(class00405 class004052, int n) {
        switch (n) {
            case 10: {
                this.B();
                ((class09102)this.L_0).N();
                this.L_2 = Float.valueOf(((Float)this.L_1).floatValue());
                this.y_0 = Float.valueOf(((Float)this.y_0).floatValue() + ((Float)this.y_3).floatValue());
                this.y_2 = Float.valueOf(Math.round(((Float)this.y_0).floatValue()));
                this.y_5 = -1;
                return;
            }
            case 9: {
                this.L_2 = Float.valueOf(((Float)this.L_2).floatValue() + (float)Math.round(((Float)this.y_6).floatValue() + ((Float)this.y_4).floatValue()));
                this.y_5 = -1;
                this.y_6 = Float.valueOf(0.0f);
                return;
            }
            case 13: {
                this.y_5 = -1;
                this.y_6 = Float.valueOf(0.0f);
                return;
            }
        }
        if ((Integer)this.y_5 != -1) {
            float f = ((class09071)this.N_2).N((int)((Integer)this.y_5), n, ((Float)this.N_3).floatValue());
            this.L_2 = Float.valueOf(((Float)this.L_2).floatValue() + (float)Math.round(((Float)this.y_6).floatValue() + f));
        }
        if (class09103.N(class004052) || class09103.N(n) || !((class09071)this.N_2).y(n)) {
            class09091 class090912 = class09103.N(n, class004052);
            float f = 0.0f;
            if (class090912 != null) {
                float f2 = ((Float)this.y_3).floatValue() / 9.0f;
                f = class090912.B() * f2;
                ((class09102)this.L_0).N(n, class004052, class090912, f2, f);
            }
            this.y_6 = Float.valueOf(f);
            this.y_5 = n;
            return;
        }
        boolean bl = ((class09071)this.N_2).N(n, ((Float)this.N_3).floatValue(), (class09719)this.N_1);
        float f = ((class09071)this.N_2).N(n, ((Float)this.N_3).floatValue());
        ((class09102)this.L_0).N(n, class004052, bl, (class09719)this.N_1, f);
        this.y_6 = Float.valueOf(f);
        this.y_5 = n;
    }

    public void N(class09071 class090712, float f, float f2, class01028 class010282, float f3, float f4, class09102 class091022) {
        this.N(class090712, f, f2, f3, f4, class091022);
        class010282.accept((class05197)((class09094)this.N_0));
        this.B();
        class091022.y();
        this.W();
    }

    public float N() {
        return ((Float)this.L_1).floatValue();
    }

    private void N(class09071 class090712, float f, float f2, float f3, float f4, class09102 class091022) {
        this.N_2 = class090712;
        this.N_3 = Float.valueOf(f);
        this.N_4 = Float.valueOf(f2 > 0.0f ? f2 : 1.0f);
        this.L_0 = class091022;
        this.L_1 = Float.valueOf(f3 * ((Float)this.N_4).floatValue());
        this.L_2 = Float.valueOf(((Float)this.L_1).floatValue());
        this.y_0 = Float.valueOf(f4 * ((Float)this.N_4).floatValue() + class090712.y(f));
        this.y_1 = Float.valueOf(Math.round(((Float)this.L_1).floatValue()));
        this.y_2 = Float.valueOf(Math.round(((Float)this.y_0).floatValue()));
        this.y_3 = Float.valueOf(class090712.N(f));
        this.y_4 = Float.valueOf(class090712.N(32, f) * 4.0f);
        this.y_5 = -1;
        this.y_6 = Float.valueOf(0.0f);
    }

    private void W() {
        this.N_2 = null;
        this.L_0 = null;
    }

    public float R() {
        return ((Float)this.L_2).floatValue();
    }
}

