/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class03097;

@FunctionalInterface
public interface class03102 {
    public static final class03102 N = new class03097();

    public static class03102 N(class03102 class031022, class03102 class031023) {
        if (class031022 == N) {
            return class031023;
        }
        if (class031023 == N) {
            return class031022;
        }
        return (bl, n) -> {
            class031022.onResult(bl, n);
            class031023.onResult(bl, n);
        };
    }

    default public void N() {
        this.onResult(false, 0);
    }

    default public void N(int n) {
        this.onResult(true, n);
    }

    public void onResult(boolean var1, int var2);
}

