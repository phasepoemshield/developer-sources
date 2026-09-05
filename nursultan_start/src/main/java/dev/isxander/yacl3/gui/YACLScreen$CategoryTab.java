/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.utils.Dimension
 *  dev.isxander.yacl3.api.utils.MutableDimension
 *  dev.isxander.yacl3.platform.YACLPlatform
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class03255
 *  minecraft.class04141
 *  minecraft.class05213
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06478
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.api.utils.MutableDimension;
import dev.isxander.yacl3.gui.DescriptionWithName;
import dev.isxander.yacl3.gui.OptionDescriptionWidget;
import dev.isxander.yacl3.gui.OptionListWidget;
import dev.isxander.yacl3.gui.SearchFieldWidget;
import dev.isxander.yacl3.gui.WidgetAndType;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.YACLSelectionList;
import dev.isxander.yacl3.gui.tab.TabExt;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import dev.isxander.yacl3.platform.YACLPlatform;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03255;
import minecraft.class04141;
import minecraft.class05213;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06478;

public class YACLScreen$CategoryTab
implements TabExt {
    private static final class01894 DARKER_BG = YACLPlatform.mcRl((String)"textures/gui/menu_list_background.png");
    private final YACLScreen screen;
    private final ConfigCategory category;
    private final class04141 tooltip;
    WidgetAndType<OptionListWidget> optionList;
    public final class05362 saveFinishedButton;
    public final class05362 cancelResetButton;
    public final class05362 undoButton;
    private final SearchFieldWidget searchField;
    private OptionDescriptionWidget descriptionWidget;
    private final class03255 rightPaneDim;

    public class00392 method_48610() {
        return this.category.name();
    }

    public void method_48612(Consumer<class06478> consumer) {
        consumer.accept(this.optionList.getWidget());
        consumer.accept((class06478)this.saveFinishedButton);
        consumer.accept((class06478)this.cancelResetButton);
        consumer.accept((class06478)this.undoButton);
        consumer.accept((class06478)this.searchField);
        consumer.accept(this.descriptionWidget);
    }

    public void method_48611(class03255 class032552) {
        class03255 class032553 = new class03255(class032552.R(), class032552.M() / 3 * 2, class032552.B());
        this.optionList.getType().method_46421(class032553.u());
        this.optionList.getType().method_46419(class032553.y());
        this.optionList.getType().method_25358(class032553.M());
        this.optionList.getType().method_53533(class032553.B());
    }

    @Override
    public void tick() {
        this.descriptionWidget.tick();
    }

    public YACLScreen$CategoryTab(YACLScreen yACLScreen, ConfigCategory configCategory, class03255 class032552) {
        this.screen = yACLScreen;
        this.category = configCategory;
        this.tooltip = class04141.N((class00392)configCategory.tooltip());
        int n = yACLScreen.field_22789 / 3;
        int n2 = n / 20;
        n = Math.min(n, 400);
        int n3 = n - n2 * 2;
        this.rightPaneDim = new class03255(yACLScreen.field_22789 / 3 * 2, class032552.y() + 1, yACLScreen.field_22789 / 3, class032552.B());
        MutableDimension mutableDimension = Dimension.ofInt((int)(yACLScreen.field_22789 / 3 * 2 + yACLScreen.field_22789 / 6), (int)(yACLScreen.field_22790 - n2 - 20), (int)n3, (int)20);
        this.saveFinishedButton = class05362.method_46430((class00392)class00392.y((String)"Done"), class053622 -> yACLScreen.finishOrSave()).N((Integer)mutableDimension.x() - (Integer)mutableDimension.width() / 2, ((Integer)mutableDimension.y()).intValue()).y(((Integer)mutableDimension.width()).intValue(), ((Integer)mutableDimension.height()).intValue()).N();
        mutableDimension.expand((Number)(-((Integer)mutableDimension.width()).intValue() / 2 - 2), (Number)0).move((Number)(-((Integer)mutableDimension.width()).intValue() / 2 - 2), (Number)-22);
        this.cancelResetButton = class05362.method_46430((class00392)class00392.y((String)"Cancel"), class053622 -> yACLScreen.cancelOrReset()).N((Integer)mutableDimension.x() - (Integer)mutableDimension.width() / 2, ((Integer)mutableDimension.y()).intValue()).y(((Integer)mutableDimension.width()).intValue(), ((Integer)mutableDimension.height()).intValue()).N();
        mutableDimension.move((Number)((Integer)mutableDimension.width() + 4), (Number)0);
        this.undoButton = class05362.method_46430((class00392)class00392.L((String)"yacl.gui.undo"), class053622 -> yACLScreen.undo()).N((Integer)mutableDimension.x() - (Integer)mutableDimension.width() / 2, ((Integer)mutableDimension.y()).intValue()).y(((Integer)mutableDimension.width()).intValue(), ((Integer)mutableDimension.height()).intValue()).N(class04141.N((class00392)class00392.L((String)"yacl.gui.undo.tooltip"))).N();
        this.searchField = new SearchFieldWidget(yACLScreen, YACLScreen.access$000(yACLScreen), yACLScreen.field_22789 / 3 * 2 + yACLScreen.field_22789 / 6 - n3 / 2 + 1, this.undoButton.method_46427() - 22, n3 - 2, 18, (class00392)class00392.L((String)"gui.recipebook.search_hint"), (class00392)class00392.L((String)"gui.recipebook.search_hint"), string -> this.optionList.getType().updateSearchQuery((String)string));
        this.optionList = YACLSelectionList.asWidget(new OptionListWidget(yACLScreen, configCategory, YACLScreen.access$100(yACLScreen), 0, 0, yACLScreen.field_22789 / 3 * 2 + 1, yACLScreen.field_22790, descriptionWithName -> this.descriptionWidget.setOptionDescription((DescriptionWithName)((Object)descriptionWithName))));
        this.descriptionWidget = new OptionDescriptionWidget(() -> new class03255(yACLScreen.field_22789 / 3 * 2 + n2, class032552.y() + n2, n3, this.searchField.method_46427() - 1 - class032552.y() - n2 * 2), null);
        this.updateButtons();
    }

    @Override
    public class04141 getTooltip() {
        return this.tooltip;
    }

    @Override
    public void renderBackground(class01054 class010542) {
        GuiUtils.blitGuiTex(class010542, DARKER_BG, this.rightPaneDim.u(), this.rightPaneDim.y(), this.rightPaneDim.i() + 2, this.rightPaneDim.L() + 2, this.rightPaneDim.M() + 2, this.rightPaneDim.B() + 2, 32, 32);
        GuiUtils.pushPose(class010542);
        GuiUtils.translateZ(class010542, 10.0f);
        GuiUtils.blitGuiTex(class010542, class05213.field_49895, this.rightPaneDim.u() - 1, this.rightPaneDim.y() - 2, 0.0f, 0.0f, this.rightPaneDim.M() + 1, 2, 32, 2);
        GuiUtils.popPose(class010542);
        GuiUtils.pushPose(class010542);
        GuiUtils.translate2D(class010542, this.rightPaneDim.u(), this.rightPaneDim.y() - 1);
        GuiUtils.rotate2D(class010542, 90.0f);
        GuiUtils.blitGuiTex(class010542, class05213.field_49896, 0, 0, 0.0f, 0.0f, this.rightPaneDim.B() + 1, 2, 32, 2);
        GuiUtils.popPose(class010542);
    }

    public void updateButtons() {
        boolean bl;
        this.undoButton.field_22763 = bl = this.screen.pendingChanges();
        this.saveFinishedButton.method_25355((class00392)(bl ? class00392.L((String)"yacl.gui.save") : GuiUtils.translatableFallback("yacl.gui.done", class05220.u)));
        this.saveFinishedButton.method_47400(class04141.N((class00392)(bl ? class00392.L((String)"yacl.gui.save.tooltip") : class00392.L((String)"yacl.gui.finished.tooltip"))));
        this.cancelResetButton.method_25355((class00392)(bl ? GuiUtils.translatableFallback("yacl.gui.cancel", class05220.i) : class00392.L((String)"controls.reset")));
        this.cancelResetButton.method_47400(class04141.N((class00392)(bl ? class00392.L((String)"yacl.gui.cancel.tooltip") : class00392.L((String)"yacl.gui.reset.tooltip"))));
    }
}

