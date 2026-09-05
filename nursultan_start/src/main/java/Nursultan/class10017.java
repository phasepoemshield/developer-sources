/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09781
 *  Nursultan.class09844
 *  Nursultan.class09857
 *  Nursultan.class09860
 *  Nursultan.class09863
 *  Nursultan.class09867
 *  Nursultan.class09904
 */
package Nursultan;

import Nursultan.class09781;
import Nursultan.class09844;
import Nursultan.class09857;
import Nursultan.class09860;
import Nursultan.class09863;
import Nursultan.class09867;
import Nursultan.class09904;
import Nursultan.class10021;
import Nursultan.class10027;
import Nursultan.class10041;
import Nursultan.class10049;
import Nursultan.class10062;
import java.util.Objects;

public final class class10017 {
    private static final int N = 259;
    private static final int y = 261;
    private static final int L = 257;
    private static final int u = 335;
    private static final int i = 263;
    private static final int R = 262;
    private static final int M = 268;
    private static final int B = 269;
    private final class09781 Z;
    private final class10062 z;

    private boolean L(class10021 class100212) {
        String string = class10027.N(this.Z.N().N());
        if (string.isEmpty()) {
            return true;
        }
        return this.N(class100212, string);
    }

    private static boolean M(class10021 class100212) {
        return class100212 != null && class100212.y() == class10049.INPUT;
    }

    public class10017(class09781 class097812) {
        this.Z = Objects.requireNonNull(class097812, "context");
        this.z = class10062.N(class097812);
    }

    private boolean i(class10021 class100212) {
        String string = class100212.B();
        boolean bl = this.z.y(class100212);
        this.y(class100212, string);
        return bl;
    }

    private boolean u(class10021 class100212) {
        String string = class100212.B();
        boolean bl = this.z.N(class100212);
        this.y(class100212, string);
        return bl;
    }

    private boolean y(class10021 class100212) {
        this.N(class100212);
        class10041 class100412 = this.z.i(class100212);
        if (!class100412.N() && class100212.B().isEmpty()) {
            return true;
        }
        if (!class100412.N()) {
            this.z.L(class100212);
        }
        return this.i(class100212);
    }

    private void y(class10021 class100212, String string) {
        String string2 = class100212.B();
        if (!string.equals(string2)) {
            class09863.N((class09860)new class09844(class09867.INPUT, (class09904)class100212, string, string2));
        }
    }

    public boolean y(class10021 class100212, int n) {
        if (!class10017.M(class100212)) {
            return false;
        }
        return switch (n) {
            case 65, 97 -> this.z.L(class100212);
            case 67, 99 -> this.N(class100212);
            case 88, 120 -> this.y(class100212);
            case 86, 118 -> this.L(class100212);
            default -> false;
        };
    }

    public boolean N(class10021 class100212, int n, class09857 class098572, boolean bl) {
        if (!class10017.M(class100212)) {
            return false;
        }
        boolean bl2 = class098572 != null && class098572.y();
        return switch (n) {
            case 259 -> this.u(class100212);
            case 261 -> this.i(class100212);
            case 263 -> this.z.N(class100212, bl2);
            case 262 -> this.z.y(class100212, bl2);
            case 268 -> this.z.L(class100212, bl2);
            case 269 -> this.z.u(class100212, bl2);
            case 257, 335 -> this.R(class100212);
            default -> false;
        };
    }

    private boolean N(class10021 class100212) {
        class10041 class100412 = this.z.i(class100212);
        String string = class100212.B();
        if (!class100412.N()) {
            this.Z.N().N(string);
        } else {
            this.Z.N().N(string.substring(class100412.R(), class100412.M()));
        }
        return true;
    }

    public boolean N(class10021 class100212, int n) {
        if (!class10017.M(class100212) || !Character.isValidCodePoint(n) || Character.isISOControl(n)) {
            return false;
        }
        String string = class10027.N(new String(Character.toChars(n)));
        if (string.isEmpty()) {
            return false;
        }
        return this.N(class100212, string);
    }

    private boolean N(class10021 class100212, String string) {
        String string2 = class100212.B();
        boolean bl = this.z.N(class100212, string);
        this.y(class100212, string2);
        return bl;
    }

    private boolean R(class10021 class100212) {
        class09863.N((class09860)new class09844(class09867.CHANGE, (class09904)class100212, class100212.B(), class100212.B()));
        return true;
    }
}

