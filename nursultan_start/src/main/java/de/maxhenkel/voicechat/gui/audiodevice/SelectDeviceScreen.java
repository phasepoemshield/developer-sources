/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06541
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui.audiodevice;

import de.maxhenkel.voicechat.gui.VoiceChatScreenBase;
import de.maxhenkel.voicechat.gui.audiodevice.AudioDeviceList;
import java.util.Objects;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06541;
import minecraft.class08394;

public abstract class SelectDeviceScreen
extends VoiceChatScreenBase {
    protected static final class01894 TEXTURE = class01894.N((String)"voicechat", (String)"textures/gui/gui_audio_devices.png");
    protected static final class00392 BACK = class00392.L((String)"message.voicechat.back");
    protected static final int HEADER_SIZE = 16;
    protected static final int FOOTER_SIZE = 32;
    protected static final int UNIT_SIZE = 18;
    @Nullable
    protected class05096 parent;
    protected AudioDeviceList deviceList;
    protected class05362 back;
    protected int units;

    public SelectDeviceScreen(class00392 class003922, @Nullable class05096 class050962) {
        super(class003922, 236, 0);
        this.parent = class050962;
    }

    public abstract class00392 getEmptyListComponent();

    public abstract AudioDeviceList createAudioDeviceList(int var1, int var2, int var3);

    @Override
    public void method_25426() {
        super.method_25426();
        this.guiLeft += 2;
        this.guiTop = 32;
        int n = class04995.u((float)2.2222223f);
        this.units = Math.max(n, (this.field_22790 - 16 - 32 - this.guiTop * 2) / 18);
        this.ySize = 16 + this.units * 18 + 32;
        if (this.deviceList != null) {
            this.deviceList.updateSize(this.field_22789, this.units * 18, 0, this.guiTop + 16);
        } else {
            this.deviceList = this.createAudioDeviceList(this.field_22789, this.units * 18, this.guiTop + 16);
        }
        this.method_25429((class04654)this.deviceList);
        this.back = class05362.method_46430((class00392)BACK, class053622 -> this.field_22787.N(this.parent)).N(this.guiLeft + 7, this.guiTop + this.ySize - 20 - 7, this.xSize - 14, 20).N();
        this.method_37063((class04654)this.back);
    }

    @Override
    public void method_25420(class01054 class010542, int n, int n2, float f) {
        if (this.isIngame()) {
            class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop, 0.0f, 0.0f, this.xSize, 16, 256, 256);
            for (int i = 0; i < this.units; ++i) {
                class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop + 16 + 18 * i, 0.0f, 16.0f, this.xSize, 18, 256, 256);
            }
            class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop + 16 + 18 * this.units, 0.0f, 34.0f, this.xSize, 32, 256, 256);
            class010542.N(class08394.Na, TEXTURE, this.guiLeft + 10, this.guiTop + 16 + 6 - 2, (float)this.xSize, 0.0f, 12, 12, 256, 256);
        }
    }

    @Override
    public void renderForeground(class01054 class010542, int n, int n2, float f) {
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2 - this.field_22793.N((class05936)this.field_22785) / 2, this.guiTop + 5, this.isIngame() ? -12566464 : class06541.field_1068.i(), false);
        if (!this.deviceList.isEmpty()) {
            this.deviceList.method_25394(class010542, n, n2, f);
        } else {
            class00392 class003922 = this.getEmptyListComponent();
            int n3 = this.field_22789 / 2;
            int n4 = this.guiTop + 16 + this.units * 18 / 2;
            Objects.requireNonNull(this.field_22793);
            class010542.N(this.field_22793, class003922, n3, n4 - 9 / 2, -1);
        }
    }
}

