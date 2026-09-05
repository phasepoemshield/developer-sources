/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08501
 */
package minecraft;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import minecraft.class02315;
import minecraft.class02318;
import minecraft.class02324;
import minecraft.class02341;
import minecraft.class02348;
import minecraft.class02353;
import minecraft.class02356;
import minecraft.class08501;

public class class02344<S> {
    private final Map<class02353<?>, class02356<S, ?>> N = new IdentityHashMap();

    public <T> class02315<S> L(class02353<T> class023532) {
        return new class02348<S, T>(this.y(class023532), class023532);
    }

    private <T> class02356<S, T> y(class02353<T> class023532) {
        return (class02356)this.N.computeIfAbsent(class023532, class02356::new);
    }

    public <T> class08501<S, T> N(class02353<T> class023532, class02315<S> class023152, class02341<S, T> class023412) {
        return this.N(class023532, class02324.N(class023152, class023412));
    }

    public <T> class02315<S> N(class02353<T> class023532, class02353<T> class023533) {
        return new class02348<S, T>(this.y(class023532), class023533);
    }

    public <T> class08501<S, T> N(class02353<T> class023532, class02324<S, T> class023242) {
        class02356 class023562 = (class02356)this.N.computeIfAbsent(class023532, class02356::new);
        if (class023562.N != null) {
            throw new IllegalArgumentException("Trying to override rule: " + String.valueOf(class023532));
        }
        class023562.N = class023242;
        return class023562;
    }

    public <T> class08501<S, T> N(class02353<T> class023532, class02315<S> class023152, class02318<S, T> class023182) {
        return this.N(class023532, class02324.N(class023152, class023182));
    }

    public void N() {
        List list = this.N.entrySet().stream().filter(entry -> ((class02356)entry.getValue()).N == null).map(Map.Entry::getKey).toList();
        if (!list.isEmpty()) {
            throw new IllegalStateException("Unbound names: " + String.valueOf(list));
        }
    }

    public <T> class08501<S, T> N(class02353<T> class023532) {
        return Objects.requireNonNull(this.N.get((Object)class023532), () -> "No rule called " + String.valueOf(class023532));
    }
}

