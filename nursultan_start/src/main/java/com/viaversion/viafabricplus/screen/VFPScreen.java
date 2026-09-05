/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01304
 *  minecraft.class01321
 *  minecraft.class04402
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06202
 *  org.joml.Matrix3x2fStack
 */
package com.viaversion.viafabricplus.screen;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import java.awt.Color;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01304;
import minecraft.class01321;
import minecraft.class04402;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06202;
import org.joml.Matrix3x2fStack;

public class VFPScreen
extends class05096 {
    private static final String MOD_URL = "https://github.com/ViaVersion/ViaFabricPlus";
    private final boolean backButton;
    public class05096 prevScreen;
    private class00392 subtitle;
    private class05361 subtitlePressAction;
    private class04402 subtitleWidget;

    public VFPScreen(String string, boolean bl) {
        this(class00392.N((String)string), bl);
    }

    public VFPScreen(class00392 class003922, boolean bl) {
        super(class003922);
        this.backButton = bl;
    }

    public class05096 get(class05096 class050962) {
        this.prevScreen = class050962;
        return this;
    }

    public void open(class05096 class050962) {
        this.prevScreen = class050962;
        VFPScreen.setScreen(this);
    }

    public void method_25426() {
        if (this.backButton) {
            this.method_37063((class04654)class05362.method_46430((class00392)class00392.N((String)"<-"), class053622 -> this.method_25419()).N(5, 5).y(20, 20).N());
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.renderTitle(class010542);
    }

    public void method_25419() {
        class05096 class050962 = this.prevScreen;
        if (class050962 instanceof VFPScreen) {
            VFPScreen vFPScreen = (VFPScreen)class050962;
            vFPScreen.open(vFPScreen.prevScreen);
        } else {
            class06202.Nq().N(this.prevScreen);
        }
    }

    public static void showErrorScreen(class00392 class003922, Throwable throwable, class05096 class050962) {
        ViaFabricPlusImpl.INSTANCE.getLogger().error("Something went wrong!", throwable);
        class06202 class062022 = class06202.Nq();
        class062022.execute(() -> class062022.N((class05096)new class01304(() -> class062022.N(class050962), class003922, (class00392)class00392.L((String)"base.viafabricplus.something_went_wrong").i("\n" + throwable.getMessage()), (class00392)class00392.L((String)"base.viafabricplus.cancel"), false)));
    }

    public void setupSubtitle(class00392 class003922, class05361 class053612) {
        this.subtitlePressAction = class053612;
        if (this.subtitleWidget != null) {
            this.method_37066((class04654)this.subtitleWidget);
            this.subtitleWidget = null;
        }
        if (class053612 == null) {
            this.subtitle = class003922;
        } else {
            this.subtitle = null;
            int n = this.field_22793.N((class05936)class003922);
            int n2 = this.field_22789 / 2 - n / 2;
            Objects.requireNonNull(this.field_22793);
            Objects.requireNonNull(this.field_22793);
            this.subtitleWidget = new class04402(n2, (9 + 2) * 2 + 3, n, 9 + 2, class003922, class053612, this.field_22793);
            this.method_37063((class04654)this.subtitleWidget);
        }
    }

    public void setupSubtitle(class00392 class003922) {
        this.setupSubtitle(class003922, null);
    }

    public void addRefreshButton(Runnable runnable) {
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"base.viafabricplus.refresh"), class053622 -> {
            runnable.run();
            this.field_22787.N((class05096)this);
        }).N(this.field_22789 - 60 - 5, 5).y(60, 20).N());
    }

    public void renderSubtitle(class01054 class010542) {
        if (this.subtitle != null && this.subtitlePressAction == null) {
            Objects.requireNonNull(this.field_22793);
            int n = (9 + 2) * 2 + 3;
            class010542.N(this.field_22793, this.subtitle, this.field_22789 / 2, this.subtitleCentered() ? this.field_22790 / 2 - n : n, -1);
        }
    }

    public void setupUrlSubtitle(String string) {
        this.setupSubtitle(class00392.N((String)string), class01321.y((class05096)this, (String)string));
    }

    protected boolean subtitleCentered() {
        return false;
    }

    public class04402 getSubtitleWidget() {
        return this.subtitleWidget;
    }

    public void renderScreenTitle(class01054 class010542) {
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 70, 0xFFFFFF);
    }

    public class00392 getSubtitle() {
        return this.subtitle;
    }

    public void setupDefaultSubtitle() {
        this.setupUrlSubtitle(MOD_URL);
    }

    public void renderTitle(class01054 class010542) {
        Matrix3x2fStack matrix3x2fStack = class010542.i();
        matrix3x2fStack.pushMatrix();
        matrix3x2fStack.scale(2.0f, 2.0f);
        class010542.N(this.field_22793, "ViaFabricPlus", this.field_22789 / 4, 3, Color.ORANGE.getRGB());
        matrix3x2fStack.popMatrix();
        this.renderSubtitle(class010542);
    }

    public static void setScreen(class05096 class050962) {
        class06202 class062022 = class06202.Nq();
        class062022.execute(() -> class062022.N(class050962));
    }
}

