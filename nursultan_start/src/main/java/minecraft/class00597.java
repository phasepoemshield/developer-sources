/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00579;
import minecraft.class00607;
import org.jspecify.annotations.Nullable;

class class00597<Value> {
    private Value y;
    private @Nullable Value L;
    final /* synthetic */ class00579 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class00597(class00579 class005792, class00607 class006072) {
        this.N = class005792;
        Value Value = this.N(class006072);
        this.y = Value;
        this.L = Value;
    }

    public Value N(class00607<Value> class006072, float f) {
        if (this.L == null) {
            this.L = this.N(class006072);
        }
        return class006072.N().M().apply(f, this.y, this.L);
    }

    public boolean N() {
        if (this.L == null) {
            return true;
        }
        this.y = this.L;
        this.L = null;
        return false;
    }

    private Value N(class00607<Value> class006072) {
        if (this.N.N == null || this.N.y == null) {
            return class006072.y();
        }
        return this.N.N.method_75728().N(class006072, this.N.y, this.N.L);
    }
}

