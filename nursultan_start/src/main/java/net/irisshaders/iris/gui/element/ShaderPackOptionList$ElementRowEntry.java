/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class01054
 *  minecraft.class03255
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class06613
 */
package net.irisshaders.iris.gui.element;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class01054;
import minecraft.class03255;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class06613;
import net.irisshaders.iris.gui.NavigationController;
import net.irisshaders.iris.gui.element.ShaderPackOptionList$BaseEntry;
import net.irisshaders.iris.gui.element.widget.AbstractElementWidget;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;

public class ShaderPackOptionList$ElementRowEntry
extends ShaderPackOptionList$BaseEntry {
    private final List<AbstractElementWidget<?>> widgets;
    private final ShaderPackScreen screen;
    private int cachedWidth;
    private int cachedPosX;

    public ShaderPackOptionList$ElementRowEntry(ShaderPackScreen shaderPackScreen, NavigationController navigationController, List<AbstractElementWidget<?>> list) {
        super(navigationController);
        this.screen = shaderPackScreen;
        this.widgets = list;
    }

    public List<? extends class04654> method_25396() {
        return ImmutableList.copyOf(this.widgets);
    }

    public boolean method_25406(class06613 class066132) {
        return this.widgets.get(this.getHoveredWidget((int)class066132.n())).method_25406(class066132);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return this.widgets.get(this.getHoveredWidget((int)class066132.n())).method_25402(class066132, bl);
    }

    public int getHoveredWidget(int n) {
        float f = (float)class04995.N((int)(n - this.cachedPosX), (int)0, (int)this.cachedWidth) / (float)this.cachedWidth;
        return class04995.N((int)((int)Math.floor((float)this.widgets.size() * f)), (int)0, (int)(this.widgets.size() - 1));
    }

    public List<? extends class03434> method_37025() {
        return ImmutableList.copyOf(this.widgets);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.cachedWidth = this.method_73387();
        this.cachedPosX = this.method_73380();
        int n3 = this.method_73387() - 2 * (this.widgets.size() - 1);
        float f2 = (float)(n3 -= 3) / (float)this.widgets.size();
        for (int i = 0; i < this.widgets.size(); ++i) {
            AbstractElementWidget<?> abstractElementWidget = this.widgets.get(i);
            boolean bl2 = bl && this.getHoveredWidget(n) == i || this.method_25399() == abstractElementWidget;
            abstractElementWidget.bounds = new class03255(this.method_73380() + (int)((f2 + 2.0f) * (float)i), this.method_73382(), (int)f2, this.method_73384() + 2);
            abstractElementWidget.render(class010542, n, n2, f, bl2);
            this.screen.setElementHoveredStatus(abstractElementWidget, bl2);
        }
    }
}

