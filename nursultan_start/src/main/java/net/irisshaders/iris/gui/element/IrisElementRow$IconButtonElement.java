/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 */
package net.irisshaders.iris.gui.element;

import java.util.function.Function;
import minecraft.class01054;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.GuiUtil$Icon;
import net.irisshaders.iris.gui.element.IrisElementRow$ButtonElement;

public class IrisElementRow$IconButtonElement
extends IrisElementRow$ButtonElement<IrisElementRow$IconButtonElement> {
    public final GuiUtil$Icon icon;
    public final GuiUtil$Icon hoveredIcon;

    public IrisElementRow$IconButtonElement(GuiUtil$Icon guiUtil$Icon, GuiUtil$Icon guiUtil$Icon2, Function<IrisElementRow$IconButtonElement, Boolean> function) {
        super(function);
        this.icon = guiUtil$Icon;
        this.hoveredIcon = guiUtil$Icon2;
    }

    public IrisElementRow$IconButtonElement(GuiUtil$Icon guiUtil$Icon, Function<IrisElementRow$IconButtonElement, Boolean> function) {
        this(guiUtil$Icon, guiUtil$Icon, function);
    }

    @Override
    public void renderLabel(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, float f, boolean bl) {
        int n7 = n + (int)((double)(n3 - this.icon.getWidth()) * 0.5);
        int n8 = n2 + (int)((double)(n4 - this.icon.getHeight()) * 0.5);
        GuiUtil.bindIrisWidgetsTexture();
        if (!this.disabled && (bl || this.method_25370())) {
            this.hoveredIcon.draw(class010542, n7, n8);
        } else {
            this.icon.draw(class010542, n7, n8);
        }
    }
}

