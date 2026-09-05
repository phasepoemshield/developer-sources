/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05482
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05482;

public class class05969
extends class05096 {
    private class05482 N = class05482.N;
    private final Runnable y;
    private final Runnable L;

    public class05969(Runnable runnable, Runnable runnable2) {
        super((class00392)class00392.L((String)"datapackFailure.title"));
        this.y = runnable;
        this.L = runnable2;
    }

    public void method_25426() {
        super.method_25426();
        this.N = class05482.N((class01590)this.field_22793, (class00392)this.method_25440(), (int)(this.field_22789 - 50));
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"datapackFailure.safeMode"), class053622 -> this.L.run()).N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 96, 150, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.U, class053622 -> this.y.run()).N(this.field_22789 / 2 - 155 + 160, this.field_22790 / 6 + 96, 150, 20).N());
    }

    public boolean method_25422() {
        return false;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class00580 class005802 = class010542.B();
        int n3 = this.field_22789 / 2;
        Objects.requireNonNull(this.field_22793);
        this.N.N(class00937.field_62010, n3, 70, 9, class005802);
    }
}

