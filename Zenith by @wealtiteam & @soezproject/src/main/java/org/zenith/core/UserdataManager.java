package org.zenith.core;

import org.zenith.client.screens.entity.ImplOtherClientPlayerEntity;

import org.zenith.ZenithClient;

import org.zenith.event.EventUpdateHealth;

import org.slf4j.Logger;

import org.zenith.base.figura.avatar.Avatar;
import org.zenith.base.figura.avatar.AvatarLayer;
import org.zenith.base.figura.avatar.AvatarManager;
import org.zenith.base.figura.avatar.local.LocalAvatarLoader;
import org.zenith.base.figura.avatar.UserData;
import org.zenith.base.figura.FiguraMod;














import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import net.minecraft.client.MinecraftClient;

public final class UserdataManager {
   public static final AtomicLong atomicLong6 = new AtomicLong();
   public static final ConcurrentHashMap<AvatarJob, AvatarCacheEntry> concurrentHashMap = new ConcurrentHashMap<>();
   public static final ExecutorService executorService4 = java.util.concurrent.Executors.newCachedThreadPool();

   public UserdataManager() {
   }

   public static void PotionItemBuilder(Path var0) {
      MinecraftClient minecraftclient = MinecraftClient.getInstance();
      if (minecraftclient != null && minecraftclient.player != null) {
         on23(minecraftclient.player.getUuid(), var0);
      }
   }

   public static UserData on23(Path var0, UUID var1) {
      Path path = StringCodec(var0);
      if (path != null && var1 != null) {
         UserData userdata = new UserData(var1);
         LocalAvatarLoader.loadAvatar(path, userdata);
         return userdata.getAvatars().isEmpty() ? null : userdata;
      } else {
         return null;
      }
   }

   public static void UiAnimation(UUID var0, String var1) {
      on23(var0, EventUpdateHealth(var1));
   }

   public static void on23(UUID var0, Path var1) {
      if (var0 != null) {
         Path path = StringCodec(var1);
         if (path != null) {
            ModuleSnapshotDto(var0);
            on23(var0, path, AvatarLayer.BODY, AvatarKind.call266);
         }
      }
   }

   public static void Easing(UUID var0, String var1) {
      UiAnimation(var0, EventUpdateHealth(var1));
   }

   public static void UiAnimation(UUID var0, Path var1) {
      if (var0 != null) {
         Path path = StringCodec(var1);
         if (path != null) {
            on23(var0, path, AvatarLayer.BODY, AvatarKind.call439);
         }
      }
   }

   public static void ColorAnimator(UUID var0, String var1) {
      Easing(var0, EventUpdateHealth(var1));
   }

   public static void Easing(UUID var0, Path var1) {
      on23(var0, var1, AvatarLayer.BODY);
   }

   public static void ItemRegistry(UUID var0, String var1) {
      ColorAnimator(var0, EventUpdateHealth(var1));
   }

   public static void ColorAnimator(UUID var0, Path var1) {
      on23(var0, var1, AvatarLayer.WEAPON);
   }

   public static void on23(UUID var0, Path var1, AvatarLayer var2) {
      if (var0 != null) {
         Path path = StringCodec(var1);
         if (path != null) {
            on23(var0, path, var2, AvatarKind.getFbo);
         }
      }
   }

   public static boolean NbtEditor(UUID var0) {
      return AvatarManager.contains(var0);
   }

   public static boolean PotionItemBuilder(UUID var0) {
      return AvatarManager.contains(var0, AvatarLayer.BODY);
   }

   public static boolean ProfileItemBuilder(UUID var0) {
      return AvatarManager.contains(var0, AvatarLayer.WEAPON);
   }

   public static void StringCodec(UUID var0) {
      if (var0 != null) {
         ModuleSnapshotDto(var0);
         ColorAnimator(() -> AvatarManager.clear(var0));
      }
   }

   public static void FileLogger(UUID var0) {
      UiAnimation(var0, AvatarLayer.BODY);
   }

   public static void CloudApiClient(UUID var0) {
      UiAnimation(var0, AvatarLayer.WEAPON);
   }

   public static void UiAnimation(UUID var0, AvatarLayer var1) {
      if (var0 != null) {
         Easing(var0, var1);
         ColorAnimator(() -> AvatarManager.clear(var0, var1));
      }
   }

   public static void MediaTrackInfo(UUID var0) {
      Easing(var0, AvatarLayer.BODY);
   }

   public static void CloudUserProfile(UUID var0) {
      Easing(var0, AvatarLayer.WEAPON);
   }

   public static String ProfileItemBuilder(Path var0) {
      if (var0 == null) {
         return "";
      } else {
         Path path = ZenithClient.ColorAnimator.toPath().toAbsolutePath().normalize();
         Path path1 = var0.toAbsolutePath().normalize();
         return path1.startsWith(path) ? path.relativize(path1).toString().replace('\\', '/') : "";
      }
   }

   public static Path EventUpdateHealth(String var0) {
      if (var0 != null && !var0.isBlank()) {
         Path path = ZenithClient.ColorAnimator.toPath().toAbsolutePath().normalize();
         Path path1 = path.resolve(var0).normalize();
         return path1.startsWith(path) ? path1 : null;
      } else {
         return null;
      }
   }

   public static Path StringCodec(Path var0) {
      if (var0 == null) {
         return null;
      } else {
         Path path = var0.toAbsolutePath().normalize();
         return Files.isDirectory(path)
               && (Files.isRegularFile(path.resolve("avatar.json")) || Files.isRegularFile(path.resolve("avatar.jsonc")))
            ? path
            : null;
      }
   }

   public static void ColorAnimator(Runnable var0) {
      MinecraftClient minecraftclient = MinecraftClient.getInstance();
      if (minecraftclient != null && !minecraftclient.isOnThread()) {
         minecraftclient.execute(var0);
      } else {
         var0.run();
      }
   }

   public static void on23(UUID var0, Path var1, AvatarLayer var2, AvatarKind var3) {
      AvatarJob i1llliililll_l1i1illlili = new AvatarJob(var0, var2);
      AvatarCacheEntry i1llliililll_illi1l1l1 = concurrentHashMap.get(i1llliililll_l1i1illlili);
      if (i1llliililll_illi1l1l1 == null || !i1llliililll_illi1l1l1.path().equals(var1) || i1llliililll_illi1l1l1.vec3d37() != var3) {
         AvatarCacheEntry i1llliililll_illi1l1l11 = new AvatarCacheEntry(var1, var3, atomicLong6.incrementAndGet());
         concurrentHashMap.put(i1llliililll_l1i1illlili, i1llliililll_illi1l1l11);
         executorService4.execute(() -> on23(i1llliililll_l1i1illlili, i1llliililll_illi1l1l11));
      }
   }

   public static void on23(AvatarJob var0, AvatarCacheEntry var1) {
      if (concurrentHashMap.get(var0) == var1) {
         UserData userdata = new UserData(var0.uUID4());

         try {
            LocalAvatarLoader.loadAvatar(var1.path(), userdata, var0.implOtherClientPlayerEntity());
         } catch (Throwable throwable) {
            FiguraMod.LOGGER.error("Failed to prepare local avatar {} for {}", var1.path(), var0.uUID4(), throwable);
         }

         boolean flag = userdata.getAvatars(var0.implOtherClientPlayerEntity()).stream().anyMatch(var0x -> var0x.loaded && var0x.renderer != null);
         MinecraftClient minecraftclient = MinecraftClient.getInstance();
         if (minecraftclient == null) {
            concurrentHashMap.remove(var0, var1);
         } else {
            minecraftclient.execute(() -> on23(var0, var1, userdata, flag));
         }
      }
   }

   public static void on23(AvatarJob var0, AvatarCacheEntry var1, UserData var2, boolean var3) {
      if (concurrentHashMap.get(var0) == var1 && var3) {
         if (var1.vec3d37() == AvatarKind.call266) {
            AvatarManager.clear(var0.uUID4());
         }

         UserData userdata = AvatarManager.getOrCreate(var0.uUID4());
         if (var1.vec3d37() == AvatarKind.getFbo) {
            userdata.clear(var0.implOtherClientPlayerEntity());
         }

         var queue = var2.getAvatars();

         Avatar avatar;
         while ((avatar = (Avatar)queue.poll()) != null) {
            userdata.getAvatars().offer(avatar);
         }

         concurrentHashMap.remove(var0, var1);
      } else {
         concurrentHashMap.remove(var0, var1);
         var2.clear();
         if (!var3) {
            FiguraMod.LOGGER.warn("Ignoring unusable local avatar {} for {}", var1.path(), var0.uUID4());
         }
      }
   }

   public static void Easing(UUID var0, AvatarLayer var1) {
      if (var0 != null) {
         concurrentHashMap.remove(new AvatarJob(var0, var1));
      }
   }

   public static void ModuleSnapshotDto(UUID var0) {
      if (var0 != null) {
         Easing(var0, AvatarLayer.BODY);
         Easing(var0, AvatarLayer.WEAPON);
      }
   }
}
