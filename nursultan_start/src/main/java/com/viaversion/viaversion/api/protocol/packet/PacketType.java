/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.api.protocol.packet;

import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.State;

/*
 * Uses 'sealed' constructs - enablewith --sealed true
 */
public interface PacketType {
    public String getName();

    default public State state() {
        return State.PLAY;
    }

    public int getId();

    public Direction direction();
}

