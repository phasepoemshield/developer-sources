/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class03589
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07082
 *  minecraft.class07126
 *  minecraft.class07138
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class03589;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06781;
import minecraft.class06942;
import minecraft.class07082;
import minecraft.class07126;
import minecraft.class07138;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;

public class class06859
extends class06781 {
    public static final MapCodec<class06859> N = class06859.y(class06859::new);
    public static final class06667 y = class06665.t;
    public static final class08071 u = class06665.Ng;

    public class06859(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)R, (Comparable)class07211.field_11043)).y((class08092)u, (Comparable)Integer.valueOf(1))).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    @Override
    protected int U(class00500 class005002) {
        return (Integer)class005002.L((class08092)u) * 2;
    }

    @Override
    protected boolean y() {
        return true;
    }

    @Override
    public boolean y(class05487 class054872, class07209 class072092, class00500 class005002) {
        return this.N((class03589)class054872, class072092, class005002) > 0;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (!((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return;
        }
        class07211 class072112 = (class07211)class005002.L((class08092)R);
        double d = (double)class072092.method_10263() + 0.5 + (class060692.U() - 0.5) * 0.2;
        double d2 = (double)class072092.method_10264() + 0.4 + (class060692.U() - 0.5) * 0.2;
        double d3 = (double)class072092.method_10260() + 0.5 + (class060692.U() - 0.5) * 0.2;
        float f = -5.0f;
        if (class060692.Z()) {
            f = (Integer)class005002.L((class08092)u) * 2 - 1;
        }
        double d4 = (f /= 16.0f) * (float)class072112.P();
        double d5 = f * (float)class072112.T();
        class072992.method_8406((class07126)class07138.y, d + d4, d2, d3 + d5, 0.0, 0.0, 0.0);
    }

    public MapCodec<class06859> N() {
        return N;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R, u, y, L});
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033 && !this.N(class054872, class072093, class005003)) {
            return class00869.N.W();
        }
        if (!class054872.method_8608() && class072112.z() != ((class07211)class005002.L((class08092)R)).z()) {
            return (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(this.y(class054872, class072092, class005002)));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    @Override
    public class00500 N(class06942 class069422) {
        class00500 class005002 = super.N(class069422);
        return (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(this.y((class05487)class069422.method_8045(), class069422.method_8037(), class005002)));
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class080362.method_31549().i) {
            return class07082.i;
        }
        class072992.method_8652(class072092, (class00500)class005002.N((class08092)u), 3);
        return class07082.N;
    }
}

