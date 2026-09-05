/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03249
 *  minecraft.class05194
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class08392
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement
 */
package net.irisshaders.iris.gui.element.widget;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03249;
import minecraft.class05194;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class08392;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.NavigationController;
import net.irisshaders.iris.gui.element.widget.CommentedElementWidget;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement;

public abstract class BaseOptionElementWidget<T extends OptionMenuElement>
extends CommentedElementWidget<T> {
    protected static final class00392 SET_TO_DEFAULT = class00392.L((String)"options.iris.setToDefault").N(class06541.field_1060);
    protected static final class00392 DIVIDER = class00392.y((String)": ");
    protected class05216 unmodifiedLabel;
    protected ShaderPackScreen screen;
    protected NavigationController navigation;
    protected class00392 trimmedLabel;
    protected class00392 valueLabel;
    protected boolean usedKeyboard;
    private class05216 label;
    private boolean isLabelTrimmed;
    private int maxLabelWidth;
    private int valueSectionWidth;

    public BaseOptionElementWidget(T t) {
        super(t);
    }

    @Override
    public void init(ShaderPackScreen shaderPackScreen, NavigationController navigationController) {
        this.screen = shaderPackScreen;
        this.navigation = navigationController;
        this.valueLabel = null;
        this.trimmedLabel = null;
    }

    @Override
    public boolean method_25404(class06601 class066012) {
        if (class066012.u()) {
            boolean bl;
            boolean bl2 = class06202.Nq().s() ? this.applyOriginalValue() : (bl = class06202.Nq().L() ? this.applyPreviousValue() : this.applyNextValue());
            if (bl) {
                this.navigation.refresh();
            }
            GuiUtil.playButtonClickSound();
            return true;
        }
        return false;
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        if (class066132.v() == 0 || class066132.v() == 1) {
            boolean bl2 = false;
            if (class06202.Nq().L()) {
                bl2 = this.applyOriginalValue();
            }
            if (!bl2) {
                bl2 = class066132.v() == 0 ? this.applyNextValue() : this.applyPreviousValue();
            }
            if (bl2) {
                this.navigation.refresh();
            }
            GuiUtil.playButtonClickSound();
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    protected final void renderTooltip(class01054 class010542, class00392 class003922, int n, int n2, boolean bl) {
        if (bl) {
            ShaderPackScreen.TOP_LAYER_RENDER_QUEUE.add(() -> GuiUtil.drawTextPanel((class01590)class06202.Nq().i_3, class010542, class003922, n + 2, n2 - 16));
        }
    }

    protected final void updateRenderParams(int n) {
        this.usedKeyboard = this.method_25370();
        if (this.valueLabel == null) {
            this.valueLabel = this.createValueLabel();
        }
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        this.valueSectionWidth = Math.max(n, class015902.N((class05936)this.valueLabel) + 8);
        this.maxLabelWidth = this.bounds.M() - 8 - this.valueSectionWidth;
        if (this.trimmedLabel == null || class015902.N((class05936)this.label) > this.maxLabelWidth != this.isLabelTrimmed) {
            this.updateLabels();
        }
        this.isLabelTrimmed = class015902.N((class05936)this.label) > this.maxLabelWidth;
    }

    protected abstract class00392 createValueLabel();

    protected final void tryRenderTooltip(class01054 class010542, int n, int n2, boolean bl) {
        if (class06202.Nq().L()) {
            this.renderTooltip(class010542, SET_TO_DEFAULT, n, n2, bl);
        } else if (this.isLabelTrimmed && !this.screen.isDisplayingComment()) {
            this.renderTooltip(class010542, (class00392)this.unmodifiedLabel, n, n2, bl);
        }
    }

    protected final void updateLabels() {
        this.trimmedLabel = this.createTrimmedLabel();
        this.valueLabel = this.createValueLabel();
    }

    protected final class00392 createTrimmedLabel() {
        class05216 class052162 = GuiUtil.shortenText((class01590)class06202.Nq().i_3, this.label.L(), this.maxLabelWidth);
        if (this.isValueModified()) {
            class052162 = class052162.N(class004052 -> class004052.N(class05194.N((int)-14006)));
        }
        return class052162;
    }

    public abstract boolean applyOriginalValue();

    public abstract boolean applyNextValue();

    public abstract String getCommentKey();

    public abstract boolean applyPreviousValue();

    public abstract boolean isValueModified();

    @Override
    public Optional<class00392> getCommentBody() {
        return Optional.ofNullable(this.getCommentKey()).map(string -> class08392.N((String)string) ? class00392.L((String)string) : null);
    }

    @Override
    public Optional<class00392> getCommentTitle() {
        return Optional.of(this.unmodifiedLabel);
    }

    protected final void renderOptionWithValue(class01054 class010542, boolean bl, float f, int n) {
        GuiUtil.bindIrisWidgetsTexture();
        GuiUtil.drawButton(class010542, this.bounds.R().N(), this.bounds.R().y(), this.bounds.M(), this.bounds.B(), bl, false);
        GuiUtil.drawButton(class010542, this.bounds.y(class03249.field_41829) - (this.valueSectionWidth + 2), this.bounds.R().y() + 2, this.valueSectionWidth, this.bounds.B() - 4, false, true);
        if (f >= 0.0f) {
            int n2 = this.valueSectionWidth - 4 - n;
            int n3 = this.bounds.y(class03249.field_41829) - this.valueSectionWidth + (int)(f * (float)n2);
            GuiUtil.drawButton(class010542, n3, this.bounds.R().y() + 4, n, this.bounds.B() - 8, false, false);
        }
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        class010542.y(class015902, this.trimmedLabel, this.bounds.R().N() + 6, this.bounds.R().y() + 7, -1);
        class010542.y(class015902, this.valueLabel, this.bounds.y(class03249.field_41829) - 2 - (int)((double)this.valueSectionWidth * 0.5) - (int)((double)class015902.N((class05936)this.valueLabel) * 0.5), this.bounds.R().y() + 7, -1);
    }

    protected final void renderOptionWithValue(class01054 class010542, boolean bl) {
        this.renderOptionWithValue(class010542, bl, -1.0f, 0);
    }

    protected final void setLabel(class05216 class052162) {
        this.label = class052162.L().y(DIVIDER);
        this.unmodifiedLabel = class052162;
    }
}

