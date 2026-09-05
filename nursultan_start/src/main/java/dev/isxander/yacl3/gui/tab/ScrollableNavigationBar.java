/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.UnmodifiableIterator
 *  dev.isxander.yacl3.mixin.TabNavigationBarAccessor
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class03241
 *  minecraft.class03271
 *  minecraft.class03281
 *  minecraft.class03567
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06478
 */
package dev.isxander.yacl3.gui.tab;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import dev.isxander.yacl3.gui.render.ColorGradientRenderState;
import dev.isxander.yacl3.gui.tab.TabExt;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import dev.isxander.yacl3.mixin.TabNavigationBarAccessor;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class03241;
import minecraft.class03271;
import minecraft.class03281;
import minecraft.class03567;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06478;

public class ScrollableNavigationBar
extends class03281 {
    private static final int NAVBAR_MARGIN = 28;
    private static final class01590 font = (class01590)class06202.Nq().i_3;
    private int scrollOffset;
    private int maxScrollOffset;
    private final TabNavigationBarAccessor accessor = (TabNavigationBarAccessor)this;

    public ScrollableNavigationBar(int n, class03271 class032712, Iterable<? extends class03241> iterable) {
        super(n, class032712, (Iterable)ImmutableList.copyOf(iterable));
        for (class03567 class035672 : this.accessor.yacl$getTabButtons()) {
            class03241 class032412 = class035672.y();
            if (!(class032412 instanceof TabExt)) continue;
            TabExt tabExt = (TabExt)class032412;
            class035672.method_47400(tabExt.getTooltip());
        }
    }

    protected void ensureVisible(class03567 class035672) {
        if (class035672.method_46426() < 28) {
            this.setScrollOffset(this.scrollOffset - (28 - class035672.method_46426()));
        } else if (class035672.method_46426() + class035672.method_25368() > this.accessor.yacl$getWidth() - 28) {
            this.setScrollOffset(this.scrollOffset + (class035672.method_46426() + class035672.method_25368() - (this.accessor.yacl$getWidth() - 28)));
        }
    }

    public /* synthetic */ List method_71284() {
        return this.getTabs();
    }

    public void method_49613() {
        ImmutableList immutableList = this.accessor.yacl$getTabButtons();
        int n = this.accessor.yacl$getWidth() - 56;
        int n2 = 0;
        for (Object object : immutableList) {
            int n3 = font.N((class05936)object.method_25369()) + 20;
            n2 += n3;
            object.method_25358(n3);
        }
        if (n2 < n) {
            Object object;
            int n4 = n / immutableList.size();
            object = immutableList.stream().filter(class035672 -> class035672.method_25368() < n4).toList();
            List list = immutableList.stream().filter(class035672 -> class035672.method_25368() >= n4).toList();
            int n5 = n - list.stream().mapToInt(class06478::method_25368).sum();
            int n6 = n5 / object.size();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                class03567 class035673 = (class03567)iterator.next();
                class035673.method_25358(n6);
            }
            n2 = n;
        }
        UnmodifiableIterator unmodifiableIterator = ((TabNavigationBarAccessor)this).yacl$getLayout();
        unmodifiableIterator.N();
        unmodifiableIterator.method_46419(0);
        this.scrollOffset = 0;
        unmodifiableIterator.method_46421(Math.max((this.accessor.yacl$getWidth() - n2) / 2, 28));
        this.maxScrollOffset = Math.max(0, n2 - n);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        GuiUtils.pushPose(class010542);
        GuiUtils.translateZ(class010542, 10.0f);
        super.method_25394(class010542, n, n2, f);
        class01885 class018852 = this.accessor.yacl$getLayout();
        if (this.scrollOffset < this.maxScrollOffset - 28) {
            int n3 = this.accessor.yacl$getWidth();
            ColorGradientRenderState.createHorizontal(class010542, n3 - 40, class018852.method_46427(), n3, class018852.method_46427() + class018852.method_25364(), 0, -16777216).submit(class010542);
            int n4 = class018852.method_46427();
            int n5 = class018852.method_25364();
            Objects.requireNonNull(font);
            class010542.N(font, "\u2192", n3 - 10, n4 + (n5 - 9) / 2, -1, false);
        }
        if (this.scrollOffset > 28) {
            ColorGradientRenderState.createHorizontal(class010542, 0, class018852.method_46427(), 40, class018852.method_46427() + class018852.method_25364(), -16777216, 0).submit(class010542);
            int n6 = class018852.method_46427();
            int n7 = class018852.method_25364();
            Objects.requireNonNull(font);
            class010542.N(font, "\u2190", 5, n6 + (n7 - 9) / 2, -1, false);
        }
        GuiUtils.popPose(class010542);
    }

    public boolean method_25405(double d, double d2) {
        return d2 <= 24.0;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        this.setScrollOffset(this.scrollOffset - (int)(d4 * 15.0) - (int)(d3 * 15.0));
        return true;
    }

    public void method_25395(class04654 class046542) {
        super.method_25395(class046542);
        if (class046542 instanceof class03567) {
            class03567 class035672 = (class03567)class046542;
            this.ensureVisible(class035672);
        }
    }

    public ImmutableList<class03241> getTabs() {
        return this.accessor.yacl$getTabs();
    }

    public class03271 getTabManager() {
        return this.accessor.yacl$getTabManager();
    }

    public void setScrollOffset(int n) {
        class01885 class018852 = ((TabNavigationBarAccessor)this).yacl$getLayout();
        class018852.method_46421(class018852.method_46426() + this.scrollOffset);
        this.scrollOffset = class04995.N((int)n, (int)0, (int)this.maxScrollOffset);
        class018852.method_46421(class018852.method_46426() - this.scrollOffset);
    }

    public int getScrollOffset() {
        return this.scrollOffset;
    }
}

