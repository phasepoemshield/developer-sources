/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12025
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class00734
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class08051
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class12025;
import minecraft.class00381;
import minecraft.class00532;
import minecraft.class00533;
import minecraft.class00534;
import minecraft.class00545;
import minecraft.class00563;
import minecraft.class00565;
import minecraft.class00667;
import minecraft.class00734;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class08051;
import org.jspecify.annotations.Nullable;

public class class00556
implements class00381<class08051>,
class12025 {
    public static final class02362<class00667, class00556> N = class00381.N(class00556::N, class00556::new);
    private final int L;
    private final class00533 u;
    private final boolean i;
    static final class00533 y = new class00532();

    private class00556(class00667 class006672) {
        this.L = class006672.E();
        class00563 class005632 = (class00563)class006672.y(class00563.class);
        this.u = class005632.field_29174.apply(class006672);
        this.i = class006672.readBoolean();
    }

    private class00556(int n, boolean bl, class00533 class005332) {
        this.L = n;
        this.u = class005332;
        this.i = bl;
    }

    public boolean y() {
        return this.i;
    }

    public boolean N(class04770 class047702, class00734 class007342, double d) {
        if (this.u.N() == class00563.field_29172) {
            return class047702.method_76729(class007342, d);
        }
        return class047702.method_56092(class007342, d);
    }

    public @Nullable class07049 N(class04782 class047822) {
        return class047822.method_31424(this.L);
    }

    public /* synthetic */ int N() {
        return this.L;
    }

    public void N(class00565 class005652) {
        this.u.N(class005652);
    }

    public static class00556 N(class07049 class070492, boolean bl) {
        return new class00556(class070492.method_5628(), bl, y);
    }

    public static class00556 N(class07049 class070492, boolean bl, class07050 class070502) {
        return new class00556(class070492.method_5628(), bl, new class00534(class070502));
    }

    public static class00556 N(class07049 class070492, boolean bl, class07050 class070502, class06889 class068892) {
        return new class00556(class070492.method_5628(), bl, new class00545(class070502, class068892));
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12062(this);
    }

    private void N(class00667 class006672) {
        class006672.L(this.L);
        class006672.N((Enum)this.u.N());
        this.u.N(class006672);
        class006672.writeBoolean(this.i);
    }

    public class02897<class00556> method_65080() {
        return class04248.yH;
    }
}

