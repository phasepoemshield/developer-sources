/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 */
package minecraft;

import java.util.Map;
import minecraft.class01964;
import minecraft.class01972;
import minecraft.class04782;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;

class class01953
extends class05765<class01964> {
    protected void y(class04782 class047822, class01964 class019642, long l) {
        boolean bl = this.N(l);
        class019642.N(class01972.field_42665);
        if (bl) {
            class019642.t().ifPresent(class072092 -> {
                class019642.method_18868().N(class05378.yL, class072092);
                class019642.method_18868().N(class05378.m, (Object)new class05352(class072092, 1.25f, 0));
            });
        }
    }

    class01953(int n, int n2) {
        super(Map.of(class05378.m, class05367.field_18457, class05378.yL, class05367.field_18457, class05378.NF, class05367.field_18457), n, n2);
    }

    protected void u(class04782 class047822, class01964 class019642, long l) {
        class019642.N(class01972.field_42668);
    }

    protected boolean N(class04782 class047822, class01964 class019642, long l) {
        return class019642.v();
    }

    protected boolean N(class04782 class047822, class01964 class019642) {
        return !class019642.method_6109() && class019642.v();
    }
}

