/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01894
 *  minecraft.class04977
 *  minecraft.class06584
 *  minecraft.class07482
 *  minecraft.class07508
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01894;
import minecraft.class04977;
import minecraft.class06584;
import minecraft.class07482;
import minecraft.class07508;
import minecraft.class08044;
import minecraft.class08394;

public abstract class class05431<T extends class04977>
extends class01463<T>
implements class07508 {
    private final class01894 N;

    public class05431(T t, class08044 class080442, class00392 class003922, class01894 class018942) {
        super(t, class080442, class003922);
        this.N = class018942;
    }

    protected abstract void i(class01054 var1, int var2, int var3);

    public void N(class07482 class074822, int n, int n2) {
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        class010542.N(class08394.Na, this.N, this.T, this.b, 0.0f, 0.0f, this.B, this.Z, 256, 256);
        this.i(class010542, this.T, this.b);
    }

    public void N(class07482 class074822, int n, class06584 class065842) {
    }

    protected void N() {
    }

    public void method_25426() {
        super.method_25426();
        this.N();
        ((class04977)this.m).N((class07508)this);
    }

    public void method_25432() {
        super.method_25432();
        ((class04977)this.m).y((class07508)this);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.a_(class010542, n, n2);
    }
}

