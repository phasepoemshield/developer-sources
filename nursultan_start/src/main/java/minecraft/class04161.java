/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class04230
 *  minecraft.class08813
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class04230;
import minecraft.class08813;

public class class04161
extends class08813 {
    private final class01590 N;
    private final class04230 y;

    public boolean L() {
        return super.method_44392();
    }

    public class04161(int n, int n2, int n3, int n4, class00392 class003922, class01590 class015902) {
        super(n, n2, n3, n4, class003922);
        this.N = class015902;
        this.y = new class04230(class003922, class015902).N(this.method_25368() - this.method_65512());
    }

    public void y() {
        if (!this.L()) {
            this.method_53533(this.method_44391() + this.method_65512());
        }
    }

    public void method_25358(int n) {
        super.method_25358(n);
        this.y.N(this.method_25368() - this.method_65512());
    }

    protected void method_44389(class01054 class010542, int n, int n2, float f) {
        class010542.i().pushMatrix();
        class010542.i().translate((float)this.method_65513(), (float)this.method_65514());
        this.y.method_25394(class010542, n, n2, f);
        class010542.i().popMatrix();
    }

    protected void method_44386(class01054 class010542) {
        super.method_44386(class010542);
    }

    protected int method_44391() {
        return this.y.method_25364();
    }

    public void method_25355(class00392 class003922) {
        super.method_25355(class003922);
        this.y.method_25355(class003922);
    }

    protected void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, this.method_25369());
    }

    protected double method_44393() {
        Objects.requireNonNull(this.N);
        return 9.0;
    }
}

