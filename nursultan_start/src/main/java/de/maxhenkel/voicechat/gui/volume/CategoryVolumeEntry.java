/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui.volume;

import de.maxhenkel.voicechat.gui.volume.AdjustVolumesScreen;
import de.maxhenkel.voicechat.gui.volume.CategoryVolumeEntry$AdjustCategoryVolumeEntry;
import de.maxhenkel.voicechat.gui.volume.VolumeEntry;
import de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class08394;

public class CategoryVolumeEntry
extends VolumeEntry {
    protected static final class01894 OTHER_VOLUME_ICON_PATH = class01894.N((String)"voicechat", (String)"textures/icons/other_volume.png");
    protected final VolumeCategoryImpl category;
    protected final class01894 texture;

    public VolumeCategoryImpl getCategory() {
        return this.category;
    }

    public CategoryVolumeEntry(VolumeCategoryImpl volumeCategoryImpl, AdjustVolumesScreen adjustVolumesScreen) {
        super(adjustVolumesScreen, new CategoryVolumeEntry$AdjustCategoryVolumeEntry(volumeCategoryImpl.getId()));
        this.category = volumeCategoryImpl;
        this.texture = ClientManager.getCategoryManager().getTexture(volumeCategoryImpl.getId(), OTHER_VOLUME_ICON_PATH);
    }

    @Override
    public void renderElement(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, float f, int n7, int n8, int n9, int n10) {
        class010542.N(class08394.Na, this.texture, n7, n8, 16.0f, 16.0f, 24, 24, 16, 16, 16, 16);
        this.renderScrollingString(class010542, this.category.getDisplayName());
        if (bl && this.category.getDescription() != null) {
            class010542.N((class01590)this.minecraft.i_3, this.category.getDisplayDescription(), n5, n6);
        }
    }
}

