/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01295
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03922
 *  minecraft.class04654
 *  minecraft.class06613
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01295;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03922;
import minecraft.class04654;
import minecraft.class06613;
import org.jspecify.annotations.Nullable;

public abstract class class01777
extends class03922
implements class01295 {
    private @Nullable class04654 field_47551;
    private boolean field_47552;

    public class01777(int n, int n2, int n3, int n4, class00392 class003922) {
        super(n, n2, n3, n4, class003922);
    }

    public @Nullable class04654 method_25399() {
        return this.field_47551;
    }

    public @Nullable class02106 method_48205(class02089 class020892) {
        return super.method_48205(class020892);
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        super.method_25403(class066132, d, d2);
        return super.method_25403(class066132, d, d2);
    }

    public void method_25365(boolean bl) {
        super.method_25365(bl);
    }

    public void method_25395(@Nullable class04654 class046542) {
        if (this.field_47551 != null) {
            this.field_47551.method_25365(false);
        }
        if (class046542 != null) {
            class046542.method_25365(true);
        }
        this.field_47551 = class046542;
    }

    public final void method_25398(boolean bl) {
        this.field_47552 = bl;
    }

    public boolean method_25370() {
        return super.method_25370();
    }

    public boolean method_25406(class06613 class066132) {
        super.method_25406(class066132);
        return super.method_25406(class066132);
    }

    public final boolean method_25397() {
        return this.field_47552;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        boolean bl2 = this.method_65505(class066132);
        return super.method_25402(class066132, bl) || bl2;
    }
}

