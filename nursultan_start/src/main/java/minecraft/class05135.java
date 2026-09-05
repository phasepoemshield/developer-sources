/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03255
 *  minecraft.class04141
 *  minecraft.class04282
 *  minecraft.class04601
 *  minecraft.class04981
 *  minecraft.class05685
 *  minecraft.class05728
 */
package minecraft;

import java.util.Objects;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03255;
import minecraft.class04141;
import minecraft.class04282;
import minecraft.class04601;
import minecraft.class04981;
import minecraft.class05685;
import minecraft.class05728;

class class05135
extends class05728 {
    private final class04981 N;
    private final class04282 y = new class04282();

    public class05135(class05685 class056852, class04981 class049812) {
        super(class056852);
        this.N = class049812;
        if (!class049812.U) {
            this.y.N(class04141.N((class00392)class00392.L((String)"mco.snapshot.parent.tooltip")));
        }
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.N(this.N, class010542, this.method_73389(), this.method_73382(), n, n2);
        class04601.N((class01054)class010542, (int)this.method_73380(), (int)this.method_73382(), (int)32, (UUID)this.N.B);
        this.N(class010542, this.method_73382(), this.method_73380(), this.method_73387(), -8355712, this.N);
        this.N(class010542, this.method_73382(), this.method_73380(), this.method_73387(), this.N);
        this.N(class010542, this.method_73382(), this.method_73380(), this.N);
        this.y.N(class010542, n, n2, bl, this.method_25370(), new class03255(this.method_73380(), this.method_73382(), this.method_73387(), this.method_73384()));
    }

    public class00392 method_37006() {
        return class00392.y((String)Objects.requireNonNullElse(this.N.u, "unknown server"));
    }
}

