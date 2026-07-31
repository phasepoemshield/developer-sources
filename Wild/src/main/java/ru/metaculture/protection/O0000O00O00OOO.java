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

public final class O0000O00O00OOO {
   public static final String O00000000 = "Socks4";
   public static final String O000000000 = "Socks5";
   private static final Gson O00000000000O0 = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
   private static final Pattern O00000000000OO = Pattern.compile(
      "(?i)(?:socks\\s*[45]|so+cks?\\s*[45])?\\s*(?:://)?([A-Za-z0-9._~%+\\-]+):([^\\s@]+)@([A-Za-z0-9.\\-]+):(\\d{1,5})"
   );
   private static final Pattern O0000000000O = Pattern.compile(
      "(?i)(?:socks\\s*[45]|so+cks?\\s*[45])?\\s*(?:://)?([A-Za-z0-9.\\-]+):(\\d{1,5}):([^\\s:]+):([^\\s]+)"
   );
   private static final Pattern O0000000000O0 = Pattern.compile("(?i)(?<![A-Za-z0-9._:-])([A-Za-z0-9.\\-]+):(\\d{1,5})(?![A-Za-z0-9._:-])");
   public static volatile String O0000000000 = "";
   public static volatile String O00000000000 = "";
   public static volatile String O000000000000 = "Socks5";
   public static volatile String O0000000000000 = "";
   public static volatile String O000000000000O = "";
   public static volatile boolean O00000000000O = false;
   private static volatile boolean O0000000000O00;

   private O0000O00O00OOO() {
   }

   public static synchronized void O00000000() {
      if (!O0000000000O00) {
         O0000000000O00 = true;
         File var0 = O000000000000();
         if (var0 != null && var0.exists() && var0.isFile()) {
            try {
               try (FileReader var1 = new FileReader(var0, StandardCharsets.UTF_8)) {
                  JsonElement var2 = JsonParser.parseReader(var1);
                  if (var2 != null && var2.isJsonObject()) {
                     JsonObject var3 = var2.getAsJsonObject();
                     O00000000000O = O00000000(var3, "enabled", false);
                     O000000000000 = O000000000(O00000000(var3, "type", "Socks5"));
                     O0000000000 = O0000000000(O00000000(var3, "host", O00000000(var3, "ip", "")));
                     O00000000000 = O000000000000(O00000000(var3, "port", ""));
                     O0000000000000 = O0000000000O(O00000000(var3, "username", ""));
                     O000000000000O = O0000000000O(O00000000(var3, "password", ""));
                     return;
                  }
               }
            } catch (Throwable var6) {
            }
         }
      }
   }

   public static synchronized void O000000000() {
      O0000000000O00 = true;

      try {
         File var0 = O000000000000();
         if (var0 == null) {
            return;
         }

         JsonObject var1 = new JsonObject();
         var1.addProperty("enabled", O00000000000O);
         var1.addProperty("type", O000000000(O000000000000));
         var1.addProperty("host", O0000000000(O0000000000));
         var1.addProperty("port", O000000000000(O00000000000));
         var1.addProperty("username", O0000000000O(O0000000000000));
         var1.addProperty("password", O0000000000O(O000000000000O));
         O00000000(var0, O00000000000O0.toJson(var1).getBytes(StandardCharsets.UTF_8));
      } catch (Throwable var2) {
      }
   }

   public static synchronized void O00000000(O0000O00O00OOO.W360 o00000000) {
      if (o00000000 != null) {
         O0000000000O00 = true;
         O00000000000O = o00000000.enabled();
         O000000000000 = O000000000(o00000000.type());
         O0000000000 = O0000000000(o00000000.host());
         O00000000000 = O000000000000(o00000000.port());
         O0000000000000 = O0000000000O(o00000000.username()).trim();
         O000000000000O = O0000000000O(o00000000.password());
         O000000000();
      }
   }

   public static O0000O00O00OOO.W360 O0000000000() {
      O00000000();
      return new O0000O00O00OOO.W360(
         O00000000000O,
         O000000000(O000000000000),
         O0000000000(O0000000000),
         O000000000000(O00000000000),
         O0000000000O(O0000000000000).trim(),
         O0000000000O(O000000000000O)
      );
   }

   public static ProxyHandler O00000000000() {
      return O000000000(O0000000000());
   }

   public static ProxyHandler O000000000(O0000O00O00OOO.W360 o00000000) {
      O0000O00O00OOO.W360 var1 = O0000000000(o00000000);
      if (var1.enabled() && O00000000(var1, true) == null) {
         InetSocketAddress var2 = new InetSocketAddress(var1.host(), var1.portInt());
         if (var1.isSocks4()) {
            String var4 = O00000000000O(var1.username());
            return var4 == null ? new Socks4ProxyHandler(var2) : new Socks4ProxyHandler(var2, var4);
         } else {
            String var3 = O00000000000O(var1.username());
            return var3 == null ? new Socks5ProxyHandler(var2) : new Socks5ProxyHandler(var2, var3, var1.password());
         }
      } else {
         return null;
      }
   }

   public static CompletableFuture<O0000O00O00OOO.W362> O00000000(O0000O00O00OOO.W360 o00000000, String string, int i, int j) {
      final O0000O00O00OOO.W360 var4 = O0000000000(o00000000).withEnabled(true);
      String var5 = O00000000(var4, true);
      if (var5 != null) {
         return CompletableFuture.completedFuture(new O0000O00O00OOO.W362(false, 0L, var5));
      } else {
         final CompletableFuture var6 = new CompletableFuture();
         final NioEventLoopGroup var7 = new NioEventLoopGroup(1, runnable -> {
            Thread var1 = new Thread(runnable, "Wild Proxy Test");
            var1.setDaemon(true);
            return var1;
         });
         final long var8 = System.nanoTime();

         try {
            Bootstrap var10 = (Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(var7)).channel(NioSocketChannel.class))
                  .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, j))
               .handler(new ChannelInitializer<SocketChannel>() {
                  protected void initChannel(SocketChannel socketChannel) {
                     ProxyHandler var2 = O0000O00O00OOO.O000000000(var4);
                     if (var2 == null) {
                        throw new IllegalStateException("Proxy config is invalid");
                     } else {
                        var2.setConnectTimeoutMillis(j);
                        socketChannel.pipeline().addFirst("wild_proxy_test", var2);
                        socketChannel.pipeline().addLast("wild_proxy_result", new ChannelInboundHandlerAdapter() {
                           public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
                              if (object instanceof ProxyConnectionEvent) {
                                 long var3 = Math.max(1L, (System.nanoTime() - var8) / 1000000L);
                                 var6.complete(new O0000O00O00OOO.W362(true, var3, "OK"));
                                 channelHandlerContext.close();
                                 var7.shutdownGracefully();
                              } else {
                                 super.userEventTriggered(channelHandlerContext, object);
                              }
                           }

                           public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
                              long var3 = Math.max(1L, (System.nanoTime() - var8) / 1000000L);
                              var6.complete(new O0000O00O00OOO.W362(false, var3, O0000O00O00OOO.O00000000(throwable)));
                              channelHandlerContext.close();
                              var7.shutdownGracefully();
                           }

                           public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
                              long var2x = Math.max(1L, (System.nanoTime() - var8) / 1000000L);
                              var6.complete(new O0000O00O00OOO.W362(false, var2x, "Connection closed"));
                              var7.shutdownGracefully();
                              super.channelInactive(channelHandlerContext);
                           }
                        });
                     }
                  }
               });
            ChannelFuture var14 = var10.connect(InetSocketAddress.createUnresolved(string, i));
            var14.addListener((ChannelFutureListener)channelFuture -> {
               if (!channelFuture.isSuccess()) {
                  long var5x = Math.max(1L, (System.nanoTime() - var8) / 1000000L);
                  boolean var13x = false /* VF: Semaphore variable */;

                  try {
                     var13x = true;
                     var6.complete(new O0000O00O00OOO.W362(false, var5x, O00000000(channelFuture.cause())));
                     var13x = false;
                  } finally {
                     if (var13x) {
                        try {
                           channelFuture.channel().close();
                        } catch (Throwable var14x) {
                        }

                        var7.shutdownGracefully();
                     }
                  }

                  try {
                     channelFuture.channel().close();
                  } catch (Throwable var15) {
                  }

                  var7.shutdownGracefully();
               }
            });
            var7.schedule(() -> {
               if (var6.complete(new O0000O00O00OOO.W362(false, j, "Timed out"))) {
                  try {
                     var14.channel().close();
                  } catch (Throwable var5x) {
                  }

                  var7.shutdownGracefully();
               }
            }, j + 1000L, TimeUnit.MILLISECONDS);
         } catch (Throwable var13) {
            long var11 = Math.max(1L, (System.nanoTime() - var8) / 1000000L);
            var6.complete(new O0000O00O00OOO.W362(false, var11, O00000000(var13)));
            var7.shutdownGracefully();
         }

         return var6;
      }
   }

   public static String O00000000(O0000O00O00OOO.W360 o00000000, boolean bl) {
      O0000O00O00OOO.W360 var2 = O0000000000(o00000000);
      if (!bl && !var2.enabled() && var2.host().isBlank() && var2.port().isBlank()) {
         return null;
      } else if (var2.host().isBlank()) {
         return "Proxy host is empty";
      } else if (!O00000000000(var2.host())) {
         return "Proxy host has invalid characters";
      } else {
         int var3 = O000000000000O(var2.port());
         if (var3 <= 0) {
            return "Proxy port is invalid";
         } else {
            return var2.isSocks5() && !var2.password().isBlank() && var2.username().isBlank() ? "SOCKS5 username is empty" : null;
         }
      }
   }

   public static O0000O00O00OOO.W361 O00000000(String string) {
      String var1 = O0000000000O(string).trim();
      if (var1.isEmpty()) {
         return O0000O00O00OOO.W361.empty();
      } else {
         String var2 = O00000000(var1, "Socks5");
         Matcher var3 = O00000000000OO.matcher(var1);
         if (var3.find()) {
            return new O0000O00O00OOO.W361(var2, var3.group(3), var3.group(4), O00000000000OO(var3.group(1)), O00000000000OO(var3.group(2)));
         } else {
            Matcher var4 = O0000000000O.matcher(var1);
            if (var4.find()) {
               return new O0000O00O00OOO.W361(var2, var4.group(1), var4.group(2), O00000000000OO(var4.group(3)), O00000000000OO(var4.group(4)));
            } else {
               String var5 = "";
               String var6 = "";
               String var7 = "";
               String var8 = "";
               String[] var9 = var1.replace("\r", "").split("\n");

               for (String var13 : var9) {
                  String var14 = var13.trim();
                  String var15 = var14.toLowerCase(Locale.ROOT);
                  String var16 = O00000000000O0(var14);
                  if (!var16.isBlank()) {
                     var4 = O0000000000O.matcher(var16);
                     if (var4.find()) {
                        return new O0000O00O00OOO.W361(var2, var4.group(1), var4.group(2), O00000000000OO(var4.group(3)), O00000000000OO(var4.group(4)));
                     }

                     if (var15.contains("wexside")) {
                        O0000O00O00OOO.W361 var17 = O00000000(var16);
                        if (!var17.host().isBlank()) {
                           return var17.withType(var2);
                        }
                     }

                     if (var15.contains("login") || var15.contains("username") || var15.contains("логин")) {
                        var7 = var16.trim();
                     } else if (var15.contains("password") || var15.contains("пароль")) {
                        var8 = var16.trim();
                     } else if (var15.contains("port") || var15.contains("порт")) {
                        var6 = O000000000000(var16);
                     } else if (var15.contains("proxy") || var15.contains("прокси")) {
                        Matcher var21 = O0000000000O0.matcher(var16);
                        if (var21.find()) {
                           var5 = var21.group(1);
                           var6 = var21.group(2);
                        }
                     } else if (var15.matches(".*\\bip\\b.*")) {
                        var5 = O0000000000(var16);
                     }
                  }
               }

               if (var5.isBlank() || var6.isBlank()) {
                  Matcher var20 = O0000000000O0.matcher(var1);
                  if (var20.find()) {
                     var5 = var20.group(1);
                     var6 = var20.group(2);
                  }
               }

               if (var7.isBlank() && var8.isBlank() && !var5.isBlank() && var1.contains("@")) {
                  var3 = O00000000000OO.matcher(var1);
                  if (var3.find()) {
                     var7 = O00000000000OO(var3.group(1));
                     var8 = O00000000000OO(var3.group(2));
                  }
               }

               return new O0000O00O00OOO.W361(var2, O0000000000(var5), O000000000000(var6), var7, var8);
            }
         }
      }
   }

   public static String O000000000(String string) {
      String var1 = O0000000000O(string).trim().toLowerCase(Locale.ROOT).replace(" ", "");
      return var1.contains("4") ? "Socks4" : "Socks5";
   }

   private static String O00000000(String string, String string2) {
      String var2 = O0000000000O(string).toLowerCase(Locale.ROOT).replace(" ", "");
      if (var2.contains("socks4") || var2.contains("sock4") || var2.contains("soock4")) {
         return "Socks4";
      } else {
         return !var2.contains("socks5") && !var2.contains("sock5") && !var2.contains("soock5") ? O000000000(string2) : "Socks5";
      }
   }

   private static O0000O00O00OOO.W360 O0000000000(O0000O00O00OOO.W360 o00000000) {
      return o00000000 == null
         ? new O0000O00O00OOO.W360(false, "Socks5", "", "", "", "")
         : new O0000O00O00OOO.W360(
            o00000000.enabled(),
            O000000000(o00000000.type()),
            O0000000000(o00000000.host()),
            O000000000000(o00000000.port()),
            O0000000000O(o00000000.username()).trim(),
            O0000000000O(o00000000.password())
         );
   }

   private static String O0000000000(String string) {
      String var1 = O0000000000O(string).trim();
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
      if (var6 > 0 && var1.indexOf(58) == var6 && O0000000000000(var1.substring(var6 + 1))) {
         var1 = var1.substring(0, var6);
      }

      return var1.trim();
   }

   private static boolean O00000000000(String string) {
      String var1 = O0000000000O(string);
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

   private static String O000000000000(String string) {
      String var1 = O0000000000O(string).trim();
      StringBuilder var2 = new StringBuilder(5);

      for (int var3 = 0; var3 < var1.length() && var2.length() < 5; var3++) {
         char var4 = var1.charAt(var3);
         if (var4 >= '0' && var4 <= '9') {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   private static boolean O0000000000000(String string) {
      String var1 = O0000000000O(string).trim();
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

   static int O000000000000O(String string) {
      try {
         int var1 = Integer.parseInt(O0000000000O(string).trim());
         return var1 > 0 && var1 <= 65535 ? var1 : -1;
      } catch (Throwable var2) {
         return -1;
      }
   }

   private static String O00000000000O(String string) {
      String var1 = O0000000000O(string).trim();
      return var1.isEmpty() ? null : var1;
   }

   private static String O00000000000O0(String string) {
      int var1 = string.indexOf(58);
      return var1 >= 0 && var1 + 1 < string.length() ? string.substring(var1 + 1).trim() : "";
   }

   private static String O00000000000OO(String string) {
      String var1 = O0000000000O(string);

      try {
         return URLDecoder.decode(var1.replace("+", "%2B"), StandardCharsets.UTF_8);
      } catch (Throwable var3) {
         return var1;
      }
   }

   static String O00000000(Throwable throwable) {
      for (Throwable var1 = throwable; var1 != null; var1 = var1.getCause()) {
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

      return throwable == null ? "Unknown error" : throwable.getClass().getSimpleName();
   }

   private static File O000000000000() {
      try {
         if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000000 != null) {
            return new File(WildClient.O00000000.O0000000000000, "proxy.json");
         }
      } catch (Throwable var1) {
      }

      return new File(WildClient.O000000000(), "proxy.json");
   }

   private static void O00000000(File file, byte[] bs) throws Exception {
      Path var2 = file.toPath();
      Path var3 = var2.getParent();
      if (var3 != null) {
         Files.createDirectories(var3);
      }

      Path var4 = var2.resolveSibling(var2.getFileName() + ".tmp");

      try (FileChannel var5 = FileChannel.open(var4, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE)) {
         ByteBuffer var6 = ByteBuffer.wrap(bs);

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

   private static String O00000000(JsonObject jsonObject, String string, String string2) {
      try {
         JsonElement var3 = jsonObject.get(string);
         return var3 != null && !var3.isJsonNull() ? var3.getAsString() : string2;
      } catch (Throwable var4) {
         return string2;
      }
   }

   private static boolean O00000000(JsonObject jsonObject, String string, boolean bl) {
      try {
         JsonElement var3 = jsonObject.get(string);
         return var3 != null && !var3.isJsonNull() ? var3.getAsBoolean() : bl;
      } catch (Throwable var4) {
         return bl;
      }
   }

   private static String O0000000000O(String string) {
      return string == null ? "" : string;
   }

   public record W360(boolean enabled, String type, String host, String port, String username, String password) {
      public boolean isSocks4() {
         return "Socks4".equals(O0000O00O00OOO.O000000000(this.type));
      }

      public boolean isSocks5() {
         return !this.isSocks4();
      }

      public int portInt() {
         return O0000O00O00OOO.O000000000000O(this.port);
      }

      public O0000O00O00OOO.W360 withEnabled(boolean bl) {
         return new O0000O00O00OOO.W360(bl, this.type, this.host, this.port, this.username, this.password);
      }
   }

   public record W361(String type, String host, String port, String username, String password) {
      public static O0000O00O00OOO.W361 empty() {
         return new O0000O00O00OOO.W361("Socks5", "", "", "", "");
      }

      public O0000O00O00OOO.W361 withType(String string) {
         return new O0000O00O00OOO.W361(O0000O00O00OOO.O000000000(string), this.host, this.port, this.username, this.password);
      }
   }

   public record W362(boolean success, long millis, String message) {
   }
}
