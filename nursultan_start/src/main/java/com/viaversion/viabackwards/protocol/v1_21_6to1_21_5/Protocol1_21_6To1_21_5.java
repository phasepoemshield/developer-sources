/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Dialog
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Dialog$AfterAction
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider.DialogViewProvider
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter.BlockItemPacketRewriter1_21_6
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter.ComponentRewriter1_21_6
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter.EntityPacketRewriter1_21_6
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter.RegistryDataRewriter1_21_6
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ChestDialogStorage
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ChestDialogStorage$Phase
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ClickEvents
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.RegistryAndTags
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ServerLinks
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.item.ItemHasher
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.data.item.ItemHasherBase
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.CommandRewriter1_19_4
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.Protocol1_21_5To1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundConfigurationPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundConfigurationPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viabackwards.protocol.v1_21_6to1_21_5;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Dialog;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider.ChestDialogViewProvider;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider.DialogViewProvider;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter.BlockItemPacketRewriter1_21_6;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter.ComponentRewriter1_21_6;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter.EntityPacketRewriter1_21_6;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter.RegistryDataRewriter1_21_6;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ChestDialogStorage;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ClickEvents;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.RegistryAndTags;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ServerLinks;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.item.ItemHasher;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.data.item.ItemHasherBase;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.CommandRewriter1_19_4;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.Protocol1_21_5To1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.block.BlockRewriter1_21_5;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.ProtocolUtil;

public final class Protocol1_21_6To1_21_5
extends BackwardsProtocol<ClientboundPacket1_21_6, ClientboundPacket1_21_5, ServerboundPacket1_21_6, ServerboundPacket1_21_5> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.21.6", "1.21.5", Protocol1_21_5To1_21_6.class);
    private final EntityPacketRewriter1_21_6 entityRewriter = new EntityPacketRewriter1_21_6(this);
    private final BlockItemPacketRewriter1_21_6 itemRewriter = new BlockItemPacketRewriter1_21_6(this);
    private final ParticleRewriter<ClientboundPacket1_21_6> particleRewriter = new ParticleRewriter((Protocol)this);
    private final NBTComponentRewriter<ClientboundPacket1_21_6> translatableRewriter = new ComponentRewriter1_21_6((BackwardsProtocol)this);
    private final TagRewriter<ClientboundPacket1_21_6> tagRewriter = new TagRewriter((Protocol)this);
    private final RecipeDisplayRewriter<ClientboundPacket1_21_6> recipeRewriter = new RecipeDisplayRewriter1_21_5((Protocol)this);
    private final BackwardsRegistryRewriter registryDataRewriter = new RegistryDataRewriter1_21_6((BackwardsProtocol)this);
    private final BlockRewriter<ClientboundPacket1_21_6> blockRewriter = new BlockRewriter1_21_5((Protocol)this, ChunkType1_21_5::new);

    public VersionedTypesHolder types() {
        return VersionedTypes.V1_21_6;
    }

    public Protocol1_21_6To1_21_5() {
        super(ClientboundPacket1_21_6.class, ClientboundPacket1_21_5.class, ServerboundPacket1_21_6.class, ServerboundPacket1_21_5.class);
    }

    public void register(ViaProviders providers) {
        providers.register(DialogViewProvider.class, (Provider)new ChestDialogViewProvider(this));
    }

    public void init(UserConnection user) {
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_21_6.PLAYER));
        this.addItemHasher(user, (ItemHasher)new ItemHasherBase((Protocol)this, user));
        user.put((StorableObject)new RegistryAndTags());
        user.put((StorableObject)new ClickEvents());
    }

    public BackwardsRegistryRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public NBTComponentRewriter<ClientboundPacket1_21_6> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_21_6> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_6, ClientboundPacket1_21_5, ServerboundPacket1_21_6, ServerboundPacket1_21_5> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_6.class, ClientboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_5.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_6.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_5.class, ServerboundConfigurationPackets1_20_5.class}));
    }

    public VersionedTypesHolder mappedTypes() {
        return VersionedTypes.V1_21_5;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.appendClientbound((ClientboundPacketType)ClientboundPackets1_21_6.SOUND, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            this.fixSoundSource(wrapper);
        });
        this.appendClientbound((ClientboundPacketType)ClientboundPackets1_21_6.SOUND_ENTITY, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            this.fixSoundSource(wrapper);
        });
        this.appendClientbound((ClientboundPacketType)ClientboundPackets1_21_6.STOP_SOUND, wrapper -> {
            byte flags = (Byte)wrapper.get((Type)Types.BYTE, 0);
            if ((flags & 1) != 0) {
                this.fixSoundSource(wrapper);
            }
        });
        CommandRewriter1_19_4<ClientboundPacket1_21_6> commandRewriter = new CommandRewriter1_19_4<ClientboundPacket1_21_6>((Protocol)this){

            public void handleArgument(PacketWrapper wrapper, String argumentType) {
                if (argumentType.equals("minecraft:hex_color") || argumentType.equals("minecraft:dialog")) {
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                } else {
                    super.handleArgument(wrapper, argumentType);
                }
            }
        };
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_6.COMMANDS, arg_0 -> ((CommandRewriter1_19_4)commandRewriter).handle1_19(arg_0));
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_21_6.CHANGE_DIFFICULTY, wrapper -> {
            int difficulty = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)difficulty));
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_21_5.CHANGE_DIFFICULTY, wrapper -> {
            short difficulty = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
            wrapper.write((Type)Types.VAR_INT, (Object)difficulty);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_21_5.CHAT_COMMAND, this::handleClickEvents);
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_21_5.CHAT_COMMAND_SIGNED, this::handleClickEvents);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_21_6.SHOW_DIALOG, null, wrapper -> {
            wrapper.cancel();
            if (!ViaBackwards.getConfig().dialogsViaChests()) {
                return;
            }
            RegistryAndTags registryAndTags = (RegistryAndTags)wrapper.user().get(RegistryAndTags.class);
            ServerLinks serverLinks = (ServerLinks)wrapper.user().get(ServerLinks.class);
            Holder holder = (Holder)wrapper.passthrough((Type)Types.TRUSTED_COMPOUND_TAG_HOLDER);
            CompoundTag tag = holder.isDirect() ? (CompoundTag)holder.value() : registryAndTags.fromRegistry(holder.id());
            DialogViewProvider provider = (DialogViewProvider)Via.getManager().getProviders().get(DialogViewProvider.class);
            provider.openDialog(wrapper.user(), new Dialog(registryAndTags, serverLinks, tag));
        });
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21_6.SHOW_DIALOG, null, wrapper -> {
            wrapper.cancel();
            if (!ViaBackwards.getConfig().dialogsViaChests()) {
                return;
            }
            RegistryAndTags registryAndTags = (RegistryAndTags)wrapper.user().get(RegistryAndTags.class);
            ServerLinks serverLinks = (ServerLinks)wrapper.user().get(ServerLinks.class);
            CompoundTag tag = (CompoundTag)wrapper.read(Types.TRUSTED_COMPOUND_TAG);
            DialogViewProvider provider = (DialogViewProvider)Via.getManager().getProviders().get(DialogViewProvider.class);
            provider.openDialog(wrapper.user(), new Dialog(registryAndTags, serverLinks, tag));
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_21_6.CLEAR_DIALOG, null, this::clearDialog);
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21_6.CLEAR_DIALOG, null, this::clearDialog);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_21_6.SERVER_LINKS, this::storeServerLinks);
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21_6.SERVER_LINKS, this::storeServerLinks);
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_21_5.CONTAINER_CLOSE, wrapper -> {
            ChestDialogStorage storage = (ChestDialogStorage)wrapper.user().get(ChestDialogStorage.class);
            if (storage == null) {
                return;
            }
            ChestDialogViewProvider provider = (ChestDialogViewProvider)Via.getManager().getProviders().get(DialogViewProvider.class);
            if (storage.phase() == ChestDialogStorage.Phase.ANVIL_VIEW) {
                wrapper.cancel();
                provider.openChestView(wrapper.user(), storage, ChestDialogStorage.Phase.DIALOG_VIEW);
                return;
            }
            if (storage.phase() == ChestDialogStorage.Phase.WAITING_FOR_RESPONSE) {
                wrapper.cancel();
                if (storage.closeButtonEnabled()) {
                    provider.openChestView(wrapper.user(), storage, ChestDialogStorage.Phase.DIALOG_VIEW);
                } else {
                    provider.openChestView(wrapper.user(), storage, ChestDialogStorage.Phase.WAITING_FOR_RESPONSE);
                }
                return;
            }
            boolean allowClosing = storage.allowClosing();
            if (!allowClosing) {
                wrapper.cancel();
                if (storage.dialog().canCloseWithEscape()) {
                    provider.clickButton(wrapper.user(), Dialog.AfterAction.CLOSE, storage.dialog().actionButton());
                } else {
                    provider.openChestView(wrapper.user(), storage, ChestDialogStorage.Phase.DIALOG_VIEW);
                }
            }
            storage.setAllowClosing(false);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_21_5.RENAME_ITEM, wrapper -> {
            ChestDialogStorage storage = (ChestDialogStorage)wrapper.user().get(ChestDialogStorage.class);
            if (storage == null || storage.phase() != ChestDialogStorage.Phase.ANVIL_VIEW) {
                return;
            }
            wrapper.cancel();
            String name = (String)wrapper.read(Types.STRING);
            ChestDialogViewProvider provider = (ChestDialogViewProvider)Via.getManager().getProviders().get(DialogViewProvider.class);
            provider.updateAnvilText(wrapper.user(), name);
        });
        this.appendServerbound((ServerboundPacketType)ServerboundPackets1_21_5.CONTAINER_CLICK, wrapper -> {
            ChestDialogViewProvider provider = (ChestDialogViewProvider)Via.getManager().getProviders().get(DialogViewProvider.class);
            if (provider == null) {
                return;
            }
            int containerId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
            short slot = (Short)wrapper.get((Type)Types.SHORT, 0);
            byte button = (Byte)wrapper.get((Type)Types.BYTE, 0);
            int mode = (Integer)wrapper.get((Type)Types.VAR_INT, 2);
            if (provider.clickDialog(wrapper.user(), containerId, slot, button, mode)) {
                wrapper.cancel();
            }
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_21_6.TRACKED_WAYPOINT);
    }

    public TagRewriter<ClientboundPacket1_21_6> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_6> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_21_6 getItemRewriter() {
        return this.itemRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_6> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public EntityPacketRewriter1_21_6 getEntityRewriter() {
        return this.entityRewriter;
    }

    private void storeServerLinks(PacketWrapper wrapper) {
        ServerLinks serverLinks = new ServerLinks();
        int length = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        for (int i = 0; i < length; ++i) {
            String url;
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                int id = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                url = (String)wrapper.passthrough(Types.STRING);
                serverLinks.storeLink(id, url);
                continue;
            }
            Tag tag = (Tag)wrapper.passthrough(Types.TRUSTED_TAG);
            url = (String)wrapper.passthrough(Types.STRING);
            serverLinks.storeLink(tag, url);
        }
        wrapper.user().put((StorableObject)serverLinks);
    }

    private void handleClickEvents(PacketWrapper wrapper) {
        String command = (String)wrapper.passthrough(Types.STRING);
        ClickEvents clickEvents = (ClickEvents)wrapper.user().get(ClickEvents.class);
        if (clickEvents.handleChatCommand(wrapper.user(), command)) {
            wrapper.cancel();
        }
    }

    private void clearDialog(PacketWrapper wrapper) {
        wrapper.cancel();
        if (!ViaBackwards.getConfig().dialogsViaChests()) {
            return;
        }
        DialogViewProvider provider = (DialogViewProvider)Via.getManager().getProviders().get(DialogViewProvider.class);
        provider.closeDialog(wrapper.user());
    }

    private void fixSoundSource(PacketWrapper wrapper) {
        int source = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
        if (source == 10) {
            wrapper.set((Type)Types.VAR_INT, 0, (Object)0);
        }
    }

    private void updateTags(PacketWrapper wrapper) {
        this.tagRewriter.handleGeneric(wrapper);
        wrapper.resetReader();
        RegistryAndTags registryAndTags = (RegistryAndTags)wrapper.user().get(RegistryAndTags.class);
        int length = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        for (int i = 0; i < length; ++i) {
            int j;
            int tagsSize;
            String registryKey = (String)wrapper.read(Types.STRING);
            boolean dialog = "dialog".equals(Key.stripMinecraftNamespace((String)registryKey));
            if (dialog) {
                tagsSize = (Integer)wrapper.read((Type)Types.VAR_INT);
                for (j = 0; j < tagsSize; ++j) {
                    String key = (String)wrapper.read(Types.STRING);
                    int[] ids = (int[])wrapper.read(Types.VAR_INT_ARRAY_PRIMITIVE);
                    registryAndTags.storeTags(key, ids);
                }
                continue;
            }
            wrapper.write(Types.STRING, (Object)registryKey);
            tagsSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (j = 0; j < tagsSize; ++j) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.VAR_INT_ARRAY_PRIMITIVE);
            }
        }
        if (registryAndTags.tagsSent()) {
            wrapper.set((Type)Types.VAR_INT, 0, (Object)(length - 1));
        }
    }
}

