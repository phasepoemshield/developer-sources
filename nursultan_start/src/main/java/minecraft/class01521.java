/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09473
 *  minecraft.class00743
 *  minecraft.class04995
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 */
package minecraft;

import Nursultan.class09473;
import minecraft.class00743;
import minecraft.class01488;
import minecraft.class04995;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;

public class class01521
extends class07482 {
    public final class00743<class06584> N = class00743.method_10211();
    private final class07482 y;

    public class06584 M() {
        return this.y.M();
    }

    public class01521(class08036 class080362) {
        super(null, 0);
        this.y = class080362.fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
        class08044 class080442 = class080362.method_31548();
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.N((class06937)new class09473((class06695)class01488.N, i * 9 + j, 9 + j * 18, 18 + i * 18));
            }
        }
        this.N((class06695)class080442, 9, 112);
        this.y(0.0f);
    }

    public void y(float f) {
        int n = this.N(f);
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 9; ++j) {
                int n2 = j + (i + n) * 9;
                if (n2 >= 0 && n2 < this.N.size()) {
                    class01488.N.method_5447(j + i * 9, (class06584)this.N.get(n2));
                    continue;
                }
                class01488.N.method_5447(j + i * 9, class06584.E);
            }
        }
    }

    public boolean y(class06937 class069372) {
        return class069372.L != class01488.N;
    }

    protected int E() {
        return class04995.R((int)this.N.size(), (int)9) - 5;
    }

    public class06584 N(class08036 class080362, int n) {
        class06937 class069372;
        if (n >= this.T.size() - 9 && n < this.T.size() && (class069372 = (class06937)this.T.get(n)) != null && class069372.R()) {
            class069372.u(class06584.E);
        }
        return class06584.E;
    }

    public boolean N(class06584 class065842, class06937 class069372) {
        return class069372.L != class01488.N;
    }

    public void N(class06584 class065842) {
        this.y.N(class065842);
    }

    public boolean N(class08036 class080362) {
        return true;
    }

    protected float N(int n) {
        return class04995.N((float)((float)n / (float)this.E()), (float)0.0f, (float)1.0f);
    }

    protected int N(float f) {
        return Math.max((int)((double)(f * (float)this.E()) + 0.5), 0);
    }

    protected float N(float f, double d) {
        return class04995.N((float)(f - (float)(d / (double)this.E())), (float)0.0f, (float)1.0f);
    }

    public boolean W() {
        return this.N.size() > 45;
    }
}

