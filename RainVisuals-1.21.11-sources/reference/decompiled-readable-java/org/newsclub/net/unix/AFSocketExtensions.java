/*
 * Decompiled with CFR 0.152.
 */
package org.newsclub.net.unix;

public interface AFSocketExtensions {
    public void ensureAncillaryReceiveBufferSize(int var1);

    public int getAncillaryReceiveBufferSize();

    public void setAncillaryReceiveBufferSize(int var1);
}

