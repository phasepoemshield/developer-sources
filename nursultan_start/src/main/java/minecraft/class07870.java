/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01001
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02136
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04540
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05549
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07446
 *  minecraft.class07643
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01001;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class02131;
import minecraft.class02136;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04540;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05549;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07446;
import minecraft.class07643;
import minecraft.class07861;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07870
extends class07643 {
    private static final String N = "type";
    private static final class02131<Integer> y = class03289.N(class07870.class, (class04383)class02154.y);

    public class07861 Q() {
        return class07861.field_55008.apply((Integer)this.field_6011.N(y));
    }

    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (y.equals(class021312)) {
            this.method_18382();
        }
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.No);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(y, (Object)class07861.field_57618.N());
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N(N, class07861.field_52473, (Object)this.Q());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.No) {
            return (T)class07870.method_66651(class024772, (Object)((Object)this.Q()));
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N(N, class07861.field_52473).orElse(class07861.field_57618));
    }

    public class07870(class07078<? extends class07870> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.method_18382();
    }

    protected class04891 s() {
        return class04909.dw;
    }

    protected class04891 m() {
        return class04909.dY;
    }

    public int v() {
        return 5;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class02136 class021362 = class04540.y();
        class021362.N((Object)class07861.field_52470, 30);
        class021362.N((Object)class07861.field_52471, 50);
        class021362.N((Object)class07861.field_52472, 15);
        class021362.N().N(this.field_5974).ifPresent(this::N);
        return super.N(class010012, class070522, class061132, class074462);
    }

    private void N(class07861 class078612) {
        this.field_6011.N(y, (Object)class078612.field_55009);
    }

    public float O() {
        return this.Q().field_53975;
    }

    public class06584 Y() {
        return new class06584((class07310)class06570.jj);
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.No) {
            this.N((class07861)((Object)class07870.method_66651((class02477)class02484.No, t)));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    public void e_(class06584 class065842) {
        class05549.N((class07079)this, (class06584)class065842);
        class065842.N(class02484.No, (class02666)this);
    }

    public class04891 method_6002() {
        return class04909.dk;
    }

    public class01325 method_55694(class01312 class013122) {
        return super.method_55694(class013122).N(this.O());
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.dQ;
    }
}

