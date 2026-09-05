/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal;

import java.io.ByteArrayOutputStream;
import java.security.Signature;
import java.security.SignatureException;

public class SignerOutputStream
extends ByteArrayOutputStream {
    private final Signature sig;

    public SignerOutputStream(Signature signature) {
        this.sig = signature;
    }

    @Override
    public void write(int n) {
        super.write(n);
        try {
            this.sig.update((byte)n);
        }
        catch (SignatureException signatureException) {
            throw new RuntimeException(signatureException);
        }
    }

    @Override
    public void write(byte[] byArray, int n, int n2) {
        super.write(byArray, n, n2);
        try {
            this.sig.update(byArray, n, n2);
        }
        catch (SignatureException signatureException) {
            throw new RuntimeException(signatureException);
        }
    }
}

