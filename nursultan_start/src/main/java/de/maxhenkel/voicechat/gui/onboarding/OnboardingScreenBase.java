/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05936
 */
package de.maxhenkel.voicechat.gui.onboarding;

import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05936;

public abstract class OnboardingScreenBase
extends class05096 {
    public static final class00392 NEXT = class00392.L((String)"message.voicechat.onboarding.next");
    public static final class00392 BACK = class00392.L((String)"message.voicechat.onboarding.back");
    public static final class00392 CANCEL = class00392.L((String)"message.voicechat.onboarding.cancel");
    protected static final int TEXT_COLOR = -1;
    protected static final int PADDING = 8;
    protected static final int SMALL_PADDING = 2;
    protected static final int BUTTON_HEIGHT = 20;
    protected int contentWidth;
    protected int guiLeft;
    protected int guiTop;
    protected int contentHeight;
    @Nullable
    protected class05096 previous;

    public OnboardingScreenBase(class00392 class003922, @Nullable class05096 class050962) {
        super(class003922);
        this.previous = class050962;
    }

    protected void renderMultilineText(class01054 class010542, class00392 class003922) {
        List list = this.field_22793.L((class05936)class003922, this.contentWidth);
        for (int i = 0; i < list.size(); ++i) {
            class01028 class010282 = (class01028)list.get(i);
            int n = this.field_22789 / 2 - this.field_22793.N(class010282) / 2;
            Objects.requireNonNull(this.field_22793);
            Objects.requireNonNull(this.field_22793);
            class010542.N(this.field_22793, class010282, n, this.guiTop + 9 + 20 + i * (9 + 1), -1, true);
        }
    }

    protected void addBackOrCancelButton(boolean bl) {
        class00392 class003922 = CANCEL;
        if (this.previous instanceof OnboardingScreenBase) {
            class003922 = BACK;
        }
        class05362 class053623 = class05362.method_46430((class00392)class003922, class053622 -> this.field_22787.N(this.previous)).N(this.guiLeft, this.guiTop + this.contentHeight - 20, bl ? this.contentWidth : this.contentWidth / 2 - 4, 20).N();
        this.method_37063((class04654)class053623);
    }

    protected void addBackOrCancelButton() {
        this.addBackOrCancelButton(false);
    }

    public void method_25426() {
        super.method_25426();
        this.contentWidth = this.field_22789 / 2;
        this.guiLeft = (this.field_22789 - this.contentWidth) / 2;
        this.guiTop = 20;
        this.contentHeight = this.field_22790 - this.guiTop * 2;
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        super.method_25420(class010542, n, n2, f);
    }

    protected void renderTitle(class01054 class010542, class00392 class003922) {
        int n = this.field_22793.N((class05936)class003922);
        class010542.N(this.field_22793, class003922.method_30937(), this.field_22789 / 2 - n / 2, this.guiTop, -1, true);
    }

    @Nullable
    public class05096 getNextScreen() {
        return null;
    }

    protected void addPositiveButton(class00392 class003922, class05361 class053612) {
        class05362 class053622 = class05362.method_46430((class00392)class003922, (class05361)class053612).N(this.guiLeft + this.contentWidth / 2 + 4, this.guiTop + this.contentHeight - 20, this.contentWidth / 2 - 4, 20).N();
        this.method_37063((class04654)class053622);
    }

    protected void addNextButton() {
        this.addPositiveButton(NEXT, class053622 -> this.field_22787.N(this.getNextScreen()));
    }
}

