/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11647
 *  minecraft.class01894
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05946
 *  minecraft.class07078
 *  minecraft.class07085
 */
package minecraft;

import Nursultan.class11647;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05946;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class08725;

public class class08703 {
    private final class07085 N;
    private class03556<class04891> y = class04909.Nj;
    private Optional<class05946<class11647>> L = Optional.empty();
    private Optional<class01894> u = Optional.empty();
    private Optional<class03543<class07078<?>>> i = Optional.empty();
    private boolean R = true;
    private boolean M = true;
    private boolean B = true;
    private boolean Z;
    private boolean z;
    private class03556<class04891> U = class04206.y.i((Object)class04909.wd);

    public class08703 L(boolean bl) {
        this.B = bl;
        return this;
    }

    class08703(class07085 class070852) {
        this.N = class070852;
    }

    public class08703 i(boolean bl) {
        this.z = bl;
        return this;
    }

    public class08703 u(boolean bl) {
        this.Z = bl;
        return this;
    }

    public class08703 y(boolean bl) {
        this.M = bl;
        return this;
    }

    public class08703 y(class03556<class04891> class035562) {
        this.U = class035562;
        return this;
    }

    public class08725 N() {
        return new class08725(this.N, this.y, this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U);
    }

    public class08703 N(class03556<class04891> class035562) {
        this.y = class035562;
        return this;
    }

    public class08703 N(class05946<class11647> class059462) {
        this.L = Optional.of(class059462);
        return this;
    }

    public class08703 N(class01894 class018942) {
        this.u = Optional.of(class018942);
        return this;
    }

    public class08703 N(class07078<?> ... class07078Array) {
        return this.N((class03543<class07078<?>>)class03543.N(class07078::T, (Object[])class07078Array));
    }

    public class08703 N(class03543<class07078<?>> class035432) {
        this.i = Optional.of(class035432);
        return this;
    }

    public class08703 N(boolean bl) {
        this.R = bl;
        return this;
    }
}

