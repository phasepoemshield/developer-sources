/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class01210
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class06289
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07789
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class01210;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05758;
import minecraft.class05765;
import minecraft.class06289;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07789;
import minecraft.class08092;

public class class05752
extends class05765<class07438> {
    public static final int N = 100;
    private long y;

    public class05752() {
        super((Map<class05378<?>, class05367>)ImmutableMap.of((Object)class05378.y, (Object)class05367.field_18456, (Object)class05378.K, (Object)class05367.field_18458));
    }

    @Override
    protected void u(class04782 class047822, class07438 class074382, long l) {
        if (l > this.y) {
            class01289 var5 = class074382.method_18868();
            if (var5.N(class05378.G)) {
                Optional<List<class07438>> optional;
                Set var6 = (Set)var5.L(class05378.G).get();
                if (var5.N(class05378.M)) {
                    Optional var7 = var5.L(class05378.M);
                } else {
                    optional = Optional.empty();
                }
                class05758.N(class047822, class074382, null, null, var6, optional);
            }
            class074382.method_18403(((class06289)class074382.method_18868().L(class05378.y).get()).y());
        }
    }

    @Override
    protected void y(class04782 class047822, class07438 class074382, long l) {
        if (class074382.method_6113()) {
            class074382.method_18400();
            this.y = l + 40L;
        }
    }

    @Override
    protected boolean N(class04782 class047822, class07438 class074382, long l) {
        Optional var5 = class074382.method_18868().L(class05378.y);
        if (var5.isEmpty()) {
            return false;
        }
        class07209 class072092 = ((class06289)var5.get()).y();
        return class074382.method_18868().L(class05359.i) && class074382.method_23318() > (double)class072092.method_10264() + 0.4 && class072092.method_19769((class00737)class074382.method_73189(), 1.14);
    }

    @Override
    protected boolean N(long l) {
        return false;
    }

    @Override
    protected boolean N(class04782 class047822, class07438 class074382) {
        long l;
        if (class074382.method_5765()) {
            return false;
        }
        class01289 var3 = class074382.method_18868();
        class06289 class062892 = (class06289)var3.L(class05378.y).get();
        if (class047822.method_27983() != class062892.N()) {
            return false;
        }
        Optional var5 = var3.L(class05378.K);
        if (var5.isPresent() && (l = class047822.N() - (Long)var5.get()) > 0L && l < 100L) {
            return false;
        }
        class00500 class005002 = class047822.method_8320(class062892.y());
        return class062892.y().method_19769((class00737)class074382.method_73189(), 2.0) && class005002.N(class01210.F) && (Boolean)class005002.L((class08092)class07789.L) == false;
    }
}

