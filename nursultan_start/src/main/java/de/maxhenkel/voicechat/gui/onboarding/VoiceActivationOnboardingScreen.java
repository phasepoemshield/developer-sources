/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.natives.SpeexManager
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class06541
 */
package de.maxhenkel.voicechat.gui.onboarding;

import de.maxhenkel.voicechat.gui.onboarding.FinalOnboardingScreen;
import de.maxhenkel.voicechat.gui.onboarding.OnboardingScreenBase;
import de.maxhenkel.voicechat.gui.widgets.AgcButton;
import de.maxhenkel.voicechat.gui.widgets.DenoiserButton;
import de.maxhenkel.voicechat.gui.widgets.MicAmplificationSlider;
import de.maxhenkel.voicechat.gui.widgets.MicTestButton;
import de.maxhenkel.voicechat.gui.widgets.VadButton;
import de.maxhenkel.voicechat.gui.widgets.VoiceActivationSlider;
import de.maxhenkel.voicechat.natives.SpeexManager;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class06541;

public class VoiceActivationOnboardingScreen
extends OnboardingScreenBase {
    private static final class00392 TITLE = class00392.L((String)"message.voicechat.onboarding.voice.title").N(class06541.field_1067);
    private static final class00392 DESCRIPTION = class00392.L((String)"message.voicechat.onboarding.voice.description");
    protected VoiceActivationSlider slider;
    protected MicTestButton micTestButton;

    public VoiceActivationOnboardingScreen(@Nullable class05096 class050962) {
        super(TITLE, class050962);
    }

    @Override
    public void method_25426() {
        super.method_25426();
        int n = this.guiTop + this.contentHeight - 16 - 20 - 15;
        int n2 = 22;
        boolean bl2 = SpeexManager.canUseAgc();
        MicAmplificationSlider micAmplificationSlider = new MicAmplificationSlider(this.guiLeft + (bl2 ? 81 : 0), n - n2 * 3, this.contentWidth - (bl2 ? 80 : 0) - 1, 20);
        if (bl2) {
            this.method_37063((class04654)new AgcButton(this.guiLeft, n - n2 * 3, 80, 20, bl -> micAmplificationSlider.setActive(bl == false)));
        }
        this.method_37063((class04654)micAmplificationSlider);
        this.method_37063((class04654)new DenoiserButton(this.guiLeft, n - n2 * 2, this.contentWidth, 20));
        this.method_37063((class04654)new VadButton(this.guiLeft + 20 + 2, n - n2, this.contentWidth - 20 - 2, 20));
        this.slider = new VoiceActivationSlider(this.guiLeft, n, this.contentWidth, 20);
        this.micTestButton = new MicTestButton(this.guiLeft, n - n2, false, this.slider);
        this.method_37063((class04654)this.micTestButton);
        this.method_37063((class04654)this.slider);
        this.addBackOrCancelButton();
        this.addNextButton();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.renderTitle(class010542, TITLE);
        this.renderMultilineText(class010542, DESCRIPTION);
        class00392 class003922 = this.slider.getHoverText();
        if (this.slider.method_49606() && class003922 != null) {
            class010542.N(this.field_22793, class003922, n, n2);
        }
    }

    @Override
    public class05096 getNextScreen() {
        return new FinalOnboardingScreen(this);
    }
}

