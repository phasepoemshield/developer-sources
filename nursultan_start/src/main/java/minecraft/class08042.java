/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10865
 *  minecraft.class01001
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03244
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04882
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07427
 *  minecraft.class07446
 *  minecraft.class07458
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10865;
import minecraft.class01001;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03244;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04882;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07427;
import minecraft.class07446;
import minecraft.class07458;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07952;
import minecraft.class07962;
import minecraft.class07989;
import minecraft.class08001;
import minecraft.class08015;
import minecraft.class08032;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import org.jspecify.annotations.Nullable;

public class class08042
extends class07150
implements class03244 {
    public static final float N = 45.836624f;
    public static final int y = class04995.u((float)3.9269907f);
    protected static final class02131<Byte> L = class03289.N(class08042.class, (class04383)class02154.N);
    private static final int u = 1;
    private @Nullable class08372<class07079> i;
    private @Nullable class07209 R;
    private boolean M;
    private int B;

    static /* synthetic */ class07458 L(class08042 class080422) {
        return class080422.q;
    }

    public static class05300 M() {
        return class07150.Y().N(class05298.n, 14.0).N(class05298.u, 4.0);
    }

    static /* synthetic */ class06069 M(class08042 class080422) {
        return class080422.field_5974;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(L, (Object)0);
    }

    public void method_5773() {
        this.field_5960 = true;
        super.method_5773();
        this.field_5960 = false;
        this.method_5875(true);
        if (this.M && --this.B <= 0) {
            this.B = 20;
            this.method_64419(this.method_48923().z(), 1.0f);
        }
    }

    protected boolean method_61410() {
        return !this.method_31481();
    }

    public boolean method_5776() {
        return this.field_6012 % y == 0;
    }

    public float method_5718() {
        return 1.0f;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.y("bound_pos", class07209.field_25064, (Object)this.R);
        if (this.M) {
            class083292.N("life_ticks", this.B);
        }
        class08372.N(this.i, (class08329)class083292, (String)"owner");
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.R = class082992.N("bound_pos", class07209.field_25064).orElse(null);
        class082992.i("life_ticks").ifPresentOrElse(this::N, () -> {
            this.M = false;
        });
        this.i = class08372.N((class08299)class082992, (String)"owner");
    }

    public void method_5878(class07049 class070492) {
        super.method_5878(class070492);
        if (class070492 instanceof class08042) {
            class08042 class080422 = (class08042)class070492;
            this.i = class080422.i;
        }
    }

    public class08042(class07078<? extends class08042> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.q = new class10865(this, this);
        this.J = 3;
    }

    public @Nullable class07079 z() {
        return (class07079)class08372.N(this.i, (class07299)this.method_73183(), class07079.class);
    }

    static /* synthetic */ class07458 B(class08042 class080422) {
        return class080422.q;
    }

    static /* synthetic */ class06069 i(class08042 class080422) {
        return class080422.field_5974;
    }

    protected class04891 s() {
        return class04909.gM;
    }

    static /* synthetic */ class06069 u(class08042 class080422) {
        return class080422.field_5974;
    }

    private boolean y(int n) {
        return ((Byte)this.field_6011.N(L) & n) != 0;
    }

    static /* synthetic */ class07458 y(class08042 class080422) {
        return class080422.q;
    }

    public @Nullable class07209 E() {
        return this.R;
    }

    static /* synthetic */ class06069 N(class08042 class080422) {
        return class080422.field_5974;
    }

    public void N(int n) {
        this.M = true;
        this.B = n;
    }

    public void N(@Nullable class07209 class072092) {
        this.R = class072092;
    }

    public void N(class07079 class070792) {
        this.i = class08372.N((class08636)class070792);
    }

    public void N(boolean bl) {
        this.N(1, bl);
    }

    private void N(int n, boolean bl) {
        int n2 = ((Byte)this.field_6011.N(L)).byteValue();
        n2 = bl ? (n2 |= n) : (n2 &= ~n);
        this.field_6011.N(L, (Object)((byte)(n2 & 0xFF)));
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class06069 class060692 = class010012.method_8409();
        this.N(class060692, class070522);
        this.N(class010012, class060692, class070522);
        return super.N(class010012, class070522, class061132, class074462);
    }

    protected void N(class06069 class060692, class07052 class070522) {
        this.method_5673(class07085.field_6173, new class06584((class07310)class06570.To));
        this.N(class07085.field_6173, 0.0f);
    }

    public boolean W() {
        return this.y(1);
    }

    static /* synthetic */ class06069 R(class08042 class080422) {
        return class080422.field_5974;
    }

    protected void l_() {
        super.l_();
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(4, (class07473)new class08032(this));
        this.e.N(8, (class07473)new class08001(this));
        this.e.N(9, (class07473)new class07962((class07079)this, class08036.class, 3.0f, 1.0f));
        this.e.N(10, (class07473)new class07962((class07079)this, class07079.class, 8.0f));
        this.H.N(1, (class07473)new class07989((class07475)this, class04882.class).N(new Class[0]));
        this.H.N(2, (class07473)new class08015(this, (class07475)this));
        this.H.N(3, new class07952<class08036>((class07079)this, class08036.class, true));
    }

    public class04891 method_6002() {
        return class04909.gZ;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.gz;
    }
}

