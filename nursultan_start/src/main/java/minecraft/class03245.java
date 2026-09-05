/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class06937
 *  minecraft.class07482
 *  minecraft.class08394
 */
package minecraft;

import java.util.List;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class08394;

public class class03245 {
    private static final int N = 30;
    private static final int y = 16;
    private static final int L = 4;
    private final int u;
    private List<class01894> i = List.of();
    private int R;
    private int M;

    public class03245(int n) {
        this.u = n;
    }

    private float N(float f) {
        return Math.min((float)(this.R % 30) + f, 4.0f) / 4.0f;
    }

    private void N(class06937 class069372, class01894 class018942, float f, class01054 class010542, int n, int n2) {
        class010542.N(class08394.Na, class018942, n + class069372.i, n2 + class069372.R, 16, 16, class02566.y((float)f));
    }

    public void N(class07482 class074822, class01054 class010542, float f, int n, int n2) {
        float f2;
        class06937 class069372 = class074822.L(this.u);
        if (this.i.isEmpty() || class069372.R()) {
            return;
        }
        float f3 = f2 = this.i.size() > 1 && this.R >= 30 ? this.N(f) : 1.0f;
        if (f2 < 1.0f) {
            int n3 = Math.floorMod(this.M - 1, this.i.size());
            this.N(class069372, this.i.get(n3), 1.0f - f2, class010542, n, n2);
        }
        this.N(class069372, this.i.get(this.M), f2, class010542, n, n2);
    }

    public void N(List<class01894> list) {
        if (!this.i.equals(list)) {
            this.i = list;
            this.M = 0;
        }
        if (!this.i.isEmpty() && ++this.R % 30 == 0) {
            this.M = (this.M + 1) % this.i.size();
        }
    }
}

