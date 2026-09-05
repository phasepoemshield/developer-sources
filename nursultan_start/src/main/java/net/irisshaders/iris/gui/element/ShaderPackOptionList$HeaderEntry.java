/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03249
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05194
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06613
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.gui.element;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.List;
import java.util.Properties;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03249;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05194;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06613;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.FileDialogUtil;
import net.irisshaders.iris.gui.FileDialogUtil$DialogType;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.GuiUtil$Icon;
import net.irisshaders.iris.gui.NavigationController;
import net.irisshaders.iris.gui.element.IrisElementRow;
import net.irisshaders.iris.gui.element.IrisElementRow$IconButtonElement;
import net.irisshaders.iris.gui.element.IrisElementRow$TextButtonElement;
import net.irisshaders.iris.gui.element.ShaderPackOptionList;
import net.irisshaders.iris.gui.element.ShaderPackOptionList$BaseEntry;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;

public class ShaderPackOptionList$HeaderEntry
extends ShaderPackOptionList$BaseEntry {
    public static final class00392 BACK_BUTTON_TEXT = class00392.y((String)"< ").y((class00392)class00392.L((String)"options.iris.back").N(class06541.field_1056));
    public static final class05216 RESET_BUTTON_TEXT_INACTIVE = class00392.L((String)"options.iris.reset").N(class06541.field_1080);
    public static final class05216 RESET_BUTTON_TEXT_ACTIVE = class00392.L((String)"options.iris.reset").N(class06541.field_1054);
    public static final class05216 RESET_HOLD_SHIFT_TOOLTIP = class00392.L((String)"options.iris.reset.tooltip.holdShift").N(class06541.field_1065);
    public static final class05216 RESET_TOOLTIP = class00392.L((String)"options.iris.reset.tooltip").N(class06541.field_1061);
    public static final class05216 IMPORT_TOOLTIP = class00392.L((String)"options.iris.importSettings.tooltip").N(class004052 -> class004052.N(class05194.N((int)-11688193)));
    public static final class05216 EXPORT_TOOLTIP = class00392.L((String)"options.iris.exportSettings.tooltip").N(class004052 -> class004052.N(class05194.N((int)-230083)));
    private static final int MIN_SIDE_BUTTON_WIDTH = 42;
    private static final int BUTTON_HEIGHT = 16;
    private final ShaderPackScreen screen;
    private final IrisElementRow backButton;
    private final IrisElementRow utilityButtons = new IrisElementRow();
    private final IrisElementRow$TextButtonElement resetButton;
    private final IrisElementRow$IconButtonElement importButton;
    private final IrisElementRow$IconButtonElement exportButton;
    private final class00392 text;

    public ShaderPackOptionList$HeaderEntry(ShaderPackOptionList shaderPackOptionList, ShaderPackScreen shaderPackScreen, NavigationController navigationController, class00392 class003922, boolean bl) {
        super(navigationController);
        this.backButton = bl ? new IrisElementRow().add(new IrisElementRow$TextButtonElement(BACK_BUTTON_TEXT, this::backButtonClicked), Math.max(42, ((class01590)class06202.Nq().i_3).N((class05936)BACK_BUTTON_TEXT) + 8)) : null;
        this.resetButton = new IrisElementRow$TextButtonElement((class00392)RESET_BUTTON_TEXT_INACTIVE, this::resetButtonClicked);
        this.importButton = new IrisElementRow$IconButtonElement(GuiUtil$Icon.IMPORT, GuiUtil$Icon.IMPORT_COLORED, this::importSettingsButtonClicked);
        this.exportButton = new IrisElementRow$IconButtonElement(GuiUtil$Icon.EXPORT, GuiUtil$Icon.EXPORT_COLORED, this::exportSettingsButtonClicked);
        this.utilityButtons.add(this.importButton, 15).add(this.exportButton, 15).add(this.resetButton, Math.max(42, ((class01590)class06202.Nq().i_3).N((class05936)RESET_BUTTON_TEXT_INACTIVE) + 8));
        this.screen = shaderPackScreen;
        this.text = class003922;
    }

    public List<? extends class04654> method_25396() {
        if (this.backButton != null) {
            return ImmutableList.copyOf((Iterable)Iterables.concat(this.utilityButtons.children(), this.backButton.children()));
        }
        return ImmutableList.copyOf(this.utilityButtons.children());
    }

    public boolean method_25404(class06601 class066012) {
        if (this.backButton != null && this.backButton.keyPressed(class066012)) {
            return true;
        }
        return this.utilityButtons.keyPressed(class066012);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        boolean bl2 = this.backButton != null && this.backButton.mouseClicked(class066132, bl);
        boolean bl3 = this.utilityButtons.mouseClicked(class066132, bl);
        return bl2 || bl3;
    }

    private boolean exportSettingsButtonClicked(IrisElementRow$IconButtonElement irisElementRow$IconButtonElement) {
        GuiUtil.playButtonClickSound();
        if (Iris.getCurrentPack().isEmpty()) {
            return false;
        }
        if (class06202.Nq().Nt().Z()) {
            this.screen.displayNotification((class00392)class00392.L((String)"options.iris.mustDisableFullscreen").N(class06541.field_1061).N(class06541.field_1067));
            return false;
        }
        FileDialogUtil.fileSelectDialog(FileDialogUtil$DialogType.SAVE, "Export Shader Settings to File", Iris.getShaderpacksDirectory().resolve(Iris.getCurrentPackName() + ".txt"), "Shader Pack Settings (.txt)", "*.txt").whenComplete((optional, throwable) -> {
            if (throwable != null) {
                Iris.logger.error("Error selecting file to export shader settings", throwable);
                return;
            }
            optional.ifPresent(path -> {
                Closeable closeable;
                Properties properties = new Properties();
                Path path2 = Iris.getShaderpacksDirectory().resolve(Iris.getCurrentPackName() + ".txt");
                if (Files.exists(path2, new LinkOption[0])) {
                    try {
                        closeable = Files.newInputStream(path2, new OpenOption[0]);
                        try {
                            properties.load((InputStream)closeable);
                        }
                        finally {
                            if (closeable != null) {
                                ((InputStream)closeable).close();
                            }
                        }
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                try {
                    closeable = Files.newOutputStream(path, new OpenOption[0]);
                    try {
                        properties.store((OutputStream)closeable, null);
                    }
                    finally {
                        if (closeable != null) {
                            ((OutputStream)closeable).close();
                        }
                    }
                }
                catch (IOException iOException) {
                    Iris.logger.error("Error saving properties to \"" + String.valueOf(path) + "\"", (Throwable)iOException);
                }
            });
        });
        return true;
    }

    private void queueBottomRightAnchoredTooltip(class01054 class010542, int n, int n2, class01590 class015902, class00392 class003922) {
        ShaderPackScreen.TOP_LAYER_RENDER_QUEUE.add(() -> GuiUtil.drawTextPanel(class015902, class010542, class003922, n - (class015902.N((class05936)class003922) + 10), n2 - 16));
    }

    private boolean importSettingsButtonClicked(IrisElementRow$IconButtonElement irisElementRow$IconButtonElement) {
        GuiUtil.playButtonClickSound();
        if (Iris.getCurrentPack().isEmpty()) {
            return false;
        }
        if (class06202.Nq().Nt().Z()) {
            this.screen.displayNotification((class00392)class00392.L((String)"options.iris.mustDisableFullscreen").N(class06541.field_1061).N(class06541.field_1067));
            return false;
        }
        ShaderPackScreen shaderPackScreen = this.screen;
        FileDialogUtil.fileSelectDialog(FileDialogUtil$DialogType.OPEN, "Import Shader Settings from File", Iris.getShaderpacksDirectory().resolve(Iris.getCurrentPackName() + ".txt"), "Shader Pack Settings (.txt)", "*.txt").whenComplete((optional, throwable) -> {
            if (throwable != null) {
                Iris.logger.error("Error selecting shader settings from file", throwable);
                return;
            }
            if ((class05096)class06202.Nq().v_3 == shaderPackScreen) {
                optional.ifPresent(shaderPackScreen::importPackOptions);
            }
        });
        return true;
    }

    private boolean resetButtonClicked(IrisElementRow$TextButtonElement irisElementRow$TextButtonElement) {
        if (class06202.Nq().L()) {
            Iris.resetShaderPackOptionsOnNextReload();
            this.screen.applyChanges();
            GuiUtil.playButtonClickSound();
            return true;
        }
        return false;
    }

    private boolean backButtonClicked(IrisElementRow$TextButtonElement irisElementRow$TextButtonElement) {
        this.navigation.back();
        GuiUtil.playButtonClickSound();
        return true;
    }

    public List<? extends class03434> method_37025() {
        return ImmutableList.of();
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        boolean bl2;
        int n3 = this.method_46426();
        int n4 = this.method_46427();
        int n5 = this.method_25368();
        int n6 = this.method_25364();
        class010542.N(n3 - 3, n4 + n6 - 2, n3 + n5, n4 + n6 - 1, 0x66BEBEBE);
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        class010542.B().N(this.text, n3 + (int)((double)n5 * 0.5), n3 + 5, n3 + n5 - 10 - this.utilityButtons.getWidth(), n4 + 5, n4 + 15);
        GuiUtil.bindIrisWidgetsTexture();
        if (this.backButton != null) {
            this.backButton.render(class010542, n3, n4, 16, n, n2, f, bl);
        }
        this.resetButton.disabled = !(bl2 = class06202.Nq().L()) && !this.resetButton.method_25370();
        this.resetButton.text = !this.resetButton.disabled ? RESET_BUTTON_TEXT_ACTIVE : RESET_BUTTON_TEXT_INACTIVE;
        this.utilityButtons.renderRightAligned(class010542, n3 + n5 - 3, n4, 16, n, n2, f, bl);
        if (this.resetButton.isHovered() || this.resetButton.method_25370()) {
            class05216 class052162 = !this.resetButton.disabled ? RESET_TOOLTIP : RESET_HOLD_SHIFT_TOOLTIP;
            this.queueBottomRightAnchoredTooltip(class010542, this.resetButton.method_48202().y(class03249.field_41829), this.resetButton.method_48202().R().y(), class015902, (class00392)class052162);
        }
        if (this.importButton.isHovered() || this.importButton.method_25370()) {
            this.queueBottomRightAnchoredTooltip(class010542, this.importButton.method_48202().y(class03249.field_41829), this.importButton.method_48202().R().y(), class015902, (class00392)IMPORT_TOOLTIP);
        }
        if (this.exportButton.isHovered() || this.exportButton.method_25370()) {
            this.queueBottomRightAnchoredTooltip(class010542, this.exportButton.method_48202().y(class03249.field_41829), this.exportButton.method_48202().R().y(), class015902, (class00392)EXPORT_TOOLTIP);
        }
    }
}

