package ru.metaculture.protection;

import com.mojang.authlib.yggdrasil.ProfileResult;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.session.ProfileKeys;
import net.minecraft.client.session.Session;
import net.minecraft.client.session.Session.AccountType;
import org.wild.mixin.acceser.MinecraftClientSessionAccessor;

public final class O0000O00O00OO0 {
   private static O0000O00O00OO0.W359 O00000000;

   private O0000O00O00OO0() {
   }

   public static void O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && O00000000 == null) {
         MinecraftClientSessionAccessor var1 = (MinecraftClientSessionAccessor)minecraftClient;
         Session var2 = var1.litka$getSession();
         if (var2 != null) {
            ProfileKeys var3 = var1.litka$getProfileKeys();
            CompletableFuture var4 = var1.litka$getGameProfileFuture();
            O00000000 = new O0000O00O00OO0.W359(var2, var3 == null ? ProfileKeys.MISSING : var3, var4 == null ? CompletableFuture.completedFuture(null) : var4);
         }
      }
   }

   public static Optional<Session> O000000000(MinecraftClient minecraftClient) {
      O00000000(minecraftClient);
      return Optional.ofNullable(O00000000).map(O0000O00O00OO0.W359::session);
   }

   public static boolean O00000000(MinecraftClient minecraftClient, String string) {
      O00000000(minecraftClient);
      if (minecraftClient != null && O00000000 != null) {
         if (string != null && !O00000000.session().getUsername().equalsIgnoreCase(string)) {
            return false;
         } else {
            O00000000(minecraftClient, O00000000);
            return true;
         }
      } else {
         return false;
      }
   }

   public static Session O000000000(MinecraftClient minecraftClient, String string) {
      if (minecraftClient == null) {
         return null;
      } else {
         O00000000(minecraftClient);
         String var2 = string == null ? "" : string;
         Session var3 = new Session(
            var2,
            UUID.nameUUIDFromBytes(("OfflinePlayer:" + var2).getBytes(StandardCharsets.UTF_8)),
            "",
            Optional.empty(),
            Optional.empty(),
            AccountType.LEGACY
         );
         O00000000(minecraftClient, new O0000O00O00OO0.W359(var3, ProfileKeys.MISSING, CompletableFuture.completedFuture(null)));
         return var3;
      }
   }

   public static void O00000000() {
      O0000O00O00OO0.W359 var0 = O00000000;
      O00000000 = null;
      if (var0 != null && var0.gameProfileFuture() != null && !var0.gameProfileFuture().isDone()) {
         var0.gameProfileFuture().cancel(true);
      }
   }

   private static void O00000000(MinecraftClient minecraftClient, O0000O00O00OO0.W359 o00000000) {
      MinecraftClientSessionAccessor var2 = (MinecraftClientSessionAccessor)minecraftClient;
      var2.litka$setSession(o00000000.session());
      var2.litka$setProfileKeys(o00000000.profileKeys());
      var2.litka$setGameProfileFuture(o00000000.gameProfileFuture());
   }

   record W359(Session session, ProfileKeys profileKeys, CompletableFuture<ProfileResult> gameProfileFuture) {
   }
}
