/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01962
 *  minecraft.class03050
 *  minecraft.class03054
 *  minecraft.class03383
 *  minecraft.class05220
 *  minecraft.class05936
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07018
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01962;
import minecraft.class03050;
import minecraft.class03054;
import minecraft.class03383;
import minecraft.class03404;
import minecraft.class03417;
import minecraft.class05220;
import minecraft.class05936;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07018;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class03384
extends class03404 {
    private static final int y = 9;
    private static final int L = 8;
    private static final int u = 11;
    private static final int i = 4;
    private final int R;
    private final class05936 M;
    private final class00392 B;
    private final @Nullable List<class01028> Z;
    private final @Nullable class03050 z;
    private final @Nullable List<class01028> U;
    private final boolean E;
    private final boolean W;
    final /* synthetic */ class03383 N;

    @Override
    public boolean L() {
        return this.E;
    }

    public class03384(class03383 class033832, int n, class00392 class003922, @Nullable class00392 class003923, class03054 class030542, boolean bl, boolean bl2) {
        this.N = class033832;
        this.R = n;
        this.z = (class03050)class01962.N((Object)class030542, class03054::R);
        this.U = class030542 != null && class030542.M() != null ? class03417.y(class033832.y).L((class05936)class030542.M(), class033832.method_25322()) : null;
        this.E = bl;
        this.W = bl2;
        class05936 class059362 = class03417.u(class033832.y).N((class05936)class003922, this.u() - class03417.L(class033832.y).N((class05936)class05220.G));
        if (class003922 != class059362) {
            this.M = class05936.N((class05936[])new class05936[]{class059362, class05220.G});
            this.Z = class03417.i(class033832.y).L((class05936)class003922, class033832.method_25322());
        } else {
            this.M = class003922;
            this.Z = null;
        }
        this.B = class003923;
    }

    private int i() {
        return this.W ? 11 : 0;
    }

    private int u() {
        int n = this.z != null ? this.z.field_39766 + 4 : 0;
        return this.N.method_25322() - this.i() - 4 - n;
    }

    @Override
    public boolean y() {
        return true;
    }

    private void N(class01054 class010542, int n, int n2, int n3) {
        int n4 = n2;
        int n5 = n + (n3 - 8) / 2;
        class010542.N(class08394.Na, class03417.N, n4, n5, 9, 8);
    }

    @Override
    public boolean N() {
        return this.N.y.y.y(this.R);
    }

    private void N(class01054 class010542, int n, int n2, int n3, int n4, int n5) {
        if (this.z != null) {
            int n6 = n2 + (n3 - this.z.field_39767) / 2;
            this.z.N(class010542, n, n6);
            if (this.U != null && n4 >= n && n4 <= n + this.z.field_39766 && n5 >= n6 && n5 <= n6 + this.z.field_39767) {
                class010542.N(this.U, n4, n5);
            }
        }
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.L()) {
            return this.R();
        }
        return false;
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        this.N.method_25313(null);
        return this.R();
    }

    private boolean R() {
        if (this.E) {
            this.N.y.y.N(this.R);
            this.N.y.y();
            return true;
        }
        return false;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        if (this.N() && this.E) {
            this.N(class010542, this.method_73382(), this.method_73380(), this.method_73384());
        }
        int n3 = this.method_73380() + this.i();
        int n4 = this.method_73382() + 1;
        int n5 = this.method_73384();
        Objects.requireNonNull(class03417.R(this.N.y));
        int n6 = n4 + (n5 - 9) / 2;
        class010542.y(class03417.M(this.N.y), class07018.y().N(this.M), n3, n6, this.E ? -1 : -1593835521);
        if (this.Z != null && bl) {
            class010542.N(this.Z, n, n2);
        }
        int n7 = class03417.B(this.N.y).N(this.M);
        this.N(class010542, n3 + n7 + 4, this.method_73382(), this.method_73384(), n, n2);
    }

    @Override
    public class00392 method_37006() {
        return this.N() ? class00392.N((String)"narrator.select", (Object[])new Object[]{this.B}) : this.B;
    }
}

