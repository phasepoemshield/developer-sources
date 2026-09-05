/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00674
 *  minecraft.class00680
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class00756
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class02484
 *  minecraft.class02625
 *  minecraft.class02841
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04160
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class05497
 *  minecraft.class05847
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06273
 *  minecraft.class06551
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06704
 *  minecraft.class06912
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07107
 *  minecraft.class07111
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07307
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07507
 *  minecraft.class07513
 *  minecraft.class07536
 *  minecraft.class07550
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00674;
import minecraft.class00680;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class00756;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class02484;
import minecraft.class02625;
import minecraft.class02841;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04160;
import minecraft.class04620;
import minecraft.class04626;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class05497;
import minecraft.class05847;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06273;
import minecraft.class06551;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06704;
import minecraft.class06912;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07107;
import minecraft.class07111;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07307;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07507;
import minecraft.class07513;
import minecraft.class07536;
import minecraft.class07550;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class04593
extends class07796 {
    public static final MapCodec<class04593> N = class04593.y(class04593::new);
    public static final class08064<class07211> y = class07101.R;
    public static final class08071 L = class06665.NF;
    public static final int u = 5;

    public class04593(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0))).y(y, (Comparable)class07211.field_11043));
    }

    private boolean y(class07299 class072992, class07209 class072092) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class04620) {
            return !((class04620)class003942).L();
        }
        return false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, y});
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        if (class072992 instanceof class04782) {
            class00394 class003942;
            class04782 class047822 = (class04782)class072992;
            if (class080362.method_66324() && ((Boolean)class047822.method_64395().N(class07305.u)).booleanValue() && (class003942 = class072992.method_8321(class072092)) instanceof class04620) {
                class04620 class046202 = (class04620)class003942;
                int n = (Integer)class005002.L((class08092)L);
                if (!class046202.L() || n > 0) {
                    class06584 class065842 = new class06584((class07310)this);
                    class065842.y(class046202.g());
                    class065842.N(class02484.Nl, (Object)class02841.N.N((class08092)L, (Comparable)Integer.valueOf(n)));
                    class00717 class007172 = new class00717(class072992, (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), class065842);
                    class007172.L();
                    class072992.method_8649((class07049)class007172);
                }
            }
        }
        return super.N(class072992, class072092, class005002, class080362);
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class072992.method_8608() ? null : class04593.N(class004042, (class00404)class00404.field_20431, class04620::N);
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class04620(class072092, class005002);
    }

    private void N(class07299 class072992, double d, double d2, double d3, double d4, double d5) {
        class072992.method_8406((class07126)class07107.Nw, class04995.u((double)class072992.field_9229.U(), (double)d, (double)d2), d5, class04995.u((double)class072992.field_9229.U(), (double)d3, (double)d4), 0.0, 0.0, 0.0);
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(y, (Comparable)class069422.method_8042().b());
    }

    public class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    public class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    public MapCodec<class04593> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class00394 class003942;
        if (class054872.method_8320(class072093).i() instanceof class00756 && (class003942 = class054872.method_8321(class072092)) instanceof class04620) {
            ((class04620)class003942).N(null, class005002, class05497.field_21052);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        class06584 class065842 = super.N(class054872, class072092, class005002, bl);
        if (bl) {
            class065842.N(class02484.Nl, (Object)class02841.N.N((class08092)L, (Comparable)((Integer)class005002.L((class08092)L))));
        }
        return class065842;
    }

    protected List<class06584> N(class00500 class005002, class04160 class041602) {
        class00394 class003942;
        class07049 class070492 = (class07049)class041602.y(class06551.N);
        if ((class070492 instanceof class00674 || class070492 instanceof class07550 || class070492 instanceof class07513 || class070492 instanceof class00680 || class070492 instanceof class07507) && (class003942 = (class00394)class041602.y(class06551.z)) instanceof class04620) {
            ((class04620)class003942).N(null, class005002, class05497.field_21052);
        }
        return super.N(class005002, class041602);
    }

    public static void N(class04782 class047823, class06584 class065843, class00500 class005002, @Nullable class00394 class003942, @Nullable class07049 class070492, class07209 class072092) {
        class04593.N((class04782)class047823, (class05946)class06273.Nc, (class00500)class005002, (class00394)class003942, (class06584)class065843, (class07049)class070492, (class047822, class065842) -> class04593.N_21((class07299)class047822, (class07209)class072092, (class06584)class065842));
    }

    private void N(class07299 class072992, class07209 class072092) {
        class00734 class007342 = new class00734(class072092).L(8.0, 6.0, 8.0);
        List var4 = class072992.N(class04626.class, class007342);
        if (!var4.isEmpty()) {
            List var5 = class072992.N(class08036.class, class007342);
            if (var5.isEmpty()) {
                return;
            }
            for (class04626 class046262 : var4) {
                if (class046262.T() != null) continue;
                class08036 class080362 = (class08036)class07536.N_77((List)var5, (class06069)class072992.field_9229);
                class046262.y((class07438)class080362);
            }
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class07307 class073072, BiConsumer<class06584, class07209> biConsumer) {
        super.N(class005002, class047822, class072092, class073072, biConsumer);
        this.N((class07299)class047822, class072092);
    }

    public void N(class07299 class072992, class08036 class080362, class07209 class072092, class00500 class005002, @Nullable class00394 class003942, class06584 class065842) {
        super.N(class072992, class080362, class072092, class005002, class003942, class065842);
        if (!class072992.method_8608() && class003942 instanceof class04620) {
            class04620 class046202 = (class04620)class003942;
            if (!class07323.N((class06584)class065842, (class03530)class02625.T)) {
                class046202.N(class080362, class005002, class05497.field_21052);
                class06704.N((class00500)class005002, (class07299)class072992, (class07209)class072092);
                this.N(class072992, class072092);
            }
            class06912.H.N((class04770)class080362, class005002, class065842, class046202.R());
        }
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return (Integer)class005002.L((class08092)L);
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    private void N(class07299 class072992, class07209 class072092, class00494 class004942, double d) {
        this.N(class072992, (double)class072092.method_10263() + class004942.method_1091(class07185.field_11048), (double)class072092.method_10263() + class004942.method_1105(class07185.field_11048), (double)class072092.method_10260() + class004942.method_1091(class07185.field_11051), (double)class072092.method_10260() + class004942.method_1105(class07185.field_11051), d);
    }

    private void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        if (!class005002.Y().W() || class072992.field_9229.z() < 0.3f) {
            return;
        }
        class00494 class004942 = class005002.M((class07290)class072992, class072092);
        if (class004942.method_1105(class07185.field_11052) >= 1.0 && !class005002.N(class01210.Ng)) {
            double d = class004942.method_1091(class07185.field_11052);
            if (d > 0.0) {
                this.N(class072992, class072092, class004942, (double)class072092.method_10264() + d - 0.05);
            } else {
                class07209 class072093 = class072092.method_10074();
                class00500 class005003 = class072992.method_8320(class072093);
                if ((class005003.M((class07290)class072992, class072093).method_1105(class07185.field_11052) < 1.0 || !class005003.W((class07290)class072992, class072093)) && class005003.Y().W()) {
                    this.N(class072992, class072092, class004942, (double)class072092.method_10264() - 0.05);
                }
            }
        }
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if ((Integer)class005002.L((class08092)L) >= 5) {
            for (int i = 0; i < class060692.y(1) + 1; ++i) {
                this.N(class072992, class072092, class005002);
            }
        }
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092) {
        class072992.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(0)), 3);
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092, @Nullable class08036 class080362, class05497 class054972) {
        this.N(class072992, class005002, class072092);
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class04620) {
            ((class04620)class003942).N(class080362, class005002, class054972);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected class07082 N(class06584 var1_1, class00500 var2_2, class07299 var3_3, class07209 var4_4, class08036 var5_5, class07050 var6_6, class06183 var7_7) {
        block11: {
            var8_8 = (Integer)var2_2.L((class08092)class04593.L);
            var9_9 = false;
            if (var8_8 < 5) break block11;
            var10_10 = var1_1.B();
            if (!(var3_3 instanceof class04782)) ** GOTO lbl-1000
            var11_11 = (class04782)var3_3;
            if (var1_1.N(class06570.vr)) {
                class04593.N(var11_11, var1_1, var2_2, var3_3.method_8321(var4_4), (class07049)var5_5, var4_4);
                var3_3.method_43128(null, var5_5.method_23317(), var5_5.method_23318(), var5_5.method_23321(), class04909.Lz, class04911.field_15245, 1.0f, 1.0f);
                var1_1.N(1, (class07438)var5_5, var6_6.N());
                var9_9 = true;
                var3_3.N((class07049)var5_5, (class03556)class01194.H, var4_4);
            } else if (var1_1.N(class06570.nP)) {
                var1_1.B(1);
                var3_3.method_43128((class07049)var5_5, var5_5.method_23317(), var5_5.method_23318(), var5_5.method_23321(), class04909.LX, class04911.field_15245, 1.0f, 1.0f);
                if (var1_1.R()) {
                    var5_5.method_6122(var6_6, new class06584((class07310)class06570.wZ));
                } else if (!var5_5.method_31548().M(new class06584((class07310)class06570.wZ))) {
                    var5_5.method_7328(new class06584((class07310)class06570.wZ), false);
                }
                var9_9 = true;
                var3_3.N((class07049)var5_5, (class03556)class01194.d, var4_4);
            }
            if (!var3_3.method_8608() && var9_9) {
                var5_5.method_7259(class01235.L.y((Object)var10_10));
            }
        }
        if (var9_9) {
            if (!class05847.N((class07299)var3_3, (class07209)var4_4)) {
                if (this.y(var3_3, var4_4)) {
                    this.N(var3_3, var4_4);
                }
                this.N(var3_3, var2_2, var4_4, var5_5, class05497.field_21052);
            } else {
                this.N(var3_3, var2_2, var4_4);
            }
            return class07082.N;
        }
        return super.N(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7);
    }
}

