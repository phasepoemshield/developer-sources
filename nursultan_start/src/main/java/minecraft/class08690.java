/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00265
 *  minecraft.class00299
 *  minecraft.class00315
 *  minecraft.class00330
 *  minecraft.class01929
 *  minecraft.class02754
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class05857
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class08604
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00265;
import minecraft.class00299;
import minecraft.class00315;
import minecraft.class00330;
import minecraft.class01929;
import minecraft.class02754;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class05857;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class08604;
import org.jspecify.annotations.Nullable;

public class class08690
implements class05857 {
    final String N;
    final class03762 y;
    final class06510 L;
    final class06510 u;
    final class08604 i;
    private @Nullable class02754 Z;

    public class08690(String string, class03762 class037622, class06510 class065102, class06510 class065103, class08604 class086042) {
        this.N = string;
        this.y = class037622;
        this.L = class065102;
        this.u = class065103;
        this.i = class086042;
    }

    public String y() {
        return this.N;
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (class065842.R() || !this.L.method_8093(class065842)) continue;
            return this.i.N(class065842);
        }
        return class06584.E;
    }

    public List<class00265> N() {
        return List.of(new class00315(List.of(this.L.method_64673(), this.u.method_64673()), this.i.N(), (class00299)new class00330(class06570.Rn)));
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        if (class029032.i() != 2) {
            return false;
        }
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (class065842.R()) continue;
            if (!bl && this.L.method_8093(class065842)) {
                if (this.i.y(class065842)) {
                    return false;
                }
                bl = true;
                continue;
            }
            if (!bl2 && this.u.method_8093(class065842)) {
                bl2 = true;
                continue;
            }
            return false;
        }
        return bl && bl2;
    }

    public class06514<class08690> method_8119() {
        return class06514.m;
    }

    public class02754 method_61671() {
        if (this.Z == null) {
            this.Z = class02754.y(List.of(this.L, this.u));
        }
        return this.Z;
    }

    public class03762 method_45441() {
        return this.y;
    }
}

