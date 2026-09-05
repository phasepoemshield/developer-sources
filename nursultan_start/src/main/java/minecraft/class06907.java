/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05880
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05880;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class06951;
import minecraft.class08036;

class class06907
extends class06937 {
    final /* synthetic */ class05880 N;
    final /* synthetic */ class06951 y;

    class06907(class06951 class069512, class06695 class066952, int n, int n2, int n3, class05880 class058802) {
        this.y = class069512;
        this.N = class058802;
        super(class066952, n, n2, n3);
    }

    @Override
    public void N(class08036 class080362, class06584 class065842) {
        this.y.L.N(1);
        this.y.u.N(1);
        if (!this.y.L.R() || !this.y.u.R()) {
            this.y.N.N(-1);
        }
        this.N.N_53((class072992, class072092) -> {
            long l = class072992.N();
            if (this.y.i != l) {
                class072992.method_8396(null, class072092, class04909.Oe, class04911.field_15245, 1.0f, 1.0f);
                this.y.i = l;
            }
        });
        super.N(class080362, class065842);
    }

    @Override
    public boolean N(class06584 class065842) {
        return false;
    }
}

