/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class07299
 *  minecraft.class07587
 *  minecraft.class07601
 *  minecraft.class07603
 */
package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.LongSupplier;
import minecraft.class00587;
import minecraft.class00599;
import minecraft.class00607;
import minecraft.class00616;
import minecraft.class03556;
import minecraft.class07299;
import minecraft.class07587;
import minecraft.class07601;
import minecraft.class07603;

public class class00594 {
    private final Map<class00607<?>, List<class07603<?>>> N = new HashMap();

    class00594() {
    }

    public class00594 N(class03556<class07587> class035562, LongSupplier longSupplier) {
        for (class00607 var4 : ((class07587)class035562.N()).L()) {
            this.N(class035562, var4, longSupplier);
        }
        return this;
    }

    private <Value> class00594 N(class00607<Value> class006073, class07603<Value> class076032) {
        this.N.computeIfAbsent(class006073, class006072 -> new ArrayList()).add(class076032);
        return this;
    }

    private <Value> void N(class03556<class07587> class035562, class00607<Value> class006072, LongSupplier longSupplier) {
        this.N(class006072, (class07601<Value>)((class07587)class035562.N()).N(class006072, longSupplier));
    }

    public class00616 N() {
        return new class00616(this.N);
    }

    public class00594 N(class07299 class072992) {
        class00616.N(this, class072992);
        return this;
    }

    public class00594 N(class00587 class005872) {
        for (class00607<?> var3 : class005872.y()) {
            this.N(var3, class005872);
        }
        return this;
    }

    private <Value> class00594 N(class00607<Value> class006072, class00587 class005872) {
        class00599<Value, ?> class005992 = class005872.N(class006072);
        if (class005992 == null) {
            throw new IllegalArgumentException("Missing attribute " + String.valueOf(class006072));
        }
        return this.N(class006072, class005992::N);
    }
}

