/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class03922
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class08394
 *  minecraft.class09033
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class03922;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class08394;
import minecraft.class09033;

public abstract class class08813
extends class03922 {
    private static final class01883 field_55260 = new class01883(class01894.y((String)"widget/text_field"), class01894.y((String)"widget/text_field_highlighted"));
    private static final int field_55261 = 4;
    public static final int field_60867 = 8;
    private boolean field_60433 = true;
    private boolean field_60434 = true;

    public class08813(int n, int n2, int n3, int n4, class00392 class003922) {
        super(n, n2, n3, n4, class003922);
    }

    public class08813(int n, int n2, int n3, int n4, class00392 class003922, boolean bl, boolean bl2) {
        this(n, n2, n3, n4, class003922);
        this.field_60433 = bl;
        this.field_60434 = bl2;
    }

    public boolean method_25404(class06601 class066012) {
        boolean bl = class066012.B();
        boolean bl2 = class066012.Z();
        if (bl || bl2) {
            double d = this.method_44387();
            this.method_44382(this.method_44387() + (double)(bl ? -1 : 1) * this.method_44393());
            if (d != this.method_44387()) {
                return true;
            }
        }
        return super.method_25404(class066012);
    }

    public boolean method_25405(double d, double d2) {
        return this.field_22763 && this.field_22764 && d >= (double)this.method_46426() && d2 >= (double)this.method_46427() && d < (double)(this.method_55442() + 6) && d2 < (double)this.method_55443();
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        boolean bl2 = this.method_65505(class066132);
        return super.method_25402(class066132, bl) || bl2;
    }

    protected abstract void method_44389(class01054 var1, int var2, int var3, float var4);

    protected void method_65511(class01054 class010542, int n, int n2, int n3, int n4) {
        class01894 class018942 = field_55260.N(this.method_37303(), this.method_25370());
        class010542.N(class08394.Na, class018942, n, n2, n3, n4);
    }

    protected void method_44386(class01054 class010542) {
        this.method_65511(class010542, this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364());
    }

    protected int method_65513() {
        return this.method_46426() + this.method_65509();
    }

    protected boolean method_65510(int n, int n2) {
        return (double)n2 - this.method_44387() >= (double)this.method_46427() && (double)n - this.method_44387() <= (double)(this.method_46427() + this.field_22759);
    }

    protected int method_65512() {
        return this.method_65509() * 2;
    }

    protected int method_65509() {
        return 4;
    }

    protected abstract int method_44391();

    protected void method_44384(class01054 class010542) {
    }

    protected int method_65514() {
        return this.method_46427() + this.method_65509();
    }

    public void method_25354(class09033 class090332) {
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        if (!this.field_22764) {
            return;
        }
        if (this.field_60433) {
            this.method_44386(class010542);
        }
        class010542.L(this.method_46426() + 1, this.method_46427() + 1, this.method_46426() + this.field_22758 - 1, this.method_46427() + this.field_22759 - 1);
        class010542.i().pushMatrix();
        class010542.i().translate(0.0f, (float)(-this.method_44387()));
        this.method_44389(class010542, n, n2, f);
        class010542.i().popMatrix();
        class010542.R();
        this.method_44396(class010542, n, n2);
        if (this.field_60434) {
            this.method_44384(class010542);
        }
    }

    protected int method_65507() {
        return this.method_55442();
    }

    protected int method_44395() {
        return this.method_44391() + this.method_65512();
    }
}

