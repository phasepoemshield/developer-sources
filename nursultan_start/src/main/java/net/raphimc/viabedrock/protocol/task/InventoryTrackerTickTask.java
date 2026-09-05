/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  net.raphimc.viabedrock.protocol.BedrockProtocol
 *  net.raphimc.viabedrock.protocol.storage.InventoryTracker
 */
package net.raphimc.viabedrock.protocol.task;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.storage.InventoryTracker;

public class InventoryTrackerTickTask
implements Runnable {
    @Override
    public void run() {
        for (UserConnection info : Via.getManager().getConnectionManager().getConnections()) {
            InventoryTracker inventoryTracker = (InventoryTracker)info.get(InventoryTracker.class);
            if (inventoryTracker == null) continue;
            info.getChannel().eventLoop().submit(() -> {
                if (!info.getChannel().isActive()) {
                    return;
                }
                try {
                    inventoryTracker.tick();
                }
                catch (Throwable e) {
                    BedrockProtocol.kickForIllegalState((UserConnection)info, (String)"Error ticking inventory tracker. See console for details.", (Throwable)e);
                }
            });
        }
    }
}

