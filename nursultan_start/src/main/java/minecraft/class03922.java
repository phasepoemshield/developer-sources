/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04995
 *  minecraft.class06478
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04995;
import minecraft.class06478;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class08394;

public abstract class class03922
extends class06478 {
    public static final int field_55258 = 6;
    private double field_39497;
    private static final class01894 field_45906 = class01894.y((String)"widget/scroller");
    private static final class01894 field_55259 = class01894.y((String)"widget/scroller_background");
    private boolean field_39498;

    public class03922(int n, int n2, int n3, int n4, class00392 class003922) {
        super(n, n2, n3, n4, class003922);
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (this.field_39498) {
            if (class066132.t() < (double)this.method_46427()) {
                this.method_44382(0.0);
            } else if (class066132.t() > (double)this.method_55443()) {
                this.method_44382(this.method_44390());
            } else {
                double d3 = Math.max(1, this.method_44390());
                int n = this.method_44394();
                double d4 = Math.max(1.0, d3 / (double)(this.field_22759 - n));
                this.method_44382(this.method_44387() + d2 * d4);
            }
            return true;
        }
        return super.method_25403(class066132, d, d2);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (!this.field_22764) {
            return false;
        }
        this.method_44382(this.method_44387() - d4 * this.method_44393());
        return true;
    }

    public double method_44387() {
        return this.field_39497;
    }

    public void method_44382(double d) {
        this.field_39497 = class04995.N((double)d, (double)0.0, (double)this.method_44390());
    }

    public void method_25357(class06613 class066132) {
        this.field_39498 = false;
    }

    protected void method_44396(class01054 class010542, int n, int n2) {
        if (this.method_44392()) {
            int n3 = this.method_65507();
            int n4 = this.method_44394();
            int n5 = this.method_65508();
            class010542.N(class08394.Na, field_55259, n3, this.method_46427(), 6, this.method_25364());
            class010542.N(class08394.Na, field_45906, n3, n5, 6, n4);
            if (this.method_74038(n, n2)) {
                class010542.N(this.field_39498 ? class06608.i : class06608.u);
            }
        }
    }

    protected boolean method_44392() {
        return this.method_44390() > 0;
    }

    protected boolean method_74038(double d, double d2) {
        return d >= (double)this.method_65507() && d <= (double)(this.method_65507() + 6) && d2 >= (double)this.method_46427() && d2 < (double)this.method_55443();
    }

    protected int method_65507() {
        return this.method_55442() - 6;
    }

    protected int method_44394() {
        return class04995.N((int)((int)((float)(this.field_22759 * this.field_22759) / (float)this.method_44395())), (int)32, (int)(this.field_22759 - 8));
    }

    public void method_65506() {
        this.method_44382(this.field_39497);
    }

    public int method_44390() {
        return Math.max(0, this.method_44395() - this.field_22759);
    }

    protected abstract int method_44395();

    protected abstract double method_44393();

    public boolean method_65505(class06613 class066132) {
        this.field_39498 = this.method_44392() && this.method_25351(class066132.G()) && this.method_74038(class066132.n(), class066132.t());
        return this.field_39498;
    }

    protected int method_65508() {
        return Math.max(this.method_46427(), (int)this.field_39497 * (this.field_22759 - this.method_44394()) / this.method_44390() + this.method_46427());
    }
}

