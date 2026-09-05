/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01289
 *  minecraft.class04051
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class06293
 *  minecraft.class07049
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07438
 *  minecraft.class07633
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class01289;
import minecraft.class04051;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class06293;
import minecraft.class07049;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07438;
import minecraft.class07633;

public class class01485
extends class05765<class07633> {
    private static final int N = 3;
    private static final int y = 60;
    private static final int L = 110;
    private final class07078<? extends class07633> u;
    private final float i;
    private final int R;
    private static final int Z = 2;
    private long z;

    protected void L(class04782 class047822, class07633 class076332, long l) {
        class07633 class076333 = this.N(class076332);
        class06293.N((class07438)class076332, (class07438)class076333, (float)this.i, (int)this.R);
        if (!class076332.method_24516((class07049)class076333, 3.0)) {
            return;
        }
        if (l >= this.z) {
            class076332.N(class047822, class076333);
            class076332.method_18868().y(class05378.j);
            class076333.method_18868().y(class05378.j);
        }
    }

    private Optional<? extends class07633> L(class07633 class076332) {
        return ((class04051)class076332.method_18868().L(class05378.B).get()).N(class074382 -> {
            class07633 class076333;
            return class074382.method_5864() == this.u && class074382 instanceof class07633 && class076332.N(class076333 = (class07633)class074382) && !class076333.Nk();
        }).map(class07633.class::cast);
    }

    public class01485(class07078<? extends class07633> class070782) {
        this(class070782, 1.0f, 2);
    }

    public class01485(class07078<? extends class07633> class070782, float f, int n) {
        super((Map)ImmutableMap.of((Object)class05378.B, (Object)class05367.field_18456, (Object)class05378.j, (Object)class05367.field_18457, (Object)class05378.m, (Object)class05367.field_18458, (Object)class05378.P, (Object)class05367.field_18458, (Object)class05378.NN, (Object)class05367.field_18457), 110);
        this.u = class070782;
        this.i = f;
        this.R = n;
    }

    protected void u(class04782 class047822, class07633 class076332, long l) {
        class076332.method_18868().y(class05378.j);
        class076332.method_18868().y(class05378.m);
        class076332.method_18868().y(class05378.P);
        this.z = 0L;
    }

    private boolean y(class07633 class076332) {
        class01289 var2 = class076332.method_18868();
        return var2.N(class05378.j) && ((class07077)var2.L(class05378.j).get()).method_5864() == this.u;
    }

    protected boolean y(class04782 class047822, class07633 class076332, long l) {
        if (!this.y(class076332)) {
            return false;
        }
        class07633 class076333 = this.N(class076332);
        return class076333.method_5805() && class076332.N(class076333) && class06293.N((class01289)class076332.method_18868(), (class07438)class076333) && l <= this.z && !class076332.Nk() && !class076333.Nk();
    }

    protected void N(class04782 class047822, class07633 class076332, long l) {
        class07633 class076333 = this.L(class076332).get();
        class076332.method_18868().N(class05378.j, (Object)class076333);
        class076333.method_18868().N(class05378.j, (Object)class076332);
        class06293.N((class07438)class076332, (class07438)class076333, (float)this.i, (int)this.R);
        int n = 60 + class076332.method_59922().y(50);
        this.z = l + (long)n;
    }

    protected boolean N(class04782 class047822, class07633 class076332) {
        return class076332.NX() && this.L(class076332).isPresent();
    }

    private class07633 N(class07633 class076332) {
        return (class07633)class076332.method_18868().L(class05378.j).get();
    }
}

