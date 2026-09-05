/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.legacy.bossbar.BossColor
 *  com.viaversion.viaversion.api.legacy.bossbar.BossFlag
 *  com.viaversion.viaversion.api.legacy.bossbar.BossStyle
 */
package com.viaversion.viaversion.api.legacy.bossbar;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.legacy.bossbar.BossColor;
import com.viaversion.viaversion.api.legacy.bossbar.BossFlag;
import com.viaversion.viaversion.api.legacy.bossbar.BossStyle;
import java.util.Set;
import java.util.UUID;

public interface BossBar {
    public BossBar addFlag(BossFlag var1);

    public UUID getId();

    public BossBar setColor(BossColor var1);

    public boolean isVisible();

    public Set<UUID> getPlayers();

    public BossBar removeFlag(BossFlag var1);

    public BossBar show();

    public Set<UserConnection> getConnections();

    public BossBar setTitle(String var1);

    public String getTitle();

    public BossColor getColor();

    public BossBar hide();

    public BossBar removeConnection(UserConnection var1);

    public BossStyle getStyle();

    public float getHealth();

    public BossBar setHealth(float var1);

    public BossBar addConnection(UserConnection var1);

    public BossBar addPlayer(UUID var1);

    public BossBar setStyle(BossStyle var1);

    public boolean hasFlag(BossFlag var1);

    public BossBar removePlayer(UUID var1);
}

