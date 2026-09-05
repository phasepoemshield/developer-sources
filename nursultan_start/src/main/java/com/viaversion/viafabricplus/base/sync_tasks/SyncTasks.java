/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  minecraft.class01042
 *  minecraft.class04247
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.base.sync_tasks;

import com.viaversion.viafabricplus.base.sync_tasks.DataCustomPayload;
import io.netty.buffer.ByteBuf;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import minecraft.class00667;
import minecraft.class01042;
import minecraft.class04247;
import minecraft.class06202;

public final class SyncTasks {
    private static final Map<String, Consumer<class04247>> PENDING_EXECUTION_TASKS = new ConcurrentHashMap<String, Consumer<class04247>>();
    public static final String PACKET_SYNC_IDENTIFIER = String.valueOf(UUID.randomUUID()) + ":" + String.valueOf(UUID.randomUUID());

    public static void init() {
        DataCustomPayload.init();
    }

    public static void handleSyncTask(class00667 class006672) {
        String string = class006672.s();
        if (PENDING_EXECUTION_TASKS.containsKey(string)) {
            class06202.Nq().execute(() -> {
                Consumer<class04247> consumer = PENDING_EXECUTION_TASKS.remove(string);
                consumer.accept(new class04247((ByteBuf)class006672, (class01042)class06202.Nq().NE().j()));
            });
        }
    }

    public static String executeSyncTask(Consumer<class04247> consumer) {
        String string = UUID.randomUUID().toString();
        PENDING_EXECUTION_TASKS.put(string, consumer);
        return string;
    }
}

