/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.CustomTabProvider
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionEventListener$Event
 *  dev.isxander.yacl3.api.PlaceholderCategory
 *  dev.isxander.yacl3.api.YetAnotherConfigLib
 *  dev.isxander.yacl3.api.utils.OptionUtils
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 *  minecraft.class00392
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02118
 *  minecraft.class03241
 *  minecraft.class03255
 *  minecraft.class03271
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05482
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06541
 *  minecraft.class06613
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.CustomTabProvider;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.api.PlaceholderCategory;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.api.utils.OptionUtils;
import dev.isxander.yacl3.gui.OptionListWidget;
import dev.isxander.yacl3.gui.YACLScreen$CategoryTab;
import dev.isxander.yacl3.gui.YACLScreen$PlaceholderTab;
import dev.isxander.yacl3.gui.controllers.ControllerPopupWidget;
import dev.isxander.yacl3.gui.controllers.PopupControllerScreen;
import dev.isxander.yacl3.gui.tab.ScrollableNavigationBar;
import dev.isxander.yacl3.gui.tab.TabExt;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02118;
import minecraft.class03241;
import minecraft.class03255;
import minecraft.class03271;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05482;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06541;
import minecraft.class06613;

public class YACLScreen
extends class05096 {
    public final YetAnotherConfigLib config;
    private final class05096 parent;
    public final class03271 tabManager;
    public ScrollableNavigationBar tabNavigationBar;
    public class03255 tabArea;
    public class00392 saveButtonMessage;
    public class04141 saveButtonTooltipMessage;
    private int saveButtonMessageTime;
    private boolean pendingChanges;
    public ControllerPopupWidget<?> currentPopupController;
    public boolean popupControllerVisible;

    static /* synthetic */ class01590 access$000(YACLScreen yACLScreen) {
        return yACLScreen.field_22793;
    }

    static /* synthetic */ class06202 access$100(YACLScreen yACLScreen) {
        return yACLScreen.field_22787;
    }

    static /* synthetic */ class06202 access$200(YACLScreen yACLScreen) {
        return yACLScreen.field_22787;
    }

    static /* synthetic */ class06202 access$300(YACLScreen yACLScreen) {
        return yACLScreen.field_22787;
    }

    public YACLScreen(YetAnotherConfigLib yetAnotherConfigLib, class05096 class050962) {
        super(yetAnotherConfigLib.title());
        YACLScreen yACLScreen = this;
        Consumer<class06478> consumer = class064782 -> yACLScreen.method_37063((class04654)class064782);
        yACLScreen = this;
        this.tabManager = new class03271(consumer, class064782 -> yACLScreen.method_37066((class04654)class064782));
        this.currentPopupController = null;
        this.popupControllerVisible = false;
        this.config = yetAnotherConfigLib;
        this.parent = class050962;
        OptionUtils.forEachOptions((YetAnotherConfigLib)yetAnotherConfigLib, option2 -> option2.addEventListener((option, event) -> {
            if (event != OptionEventListener.Event.INITIAL) {
                this.onOptionChanged(option);
            }
        }));
    }

    public void method_25426() {
        int n;
        this.tabArea = new class03255(0, 23, this.field_22789, this.field_22790 - 24 + 1);
        int n2 = n = this.tabNavigationBar != null ? this.tabNavigationBar.getTabs().indexOf((Object)this.tabManager.N()) : 0;
        if (n == -1) {
            n = 0;
        }
        this.tabNavigationBar = new ScrollableNavigationBar(this.field_22789, this.tabManager, this.config.categories().stream().map(configCategory -> {
            if (configCategory instanceof CustomTabProvider) {
                CustomTabProvider customTabProvider = (CustomTabProvider)configCategory;
                return customTabProvider.createTab(this, this.tabArea);
            }
            if (configCategory instanceof PlaceholderCategory) {
                PlaceholderCategory placeholderCategory = (PlaceholderCategory)configCategory;
                return new YACLScreen$PlaceholderTab(placeholderCategory, this);
            }
            return new YACLScreen$CategoryTab(this, (ConfigCategory)configCategory, this.tabArea);
        }).toList());
        this.tabNavigationBar.method_48987(n, false);
        this.tabNavigationBar.method_49613();
        this.tabManager.N(this.tabArea);
        this.method_37063((class04654)this.tabNavigationBar);
        this.config.initConsumer().accept(this);
    }

    public boolean method_25422() {
        if (this.pendingChanges()) {
            this.setSaveButtonMessage((class00392)class00392.L((String)"yacl.gui.save_before_exit").N(class06541.field_1061), (class00392)class00392.L((String)"yacl.gui.save_before_exit.tooltip"));
            return false;
        }
        return true;
    }

    public void method_25393() {
        TabExt tabExt;
        class03241 class032412 = this.tabManager.N();
        if (class032412 instanceof TabExt) {
            tabExt = (TabExt)class032412;
            tabExt.tick();
        }
        if ((class032412 = this.tabManager.N()) instanceof YACLScreen$CategoryTab) {
            tabExt = (YACLScreen$CategoryTab)class032412;
            if (this.saveButtonMessage != null) {
                if (this.saveButtonMessageTime > 140) {
                    this.saveButtonMessage = null;
                    this.saveButtonTooltipMessage = null;
                    this.saveButtonMessageTime = 0;
                } else {
                    ++this.saveButtonMessageTime;
                    ((YACLScreen$CategoryTab)tabExt).saveFinishedButton.method_25355(this.saveButtonMessage);
                    if (this.saveButtonTooltipMessage != null) {
                        ((YACLScreen$CategoryTab)tabExt).saveFinishedButton.method_47400(this.saveButtonTooltipMessage);
                    }
                }
            }
        }
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        super.method_25420(class010542, n, n2, f);
        class03241 class032412 = this.tabManager.N();
        if (class032412 instanceof TabExt) {
            TabExt tabExt = (TabExt)class032412;
            tabExt.renderBackground(class010542);
        }
    }

    public void method_25419() {
        this.field_22787.N(this.parent);
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        return this.method_25399() != null && this.method_25397() && (class066132.v() == 0 || class066132.v() == 1) && this.method_25399().method_25403(class066132, d, d2);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (super.method_25402(class066132, bl)) {
            this.method_25398(true);
            return true;
        }
        return false;
    }

    public void undo() {
        OptionUtils.forEachOptions((YetAnotherConfigLib)this.config, Option::forgetPendingValue);
    }

    public void setSaveButtonMessage(class00392 class003922, class00392 class003923) {
        this.saveButtonMessage = class003922;
        this.saveButtonTooltipMessage = class04141.N((class00392)class003923);
        this.saveButtonMessageTime = 0;
    }

    public void addPopupControllerWidget(ControllerPopupWidget<?> controllerPopupWidget) {
        if (this.currentPopupController != null) {
            this.clearPopupControllerWidget();
        }
        this.currentPopupController = controllerPopupWidget;
        this.popupControllerVisible = true;
        OptionListWidget optionListWidget = null;
        class03241 class032412 = this.tabNavigationBar.getTabManager().N();
        if (class032412 instanceof YACLScreen$CategoryTab) {
            YACLScreen$CategoryTab yACLScreen$CategoryTab = (YACLScreen$CategoryTab)class032412;
            optionListWidget = yACLScreen$CategoryTab.optionList.getType();
        }
        if (optionListWidget != null) {
            this.field_22787.N((class05096)new PopupControllerScreen(this, controllerPopupWidget));
        }
    }

    public void clearPopupControllerWidget() {
        class05096 class050962 = (class05096)class06202.Nq().v_3;
        if (class050962 instanceof PopupControllerScreen) {
            PopupControllerScreen popupControllerScreen = (PopupControllerScreen)class050962;
            popupControllerScreen.method_25419();
        }
        this.popupControllerVisible = false;
        this.currentPopupController = null;
    }

    public static void renderMultilineTooltip(class01054 class010542, class01590 class015902, class05482 class054822, int n, int n2, int n3, int n4, int n5) {
        if (class054822.N() > 0) {
            int n6 = class054822.y();
            Objects.requireNonNull(class015902);
            int n7 = 9 + 1;
            int n8 = class054822.N() * n7 - 1;
            int n9 = n3 + 12;
            int n10 = n2 - n8 + 12;
            int n11 = n5 - (n9 + n8);
            int n12 = n10 - n8;
            int n13 = n10;
            if (n12 < 8) {
                n13 = n11 > n12 ? n9 : n10;
            }
            int n14 = Math.max(n - class054822.y() / 2 - 12, -6);
            int n15 = n14 + 12;
            int n16 = n13 - 12;
            GuiUtils.pushPose(class010542);
            class02118.N((class01054)class010542, (int)n15, (int)n16, (int)n6, (int)n8, null);
            GuiUtils.translateZ(class010542, 400.0f);
            class054822.N(class00937.field_62009, n15, n16, n7, class010542.B());
            GuiUtils.popPose(class010542);
        }
    }

    public void cancelOrReset() {
        if (this.pendingChanges()) {
            OptionUtils.forEachOptions((YetAnotherConfigLib)this.config, Option::forgetPendingValue);
            this.method_25419();
        } else {
            OptionUtils.forEachOptions((YetAnotherConfigLib)this.config, Option::requestSetDefault);
        }
    }

    public boolean pendingChanges() {
        return this.pendingChanges;
    }

    private void onOptionChanged(Option<?> option2) {
        this.pendingChanges = false;
        OptionUtils.consumeOptions((YetAnotherConfigLib)this.config, option -> {
            this.pendingChanges |= option.changed();
            return this.pendingChanges;
        });
        class03241 class032412 = this.tabManager.N();
        if (class032412 instanceof YACLScreen$CategoryTab) {
            YACLScreen$CategoryTab yACLScreen$CategoryTab = (YACLScreen$CategoryTab)class032412;
            yACLScreen$CategoryTab.updateButtons();
        }
    }

    public void finishOrSave() {
        this.saveButtonMessage = null;
        if (this.pendingChanges()) {
            HashSet hashSet = new HashSet();
            OptionUtils.forEachOptions((YetAnotherConfigLib)this.config, option -> {
                if (option.applyValue()) {
                    hashSet.addAll(option.flags());
                }
            });
            OptionUtils.forEachOptions((YetAnotherConfigLib)this.config, option -> {
                if (option.changed()) {
                    option.forgetPendingValue();
                    YACLConstants.LOGGER.error("Option '{}' value mismatch after applying! Reset to binding's getter.", (Object)option.name().getString());
                }
            });
            this.config.saveFunction().run();
            hashSet.forEach(optionFlag -> optionFlag.accept((Object)this.field_22787));
            this.pendingChanges = false;
            class03241 class032412 = this.tabManager.N();
            if (class032412 instanceof YACLScreen$CategoryTab) {
                YACLScreen$CategoryTab yACLScreen$CategoryTab = (YACLScreen$CategoryTab)class032412;
                yACLScreen$CategoryTab.updateButtons();
            }
        } else {
            this.method_25419();
        }
    }
}

