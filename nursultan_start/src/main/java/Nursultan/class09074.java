/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09719
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class05194
 */
package Nursultan;

import Nursultan.class09061;
import Nursultan.class09071;
import Nursultan.class09084;
import Nursultan.class09090;
import Nursultan.class09102;
import Nursultan.class09719;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05194;

public class class09074
implements class09102 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;

    public class09074() {
        this.B();
        this.N_0 = new class09084();
        this.N_1 = new class09090();
    }

    private void B() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_4 = 0;
            this.N_5 = false;
        }
    }

    public boolean N(class09071 class090712, float f, float f2, String string, float f3, float f4, int n, class09061 class090612) {
        this.N_2 = class090712;
        this.N_3 = class090612;
        this.N_4 = n;
        this.N_5 = true;
        ((class09090)this.N_1).N(class090712, f, f2, string, f3, f4, (class09102)this);
        return (Boolean)this.N_5;
    }

    @Override
    public void N(int n, class00405 class004052, boolean bl, class09719 class097192, float f) {
        if (!bl) {
            this.N_5 = false;
            return;
        }
        this.N(class097192, n, class09074.N(class004052, (Integer)this.N_4));
    }

    public boolean N(class09071 class090712, float f, float f2, class01028 class010282, float f3, float f4, int n, class09061 class090612) {
        this.N_2 = class090712;
        this.N_3 = class090612;
        this.N_4 = n;
        this.N_5 = true;
        ((class09090)this.N_1).N(class090712, f, f2, class010282, f3, f4, (class09102)this);
        return (Boolean)this.N_5;
    }

    private void N(class09719 class097192, int n, int n2) {
        int n3 = ((class09071)this.N_2).u();
        int n4 = ((class09071)this.N_2).M();
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        float f = ((class09090)this.N_1).y() + (((class09090)this.N_1).R() - ((class09090)this.N_1).N());
        float f2 = ((class09090)this.N_1).u();
        float f3 = f + class097192.N;
        float f4 = f + class097192.L;
        float f5 = f2 - class097192.u;
        float f6 = f2 - class097192.y;
        float f7 = 1.0f / ((class09090)this.N_1).L();
        float f8 = f3 * f7;
        float f9 = f5 * f7;
        float f10 = f4 * f7;
        float f11 = f6 * f7;
        float f12 = class097192.i;
        float f13 = class097192.B;
        float f14 = class097192.M;
        float f15 = class097192.R;
        ((class09084)this.N_0).N(f8, f9, f10, f11, f12, f13, f14, f15, ((class09071)this.N_2).y(), n3, n4, n, n2, class097192.Z * f7, ((class09090)this.N_1).R(), ((class09090)this.N_1).M(), ((class09090)this.N_1).y(), ((class09090)this.N_1).u(), ((class09071)this.N_2).L());
        ((class09061)this.N_3).accept((class09084)this.N_0);
    }

    private static int N(class00405 class004052, int n) {
        if (class004052 == null) {
            return n;
        }
        class05194 class051942 = class004052.N();
        if (class051942 == null) {
            return n;
        }
        return n & 0xFF000000 | class051942.N() & 0xFFFFFF;
    }
}

