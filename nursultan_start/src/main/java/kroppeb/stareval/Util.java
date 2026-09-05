/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval;

import java.util.function.Consumer;

public class Util {
    public static <T> T make(T t, Consumer<T> consumer) {
        consumer.accept(t);
        return t;
    }
}

