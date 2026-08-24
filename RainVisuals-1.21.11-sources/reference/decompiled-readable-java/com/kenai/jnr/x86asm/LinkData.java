/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jnr.x86asm;

@Deprecated
final class LinkData {
    long displacement;
    final int offset;
    int relocId;

    public LinkData(int offset, long displacement, int relocId) {
        this.offset = offset;
        this.displacement = displacement;
        this.relocId = relocId;
    }
}

