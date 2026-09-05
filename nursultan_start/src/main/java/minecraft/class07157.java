/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01328
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class08036
 */
package minecraft;

import java.util.Comparator;
import java.util.List;
import minecraft.class01328;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07155;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class08036;

class class07157
extends class07473 {
    private final class01328 y = class01328.N().N(64.0);
    private int L = class07157.y((int)20);
    final /* synthetic */ class07155 N;

    class07157(class07155 class071552) {
        this.N = class071552;
    }

    public boolean y() {
        class07438 class074382 = this.N.T();
        if (class074382 != null) {
            return this.N.N(class07157.N_18((class07299)this.N.method_73183()), class074382, class01328.N);
        }
        return false;
    }

    public boolean N() {
        if (this.L > 0) {
            --this.L;
            return false;
        }
        this.L = class07157.y((int)60);
        class04782 class047822 = class07157.N_18((class07299)this.N.method_73183());
        List var2 = class047822.N(this.y, (class07438)this.N, this.N.method_5829().L(16.0, 64.0, 16.0));
        if (!var2.isEmpty()) {
            var2.sort(Comparator.comparing(class07049::method_23318).reversed());
            for (class08036 class080362 : var2) {
                if (!this.N.N(class047822, (class07438)class080362, class01328.N)) continue;
                this.N.y((class07438)class080362);
                return true;
            }
        }
        return false;
    }
}

