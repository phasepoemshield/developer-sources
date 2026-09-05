/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Objects;

@FunctionalInterface
public interface class01036 {
    public boolean test(char var1);

    default public class01036 y(class01036 class010362) {
        Objects.requireNonNull(class010362);
        return c -> this.test(c) || class010362.test(c);
    }

    default public class01036 N(class01036 class010362) {
        Objects.requireNonNull(class010362);
        return c -> this.test(c) && class010362.test(c);
    }

    default public class01036 N() {
        return c -> !this.test(c);
    }
}

