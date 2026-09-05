/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  net.raphimc.viabedrock.protocol.BedrockProtocol
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 */
package net.raphimc.viabedrock.protocol.task;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;

public class EntityTrackerTickTask
implements Runnable {
    @Override
    public void run() {
        for (UserConnection info : Via.getManager().getConnectionManager().getConnections()) {
            EntityTracker entityTracker = (EntityTracker)info.get(EntityTracker.class);
            if (entityTracker == null) continue;
            info.getChannel().eventLoop().submit(() -> {
                if (!info.getChannel().isActive()) {
                    return;
                }
                try {
                    entityTracker.tick();
                }
                catch (Throwable e) {
                    BedrockProtocol.kickForIllegalState((UserConnection)info, (String)"Error ticking entity tracker. See console for details.", (Throwable)e);
                }
            });
        }
    }
}

