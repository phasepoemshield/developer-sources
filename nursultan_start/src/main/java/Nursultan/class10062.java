/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09781
 */
package Nursultan;

import Nursultan.class09781;
import Nursultan.class10021;
import Nursultan.class10027;
import Nursultan.class10033;
import Nursultan.class10041;
import Nursultan.class10049;
import Nursultan.class10050;
import Nursultan.class10067;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public final class class10062 {
    private final class10033 N;
    private final Map<class10021, class10050> y = new IdentityHashMap<class10021, class10050>();

    public boolean L(class10021 class100212) {
        if (!class10062.M(class100212)) {
            return false;
        }
        class10050 class100502 = this.R(class100212);
        this.N(class100502, class100212.B());
        int n = class100502.N;
        int n2 = class100502.y;
        float f = class100502.L;
        class100502.y = 0;
        class100502.N = class100212.B().length();
        this.y(class100212, class100502);
        return this.N(class100212, class100502, n, n2, f);
    }

    private static boolean L(class10021 class100212, class10050 class100502) {
        return class10067.L(class100212.B(), class100502.y, class100502.N);
    }

    public boolean L(class10021 class100212, boolean bl) {
        if (!class10062.M(class100212)) {
            return false;
        }
        return this.N(class100212, this.R(class100212), 0, bl);
    }

    private static boolean M(class10021 class100212) {
        return class100212 != null && class100212.y() == class10049.INPUT;
    }

    private class10062(class09781 class097812) {
        this.N = new class10033(class097812);
    }

    public class10041 i(class10021 class100212) {
        if (!class10062.M(class100212)) {
            return class10041.N;
        }
        class10050 class100502 = this.R(class100212);
        this.N(class100502, class100212.B());
        this.y(class100212, class100502);
        return this.N(class100212, class100502);
    }

    private static int i(class10021 class100212, class10050 class100502) {
        return class10067.y(class100212.B(), class100502.y, class100502.N);
    }

    public boolean u(class10021 class100212, boolean bl) {
        if (!class10062.M(class100212)) {
            return false;
        }
        return this.N(class100212, this.R(class100212), class100212.B().length(), bl);
    }

    private static int u(class10021 class100212, class10050 class100502) {
        return class10067.N(class100212.B(), class100502.y, class100502.N);
    }

    public boolean u(class10021 class100212) {
        if (!class10062.M(class100212)) {
            return false;
        }
        class10050 class100502 = this.R(class100212);
        if (!class100502.u) {
            return false;
        }
        class100502.u = false;
        return true;
    }

    private void y(class10021 class100212, class10050 class100502) {
        class100502.L = this.N.N(class100212, class100502.N, class100502.L);
    }

    public boolean y(class10021 class100212, boolean bl) {
        if (!class10062.M(class100212)) {
            return false;
        }
        class10050 class100502 = this.R(class100212);
        return this.N(class100212, class100502, class10067.L(class100212.B(), class100502.N), bl);
    }

    public boolean y(class10021 class100212, float f) {
        if (!class10062.M(class100212)) {
            return false;
        }
        class10050 class100502 = this.R(class100212);
        if (!class100502.u) {
            return false;
        }
        this.N(class100502, class100212.B());
        int n = class100502.N;
        int n2 = class100502.y;
        float f2 = class100502.L;
        class100502.N = this.N.N(class100212, f, class100502.L);
        this.y(class100212, class100502);
        return this.N(class100212, class100502, n, n2, f2);
    }

    public boolean y(class10021 class100212) {
        if (!class10062.M(class100212)) {
            return false;
        }
        class10050 class100502 = this.R(class100212);
        String string = class100212.B();
        this.N(class100502, string);
        if (class10062.L(class100212, class100502)) {
            return this.N(class100212, class100502, "");
        }
        if (class100502.N >= string.length()) {
            return false;
        }
        int n = class10067.L(string, class100502.N);
        return this.N(class100212, class100502, class100502.N, n, "");
    }

    private static boolean N(class10050 class100502, int n, int n2, float f) {
        return n != class100502.N || n2 != class100502.y || Float.compare(f, class100502.L) != 0;
    }

    public boolean N(class10021 class100212, boolean bl) {
        if (!class10062.M(class100212)) {
            return false;
        }
        class10050 class100502 = this.R(class100212);
        return this.N(class100212, class100502, class10067.y(class100212.B(), class100502.N), bl);
    }

    private boolean N(class10021 class100212, class10050 class100502, int n, int n2, float f) {
        if (!class10062.N(class100502, n, n2, f)) {
            return false;
        }
        class100212.i(1);
        return true;
    }

    public static class10062 N(class09781 class097812) {
        return (class10062)class097812.N(class10062.class).orElseGet(() -> {
            class10062 class100622 = new class10062(Objects.requireNonNull(class097812, "context"));
            class097812.N(class10062.class, (Object)class100622);
            return class100622;
        });
    }

    public boolean N(class10021 class100212, String string) {
        if (!class10062.M(class100212)) {
            return false;
        }
        String string2 = class10027.N(string);
        class10050 class100502 = this.R(class100212);
        this.N(class100502, class100212.B());
        if (string2.isEmpty() && !class10062.L(class100212, class100502)) {
            return false;
        }
        return this.N(class100212, class100502, string2);
    }

    public boolean N(class10021 class100212) {
        if (!class10062.M(class100212)) {
            return false;
        }
        class10050 class100502 = this.R(class100212);
        String string = class100212.B();
        this.N(class100502, string);
        if (class10062.L(class100212, class100502)) {
            return this.N(class100212, class100502, "");
        }
        if (class100502.N <= 0) {
            return false;
        }
        int n = class10067.y(string, class100502.N);
        return this.N(class100212, class100502, n, class100502.N, "");
    }

    private boolean N(class10021 class100212, class10050 class100502, String string) {
        return this.N(class100212, class100502, class10062.u(class100212, class100502), class10062.i(class100212, class100502), string);
    }

    private boolean N(class10021 class100212, class10050 class100502, int n, boolean bl) {
        int n2;
        String string = class100212.B();
        this.N(class100502, string);
        int n3 = class100502.N;
        int n4 = class100502.y;
        float f = class100502.L;
        class100502.N = n2 = class10067.N(string, n);
        if (!bl) {
            class100502.y = n2;
        }
        this.y(class100212, class100502);
        return this.N(class100212, class100502, n3, n4, f);
    }

    private boolean N(class10021 class100212, class10050 class100502, int n, int n2, String string) {
        int n3;
        String string2 = class100212.B();
        int n4 = class100502.N;
        int n5 = class100502.y;
        float f = class100502.L;
        int n6 = class10067.N(string2, n, n2);
        String string3 = class10027.N(string2, n6, n2, string);
        class100502.N = n3 = class10067.N(string3, n6 + string.length());
        class100502.y = n3;
        if (!string2.equals(string3)) {
            class100212.N(string3);
        }
        this.y(class100212, class100502);
        boolean bl = class10062.N(class100502, n4, n5, f);
        if (bl && string2.equals(string3)) {
            class100212.i(1);
        }
        return !string2.equals(string3) || bl;
    }

    public boolean N(class10021 class100212, float f) {
        boolean bl;
        int n;
        if (!class10062.M(class100212)) {
            return false;
        }
        class10050 class100502 = this.R(class100212);
        this.N(class100502, class100212.B());
        int n2 = class100502.N;
        int n3 = class100502.y;
        float f2 = class100502.L;
        boolean bl2 = class100502.u;
        class100502.N = n = this.N.N(class100212, f, class100502.L);
        class100502.y = n;
        class100502.u = true;
        this.y(class100212, class100502);
        boolean bl3 = bl = n2 != class100502.N || n3 != class100502.y || Float.compare(f2, class100502.L) != 0 || !bl2;
        if (bl) {
            class100212.i(1);
        }
        return bl;
    }

    public void N(class10021 class100212, class10021 class100213) {
        if (class10062.M(class100212) && class100212 != class100213) {
            class10050 class100502 = this.R(class100212);
            boolean bl = class10062.L(class100212, class100502);
            class100502.u = false;
            class100502.y = class100502.N;
            if (bl) {
                class100212.i(1);
            }
        }
        if (class10062.M(class100213)) {
            this.N(this.R(class100213), class100213.B());
        }
    }

    private class10041 N(class10021 class100212, class10050 class100502) {
        String string = class100212.B();
        boolean bl = string.isEmpty() && !class100212.Z().isEmpty();
        String string2 = bl ? class100212.Z() : string;
        return new class10041(string, string2, bl, class100502.N, class10062.u(class100212, class100502), class10062.i(class100212, class100502), bl ? 0.0f : class100502.L);
    }

    private void N(class10050 class100502, String string) {
        class100502.N = class10067.N(string, class100502.N);
        class100502.y = class10067.N(string, class100502.y);
    }

    private class10050 R(class10021 class100213) {
        return (class10050)this.y.computeIfAbsent(class100213, class100212 -> new class10050());
    }
}

