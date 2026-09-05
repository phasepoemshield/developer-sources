/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08092;
import minecraft.class08713;

public class class06994
extends class00891 {
    public static final MapCodec<class06994> y = class06994.y(class06994::new);
    public static final class06667 L = class06665.g;

    public class06994(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    protected static boolean U(class00500 class005002) {
        return class005002.N(class01210.yH);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    protected MapCodec<? extends class06994> N() {
        return y;
    }

    public class00500 N(class06942 class069422) {
        class00500 class005002 = class069422.method_8045().method_8320(class069422.method_8037().method_10084());
        return (class00500)this.W().y((class08092)L, (Comparable)Boolean.valueOf(class06994.U(class005002)));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11036) {
            return (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(class06994.U(class005003)));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }
}

