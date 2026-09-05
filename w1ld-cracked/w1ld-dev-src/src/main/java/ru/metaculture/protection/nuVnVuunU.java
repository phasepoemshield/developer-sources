package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.proxy.ProxyConnectionEvent;
import io.netty.handler.proxy.ProxyHandler;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import java.io.File;
import java.io.FileReader;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class nuVnVuunU {
   public static final String UuUVuuUu = "Socks4";
   public static final String C00OOC00oO = "Socks5";
   private static final Gson uVUuuVnNVU = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
   private static final Pattern vuuuNvNuv = Pattern.compile(
      "(?i)(?:socks\\s*[45]|so+cks?\\s*[45])?\\s*(?:://)?([A-Za-z0-9._~%+\\-]+):([^\\s@]+)@([A-Za-z0-9.\\-]+):(\\d{1,5})"
   );
   private static final Pattern nvUVNnuu = Pattern.compile(
      "(?i)(?:socks\\s*[45]|so+cks?\\s*[45])?\\s*(?:://)?([A-Za-z0-9.\\-]+):(\\d{1,5}):([^\\s:]+):([^\\s]+)"
   );
   private static final Pattern UuuNnUvUuv = Pattern.compile("(?i)(?<![A-Za-z0-9._:-])([A-Za-z0-9.\\-]+):(\\d{1,5})(?![A-Za-z0-9._:-])");
   public static volatile String uUnuvNvvNU = "";
   public static volatile String vVvUvVVuuNvV = "";
   public static volatile String uNNnnnuuuN = "Socks5";
   public static volatile String nuUnNvnuUu = "";
   public static volatile String VVuuUN = "";
   public static volatile boolean vNUvnnVnUvu = false;
   private static volatile boolean nUUVuvU;

   private nuVnVuunU() {
   }

   public static synchronized void UuUVuuUu() {
      if (!nUUVuvU) {
         nUUVuvU = true;
         File var0 = uNNnnnuuuN();
         if (var0 != null && var0.exists() && var0.isFile()) {
            try {
               try (FileReader var1 = new FileReader(var0, StandardCharsets.UTF_8)) {
                  JsonElement var2 = JsonParser.parseReader(var1);
                  if (var2 != null && var2.isJsonObject()) {
                     JsonObject var3 = var2.getAsJsonObject();
                     vNUvnnVnUvu = UuUVuuUu(var3, "enabled", false);
                     uNNnnnuuuN = C00OOC00oO(UuUVuuUu(var3, "type", "Socks5"));
                     uUnuvNvvNU = uUnuvNvvNU(UuUVuuUu(var3, "host", UuUVuuUu(var3, "ip", "")));
                     vVvUvVVuuNvV = uNNnnnuuuN(UuUVuuUu(var3, "port", ""));
                     nuUnNvnuUu = nvUVNnuu(UuUVuuUu(var3, "username", ""));
                     VVuuUN = nvUVNnuu(UuUVuuUu(var3, "password", ""));
                     return;
                  }
               }
            } catch (Throwable var6) {
            }
         }
      }
   }

   public static synchronized void C00OOC00oO() {
      nUUVuvU = true;

      try {
         File var0 = uNNnnnuuuN();
         if (var0 == null) {
            return;
         }

         JsonObject var1 = new JsonObject();
         var1.addProperty("enabled", vNUvnnVnUvu);
         var1.addProperty("type", C00OOC00oO(uNNnnnuuuN));
         var1.addProperty("host", uUnuvNvvNU(uUnuvNvvNU));
         var1.addProperty("port", uNNnnnuuuN(vVvUvVVuuNvV));
         var1.addProperty("username", nvUVNnuu(nuUnNvnuUu));
         var1.addProperty("password", nvUVNnuu(VVuuUN));
         UuUVuuUu(var0, uVUuuVnNVU.toJson(var1).getBytes(StandardCharsets.UTF_8));
      } catch (Throwable var2) {
      }
   }

   public static synchronized void UuUVuuUu(nuVnVuunU.NVnVnNnN var0) {
      if (var0 != null) {
         nUUVuvU = true;
         vNUvnnVnUvu = var0.enabled();
         uNNnnnuuuN = C00OOC00oO(var0.type());
         uUnuvNvvNU = uUnuvNvvNU(var0.host());
         vVvUvVVuuNvV = uNNnnnuuuN(var0.port());
         nuUnNvnuUu = nvUVNnuu(var0.username()).trim();
         VVuuUN = nvUVNnuu(var0.password());
         C00OOC00oO();
      }
   }

   public static nuVnVuunU.NVnVnNnN uUnuvNvvNU() {
      UuUVuuUu();
      return new nuVnVuunU.NVnVnNnN(
         vNUvnnVnUvu, C00OOC00oO(uNNnnnuuuN), uUnuvNvvNU(uUnuvNvvNU), uNNnnnuuuN(vVvUvVVuuNvV), nvUVNnuu(nuUnNvnuUu).trim(), nvUVNnuu(VVuuUN)
      );
   }

   public static ProxyHandler vVvUvVVuuNvV() {
      return C00OOC00oO(uUnuvNvvNU());
   }

   public static ProxyHandler C00OOC00oO(nuVnVuunU.NVnVnNnN var0) {
      nuVnVuunU.NVnVnNnN var1 = uUnuvNvvNU(var0);
      if (var1.enabled() && UuUVuuUu(var1, true) == null) {
         InetSocketAddress var2 = new InetSocketAddress(var1.host(), var1.portInt());
         if (var1.isSocks4()) {
            String var4 = vNUvnnVnUvu(var1.username());
            return var4 == null ? new Socks4ProxyHandler(var2) : new Socks4ProxyHandler(var2, var4);
         } else {
            String var3 = vNUvnnVnUvu(var1.username());
            return var3 == null ? new Socks5ProxyHandler(var2) : new Socks5ProxyHandler(var2, var3, var1.password());
         }
      } else {
         return null;
      }
   }

   public static CompletableFuture<nuVnVuunU.VvunVVUvUNnv> UuUVuuUu(nuVnVuunU.NVnVnNnN var0, String var1, int var2, final int var3) {
      final nuVnVuunU.NVnVnNnN var4 = uUnuvNvvNU(var0).withEnabled(true);
      String var5 = UuUVuuUu(var4, true);
      if (var5 != null) {
         return CompletableFuture.completedFuture(new nuVnVuunU.VvunVVUvUNnv(false, 0L, var5));
      } else {
         final CompletableFuture var6 = new CompletableFuture();
         final NioEventLoopGroup var7 = new NioEventLoopGroup(1, var0x -> {
            Thread var1x = new Thread(var0x, "Wild Proxy Test");
            var1x.setDaemon(true);
            return var1x;
         });
         final long var8 = System.nanoTime();

         try {
            Bootstrap var10 = (Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(var7)).channel(NioSocketChannel.class))
                  .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, var3))
               .handler(new ChannelInitializer<SocketChannel>() {
                  protected void UuUVuuUu(SocketChannel var1) {
                     ProxyHandler var2x = nuVnVuunU.C00OOC00oO(var4);
                     if (var2x == null) {
                        throw new IllegalStateException("Proxy config is invalid");
                     } else {
                        var2x.setConnectTimeoutMillis(var3);
                        var1.pipeline().addFirst("wild_proxy_test", var2x);
                        var1.pipeline().addLast("wild_proxy_result", new ChannelInboundHandlerAdapter() {
                           public void userEventTriggered(ChannelHandlerContext var1, Object var2x) throws Exception {
                              if (var2x instanceof ProxyConnectionEvent) {
                                 long var3x = Math.max(1L, (System.nanoTime() - var8) / 1000000L);
                                 var6.complete(new nuVnVuunU.VvunVVUvUNnv(true, var3x, "OK"));
                                 var1.close();
                                 var7.shutdownGracefully();
                              } else {
                                 super.userEventTriggered(var1, var2x);
                              }
                           }

                           public void exceptionCaught(ChannelHandlerContext var1, Throwable var2x) {
                              long var3x = Math.max(1L, (System.nanoTime() - var8) / 1000000L);
                              var6.complete(new nuVnVuunU.VvunVVUvUNnv(false, var3x, nuVnVuunU.UuUVuuUu(var2x)));
                              var1.close();
                              var7.shutdownGracefully();
                           }

                           public void channelInactive(ChannelHandlerContext var1) throws Exception {
                              long var2x = Math.max(1L, (System.nanoTime() - var8) / 1000000L);
                              var6.complete(new nuVnVuunU.VvunVVUvUNnv(false, var2x, "Connection closed"));
                              var7.shutdownGracefully();
                              super.channelInactive(var1);
                           }
                        });
                     }
                  }
               });
            ChannelFuture var14 = var10.connect(InetSocketAddress.createUnresolved(var1, var2));
            var14.addListener((ChannelFutureListener)var4x -> {
               if (!var4x.isSuccess()) {
                  long var5x = Math.max(1L, (System.nanoTime() - var8) / 1000000L);
                  boolean var13x = false /* VF: Semaphore variable */;

                  try {
                     var13x = true;
                     var6.complete(new nuVnVuunU.VvunVVUvUNnv(false, var5x, UuUVuuUu(var4x.cause())));
                     var13x = false;
                  } finally {
                     if (var13x) {
                        try {
                           var4x.channel().close();
                        } catch (Throwable var14x) {
                        }

                        var7.shutdownGracefully();
                     }
                  }

                  try {
                     var4x.channel().close();
                  } catch (Throwable var15) {
                  }

                  var7.shutdownGracefully();
               }
            });
            var7.schedule(() -> {
               if (var6.complete(new nuVnVuunU.VvunVVUvUNnv(false, var3, "Timed out"))) {
                  try {
                     var14.channel().close();
                  } catch (Throwable var5x) {
                  }

                  var7.shutdownGracefully();
               }
            }, var3 + 1000L, TimeUnit.MILLISECONDS);
         } catch (Throwable var13) {
            long var11 = Math.max(1L, (System.nanoTime() - var8) / 1000000L);
            var6.complete(new nuVnVuunU.VvunVVUvUNnv(false, var11, UuUVuuUu(var13)));
            var7.shutdownGracefully();
         }

         return var6;
      }
   }

   public static String UuUVuuUu(nuVnVuunU.NVnVnNnN var0, boolean var1) {
      nuVnVuunU.NVnVnNnN var2 = uUnuvNvvNU(var0);
      if (!var1 && !var2.enabled() && var2.host().isBlank() && var2.port().isBlank()) {
         return null;
      } else if (var2.host().isBlank()) {
         return "Proxy host is empty";
      } else if (!vVvUvVVuuNvV(var2.host())) {
         return "Proxy host has invalid characters";
      } else {
         int var3 = VVuuUN(var2.port());
         if (var3 <= 0) {
            return "Proxy port is invalid";
         } else {
            return var2.isSocks5() && !var2.password().isBlank() && var2.username().isBlank() ? "SOCKS5 username is empty" : null;
         }
      }
   }

   public static nuVnVuunU.nvnNNunvv UuUVuuUu(String var0) {
      String var1 = nvUVNnuu(var0).trim();
      if (var1.isEmpty()) {
         return nuVnVuunU.nvnNNunvv.empty();
      } else {
         String var2 = UuUVuuUu(var1, "Socks5");
         Matcher var3 = vuuuNvNuv.matcher(var1);
         if (var3.find()) {
            return new nuVnVuunU.nvnNNunvv(var2, var3.group(3), var3.group(4), vuuuNvNuv(var3.group(1)), vuuuNvNuv(var3.group(2)));
         } else {
            Matcher var4 = nvUVNnuu.matcher(var1);
            if (var4.find()) {
               return new nuVnVuunU.nvnNNunvv(var2, var4.group(1), var4.group(2), vuuuNvNuv(var4.group(3)), vuuuNvNuv(var4.group(4)));
            } else {
               String var5 = "";
               String var6 = "";
               String var7 = "";
               String var8 = "";
               String[] var9 = var1.replace("\r", "").split("\n");

               for (String var13 : var9) {
                  String var14 = var13.trim();
                  String var15 = var14.toLowerCase(Locale.ROOT);
                  String var16 = uVUuuVnNVU(var14);
                  if (!var16.isBlank()) {
                     var4 = nvUVNnuu.matcher(var16);
                     if (var4.find()) {
                        return new nuVnVuunU.nvnNNunvv(var2, var4.group(1), var4.group(2), vuuuNvNuv(var4.group(3)), vuuuNvNuv(var4.group(4)));
                     }

                     if (var15.contains("wexside")) {
                        nuVnVuunU.nvnNNunvv var17 = UuUVuuUu(var16);
                        if (!var17.host().isBlank()) {
                           return var17.withType(var2);
                        }
                     }

                     if (var15.contains("login") || var15.contains("username") || var15.contains("логин")) {
                        var7 = var16.trim();
                     } else if (var15.contains("password") || var15.contains("пароль")) {
                        var8 = var16.trim();
                     } else if (var15.contains("port") || var15.contains("порт")) {
                        var6 = uNNnnnuuuN(var16);
                     } else if (var15.contains("proxy") || var15.contains("прокси")) {
                        Matcher var21 = UuuNnUvUuv.matcher(var16);
                        if (var21.find()) {
                           var5 = var21.group(1);
                           var6 = var21.group(2);
                        }
                     } else if (var15.matches(".*\\bip\\b.*")) {
                        var5 = uUnuvNvvNU(var16);
                     }
                  }
               }

               if (var5.isBlank() || var6.isBlank()) {
                  Matcher var20 = UuuNnUvUuv.matcher(var1);
                  if (var20.find()) {
                     var5 = var20.group(1);
                     var6 = var20.group(2);
                  }
               }

               if (var7.isBlank() && var8.isBlank() && !var5.isBlank() && var1.contains("@")) {
                  var3 = vuuuNvNuv.matcher(var1);
                  if (var3.find()) {
                     var7 = vuuuNvNuv(var3.group(1));
                     var8 = vuuuNvNuv(var3.group(2));
                  }
               }

               return new nuVnVuunU.nvnNNunvv(var2, uUnuvNvvNU(var5), uNNnnnuuuN(var6), var7, var8);
            }
         }
      }
   }

   public static String C00OOC00oO(String var0) {
      String var1 = nvUVNnuu(var0).trim().toLowerCase(Locale.ROOT).replace(" ", "");
      return var1.contains("4") ? "Socks4" : "Socks5";
   }

   private static String UuUVuuUu(String var0, String var1) {
      String var2 = nvUVNnuu(var0).toLowerCase(Locale.ROOT).replace(" ", "");
      if (var2.contains("socks4") || var2.contains("sock4") || var2.contains("soock4")) {
         return "Socks4";
      } else {
         return !var2.contains("socks5") && !var2.contains("sock5") && !var2.contains("soock5") ? C00OOC00oO(var1) : "Socks5";
      }
   }

   private static nuVnVuunU.NVnVnNnN uUnuvNvvNU(nuVnVuunU.NVnVnNnN var0) {
      return var0 == null
         ? new nuVnVuunU.NVnVnNnN(false, "Socks5", "", "", "", "")
         : new nuVnVuunU.NVnVnNnN(
            var0.enabled(),
            C00OOC00oO(var0.type()),
            uUnuvNvvNU(var0.host()),
            uNNnnnuuuN(var0.port()),
            nvUVNnuu(var0.username()).trim(),
            nvUVNnuu(var0.password())
         );
   }

   private static String uUnuvNvvNU(String var0) {
      String var1 = nvUVNnuu(var0).trim();
      int var2 = var1.indexOf("://");
      if (var2 >= 0) {
         var1 = var1.substring(var2 + 3);
      }

      int var3 = var1.lastIndexOf(64);
      if (var3 >= 0 && var3 + 1 < var1.length()) {
         var1 = var1.substring(var3 + 1);
      }

      int var4 = var1.indexOf(47);
      if (var4 >= 0) {
         var1 = var1.substring(0, var4);
      }

      if (var1.startsWith("[")) {
         int var5 = var1.indexOf(93);
         if (var5 > 0) {
            return var1.substring(1, var5).trim();
         }
      }

      int var6 = var1.lastIndexOf(58);
      if (var6 > 0 && var1.indexOf(58) == var6 && nuUnNvnuUu(var1.substring(var6 + 1))) {
         var1 = var1.substring(0, var6);
      }

      return var1.trim();
   }

   private static boolean vVvUvVVuuNvV(String var0) {
      String var1 = nvUVNnuu(var0);
      if (var1.length() > 255) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.length(); var2++) {
            char var3 = var1.charAt(var2);
            if (!Character.isLetterOrDigit(var3) && var3 != '.' && var3 != '-' && var3 != '_' && var3 != ':') {
               return false;
            }
         }

         return true;
      }
   }

   private static String uNNnnnuuuN(String var0) {
      String var1 = nvUVNnuu(var0).trim();
      StringBuilder var2 = new StringBuilder(5);

      for (int var3 = 0; var3 < var1.length() && var2.length() < 5; var3++) {
         char var4 = var1.charAt(var3);
         if (var4 >= '0' && var4 <= '9') {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   private static boolean nuUnNvnuUu(String var0) {
      String var1 = nvUVNnuu(var0).trim();
      if (!var1.isEmpty() && var1.length() <= 5) {
         for (int var2 = 0; var2 < var1.length(); var2++) {
            char var3 = var1.charAt(var2);
            if (var3 < '0' || var3 > '9') {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static int VVuuUN(String var0) {
      try {
         int var1 = Integer.parseInt(nvUVNnuu(var0).trim());
         return var1 > 0 && var1 <= 65535 ? var1 : -1;
      } catch (Throwable var2) {
         return -1;
      }
   }

   private static String vNUvnnVnUvu(String var0) {
      String var1 = nvUVNnuu(var0).trim();
      return var1.isEmpty() ? null : var1;
   }

   private static String uVUuuVnNVU(String var0) {
      int var1 = var0.indexOf(58);
      return var1 >= 0 && var1 + 1 < var0.length() ? var0.substring(var1 + 1).trim() : "";
   }

   private static String vuuuNvNuv(String var0) {
      String var1 = nvUVNnuu(var0);

      try {
         return URLDecoder.decode(var1.replace("+", "%2B"), StandardCharsets.UTF_8);
      } catch (Throwable var3) {
         return var1;
      }
   }

   static String UuUVuuUu(Throwable var0) {
      for (Throwable var1 = var0; var1 != null; var1 = var1.getCause()) {
         String var2 = var1.getMessage();
         if (var2 != null && !var2.isBlank()) {
            String var3 = var2.replace('\n', ' ').replace('\r', ' ').trim();
            String var4 = var3.toLowerCase(Locale.ROOT);
            if (!var4.contains("authstatus") && !var4.contains("authentication")) {
               return var3;
            }

            return "SOCKS5 auth rejected: check login/password";
         }
      }

      return var0 == null ? "Unknown error" : var0.getClass().getSimpleName();
   }

   private static File uNNnnnuuuN() {
      try {
         if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null) {
            return new File(ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "proxy.json");
         }
      } catch (Throwable var1) {
      }

      return new File(ru.metaculture.protection.NVnVnNnN.C00OOC00oO(), "proxy.json");
   }

   private static void UuUVuuUu(File var0, byte[] var1) throws Exception {
      Path var2 = var0.toPath();
      Path var3 = var2.getParent();
      if (var3 != null) {
         Files.createDirectories(var3);
      }

      Path var4 = var2.resolveSibling(var2.getFileName() + ".tmp");

      try (FileChannel var5 = FileChannel.open(var4, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE)) {
         ByteBuffer var6 = ByteBuffer.wrap(var1);

         while (var6.hasRemaining()) {
            var5.write(var6);
         }

         var5.force(true);
      }

      try {
         Files.move(var4, var2, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
      } catch (AtomicMoveNotSupportedException var9) {
         Files.move(var4, var2, StandardCopyOption.REPLACE_EXISTING);
      }
   }

   private static String UuUVuuUu(JsonObject var0, String var1, String var2) {
      try {
         JsonElement var3 = var0.get(var1);
         return var3 != null && !var3.isJsonNull() ? var3.getAsString() : var2;
      } catch (Throwable var4) {
         return var2;
      }
   }

   private static boolean UuUVuuUu(JsonObject var0, String var1, boolean var2) {
      try {
         JsonElement var3 = var0.get(var1);
         return var3 != null && !var3.isJsonNull() ? var3.getAsBoolean() : var2;
      } catch (Throwable var4) {
         return var2;
      }
   }

   private static String nvUVNnuu(String var0) {
      return var0 == null ? "" : var0;
   }

   public record NVnVnNnN(boolean enabled, String type, String host, String port, String username, String password) {
      public boolean isSocks4() {
         return "Socks4".equals(nuVnVuunU.C00OOC00oO(this.type));
      }

      public boolean isSocks5() {
         return !this.isSocks4();
      }

      public int portInt() {
         return nuVnVuunU.VVuuUN(this.port);
      }

      public nuVnVuunU.NVnVnNnN withEnabled(boolean var1) {
         return new nuVnVuunU.NVnVnNnN(var1, this.type, this.host, this.port, this.username, this.password);
      }
   }

   public record VvunVVUvUNnv(boolean success, long millis, String message) {
   }

   public record nvnNNunvv(String type, String host, String port, String username, String password) {
      public static nuVnVuunU.nvnNNunvv empty() {
         return new nuVnVuunU.nvnNNunvv("Socks5", "", "", "", "");
      }

      public nuVnVuunU.nvnNNunvv withType(String var1) {
         return new nuVnVuunU.nvnNNunvv(nuVnVuunU.C00OOC00oO(var1), this.host, this.port, this.username, this.password);
      }
   }
}
