/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01286
 *  minecraft.class04782
 *  minecraft.class07046
 *  minecraft.class07049
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01286;
import minecraft.class04782;
import minecraft.class07046;
import minecraft.class07049;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

class class01868
extends class07046 {
    private final boolean L;

    public class01868(class01286 class012862, int n, boolean bl) {
        super(class012862, n);
        this.L = bl;
    }

    public boolean N(class04782 class047822, class07438 class074382, int n) {
        if (this.L == class074382.method_5999()) {
            class074382.method_6025((float)Math.max(4 << n, 0));
        } else {
            class074382.method_64397(class047822, class074382.method_48923().T(), (float)(6 << n));
        }
        return true;
    }

    public void N(class04782 class047822, @Nullable class07049 class070492, @Nullable class07049 class070493, class07438 class074382, int n, double d) {
        if (this.L == class074382.method_5999()) {
            int n2 = (int)(d * (double)(4 << n) + 0.5);
            class074382.method_6025((float)n2);
        } else {
            int n3 = (int)(d * (double)(6 << n) + 0.5);
            if (class070492 == null) {
                class074382.method_64397(class047822, class074382.method_48923().T(), (float)n3);
            } else {
                class074382.method_64397(class047822, class074382.method_48923().L(class070492, class070493), (float)n3);
            }
        }
    }
}

