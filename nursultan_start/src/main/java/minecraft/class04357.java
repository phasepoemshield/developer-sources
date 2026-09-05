/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class05396
 *  minecraft.class05630
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06744
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class01054;
import minecraft.class04352;
import minecraft.class04355;
import minecraft.class04370;
import minecraft.class05396;
import minecraft.class05630;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06744;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public final class class04357<N>
extends class05396
implements class06744 {
    private final class04370<N> y;
    private final class04352<N> L;
    private final class04355<N> u;
    private final Consumer<N> i;
    private @Nullable Long R;
    private final boolean M;

    class04357(class05630 class056302, int n, int n2, int n3, int n4, class04370<N> class043702, class04352<N> class043522, class04355<N> class043552, Consumer<N> consumer, boolean bl) {
        super(class056302, n, n2, n3, n4, class043522.N(class043702.method_41753()));
        this.y = class043702;
        this.L = class043522;
        this.u = class043552;
        this.i = consumer;
        this.M = bl;
        this.method_25346();
    }

    public void y() {
        N n = this.L.N(this.field_22753);
        if (!Objects.equals(n, this.y.method_41753())) {
            this.y.method_41748(n);
            this.i.accept(this.y.method_41753());
        }
    }

    public void N() {
        if (this.field_22753 != this.L.N(this.y.method_41753())) {
            this.field_22753 = this.L.N(this.y.method_41753());
            this.R = null;
            this.method_25346();
        }
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.L()) {
            this.field_41796 = !this.field_41796;
            return true;
        }
        if (this.field_41796) {
            Optional<N> optional;
            boolean bl = class066012.R();
            boolean bl2 = class066012.M();
            if (bl && (optional = this.L.L(this.L.N(this.field_22753))).isPresent()) {
                this.method_25347(this.L.N(optional.get()));
                return true;
            }
            if (bl2 && (optional = this.L.y(this.L.N(this.field_22753))).isPresent()) {
                this.method_25347(this.L.N(optional.get()));
                return true;
            }
            if (bl || bl2) {
                float f = bl ? -1.0f : 1.0f;
                this.method_25347(this.field_22753 + (double)(f / (float)(this.field_22758 - 8)));
                return true;
            }
        }
        return false;
    }

    protected void method_25344() {
        if (this.M) {
            this.y();
        } else {
            this.R = class07536.L() + 600L;
        }
    }

    protected void method_25346() {
        this.method_25355(this.y.field_37864.apply(this.L.N(this.field_22753)));
        this.method_47400(this.u.apply(this.L.N(this.field_22753)));
    }

    public void method_25357(class06613 class066132) {
        super.method_25357(class066132);
        if (this.M) {
            this.N();
        }
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        super.method_48579(class010542, n, n2, f);
        if (this.R != null && class07536.L() >= this.R) {
            this.R = null;
            this.y();
            this.N();
        }
    }
}

