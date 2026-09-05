/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00263
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
 *  minecraft.class01210
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class02904
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06482
 *  minecraft.class06485
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07003
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07111
 *  minecraft.class07126
 *  minecraft.class07134
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07796
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08400
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00263;
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
import minecraft.class01210;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class02904;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class05838;
import minecraft.class05869;
import minecraft.class05875;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06482;
import minecraft.class06485;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07003;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07111;
import minecraft.class07126;
import minecraft.class07134;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07796;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08400;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class05847
extends class07796
implements class06084 {
    public static final MapCodec<class05847> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.fieldOf("spawn_particles").forGetter(class058472 -> class058472.Z), (App)Codec.intRange((int)0, (int)1000).fieldOf("fire_damage").forGetter(class058472 -> class058472.O), (App)class05847.t()).apply(instance, class05847::new));
    public static final class06667 y = class06665.n;
    public static final class06667 L = class06665.O;
    public static final class06667 u = class06665.q;
    public static final class08064<class07211> i = class06665.f;
    private static final class00494 R = class00891.y((double)16.0, (double)0.0, (double)7.0);
    private static final class00494 M = class00891.y((double)4.0, (double)0.0, (double)16.0);
    private static final int B = 5;
    private final boolean Z;
    private final int O;

    public static boolean T(class00500 class005002) {
        return class005002.N(class01210.yB, (T class013392) -> class013392.y((class08092)u) && class013392.y((class08092)y)) && (Boolean)class005002.L((class08092)u) == false && (Boolean)class005002.L((class08092)y) == false;
    }

    public class05847(boolean bl, int n, class01362 class013622) {
        super(class013622);
        this.Z = bl;
        this.O = n;
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(true))).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false))).y(i, (Comparable)class07211.field_11043));
    }

    private boolean b(class00500 class005002) {
        return class005002.N(class00869.zy);
    }

    public static boolean U(class00500 class005002) {
        return class005002.y((class08092)y) && class005002.N(class01210.yB) && (Boolean)class005002.L((class08092)y) != false;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072993, class00500 class005003, class00404<T> class004042) {
        if (class072993 instanceof class04782) {
            class04782 class047822 = (class04782)class072993;
            if (((Boolean)class005003.L((class08092)y)).booleanValue()) {
                class06485 class064852 = class06482.N(class05838.i);
                return class05847.N(class004042, (class00404)class00404.field_17380, (class072992, class072092, class005002, class058752) -> class05875.N(class047822, class072092, class005002, class058752, (class06485<class02904, class05869>)class064852));
            }
            return class05847.N(class004042, (class00404)class00404.field_17380, class05875::N);
        }
        if (((Boolean)class005003.L((class08092)y)).booleanValue()) {
            return class05847.N(class004042, (class00404)class00404.field_17380, class05875::y);
        }
        return null;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class05875(class072092, class005002);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(i)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u, i});
    }

    public MapCodec<class05847> N() {
        return N;
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class05875) {
            class05875 class058752 = (class05875)class003942;
            class06584 class065843 = class080362.method_5998(class070502);
            if (class072992.method_8433().N(class00263.B).N(class065843)) {
                class04782 class047822;
                if (class072992 instanceof class04782 && class058752.N(class047822 = (class04782)class072992, (class07438)class080362, class065843)) {
                    class080362.method_7281(class01235.Nl);
                    return class07082.y;
                }
                return class07082.L;
            }
        }
        return class07082.R;
    }

    public boolean N(class07284 class072842, class07209 class072092, class00500 class005002, class04688 class046882) {
        if (!((Boolean)class005002.L((class08092)class06665.q)).booleanValue() && class046882.N() == class04684.L) {
            if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
                if (!class072842.method_8608()) {
                    class072842.method_8396(null, class072092, class04909.Ef, class04911.field_15245, 1.0f, 1.0f);
                }
                class05847.N(null, class072842, class072092, class005002);
            }
            class072842.method_8652(class072092, (class00500)((class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(true))).y((class08092)y, (Comparable)Boolean.valueOf(false)), 3);
            class072842.N(class072092, class046882.N(), class046882.N().N((class05487)class072842));
            return true;
        }
        return false;
    }

    public static void N(@Nullable class07049 class070492, class07284 class072842, class07209 class072092, class00500 class005002) {
        if (class072842.method_8608()) {
            for (int i = 0; i < 20; ++i) {
                class05847.N((class07299)class072842, class072092, (Boolean)class005002.L((class08092)L), true);
            }
        }
        class072842.N(class070492, (class03556)class01194.L, class072092);
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (!((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return;
        }
        if (class060692.y(10) == 0) {
            class072992.method_8486((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, class04909.iz, class04911.field_15245, 0.5f + class060692.z(), class060692.z() * 0.7f + 0.6f, false);
        }
        if (this.Z && class060692.y(5) == 0) {
            for (int i = 0; i < class060692.y(1) + 1; ++i) {
                class072992.method_8406((class07126)class07107.NL, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, (double)(class060692.z() / 2.0f), 5.0E-5, (double)(class060692.z() / 2.0f));
            }
        }
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return R;
    }

    public @Nullable class00500 N(class06942 class069422) {
        class07209 class072092;
        class07299 class072992 = class069422.method_8045();
        boolean bl = class072992.method_8316(class072092 = class069422.method_8037()).N() == class04684.L;
        return (class00500)((class00500)((class00500)((class00500)this.W().y((class08092)u, (Comparable)Boolean.valueOf(bl))).y((class08092)L, (Comparable)Boolean.valueOf(this.b(class072992.method_8320(class072092.method_10074()))))).y((class08092)y, (Comparable)Boolean.valueOf(!bl))).y(i, (Comparable)class069422.method_8042());
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (class072112 == class07211.field_11033) {
            return (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(this.b(class005003)));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(i, (Comparable)class069932.N((class07211)class005002.L(i)));
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue() && class070492 instanceof class07438) {
            class070492.method_64419(class072992.method_48963().y(), (float)this.O);
        }
        super.N(class005002, class072992, class072092, class070492, class084002, bl);
    }

    public static boolean N(class07299 class072992, class07209 class072092) {
        for (int i = 1; i <= 5; ++i) {
            class07209 class072093 = class072092.method_10087(i);
            class00500 class005002 = class072992.method_8320(class072093);
            if (class05847.U(class005002)) {
                return true;
            }
            if (!class00389.L((class00494)M, (class00494)class005002.y((class07290)class072992, class072092, class06092.N()), (class07003)class07003.Z)) continue;
            return class05847.U(class072992.method_8320(class072093.method_10074()));
        }
        return false;
    }

    public static void N(class07299 class072992, class07209 class072092, boolean bl, boolean bl2) {
        class06069 class060692 = class072992.method_8409();
        class07134 class071342 = bl ? class07107.Nd : class07107.Nl;
        class072992.method_17452((class07126)class071342, true, (double)class072092.method_10263() + 0.5 + class060692.U() / 3.0 * (double)(class060692.Z() ? 1 : -1), (double)class072092.method_10264() + class060692.U() + class060692.U(), (double)class072092.method_10260() + 0.5 + class060692.U() / 3.0 * (double)(class060692.Z() ? 1 : -1), 0.0, 0.07, 0.0);
        if (bl2) {
            class072992.method_8406((class07126)class07107.NZ, (double)class072092.method_10263() + 0.5 + class060692.U() / 4.0 * (double)(class060692.Z() ? 1 : -1), (double)class072092.method_10264() + 0.4, (double)class072092.method_10260() + 0.5 + class060692.U() / 4.0 * (double)(class060692.Z() ? 1 : -1), 0.0, 0.005, 0.0);
        }
    }

    protected void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
        class07209 class072092 = class061832.u();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (class080052.method_5809() && class080052.method_36971(class047822, class072092) && !((Boolean)class005002.L((class08092)y)).booleanValue() && !((Boolean)class005002.L((class08092)u)).booleanValue()) {
                class072992.method_8652(class072092, (class00500)class005002.y((class08092)class06665.n, (Comparable)Boolean.valueOf(true)), 11);
            }
        }
    }
}

