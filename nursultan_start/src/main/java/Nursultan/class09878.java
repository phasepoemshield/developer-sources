/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10019
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09849;
import Nursultan.class10019;
import Nursultan.class10021;

final class class09878 {
    private class09878() {
    }

    private static boolean y(class10021 class100212) {
        if (class100212.c().m() <= 0.0f) {
            return false;
        }
        return class100212.o().y();
    }

    static class09849 N(class10021 class100212) {
        float f = 0.0f;
        class10021 class100213 = class100212;
        for (class10021 class100214 = class100212.X(); class100214 != null && !class10019.N((class10021)class100213); class100214 = class100214.X()) {
            if (class09878.y(class100214) && class10019.y((class10021)class100213)) {
                f -= Math.max(0.0f, class100214.c().m());
            }
            class100213 = class100214;
        }
        return new class09849(class100212.c().y(), class100212.c().L() + f, class100212.c().u(), class100212.c().i());
    }
}

