package oxxxde;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.ProjectionType;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.mixin.GameRendererAccessor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.fog.FogRenderer.FogType;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from heavy
public final class شآ {
   private static final int MAX_CACHED_PREVIEWS = 18;
   private static final Set<String> PRELOAD = new LinkedHashSet<>();
   private static final int PREVIEW_HEIGHT = 522;
   private static final int LOGICAL_HEIGHT = 87;
   private static final int MAX_PARALLEL_PREPARATIONS = 4;
   private static final int SUPERSAMPLE_SCALE = 6;
   private static final ExecutorService CACHE_IO = Executors.newFixedThreadPool(2, runnable -> {
      Thread thread = new Thread(runnable, "Rain-Figura-Rendered-Preview-Cache");
      thread.setDaemon(true);
      return thread;
   });
   private static final Logger LOGGER = LoggerFactory.getLogger("Rain Figura Preview");
   private static int cacheGeneration;
   private static final int PREVIEW_WIDTH = 360;
   private static final Set<String> DISK_LOADS = ConcurrentHashMap.newKeySet();
   private static int surfaceSequence;
   private static final Map<String, ذع> CACHE = new LinkedHashMap<>(16, 0.75F, true);
   private static final Map<String, سُ> PENDING = new LinkedHashMap<>();
   private static final ThreadLocal<Boolean> RENDERING_PREVIEW = ThreadLocal.withInitial(() -> false);
   private static final int LOGICAL_WIDTH = 60;

   private static void evictOldSurfaces() {
      Iterator<Entry<String, ذع>> iterator = CACHE.entrySet().iterator();

      while (CACHE.size() > 18 && iterator.hasNext()) {
         Entry<String, ذع> entry = iterator.next();
         ذع surface = entry.getValue();
         LOGGER.debug("Evicting Figura preview surface: id={}, texture={}, cached={}", entry.getKey(), surface.textureId, CACHE.size());
         surface.close();
         iterator.remove();
      }
   }

   public static void enqueue(String y, float height, float avatarId, float appearanceProgress, float width, float x) {
      if (avatarId != null && !avatarId.isBlank() && !(width <= 1.0F) && !(height <= 1.0F) && !(appearanceProgress <= 0.01F)) {
         float alpha = Math.min(appearanceProgress, 1.0F);
         ذع surface = CACHE.get(avatarId);
         if (surface != null && surface.ready) {
            ظء.draw(surface.textureId, x, y, width, height, alpha);
         } else {
            PENDING.putIfAbsent(avatarId, new سُ(avatarId));
         }
      }
   }

   private static void cacheRenderedPreview(String avatarId, byte[] pixels) {
      String archiveSha256 = صل.archiveSha256(avatarId);
      if (archiveSha256 != null && pixels != null) {
         CACHE_IO.execute(() -> {
            try {
               رط.save(archiveSha256, 360, 522, pixels);
            } catch (Throwable throwable) {
               LOGGER.debug("Failed to persist rendered Figura preview: id={}, reason={}", avatarId, throwable.getMessage());
            }
         });
      }
   }

   private static boolean renderSnapshot(
      String surface, ذع guiRenderer, GuiRenderer player, GpuBufferSlice minecraft, ClientPlayerEntity avatarId, MinecraftClient fogBuffer
   ) {
      DrawContext graphics = new DrawContext(minecraft, ((GameRendererAccessor)minecraft.gameRenderer).rain$getGuiState(), 60, 87);
      int size = Math.round(Math.min(60, 87) * 0.6F);
      float centerX = 30.0F;
      float centerY = 43.5F;
      float showcaseLookX = centerX - 19.199999F;
      float showcaseLookY = centerY - 5.22F;
      GpuBufferSlice previousProjection = RenderSystem.getProjectionMatrixBuffer();
      ProjectionType previousProjectionType = RenderSystem.getProjectionType();
      ChromaRenderer.FramebufferState framebufferState = ChromaRenderer.captureFramebufferState();
      boolean[] rendered = new boolean[]{false};
      surface.target.clearAllTextures();

      try {
         RENDERING_PREVIEW.set(true);
         ائ.renderInto(
            surface.target,
            360,
            522,
            6,
            () -> rendered[0] = طق.renderPreviewStatic(avatarId, graphics, guiRenderer, fogBuffer, 0, 0, 60, 87, size, showcaseLookX, showcaseLookY, player)
         );
         if (rendered[0]) {
            cacheRenderedPreview(avatarId, readSnapshotPixels(surface));
         }
      } catch (Throwable var20) {
         surface.lastRenderFailureWasException = true;
         if (surface.shouldLogRenderFailure()) {
            LOGGER.error("Figura preview snapshot render failed: id={}, attempt={}", avatarId, surface.renderAttempts, var20);
         }
      } finally {
         RENDERING_PREVIEW.set(false);
         RenderSystem.setProjectionMatrix(previousProjection, previousProjectionType);
         ChromaRenderer.restoreFramebufferState(framebufferState);
      }

      return rendered[0];
   }

   public static float getPreviewAspectRatio() {
      return 0.6896552F;
   }

   public static void clear() {
      PENDING.clear();
   }

   public static void renderQueued() {
      MinecraftClient minecraft = MinecraftClient.getInstance();
      ClientPlayerEntity player = minecraft.player;
      if (player != null && hasPendingWork() && minecraft.gameRenderer instanceof GameRendererAccessor accessor) {
         LinkedHashMap var13 = new LinkedHashMap<>(PENDING);

         for (String fogBuffer : PRELOAD) {
            var13.putIfAbsent(fogBuffer, new سُ(fogBuffer));
         }

         PENDING.clear();
         GuiRenderer var14 = accessor.rain$getGuiRenderer();
         GpuBufferSlice var15 = accessor.rain$getFogRenderer().getFogBuffer(FogType.NONE);
         int activePreparations = 0;

         for (سُ request : var13.values()) {
            طع status = طق.preparePreview(request.avatarId, player);
            if (status == طع.LOADING) {
               if (++activePreparations >= 4) {
                  break;
               }
            } else if (status != طع.READY) {
               if (status != طع.FAILED || !طق.canRetryPreview(request.avatarId)) {
                  PRELOAD.remove(request.avatarId);
               }
            } else {
               ذع surface = CACHE.computeIfAbsent(request.avatarId, ذع::new);
               if (!surface.ready) {
                  long startedAt = System.currentTimeMillis();
                  surface.renderAttempts++;
                  surface.lastRenderFailureWasException = false;
                  if (renderSnapshot(request.avatarId, surface, var14, var15, player, minecraft)) {
                     surface.ready = true;
                     PRELOAD.remove(request.avatarId);
                     LOGGER.info(
                        "Figura preview snapshot rendered: id={}, texture={}, resolution={}x{}, attempts={}, duration={}ms",
                        request.avatarId,
                        surface.textureId,
                        360,
                        522,
                        surface.renderAttempts,
                        System.currentTimeMillis() - startedAt
                     );
                  } else if (surface.shouldLogRenderFailure() && !surface.lastRenderFailureWasException) {
                     LOGGER.warn(
                        "Figura preview snapshot was not rendered: id={}, attempt={}, duration={}ms",
                        request.avatarId,
                        surface.renderAttempts,
                        System.currentTimeMillis() - startedAt
                     );
                  }
                  break;
               }

               PRELOAD.remove(request.avatarId);
            }
         }

         evictOldSurfaces();
      } else {
         clear();
      }
   }

   private static void requestDiskPreview(String avatarId) {
      String archiveSha256 = صل.archiveSha256(avatarId);
      if (archiveSha256 != null) {
         int generation = cacheGeneration;
         String loadKey = generation + ":" + avatarId;
         if (DISK_LOADS.add(loadKey)) {
            CACHE_IO.execute(
               () -> {
                  byte[] pixels = null;

                  try {
                     pixels = رط.load(archiveSha256, 360, 522);
                  } catch (Throwable throwable) {
                     LOGGER.debug("Rendered Figura preview cache miss: id={}, reason={}", avatarId, throwable.getMessage());
                  }

                  byte[] cachedPixels = pixels;
                  MinecraftClient minecraft = MinecraftClient.getInstance();
                  minecraft.execute(
                     () -> {
                        try {
                           if (cachedPixels != null
                              && generation == cacheGeneration
                              && !CACHE.containsKey(avatarId)
                              && Objects.equals(archiveSha256, صل.archiveSha256(avatarId))) {
                              ذع throwable = new ذع(avatarId, false);

                              try {
                                 throwable.uploadPixels(cachedPixels);
                                 throwable.ready = true;
                                 CACHE.put(avatarId, throwable);
                              } catch (Throwable var11) {
                                 throwable.close();
                                 throw var11;
                              }

                              PRELOAD.remove(avatarId);
                              PENDING.remove(avatarId);
                              evictOldSurfaces();
                              LOGGER.info(
                                 "Loaded rendered Figura preview from disk: id={}, texture={}, resolution={}x{}", avatarId, throwable.textureId, 360, 522
                              );
                              return;
                           }
                        } catch (Throwable var12) {
                           LOGGER.warn("Failed to upload rendered Figura preview {}: {}", avatarId, var12.getMessage());
                           return;
                        } finally {
                           DISK_LOADS.remove(loadKey);
                        }
                     }
                  );
               }
            );
         }
      }
   }

   public static boolean isPreviewReady(String avatarId) {
      ذع surface = avatarId == null ? null : CACHE.get(avatarId);
      return surface != null && surface.ready;
   }

   public static void clearCache() {
      LOGGER.info("Clearing rendered Figura preview cache: cached={}, pending={}, preload={}", CACHE.size(), PENDING.size(), PRELOAD.size());
      PENDING.clear();
      PRELOAD.clear();
      cacheGeneration++;

      for (ذع surface : CACHE.values()) {
         surface.close();
      }

      CACHE.clear();
   }

   private static void configureLinearFiltering(int textureId) {
      int previousActiveTexture = GL11.glGetInteger(34016);
      GlStateManager._activeTexture(33984);
      int previousTexture = GL11.glGetInteger(32873);
      GlStateManager._bindTexture(textureId);
      GlStateManager._texParameter(3553, 10241, 9729);
      GlStateManager._texParameter(3553, 10240, 9729);
      GlStateManager._texParameter(3553, 10242, 33071);
      GlStateManager._texParameter(3553, 10243, 33071);
      GlStateManager._bindTexture(previousTexture);
      GlStateManager._activeTexture(previousActiveTexture);
   }

   private شآ() {
   }

   public static void preload(Collection<String> avatarIds) {
      if (avatarIds != null) {
         Collection<String> added = new ArrayList<>();

         for (String avatarId : avatarIds) {
            if (avatarId != null && !avatarId.isBlank() && !CACHE.containsKey(avatarId)) {
               if (PRELOAD.add(avatarId)) {
                  added.add(avatarId);
               }

               requestDiskPreview(avatarId);
            }
         }

         if (!added.isEmpty()) {
            LOGGER.info("Queued Figura model previews for preload: count={}, ids={}", added.size(), added);
         }
      }
   }

   private static byte[] readSnapshotPixels(ذع surface) {
      int byteCount = 751680;
      ByteBuffer pixels = MemoryUtil.memAlloc(byteCount);
      int previousPackAlignment = GL11.glGetInteger(3333);

      try {
         surface.target.bind(false);
         GL11.glReadBuffer(36064);
         GL11.glPixelStorei(3333, 1);
         GL11.glReadPixels(0, 0, 360, 522, 6408, 5121, pixels);
         byte[] copy = new byte[byteCount];
         pixels.get(copy);
         return copy;
      } finally {
         GL11.glPixelStorei(3333, previousPackAlignment);
         MemoryUtil.memFree(pixels);
      }
   }

   public static boolean hasPendingWork() {
      return !PENDING.isEmpty() || !PRELOAD.isEmpty();
   }

   public static boolean isRenderingPreview() {
      return RENDERING_PREVIEW.get();
   }
}
