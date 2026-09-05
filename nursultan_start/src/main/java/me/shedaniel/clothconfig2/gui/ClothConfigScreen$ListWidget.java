/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  me.shedaniel.clothconfig2.gui.widget.DynamicElementListWidget
 *  me.shedaniel.clothconfig2.gui.widget.DynamicElementListWidget$ElementEntry
 *  me.shedaniel.math.Rectangle
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06613
 *  minecraft.class07331
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package me.shedaniel.clothconfig2.gui;

import java.util.List;
import java.util.function.UnaryOperator;
import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;
import me.shedaniel.clothconfig2.gui.AbstractConfigScreen;
import me.shedaniel.clothconfig2.gui.widget.DynamicElementListWidget;
import me.shedaniel.math.Rectangle;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06613;
import minecraft.class07331;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class ClothConfigScreen$ListWidget<R extends DynamicElementListWidget.ElementEntry<R>>
extends DynamicElementListWidget<R> {
    private final AbstractConfigScreen screen;
    private final ValueAnimator<Rectangle> currentBounds = ValueAnimator.ofRectangle();
    public UnaryOperator<List<R>> entriesTransformer = UnaryOperator.identity();
    public Rectangle thisTimeTarget;
    public long lastTouch;

    public ClothConfigScreen$ListWidget(AbstractConfigScreen abstractConfigScreen, class06202 class062022, int n, int n2, int n3, int n4, class01894 class018942) {
        super(class062022, n, n2, n3, n4, abstractConfigScreen.isTransparentBackground() ? null : class018942);
        this.setRenderSelection(false);
        this.screen = abstractConfigScreen;
    }

    public List<R> method_25396() {
        return (List)this.entriesTransformer.apply(super.method_25396());
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.updateScrollingState(class066132.n(), class066132.t(), class066132.G().v());
        if (!this.method_25405(class066132.n(), class066132.t())) {
            return false;
        }
        for (DynamicElementListWidget.ElementEntry elementEntry : this.method_25396()) {
            if (!elementEntry.method_25402(class066132, bl)) continue;
            this.method_25395((class04654)elementEntry);
            this.method_25398(true);
            return true;
        }
        if (class066132.v() == 0) {
            this.clickedHeader((int)(class066132.n() - (double)(this.left + this.width / 2 - this.getItemWidth() / 2)), (int)(class066132.t() - (double)this.top) + (int)this.getScroll() - 4);
            return true;
        }
        return this.scrolling;
    }

    protected void renderItem(class01054 class010542, R r, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        if (r instanceof AbstractConfigEntry) {
            ((AbstractConfigEntry)r).updateSelected(this.getFocused() == r);
        }
        super.renderItem(class010542, r, n, n2, n3, n4, n5, n6, n7, bl, f);
    }

    public void renderList(class01054 class010542, int n, int n2, int n3, int n4, float f) {
        this.thisTimeTarget = null;
        Rectangle rectangle = (Rectangle)this.currentBounds.value();
        if (!rectangle.isEmpty()) {
            long l = System.currentTimeMillis() - this.lastTouch;
            int n5 = l <= 200L ? 255 : class04995.L((double)(255.0 - (double)(Math.min((float)(l - 200L), 500.0f) / 500.0f) * 255.0));
            n5 = n5 * 36 / 255 << 24;
            class010542.N(rectangle.x, rectangle.y - (int)this.scroll, rectangle.getMaxX(), rectangle.getMaxY() - (int)this.scroll, 0xFFFFFF | n5, 0xFFFFFF | n5);
        }
        super.renderList(class010542, n, n2, n3, n4, f);
        if (this.thisTimeTarget != null && this.method_25405(n3, n4)) {
            this.lastTouch = System.currentTimeMillis();
        }
        if (this.thisTimeTarget != null && !this.thisTimeTarget.equals(this.currentBounds.target())) {
            this.currentBounds.setTo(this.thisTimeTarget, 100L);
        } else if (!((Rectangle)this.currentBounds.target()).isEmpty()) {
            this.currentBounds.update(f);
        }
    }

    protected static void fillGradient(Matrix4f matrix4f, class07331 class073312, double d, double d2, double d3, double d4, int n, int n2, int n3) {
        float f = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n2 & 0xFF) / 255.0f;
        float f5 = (float)(n3 >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n3 >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n3 >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n3 & 0xFF) / 255.0f;
        class073312.N((Matrix4fc)matrix4f, (float)d3, (float)d2, (float)n).method_22915(f2, f3, f4, f);
        class073312.N((Matrix4fc)matrix4f, (float)d, (float)d2, (float)n).method_22915(f2, f3, f4, f);
        class073312.N((Matrix4fc)matrix4f, (float)d, (float)d4, (float)n).method_22915(f6, f7, f8, f5);
        class073312.N((Matrix4fc)matrix4f, (float)d3, (float)d4, (float)n).method_22915(f6, f7, f8, f5);
    }

    public int getItemWidth() {
        return this.width - 80;
    }

    public int getScrollbarPosition() {
        return this.left + this.width - 36;
    }
}

