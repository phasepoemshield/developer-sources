/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.Dim2iAccess
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.OptionExtended
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.Point2iAccess
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class05096
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class07018
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.config.structure.Option
 *  net.caffeinemc.mods.sodium.client.config.structure.OptionGroup
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList
 *  net.caffeinemc.mods.sodium.client.gui.options.control.Control
 *  net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended;
import me.flashyreese.mods.reeses_sodium_options.client.gui.Dim2iAccess;
import me.flashyreese.mods.reeses_sodium_options.client.gui.OptionExtended;
import me.flashyreese.mods.reeses_sodium_options.client.gui.Point2iAccess;
import me.flashyreese.mods.reeses_sodium_options.client.gui.SodiumVideoOptionsScreen;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.AbstractFrame;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.PageFrame$Builder;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.PageFrame$SearchEntry;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components.LabelComponent;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class05096;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07018;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.structure.OptionGroup;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.Control;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class PageFrame
extends AbstractFrame {
    protected final Dim2i originalDim;
    protected final Page page;
    private long lastTime = 0L;
    private ControlElement lastHoveredElement = null;

    public PageFrame(class05096 class050962, Dim2i dim2i, boolean bl, Page page, ModOptions modOptions) {
        super(dim2i, class050962, bl, modOptions);
        this.originalDim = new Dim2i(dim2i.x(), dim2i.y(), dim2i.width(), dim2i.height());
        this.page = page;
        this.setupFrame();
        this.buildFrame();
    }

    public static PageFrame$Builder builder() {
        return new PageFrame$Builder();
    }

    @Override
    public class02106 method_48205(class02089 class020892) {
        return super.method_48205(class020892);
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        ControlElement controlElement2 = this.controlElements.stream().filter(controlElement -> ((Dim2iAccess)((AbstractWidgetExtended)controlElement).getDim()).overlapWith(this.originalDim)).filter(AbstractWidget::isHovered).findFirst().orElse(this.controlElements.stream().filter(controlElement -> ((Dim2iAccess)((AbstractWidgetExtended)controlElement).getDim()).overlapWith(this.originalDim)).filter(AbstractWidget::method_25370).findFirst().orElse(null));
        super.method_25394(class010542, n, n2, f);
        if (controlElement2 != null && this.lastHoveredElement == controlElement2 && (this.originalDim.containsCursor((double)n, (double)n2) && controlElement2.isHovered() && controlElement2.method_25405((double)n, (double)n2) || controlElement2.method_25370())) {
            if (this.lastTime == 0L) {
                this.lastTime = System.currentTimeMillis();
            }
            this.renderOptionTooltip(class010542, controlElement2);
        } else {
            this.lastTime = 0L;
            this.lastHoveredElement = controlElement2;
        }
    }

    @Override
    public void buildFrame() {
        if (this.page == null) {
            return;
        }
        this.children.clear();
        this.controlElements.clear();
        int n = 0;
        List<PageFrame$SearchEntry> list = this.buildSearchEntries();
        if (!list.isEmpty()) {
            OptionGroup optionGroup = null;
            for (PageFrame$SearchEntry pageFrame$SearchEntry : list) {
                Control control;
                OptionGroup optionGroup2 = pageFrame$SearchEntry.group();
                if (optionGroup2 != optionGroup) {
                    if (optionGroup != null) {
                        n += 4;
                    }
                    if (optionGroup2.name() != null && !optionGroup2.name().getString().isEmpty()) {
                        control = new Dim2i(0, n + 4, this.getWidth(), 18);
                        ((Dim2iAccess)control).setPoint2i((Point2iAccess)((AbstractWidgetExtended)this).getDim());
                        this.children.add(new LabelComponent((Dim2i)control, optionGroup2.name(), -1));
                        n += 18;
                    }
                    optionGroup = optionGroup2;
                }
                control = pageFrame$SearchEntry.option().getControl();
                Dim2i dim2i = new Dim2i(0, n, this.getWidth(), 18);
                ((Dim2iAccess)dim2i).setPoint2i((Point2iAccess)((AbstractWidgetExtended)this).getDim());
                ControlElement controlElement = control.createElement(this.screen, (AbstractOptionList)this, dim2i, this.modOptions.theme());
                ((OptionExtended)controlElement.getOption()).setDim2i(dim2i);
                this.children.add(controlElement);
                n += 18;
            }
            n += 4;
        } else {
            for (OptionGroup optionGroup : this.page.groups()) {
                if (optionGroup.name() != null && !optionGroup.name().getString().isEmpty()) {
                    Dim2i dim2i = new Dim2i(0, n + 4, this.getWidth(), 18);
                    ((Dim2iAccess)dim2i).setPoint2i((Point2iAccess)((AbstractWidgetExtended)this).getDim());
                    this.children.add(new LabelComponent(dim2i, optionGroup.name(), -1));
                    n += 18;
                }
                for (Option option : optionGroup.options()) {
                    Control control = option.getControl();
                    Dim2i dim2i = new Dim2i(0, n, this.getWidth(), 18);
                    ((Dim2iAccess)dim2i).setPoint2i((Point2iAccess)((AbstractWidgetExtended)this).getDim());
                    ControlElement controlElement = control.createElement(this.screen, (AbstractOptionList)this, dim2i, this.modOptions.theme());
                    ((OptionExtended)controlElement.getOption()).setDim2i(dim2i);
                    this.children.add(controlElement);
                    n += 18;
                }
                n += 4;
            }
        }
        super.buildFrame();
    }

    public void setupFrame() {
        this.children.clear();
        this.controlElements.clear();
        int n = 0;
        List<PageFrame$SearchEntry> list = this.buildSearchEntries();
        if (!list.isEmpty()) {
            OptionGroup optionGroup2 = null;
            for (PageFrame$SearchEntry pageFrame$SearchEntry : list) {
                OptionGroup optionGroup3 = pageFrame$SearchEntry.group();
                if (optionGroup3 != optionGroup2) {
                    if (optionGroup2 != null) {
                        n += 4;
                    }
                    if (optionGroup3.name() != null && !optionGroup3.name().getString().isEmpty()) {
                        n += 18;
                    }
                    optionGroup2 = optionGroup3;
                }
                n += 18;
            }
            n += 4;
        } else if (!this.page.groups().isEmpty()) {
            OptionGroup optionGroup4 = (OptionGroup)this.page.groups().get(this.page.groups().size() - 1);
            for (OptionGroup optionGroup5 : this.page.groups()) {
                if (optionGroup5.name() != null && !optionGroup5.name().getString().isEmpty()) {
                    n += 18;
                }
                n += optionGroup5.options().size() * 18;
                if (optionGroup5 == optionGroup4) continue;
                n += 4;
            }
        }
        ((Dim2iAccess)((AbstractWidgetExtended)this).getDim()).setHeight(n);
        this.page.groups().forEach(optionGroup -> optionGroup.options().forEach(option -> {
            if (option instanceof OptionExtended) {
                OptionExtended optionExtended = (OptionExtended)option;
                optionExtended.setParentDimension(((AbstractWidgetExtended)this).getDim());
            }
        }));
    }

    private List<PageFrame$SearchEntry> buildSearchEntries() {
        List<class01894> list = SodiumVideoOptionsScreen.sharedUiState().searchResultIds();
        if (list.isEmpty()) {
            return List.of();
        }
        HashMap<class01894, PageFrame$SearchEntry> hashMap = new HashMap<class01894, PageFrame$SearchEntry>();
        for (Object object : this.page.groups()) {
            for (Object object2 : object.options()) {
                if (!(object2 instanceof OptionExtended)) continue;
                OptionExtended optionExtended = (OptionExtended)object2;
                hashMap.put(optionExtended.getId(), new PageFrame$SearchEntry((OptionGroup)object, (Option)object2));
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (class01894 class018942 : list) {
            Object object2;
            object2 = (PageFrame$SearchEntry)((Object)hashMap.get(class018942));
            if (object2 == null) continue;
            arrayList.add(object2);
        }
        return arrayList;
    }

    private void renderOptionTooltip(class01054 class010542, ControlElement controlElement) {
        int n;
        int n2;
        int n3;
        if (this.lastTime + 500L > System.currentTimeMillis()) {
            return;
        }
        Dim2i dim2i = ((AbstractWidgetExtended)controlElement).getDim();
        int n4 = 3;
        int n5 = 3;
        int n6 = dim2i.width();
        int n7 = dim2i.getLimitY();
        int n8 = dim2i.x();
        Option option = controlElement.getOption();
        ArrayList<class01028> arrayList = new ArrayList<class01028>();
        arrayList.add(class07018.y().N((class05936)class00392.y((String)((OptionExtended)option).getId().toString()).N(class06541.field_1080)));
        arrayList.add(class07018.y().N((class05936)class00392.y((String)"")));
        arrayList.addAll(((class01590)class06202.Nq().i_3).L((class05936)option.getTooltip(), n6 - n4 * 2));
        OptionImpact optionImpact = option.getImpact();
        if (optionImpact != null) {
            arrayList.add(class07018.y().N((class05936)class00392.N((String)"sodium.options.performance_impact_string", (Object[])new Object[]{optionImpact.getName()}).N(class06541.field_1080)));
        }
        if ((n3 = n7 + (n2 = arrayList.size() * 12 + n5)) > (n = this.originalDim.getLimitY())) {
            n7 -= n2 + dim2i.height();
        }
        if (n7 < 0) {
            n7 = dim2i.getLimitY();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.drawRect(class010542, n8, n7, n8 + n6, n7 + n2, -536870912);
        this.drawBorder(class010542, n8, n7, n8 + n6, n7 + n2, this.modOptions.theme().theme);
        for (int i = 0; i < arrayList.size(); ++i) {
            class010542.N((class01590)class06202.Nq().i_3, (class01028)arrayList.get(i), n8 + n4, n7 + n4 + i * 12, -1, true);
        }
    }
}

