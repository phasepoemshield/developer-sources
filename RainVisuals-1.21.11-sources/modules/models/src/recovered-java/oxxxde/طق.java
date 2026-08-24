/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  net.fabricmc.loader.api.FabricLoader
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.render.GuiRenderer
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.LivingEntity
 */
package oxxxde;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oxxxde.\u0628\u0633;
import oxxxde.\u062e\u0651;
import oxxxde.\u062f\u0633;
import oxxxde.\u0634\u0622;
import oxxxde.\u0637\u0639;

public final class \u0637\u0642 {
    private static volatile String status;
    private static Method figuraAvatarTickMethod;
    private static final AtomicInteger APPLY_GENERATION;
    private static final long PREVIEW_RETRY_DELAY_MILLIS = 5000L;
    private static final Logger LOGGER;
    private static Field figuraFetchedUsersField;
    private static final int MAX_PREVIEW_ATTEMPTS = 3;
    private static volatile String applyingAvatarId;
    private static volatile String appliedAvatarId;
    private static final long PREVIEW_FADE_IN_MILLIS = 180L;
    private static final AtomicInteger PREVIEW_GENERATION;
    private static Method figuraUserDataGetAvatarMethod;
    private static final Map<String, \u0628\u0633> PREVIEWS;
    private static Field figuraLoadedUsersField;
    private static Method figuraUserDataClearMethod;
    private static final long PREVIEW_LOAD_TIMEOUT_MILLIS = 30000L;
    private static Method figuraLoadAvatarMethod;
    private static final AtomicBoolean APPLYING;
    private static Constructor<?> figuraUserDataConstructor;

    private static synchronized void ensurePreviewReflection() throws Exception {
        if (figuraUserDataConstructor != null) {
            return;
        }
        Class<?> userDataClass = Class.forName("other.figura.avatar.UserData");
        Class<?> loaderClass = Class.forName("other.figura.avatar.local.LocalAvatarLoader");
        Class<?> managerClass = Class.forName("other.figura.avatar.AvatarManager");
        Class[] classArray = new Class[1];
        classArray[0] = UUID.class;
        figuraUserDataConstructor = userDataClass.getConstructor(classArray);
        Class[] classArray2 = new Class[2];
        classArray2[0] = Path.class;
        classArray2[1] = userDataClass;
        figuraLoadAvatarMethod = loaderClass.getDeclaredMethod("loadAvatar", classArray2);
        figuraUserDataGetAvatarMethod = userDataClass.getMethod("getMainAvatar", new Class[0]);
        figuraUserDataClearMethod = userDataClass.getMethod("clear", new Class[0]);
        figuraLoadedUsersField = managerClass.getDeclaredField("LOADED_USERS");
        figuraFetchedUsersField = managerClass.getDeclaredField("FETCHED_USERS");
        try {
            figuraAvatarTickMethod = Class.forName("other.figura.avatar.Avatar").getMethod("tick", new Class[0]);
        }
        catch (Throwable throwable) {
            figuraAvatarTickMethod = null;
        }
        figuraLoadAvatarMethod.setAccessible(true);
        figuraLoadedUsersField.setAccessible(true);
        figuraFetchedUsersField.setAccessible(true);
        Object[] objectArray = new Object[4];
        objectArray[0] = userDataClass.getName();
        objectArray[1] = loaderClass.getName();
        objectArray[2] = managerClass.getName();
        objectArray[3] = figuraAvatarTickMethod == null ? "unavailable" : figuraAvatarTickMethod.toGenericString();
        LOGGER.info("Figura preview reflection initialized: userData={}, loader={}, manager={}, tickMethod={}", objectArray);
    }

    public static boolean isFiguraLoaded() {
        try {
            FabricLoader loader = FabricLoader.getInstance();
            return loader.isModLoaded("figura_model_runtime") || loader.isModLoaded("figura");
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean clearLocalAvatar() {
        try {
            Class<?> manager = Class.forName("other.figura.avatar.AvatarManager");
            MinecraftClient minecraft = MinecraftClient.getInstance();
            UUID playerId = minecraft.player == null ? null : minecraft.player.getUuid();
            Class[] classArray = new Class[1];
            classArray[0] = Path.class;
            Method exactPath = \u0637\u0642.findExactMethod(manager, "loadLocalAvatar", classArray);
            if (exactPath != null) {
                Object[] objectArray = new Object[1];
                objectArray[0] = null;
                if (\u0637\u0642.invokeAvatarLoad(exactPath, objectArray)) {
                    \u0637\u0642.detachLocalUserData(manager, playerId);
                    return true;
                }
            }
            if (playerId == null) {
                return false;
            }
            Class[] classArray2 = new Class[1];
            classArray2[0] = UUID.class;
            Method clearAvatars = \u0637\u0642.findExactMethod(manager, "clearAvatars", classArray2);
            if (clearAvatars != null) {
                void var2_3;
                Object[] objectArray = new Object[1];
                objectArray[0] = var2_3;
                if (\u0637\u0642.invokeAvatarLoad(clearAvatars, objectArray)) {
                    void var0;
                    \u0637\u0642.detachLocalUserData(var0, (UUID)var2_3);
                    return true;
                }
            }
        }
        catch (Throwable throwable) {
        }
        return false;
    }

    private static void clearUserData(Object userData) {
        if (userData == null || figuraUserDataClearMethod == null) {
            return;
        }
        try {
            figuraUserDataClearMethod.invoke(userData, new Object[0]);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static boolean renderPreview(String avatarId, DrawContext graphics, GuiRenderer guiRenderer, GpuBufferSlice fogBuffer, int left, int top, int right, int bottom, int size, float lookX, float lookY, ClientPlayerEntity player) {
        return \u0637\u0642.renderPreviewInternal(avatarId, graphics, guiRenderer, fogBuffer, left, top, right, bottom, size, lookX, lookY, player, true);
    }

    public static boolean isApplying(String avatarId) {
        String normalized = \u0637\u0642.normalizeAvatarId(avatarId);
        return normalized != null && normalized.equals(applyingAvatarId) && APPLYING.get();
    }

    public static void removeAppliedAvatar() {
        APPLY_GENERATION.incrementAndGet();
        applyingAvatarId = "";
        appliedAvatarId = "";
        APPLYING.set(false);
        MinecraftClient minecraft = MinecraftClient.getInstance();
        if (minecraft == null) {
            status = "Minecraft is not ready";
            return;
        }
        Runnable removeAvatar = () -> {
            if (!\u0637\u0642.isFiguraLoaded()) {
                status = "Model removed";
                return;
            }
            status = \u0637\u0642.clearLocalAvatar() ? "Model removed" : "Failed to remove model";
        };
        if (minecraft.isOnThread()) {
            removeAvatar.run();
        } else {
            minecraft.execute(removeAvatar);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void loadPreviewOnClientThread(\u0628\u0633 preview, Path avatarPath, UUID playerId) {
        try {
            void var3_3;
            Object[] objectArray = new Object[3];
            objectArray[0] = preview.avatarId;
            objectArray[1] = avatarPath;
            objectArray[2] = playerId;
            LOGGER.debug("Initializing Figura preview loader: id={}, path={}, player={}", objectArray);
            \u0637\u0642.ensurePreviewReflection();
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = playerId;
            Object userData = figuraUserDataConstructor.newInstance(objectArray2);
            Object[] objectArray3 = new Object[2];
            objectArray3[0] = avatarPath;
            objectArray3[1] = userData;
            figuraLoadAvatarMethod.invoke(null, objectArray3);
            LOGGER.debug("Figura accepted preview load request: id={}, userDataClass={}", (Object)preview.avatarId, (Object)userData.getClass().getName());
            if (preview.generation != PREVIEW_GENERATION.get()) {
                \u0637\u0642.clearUserData(userData);
                \u0637\u0642.failPreview(preview, "preview generation changed", null);
                return;
            }
            preview.userData = var3_3;
        }
        catch (Throwable throwable) {
            \u0628\u0633 \u0628\u06332;
            \u0637\u0642.failPreview(\u0628\u06332, "Figura loader invocation failed", throwable);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean hasPreviewFailed(String avatarId) {
        String normalized = \u0637\u0642.normalizeAvatarId(avatarId);
        if (normalized == null) {
            return false;
        }
        \u0628\u0633 \u0628\u06332 = PREVIEWS.get(normalized);
        \u0628\u0633 preview = \u0628\u06332;
        if (preview == null) return false;
        if (!preview.failed) return false;
        return true;
    }

    public static void clearPreviewCache() {
        int generation = PREVIEW_GENERATION.incrementAndGet();
        LOGGER.info("Clearing Figura preview cache: previews={}, generation={}", (Object)PREVIEWS.size(), (Object)generation);
        for (\u0628\u0633 preview : PREVIEWS.values()) {
            \u0637\u0642.clearUserData(preview.userData);
        }
        PREVIEWS.clear();
        \u0634\u0622.clearCache();
    }

    /*
     * WARNING - void declaration
     */
    private static Path installedAvatarPath(String avatarId) {
        void var3_3;
        block6: {
            block5: {
                String normalized = \u0637\u0642.normalizeAvatarId(avatarId);
                if (!\u0637\u0642.isSafeAvatarId(normalized)) {
                    return null;
                }
                Path root = \u062f\u0633.avatarsDirectory();
                if (root == null) {
                    return null;
                }
                Path avatarPath = root.resolve(normalized).normalize();
                if (!avatarPath.startsWith(root)) break block5;
                if (Files.isRegularFile(avatarPath.resolve("avatar.json"), new LinkOption[0])) break block6;
            }
            return null;
        }
        return var3_3;
    }

    static {
        LOGGER = LoggerFactory.getLogger("Rain Figura Runtime");
        PREVIEWS = new ConcurrentHashMap<String, \u0628\u0633>();
        APPLYING = new AtomicBoolean(false);
        APPLY_GENERATION = new AtomicInteger();
        PREVIEW_GENERATION = new AtomicInteger();
        applyingAvatarId = "";
        appliedAvatarId = "";
        status = "";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void freezePreviewAnimations(\u0628\u0633 preview) {
        Object avatar = preview.avatar;
        if (avatar == null || preview.animationsFrozen) {
            return;
        }
        try {
            avatar.getClass().getMethod("clearAnimations", new Class[0]).invoke(avatar, new Object[0]);
            Object animations = avatar.getClass().getField("animations").get(avatar);
            if (animations instanceof Map) {
                Map animationMap = (Map)animations;
                for (Object animation : animationMap.values()) {
                    if (animation == null) continue;
                    animation.getClass().getMethod("stop", new Class[0]).invoke(animation, new Object[0]);
                }
            }
            preview.animationsFrozen = true;
        }
        catch (Throwable throwable) {
            preview.animationsFrozen = true;
        }
        catch (Throwable throwable) {
            var0.animationsFrozen = true;
            throw throwable;
        }
    }

    public static String status() {
        return status;
    }

    /*
     * Unable to fully structure code
     */
    private static boolean invokeAvatarLoad(Method method, Object ... args) {
        try {
            method.setAccessible(true);
            \u0637\u0642.LOGGER.debug("Invoking Figura model loader: method={}, args={}", (Object)method.toGenericString(), (Object)Arrays.toString(args));
            result = method.invoke(null, args);
            if (!(result instanceof Boolean)) ** GOTO lbl-1000
            booleanResult = (Boolean)result;
            if (booleanResult.booleanValue()) lbl-1000:
            // 2 sources

            {
                v0 = true;
            } else {
                v0 = false;
            }
            accepted = v0;
            if (accepted) {
                \u0637\u0642.LOGGER.info("Figura model loader invocation succeeded: method={}", (Object)method.toGenericString());
            } else {
                \u0637\u0642.LOGGER.warn("Figura model loader returned false: method={}", (Object)method.toGenericString());
            }
            return (boolean)var3_5;
        }
        catch (Throwable throwable) {
            \u0637\u0642.LOGGER.error("Figura model loader invocation failed: method={}", (Object)method.toGenericString(), (Object)var2_3);
            return false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void requestPreview(String avatarId, \u0628\u0633 preview, UUID playerId) {
        long now;
        block8: {
            block7: {
                now = System.currentTimeMillis();
                if (preview.ready || preview.loading) break block7;
                if (!preview.failed) break block8;
                if (preview.attempts < 3 && now - preview.failedAtMillis >= 5000L) break block8;
            }
            return;
        }
        \u0628\u0633 \u0628\u06332 = preview;
        synchronized (\u0628\u06332) {
            block10: {
                block9: {
                    now = System.currentTimeMillis();
                    if (preview.ready || preview.loading) break block9;
                    if (!preview.failed) break block10;
                    if (preview.attempts < 3 && now - preview.failedAtMillis >= 5000L) break block10;
                }
                return;
            }
            preview.loading = true;
            preview.failed = false;
            ++preview.attempts;
            preview.generation = PREVIEW_GENERATION.get();
            preview.avatarId = avatarId;
            preview.requestedAtMillis = now;
        }
        Object[] objectArray = new Object[4];
        objectArray[0] = avatarId;
        objectArray[1] = preview.generation;
        objectArray[2] = preview.attempts;
        objectArray[3] = playerId;
        LOGGER.info("Starting Figura preview preparation: id={}, generation={}, attempt={}, player={}", objectArray);
        Thread thread2 = new Thread(() -> {
            try {
                \u062f\u0633.installBlocking(avatarId);
                Path avatarPath = \u0637\u0642.installedAvatarPath(avatarId);
                if (avatarPath == null) {
                    \u0637\u0642.failPreview(preview, "installed model path was not found", null);
                    return;
                }
                LOGGER.debug("Preview model files are ready: id={}, path={}", (Object)avatarId, (Object)avatarPath);
                MinecraftClient minecraft = MinecraftClient.getInstance();
                if (minecraft == null) {
                    \u0637\u0642.failPreview(preview, "Minecraft is unavailable", null);
                    return;
                }
                LOGGER.debug("Scheduling preview load on the client thread: id={}", (Object)avatarId);
                minecraft.execute(() -> \u0637\u0642.loadPreviewOnClientThread(preview, avatarPath, playerId));
            }
            catch (Throwable throwable) {
                void var3_4;
                \u0637\u0642.failPreview(preview, "installation failed", (Throwable)var3_4);
            }
        }, "Rain-Figura-Avatar-Preview-" + avatarId);
        ((Thread)((Object)\u0628\u06332)).setDaemon(true);
        ((Thread)((Object)\u0628\u06332)).start();
    }

    private \u0637\u0642() {
    }

    private static boolean renderPreviewInternal(String avatarId, DrawContext graphics, GuiRenderer guiRenderer, GpuBufferSlice fogBuffer, int left, int top, int right, int bottom, int size, float lookX, float lookY, ClientPlayerEntity player, boolean tickAvatar) {
        \u0628\u0633 preview;
        block9: {
            block8: {
                String normalized;
                block7: {
                    block6: {
                        normalized = \u0637\u0642.normalizeAvatarId(avatarId);
                        if (graphics == null) break block6;
                        if (guiRenderer == null) break block6;
                        if (fogBuffer == null) break block6;
                        if (\u0637\u0642.preparePreview(normalized, player) == \u0637\u0639.READY) break block7;
                    }
                    return false;
                }
                preview = PREVIEWS.get(normalized);
                if (preview == null) break block8;
                if (preview.userData != null) break block9;
            }
            return false;
        }
        \u0637\u0642.freezePreviewAnimations(preview);
        \u0637\u0642.setPreviewOpacity(preview.avatar, tickAvatar ? \u0637\u0642.previewFadeProgress(preview) : 1.0f);
        return \u0637\u0642.renderWithTemporaryUserData(player.getUuid(), preview.userData, () -> {
            if (tickAvatar) {
                \u0637\u0642.tickPreviewAvatar(preview, false);
            }
            InventoryScreen.drawEntity((DrawContext)graphics, (int)left, (int)top, (int)right, (int)bottom, (int)size, (float)0.0625f, (float)lookX, (float)lookY, (LivingEntity)player);
            guiRenderer.render(fogBuffer);
        });
    }

    private static float previewFadeProgress(\u0628\u0633 preview) {
        if (preview.readyAtMillis <= 0L) {
            return 1.0f;
        }
        return Math.min(1.0f, (float)(System.currentTimeMillis() - preview.readyAtMillis) / 180.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean canRetryPreview(String avatarId) {
        String normalized = \u0637\u0642.normalizeAvatarId(avatarId);
        if (normalized == null) {
            return false;
        }
        \u0628\u0633 \u0628\u06332 = PREVIEWS.get(normalized);
        \u0628\u0633 preview = \u0628\u06332;
        if (preview == null) return false;
        if (!preview.failed) return false;
        if (preview.attempts >= 3) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static void installAndApplyCosmeticsAsync(Collection<String> avatarIds) {
        void var5_7;
        ArrayList<String> selectedCosmetics;
        block4: {
            block3: {
                selectedCosmetics = new ArrayList<String>();
                Iterator<String> iterator2 = avatarIds.iterator();
                while (iterator2.hasNext()) {
                    String avatarId = iterator2.next();
                    String normalized = \u0637\u0642.normalizeAvatarId(avatarId);
                    if (!\u0637\u0642.isSafeAvatarId(normalized)) continue;
                    selectedCosmetics.add(normalized);
                }
                if (selectedCosmetics.isEmpty()) break block3;
                if (APPLYING.compareAndSet(false, true)) break block4;
            }
            LOGGER.info("Ignored cosmetics apply request: selected={}, active={}", (Object)selectedCosmetics, (Object)(APPLYING.get() ? applyingAvatarId : "none"));
            return;
        }
        int generation = APPLY_GENERATION.incrementAndGet();
        long startedAt = System.currentTimeMillis();
        applyingAvatarId = "rain-cosmetics";
        status = "Installing cosmetics";
        LOGGER.info("Starting cosmetics installation and apply: ids={}, generation={}", (Object)selectedCosmetics, (Object)generation);
        Thread thread2 = new Thread(() -> {
            try {
                String combinedId = \u062f\u0633.installCombinedCosmetics(selectedCosmetics);
                Path avatarPath = \u0637\u0642.installedAvatarPath(combinedId);
                if (avatarPath == null) {
                    status = "Cosmetic files not found";
                    LOGGER.warn("Combined cosmetics path is unavailable: id={}, selected={}", (Object)combinedId, (Object)selectedCosmetics);
                    \u0637\u0642.finishApply(generation);
                    return;
                }
                LOGGER.debug("Combined cosmetics files are ready: id={}, path={}", (Object)combinedId, (Object)avatarPath);
                MinecraftClient minecraft = MinecraftClient.getInstance();
                if (minecraft == null) {
                    status = "Minecraft is not ready";
                    LOGGER.warn("Minecraft is unavailable while applying cosmetics: id={}", (Object)combinedId);
                    \u0637\u0642.finishApply(generation);
                    return;
                }
                minecraft.execute(() -> {
                    block7: {
                        block6: {
                            block5: {
                                try {
                                    if (generation == APPLY_GENERATION.get()) break block5;
                                    LOGGER.debug("Discarded stale cosmetics apply task: id={}, generation={}", (Object)combinedId, (Object)generation);
                                }
                                catch (Throwable throwable) {
                                    int n;
                                    \u0637\u0642.finishApply(n);
                                    throw throwable;
                                }
                                \u0637\u0642.finishApply(generation);
                                return;
                            }
                            if (\u0637\u0642.isFiguraLoaded()) break block6;
                            status = "Model runtime is not loaded";
                            LOGGER.warn("Figura runtime is not loaded while applying cosmetics: id={}", (Object)combinedId);
                            \u0637\u0642.finishApply(generation);
                            return;
                        }
                        boolean applied = \u0637\u0642.applyLocalAvatar(avatarPath);
                        if (applied) {
                            appliedAvatarId = combinedId;
                            status = "Cosmetics applied";
                            Object[] objectArray = new Object[3];
                            objectArray[0] = combinedId;
                            objectArray[1] = generation;
                            objectArray[2] = System.currentTimeMillis() - startedAt;
                            LOGGER.info("Cosmetics applied successfully: id={}, generation={}, duration={}ms", objectArray);
                            break block7;
                        }
                        status = "Failed to apply cosmetics";
                        Object[] objectArray = new Object[4];
                        objectArray[0] = combinedId;
                        objectArray[1] = avatarPath;
                        objectArray[2] = generation;
                        objectArray[3] = System.currentTimeMillis() - startedAt;
                        LOGGER.error("Figura rejected cosmetics apply: id={}, path={}, generation={}, duration={}ms", objectArray);
                    }
                    \u0637\u0642.finishApply(generation);
                });
            }
            catch (Throwable throwable) {
                void var1_1;
                if (generation == APPLY_GENERATION.get()) {
                    status = "Cosmetics runtime error: " + throwable.getClass().getSimpleName();
                }
                Object[] objectArray = new Object[4];
                objectArray[0] = selectedCosmetics;
                objectArray[1] = generation;
                objectArray[2] = System.currentTimeMillis() - startedAt;
                objectArray[3] = throwable;
                LOGGER.error("Cosmetics installation or apply failed: ids={}, generation={}, duration={}ms", objectArray);
                \u0637\u0642.finishApply((int)var1_1);
            }
        }, "Rain-Figura-Cosmetics-Apply");
        thread2.setDaemon(true);
        var5_7.start();
    }

    private static void resetPanic(Class<?> manager) {
        try {
            Field panic;
            block9: {
                block8: {
                    panic = manager.getDeclaredField("panic");
                    panic.setAccessible(true);
                    if (!Modifier.isStatic(panic.getModifiers())) {
                        return;
                    }
                    Class<?> type = panic.getType();
                    if (type == Boolean.TYPE) break block8;
                    if (type != Boolean.class) break block9;
                }
                panic.setBoolean(null, false);
                return;
            }
            Object value = panic.get(null);
            if (value instanceof AtomicBoolean) {
                AtomicBoolean atomicBoolean = (AtomicBoolean)value;
                atomicBoolean.set(false);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static boolean renderPreviewStatic(String avatarId, DrawContext graphics, GuiRenderer guiRenderer, GpuBufferSlice fogBuffer, int left, int top, int right, int bottom, int size, float lookX, float lookY, ClientPlayerEntity player) {
        return \u0637\u0642.renderPreviewInternal(avatarId, graphics, guiRenderer, fogBuffer, left, top, right, bottom, size, lookX, lookY, player, false);
    }

    /*
     * WARNING - void declaration
     */
    private static String normalizeAvatarId(String avatarId) {
        void var1_1;
        if (avatarId == null) {
            return null;
        }
        String normalized = avatarId.trim();
        return normalized.isEmpty() ? null : var1_1;
    }

    private static void finishApply(int generation) {
        if (generation == APPLY_GENERATION.get()) {
            applyingAvatarId = "";
            APPLYING.set(false);
        }
    }

    public static boolean isApplyingAnyAvatar() {
        return APPLYING.get();
    }

    public static boolean isApplied(String avatarId) {
        String normalized = \u0637\u0642.normalizeAvatarId(avatarId);
        return normalized != null && normalized.equals(appliedAvatarId);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean applyLocalAvatar(Path path) {
        Path path2;
        try {
            Class<?> manager = Class.forName("other.figura.avatar.AvatarManager");
            LOGGER.debug("Resolving Figura local model loader: manager={}, path={}", (Object)manager.getName(), (Object)path);
            \u0637\u0642.resetPanic(manager);
            Class[] classArray = new Class[1];
            classArray[0] = Path.class;
            Method exactPath = \u0637\u0642.findExactMethod(manager, "loadLocalAvatar", classArray);
            if (exactPath != null) {
                Object[] objectArray = new Object[1];
                objectArray[0] = path;
                if (\u0637\u0642.invokeAvatarLoad(exactPath, objectArray)) {
                    return true;
                }
            }
            Class[] classArray2 = new Class[2];
            classArray2[0] = String.class;
            classArray2[1] = Path.class;
            Method exactStringPath = \u0637\u0642.findExactMethod(manager, "loadLocalAvatar", classArray2);
            if (exactStringPath != null) {
                Object[] objectArray = new Object[2];
                objectArray[0] = path.getFileName().toString();
                objectArray[1] = path;
                if (\u0637\u0642.invokeAvatarLoad(exactStringPath, objectArray)) {
                    return true;
                }
            }
            Class[] classArray3 = new Class[2];
            classArray3[0] = Path.class;
            classArray3[1] = Boolean.TYPE;
            Method exactPathBoolean = \u0637\u0642.findExactMethod(manager, "loadLocalAvatar", classArray3);
            if (exactPathBoolean != null) {
                Object[] objectArray = new Object[2];
                objectArray[0] = path;
                objectArray[1] = true;
                if (\u0637\u0642.invokeAvatarLoad(exactPathBoolean, objectArray)) {
                    return true;
                }
            }
            Method[] methodArray = manager.getDeclaredMethods();
            int n = methodArray.length;
            for (int i = 0; i < n; ++i) {
                void var8_9;
                Method method = methodArray[i];
                String methodName = method.getName().toLowerCase(Locale.ROOT);
                if (!method.getName().equals("loadLocalAvatar") && !methodName.contains("loadlocalavatar") || !Modifier.isStatic(method.getModifiers())) continue;
                Class<?>[] params = method.getParameterTypes();
                if (params.length == 1) {
                    if (Path.class.isAssignableFrom(params[0])) {
                        Object[] objectArray = new Object[1];
                        objectArray[0] = path;
                        if (\u0637\u0642.invokeAvatarLoad(method, objectArray)) {
                            return true;
                        }
                    }
                }
                if (params.length == 2) {
                    if (params[0] == String.class) {
                        if (Path.class.isAssignableFrom(params[1])) {
                            Object[] objectArray = new Object[2];
                            objectArray[0] = path.getFileName().toString();
                            objectArray[1] = path;
                            if (\u0637\u0642.invokeAvatarLoad(method, objectArray)) {
                                return true;
                            }
                        }
                    }
                }
                if (params.length != 2) continue;
                if (!Path.class.isAssignableFrom(params[0])) continue;
                if (params[1] != Boolean.TYPE) {
                    void var10_11;
                    if (var10_11[1] != Boolean.class) continue;
                }
                Object[] objectArray = new Object[2];
                objectArray[0] = path;
                objectArray[1] = true;
                if (!\u0637\u0642.invokeAvatarLoad((Method)var8_9, objectArray)) continue;
                return true;
            }
            LOGGER.error("No compatible Figura local model loader accepted path: {}", (Object)path2);
        }
        catch (Throwable throwable) {
            LOGGER.error("Failed to resolve or invoke Figura local model loader: path={}", (Object)path2, (Object)throwable);
        }
        return false;
    }

    private static void detachLocalUserData(Class<?> manager, UUID playerId) {
        if (playerId == null) {
            return;
        }
        try {
            Field loadedUsers = manager.getDeclaredField("LOADED_USERS");
            Field fetchedUsers = manager.getDeclaredField("FETCHED_USERS");
            loadedUsers.setAccessible(true);
            fetchedUsers.setAccessible(true);
            ((Map)loadedUsers.get(null)).remove(playerId);
            ((Set)fetchedUsers.get(null)).add(playerId);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static \u0637\u0639 preparePreview(String avatarId, ClientPlayerEntity player) {
        String normalized = \u0637\u0642.normalizeAvatarId(avatarId);
        if (!\u0637\u0642.isSafeAvatarId(normalized) || player == null || !\u0637\u0642.isFiguraLoaded()) {
            return \u0637\u0639.UNAVAILABLE;
        }
        \u0628\u0633 preview = PREVIEWS.computeIfAbsent(normalized, ignored -> new \u0628\u0633());
        \u0637\u0642.requestPreview(normalized, preview, player.getUuid());
        \u0637\u0642.updatePreviewState(preview);
        if (preview.ready) {
            if (preview.userData != null) {
                return \u0637\u0639.READY;
            }
        }
        if (preview.failed) {
            return \u0637\u0639.FAILED;
        }
        return \u0637\u0639.LOADING;
    }

    private static boolean isSafeAvatarId(String avatarId) {
        return !(avatarId == null || avatarId.isBlank() || avatarId.contains("/") || avatarId.contains("\\") || ".".equals(avatarId) || "..".equals(avatarId));
    }

    private static void tickPreviewAvatar(\u0628\u0633 preview, boolean force) {
        Object avatar = preview.avatar;
        if (avatar == null || figuraAvatarTickMethod == null) {
            return;
        }
        long now = System.currentTimeMillis();
        if (!force && now - preview.lastTick < 50L) {
            return;
        }
        try {
            figuraAvatarTickMethod.invoke(avatar, new Object[0]);
            preview.lastTick = now;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static void setPreviewOpacity(Object avatar, float opacity) {
        if (avatar == null) {
            return;
        }
        try {
            Object renderer = avatar.getClass().getField("renderer").get(avatar);
            if (renderer == null) {
                return;
            }
            Object root = renderer.getClass().getField("root").get(renderer);
            if (root != null) {
                Class[] classArray = new Class[1];
                classArray[0] = Float.class;
                Object[] objectArray = new Object[1];
                objectArray[0] = Float.valueOf(opacity);
                root.getClass().getMethod("setOpacity", classArray).invoke(root, objectArray);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static void installAndApplyAsync(String avatarId) {
        String normalized = \u0637\u0642.normalizeAvatarId(avatarId);
        if (!\u0637\u0642.isSafeAvatarId(normalized)) {
            LOGGER.warn("Rejected model apply request with invalid id: {}", (Object)avatarId);
            return;
        }
        if (!APPLYING.compareAndSet(false, true)) {
            LOGGER.info("Ignored model apply request while another model is applying: requested={}, active={}", (Object)normalized, (Object)applyingAvatarId);
            return;
        }
        int generation = APPLY_GENERATION.incrementAndGet();
        long startedAt = System.currentTimeMillis();
        applyingAvatarId = normalized;
        status = "Installing " + normalized;
        LOGGER.info("Starting model installation and apply: id={}, generation={}", (Object)normalized, (Object)generation);
        Thread thread2 = new Thread(() -> {
            try {
                \u062f\u0633.installBlocking(normalized);
                Path avatarPath = \u0637\u0642.installedAvatarPath(normalized);
                if (avatarPath == null) {
                    status = "Avatar files not found: " + normalized;
                    LOGGER.warn("Installed model path is unavailable: id={}", (Object)normalized);
                    \u0637\u0642.finishApply(generation);
                    return;
                }
                LOGGER.debug("Model files are ready for apply: id={}, path={}", (Object)normalized, (Object)avatarPath);
                MinecraftClient minecraft = MinecraftClient.getInstance();
                if (minecraft == null) {
                    status = "Minecraft is not ready";
                    LOGGER.warn("Minecraft is unavailable while applying model: id={}", (Object)normalized);
                    \u0637\u0642.finishApply(generation);
                    return;
                }
                minecraft.execute(() -> {
                    block7: {
                        block6: {
                            block5: {
                                try {
                                    if (generation == APPLY_GENERATION.get()) break block5;
                                    LOGGER.debug("Discarded stale model apply task: id={}, generation={}", (Object)normalized, (Object)generation);
                                }
                                catch (Throwable throwable) {
                                    int n;
                                    \u0637\u0642.finishApply(n);
                                    throw throwable;
                                }
                                \u0637\u0642.finishApply(generation);
                                return;
                            }
                            if (\u0637\u0642.isFiguraLoaded()) break block6;
                            status = "Model runtime is not loaded";
                            LOGGER.warn("Figura runtime is not loaded while applying model: id={}", (Object)normalized);
                            \u0637\u0642.finishApply(generation);
                            return;
                        }
                        boolean applied = \u0637\u0642.applyLocalAvatar(avatarPath);
                        if (applied) {
                            appliedAvatarId = normalized;
                            status = "Model applied: " + normalized;
                            Object[] objectArray = new Object[3];
                            objectArray[0] = normalized;
                            objectArray[1] = generation;
                            objectArray[2] = System.currentTimeMillis() - startedAt;
                            LOGGER.info("Model applied successfully: id={}, generation={}, duration={}ms", objectArray);
                            break block7;
                        }
                        status = "Failed to apply " + normalized;
                        Object[] objectArray = new Object[4];
                        objectArray[0] = normalized;
                        objectArray[1] = avatarPath;
                        objectArray[2] = generation;
                        objectArray[3] = System.currentTimeMillis() - startedAt;
                        LOGGER.error("Figura rejected model apply: id={}, path={}, generation={}, duration={}ms", objectArray);
                    }
                    \u0637\u0642.finishApply(generation);
                });
            }
            catch (Throwable throwable) {
                void var1_1;
                if (generation == APPLY_GENERATION.get()) {
                    status = "Model runtime error: " + throwable.getClass().getSimpleName();
                }
                Object[] objectArray = new Object[4];
                objectArray[0] = normalized;
                objectArray[1] = generation;
                objectArray[2] = System.currentTimeMillis() - startedAt;
                objectArray[3] = throwable;
                LOGGER.error("Model installation or apply failed: id={}, generation={}, duration={}ms", objectArray);
                \u0637\u0642.finishApply((int)var1_1);
            }
        }, "Rain-Figura-Avatar-Apply");
        thread2.setDaemon(true);
        thread2.start();
    }

    /*
     * WARNING - void declaration
     */
    private static void failPreview(\u0628\u0633 preview, String phase, Throwable throwable) {
        preview.loading = false;
        preview.ready = false;
        preview.failed = true;
        preview.failedAtMillis = System.currentTimeMillis();
        \u0637\u0642.clearUserData(preview.userData);
        preview.userData = null;
        preview.avatar = null;
        long duration = preview.requestedAtMillis <= 0L ? 0L : System.currentTimeMillis() - preview.requestedAtMillis;
        if (throwable == null) {
            Object[] objectArray = new Object[4];
            objectArray[0] = preview.avatarId;
            objectArray[1] = phase;
            objectArray[2] = preview.generation;
            objectArray[3] = duration;
            LOGGER.warn("Figura preview preparation failed: id={}, phase={}, generation={}, duration={}ms", objectArray);
        } else {
            void var2_2;
            void var3_3;
            Object[] objectArray = new Object[5];
            objectArray[0] = preview.avatarId;
            objectArray[1] = phase;
            objectArray[2] = preview.generation;
            objectArray[3] = (long)var3_3;
            objectArray[4] = var2_2;
            LOGGER.error("Figura preview preparation failed: id={}, phase={}, generation={}, duration={}ms", objectArray);
        }
    }

    private static Method findExactMethod(Class<?> clazz, String name, Class<?> ... params) {
        try {
            Method method = clazz.getDeclaredMethod(name, params);
            return Modifier.isStatic(method.getModifiers()) ? method : null;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean renderWithTemporaryUserData(UUID playerId, Object userData, \u062e\u0651 renderer) {
        block13: {
            block12: {
                if (playerId == null || userData == null || figuraLoadedUsersField == null) break block12;
                if (figuraFetchedUsersField != null) break block13;
            }
            return false;
        }
        try {
            Map users = (Map)figuraLoadedUsersField.get(null);
            Set fetched = (Set)figuraFetchedUsersField.get(null);
            Object previous = users.put(playerId, userData);
            boolean wasFetched = fetched.contains(playerId);
            fetched.add(playerId);
            try {
                renderer.run();
            }
            finally {
                if (previous == null) {
                    users.remove(playerId);
                } else {
                    users.put(playerId, previous);
                }
                if (!wasFetched) {
                    fetched.remove(playerId);
                }
            }
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    private static void updatePreviewState(\u0628\u0633 preview) {
        if (preview.loading) {
            if (preview.requestedAtMillis > 0L && System.currentTimeMillis() - preview.requestedAtMillis > 30000L) {
                \u0637\u0642.failPreview(preview, "Figura avatar loading timed out", null);
                return;
            }
        }
        Object userData = preview.userData;
        if (!preview.loading || userData == null || figuraUserDataGetAvatarMethod == null) {
            return;
        }
        try {
            Object avatar = figuraUserDataGetAvatarMethod.invoke(userData, new Object[0]);
            if (avatar == null) {
                return;
            }
            boolean loaded = true;
            try {
                Field loadedField = avatar.getClass().getField("loaded");
                loaded = loadedField.getBoolean(avatar);
            }
            catch (Throwable throwable) {
            }
            if (loaded) {
                preview.avatar = avatar;
                preview.loading = false;
                preview.ready = true;
                preview.failed = false;
                preview.lastTick = 0L;
                preview.readyAtMillis = System.currentTimeMillis();
                Object[] objectArray = new Object[4];
                objectArray[0] = preview.avatarId;
                objectArray[1] = avatar.getClass().getName();
                objectArray[2] = preview.generation;
                objectArray[3] = preview.readyAtMillis - preview.requestedAtMillis;
                LOGGER.info("Figura preview is ready: id={}, avatarClass={}, generation={}, duration={}ms", objectArray);
            }
        }
        catch (Throwable throwable) {
            \u0628\u0633 \u0628\u06332;
            \u0637\u0642.failPreview(\u0628\u06332, "reading Figura avatar state failed", throwable);
        }
    }
}

