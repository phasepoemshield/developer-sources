/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class05213
 *  minecraft.class06202
 *  minecraft.class08394
 *  net.irisshaders.iris.shaderpack.ShaderPack
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer
 */
package net.irisshaders.iris.gui.element;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class05213;
import minecraft.class06202;
import minecraft.class08394;
import net.irisshaders.iris.gui.NavigationController;
import net.irisshaders.iris.gui.element.IrisContainerObjectSelectionList;
import net.irisshaders.iris.gui.element.ShaderPackOptionList$BaseEntry;
import net.irisshaders.iris.gui.element.ShaderPackOptionList$ElementRowEntry;
import net.irisshaders.iris.gui.element.ShaderPackOptionList$HeaderEntry;
import net.irisshaders.iris.gui.element.widget.AbstractElementWidget;
import net.irisshaders.iris.gui.element.widget.OptionMenuConstructor;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.shaderpack.ShaderPack;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer;

public class ShaderPackOptionList
extends IrisContainerObjectSelectionList<ShaderPackOptionList$BaseEntry> {
    private static final class01894 MENU_LIST_BACKGROUND = class01894.y((String)"textures/gui/menu_background.png");
    private final List<AbstractElementWidget<?>> elementWidgets = new ArrayList();
    private final ShaderPackScreen screen;
    private final NavigationController navigation;
    private OptionMenuContainer container;

    public ShaderPackOptionList(ShaderPackScreen shaderPackScreen, NavigationController navigationController, ShaderPack shaderPack, class06202 class062022, int n, int n2, int n3, int n4, int n5, int n6) {
        super(class062022, n, n4, n3 + 4, n4, n5, n6, 24);
        this.navigation = navigationController;
        this.screen = shaderPackScreen;
        this.applyShaderPack(shaderPack);
    }

    public void addHeader(class00392 class003922, boolean bl) {
        this.method_25321((class01202)new ShaderPackOptionList$HeaderEntry(this, this.screen, this.navigation, class003922, bl));
    }

    public void refresh() {
        this.elementWidgets.forEach(abstractElementWidget -> abstractElementWidget.init(this.screen, this.navigation));
    }

    public NavigationController getNavigation() {
        return this.navigation;
    }

    public void rebuild() {
        this.method_25339();
        this.method_44382(0.0);
        OptionMenuConstructor.constructAndApplyToScreen(this.container, this.screen, this, this.navigation);
    }

    public void applyShaderPack(ShaderPack shaderPack) {
        this.container = shaderPack.getMenuContainer();
    }

    public void addWidgets(int n, List<AbstractElementWidget<?>> list) {
        this.elementWidgets.addAll(list);
        ArrayList<AbstractElementWidget<Object>> arrayList = new ArrayList();
        for (AbstractElementWidget<?> abstractElementWidget : list) {
            arrayList.add(abstractElementWidget);
            if (arrayList.size() < n) continue;
            this.method_25321((class01202)new ShaderPackOptionList$ElementRowEntry(this.screen, this.navigation, arrayList));
            arrayList = new ArrayList();
        }
        if (!arrayList.isEmpty()) {
            while (arrayList.size() < n) {
                arrayList.add(AbstractElementWidget.EMPTY);
            }
            this.method_25321((class01202)new ShaderPackOptionList$ElementRowEntry(this.screen, this.navigation, arrayList));
        }
    }

    public int method_25322() {
        return Math.min(400, this.field_22758 - 12);
    }

    public void method_57715(class01054 class010542) {
        float f = this.screen.listTransition.getAsFloat();
        class010542.N(class08394.Na, MENU_LIST_BACKGROUND, this.method_46426(), this.method_46427(), (float)this.method_55442(), (float)(this.method_55443() + (int)this.method_44387()), this.method_25368(), this.method_25364(), 32, 32);
    }

    public void method_57713(class01054 class010542) {
        float f = this.screen.listTransition.getAsFloat();
        if (f < 0.02f) {
            return;
        }
        int n = class02566.N((float)f, (float)1.0f, (float)1.0f, (float)1.0f);
        class010542.N(class08394.Na, class05213.field_49895, this.method_46426(), this.method_46427() - 2, 0.0f, 0.0f, this.method_25368(), 2, 32, 2, n);
        class010542.N(class08394.Na, class05213.field_49896, this.method_46426(), this.method_55443(), 0.0f, 0.0f, this.method_25368(), 2, 32, 2, n);
    }
}

