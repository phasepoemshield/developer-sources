/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00265
 *  minecraft.class00286
 *  minecraft.class00299
 *  minecraft.class00309
 *  minecraft.class00330
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02754
 *  minecraft.class02934
 *  minecraft.class03270
 *  minecraft.class03278
 *  minecraft.class03556
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06570
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00265;
import minecraft.class00286;
import minecraft.class00299;
import minecraft.class00309;
import minecraft.class00330;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02754;
import minecraft.class02934;
import minecraft.class03246;
import minecraft.class03252;
import minecraft.class03254;
import minecraft.class03270;
import minecraft.class03278;
import minecraft.class03556;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06570;
import minecraft.class06584;
import org.jspecify.annotations.Nullable;

public class class03259
implements class03278 {
    final class06510 N;
    final class06510 y;
    final class06510 L;
    final class03556<class03246> u;
    private @Nullable class02754 i;

    public class06510 M() {
        return this.y;
    }

    public class03259(class06510 class065102, class06510 class065103, class06510 class065104, class03556<class03246> class035562) {
        this.N = class065102;
        this.y = class065103;
        this.L = class065104;
        this.u = class035562;
    }

    public Optional<class06510> B() {
        return Optional.of(this.L);
    }

    public class06584 method_8116(class02934 class029342, class01929 class019292) {
        return class03259.N(class019292, class029342.u(), class029342.i(), this.u);
    }

    public static class06584 N(class01929 class019292, class06584 class065842, class06584 class065843, class03556<class03246> class035562) {
        Optional var4 = class03270.N((class01929)class019292, (class06584)class065843);
        if (var4.isPresent()) {
            class03254 class032542;
            class03254 class032543 = (class03254)((Object)class065842.method_58694(class02484.Nu));
            if (Objects.equals((Object)class032543, (Object)(class032542 = new class03254((class03556<class03252>)((class03556)var4.get()), class035562)))) {
                return class06584.E;
            }
            class06584 class065844 = class065842.L(1);
            class065844.N(class02484.Nu, (Object)class032542);
            return class065844;
        }
        return class06584.E;
    }

    public List<class00265> N() {
        class00299 class002992 = this.y.method_64673();
        class00299 class002993 = this.L.method_64673();
        class00299 class002994 = this.N.method_64673();
        return List.of(new class00309(class002994, class002992, class002993, (class00299)new class00286(class002992, class002993, this.u), (class00299)new class00330(class06570.dC)));
    }

    public class06514<class03259> method_8119() {
        return class06514.t;
    }

    public class02754 method_61671() {
        if (this.i == null) {
            this.i = class02754.y(List.of(this.N, this.y, this.L));
        }
        return this.i;
    }

    public Optional<class06510> R() {
        return Optional.of(this.N);
    }
}

