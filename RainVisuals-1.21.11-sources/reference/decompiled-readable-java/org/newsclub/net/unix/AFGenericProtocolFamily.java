/*
 * Decompiled with CFR 0.152.
 */
package org.newsclub.net.unix;

import java.net.ProtocolFamily;

final class AFGenericProtocolFamily
extends Enum<AFGenericProtocolFamily>
implements ProtocolFamily {
    private static final /* synthetic */ AFGenericProtocolFamily[] $VALUES;
    public static final /* enum */ AFGenericProtocolFamily GENERIC = new AFGenericProtocolFamily();

    static {
        $VALUES = AFGenericProtocolFamily.$values();
    }

    public static AFGenericProtocolFamily[] values() {
        return (AFGenericProtocolFamily[])$VALUES.clone();
    }

    public static AFGenericProtocolFamily valueOf(String name) {
        return Enum.valueOf(AFGenericProtocolFamily.class, name);
    }

    private static /* synthetic */ AFGenericProtocolFamily[] $values() {
        AFGenericProtocolFamily[] aFGenericProtocolFamilyArray = new AFGenericProtocolFamily[1];
        aFGenericProtocolFamilyArray[0] = GENERIC;
        return aFGenericProtocolFamilyArray;
    }
}

