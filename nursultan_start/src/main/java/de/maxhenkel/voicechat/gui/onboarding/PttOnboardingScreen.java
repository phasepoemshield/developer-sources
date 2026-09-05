/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.client.KeyEvents
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05936
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06613
 */
package de.maxhenkel.voicechat.gui.onboarding;

import de.maxhenkel.voicechat.gui.onboarding.FinalOnboardingScreen;
import de.maxhenkel.voicechat.gui.onboarding.OnboardingScreenBase;
import de.maxhenkel.voicechat.gui.widgets.KeybindButton;
import de.maxhenkel.voicechat.voice.client.KeyEvents;
import java.util.Objects;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05936;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06613;

public class PttOnboardingScreen
extends OnboardingScreenBase {
    private static final class00392 TITLE = class00392.L((String)"message.voicechat.onboarding.ptt.title").N(class06541.field_1067);
    private static final class00392 DESCRIPTION = class00392.L((String)"message.voicechat.onboarding.ptt.description");
    private static final class00392 BUTTON_DESCRIPTION = class00392.L((String)"message.voicechat.onboarding.ptt.button_description");
    protected KeybindButton keybindButton;
    protected int keybindButtonPos;

    public PttOnboardingScreen(@Nullable class05096 class050962) {
        super(TITLE, class050962);
    }

    @Override
    public void method_25426() {
        super.method_25426();
        this.keybindButtonPos = this.guiTop + this.contentHeight - 60 - 16 - 40;
        this.keybindButton = new KeybindButton(KeyEvents.KEY_PTT, this.guiLeft + 40, this.keybindButtonPos, this.contentWidth - 80, 20);
        this.method_37063((class04654)this.keybindButton);
        this.addBackOrCancelButton();
        this.addNextButton();
    }

    public boolean method_25422() {
        if (this.keybindButton.isListening()) {
            return false;
        }
        return super.method_25422();
    }

    public boolean method_25404(class06601 class066012) {
        if (this.keybindButton.method_25404(class066012)) {
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.renderTitle(class010542, TITLE);
        this.renderMultilineText(class010542, DESCRIPTION);
        class01028 class010282 = BUTTON_DESCRIPTION.method_30937();
        int n3 = this.field_22789 / 2 - this.field_22793.N((class05936)BUTTON_DESCRIPTION) / 2;
        Objects.requireNonNull(this.field_22793);
        class010542.N(this.field_22793, class010282, n3, this.keybindButtonPos - 9 - 8, -1, true);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.keybindButton.method_25402(class066132, bl)) {
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    public boolean method_16803(class06601 class066012) {
        if (this.keybindButton.method_16803(class066012)) {
            return true;
        }
        return super.method_16803(class066012);
    }

    @Override
    public class05096 getNextScreen() {
        return new FinalOnboardingScreen(this);
    }
}

