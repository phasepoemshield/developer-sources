/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00125
 *  minecraft.class01054
 *  minecraft.class06584
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00125;
import minecraft.class01054;
import minecraft.class04590;
import minecraft.class04610;
import minecraft.class04611;
import minecraft.class06584;
import minecraft.class08394;

class class04618
extends class00125 {
    final /* synthetic */ class04590 N;

    class04618(class04590 class045902, class06584 class065842) {
        this.N = class045902;
        super(class04611.N(class045902.N), 1, 1, 18, 18, class065842.d(), class065842, false, true);
    }

    protected void N(class01054 class010542, int n, int n2) {
        super.N(class010542, this.N.method_73380() + 18, this.N.method_73382() + 18);
    }

    protected void method_48579(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, class04610.N, this.N.method_73380(), this.N.method_73382(), 18, 18);
        super.method_48579(class010542, n, n2, f);
    }
}

