/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class05220
 *  minecraft.class06584
 *  minecraft.class06952
 *  minecraft.class07324
 */
package minecraft;

import minecraft.class01054;
import minecraft.class05220;
import minecraft.class05358;
import minecraft.class05361;
import minecraft.class05417;
import minecraft.class06584;
import minecraft.class06952;
import minecraft.class07324;

class class05393
extends class05358 {
    final int N;
    final /* synthetic */ class05417 y;

    public class05393(class05417 class054172, int n, int n2, int n3, class05361 class053612) {
        this.y = class054172;
        super(n, n2, 88, 20, class05220.N, class053612, field_40754);
        this.N = n3;
        this.field_22764 = false;
    }

    public int y() {
        return this.N;
    }

    public void N(class01054 class010542, int n, int n2) {
        if (this.field_22762 && ((class06952)this.y.m).s().size() > this.N + this.y.N) {
            if (n < this.method_46426() + 20) {
                class06584 class065842 = ((class07324)((class06952)this.y.m).s().get(this.N + this.y.N)).y();
                class010542.y(class05417.N(this.y), class065842, n, n2);
            } else if (n < this.method_46426() + 50 && n > this.method_46426() + 30) {
                class06584 class065843 = ((class07324)((class06952)this.y.m).s().get(this.N + this.y.N)).L();
                if (!class065843.R()) {
                    class010542.y(class05417.y(this.y), class065843, n, n2);
                }
            } else if (n > this.method_46426() + 65) {
                class06584 class065844 = ((class07324)((class06952)this.y.m).s().get(this.N + this.y.N)).R();
                class010542.y(class05417.L(this.y), class065844, n, n2);
            }
        }
    }
}

