/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10845
 *  minecraft.class01001
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03810
 *  minecraft.class03831
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05289
 *  minecraft.class05298
 *  minecraft.class05325
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07299
 *  minecraft.class07446
 *  minecraft.class07536
 *  minecraft.class07633
 *  minecraft.class07752
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10845;
import minecraft.class01001;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03810;
import minecraft.class03831;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05289;
import minecraft.class05298;
import minecraft.class05325;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07299;
import minecraft.class07446;
import minecraft.class07536;
import minecraft.class07633;
import minecraft.class07752;
import minecraft.class07862;
import minecraft.class07884;
import minecraft.class07896;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07901
extends class07862 {
    private static final class02131<Integer> f = class03289.N(class07901.class, (class04383)class02154.y);
    private static final class01325 C = class07078.NT.E().N(class03810.N().N(class03831.field_47743, 0.0f, class07078.NT.U() + 0.125f, 0.0f)).N(0.5f);
    private static final int S = 0;

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.Nf);
        super.method_66649(class026662);
    }

    @Override
    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(f, (Object)0);
    }

    @Override
    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Variant", this.l());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.Nf) {
            return (T)class07901.method_66651(class024772, (Object)this.W());
        }
        return (T)super.method_58694(class024772);
    }

    @Override
    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.E(class082992.N("Variant", 0));
    }

    public class07901(class07078<? extends class07901> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_5, -1.0f);
        this.N(class04425.field_17, -1.0f);
    }

    protected class04891 s() {
        return class04909.Pg;
    }

    private int l() {
        return (Integer)this.field_6011.N(f);
    }

    public class05325 v() {
        return class05325.N((int)((this.l() & 0xFF00) >> 8));
    }

    @Override
    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        if (class070772 instanceof class07884) {
            class07896 class078962 = (class07896)class07078.Ne.N((class07299)class047822, class06113.field_16466);
            if (class078962 != null) {
                this.N(class070772, class078962);
            }
            return class078962;
        }
        class07901 class079012 = (class07901)class070772;
        class07901 class079013 = (class07901)class07078.NT.N((class07299)class047822, class06113.field_16466);
        if (class079013 != null) {
            int n = this.field_5974.y(9);
            class05289 class052892 = n < 4 ? this.W() : (n < 8 ? class079012.W() : (class05289)class07536.N((Object[])class05289.values(), (class06069)this.field_5974));
            int n2 = this.field_5974.y(5);
            class05325 class053252 = n2 < 2 ? this.v() : (n2 < 4 ? class079012.v() : (class05325)class07536.N((Object[])class05325.values(), (class06069)this.field_5974));
            class079013.N(class052892, class053252);
            this.N(class070772, class079013);
        }
        return class079013;
    }

    private void E(int n) {
        this.field_6011.N(f, (Object)n);
    }

    @Override
    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class05289 class052892;
        class06069 class060692 = class010012.method_8409();
        if (class074462 instanceof class10845) {
            class052892 = ((class10845)class074462).N;
        } else {
            class052892 = (class05289)class07536.N((Object[])class05289.values(), (class06069)class060692);
            class074462 = new class10845(class052892);
        }
        this.N(class052892, (class05325)class07536.N((Object[])class05325.values(), (class06069)class060692));
        return super.N(class010012, class070522, class061132, class074462);
    }

    @Override
    protected void N(class07752 class077522) {
        super.N(class077522);
        if (this.field_5974.y(10) == 0) {
            this.method_5783(class04909.Pq, class077522.N() * 0.6f, class077522.y());
        }
    }

    @Override
    public boolean N(class07633 class076332) {
        if (class076332 == this) {
            return false;
        }
        if (class076332 instanceof class07884 || class076332 instanceof class07901) {
            return this.NS() && ((class07862)class076332).NS();
        }
        return false;
    }

    @Override
    public class07082 N(class08036 class080362, class07050 class070502) {
        boolean bl;
        boolean bl2 = bl = !this.method_6109() && this.I() && class080362.method_21823();
        if (this.method_5782() || bl) {
            return super.N(class080362, class070502);
        }
        class06584 class065842 = class080362.method_5998(class070502);
        if (!class065842.R()) {
            if (this.N(class065842)) {
                return this.y(class080362, class065842);
            }
            if (!this.I()) {
                this.NC();
                return class07082.N;
            }
        }
        return super.N(class080362, class070502);
    }

    private void N(class05289 class052892) {
        this.E(class052892.N() & 0xFF | this.l() & 0xFFFFFF00);
    }

    @Override
    protected void N(class06069 class060692) {
        this.method_5996(class05298.n).N((double)class07901.N_85(arg_0 -> ((class06069)class060692).y(arg_0)));
        this.method_5996(class05298.l).N(class07901.y(() -> ((class06069)class060692).U()));
        this.method_5996(class05298.T).N(class07901.N(() -> ((class06069)class060692).U()));
    }

    private void N(class05289 class052892, class05325 class053252) {
        this.E(class052892.N() & 0xFF | class053252.N() << 8 & 0xFF00);
    }

    public class05289 W() {
        return class05289.N((int)(this.l() & 0xFF));
    }

    @Override
    protected class04891 G() {
        return class04909.PV;
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.Nf) {
            this.N((class05289)class07901.method_66651((class02477)class02484.Nf, t));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    public class04891 method_6002() {
        return class04909.PK;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? C : super.method_55694(class013122);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.PH;
    }

    public void method_6105(class07072 class070722, float f) {
        this.method_57292(class070722, f, new class07085[]{class07085.field_48824});
    }

    @Override
    public boolean method_56991(class07085 class070852) {
        return true;
    }

    @Override
    protected class04891 M_() {
        return class04909.PI;
    }
}

