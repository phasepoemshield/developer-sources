/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class04218;

@FunctionalInterface
public interface class04197<T> {
    public class04218 accept(T var1);

    public static <T> class04197<T> N(Consumer<T> consumer) {
        return object -> {
            consumer.accept(object);
            return class04218.field_41283;
        };
    }
}

