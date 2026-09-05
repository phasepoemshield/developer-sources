/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00651
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06667
 *  minecraft.class06993
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07126
 *  minecraft.class07138
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00651;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06667;
import minecraft.class06896;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07126;
import minecraft.class07138;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class06882
extends class06896 {
    public static final MapCodec<class06882> N = class06882.y(class06882::new);
    public static final class08064<class07211> y = class07101.R;
    public static final class06667 L = class06896.i;

    public class06882(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)Boolean.valueOf(true)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    @Override
    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue() && class005002.L(y) != class072112) {
            return 15;
        }
        return 0;
    }

    @Override
    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    @Override
    protected @Nullable class02733 N(class07299 class072992, class00500 class005002) {
        return class02752.N((class07299)class072992, (class07211)((class07211)class005002.L(y)).b(), (class07211)class07211.field_11036);
    }

    public MapCodec<class06882> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return class00651.U((class00500)class005002);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112.b() == class005002.L(y) && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return class005002;
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = class00869.LH.N(class069422);
        return class005002 == null ? null : (class00500)this.W().y(y, (Comparable)((class07211)class005002.L(y)));
    }

    @Override
    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (!((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return;
        }
        class07211 class072112 = ((class07211)class005002.L(y)).b();
        double d = 0.27;
        double d2 = (double)class072092.method_10263() + 0.5 + (class060692.U() - 0.5) * 0.2 + 0.27 * (double)class072112.P();
        double d3 = (double)class072092.method_10264() + 0.7 + (class060692.U() - 0.5) * 0.2 + 0.22;
        double d4 = (double)class072092.method_10260() + 0.5 + (class060692.U() - 0.5) * 0.2 + 0.27 * (double)class072112.T();
        class072992.method_8406((class07126)class07138.y, d2, d3, d4, 0.0, 0.0, 0.0);
    }

    @Override
    protected boolean N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class07211 class072112 = ((class07211)class005002.L(y)).b();
        return class072992.L(class072092.method_10093(class072112), class072112);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class00651.y((class05487)class054872, (class07209)class072092, (class07211)((class07211)class005002.L(y)));
    }
}

