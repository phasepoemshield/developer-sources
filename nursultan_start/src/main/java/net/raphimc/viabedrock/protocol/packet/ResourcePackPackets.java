/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.util.TextUtil
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PackType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ResourcePackResponse
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.ResourcePackAction
 *  net.raphimc.viabedrock.protocol.packet.ResourcePackPackets$1
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackDownloadTracker
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackDownloadTracker$Download
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackLoadStateTracker
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackLoadStateTracker$Info
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackStorage
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.resourcepack.ResourcePack;
import net.raphimc.viabedrock.api.util.TextUtil;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.ProtocolConstants;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PackType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ResourcePackResponse;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.ResourcePackAction;
import net.raphimc.viabedrock.protocol.model.Experiment;
import net.raphimc.viabedrock.protocol.packet.ResourcePackPackets;
import net.raphimc.viabedrock.protocol.provider.ResourcePackProvider;
import net.raphimc.viabedrock.protocol.storage.ResourcePackDownloadTracker;
import net.raphimc.viabedrock.protocol.storage.ResourcePackLoadStateTracker;
import net.raphimc.viabedrock.protocol.storage.ResourcePackStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class ResourcePackPackets {
    public static void register(BedrockProtocol protocol) {
        protocol.registerClientboundTransition(ClientboundBedrockPackets.RESOURCE_PACKS_INFO, ClientboundConfigurationPackets1_21_9.RESOURCE_PACK_PUSH, wrapper -> {
            if (wrapper.user().has(ResourcePackLoadStateTracker.class) || wrapper.user().has(ResourcePackStorage.class)) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received RESOURCE_PACKS_INFO after resource pack negotiation was already started/finished");
                wrapper.cancel();
                return;
            }
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read(BedrockTypes.UUID);
            wrapper.read(BedrockTypes.STRING);
            ResourcePackLoadStateTracker.Info[] infos = new ResourcePackLoadStateTracker.Info[((Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_SHORT_LE)).intValue()];
            for (int i = 0; i < infos.length; ++i) {
                UUID id = (UUID)wrapper.read(BedrockTypes.UUID);
                String version = (String)wrapper.read(BedrockTypes.STRING);
                wrapper.read((Type)BedrockTypes.UNSIGNED_LONG_LE);
                byte[] contentKey = (byte[])wrapper.read(BedrockTypes.BYTE_ARRAY);
                wrapper.read(BedrockTypes.STRING);
                String contentId = (String)wrapper.read(BedrockTypes.STRING);
                wrapper.read((Type)Types.BOOLEAN);
                wrapper.read((Type)Types.BOOLEAN);
                wrapper.read((Type)Types.BOOLEAN);
                URL cdnUrl = null;
                try {
                    String cdnUrlString = (String)wrapper.read(BedrockTypes.STRING);
                    if (!cdnUrlString.isEmpty()) {
                        cdnUrl = new URL(cdnUrlString);
                    }
                }
                catch (MalformedURLException malformedURLException) {
                    // empty catch block
                }
                infos[i] = new ResourcePackLoadStateTracker.Info(new ResourcePack.Key(id, version), contentKey, contentId, cdnUrl);
            }
            wrapper.user().put((StorableObject)new ResourcePackLoadStateTracker(wrapper.user(), infos));
            if (ViaBedrock.getConfig().shouldTranslateResourcePacks() && wrapper.user().getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolConstants.JAVA_VERSION)) {
                UUID httpToken = UUID.randomUUID();
                ViaBedrock.getResourcePackServer().addConnection(httpToken, wrapper.user());
                wrapper.write(Types.UUID, (Object)UUID.randomUUID());
                wrapper.write(Types.STRING, (Object)(ViaBedrock.getResourcePackServer().getUrl() + "?token=" + String.valueOf(httpToken)));
                wrapper.write(Types.STRING, (Object)"");
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
                wrapper.write(Types.OPTIONAL_TAG, (Object)TextUtil.stringToNbt((String)"\n\u00a7aIf you press 'Yes', the resource packs will be downloaded and converted to the Java Edition format. This may take a while, depending on your internet connection and the size of the packs. If you press 'No', you can join without loading the resource packs but you will have a worse gameplay experience."));
            } else {
                wrapper.cancel();
                PacketWrapper resourcePack = PacketWrapper.create((PacketType)ServerboundConfigurationPackets1_21_9.RESOURCE_PACK, (UserConnection)wrapper.user());
                resourcePack.write(Types.UUID, (Object)UUID.randomUUID());
                resourcePack.write((Type)Types.VAR_INT, (Object)ResourcePackAction.DECLINED.ordinal());
                resourcePack.sendToServer(BedrockProtocol.class, false);
            }
        }, State.PLAY, PacketWrapper::cancel);
        protocol.registerClientbound(ClientboundBedrockPackets.RESOURCE_PACK_STACK, null, wrapper -> {
            wrapper.cancel();
            ResourcePackLoadStateTracker loadStateTracker = (ResourcePackLoadStateTracker)wrapper.user().remove(ResourcePackLoadStateTracker.class);
            if (loadStateTracker != null) {
                wrapper.read((Type)Types.BOOLEAN);
                ResourcePack.Key[] keys = new ResourcePack.Key[((Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT)).intValue()];
                for (int i = 0; i < keys.length; ++i) {
                    Experiment[] id = UUID.fromString((String)wrapper.read(BedrockTypes.STRING));
                    String version = (String)wrapper.read(BedrockTypes.STRING);
                    wrapper.read(BedrockTypes.STRING);
                    keys[i] = new ResourcePack.Key((UUID)id, version);
                }
                wrapper.read(BedrockTypes.STRING);
                Experiment[] experiments = (Experiment[])wrapper.read(BedrockTypes.EXPERIMENT_ARRAY);
                wrapper.read((Type)Types.BOOLEAN);
                wrapper.read((Type)Types.BOOLEAN);
                for (Experiment experiment : experiments) {
                    if (!experiment.enabled()) continue;
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "This server uses an experimental resource pack: " + experiment.name());
                }
                loadStateTracker.loadUnrequestedResourcePacks(keys);
                ArrayList<ResourcePack> resourcePacks = new ArrayList<ResourcePack>();
                for (ResourcePack.Key key : keys) {
                    ResourcePack resourcePack = loadStateTracker.getResourcePack(key);
                    if (resourcePack != null) {
                        ResourcePackLoadStateTracker.Info info = loadStateTracker.getRequest(key);
                        if (info != null && info.contentKey().length > 0 && resourcePack.isContentEncrypted()) {
                            resourcePack.decryptContent(info.contentKey(), info.contentId());
                            try {
                                ((ResourcePackProvider)Via.getManager().getProviders().get(ResourcePackProvider.class)).save(resourcePack);
                            }
                            catch (Throwable e) {
                                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Failed to save resource pack: " + String.valueOf((Object)resourcePack.key()), e);
                            }
                        }
                        resourcePacks.add(resourcePack);
                        continue;
                    }
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing resource pack: " + String.valueOf((Object)key));
                }
                wrapper.user().put((StorableObject)new ResourcePackStorage(resourcePacks));
            }
            if (loadStateTracker == null || !loadStateTracker.hasJavaClientAccepted()) {
                PacketWrapper resourcePackClientResponse = wrapper.create((PacketType)ServerboundBedrockPackets.RESOURCE_PACK_CLIENT_RESPONSE);
                resourcePackClientResponse.write((Type)Types.BYTE, (Object)((byte)ResourcePackResponse.ResourcePackStackFinished.getValue()));
                resourcePackClientResponse.write(BedrockTypes.SHORT_LE_STRING_ARRAY, (Object)new String[0]);
                resourcePackClientResponse.sendToServer(BedrockProtocol.class);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.RESOURCE_PACK_DATA_INFO, null, wrapper -> {
            wrapper.cancel();
            String key = (String)wrapper.read(BedrockTypes.STRING);
            long chunkSize = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_INT_LE);
            wrapper.read((Type)BedrockTypes.UNSIGNED_INT_LE);
            long size = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_LONG_LE);
            byte[] hash = (byte[])wrapper.read(BedrockTypes.BYTE_ARRAY);
            boolean premium = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            PackType type = PackType.getByValue((int)((Short)wrapper.read((Type)Types.UNSIGNED_BYTE)).shortValue(), (PackType)PackType.Invalid);
            ResourcePackDownloadTracker.Download download = ((ResourcePackDownloadTracker)wrapper.user().get(ResourcePackDownloadTracker.class)).add(key, size, chunkSize, hash, premium, type);
            for (long chunk = 0L; chunk < (long)download.receivedChunks().length; ++chunk) {
                PacketWrapper resourcePackChunkRequest = wrapper.create((PacketType)ServerboundBedrockPackets.RESOURCE_PACK_CHUNK_REQUEST);
                resourcePackChunkRequest.write(BedrockTypes.STRING, (Object)key);
                resourcePackChunkRequest.write((Type)BedrockTypes.UNSIGNED_INT_LE, (Object)chunk);
                resourcePackChunkRequest.sendToServer(BedrockProtocol.class);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.RESOURCE_PACK_CHUNK_DATA, null, wrapper -> {
            wrapper.cancel();
            String key = (String)wrapper.read(BedrockTypes.STRING);
            long chunk = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_INT_LE);
            wrapper.read((Type)BedrockTypes.UNSIGNED_LONG_LE);
            byte[] data = (byte[])wrapper.read(BedrockTypes.BYTE_ARRAY);
            ResourcePackDownloadTracker downloadTracker = (ResourcePackDownloadTracker)wrapper.user().get(ResourcePackDownloadTracker.class);
            ResourcePackDownloadTracker.Download download = downloadTracker.get(key);
            if (download != null) {
                ResourcePack resourcePack = download.processDataChunk(chunk, data);
                if (resourcePack != null) {
                    ResourcePackLoadStateTracker loadStateTracker;
                    downloadTracker.remove(key);
                    if (download.type() == PackType.Resources && (loadStateTracker = (ResourcePackLoadStateTracker)wrapper.user().get(ResourcePackLoadStateTracker.class)) != null) {
                        loadStateTracker.addRemoteResourcePack(resourcePack);
                    }
                }
            } else {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received RESOURCE_PACK_CHUNK_DATA for unknown pack: " + key);
            }
        });
        protocol.registerServerboundTransition((ServerboundPacketType)ServerboundConfigurationPackets1_21_9.RESOURCE_PACK, ServerboundBedrockPackets.RESOURCE_PACK_CLIENT_RESPONSE, wrapper -> {
            wrapper.read(Types.UUID);
            ResourcePackAction action = ResourcePackAction.values()[(Integer)wrapper.read((Type)Types.VAR_INT)];
            switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$java$generated$ResourcePackAction[action.ordinal()]) {
                case 1: {
                    ResourcePackStorage resourcePackStorage = (ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class);
                    if (resourcePackStorage != null) {
                        resourcePackStorage.setLoadedOnJavaClient();
                    }
                    wrapper.write((Type)Types.BYTE, (Object)((byte)ResourcePackResponse.ResourcePackStackFinished.getValue()));
                    wrapper.write(BedrockTypes.SHORT_LE_STRING_ARRAY, (Object)new String[0]);
                    break;
                }
                case 2: 
                case 3: 
                case 4: {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Client resource pack download/load failed");
                    wrapper.write((Type)Types.BYTE, (Object)((byte)ResourcePackResponse.ResourcePackStackFinished.getValue()));
                    wrapper.write(BedrockTypes.SHORT_LE_STRING_ARRAY, (Object)new String[0]);
                    break;
                }
                case 5: 
                case 6: {
                    wrapper.write((Type)Types.BYTE, (Object)((byte)ResourcePackResponse.DownloadingFinished.getValue()));
                    wrapper.write(BedrockTypes.SHORT_LE_STRING_ARRAY, (Object)new String[0]);
                    break;
                }
                case 7: {
                    ResourcePackLoadStateTracker loadStateTracker = (ResourcePackLoadStateTracker)wrapper.user().get(ResourcePackLoadStateTracker.class);
                    if (loadStateTracker != null) {
                        wrapper.cancel();
                        loadStateTracker.setJavaClientAccepted();
                        ((CompletableFuture)loadStateTracker.loadRequestedResourcePacks().thenAccept(v -> {
                            PacketWrapper resourcePackClientResponse = PacketWrapper.create((PacketType)ServerboundBedrockPackets.RESOURCE_PACK_CLIENT_RESPONSE, (UserConnection)wrapper.user());
                            resourcePackClientResponse.write((Type)Types.BYTE, (Object)((byte)ResourcePackResponse.DownloadingFinished.getValue()));
                            resourcePackClientResponse.write(BedrockTypes.SHORT_LE_STRING_ARRAY, (Object)new String[0]);
                            resourcePackClientResponse.scheduleSendToServer(BedrockProtocol.class);
                        })).exceptionally(e -> {
                            BedrockProtocol.kickForIllegalState(wrapper.user(), "One of the server resource packs failed to load. Try again later or decline the resource packs.", e);
                            return null;
                        });
                        break;
                    }
                    wrapper.write((Type)Types.BYTE, (Object)((byte)ResourcePackResponse.DownloadingFinished.getValue()));
                    wrapper.write(BedrockTypes.SHORT_LE_STRING_ARRAY, (Object)new String[0]);
                    break;
                }
                case 8: {
                    wrapper.cancel();
                    break;
                }
                default: {
                    throw new IllegalStateException("Unhandled ResourcePackAction: " + String.valueOf(action));
                }
            }
        });
    }
}

