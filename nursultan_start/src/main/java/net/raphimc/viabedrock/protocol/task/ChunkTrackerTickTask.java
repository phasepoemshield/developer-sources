/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  net.raphimc.viabedrock.protocol.BedrockProtocol
 */
package net.raphimc.viabedrock.protocol.task;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.storage.ChunkTracker;

public class ChunkTrackerTickTask
implements Runnable {
    @Override
    public void run() {
        for (UserConnection info : Via.getManager().getConnectionManager().getConnections()) {
            ChunkTracker chunkTracker = (ChunkTracker)info.get(ChunkTracker.class);
            if (chunkTracker == null) continue;
            info.getChannel().eventLoop().submit(() -> {
                if (!info.getChannel().isActive()) {
                    return;
                }
                try {
                    chunkTracker.tick();
                }
                catch (Throwable e) {
                    BedrockProtocol.kickForIllegalState((UserConnection)info, (String)"Error ticking chunk tracker. See console for details.", (Throwable)e);
                }
            });
        }
    }
}

