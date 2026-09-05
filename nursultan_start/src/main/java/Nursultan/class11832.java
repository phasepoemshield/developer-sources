/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09753
 *  Nursultan.class09780
 *  Nursultan.class09962
 *  Nursultan.class09971
 *  Nursultan.class09982
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09753;
import Nursultan.class09780;
import Nursultan.class09962;
import Nursultan.class09971;
import Nursultan.class09982;
import Nursultan.class11833;
import Nursultan.class11848;
import Nursultan.class11863;

public class class11832
implements class09780 {
    private static String[] u;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;

    private static void L() {
        u = new String[4];
        class11832.u[0] = "Spring AXIS_SIZE transitions require matching size modes";
        class11832.u[1] = "min";
        class11832.u[2] = "max";
        class11832.u[3] = "value";
    }

    private static class11833 L(class09962 class099622, class09962 class099623, class11863 class118632) {
        return switch (((int[])class11848.N_0)[class099622.u().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 3, 4 -> class11832.N(class099622.i(), class099623.i(), class118632, u[1]);
            case 1, 2 -> null;
        };
    }

    private class09962 M() {
        return switch (((int[])class11848.N_0)[((class09982)this.N_0).ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> class09971.N((float)((class11833)this.N_3).L());
            case 2 -> class09971.u((float)((class11833)this.N_3).L());
            case 3 -> class09971.N((float)((class11833)this.N_1).L(), (float)Math.max(((class11833)this.N_1).L(), ((class11833)this.N_2).L()));
            case 4 -> class09971.y((float)((class11833)this.N_1).L(), (float)Math.max(((class11833)this.N_1).L(), ((class11833)this.N_2).L()));
        };
    }

    public class11832(class09962 class099622, class09962 class099623, class11863 class118632) {
        this.u();
        if (class099622.u() != class099623.u()) {
            throw new IllegalArgumentException(u[0]);
        }
        this.N_0 = class099622.u();
        this.N_1 = class11832.L(class099622, class099623, class118632);
        this.N_2 = class11832.N(class099622, class099623, class118632);
        this.N_3 = class11832.y(class099622, class099623, class118632);
    }

    static {
        class11832.L();
    }

    private void u() {
    }

    private static class11833 y(class09962 class099622, class09962 class099623, class11863 class118632) {
        return switch (((int[])class11848.N_0)[class099622.u().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1, 2 -> class11832.N(class099622.M(), class099623.M(), class118632, u[3]);
            case 3, 4 -> null;
        };
    }

    public boolean y() {
        return class11832.N((class11833)this.N_1) && class11832.N((class11833)this.N_2) && class11832.N((class11833)this.N_3);
    }

    public boolean N(float f) {
        boolean bl = false;
        if ((class11833)this.N_1 != null) {
            bl |= ((class11833)this.N_1).N(f);
        }
        if ((class11833)this.N_2 != null) {
            bl |= ((class11833)this.N_2).N(f);
        }
        if ((class11833)this.N_3 != null) {
            bl |= ((class11833)this.N_3).N(f);
        }
        return bl;
    }

    private static class11833 N(float f, float f2, class11863 class118632, String string) {
        if (!Float.isFinite(f) || !Float.isFinite(f2)) {
            throw new IllegalArgumentException("Spring AXIS_SIZE transitions require finite " + string + " values");
        }
        return new class11833(f, f2, class118632);
    }

    public boolean N(class09753 class097532) {
        class09962 class099622 = class097532.u();
        if (class099622.u() != (class09982)this.N_0) {
            return false;
        }
        if ((class11833)this.N_1 != null) {
            ((class11833)this.N_1).y(class099622.i());
        }
        if ((class11833)this.N_2 != null) {
            ((class11833)this.N_2).y(class099622.R());
        }
        if ((class11833)this.N_3 != null) {
            ((class11833)this.N_3).y(class099622.M());
        }
        return true;
    }

    public class09753 N() {
        return class09753.N((class09962)this.M());
    }

    private static boolean N(class11833 class118332) {
        return class118332 == null || class118332.y();
    }

    private static class11833 N(class09962 class099622, class09962 class099623, class11863 class118632) {
        return switch (((int[])class11848.N_0)[class099622.u().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 3, 4 -> class11832.N(class099622.R(), class099623.R(), class118632, u[2]);
            case 1, 2 -> null;
        };
    }
}

