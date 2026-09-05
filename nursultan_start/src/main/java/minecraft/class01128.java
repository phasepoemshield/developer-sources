/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09438
 *  Nursultan.class09439
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09438;
import Nursultan.class09439;
import org.jspecify.annotations.Nullable;

public interface class01128<B, T extends B> {
    public Class<? extends B> s();

    public static <B, T extends B> class01128<B, T> y(Class<T> clazz) {
        return new class09438(clazz);
    }

    public static <B, T extends B> class01128<B, T> N(Class<T> clazz) {
        return new class09439(clazz);
    }

    public @Nullable T N(B var1);
}

