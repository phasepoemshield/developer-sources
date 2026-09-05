package ru.metaculture.protection;

import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Pattern;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2598;
import net.minecraft.class_2915;
import net.minecraft.class_310;
import net.minecraft.class_6368;
import net.minecraft.class_6370;
import net.minecraft.class_639;

public final class OCO0OoO {
   private static final Pattern UuUVuuUu = Pattern.compile("[A-Za-z0-9_]{1,16}");

   private OCO0OoO() {
   }

   public static boolean UuUVuuUu(String var0, String var1) {
      var0 = var0 == null ? "" : var0.trim();
      var1 = var1 == null ? "" : var1.trim();
      if (!UuUVuuUu.matcher(var0).matches()) {
         uUnuvNvvNU(var0.isEmpty() ? "?" : var0, "§cnickname must contain 1-16 latin letters, digits or '_'");
         return false;
      } else if (var1.isEmpty()) {
         uUnuvNvvNU(var0, "§cserver address is empty");
         return false;
      } else if (!nnVNNuuVUVn.uNNnnnuuuN(var0)) {
         uUnuvNvvNU(var0, "§ca bot with this nickname is already connecting or online");
         return false;
      } else {
         long var4 = nnVNNuuVUVn.C00OOC00oO(var0, var1);
         if (var4 < 0L) {
            nnVNNuuVUVn.nuUnNvnuUu(var0);
            uUnuvNvvNU(var0, "§ccould not start a new connection attempt");
            return false;
         } else {
            Thread var6 = new Thread(() -> {
               vUNVNUnuv var4x = null;
               boolean var16 = false /* VF: Semaphore variable */;

               label185: {
                  label184: {
                     label183: {
                        label182: {
                           label181: {
                              label180: {
                                 label202: {
                                    label203: {
                                       try {
                                          var16 = true;
                                          if (!nnVNNuuVUVn.UuUVuuUu(var0, var4, Thread.currentThread())) {
                                             var16 = false;
                                             break label185;
                                          }

                                          UuUVuuUu(var0, var4, "resolving " + var1 + " ...");
                                          class_639 var5 = class_639.method_2950(var1);
                                          Optional var19 = class_6370.field_33745.method_36907(var5);
                                          if (var19.isEmpty()) {
                                             String var21 = "cannot resolve address: " + var1;
                                             nnVNNuuVUVn.UuUVuuUu(var0, var4, var21);
                                             UuUVuuUu(var0, var4, "§c" + var21);
                                             var16 = false;
                                             break label184;
                                          }

                                          if (!nnVNNuuVUVn.C00OOC00oO(var0, var4)) {
                                             var16 = false;
                                             break label183;
                                          }

                                          InetSocketAddress var20 = ((class_6368)var19.get()).method_36902();
                                          String var8x = "resolved -> " + var20.getHostString() + ":" + var20.getPort() + ", connecting ...";
                                          nnVNNuuVUVn.UuUVuuUu(var0, var4, nnVNNuuVUVn.nvnNNunvv.CONNECTING, var8x);
                                          UuUVuuUu(var0, var4, var8x);
                                          boolean var9 = class_310.method_1551().field_1690.method_1639();
                                          class_2535 var10 = new class_2535(class_2598.field_11942);
                                          var4x = new vUNVNUnuv(var0, var10);
                                          ChannelFuture var11 = class_2535.method_52271(var20, var9, var10);

                                          while (!var11.awaitUninterruptibly(100L)) {
                                             if (Thread.currentThread().isInterrupted() || !nnVNNuuVUVn.C00OOC00oO(var0, var4)) {
                                                var11.cancel(true);
                                                var10.method_10747(class_2561.method_43470("Bot connection cancelled"));
                                                var16 = false;
                                                break label182;
                                             }
                                          }

                                          if (!var11.isSuccess()) {
                                             throw new IllegalStateException("TCP connection failed", var11.cause());
                                          }

                                          if (!nnVNNuuVUVn.C00OOC00oO(var0, var4)) {
                                             var10.method_10747(class_2561.method_43470("Bot connection cancelled"));
                                             var16 = false;
                                             break label181;
                                          }

                                          var10.method_52902(var5.method_2952(), var5.method_2954(), new NvuvVnuNuvUv(var10, var4x));
                                          if (!nnVNNuuVUVn.UuUVuuUu(var0, var4, var4x)) {
                                             if (nnVNNuuVUVn.C00OOC00oO(var0, var4)) {
                                                String var12 = "connection closed before the login session became active";
                                                nnVNNuuVUVn.UuUVuuUu(var0, var4, var12);
                                                UuUVuuUu(var0, var4, "§c" + var12);
                                             }

                                             nnVNNuuVUVn.uUnuvNvvNU(var4x);
                                             var16 = false;
                                             break label180;
                                          }

                                          nnVNNuuVUVn.UuUVuuUu(var0, var4, nnVNNuuVUVn.nvnNNunvv.LOGIN, "Handshake sent, waiting for login ...");
                                          if (!nnVNNuuVUVn.C00OOC00oO(var0, var4)) {
                                             nnVNNuuVUVn.uUnuvNvvNU(var4x);
                                             var16 = false;
                                             break label202;
                                          }

                                          var10.method_10743(new class_2915(var0, UuUVuuUu(var0)));
                                          UuUVuuUu(var0, var4, "handshake sent, waiting for login ...");
                                          var16 = false;
                                          break label203;
                                       } catch (Throwable var17) {
                                          boolean var6x = nnVNNuuVUVn.C00OOC00oO(var0, var4);
                                          String var7x = "connect error: " + var17.getClass().getSimpleName() + ": " + UuUVuuUu(var17);
                                          if (var6x) {
                                             nnVNNuuVUVn.UuUVuuUu(var0, var4, var7x);
                                             UuUVuuUu(var0, var4, "§c" + var7x);
                                          }

                                          if (var4x != null) {
                                             nnVNNuuVUVn.uUnuvNvvNU(var4x);
                                          }

                                          var17.printStackTrace();
                                          var16 = false;
                                       } finally {
                                          if (var16) {
                                             nnVNNuuVUVn.C00OOC00oO(var0, var4, Thread.currentThread());
                                             nnVNNuuVUVn.UuUVuuUu(var0, var4);
                                          }
                                       }

                                       nnVNNuuVUVn.C00OOC00oO(var0, var4, Thread.currentThread());
                                       nnVNNuuVUVn.UuUVuuUu(var0, var4);
                                       return;
                                    }

                                    nnVNNuuVUVn.C00OOC00oO(var0, var4, Thread.currentThread());
                                    nnVNNuuVUVn.UuUVuuUu(var0, var4);
                                    return;
                                 }

                                 nnVNNuuVUVn.C00OOC00oO(var0, var4, Thread.currentThread());
                                 nnVNNuuVUVn.UuUVuuUu(var0, var4);
                                 return;
                              }

                              nnVNNuuVUVn.C00OOC00oO(var0, var4, Thread.currentThread());
                              nnVNNuuVUVn.UuUVuuUu(var0, var4);
                              return;
                           }

                           nnVNNuuVUVn.C00OOC00oO(var0, var4, Thread.currentThread());
                           nnVNNuuVUVn.UuUVuuUu(var0, var4);
                           return;
                        }

                        nnVNNuuVUVn.C00OOC00oO(var0, var4, Thread.currentThread());
                        nnVNNuuVUVn.UuUVuuUu(var0, var4);
                        return;
                     }

                     nnVNNuuVUVn.C00OOC00oO(var0, var4, Thread.currentThread());
                     nnVNNuuVUVn.UuUVuuUu(var0, var4);
                     return;
                  }

                  nnVNNuuVUVn.C00OOC00oO(var0, var4, Thread.currentThread());
                  nnVNNuuVUVn.UuUVuuUu(var0, var4);
                  return;
               }

               nnVNNuuVUVn.C00OOC00oO(var0, var4, Thread.currentThread());
               nnVNNuuVUVn.UuUVuuUu(var0, var4);
            }, "WildBot-" + var0);
            var6.setDaemon(true);
            var6.start();
            return true;
         }
      }
   }

   public static UUID UuUVuuUu(String var0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   static void C00OOC00oO(String var0, String var1) {
      nnVNNuuVUVn.uUnuvNvvNU(var0, var1);
      uUnuvNvvNU(var0, var1);
   }

   static void UuUVuuUu(String var0, long var1, String var3) {
      if (nnVNNuuVUVn.uUnuvNvvNU(var0, var1)) {
         nnVNNuuVUVn.C00OOC00oO(var0, var1, var3);
         uUnuvNvvNU(var0, var3);
      }
   }

   static void UuUVuuUu(vUNVNUnuv var0, String var1) {
      if (var0 != null && nnVNNuuVUVn.vVvUvVVuuNvV(var0)) {
         nnVNNuuVUVn.uUnuvNvvNU(var0, var1);
         uUnuvNvvNU(var0.UuUVuuUu(), var1);
      }
   }

   private static void uUnuvNvvNU(String var0, String var1) {
      String var2 = "[WildBot] " + var0 + ": " + var1;
      System.out.println(var2.replaceAll("§.", ""));
      class_310 var3 = class_310.method_1551();
      if (var3 != null) {
         var3.execute(() -> {
            try {
               vVnvuVVUunuv.UuUVuuUu("§7[Bot] §f" + var0 + " §7» " + var1);
            } catch (Throwable var3x) {
            }
         });
      }
   }

   private static String UuUVuuUu(Throwable var0) {
      String var1 = var0.getMessage();
      return var1 != null && !var1.isBlank() ? var1 : "no details";
   }
}
