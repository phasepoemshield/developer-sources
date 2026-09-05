/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09835
 *  Nursultan.class09858
 *  Nursultan.class09887
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09835;
import Nursultan.class09858;
import Nursultan.class09887;
import Nursultan.class09980;
import Nursultan.class10021;

final class class09918 {
    private static final class09887 N = new class09887(-3.4028235E38f, -3.4028235E38f, Float.MAX_VALUE, Float.MAX_VALUE);

    private class09918() {
    }

    static boolean y(class09887 class098872, float f, class09887 class098873) {
        return class098872.y() <= class098873.y() && class098872.L() + f <= class098873.L() && class098872.u() >= class098873.u() && class098872.i() + f >= class098873.i();
    }

    private static class09858 y(class09887 class098872) {
        return class098872 == null ? null : new class09858(class098872.y(), class098872.L(), class098872.u(), class098872.i());
    }

    static boolean N(class09887 class098872, class10021 class100212, float f) {
        return class09835.N((class10021)class100212, (float)f).N(class09918.y(class098872));
    }

    static boolean N(class09887 class098872) {
        return class098872.u() <= class098872.y() || class098872.i() <= class098872.L();
    }

    static boolean N(class09887 class098872, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!class09918.N(class098872, f5, f6, f7, f8)) {
            return false;
        }
        if (f5 < class098872.y() + f && f6 < class098872.L() + f) {
            return false;
        }
        if (f7 > class098872.u() - f2 && f6 < class098872.L() + f2) {
            return false;
        }
        if (f7 > class098872.u() - f3 && f8 > class098872.i() - f3) {
            return false;
        }
        return !(f5 < class098872.y() + f4) || !(f8 > class098872.i() - f4);
    }

    private static class09887 N(class09858 class098582) {
        return class098582 == null ? null : new class09887(class098582.y(), class098582.L(), class098582.u(), class098582.i());
    }

    static class09887 N(class10021 class100212, class09980 class099802) {
        return class09918.N(class09835.N((class10021)class100212, (class09980)class099802));
    }

    static class09887 N(class09887 class098872, float f, class09887 class098873) {
        if (class098872 == null) {
            return class098873;
        }
        return class09918.N(class09835.N((class09858)class09918.y(class098872), (float)f, (class09858)class09918.y(class098873)));
    }

    static boolean N(class09887 class098872, float f, float f2, float f3, float f4) {
        return f >= class098872.y() && f2 >= class098872.L() && f3 <= class098872.u() && f4 <= class098872.i();
    }

    static float N(class10021 class100212) {
        return class09835.N((class10021)class100212);
    }

    static class09887 N(float f, float f2) {
        if (!Float.isFinite(f) || !Float.isFinite(f2)) {
            return N;
        }
        return new class09887(0.0f, 0.0f, Math.max(0.0f, f), Math.max(0.0f, f2));
    }
}

