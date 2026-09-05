/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.common.AudioUtils
 *  minecraft.class00392
 *  minecraft.class01054
 */
package de.maxhenkel.voicechat.gui.volume;

import de.maxhenkel.voicechat.gui.volume.AdjustVolumeSlider$AdjustVolumeEntry;
import de.maxhenkel.voicechat.gui.widgets.DebouncedSlider;
import de.maxhenkel.voicechat.voice.common.AudioUtils;
import minecraft.class00392;
import minecraft.class01054;

public class AdjustVolumeSlider
extends DebouncedSlider {
    protected static final class00392 MUTED = class00392.L((String)"message.voicechat.muted");
    protected static final double YELLOW_DB = -20.0;
    protected static final double RED_DB = -6.0;
    protected static final float MAXIMUM = 4.0f;
    protected final AdjustVolumeSlider$AdjustVolumeEntry volumeConfigEntry;

    private double getMultiplier() {
        return this.field_22753 * 4.0;
    }

    public AdjustVolumeSlider(int n, int n2, int n3, int n4, AdjustVolumeSlider$AdjustVolumeEntry adjustVolumeSlider$AdjustVolumeEntry) {
        super(n, n2, n3, n4, (class00392)class00392.i(), adjustVolumeSlider$AdjustVolumeEntry.get() / 4.0);
        this.volumeConfigEntry = adjustVolumeSlider$AdjustVolumeEntry;
        this.method_25346();
    }

    @Override
    public void applyDebounced() {
        this.volumeConfigEntry.save(this.getMultiplier());
    }

    public void method_25346() {
        if (this.field_22753 <= 0.0) {
            this.method_25355(MUTED);
            return;
        }
        long l = Math.round(this.field_22753 * 4.0 * 100.0 - 100.0);
        this.method_25355((class00392)class00392.N((String)"message.voicechat.volume_amplification", (Object[])new Object[]{((float)l > 0.0f ? "+" : "") + l + "%"}));
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        super.method_48579(class010542, n, n2, f);
        double d = this.volumeConfigEntry.getAudioLevel();
        if (d <= -127.0) {
            return;
        }
        double d2 = AudioUtils.linearToDb((double)this.getMultiplier());
        int n3 = (int)((double)this.method_25368() * AudioUtils.dbToPerc((double)(d + d2)));
        double d3 = AudioUtils.dbToPerc((double)-20.0);
        double d4 = AudioUtils.dbToPerc((double)-6.0);
        int n4 = (int)((double)this.method_25368() * d3);
        int n5 = (int)((double)this.method_25368() * d4) - n4;
        int n6 = this.method_25368();
        class010542.N(this.method_46426(), this.method_46427(), this.method_46426() + Math.min(n4, n3), this.method_46427() + 1, -16711936);
        if (n3 > n4) {
            class010542.N(this.method_46426() + n4, this.method_46427(), this.method_46426() + Math.min(n4 + n5, n3), this.method_46427() + 1, -256);
            if (n3 > n4 + n5) {
                class010542.N(this.method_46426() + n4 + n5, this.method_46427(), this.method_46426() + Math.min(n6, n3), this.method_46427() + 1, -65536);
            }
        }
    }
}

