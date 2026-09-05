/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.ServerPlayer;
import javax.annotation.Nullable;

public interface VoicechatConnection {
    public void setConnected(boolean var1);

    public boolean isDisabled();

    @Nullable
    public Group getGroup();

    public boolean isConnected();

    public void setGroup(@Nullable Group var1);

    public boolean isInGroup();

    public void setDisabled(boolean var1);

    public ServerPlayer getPlayer();

    public boolean isInstalled();
}

