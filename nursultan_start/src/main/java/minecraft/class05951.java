/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class03428
 *  minecraft.class06478
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class01054;
import minecraft.class03428;
import minecraft.class05949;
import minecraft.class05954;
import minecraft.class06478;
import minecraft.class08394;

public class class05951
extends class06478 {
    final class05949 N;
    private boolean y;

    public class05951(class05949 class059492, int n, int n2) {
        super(n, n2, 26, 26, class059492.field_24581);
        this.N = class059492;
    }

    private void y(class01054 class010542) {
        class010542.N(class08394.Na, class05954.y, this.method_46426(), this.method_46427(), 26, 26);
    }

    public void N(boolean bl) {
        this.y = bl;
    }

    private void N(class01054 class010542) {
        class010542.N(class08394.Na, class05954.N, this.method_46426(), this.method_46427(), 26, 26);
    }

    public boolean method_25367() {
        return super.method_25367() || this.y;
    }

    public void method_47399(class03428 class034282) {
        this.method_37021(class034282);
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        this.N(class010542);
        if (this.y) {
            this.y(class010542);
        }
        this.N.N(class010542, this.method_46426() + 5, this.method_46427() + 5);
    }
}

