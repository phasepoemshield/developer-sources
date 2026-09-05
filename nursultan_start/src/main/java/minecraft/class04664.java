/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01295
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01295;
import minecraft.class04654;
import org.jspecify.annotations.Nullable;

public abstract class class04664
implements class01295 {
    private @Nullable class04654 field_22780;
    private boolean field_22781;

    public @Nullable class04654 method_25399() {
        return this.field_22780;
    }

    public void method_25395(@Nullable class04654 class046542) {
        if (this.field_22780 == class046542) {
            return;
        }
        if (this.field_22780 != null) {
            this.field_22780.method_25365(false);
        }
        if (class046542 != null) {
            class046542.method_25365(true);
        }
        this.field_22780 = class046542;
    }

    public final void method_25398(boolean bl) {
        this.field_22781 = bl;
    }

    public final boolean method_25397() {
        return this.field_22781;
    }
}

