package ru.metaculture.protection;

import com.mojang.authlib.yggdrasil.ProfileResult;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_310;
import net.minecraft.class_320;
import net.minecraft.class_7853;
import net.minecraft.class_320.class_321;
import org.wild.mixin.acceser.MinecraftClientSessionAccessor;

public final class uUNNNVNVvNV {
   private static uUNNNVNVvNV.NVnVnNnN UuUVuuUu;

   private uUNNNVNVvNV() {
   }

   public static void UuUVuuUu(class_310 var0) {
      if (var0 != null && UuUVuuUu == null) {
         MinecraftClientSessionAccessor var1 = (MinecraftClientSessionAccessor)var0;
         class_320 var2 = var1.litka$getSession();
         if (var2 != null) {
            class_7853 var3 = var1.litka$getProfileKeys();
            CompletableFuture var4 = var1.litka$getGameProfileFuture();
            UuUVuuUu = new uUNNNVNVvNV.NVnVnNnN(
               var2, var3 == null ? class_7853.field_40800 : var3, var4 == null ? CompletableFuture.completedFuture(null) : var4
            );
         }
      }
   }

   public static Optional<class_320> C00OOC00oO(class_310 var0) {
      UuUVuuUu(var0);
      return Optional.ofNullable(UuUVuuUu).map(uUNNNVNVvNV.NVnVnNnN::session);
   }

   public static boolean UuUVuuUu(class_310 var0, String var1) {
      UuUVuuUu(var0);
      if (var0 != null && UuUVuuUu != null) {
         if (var1 != null && !UuUVuuUu.session().method_1676().equals(var1)) {
            return false;
         } else {
            UuUVuuUu(var0, UuUVuuUu);
            return true;
         }
      } else {
         return false;
      }
   }

   public static class_320 C00OOC00oO(class_310 var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         UuUVuuUu(var0);
         String var2 = var1 == null ? "" : var1;
         class_320 var3 = new class_320(
            var2,
            UUID.nameUUIDFromBytes(("OfflinePlayer:" + var2).getBytes(StandardCharsets.UTF_8)),
            "",
            Optional.empty(),
            Optional.empty(),
            class_321.field_1990
         );
         UuUVuuUu(var0, new uUNNNVNVvNV.NVnVnNnN(var3, class_7853.field_40800, CompletableFuture.completedFuture(null)));
         return var3;
      }
   }

   public static void UuUVuuUu() {
      uUNNNVNVvNV.NVnVnNnN var0 = UuUVuuUu;
      UuUVuuUu = null;
      if (var0 != null && var0.gameProfileFuture() != null && !var0.gameProfileFuture().isDone()) {
         var0.gameProfileFuture().cancel(true);
      }
   }

   private static void UuUVuuUu(class_310 var0, uUNNNVNVvNV.NVnVnNnN var1) {
      MinecraftClientSessionAccessor var2 = (MinecraftClientSessionAccessor)var0;
      var2.litka$setSession(var1.session());
      var2.litka$setProfileKeys(var1.profileKeys());
      var2.litka$setGameProfileFuture(var1.gameProfileFuture());
   }

   record NVnVnNnN(class_320 session, class_7853 profileKeys, CompletableFuture<ProfileResult> gameProfileFuture) {
   }
}
