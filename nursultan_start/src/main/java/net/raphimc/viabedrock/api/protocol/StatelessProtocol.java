/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.Direction
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypeMap
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.exception.CancelException
 *  com.viaversion.viaversion.exception.InformativeException
 */
package net.raphimc.viabedrock.api.protocol;

import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypeMap;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.exception.CancelException;
import com.viaversion.viaversion.exception.InformativeException;
import java.util.Map;

public abstract class StatelessProtocol<CU extends ClientboundPacketType, CM extends ClientboundPacketType, SM extends ServerboundPacketType, SU extends ServerboundPacketType>
extends AbstractProtocol<CU, CM, SM, SU> {
    public StatelessProtocol(Class<CU> unmappedClientboundPacketType, Class<CM> mappedClientboundPacketType, Class<SM> mappedServerboundPacketType, Class<SU> unmappedServerboundPacketType) {
        super(unmappedClientboundPacketType, mappedClientboundPacketType, mappedServerboundPacketType, unmappedServerboundPacketType);
    }

    public void transform(Direction direction, State state, PacketWrapper packetWrapper) throws InformativeException, CancelException {
        if (state == State.STATUS) {
            super.transform(direction, state, packetWrapper);
            return;
        }
        super.transform(direction, direction == Direction.SERVERBOUND ? state : State.PLAY, packetWrapper);
    }

    protected PacketTypesProvider<CU, CM, SM, SU> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(Map.of(State.PLAY, PacketTypeMap.ofUnsequenced((Class)this.unmappedClientboundPacketType)), Map.of(State.PLAY, PacketTypeMap.ofUnsequenced((Class)this.mappedClientboundPacketType)), Map.of(State.PLAY, PacketTypeMap.ofUnsequenced((Class)this.mappedServerboundPacketType)), Map.of(State.PLAY, PacketTypeMap.ofUnsequenced((Class)this.unmappedServerboundPacketType)));
    }
}

