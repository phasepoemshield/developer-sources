/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class01960
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08400
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class01960;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08400;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public abstract class class07768
extends class00891 {
    private static final class00494 L = class00891.y((double)14.0, (double)0.0, (double)0.5);
    private static final class00494 u = class00891.y((double)14.0, (double)0.0, (double)1.0);
    protected static final class00734 N = (class00734)class00891.y((double)14.0, (double)0.0, (double)4.0).method_1090().getFirst();
    protected final class01960 y;

    public class07768(class01362 class013622, class01960 class019602) {
        super(class013622.N(class019602.M()));
        this.y = class019602;
    }

    protected abstract int U(class00500 var1);

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (class072112 == class07211.field_11036) {
            return this.U(class005002);
        }
        return 0;
    }

    protected abstract int y(class07299 var1, class07209 var2);

    protected int y() {
        return 20;
    }

    protected static int N(class07299 class072992, class00734 class007342, Class<? extends class07049> clazz) {
        return class072992.N(clazz, class007342, class07042.R.and(class070492 -> !class070492.method_5696())).size();
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return this.U(class005002);
    }

    protected void N(class07299 class072992, class07209 class072092) {
        class072992.method_8408(class072092, (class00891)this);
        class072992.method_8408(class072092.method_10074(), (class00891)this);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (!bl && this.U(class005002) > 0) {
            this.N((class07299)class047822, class072092);
        }
    }

    protected abstract class00500 N(class00500 var1, int var2);

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (class072992.method_8608()) {
            return;
        }
        int n = this.U(class005002);
        if (n == 0) {
            this.N(class070492, class072992, class072092, class005002, n);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        int n = this.U(class005002);
        if (n > 0) {
            this.N(null, (class07299)class047822, class072092, class005002, n);
        }
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.U(class005002) > 0 ? L : u;
    }

    protected abstract MapCodec<? extends class07768> N();

    private void N(@Nullable class07049 class070492, class07299 class072992, class07209 class072092, class00500 class005002, int n) {
        boolean bl;
        int n2 = this.y(class072992, class072092);
        boolean bl2 = n > 0;
        boolean bl3 = bl = n2 > 0;
        if (n != n2) {
            class00500 class005003 = this.N(class005002, n2);
            class072992.method_8652(class072092, class005003, 2);
            this.N(class072992, class072092);
            class072992.method_16109(class072092, class005002, class005003);
        }
        if (!bl && bl2) {
            class072992.N(null, class072092, this.y.E(), class04911.field_15245);
            class072992.N(class070492, (class03556)class01194.i, class072092);
        } else if (bl && !bl2) {
            class072992.N(null, class072092, this.y.W(), class04911.field_15245);
            class072992.N(class070492, (class03556)class01194.N, class072092);
        }
        if (bl) {
            class072992.N(new class07209((class00753)class072092), (class00891)this, this.y());
        }
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        return class07768.L((class07290)class054872, (class07209)class072093) || class07768.N_6((class05487)class054872, (class07209)class072093, (class07211)class07211.field_11036);
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }

    public boolean c_(class00500 class005002) {
        return true;
    }
}

