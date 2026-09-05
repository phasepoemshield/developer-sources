/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00503
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07356
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00503;
import minecraft.class04770;
import minecraft.class04787;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07356;

public class class04786
extends class04787 {
    public static final int N = 5;
    public static final int y = 120500;
    private boolean i;
    private boolean R;
    private int M;
    private int B;

    public class04786(class04770 class047702) {
        super(class047702);
    }

    @Override
    public void N(class07209 class072092, class07356 class073562, class07211 class072112, int n, int n2) {
        if (this.R) {
            this.R();
            return;
        }
        super.N(class072092, class073562, class072112, n, n2);
    }

    @Override
    public class07082 N(class04770 class047702, class07299 class072992, class06584 class065842, class07050 class070502) {
        if (this.R) {
            this.R();
            return class07082.i;
        }
        return super.N(class047702, class072992, class065842, class070502);
    }

    @Override
    public class07082 N(class04770 class047702, class07299 class072992, class06584 class065842, class07050 class070502, class06183 class061832) {
        if (this.R) {
            this.R();
            return class07082.i;
        }
        return super.N(class047702, class072992, class065842, class070502, class061832);
    }

    @Override
    public void N() {
        super.N();
        ++this.B;
        long l = this.L.N();
        long l2 = l / 24000L + 1L;
        if (!this.i && this.B > 20) {
            this.i = true;
            this.u.field_13987.method_14364((class00381)new class00503(class00503.M, 0.0f));
        }
        boolean bl = this.R = l > 120500L;
        if (this.R) {
            ++this.M;
        }
        if (l % 24000L == 500L) {
            if (l2 <= 6L) {
                if (l2 == 6L) {
                    this.u.field_13987.method_14364((class00381)new class00503(class00503.M, 104.0f));
                } else {
                    this.u.method_64398((class00392)class00392.L((String)("demo.day." + l2)));
                }
            }
        } else if (l2 == 1L) {
            if (l == 100L) {
                this.u.field_13987.method_14364((class00381)new class00503(class00503.M, 101.0f));
            } else if (l == 175L) {
                this.u.field_13987.method_14364((class00381)new class00503(class00503.M, 102.0f));
            } else if (l == 250L) {
                this.u.field_13987.method_14364((class00381)new class00503(class00503.M, 103.0f));
            }
        } else if (l2 == 5L && l % 24000L == 22000L) {
            this.u.method_64398((class00392)class00392.L((String)"demo.day.warning"));
        }
    }

    private void R() {
        if (this.M > 100) {
            this.u.method_64398((class00392)class00392.L((String)"demo.reminder"));
            this.M = 0;
        }
    }
}

