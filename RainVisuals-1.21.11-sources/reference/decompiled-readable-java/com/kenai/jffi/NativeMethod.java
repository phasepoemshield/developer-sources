/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

public final class NativeMethod {
    final String signature;
    final String name;
    final long function;

    public NativeMethod(long address, String name, String signature) {
        this.function = address;
        this.name = name;
        this.signature = signature;
    }
}

