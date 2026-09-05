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

public class class07490
extends class07482 {
    private final class06695 N;
    private final int y;

    public static class07490 L(int n, class08044 class080442) {
        return new class07490(class05851.field_17326, n, class080442, 3);
    }

    public class07490(class05851<?> class058512, int n, class08044 class080442, class06695 class066952, int n2) {
        super(class058512, n);
        class07490.N(class066952, n2 * 9);
        this.N = class066952;
        this.y = n2;
        class066952.method_5435((class08978)class080442.z);
        int n3 = 18;
        this.u(class066952, 8, 18);
        int n4 = 18 + this.y * 18 + 13;
        this.L((class06695)class080442, 8, n4);
    }

    public class07490(class05851<?> class058512, int n, class08044 class080442, int n2) {
        this(class058512, n, class080442, (class06695)new class07075(9 * n2), n2);
    }

    public static class07490 i(int n, class08044 class080442) {
        return new class07490(class05851.field_18667, n, class080442, 5);
    }

    public static class07490 u(int n, class08044 class080442) {
        return new class07490(class05851.field_18666, n, class080442, 4);
    }

    private void u(class06695 class066952, int n, int n2) {
        for (int i = 0; i < this.y; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.N(new class06937(class066952, j + i * 9, n + j * 18, n2 + i * 18));
            }
        }
    }

    @Override
    public void y(class08036 class080362) {
        super.y(class080362);
        this.N.method_5432((class08978)class080362);
    }

    public static class07490 y(int n, class08044 class080442, class06695 class066952) {
        return new class07490(class05851.field_17327, n, class080442, class066952, 6);
    }

    public static class07490 y(int n, class08044 class080442) {
        return new class07490(class05851.field_18665, n, class080442, 2);
    }

    public class06695 E() {
        return this.N;
    }

    public static class07490 N(int n, class08044 class080442) {
        return new class07490(class05851.field_18664, n, class080442, 1);
    }

    @Override
    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            if (n < this.y * 9 ? !this.N(class065843, this.y * 9, this.T.size(), true) : !this.N(class065843, 0, this.y * 9, false)) {
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

    public static class07490 N(int n, class08044 class080442, class06695 class066952) {
        return new class07490(class05851.field_17326, n, class080442, class066952, 3);
    }

    @Override
    public boolean N(class08036 class080362) {
        return this.N.method_5443(class080362);
    }

    public int W() {
        return this.y;
    }

    public static class07490 R(int n, class08044 class080442) {
        return new class07490(class05851.field_17327, n, class080442, 6);
    }
}

