/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class05936
 *  minecraft.class06202
 */
package de.maxhenkel.voicechat.gui.volume;

import de.maxhenkel.voicechat.gui.volume.AdjustVolumeSlider;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumeSlider$AdjustVolumeEntry;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumesScreen;
import de.maxhenkel.voicechat.gui.widgets.ListScreenEntryBase;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class05936;
import minecraft.class06202;

public abstract class VolumeEntry
extends ListScreenEntryBase<VolumeEntry> {
    protected static final class00392 OTHER_VOLUME = class00392.L((String)"message.voicechat.other_volume");
    protected static final class00392 OTHER_VOLUME_DESCRIPTION = class00392.L((String)"message.voicechat.other_volume.description");
    protected static final class01894 OTHER_VOLUME_ICON = class01894.N((String)"voicechat", (String)"icons/other_volume");
    protected static final int SKIN_SIZE = 24;
    protected static final int PADDING = 4;
    protected static final int SLIDER_WIDTH = 100;
    protected static final int BG_FILL = class02566.y((int)255, (int)74, (int)74, (int)74);
    protected final class06202 minecraft = class06202.Nq();
    protected final AdjustVolumesScreen screen;
    protected final AdjustVolumeSlider volumeSlider;

    public VolumeEntry(AdjustVolumesScreen adjustVolumesScreen, AdjustVolumeSlider$AdjustVolumeEntry adjustVolumeSlider$AdjustVolumeEntry) {
        this.screen = adjustVolumesScreen;
        this.volumeSlider = new AdjustVolumeSlider(0, 0, 100, 20, adjustVolumeSlider$AdjustVolumeEntry);
        this.children.add(this.volumeSlider);
    }

    protected void renderScrollingString(class01054 class010542, class00392 class003922) {
        int n = this.method_73380() + 4 + 24 + 4;
        int n2 = this.method_73382();
        int n3 = this.method_73384();
        Objects.requireNonNull((class01590)this.minecraft.i_3);
        int n4 = n2 + (n3 - 9) / 2;
        int n5 = this.method_73387() - 4 - 24 - 4 - 4 - 100 - 4;
        int n6 = ((class01590)this.minecraft.i_3).N((class05936)class003922);
        if (n6 > n5) {
            class00580 class005802 = class010542.B();
            Objects.requireNonNull((class01590)this.minecraft.i_3);
            class005802.N(class003922, n, n + n5, n4, n4 + 9);
        } else {
            class010542.N((class01590)this.minecraft.i_3, class003922, n, n4, -1, false);
        }
    }

    public abstract void renderElement(class01054 var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9, int var10, int var11, int var12, int var13);

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73380();
        int n4 = this.method_73382();
        int n5 = this.method_73387();
        int n6 = this.method_73384();
        int n7 = n3 + 4;
        int n8 = n4 + (n6 - 24) / 2;
        int n9 = n7 + 24 + 4;
        Objects.requireNonNull((class01590)this.minecraft.i_3);
        int n10 = n4 + (n6 - 9) / 2;
        class010542.N(n3, n4, n3 + n5, n4 + n6, BG_FILL);
        this.renderElement(class010542, n4, n3, n5, n6, n, n2, bl, f, n7, n8, n9, n10);
        this.volumeSlider.y(n3 + (n5 - this.volumeSlider.method_25368() - 4), n4 + (n6 - this.volumeSlider.method_25364()) / 2);
        this.volumeSlider.method_25394(class010542, n, n2, f);
    }
}

