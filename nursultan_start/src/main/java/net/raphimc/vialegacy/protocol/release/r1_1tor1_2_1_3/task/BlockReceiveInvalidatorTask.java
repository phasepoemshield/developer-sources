/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.storage.PendingBlocksTracker
 */
package net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.task;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.storage.PendingBlocksTracker;

public class BlockReceiveInvalidatorTask
implements Runnable {
    @Override
    public void run() {
        for (UserConnection info : Via.getManager().getConnectionManager().getConnections()) {
            PendingBlocksTracker pendingBlocksTracker = (PendingBlocksTracker)info.get(PendingBlocksTracker.class);
            if (pendingBlocksTracker == null) continue;
            info.getChannel().eventLoop().submit(() -> ((PendingBlocksTracker)pendingBlocksTracker).tick());
        }
    }
}

