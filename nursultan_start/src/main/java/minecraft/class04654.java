/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03249
 *  minecraft.class03255
 *  minecraft.class03256
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06626
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03249;
import minecraft.class03255;
import minecraft.class03256;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06626;
import org.jspecify.annotations.Nullable;

public interface class04654
extends class03256 {
    default public boolean M() {
        return true;
    }

    default public @Nullable class02106 B() {
        if (this.method_25370()) {
            return class02106.N((class04654)this);
        }
        return null;
    }

    default public class03255 N_49(class03249 class032492) {
        return this.method_48202().L(class032492);
    }

    default public boolean method_25404(class06601 class066012) {
        return false;
    }

    default public @Nullable class02106 method_48205(class02089 class020892) {
        return null;
    }

    default public class03255 method_48202() {
        return class03255.N();
    }

    default public boolean method_25405(double d, double d2) {
        return false;
    }

    default public boolean method_25403(class06613 class066132, double d, double d2) {
        return false;
    }

    default public boolean method_25401(double d, double d2, double d3, double d4) {
        return false;
    }

    default public boolean method_25400(class06626 class066262) {
        return false;
    }

    public void method_25365(boolean var1);

    public boolean method_25370();

    default public boolean method_25406(class06613 class066132) {
        return false;
    }

    default public boolean method_25402(class06613 class066132, boolean bl) {
        return false;
    }

    default public void method_16014(double d, double d2) {
    }

    default public boolean method_16803(class06601 class066012) {
        return false;
    }
}

