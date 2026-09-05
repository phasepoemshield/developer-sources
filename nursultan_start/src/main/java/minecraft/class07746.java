/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.MatchException
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class01372
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08052
 *  minecraft.class08061
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class01372;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08052;
import minecraft.class08061;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;

public class class07746
extends class00891
implements class06084 {
    public static final MapCodec<class07746> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00500.N.fieldOf("base_state").forGetter(class077462 -> class077462.R), (App)class07746.t()).apply(instance, class07746::new));
    public static final class08064<class07211> y = class07101.R;
    public static final class08064<class08052> L = class06665.NZ;
    public static final class08064<class08061> u = class06665.ym;
    public static final class06667 i = class06665.q;
    private static final class00494 M = class00389.N((class00494)class00891.y((double)16.0, (double)0.0, (double)8.0), (class00494)class00891.N((double)0.0, (double)8.0, (double)0.0, (double)8.0, (double)16.0, (double)8.0));
    private static final class00494 B = class00389.N((class00494)M, (class00494)class00389.N((class00494)M, (class01372)class01372.field_64511));
    private static final class00494 Z = class00389.N((class00494)B, (class00494)class00389.N((class00494)B, (class01372)class01372.field_64511));
    private static final Map<class07211, class00494> O = class00389.L((class00494)M);
    private static final Map<class07211, class00494> F = class00389.L((class00494)B);
    private static final Map<class07211, class00494> A = class00389.L((class00494)Z);
    private static final Map<class07211, class00494> f = class00389.y((class00494)M, (class01372)class01372.field_23266);
    private static final Map<class07211, class00494> C = class00389.y((class00494)B, (class01372)class01372.field_23266);
    private static final Map<class07211, class00494> S = class00389.y((class00494)Z, (class01372)class01372.field_23266);
    private final class00891 x;
    protected final class00500 R;

    private static boolean L(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        class00500 class005003 = class072902.method_8320(class072092.method_10093(class072112));
        return !class07746.U(class005003) || class005003.L(y) != class005002.L(y) || class005003.L(L) != class005002.L(L);
    }

    public class07746(class00500 class005002, class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043)).y(L, (Comparable)class08052.field_12617)).y(u, (Comparable)class08061.field_12710)).y((class08092)i, (Comparable)Boolean.valueOf(false)));
        this.x = class005002.i();
        this.R = class005002;
    }

    public static class08061 i(class00500 class005002, class07290 class072902, class07209 class072092) {
        class07211 class072112;
        class00500 class005003;
        class07211 class072113 = (class07211)class005002.L(y);
        class00500 class005004 = class072902.method_8320(class072092.method_10093(class072113));
        if (class07746.U(class005004) && class005002.L(L) == class005004.L(L) && (class005003 = (class07211)class005004.L(y)).z() != ((class07211)class005002.L(y)).z() && class07746.L(class005002, class072902, class072092, class005003.b())) {
            if (class005003 == class072113.M()) {
                return class08061.field_12708;
            }
            return class08061.field_12709;
        }
        class005003 = class072902.method_8320(class072092.method_10093(class072113.b()));
        if (class07746.U(class005003) && class005002.L(L) == class005003.L(L) && (class072112 = (class07211)class005003.L(y)).z() != ((class07211)class005002.L(y)).z() && class07746.L(class005002, class072902, class072092, class072112)) {
            if (class072112 == class072113.M()) {
                return class08061.field_12712;
            }
            return class08061.field_12713;
        }
        return class08061.field_12710;
    }

    public static boolean U(class00500 class005002) {
        return class005002.i() instanceof class07746;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        class07211 class072112 = (class07211)class005002.L(y);
        class08061 class080612 = (class08061)class005002.L(u);
        switch (class071112) {
            case field_11300: {
                if (class072112.z() != class07185.field_11051) break;
                switch (class080612) {
                    case field_12712: {
                        return (class00500)class005002.N(class06993.field_11464).y(u, (Comparable)class08061.field_12713);
                    }
                    case field_12713: {
                        return (class00500)class005002.N(class06993.field_11464).y(u, (Comparable)class08061.field_12712);
                    }
                    case field_12708: {
                        return (class00500)class005002.N(class06993.field_11464).y(u, (Comparable)class08061.field_12709);
                    }
                    case field_12709: {
                        return (class00500)class005002.N(class06993.field_11464).y(u, (Comparable)class08061.field_12708);
                    }
                }
                return class005002.N(class06993.field_11464);
            }
            case field_11301: {
                if (class072112.z() != class07185.field_11048) break;
                switch (class080612) {
                    case field_12712: {
                        return (class00500)class005002.N(class06993.field_11464).y(u, (Comparable)class08061.field_12712);
                    }
                    case field_12713: {
                        return (class00500)class005002.N(class06993.field_11464).y(u, (Comparable)class08061.field_12713);
                    }
                    case field_12708: {
                        return (class00500)class005002.N(class06993.field_11464).y(u, (Comparable)class08061.field_12709);
                    }
                    case field_12709: {
                        return (class00500)class005002.N(class06993.field_11464).y(u, (Comparable)class08061.field_12708);
                    }
                    case field_12710: {
                        return class005002.N(class06993.field_11464);
                    }
                }
                break;
            }
        }
        return super.N(class005002, class071112);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u, i});
    }

    public MapCodec<? extends class07746> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (class072112.z().L()) {
            return (class00500)class005002.y(u, (Comparable)class07746.i(class005002, (class07290)class054872, class072092));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class00500 N(class06942 class069422) {
        class07211 class072112 = class069422.method_8038();
        class07209 class072092 = class069422.method_8037();
        class04688 class046882 = class069422.method_8045().method_8316(class072092);
        class00500 class005002 = (class00500)((class00500)((class00500)this.W().y(y, (Comparable)class069422.method_8042())).y(L, (Comparable)(class072112 == class07211.field_11033 || class072112 != class07211.field_11036 && class069422.method_17698().B - (double)class072092.method_10264() > 0.5 ? class08052.field_12619 : class08052.field_12617))).y((class08092)i, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
        return (class00500)class005002.y(u, (Comparable)class07746.i(class005002, (class07290)class069422.method_8045(), class072092));
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        boolean bl = class005002.L(L) == class08052.field_12617;
        class07211 class072112 = (class07211)class005002.L(y);
        return (switch ((class08061)class005002.L(u)) {
            default -> throw new MatchException(null, null);
            case class08061.field_12710 -> {
                if (bl) {
                    yield F;
                }
                yield C;
            }
            case class08061.field_12713, class08061.field_12712 -> {
                if (bl) {
                    yield A;
                }
                yield S;
            }
            case class08061.field_12708, class08061.field_12709 -> bl ? O : f;
        }).get(switch ((class08061)class005002.L(u)) {
            default -> throw new MatchException(null, null);
            case class08061.field_12710, class08061.field_12708, class08061.field_12713 -> class072112;
            case class08061.field_12712 -> class072112.M();
            case class08061.field_12709 -> class072112.R();
        });
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    public float R() {
        return this.x.R();
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }
}

