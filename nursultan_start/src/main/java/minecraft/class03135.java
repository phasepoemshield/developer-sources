/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class03135
extends class00891 {
    public static final MapCodec<class03135> N = class03135.y(class03135::new);
    public static final class06667 y = class06665.k;
    public static final class06667 L = class06665.n;

    public class03135(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.W().y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)y, (Comparable)Boolean.valueOf(false)));
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, y});
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return (Boolean)class072992.method_8320(class072092).L((class08092)L) != false ? 15 : 0;
    }

    protected MapCodec<? extends class03135> N() {
        return N;
    }

    public void N(class00500 class005002, class04782 class047822, class07209 class072092) {
        boolean bl = class047822.W(class072092);
        if (bl == (Boolean)class005002.L((class08092)y)) {
            return;
        }
        class00500 class005003 = class005002;
        if (!((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class047822.N(null, class072092, (Boolean)(class005003 = (class00500)class005003.N((class08092)L)).L((class08092)L) != false ? class04909.MB : class04909.MZ, class04911.field_15245);
        }
        class047822.method_8652(class072092, (class00500)class005003.y((class08092)y, (Comparable)Boolean.valueOf(bl)), 3);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class005002, class047822, class072092);
        }
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005003.i() != class005002.i() && class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class005002, class047822, class072092);
        }
    }
}

