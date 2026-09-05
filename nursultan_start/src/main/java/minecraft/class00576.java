/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import minecraft.class00587;
import minecraft.class00599;
import minecraft.class00607;
import minecraft.class00619;

public class class00576 {
    private final Map<class00607<?>, class00599<?, ?>> N = new HashMap();

    class00576() {
    }

    public class00587 N() {
        if (this.N.isEmpty()) {
            return class00587.N;
        }
        return new class00587(Map.copyOf(this.N));
    }

    public <Value> class00576 N(class00607<Value> class006072, Value Value) {
        return this.N(class006072, class00619.N(), Value);
    }

    public <Value, Parameter> class00576 N(class00607<Value> class006072, class00619<Value, Parameter> class006192, Parameter Parameter) {
        class006072.N().N(class006192);
        this.N.put(class006072, new class00599<Value, Parameter>(Parameter, class006192));
        return this;
    }

    public class00576 N(class00587 class005872) {
        this.N.putAll(class005872.i);
        return this;
    }
}

