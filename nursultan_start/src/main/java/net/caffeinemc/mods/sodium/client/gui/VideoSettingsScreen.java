/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.SodiumVideoOptionsScreen
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class01894
 *  minecraft.class04631
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07536
 *  minecraft.class08394
 *  minecraft.class08918
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.config.ConfigManager
 *  net.caffeinemc.mods.sodium.client.config.structure.Config
 *  net.caffeinemc.mods.sodium.client.config.structure.IntegerOption
 *  net.caffeinemc.mods.sodium.client.config.structure.Option
 *  net.caffeinemc.mods.sodium.client.config.structure.Option$OptionNameSource
 *  net.caffeinemc.mods.sodium.client.config.structure.OptionPage
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.data.fingerprint.HashedFingerprint
 *  net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget
 *  net.caffeinemc.mods.sodium.client.gui.widgets.ScrollableTooltip
 *  net.caffeinemc.mods.sodium.client.gui.widgets.ScrollableTooltip$TooltipParent
 *  net.caffeinemc.mods.sodium.client.gui.widgets.SearchWidget
 *  net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.compat.sodium.config.IrisConfig
 *  org.jspecify.annotations.NonNull
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.caffeinemc.mods.sodium.client.gui;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.io.IOException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;
import me.flashyreese.mods.reeses_sodium_options.client.gui.SodiumVideoOptionsScreen;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class01894;
import minecraft.class04631;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07536;
import minecraft.class08394;
import minecraft.class08918;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.config.ConfigManager;
import net.caffeinemc.mods.sodium.client.config.structure.Config;
import net.caffeinemc.mods.sodium.client.config.structure.IntegerOption;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.structure.OptionPage;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.data.fingerprint.HashedFingerprint;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.gui.prompt.ScreenPrompt;
import net.caffeinemc.mods.sodium.client.gui.prompt.ScreenPrompt$Action;
import net.caffeinemc.mods.sodium.client.gui.prompt.ScreenPromptable;
import net.caffeinemc.mods.sodium.client.gui.screen.ConfigCorruptedScreen;
import net.caffeinemc.mods.sodium.client.gui.widgets.DonationButtonWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.KeyBoundButtonWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.OptionListWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.ScrollableTooltip;
import net.caffeinemc.mods.sodium.client.gui.widgets.SearchWidget;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.compat.sodium.config.IrisConfig;
import org.jspecify.annotations.NonNull;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VideoSettingsScreen
extends class05096
implements ScreenPromptable,
ScrollableTooltip.TooltipParent {
    private final class05096 prevScreen;
    private final OptionPage initiallyFocusedPage;
    private Dim2i dim;
    private boolean insetX;
    private boolean insetY;
    private PageListWidget pageList;
    private SearchWidget searchWidget;
    private OptionListWidget optionList;
    private KeyBoundButtonWidget applyButton;
    private KeyBoundButtonWidget closeButton;
    private KeyBoundButtonWidget undoButton;
    private List<KeyBoundButtonWidget> shortcutButtons = List.of();
    private DonationButtonWidget donateButton;
    private boolean hasPendingChanges;
    private final ScrollableTooltip tooltip = new ScrollableTooltip((ScrollableTooltip.TooltipParent)this);
    private ScreenPrompt prompt;
    private static final List<class05936> DONATION_PROMPT_MESSAGE = List.of(class05936.N((class05936[])new class05936[]{class00392.y((String)"Hello!")}), class05936.N((class05936[])new class05936[]{class00392.y((String)"It seems that you've been enjoying "), class00392.y((String)"Sodium").y(2616210), class00392.y((String)", the powerful and open rendering optimization mod for Minecraft.")}), class05936.N((class05936[])new class05936[]{class00392.y((String)"Mods like these are complex. They require "), class00392.y((String)"thousands of hours").y(16739840), class00392.y((String)" of development, debugging, and tuning to create the experience that players have come to expect.")}), class05936.N((class05936[])new class05936[]{class00392.y((String)"If you'd like to show your token of appreciation, and support the development of our mod in the process, then consider "), class00392.y((String)"buying us a coffee").y(15550926), class00392.y((String)".")}), class05936.N((class05936[])new class05936[]{class00392.y((String)"And thanks again for using our mod! We hope it helps you (and your computer.)")}));

    private VideoSettingsScreen(class05096 class050962) {
        this(class050962, null);
    }

    private VideoSettingsScreen(class05096 class050962, OptionPage optionPage) {
        super((class00392)class00392.y((String)"Sodium Renderer Settings"));
        this.prevScreen = class050962;
        this.initiallyFocusedPage = optionPage;
        this.checkPromptTimers();
        ConfigManager.CONFIG.resetAllOptionsFromBindings();
    }

    @Override
    public Dim2i getDimensions() {
        return this.dim;
    }

    public void method_25426() {
        super.method_25426();
        ConfigManager.CONFIG.invalidateGlobalRebuildDependents();
        this.rebuild();
        if (this.prompt != null) {
            this.prompt.init();
        }
        if (this.initiallyFocusedPage != null) {
            this.jumpToPage((Page)this.initiallyFocusedPage);
            this.onSectionFocused((Page)this.initiallyFocusedPage);
        }
        this.handler$cjk001$reeses-sodium-options$postInit(null);
    }

    public List<? extends class04654> method_25396() {
        return this.prompt == null ? super.method_25396() : this.prompt.getWidgets();
    }

    public boolean method_25422() {
        return !this.hasPendingChanges;
    }

    public <T extends class04654 & class01294> T method_37063(T t) {
        return (T)super.method_37063(t);
    }

    public boolean method_25404(class06601 class066012) {
        if (this.prompt != null && this.prompt.method_25404(class066012)) {
            return true;
        }
        if (this.searchWidget.method_25404(class066012)) {
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_37066(class04654 class046542) {
        super.method_37066(class046542);
    }

    public void method_25394(@NonNull class01054 class010542, int n, int n2, float f) {
        this.updateControls(n, n2);
        super.method_25394(class010542, this.prompt != null ? -1 : n, this.prompt != null ? -1 : n2, f);
        if (this.prompt != null) {
            this.prompt.method_25394(class010542, n, n2, f);
        } else {
            this.tooltip.render(class010542);
        }
    }

    public void method_25419() {
        this.field_22787.N(this.prevScreen);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (class06202.Nq().s()) {
            IntegerOption integerOption;
            Object object;
            class01894 class018942 = class01894.N((String)"sodium:general.gui_scale");
            Option option = ConfigManager.CONFIG.getOption(class018942);
            if (option instanceof IntegerOption && (object = (integerOption = (IntegerOption)option).getValidatedValue()) instanceof Integer) {
                int n;
                Integer n2 = (Integer)object;
                object = integerOption.getSteppedValidator();
                int n3 = object.max() + 1;
                int n4 = object.min();
                if (n2 == n4) {
                    n2 = n3;
                }
                if ((n = Math.clamp((long)(n2 + (int)Math.signum(d4)), (int)(n4 + 1), (int)n3)) != n2) {
                    if (n == n3) {
                        n = n4;
                    }
                    if (object.isValueValid(n)) {
                        integerOption.modifyValue((Object)n);
                        ConfigManager.CONFIG.applyOption(class018942);
                        return true;
                    }
                }
            }
            return false;
        }
        if (this.tooltip.mouseScrolled(d, d2, d4)) {
            return true;
        }
        return super.method_25401(d, d2, d3, d4);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.prompt != null) {
            return this.prompt.method_25402(class066132, bl);
        }
        if (!super.method_25402(class066132, bl)) {
            if (!this.searchWidget.method_25370()) {
                this.method_25395((class04654)this.searchWidget);
                return true;
            }
            this.method_25395(null);
            return true;
        }
        return true;
    }

    public boolean method_16803(class06601 class066012) {
        if (this.prompt == null && !this.searchWidget.isSearching()) {
            if (class066012.v() == 80 && (class066012.y() & 1) != 0) {
                class06202.Nq().N((class05096)new class04631(this.prevScreen, class06202.Nq(), (class05630)class06202.Nq().i_7));
                return true;
            }
            if (class066012.v() == 84) {
                this.method_25395((class04654)this.searchWidget);
                return true;
            }
        }
        for (KeyBoundButtonWidget keyBoundButtonWidget : this.shortcutButtons) {
            if (!keyBoundButtonWidget.tryActivateShortcut(class066012)) continue;
            return true;
        }
        if (class066012.v() == 256) {
            if (this.hasPendingChanges) {
                this.undoChanges();
            }
            this.method_25419();
        }
        return super.method_16803(class066012);
    }

    private static void wrapOperation$bjc000$iris$makeColor(class01054 class010542, RenderPipeline renderPipeline, class01894 class018942, int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, Operation operation) {
        boolean bl = false;
        class01894 class018943 = class018942;
        if (class018942.y().equals("iris") && Iris.getCurrentPack().isPresent()) {
            class018943 = IrisConfig.COLOR;
            bl = true;
        }
        operation.call(new Object[]{class010542, renderPipeline, class018943, n, n2, Float.valueOf(f), Float.valueOf(f2), n3, n4, n5, n6, n7, n8, bl ? -1 : n9});
    }

    private int ifNotInsetX(int n) {
        return this.insetX ? 0 : n;
    }

    private void onSearchResults(List<Option.OptionNameSource> list) {
        if (list.isEmpty()) {
            this.optionList.clearFilter();
        } else {
            this.optionList.setFilteredOptions(list);
        }
        this.optionList.rebuild(this);
    }

    private void onSectionFocused(Page page) {
        this.pageList.switchSelected(page);
    }

    public <T extends class04654 & class01294> void setWidgetPresence(T t, boolean bl) {
        this.method_37066(t);
        if (bl) {
            this.method_37063(t);
        }
    }

    private int ifNotInsetY(int n) {
        return this.insetY ? 0 : n;
    }

    private void undoChanges() {
        ConfigManager.CONFIG.resetAllOptionsFromBindings();
    }

    private void updateScreenDimensions() {
        int n = 355;
        int n2 = n + 50 + 100;
        int n3 = n + 200;
        int n4 = 100;
        int n5 = n2 + 100;
        int n6 = n3 + n4;
        int n7 = this.field_22789;
        this.insetX = false;
        if (this.field_22789 > n2 + 100) {
            if (this.field_22789 < n6) {
                float f = (float)(this.field_22789 - n5) / (float)(n6 - n5);
                n7 = n2 + (int)(f * (float)(n3 - n2));
            } else {
                n7 = n3;
            }
            this.insetX = true;
        }
        int n8 = this.field_22790;
        this.insetY = false;
        if (this.field_22790 > 312 && this.insetX) {
            n8 = this.field_22790 - 12;
            this.insetY = true;
        }
        this.dim = new Dim2i((this.field_22789 - n7) / 2, (this.field_22790 - n8) / 2, n7, n8);
    }

    private void updateSearchWidgetWidth() {
        this.searchWidget.updateWidgetWidth(this.getWidth() - this.donateButton.getWidth());
    }

    private void rebuildActionButtons(boolean bl) {
        int n = 65;
        int n2 = 20;
        int n3 = this.getLimitX() - n - this.ifNotInsetX(5);
        int n4 = this.getLimitY() - (this.ifNotInsetY(5) + n2);
        int n5 = bl ? 0 : -(5 + n);
        int n6 = bl ? -(5 + n2) : 0;
        int n7 = n3 + n5;
        int n8 = bl ? n4 + n6 : this.getLimitY() - (5 + n2);
        this.closeButton = new KeyBoundButtonWidget(new Dim2i(n3, n4, n, n2), (class00392)class00392.L((String)"gui.done"), this::method_25419, true, false, 68);
        this.applyButton = new KeyBoundButtonWidget(new Dim2i(n7, n8, n, n2), (class00392)class00392.L((String)"sodium.options.buttons.apply"), () -> ((Config)ConfigManager.CONFIG).applyAllOptions(), true, false, 65);
        this.undoButton = new KeyBoundButtonWidget(new Dim2i(n7 + n5, n8 + n6, n, n2), (class00392)class00392.L((String)"sodium.options.buttons.undo"), this::undoChanges, true, false, 85);
        this.method_37063(this.closeButton);
        this.method_37063(this.undoButton);
        this.method_37063(this.applyButton);
        this.shortcutButtons = List.of(this.closeButton, this.applyButton, this.undoButton);
    }

    private int ifInsetY(int n) {
        return this.insetY ? n : 0;
    }

    private int ifInsetX(int n) {
        return this.insetX ? n : 0;
    }

    public void jumpToPage(Page page) {
        if (this.optionList != null) {
            this.optionList.jumpToPage(page);
        }
    }

    private void rebuild() {
        this.method_37067();
        this.updateScreenDimensions();
        int n = this.getX();
        int n2 = this.getY();
        int n3 = this.getWidth();
        int n4 = this.getHeight();
        int n5 = 20;
        this.searchWidget = new SearchWidget(this::onSearchResults, new Dim2i(n, n2, n3, n5));
        int n6 = n5 + this.ifInsetY(5);
        this.pageList = new PageListWidget(new Dim2i(n, n2 + n6, 125, n4 - n6), this);
        this.method_37063(this.pageList);
        boolean bl = false;
        boolean bl2 = false;
        int n7 = 422;
        int n8 = n7 + 130 + 5;
        if (n3 > n7 && n3 < n8) {
            bl = true;
        } else if (n3 < n7) {
            bl2 = true;
        }
        this.rebuildActionButtons(bl);
        this.donateButton = new DonationButtonWidget(this, this::openDonationPage, this::hideDonationButton);
        this.method_37063(this.searchWidget);
        this.updateSearchWidgetWidth();
        Dim2i dim2i = new Dim2i(this.pageList.getLimitX(), n2 + n5 + 5, 222, n4 - n5 - (bl2 ? 30 : 5) - this.ifNotInsetY(5));
        this.optionList = new OptionListWidget(this, dim2i, this::onSectionFocused);
        this.method_37063(this.optionList);
        int n9 = n2 + n5 + this.ifInsetY(3);
        this.tooltip.setTooltipArea(new Dim2i(this.optionList.getLimitX(), n9, this.getLimitX() - this.optionList.getLimitX() - this.ifNotInsetX(3), this.getLimitY() - n9 - this.ifNotInsetY(3)));
    }

    public static class05096 createScreen(class05096 class050962) {
        return VideoSettingsScreen.createScreen(class050962, null);
    }

    public static class05096 createScreen(class05096 class050962, OptionPage optionPage) {
        if (SodiumClientMod.options().isReadOnly()) {
            return new ConfigCorruptedScreen(class050962, VideoSettingsScreen::new);
        }
        return new VideoSettingsScreen(class050962, optionPage);
    }

    public void handler$cjk001$reeses-sodium-options$postInit(CallbackInfo callbackInfo) {
        this.field_22787.N((class05096)new SodiumVideoOptionsScreen(this.prevScreen));
    }

    @Override
    public ScreenPrompt getPrompt() {
        return this.prompt;
    }

    @Override
    public void setPrompt(ScreenPrompt screenPrompt) {
        this.prompt = screenPrompt;
    }

    private void hideDonationButton() {
        SodiumOptions sodiumOptions = SodiumClientMod.options();
        sodiumOptions.notifications.hasClearedDonationButton = true;
        try {
            SodiumOptions.writeToDisk(sodiumOptions);
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to save configuration", iOException);
        }
        this.donateButton.updateDisplay(this, false);
        this.updateSearchWidgetWidth();
    }

    private void checkPromptTimers() {
        Instant instant;
        if (PlatformRuntimeInformation.getInstance().isDevelopmentEnvironment()) {
            return;
        }
        SodiumOptions sodiumOptions = SodiumClientMod.options();
        if (sodiumOptions.notifications.hasSeenDonationPrompt) {
            return;
        }
        HashedFingerprint hashedFingerprint = null;
        try {
            hashedFingerprint = HashedFingerprint.loadFromDisk();
        }
        catch (Throwable throwable) {
            SodiumClientMod.logger().error("Failed to read the fingerprint from disk", throwable);
        }
        if (hashedFingerprint == null) {
            return;
        }
        Instant instant2 = Instant.now();
        if (instant2.isAfter(instant = Instant.ofEpochSecond(hashedFingerprint.timestamp()).plus(3L, ChronoUnit.DAYS))) {
            this.openDonationPrompt(sodiumOptions);
        }
    }

    private void openDonationPrompt(SodiumOptions sodiumOptions) {
        ScreenPrompt screenPrompt = new ScreenPrompt(this, DONATION_PROMPT_MESSAGE, 320, 190, new ScreenPrompt$Action((class00392)class00392.y((String)"Buy us a coffee"), this::openDonationPage));
        screenPrompt.method_25365(true);
        sodiumOptions.notifications.hasSeenDonationPrompt = true;
        try {
            SodiumOptions.writeToDisk(sodiumOptions);
        }
        catch (IOException iOException) {
            SodiumClientMod.logger().error("Failed to update config file", (Throwable)iOException);
        }
    }

    private void updateControls(int n, int n2) {
        boolean bl = ConfigManager.CONFIG.anyOptionChanged();
        this.applyButton.setEnabled(bl);
        this.undoButton.setVisible(bl);
        this.closeButton.setEnabled(!bl);
        KeyBoundButtonWidget keyBoundButtonWidget = bl ? this.undoButton : this.applyButton;
        this.tooltip.setReservedAreaTopLeftCorner(keyBoundButtonWidget.getX(), keyBoundButtonWidget.getY());
        this.hasPendingChanges = bl;
        Object object = null;
        Object object2 = null;
        if (n >= this.optionList.getX() && n <= this.optionList.getLimitX() && n2 >= this.optionList.getY() && n2 <= this.optionList.getLimitY()) {
            for (ControlElement controlElement : this.optionList.getControls()) {
                if (controlElement.method_25405(n, n2)) {
                    object = controlElement;
                    break;
                }
                if (!controlElement.method_25370()) continue;
                object2 = controlElement;
            }
        }
        Iterator<ControlElement> iterator = object != null ? object : object2;
        this.tooltip.onControlHover(iterator, n, n2);
    }

    private void openDonationPage() {
        class07536.m().N("https://caffeinemc.net/donate");
    }

    public static int renderIconWithSpacing(class01054 class010542, class01894 class018942, int n, boolean bl, int n2, int n3, int n4, int n5) {
        int n6 = n4 - n5 * 2;
        class08918 class089182 = class06202.Nq().NO().y(class018942);
        int n7 = class089182.method_68004().getWidth(0);
        int n8 = class089182.method_68004().getHeight(0);
        n2 += n5;
        n3 = n3 + n4 / 2 - n6 / 2;
        if (bl) {
            int n9 = n;
            int n10 = n8;
            int n11 = n7;
            int n12 = n8;
            int n13 = n7;
            int n14 = n6;
            int n15 = n6;
            float f = 0.0f;
            float f2 = 0.0f;
            int n16 = n3;
            int n17 = n2;
            class01894 class018943 = class018942;
            RenderPipeline renderPipeline = class08394.Na;
            class01054 class010543 = class010542;
            VideoSettingsScreen.wrapOperation$bjc000$iris$makeColor(class010543, renderPipeline, class018943, n17, n16, f2, f, n15, n14, n13, n12, n11, n10, n9, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)14, (String)"[net.minecraft.class_332, com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.class_2960, int, int, float, float, int, int, int, int, int, int, int]");
                Object[] objectArray2 = objectArray;
                ((class01054)objectArray[0]).N((RenderPipeline)objectArray2[1], (class01894)objectArray2[2], ((Integer)objectArray2[3]).intValue(), ((Integer)objectArray2[4]).intValue(), ((Float)objectArray2[5]).floatValue(), ((Float)objectArray2[6]).floatValue(), ((Integer)objectArray2[7]).intValue(), ((Integer)objectArray2[8]).intValue(), ((Integer)objectArray2[9]).intValue(), ((Integer)objectArray2[10]).intValue(), ((Integer)objectArray2[11]).intValue(), ((Integer)objectArray2[12]).intValue(), ((Integer)objectArray2[13]).intValue());
                return null;
            });
        } else {
            class010542.N(class08394.Na, class018942, n2, n3, 0.0f, 0.0f, n6, n6, n7, n8, n7, n8);
        }
        return n5 * 2 + n6;
    }
}

