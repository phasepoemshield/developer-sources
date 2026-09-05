/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class02484
 *  minecraft.class02847
 *  minecraft.class03556
 *  minecraft.class04770
 *  minecraft.class06501
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Collection;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02484;
import minecraft.class02847;
import minecraft.class03556;
import minecraft.class04770;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06560
extends class06581 {
    public class06560(class06573 class065732) {
        super(class065732);
    }

    private static <T extends Comparable<T>> class00500 N(class00500 class005002, class08092<T> class080922, boolean bl) {
        return (class00500)class005002.y(class080922, class06560.N(class080922.N(), class005002.L(class080922), bl));
    }

    private static <T> T N(Iterable<T> iterable, @Nullable T t, boolean bl) {
        return (T)(bl ? class07536.y(iterable, t) : class07536.N(iterable, t));
    }

    private static void N(class08036 class080362, class00392 class003922) {
        ((class04770)class080362).method_43502(class003922, true);
    }

    private static <T extends Comparable<T>> String N(class00500 class005002, class08092<T> class080922) {
        return class080922.y(class005002.L(class080922));
    }

    private boolean N(class08036 class080362, class00500 class005002, class07284 class072842, class07209 class072092, boolean bl, class06584 class065842) {
        if (!class080362.method_7338()) {
            return false;
        }
        class03556 var7 = class005002.R();
        Collection var9 = ((class00891)var7.N()).E().u();
        if (var9.isEmpty()) {
            class06560.N(class080362, (class00392)class00392.N((String)(this.W + ".empty"), (Object[])new Object[]{var7.M()}));
            return false;
        }
        class02847 class028472 = (class02847)class065842.method_58694(class02484.Ni);
        if (class028472 == null) {
            return false;
        }
        class08092 var11 = (class08092)class028472.N().get(var7);
        if (bl) {
            if (var11 == null) {
                var11_10 = (class08092)var9.iterator().next();
            }
            class00500 class005003 = class06560.N(class005002, var11_10, class080362.method_21823());
            class072842.method_8652(class072092, class005003, 18);
            class06560.N(class080362, (class00392)class00392.N((String)(this.W + ".update"), (Object[])new Object[]{var11_10.R(), class06560.N(class005003, var11_10)}));
        } else {
            var11_10 = (class08092)class06560.N(var9, var11_10, class080362.method_21823());
            class065842.N(class02484.Ni, class028472.N(var7, var11_10));
            class06560.N(class080362, (class00392)class00392.N((String)(this.W + ".select"), (Object[])new Object[]{var11_10.R(), class06560.N(class005002, var11_10)}));
        }
        return true;
    }

    @Override
    public class07082 N(class06501 class065012) {
        class07209 class072092;
        class08036 class080362 = class065012.method_8036();
        class07299 class072992 = class065012.method_8045();
        if (!class072992.method_8608() && class080362 != null && !this.N(class080362, class072992.method_8320(class072092 = class065012.method_8037()), (class07284)class072992, class072092, true, class065012.method_8041())) {
            return class07082.u;
        }
        return class07082.N;
    }

    @Override
    public boolean N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class07438 class074382) {
        if (!class072992.method_8608() && class074382 instanceof class08036) {
            class08036 class080362 = (class08036)class074382;
            this.N(class080362, class005002, (class07284)class072992, class072092, false, class065842);
        }
        return false;
    }
}

