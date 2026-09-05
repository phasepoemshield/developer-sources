/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class05341
 *  minecraft.class05361
 */
package net.irisshaders.iris.gui.element.screen;

import minecraft.class00392;
import minecraft.class04141;
import minecraft.class05341;
import minecraft.class05361;
import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.gui.element.screen.IrisButton;

public class IrisButton$Builder {
    private final class00392 message;
    private final class05361 onPress;
    private final FloatSupplier alpha;
    private class04141 tooltip;
    private int x;
    private int y;
    private int width = 150;
    private int height = 20;
    private class05341 createNarration = IrisButton.access$000();

    public IrisButton$Builder pos(int n, int n2) {
        this.x = n;
        this.y = n2;
        return this;
    }

    public IrisButton$Builder width(int n) {
        this.width = n;
        return this;
    }

    public IrisButton$Builder(class00392 class003922, class05361 class053612, FloatSupplier floatSupplier) {
        this.message = class003922;
        this.onPress = class053612;
        this.alpha = floatSupplier;
    }

    public IrisButton$Builder size(int n, int n2) {
        this.width = n;
        this.height = n2;
        return this;
    }

    public IrisButton$Builder bounds(int n, int n2, int n3, int n4) {
        return this.pos(n, n2).size(n3, n4);
    }

    public IrisButton build() {
        IrisButton irisButton = new IrisButton(this.x, this.y, this.width, this.height, this.message, this.onPress, this.createNarration, this.alpha);
        irisButton.method_47400(this.tooltip);
        irisButton.field_22763 = true;
        return irisButton;
    }

    public IrisButton$Builder tooltip(class04141 class041412) {
        this.tooltip = class041412;
        return this;
    }

    public IrisButton$Builder createNarration(class05341 class053412) {
        this.createNarration = class053412;
        return this;
    }
}

