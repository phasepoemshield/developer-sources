/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents$AfterSave
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents$BeforeSave
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents$EndDataPackReload
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents$ServerStarted
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents$ServerStarting
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents$ServerStopped
 */
package net.fabricmc.fabric.api.event.lifecycle.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents$ServerStopping;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents$StartDataPackReload;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents$SyncDataPackContents;

public final class ServerLifecycleEvents {
    public static final Event<ServerStarting> SERVER_STARTING = EventFactory.createArrayBacked(ServerStarting.class, serverStartingArray -> class027962 -> {
        for (ServerStarting serverStarting : serverStartingArray) {
            serverStarting.onServerStarting(class027962);
        }
    });
    public static final Event<ServerStarted> SERVER_STARTED = EventFactory.createArrayBacked(ServerStarted.class, serverStartedArray -> class027962 -> {
        for (ServerStarted serverStarted : serverStartedArray) {
            serverStarted.onServerStarted(class027962);
        }
    });
    public static final Event<ServerLifecycleEvents$ServerStopping> SERVER_STOPPING = EventFactory.createArrayBacked(ServerLifecycleEvents$ServerStopping.class, serverLifecycleEvents$ServerStoppingArray -> class027962 -> {
        for (ServerLifecycleEvents$ServerStopping serverLifecycleEvents$ServerStopping : serverLifecycleEvents$ServerStoppingArray) {
            serverLifecycleEvents$ServerStopping.onServerStopping(class027962);
        }
    });
    public static final Event<ServerStopped> SERVER_STOPPED = EventFactory.createArrayBacked(ServerStopped.class, serverStoppedArray -> class027962 -> {
        for (ServerStopped serverStopped : serverStoppedArray) {
            serverStopped.onServerStopped(class027962);
        }
    });
    public static final Event<ServerLifecycleEvents$SyncDataPackContents> SYNC_DATA_PACK_CONTENTS = EventFactory.createArrayBacked(ServerLifecycleEvents$SyncDataPackContents.class, serverLifecycleEvents$SyncDataPackContentsArray -> (class047702, bl) -> {
        for (ServerLifecycleEvents$SyncDataPackContents serverLifecycleEvents$SyncDataPackContents : serverLifecycleEvents$SyncDataPackContentsArray) {
            serverLifecycleEvents$SyncDataPackContents.onSyncDataPackContents(class047702, bl);
        }
    });
    public static final Event<ServerLifecycleEvents$StartDataPackReload> START_DATA_PACK_RELOAD = EventFactory.createArrayBacked(ServerLifecycleEvents$StartDataPackReload.class, serverLifecycleEvents$StartDataPackReloadArray -> (class027962, class035542) -> {
        for (ServerLifecycleEvents$StartDataPackReload serverLifecycleEvents$StartDataPackReload : serverLifecycleEvents$StartDataPackReloadArray) {
            serverLifecycleEvents$StartDataPackReload.startDataPackReload(class027962, class035542);
        }
    });
    public static final Event<EndDataPackReload> END_DATA_PACK_RELOAD = EventFactory.createArrayBacked(EndDataPackReload.class, endDataPackReloadArray -> (class027962, class035542, bl) -> {
        for (EndDataPackReload endDataPackReload : endDataPackReloadArray) {
            endDataPackReload.endDataPackReload(class027962, class035542, bl);
        }
    });
    public static final Event<BeforeSave> BEFORE_SAVE = EventFactory.createArrayBacked(BeforeSave.class, beforeSaveArray -> (class027962, bl, bl2) -> {
        for (BeforeSave beforeSave : beforeSaveArray) {
            beforeSave.onBeforeSave(class027962, bl, bl2);
        }
    });
    public static final Event<AfterSave> AFTER_SAVE = EventFactory.createArrayBacked(AfterSave.class, afterSaveArray -> (class027962, bl, bl2) -> {
        for (AfterSave afterSave : afterSaveArray) {
            afterSave.onAfterSave(class027962, bl, bl2);
        }
    });

    private ServerLifecycleEvents() {
    }
}

