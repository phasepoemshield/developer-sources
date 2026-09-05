/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class00607
 *  minecraft.class00619
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class00607;
import minecraft.class00619;
import minecraft.class07585;
import minecraft.class07587;
import minecraft.class07605;

public class class07595 {
    private Optional<Integer> N = Optional.empty();
    private final ImmutableMap.Builder<class00607<?>, class07605<?, ?>> y = ImmutableMap.builder();

    class07595() {
    }

    public class07587 N() {
        return new class07587(this.N, (Map<class00607<?>, class07605<?, ?>>)this.y.build());
    }

    public <Value> class07595 N(class00607<Value> class006072, Consumer<class07585<Value>> consumer) {
        return this.N(class006072, class00619.N(), consumer);
    }

    public <Value, Argument> class07595 N(class00607<Value> class006072, class00619<Value, Argument> class006192, Consumer<class07585<Argument>> consumer) {
        class006072.N().N(class006192);
        class07585 class075852 = new class07585();
        consumer.accept(class075852);
        this.y.put(class006072, new class07605<Value, Argument>(class006192, class075852.N()));
        return this;
    }

    public class07595 N(int n) {
        this.N = Optional.of(n);
        return this;
    }
}

