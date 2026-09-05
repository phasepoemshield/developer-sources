/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.net.AddCategoryPacket
 *  de.maxhenkel.voicechat.net.NetManager
 *  de.maxhenkel.voicechat.net.Packet
 *  de.maxhenkel.voicechat.net.RemoveCategoryPacket
 *  de.maxhenkel.voicechat.plugins.CategoryManager
 *  de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl
 *  javax.annotation.Nullable
 *  minecraft.class02796
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.voice.server;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.net.AddCategoryPacket;
import de.maxhenkel.voicechat.net.NetManager;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.net.RemoveCategoryPacket;
import de.maxhenkel.voicechat.plugins.CategoryManager;
import de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl;
import de.maxhenkel.voicechat.voice.server.Server;
import javax.annotation.Nullable;
import minecraft.class02796;
import minecraft.class04770;

public class ServerCategoryManager
extends CategoryManager {
    private final Server server;

    public ServerCategoryManager(Server server) {
        this.server = server;
    }

    private void broadcastAddCategory(class02796 class027962, VolumeCategoryImpl volumeCategoryImpl) {
        AddCategoryPacket addCategoryPacket = new AddCategoryPacket(volumeCategoryImpl);
        class027962.Nm().v().forEach(class047702 -> NetManager.sendToClient((class04770)class047702, (Packet)addCategoryPacket));
    }

    private void broadcastRemoveCategory(class02796 class027962, String string) {
        RemoveCategoryPacket removeCategoryPacket = new RemoveCategoryPacket(string);
        class027962.Nm().v().forEach(class047702 -> NetManager.sendToClient((class04770)class047702, (Packet)removeCategoryPacket));
    }

    @Nullable
    public VolumeCategoryImpl removeCategory(String string) {
        VolumeCategoryImpl volumeCategoryImpl = super.removeCategory(string);
        Voicechat.LOGGER.debug("Removing volume category {} for all players", new Object[]{string});
        this.broadcastRemoveCategory(this.server.getServer(), string);
        return volumeCategoryImpl;
    }

    public void addCategory(VolumeCategoryImpl volumeCategoryImpl) {
        super.addCategory(volumeCategoryImpl);
        Voicechat.LOGGER.debug("Synchronizing volume category {} with all players", new Object[]{volumeCategoryImpl.getId()});
        this.broadcastAddCategory(this.server.getServer(), volumeCategoryImpl);
    }

    public void onPlayerCompatibilityCheckSucceeded(class04770 class047702) {
        Voicechat.LOGGER.debug("Synchronizing {} volume categories with {}", new Object[]{this.categories.size(), class047702.method_5477().getString()});
        for (VolumeCategoryImpl volumeCategoryImpl : this.getCategories()) {
            this.broadcastAddCategory(this.server.getServer(), volumeCategoryImpl);
        }
    }
}

