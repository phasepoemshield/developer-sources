/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04141
 */
package de.maxhenkel.voicechat.gui.tooltips;

import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.gui.widgets.ImageButton$TooltipSupplier;
import minecraft.class00392;
import minecraft.class04141;

public class TestSpeakerSupplier
implements ImageButton$TooltipSupplier {
    public static final class00392 TEST_SPEAKER = class00392.L((String)"message.voicechat.test_speaker");

    @Override
    public void updateTooltip(ImageButton imageButton) {
        imageButton.method_47400(class04141.N((class00392)TEST_SPEAKER));
    }
}

