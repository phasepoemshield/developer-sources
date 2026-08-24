/*
 * Decompiled with CFR 0.152.
 */
package org.newsclub.net.unix;

import java.io.IOException;
import org.newsclub.net.unix.AFDatagramChannel;
import org.newsclub.net.unix.AFProtocolFamily;
import org.newsclub.net.unix.AFServerSocketChannel;
import org.newsclub.net.unix.AFSocketChannel;
import org.newsclub.net.unix.AFUNIXDatagramChannel;
import org.newsclub.net.unix.AFUNIXServerSocketChannel;
import org.newsclub.net.unix.AFUNIXSocketChannel;

public final class AFUNIXProtocolFamily
extends Enum<AFUNIXProtocolFamily>
implements AFProtocolFamily {
    public static final /* enum */ AFUNIXProtocolFamily UNIX = new AFUNIXProtocolFamily();
    private static final /* synthetic */ AFUNIXProtocolFamily[] $VALUES;

    public static AFUNIXProtocolFamily[] values() {
        return (AFUNIXProtocolFamily[])$VALUES.clone();
    }

    public static AFUNIXProtocolFamily valueOf(String name) {
        return Enum.valueOf(AFUNIXProtocolFamily.class, name);
    }

    @Override
    public AFDatagramChannel<?> openDatagramChannel() throws IOException {
        return AFUNIXDatagramChannel.open();
    }

    @Override
    public AFServerSocketChannel<?> openServerSocketChannel() throws IOException {
        return AFUNIXServerSocketChannel.open();
    }

    @Override
    public AFSocketChannel<?> openSocketChannel() throws IOException {
        return AFUNIXSocketChannel.open();
    }

    private static /* synthetic */ AFUNIXProtocolFamily[] $values() {
        AFUNIXProtocolFamily[] aFUNIXProtocolFamilyArray = new AFUNIXProtocolFamily[1];
        aFUNIXProtocolFamilyArray[0] = UNIX;
        return aFUNIXProtocolFamilyArray;
    }

    static {
        $VALUES = AFUNIXProtocolFamily.$values();
    }
}

