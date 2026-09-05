/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09057;
import Nursultan.class09060;
import Nursultan.class09086;
import Nursultan.class09096;

public class class09083 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;

    class09083(int n, int n2, class09096 class090962, class09057 class090572, class09057 class090573) {
        this.R();
        this.N_7 = System.currentTimeMillis();
        this.N_0 = n;
        this.N_1 = n2;
        this.N_2 = class090962;
        this.N_3 = class090572;
        this.N_4 = class090573;
    }

    public class09086 y() {
        if ((class09086)this.N_5 == null) {
            this.N_5 = class09060.N().N((class09057)this.N_3, (class09057)this.N_4, ((class09096)((Object)this.N_2)).N());
        }
        return (class09086)this.N_5;
    }

    public void N() {
        if ((class09086)this.N_5 != null) {
            ((class09086)this.N_5).y();
            this.N_5 = null;
        }
        if ((class09057)this.N_3 != null) {
            ((class09057)this.N_3).L();
            this.N_3 = null;
        }
        if ((class09057)this.N_4 != null) {
            ((class09057)this.N_4).L();
            this.N_4 = null;
        }
    }

    boolean N(long l, long l2, boolean bl) {
        return (class09057)this.N_3 != null && ((class09057)this.N_3).y() && (Boolean)this.N_6 == false && !bl && l - (Long)this.N_7 > l2;
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_6 = false;
            this.N_7 = 0L;
        }
    }
}

