/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class06601
 *  minecraft.class06613
 */
package net.irisshaders.iris.gui.element;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class06601;
import minecraft.class06613;
import net.irisshaders.iris.gui.element.IrisElementRow$Element;

public class IrisElementRow {
    private final Map<IrisElementRow$Element, Integer> elements = new HashMap<IrisElementRow$Element, Integer>();
    private final List<IrisElementRow$Element> orderedElements = new ArrayList<IrisElementRow$Element>();
    private final int spacing;
    private int x;
    private int y;
    private int width;
    private int height;

    public List<? extends class04654> children() {
        return ImmutableList.copyOf(this.orderedElements);
    }

    public IrisElementRow(int n) {
        this.spacing = n;
    }

    public IrisElementRow() {
        this(1);
    }

    public IrisElementRow add(IrisElementRow$Element irisElementRow$Element, int n) {
        if (!this.orderedElements.contains(irisElementRow$Element)) {
            this.orderedElements.add(irisElementRow$Element);
        }
        this.elements.put(irisElementRow$Element, n);
        this.width += n + this.spacing;
        return this;
    }

    public boolean keyPressed(class06601 class066012) {
        return this.getFocused().map(irisElementRow$Element -> irisElementRow$Element.method_25404(class066012)).orElse(false);
    }

    public boolean mouseReleased(class06613 class066132) {
        return this.getHovered(class066132.n(), class066132.t()).map(irisElementRow$Element -> irisElementRow$Element.method_25406(class066132)).orElse(false);
    }

    public boolean mouseClicked(class06613 class066132, boolean bl) {
        return this.getHovered(class066132.n(), class066132.t()).map(irisElementRow$Element -> irisElementRow$Element.method_25402(class066132, bl)).orElse(false);
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, float f, boolean bl) {
        this.x = n;
        this.y = n2;
        this.height = n3;
        int n6 = n;
        for (IrisElementRow$Element irisElementRow$Element : this.orderedElements) {
            int n7 = this.elements.get(irisElementRow$Element);
            irisElementRow$Element.render(class010542, n6, n2, n7, n3, n4, n5, f, bl && this.sectionHovered(n6, n7, n4, n5));
            n6 += n7 + this.spacing;
        }
    }

    public void setWidth(IrisElementRow$Element irisElementRow$Element, int n) {
        if (!this.elements.containsKey(irisElementRow$Element)) {
            return;
        }
        this.width -= this.elements.get(irisElementRow$Element) + 2;
        this.add(irisElementRow$Element, n);
    }

    public int getWidth() {
        return this.width;
    }

    public void renderRightAligned(class01054 class010542, int n, int n2, int n3, int n4, int n5, float f, boolean bl) {
        this.render(class010542, n - this.width, n2, n3, n4, n5, f, bl);
    }

    private boolean sectionHovered(int n, int n2, double d, double d2) {
        return d > (double)n && d < (double)(n + n2) && d2 > (double)this.y && d2 < (double)(this.y + this.height);
    }

    private Optional<IrisElementRow$Element> getFocused() {
        return this.orderedElements.stream().filter(IrisElementRow$Element::method_25370).findFirst();
    }

    private Optional<IrisElementRow$Element> getHovered(double d, double d2) {
        int n = this.x;
        for (IrisElementRow$Element irisElementRow$Element : this.orderedElements) {
            int n2 = this.elements.get(irisElementRow$Element);
            if (this.sectionHovered(n, n2, d, d2)) {
                return Optional.of(irisElementRow$Element);
            }
            n += n2 + this.spacing;
        }
        return Optional.empty();
    }
}

