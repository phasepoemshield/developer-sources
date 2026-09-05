/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class07536
 */
package de.maxhenkel.voicechat.gui.volume;

import com.google.common.collect.Lists;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumesScreen;
import de.maxhenkel.voicechat.gui.volume.CategoryVolumeEntry;
import de.maxhenkel.voicechat.gui.volume.PlayerVolumeEntry;
import de.maxhenkel.voicechat.gui.volume.VolumeEntry;
import de.maxhenkel.voicechat.gui.widgets.ListScreenListBase;
import de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class07536;

public class AdjustVolumeList
extends ListScreenListBase<VolumeEntry> {
    protected AdjustVolumesScreen screen;
    protected final List<VolumeEntry> entries;
    protected String filter;

    public void setFilter(String string) {
        this.filter = string;
        this.updateFilter();
    }

    public AdjustVolumeList(int n, int n2, int n3, int n4, AdjustVolumesScreen adjustVolumesScreen) {
        super(n, n2, n3, n4);
        this.screen = adjustVolumesScreen;
        this.entries = Lists.newArrayList();
        this.filter = "";
        this.updateEntryList();
    }

    public static void update() {
        class05096 class050962 = (class05096)class06202.Nq().v_3;
        if (class050962 instanceof AdjustVolumesScreen) {
            AdjustVolumesScreen adjustVolumesScreen = (AdjustVolumesScreen)class050962;
            adjustVolumesScreen.volumeList.updateEntryList();
        }
    }

    public boolean isEmpty() {
        return this.method_25396().isEmpty();
    }

    private String volumeEntryToSearchString(VolumeEntry volumeEntry) {
        if (volumeEntry instanceof PlayerVolumeEntry) {
            PlayerVolumeEntry playerVolumeEntry = (PlayerVolumeEntry)volumeEntry;
            return playerVolumeEntry.getState() == null ? "" : playerVolumeEntry.getState().getName();
        }
        if (volumeEntry instanceof CategoryVolumeEntry) {
            CategoryVolumeEntry categoryVolumeEntry = (CategoryVolumeEntry)volumeEntry;
            return categoryVolumeEntry.getCategory().getSearchName();
        }
        return "";
    }

    public void updateEntryList() {
        List list = ClientManager.getPlayerStateManager().getPlayerStates(false);
        this.entries.clear();
        for (VolumeCategoryImpl volumeCategoryImpl : ClientManager.getCategoryManager().getCategories()) {
            this.entries.add(new CategoryVolumeEntry(volumeCategoryImpl, this.screen));
        }
        for (VolumeCategoryImpl volumeCategoryImpl : list) {
            this.entries.add(new PlayerVolumeEntry((PlayerState)volumeCategoryImpl, this.screen));
        }
        if (((Boolean)VoicechatClient.CLIENT_CONFIG.offlinePlayerVolumeAdjustment.get()).booleanValue()) {
            this.addOfflinePlayers(list);
        }
        this.updateFilter();
    }

    private void addOfflinePlayers(Collection<PlayerState> collection) {
        for (UUID uUID : VoicechatClient.PLAYER_VOLUME_CONFIG.getVolumes().keySet()) {
            String string;
            if (uUID.equals(class07536.R) || collection.stream().anyMatch(playerState -> uUID.equals(playerState.getUuid())) || (string = VoicechatClient.USERNAME_CACHE.getUsername(uUID)) == null) continue;
            this.entries.add(new PlayerVolumeEntry(new PlayerState(uUID, string, false, true), this.screen));
        }
    }

    public void updateFilter() {
        this.method_25339();
        ArrayList<VolumeEntry> arrayList = new ArrayList<VolumeEntry>(this.entries);
        if (!this.filter.isEmpty()) {
            arrayList.removeIf(volumeEntry -> {
                if (volumeEntry instanceof PlayerVolumeEntry) {
                    PlayerVolumeEntry playerVolumeEntry = (PlayerVolumeEntry)((Object)volumeEntry);
                    return playerVolumeEntry.getState() == null || !playerVolumeEntry.getState().getName().toLowerCase(Locale.ROOT).contains(this.filter);
                }
                if (volumeEntry instanceof CategoryVolumeEntry) {
                    CategoryVolumeEntry categoryVolumeEntry = (CategoryVolumeEntry)((Object)volumeEntry);
                    return !categoryVolumeEntry.getCategory().getSearchName().toLowerCase(Locale.ROOT).contains(this.filter);
                }
                return true;
            });
        }
        arrayList.sort((volumeEntry, volumeEntry2) -> {
            if (!((Object)volumeEntry).getClass().equals(((Object)volumeEntry2).getClass())) {
                if (volumeEntry instanceof PlayerVolumeEntry) {
                    return 1;
                }
                return -1;
            }
            return this.volumeEntryToSearchString((VolumeEntry)((Object)volumeEntry)).compareToIgnoreCase(this.volumeEntryToSearchString((VolumeEntry)((Object)volumeEntry2)));
        });
        if (this.filter.isEmpty()) {
            arrayList.add(0, new PlayerVolumeEntry(null, this.screen));
        }
        this.method_25314(arrayList);
    }
}

