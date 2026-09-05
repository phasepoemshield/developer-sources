/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class02903
 *  minecraft.class02950
 *  minecraft.class03507
 *  minecraft.class03729
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05845
 *  minecraft.class05851
 *  minecraft.class05853
 *  minecraft.class05857
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06919
 *  minecraft.class06937
 *  minecraft.class07482
 *  minecraft.class07495
 *  minecraft.class07508
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08978
 */
package minecraft;

import minecraft.class01726;
import minecraft.class01748;
import minecraft.class01753;
import minecraft.class01929;
import minecraft.class02903;
import minecraft.class02950;
import minecraft.class03507;
import minecraft.class03729;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05845;
import minecraft.class05851;
import minecraft.class05853;
import minecraft.class05857;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06919;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07495;
import minecraft.class07508;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08978;

public class class01712
extends class07482
implements class07508 {
    protected static final int N = 9;
    private static final int y = 9;
    private static final int L = 36;
    private static final int u = 36;
    private static final int i = 45;
    private final class06919 R = new class06919();
    private final class05845 j;
    private final class08036 v;
    private final class03507 n;

    public class01712(int n, class08044 class080442) {
        super(class05851.field_46790, n);
        this.v = class080442.z;
        this.j = new class05853(10);
        this.n = new class07495((class07482)this, 3, 3);
        this.N(class080442);
    }

    public class01712(int n, class08044 class080442, class03507 class035072, class05845 class058452) {
        super(class05851.field_46790, n);
        this.v = class080442.z;
        this.j = class058452;
        this.n = class035072;
        class01712.N((class06695)class035072, (int)9);
        class035072.method_5435((class08978)class080442.z);
        this.N(class080442);
        this.N(this);
    }

    private void m() {
        class08036 class080362 = this.v;
        if (class080362 instanceof class04770) {
            class080362 = ((class04770)class080362).method_51469();
            class02903 class029032 = this.n.u();
            class06584 class065842 = class01748.N((class04782)class080362, class029032).map(arg_0 -> class01712.N(class029032, (class04782)class080362, arg_0)).orElse(class06584.E);
            this.R.method_5447(0, class065842);
        }
    }

    public boolean E() {
        return this.j.N(9) == 1;
    }

    public boolean N(class08036 class080362) {
        return this.n.method_5443(class080362);
    }

    public void N(class07482 class074822, int n, class06584 class065842) {
        this.m();
    }

    public void N(class07482 class074822, int n, int n2) {
    }

    private static /* synthetic */ class06584 N(class02903 class029032, class04782 class047822, class03729 class037292) {
        return ((class05857)class037292.y()).method_8116((class02950)class029032, (class01929)class047822.method_30349());
    }

    private void N(class08044 class080442) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                int n = j + i * 3;
                this.N(new class01726((class06695)this.n, n, 26 + j * 18, 17 + i * 18, this));
            }
        }
        this.L((class06695)class080442, 8, 84);
        this.N(new class01753((class06695)this.R, 0, 134, 35));
        this.N(this.j);
        this.m();
    }

    public void N(int n, boolean bl) {
        class01726 class017262 = (class01726)this.L(n);
        this.j.N(class017262.u, bl ? 0 : 1);
        this.u();
    }

    public boolean N(int n) {
        if (n > -1 && n < 9) {
            return this.j.N(n) == 1;
        }
        return false;
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            if (n < 9 ? !this.N(class065843, 9, 45, true) : !this.N(class065843, 0, 9, false)) {
                return class06584.E;
            }
            if (class065843.R()) {
                class069372.i(class06584.E);
            } else {
                class069372.M();
            }
            if (class065843.c() == class065842.c()) {
                return class06584.E;
            }
            class069372.N(class080362, class065843);
        }
        return class065842;
    }

    public class06695 W() {
        return this.n;
    }
}

