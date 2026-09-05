/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09804;
import java.util.Objects;

final class class09862 {
    static final Object N;
    private final class09862 y;
    private final class09804<?> L;
    private final Object u;

    class09862(class09862 class098622, class09804<?> class098042, Object object) {
        this.y = class098622;
        this.L = Objects.requireNonNull(class098042, "context");
        this.u = object;
    }

    Object N(class09804<?> class098042) {
        class09862 class098622 = this;
        while (class098622 != null) {
            if (class098622.L == class098042) {
                return class098622.u;
            }
            class098622 = class098622.y;
        }
        return N;
    }
}

