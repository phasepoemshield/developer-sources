/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00947
 *  minecraft.class07948
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class00947;
import minecraft.class04864;
import minecraft.class07948;
import org.jspecify.annotations.Nullable;

class class04850
implements Supplier<class07948> {
    final class00947 N;
    private @Nullable class07948 L;
    final /* synthetic */ class04864 y;

    class04850(class04864 class048642, class00947 class009472) {
        this.y = class048642;
        this.N = class009472;
    }

    @Override
    public class07948 get() {
        if (this.L == null) {
            this.L = this.N.N(this.y.y);
        }
        return this.L;
    }
}

