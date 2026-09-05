/*
 * Decompiled with CFR 0.152.
 */
package org.ietf.jgss;

import java.io.InputStream;
import java.io.OutputStream;
import org.ietf.jgss.ChannelBinding;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.MessageProp;
import org.ietf.jgss.Oid;

public interface GSSContext {
    public static final int DEFAULT_LIFETIME = 0;
    public static final int INDEFINITE_LIFETIME = Integer.MAX_VALUE;

    public byte[] initSecContext(byte[] var1, int var2, int var3) throws GSSException;

    @Deprecated(since="11")
    public int initSecContext(InputStream var1, OutputStream var2) throws GSSException;

    public byte[] acceptSecContext(byte[] var1, int var2, int var3) throws GSSException;

    @Deprecated(since="11")
    public void acceptSecContext(InputStream var1, OutputStream var2) throws GSSException;

    public boolean isEstablished();

    public void dispose() throws GSSException;

    public int getWrapSizeLimit(int var1, boolean var2, int var3) throws GSSException;

    public byte[] wrap(byte[] var1, int var2, int var3, MessageProp var4) throws GSSException;

    @Deprecated(since="11")
    public void wrap(InputStream var1, OutputStream var2, MessageProp var3) throws GSSException;

    public byte[] unwrap(byte[] var1, int var2, int var3, MessageProp var4) throws GSSException;

    @Deprecated(since="11")
    public void unwrap(InputStream var1, OutputStream var2, MessageProp var3) throws GSSException;

    public byte[] getMIC(byte[] var1, int var2, int var3, MessageProp var4) throws GSSException;

    @Deprecated(since="11")
    public void getMIC(InputStream var1, OutputStream var2, MessageProp var3) throws GSSException;

    public void verifyMIC(byte[] var1, int var2, int var3, byte[] var4, int var5, int var6, MessageProp var7) throws GSSException;

    @Deprecated(since="11")
    public void verifyMIC(InputStream var1, InputStream var2, MessageProp var3) throws GSSException;

    public byte[] export() throws GSSException;

    public void requestMutualAuth(boolean var1) throws GSSException;

    public void requestReplayDet(boolean var1) throws GSSException;

    public void requestSequenceDet(boolean var1) throws GSSException;

    public void requestCredDeleg(boolean var1) throws GSSException;

    public void requestAnonymity(boolean var1) throws GSSException;

    public void requestConf(boolean var1) throws GSSException;

    public void requestInteg(boolean var1) throws GSSException;

    public void requestLifetime(int var1) throws GSSException;

    public void setChannelBinding(ChannelBinding var1) throws GSSException;

    public boolean getCredDelegState();

    public boolean getMutualAuthState();

    public boolean getReplayDetState();

    public boolean getSequenceDetState();

    public boolean getAnonymityState();

    public boolean isTransferable() throws GSSException;

    public boolean isProtReady();

    public boolean getConfState();

    public boolean getIntegState();

    public int getLifetime();

    public GSSName getSrcName() throws GSSException;

    public GSSName getTargName() throws GSSException;

    public Oid getMech() throws GSSException;

    public GSSCredential getDelegCred() throws GSSException;

    public boolean isInitiator() throws GSSException;
}

