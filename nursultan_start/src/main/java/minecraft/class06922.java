/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05851
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class07075
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08978
 */
package minecraft;

import minecraft.class05851;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class06948;
import minecraft.class07075;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08978;

public class class06922
extends class07482 {
    private static final int y = 27;
    public final class06695 N;

    public class06922(int n, class08044 class080442) {
        this(n, class080442, (class06695)new class07075(27));
    }

    public class06922(int n, class08044 class080442, class06695 class066952) {
        super(class05851.field_17341, n);
        class06922.N((class06695)class066952, (int)27);
        this.N = class066952;
        class066952.method_5435((class08978)class080442.z);
        int n2 = 3;
        int n3 = 9;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.N(new class06948(class066952, j + i * 9, 8 + j * 18, 18 + i * 18));
            }
        }
        this.L((class06695)class080442, 8, 84);
    }

    public void y(class08036 class080362) {
        super.y(class080362);
        this.N.method_5432((class08978)class080362);
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            if (n < this.N.method_5439() ? !this.N(class065843, this.N.method_5439(), this.T.size(), true) : !this.N(class065843, 0, this.N.method_5439(), false)) {
                return class06584.E;
            }
            if (class065843.R()) {
                class069372.u(class06584.E);
            } else {
                class069372.M();
            }
        }
        return class065842;
    }

    public boolean N(class08036 class080362) {
        return this.N.method_5443(class080362);
    }
}

