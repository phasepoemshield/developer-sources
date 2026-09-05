/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class09124
 *  Nursultan.class09170
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11799
 *  Nursultan.class11938
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class09124;
import Nursultan.class09170;
import Nursultan.class11063;
import Nursultan.class11069;
import Nursultan.class11079;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11799;
import Nursultan.class11938;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11087 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public boolean y_init;

    public boolean L() {
        AttackAura attackAura = class11938.u().C();
        return attackAura != null && attackAura.l();
    }

    private static void M() {
        N_0 = null;
    }

    class11087() {
        this.z();
        this.y_0 = new class11063();
        this.y_1 = new class09124();
        this.y_4 = System.currentTimeMillis();
    }

    static {
        class11087.M();
        N_0 = class06202.Nq();
    }

    public int i() {
        return 800;
    }

    private void z() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_2 = Float.valueOf(0.0f);
            this.y_3 = false;
            this.y_4 = 0L;
            this.y_5 = 0;
        }
    }

    public int u() {
        return (Integer)this.y_5;
    }

    public class09124 y() {
        return (class09124)this.y_1;
    }

    public class11499 y(class07438 class074382) {
        class06889 class068892 = class11069.N(class074382, class11505.N(), ((Float)this.y_2).floatValue());
        return class068892 != null ? class09170.N((class06889)class068892) : class11505.N();
    }

    public void N(float f, boolean bl, boolean bl2) {
        this.y_2 = Float.valueOf(f);
        this.y_3 = bl;
    }

    public boolean N(class07438 class074382, class11499 class114992) {
        return class11069.y(class074382, class114992, ((Float)this.y_2).floatValue());
    }

    public float N(class07438 class074382) {
        return ((Float)this.y_2).floatValue();
    }

    public boolean N() {
        if ((class04453)((class06202)class11087.N_0).T_4 == null || (class03443)((class06202)class11087.N_0).T_2 == null) {
            return false;
        }
        AttackAura attackAura = class11938.u().C();
        int n = attackAura != null ? Math.max(1, ((class11079)((Object)attackAura.P().i())).N() - 1) : 9;
        return ((class11799)((class03443)((class06202)class11087.N_0).T_2)).N() >= n;
    }

    public void N(float f) {
        this.y_2 = Float.valueOf(f);
        ((class09124)this.y_1).N();
        this.y_5 = (Integer)this.y_5 + 1;
    }
}

