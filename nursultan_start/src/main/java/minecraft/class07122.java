/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01362
 *  minecraft.class02232
 *  minecraft.class02484
 *  minecraft.class04782
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06704
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07249
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08983
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01362;
import minecraft.class02232;
import minecraft.class02484;
import minecraft.class04782;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06704;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07249;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08983;
import org.jspecify.annotations.Nullable;

public class class07122
extends class07796 {
    public static final MapCodec<class07122> N = class07122.y(class07122::new);
    public static final class06667 y = class06665.T;

    public class07122(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false)));
    }

    public int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        class00394 class003942 = class072902.method_8321(class072092);
        if (class003942 instanceof class07249 && ((class07249)class003942).L().N()) {
            return 15;
        }
        return 0;
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    public MapCodec<class07122> N() {
        return N;
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class07249) {
            return ((class07249)class003942).B();
        }
        return 0;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return class07122.N(class004042, (class00404)class00404.field_11907, class07249::N);
        }
        return null;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        super.N(class072992, class072092, class005002, class074382, class065842);
        class08983 class089832 = (class08983)class065842.method_58694(class02484.NB);
        if (class089832 != null && class089832.N("RecordItem")) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(true)), 2);
        }
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942;
        if (((Boolean)class005002.L((class08092)y)).booleanValue() && (class003942 = class072992.method_8321(class072092)) instanceof class07249) {
            ((class07249)class003942).M();
            return class07082.N;
        }
        return class07082.i;
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return class07082.R;
        }
        class06584 class065843 = class080362.method_5998(class070502);
        class07082 class070822 = class02232.N((class07299)class072992, (class07209)class072092, (class06584)class065843, (class08036)class080362);
        if (!class070822.N()) {
            return class07082.R;
        }
        return class070822;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07249(class072092, class005002);
    }

    public boolean i_(class00500 class005002) {
        return true;
    }
}

