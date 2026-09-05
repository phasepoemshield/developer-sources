/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class06293
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07075
 *  minecraft.class07078
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08041
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05672;
import minecraft.class05765;
import minecraft.class06293;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07075;
import minecraft.class07078;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08041;

public class class05759
extends class05765<class08041> {
    private Set<class06581> N = ImmutableSet.of();

    @Override
    protected void L(class04782 class047822, class08041 class080412, long l) {
        class08041 class080413 = (class08041)class080412.method_18868().L(class05378.b).get();
        if (class080412.method_5858((class07049)class080413) > 5.0) {
            return;
        }
        class06293.N((class07438)class080412, (class07438)class080413, (float)0.5f, (int)2);
        class080412.N(class047822, class080413, l);
        boolean bl = class080412.t().y().N(class05672.M);
        if (class080412.w() && (bl || class080413.Y())) {
            class05759.N(class080412, class08041.y.keySet(), (class07438)class080413);
        }
        if (bl && class080412.n().N_61(class06570.bL) > class06570.bL.M() / 2) {
            class05759.N(class080412, (Set<class06581>)ImmutableSet.of((Object)class06570.bL), (class07438)class080413);
        }
        if (!this.N.isEmpty() && class080412.n().N_13(this.N)) {
            class05759.N(class080412, this.N, (class07438)class080413);
        }
    }

    public class05759() {
        super((Map<class05378<?>, class05367>)ImmutableMap.of((Object)class05378.b, (Object)class05367.field_18456, (Object)class05378.B, (Object)class05367.field_18456));
    }

    @Override
    protected void u(class04782 class047822, class08041 class080412, long l) {
        class080412.method_18868().y(class05378.b);
    }

    @Override
    protected void y(class04782 class047822, class08041 class080412, long l) {
        class08041 class080413 = (class08041)class080412.method_18868().L(class05378.b).get();
        class06293.N((class07438)class080412, (class07438)class080413, (float)0.5f, (int)2);
        this.N = class05759.N(class080412, class080413);
    }

    @Override
    protected boolean N(class04782 class047822, class08041 class080412) {
        return class06293.N((class01289)class080412.method_18868(), (class05378)class05378.b, (class07078)class07078.ye);
    }

    @Override
    protected boolean N(class04782 class047822, class08041 class080412, long l) {
        return this.N(class047822, class080412);
    }

    private static Set<class06581> N(class08041 class080412, class08041 class080413) {
        ImmutableSet<class06581> var2 = ((class05672)((Object)class080413.t().y().N())).u();
        ImmutableSet<class06581> var3 = ((class05672)((Object)class080412.t().y().N())).u();
        return var2.stream().filter(class065812 -> !var3.contains(class065812)).collect(Collectors.toSet());
    }

    private static void N(class08041 class080412, Set<class06581> set, class07438 class074382) {
        class07075 class070752 = class080412.n();
        class06584 class065842 = class06584.E;
        for (int i = 0; i < class070752.method_5439(); ++i) {
            int n;
            class06581 class065812;
            class06584 class065843 = class070752.method_5438(i);
            if (class065843.R() || !set.contains(class065812 = class065843.B())) continue;
            if (class065843.c() > class065843.U() / 2) {
                n = class065843.c() / 2;
            } else {
                if (class065843.c() <= 24) continue;
                n = class065843.c() - 24;
            }
            class065843.B(n);
            class065842 = new class06584((class07310)class065812, n);
            break;
        }
        if (!class065842.R()) {
            class06293.N((class07438)class080412, (class06584)class065842, (class06889)class074382.method_73189());
        }
    }
}

