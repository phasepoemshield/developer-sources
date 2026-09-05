/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00143
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class01763
 *  minecraft.class03949
 *  minecraft.class04782
 *  minecraft.class05372
 *  minecraft.class05456
 *  minecraft.class05459
 *  minecraft.class05475
 *  minecraft.class06889
 *  minecraft.class07079
 *  minecraft.class07196
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07430
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07623
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import minecraft.class00143;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class01763;
import minecraft.class03949;
import minecraft.class04782;
import minecraft.class05372;
import minecraft.class05456;
import minecraft.class05459;
import minecraft.class05475;
import minecraft.class06889;
import minecraft.class07079;
import minecraft.class07196;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07623;
import org.jspecify.annotations.Nullable;

public class class07954
extends class07473 {
    protected final class07475 N;
    private final double y;
    private @Nullable class00143 L;
    private class07209 u;
    private final boolean i;
    private final List<class07209> R = Lists.newArrayList();
    private final int M;
    private final BooleanSupplier B;

    public void L() {
        this.N.f().N(this.L, this.y);
    }

    private void M() {
        if (this.R.size() > 15) {
            this.R.remove(0);
        }
    }

    public class07954(class07475 class074752, double d, boolean bl, int n, BooleanSupplier booleanSupplier) {
        this.N = class074752;
        this.y = d;
        this.i = bl;
        this.M = n;
        this.B = booleanSupplier;
        this.N_71(EnumSet.of(class07430.field_18405));
        if (!class05459.N((class07079)class074752)) {
            throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
        }
    }

    public void u() {
        if (this.N.f().U() || this.u.method_19769((class00737)this.N.method_73189(), (double)this.M)) {
            this.R.add(this.u);
        }
    }

    public boolean y() {
        if (this.N.f().U()) {
            return false;
        }
        return !this.u.method_19769((class00737)this.N.method_73189(), (double)(this.N.method_17681() + (float)this.M));
    }

    private boolean N(class07209 class072092) {
        for (class07209 class072093 : this.R) {
            if (!Objects.equals(class072092, class072093)) continue;
            return false;
        }
        return true;
    }

    public boolean N() {
        class07209 class072092;
        if (!class05459.N((class07079)this.N)) {
            return false;
        }
        this.M();
        if (this.i && this.N.method_73183().method_8530()) {
            return false;
        }
        class04782 class047822 = (class04782)this.N.method_73183();
        if (!class047822.method_19497(class072092 = this.N.method_24515(), 6)) {
            return false;
        }
        class06889 class068892 = class05456.N((class07475)this.N, (int)15, (int)7, class072094 -> {
            if (!class047822.method_19500(class072094)) {
                return Double.NEGATIVE_INFINITY;
            }
            return class047822.method_19494().u(class035562 -> class035562.N(class03949.y), this::N, class072094, 10, class05372.field_18488).map(class072093 -> -class072093.method_10262((class00753)class072092)).orElse(Double.NEGATIVE_INFINITY);
        });
        if (class068892 == null) {
            return false;
        }
        Optional optional = class047822.method_19494().u(class035562 -> class035562.N(class03949.y), this::N, class07209.method_49638((class00737)class068892), 10, class05372.field_18488);
        if (optional.isEmpty()) {
            return false;
        }
        this.u = ((class07209)optional.get()).method_10062();
        class07623 class076232 = this.N.f();
        class076232.y(this.B.getAsBoolean());
        this.L = class076232.N(this.u, 0);
        class076232.y(true);
        if (this.L == null) {
            class06889 class068893 = class05475.N((class07475)this.N, (int)10, (int)7, (class06889)class06889.L((class00753)this.u), (double)1.5707963705062866);
            if (class068893 == null) {
                return false;
            }
            class076232.y(this.B.getAsBoolean());
            this.L = this.N.f().N(class068893.M, class068893.B, class068893.Z, 0);
            class076232.y(true);
            if (this.L == null) {
                return false;
            }
        }
        for (int i = 0; i < this.L.i(); ++i) {
            class01763 class017632 = this.L.N(i);
            class07209 class072093 = new class07209(class017632.N, class017632.y + 1, class017632.L);
            if (!class07196.N((class07299)this.N.method_73183(), (class07209)class072093)) continue;
            this.L = this.N.f().N((double)class017632.N, (double)class017632.y, (double)class017632.L, 0);
            break;
        }
        return this.L != null;
    }
}

