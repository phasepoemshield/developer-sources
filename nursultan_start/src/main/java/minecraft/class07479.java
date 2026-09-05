/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10757
 *  Nursultan.class10760
 *  minecraft.class00683
 *  minecraft.class01894
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class07610
 *  minecraft.class07862
 *  minecraft.class08044
 */
package minecraft;

import Nursultan.class10757;
import Nursultan.class10760;
import minecraft.class00683;
import minecraft.class01894;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class07610;
import minecraft.class07862;
import minecraft.class08044;

public class class07479
extends class07610 {
    private static final class01894 j = class01894.y((String)"container/slot/saddle");
    private static final class01894 v = class01894.y((String)"container/slot/llama_armor");
    private static final class01894 n = class01894.y((String)"container/slot/horse_armor");

    public class07479(int n, class08044 class080442, class06695 class066952, class07862 class078622, int n2) {
        super(n, class080442, class066952, (class07438)class078622);
        class06695 class066953 = class078622.y_6(class07085.field_55946);
        this.N((class06937)new class10757(this, class066953, (class07438)class078622, class07085.field_55946, 0, 8, 18, j, class078622));
        boolean bl = class078622 instanceof class00683;
        class01894 class018942 = bl ? v : class07479.n;
        class06695 class066954 = class078622.y_6(class07085.field_48824);
        this.N((class06937)new class10760(this, class066954, (class07438)class078622, class07085.field_48824, 0, 8, 36, class018942, class078622, bl));
        if (n2 > 0) {
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < n2; ++j) {
                    this.N(new class06937(class066952, j + i * n2, 80 + j * 18, 18 + i * 18));
                }
            }
        }
        this.L((class06695)class080442, 8, 84);
    }

    protected boolean N(class06695 class066952) {
        return ((class07862)this.y).N(class066952);
    }
}

