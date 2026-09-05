/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05030
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05030;
import minecraft.class05096;
import minecraft.class05153;
import org.jspecify.annotations.Nullable;

public class class05125
extends class05096
implements class05030 {
    private @Nullable class00392 N;
    private @Nullable class00392 y;
    private int L;
    private boolean u;
    private final boolean i;

    public void L(class00392 class003922) {
        this.y = class003922;
        this.N(0);
    }

    public class05125(boolean bl) {
        super(class05153.N);
        this.i = bl;
    }

    public void y(class00392 class003922) {
        this.N = class003922;
        this.L((class00392)class00392.L((String)"menu.working"));
    }

    public void N() {
        this.u = true;
    }

    public void N(int n) {
        this.L = n;
    }

    public void N(class00392 class003922) {
        this.y(class003922);
    }

    @Override
    public boolean method_25422() {
        return false;
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (this.u) {
            if (this.i) {
                this.field_22787.N(null);
            }
            return;
        }
        super.method_25394(class010542, n, n2, f);
        if (this.N != null) {
            class010542.N(this.field_22793, this.N, this.field_22789 / 2, 70, -1);
        }
        if (this.y != null && this.L != 0) {
            class010542.N(this.field_22793, (class00392)class00392.i().y(this.y).i(" " + this.L + "%"), this.field_22789 / 2, 90, -1);
        }
    }

    @Override
    protected boolean method_48262() {
        return false;
    }
}

