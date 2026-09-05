/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00549
 *  minecraft.class02796
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class06265
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class08771
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import minecraft.class00549;
import minecraft.class02796;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class06265;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class08771;
import org.jspecify.annotations.Nullable;

public class class09959
implements class08771 {
    private @Nullable class06265 L;
    private int u;
    private int i;
    final /* synthetic */ int N;
    final /* synthetic */ class02796 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09959(class02796 class027962, int n) {
        this.y = class027962;
        this.N = n;
    }

    public int N() {
        return this.N;
    }

    public @Nullable class00549 N(int n, int n2) {
        if (this.L == null) {
            return null;
        }
        return this.L.L(class07321.u((int)(n + this.u - this.N), (int)(n2 + this.i - this.N)));
    }

    public void N(class05946<class07299> class059462, class07321 class073212) {
        class04782 class047822 = this.y.N(class059462);
        this.L = class047822 != null ? class047822.method_14178().L : null;
        this.u = class073212.B;
        this.i = class073212.Z;
    }
}

