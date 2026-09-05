/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05880
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class08036
 */
package minecraft;

import java.util.List;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05880;
import minecraft.class06146;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class08036;

class class06159
extends class06937 {
    final /* synthetic */ class05880 N;
    final /* synthetic */ class06146 y;

    class06159(class06146 class061462, class06695 class066952, int n, int n2, int n3, class05880 class058802) {
        this.y = class061462;
        this.N = class058802;
        super(class066952, n, n2, n3);
    }

    private List<class06584> z() {
        return List.of(this.y.i.i());
    }

    public void N(class08036 class080362, class06584 class065842) {
        class065842.N(class080362, class065842.c());
        this.y.n.N(class080362, this.z());
        if (!this.y.i.N(1).R()) {
            this.y.N(this.y.L.y());
        }
        this.N.N_53((class072992, class072092) -> {
            long l = class072992.N();
            if (this.y.u != l) {
                class072992.method_8396(null, class072092, class04909.Oc, class04911.field_15245, 1.0f, 1.0f);
                this.y.u = l;
            }
        });
        super.N(class080362, class065842);
    }

    public boolean N(class06584 class065842) {
        return false;
    }
}

