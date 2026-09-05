/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  net.raphimc.vialegacy.protocol.beta.b1_5_0_2tob1_6_0_6.storage.WorldTimeStorage
 */
package net.raphimc.vialegacy.protocol.beta.b1_5_0_2tob1_6_0_6.task;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import net.raphimc.vialegacy.protocol.beta.b1_5_0_2tob1_6_0_6.storage.WorldTimeStorage;

public class TimeTrackTask
implements Runnable {
    @Override
    public void run() {
        for (UserConnection info : Via.getManager().getConnectionManager().getConnections()) {
            WorldTimeStorage worldTimeStorage = (WorldTimeStorage)info.get(WorldTimeStorage.class);
            if (worldTimeStorage == null) continue;
            ++worldTimeStorage.time;
        }
    }
}

