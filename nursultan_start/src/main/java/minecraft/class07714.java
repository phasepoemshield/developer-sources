/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01137
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class04782
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07253
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08070
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01137;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class04782;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07253;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08070;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class07714
extends class07796
implements class01137 {
    public static final MapCodec<class07714> N = class07714.y(class07714::new);
    public static final class08064<class08070> y = class06665.yP;

    public class07714(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y(y, (Comparable)class08070.field_12697));
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class00394 class003942 = class072992.method_8321(class072092);
        if (!(class003942 instanceof class07253)) {
            return;
        }
        class07253 class072532 = (class07253)class003942;
        boolean bl2 = class072992.W(class072092);
        boolean bl3 = class072532.n();
        if (bl2 && !bl3) {
            class072532.u(true);
            this.N((class04782)class072992, class072532);
        } else if (!bl2 && bl3) {
            class072532.u(false);
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    private void N(class04782 class047822, class07253 class072532) {
        switch (class072532.E()) {
            case field_12695: {
                class072532.L(false);
                break;
            }
            case field_12697: {
                class072532.L(class047822);
                break;
            }
            case field_12699: {
                class072532.j();
                break;
            }
            case field_12696: {
                break;
            }
        }
    }

    public MapCodec<class07714> N() {
        return N;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        class00394 class003942;
        if (class072992.method_8608()) {
            return;
        }
        if (class074382 != null && (class003942 = class072992.method_8321(class072092)) instanceof class07253) {
            ((class07253)class003942).N(class074382);
        }
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class07253) {
            return ((class07253)class003942).N(class080362) ? class07082.N : class07082.i;
        }
        return class07082.i;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07253(class072092, class005002);
    }
}

