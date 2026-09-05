/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04891
 *  minecraft.class07473
 *  minecraft.class07862
 */
package minecraft;

import minecraft.class04891;
import minecraft.class07473;
import minecraft.class07862;

public class class02961
extends class07473 {
    private final class07862 N;
    private int y;

    public void L() {
        this.N.Nf();
        this.M();
    }

    private void M() {
        class04891 class048912 = this.N.NA();
        if (class048912 != null) {
            this.N.method_43077(class048912);
        }
    }

    public class02961(class07862 class078622) {
        this.N = class078622;
        this.N(class078622);
    }

    public boolean B() {
        return true;
    }

    public boolean y() {
        return false;
    }

    private void N(class07862 class078622) {
        this.y = -class078622.Nx();
    }

    public boolean N() {
        ++this.y;
        if (this.y > 0 && this.N.method_59922().y(1000) < this.y) {
            this.N(this.N);
            return !this.N.method_6062() && this.N.method_59922().y(10) == 0;
        }
        return false;
    }
}

