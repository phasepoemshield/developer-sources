/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09713
 *  Nursultan.class09715
 *  Nursultan.class09736
 *  Nursultan.class09743
 *  Nursultan.class09980
 *  Nursultan.class09991
 *  Nursultan.class10002
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09713;
import Nursultan.class09715;
import Nursultan.class09736;
import Nursultan.class09743;
import Nursultan.class09980;
import Nursultan.class09991;
import Nursultan.class10002;
import Nursultan.class10021;

final class class09771 {
    private class09771() {
    }

    static boolean N(class10021 class100212, class09715 class097152) {
        class10002 class100022;
        if (class100212 == null) {
            return false;
        }
        class09991 class099912 = class100212.i();
        class10002 class100023 = class100022 = class099912 == null ? class10002.N : class099912.E();
        if (class100022.N()) {
            return false;
        }
        if (class097152.y(class100212)) {
            return true;
        }
        class09980 class099802 = class100212.o();
        class09980 class099803 = class100022.N(class099802);
        class09713 class097132 = class099803.A();
        for (class09736 class097362 : class09736.values()) {
            class09743 class097432;
            if (!class097362.N(class099802, class099803) || !(class097432 = class097132.N(class097362)).u() || !class097362.y(class099802, class099803, class097432)) continue;
            return true;
        }
        return false;
    }
}

