/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03507
 *  minecraft.class03729
 *  minecraft.class04056
 *  minecraft.class04393
 *  minecraft.class04782
 *  minecraft.class05851
 *  minecraft.class05857
 *  minecraft.class06695
 *  minecraft.class06910
 *  minecraft.class06919
 *  minecraft.class06923
 *  minecraft.class06930
 *  minecraft.class06937
 *  minecraft.class07482
 *  minecraft.class07495
 *  minecraft.class08036
 *  minecraft.class08044
 */
package minecraft;

import java.util.List;
import minecraft.class02741;
import minecraft.class02743;
import minecraft.class03507;
import minecraft.class03729;
import minecraft.class04056;
import minecraft.class04393;
import minecraft.class04782;
import minecraft.class05851;
import minecraft.class05857;
import minecraft.class06695;
import minecraft.class06910;
import minecraft.class06919;
import minecraft.class06923;
import minecraft.class06930;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07495;
import minecraft.class08036;
import minecraft.class08044;

public abstract class class02763
extends class06923 {
    private final int N;
    private final int y;
    protected final class03507 I;
    protected final class06919 J = new class06919();

    public class02763(class05851<?> class058512, int n, int n2, int n3) {
        super(class058512, n);
        this.N = n2;
        this.y = n3;
        this.I = new class07495((class07482)this, n2, n3);
    }

    public int b() {
        return this.N;
    }

    protected abstract class08036 s();

    public abstract List<class06937> m();

    public int j() {
        return this.y;
    }

    protected void u(int n, int n2) {
        for (int i = 0; i < this.N; ++i) {
            for (int j = 0; j < this.y; ++j) {
                this.N(new class06937((class06695)this.I, j + i * this.N, n + j * 18, n2 + i * 18));
            }
        }
    }

    protected void E() {
    }

    protected class06937 N(class08036 class080362, int n, int n2) {
        return this.N((class06937)new class06930(class080362, this.I, (class06695)this.J, 0, n, n2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class06910 N(boolean bl, boolean bl2, class03729<?> class037292, class04782 class047822, class08044 class080442) {
        class03729<?> class037293 = class037292;
        this.E();
        try {
            List<class06937> var7 = this.m();
            class06910 class069102 = class04393.N((class04056)new class02743(this), (int)this.N, (int)this.y, var7, var7, (class08044)class080442, class037293, (boolean)bl, (boolean)bl2);
            return class069102;
        }
        finally {
            this.N(class047822, class037293);
        }
    }

    protected void N(class04782 class047822, class03729<class05857> class037292) {
    }

    public void N(class02741 class027412) {
        this.I.N(class027412);
    }

    public abstract class06937 W();
}

