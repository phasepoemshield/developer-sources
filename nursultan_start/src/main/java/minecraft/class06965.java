/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00429
 *  minecraft.class00437
 *  minecraft.class01296
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05372
 *  minecraft.class05377
 *  minecraft.class06244
 *  minecraft.class07209
 *  minecraft.class07280
 *  minecraft.class07321
 */
package minecraft;

import java.util.function.BiConsumer;
import minecraft.class00381;
import minecraft.class00429;
import minecraft.class00437;
import minecraft.class01296;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05372;
import minecraft.class05377;
import minecraft.class06244;
import minecraft.class06968;
import minecraft.class07209;
import minecraft.class07280;
import minecraft.class07321;

public class class06965
extends class06968<class06244> {
    public class06965() {
        super(class00429.U);
    }

    private void y(class04782 class047822, class07209 class072092) {
        class06965.N(class047822, class01296.N((class07209)class072092), (class012962, bl) -> {
            class07209 class072092 = class012962.U();
            if (bl.booleanValue()) {
                this.N(class047822, new class07321(class072092), (class00381<class07280>)new class00437(class072092, this.N.N((Object)class06244.field_17274)));
            } else {
                this.N(class047822, new class07321(class072092), (class00381<class07280>)new class00437(class072092, this.N.N()));
            }
        });
    }

    @Override
    protected void y(class04770 class047702, class07321 class073212) {
        class04782 class047822 = class047702.method_51469();
        class047822.method_19494().N((T class035562) -> true, class073212, class05372.field_18489).forEach(class053772 -> {
            class01296 class012963 = class01296.N((class07209)class053772.M());
            class06965.N(class047822, class012963, (class012962, bl) -> {
                class07209 class072092 = class012962.U();
                class047702.field_13987.method_14364((class00381)new class00437(class072092, this.N.N(bl != false ? class06244.field_17274 : null)));
            });
        });
    }

    private static void N(class04782 class047822, class01296 class012962, BiConsumer<class01296, Boolean> biConsumer) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    class01296 class012963 = class012962.method_34592(j, k, i);
                    if (class047822.method_19500(class012963.U())) {
                        biConsumer.accept(class012963, true);
                        continue;
                    }
                    biConsumer.accept(class012963, false);
                }
            }
        }
    }

    public void N(class04782 class047822, class07209 class072092) {
        this.y(class047822, class072092);
    }

    public void N(class04782 class047822, class05377 class053772) {
        this.y(class047822, class053772.M());
    }
}

