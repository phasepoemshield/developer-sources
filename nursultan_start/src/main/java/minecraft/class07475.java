/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05378
 *  minecraft.class05487
 *  minecraft.class05764
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07993
 */
package minecraft;

import minecraft.class05378;
import minecraft.class05487;
import minecraft.class05764;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07993;

public abstract class class07475
extends class07079 {
    protected static final float c = 0.0f;

    protected double NY() {
        return 1.0;
    }

    public class07475(class07078<? extends class07475> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public float u(class07209 class072092) {
        return this.N(class072092, (class05487)this.method_73183());
    }

    public boolean N(class07284 class072842, class06113 class061132) {
        return this.N(this.method_24515(), (class05487)class072842) >= 0.0f;
    }

    public float N(class07209 class072092, class05487 class054872) {
        return 0.0f;
    }

    public void a_(class07049 class070492) {
        this.N(class070492.method_24515(), (int)this.q_() - 1);
        super.a_(class070492);
    }

    public void b_(class07049 class070492) {
        super.b_(class070492);
        if (this.k_() && !this.Nk()) {
            this.e.y(class07430.field_18405);
            float f = 2.0f;
            float f2 = this.method_5739(class070492);
            class06889 class068892 = new class06889(class070492.method_23317() - this.method_23317(), class070492.method_23318() - this.method_23318(), class070492.method_23321() - this.method_23321()).u().L((double)Math.max(f2 - 2.0f, 0.0f));
            this.f().N(this.method_23317() + class068892.M, this.method_23318() + class068892.B, this.method_23321() + class068892.Z, this.NY());
        }
    }

    public boolean Nk() {
        if (((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.NN)) {
            return ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.NN).isPresent();
        }
        for (class05764 class057642 : this.e.y()) {
            if (!class057642.M() || !(class057642.U() instanceof class07993)) continue;
            return true;
        }
        return false;
    }

    public boolean Nw() {
        return !this.f().U();
    }

    protected boolean k_() {
        return true;
    }
}

