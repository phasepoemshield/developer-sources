/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09836;
import Nursultan.class09867;
import Nursultan.class09876;
import java.util.Objects;

public final class class09816 {
    private final class09867 N;
    private final class09836 y;
    private final class09876 L;

    public class09876 L() {
        return this.L;
    }

    class09816(class09867 class098672, class09836 class098362, class09876 class098762) {
        this.N = Objects.requireNonNull(class098672, "type");
        this.y = Objects.requireNonNull(class098362, "listener");
        this.L = class098762 == null ? class09876.N : class098762;
    }

    public class09836 y() {
        return this.y;
    }

    public class09867 N() {
        return this.N;
    }
}

