/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06942
 *  minecraft.class07188
 *  minecraft.class07208
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08713
 *  minecraft.class08791
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06942;
import minecraft.class07188;
import minecraft.class07208;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08713;
import minecraft.class08791;

public class class00733
extends class00891 {
    public static final MapCodec<class00733> N = class00733.y(class00733::new);
    private static final class00494 y = class00891.y((double)16.0, (double)0.0, (double)15.0);

    public class00733(class01362 class013622) {
        super(class013622);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class07208.N(null, (class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public MapCodec<class00733> N() {
        return N;
    }

    public class00500 N(class06942 class069422) {
        if (!this.W().N((class05487)class069422.method_8045(), class069422.method_8037())) {
            return class00891.N_19((class00500)this.W(), (class00500)class00869.z.W(), (class07284)class069422.method_8045(), (class07209)class069422.method_8037());
        }
        return super.N(class069422);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11036 && !class005002.N(class054872, class072092)) {
            class087132.N(class072092, (class00891)this, 1);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class00500 class005003 = class054872.method_8320(class072092.method_10084());
        return !class005003.B() || class005003.i() instanceof class07188;
    }
}

