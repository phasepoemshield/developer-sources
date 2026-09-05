/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class01514
 *  minecraft.class04782
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06704
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
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
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class01514;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06130;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06704;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06109
extends class07796 {
    public static final MapCodec<class06109> N = class06109.y(class06109::new);
    public static final class08064<class07211> y = class06665.F;
    public static final class06667 L = class06665.d;

    public class06109(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return class07482.N((class00394)class072992.method_8321(class072092));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(y, (Comparable)class069422.L().b());
    }

    public MapCodec<class06109> N() {
        return N;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class00394 class003942 = class072992.method_8321(class072092);
            if (class003942 instanceof class06130) {
                class06130 class061302 = (class06130)class003942;
                class080362.method_17355((class06237)class061302);
                class080362.method_7281(class01235.Nv);
                class01514.N((class04782)class047822, (class08036)class080362, (boolean)true);
            }
        }
        return class07082.N;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00394 class003942 = class047822.method_8321(class072092);
        if (class003942 instanceof class06130) {
            ((class06130)class003942).u();
        }
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class06130(class072092, class005002);
    }

    protected boolean N(class00500 class005002) {
        return true;
    }
}

