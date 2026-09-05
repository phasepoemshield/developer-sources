/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04648
 *  minecraft.class06384
 *  minecraft.class06428
 */
package minecraft;

import java.util.function.BooleanSupplier;
import minecraft.class04648;
import minecraft.class06384;
import minecraft.class06428;

public class class05926
extends class06428 {
    private final BooleanSupplier y;
    private boolean L;
    private final boolean u;

    public boolean T() {
        boolean bl = this.u && this.y.getAsBoolean() && this.N.N() == class04648.field_1668 && this.L;
        this.L = false;
        return bl;
    }

    public class05926(String string, int n, class06384 class063842, BooleanSupplier booleanSupplier, boolean bl) {
        this(string, class04648.field_1668, n, class063842, booleanSupplier, bl);
    }

    public class05926(String string, class04648 class046482, int n, class06384 class063842, BooleanSupplier booleanSupplier, boolean bl) {
        super(string, class046482, n, class063842);
        this.y = booleanSupplier;
        this.u = bl;
    }

    protected void Z() {
        if (this.y.getAsBoolean() && this.R() || this.L) {
            this.L = true;
        }
        this.b();
    }

    public void b() {
        super.N(false);
    }

    protected boolean z() {
        return super.z() && !this.y.getAsBoolean();
    }

    public void N(boolean bl) {
        if (this.y.getAsBoolean()) {
            if (bl) {
                super.N(!this.R());
            }
        } else {
            super.N(bl);
        }
    }
}

