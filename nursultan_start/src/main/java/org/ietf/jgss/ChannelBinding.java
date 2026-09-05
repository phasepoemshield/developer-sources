/*
 * Decompiled with CFR 0.152.
 */
package org.ietf.jgss;

import java.net.InetAddress;
import java.util.Arrays;

public class ChannelBinding {
    private final InetAddress initiator;
    private final InetAddress acceptor;
    private byte[] appData;

    public ChannelBinding(InetAddress inetAddress, InetAddress inetAddress2, byte[] byArray) {
        this.initiator = inetAddress;
        this.acceptor = inetAddress2;
        if (byArray != null) {
            this.appData = new byte[byArray.length];
            System.arraycopy(byArray, 0, this.appData, 0, byArray.length);
        }
    }

    public ChannelBinding(byte[] byArray) {
        this(null, null, byArray);
    }

    public InetAddress getInitiatorAddress() {
        return this.initiator;
    }

    public InetAddress getAcceptorAddress() {
        return this.acceptor;
    }

    public byte[] getApplicationData() {
        if (this.appData == null) {
            return null;
        }
        byte[] byArray = new byte[this.appData.length];
        System.arraycopy(this.appData, 0, byArray, 0, this.appData.length);
        return byArray;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ChannelBinding)) {
            return false;
        }
        ChannelBinding channelBinding = (ChannelBinding)object;
        if (this.initiator != null && channelBinding.initiator == null || this.initiator == null && channelBinding.initiator != null) {
            return false;
        }
        if (this.initiator != null && !this.initiator.equals(channelBinding.initiator)) {
            return false;
        }
        if (this.acceptor != null && channelBinding.acceptor == null || this.acceptor == null && channelBinding.acceptor != null) {
            return false;
        }
        if (this.acceptor != null && !this.acceptor.equals(channelBinding.acceptor)) {
            return false;
        }
        return Arrays.equals(this.appData, channelBinding.appData);
    }

    public int hashCode() {
        if (this.initiator != null) {
            return this.initiator.hashCode();
        }
        if (this.acceptor != null) {
            return this.acceptor.hashCode();
        }
        if (this.appData != null) {
            return new String(this.appData).hashCode();
        }
        return 1;
    }
}

