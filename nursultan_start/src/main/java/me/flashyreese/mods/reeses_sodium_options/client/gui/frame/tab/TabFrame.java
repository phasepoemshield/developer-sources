/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.Dim2iAccess
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.FlatButtonWidgetExtended
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.Point2iAccess
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05096
 *  minecraft.class05936
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.config.structure.ExternalPage
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.gui.ButtonTheme
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget
 *  net.caffeinemc.mods.sodium.client.gui.widgets.FlatButtonWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended;
import me.flashyreese.mods.reeses_sodium_options.client.gui.Dim2iAccess;
import me.flashyreese.mods.reeses_sodium_options.client.gui.FlatButtonWidgetExtended;
import me.flashyreese.mods.reeses_sodium_options.client.gui.Point2iAccess;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.AbstractFrame;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components.ScrollBarComponent;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components.ScrollBarComponent$ScrollDirection;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components.TabHeaderComponent;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab.Tab;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab.TabFrame$Builder;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05096;
import minecraft.class05936;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.config.structure.ExternalPage;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.ButtonTheme;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.FlatButtonWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class TabFrame
extends AbstractFrame {
    public static final int TAB_HEIGHT = 18;
    public static final int TAB_HEADER_HEIGHT = 22;
    public static final int TAB_HEADER_PADDING = 4;
    public static final float TEXT_WIDTH_MULTIPLIER = 1.25f;
    private final boolean tabSectionCanScroll;
    private final Dim2i tabSection;
    private final Dim2i frameSection;
    private final List<Tab<?>> tabs = new ArrayList();
    private final Runnable onSetTab;
    private final AtomicReference<class00392> tabSectionSelectedTab;
    private ScrollBarComponent tabSectionScrollBar = null;
    private Optional<Tab<?>> selectedTab = Optional.empty();
    private AbstractFrame selectedFrame;

    public TabFrame(Dim2i dim2i, class05096 class050962, ModOptions modOptions, boolean bl, List<Tab<?>> list, Runnable runnable, AtomicReference<class00392> atomicReference, AtomicReference<Integer> atomicReference2) {
        super(dim2i, class050962, bl, modOptions);
        this.tabs.addAll(list);
        int n2 = Math.toIntExact(this.tabs.stream().map(tab -> tab.getModOptions().name()).distinct().count());
        int n3 = this.tabs.size() * 18 + n2 * 22 + (n2 - 1) * 4;
        Dim2i dim2i2 = this.getFrameDim();
        this.tabSectionCanScroll = n3 > dim2i2.height();
        Optional<Integer> optional = list.stream().map(tab -> (int)((float)this.getStringWidth((class05936)tab.getTitle()) * 1.25f)).max(Integer::compareTo);
        this.tabSection = new Dim2i(dim2i2.x(), dim2i2.y(), optional.map(n -> n + (this.tabSectionCanScroll ? 32 : 24)).orElseGet(() -> (int)((double)dim2i2.width() * 0.35)).intValue(), dim2i2.height());
        this.frameSection = new Dim2i(this.tabSection.getLimitX(), dim2i2.y(), dim2i2.width() - this.tabSection.width(), dim2i2.height());
        this.onSetTab = runnable;
        if (this.tabSectionCanScroll) {
            this.tabSectionScrollBar = new ScrollBarComponent(new Dim2i(this.tabSection.getLimitX() - 11, this.tabSection.y(), 10, this.tabSection.height()), ScrollBarComponent$ScrollDirection.VERTICAL, n3, dim2i2.height(), n -> {
                atomicReference2.set((Integer)n);
                ((Dim2iAccess)this.tabSection).setY(dim2i2.y() - this.tabSectionScrollBar.getOffset());
            }, dim2i2);
            this.tabSectionScrollBar.setOffset(atomicReference2.get());
        }
        this.tabSectionSelectedTab = atomicReference;
        if (this.tabSectionSelectedTab.get() != null) {
            this.selectedTab = this.tabs.stream().filter(tab -> tab.getTitle().getString().equals(this.tabSectionSelectedTab.get().getString())).findAny();
        }
        this.buildFrame();
        this.tabs.stream().filter(tab -> this.selectedTab.filter(tab2 -> tab2 != tab).isPresent()).forEach(tab -> tab.getFrameFunction().apply(this.frameSection));
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        Dim2i dim2i = this.getFrameDim();
        this.applyScissor(class010542, dim2i.x(), dim2i.y(), dim2i.width(), dim2i.height(), () -> {
            for (AbstractWidget abstractWidget : this.children) {
                if (abstractWidget == this.selectedFrame) continue;
                abstractWidget.method_25394(class010542, n, n2, f);
            }
        });
        this.selectedFrame.method_25394(class010542, n, n2, f);
        if (this.tabSectionCanScroll) {
            this.tabSectionScrollBar.method_25394(class010542, n, n2, f);
        }
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        return super.method_25403(class066132, d, d2) || this.tabSectionCanScroll && this.tabSectionScrollBar.method_25403(class066132, d, d2);
    }

    @Override
    public boolean method_25401(double d, double d2, double d3, double d4) {
        return super.method_25401(d, d2, d3, d4) || this.tabSectionCanScroll && this.tabSectionScrollBar.method_25401(d, d2, d3, d4);
    }

    public boolean method_25406(class06613 class066132) {
        return super.method_25406(class066132) || this.tabSectionCanScroll && this.tabSectionScrollBar.method_25406(class066132);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return this.getFrameDim().containsCursor(class066132.n(), class066132.t()) && super.method_25402(class066132, bl) || this.tabSectionCanScroll && this.tabSectionScrollBar.method_25402(class066132, bl);
    }

    public static TabFrame$Builder createBuilder() {
        return new TabFrame$Builder();
    }

    public void setTab(Optional<Tab<?>> optional) {
        this.selectedTab = optional;
        if (this.onSetTab != null) {
            this.onSetTab.run();
        }
        this.selectedTab.ifPresent(tab -> {
            Page page = tab.getPage();
            if (page instanceof ExternalPage) {
                ExternalPage externalPage = (ExternalPage)page;
                externalPage.currentScreenConsumer().accept(this.screen);
            } else {
                this.tabSectionSelectedTab.set(tab.getTitle());
            }
        });
        this.buildFrame();
    }

    @Override
    public void buildFrame() {
        this.children.clear();
        this.controlElements.clear();
        if (this.selectedTab.isEmpty() && !this.tabs.isEmpty()) {
            this.selectedTab = Optional.ofNullable((Tab)this.tabs.getFirst());
        }
        this.rebuildTabs();
        this.rebuildTabFrame();
        if (this.tabSectionCanScroll) {
            this.tabSectionScrollBar.updateThumbLocation();
            this.children.add(this.tabSectionScrollBar);
        }
        super.buildFrame();
        Dim2i dim2i = this.getFrameDim();
        this.registerFocusListener(class046542 -> {
            if (class046542 instanceof FlatButtonWidgetExtended) {
                FlatButtonWidgetExtended flatButtonWidgetExtended = (FlatButtonWidgetExtended)class046542;
                if (this.tabSectionCanScroll) {
                    Dim2i dim2i2 = ((AbstractWidgetExtended)flatButtonWidgetExtended).getDim();
                    int n = this.tabSectionScrollBar.getOffset();
                    if (dim2i2.y() <= dim2i.y()) {
                        n += dim2i2.y() - dim2i.y();
                    } else if (dim2i2.getLimitY() >= dim2i.getLimitY()) {
                        n += dim2i2.getLimitY() - dim2i.getLimitY();
                    }
                    this.tabSectionScrollBar.setOffset(n);
                }
            }
        });
    }

    public List<Tab<?>> getTabs() {
        return this.tabs;
    }

    public AbstractFrame getSelectedFrame() {
        return this.selectedFrame;
    }

    public Optional<Tab<?>> getSelectedTab() {
        return this.selectedTab;
    }

    private void rebuildTabs() {
        int n = 0;
        String string = "";
        boolean bl = true;
        for (Tab<?> tab : this.tabs) {
            Dim2i dim2i;
            int n2 = this.tabSection.width() - (this.tabSectionCanScroll ? 12 : 4);
            if (!string.equals(tab.getModOptions().name())) {
                dim2i = new Dim2i(0, n + (bl ? 0 : 4), n2, 22);
                TabFrame.setDimPoint(dim2i, (Point2iAccess)this.tabSection);
                this.children.add(new TabHeaderComponent(dim2i, tab.getModOptions()));
                string = tab.getModOptions().name();
                n += 22 + (bl ? 0 : 4);
                bl = false;
            }
            dim2i = new Dim2i(0, n, n2, 18);
            TabFrame.setDimPoint(dim2i, (Point2iAccess)this.tabSection);
            ButtonTheme buttonTheme = new ButtonTheme(tab.getModOptions().theme(), FlatButtonWidget.DEFAULT_THEME.bgHighlight, FlatButtonWidget.DEFAULT_THEME.bgDefault, FlatButtonWidget.DEFAULT_THEME.bgInactive);
            FlatButtonWidget flatButtonWidget = new FlatButtonWidget(dim2i, tab.getTitle(), () -> this.setTab(Optional.of(tab)), true, true, buttonTheme);
            flatButtonWidget.setSelected(this.selectedTab.isPresent() && this.selectedTab.get() == tab && !(tab.getPage() instanceof ExternalPage));
            if (flatButtonWidget instanceof FlatButtonWidgetExtended) {
                FlatButtonWidgetExtended flatButtonWidgetExtended = (FlatButtonWidgetExtended)flatButtonWidget;
                flatButtonWidgetExtended.setTab(true);
            }
            this.children.add(flatButtonWidget);
            n += 18;
        }
    }

    private void rebuildTabFrame() {
        if (this.selectedTab.isEmpty()) {
            return;
        }
        AbstractFrame abstractFrame = (AbstractFrame)((Object)this.selectedTab.get().getFrameFunction().apply(this.frameSection));
        if (abstractFrame != null) {
            this.selectedFrame = abstractFrame;
            abstractFrame.buildFrame();
            this.children.add(abstractFrame);
        }
    }
}

