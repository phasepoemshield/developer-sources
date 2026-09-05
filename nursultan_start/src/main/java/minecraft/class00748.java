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
 *  minecraft.class04782
 *  minecraft.class06183
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06704
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07242
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
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
import minecraft.class04782;
import minecraft.class06183;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06704;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07242;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public abstract class class00748
extends class07796 {
    public static final class08064<class07211> N = class07101.R;
    public static final class06667 y = class06665.n;

    public class00748(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(N, (Comparable)class07211.field_11043)).y((class08092)y, (Comparable)Boolean.valueOf(false)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(N, (Comparable)class069932.N((class07211)class005002.L(N)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(N)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{N, y});
    }

    protected static <T extends class00394> @Nullable class01118<T> N(class07299 class072993, class00404<T> class004042, class00404<? extends class07242> class004043) {
        class01118 class011182;
        if (class072993 instanceof class04782) {
            class04782 class047822 = (class04782)class072993;
            class011182 = class00748.N(class004042, class004043, (class072992, class072092, class005002, class072422) -> class07242.N((class04782)class047822, (class07209)class072092, (class00500)class005002, (class07242)class072422));
        } else {
            class011182 = null;
        }
        return class011182;
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return class07482.N((class00394)class072992.method_8321(class072092));
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class072992.method_8608()) {
            this.N(class072992, class072092, class080362);
        }
        return class07082.N;
    }

    protected abstract void N(class07299 var1, class07209 var2, class08036 var3);

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(N, (Comparable)class069422.method_8042().b());
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected abstract MapCodec<? extends class00748> N();
}

