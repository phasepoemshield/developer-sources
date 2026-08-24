/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.ProjectionType
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.render.GuiRenderer
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.fog.FogRenderer$FogType
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.system.MemoryUtil
 */
package oxxxde;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.ProjectionType;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.mixin.GameRendererAccessor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.fog.FogRenderer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oxxxde.\u0627\u0626;
import oxxxde.\u0630\u0639;
import oxxxde.\u0631\u0637;
import oxxxde.\u0633\u064f;
import oxxxde.\u0635\u0644;
import oxxxde.\u0637\u0639;
import oxxxde.\u0637\u0642;
import oxxxde.\u0638\u0621;

public final class \u0634\u0622 {
    private static final int MAX_CACHED_PREVIEWS = 18;
    private static final Set<String> PRELOAD;
    private static final int PREVIEW_HEIGHT = 522;
    private static final int LOGICAL_HEIGHT = 87;
    private static final int MAX_PARALLEL_PREPARATIONS = 4;
    private static final int SUPERSAMPLE_SCALE = 6;
    private static final ExecutorService CACHE_IO;
    private static final Logger LOGGER;
    private static int cacheGeneration;
    private static final int PREVIEW_WIDTH = 360;
    private static final Set<String> DISK_LOADS;
    private static int surfaceSequence;
    private static final Map<String, \u0630\u0639> CACHE;
    private static final Map<String, \u0633\u064f> PENDING;
    private static final ThreadLocal<Boolean> RENDERING_PREVIEW;
    private static final int LOGICAL_WIDTH = 60;

    private static void evictOldSurfaces() {
        Iterator<Map.Entry<String, \u0630\u0639>> iterator2 = CACHE.entrySet().iterator();
        while (CACHE.size() > 18 && iterator2.hasNext()) {
            Map.Entry<String, \u0630\u0639> entry = iterator2.next();
            \u0630\u0639 surface = entry.getValue();
            Object[] objectArray = new Object[3];
            objectArray[0] = entry.getKey();
            objectArray[1] = surface.textureId;
            objectArray[2] = CACHE.size();
            LOGGER.debug("Evicting Figura preview surface: id={}, texture={}, cached={}", objectArray);
            surface.close();
            iterator2.remove();
        }
    }

    public static void enqueue(String avatarId, float x, float y, float width, float height, float appearanceProgress) {
        block5: {
            block4: {
                if (avatarId == null || avatarId.isBlank()) break block4;
                if (width <= 1.0f) break block4;
                if (!(height <= 1.0f) && !(appearanceProgress <= 0.01f)) break block5;
            }
            return;
        }
        float alpha = Math.min(appearanceProgress, 1.0f);
        \u0630\u0639 surface = CACHE.get(avatarId);
        if (surface != null && surface.ready) {
            \u0638\u0621.draw(surface.textureId, x, y, width, height, alpha);
            return;
        }
        PENDING.putIfAbsent(avatarId, new \u0633\u064f(avatarId));
    }

    private static void cacheRenderedPreview(String avatarId, byte[] pixels) {
        String archiveSha256 = \u0635\u0644.archiveSha256(avatarId);
        if (archiveSha256 == null || pixels == null) {
            return;
        }
        CACHE_IO.execute(() -> {
            try {
                \u0631\u0637.save(archiveSha256, 360, 522, pixels);
            }
            catch (Throwable throwable) {
                LOGGER.debug("Failed to persist rendered Figura preview: id={}, reason={}", (Object)avatarId, (Object)throwable.getMessage());
            }
        });
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private static boolean renderSnapshot(String avatarId, \u0630\u0639 surface, GuiRenderer guiRenderer, GpuBufferSlice fogBuffer, ClientPlayerEntity player, MinecraftClient minecraft) {
        void var15_15;
        ChromaRenderer.FramebufferState framebufferState;
        ProjectionType previousProjectionType;
        GpuBufferSlice previousProjection;
        block4: {
            DrawContext graphics = new DrawContext(minecraft, ((GameRendererAccessor)minecraft.gameRenderer).rain$getGuiState(), 60, 87);
            int size = Math.round((float)Math.min(60, 87) * 0.6f);
            float centerX = 30.0f;
            float centerY = 43.5f;
            float showcaseLookX = centerX - 19.199999f;
            float showcaseLookY = centerY - 5.22f;
            previousProjection = RenderSystem.getProjectionMatrixBuffer();
            previousProjectionType = RenderSystem.getProjectionType();
            framebufferState = ChromaRenderer.captureFramebufferState();
            boolean[] blArray = new boolean[1];
            blArray[0] = false;
            boolean[] rendered = blArray;
            surface.target.clearAllTextures();
            try {
                RENDERING_PREVIEW.set(true);
                \u0627\u0626.renderInto(surface.target, 360, 522, 6, () -> {
                    rendered[0] = \u0637\u0642.renderPreviewStatic(avatarId, graphics, guiRenderer, fogBuffer, 0, 0, 60, 87, size, showcaseLookX, showcaseLookY, player);
                });
                if (!rendered[0]) break block4;
                \u0634\u0622.cacheRenderedPreview(avatarId, \u0634\u0622.readSnapshotPixels(surface));
            }
            catch (Throwable throwable) {
                block5: {
                    try {
                        void var16_16;
                        surface.lastRenderFailureWasException = true;
                        if (!surface.shouldLogRenderFailure()) break block5;
                        Object[] objectArray = new Object[3];
                        objectArray[0] = avatarId;
                        objectArray[1] = surface.renderAttempts;
                        objectArray[2] = var16_16;
                        LOGGER.error("Figura preview snapshot render failed: id={}, attempt={}", objectArray);
                    }
                    catch (Throwable throwable2) {
                        void var14_14;
                        RENDERING_PREVIEW.set(false);
                        RenderSystem.setProjectionMatrix((GpuBufferSlice)previousProjection, (ProjectionType)previousProjectionType);
                        ChromaRenderer.restoreFramebufferState((ChromaRenderer.FramebufferState)var14_14);
                        throw throwable2;
                    }
                }
                RENDERING_PREVIEW.set(false);
                RenderSystem.setProjectionMatrix((GpuBufferSlice)previousProjection, (ProjectionType)previousProjectionType);
                ChromaRenderer.restoreFramebufferState(framebufferState);
            }
        }
        RENDERING_PREVIEW.set(false);
        RenderSystem.setProjectionMatrix((GpuBufferSlice)previousProjection, (ProjectionType)previousProjectionType);
        ChromaRenderer.restoreFramebufferState(framebufferState);
        return (boolean)var15_15[0];
    }

    public static float getPreviewAspectRatio() {
        return 0.6896552f;
    }

    public static void clear() {
        PENDING.clear();
    }

    /*
     * WARNING - void declaration
     */
    public static void renderQueued() {
        GameRenderer gameRenderer;
        ClientPlayerEntity player;
        MinecraftClient minecraft;
        block10: {
            block9: {
                minecraft = MinecraftClient.getInstance();
                player = minecraft.player;
                if (player == null || !\u0634\u0622.hasPendingWork()) break block9;
                gameRenderer = minecraft.gameRenderer;
                if (gameRenderer instanceof GameRendererAccessor) break block10;
            }
            \u0634\u0622.clear();
            return;
        }
        GameRendererAccessor accessor = (GameRendererAccessor)gameRenderer;
        LinkedHashMap<String, \u0633\u064f> requests = new LinkedHashMap<String, \u0633\u064f>(PENDING);
        for (String avatarId : PRELOAD) {
            requests.putIfAbsent(avatarId, new \u0633\u064f(avatarId));
        }
        PENDING.clear();
        GuiRenderer guiRenderer = accessor.rain$getGuiRenderer();
        GpuBufferSlice fogBuffer = accessor.rain$getFogRenderer().getFogBuffer(FogRenderer.FogType.NONE);
        int activePreparations = 0;
        for (\u0633\u064f request : requests.values()) {
            void var11_11;
            \u0637\u0639 status = \u0637\u0642.preparePreview(request.avatarId, player);
            if (status == \u0637\u0639.LOADING) {
                if (++activePreparations < 4) continue;
                break;
            }
            if (status != \u0637\u0639.READY) {
                if (status == \u0637\u0639.FAILED && \u0637\u0642.canRetryPreview(request.avatarId)) continue;
                PRELOAD.remove(request.avatarId);
                continue;
            }
            \u0630\u0639 surface = CACHE.computeIfAbsent(request.avatarId, \u0630\u0639::new);
            if (surface.ready) {
                PRELOAD.remove(request.avatarId);
                continue;
            }
            long startedAt = System.currentTimeMillis();
            ++surface.renderAttempts;
            surface.lastRenderFailureWasException = false;
            if (\u0634\u0622.renderSnapshot(request.avatarId, surface, guiRenderer, fogBuffer, player, minecraft)) {
                surface.ready = true;
                PRELOAD.remove(request.avatarId);
                Object[] objectArray = new Object[6];
                objectArray[0] = request.avatarId;
                objectArray[1] = surface.textureId;
                objectArray[2] = 360;
                objectArray[3] = 522;
                objectArray[4] = surface.renderAttempts;
                objectArray[5] = System.currentTimeMillis() - startedAt;
                LOGGER.info("Figura preview snapshot rendered: id={}, texture={}, resolution={}x{}, attempts={}, duration={}ms", objectArray);
                break;
            }
            if (!surface.shouldLogRenderFailure() || surface.lastRenderFailureWasException) break;
            Object[] objectArray = new Object[3];
            objectArray[0] = request.avatarId;
            objectArray[1] = surface.renderAttempts;
            objectArray[2] = System.currentTimeMillis() - var11_11;
            LOGGER.warn("Figura preview snapshot was not rendered: id={}, attempt={}, duration={}ms", objectArray);
            break;
        }
        \u0634\u0622.evictOldSurfaces();
    }

    private static void requestDiskPreview(String avatarId) {
        String archiveSha256 = \u0635\u0644.archiveSha256(avatarId);
        if (archiveSha256 == null) {
            return;
        }
        int generation = cacheGeneration;
        String loadKey = generation + ":" + avatarId;
        if (!DISK_LOADS.add(loadKey)) {
            return;
        }
        CACHE_IO.execute(() -> {
            byte[] pixels = null;
            try {
                pixels = \u0631\u0637.load(archiveSha256, 360, 522);
            }
            catch (Throwable throwable) {
                LOGGER.debug("Rendered Figura preview cache miss: id={}, reason={}", (Object)avatarId, (Object)throwable.getMessage());
            }
            byte[] cachedPixels = pixels;
            MinecraftClient minecraft = MinecraftClient.getInstance();
            minecraft.execute(() -> {
                block9: {
                    if (cachedPixels != null && generation == cacheGeneration) {
                        if (!CACHE.containsKey(avatarId)) {
                            if (Objects.equals(archiveSha256, \u0635\u0644.archiveSha256(avatarId))) break block9;
                        }
                    }
                    DISK_LOADS.remove(loadKey);
                    return;
                }
                try {
                    \u0630\u0639 surface = new \u0630\u0639(avatarId, false);
                    try {
                        surface.uploadPixels(cachedPixels);
                        surface.ready = true;
                        CACHE.put(avatarId, surface);
                    }
                    catch (Throwable throwable) {
                        void var6_7;
                        surface.close();
                        throw var6_7;
                    }
                    PRELOAD.remove(avatarId);
                    PENDING.remove(avatarId);
                    \u0634\u0622.evictOldSurfaces();
                    Object[] objectArray = new Object[4];
                    objectArray[0] = avatarId;
                    objectArray[1] = surface.textureId;
                    objectArray[2] = 360;
                    objectArray[3] = 522;
                    LOGGER.info("Loaded rendered Figura preview from disk: id={}, texture={}, resolution={}x{}", objectArray);
                    DISK_LOADS.remove(loadKey);
                }
                catch (Throwable throwable) {
                    try {
                        void var5_6;
                        LOGGER.warn("Failed to upload rendered Figura preview {}: {}", (Object)avatarId, (Object)var5_6.getMessage());
                        DISK_LOADS.remove(loadKey);
                    }
                    catch (Throwable throwable2) {
                        void var4_4;
                        DISK_LOADS.remove(var4_4);
                        throw throwable2;
                    }
                }
            });
        });
    }

    static {
        LOGGER = LoggerFactory.getLogger("Rain Figura Preview");
        PENDING = new LinkedHashMap<String, \u0633\u064f>();
        PRELOAD = new LinkedHashSet<String>();
        CACHE = new LinkedHashMap<String, \u0630\u0639>(16, 0.75f, true);
        DISK_LOADS = ConcurrentHashMap.newKeySet();
        CACHE_IO = Executors.newFixedThreadPool(2, runnable -> {
            void var1_1;
            Thread thread2 = new Thread(runnable, "Rain-Figura-Rendered-Preview-Cache");
            thread2.setDaemon(true);
            return var1_1;
        });
        RENDERING_PREVIEW = ThreadLocal.withInitial(() -> false);
    }

    public static boolean isPreviewReady(String avatarId) {
        \u0630\u0639 surface;
        \u0630\u0639 \u0630\u06392 = avatarId == null ? null : (surface = CACHE.get(avatarId));
        return surface != null && surface.ready;
    }

    public static void clearCache() {
        Object[] objectArray = new Object[3];
        objectArray[0] = CACHE.size();
        objectArray[1] = PENDING.size();
        objectArray[2] = PRELOAD.size();
        LOGGER.info("Clearing rendered Figura preview cache: cached={}, pending={}, preload={}", objectArray);
        PENDING.clear();
        PRELOAD.clear();
        ++cacheGeneration;
        for (\u0630\u0639 \u0630\u06392 : CACHE.values()) {
            \u0630\u06392.close();
        }
        CACHE.clear();
    }

    private static void configureLinearFiltering(int textureId) {
        int previousActiveTexture = GL11.glGetInteger((int)34016);
        GlStateManager._activeTexture((int)33984);
        int previousTexture = GL11.glGetInteger((int)32873);
        GlStateManager._bindTexture((int)textureId);
        GlStateManager._texParameter((int)3553, (int)10241, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10242, (int)33071);
        GlStateManager._texParameter((int)3553, (int)10243, (int)33071);
        GlStateManager._bindTexture((int)previousTexture);
        GlStateManager._activeTexture((int)previousActiveTexture);
    }

    private \u0634\u0622() {
    }

    /*
     * WARNING - void declaration
     */
    public static void preload(Collection<String> avatarIds) {
        if (avatarIds == null) {
            return;
        }
        ArrayList<String> added = new ArrayList<String>();
        Iterator<String> iterator2 = avatarIds.iterator();
        while (iterator2.hasNext()) {
            void var3_3;
            String avatarId = iterator2.next();
            if (avatarId == null) continue;
            if (avatarId.isBlank()) continue;
            if (CACHE.containsKey(avatarId)) continue;
            if (PRELOAD.add(avatarId)) {
                added.add(avatarId);
            }
            \u0634\u0622.requestDiskPreview((String)var3_3);
        }
        if (!added.isEmpty()) {
            void var1_1;
            LOGGER.info("Queued Figura model previews for preload: count={}, ids={}", (Object)added.size(), (Object)var1_1);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private static byte[] readSnapshotPixels(\u0630\u0639 surface) {
        byte[] byArray;
        int byteCount = 751680;
        ByteBuffer pixels = MemoryUtil.memAlloc((int)byteCount);
        int previousPackAlignment = GL11.glGetInteger((int)3333);
        try {
            surface.target.bind(false);
            GL11.glReadBuffer((int)36064);
            GL11.glPixelStorei((int)3333, (int)1);
            GL11.glReadPixels((int)0, (int)0, (int)360, (int)522, (int)6408, (int)5121, (ByteBuffer)pixels);
            byte[] copy = new byte[byteCount];
            pixels.get(copy);
            byArray = copy;
        }
        catch (Throwable throwable) {
            void var2_2;
            GL11.glPixelStorei((int)3333, (int)previousPackAlignment);
            MemoryUtil.memFree((Buffer)var2_2);
            throw throwable;
        }
        GL11.glPixelStorei((int)3333, (int)previousPackAlignment);
        MemoryUtil.memFree((Buffer)pixels);
        return byArray;
    }

    public static boolean hasPendingWork() {
        return !PENDING.isEmpty() || !PRELOAD.isEmpty();
    }

    public static boolean isRenderingPreview() {
        return RENDERING_PREVIEW.get();
    }
}

