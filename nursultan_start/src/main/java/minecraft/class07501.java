/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class05845
 *  minecraft.class05851
 *  minecraft.class05853
 *  minecraft.class05880
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07084
 *  minecraft.class07299
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00869;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05845;
import minecraft.class05851;
import minecraft.class05853;
import minecraft.class05880;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07084;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07505;
import minecraft.class07515;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07501
extends class07482 {
    private static final int N = 0;
    private static final int y = 1;
    private static final int L = 3;
    private static final int u = 1;
    private static final int i = 28;
    private static final int R = 28;
    private static final int j = 37;
    private static final int v = 0;
    private final class06695 n = new class07515(this, 1);
    private final class07505 t;
    private final class05880 G;
    private final class05845 l;

    public boolean P() {
        return !this.n.method_5438(0).R();
    }

    public class07501(int n, class06695 class066952) {
        this(n, class066952, (class05845)new class05853(3), class05880.N);
    }

    public class07501(int n, class06695 class066952, class05845 class058452, class05880 class058802) {
        super(class05851.field_17330, n);
        class07501.N(class058452, 3);
        this.l = class058452;
        this.G = class058802;
        this.t = new class07505(this.n, 0, 136, 110);
        this.N(this.t);
        this.N(class058452);
        this.L(class066952, 36, 137);
    }

    public @Nullable class03556<class07084> m() {
        return class07501.N(this.l.N(2));
    }

    @Override
    public void y(class08036 class080362) {
        super.y(class080362);
        if (class080362.method_73183().method_8608()) {
            return;
        }
        class06584 class065842 = this.t.N(this.t.y());
        if (!class065842.R()) {
            class080362.method_7328(class065842, false);
        }
    }

    @Override
    public void y(int n, int n2) {
        super.y(n, n2);
        this.u();
    }

    public int E() {
        return this.l.N(0);
    }

    public static int N(@Nullable class03556<class07084> class035562) {
        return class035562 == null ? 0 : class04206.u.v().N(class035562) + 1;
    }

    public void N(Optional<class03556<class07084>> optional, Optional<class03556<class07084>> optional2) {
        if (this.t.R()) {
            this.l.N(1, class07501.N((class03556<class07084>)((class03556)optional.orElse(null))));
            this.l.N(2, class07501.N((class03556<class07084>)((class03556)optional2.orElse(null))));
            this.t.N(1);
            this.G.N_53(class07299::method_8524);
        }
    }

    @Override
    public boolean N(class08036 class080362) {
        return class07501.N(this.G, class080362, class00869.MO);
    }

    public static @Nullable class03556<class07084> N(int n) {
        return n == 0 ? null : (class03556)class04206.u.v().N(n - 1);
    }

    @Override
    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            if (n == 0) {
                if (!this.N(class065843, 1, 37, true)) {
                    return class06584.E;
                }
                class069372.y(class065843, class065842);
            } else if (!this.t.R() && this.t.N(class065843) && class065843.c() == 1 ? !this.N(class065843, 0, 1, false) : (n >= 1 && n < 28 ? !this.N(class065843, 28, 37, false) : (n >= 28 && n < 37 ? !this.N(class065843, 1, 28, false) : !this.N(class065843, 1, 37, false)))) {
                return class06584.E;
            }
            if (class065843.R()) {
                class069372.u(class06584.E);
            } else {
                class069372.M();
            }
            if (class065843.c() == class065842.c()) {
                return class06584.E;
            }
            class069372.N(class080362, class065843);
        }
        return class065842;
    }

    public @Nullable class03556<class07084> W() {
        return class07501.N(this.l.N(1));
    }
}

