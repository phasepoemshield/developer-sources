/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 */
package minecraft;

import java.util.Map;
import minecraft.class01964;
import minecraft.class01972;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;

class class01985
extends class05765<class01964> {
    protected void y(class04782 class047822, class01964 class019642, long l) {
        boolean bl = this.N(l);
        class019642.N(class01972.field_42665).N(bl);
        class019642.method_18868().y(class05378.yu);
        class019642.method_18868().N(class05378.yi, (Object)true);
    }

    class01985(int n) {
        super(Map.of(class05378.NN, class05367.field_18457, class05378.m, class05367.field_18457, class05378.yu, class05367.field_18456, class05378.NF, class05367.field_18456), n, n);
    }

    protected void u(class04782 class047822, class01964 class019642, long l) {
        class019642.N(class01972.field_42671);
    }

    protected boolean N(class04782 class047822, class01964 class019642, long l) {
        return class019642.method_18868().L(class05378.yu).isPresent();
    }

    protected boolean N(class04782 class047822, class01964 class019642) {
        return true;
    }
}

