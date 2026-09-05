/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05851
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07075
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08978
 */
package minecraft;

import minecraft.class05851;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07075;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08978;

public class class07502
extends class07482 {
    private static final int N = 9;
    private static final int y = 9;
    private static final int L = 36;
    private static final int u = 36;
    private static final int i = 45;
    private final class06695 R;

    public class07502(int n, class08044 class080442) {
        this(n, class080442, (class06695)new class07075(9));
    }

    public class07502(int n, class08044 class080442, class06695 class066952) {
        super(class05851.field_17328, n);
        class07502.N(class066952, 9);
        this.R = class066952;
        class066952.method_5435((class08978)class080442.z);
        this.u(class066952, 62, 17);
        this.L((class06695)class080442, 8, 84);
    }

    protected void u(class06695 class066952, int n, int n2) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                int n3 = j + i * 3;
                this.N(new class06937(class066952, n3, n + j * 18, n2 + i * 18));
            }
        }
    }

    @Override
    public void y(class08036 class080362) {
        super.y(class080362);
        this.R.method_5432((class08978)class080362);
    }

    @Override
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
                class069372.u(class06584.E);
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

    @Override
    public boolean N(class08036 class080362) {
        return this.R.method_5443(class080362);
    }
}

