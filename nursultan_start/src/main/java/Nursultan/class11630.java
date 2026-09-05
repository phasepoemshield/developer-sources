/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09221
 *  Nursultan.class09778
 *  Nursultan.class09798
 *  Nursultan.class09870
 *  Nursultan.class09991
 *  minecraft.class00405
 *  minecraft.class05194
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09221;
import Nursultan.class09778;
import Nursultan.class09798;
import Nursultan.class09870;
import Nursultan.class09991;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00405;
import minecraft.class05194;

public class class11630 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;

    private class09991 L() {
        class09079 class090792 = (Boolean)this.N_6 != false && ((class09079)this.N_3).N() < class09079.BOLD.N() ? class09079.BOLD : (class09079)this.N_3;
        class09870 class098702 = (Boolean)this.N_7 != false ? class09870.ITALIC : class09870.NORMAL;
        return class09221.N((int)((Integer)this.N_2), (class09079)class090792, (class09870)class098702).i(((Integer)this.N_5).intValue());
    }

    private void M() {
        if (((StringBuilder)this.N_1).length() == 0) {
            return;
        }
        ((List)this.N_0).add(class09778.N((String)((StringBuilder)this.N_1).toString(), (class09991)this.L()));
        ((StringBuilder)this.N_1).setLength(0);
    }

    public class11630(int n, class09079 class090792, int n2) {
        this.i();
        this.N_0 = new ArrayList();
        this.N_1 = new StringBuilder();
        this.N_2 = n;
        this.N_3 = class090792;
        this.N_4 = n2;
        this.N_5 = n2;
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0;
            this.N_4 = 0;
            this.N_5 = 0;
            this.N_6 = false;
            this.N_7 = false;
        }
    }

    private void y(class00405 class004052) {
        boolean bl;
        int n = this.N(class004052);
        boolean bl2 = class004052 != null && class004052.L();
        boolean bl3 = bl = class004052 != null && class004052.u();
        if (((StringBuilder)this.N_1).length() > 0 && (n != (Integer)this.N_5 || bl2 != (Boolean)this.N_6 || bl != (Boolean)this.N_7)) {
            this.M();
        }
        this.N_5 = n;
        this.N_6 = bl2;
        this.N_7 = bl;
    }

    public void N(class00405 class004052, int n) {
        this.y(class004052);
        ((StringBuilder)this.N_1).appendCodePoint(n);
    }

    public List<class09798> N() {
        this.M();
        return (List)this.N_0;
    }

    private int N(class00405 class004052) {
        class05194 class051942;
        class05194 class051943 = class051942 = class004052 == null ? null : class004052.N();
        if (class051942 == null) {
            return (Integer)this.N_4;
        }
        return (Integer)this.N_4 & 0xFF000000 | class051942.N() & 0xFFFFFF;
    }

    public void N(class00405 class004052, String string) {
        if (string.isEmpty()) {
            return;
        }
        this.y(class004052);
        ((StringBuilder)this.N_1).append(string);
    }
}

