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
 *  minecraft.class00608
 *  minecraft.class00772
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07241
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08071
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00608;
import minecraft.class00772;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04995;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07241;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08071;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06768
extends class07796 {
    public static final MapCodec<class06768> N = class06768.y(class06768::new);
    public static final class08071 y = class06665.ND;
    public static final class06667 L = class06665.j;
    private static final class00494 u = class00891.y((double)16.0, (double)0.0, (double)6.0);

    private static void L(class00500 class005002, class07299 class072992, class07209 class072092) {
        int n = class072992.method_8314(class00772.field_9284, class072092) - class072992.method_8594();
        float f = ((Float)class072992.method_75728().N(class00608.W, class072092)).floatValue() * ((float)Math.PI / 180);
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            n = 15 - n;
        } else if (n > 0) {
            float f2 = f < (float)Math.PI ? 0.0f : (float)Math.PI * 2;
            f += (f2 - f) * 0.2f;
            n = Math.round((float)n * class04995.P((double)f));
        }
        n = class04995.N((int)n, (int)0, (int)15);
        if ((Integer)class005002.L((class08092)y) != n) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(n)), 3);
        }
    }

    public class06768(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Integer.valueOf(0))).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        if (!class072992.method_8608() && class072992.method_8597().i()) {
            return class06768.N(class004042, (class00404)class00404.field_11900, class06768::N);
        }
        return null;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07241(class072092, class005002);
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07241 class072412) {
        if (class072992.N() % 20L == 0L) {
            class06768.L(class005002, class072992, class072092);
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    public MapCodec<class06768> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return u;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class080362.method_7294()) {
            return super.N(class005002, class072992, class072092, class080362, class061832);
        }
        if (!class072992.method_8608()) {
            class00500 class005003 = (class00500)class005002.N((class08092)L);
            class072992.method_8652(class072092, class005003, 2);
            class072992.N((class03556)class01194.L, class072092, class01164.N((class07049)class080362, (class00500)class005003));
            class06768.L(class005003, class072992, class072092);
        }
        return class07082.N;
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return (Integer)class005002.L((class08092)y);
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

