/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class01362
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06665
 *  minecraft.class06771
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08005
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06665;
import minecraft.class06771;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08005;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class00898
extends class00891 {
    public static final MapCodec<class00898> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.i.T().fieldOf("plant").forGetter(class008982 -> class008982.i), (App)class00898.t()).apply(instance, class00898::new));
    public static final int y = 5;
    public static final class08071 L = class06665.Nd;
    private static final class00494 u = class00891.y(14.0, 0.0, 15.0);
    private final class00891 i;

    public class00898(class00891 class008912, class01362 class013622) {
        super(class013622);
        this.i = class008912;
        this.P((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0)));
    }

    public class00494 u(class00500 class005002, class07290 class072902, class07209 class072092) {
        return u;
    }

    private static boolean y(class05487 class054872, class07209 class072092, @Nullable class07211 class072112) {
        for (class07211 class072113 : class07221.field_11062) {
            if (class072113 == class072112 || class054872.R(class072092.method_10093(class072113))) continue;
            return false;
        }
        return true;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        int n;
        int n2;
        class07209 class072093 = class072092.method_10084();
        if (!class047822.R(class072093) || class072093.method_10264() > class047822.method_31600()) {
            return;
        }
        int n3 = (Integer)class005002.L((class08092)L);
        if (n3 >= 5) {
            return;
        }
        boolean bl = false;
        boolean bl2 = false;
        class00500 class005003 = class047822.method_8320(class072092.method_10074());
        if (class005003.N(class00869.MP)) {
            bl = true;
        } else if (class005003.N(this.i)) {
            n2 = 1;
            for (n = 0; n < 4; ++n) {
                class00500 class005004 = class047822.method_8320(class072092.method_10087(n2 + 1));
                if (class005004.N(this.i)) {
                    ++n2;
                    continue;
                }
                if (!class005004.N(class00869.MP)) break;
                bl2 = true;
                break;
            }
            if (n2 < 2 || n2 <= class060692.y(bl2 ? 5 : 4)) {
                bl = true;
            }
        } else if (class005003.P()) {
            bl = true;
        }
        if (bl && class00898.y((class05487)class047822, class072093, null) && class047822.R(class072092.method_10086(2))) {
            class047822.method_8652(class072092, class06771.N((class07290)class047822, (class07209)class072092, (class00500)this.i.W()), 2);
            this.N((class07299)class047822, class072093, n3);
        } else if (n3 < 4) {
            n2 = class060692.y(4);
            if (bl2) {
                ++n2;
            }
            n = 0;
            for (int i = 0; i < n2; ++i) {
                class07211 class072112 = class07221.field_11062.N(class060692);
                class07209 class072094 = class072092.method_10093(class072112);
                if (!class047822.R(class072094) || !class047822.R(class072094.method_10074()) || !class00898.y((class05487)class047822, class072094, class072112.b())) continue;
                this.N((class07299)class047822, class072094, n3 + 1);
                n = 1;
            }
            if (n != 0) {
                class047822.method_8652(class072092, class06771.N((class07290)class047822, (class07209)class072092, (class00500)this.i.W()), 2);
            } else {
                this.N((class07299)class047822, class072092);
            }
        } else {
            this.N((class07299)class047822, class072092);
        }
    }

    public static void N(class07284 class072842, class07209 class072092, class06069 class060692, int n) {
        class072842.method_8652(class072092, class06771.N((class07290)class072842, (class07209)class072092, (class00500)class00869.ET.W()), 2);
        class00898.N(class072842, class072092, class060692, class072092, n, 0);
    }

    private static void N(class07284 class072842, class07209 class072092, class06069 class060692, class07209 class072093, int n, int n2) {
        int n3;
        class00891 class008912 = class00869.ET;
        int n4 = class060692.y(4) + 1;
        if (n2 == 0) {
            ++n4;
        }
        for (n3 = 0; n3 < n4; ++n3) {
            class07209 class072094 = class072092.method_10086(n3 + 1);
            if (!class00898.y((class05487)class072842, class072094, null)) {
                return;
            }
            class072842.method_8652(class072094, class06771.N((class07290)class072842, (class07209)class072094, (class00500)class008912.W()), 2);
            class072842.method_8652(class072094.method_10074(), class06771.N((class07290)class072842, (class07209)class072094.method_10074(), (class00500)class008912.W()), 2);
        }
        n3 = 0;
        if (n2 < 4) {
            int n5 = class060692.y(4);
            if (n2 == 0) {
                ++n5;
            }
            for (int i = 0; i < n5; ++i) {
                class07211 class072112 = class07221.field_11062.N(class060692);
                class07209 class072095 = class072092.method_10086(n4).method_10093(class072112);
                if (Math.abs(class072095.method_10263() - class072093.method_10263()) >= n || Math.abs(class072095.method_10260() - class072093.method_10260()) >= n || !class072842.R(class072095) || !class072842.R(class072095.method_10074()) || !class00898.y((class05487)class072842, class072095, class072112.b())) continue;
                n3 = 1;
                class072842.method_8652(class072095, class06771.N((class07290)class072842, (class07209)class072095, (class00500)class008912.W()), 2);
                class072842.method_8652(class072095.method_10093(class072112.b()), class06771.N((class07290)class072842, (class07209)class072095.method_10093(class072112.b()), (class00500)class008912.W()), 2);
                class00898.N(class072842, class072095, class060692, class072093, n, n2 + 1);
            }
        }
        if (n3 == 0) {
            class072842.method_8652(class072092.method_10086(n4), (class00500)class00869.Eb.W().y((class08092)L, (Comparable)Integer.valueOf(5)), 2);
        }
    }

    @Override
    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    public MapCodec<class00898> N() {
        return N;
    }

    protected void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
        class04782 class047822;
        class07209 class072092 = class061832.u();
        if (class072992 instanceof class04782 && class080052.method_36971(class047822 = (class04782)class072992, class072092) && class080052.N(class047822)) {
            class072992.N(class072092, true, (class07049)class080052);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class005002.N((class05487)class047822, class072092)) {
            class047822.N(class072092, true);
        }
    }

    private void N(class07299 class072992, class07209 class072092) {
        class072992.method_8652(class072092, (class00500)this.W().y((class08092)L, (Comparable)Integer.valueOf(5)), 2);
        class072992.N(1034, class072092, 0);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 != class07211.field_11036 && !class005002.N(class054872, class072092)) {
            class087132.N(class072092, (class00891)this, 1);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    private void N(class07299 class072992, class07209 class072092, int n) {
        class072992.method_8652(class072092, (class00500)this.W().y((class08092)L, (Comparable)Integer.valueOf(n)), 2);
        class072992.N(1033, class072092, 0);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class00500 class005003 = class054872.method_8320(class072092.method_10074());
        if (class005003.N(this.i) || class005003.N(class00869.MP)) {
            return true;
        }
        if (!class005003.P()) {
            return false;
        }
        boolean bl = false;
        for (class07211 class072112 : class07221.field_11062) {
            class00500 class005004 = class054872.method_8320(class072092.method_10093(class072112));
            if (class005004.N(this.i)) {
                if (bl) {
                    return false;
                }
                bl = true;
                continue;
            }
            if (class005004.P()) continue;
            return false;
        }
        return bl;
    }

    protected boolean e_(class00500 class005002) {
        return (Integer)class005002.L((class08092)L) < 5;
    }
}

