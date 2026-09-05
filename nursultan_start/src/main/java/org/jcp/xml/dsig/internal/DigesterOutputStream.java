/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal;

import com.sun.org.apache.xml.internal.security.utils.UnsyncByteArrayOutputStream;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

public class DigesterOutputStream
extends OutputStream {
    private static final Logger LOG = LoggerFactory.getLogger(DigesterOutputStream.class);
    private final boolean buffer;
    private UnsyncByteArrayOutputStream bos;
    private final MessageDigest md;

    public DigesterOutputStream(MessageDigest messageDigest) {
        this(messageDigest, false);
    }

    public DigesterOutputStream(MessageDigest messageDigest, boolean bl) {
        this.md = messageDigest;
        this.buffer = bl;
        if (bl) {
            this.bos = new UnsyncByteArrayOutputStream();
        }
    }

    @Override
    public void write(int n) {
        if (this.buffer) {
            this.bos.write(n);
        }
        this.md.update((byte)n);
    }

    @Override
    public void write(byte[] byArray, int n, int n2) {
        if (this.buffer) {
            this.bos.write(byArray, n, n2);
        }
        if (LOG.isDebugEnabled()) {
            LOG.debug("Pre-digested input:");
            StringBuilder stringBuilder = new StringBuilder(n2);
            for (int i = n; i < n + n2; ++i) {
                stringBuilder.append((char)byArray[i]);
            }
            LOG.debug(stringBuilder.toString());
        }
        this.md.update(byArray, n, n2);
    }

    public byte[] getDigestValue() {
        return this.md.digest();
    }

    public InputStream getInputStream() {
        if (this.buffer) {
            return new ByteArrayInputStream(this.bos.toByteArray());
        }
        return null;
    }

    @Override
    public void close() throws IOException {
        if (this.buffer) {
            this.bos.close();
        }
    }
}

