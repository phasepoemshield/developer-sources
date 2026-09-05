/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04631
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07536
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.config.ConfigManager
 *  net.caffeinemc.mods.sodium.client.config.structure.Config
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.config.structure.OptionPage
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.data.fingerprint.HashedFingerprint
 *  net.caffeinemc.mods.sodium.client.gui.SodiumOptions
 *  net.caffeinemc.mods.sodium.client.gui.prompt.ScreenPrompt
 *  net.caffeinemc.mods.sodium.client.gui.prompt.ScreenPrompt$Action
 *  net.caffeinemc.mods.sodium.client.gui.prompt.ScreenPromptable
 *  net.caffeinemc.mods.sodium.client.gui.widgets.FlatButtonWidget
 *  net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui;

import java.io.IOException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import me.flashyreese.mods.reeses_sodium_options.client.gui.SodiumVideoOptionsScreen$UiState;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.BasicFrame;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.BasicFrame$Builder;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components.SearchTextFieldComponent;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab.Tab;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab.TabFrame;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04631;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07536;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.config.ConfigManager;
import net.caffeinemc.mods.sodium.client.config.structure.Config;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.OptionPage;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.data.fingerprint.HashedFingerprint;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions;
import net.caffeinemc.mods.sodium.client.gui.prompt.ScreenPrompt;
import net.caffeinemc.mods.sodium.client.gui.prompt.ScreenPromptable;
import net.caffeinemc.mods.sodium.client.gui.widgets.FlatButtonWidget;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class SodiumVideoOptionsScreen
extends class05096
implements ScreenPromptable {
    private static final SodiumVideoOptionsScreen$UiState SHARED_UI_STATE = new SodiumVideoOptionsScreen$UiState();
    private static final List<class05936> DONATION_PROMPT_MESSAGE = List.of(class05936.N((class05936[])new class05936[]{class00392.y((String)"Hello!")}), class05936.N((class05936[])new class05936[]{class00392.y((String)"It seems that you've been enjoying "), class00392.y((String)"Sodium").y(2616210), class00392.y((String)", the free and open-source optimization mod for Minecraft.")}), class05936.N((class05936[])new class05936[]{class00392.y((String)"Mods like these are complex. They require "), class00392.y((String)"thousands of hours").y(16739840), class00392.y((String)" of development, debugging, and tuning to create the experience that players have come to expect.")}), class05936.N((class05936[])new class05936[]{class00392.y((String)"If you'd like to show your token of appreciation, and support the development of our mod in the process, then consider "), class00392.y((String)"buying us a coffee").y(15550926), class00392.y((String)".")}), class05936.N((class05936[])new class05936[]{class00392.y((String)"And thanks again for using our mod! We hope it helps you (and your computer.)")}));
    private final class05096 prevScreen;
    private final SodiumVideoOptionsScreen$UiState uiState;
    private final List<OptionPage> pages = new ArrayList<OptionPage>();
    private FlatButtonWidget applyButton;
    private FlatButtonWidget closeButton;
    private FlatButtonWidget undoButton;
    private FlatButtonWidget donateButton;
    private FlatButtonWidget hideDonateButton;
    private boolean hasPendingChanges;
    private SearchTextFieldComponent searchTextField;
    private ScreenPrompt prompt;

    public SodiumVideoOptionsScreen(class05096 class050962) {
        super((class00392)class00392.y((String)"Reese's Sodium Menu"));
        this.prevScreen = class050962;
        this.uiState = SHARED_UI_STATE;
        this.checkPromptTimers();
        ConfigManager.CONFIG.resetAllOptionsFromBindings();
    }

    public Dim2i getDimensions() {
        return new Dim2i(0, 0, this.field_22789, this.field_22790);
    }

    public void method_25426() {
        super.method_25426();
        ConfigManager.CONFIG.invalidateGlobalRebuildDependents();
        BasicFrame basicFrame = this.parentFrameBuilder().build();
        this.method_37063((class04654)basicFrame);
        if (this.searchTextField.method_25370()) {
            this.method_25395((class04654)this.searchTextField);
        } else {
            this.method_25395((class04654)basicFrame);
        }
        if (this.prompt != null) {
            this.prompt.init();
        }
    }

    public boolean method_25422() {
        return !this.hasPendingChanges;
    }

    public boolean method_25404(class06601 class066012) {
        if (this.prompt != null) {
            return this.prompt.method_25404(class066012);
        }
        if (!(class066012.v() != 80 || (class066012.y() & 1) == 0 || this.searchTextField != null && this.searchTextField.method_25370())) {
            class06202.Nq().N((class05096)new class04631(this.prevScreen, class06202.Nq(), (class05630)class06202.Nq().i_7));
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.updateControls();
        super.method_25394(class010542, this.prompt != null ? -1 : n, this.prompt != null ? -1 : n2, f);
        if (this.prompt != null) {
            this.prompt.method_25394(class010542, n, n2, f);
        }
    }

    public void method_25419() {
        this.uiState.lastSearch().set("");
        this.uiState.lastSearchIndex().set(0);
        this.field_22787.N(this.prevScreen);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.prompt != null) {
            return this.prompt.method_25402(class066132, bl);
        }
        return super.method_25402(class066132, bl);
    }

    public void rebuildUI() {
        boolean bl = this.searchTextField.method_25370();
        this.method_41843();
        if (bl) {
            this.method_25395((class04654)this.searchTextField);
        }
    }

    public ScreenPrompt getPrompt() {
        return this.prompt;
    }

    public void setPrompt(ScreenPrompt screenPrompt) {
        this.prompt = screenPrompt;
    }

    private void setDonationButtonVisibility(boolean bl) {
        this.donateButton.setVisible(bl);
        this.hideDonateButton.setVisible(bl);
    }

    private void hideDonationButton() {
        SodiumOptions sodiumOptions = SodiumClientMod.options();
        sodiumOptions.notifications.hasClearedDonationButton = true;
        try {
            SodiumOptions.writeToDisk((SodiumOptions)sodiumOptions);
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to save configuration", iOException);
        }
        this.setDonationButtonVisibility(false);
        this.rebuildUI();
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
        ScreenPrompt screenPrompt = new ScreenPrompt((ScreenPromptable)this, DONATION_PROMPT_MESSAGE, 320, 190, new ScreenPrompt.Action((class00392)class00392.y((String)"Buy us a coffee"), this::openDonationPage));
        screenPrompt.method_25365(true);
        sodiumOptions.notifications.hasSeenDonationPrompt = true;
        try {
            SodiumOptions.writeToDisk((SodiumOptions)sodiumOptions);
        }
        catch (IOException iOException) {
            SodiumClientMod.logger().error("Failed to update config file", (Throwable)iOException);
        }
    }

    public static SodiumVideoOptionsScreen$UiState sharedUiState() {
        return SHARED_UI_STATE;
    }

    private void updateControls() {
        boolean bl = ConfigManager.CONFIG.anyOptionChanged();
        this.applyButton.setEnabled(bl);
        this.undoButton.setVisible(bl);
        this.closeButton.setEnabled(!bl);
        this.hasPendingChanges = bl;
    }

    private void openDonationPage() {
        class07536.m().N("https://caffeinemc.net/donate");
    }

    protected BasicFrame$Builder parentFrameBuilder() {
        Dim2i dim2i2;
        int n = this.field_22789;
        if ((double)((float)this.field_22789 / (float)this.field_22790) > 1.77777777778) {
            n = (int)((double)this.field_22790 * 1.77777777778);
        }
        Dim2i dim2i3 = new Dim2i((this.field_22789 - n) / 2, 0, n, this.field_22790);
        Dim2i dim2i4 = new Dim2i(dim2i3.x() + dim2i3.width() / 20 / 2, dim2i3.y() + dim2i3.height() / 4 / 2, dim2i3.width() - dim2i3.width() / 20, dim2i3.height() / 4 * 3);
        Dim2i dim2i5 = new Dim2i(dim2i4.getLimitX() - 203, dim2i4.getLimitY() + 5, 65, 20);
        Dim2i dim2i6 = new Dim2i(dim2i4.getLimitX() - 134, dim2i4.getLimitY() + 5, 65, 20);
        Dim2i dim2i7 = new Dim2i(dim2i4.getLimitX() - 65, dim2i4.getLimitY() + 5, 65, 20);
        class05216 class052162 = class00392.L((String)"sodium.options.buttons.donate");
        int n2 = ((class01590)this.field_22787.i_3).N((class05936)class052162);
        Dim2i dim2i8 = new Dim2i(dim2i4.getLimitX() - 32 - n2, dim2i4.y() - 26, 10 + n2, 20);
        Dim2i dim2i9 = new Dim2i(dim2i4.getLimitX() - 20, dim2i4.y() - 26, 20, 20);
        this.undoButton = new FlatButtonWidget(dim2i5, (class00392)class00392.L((String)"sodium.options.buttons.undo"), () -> ((Config)ConfigManager.CONFIG).resetAllOptionsFromBindings(), true, false);
        this.applyButton = new FlatButtonWidget(dim2i6, (class00392)class00392.L((String)"sodium.options.buttons.apply"), () -> ((Config)ConfigManager.CONFIG).applyAllOptions(), true, false);
        this.closeButton = new FlatButtonWidget(dim2i7, (class00392)class00392.L((String)"gui.done"), this::method_25419, true, false);
        this.donateButton = new FlatButtonWidget(dim2i8, (class00392)class052162, this::openDonationPage, true, false);
        this.hideDonateButton = new FlatButtonWidget(dim2i9, (class00392)class00392.y((String)"x"), this::hideDonationButton, true, false);
        if (SodiumClientMod.options().notifications.hasClearedDonationButton) {
            this.setDonationButtonVisibility(false);
        }
        BasicFrame$Builder basicFrame$Builder = this.parentBasicFrameBuilder(dim2i3, dim2i4);
        if (SodiumClientMod.options().notifications.hasClearedDonationButton) {
            dim2i2 = new Dim2i(dim2i4.x(), dim2i4.y() - 26, dim2i4.width(), 20);
        } else {
            dim2i2 = new Dim2i(dim2i4.x(), dim2i4.y() - 26, dim2i4.width() - (dim2i4.getLimitX() - dim2i8.x()) - 2, 20);
            basicFrame$Builder.addChild(dim2i -> this.donateButton).addChild(dim2i -> this.hideDonateButton);
        }
        this.searchTextField = new SearchTextFieldComponent(dim2i2, ConfigManager.CONFIG.getModOptions().stream().flatMap(modOptions -> modOptions.pages().stream()).toList(), this.uiState, dim2i4.height(), this);
        basicFrame$Builder.addChild(dim2i -> this.searchTextField);
        return basicFrame$Builder;
    }

    public BasicFrame$Builder parentBasicFrameBuilder(Dim2i dim2i3, Dim2i dim2i4) {
        return BasicFrame.builder().withDimension(dim2i3).withRenderOutline(false).withScreen(this).addChild(dim2i2 -> TabFrame.createBuilder().setDimension(dim2i4).withScreen(this).shouldRenderOutline(false).setTabSectionScrollBarOffset(this.uiState.tabFrameScrollBarOffset()).setTabSectionSelectedTab(this.uiState.tabFrameSelectedTab()).addTabs(list -> ConfigManager.CONFIG.getModOptions().forEach(modOptions -> modOptions.pages().forEach(page -> list.add(Tab.builder().from(this, (ModOptions)modOptions, (Page)page, this.uiState.optionPageScrollBarOffset()))))).onSetTab(() -> this.uiState.optionPageScrollBarOffset().set(0)).build()).addChild(dim2i -> this.undoButton).addChild(dim2i -> this.applyButton).addChild(dim2i -> this.closeButton);
    }
}

