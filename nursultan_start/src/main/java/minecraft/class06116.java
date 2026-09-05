/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04995
 *  minecraft.class05801
 */
package minecraft;

import minecraft.class00392;
import minecraft.class04995;
import minecraft.class05801;
import minecraft.class06087;

class class06116
extends class05801 {
    final /* synthetic */ class06087 N;

    class06116(class06087 class060872, int n, int n2, int n3, int n4, class00392 class003922, double d) {
        this.N = class060872;
        super(n, n2, n3, n4, class003922, d);
        this.method_25346();
    }

    protected void method_25344() {
        this.N.N = class04995.N((double)class04995.y((double)this.field_22753, (double)0.0, (double)20.0));
    }

    protected void method_25346() {
        this.method_25355((class00392)class00392.N((String)"jigsaw_block.levels", (Object[])new Object[]{this.N.N}));
    }
}

