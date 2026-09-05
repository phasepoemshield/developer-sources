/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02233
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class07431
 *  minecraft.class08394
 */
package minecraft;

import java.util.Objects;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02233;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class07431;
import minecraft.class08394;
import minecraft.class08657;

public class class08662
implements class08657 {
    private static final class01894 i = class01894.y((String)"hud/jump_bar_background");
    private static final class01894 R = class01894.y((String)"hud/jump_bar_cooldown");
    private static final class01894 M = class01894.y((String)"hud/jump_bar_progress");
    private final class06202 B;
    private final class07431 Z;

    public class08662(class06202 class062022) {
        this.B = class062022;
        this.Z = Objects.requireNonNull(Objects.requireNonNull((class04453)class062022.T_4).G());
    }

    @Override
    public void y(class01054 class010542, class02233 class022332) {
    }

    @Override
    public void N(class01054 class010542, class02233 class022332) {
        int n = this.N(this.B.Nt());
        int n2 = this.y(this.B.Nt());
        class010542.N(class08394.Na, i, n, n2, 182, 5);
        if (this.Z.n() > 0) {
            class010542.N(class08394.Na, R, n, n2, 182, 5);
            return;
        }
        int n3 = class04995.y((float)((class04453)this.B.T_4).P(), (int)0, (int)182);
        if (n3 > 0) {
            class010542.N(class08394.Na, M, 182, 5, 0, 0, n, n2, n3, 5);
        }
    }
}

