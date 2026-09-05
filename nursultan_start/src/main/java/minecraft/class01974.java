/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class06244
 */
package minecraft;

import java.util.Map;
import minecraft.class01964;
import minecraft.class01972;
import minecraft.class01984;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class06244;

class class01974
extends class05765<class01964> {
    protected void y(class04782 class047822, class01964 class019642, long l) {
        if (this.N(l)) {
            class019642.method_18868().N(class05378.NF, (Object)class06244.field_17274, 9600L);
        } else {
            class01984.N(class019642);
        }
    }

    class01974(int n, int n2) {
        super(Map.of(class05378.NN, class05367.field_18457, class05378.m, class05367.field_18457, class05378.yu, class05367.field_18456, class05378.NF, class05367.field_18457), n, n2);
    }

    protected void u(class04782 class047822, class01964 class019642, long l) {
        class019642.N(class01972.field_42670);
    }

    protected boolean N(class04782 class047822, class01964 class019642, long l) {
        return class019642.method_18868().L(class05378.yu).isPresent() && class019642.G() && !class019642.NX();
    }

    protected boolean N(class04782 class047822, class01964 class019642) {
        return class019642.v();
    }
}

