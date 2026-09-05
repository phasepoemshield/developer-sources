/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class03686
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class03686;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;

public class class08739
extends class05096 {
    private static final class00392 N = class00392.L((String)"gui.waitingForResponse.title");
    private static final class00392[] y = new class00392[]{class00392.i(), class00392.N((String)"gui.waitingForResponse.button.inactive", (Object[])new Object[]{4}), class00392.N((String)"gui.waitingForResponse.button.inactive", (Object[])new Object[]{3}), class00392.N((String)"gui.waitingForResponse.button.inactive", (Object[])new Object[]{2}), class00392.N((String)"gui.waitingForResponse.button.inactive", (Object[])new Object[]{1}), class05220.U};
    private static final int L = 1;
    private static final int u = 5;
    private final @Nullable class05096 i;
    private final class03686 R;
    private final class05362 M;
    private int B;

    public class08739(@Nullable class05096 class050962) {
        super(N);
        this.i = class050962;
        this.R = new class03686((class05096)this, 33, 0);
        this.M = class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N(200).N();
    }

    public @Nullable class05096 N() {
        return this.i;
    }

    public void method_25426() {
        super.method_25426();
        this.R.N(N, this.field_22793);
        this.R.L((class02102)this.M);
        this.M.field_22764 = false;
        this.M.field_22763 = false;
        this.R.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public boolean method_25422() {
        return this.M.field_22763;
    }

    public void method_48640() {
        this.R.N();
        class02077.N((class02102)this.R, (class03255)this.method_48202());
    }

    public void method_25393() {
        super.method_25393();
        if (!this.M.field_22763) {
            int n;
            this.M.field_22764 = (n = this.B++ / 20) >= 1;
            this.M.method_25355(y[n]);
            if (n == 5) {
                this.M.field_22763 = true;
                this.method_37064(true);
            }
        }
    }

    public void method_25419() {
        this.field_22787.N(this.i);
    }

    public boolean method_25421() {
        return false;
    }
}

