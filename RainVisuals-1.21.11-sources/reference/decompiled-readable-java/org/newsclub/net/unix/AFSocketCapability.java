/*
 * Decompiled with CFR 0.152.
 */
package org.newsclub.net.unix;

public final class AFSocketCapability
extends Enum<AFSocketCapability> {
    public static final /* enum */ AFSocketCapability CAPABILITY_PEER_CREDENTIALS = new AFSocketCapability(0);
    public static final /* enum */ AFSocketCapability CAPABILITY_ANCILLARY_MESSAGES = new AFSocketCapability(1);
    public static final /* enum */ AFSocketCapability CAPABILITY_FILE_DESCRIPTORS = new AFSocketCapability(2);
    public static final /* enum */ AFSocketCapability CAPABILITY_ABSTRACT_NAMESPACE = new AFSocketCapability(3);
    public static final /* enum */ AFSocketCapability CAPABILITY_UNIX_DATAGRAMS = new AFSocketCapability(4);
    public static final /* enum */ AFSocketCapability CAPABILITY_NATIVE_SOCKETPAIR = new AFSocketCapability(5);
    public static final /* enum */ AFSocketCapability CAPABILITY_FD_AS_REDIRECT = new AFSocketCapability(6);
    public static final /* enum */ AFSocketCapability CAPABILITY_TIPC = new AFSocketCapability(7);
    public static final /* enum */ AFSocketCapability CAPABILITY_UNIX_DOMAIN = new AFSocketCapability(8);
    public static final /* enum */ AFSocketCapability CAPABILITY_VSOCK = new AFSocketCapability(9);
    public static final /* enum */ AFSocketCapability CAPABILITY_VSOCK_DGRAM = new AFSocketCapability(10);
    public static final /* enum */ AFSocketCapability CAPABILITY_ZERO_LENGTH_SEND = new AFSocketCapability(11);
    public static final /* enum */ AFSocketCapability CAPABILITY_UNSAFE = new AFSocketCapability(12);
    public static final /* enum */ AFSocketCapability CAPABILITY_LARGE_PORTS = new AFSocketCapability(13);
    public static final /* enum */ AFSocketCapability CAPABILITY_DARWIN = new AFSocketCapability(14);
    private final int bitmask;
    private static final /* synthetic */ AFSocketCapability[] $VALUES;

    public static AFSocketCapability[] values() {
        return (AFSocketCapability[])$VALUES.clone();
    }

    public static AFSocketCapability valueOf(String name) {
        return Enum.valueOf(AFSocketCapability.class, name);
    }

    private AFSocketCapability(int bit) {
        this.bitmask = 1 << bit;
    }

    int getBitmask() {
        return this.bitmask;
    }

    private static /* synthetic */ AFSocketCapability[] $values() {
        AFSocketCapability[] aFSocketCapabilityArray = new AFSocketCapability[15];
        aFSocketCapabilityArray[0] = CAPABILITY_PEER_CREDENTIALS;
        aFSocketCapabilityArray[1] = CAPABILITY_ANCILLARY_MESSAGES;
        aFSocketCapabilityArray[2] = CAPABILITY_FILE_DESCRIPTORS;
        aFSocketCapabilityArray[3] = CAPABILITY_ABSTRACT_NAMESPACE;
        aFSocketCapabilityArray[4] = CAPABILITY_UNIX_DATAGRAMS;
        aFSocketCapabilityArray[5] = CAPABILITY_NATIVE_SOCKETPAIR;
        aFSocketCapabilityArray[6] = CAPABILITY_FD_AS_REDIRECT;
        aFSocketCapabilityArray[7] = CAPABILITY_TIPC;
        aFSocketCapabilityArray[8] = CAPABILITY_UNIX_DOMAIN;
        aFSocketCapabilityArray[9] = CAPABILITY_VSOCK;
        aFSocketCapabilityArray[10] = CAPABILITY_VSOCK_DGRAM;
        aFSocketCapabilityArray[11] = CAPABILITY_ZERO_LENGTH_SEND;
        aFSocketCapabilityArray[12] = CAPABILITY_UNSAFE;
        aFSocketCapabilityArray[13] = CAPABILITY_LARGE_PORTS;
        aFSocketCapabilityArray[14] = CAPABILITY_DARWIN;
        return aFSocketCapabilityArray;
    }

    static {
        $VALUES = AFSocketCapability.$values();
    }
}

