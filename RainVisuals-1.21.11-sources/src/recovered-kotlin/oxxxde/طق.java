package oxxxde;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from heavy
public final class طق {
   private static volatile String status = "";
   private static Method figuraAvatarTickMethod;
   private static final AtomicInteger APPLY_GENERATION = new AtomicInteger();
   private static final long PREVIEW_RETRY_DELAY_MILLIS = 5000L;
   private static final Logger LOGGER = LoggerFactory.getLogger("Rain Figura Runtime");
   private static Field figuraFetchedUsersField;
   private static final int MAX_PREVIEW_ATTEMPTS = 3;
   private static volatile String applyingAvatarId = "";
   private static volatile String appliedAvatarId = "";
   private static final long PREVIEW_FADE_IN_MILLIS = 180L;
   private static final AtomicInteger PREVIEW_GENERATION = new AtomicInteger();
   private static Method figuraUserDataGetAvatarMethod;
   private static final Map<String, بس> PREVIEWS = new ConcurrentHashMap<>();
   private static Field figuraLoadedUsersField;
   private static Method figuraUserDataClearMethod;
   private static final long PREVIEW_LOAD_TIMEOUT_MILLIS = 30000L;
   private static Method figuraLoadAvatarMethod;
   private static final AtomicBoolean APPLYING = new AtomicBoolean(false);
   private static Constructor<?> figuraUserDataConstructor;

   private static synchronized void ensurePreviewReflection() throws Exception {
      if (figuraUserDataConstructor == null) {
         Class<?> userDataClass = Class.forName("other.figura.avatar.UserData");
         Class<?> loaderClass = Class.forName("other.figura.avatar.local.LocalAvatarLoader");
         Class<?> managerClass = Class.forName("other.figura.avatar.AvatarManager");
         figuraUserDataConstructor = userDataClass.getConstructor(UUID.class);
         figuraLoadAvatarMethod = loaderClass.getDeclaredMethod("loadAvatar", Path.class, userDataClass);
         figuraUserDataGetAvatarMethod = userDataClass.getMethod("getMainAvatar");
         figuraUserDataClearMethod = userDataClass.getMethod("clear");
         figuraLoadedUsersField = managerClass.getDeclaredField("LOADED_USERS");
         figuraFetchedUsersField = managerClass.getDeclaredField("FETCHED_USERS");

         try {
            figuraAvatarTickMethod = Class.forName("other.figura.avatar.Avatar").getMethod("tick");
         } catch (Throwable var4) {
            figuraAvatarTickMethod = null;
         }

         figuraLoadAvatarMethod.setAccessible(true);
         figuraLoadedUsersField.setAccessible(true);
         figuraFetchedUsersField.setAccessible(true);
         LOGGER.info(
            "Figura preview reflection initialized: userData={}, loader={}, manager={}, tickMethod={}",
            userDataClass.getName(),
            loaderClass.getName(),
            managerClass.getName(),
            figuraAvatarTickMethod == null ? "unavailable" : figuraAvatarTickMethod.toGenericString()
         );
      }
   }

   public static boolean isFiguraLoaded() {
      try {
         FabricLoader loader = FabricLoader.getInstance();
         return loader.isModLoaded("figura_model_runtime") || loader.isModLoaded("figura");
      } catch (Throwable var1) {
         return false;
      }
   }

   private static boolean clearLocalAvatar() {
      try {
         Class<?> manager = Class.forName("other.figura.avatar.AvatarManager");
         MinecraftClient minecraft = MinecraftClient.getInstance();
         UUID playerId = minecraft.player == null ? null : minecraft.player.getUuid();
         Method exactPath = findExactMethod(manager, "loadLocalAvatar", Path.class);
         if (exactPath != null && invokeAvatarLoad(exactPath, null)) {
            detachLocalUserData(manager, playerId);
            return true;
         }

         if (playerId == null) {
            return false;
         }

         Method clearAvatars = findExactMethod(manager, "clearAvatars", UUID.class);
         if (clearAvatars != null && invokeAvatarLoad(clearAvatars, playerId)) {
            detachLocalUserData(manager, playerId);
            return true;
         }
      } catch (Throwable var5) {
      }

      return false;
   }

   private static void clearUserData(Object userData) {
      if (userData != null && figuraUserDataClearMethod != null) {
         try {
            figuraUserDataClearMethod.invoke(userData);
         } catch (Throwable var2) {
         }
      }
   }

   public static boolean renderPreview(
      String top,
      DrawContext player,
      GuiRenderer avatarId,
      GpuBufferSlice bottom,
      int size,
      int guiRenderer,
      int graphics,
      int lookX,
      int lookY,
      float left,
      float fogBuffer,
      ClientPlayerEntity right
   ) {
      return renderPreviewInternal(avatarId, graphics, guiRenderer, fogBuffer, left, top, right, bottom, size, lookX, lookY, player, true);
   }

   public static boolean isApplying(String avatarId) {
      String normalized = normalizeAvatarId(avatarId);
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
      } else {
         Runnable removeAvatar = () -> {
            if (!isFiguraLoaded()) {
               status = "Model removed";
            } else {
               if (clearLocalAvatar()) {
                  status = "Model removed";
               } else {
                  status = "Failed to remove model";
               }
            }
         };
         if (minecraft.isOnThread()) {
            removeAvatar.run();
         } else {
            minecraft.execute(removeAvatar);
         }
      }
   }

   private static void loadPreviewOnClientThread(بس preview, Path playerId, UUID avatarPath) {
      try {
         LOGGER.debug("Initializing Figura preview loader: id={}, path={}, player={}", preview.avatarId, avatarPath, playerId);
         ensurePreviewReflection();
         Object throwable = figuraUserDataConstructor.newInstance(playerId);
         figuraLoadAvatarMethod.invoke(null, avatarPath, throwable);
         LOGGER.debug("Figura accepted preview load request: id={}, userDataClass={}", preview.avatarId, throwable.getClass().getName());
         if (preview.generation != PREVIEW_GENERATION.get()) {
            clearUserData(throwable);
            failPreview(preview, "preview generation changed", null);
            return;
         }

         preview.userData = throwable;
      } catch (Throwable var4) {
         failPreview(preview, "Figura loader invocation failed", var4);
      }
   }

   public static boolean hasPreviewFailed(String avatarId) {
      String normalized = normalizeAvatarId(avatarId);
      بس preview = normalized == null ? null : PREVIEWS.get(normalized);
      return preview != null && preview.failed;
   }

   public static void clearPreviewCache() {
      int generation = PREVIEW_GENERATION.incrementAndGet();
      LOGGER.info("Clearing Figura preview cache: previews={}, generation={}", PREVIEWS.size(), generation);

      for (بس preview : PREVIEWS.values()) {
         clearUserData(preview.userData);
      }

      PREVIEWS.clear();
      شآ.clearCache();
   }

   private static Path installedAvatarPath(String avatarId) {
      String normalized = normalizeAvatarId(avatarId);
      if (!isSafeAvatarId(normalized)) {
         return null;
      }

      Path root = دس.avatarsDirectory();
      if (root == null) {
         return null;
      }

      Path avatarPath = root.resolve(normalized).normalize();
      return avatarPath.startsWith(root) && Files.isRegularFile(avatarPath.resolve("avatar.json")) ? avatarPath : null;
   }

   private static void freezePreviewAnimations(بس preview) {
      Object avatar = preview.avatar;
      if (avatar != null && !preview.animationsFrozen) {
         try {
            avatar.getClass().getMethod("clearAnimations").invoke(avatar);
            if (avatar.getClass().getField("animations").get(avatar) instanceof Map animationMap) {
               for (Object animation : animationMap.values()) {
                  if (animation != null) {
                     animation.getClass().getMethod("stop").invoke(animation);
                  }
               }
            }
         } catch (Throwable var9) {
         } finally {
            preview.animationsFrozen = true;
         }
      }
   }

   public static String status() {
      return status;
   }

   private static boolean invokeAvatarLoad(Method method, Object... args) {
      try {
         method.setAccessible(true);
         LOGGER.debug("Invoking Figura model loader: method={}, args={}", method.toGenericString(), Arrays.toString(args));
         boolean accepted = !(method.invoke(null, args) instanceof Boolean booleanResult && !booleanResult);
         if (accepted) {
            LOGGER.info("Figura model loader invocation succeeded: method={}", method.toGenericString());
         } else {
            LOGGER.warn("Figura model loader returned false: method={}", method.toGenericString());
         }

         return accepted;
      } catch (Throwable var5) {
         LOGGER.error("Figura model loader invocation failed: method={}", method.toGenericString(), var5);
         return false;
      }
   }

   private static void requestPreview(String playerId, بس preview, UUID avatarId) {
      long now = System.currentTimeMillis();
      if (!preview.ready && !preview.loading && (!preview.failed || preview.attempts < 3 && now - preview.failedAtMillis >= 5000L)) {
         synchronized (preview) {
            now = System.currentTimeMillis();
            if (preview.ready || preview.loading || preview.failed && (preview.attempts >= 3 || now - preview.failedAtMillis < 5000L)) {
               return;
            }

            preview.loading = true;
            preview.failed = false;
            preview.attempts++;
            preview.generation = PREVIEW_GENERATION.get();
            preview.avatarId = avatarId;
            preview.requestedAtMillis = now;
         }

         LOGGER.info(
            "Starting Figura preview preparation: id={}, generation={}, attempt={}, player={}", avatarId, preview.generation, preview.attempts, playerId
         );
         Thread thread = new Thread(() -> {
            try {
               دس.installBlocking(avatarId);
               Path avatarPath = installedAvatarPath(avatarId);
               if (avatarPath == null) {
                  failPreview(preview, "installed model path was not found", null);
                  return;
               }

               LOGGER.debug("Preview model files are ready: id={}, path={}", avatarId, avatarPath);
               MinecraftClient minecraft = MinecraftClient.getInstance();
               if (minecraft == null) {
                  failPreview(preview, "Minecraft is unavailable", null);
                  return;
               }

               LOGGER.debug("Scheduling preview load on the client thread: id={}", avatarId);
               minecraft.execute(() -> loadPreviewOnClientThread(preview, avatarPath, playerId));
            } catch (Throwable var5x) {
               failPreview(preview, "installation failed", var5x);
            }
         }, "Rain-Figura-Avatar-Preview-" + avatarId);
         thread.setDaemon(true);
         thread.start();
      }
   }

   private طق() {
   }

   private static boolean renderPreviewInternal(
      String fogBuffer,
      DrawContext lookX,
      GuiRenderer right,
      GpuBufferSlice avatarId,
      int size,
      int lookY,
      int top,
      int tickAvatar,
      int player,
      float guiRenderer,
      float left,
      ClientPlayerEntity bottom,
      boolean graphics
   ) {
      String normalized = normalizeAvatarId(avatarId);
      if (graphics != null && guiRenderer != null && fogBuffer != null && preparePreview(normalized, player) == طع.READY) {
         بس preview = PREVIEWS.get(normalized);
         if (preview != null && preview.userData != null) {
            freezePreviewAnimations(preview);
            setPreviewOpacity(preview.avatar, tickAvatar ? previewFadeProgress(preview) : 1.0F);
            return renderWithTemporaryUserData(player.getUuid(), preview.userData, () -> {
               if (tickAvatar) {
                  tickPreviewAvatar(preview, false);
               }

               InventoryScreen.drawEntity(graphics, left, top, right, bottom, size, 0.0625F, lookX, lookY, player);
               guiRenderer.render(fogBuffer);
            });
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static float previewFadeProgress(بس preview) {
      return preview.readyAtMillis <= 0L ? 1.0F : Math.min(1.0F, (float)(System.currentTimeMillis() - preview.readyAtMillis) / 180.0F);
   }

   public static boolean canRetryPreview(String avatarId) {
      String normalized = normalizeAvatarId(avatarId);
      بس preview = normalized == null ? null : PREVIEWS.get(normalized);
      return preview != null && preview.failed && preview.attempts < 3;
   }

   public static void installAndApplyCosmeticsAsync(Collection<String> avatarIds) {
      List<String> selectedCosmetics = new ArrayList<>();

      for (String startedAt : avatarIds) {
         String normalized = normalizeAvatarId(startedAt);
         if (isSafeAvatarId(normalized)) {
            selectedCosmetics.add(normalized);
         }
      }

      if (!selectedCosmetics.isEmpty() && APPLYING.compareAndSet(false, true)) {
         int var6 = APPLY_GENERATION.incrementAndGet();
         long var7 = System.currentTimeMillis();
         applyingAvatarId = "rain-cosmetics";
         status = "Installing cosmetics";
         LOGGER.info("Starting cosmetics installation and apply: ids={}, generation={}", selectedCosmetics, var6);
         Thread thread = new Thread(
            () -> {
               try {
                  String combinedId = دس.installCombinedCosmetics(selectedCosmetics);
                  Path avatarPath = installedAvatarPath(combinedId);
                  if (avatarPath == null) {
                     status = "Cosmetic files not found";
                     LOGGER.warn("Combined cosmetics path is unavailable: id={}, selected={}", combinedId, selectedCosmetics);
                     finishApply(var6);
                     return;
                  }

                  LOGGER.debug("Combined cosmetics files are ready: id={}, path={}", combinedId, avatarPath);
                  MinecraftClient minecraft = MinecraftClient.getInstance();
                  if (minecraft == null) {
                     status = "Minecraft is not ready";
                     LOGGER.warn("Minecraft is unavailable while applying cosmetics: id={}", combinedId);
                     finishApply(var6);
                     return;
                  }

                  minecraft.execute(
                     () -> {
                        try {
                           if (var6 != APPLY_GENERATION.get()) {
                              LOGGER.debug("Discarded stale cosmetics apply task: id={}, generation={}", combinedId, var6);
                              return;
                           }

                           if (!isFiguraLoaded()) {
                              status = "Model runtime is not loaded";
                              LOGGER.warn("Figura runtime is not loaded while applying cosmetics: id={}", combinedId);
                              return;
                           }

                           boolean applied = applyLocalAvatar(avatarPath);
                           if (applied) {
                              appliedAvatarId = combinedId;
                              status = "Cosmetics applied";
                              LOGGER.info(
                                 "Cosmetics applied successfully: id={}, generation={}, duration={}ms", combinedId, var6, System.currentTimeMillis() - var7
                              );
                           } else {
                              status = "Failed to apply cosmetics";
                              LOGGER.error(
                                 "Figura rejected cosmetics apply: id={}, path={}, generation={}, duration={}ms",
                                 combinedId,
                                 avatarPath,
                                 var6,
                                 System.currentTimeMillis() - var7
                              );
                           }
                        } finally {
                           finishApply(var6);
                        }
                     }
                  );
               } catch (Throwable throwable) {
                  if (var6 == APPLY_GENERATION.get()) {
                     status = "Cosmetics runtime error: " + throwable.getClass().getSimpleName();
                  }

                  LOGGER.error(
                     "Cosmetics installation or apply failed: ids={}, generation={}, duration={}ms",
                     selectedCosmetics,
                     var6,
                     System.currentTimeMillis() - var7,
                     throwable
                  );
                  finishApply(var6);
               }
            },
            "Rain-Figura-Cosmetics-Apply"
         );
         thread.setDaemon(true);
         thread.start();
      } else {
         LOGGER.info("Ignored cosmetics apply request: selected={}, active={}", selectedCosmetics, APPLYING.get() ? applyingAvatarId : "none");
      }
   }

   private static void resetPanic(Class<?> manager) {
      try {
         Field panic = manager.getDeclaredField("panic");
         panic.setAccessible(true);
         if (!Modifier.isStatic(panic.getModifiers())) {
            return;
         }

         Class<?> type = panic.getType();
         if (type == boolean.class || type == Boolean.class) {
            panic.setBoolean(null, false);
            return;
         }

         if (panic.get(null) instanceof AtomicBoolean atomicBoolean) {
            atomicBoolean.set(false);
         }
      } catch (Throwable var5) {
      }
   }

   public static boolean renderPreviewStatic(
      String player,
      DrawContext right,
      GuiRenderer lookY,
      GpuBufferSlice fogBuffer,
      int size,
      int lookX,
      int bottom,
      int avatarId,
      int left,
      float guiRenderer,
      float graphics,
      ClientPlayerEntity top
   ) {
      return renderPreviewInternal(avatarId, graphics, guiRenderer, fogBuffer, left, top, right, bottom, size, lookX, lookY, player, false);
   }

   private static String normalizeAvatarId(String avatarId) {
      if (avatarId == null) {
         return null;
      }

      String normalized = avatarId.trim();
      return normalized.isEmpty() ? null : normalized;
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
      String normalized = normalizeAvatarId(avatarId);
      return normalized != null && normalized.equals(appliedAvatarId);
   }

   private static boolean applyLocalAvatar(Path path) {
      try {
         Class<?> manager = Class.forName("other.figura.avatar.AvatarManager");
         LOGGER.debug("Resolving Figura local model loader: manager={}, path={}", manager.getName(), path);
         resetPanic(manager);
         Method exactPath = findExactMethod(manager, "loadLocalAvatar", Path.class);
         if (exactPath != null && invokeAvatarLoad(exactPath, path)) {
            return true;
         }

         Method exactStringPath = findExactMethod(manager, "loadLocalAvatar", String.class, Path.class);
         if (exactStringPath != null && invokeAvatarLoad(exactStringPath, path.getFileName().toString(), path)) {
            return true;
         }

         Method exactPathBoolean = findExactMethod(manager, "loadLocalAvatar", Path.class, boolean.class);
         if (exactPathBoolean != null && invokeAvatarLoad(exactPathBoolean, path, true)) {
            return true;
         }

         for (Method method : manager.getDeclaredMethods()) {
            String methodName = method.getName().toLowerCase(Locale.ROOT);
            if ((method.getName().equals("loadLocalAvatar") || methodName.contains("loadlocalavatar")) && Modifier.isStatic(method.getModifiers())) {
               Class<?>[] params = method.getParameterTypes();
               if (params.length == 1 && Path.class.isAssignableFrom(params[0]) && invokeAvatarLoad(method, path)) {
                  return true;
               }

               if (params.length == 2
                  && params[0] == String.class
                  && Path.class.isAssignableFrom(params[1])
                  && invokeAvatarLoad(method, path.getFileName().toString(), path)) {
                  return true;
               }

               if (params.length == 2
                  && Path.class.isAssignableFrom(params[0])
                  && (params[1] == boolean.class || params[1] == Boolean.class)
                  && invokeAvatarLoad(method, path, true)) {
                  return true;
               }
            }
         }

         LOGGER.error("No compatible Figura local model loader accepted path: {}", path);
      } catch (Throwable var11) {
         LOGGER.error("Failed to resolve or invoke Figura local model loader: path={}", path, var11);
      }

      return false;
   }

   private static void detachLocalUserData(Class<?> manager, UUID playerId) {
      if (playerId != null) {
         try {
            Field loadedUsers = manager.getDeclaredField("LOADED_USERS");
            Field fetchedUsers = manager.getDeclaredField("FETCHED_USERS");
            loadedUsers.setAccessible(true);
            fetchedUsers.setAccessible(true);
            ((Map)loadedUsers.get(null)).remove(playerId);
            ((Set)fetchedUsers.get(null)).add(playerId);
         } catch (Throwable var4) {
         }
      }
   }

   public static طع preparePreview(String avatarId, ClientPlayerEntity player) {
      String normalized = normalizeAvatarId(avatarId);
      if (isSafeAvatarId(normalized) && player != null && isFiguraLoaded()) {
         بس preview = PREVIEWS.computeIfAbsent(normalized, ignored -> new بس());
         requestPreview(normalized, preview, player.getUuid());
         updatePreviewState(preview);
         if (preview.ready && preview.userData != null) {
            return طع.READY;
         } else {
            return preview.failed ? طع.FAILED : طع.LOADING;
         }
      } else {
         return طع.UNAVAILABLE;
      }
   }

   private static boolean isSafeAvatarId(String avatarId) {
      return avatarId != null && !avatarId.isBlank() && !avatarId.contains("/") && !avatarId.contains("\\") && !".".equals(avatarId) && !"..".equals(avatarId);
   }

   private static void tickPreviewAvatar(بس preview, boolean force) {
      Object avatar = preview.avatar;
      if (avatar != null && figuraAvatarTickMethod != null) {
         long now = System.currentTimeMillis();
         if (force || now - preview.lastTick >= 50L) {
            try {
               figuraAvatarTickMethod.invoke(avatar);
               preview.lastTick = now;
            } catch (Throwable var6) {
            }
         }
      }
   }

   private static void setPreviewOpacity(Object opacity, float avatar) {
      if (avatar != null) {
         try {
            Object renderer = avatar.getClass().getField("renderer").get(avatar);
            if (renderer == null) {
               return;
            }

            Object root = renderer.getClass().getField("root").get(renderer);
            if (root != null) {
               root.getClass().getMethod("setOpacity", Float.class).invoke(root, opacity);
            }
         } catch (Throwable var4) {
         }
      }
   }

   public static void installAndApplyAsync(String avatarId) {
      String normalized = normalizeAvatarId(avatarId);
      if (!isSafeAvatarId(normalized)) {
         LOGGER.warn("Rejected model apply request with invalid id: {}", avatarId);
      } else if (!APPLYING.compareAndSet(false, true)) {
         LOGGER.info("Ignored model apply request while another model is applying: requested={}, active={}", normalized, applyingAvatarId);
      } else {
         int generation = APPLY_GENERATION.incrementAndGet();
         long startedAt = System.currentTimeMillis();
         applyingAvatarId = normalized;
         status = "Installing " + normalized;
         LOGGER.info("Starting model installation and apply: id={}, generation={}", normalized, generation);
         Thread thread = new Thread(
            () -> {
               try {
                  دس.installBlocking(normalized);
                  Path avatarPath = installedAvatarPath(normalized);
                  if (avatarPath == null) {
                     status = "Avatar files not found: " + normalized;
                     LOGGER.warn("Installed model path is unavailable: id={}", normalized);
                     finishApply(generation);
                     return;
                  }

                  LOGGER.debug("Model files are ready for apply: id={}, path={}", normalized, avatarPath);
                  MinecraftClient minecraft = MinecraftClient.getInstance();
                  if (minecraft == null) {
                     status = "Minecraft is not ready";
                     LOGGER.warn("Minecraft is unavailable while applying model: id={}", normalized);
                     finishApply(generation);
                     return;
                  }

                  minecraft.execute(
                     () -> {
                        try {
                           if (generation != APPLY_GENERATION.get()) {
                              LOGGER.debug("Discarded stale model apply task: id={}, generation={}", normalized, generation);
                              return;
                           }

                           if (!isFiguraLoaded()) {
                              status = "Model runtime is not loaded";
                              LOGGER.warn("Figura runtime is not loaded while applying model: id={}", normalized);
                              return;
                           }

                           boolean applied = applyLocalAvatar(avatarPath);
                           if (applied) {
                              appliedAvatarId = normalized;
                              status = "Model applied: " + normalized;
                              LOGGER.info(
                                 "Model applied successfully: id={}, generation={}, duration={}ms",
                                 normalized,
                                 generation,
                                 System.currentTimeMillis() - startedAt
                              );
                           } else {
                              status = "Failed to apply " + normalized;
                              LOGGER.error(
                                 "Figura rejected model apply: id={}, path={}, generation={}, duration={}ms",
                                 normalized,
                                 avatarPath,
                                 generation,
                                 System.currentTimeMillis() - startedAt
                              );
                           }
                        } finally {
                           finishApply(generation);
                        }
                     }
                  );
               } catch (Throwable throwable) {
                  if (generation == APPLY_GENERATION.get()) {
                     status = "Model runtime error: " + throwable.getClass().getSimpleName();
                  }

                  LOGGER.error(
                     "Model installation or apply failed: id={}, generation={}, duration={}ms",
                     normalized,
                     generation,
                     System.currentTimeMillis() - startedAt,
                     throwable
                  );
                  finishApply(generation);
               }
            },
            "Rain-Figura-Avatar-Apply"
         );
         thread.setDaemon(true);
         thread.start();
      }
   }

   private static void failPreview(بس phase, String preview, Throwable throwable) {
      preview.loading = false;
      preview.ready = false;
      preview.failed = true;
      preview.failedAtMillis = System.currentTimeMillis();
      clearUserData(preview.userData);
      preview.userData = null;
      preview.avatar = null;
      long duration = preview.requestedAtMillis <= 0L ? 0L : System.currentTimeMillis() - preview.requestedAtMillis;
      if (throwable == null) {
         LOGGER.warn("Figura preview preparation failed: id={}, phase={}, generation={}, duration={}ms", preview.avatarId, phase, preview.generation, duration);
      } else {
         LOGGER.error(
            "Figura preview preparation failed: id={}, phase={}, generation={}, duration={}ms",
            preview.avatarId,
            phase,
            preview.generation,
            duration,
            throwable
         );
      }
   }

   private static Method findExactMethod(Class<?> name, String clazz, Class<?>... params) {
      try {
         Method ignored = clazz.getDeclaredMethod(name, params);
         return Modifier.isStatic(ignored.getModifiers()) ? ignored : null;
      } catch (Throwable var4) {
         return null;
      }
   }

   private static boolean renderWithTemporaryUserData(UUID playerId, Object userData, خّ renderer) {
      if (playerId != null && userData != null && figuraLoadedUsersField != null && figuraFetchedUsersField != null) {
         try {
            Map ignored = (Map)figuraLoadedUsersField.get(null);
            Set fetched = (Set)figuraFetchedUsersField.get(null);
            Object previous = ignored.put(playerId, userData);
            boolean wasFetched = fetched.contains(playerId);
            fetched.add(playerId);

            try {
               renderer.run();
            } finally {
               if (previous == null) {
                  ignored.remove(playerId);
               } else {
                  ignored.put(playerId, previous);
               }

               if (!wasFetched) {
                  fetched.remove(playerId);
               }
            }

            return true;
         } catch (Throwable var11) {
            return false;
         }
      } else {
         return false;
      }
   }

   private static void updatePreviewState(بس preview) {
      if (preview.loading && preview.requestedAtMillis > 0L && System.currentTimeMillis() - preview.requestedAtMillis > 30000L) {
         failPreview(preview, "Figura avatar loading timed out", null);
      } else {
         Object userData = preview.userData;
         if (preview.loading && userData != null && figuraUserDataGetAvatarMethod != null) {
            try {
               Object throwable = figuraUserDataGetAvatarMethod.invoke(userData);
               if (throwable == null) {
                  return;
               }

               boolean loaded = true;

               try {
                  Field loadedField = throwable.getClass().getField("loaded");
                  loaded = loadedField.getBoolean(throwable);
               } catch (Throwable var5) {
               }

               if (loaded) {
                  preview.avatar = throwable;
                  preview.loading = false;
                  preview.ready = true;
                  preview.failed = false;
                  preview.lastTick = 0L;
                  preview.readyAtMillis = System.currentTimeMillis();
                  LOGGER.info(
                     "Figura preview is ready: id={}, avatarClass={}, generation={}, duration={}ms",
                     preview.avatarId,
                     throwable.getClass().getName(),
                     preview.generation,
                     preview.readyAtMillis - preview.requestedAtMillis
                  );
               }
            } catch (Throwable var6) {
               failPreview(preview, "reading Figura avatar state failed", var6);
            }
         }
      }
   }
}
