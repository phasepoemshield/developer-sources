/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04891
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07473
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class04891;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07473;
import org.jspecify.annotations.Nullable;

public class class06150<T extends class07079>
extends class07473 {
    private final T N;
    private final class06584 y;
    private final Predicate<? super T> L;
    private final @Nullable class04891 u;

    public void L() {
        this.N.method_5673(class07085.field_6173, this.y.t());
        this.N.method_6019(class07050.field_5808);
    }

    public class06150(T t, class06584 class065842, @Nullable class04891 class048912, Predicate<? super T> predicate) {
        this.N = t;
        this.y = class065842;
        this.u = class048912;
        this.L = predicate;
    }

    public void u() {
        this.N.method_5673(class07085.field_6173, class06584.E);
        if (this.u != null) {
            this.N.method_5783(this.u, 1.0f, this.N.method_59922().z() * 0.2f + 0.9f);
        }
    }

    public boolean y() {
        return this.N.method_6115();
    }

    public boolean N() {
        return this.L.test(this.N);
    }
}

