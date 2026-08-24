/*
 * Decompiled with CFR 0.152.
 */
package org.newsclub.net.unix;

@Deprecated
public final class AFUNIXSocketCapability
extends Enum<AFUNIXSocketCapability> {
    private static final /* synthetic */ AFUNIXSocketCapability[] $VALUES;
    public static final /* enum */ AFUNIXSocketCapability CAPABILITY_NATIVE_SOCKETPAIR;
    private final int bitmask;
    public static final /* enum */ AFUNIXSocketCapability CAPABILITY_FILE_DESCRIPTORS;
    public static final /* enum */ AFUNIXSocketCapability CAPABILITY_PEER_CREDENTIALS;
    public static final /* enum */ AFUNIXSocketCapability CAPABILITY_DATAGRAMS;
    public static final /* enum */ AFUNIXSocketCapability CAPABILITY_ANCILLARY_MESSAGES;
    public static final /* enum */ AFUNIXSocketCapability CAPABILITY_ABSTRACT_NAMESPACE;

    static {
        CAPABILITY_PEER_CREDENTIALS = new AFUNIXSocketCapability(0);
        CAPABILITY_ANCILLARY_MESSAGES = new AFUNIXSocketCapability(1);
        CAPABILITY_FILE_DESCRIPTORS = new AFUNIXSocketCapability(2);
        CAPABILITY_ABSTRACT_NAMESPACE = new AFUNIXSocketCapability(3);
        CAPABILITY_DATAGRAMS = new AFUNIXSocketCapability(4);
        CAPABILITY_NATIVE_SOCKETPAIR = new AFUNIXSocketCapability(5);
        $VALUES = AFUNIXSocketCapability.$values();
    }

    public static AFUNIXSocketCapability valueOf(String name) {
        return Enum.valueOf(AFUNIXSocketCapability.class, name);
    }

    public static AFUNIXSocketCapability[] values() {
        return (AFUNIXSocketCapability[])$VALUES.clone();
    }

    private AFUNIXSocketCapability(int bit) {
        this.bitmask = 1 << bit;
    }

    private static /* synthetic */ AFUNIXSocketCapability[] $values() {
        AFUNIXSocketCapability[] aFUNIXSocketCapabilityArray = new AFUNIXSocketCapability[6];
        aFUNIXSocketCapabilityArray[0] = CAPABILITY_PEER_CREDENTIALS;
        aFUNIXSocketCapabilityArray[1] = CAPABILITY_ANCILLARY_MESSAGES;
        aFUNIXSocketCapabilityArray[2] = CAPABILITY_FILE_DESCRIPTORS;
        aFUNIXSocketCapabilityArray[3] = CAPABILITY_ABSTRACT_NAMESPACE;
        aFUNIXSocketCapabilityArray[4] = CAPABILITY_DATAGRAMS;
        aFUNIXSocketCapabilityArray[5] = CAPABILITY_NATIVE_SOCKETPAIR;
        return aFUNIXSocketCapabilityArray;
    }

    int getBitmask() {
        return this.bitmask;
    }
}

