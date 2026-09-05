/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class05779
 *  minecraft.class07209
 */
package minecraft;

import java.util.Map;
import java.util.Optional;
import minecraft.class01964;
import minecraft.class01972;
import minecraft.class04782;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class05779;
import minecraft.class07209;

class class01961
extends class05765<class01964> {
    protected void y(class04782 class047822, class01964 class019642, long l) {
        if (class019642.G() && class019642.v()) {
            class019642.method_18868().N(class05378.yu, (Object)true);
        }
        class019642.method_18868().y(class05378.m);
        class019642.method_18868().y(class05378.yL);
    }

    class01961() {
        super(Map.of(class05378.m, class05367.field_18456, class05378.NN, class05367.field_18457, class05378.yL, class05367.field_18456), 600);
    }

    protected void u(class04782 class047822, class01964 class019642, long l) {
        class019642.N(class01972.field_42669);
    }

    protected boolean N(class04782 class047822, class01964 class019642, long l) {
        if (!class019642.v()) {
            class019642.N(class01972.field_42665);
            return false;
        }
        Optional<class07209> optional = class019642.method_18868().L(class05378.m).map(class05352::N).map(class05779::y);
        Optional var6 = class019642.method_18868().L(class05378.yL);
        if (optional.isEmpty() || var6.isEmpty()) {
            return false;
        }
        return ((class07209)var6.get()).equals((Object)optional.get());
    }

    protected boolean N(class04782 class047822, class01964 class019642) {
        return class019642.v();
    }
}

