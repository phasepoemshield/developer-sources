/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.nio.ByteBuffer;

public interface CmsgHdr {
    public ByteBuffer getData();

    public int getLen();

    public void setType(int var1);

    public int getLevel();

    public void setData(ByteBuffer var1);

    public int getType();

    public void setLevel(int var1);
}

