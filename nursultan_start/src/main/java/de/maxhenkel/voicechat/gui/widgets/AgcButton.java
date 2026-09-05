/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry
 *  de.maxhenkel.voicechat.natives.SpeexManager
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06611
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.gui.widgets.BooleanConfigButton;
import de.maxhenkel.voicechat.natives.SpeexManager;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class04141;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06611;

public class AgcButton
extends BooleanConfigButton {
    private static final class00392 AUTO = class00392.L((String)"message.voicechat.gain.auto");
    private static final class00392 MANUAL = class00392.L((String)"message.voicechat.gain.manual").N(class06541.field_1061);
    private static final class04141 MANUAL_WARNING = class04141.N((class00392)class00392.L((String)"message.voicechat.gain.manual.warning").N(class06541.field_1061));
    private final Consumer<Boolean> onChange;

    public AgcButton(int n, int n2, int n3, int n4, Consumer<Boolean> consumer) {
        super(n, n2, n3, n4, (ConfigEntry<Boolean>)VoicechatClient.CLIENT_CONFIG.agc, bl -> {
            class05216 class052162 = class00392.N((String)"message.voicechat.gain", (Object[])new Object[]{bl != false ? AUTO : MANUAL});
            if (!bl.booleanValue()) {
                class052162.N(class06541.field_1061);
            }
            return class052162;
        });
        this.onChange = consumer;
        if (!SpeexManager.canUseAgc()) {
            this.field_22763 = false;
            consumer.accept(false);
        } else {
            consumer.accept((Boolean)this.entry.get());
        }
        this.updateTooltip();
    }

    private void updateTooltip() {
        if (!((Boolean)this.entry.get()).booleanValue()) {
            this.method_47400(MANUAL_WARNING);
        } else {
            this.method_47400(null);
        }
    }

    @Override
    public void method_25306(class06611 class066112) {
        super.method_25306(class066112);
        this.onChange.accept((Boolean)this.entry.get());
        this.updateTooltip();
    }
}

