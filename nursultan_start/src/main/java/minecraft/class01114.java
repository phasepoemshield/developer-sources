/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08978
 */
package minecraft;

import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class01194;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08978;

public abstract class class01114 {
    private static final int N = 5;
    private int y;
    private double L;

    public void L(class07299 class072992, class07209 class072092, class00500 class005002) {
        List<class08978> var4 = this.N(class072992, class072092);
        this.L = 0.0;
        for (class08978 class089782 : var4) {
            this.L = Math.max(class089782.method_72381(), this.L);
        }
        int n = this.y;
        int n2 = var4.size();
        if (n != n2) {
            boolean bl;
            boolean bl2 = n2 != 0;
            boolean bl3 = bl = n != 0;
            if (bl2 && !bl) {
                this.N(class072992, class072092, class005002);
                class072992.N(null, class01194.U, class072092);
            } else if (!bl2) {
                this.y(class072992, class072092, class005002);
                class072992.N(null, class01194.z, class072092);
            }
            this.y = n2;
        }
        this.N(class072992, class072092, class005002, n, n2);
        if (n2 > 0) {
            class01114.u(class072992, class072092, class005002);
        }
    }

    private static void u(class07299 class072992, class07209 class072092, class00500 class005002) {
        class072992.N(class072092, class005002.i(), 5);
    }

    protected abstract void y(class07299 var1, class07209 var2, class00500 var3);

    private boolean N(class07049 class070492, class07209 class072092) {
        class08978 class089782;
        if (class070492 instanceof class08978 && !(class089782 = (class08978)class070492).aB_().method_7325()) {
            return class089782.method_72380(this, class072092);
        }
        return false;
    }

    public int N() {
        return this.y;
    }

    protected abstract void N(class07299 var1, class07209 var2, class00500 var3);

    protected abstract void N(class07299 var1, class07209 var2, class00500 var3, int var4, int var5);

    public abstract boolean N(class08036 var1);

    public void N(class07438 class074382, class07299 class072992, class07209 class072092, class00500 class005002, double d) {
        int n;
        if ((n = this.y++) == 0) {
            this.N(class072992, class072092, class005002);
            class072992.N((class07049)class074382, class01194.U, class072092);
            class01114.u(class072992, class072092, class005002);
        }
        this.N(class072992, class072092, class005002, n, this.y);
        this.L = Math.max(d, this.L);
    }

    public void N(class07438 class074382, class07299 class072992, class07209 class072092, class00500 class005002) {
        int n = this.y--;
        if (this.y == 0) {
            this.y(class072992, class072092, class005002);
            class072992.N((class07049)class074382, class01194.z, class072092);
            this.L = 0.0;
        }
        this.N(class072992, class072092, class005002, n, this.y);
    }

    public List<class08978> N(class07299 class072992, class07209 class072092) {
        double d = this.L + 4.0;
        class00734 class007342 = new class00734(class072092).M(d);
        return class072992.method_8333((class07049)null, class007342, class070492 -> this.N((class07049)class070492, class072092)).stream().map(class070492 -> (class08978)class070492).collect(Collectors.toList());
    }
}

