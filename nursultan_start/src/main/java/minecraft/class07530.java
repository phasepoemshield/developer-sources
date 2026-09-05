/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06889
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07150
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07952
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07962
 *  minecraft.class07976
 *  minecraft.class07989
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06889;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07150;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07565;
import minecraft.class07952;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07976;
import minecraft.class07989;
import minecraft.class08036;

public class class07530
extends class07150 {
    private float N = 0.5f;
    private int y;
    private static final class02131<Byte> L = class03289.N(class07530.class, (class04383)class02154.N);

    public static class05300 M() {
        return class07150.Y().N(class05298.u, 6.0).N(class05298.l, (double)0.23f).N(class05298.P, 48.0);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(L, (Object)0);
    }

    public boolean method_5809() {
        return this.B();
    }

    public float method_5718() {
        return 1.0f;
    }

    public class07530(class07078<? extends class07530> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_18, -1.0f);
        this.N(class04425.field_14, 8.0f);
        this.N(class04425.field_9, 0.0f);
        this.N(class04425.field_3, 0.0f);
        this.J = 10;
    }

    private boolean B() {
        return ((Byte)this.field_6011.N(L) & 1) != 0;
    }

    protected class04891 s() {
        return class04909.Lj;
    }

    void N(boolean bl) {
        byte by = (Byte)this.field_6011.N(L);
        by = bl ? (byte)(by | 1) : (byte)(by & 0xFFFFFFFE);
        this.field_6011.N(L, (Object)by);
    }

    protected void N(class04782 class047822) {
        class07438 class074382;
        --this.y;
        if (this.y <= 0) {
            this.y = 100;
            this.N = (float)this.field_5974.N(0.5, 6.891);
        }
        if ((class074382 = this.T()) != null && class074382.method_23320() > this.method_23320() + (double)this.N && this.method_18395(class074382)) {
            class06889 class068892 = this.method_18798();
            this.method_18799(this.method_18798().y(0.0, ((double)0.3f - class068892.B) * (double)0.3f, 0.0));
            this.field_64356 = true;
        }
        super.N(class047822);
    }

    protected void l_() {
        this.e.N(4, new class07565(this));
        this.e.N(5, (class07473)new class07976((class07475)((Object)this), 1.0));
        this.e.N(7, (class07473)new class07957((class07475)((Object)this), 1.0, 0.0f));
        this.e.N(8, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(8, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class07989((class07475)((Object)this), new Class[0]).N(new Class[0]));
        this.H.N(2, (class07473)new class07952((class07079)this, class08036.class, true));
    }

    public class04891 method_6002() {
        return class04909.Ln;
    }

    public void method_6007() {
        if (!this.method_24828() && this.method_18798().B < 0.0) {
            this.method_18799(this.method_18798().u(1.0, 0.6, 1.0));
        }
        if (this.method_73183().method_8608()) {
            if (this.field_5974.y(24) == 0 && !this.method_5701()) {
                this.method_73183().method_8486(this.method_23317() + 0.5, this.method_23318() + 0.5, this.method_23321() + 0.5, class04909.Lv, this.method_5634(), 1.0f + this.field_5974.z(), this.field_5974.z() * 0.7f + 0.3f, false);
            }
            for (int i = 0; i < 2; ++i) {
                this.method_73183().method_8406((class07126)class07107.Ny, this.method_23322(0.5), this.method_23319(), this.method_23325(0.5), 0.0, 0.0, 0.0);
            }
        }
        super.method_6007();
    }

    public boolean method_29503() {
        return true;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Lt;
    }
}

