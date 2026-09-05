/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10852
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01231
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03557
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06563
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07446
 *  minecraft.class07536
 *  minecraft.class07643
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10852;
import java.util.List;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01231;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03557;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06563;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07446;
import minecraft.class07536;
import minecraft.class07643;
import minecraft.class07874;
import minecraft.class07890;
import minecraft.class07892;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07899
extends class07643 {
    public static final class07890 N = new class07890(class07892.field_6881, class06563.field_7952, class06563.field_7952);
    private static final class02131<Integer> L = class03289.N(class07899.class, (class04383)class02154.y);
    public static final List<class07890> y = List.of(new class07890(class07892.field_6887, class06563.field_7946, class06563.field_7944), new class07890(class07892.field_6893, class06563.field_7944, class06563.field_7944), new class07890(class07892.field_6893, class06563.field_7944, class06563.field_7966), new class07890(class07892.field_6889, class06563.field_7952, class06563.field_7944), new class07890(class07892.field_6880, class06563.field_7966, class06563.field_7944), new class07890(class07892.field_6881, class06563.field_7946, class06563.field_7952), new class07890(class07892.field_6892, class06563.field_7954, class06563.field_7951), new class07890(class07892.field_6884, class06563.field_7945, class06563.field_7947), new class07890(class07892.field_6889, class06563.field_7952, class06563.field_7964), new class07890(class07892.field_6892, class06563.field_7952, class06563.field_7947), new class07890(class07892.field_6883, class06563.field_7952, class06563.field_7944), new class07890(class07892.field_6889, class06563.field_7952, class06563.field_7946), new class07890(class07892.field_6890, class06563.field_7955, class06563.field_7954), new class07890(class07892.field_6891, class06563.field_7961, class06563.field_7951), new class07890(class07892.field_6888, class06563.field_7964, class06563.field_7952), new class07890(class07892.field_6882, class06563.field_7944, class06563.field_7964), new class07890(class07892.field_6884, class06563.field_7964, class06563.field_7952), new class07890(class07892.field_6893, class06563.field_7952, class06563.field_7947), new class07890(class07892.field_6881, class06563.field_7964, class06563.field_7952), new class07890(class07892.field_6880, class06563.field_7944, class06563.field_7952), new class07890(class07892.field_6890, class06563.field_7955, class06563.field_7947), new class07890(class07892.field_6893, class06563.field_7947, class06563.field_7947));
    private boolean u = true;

    public static class06563 L(int n) {
        return class06563.N((int)(n >> 24 & 0xFF));
    }

    public class06563 Q() {
        return class07899.y(this.o());
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.NK);
        this.method_66650(class026662, class02484.NV);
        this.method_66650(class026662, class02484.Ne);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(L, (Object)N.N());
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Variant", class07890.N, (Object)new class07890(this.o()));
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.NK) {
            return (T)class07899.method_66651(class024772, (Object)((Object)this.I()));
        }
        if (class024772 == class02484.NV) {
            return (T)class07899.method_66651(class024772, (Object)this.Q());
        }
        if (class024772 == class02484.Ne) {
            return (T)class07899.method_66651(class024772, (Object)this.O());
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        class07890 class078902 = class082992.N("Variant", class07890.N).orElse(N);
        this.i(class078902.N());
    }

    public class07899(class07078<? extends class07899> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class07892 I() {
        return class07899.u(this.o());
    }

    private void i(int n) {
        this.field_6011.N(L, (Object)n);
    }

    protected class04891 s() {
        return class04909.Oi;
    }

    protected class04891 m() {
        return class04909.OM;
    }

    private int o() {
        return (Integer)this.field_6011.N(L);
    }

    public static class07892 u(int n) {
        return class07892.N(n & 0xFFFF);
    }

    public static class06563 y(int n) {
        return class06563.N((int)(n >> 16 & 0xFF));
    }

    private void y(class06563 class065632) {
        int n = this.o();
        class07892 class078922 = class07899.u(n);
        class06563 class065633 = class07899.y(n);
        this.i(class07899.N(class078922, class065633, class065632));
    }

    private void N(class07892 class078922) {
        int n = this.o();
        class06563 class065632 = class07899.y(n);
        class06563 class065633 = class07899.L(n);
        this.i(class07899.N(class078922, class065632, class065633));
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class07890 class078902;
        class074462 = super.N(class010012, class070522, class061132, class074462);
        class06069 class060692 = class010012.method_8409();
        if (class074462 instanceof class10852) {
            class078902 = ((class10852)class074462).y;
        } else if ((double)class060692.z() < 0.9) {
            class078902 = (class07890)((Object)class07536.N_77(y, (class06069)class060692));
            class074462 = new class10852(this, class078902);
        } else {
            this.u = false;
            class07892[] class07892Array = class07892.values();
            Object[] objectArray = class06563.values();
            class07892 class078922 = (class07892)((Object)class07536.N((Object[])class07892Array, (class06069)class060692));
            class06563 class065632 = (class06563)class07536.N((Object[])objectArray, (class06069)class060692);
            class06563 class065633 = (class06563)class07536.N((Object[])objectArray, (class06069)class060692);
            class078902 = new class07890(class078922, class065632, class065633);
        }
        this.i(class078902.N());
        return class074462;
    }

    public static boolean N(class07078<class07899> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.method_8316(class072092.method_10074()).N(class01231.N) && class072842.method_8320(class072092.method_10084()).N(class00869.K) && (class072842.i(class072092).N(class03557.NU) || class07874.L(class070782, class072842, class061132, class072092, class060692));
    }

    private void N(class06563 class065632) {
        int n = this.o();
        class07892 class078922 = class07899.u(n);
        class06563 class065633 = class07899.L(n);
        this.i(class07899.N(class078922, class065632, class065633));
    }

    static int N(class07892 class078922, class06563 class065632, class06563 class065633) {
        return class078922.y() & 0xFFFF | (class065632.N() & 0xFF) << 16 | (class065633.N() & 0xFF) << 24;
    }

    public static String N(int n) {
        return "entity.minecraft.tropical_fish.predefined." + n;
    }

    public boolean R(int n) {
        return !this.u;
    }

    public class06563 O() {
        return class07899.L(this.o());
    }

    public class06584 Y() {
        return new class06584((class07310)class06570.jn);
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.NK) {
            this.N((class07892)((Object)class07899.method_66651((class02477)class02484.NK, t)));
            return true;
        }
        if (class024772 == class02484.NV) {
            this.N((class06563)class07899.method_66651((class02477)class02484.NV, t));
            return true;
        }
        if (class024772 == class02484.Ne) {
            this.y((class06563)class07899.method_66651((class02477)class02484.Ne, t));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    public void e_(class06584 class065842) {
        super.e_(class065842);
        class065842.N(class02484.NK, (class02666)this);
        class065842.N(class02484.NV, (class02666)this);
        class065842.N(class02484.Ne, (class02666)this);
    }

    public class04891 method_6002() {
        return class04909.OR;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.OB;
    }
}

