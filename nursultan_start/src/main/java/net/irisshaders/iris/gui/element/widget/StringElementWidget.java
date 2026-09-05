/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03249
 *  minecraft.class05194
 *  minecraft.class05216
 *  minecraft.class07018
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shaderpack.option.StringOption
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuStringOptionElement
 */
package net.irisshaders.iris.gui.element.widget;

import com.google.common.collect.ImmutableList;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03249;
import minecraft.class05194;
import minecraft.class05216;
import minecraft.class07018;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.NavigationController;
import net.irisshaders.iris.gui.element.widget.BaseOptionElementWidget;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.shaderpack.option.StringOption;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuStringOptionElement;

public class StringElementWidget
extends BaseOptionElementWidget<OptionMenuStringOptionElement> {
    protected final StringOption option;
    protected String appliedValue;
    protected int valueCount;
    protected int valueIndex;
    protected class05216 prefix;
    protected class05216 suffix;

    public StringElementWidget(OptionMenuStringOptionElement optionMenuStringOptionElement) {
        super(optionMenuStringOptionElement);
        this.option = optionMenuStringOptionElement.option;
    }

    public String getValue() {
        if (this.valueIndex < 0) {
            return this.appliedValue;
        }
        return (String)this.option.getAllowedValues().get(this.valueIndex);
    }

    private void increment(int n) {
        this.valueIndex = Math.max(this.valueIndex, 0);
        this.valueIndex = Math.floorMod(this.valueIndex + n, this.valueCount);
    }

    @Override
    public void init(ShaderPackScreen shaderPackScreen, NavigationController navigationController) {
        super.init(shaderPackScreen, navigationController);
        String string = ((OptionMenuStringOptionElement)this.element).getPendingOptionValues().getStringValueOrDefault(this.option.getName());
        this.appliedValue = ((OptionMenuStringOptionElement)this.element).getAppliedOptionValues().getStringValueOrDefault(this.option.getName());
        this.prefix = class00392.y((String)(class07018.y().N("prefix." + this.option.getName()) ? class07018.y().y("prefix." + this.option.getName()) : ""));
        this.suffix = class00392.y((String)(class07018.y().N("suffix." + this.option.getName()) ? class07018.y().y("suffix." + this.option.getName()) : ""));
        this.setLabel(GuiUtil.translateOrDefault(class00392.y((String)this.option.getName()), "option." + this.option.getName(), new Object[0]));
        ImmutableList immutableList = this.option.getAllowedValues();
        this.valueCount = immutableList.size();
        this.valueIndex = immutableList.indexOf(string);
    }

    protected void queue() {
        Iris.getShaderPackOptionQueue().put(this.option.getName(), this.getValue());
    }

    @Override
    public void render(class01054 class010542, int n, int n2, float f, boolean bl) {
        this.updateRenderParams(0);
        this.renderOptionWithValue(class010542, bl || this.method_25370());
        if (this.usedKeyboard) {
            this.tryRenderTooltip(class010542, this.bounds.y(class03249.field_41829), this.bounds.R().y(), bl);
        } else {
            this.tryRenderTooltip(class010542, n, n2, bl);
        }
    }

    @Override
    protected class00392 createValueLabel() {
        return this.prefix.L().y((class00392)GuiUtil.translateOrDefault(class00392.y((String)this.getValue()).y((class00392)this.suffix), "value." + this.option.getName() + "." + this.getValue(), new Object[0])).N(class004052 -> class004052.N(class05194.N((int)-10057473)));
    }

    @Override
    public boolean applyOriginalValue() {
        this.valueIndex = this.option.getAllowedValues().indexOf((Object)this.option.getDefaultValue());
        this.queue();
        return true;
    }

    @Override
    public boolean applyNextValue() {
        this.increment(1);
        this.queue();
        return true;
    }

    @Override
    public String getCommentKey() {
        return "option." + this.option.getName() + ".comment";
    }

    @Override
    public boolean applyPreviousValue() {
        this.increment(-1);
        this.queue();
        return true;
    }

    @Override
    public boolean isValueModified() {
        return !this.appliedValue.equals(this.getValue());
    }
}

