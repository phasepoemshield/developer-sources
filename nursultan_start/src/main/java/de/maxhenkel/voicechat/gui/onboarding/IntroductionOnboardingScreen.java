/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class06541
 */
package de.maxhenkel.voicechat.gui.onboarding;

import de.maxhenkel.voicechat.gui.onboarding.OnboardingScreenBase;
import de.maxhenkel.voicechat.gui.onboarding.SkipOnboardingScreen;
import de.maxhenkel.voicechat.gui.onboarding.SpeakerOnboardingScreen;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class06541;

public class IntroductionOnboardingScreen
extends OnboardingScreenBase {
    private static final class00392 TITLE = class00392.N((String)"message.voicechat.onboarding.introduction.title", (Object[])new Object[]{CommonCompatibilityManager.INSTANCE.getModName()}).N(class06541.field_1067);
    private static final class00392 DESCRIPTION = class00392.L((String)"message.voicechat.onboarding.introduction.description");
    private static final class00392 SKIP = class00392.L((String)"message.voicechat.onboarding.introduction.skip");

    public IntroductionOnboardingScreen(@Nullable class05096 class050962) {
        super(TITLE, class050962);
    }

    @Override
    public void method_25426() {
        super.method_25426();
        class05362 class053623 = class05362.method_46430((class00392)SKIP, class053622 -> this.field_22787.N((class05096)new SkipOnboardingScreen(this))).N(this.guiLeft, this.guiTop + this.contentHeight - 40 - 8, this.contentWidth, 20).N();
        this.method_37063((class04654)class053623);
        this.addBackOrCancelButton();
        this.addNextButton();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.renderTitle(class010542, TITLE);
        this.renderMultilineText(class010542, DESCRIPTION);
    }

    @Override
    public class05096 getNextScreen() {
        return new SpeakerOnboardingScreen(this);
    }
}

