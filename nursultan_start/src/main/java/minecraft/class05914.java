/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class04370
 *  minecraft.class04654
 *  minecraft.class05002
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class06366
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class04370;
import minecraft.class04654;
import minecraft.class05002;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class06366;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;

public abstract class class05914
extends class05096 {
    protected final class05096 field_21335;
    protected final class05630 field_21336;
    protected @Nullable class05002 field_51824;
    public final class03686 field_49503 = new class03686((class05096)this);

    public class05914(class05096 class050962, class05630 class056302, class00392 class003922) {
        super(class003922);
        this.field_21335 = class050962;
        this.field_21336 = class056302;
    }

    public void method_25426() {
        this.method_57732();
        this.method_60329();
        this.method_31387();
        this.field_49503.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_48640() {
        this.field_49503.N();
        if (this.field_51824 != null) {
            this.field_51824.method_57712(this.field_22789, this.field_49503);
        }
    }

    public void method_25432() {
        ((class05630)this.field_22787.i_7).Np();
    }

    public void method_25419() {
        if (this.field_51824 != null) {
            this.field_51824.y();
        }
        this.field_22787.N(this.field_21335);
    }

    protected abstract void method_60325();

    protected void method_60329() {
        this.field_51824 = (class05002)this.field_49503.L((class02102)new class05002(this.field_22787, this.field_22789, this));
        this.method_60325();
        class06478 class064782 = this.field_51824.y(this.field_21336.NV());
        if (class064782 instanceof class06366) {
            class06366 class063662;
            this.field_52252 = class063662 = (class06366)class064782;
            this.field_52252.field_22763 = this.field_22787.NT().N();
        }
    }

    protected void method_57732() {
        this.field_49503.N(this.field_22785, this.field_22793);
    }

    protected void method_31387() {
        this.field_49503.y((class02102)class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N(200).N());
    }

    public void method_75370(class04370<?> class043702) {
        if (this.field_51824 != null) {
            this.field_51824.L(class043702);
        }
    }
}

