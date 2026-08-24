/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.nio.ByteBuffer;
import jnr.posix.CmsgHdr;

public interface MsgHdr {
    public int getControlLen();

    public void setIov(ByteBuffer[] var1);

    public CmsgHdr[] getControls();

    public CmsgHdr[] allocateControls(int[] var1);

    public void setFlags(int var1);

    public String getName();

    public ByteBuffer[] getIov();

    public int getFlags();

    public void setName(String var1);

    public CmsgHdr allocateControl(int var1);
}

