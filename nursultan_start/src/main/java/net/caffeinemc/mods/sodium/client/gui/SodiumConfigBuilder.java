/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  minecraft.class00392
 *  minecraft.class01301
 *  minecraft.class01307
 *  minecraft.class01315
 *  minecraft.class01894
 *  minecraft.class02424
 *  minecraft.class03063
 *  minecraft.class04370
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06221
 *  minecraft.class06532
 *  minecraft.class08066
 *  minecraft.class08361
 *  minecraft.class08627
 *  minecraft.class08844
 *  net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 *  net.caffeinemc.mods.sodium.api.config.option.OptionFlag
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  net.caffeinemc.mods.sodium.api.config.option.Range
 *  net.caffeinemc.mods.sodium.api.config.option.SteppedValidator
 *  net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.EnumOptionBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.ModOptionsBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.OptionPageBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.PageBuilder
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils$OperatingSystem
 *  net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds
 *  net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds$Reference
 *  net.caffeinemc.mods.sodium.client.render.chunk.DeferMode
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.QuadSplittingMode
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GLCapabilities
 */
package net.caffeinemc.mods.sodium.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.io.IOException;
import java.util.Locale;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01301;
import minecraft.class01307;
import minecraft.class01315;
import minecraft.class01894;
import minecraft.class02424;
import minecraft.class03063;
import minecraft.class04370;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06221;
import minecraft.class06532;
import minecraft.class08066;
import minecraft.class08361;
import minecraft.class08627;
import minecraft.class08844;
import net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.StorageEventHandler;
import net.caffeinemc.mods.sodium.api.config.option.OptionFlag;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.api.config.option.Range;
import net.caffeinemc.mods.sodium.api.config.option.SteppedValidator;
import net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.EnumOptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.ModOptionsBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionPageBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.PageBuilder;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.MappedStagingBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.gui.FullscreenResolutionRange;
import net.caffeinemc.mods.sodium.client.gui.GUIScaleRange;
import net.caffeinemc.mods.sodium.client.gui.SodiumConfigBuilder$SodiumLogo;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlValueFormatterImpls;
import net.caffeinemc.mods.sodium.client.render.chunk.DeferMode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.QuadSplittingMode;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;

public class SodiumConfigBuilder
implements ConfigEntryPoint {
    static final class01894 SODIUM_ICON = class01894.N((String)"sodium", (String)"textures/gui/config-icon.png");
    private static final SodiumOptions DEFAULTS = SodiumOptions.defaults();
    private final class05630 vanillaOpts;
    private final StorageEventHandler vanillaStorage;
    private final SodiumOptions sodiumOpts;
    private final StorageEventHandler sodiumStorage;
    private final @Nullable class08844 window;

    public SodiumConfigBuilder() {
        class06202 class062022 = class06202.Nq();
        this.window = class062022.Nt();
        this.vanillaOpts = (class05630)class062022.i_7;
        this.vanillaStorage = this.vanillaOpts == null ? null : () -> {
            this.vanillaOpts.Np();
            SodiumClientMod.logger().info("Flushed changes to Minecraft configuration");
        };
        this.sodiumOpts = SodiumClientMod.options();
        this.sodiumStorage = () -> {
            try {
                SodiumOptions.writeToDisk(this.sodiumOpts);
            }
            catch (IOException iOException) {
                throw new RuntimeException("Couldn't save configuration changes", iOException);
            }
            SodiumClientMod.logger().info("Flushed changes to Sodium configuration");
        };
    }

    private class06221 getMonitor() {
        if (this.window == null) {
            return null;
        }
        return this.window.v();
    }

    private static ModOptionsBuilder createModOptionsBuilder(ConfigBuilder configBuilder) {
        return configBuilder.registerOwnModOptions().setName("Sodium").setIcon(SODIUM_ICON).formatVersion(string -> {
            String[] stringArray = string.splitWithDelimiters("\\+", 2);
            return stringArray[0];
        });
    }

    private OptionPageBuilder buildPerformancePage(ConfigBuilder configBuilder) {
        OptionPageBuilder optionPageBuilder = configBuilder.createOptionPage().setName((class00392)class00392.L((String)"sodium.options.pages.performance"));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:performance.chunk_update_threads")).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.chunk_update_threads.name")).setValueFormatter(ControlValueFormatterImpls.quantityOrDisabled(n -> class00392.N((String)"sodium.options.chunk_update_threads.value", (Object[])new Object[]{n}), (class00392)class00392.L((String)"sodium.options.default"))).setTooltip((class00392)class00392.L((String)"sodium.options.chunk_update_threads.tooltip")).setRange(0, Runtime.getRuntime().availableProcessors(), 1).setDefaultValue(Integer.valueOf(SodiumConfigBuilder.DEFAULTS.performance.chunkBuilderThreads)).setBinding(n -> {
            this.sodiumOpts.performance.chunkBuilderThreads = n;
        }, () -> this.sodiumOpts.performance.chunkBuilderThreads).setImpact(OptionImpact.HIGH).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})).addOption((OptionBuilder)configBuilder.createEnumOption(class01894.N((String)"sodium:performance.always_defer_chunk_updates"), DeferMode.class).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.defer_chunk_updates.name")).setTooltip((class00392)class00392.L((String)"sodium.options.defer_chunk_updates.tooltip")).setDefaultValue((Enum)SodiumConfigBuilder.DEFAULTS.performance.chunkBuildDeferMode).setBinding(deferMode -> {
            this.sodiumOpts.performance.chunkBuildDeferMode = deferMode;
        }, () -> this.sodiumOpts.performance.chunkBuildDeferMode).setImpact(OptionImpact.HIGH).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_UPDATE})));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:performance.use_block_face_culling")).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.use_block_face_culling.name")).setTooltip((class00392)class00392.L((String)"sodium.options.use_block_face_culling.tooltip")).setDefaultValue(Boolean.valueOf(SodiumConfigBuilder.DEFAULTS.performance.useBlockFaceCulling)).setBinding(bl -> {
            this.sodiumOpts.performance.useBlockFaceCulling = bl;
        }, () -> this.sodiumOpts.performance.useBlockFaceCulling).setImpact(OptionImpact.MEDIUM).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:performance.use_fog_occlusion")).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.use_fog_occlusion.name")).setTooltip((class00392)class00392.L((String)"sodium.options.use_fog_occlusion.tooltip")).setDefaultValue(Boolean.valueOf(SodiumConfigBuilder.DEFAULTS.performance.useFogOcclusion)).setBinding(bl -> {
            this.sodiumOpts.performance.useFogOcclusion = bl;
        }, () -> this.sodiumOpts.performance.useFogOcclusion).setImpact(OptionImpact.MEDIUM).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_UPDATE})).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:performance.use_entity_culling")).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.use_entity_culling.name")).setTooltip((class00392)class00392.L((String)"sodium.options.use_entity_culling.tooltip")).setDefaultValue(Boolean.valueOf(SodiumConfigBuilder.DEFAULTS.performance.useEntityCulling)).setBinding(bl -> {
            this.sodiumOpts.performance.useEntityCulling = bl;
        }, () -> this.sodiumOpts.performance.useEntityCulling).setImpact(OptionImpact.MEDIUM)).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:performance.animate_only_visible_textures")).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.animate_only_visible_textures.name")).setTooltip((class00392)class00392.L((String)"sodium.options.animate_only_visible_textures.tooltip")).setDefaultValue(Boolean.valueOf(SodiumConfigBuilder.DEFAULTS.performance.animateOnlyVisibleTextures)).setBinding(bl -> {
            this.sodiumOpts.performance.animateOnlyVisibleTextures = bl;
        }, () -> this.sodiumOpts.performance.animateOnlyVisibleTextures).setImpact(OptionImpact.HIGH).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_UPDATE})).addOption(this.buildNoErrorContextOption(configBuilder)).addOption((OptionBuilder)configBuilder.createEnumOption(class01894.N((String)"sodium:performance.inactivity_fps_limit"), class02424.class).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.inactivityFpsLimit")).setElementNameProvider(class02424::N).setTooltip(class024242 -> class024242 == class02424.field_52744 ? class00392.L((String)"options.inactivityFpsLimit.afk.tooltip") : class00392.L((String)"options.inactivityFpsLimit.minimized.tooltip")).setDefaultValue((Enum)class02424.field_52744).setBinding(arg_0 -> ((class04370)this.vanillaOpts.z()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.z()).method_41753())));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createEnumOption(class01894.N((String)"sodium:performance.quad_splitting"), QuadSplittingMode.class).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.quad_splitting.name")).setTooltip((class00392)class00392.L((String)"sodium.options.quad_splitting.tooltip")).setImpact(OptionImpact.MEDIUM).setDefaultValue((Enum)SodiumConfigBuilder.DEFAULTS.performance.quadSplittingMode).setBinding(quadSplittingMode -> {
            this.sodiumOpts.performance.quadSplittingMode = quadSplittingMode;
        }, () -> this.sodiumOpts.performance.quadSplittingMode).setEnabled(SodiumClientMod.options().debug.terrainSortingEnabled).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})));
        return optionPageBuilder;
    }

    public void registerConfigEarly(ConfigBuilder configBuilder) {
        new SodiumConfigBuilder().buildEarlyConfig(configBuilder);
    }

    private OptionBuilder buildNoErrorContextOption(ConfigBuilder configBuilder) {
        return configBuilder.createBooleanOption(class01894.N((String)"sodium:performance.use_no_error_context")).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.use_no_error_context.name")).setTooltip((class00392)class00392.L((String)"sodium.options.use_no_error_context.tooltip")).setDefaultValue(Boolean.valueOf(SodiumConfigBuilder.DEFAULTS.performance.useNoErrorGLContext)).setBinding(bl -> {
            this.sodiumOpts.performance.useNoErrorGLContext = bl;
        }, () -> this.sodiumOpts.performance.useNoErrorGLContext).setEnabledProvider(configState -> {
            GLCapabilities gLCapabilities = GL.getCapabilities();
            return (gLCapabilities.OpenGL46 || gLCapabilities.GL_KHR_no_error) && !Workarounds.isWorkaroundEnabled((Workarounds.Reference)Workarounds.Reference.NO_ERROR_CONTEXT_UNSUPPORTED);
        }, new class01894[0]).setImpact(OptionImpact.LOW).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_GAME_RESTART});
    }

    private void buildEarlyConfig(ConfigBuilder configBuilder) {
        SodiumConfigBuilder.createModOptionsBuilder(configBuilder).addPage((PageBuilder)configBuilder.createOptionPage().setName((class00392)class00392.L((String)"sodium.options.pages.performance")).addOptionGroup(configBuilder.createOptionGroup().addOption(this.buildNoErrorContextOption(configBuilder))));
    }

    private OptionPageBuilder buildGeneralPage(ConfigBuilder configBuilder) {
        OptionPageBuilder optionPageBuilder = configBuilder.createOptionPage().setName((class00392)class00392.L((String)"sodium.options.pages.general"));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:general.render_distance")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.renderDistance")).setTooltip((class00392)class00392.L((String)"sodium.options.view_distance.tooltip")).setValueFormatter(ControlValueFormatterImpls.translateVariable("options.chunks")).setRange(2, 32, 1).setDefaultValue(Integer.valueOf(12)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.i()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.i()).method_41753()).setImpact(OptionImpact.HIGH).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})).addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:general.simulation_distance")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.simulationDistance")).setTooltip((class00392)class00392.L((String)"sodium.options.simulation_distance.tooltip")).setValueFormatter(ControlValueFormatterImpls.translateVariable("options.chunks")).setRange(5, 32, 1).setDefaultValue(Integer.valueOf(12)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.R()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.R()).method_41753()).setImpact(OptionImpact.HIGH).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})).addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:general.gamma")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.gamma")).setTooltip((class00392)class00392.L((String)"sodium.options.brightness.tooltip")).setValueFormatter(ControlValueFormatterImpls.brightness()).setRange(0, 100, 1).setDefaultValue(Integer.valueOf(50)).setBinding(n -> this.vanillaOpts.No().method_41748((Object)((double)n.intValue() * 0.01)), () -> (int)((Double)this.vanillaOpts.No().method_41753() / 0.01))));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:general.gui_scale")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.guiScale")).setTooltip((class00392)class00392.L((String)"sodium.options.gui_scale.tooltip")).setValueFormatter(ControlValueFormatterImpls.guiScale()).setValidatorProvider(configState -> {
            int n = configState.readIntOption(class01894.N((String)"sodium:general.gui_scale"));
            int n2 = this.window.N(0, class06202.Nq().NR());
            int n3 = Math.max(n, n2);
            return new GUIScaleRange(n3);
        }, new class01894[]{ConfigState.UPDATE_ON_REBUILD, ConfigState.UPDATE_ON_APPLY}).setDefaultValue(Integer.valueOf(0)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.Nq()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.Nq()).method_41753())).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:general.fullscreen")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.fullscreen")).setTooltip((class00392)class00392.L((String)"sodium.options.fullscreen.tooltip")).setDefaultValue(Boolean.valueOf(false)).setBinding(bl -> {
            this.vanillaOpts.NP().method_41748(bl);
            if (this.window.Z() != ((Boolean)this.vanillaOpts.NP().method_41753()).booleanValue()) {
                this.window.M();
                this.vanillaOpts.NP().method_41748((Object)this.window.Z());
            }
        }, () -> ((class04370)this.vanillaOpts.NP()).method_41753())).addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:general.fullscreen_resolution")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.fullscreen.resolution")).setTooltip((class00392)class00392.L((String)"sodium.options.fullscreen_resolution.tooltip")).setValueFormatter(ControlValueFormatterImpls.resolution()).setValidator((SteppedValidator)new FullscreenResolutionRange()).setDefaultValue(Integer.valueOf(0)).setBinding(n -> {
            class06221 class062212 = this.getMonitor();
            if (class062212 != null) {
                this.window.N(0 == n ? Optional.empty() : Optional.of(class062212.N(n - 1)));
            }
        }, () -> {
            class06221 class062212 = this.getMonitor();
            if (class062212 == null) {
                return 0;
            }
            Optional optional = this.window.i();
            return (Integer)optional.map(class047602 -> class062212.N(class047602) + 1).orElse(0);
        }).setEnabledProvider(configState -> {
            class06221 class062212 = this.getMonitor();
            if (class062212 == null || class062212.i() <= 0) {
                return false;
            }
            OsUtils.OperatingSystem operatingSystem = OsUtils.getOs();
            return (operatingSystem == OsUtils.OperatingSystem.WIN || operatingSystem == OsUtils.OperatingSystem.MAC) && configState.readBooleanOption(class01894.N((String)"sodium:general.fullscreen"));
        }, new class01894[]{class01894.N((String)"sodium:general.fullscreen")}).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_VIDEOMODE_RELOAD})).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:general.vsync")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.vsync")).setTooltip((class00392)class00392.L((String)"sodium.options.v_sync.tooltip")).setDefaultValue(Boolean.valueOf(true)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.NN()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.NN()).method_41753())).addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:general.framerate_limit")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.framerateLimit")).setTooltip((class00392)class00392.L((String)"sodium.options.fps_limit.tooltip")).setValueFormatter(ControlValueFormatterImpls.fpsLimit()).setRange(10, 260, 10).setDefaultValue(Integer.valueOf(60)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.B()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.B()).method_41753())));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createEnumOption(class01894.N((String)"sodium:general.attack_indicator"), class01307.class).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.attackIndicator")).setTooltip((class00392)class00392.L((String)"sodium.options.attack_indicator.tooltip")).setDefaultValue((Enum)class01307.field_18152).setElementNameProvider(class01307::N).setBinding(arg_0 -> ((class04370)this.vanillaOpts.X()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.X()).method_41753())).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:general.autosave_indicator")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.autosaveIndicator")).setTooltip((class00392)class00392.L((String)"sodium.options.autosave_indicator.tooltip")).setDefaultValue(Boolean.valueOf(true)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.NG()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.NG()).method_41753())));
        return optionPageBuilder;
    }

    public static void registerIcon(class08627 class086272) {
        class086272.N(SODIUM_ICON, (class08361)new SodiumConfigBuilder$SodiumLogo());
    }

    public void registerConfigLate(ConfigBuilder configBuilder) {
        new SodiumConfigBuilder().buildFullConfig(configBuilder);
    }

    private OptionPageBuilder buildAdvancedPage(ConfigBuilder configBuilder) {
        OptionPageBuilder optionPageBuilder = configBuilder.createOptionPage().setName((class00392)class00392.L((String)"sodium.options.pages.advanced"));
        boolean bl2 = MappedStagingBuffer.isSupported(RenderDevice.INSTANCE);
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:advanced.use_persistent_mapping")).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.use_persistent_mapping.name")).setTooltip((class00392)class00392.L((String)"sodium.options.use_persistent_mapping.tooltip")).setDefaultValue(Boolean.valueOf(SodiumConfigBuilder.DEFAULTS.advanced.useAdvancedStagingBuffers)).setBinding(bl -> {
            this.sodiumOpts.advanced.useAdvancedStagingBuffers = bl;
        }, () -> this.sodiumOpts.advanced.useAdvancedStagingBuffers).setEnabled(bl2).setImpact(OptionImpact.MEDIUM).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:advanced.cpu_render_ahead_limit")).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.cpu_render_ahead_limit.name")).setValueFormatter(ControlValueFormatterImpls.translateVariable("sodium.options.cpu_render_ahead_limit.value")).setTooltip((class00392)class00392.L((String)"sodium.options.cpu_render_ahead_limit.tooltip")).setRange(0, 9, 1).setDefaultValue(Integer.valueOf(SodiumConfigBuilder.DEFAULTS.advanced.cpuRenderAheadLimit)).setBinding(n -> {
            this.sodiumOpts.advanced.cpuRenderAheadLimit = n;
        }, () -> this.sodiumOpts.advanced.cpuRenderAheadLimit)));
        return optionPageBuilder;
    }

    private void buildFullConfig(ConfigBuilder configBuilder) {
        SodiumConfigBuilder.createModOptionsBuilder(configBuilder).setColorTheme(configBuilder.createColorTheme().setFullThemeRGB(-7019309, -3342866, -8741218)).addPage((PageBuilder)this.buildGeneralPage(configBuilder)).addPage((PageBuilder)this.buildQualityPage(configBuilder)).addPage((PageBuilder)this.buildPerformancePage(configBuilder)).addPage((PageBuilder)this.buildAdvancedPage(configBuilder));
    }

    private OptionPageBuilder buildQualityPage(ConfigBuilder configBuilder) {
        OptionPageBuilder optionPageBuilder = configBuilder.createOptionPage().setName((class00392)class00392.L((String)"sodium.options.pages.quality"));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:quality.graphics")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.improvedTransparency")).setTooltip((class00392)class00392.L((String)"options.improvedTransparency.tooltip")).setDefaultValue(Boolean.valueOf(false)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.s()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.s()).method_41753()).setImpact(OptionImpact.HIGH).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createEnumOption(class01894.N((String)"sodium:quality.clouds"), class01301.class).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.renderClouds")).setTooltip((class00392)class00392.L((String)"sodium.options.clouds_quality.tooltip")).setElementNameProvider(EnumOptionBuilder.nameProviderFrom((class00392[])new class00392[]{class00392.L((String)"options.off"), class00392.L((String)"options.clouds.fast"), class00392.L((String)"options.clouds.fancy")})).setDefaultValue((Enum)class01301.field_18164).setBinding(class013012 -> {
            class08066 class080662;
            this.vanillaOpts.U().method_41748(class013012);
            if (class06202.C() && (class080662 = ((class03063)class06202.Nq().B_2).j()) != null) {
                RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(class080662.L(), -1, class080662.i(), 1.0);
            }
        }, () -> (class01301)this.vanillaOpts.U().method_41753()).setImpact(OptionImpact.LOW)).addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:quality.render_cloud_distance")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.renderCloudsDistance")).setTooltip((class00392)class00392.L((String)"sodium.options.clouds_distance.tooltip")).setRange(2, 128, 2).setDefaultValue(Integer.valueOf(128)).setBinding(n -> {
            this.vanillaOpts.E().method_41748(n);
            ((class03063)class06202.Nq().B_2).G().N();
        }, () -> (Integer)this.vanillaOpts.E().method_41753()).setImpact(OptionImpact.LOW).setValueFormatter(ControlValueFormatterImpls.translateVariable("options.chunks"))).addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:quality.weather")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.weatherRadius")).setTooltip((class00392)class00392.L((String)"options.weatherRadius.tooltip")).setDefaultValue(Integer.valueOf(10)).setRange(new Range(3, 10, 1)).setValueFormatter(ControlValueFormatterImpls.number()).setBinding(arg_0 -> ((class04370)this.vanillaOpts.W()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.W()).method_41753()).setImpact(OptionImpact.LOW)).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:quality.leaves")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.cutoutLeaves")).setTooltip((class00392)class00392.L((String)"options.cutoutLeaves.tooltip")).setDefaultValue(Boolean.valueOf(true)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.m()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.m()).method_41753()).setImpact(OptionImpact.MEDIUM).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})).addOption((OptionBuilder)configBuilder.createEnumOption(class01894.N((String)"sodium:quality.particles"), class01315.class).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.particles")).setTooltip((class00392)class00392.L((String)"sodium.options.particle_quality.tooltip")).setElementNameProvider(EnumOptionBuilder.nameProviderFrom((class00392[])new class00392[]{class00392.L((String)"options.particles.all"), class00392.L((String)"options.particles.decreased"), class00392.L((String)"options.particles.minimal")})).setDefaultValue((Enum)class01315.field_18197).setBinding(arg_0 -> ((class04370)this.vanillaOpts.NK()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.NK()).method_41753()).setImpact(OptionImpact.MEDIUM)).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:quality.ao")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.ao")).setTooltip((class00392)class00392.L((String)"sodium.options.smooth_lighting.tooltip")).setDefaultValue(Boolean.valueOf(true)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.T()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.T()).method_41753()).setImpact(OptionImpact.LOW).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})).addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:quality.biome_blend")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.biomeBlendRadius")).setValueFormatter(ControlValueFormatterImpls.biomeBlend()).setTooltip((class00392)class00392.L((String)"sodium.options.biome_blend.tooltip")).setRange(0, 7, 1).setDefaultValue(Integer.valueOf(2)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.a()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.a()).method_41753()).setImpact(OptionImpact.LOW).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})).addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:quality.entity_distance")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.entityDistanceScaling")).setValueFormatter(ControlValueFormatterImpls.percentage()).setTooltip((class00392)class00392.L((String)"sodium.options.entity_distance.tooltip")).setRange(50, 500, 25).setDefaultValue(Integer.valueOf(100)).setBinding(n -> this.vanillaOpts.M().method_41748((Object)((double)n.intValue() / 100.0)), () -> Math.round(((Double)this.vanillaOpts.M().method_41753()).floatValue() * 100.0f)).setImpact(OptionImpact.HIGH)).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:quality.entity_shadows")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.entityShadows")).setTooltip((class00392)class00392.L((String)"sodium.options.entity_shadows.tooltip")).setDefaultValue(Boolean.valueOf(true)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.Ny()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.Ny()).method_41753()).setImpact(OptionImpact.MEDIUM)).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:quality.vignette")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.vignette")).setTooltip((class00392)class00392.L((String)"options.vignette.tooltip")).setDefaultValue(Boolean.valueOf(true)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.P()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.P()).method_41753())).addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:quality.fade_time")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.chunkFade")).setTooltip((class00392)class00392.L((String)"options.chunkFade.tooltip")).setDefaultValue(Integer.valueOf(750)).setValueFormatter(ControlValueFormatterImpls.chunkFade()).setRange(new Range(0, 2000, 50)).setBinding(n -> this.vanillaOpts.b().method_41748((Object)((double)n.intValue() / 1000.0)), () -> (int)((Double)this.vanillaOpts.b().method_41753() * 1000.0))));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:quality.mipmap_levels")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.mipmapLevels")).setValueFormatter(ControlValueFormatterImpls.multiplier()).setTooltip((class00392)class00392.L((String)"sodium.options.mipmap_levels.tooltip")).setRange(0, 4, 1).setDefaultValue(Integer.valueOf(4)).setBinding(arg_0 -> ((class04370)this.vanillaOpts.V()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.V()).method_41753()).setImpact(OptionImpact.MEDIUM).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_ASSET_RELOAD})));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createEnumOption(class01894.N((String)"sodium:quality.filtering_mode"), class06532.class).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.textureFiltering")).setTooltip(class065322 -> class00392.L((String)("options.textureFiltering." + class065322.name().toLowerCase(Locale.ROOT) + ".tooltip"))).setElementNameProvider(class065322 -> class00392.L((String)("options.textureFiltering." + class065322.name().toLowerCase(Locale.ROOT)))).setDefaultValue((Enum)class06532.field_64664).setBinding(arg_0 -> ((class04370)this.vanillaOpts.c()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.c()).method_41753()).setImpact(OptionImpact.MEDIUM).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_ASSET_RELOAD})).addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"sodium:quality.anisotropy_bit")).setStorageHandler(this.vanillaStorage).setName((class00392)class00392.L((String)"options.maxAnisotropy")).setRange(new Range(0, 3, 1)).setTooltip((class00392)class00392.L((String)"options.maxAnisotropy.tooltip")).setDefaultValue(Integer.valueOf(0)).setValueFormatter(ControlValueFormatterImpls.anisotropyBit()).setBinding(arg_0 -> ((class04370)this.vanillaOpts.e()).method_41748(arg_0), () -> ((class04370)this.vanillaOpts.e()).method_41753()).setImpact(OptionImpact.MEDIUM).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_ASSET_RELOAD}).setEnabledProvider(configState -> configState.readEnumOption(class01894.N((String)"sodium:quality.filtering_mode"), class06532.class) == class06532.field_64665, new class01894[]{class01894.N((String)"sodium:quality.filtering_mode")})).addOption((OptionBuilder)configBuilder.createEnumOption(class01894.N((String)"sodium:quality.pixel_filtering_mode"), FilterMode.class).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.pixel_filtering_mode.name")).setTooltip((class00392)class00392.L((String)"sodium.options.pixel_filtering_mode.tooltip")).setElementNameProvider(filterMode -> class00392.L((String)("sodium.options.pixel_filtering_mode." + filterMode.name().toLowerCase(Locale.ROOT)))).setDefaultValue((Enum)FilterMode.NEAREST).setBinding(filterMode -> {
            this.sodiumOpts.quality.pixelFilteringMode = filterMode;
            ((class03063)class06202.Nq().B_2).B();
        }, () -> this.sodiumOpts.quality.pixelFilteringMode).setImpact(OptionImpact.MEDIUM)));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:quality.hidden_fluid_culling")).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.hidden_fluid_culling.name")).setTooltip((class00392)class00392.L((String)"sodium.options.hidden_fluid_culling.tooltip")).setImpact(OptionImpact.MEDIUM).setDefaultValue(Boolean.valueOf(SodiumConfigBuilder.DEFAULTS.quality.hiddenFluidCulling)).setBinding(bl -> {
            this.sodiumOpts.quality.hiddenFluidCulling = bl;
        }, () -> this.sodiumOpts.quality.hiddenFluidCulling).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:quality.improved_fluid_shaping")).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.improved_fluid_shaping.name")).setTooltip((class00392)class00392.L((String)"sodium.options.improved_fluid_shaping.tooltip")).setDefaultValue(Boolean.valueOf(SodiumConfigBuilder.DEFAULTS.quality.improvedFluidShaping)).setBinding(bl -> {
            this.sodiumOpts.quality.improvedFluidShaping = bl;
        }, () -> this.sodiumOpts.quality.improvedFluidShaping).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD})).addOption((OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:quality.closest_point_entity_sort")).setStorageHandler(this.sodiumStorage).setName((class00392)class00392.L((String)"sodium.options.closest_point_entity_sort.name")).setTooltip((class00392)class00392.L((String)"sodium.options.closest_point_entity_sort.tooltip")).setImpact(OptionImpact.MEDIUM).setDefaultValue(Boolean.valueOf(SodiumConfigBuilder.DEFAULTS.quality.useClosestPointEntitySort)).setBinding(bl -> {
            this.sodiumOpts.quality.useClosestPointEntitySort = bl;
        }, () -> this.sodiumOpts.quality.useClosestPointEntitySort)));
        return optionPageBuilder;
    }
}

