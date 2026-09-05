/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05096
 *  minecraft.class06541
 */
package de.maxhenkel.voicechat.gui.onboarding;

import de.maxhenkel.voicechat.gui.onboarding.OnboardingManager;
import de.maxhenkel.voicechat.gui.onboarding.OnboardingScreenBase;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05096;
import minecraft.class06541;

public class SkipOnboardingScreen
extends OnboardingScreenBase {
    private static final class00392 TITLE = class00392.L((String)"message.voicechat.onboarding.skip.title").N(class06541.field_1067);
    private static final class00392 DESCRIPTION = class00392.L((String)"message.voicechat.onboarding.skip.description");
    private static final class00392 CONFIRM = class00392.L((String)"message.voicechat.onboarding.confirm");

    public SkipOnboardingScreen(@Nullable class05096 class050962) {
        super(TITLE, class050962);
    }

    @Override
    public void method_25426() {
        super.method_25426();
        this.addBackOrCancelButton();
        this.addPositiveButton(CONFIRM, class053622 -> OnboardingManager.finishOnboarding());
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.renderTitle(class010542, TITLE);
        this.renderMultilineText(class010542, DESCRIPTION);
    }

    @Override
    public class05096 getNextScreen() {
        return this.previous;
    }
}

