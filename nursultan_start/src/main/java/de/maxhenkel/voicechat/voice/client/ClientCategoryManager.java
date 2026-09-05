/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.gui.volume.AdjustVolumeList
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.net.Channel
 *  de.maxhenkel.voicechat.net.ClientServerNetManager
 *  de.maxhenkel.voicechat.plugins.CategoryManager
 *  de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl
 *  javax.annotation.Nullable
 *  minecraft.class01894
 *  minecraft.class06202
 *  minecraft.class08280
 *  minecraft.class08829
 *  minecraft.class08918
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumeList;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.net.Channel;
import de.maxhenkel.voicechat.net.ClientServerNetManager;
import de.maxhenkel.voicechat.plugins.CategoryManager;
import de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import minecraft.class01894;
import minecraft.class06202;
import minecraft.class08280;
import minecraft.class08829;
import minecraft.class08918;

public class ClientCategoryManager
extends CategoryManager {
    protected final Map<String, class01894> images = new ConcurrentHashMap<String, class01894>();

    public ClientCategoryManager() {
        ClientServerNetManager.setClientListener((Channel)CommonCompatibilityManager.INSTANCE.getNetManager().addCategoryChannel, (class044532, addCategoryPacket) -> {
            this.addCategory(addCategoryPacket.getCategory());
            Voicechat.LOGGER.debug("Added category {}", new Object[]{addCategoryPacket.getCategory().getId()});
        });
        ClientServerNetManager.setClientListener((Channel)CommonCompatibilityManager.INSTANCE.getNetManager().removeCategoryChannel, (class044532, removeCategoryPacket) -> {
            this.removeCategory(removeCategoryPacket.getCategoryId());
            Voicechat.LOGGER.debug("Removed category {}", new Object[]{removeCategoryPacket.getCategoryId()});
        });
        ClientCompatibilityManager.INSTANCE.onDisconnect(this::clear);
    }

    public void clear() {
        this.categories.keySet().forEach(this::unRegisterImage);
        this.categories.clear();
    }

    private void registerImage(String string, class08280 class082802) {
        class01894 class018942 = class01894.N((String)"voicechat", (String)string);
        class06202.Nq().Ng().N.N(class018942, (class08918)new class08829(() -> ((class01894)class018942).toString(), class082802));
        this.images.put(string, class018942);
    }

    @Nullable
    public VolumeCategoryImpl removeCategory(String string) {
        VolumeCategoryImpl volumeCategoryImpl = super.removeCategory(string);
        this.unRegisterImage(string);
        AdjustVolumeList.update();
        return volumeCategoryImpl;
    }

    private void unRegisterImage(String string) {
        class01894 class018942 = this.images.get(string);
        if (class018942 != null) {
            class06202.Nq().Ng().N.L(class018942);
            this.images.remove(string);
        }
    }

    public class01894 getTexture(String string, class01894 class018942) {
        return this.images.getOrDefault(string, class018942);
    }

    public void addCategory(VolumeCategoryImpl volumeCategoryImpl) {
        super.addCategory(volumeCategoryImpl);
        if (volumeCategoryImpl.getIcon() != null) {
            this.registerImage(volumeCategoryImpl.getId(), this.fromIntArray(volumeCategoryImpl.getIcon()));
        }
        AdjustVolumeList.update();
    }

    private class08280 fromIntArray(int[][] nArray) {
        if (nArray.length != 16) {
            throw new IllegalStateException("Icon is not 16x16");
        }
        class08280 class082802 = new class08280(16, 16, true);
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i].length != 16) {
                class082802.close();
                throw new IllegalStateException("Icon is not 16x16");
            }
            for (int j = 0; j < nArray.length; ++j) {
                class082802.y(i, j, nArray[i][j]);
            }
        }
        return class082802;
    }
}

