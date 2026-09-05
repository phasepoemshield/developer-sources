/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03392
 *  minecraft.class03418
 *  minecraft.class05699
 *  minecraft.class06613
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03380;
import minecraft.class03392;
import minecraft.class03418;
import minecraft.class05699;
import minecraft.class06613;

public class class03376
extends class05699<class03376> {
    final class03380 N;
    final /* synthetic */ class03392 y;

    public class03376(class03392 class033922, class03380 class033802) {
        this.y = class033922;
        this.N = class033802;
    }

    public class03380 N() {
        return this.N;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.y.method_25313(this);
        return super.method_25402(class066132, bl);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73380() + 1;
        int n4 = this.method_73382();
        int n5 = this.method_73384();
        Objects.requireNonNull(class03418.N((class03418)this.y.N));
        int n6 = n4 + (n5 - 9) / 2 + 1;
        class010542.y(class03418.y((class03418)this.y.N), this.N.y(), n3, n6, -1);
    }

    public class00392 method_37006() {
        return class00392.N((String)"gui.abuseReport.reason.narration", (Object[])new Object[]{this.N.y(), this.N.L()});
    }
}

