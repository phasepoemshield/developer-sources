/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10718
 *  Nursultan.class10724
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03811
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07446
 *  minecraft.class07464
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07623
 *  minecraft.class07625
 *  minecraft.class07651
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07962
 *  minecraft.class07982
 *  minecraft.class07989
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10718;
import Nursultan.class10724;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03811;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07146;
import minecraft.class07150;
import minecraft.class07154;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07446;
import minecraft.class07464;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07623;
import minecraft.class07625;
import minecraft.class07651;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07982;
import minecraft.class07989;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07141
extends class07150 {
    private static final class02131<Byte> N = class03289.N(class07141.class, (class04383)class02154.N);
    private static final float y = 0.1f;

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)0);
    }

    public void method_5773() {
        super.method_5773();
        if (!this.method_73183().method_8608()) {
            this.N(this.field_5976);
        }
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.QM, 0.15f, 1.0f);
    }

    public class06889 method_55668(class07049 class070492) {
        if (class070492.method_17681() <= this.method_17681()) {
            return new class06889(0.0, 0.3125 * (double)this.method_55693(), 0.0);
        }
        return super.method_55668(class070492);
    }

    public void method_5844(class00500 class005002, class06889 class068892) {
        if (!class005002.N(class00869.yw)) {
            super.method_5844(class005002, class068892);
        }
    }

    public class07141(class07078<? extends class07141> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public static class05300 B() {
        return class07150.Y().N(class05298.n, 16.0).N(class05298.l, (double)0.3f);
    }

    protected class04891 s() {
        return class04909.Qu;
    }

    public boolean E() {
        return ((Byte)this.field_6011.N(N) & 1) != 0;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class07146 class071462;
        class074462 = super.N(class010012, class070522, class061132, class074462);
        class06069 class060692 = class010012.method_8409();
        if (class060692.y(100) == 0 && (class071462 = (class07146)class07078.ym.N(this.method_73183(), class06113.field_16460)) != null) {
            class071462.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0f);
            class071462.N(class010012, class070522, class061132, null);
            class071462.method_5873((class07049)this, false, false);
        }
        if (class074462 == null) {
            class074462 = new class10724();
            if (class010012.y() == class07086.field_5807 && class060692.z() < 0.1f * class070522.u()) {
                ((class10724)class074462).N(class060692);
            }
        }
        if (class074462 instanceof class10724) {
            class071462 = (class10724)class074462;
            class03556 var7 = ((class10724)class071462).N;
            if (var7 != null) {
                this.method_6092(new class07055(var7, -1));
            }
        }
        return class074462;
    }

    protected class07623 N(class07299 class072992) {
        return new class07651((class07079)this, class072992);
    }

    public void N(boolean bl) {
        byte by = (Byte)this.field_6011.N(N);
        by = bl ? (byte)(by | 1) : (byte)(by & 0xFFFFFFFE);
        this.field_6011.N(N, (Object)by);
    }

    protected void l_() {
        this.e.N(1, (class07473)new class07427((class07079)this));
        this.e.N(2, (class07473)new class07464((class07475)this, class03811.class, 6.0f, 1.0, 1.2, class074382 -> !((class03811)class074382).W()));
        this.e.N(3, (class07473)new class07982((class07079)this, 0.4f));
        this.e.N(4, (class07473)new class07154(this));
        this.e.N(5, (class07473)new class07957((class07475)this, 0.8));
        this.e.N(6, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(6, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class07989((class07475)this, new Class[0]));
        this.H.N(2, (class07473)new class10718(this, class08036.class));
        this.H.N(3, (class07473)new class10718(this, class07625.class));
    }

    public boolean method_6049(class07055 class070552) {
        if (class070552.N(class07047.j)) {
            return false;
        }
        return super.method_6049(class070552);
    }

    @Override
    public class04891 method_6002() {
        return class04909.Qi;
    }

    public boolean method_6101() {
        return this.E();
    }

    @Override
    public class04891 method_6011(class07072 class070722) {
        return class04909.QR;
    }
}

