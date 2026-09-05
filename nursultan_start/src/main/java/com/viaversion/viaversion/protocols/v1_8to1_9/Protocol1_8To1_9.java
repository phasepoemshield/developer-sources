/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_8to1_9.storage.ClientWorld1_9
 *  com.viaversion.viaversion.protocols.v1_8to1_9.storage.CommandBlockStorage
 *  com.viaversion.viaversion.protocols.v1_8to1_9.storage.InventoryTracker
 *  com.viaversion.viaversion.protocols.v1_8to1_9.storage.MovementTracker
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.SerializerVersion
 */
package com.viaversion.viaversion.protocols.v1_8to1_9;

import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.BossBarProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.CommandBlockProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.CompressionProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.EntityIdProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.HandItemProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.MainHandProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.MovementTransmitterProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.rewriter.EntityPacketRewriter1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.rewriter.ItemPacketRewriter1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.rewriter.PlayerPacketRewriter1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.rewriter.SpawnPacketRewriter1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.rewriter.WorldPacketRewriter1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.ClientWorld1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.CommandBlockStorage;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.EntityTracker1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.InventoryTracker;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.MovementTracker;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.SerializerVersion;

public class Protocol1_8To1_9
extends AbstractProtocol<ClientboundPackets1_8, ClientboundPackets1_9, ServerboundPackets1_8, ServerboundPackets1_9> {
    public static final ValueTransformer<String, JsonElement> STRING_TO_JSON = new ValueTransformer<String, JsonElement>(Types.COMPONENT){

        public JsonElement transform(PacketWrapper wrapper, String line) {
            return ComponentUtil.convertJsonOrEmpty((String)line, (SerializerVersion)SerializerVersion.V1_8, (SerializerVersion)SerializerVersion.V1_9);
        }
    };
    private final EntityPacketRewriter1_9 entityRewriter = new EntityPacketRewriter1_9(this);
    private final ItemPacketRewriter1_9 itemRewriter = new ItemPacketRewriter1_9(this);

    public static boolean isSword(int id) {
        switch (id) {
            case 267: 
            case 268: 
            case 272: 
            case 276: 
            case 283: {
                return true;
            }
        }
        return false;
    }

    public Protocol1_8To1_9() {
        super(ClientboundPackets1_8.class, ClientboundPackets1_9.class, ServerboundPackets1_8.class, ServerboundPackets1_9.class);
    }

    public void register(ViaProviders providers) {
        providers.register(HandItemProvider.class, (Provider)new HandItemProvider());
        providers.register(CommandBlockProvider.class, (Provider)new CommandBlockProvider());
        providers.register(EntityIdProvider.class, (Provider)new EntityIdProvider());
        providers.register(BossBarProvider.class, (Provider)new BossBarProvider());
        providers.register(MainHandProvider.class, (Provider)new MainHandProvider());
        providers.register(CompressionProvider.class, (Provider)new CompressionProvider());
        providers.register(MovementTransmitterProvider.class, (Provider)new MovementTransmitterProvider());
    }

    public void init(UserConnection userConnection) {
        userConnection.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTracker1_9(userConnection));
        userConnection.addClientWorld(((Object)((Object)this)).getClass(), (ClientWorld)new ClientWorld1_9());
        userConnection.put((StorableObject)new MovementTracker());
        userConnection.put((StorableObject)new InventoryTracker());
        userConnection.put((StorableObject)new CommandBlockStorage());
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_DISCONNECT, wrapper -> STRING_TO_JSON.write(wrapper, (Object)((String)wrapper.read(Types.STRING))));
        SpawnPacketRewriter1_9.register(this);
        PlayerPacketRewriter1_9.register(this);
        WorldPacketRewriter1_9.register(this);
    }

    public ItemPacketRewriter1_9 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_9 getEntityRewriter() {
        return this.entityRewriter;
    }
}

