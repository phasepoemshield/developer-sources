/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.event.events.BlockChangeEvent
 *  baritone.api.event.events.BlockInteractEvent
 *  baritone.api.event.events.ChatEvent
 *  baritone.api.event.events.ChunkEvent
 *  baritone.api.event.events.ChunkEvent$Type
 *  baritone.api.event.events.PacketEvent
 *  baritone.api.event.events.PathEvent
 *  baritone.api.event.events.PlayerUpdateEvent
 *  baritone.api.event.events.RenderEvent
 *  baritone.api.event.events.RotationMoveEvent
 *  baritone.api.event.events.SprintStateEvent
 *  baritone.api.event.events.TabCompleteEvent
 *  baritone.api.event.events.TickEvent
 *  baritone.api.event.events.TickEvent$Type
 *  baritone.api.event.events.WorldEvent
 *  baritone.api.event.events.type.EventState
 *  baritone.api.event.listener.IEventBus
 *  baritone.api.event.listener.IGameEventListener
 *  baritone.api.utils.Helper
 *  baritone.api.utils.Pair
 *  baritone.cache.CachedChunk
 *  baritone.utils.BlockStateInterface
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00570
 *  minecraft.class01339
 *  minecraft.class07299
 *  minecraft.class07321
 */
package baritone.event;

import baritone.Baritone;
import baritone.api.event.events.BlockChangeEvent;
import baritone.api.event.events.BlockInteractEvent;
import baritone.api.event.events.ChatEvent;
import baritone.api.event.events.ChunkEvent;
import baritone.api.event.events.PacketEvent;
import baritone.api.event.events.PathEvent;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.RenderEvent;
import baritone.api.event.events.RotationMoveEvent;
import baritone.api.event.events.SprintStateEvent;
import baritone.api.event.events.TabCompleteEvent;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.WorldEvent;
import baritone.api.event.events.type.EventState;
import baritone.api.event.listener.IEventBus;
import baritone.api.event.listener.IGameEventListener;
import baritone.api.utils.Helper;
import baritone.api.utils.Pair;
import baritone.cache.CachedChunk;
import baritone.cache.WorldProvider;
import baritone.utils.BlockStateInterface;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import minecraft.class00570;
import minecraft.class01339;
import minecraft.class07299;
import minecraft.class07321;

public final class GameEventHandler
implements IEventBus,
Helper {
    private final Baritone baritone;
    private final List<IGameEventListener> listeners = new CopyOnWriteArrayList<IGameEventListener>();

    public GameEventHandler(Baritone baritone) {
        this.baritone = baritone;
    }

    public final void onSendChatMessage(ChatEvent chatEvent) {
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onSendChatMessage(chatEvent));
    }

    public final void onTick(TickEvent tickEvent) {
        if (tickEvent.getType() == TickEvent.Type.IN) {
            try {
                this.baritone.bsi = new BlockStateInterface(this.baritone.getPlayerContext(), true);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.baritone.bsi = null;
            }
        } else {
            this.baritone.bsi = null;
        }
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onTick(tickEvent));
    }

    public void onPlayerRotationMove(RotationMoveEvent rotationMoveEvent) {
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onPlayerRotationMove(rotationMoveEvent));
    }

    public final void onPlayerUpdate(PlayerUpdateEvent playerUpdateEvent) {
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onPlayerUpdate(playerUpdateEvent));
    }

    public void onPlayerDeath() {
        this.listeners.forEach(IGameEventListener::onPlayerDeath);
    }

    public void onBlockChange(BlockChangeEvent blockChangeEvent) {
        if (((Boolean)Baritone.settings().repackOnAnyBlockChange.value).booleanValue()) {
            boolean bl = blockChangeEvent.getBlocks().stream().map(Pair::second).map(class01339::i).anyMatch(arg_0 -> ((ImmutableSet)CachedChunk.BLOCKS_TO_KEEP_TRACK_OF).contains(arg_0));
            if (bl) {
                this.baritone.getWorldProvider().ifWorldLoaded(iWorldData -> {
                    class07299 class072992 = this.baritone.getPlayerContext().world();
                    class07321 class073212 = blockChangeEvent.getChunkPos();
                    iWorldData.getCachedWorld().queueForPacking(class072992.method_8497(class073212.B, class073212.Z));
                });
            }
        }
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onBlockChange(blockChangeEvent));
    }

    public void onChunkEvent(ChunkEvent chunkEvent) {
        boolean bl;
        EventState eventState = chunkEvent.getState();
        ChunkEvent.Type type = chunkEvent.getType();
        class07299 class072992 = this.baritone.getPlayerContext().world();
        boolean bl2 = bl = eventState == EventState.PRE && type == ChunkEvent.Type.UNLOAD && class072992.method_8398().N(chunkEvent.getX(), chunkEvent.getZ(), null, false) != null;
        if (chunkEvent.isPostPopulate() || bl) {
            this.baritone.getWorldProvider().ifWorldLoaded(iWorldData -> {
                class00570 class005702 = class072992.method_8497(chunkEvent.getX(), chunkEvent.getZ());
                iWorldData.getCachedWorld().queueForPacking(class005702);
            });
        }
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onChunkEvent(chunkEvent));
    }

    public void onPostTick(TickEvent tickEvent) {
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onPostTick(tickEvent));
    }

    public final void onRenderPass(RenderEvent renderEvent) {
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onRenderPass(renderEvent));
    }

    public void onPreTabComplete(TabCompleteEvent tabCompleteEvent) {
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onPreTabComplete(tabCompleteEvent));
    }

    public void onBlockInteract(BlockInteractEvent blockInteractEvent) {
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onBlockInteract(blockInteractEvent));
    }

    public void onPathEvent(PathEvent pathEvent) {
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onPathEvent(pathEvent));
    }

    public final void onWorldEvent(WorldEvent worldEvent) {
        WorldProvider worldProvider = this.baritone.getWorldProvider();
        if (worldEvent.getState() == EventState.POST) {
            worldProvider.closeWorld();
            if (worldEvent.getWorld() != null) {
                worldProvider.initWorld((class07299)worldEvent.getWorld());
            }
        }
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onWorldEvent(worldEvent));
    }

    public final void onReceivePacket(PacketEvent packetEvent) {
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onReceivePacket(packetEvent));
    }

    public final void onSendPacket(PacketEvent packetEvent) {
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onSendPacket(packetEvent));
    }

    public void onPlayerSprintState(SprintStateEvent sprintStateEvent) {
        this.listeners.forEach(iGameEventListener -> iGameEventListener.onPlayerSprintState(sprintStateEvent));
    }

    public final void registerEventListener(IGameEventListener iGameEventListener) {
        this.listeners.add(iGameEventListener);
    }
}

