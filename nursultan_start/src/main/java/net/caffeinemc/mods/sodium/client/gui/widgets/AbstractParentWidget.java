/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class01295
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class04654
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import java.util.ArrayList;
import java.util.List;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class01295;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class04654;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public abstract class AbstractParentWidget
extends AbstractWidget
implements class01295 {
    private final List<class04654> children = new ArrayList<class04654>();
    private final List<class01294> renderableChildren = new ArrayList<class01294>();
    private class04654 focusedElement;
    private boolean dragging;

    public AbstractParentWidget(Dim2i dim2i) {
        super(dim2i);
    }

    public @NonNull List<? extends class04654> method_25396() {
        return this.children;
    }

    public @Nullable class04654 method_25399() {
        return this.focusedElement;
    }

    @Override
    public @Nullable class02106 method_48205(@NonNull class02089 class020892) {
        return super.method_48205(class020892);
    }

    public void method_25394(@NonNull class01054 class010542, int n, int n2, float f) {
        for (class01294 class012942 : this.renderableChildren) {
            class012942.method_25394(class010542, n, n2, f);
        }
    }

    public void method_25395(@Nullable class04654 class046542) {
        if (this.focusedElement != null) {
            this.focusedElement.method_25365(false);
        }
        if (class046542 != null) {
            class046542.method_25365(true);
        }
        this.focusedElement = class046542;
    }

    public void method_25398(boolean bl) {
        this.dragging = bl;
    }

    public boolean method_25397() {
        return this.dragging;
    }

    protected void removeChild(class04654 class046542) {
        this.children.remove(class046542);
        this.renderableChildren.remove(class046542);
    }

    protected <T extends class04654> T addChild(T t) {
        this.children.add(t);
        return t;
    }

    protected <T extends class04654 & class01294> T addRenderableChild(T t) {
        this.children.add(t);
        this.renderableChildren.add(t);
        return t;
    }

    protected void clearChildren() {
        this.children.clear();
        this.renderableChildren.clear();
    }
}

