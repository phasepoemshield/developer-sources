/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class04159
 *  minecraft.class04188
 */
package minecraft;

import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class00381;
import minecraft.class00927;
import minecraft.class04159;
import minecraft.class04188;

public class class00914
implements class04188 {
    public static final class04159 N = new class04159("server_code_of_conduct");
    private final Supplier<String> y;

    public class00914(Supplier<String> supplier) {
        this.y = supplier;
    }

    public class04159 method_52375() {
        return N;
    }

    public void method_52376(Consumer<class00381<?>> consumer) {
        consumer.accept(new class00927(this.y.get()));
    }
}

