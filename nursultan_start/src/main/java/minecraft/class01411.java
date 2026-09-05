/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02086
 *  minecraft.class02091
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class06384
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01388;
import minecraft.class01402;
import minecraft.class01590;
import minecraft.class02086;
import minecraft.class02091;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class06384;

public class class01411
extends class01388 {
    private final class02091 y;
    final /* synthetic */ class01402 N;

    public class01411(class01402 class014022, class06384 class063842) {
        this.N = class014022;
        this.y = class02091.N((class00392)class063842.N(), (class01590)((class01590)class01402.N((class01402)class014022).i_3)).N(false).N(class02086.field_62118).N();
    }

    @Override
    protected void N() {
    }

    public List<? extends class04654> method_25396() {
        return List.of(this.y);
    }

    public List<? extends class03434> method_37025() {
        return List.of(this.y);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.y.y(class01402.y(this.N) / 2 - this.y.method_25368() / 2, this.method_73386() - this.y.method_25364());
        this.y.method_25394(class010542, n, n2, f);
    }
}

