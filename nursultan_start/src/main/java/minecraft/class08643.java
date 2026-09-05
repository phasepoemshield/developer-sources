/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02233
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02233;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class08394;
import minecraft.class08657;

public class class08643
implements class08657 {
    private static final class01894 i = class01894.y((String)"hud/experience_bar_background");
    private static final class01894 R = class01894.y((String)"hud/experience_bar_progress");
    private final class06202 M;

    public class08643(class06202 class062022) {
        this.M = class062022;
    }

    @Override
    public void y(class01054 class010542, class02233 class022332) {
    }

    @Override
    public void N(class01054 class010542, class02233 class022332) {
        class04453 class044532 = (class04453)this.M.T_4;
        int n = this.N(this.M.Nt());
        int n2 = this.y(this.M.Nt());
        if (class044532.method_7349() > 0) {
            int n3 = (int)(class044532.fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue() * 183.0f);
            class010542.N(class08394.Na, i, n, n2, 182, 5);
            if (n3 > 0) {
                class010542.N(class08394.Na, R, 182, 5, 0, 0, n, n2, n3, 5);
            }
        }
    }
}

