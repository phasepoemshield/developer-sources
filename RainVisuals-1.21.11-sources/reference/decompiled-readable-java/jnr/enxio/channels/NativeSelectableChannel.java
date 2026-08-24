/*
 * Decompiled with CFR 0.152.
 */
package jnr.enxio.channels;

import java.nio.channels.Channel;

public interface NativeSelectableChannel
extends Channel {
    public int getFD();
}

