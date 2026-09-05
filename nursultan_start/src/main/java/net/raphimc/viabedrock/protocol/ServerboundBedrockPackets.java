/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 */
package net.raphimc.viabedrock.protocol;

import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.MinecraftPacketIds;

public enum ServerboundBedrockPackets implements ServerboundPacketType
{
    LOGIN(MinecraftPacketIds.Login.getValue()),
    CLIENT_TO_SERVER_HANDSHAKE(MinecraftPacketIds.ClientToServerHandshake.getValue()),
    DISCONNECT(MinecraftPacketIds.Disconnect.getValue()),
    RESOURCE_PACK_CLIENT_RESPONSE(MinecraftPacketIds.ResourcePackClientResponse.getValue()),
    TEXT(MinecraftPacketIds.Text.getValue()),
    MOVE_ENTITY_ABSOLUTE(MinecraftPacketIds.MoveAbsoluteActor.getValue()),
    MOVE_PLAYER(MinecraftPacketIds.MovePlayer.getValue()),
    ENTITY_EVENT(MinecraftPacketIds.ActorEvent.getValue()),
    INVENTORY_TRANSACTION(MinecraftPacketIds.InventoryTransaction.getValue()),
    MOB_EQUIPMENT(MinecraftPacketIds.PlayerEquipment.getValue()),
    MOB_ARMOR_EQUIPMENT(MinecraftPacketIds.MobArmorEquipment.getValue()),
    INTERACT(MinecraftPacketIds.Interact.getValue()),
    BLOCK_PICK_REQUEST(MinecraftPacketIds.BlockPickRequest.getValue()),
    ENTITY_PICK_REQUEST(MinecraftPacketIds.ActorPickRequest.getValue()),
    PLAYER_ACTION(MinecraftPacketIds.PlayerAction.getValue()),
    SET_ENTITY_DATA(MinecraftPacketIds.SetActorData.getValue()),
    SET_ENTITY_MOTION(MinecraftPacketIds.SetActorMotion.getValue()),
    SET_ENTITY_LINK(MinecraftPacketIds.SetActorLink.getValue()),
    ANIMATE(MinecraftPacketIds.Animate.getValue()),
    RESPAWN(MinecraftPacketIds.Respawn.getValue()),
    CONTAINER_CLOSE(MinecraftPacketIds.ContainerClose.getValue()),
    PLAYER_HOTBAR(MinecraftPacketIds.PlayerHotbar.getValue()),
    BLOCK_ENTITY_DATA(MinecraftPacketIds.BlockActorData.getValue()),
    SET_DIFFICULTY(MinecraftPacketIds.SetDifficulty.getValue()),
    SET_PLAYER_GAME_TYPE(MinecraftPacketIds.SetPlayerGameType.getValue()),
    SIMPLE_EVENT(MinecraftPacketIds.SimpleEvent.getValue()),
    MAP_INFO_REQUEST(MinecraftPacketIds.MapInfoRequest.getValue()),
    REQUEST_CHUNK_RADIUS(MinecraftPacketIds.RequestChunkRadius.getValue()),
    BOSS_EVENT(MinecraftPacketIds.BossEvent.getValue()),
    SHOW_CREDITS(MinecraftPacketIds.ShowCredits.getValue()),
    COMMAND_REQUEST(MinecraftPacketIds.CommandRequest.getValue()),
    COMMAND_BLOCK_UPDATE(MinecraftPacketIds.CommandBlockUpdate.getValue()),
    RESOURCE_PACK_CHUNK_REQUEST(MinecraftPacketIds.ResourcePackChunkRequest.getValue()),
    STRUCTURE_BLOCK_UPDATE(MinecraftPacketIds.StructureBlockUpdate.getValue()),
    PURCHASE_RECEIPT(MinecraftPacketIds.PurchaseReceipt.getValue()),
    PLAYER_SKIN(MinecraftPacketIds.PlayerSkin.getValue()),
    SUB_CLIENT_LOGIN(MinecraftPacketIds.SubclientLogin.getValue()),
    BOOK_EDIT(MinecraftPacketIds.BookEdit.getValue()),
    NPC_REQUEST(MinecraftPacketIds.NPCRequest.getValue()),
    PHOTO_TRANSFER(MinecraftPacketIds.PhotoTransfer.getValue()),
    MODAL_FORM_RESPONSE(MinecraftPacketIds.ModalFormResponse.getValue()),
    SERVER_SETTINGS_REQUEST(MinecraftPacketIds.ServerSettingsRequest.getValue()),
    SET_DEFAULT_GAME_TYPE(MinecraftPacketIds.SetDefaultGameType.getValue()),
    LAB_TABLE(MinecraftPacketIds.LabTable.getValue()),
    SET_LOCAL_PLAYER_AS_INITIALIZED(MinecraftPacketIds.SetLocalPlayerAsInit.getValue()),
    NETWORK_STACK_LATENCY(MinecraftPacketIds.Ping.getValue()),
    LEVEL_SOUND_EVENT(MinecraftPacketIds.LevelSoundEvent.getValue()),
    LECTERN_UPDATE(MinecraftPacketIds.LecternUpdate.getValue()),
    CLIENT_CACHE_STATUS(MinecraftPacketIds.ClientCacheStatus.getValue()),
    MAP_CREATE_LOCKED_COPY(MinecraftPacketIds.MapCreateLockedCopy.getValue()),
    STRUCTURE_TEMPLATE_DATA_REQUEST(MinecraftPacketIds.StructureTemplateDataExportRequest.getValue()),
    CLIENT_CACHE_BLOB_STATUS(MinecraftPacketIds.ClientCacheBlobStatusPacket.getValue()),
    EMOTE(MinecraftPacketIds.Emote.getValue()),
    MULTIPLAYER_SETTINGS(MinecraftPacketIds.MultiplayerSettingsPacket.getValue()),
    SETTINGS_COMMAND(MinecraftPacketIds.SettingsCommandPacket.getValue()),
    ANVIL_DAMAGE(MinecraftPacketIds.AnvilDamage.getValue()),
    PLAYER_AUTH_INPUT(MinecraftPacketIds.PlayerAuthInputPacket.getValue()),
    ITEM_STACK_REQUEST(MinecraftPacketIds.ItemStackRequest.getValue()),
    EMOTE_LIST(MinecraftPacketIds.EmoteList.getValue()),
    POSITION_TRACKING_DB_CLIENT_REQUEST(MinecraftPacketIds.PositionTrackingDBClientRequest.getValue()),
    DEBUG_INFO(MinecraftPacketIds.DebugInfoPacket.getValue()),
    PACKET_VIOLATION_WARNING(MinecraftPacketIds.PacketViolationWarning.getValue()),
    CREATE_PHOTO(MinecraftPacketIds.CreatePhotoPacket.getValue()),
    SUB_CHUNK_REQUEST(MinecraftPacketIds.SubChunkRequestPacket.getValue()),
    SCRIPT_MESSAGE(MinecraftPacketIds.ScriptMessagePacket.getValue()),
    CODE_BUILDER_SOURCE(MinecraftPacketIds.CodeBuilderSourcePacket.getValue()),
    REQUEST_ABILITY(MinecraftPacketIds.RequestAbilityPacket.getValue()),
    REQUEST_PERMISSIONS(MinecraftPacketIds.RequestPermissionsPacket.getValue()),
    EDITOR_NETWORK(MinecraftPacketIds.EditorNetworkPacket.getValue()),
    REQUEST_NETWORK_SETTINGS(MinecraftPacketIds.RequestNetworkSettings.getValue()),
    GAME_TEST_REQUEST(MinecraftPacketIds.GameTestRequestPacket.getValue()),
    REFRESH_ENTITLEMENTS(MinecraftPacketIds.RefreshEntitlementsPacket.getValue()),
    TOGGLE_CRAFTER_SLOT_REQUEST(MinecraftPacketIds.PlayerToggleCrafterSlotRequestPacket.getValue()),
    SET_PLAYER_INVENTORY_OPTIONS(MinecraftPacketIds.SetPlayerInventoryOptions.getValue()),
    LOADING_SCREEN(MinecraftPacketIds.ServerboundLoadingScreenPacket.getValue()),
    DEBUG_DIAGNOSTICS(MinecraftPacketIds.ServerboundDiagnosticsPacket.getValue()),
    CLIENT_CAMERA_AIM_ASSIST(MinecraftPacketIds.ClientCameraAimAssist.getValue()),
    MOVEMENT_PREDICTION_SYNC(MinecraftPacketIds.ClientMovementPredictionSyncPacket.getValue()),
    UPDATE_CLIENT_OPTIONS(MinecraftPacketIds.UpdateClientOptions.getValue()),
    PLAYER_LOCATION(MinecraftPacketIds.PlayerLocation.getValue()),
    PACK_SETTING_CHANGE(MinecraftPacketIds.ServerboundPackSettingChange.getValue()),
    DATA_STORE(MinecraftPacketIds.ServerboundDataStore.getValue()),
    RESOURCE_PACKS_READY_FOR_VALIDATION(MinecraftPacketIds.ResourcePacksReadyForValidation.getValue()),
    PARTY_CHANGED(MinecraftPacketIds.PartyChanged.getValue()),
    DATA_DRIVEN_SCREEN_CLOSED(MinecraftPacketIds.ServerboundDataDrivenScreenClosed.getValue());

    private static final ServerboundBedrockPackets[] REGISTRY;
    private final int id;

    public static ServerboundBedrockPackets getPacket(int id) {
        if (id < 0 || id >= REGISTRY.length) {
            return null;
        }
        return REGISTRY[id];
    }

    private ServerboundBedrockPackets(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name();
    }

    static {
        REGISTRY = new ServerboundBedrockPackets[512];
        ServerboundBedrockPackets[] serverboundBedrockPacketsArray = ServerboundBedrockPackets.values();
        int n = serverboundBedrockPacketsArray.length;
        for (int i = 0; i < n; ++i) {
            ServerboundBedrockPackets packet;
            ServerboundBedrockPackets.REGISTRY[packet.id] = packet = serverboundBedrockPacketsArray[i];
        }
    }
}

