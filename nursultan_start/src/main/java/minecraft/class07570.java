/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10769
 *  Nursultan.class10771
 *  minecraft.class01894
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class07610
 *  minecraft.class08044
 *  minecraft.class08156
 */
package minecraft;

import Nursultan.class10769;
import Nursultan.class10771;
import minecraft.class01894;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class07610;
import minecraft.class08044;
import minecraft.class08156;

public class class07570
extends class07610 {
    private static final class01894 j = class01894.y((String)"container/slot/saddle");
    private static final class01894 v = class01894.y((String)"container/slot/nautilus_armor_inventory");

    public class07570(int n, class08044 class080442, class06695 class066952, class08156 class081562, int n2) {
        super(n, class080442, class066952, (class07438)class081562);
        class06695 class066953 = class081562.y_6(class07085.field_55946);
        this.N((class06937)new class10769(this, class066953, (class07438)class081562, class07085.field_55946, 0, 8, 18, j, class081562));
        class06695 class066954 = class081562.y_6(class07085.field_48824);
        this.N((class06937)new class10771(this, class066954, (class07438)class081562, class07085.field_48824, 0, 8, 36, v, class081562));
        this.L((class06695)class080442, 8, 84);
    }

    protected boolean N(class06695 class066952) {
        return ((class08156)this.y).N(class066952);
    }
}

