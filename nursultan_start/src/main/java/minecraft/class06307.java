/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02091
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05936
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02091;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05936;
import org.jspecify.annotations.Nullable;

public class class06307
extends class05096 {
    private @Nullable class02091 N;

    public class06307(class00392 class003922) {
        super(class003922);
    }

    public void method_25426() {
        this.N = (class02091)this.method_37063((class04654)class02091.N((class00392)this.field_22785, (class01590)this.field_22793, (int)12).y(this.field_22793.N((class05936)this.field_22785)).N());
        this.method_48640();
    }

    public boolean method_25422() {
        return false;
    }

    public void method_48640() {
        if (this.N != null) {
            int n = this.field_22789 / 2 - this.N.method_25368() / 2;
            int n2 = this.field_22790 / 2;
            Objects.requireNonNull(this.field_22793);
            this.N.y(n, n2 - 4);
        }
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        this.method_57728(class010542, f);
        this.method_57734(class010542);
        this.method_57735(class010542);
    }

    protected boolean method_48262() {
        return false;
    }
}

