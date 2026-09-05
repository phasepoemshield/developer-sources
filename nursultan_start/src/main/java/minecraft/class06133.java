/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.MatchException
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class05648
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07185
 *  minecraft.class07193
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07307
 *  minecraft.class07796
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class05648;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06112;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07185;
import minecraft.class07193;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07307;
import minecraft.class07796;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class06133
extends class07796 {
    public static final MapCodec<class06133> N = class06133.y(class06133::new);
    public static final class08064<class07211> y = class07101.R;
    public static final class08064<class05648> L = class06665.h;
    public static final class06667 u = class06665.k;
    private static final class00494 R = class00389.N((class00494)class00891.y((double)6.0, (double)6.0, (double)13.0), (class00494)class00891.y((double)8.0, (double)4.0, (double)6.0));
    private static final class00494 M = class00389.N((class00494)R, (class00494)class00891.y((double)2.0, (double)13.0, (double)16.0));
    private static final Map<class07185, class00494> B = class00389.N((class00494)class00891.N((double)16.0, (double)16.0, (double)8.0));
    private static final Map<class07185, class00494> Z = class00389.N((class00494)class00389.N((class00494)R, (class00494)class00891.N((double)2.0, (double)16.0, (double)13.0, (double)15.0)));
    private static final Map<class07211, class00494> O = class00389.L((class00494)class00389.N((class00494)R, (class00494)class00891.N((double)2.0, (double)13.0, (double)15.0, (double)0.0, (double)13.0)));
    public static final int i = 1;

    private static class07211 T(class00500 class005002) {
        switch ((class05648)class005002.L(L)) {
            case field_17099: {
                return class07211.field_11033;
            }
            case field_17098: {
                return class07211.field_11036;
            }
        }
        return ((class07211)class005002.L(y)).b();
    }

    public class06133(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043)).y(L, (Comparable)class05648.field_17098)).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    private class00494 U(class00500 class005002) {
        class07211 class072112 = (class07211)class005002.L(y);
        return switch ((class05648)class005002.L(L)) {
            default -> throw new MatchException(null, null);
            case class05648.field_17098 -> B.get(class072112.z());
            case class05648.field_17099 -> M;
            case class05648.field_17100 -> O.get(class072112);
            case class05648.field_17101 -> Z.get(class072112.z());
        };
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.U(class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u});
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class05648 class056482 = (class05648)class005002.L(L);
        class07211 class072113 = class06133.T(class005002).b();
        if (class072113 == class072112 && !class005002.N(class054872, class072092) && class056482 != class05648.field_17101) {
            return class00869.N.W();
        }
        if (class072112.z() == ((class07211)class005002.L(y)).z()) {
            if (class056482 == class05648.field_17101 && !class005003.L((class07290)class054872, class072093, class072112)) {
                return (class00500)((class00500)class005002.y(L, (Comparable)class05648.field_17100)).y(y, (Comparable)class072112.b());
            }
            if (class056482 == class05648.field_17100 && class072113.b() == class072112 && class005003.L((class07290)class054872, class072093, (class07211)class005002.L(y))) {
                return (class00500)class005002.y(L, (Comparable)class05648.field_17101);
            }
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class07307 class073072, BiConsumer<class06584, class07209> biConsumer) {
        if (class073072.M()) {
            this.N((class07299)class047822, class072092, null);
        }
        super.N(class005002, class047822, class072092, class073072, biConsumer);
    }

    public MapCodec<class06133> N() {
        return N;
    }

    public class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    public class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class06133.N(class004042, (class00404)class00404.field_16413, (class01118)(class072992.method_8608() ? class06112::N : class06112::y));
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class06112(class072092, class005002);
    }

    private boolean N(class00500 class005002, class07211 class072112, double d) {
        if (class072112.z() == class07185.field_11052 || d > (double)0.8124f) {
            return false;
        }
        class07211 class072113 = (class07211)class005002.L(y);
        class05648 class056482 = (class05648)class005002.L(L);
        switch (class056482) {
            case field_17098: {
                return class072113.z() == class072112.z();
            }
            case field_17100: 
            case field_17101: {
                return class072113.z() != class072112.z();
            }
            case field_17099: {
                return true;
            }
        }
        return false;
    }

    public boolean N(class07299 class072992, class00500 class005002, class06183 class061832, @Nullable class08036 class080362, boolean bl) {
        class07211 class072112 = class061832.i();
        class07209 class072092 = class061832.u();
        if (!bl || this.N(class005002, class072112, class061832.y().B - (double)class072092.method_10264())) {
            if (this.N((class07049)class080362, class072992, class072092, class072112) && class080362 != null) {
                class080362.method_7281(class01235.NY);
            }
            return true;
        }
        return false;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        return this.N(class072992, class005002, class061832, class080362, true) ? class07082.N : class07082.i;
    }

    protected void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
        class07049 class070492 = class080052.z();
        class08036 class080362 = class070492 instanceof class08036 ? (class08036)class070492 : null;
        this.N(class072992, class005002, class061832, class080362, true);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        boolean bl2 = class072992.W(class072092);
        if (bl2 != (Boolean)class005002.L((class08092)u)) {
            if (bl2) {
                this.N(class072992, class072092, null);
            }
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(bl2)), 3);
        }
    }

    public @Nullable class00500 N(class06942 class069422) {
        class07211 class072112 = class069422.method_8038();
        class07209 class072092 = class069422.method_8037();
        class07299 class072992 = class069422.method_8045();
        class07185 class071852 = class072112.z();
        if (class071852 == class07185.field_11052) {
            class00500 class005002 = (class00500)((class00500)this.W().y(L, (Comparable)(class072112 == class07211.field_11033 ? class05648.field_17099 : class05648.field_17098))).y(y, (Comparable)class069422.method_8042());
            if (class005002.N((class05487)class069422.method_8045(), class072092)) {
                return class005002;
            }
        } else {
            boolean bl = class071852 == class07185.field_11048 && class072992.method_8320(class072092.method_10067()).L((class07290)class072992, class072092.method_10067(), class07211.field_11034) && class072992.method_8320(class072092.method_10078()).L((class07290)class072992, class072092.method_10078(), class07211.field_11039) || class071852 == class07185.field_11051 && class072992.method_8320(class072092.method_10095()).L((class07290)class072992, class072092.method_10095(), class07211.field_11035) && class072992.method_8320(class072092.method_10072()).L((class07290)class072992, class072092.method_10072(), class07211.field_11043);
            class00500 class005003 = (class00500)((class00500)this.W().y(y, (Comparable)class072112.b())).y(L, (Comparable)(bl ? class05648.field_17101 : class05648.field_17100));
            if (class005003.N((class05487)class069422.method_8045(), class069422.method_8037())) {
                return class005003;
            }
            boolean bl2 = class072992.method_8320(class072092.method_10074()).L((class07290)class072992, class072092.method_10074(), class07211.field_11036);
            if ((class005003 = (class00500)class005003.y(L, (Comparable)(bl2 ? class05648.field_17098 : class05648.field_17099))).N((class05487)class069422.method_8045(), class069422.method_8037())) {
                return class005003;
            }
        }
        return null;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.U(class005002);
    }

    public boolean N(@Nullable class07049 class070492, class07299 class072992, class07209 class072092, @Nullable class07211 class072112) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (!class072992.method_8608() && class003942 instanceof class06112) {
            if (class072112 == null) {
                class072112 = (class07211)class072992.method_8320(class072092).L(y);
            }
            ((class06112)class003942).N(class072112);
            class072992.method_8396(null, class072092, class04909.LE, class04911.field_15245, 2.0f, 1.0f);
            class072992.N(class070492, (class03556)class01194.L, class072092);
            return true;
        }
        return false;
    }

    public boolean N(class07299 class072992, class07209 class072092, @Nullable class07211 class072112) {
        return this.N(null, class072992, class072092, class072112);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07211 class072112 = class06133.T(class005002).b();
        if (class072112 == class07211.field_11036) {
            return class00891.N_6((class05487)class054872, (class07209)class072092.method_10084(), (class07211)class07211.field_11033);
        }
        return class07193.y((class05487)class054872, (class07209)class072092, (class07211)class072112);
    }
}

