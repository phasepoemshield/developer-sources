/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class06541
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shaderpack.option.BooleanOption
 *  net.irisshaders.iris.shaderpack.option.MergedBooleanOption
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuBooleanOptionElement
 */
package net.irisshaders.iris.gui.element.widget;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class06541;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.NavigationController;
import net.irisshaders.iris.gui.element.widget.BaseOptionElementWidget;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.shaderpack.option.BooleanOption;
import net.irisshaders.iris.shaderpack.option.MergedBooleanOption;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuBooleanOptionElement;

public class BooleanElementWidget
extends BaseOptionElementWidget<OptionMenuBooleanOptionElement> {
    private static final class00392 TEXT_TRUE = class00392.L((String)"label.iris.true").N(class06541.field_1060);
    private static final class00392 TEXT_FALSE = class00392.L((String)"label.iris.false").N(class06541.field_1061);
    private static final class00392 TEXT_TRUE_DEFAULT = class00392.L((String)"label.iris.true");
    private static final class00392 TEXT_FALSE_DEFAULT = class00392.L((String)"label.iris.false");
    private final BooleanOption option;
    private boolean appliedValue;
    private boolean value;
    private boolean defaultValue;

    public BooleanElementWidget(OptionMenuBooleanOptionElement optionMenuBooleanOptionElement) {
        super(optionMenuBooleanOptionElement);
        this.option = optionMenuBooleanOptionElement.option;
    }

    public String getValue() {
        return Boolean.toString(this.value);
    }

    @Override
    public void init(ShaderPackScreen shaderPackScreen, NavigationController navigationController) {
        super.init(shaderPackScreen, navigationController);
        this.appliedValue = ((OptionMenuBooleanOptionElement)this.element).getAppliedOptionValues().getBooleanValueOrDefault(this.option.getName());
        this.value = ((OptionMenuBooleanOptionElement)this.element).getPendingOptionValues().getBooleanValueOrDefault(this.option.getName());
        this.defaultValue = ((MergedBooleanOption)((OptionMenuBooleanOptionElement)this.element).getAppliedOptionValues().getOptionSet().getBooleanOptions().get((Object)this.option.getName())).getOption().getDefaultValue();
        this.setLabel(GuiUtil.translateOrDefault(class00392.y((String)this.option.getName()), "option." + this.option.getName(), new Object[0]));
    }

    private void queue() {
        Iris.getShaderPackOptionQueue().put(this.option.getName(), this.getValue());
    }

    @Override
    public void render(class01054 class010542, int n, int n2, float f, boolean bl) {
        this.updateRenderParams(28);
        this.renderOptionWithValue(class010542, bl || this.method_25370());
        this.tryRenderTooltip(class010542, n, n2, bl);
    }

    @Override
    protected class00392 createValueLabel() {
        if (this.value == this.defaultValue) {
            return this.value ? TEXT_TRUE_DEFAULT : TEXT_FALSE_DEFAULT;
        }
        return this.value ? TEXT_TRUE : TEXT_FALSE;
    }

    @Override
    public boolean applyOriginalValue() {
        this.value = this.option.getDefaultValue();
        this.queue();
        return true;
    }

    @Override
    public boolean applyNextValue() {
        this.value = !this.value;
        this.queue();
        return true;
    }

    @Override
    public String getCommentKey() {
        return "option." + this.option.getName() + ".comment";
    }

    @Override
    public boolean applyPreviousValue() {
        return this.applyNextValue();
    }

    @Override
    public boolean isValueModified() {
        return this.value != this.appliedValue;
    }
}

