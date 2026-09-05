/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01328
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06563
 *  minecraft.class07145
 *  minecraft.class07148
 *  minecraft.class07156
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07438
 *  minecraft.class07881
 */
package minecraft;

import java.util.List;
import minecraft.class01328;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06563;
import minecraft.class07145;
import minecraft.class07148;
import minecraft.class07156;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class07538;
import minecraft.class07881;

public class class07539
extends class07145 {
    private final class01328 i;
    final /* synthetic */ class07538 N;

    protected int M() {
        return 60;
    }

    public class07539(class07538 class075382) {
        this.N = class075382;
        super((class07148)class075382);
        this.i = class01328.y().N(16.0).N((class074382, class047822) -> ((class07881)class074382).W() == class06563.field_7966);
    }

    protected int Z() {
        return 140;
    }

    protected int m() {
        return 40;
    }

    protected void U() {
        class07881 class078812 = this.N.W();
        if (class078812 != null && class078812.method_5805()) {
            class078812.N(class06563.field_7964);
        }
    }

    public void u() {
        super.u();
        this.N.N(null);
    }

    public boolean y() {
        return this.N.W() != null && this.y > 0;
    }

    protected class04891 E() {
        return class04909.Um;
    }

    public boolean N() {
        if (this.N.T() != null) {
            return false;
        }
        if (this.N.n()) {
            return false;
        }
        if (this.N.field_6012 < this.L) {
            return false;
        }
        class04782 class047822 = class07539.N_18((class07299)this.N.method_73183());
        if (!((Boolean)class047822.method_64395().N(class07305.I)).booleanValue()) {
            return false;
        }
        List list = class047822.N(class07881.class, this.i, (class07438)this.N, this.N.method_5829().L(16.0, 4.0, 16.0));
        if (list.isEmpty()) {
            return false;
        }
        this.N.N((class07881)list.get(class07538.i(this.N).y(list.size())));
        return true;
    }

    protected class07156 W() {
        return class07156.field_7381;
    }
}

