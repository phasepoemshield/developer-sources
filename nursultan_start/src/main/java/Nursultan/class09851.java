/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09976
 *  Nursultan.class09980
 *  Nursultan.class10019
 *  Nursultan.class10021
 *  Nursultan.class10047
 *  java.lang.Record
 */
package Nursultan;

import Nursultan.class09781;
import Nursultan.class09828;
import Nursultan.class09830;
import Nursultan.class09835;
import Nursultan.class09841;
import Nursultan.class09854;
import Nursultan.class09858;
import Nursultan.class09871;
import Nursultan.class09976;
import Nursultan.class09980;
import Nursultan.class10019;
import Nursultan.class10021;
import Nursultan.class10047;
import java.util.List;
import java.util.Objects;

public final class class09851 {
    private final class09828 N;

    public class09851(class09781 class097812) {
        this.N = class09828.N(Objects.requireNonNull(class097812, "context"));
    }

    private class09854 y(class10021 class100212, float f, float f2, boolean bl) {
        class09841 class098412 = class100212.K();
        if (class098412 == null || !class098412.i()) {
            return null;
        }
        List<class10021> var6 = class098412.u();
        for (int i = var6.size() - 1; i >= 0; --i) {
            class09854 class098542;
            class10021 class100213 = var6.get(i);
            if (class09851.N(class100213) || (class098542 = this.N(class100213, f, f2, null, 0.0f, bl)) == null) continue;
            return class098542;
        }
        return null;
    }

    public class10021 y(class10021 class100212, float f, float f2) {
        return this.N(class100212, f, f2, false).L();
    }

    private static class09871 N(class09830 class098302, float f, float f2, float f3) {
        float f4 = f3 - f;
        if (f2 >= class098302.Z() && f2 <= class098302.Z() + class098302.U() && f4 >= class098302.z() && f4 <= class098302.z() + class098302.E()) {
            return class09871.THUMB;
        }
        if (f2 >= class098302.N() && f2 <= class098302.N() + class098302.L() && f4 >= class098302.y() && f4 <= class098302.y() + class098302.u()) {
            return class09871.TRACK;
        }
        return class09871.NONE;
    }

    private class09854 N(class10021 class100212, class09980 class099802, class09858 class098582, float f, float f2, float f3) {
        class09858 class098583;
        if (!class099802.y()) {
            return null;
        }
        class09830 class098302 = this.N.u(class100212);
        if (class098302 == null) {
            return null;
        }
        class09871 class098712 = class09851.N(class098302, f, f2, f3);
        if (class098712 == class09871.NONE) {
            return null;
        }
        if (class099802.d() != class09976.PARENT && (class098583 = class09835.N(class09835.N(class100212, class099802), f, class098582)) != null && !class098583.N(f2, f3)) {
            return null;
        }
        return new class09854(class100212, class098712, f);
    }

    private class09854 N(class10021 class100212, float f, float f2, class09858 class098582, float f3, boolean bl) {
        Record record;
        if (class100212 == null || class100212.T()) {
            return null;
        }
        class09980 class099802 = class100212.o();
        if (!class099802.g() || class099802.f() <= 0.0f || class099802.J()) {
            return null;
        }
        if (class098582 != null && !class098582.N(f, f2)) {
            return null;
        }
        if (class100212.u() > 0 && class09835.y(class100212, f3, f, f2)) {
            return null;
        }
        if (bl && (record = this.N(class100212, class099802, class098582, f3, f, f2)) != null) {
            return record;
        }
        record = class09835.N(class09835.N(class100212, class099802), f3, class098582);
        if (!(record != null && !record.N())) {
            List var10 = class10047.N((class10021)class100212);
            float f4 = class09835.N(class100212);
            for (int i = var10.size() - 1; i >= 0; --i) {
                float f5;
                class09854 class098542;
                class10021 class100213 = (class10021)var10.get(i);
                if (class10019.N((class10021)class100213) || (class098542 = this.N(class100213, f, f2, (class09858)record, f5 = class09835.N(f3, class100213, f4), bl)) == null) continue;
                return class098542;
            }
        }
        if (class09835.N(class100212, f3, f, f2)) {
            return new class09854(class100212, class09871.NONE, f3);
        }
        return null;
    }

    private static boolean N(class10021 class100212) {
        for (class10021 class100213 = class100212; class100213 != null; class100213 = class100213.X()) {
            if (!class100213.T()) continue;
            return true;
        }
        return false;
    }

    public class09854 N(class10021 class100212, float f, float f2) {
        return this.N(class100212, f, f2, true);
    }

    private class09854 N(class10021 class100212, float f, float f2, boolean bl) {
        if (class100212 == null) {
            return class09854.N;
        }
        class09854 class098542 = this.y(class100212, f, f2, bl);
        if (class098542 != null) {
            return class098542;
        }
        class09854 class098543 = this.N(class100212, f, f2, null, 0.0f, bl);
        return class098543 != null ? class098543 : class09854.N;
    }
}

