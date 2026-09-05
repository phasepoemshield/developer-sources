/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00737
 *  minecraft.class01210
 *  minecraft.class01289
 *  minecraft.class01328
 *  minecraft.class02135
 *  minecraft.class02148
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07209
 *  minecraft.class07323
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import minecraft.class00737;
import minecraft.class01210;
import minecraft.class01289;
import minecraft.class01328;
import minecraft.class02135;
import minecraft.class02148;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07209;
import minecraft.class07323;
import minecraft.class07438;

public class class01702
extends class05765<class02148> {
    public static final int N = 200;
    public static final float y = 1.65f;
    private final Function<class02148, class02135> L;
    private final class01328 u;
    private final float i;
    private final ToDoubleFunction<class02148> R;
    private class06889 Z;
    private final Function<class02148, class04891> z;
    private final Function<class02148, class04891> U;

    protected void L(class04782 class047822, class02148 class021482, long l) {
        List var5 = class047822.N(class07438.class, this.u, (class07438)class021482, class021482.method_5829());
        class01289 var6 = class021482.method_18868();
        if (!var5.isEmpty()) {
            float f;
            class07072 class070722;
            class07438 class074382 = (class07438)var5.get(0);
            if (class074382.method_64397(class047822, class070722 = class047822.method_48963().L((class07438)class021482), f = (float)class021482.method_45325(class05298.u))) {
                class07323.N((class04782)class047822, (class07049)class074382, (class07072)class070722);
            }
            int n = class021482.method_6059(class07047.N) ? class021482.method_6112(class07047.N).i() + 1 : 0;
            int n2 = class021482.method_6059(class07047.y) ? class021482.method_6112(class07047.y).i() + 1 : 0;
            float f2 = 0.25f * (float)(n - n2);
            float f3 = class04995.N((float)(class021482.method_6029() * 1.65f), (float)0.2f, (float)3.0f) + f2;
            class07072 class070723 = class047822.method_48963().y((class07438)class021482);
            float f4 = class074382.method_67346(class047822, class070723, f) > 0.0f ? 0.5f : 1.0f;
            class074382.method_6005((double)(f4 * f3) * this.R.applyAsDouble(class021482), this.Z.N(), this.Z.L());
            this.y(class047822, class021482);
            class047822.method_43129(null, (class07049)class021482, this.z.apply(class021482), class04911.field_15254, 1.0f, 1.0f);
        } else if (this.L(class047822, class021482)) {
            class047822.method_43129(null, (class07049)class021482, this.z.apply(class021482), class04911.field_15254, 1.0f, 1.0f);
            boolean bl = class021482.t();
            if (bl) {
                class047822.method_43129(null, (class07049)class021482, this.U.apply(class021482), class04911.field_15254, 1.0f, 1.0f);
            }
            this.y(class047822, class021482);
        } else {
            boolean bl;
            Optional var7 = var6.L(class05378.m);
            Optional var8 = var6.L(class05378.D);
            boolean bl2 = bl = var7.isEmpty() || var8.isEmpty() || ((class05352)var7.get()).N().N().N((class00737)var8.get(), 0.25);
            if (bl) {
                this.y(class047822, class021482);
            }
        }
    }

    private boolean L(class04782 class047822, class02148 class021482) {
        class06889 class068892 = class021482.method_18798().u(1.0, 0.0, 1.0).u();
        class07209 class072092 = class07209.method_49638((class00737)class021482.method_73189().i(class068892));
        return class047822.method_8320(class072092).N(class01210.LO) || class047822.method_8320(class072092.method_10084()).N(class01210.LO);
    }

    public class01702(Function<class02148, class02135> function, class01328 class013282, float f, ToDoubleFunction<class02148> toDoubleFunction, Function<class02148, class04891> function2, Function<class02148, class04891> function3) {
        super((Map)ImmutableMap.of((Object)class05378.x, (Object)class05367.field_18457, (Object)class05378.D, (Object)class05367.field_18456), 200);
        this.L = function;
        this.u = class013282;
        this.i = f;
        this.R = toDoubleFunction;
        this.z = function2;
        this.U = function3;
        this.Z = class06889.L;
    }

    protected void u(class04782 class047822, class02148 class021482, long l) {
        class07209 class072092 = class021482.method_24515();
        class01289 var6 = class021482.method_18868();
        class06889 class068892 = (class06889)var6.L(class05378.D).get();
        this.Z = new class06889((double)class072092.method_10263() - class068892.N(), 0.0, (double)class072092.method_10260() - class068892.L()).u();
        var6.N(class05378.m, (Object)new class05352(class068892, this.i, 0));
    }

    protected void y(class04782 class047822, class02148 class021482) {
        class047822.method_8421((class07049)class021482, (byte)59);
        class021482.method_18868().N(class05378.x, (Object)this.L.apply(class021482).N(class047822.field_9229));
        class021482.method_18868().y(class05378.D);
    }

    protected boolean N(class04782 class047822, class02148 class021482) {
        return class021482.method_18868().N(class05378.D);
    }

    protected boolean N(class04782 class047822, class02148 class021482, long l) {
        return class021482.method_18868().N(class05378.D);
    }
}

