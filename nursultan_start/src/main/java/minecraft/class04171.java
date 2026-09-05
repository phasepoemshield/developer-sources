/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class01651
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00381;
import minecraft.class01651;
import minecraft.class04159;
import minecraft.class04188;

public class class04171
implements class04188 {
    public static final class04159 N = new class04159("join_world");

    @Override
    public class04159 method_52375() {
        return N;
    }

    @Override
    public void method_52376(Consumer<class00381<?>> consumer) {
        consumer.accept((class00381<?>)class01651.N);
    }
}

