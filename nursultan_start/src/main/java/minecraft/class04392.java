/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02484
 *  minecraft.class02841
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06898
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02484;
import minecraft.class02841;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06898;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;

public class class04392
extends class00891
implements class06084 {
    public static final MapCodec<class04392> N = class04392.y(class04392::new);
    public static final int y = 15;
    public static final class08071 L = class06665.Nf;
    public static final class06667 u = class06665.q;
    public static final ToIntFunction<class00500> i = class005002 -> (Integer)class005002.L((class08092)L);

    public class04392(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(15))).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected float y(class00500 class005002, class07290 class072902, class07209 class072092) {
        return 1.0f;
    }

    protected boolean y(class00500 class005002) {
        return class005002.Y().W();
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class072992.method_8608() && class080362.method_7338()) {
            class072992.method_8652(class072092, (class00500)class005002.N((class08092)L), 2);
            return class07082.y;
        }
        return class07082.L;
    }

    public MapCodec<class04392> N() {
        return N;
    }

    public static class06584 N(class06584 class065842, int n) {
        class065842.N(class02484.Nl, (Object)class02841.N.N((class08092)L, (Comparable)Integer.valueOf(n)));
        return class065842;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, u});
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return class04392.N(super.N(class054872, class072092, class005002, bl), (Integer)class005002.L((class08092)L));
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return class060922.N(class06570.Zt) ? class00389.y() : class00389.N();
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class06898 d_(class00500 class005002) {
        return class06898.field_11455;
    }
}

