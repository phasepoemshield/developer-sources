/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer
 */
package net.irisshaders.iris.gui;

import java.util.ArrayDeque;
import java.util.Deque;
import net.irisshaders.iris.gui.element.ShaderPackOptionList;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer;

public class NavigationController {
    private final Deque<String> history = new ArrayDeque<String>();
    private ShaderPackOptionList optionList;
    private String currentScreen = null;

    public NavigationController(OptionMenuContainer optionMenuContainer) {
    }

    public void open(String string) {
        this.currentScreen = string;
        this.history.addLast(string);
        this.rebuild();
    }

    public void back() {
        if (!this.history.isEmpty()) {
            this.history.removeLast();
            this.currentScreen = !this.history.isEmpty() ? this.history.getLast() : null;
        } else {
            this.currentScreen = null;
        }
        this.rebuild();
    }

    public void refresh() {
        if (this.optionList != null) {
            this.optionList.refresh();
        }
    }

    public void setActiveOptionList(ShaderPackOptionList shaderPackOptionList) {
        this.optionList = shaderPackOptionList;
    }

    public String getCurrentScreen() {
        return this.currentScreen;
    }

    public void rebuild() {
        if (this.optionList != null) {
            this.optionList.rebuild();
        }
    }

    public boolean hasHistory() {
        return !this.history.isEmpty();
    }
}

