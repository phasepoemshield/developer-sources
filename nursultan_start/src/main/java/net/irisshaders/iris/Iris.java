/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Throwables
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00627
 *  minecraft.class00647
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04648
 *  minecraft.class04655
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06384
 *  minecraft.class06428
 *  minecraft.class06541
 *  minecraft.class07360
 *  minecraft.class07529
 *  minecraft.class07533
 *  minecraft.class07536
 *  minecraft.class07835
 *  minecraft.class08263
 *  minecraft.class08879
 *  net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer
 *  net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializerRegistry
 *  net.irisshaders.iris.gui.debug.DebugLoadFailedGridScreen
 *  net.irisshaders.iris.gui.screen.ShaderPackScreen
 *  net.irisshaders.iris.helpers.OptionalBoolean
 *  net.irisshaders.iris.pbr.texture.PBRTextureManager
 *  net.irisshaders.iris.pipeline.IrisRenderingPipeline
 *  net.irisshaders.iris.pipeline.PipelineManager
 *  net.irisshaders.iris.pipeline.VanillaRenderingPipeline
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  net.irisshaders.iris.platform.IrisPlatformHelpers
 *  net.irisshaders.iris.shaderpack.DimensionId
 *  net.irisshaders.iris.shaderpack.ShaderPack
 *  net.irisshaders.iris.shaderpack.discovery.ShaderpackDirectoryManager
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  net.irisshaders.iris.shaderpack.option.OptionSet
 *  net.irisshaders.iris.shaderpack.option.Profile
 *  net.irisshaders.iris.shaderpack.option.values.MutableOptionValues
 *  net.irisshaders.iris.shaderpack.option.values.OptionValues
 *  net.irisshaders.iris.shaderpack.programs.ProgramSet
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.vertices.IrisVertexFormats
 *  net.irisshaders.iris.vertices.sodium.EntityToTerrainVertexSerializer
 *  net.irisshaders.iris.vertices.sodium.GlyphExtVertexSerializer
 *  net.irisshaders.iris.vertices.sodium.IrisEntityToTerrainVertexSerializer
 *  net.irisshaders.iris.vertices.sodium.ModelToEntityVertexSerializer
 *  org.lwjgl.opengl.ARBParallelShaderCompile
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.KHRParallelShaderCompile
 */
package net.irisshaders.iris;

import com.google.common.base.Throwables;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Stream;
import java.util.zip.ZipError;
import java.util.zip.ZipException;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00627;
import minecraft.class00647;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04648;
import minecraft.class04655;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06384;
import minecraft.class06428;
import minecraft.class06541;
import minecraft.class07360;
import minecraft.class07529;
import minecraft.class07533;
import minecraft.class07536;
import minecraft.class07835;
import minecraft.class08263;
import minecraft.class08879;
import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer;
import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializerRegistry;
import net.irisshaders.iris.IrisLogging;
import net.irisshaders.iris.UpdateChecker;
import net.irisshaders.iris.compat.dh.DHCompat;
import net.irisshaders.iris.config.IrisConfig;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.buffer.ShaderStorageBufferHolder;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.irisshaders.iris.gl.shader.StandardMacros;
import net.irisshaders.iris.gui.debug.DebugLoadFailedGridScreen;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.helpers.OptionalBoolean;
import net.irisshaders.iris.pbr.texture.PBRTextureManager;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.PipelineManager;
import net.irisshaders.iris.pipeline.VanillaRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import net.irisshaders.iris.shaderpack.DimensionId;
import net.irisshaders.iris.shaderpack.ShaderPack;
import net.irisshaders.iris.shaderpack.discovery.ShaderpackDirectoryManager;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.option.OptionSet;
import net.irisshaders.iris.shaderpack.option.Profile;
import net.irisshaders.iris.shaderpack.option.values.MutableOptionValues;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;
import net.irisshaders.iris.shaderpack.programs.ProgramSet;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.IrisVertexFormats;
import net.irisshaders.iris.vertices.sodium.EntityToTerrainVertexSerializer;
import net.irisshaders.iris.vertices.sodium.GlyphExtVertexSerializer;
import net.irisshaders.iris.vertices.sodium.IrisEntityToTerrainVertexSerializer;
import net.irisshaders.iris.vertices.sodium.ModelToEntityVertexSerializer;
import org.lwjgl.opengl.ARBParallelShaderCompile;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.KHRParallelShaderCompile;

public class Iris {
    public static final String MODID = "iris";
    public static final String MODNAME = "Iris";
    public static final IrisLogging logger;
    public static final boolean IS_FOOL;
    private static final Map<String, String> shaderPackOptionQueue;
    private static final String backupVersionNumber = "1.21.9";
    public static NamespacedId lastDimension;
    public static boolean testing;
    private static Path shaderpacksDirectory;
    private static ShaderpackDirectoryManager shaderpacksDirectoryManager;
    private static ShaderPack currentPack;
    private static String currentPackName;
    private static Optional<Exception> storedError;
    private static boolean initialized;
    private static PipelineManager pipelineManager;
    private static IrisConfig irisConfig;
    private static FileSystem zipFileSystem;
    private static class06428 reloadKeybind;
    private static final class06384 irisKeybindCategory;
    private static class06428 toggleShadersKeybind;
    private static class06428 shaderpackScreenKeybind;
    private static class06428 wireframeKeybind;
    private static boolean resetShaderPackOptions;
    private static String IRIS_VERSION;
    private static UpdateChecker updateChecker;
    private static boolean fallback;
    private static boolean loadShaderPackWhenPossible;

    public static void toggleShaders(class06202 class062022, boolean bl) throws IOException {
        irisConfig.setShadersEnabled(bl);
        irisConfig.save();
        Iris.reload();
        if ((class04453)class062022.T_4 != null) {
            ((class04453)class062022.T_4).method_7353((class00392)(bl ? class00392.N((String)"iris.shaders.toggled", (Object[])new Object[]{currentPackName}) : class00392.L((String)"iris.shaders.disabled")), false);
        }
    }

    public static void loadShaderpack() {
        if (irisConfig == null) {
            if (!initialized) {
                throw new IllegalStateException("Iris::loadShaderpack was called, but Iris::onInitializeClient wasn't called yet. How did this happen?");
            }
            throw new NullPointerException("Iris.irisConfig was null unexpectedly");
        }
        if (!irisConfig.areShadersEnabled()) {
            logger.info("Shaders are disabled because enableShaders is set to false in iris.properties");
            Iris.setShadersDisabled();
            return;
        }
        Optional<String> optional = irisConfig.getShaderPackName();
        if (optional.isEmpty()) {
            logger.info("Shaders are disabled because no valid shaderpack is selected");
            Iris.setShadersDisabled();
            return;
        }
        if (!Iris.loadExternalShaderpack(optional.get())) {
            logger.warn("Falling back to normal rendering without shaders because the shaderpack could not be loaded");
            Iris.setShadersDisabled();
            fallback = true;
        }
    }

    public static void onLoadingComplete() {
        if (!initialized) {
            logger.warn("Iris::onLoadingComplete was called, but Iris::onEarlyInitialize was not called. Trying to avoid a crash but this is an odd state.");
            return;
        }
        lastDimension = DimensionId.OVERWORLD;
        Iris.getPipelineManager().preparePipeline(DimensionId.OVERWORLD);
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static boolean isValidShaderpack(Path path2) {
        if (Files.isDirectory(path2, new LinkOption[0])) {
            if (path2.equals(Iris.getShaderpacksDirectory())) {
                return false;
            }
            return path2.resolve("shaders").toFile().exists();
        }
        if (path2.toString().endsWith(".zip")) {
            try (FileSystem fileSystem = FileSystems.newFileSystem(path2, Iris.class.getClassLoader());){
                boolean bl;
                block18: {
                    Path path3 = fileSystem.getRootDirectories().iterator().next();
                    Stream<Path> stream = Files.walk(path3, new FileVisitOption[0]);
                    try {
                        bl = stream.filter(path -> Files.isDirectory(path, new LinkOption[0])).anyMatch(path -> path.endsWith("shaders"));
                        if (stream == null) break block18;
                    }
                    catch (Throwable throwable) {
                        if (stream != null) {
                            try {
                                stream.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    stream.close();
                }
                return bl;
            }
            catch (ZipError zipError) {
                logger.warn("The ZIP at " + String.valueOf(path2) + " is corrupt");
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return false;
    }

    private static void setShadersDisabled() {
        currentPack = null;
        fallback = false;
        currentPackName = "(off)";
    }

    public static boolean isValidToShowPack(Path path) {
        return Files.isDirectory(path, new LinkOption[0]) || path.toString().endsWith(".zip");
    }

    public static void onRenderSystemInit() {
        if (!initialized) {
            logger.warn("Iris::onRenderSystemInit was called, but Iris::onEarlyInitialize was not called. Trying to avoid a crash but this is an odd state.");
            return;
        }
        if (GL.getCapabilities().GL_KHR_parallel_shader_compile) {
            KHRParallelShaderCompile.glMaxShaderCompilerThreadsKHR((int)10);
        } else if (GL.getCapabilities().GL_ARB_parallel_shader_compile) {
            ARBParallelShaderCompile.glMaxShaderCompilerThreadsARB((int)10);
        }
        PBRTextureManager.INSTANCE.init();
        VertexSerializerRegistry.instance().registerSerializer(class07835.L, IrisVertexFormats.TERRAIN, (VertexSerializer)new EntityToTerrainVertexSerializer());
        VertexSerializerRegistry.instance().registerSerializer(IrisVertexFormats.ENTITY, IrisVertexFormats.TERRAIN, (VertexSerializer)new IrisEntityToTerrainVertexSerializer());
        VertexSerializerRegistry.instance().registerSerializer(class07835.U, IrisVertexFormats.GLYPH, (VertexSerializer)new GlyphExtVertexSerializer());
        VertexSerializerRegistry.instance().registerSerializer(class07835.L, IrisVertexFormats.ENTITY, (VertexSerializer)new ModelToEntityVertexSerializer());
        if (!IrisPlatformHelpers.getInstance().isModLoaded("distanthorizons")) {
            Iris.loadShaderpack();
        }
    }

    public static void handleKeybinds(class06202 class062022) {
        block14: {
            if (loadShaderPackWhenPossible) {
                loadShaderPackWhenPossible = false;
                Iris.loadShaderpack();
            }
            if (reloadKeybind.B()) {
                try {
                    Iris.reload();
                    if ((class04453)class062022.T_4 != null) {
                        ((class04453)class062022.T_4).method_7353((class00392)class00392.L((String)"iris.shaders.reloaded"), false);
                    }
                    break block14;
                }
                catch (Exception exception) {
                    logger.error("Error while reloading Shaders for Iris!", exception);
                    if ((class04453)class062022.T_4 != null) {
                        ((class04453)class062022.T_4).method_7353((class00392)class00392.N((String)"iris.shaders.reloaded.failure", (Object[])new Object[]{Throwables.getRootCause((Throwable)exception).getMessage()}).N(class06541.field_1061), false);
                    }
                    break block14;
                }
            }
            if (toggleShadersKeybind.B()) {
                try {
                    Iris.toggleShaders(class062022, !irisConfig.areShadersEnabled());
                }
                catch (Exception exception) {
                    logger.error("Error while toggling shaders!", exception);
                    if ((class04453)class062022.T_4 != null) {
                        ((class04453)class062022.T_4).method_7353((class00392)class00392.N((String)"iris.shaders.toggled.failure", (Object[])new Object[]{Throwables.getRootCause((Throwable)exception).getMessage()}).N(class06541.field_1061), false);
                    }
                    Iris.setShadersDisabled();
                    fallback = true;
                }
            } else if (shaderpackScreenKeybind.B()) {
                class062022.N((class05096)new ShaderPackScreen(null));
            } else if (wireframeKeybind.B() && irisConfig.areDebugOptionsEnabled() && (class04453)class062022.T_4 != null && !class06202.Nq().q()) {
                ((class04453)class062022.T_4).method_7353((class00392)class00392.y((String)"No cheating; wireframe only in singleplayer!"), false);
            }
        }
    }

    private static void destroyEverything() {
        currentPack = null;
        Iris.getPipelineManager().destroyPipeline();
        if (zipFileSystem != null) {
            try {
                zipFileSystem.close();
            }
            catch (NoSuchFileException noSuchFileException) {
                logger.warn("Failed to close the shaderpack zip when reloading because it was deleted, proceeding anyways.");
            }
            catch (IOException iOException) {
                logger.error("Failed to close zip file system?", iOException);
            }
        }
    }

    public static PipelineManager getPipelineManager() {
        if (pipelineManager == null) {
            pipelineManager = new PipelineManager(Iris::createPipeline);
        }
        return pipelineManager;
    }

    public void onEarlyInitialize() {
        IRIS_VERSION = IrisPlatformHelpers.getInstance().getVersion();
        updateChecker = new UpdateChecker(IRIS_VERSION);
        reloadKeybind = IrisPlatformHelpers.getInstance().registerKeyBinding(new class06428("iris.keybind.reload", class04648.field_1668, 82, irisKeybindCategory));
        toggleShadersKeybind = IrisPlatformHelpers.getInstance().registerKeyBinding(new class06428("iris.keybind.toggleShaders", class04648.field_1668, 75, irisKeybindCategory));
        shaderpackScreenKeybind = IrisPlatformHelpers.getInstance().registerKeyBinding(new class06428("iris.keybind.shaderPackSelection", class04648.field_1668, 79, irisKeybindCategory));
        wireframeKeybind = IrisPlatformHelpers.getInstance().registerKeyBinding(new class06428("iris.keybind.wireframe", class04648.field_1668, class04655.yI.y(), irisKeybindCategory));
        DHCompat.run();
        try {
            if (!Files.exists(Iris.getShaderpacksDirectory(), new LinkOption[0])) {
                Files.createDirectories(Iris.getShaderpacksDirectory(), new FileAttribute[0]);
            }
        }
        catch (IOException iOException) {
            logger.warn("Failed to create the shaderpacks directory!");
            logger.warn("", iOException);
        }
        irisConfig = new IrisConfig(IrisPlatformHelpers.getInstance().getConfigDir().resolve("iris.properties"), IrisPlatformHelpers.getInstance().getConfigDir().resolve("iris-excluded.json"));
        try {
            irisConfig.initialize();
        }
        catch (IOException iOException) {
            logger.error("Failed to initialize Iris configuration, default values will be used instead");
            logger.error("", iOException);
        }
        updateChecker.checkForUpdates(irisConfig);
        initialized = true;
    }

    public static String getReleaseTarget() {
        class07529.N();
        return class07529.y().comp_4031() ? class07529.y().comp_4025() : backupVersionNumber;
    }

    public static boolean isPackInUseQuick() {
        return Iris.getPipelineManager().getPipelineNullable() instanceof IrisRenderingPipeline;
    }

    private static WorldRenderingPipeline createPipeline(NamespacedId namespacedId) {
        if (currentPack == null) {
            return new VanillaRenderingPipeline();
        }
        ProgramSet programSet = currentPack.getProgramSet(namespacedId);
        try {
            return new IrisRenderingPipeline(programSet);
        }
        catch (Exception exception) {
            Iris.handleException(exception);
            ShaderStorageBufferHolder.forceDeleteBuffers();
            logger.error("Failed to create shader rendering pipeline, disabling shaders!", exception);
            fallback = true;
            return new VanillaRenderingPipeline();
        }
    }

    public static UpdateChecker getUpdateChecker() {
        return updateChecker;
    }

    public static String getVersionSimple() {
        return Iris.getVersion().split("\\+")[0];
    }

    public static IrisConfig getIrisConfig() {
        return irisConfig;
    }

    public static Optional<Exception> getStoredError() {
        Optional<Exception> optional = storedError;
        storedError = Optional.empty();
        return optional;
    }

    public static void reload() throws IOException {
        irisConfig.initialize();
        CapturedRenderingState.INSTANCE.resetTextureReloadCount();
        Iris.destroyEverything();
        Iris.loadShaderpack();
        if ((class03448)class06202.Nq().T_3 != null) {
            Iris.getPipelineManager().preparePipeline(Iris.getCurrentDimension());
        }
    }

    public static boolean isFallback() {
        return fallback;
    }

    public static void queueShaderPackOptionsFromProperties(Properties properties) {
        Iris.queueDefaultShaderPackOptionValues();
        properties.stringPropertyNames().forEach(string -> Iris.getShaderPackOptionQueue().put((String)string, properties.getProperty((String)string)));
    }

    public static boolean shouldResetShaderPackOptionsOnNextReload() {
        return resetShaderPackOptions;
    }

    private static void handleException(Exception exception) {
        if (irisConfig.areDebugOptionsEnabled()) {
            class06202.Nq().N((class05096)new DebugLoadFailedGridScreen((class05096)class06202.Nq().v_3, (class00392)class00392.y((String)(exception instanceof ShaderCompileException ? "Failed to compile shaders" : "Exception")), exception));
        } else if ((class04453)class06202.Nq().T_4 != null) {
            ((class04453)class06202.Nq().T_4).method_7353((class00392)class00392.L((String)(exception instanceof ShaderCompileException ? "iris.load.failure.shader" : "iris.load.failure.generic")).y((class00392)class00392.y((String)"Copy Info").N(class004052 -> class004052.L(Boolean.valueOf(true)).N(class06541.field_1078).N((class00647)new class00627(exception.getMessage())).N((class00395)new class00401((class00392)class00392.L((String)"chat.copy.click"))))), false);
        } else {
            storedError = Optional.of(exception);
        }
    }

    public static String getVersion() {
        if (IRIS_VERSION == null) {
            return "Version info unknown!";
        }
        return IRIS_VERSION;
    }

    public static void resetShaderPackOptionsOnNextReload() {
        resetShaderPackOptions = true;
    }

    public static void queueDefaultShaderPackOptionValues() {
        Iris.clearShaderPackOptionQueue();
        Iris.getCurrentPack().ifPresent(shaderPack -> {
            OptionSet optionSet = shaderPack.getShaderPackOptions().getOptionSet();
            OptionValues optionValues = shaderPack.getShaderPackOptions().getOptionValues();
            optionSet.getStringOptions().forEach((string, mergedStringOption) -> {
                if (optionValues.getStringValue(string).isPresent()) {
                    Iris.getShaderPackOptionQueue().put((String)string, mergedStringOption.getOption().getDefaultValue());
                }
            });
            optionSet.getBooleanOptions().forEach((string, mergedBooleanOption) -> {
                if (optionValues.getBooleanValue(string) != OptionalBoolean.DEFAULT) {
                    Iris.getShaderPackOptionQueue().put((String)string, Boolean.toString(mergedBooleanOption.getOption().getDefaultValue()));
                }
            });
        });
    }

    public static void queueShaderPackOptionsFromProfile(Profile profile) {
        Iris.getShaderPackOptionQueue().putAll(profile.optionValues);
    }

    public static ShaderpackDirectoryManager getShaderpacksDirectoryManager() {
        if (shaderpacksDirectoryManager == null) {
            shaderpacksDirectoryManager = new ShaderpackDirectoryManager(Iris.getShaderpacksDirectory());
        }
        return shaderpacksDirectoryManager;
    }

    private static void tryUpdateConfigPropertiesFile(Path path, Properties properties) {
        try {
            if (properties.isEmpty()) {
                if (Files.exists(path, new LinkOption[0])) {
                    Files.delete(path);
                }
                return;
            }
            try (OutputStream outputStream = Files.newOutputStream(path, new OpenOption[0]);){
                properties.store(outputStream, null);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static String getCurrentPackName() {
        return currentPackName;
    }

    public static Optional<ShaderPack> getCurrentPack() {
        return Optional.ofNullable(currentPack);
    }

    public static void setDebug(boolean bl) {
        int n;
        try {
            irisConfig.setDebugEnabled(bl);
            irisConfig.save();
        }
        catch (IOException iOException) {
            logger.fatal("Failed to save config!", iOException);
        }
        if (bl) {
            n = GLDebug.setupDebugMessageCallback();
        } else {
            GLDebug.reloadDebugState();
            class08263.N((int)((class05630)class06202.Nq().i_7).j, (boolean)false, new HashSet(((class08879)RenderSystem.getDevice()).getEnabledExtensions()));
            n = 1;
        }
        logger.info("Debug functionality is " + (bl ? "enabled, logging will be more verbose!" : "disabled."));
        if ((class04453)class06202.Nq().T_4 != null) {
            if (IrisPlatformHelpers.getInstance().useELS()) {
                ((class04453)class06202.Nq().T_4).method_7353((class00392)class00392.L((String)"iris.shaders.debug.restartNoDebug"), false);
            } else {
                ((class04453)class06202.Nq().T_4).method_7353((class00392)class00392.L((String)(n != 0 ? (bl ? "iris.shaders.debug.enabled" : "iris.shaders.debug.disabled") : "iris.shaders.debug.failure")), false);
            }
            if (n == 2 && !IrisPlatformHelpers.getInstance().useELS()) {
                ((class04453)class06202.Nq().T_4).method_7353((class00392)class00392.L((String)"iris.shaders.debug.restart"), false);
            }
        }
    }

    public static boolean shouldActivateWireframe() {
        return irisConfig.areDebugOptionsEnabled() && wireframeKeybind.R();
    }

    private static boolean loadExternalShaderpack(String string2) {
        Path path;
        Object object;
        Path path2;
        Path path3;
        try {
            path3 = Iris.getShaderpacksDirectory().resolve(string2);
            path2 = Iris.getShaderpacksDirectory().resolve(string2 + ".txt");
        }
        catch (InvalidPathException invalidPathException) {
            logger.error("Failed to load the shaderpack \"{}\" because it contains invalid characters in its path", string2);
            return false;
        }
        if (!Iris.isValidShaderpack(path3)) {
            logger.error("Pack \"{}\" is not valid! Can't load it.", string2);
            return false;
        }
        boolean bl2 = false;
        if (!Files.isDirectory(path3, new LinkOption[0]) && path3.toString().endsWith(".zip")) {
            try {
                object = Iris.loadExternalZipShaderpack(path3);
            }
            catch (FileSystemNotFoundException | NoSuchFileException exception) {
                logger.error("Failed to load the shaderpack \"{}\" because it does not exist in your shaderpacks folder!", string2);
                return false;
            }
            catch (ZipException zipException) {
                logger.error("The shaderpack \"{}\" appears to be corrupted, please try downloading it again!", string2);
                return false;
            }
            catch (IOException iOException) {
                logger.error("Failed to load the shaderpack \"{}\"!", string2);
                logger.error("", iOException);
                return false;
            }
            if (!((Optional)object).isPresent()) {
                logger.error("Could not load the shaderpack \"{}\" because it appears to lack a \"shaders\" directory", string2);
                return false;
            }
            path = ((Optional)object).get();
            bl2 = true;
        } else {
            if (!Files.exists(path3, new LinkOption[0])) {
                logger.error("Failed to load the shaderpack \"{}\" because it does not exist!", string2);
                return false;
            }
            path = path3.resolve("shaders");
        }
        if (!Files.exists(path, new LinkOption[0])) {
            logger.error("Could not load the shaderpack \"{}\" because it appears to lack a \"shaders\" directory", string2);
            return false;
        }
        object = Iris.tryReadConfigProperties(path2).map(properties -> properties).orElse(new HashMap());
        object.putAll(shaderPackOptionQueue);
        Iris.clearShaderPackOptionQueue();
        if (resetShaderPackOptions) {
            object.clear();
        }
        resetShaderPackOptions = false;
        try {
            currentPack = new ShaderPack(path, (Map)object, StandardMacros.createStandardEnvironmentDefines(), bl2);
            MutableOptionValues mutableOptionValues = currentPack.getShaderPackOptions().getOptionValues().mutableCopy();
            Properties properties2 = new Properties();
            mutableOptionValues.getBooleanValues().forEach((string, bl) -> properties2.setProperty((String)string, Boolean.toString(bl)));
            mutableOptionValues.getStringValues().forEach(properties2::setProperty);
            Iris.tryUpdateConfigPropertiesFile(path2, properties2);
        }
        catch (Exception exception) {
            logger.error("Failed to load the shaderpack \"{}\"!", string2);
            logger.error("", exception);
            Iris.handleException(exception);
            return false;
        }
        fallback = false;
        currentPackName = string2;
        logger.info("Using shaderpack: " + string2);
        return true;
    }

    private static Optional<Properties> tryReadConfigProperties(Path path) {
        Properties properties = new Properties();
        if (Files.exists(path, new LinkOption[0])) {
            try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
                properties.load(inputStream);
            }
            catch (IOException iOException) {
                return Optional.empty();
            }
        }
        return Optional.of(properties);
    }

    public static void duringRenderSystemInit() {
        Iris.setDebug(irisConfig.areDebugOptionsEnabled());
    }

    public static Path getShaderpacksDirectory() {
        if (shaderpacksDirectory == null) {
            shaderpacksDirectory = IrisPlatformHelpers.getInstance().getGameDir().resolve("shaderpacks");
        }
        return shaderpacksDirectory;
    }

    public static void clearShaderPackOptionQueue() {
        Iris.getShaderPackOptionQueue().clear();
    }

    private static Optional<Path> loadExternalZipShaderpack(Path path2) throws IOException {
        FileSystem fileSystem;
        zipFileSystem = fileSystem = FileSystems.newFileSystem(path2, Iris.class.getClassLoader());
        Path path3 = fileSystem.getRootDirectories().iterator().next();
        Path path4 = fileSystem.getPath("shaders", new String[0]);
        if (Files.exists(path4, new LinkOption[0])) {
            return Optional.of(path4);
        }
        try (Stream<Path> stream = Files.walk(path3, new FileVisitOption[0]);){
            Optional<Path> optional = stream.filter(path -> Files.isDirectory(path, new LinkOption[0])).filter(path -> path.endsWith("shaders")).findFirst();
            return optional;
        }
    }

    public static String getBackupVersionNumber() {
        return backupVersionNumber;
    }

    public static void loadShaderpackWhenPossible() {
        loadShaderPackWhenPossible = true;
    }

    public static Map<String, String> getShaderPackOptionQueue() {
        return shaderPackOptionQueue;
    }

    public static boolean loadedIncompatiblePack() {
        return DHCompat.lastPackIncompatible();
    }

    public static NamespacedId getCurrentDimension() {
        class03448 class034482 = (class03448)class06202.Nq().T_3;
        if (class034482 != null) {
            NamespacedId namespacedId = new NamespacedId(class034482.method_27983().N().y(), class034482.method_27983().N().N());
            ShaderPack shaderPack = Iris.getCurrentPack().orElse(null);
            if (shaderPack != null && shaderPack.getDimensionMap().containsKey(namespacedId)) {
                return namespacedId;
            }
            class07360 class073602 = class034482.method_8597().m();
            if (class073602 == class07360.field_64387) {
                return DimensionId.END;
            }
            if (class073602 == class07360.field_64386) {
                return DimensionId.OVERWORLD;
            }
            return namespacedId;
        }
        return lastDimension;
    }

    public static String getFormattedVersion() {
        class06541 class065412;
        Object object = Iris.getVersion();
        if (IrisPlatformHelpers.getInstance().isDevelopmentEnvironment()) {
            class065412 = class06541.field_1065;
            object = (String)object + " (Development Environment)";
        } else {
            class065412 = ((String)object).endsWith("-dirty") || ((String)object).contains("unknown") || ((String)object).endsWith("-nogit") ? class06541.field_1061 : (((String)object).contains("+rev.") ? class06541.field_1076 : class06541.field_1060);
        }
        return String.valueOf(class065412) + (String)object;
    }

    static {
        Calendar c;
        logger = new IrisLogging(MODNAME);
        shaderPackOptionQueue = new HashMap<String, String>();
        lastDimension = null;
        testing = false;
        storedError = Optional.empty();
        resetShaderPackOptions = false;
        if (!IrisPlatformHelpers.getInstance().isDevelopmentEnvironment() || !System.getProperty("user.name").contains("ims") || class07536.m() == class07533.field_1135) {
            // empty if block
        }
        IS_FOOL = (c = Calendar.getInstance()).get(2) == 3 && c.get(5) == 1;
    }
}

