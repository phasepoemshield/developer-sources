/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class04782
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05368
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class06289
 *  minecraft.class06293
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08041
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class04782;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05368;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class06289;
import minecraft.class06293;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08041;

public class class05939
extends class05765<class08041> {
    private static final int y = 1200;
    final float N;

    protected void L(class04782 class047822, class08041 class080412, long l) {
        class080412.method_18868().L(class05378.u).ifPresent(class062892 -> {
            class07209 class072092 = class062892.y();
            class04782 class047823 = class047822.method_8503().N(class062892.N());
            if (class047823 == null) {
                return;
            }
            class05368 class053682 = class047823.method_19494();
            if (class053682.N(class072092, (T class035562) -> true)) {
                class053682.y(class072092);
            }
            class047822.method_74535().y(class072092);
        });
        class080412.method_18868().y(class05378.u);
    }

    public class05939(float f) {
        super((Map)ImmutableMap.of((Object)class05378.u, (Object)class05367.field_18456), 1200);
        this.N = f;
    }

    protected void y(class04782 class047822, class08041 class080412, long l) {
        class06293.N((class07438)class080412, (class07209)((class06289)class080412.method_18868().L(class05378.u).get()).y(), (float)this.N, (int)1);
    }

    protected boolean N(class04782 class047822, class08041 class080412) {
        return class080412.method_18868().R().map(class053592 -> class053592 == class05359.y || class053592 == class05359.L || class053592 == class05359.u).orElse(true);
    }

    protected boolean N(class04782 class047822, class08041 class080412, long l) {
        return class080412.method_18868().N(class05378.u);
    }
}

