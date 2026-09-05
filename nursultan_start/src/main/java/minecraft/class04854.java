/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class07050
 *  minecraft.class07172
 *  minecraft.class07438
 *  minecraft.class08038
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class07050;
import minecraft.class07172;
import minecraft.class07438;
import minecraft.class08038;
import org.jspecify.annotations.Nullable;

public interface class04854
extends class07172 {
    public @Nullable class07438 T();

    public void m();

    default public void y(class07438 class074382, float f) {
        class07050 class070502 = class08038.N((class07438)class074382, (class06581)class06570.dw);
        class06584 class065842 = class074382.method_5998(class070502);
        class06581 class065812 = class065842.B();
        if (class065812 instanceof class06593) {
            ((class06593)class065812).N(class074382.method_73183(), class074382, class070502, class065842, f, (float)(14 - class074382.method_73183().y().N() * 4), this.T());
        }
        this.m();
    }

    public void N(boolean var1);
}

