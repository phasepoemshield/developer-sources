/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06069
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07430
 *  minecraft.class07475
 *  minecraft.class07978
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00500;
import minecraft.class06069;
import minecraft.class07049;
import minecraft.class07137;
import minecraft.class07147;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07430;
import minecraft.class07475;
import minecraft.class07978;
import org.jspecify.annotations.Nullable;

class class07173
extends class07978 {
    private @Nullable class07211 Z;
    private boolean z;

    public void L() {
        class07209 class072092;
        if (!this.z) {
            super.L();
            return;
        }
        class07299 class072992 = this.y.method_73183();
        class00500 class005002 = class072992.method_8320(class072092 = class07209.method_49637(this.y.method_23317(), this.y.method_23318() + 0.5, this.y.method_23321()).method_10093(this.Z));
        if (class07137.U(class005002)) {
            class072992.method_8652(class072092, class07137.E(class005002), 3);
            this.y.h();
            this.y.method_31472();
        }
    }

    public class07173(class07147 class071472) {
        super((class07475)class071472, 1.0, 10);
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public boolean y() {
        if (this.z) {
            return false;
        }
        return super.y();
    }

    public boolean N() {
        if (this.y.T() != null) {
            return false;
        }
        if (!this.y.f().U()) {
            return false;
        }
        class06069 class060692 = this.y.method_59922();
        if (((Boolean)class07173.N((class07049)this.y).method_64395().N(class07305.I)).booleanValue() && class060692.y(class07173.y((int)10)) == 0) {
            this.Z = class07211.y(class060692);
            class07209 class072092 = class07209.method_49637(this.y.method_23317(), this.y.method_23318() + 0.5, this.y.method_23321()).method_10093(this.Z);
            if (class07137.U(this.y.method_73183().method_8320(class072092))) {
                this.z = true;
                return true;
            }
        }
        this.z = false;
        return super.N();
    }
}

