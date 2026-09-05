/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
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
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class06081
extends class00891
implements class06084 {
    public static final MapCodec<class06081> N = class06081.y(class06081::new);
    private static final class06667 y = class06665.q;
    private static final class00494 L = class00891.y((double)12.0, (double)10.0, (double)16.0);

    public class06081(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false)));
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    public MapCodec<class06081> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11036 && !this.a_(class005002, class054872, class072092)) {
            return class00869.N.W();
        }
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return L;
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = super.N(class069422);
        if (class005002 != null) {
            class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
            return (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
        }
        return null;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10084();
        return class054872.method_8320(class072093).L((class07290)class054872, class072093, class07211.field_11033);
    }
}

