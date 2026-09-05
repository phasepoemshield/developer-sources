/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10544
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07075
 *  minecraft.class07482
 *  minecraft.class08036
 */
package minecraft;

import Nursultan.class10544;
import minecraft.class05845;
import minecraft.class05851;
import minecraft.class05853;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07075;
import minecraft.class07482;
import minecraft.class08036;

public class class05856
extends class07482 {
    private static final int i = 1;
    private static final int R = 1;
    public static final int N = 1;
    public static final int y = 2;
    public static final int L = 3;
    public static final int u = 100;
    private final class06695 j;
    private final class05845 v;

    public class05856(int n) {
        this(n, (class06695)new class07075(1), new class05853(1));
    }

    public class05856(int n, class06695 class066952, class05845 class058452) {
        super(class05851.field_17338, n);
        class05856.N((class06695)class066952, (int)1);
        class05856.N((class05845)class058452, (int)1);
        this.j = class066952;
        this.v = class058452;
        this.N((class06937)new class10544(this, class066952, 0, 0, 0));
        this.N(class058452);
    }

    public void y(int n, int n2) {
        super.y(n, n2);
        this.u();
    }

    public boolean y(class08036 class080362, int n) {
        if (n >= 100) {
            int n2 = n - 100;
            this.y(0, n2);
            return true;
        }
        switch (n) {
            case 2: {
                int n3 = this.v.N(0);
                this.y(0, n3 + 1);
                return true;
            }
            case 1: {
                int n4 = this.v.N(0);
                this.y(0, n4 - 1);
                return true;
            }
            case 3: {
                if (!class080362.method_7294()) {
                    return false;
                }
                class06584 class065842 = this.j.method_5441(0);
                this.j.method_5431();
                if (!class080362.method_31548().M(class065842)) {
                    class080362.method_7328(class065842, false);
                }
                return true;
            }
        }
        return false;
    }

    public class06584 E() {
        return this.j.method_5438(0);
    }

    public boolean N(class08036 class080362) {
        return this.j.method_5443(class080362);
    }

    public class06584 N(class08036 class080362, int n) {
        return class06584.E;
    }

    public int W() {
        return this.v.N(0);
    }
}

