/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  jerozgen.languagereload.mixin.BookScreenAccessor
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00580
 *  minecraft.class00604
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class00661
 *  minecraft.class00937
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class01894
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06005
 *  minecraft.class06202
 *  minecraft.class06241
 *  minecraft.class06601
 *  minecraft.class06611
 *  minecraft.class06613
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.runtime.SwitchBootstraps;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import jerozgen.languagereload.mixin.BookScreenAccessor;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00580;
import minecraft.class00604;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class00661;
import minecraft.class00937;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01894;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06005;
import minecraft.class06202;
import minecraft.class06241;
import minecraft.class06601;
import minecraft.class06611;
import minecraft.class06613;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class05671
extends class05096
implements BookScreenAccessor {
    public static final int N = 16;
    public static final int y = 36;
    public static final int L = 30;
    private static final int z = 256;
    private static final int U = 256;
    private static final class00392 E = class00392.L((String)"book.view.title");
    private static final class00405 W = class00405.N.W().N(-16777216);
    public static final class06241 u = new class06241(List.of());
    public static final class01894 i = class01894.y((String)"textures/gui/book.png");
    protected static final int R = 114;
    protected static final int M = 128;
    protected static final int B = 192;
    private static final int m = 148;
    protected static final int Z = 192;
    private static final int P = 157;
    private static final int s = 43;
    private static final int T = 116;
    private class06241 b;
    private int j;
    private List<class01028> v = Collections.emptyList();
    private int n = -1;
    private class00392 t = class05220.N;
    private class06005 G;
    private class06005 l;
    private final boolean d;

    protected void L() {
        if (this.j > 0) {
            --this.j;
        }
        this.U();
    }

    public class05671(class06241 class062412) {
        this(class062412, true);
    }

    private class05671(class06241 class062412, boolean bl) {
        super(E);
        this.b = class062412;
        this.d = bl;
    }

    public class05671() {
        this(u, false);
    }

    private class00392 Z() {
        return class00392.N((String)"book.pageIndicator", (Object[])new Object[]{this.j + 1, Math.max(this.z(), 1)}).L(W);
    }

    protected int i() {
        return this.W() + 192 + 2;
    }

    private void U() {
        this.G.field_22764 = this.j < this.z() - 1;
        this.l.field_22764 = this.j > 0;
    }

    private int z() {
        return this.b.N();
    }

    protected void u() {
        if (this.j < this.z() - 1) {
            ++this.j;
        }
        this.U();
    }

    protected void y() {
        int n = this.E();
        int n2 = this.W();
        this.G = (class06005)this.method_37063((class04654)new class06005(n + 116, n2 + 157, true, class053622 -> this.u(), this.d));
        this.l = (class06005)this.method_37063((class04654)new class06005(n + 43, n2 + 157, false, class053622 -> this.L(), this.d));
        this.U();
    }

    protected boolean y(int n) {
        return this.N(n);
    }

    private int E() {
        return (this.field_22789 - 192) / 2;
    }

    private void N(class00580 class005802, boolean bl) {
        if (this.n != this.j) {
            class00392 class003922 = class00390.N((class00392)this.b.N(this.j), (class00405)W);
            this.v = this.field_22793.L((class05936)class003922, 114);
            this.t = this.Z();
            this.n = this.j;
        }
        int n = this.E();
        int n2 = this.W();
        if (!bl) {
            class005802.N(class00937.field_62011, n + 148, n2 + 16, this.t);
        }
        Objects.requireNonNull(this.field_22793);
        int n3 = Math.min(128 / 9, this.v.size());
        for (int i = 0; i < n3; ++i) {
            class01028 class010282 = this.v.get(i);
            Objects.requireNonNull(this.field_22793);
            class005802.N(n + 36, n2 + 30 + i * 9, class010282);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected boolean N(@Nullable class00647 class006472) {
        if (class006472 == null) {
            return false;
        }
        class04453 class044532 = Objects.requireNonNull((class04453)this.field_22787.T_4, "Player not available");
        class00647 class006473 = class006472;
        Objects.requireNonNull(class006473);
        class00647 class006474 = class006473;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00661.class, class00625.class}, (Object)class006474, (int)n)) {
            case 0: {
                try {
                    int n2;
                    int n3 = n2 = ((class00661)class006474).y();
                    this.y(n3 - 1);
                    return true;
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
            }
            case 1: {
                String string;
                class00625 class006252 = (class00625)class006474;
                {
                    string = class006252.y();
                    this.R();
                }
                class05671.method_71844((class04453)class044532, (String)string, null);
                return true;
            }
        }
        class05671.method_71999((class00647)class006472, (class06202)this.field_22787, (class05096)this);
        return true;
    }

    protected void N() {
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N((this.field_22789 - 200) / 2, this.i()).N(200).N());
    }

    public boolean N(int n) {
        int n2 = class04995.N((int)n, (int)0, (int)(this.b.N() - 1));
        if (n2 != this.j) {
            this.j = n2;
            this.U();
            this.n = -1;
            return true;
        }
        return false;
    }

    public void N(class06241 class062412) {
        this.b = class062412;
        this.j = class04995.N((int)this.j, (int)0, (int)class062412.N());
        this.U();
        this.n = -1;
    }

    public void method_25426() {
        this.N();
        this.y();
    }

    public boolean method_25404(class06601 class066012) {
        if (super.method_25404(class066012)) {
            return true;
        }
        return switch (class066012.v()) {
            case 266 -> {
                this.l.method_25306((class06611)class066012);
                yield true;
            }
            case 267 -> {
                this.G.method_25306((class06611)class066012);
                yield true;
            }
            default -> false;
        };
    }

    public boolean method_73150() {
        return true;
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        super.method_25420(class010542, n, n2, f);
        class010542.N(class08394.Na, i, this.E(), this.W(), 0.0f, 0.0f, 192, 192, 256, 256);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.N(class010542.N(class01065.field_63852), false);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (class066132.v() == 0) {
            class00604 class006042 = new class00604(this.field_22793, (int)class066132.n(), (int)class066132.t());
            this.N((class00580)class006042, true);
            class00405 class004052 = class006042.y();
            if (class004052 != null && this.N(class004052.Z())) {
                return true;
            }
        }
        return super.method_25402(class066132, bl);
    }

    private int W() {
        return 2;
    }

    protected void R() {
    }

    public class00392 method_25435() {
        return class05220.y((class00392[])new class00392[]{super.method_25435(), this.Z(), this.b.N(this.j)});
    }

    public /* synthetic */ void languagereload_setCachedPageIndex(int n) {
        this.n = n;
    }
}

