/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03457
 *  minecraft.class04654
 *  minecraft.class05482
 *  minecraft.class05936
 *  minecraft.class06608
 */
package dev.isxander.yacl3.gui.controllers;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.LabelController;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03457;
import minecraft.class04654;
import minecraft.class05482;
import minecraft.class05936;
import minecraft.class06608;

public class LabelController$LabelControllerElement
extends AbstractWidget {
    private List<class01028> wrappedText;
    protected class05482 wrappedTooltip;
    protected boolean focused;
    protected final YACLScreen screen;
    final /* synthetic */ LabelController this$0;

    public LabelController$LabelControllerElement(LabelController labelController, YACLScreen yACLScreen, Dimension<Integer> dimension) {
        this.this$0 = labelController;
        super(dimension);
        this.screen = yACLScreen;
        labelController.option().addListener((option, class003922) -> this.updateTooltip());
        this.updateTooltip();
        this.updateText();
    }

    public class02106 method_48205(class02089 class020892) {
        if (!this.this$0.option().available()) {
            return null;
        }
        return !this.method_25370() ? class02106.N((class04654)this) : null;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.updateText();
        int n3 = (Integer)this.getDimension().y();
        for (class01028 class010282 : this.wrappedText) {
            class010542.N(this.textRenderer, class010282, (Integer)this.getDimension().x() + this.getXPadding(), n3 + this.getYPadding(), this.this$0.option().available() ? -1 : -6250336, true);
            Objects.requireNonNull(this.textRenderer);
            n3 += 9;
        }
        if (this.method_25370()) {
            class010542.N((Integer)this.getDimension().x() - 1, (Integer)this.getDimension().y() - 1, (Integer)this.getDimension().xLimit() + 1, ((Integer)this.getDimension().y()).intValue(), -1);
            class010542.N((Integer)this.getDimension().x() - 1, (Integer)this.getDimension().y() - 1, ((Integer)this.getDimension().x()).intValue(), (Integer)this.getDimension().yLimit() + 1, -1);
            class010542.N((Integer)this.getDimension().x() - 1, ((Integer)this.getDimension().yLimit()).intValue(), (Integer)this.getDimension().xLimit() + 1, (Integer)this.getDimension().yLimit() + 1, -1);
            class010542.N(((Integer)this.getDimension().xLimit()).intValue(), (Integer)this.getDimension().y() - 1, (Integer)this.getDimension().xLimit() + 1, (Integer)this.getDimension().yLimit() + 1, -1);
        }
        GuiUtils.pushPose(class010542);
        GuiUtils.translateZ(class010542, 100.0f);
        if (this.method_25405(n, n2)) {
            class00405 class004052 = this.getStyle(n, n2);
            if (class004052 != null && class004052.z() != null) {
                class01028 class010282;
                class010282 = class004052.z();
                class010542.N(this.textRenderer, class004052, n, n2);
            }
            if (class004052 != null && class004052.Z() != null) {
                class010542.N(class06608.u);
            }
        }
        GuiUtils.popPose(class010542);
    }

    @Override
    public void method_37020(class03428 class034282) {
        class034282.N(class03457.field_33788, this.this$0.formatValue());
    }

    @Override
    public class03432 method_37018() {
        return class03432.field_33786;
    }

    public void method_25365(boolean bl) {
        this.focused = bl;
    }

    public boolean method_25370() {
        return this.focused;
    }

    protected class00405 getStyle(int n, int n2) {
        if (!this.getDimension().isPointInside((Number)n, (Number)n2)) {
            return null;
        }
        int n3 = n - (Integer)this.getDimension().x() - this.getXPadding();
        int n4 = n2 - (Integer)this.getDimension().y() - this.getYPadding();
        Objects.requireNonNull(this.textRenderer);
        int n5 = n4 / 9;
        if (n3 < 0 || n3 > (Integer)this.getDimension().xLimit()) {
            return null;
        }
        if (n4 < 0 || n4 > (Integer)this.getDimension().yLimit()) {
            return null;
        }
        if (n5 < 0 || n5 >= this.wrappedText.size()) {
            return null;
        }
        return null;
    }

    private void updateTooltip() {
        this.wrappedTooltip = class05482.N((class01590)this.textRenderer, (class00392)this.this$0.option().tooltip(), (int)(this.screen.field_22789 / 3 * 2 - 10));
    }

    @Override
    public boolean matchesSearch(String string) {
        return this.this$0.formatValue().getString().toLowerCase().contains(string.toLowerCase());
    }

    private int getYPadding() {
        return 3;
    }

    @Override
    public boolean onMouseClicked(double d, double d2, int n) {
        if (!this.method_25405(d, d2)) {
            return false;
        }
        class00405 class004052 = this.getStyle((int)d, (int)d2);
        if (class004052 == null) {
            return false;
        }
        return false;
    }

    private int getXPadding() {
        return 4;
    }

    private void updateText() {
        this.wrappedText = this.textRenderer.L((class05936)this.this$0.formatValue(), (Integer)this.getDimension().width() - this.getXPadding() * 2);
        Dimension<Integer> dimension = this.getDimension();
        int n = this.wrappedText.size();
        Objects.requireNonNull(this.textRenderer);
        this.setDimension((Dimension<Integer>)dimension.withHeight((Number)(n * 9 + this.getYPadding() * 2)));
    }
}

