/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00549
 *  minecraft.class01296
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class07299
 *  minecraft.class08050
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00549;
import minecraft.class01166;
import minecraft.class01187;
import minecraft.class01296;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class07299;
import minecraft.class08050;
import org.jspecify.annotations.Nullable;

public class class01178<T extends class01187> {
    private final T N;
    private @Nullable class01296 y;

    public void L(class04782 class047822) {
        this.N.N().N((class07299)class047822).map(class01296::N).ifPresent(class012962 -> {
            if (this.y == null || !this.y.equals(class012962)) {
                class01178.N((class05487)class047822, this.y, class011662 -> class011662.y((class01187)this.N));
                this.y = class012962;
                class01178.N((class05487)class047822, this.y, class011662 -> class011662.N((class01187)this.N));
            }
        });
    }

    public class01178(T t) {
        this.N = t;
    }

    public void y(class04782 class047822) {
        class01178.N((class05487)class047822, this.y, class011662 -> class011662.y((class01187)this.N));
    }

    private static void N(class05487 class054872, @Nullable class01296 class012962, Consumer<class01166> consumer) {
        if (class012962 == null) {
            return;
        }
        class08050 class080502 = class054872.method_8402(class012962.N(), class012962.L(), class00549.m, false);
        if (class080502 != null) {
            consumer.accept(class080502.N(class012962.y()));
        }
    }

    public void N(class04782 class047822) {
        this.L(class047822);
    }

    public T N() {
        return this.N;
    }
}

