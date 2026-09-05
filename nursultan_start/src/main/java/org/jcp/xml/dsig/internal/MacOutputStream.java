/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal;

import java.io.ByteArrayOutputStream;
import javax.crypto.Mac;

public class MacOutputStream
extends ByteArrayOutputStream {
    private final Mac mac;

    public MacOutputStream(Mac mac) {
        this.mac = mac;
    }

    @Override
    public void write(int n) {
        super.write(n);
        this.mac.update((byte)n);
    }

    @Override
    public void write(byte[] byArray, int n, int n2) {
        super.write(byArray, n, n2);
        this.mac.update(byArray, n, n2);
    }
}

