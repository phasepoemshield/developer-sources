/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00265
 *  minecraft.class00299
 *  minecraft.class00309
 *  minecraft.class00330
 *  minecraft.class01929
 *  minecraft.class02754
 *  minecraft.class02934
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class08604
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import minecraft.class00265;
import minecraft.class00299;
import minecraft.class00309;
import minecraft.class00330;
import minecraft.class01929;
import minecraft.class02754;
import minecraft.class02934;
import minecraft.class03278;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class08604;
import org.jspecify.annotations.Nullable;

public class class03280
implements class03278 {
    final Optional<class06510> N;
    final class06510 y;
    final Optional<class06510> L;
    final class08604 u;
    private @Nullable class02754 i;

    @Override
    public class06510 M() {
        return this.y;
    }

    public class03280(Optional<class06510> optional, class06510 class065102, Optional<class06510> optional2, class08604 class086042) {
        this.N = optional;
        this.y = class065102;
        this.L = optional2;
        this.u = class086042;
    }

    @Override
    public Optional<class06510> B() {
        return this.L;
    }

    public List<class00265> N() {
        return List.of(new class00309(class06510.method_64980(this.N), this.y.method_64673(), class06510.method_64980(this.L), this.u.N(), (class00299)new class00330(class06570.dC)));
    }

    public class06584 method_8116(class02934 class029342, class01929 class019292) {
        return this.u.N(class029342.u());
    }

    public class06514<class03280> method_8119() {
        return class06514.n;
    }

    public class02754 method_61671() {
        if (this.i == null) {
            this.i = class02754.N(List.of(this.N, Optional.of(this.y), this.L));
        }
        return this.i;
    }

    @Override
    public Optional<class06510> R() {
        return this.N;
    }
}

