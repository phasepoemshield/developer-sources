/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01202
 *  minecraft.class01212
 *  minecraft.class01295
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class02116
 *  minecraft.class03249
 *  minecraft.class03287
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class04654
 *  minecraft.class05693
 *  minecraft.class05729
 *  minecraft.class06202
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01202;
import minecraft.class01212;
import minecraft.class01295;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class02116;
import minecraft.class03249;
import minecraft.class03287;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class04654;
import minecraft.class05693;
import minecraft.class05729;
import minecraft.class06202;
import org.jspecify.annotations.Nullable;

public abstract class class06318<E extends class05729<E>>
extends class01212<E> {
    public class06318(class06202 class062022, int n, int n2, int n3, int n4) {
        super(class062022, n, n2, n3, n4);
    }

    public @Nullable class02106 method_48205(class02089 class020892) {
        if (this.method_25340() == 0) {
            return null;
        }
        if (class020892 instanceof class02116) {
            class02106 class021062;
            class02116 class021162 = (class02116)class020892;
            class05729 class057293 = (class05729)this.method_25336();
            if (class021162.y().N() == class03287.field_41822 && class057293 != null) {
                return class02106.N((class01295)this, (class02106)class057293.method_48205(class020892));
            }
            int n = -1;
            class03249 class032492 = class021162.y();
            if (class057293 != null) {
                n = class057293.method_25396().indexOf(class057293.method_25399());
            }
            if (n == -1) {
                switch (class05693.N[class032492.ordinal()]) {
                    case 1: {
                        n = Integer.MAX_VALUE;
                        class032492 = class03249.field_41827;
                        break;
                    }
                    case 2: {
                        n = 0;
                        class032492 = class03249.field_41827;
                        break;
                    }
                    default: {
                        n = 0;
                    }
                }
            }
            class05729 class057294 = class057293;
            do {
                if ((class057294 = (class05729)this.method_48199(class032492, class057292 -> !class057292.method_25396().isEmpty(), (class01202)class057294)) != null) continue;
                return null;
            } while ((class021062 = class057294.method_48208((class02089)class021162, n)) == null);
            return class02106.N((class01295)this, (class02106)class021062);
        }
        return super.method_48205(class020892);
    }

    public class03432 method_37018() {
        if (this.method_25370()) {
            return class03432.field_33786;
        }
        return super.method_37018();
    }

    public void method_25395(@Nullable class04654 class046542) {
        if (this.method_25336() == class046542) {
            return;
        }
        super.method_25395(class046542);
        if (class046542 == null) {
            this.method_25313(null);
        }
    }

    public void method_47399(class03428 class034282) {
        class01202 class012022 = this.method_37019();
        if (class012022 instanceof class05729) {
            class05729 class057292 = (class05729)class012022;
            class057292.method_37024(class034282.N());
            this.method_37017(class034282, (class01202)class057292);
        } else {
            class012022 = this.method_25336();
            if (class012022 instanceof class05729) {
                class05729 class057293 = (class05729)class012022;
                class057293.method_37024(class034282.N());
                this.method_37017(class034282, (class01202)class057293);
            }
        }
    }

    protected boolean method_73379() {
        return false;
    }
}

