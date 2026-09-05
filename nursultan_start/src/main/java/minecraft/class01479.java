/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P2
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01448
 *  minecraft.class01455
 *  minecraft.class02142
 *  minecraft.class03194
 *  minecraft.class04206
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04887
 *  minecraft.class06069
 *  minecraft.class06665
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07212
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01448;
import minecraft.class01455;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class02142;
import minecraft.class03194;
import minecraft.class04206;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04887;
import minecraft.class06069;
import minecraft.class06665;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07212;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class08092;

public abstract class class01479 {
    public static final Codec<class01479> L = class04206.C.T().dispatch(class01479::N, class01448::N);
    protected final class02142 u;
    protected final class02142 i;

    public class01479(class02142 class021422, class02142 class021423) {
        this.u = class021422;
        this.i = class021423;
    }

    public boolean y(class06069 class060692, int n, int n2, int n3, int n4, boolean bl) {
        int n5;
        int n6;
        if (bl) {
            n6 = Math.min(Math.abs(n), Math.abs(n - 1));
            n5 = Math.min(Math.abs(n3), Math.abs(n3 - 1));
        } else {
            n6 = Math.abs(n);
            n5 = Math.abs(n3);
        }
        return this.N(class060692, n6, n2, n5, n4, bl);
    }

    protected static <P extends class01479> Products.P2<RecordCodecBuilder.Mu<P>, class02142, class02142> y(RecordCodecBuilder.Instance<P> instance) {
        return instance.group((App)class02142.N((int)0, (int)16).fieldOf("radius").forGetter(class014792 -> class014792.u), (App)class02142.N((int)0, (int)16).fieldOf("offset").forGetter(class014792 -> class014792.i));
    }

    protected static boolean N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, class07209 class072092) {
        if (class048872.method_16358(class072092, class005002 -> (Boolean)class005002.N((class08092)class06665.w, (Comparable)Boolean.valueOf(false))) || !class03194.L((class04887)class048872, (class07209)class072092)) {
            return false;
        }
        class00500 class005003 = class014762.i.N(class060692, class072092);
        if (class005003.y((class08092)class06665.q)) {
            class005003 = (class00500)class005003.y((class08092)class06665.q, (Comparable)Boolean.valueOf(class048872.method_35237(class072092, class046882 -> class046882.N((class04651)class04684.L))));
        }
        class014552.N(class072092, class005003);
        return true;
    }

    private static boolean N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, float f, class07209 class072092, class07218 class072182) {
        if (class072182.method_19455((class00753)class072092) >= 7) {
            return false;
        }
        if (class060692.z() > f) {
            return false;
        }
        return class01479.N(class048872, class014552, class060692, class014762, (class07209)class072182);
    }

    public void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, int n, class01467 class014672, int n2, int n3) {
        this.N(class048872, class014552, class060692, class014762, n, class014672, n2, n3, this.N(class060692));
    }

    protected abstract class01448<?> N();

    protected abstract boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6);

    private int N(class06069 class060692) {
        return this.i.N(class060692);
    }

    public int N(class06069 class060692, int n) {
        return this.u.N(class060692);
    }

    public abstract int N(class06069 var1, int var2, class01476 var3);

    protected abstract void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9);

    protected void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, class07209 class072092, int n, int n2, boolean bl) {
        int n3 = bl ? 1 : 0;
        class07218 class072182 = new class07218();
        for (int i = -n; i <= n + n3; ++i) {
            for (int j = -n; j <= n + n3; ++j) {
                if (this.y(class060692, i, n2, j, n, bl)) continue;
                class072182.N((class00753)class072092, i, n2, j);
                class01479.N(class048872, class014552, class060692, class014762, (class07209)class072182);
            }
        }
    }

    protected final void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, class07209 class072092, int n, int n2, boolean bl, float f, float f2) {
        this.N(class048872, class014552, class060692, class014762, class072092, n, n2, bl);
        int n3 = bl ? 1 : 0;
        class07209 class072093 = class072092.method_10074();
        class07218 class072182 = new class07218();
        for (class07211 class072112 : class07221.field_11062) {
            class07211 class072113 = class072112.R();
            int n4 = class072113.i() == class07212.field_11056 ? n + n3 : n;
            class072182.N((class00753)class072092, 0, n2 - 1, 0).N(class072113, n4).N(class072112, -n);
            for (int i = -n; i < n + n3; ++i) {
                boolean bl2 = class014552.N((class07209)class072182.N(class07211.field_11036));
                class072182.N(class07211.field_11033);
                if (bl2 && class01479.N(class048872, class014552, class060692, class014762, f, class072093, class072182)) {
                    class072182.N(class07211.field_11033);
                    class01479.N(class048872, class014552, class060692, class014762, f2, class072093, class072182);
                    class072182.N(class07211.field_11036);
                }
                class072182.N(class072112);
            }
        }
    }
}

