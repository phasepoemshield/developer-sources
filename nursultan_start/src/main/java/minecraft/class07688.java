/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07030
 *  minecraft.class07209
 *  minecraft.class07237
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08092
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07030;
import minecraft.class07209;
import minecraft.class07237;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08092;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public abstract class class07688
extends class07796 {
    public static final class06667 N = class06665.k;
    private final class07030 y;

    public class07688(class07030 class070302, class01362 class013622) {
        super(class013622);
        this.y = class070302;
        this.P((class00500)((class00500)this.Q.y()).y((class08092)N, (Comparable)Boolean.valueOf(false)));
    }

    public class07030 y() {
        return this.y;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{N});
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y((class08092)N, (Comparable)Boolean.valueOf(class069422.method_8045().W(class069422.method_8037())));
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class072992.method_8608()) {
            return;
        }
        boolean bl2 = class072992.W(class072092);
        if (bl2 != (Boolean)class005002.L((class08092)N)) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)N, (Comparable)Boolean.valueOf(bl2)), 2);
        }
    }

    protected abstract MapCodec<? extends class07688> N();

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        if (class072992.method_8608() && (class005002.N(class00869.BI) || class005002.N(class00869.BJ) || class005002.N(class00869.Bo) || class005002.N(class00869.Bq))) {
            return class07688.N(class004042, (class00404)class00404.field_11913, class07237::N);
        }
        return null;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07237(class072092, class005002);
    }
}

