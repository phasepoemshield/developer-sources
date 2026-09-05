/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10500
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class03286
 *  minecraft.class03658
 *  minecraft.class03661
 *  minecraft.class03668
 *  minecraft.class03690
 *  minecraft.class03725
 *  minecraft.class04141
 *  minecraft.class04927
 *  minecraft.class05362
 *  minecraft.class05966
 *  minecraft.class06363
 *  minecraft.class06366
 */
package minecraft;

import Nursultan.class10500;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class03286;
import minecraft.class03658;
import minecraft.class03661;
import minecraft.class03668;
import minecraft.class03690;
import minecraft.class03725;
import minecraft.class04141;
import minecraft.class04927;
import minecraft.class05200;
import minecraft.class05213;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05966;
import minecraft.class06363;
import minecraft.class06366;

public class class05208
extends class03286 {
    private static final class00392 L = class00392.L((String)"createWorld.tab.world.title");
    private static final class00392 u = class00392.L((String)"generator.minecraft.amplified.info");
    private static final class00392 i = class00392.L((String)"selectWorld.mapFeatures");
    private static final class00392 R = class00392.L((String)"selectWorld.mapFeatures.info");
    private static final class00392 M = class00392.L((String)"selectWorld.bonusItems");
    private static final class00392 B = class00392.L((String)"selectWorld.enterSeed");
    public static final class00392 N = class00392.L((String)"selectWorld.seedInfo");
    private static final int z = 310;
    private final class04927 U;
    private final class05362 E;
    final /* synthetic */ class05213 y;

    class05208(class05213 class052132) {
        this.y = class052132;
        super(L);
        class02080 class020802 = this.Z.N(10).y(8).u(2);
        class06366 class063663 = (class06366)class020802.N((class02102)class06366.N(class03690::N, (Object)class052132.R.W()).N(this.y()).N_57(class05208::N).N(0, 0, 150, 20, (class00392)class00392.L((String)"selectWorld.mapType"), (class063662, class036902) -> this.y.R.N(class036902)));
        class063663.N((Object)class052132.R.W());
        class052132.R.N((T class036612) -> {
            class03690 class036902 = class036612.W();
            class063663.N((Object)class036902);
            if (class036902.y()) {
                class063663.method_47400(class04141.N((class00392)u));
            } else {
                class063663.method_47400(null);
            }
            class063662.field_22763 = this.y.R.W().L() != null;
        });
        this.E = (class05362)class020802.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectWorld.customizeType"), class053622 -> this.N()).N());
        class052132.R.N((T class036612) -> {
            this.E.field_22763 = !class036612.E() && class036612.m() != null;
        });
        this.U = new class10500(this, class05213.L(class052132), 308, 20, (class00392)class00392.L((String)"selectWorld.enterSeed"), class052132);
        this.U.method_47404(N);
        this.U.method_1852(class052132.R.B());
        this.U.method_1863(string -> this.y.R.y(this.U.method_1882()));
        class020802.N((class02102)class03725.N((class01590)class05213.u(class052132), (class02102)this.U, (class00392)B), 2);
        class03658 class036582 = class03668.N((int)310);
        class036582.N(i, () -> ((class03661)class052132.R).Z(), arg_0 -> ((class03661)class052132.R).y(arg_0)).N(() -> !this.y.R.E()).N(R);
        class036582.N(M, () -> ((class03661)class052132.R).z(), arg_0 -> ((class03661)class052132.R).L(arg_0)).N(() -> !this.y.R.R() && !this.y.R.E());
        class03668 class036682 = class036582.y();
        class020802.N((class02102)class036682.N(), 2);
        class052132.R.N((T class036612) -> class036682.y());
    }

    private class06363<class03690> y() {
        return new class05200(this);
    }

    private static class05216 N(class06366<class03690> class063662) {
        if (((class03690)class063662.y()).y()) {
            return class05220.N(new class00392[]{class063662.L(), u});
        }
        return class063662.L();
    }

    private void N() {
        class05966 class059662 = this.y.R.m();
        if (class059662 != null) {
            class05213.i(this.y).N(class059662.createEditScreen(this.y, this.y.R.U()));
        }
    }
}

