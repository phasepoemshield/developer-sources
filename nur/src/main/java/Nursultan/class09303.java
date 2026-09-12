package Nursultan;

import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.UserApiService.UserProperties;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import minecraft.class02051;
import minecraft.class03323;
import minecraft.class03409;
import minecraft.class03415;
import minecraft.class03448;
import minecraft.class03930;
import minecraft.class04453;
import minecraft.class04771;
import minecraft.class05463;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class09303 {
   public static Object N_0 = LogManager.getLogger(String.class);

   private class09303() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      y();
      N();
   }

   private static void y() {
   }

   public static boolean N(class09250 var0) {
      Object var10000;
      Objects.requireNonNull(var10000);
      Object var1 = var10000;

      var0.i();
      return switch (var1) {
         case class11991 var3 -> N(var3.u(), var3.y());
         case class11166 var4 -> N(var0, var4);
         default -> throw new MatchException(null, null);
      };
   }

   private static void N() {
      N_0 = null;
   }

   public static boolean N(String var0, UUID var1) {
      class06202 var2 = class06202.Nq();
      if ((class03448)var2.T_3 == null && (class04453)var2.T_4 == null && var2.NE() == null) {
         class04771 var3 = new class04771(var0, var1, "", Optional.empty(), Optional.empty());
         class03930 var5 = class03930.N(YggdrasilAuthenticationService.createOffline(var2.NJ()), (File)var2.l_1);
         UserApiService var6 = UserApiService.OFFLINE;

         UserProperties var7;
         try {
            var7 = var6.fetchProperties();
         } catch (Throwable var14) {
            var7 = UserApiService.OFFLINE_PROPERTIES;
         }

         class05463 var8 = new class05463(var2, var6);
         class03323 var9 = new class03323(var2, var6, var3);
         class02051 var10 = class02051.N(var6, var3, ((File)var2.l_1).toPath());
         class03409 var11 = class03409.N(class03415.N(), var6);
         UserProperties var12 = var7;
         Runnable var13 = () -> {
            class11995 var11x = (class11995)var2;
            var2.i_2 = var3;
            var11x.N(var5);
            var11x.N(CompletableFuture.completedFuture(null));
            var11x.N(var6);
            var11x.y(CompletableFuture.completedFuture(var12));
            var11x.N(var8);
            var11x.N(var9);
            var11x.N(var10);
            var11x.N(var11);
            var2.yZ();
            ((Logger)N_0).info("Switched offline account to {} ({})", var0, var1);
         };
         if (var2.E_()) {
            var13.run();
         } else {
            var2.execute(var13);
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean N(class09250 var0, class11166 var1) {
      class06202 var2 = class06202.Nq();
      if ((class03448)var2.T_3 == null && (class04453)var2.T_4 == null && var2.NE() == null) {
         String var3 = class09120.N(var1.R());
         if (var3 == null) {
            ((Logger)N_0).warn("Microsoft account {} has no stored token", var1.u());
            return false;
         } else {
            UUID var4 = var1.y();
            class11723.N(var4);
            Thread var5 = new Thread(() -> {
               try {
                  class10885 var5x = class11108.N(var3);
                  class11540 var10 = class11108.N(var5x);
                  byte[] var11 = class09120.N(var10.u());
                  class09250 var8 = new class09250(new class11166(var1.i(), var10.N(), var10.i(), var11), var0.y(), var0.M());
                  var2.execute(() -> {
                     class11938.s().L(var8);
                     N(var10.i(), var10.N(), var10.y(), var10.L());
                     class11723.L(var4);
                  });
               } catch (Throwable var9) {
                  ((Logger)N_0).error("Microsoft re-authentication failed", var9);
                  String var6 = var9 instanceof class11001 var7 ? var7.N() : "account.modal.microsoft.error.generic";
                  class11723.N(var4, var6);
                  class11303.y("Microsoft: " + class12020.N(var6));
               }
            }, "Nursultan-MS-Reauth");
            var5.setDaemon(true);
            var5.start();
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean N(String var0, UUID var1, String var2, String var3) {
      class06202 var4 = class06202.Nq();
      if ((class03448)var4.T_3 == null && (class04453)var4.T_4 == null && var4.NE() == null) {
         class04771 var5 = new class04771(var0, var1, var2, Optional.ofNullable(var3), Optional.empty());
         YggdrasilAuthenticationService var6 = new YggdrasilAuthenticationService(var4.NJ());
         class03930 var7 = class03930.N(var6, (File)var4.l_1);

         UserApiService var8;
         try {
            var8 = var6.createUserApiService(var2);
         } catch (Throwable var18) {
            var8 = UserApiService.OFFLINE;
         }

         UserProperties var9;
         try {
            var9 = var8.fetchProperties();
         } catch (Throwable var17) {
            var9 = UserApiService.OFFLINE_PROPERTIES;
         }

         class05463 var10 = new class05463(var4, var8);
         class03323 var11 = new class03323(var4, var8, var5);
         class02051 var12 = class02051.N(var8, var5, ((File)var4.l_1).toPath());
         class03409 var13 = class03409.N(class03415.N(), var8);
         UserApiService var14 = var8;
         UserProperties var15 = var9;
         Runnable var16 = () -> {
            class11995 var11x = (class11995)var4;
            var4.i_2 = var5;
            var11x.N(var7);
            var11x.N(CompletableFuture.completedFuture(null));
            var11x.N(var14);
            var11x.y(CompletableFuture.completedFuture(var15));
            var11x.N(var10);
            var11x.N(var11);
            var11x.N(var12);
            var11x.N(var13);
            var4.yZ();
            ((Logger)N_0).info("Switched Microsoft account to {} ({})", var0, var1);
         };
         if (var4.E_()) {
            var16.run();
         } else {
            var4.execute(var16);
         }

         return true;
      } else {
         return false;
      }
   }
}
