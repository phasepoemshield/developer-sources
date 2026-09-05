/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01321
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class04655
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class05733
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07533
 *  minecraft.class07536
 *  minecraft.class08844
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.api.v0.IrisApi
 *  net.irisshaders.iris.platform.IrisPlatformHelpers
 *  net.irisshaders.iris.shaderpack.ShaderPack
 *  net.irisshaders.iris.uniforms.FrameUpdateNotifier
 *  net.irisshaders.iris.uniforms.transforms.SmoothedFloat
 */
package net.irisshaders.iris.gui.screen;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01321;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class04655;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class05733;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07533;
import minecraft.class07536;
import minecraft.class08844;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.api.v0.IrisApi;
import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.NavigationController;
import net.irisshaders.iris.gui.OldImageButton;
import net.irisshaders.iris.gui.element.ShaderPackOptionList;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList$BaseEntry;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList$ShaderPackEntry;
import net.irisshaders.iris.gui.element.screen.IrisButton;
import net.irisshaders.iris.gui.element.widget.AbstractElementWidget;
import net.irisshaders.iris.gui.element.widget.CommentedElementWidget;
import net.irisshaders.iris.gui.screen.HudHideable;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import net.irisshaders.iris.shaderpack.ShaderPack;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import net.irisshaders.iris.uniforms.transforms.SmoothedFloat;

public class ShaderPackScreen
extends class05096
implements HudHideable {
    public static final Set<Runnable> TOP_LAYER_RENDER_QUEUE = new HashSet<Runnable>();
    private static final class00392 SELECT_TITLE = class00392.L((String)"pack.iris.select.title").N(new class06541[]{class06541.field_1080, class06541.field_1056});
    private static final class00392 CONFIGURE_TITLE = class00392.L((String)"pack.iris.configure.title").N(new class06541[]{class06541.field_1080, class06541.field_1056});
    private static final int COMMENT_PANEL_WIDTH = 314;
    private static final String development = "Development Environment";
    private final class05096 parent;
    private final class05216 irisTextComponent;
    private final FrameUpdateNotifier notifier = new FrameUpdateNotifier();
    private ShaderPackSelectionList shaderPackList;
    private ShaderPackOptionList shaderOptionList = null;
    private NavigationController navigation = null;
    private class05362 screenSwitchButton;
    private class00392 notificationDialog = null;
    private int notificationDialogTimer = 0;
    private AbstractElementWidget<?> hoveredElement = null;
    private Optional<class00392> hoveredElementCommentTitle = Optional.empty();
    private List<class01028> hoveredElementCommentBody = new ArrayList<class01028>();
    private int hoveredElementCommentTimer = 0;
    private boolean optionMenuOpen = false;
    private boolean dropChanges = false;
    private class05216 developmentComponent;
    private class05216 updateComponent;
    private boolean guiHidden = false;
    public final SmoothedFloat blurTransition = new SmoothedFloat(2.0f, 2.0f, () -> {
        if (this.guiHidden) {
            return 0.0f;
        }
        if (this.optionMenuOpen) {
            return 0.1f;
        }
        return ((class05630)this.field_22787.i_7).l();
    }, this.notifier);
    private float guiButtonHoverTimer = 0.0f;
    private class05362 openFolderButton;
    private float backgroundInit = 0.0f;
    public final SmoothedFloat listTransition = new SmoothedFloat(1.0f, 1.0f, () -> {
        if (this.guiHidden || this.optionMenuOpen) {
            return 0.0f;
        }
        return this.backgroundInit;
    }, this.notifier);
    public final SmoothedFloat buttonTransition = new SmoothedFloat(1.0f, 1.0f, () -> {
        if (this.guiHidden) {
            return 0.0f;
        }
        return this.backgroundInit;
    }, this.notifier);
    private OldImageButton showHideButton;
    private static final class01894 BLUR_POST_CHAIN_ID = class01894.y((String)"blur");

    public ShaderPackScreen(class05096 class050962) {
        super((class00392)class00392.L((String)"options.iris.shaderPackSelection.title"));
        this.parent = class050962;
        String string = "Iris " + Iris.getVersion();
        if (IrisPlatformHelpers.getInstance().isDevelopmentEnvironment()) {
            this.developmentComponent = class00392.y((String)development).N(class06541.field_1065);
        }
        this.irisTextComponent = class00392.y((String)string).N(class06541.field_1080);
        if (Iris.getUpdateChecker().getUpdateMessage().isPresent()) {
            this.updateComponent = class00392.y((String)"New update available!").N(class06541.field_1060).N(class06541.field_1073);
            this.irisTextComponent.y((class00392)class00392.y((String)" (outdated)").N(class06541.field_1061));
        }
        this.refreshForChangedPack();
    }

    public void method_25426() {
        ShaderPack shaderPack;
        super.method_25426();
        int n = this.field_22789 / 2 - 50;
        int n2 = this.field_22789 / 2 - 76;
        boolean bl = (class03448)this.field_22787.T_3 != null;
        this.method_37066((class04654)this.shaderPackList);
        this.method_37066((class04654)this.shaderOptionList);
        this.shaderPackList = new ShaderPackSelectionList(this, this.field_22787, this.field_22789, this.field_22790, 32, this.field_22790 - 58 - 36, 0, this.field_22789);
        if (Iris.getCurrentPack().isPresent() && this.navigation != null) {
            shaderPack = (ShaderPack)Iris.getCurrentPack().get();
            this.shaderOptionList = new ShaderPackOptionList(this, this.navigation, shaderPack, this.field_22787, this.field_22789, this.field_22790, 32, this.field_22790 - 58 - 36, 0, this.field_22789);
            this.navigation.setActiveOptionList(this.shaderOptionList);
            this.shaderOptionList.rebuild();
        } else {
            this.optionMenuOpen = false;
            this.shaderOptionList = null;
        }
        this.method_37067();
        if (!this.guiHidden) {
            if (this.optionMenuOpen && this.shaderOptionList != null) {
                this.method_37063((class04654)this.shaderOptionList);
            } else {
                this.method_37063((class04654)this.shaderPackList);
            }
            this.method_37063((class04654)IrisButton.iris$builder(class05220.u, class053622 -> this.method_25419(), (FloatSupplier)this.buttonTransition).bounds(n + 104, this.field_22790 - 27, 100, 20).build());
            this.method_37063((class04654)IrisButton.iris$builder((class00392)class00392.L((String)"options.iris.apply"), class053622 -> this.applyChanges(), (FloatSupplier)this.buttonTransition).bounds(n, this.field_22790 - 27, 100, 20).build());
            this.method_37063((class04654)IrisButton.iris$builder(class05220.i, class053622 -> this.dropChangesAndClose(), (FloatSupplier)this.buttonTransition).bounds(n - 104, this.field_22790 - 27, 100, 20).build());
            this.openFolderButton = IrisButton.iris$builder((class00392)class00392.L((String)"options.iris.openShaderPackFolder"), class053622 -> this.openShaderPackFolder(), (FloatSupplier)this.buttonTransition).bounds(n2 - 78, this.field_22790 - 51, 152, 20).build();
            this.method_37063((class04654)this.openFolderButton);
            this.screenSwitchButton = (class05362)this.method_37063((class04654)IrisButton.iris$builder((class00392)class00392.L((String)"options.iris.shaderPackList"), class053622 -> {
                this.optionMenuOpen = !this.optionMenuOpen;
                this.applyChanges();
                this.method_25395((class04654)this.shaderPackList.method_25336());
                this.method_25426();
            }, (FloatSupplier)this.buttonTransition).bounds(n2 + 78, this.field_22790 - 51, 152, 20).build());
            this.refreshScreenSwitchButton();
        }
        if (bl) {
            shaderPack = this.guiHidden ? class00392.L((String)"options.iris.gui.show") : class00392.L((String)"options.iris.gui.hide");
            float f = (float)this.field_22789 / 2.0f + 154.0f;
            float f2 = (float)this.field_22789 - f;
            int n3 = f2 > 100.0f ? this.field_22789 - 50 : (f2 < 20.0f ? this.field_22789 - 20 : (int)(f + f2 / 2.0f) - 10);
            this.showHideButton = new OldImageButton(n3, this.field_22790 - 39, 20, 20, this.guiHidden ? 20 : 0, 146, 20, GuiUtil.IRIS_WIDGETS_TEX, 256, 256, class053622 -> {
                this.guiHidden = !this.guiHidden;
                this.method_25426();
            }, (class00392)shaderPack);
            this.showHideButton.method_47400(class04141.N((class00392)shaderPack));
            this.showHideButton.method_47402(Duration.ofSeconds(10L));
            this.method_37063((class04654)this.showHideButton);
        }
        this.hoveredElement = null;
        this.hoveredElementCommentTimer = 0;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.i()) {
            if (this.guiHidden) {
                this.guiHidden = false;
                this.method_25426();
                return true;
            }
            if (this.navigation != null && this.navigation.hasHistory()) {
                this.navigation.back();
                return true;
            }
            if (this.optionMenuOpen) {
                this.optionMenuOpen = false;
                this.method_25426();
                return true;
            }
        } else if (class066012.z()) {
            if (!this.optionMenuOpen) {
                this.shaderPackList.method_25404(new class06601(257, 0, 0));
            }
            this.optionMenuOpen = !this.optionMenuOpen;
            this.applyChanges();
            this.method_25426();
            this.method_25395(null);
        } else if (class066012.v() == 290 && this.showHideButton != null) {
            this.guiHidden = !this.guiHidden;
            this.method_25426();
        }
        return this.guiHidden || super.method_25404(class066012);
    }

    public void method_25393() {
        super.method_25393();
        if (this.notificationDialogTimer > 0) {
            --this.notificationDialogTimer;
        }
        this.hoveredElementCommentTimer = this.hoveredElement != null ? ++this.hoveredElementCommentTimer : 0;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.notifier.onNewFrame();
        this.backgroundInit = 1.0f;
        if (class06202.Nq().s() && class04655.N((class08844)class06202.Nq().Nt(), (int)68)) {
            class06202.Nq().N((class05096)new class05733(bl -> {
                Iris.setDebug((boolean)bl);
                class06202.Nq().N((class05096)this);
            }, (class00392)class00392.y((String)"Shader debug mode toggle"), (class00392)class00392.y((String)"Debug mode helps investigate problems and shows shader errors. Would you like to enable it?"), (class00392)class00392.y((String)"Yes"), (class00392)class00392.y((String)"No")));
        }
        if (class06202.Nq().s() && class04655.N((class08844)class06202.Nq().Nt(), (int)71)) {
            class06202.Nq().N((class05096)new class05733(bl -> {
                try {
                    Iris.getIrisConfig().setUnknown(bl);
                }
                catch (IOException iOException) {
                    throw new RuntimeException(iOException);
                }
                class06202.Nq().N((class05096)this);
            }, (class00392)class00392.y((String)"Unknown shader toggle"), (class00392)class00392.y((String)"This allows unknown shaders to load in."), (class00392)class00392.y((String)"Enable"), (class00392)class00392.y((String)"Disable")));
        }
        if (!this.guiHidden) {
            super.method_25394(class010542, n, n2, f);
            if (this.optionMenuOpen && this.shaderOptionList != null) {
                this.shaderOptionList.method_25394(class010542, n, n2, f);
            } else {
                this.shaderPackList.method_25394(class010542, n, n2, f);
            }
        } else {
            this.showHideButton.method_25394(class010542, n, n2, f);
        }
        float f2 = this.guiButtonHoverTimer;
        if (f2 == this.guiButtonHoverTimer) {
            this.guiButtonHoverTimer = 0.0f;
        }
        if (!this.guiHidden) {
            class010542.N(this.field_22793, this.field_22785, (int)((double)this.field_22789 * 0.5), 8, -1);
            if (this.notificationDialog != null && this.notificationDialogTimer > 0) {
                class010542.N(this.field_22793, this.notificationDialog, (int)((double)this.field_22789 * 0.5), 21, -1);
            } else if (this.optionMenuOpen) {
                class010542.N(this.field_22793, CONFIGURE_TITLE, (int)((double)this.field_22789 * 0.5), 21, -1);
            } else {
                class010542.N(this.field_22793, SELECT_TITLE, (int)((double)this.field_22789 * 0.5), 21, -1);
            }
            if (this.isDisplayingComment()) {
                int n3 = Math.max(50, 18 + this.hoveredElementCommentBody.size() * 10);
                int n4 = (int)(0.5 * (double)this.field_22789) - 157;
                int n5 = this.field_22790 - (n3 + 4);
                GuiUtil.drawPanel(class010542, n4, n5, 314, n3);
                class010542.y(this.field_22793, this.hoveredElementCommentTitle.orElse((class00392)class00392.i()), n4 + 4, n5 + 4, -1);
                for (int i = 0; i < this.hoveredElementCommentBody.size(); ++i) {
                    class010542.y(this.field_22793, this.hoveredElementCommentBody.get(i), n4 + 4, n5 + 16 + i * 10, -1);
                }
            }
        }
        for (Runnable runnable : TOP_LAYER_RENDER_QUEUE) {
            runnable.run();
        }
        TOP_LAYER_RENDER_QUEUE.clear();
        if (this.developmentComponent != null) {
            class010542.y(this.field_22793, (class00392)this.developmentComponent, 2, this.field_22790 - 10, -1);
            class010542.y(this.field_22793, (class00392)this.irisTextComponent, 2, this.field_22790 - 20, -1);
        } else if (this.updateComponent != null) {
            class010542.y(this.field_22793, (class00392)this.updateComponent, 2, this.field_22790 - 10, -1);
            class010542.y(this.field_22793, (class00392)this.irisTextComponent, 2, this.field_22790 - 20, -1);
        } else {
            class010542.y(this.field_22793, (class00392)this.irisTextComponent, 2, this.field_22790 - 10, -1);
        }
    }

    public void method_25419() {
        if (!this.dropChanges) {
            this.applyChanges();
        } else {
            this.discardChanges();
        }
        try {
            this.shaderPackList.close();
        }
        catch (IOException iOException) {
            Iris.logger.error("Failed to safely close shaderpack selection!", (Throwable)iOException);
        }
        this.field_22787.N(this.parent);
    }

    public void method_29638(List<Path> list) {
        if (this.optionMenuOpen) {
            this.onOptionMenuFilesDrop(list);
        } else {
            this.onPackListFilesDrop(list);
        }
    }

    public boolean method_25402(class06613 class066132, boolean bl2) {
        int n = this.field_22793.y("New update available!");
        double d = class066132.n();
        double d2 = class066132.t();
        if (this.updateComponent != null && d < (double)n && d2 > (double)(this.field_22790 - 10) && d2 < (double)this.field_22790) {
            this.field_22787.N((class05096)new class01321(bl -> {
                if (bl) {
                    Iris.getUpdateChecker().getUpdateLink().ifPresent(arg_0 -> ((class07533)class07536.m()).N(arg_0));
                }
                this.field_22787.N((class05096)this);
            }, Iris.getUpdateChecker().getUpdateLink().map(URI::toString).orElse(""), true));
        }
        return super.method_25402(class066132, bl2);
    }

    public void refreshScreenSwitchButton() {
        if (this.screenSwitchButton != null) {
            this.screenSwitchButton.method_25355((class00392)(this.optionMenuOpen ? class00392.L((String)"options.iris.shaderPackList") : class00392.L((String)"options.iris.shaderPackSettings")));
            this.screenSwitchButton.field_22763 = this.optionMenuOpen || this.shaderPackList.getTopButtonRow().shadersEnabled && Iris.getCurrentPack().map(shaderPack -> !shaderPack.getMenuContainer().mainScreen.elements.isEmpty()).orElse(true) != false;
        }
    }

    public void onOptionMenuFilesDrop(List<Path> list) {
        if (list.size() != 1) {
            this.notificationDialog = class00392.L((String)"options.iris.shaderPackOptions.tooManyFiles").N(new class06541[]{class06541.field_1056, class06541.field_1061});
            this.notificationDialogTimer = 100;
            return;
        }
        this.importPackOptions((Path)list.getFirst());
    }

    public void onPackListFilesDrop(List<Path> list) {
        List list2 = list.stream().filter(Iris::isValidShaderpack).toList();
        for (Path path : list2) {
            String string = path.getFileName().toString();
            try {
                Iris.getShaderpacksDirectoryManager().copyPackIntoDirectory(string, path);
            }
            catch (FileAlreadyExistsException fileAlreadyExistsException) {
                this.notificationDialog = class00392.N((String)"options.iris.shaderPackSelection.copyErrorAlreadyExists", (Object[])new Object[]{string}).N(new class06541[]{class06541.field_1056, class06541.field_1061});
                this.notificationDialogTimer = 100;
                this.shaderPackList.refresh();
                return;
            }
            catch (IOException iOException) {
                Iris.logger.warn("Error copying dragged shader pack", (Throwable)iOException);
                this.notificationDialog = class00392.N((String)"options.iris.shaderPackSelection.copyError", (Object[])new Object[]{string}).N(new class06541[]{class06541.field_1056, class06541.field_1061});
                this.notificationDialogTimer = 100;
                this.shaderPackList.refresh();
                return;
            }
        }
        this.shaderPackList.refresh();
        if (list2.isEmpty()) {
            if (list.size() == 1) {
                var3_3 = ((Path)list.getFirst()).getFileName().toString();
                this.notificationDialog = class00392.N((String)"options.iris.shaderPackSelection.failedAddSingle", (Object[])new Object[]{var3_3}).N(new class06541[]{class06541.field_1056, class06541.field_1061});
            } else {
                this.notificationDialog = class00392.L((String)"options.iris.shaderPackSelection.failedAdd").N(new class06541[]{class06541.field_1056, class06541.field_1061});
            }
        } else if (list2.size() == 1) {
            var3_3 = ((Path)list2.getFirst()).getFileName().toString();
            this.notificationDialog = class00392.N((String)"options.iris.shaderPackSelection.addedPack", (Object[])new Object[]{var3_3}).N(new class06541[]{class06541.field_1056, class06541.field_1054});
            this.shaderPackList.select((String)var3_3);
        } else {
            this.notificationDialog = class00392.N((String)"options.iris.shaderPackSelection.addedPacks", (Object[])new Object[]{list2.size()}).N(new class06541[]{class06541.field_1056, class06541.field_1054});
        }
        this.notificationDialogTimer = 100;
    }

    public boolean isDisplayingComment() {
        return this.hoveredElementCommentTimer > 10 && this.hoveredElementCommentTitle.isPresent() && !this.hoveredElementCommentBody.isEmpty();
    }

    public void setElementHoveredStatus(AbstractElementWidget<?> abstractElementWidget, boolean bl) {
        if (bl && abstractElementWidget != this.hoveredElement) {
            this.hoveredElement = abstractElementWidget;
            if (abstractElementWidget instanceof CommentedElementWidget) {
                this.hoveredElementCommentTitle = ((CommentedElementWidget)abstractElementWidget).getCommentTitle();
                Optional<class00392> optional = ((CommentedElementWidget)abstractElementWidget).getCommentBody();
                if (optional.isEmpty()) {
                    this.hoveredElementCommentBody.clear();
                } else {
                    String string = optional.get().getString();
                    if (string.endsWith(".")) {
                        string = string.substring(0, string.length() - 1);
                    }
                    List list = Arrays.stream(string.split("\\. [ ]*")).map(class00392::y).toList();
                    this.hoveredElementCommentBody = new ArrayList<class01028>();
                    for (class05216 class052162 : list) {
                        this.hoveredElementCommentBody.addAll(this.field_22793.L((class05936)class052162, 306));
                    }
                }
            } else {
                this.hoveredElementCommentTitle = Optional.empty();
                this.hoveredElementCommentBody.clear();
            }
            this.hoveredElementCommentTimer = 0;
        } else if (!bl && abstractElementWidget == this.hoveredElement) {
            this.hoveredElement = null;
            this.hoveredElementCommentTitle = Optional.empty();
            this.hoveredElementCommentBody.clear();
            this.hoveredElementCommentTimer = 0;
        }
    }

    private void dropChangesAndClose() {
        this.dropChanges = true;
        this.method_25419();
    }

    private void openShaderPackFolder() {
        CompletableFuture.runAsync(() -> class07536.m().N(Iris.getShaderpacksDirectoryManager().getDirectoryUri()));
    }

    public void displayNotification(class00392 class003922) {
        this.notificationDialog = class003922;
        this.notificationDialogTimer = 100;
    }

    public void refreshForChangedPack() {
        if (Iris.getCurrentPack().isPresent()) {
            ShaderPack shaderPack = (ShaderPack)Iris.getCurrentPack().get();
            this.navigation = new NavigationController(shaderPack.getMenuContainer());
            if (this.shaderOptionList != null) {
                this.shaderOptionList.applyShaderPack(shaderPack);
                this.shaderOptionList.rebuild();
            }
        } else {
            this.navigation = null;
        }
        this.refreshScreenSwitchButton();
    }

    public class05362 getBottomRowOption() {
        return this.openFolderButton;
    }

    public void importPackOptions(Path path) {
        try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
            Properties properties = new Properties();
            properties.load(inputStream);
            Iris.queueShaderPackOptionsFromProperties((Properties)properties);
            this.notificationDialog = class00392.N((String)"options.iris.shaderPackOptions.importedSettings", (Object[])new Object[]{path.getFileName().toString()}).N(new class06541[]{class06541.field_1056, class06541.field_1054});
            this.notificationDialogTimer = 100;
            if (this.navigation != null) {
                this.navigation.refresh();
            }
        }
        catch (Exception exception) {
            Iris.logger.error("Error importing shader settings file \"" + path.toString() + "\"", (Throwable)exception);
            this.notificationDialog = class00392.N((String)"options.iris.shaderPackOptions.failedImport", (Object[])new Object[]{path.getFileName().toString()}).N(new class06541[]{class06541.field_1056, class06541.field_1061});
            this.notificationDialogTimer = 100;
        }
    }

    public void applyChanges() {
        String string;
        ShaderPackSelectionList$BaseEntry shaderPackSelectionList$BaseEntry = (ShaderPackSelectionList$BaseEntry)this.shaderPackList.method_25334();
        boolean bl = this.shaderPackList.getTopButtonRow().shadersEnabled;
        boolean bl2 = Iris.getIrisConfig().areShadersEnabled();
        if (bl != bl2) {
            IrisApi.getInstance().getConfig().setShadersEnabledAndApply(bl);
        }
        if (!(shaderPackSelectionList$BaseEntry instanceof ShaderPackSelectionList$ShaderPackEntry)) {
            return;
        }
        ShaderPackSelectionList$ShaderPackEntry shaderPackSelectionList$ShaderPackEntry = (ShaderPackSelectionList$ShaderPackEntry)shaderPackSelectionList$BaseEntry;
        this.shaderPackList.setApplied(shaderPackSelectionList$ShaderPackEntry);
        String string2 = shaderPackSelectionList$ShaderPackEntry.getPackName();
        if (!string2.equals(Iris.getCurrentPackName())) {
            Iris.clearShaderPackOptionQueue();
        }
        if (!string2.equals(string = (String)Iris.getIrisConfig().getShaderPackName().orElse(null)) || !Iris.getShaderPackOptionQueue().isEmpty() || Iris.shouldResetShaderPackOptionsOnNextReload()) {
            Iris.getIrisConfig().setShaderPackName(string2);
            IrisApi.getInstance().getConfig().setShadersEnabledAndApply(bl);
        }
        this.refreshForChangedPack();
    }

    private void discardChanges() {
        Iris.clearShaderPackOptionQueue();
    }
}

