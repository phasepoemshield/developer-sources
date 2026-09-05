/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00880
 *  minecraft.class01929
 *  minecraft.class06646
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Set;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00880;
import minecraft.class01929;
import minecraft.class06646;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

class class00862
implements class00880 {
    private final class00500 N;
    private final Set<class08092<?>> y;
    private final @Nullable class07001 L;

    public class00862(class00500 class005002, Set<class08092<?>> set, @Nullable class07001 class070012) {
        this.N = class005002;
        this.y = set;
        this.L = class070012;
    }

    public boolean test(class06646 class066462) {
        class00500 class005002 = class066462.N();
        if (!class005002.N(this.N.i())) {
            return false;
        }
        for (class08092<?> var4 : this.y) {
            if (class005002.L(var4) == this.N.L(var4)) continue;
            return false;
        }
        if (this.L != null) {
            class00394 class003942 = class066462.y();
            return class003942 != null && class07717.N((class07709)this.L, (class07709)class003942.y_2((class01929)class066462.L().method_30349()), (boolean)true);
        }
        return true;
    }

    public boolean N() {
        return this.L != null;
    }
}

