/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11367
 *  Nursultan.class11938
 *  it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class01210
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class05465
 *  minecraft.class05538
 *  minecraft.class05668
 *  minecraft.class05847
 *  minecraft.class06183
 *  minecraft.class06506
 *  minecraft.class06517
 *  minecraft.class06525
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08092
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11367;
import Nursultan.class11938;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class01210;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class05465;
import minecraft.class05538;
import minecraft.class05668;
import minecraft.class05847;
import minecraft.class06183;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06525;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08092;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07486
extends class05668 {
    public static final double N = 4.0;
    protected static final double y = 16.0;
    public static final Predicate<class07438> L = class074382 -> class074382.method_29503() || class074382.method_5809();
    private boolean u;

    protected double method_7490() {
        return 0.05;
    }

    public class07486(class07078<? extends class07486> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class07486(class07078<? extends class07486> class070782, class07299 class072992, double d, double d2, double d3, class06584 class065842) {
        super(class070782, d, d2, d3, class072992, class065842);
    }

    public class07486(class07078<? extends class07486> class070782, class07299 class072992, class07438 class074382, class06584 class065842) {
        super(class070782, class074382, class072992, class065842);
    }

    private void y(class04782 class047822) {
        class00734 class007342 = this.method_5829().L(4.0, 2.0, 4.0);
        for (class07438 class074382 : this.method_73183().N(class07438.class, class007342, L)) {
            double d = this.method_5858((class07049)class074382);
            if (!(d < 16.0)) continue;
            if (class074382.method_29503()) {
                class074382.method_64397(class047822, this.method_48923().L((class07049)this, this.z()), 1.0f);
            }
            if (!class074382.method_5809() || !class074382.method_5805()) continue;
            class074382.method_46395();
        }
        List list = this.method_73183().N(class05538.class, class007342);
        Iterator var5 = list.iterator();
        while (var5.hasNext()) {
            class05538 class055382 = (class05538)var5.next();
            class055382.W();
        }
    }

    protected void N(class06183 class061832) {
        super.N(class061832);
        if (this.method_73183().method_8608()) {
            return;
        }
        class06584 class065842 = this.L();
        class07211 class072112 = class061832.i();
        class07209 class072092 = class061832.u().method_10093(class072112);
        if (((class06517)class065842.a_(class02484.h, (Object)class06517.N)).N(class06506.N)) {
            this.N(class072092);
            this.N(class072092.method_10093(class072112.b()));
            for (class07211 class072113 : class07221.field_11062) {
                this.N(class072092.method_10093(class072113));
            }
        }
    }

    private void N(class07089 class070892, CallbackInfo callbackInfo) {
        class07486 class074862 = this;
        if (class074862.method_73183().method_8608() && !this.u) {
            class11367 class113672 = class11367.N((class07486)class074862, (class07089)class070892);
            class11938.L().L((Object)class113672);
            this.u = true;
        }
    }

    protected void N(class07089 class070892) {
        super.N(class070892);
        this.N(class070892, null);
        class07299 class072992 = this.method_73183();
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class072992 = this.L();
        class06517 class065172 = (class06517)class072992.a_(class02484.h, (Object)class06517.N);
        if (class065172.N(class06506.N)) {
            this.y(class047822);
        } else if (class065172.L()) {
            this.N(class047822, (class06584)class072992, class070892);
        }
        int n = class065172.i().isPresent() && ((class06525)((class03556)class065172.i().get()).N()).L() ? 2007 : 2002;
        class047822.N(n, this.method_24515(), class065172.y());
        this.method_31472();
    }

    protected abstract void N(class04782 var1, class06584 var2, class07089 var3);

    private void N(class07209 class072092) {
        class00500 class005002 = this.method_73183().method_8320(class072092);
        if (class005002.N(class01210.Nh)) {
            this.method_73183().N(class072092, false, (class07049)this);
        } else if (class05465.T((class00500)class005002)) {
            class05465.N(null, (class00500)class005002, (class07284)this.method_73183(), (class07209)class072092);
        } else if (class05847.U((class00500)class005002)) {
            this.method_73183().method_8444(null, 1009, class072092, 0);
            class05847.N((class07049)this.z(), (class07284)this.method_73183(), (class07209)class072092, (class00500)class005002);
            this.method_73183().method_8501(class072092, (class00500)class005002.y((class08092)class05847.y, (Comparable)Boolean.valueOf(false)));
        }
    }

    public DoubleDoubleImmutablePair a_(class07438 class074382, class07072 class070722) {
        double d = class074382.method_73189().M - this.method_73189().M;
        double d2 = class074382.method_73189().Z - this.method_73189().Z;
        return DoubleDoubleImmutablePair.of((double)d, (double)d2);
    }
}

