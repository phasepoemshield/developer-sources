package ru.metaculture.protection;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.minecraft.class_310;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.json.JSONArray;
import org.json.JSONObject;

public class COcocc0c0Oc extends WebSocketClient {
   public static COcocc0c0Oc UuUVuuUu;
   private static volatile boolean vVvUvVVuuNvV;
   private static volatile Thread uNNnnnuuuN;
   public static final Map<String, COcocc0c0Oc.NVnVnNnN> C00OOC00oO = new ConcurrentHashMap<>();
   public static volatile Consumer<JSONObject> uUnuvNvvNU;
   private static volatile List<String> nuUnNvnuUu = new ArrayList<>();
   private static volatile boolean VVuuUN;
   private static String vNUvnnVnUvu = "";
   private final String uVUuuVnNVU;
   private final String vuuuNvNuv;

   public COcocc0c0Oc(String var1, String var2) {
      super(URI.create(var1));
      this.setDaemon(true);
      this.uVUuuVnNVU = var1;
      this.vuuuNvNuv = var2;
      vVvUvVVuuNvV = false;
      UuUVuuUu = this;
   }

   public static void UuUVuuUu() {
      vVvUvVVuuNvV = true;
      Thread var0 = uNNnnnuuuN;
      uNNnnnuuuN = null;
      if (var0 != null) {
         var0.interrupt();
      }

      COcocc0c0Oc var1 = UuUVuuUu;
      UuUVuuUu = null;
      VVuuUN = false;
      vNUvnnVnUvu = "";
      if (var1 != null) {
         try {
            var1.close();
         } catch (Throwable var3) {
         }
      }
   }

   public void onOpen(ServerHandshake var1) {
      vNUvnnVnUvu = "";
   }

   public void onMessage(String var1) {
      UuUVuuUu(() -> this.C00OOC00oO(var1));
   }

   private void C00OOC00oO(String var1) {
      try {
         JSONObject var2 = new JSONObject(var1);
         String var3 = var2.has("op") ? var2.getString("op") : "";
         switch (var3) {
            case "party_state":
               JSONArray var15 = var2.optJSONArray("members");
               ArrayList var16 = new ArrayList();
               if (var15 != null) {
                  for (int var17 = 0; var17 < var15.length(); var17++) {
                     var16.add(var15.getString(var17));
                  }
               }

               nuUnNvnuUu = List.copyOf(var16);
               C00OOC00oO.clear();
               JSONArray var18 = var2.optJSONArray("markers");
               if (var18 != null) {
                  for (int var9 = 0; var9 < var18.length(); var9++) {
                     JSONObject var10 = var18.getJSONObject(var9);
                     C00OOC00oO.put(
                        var10.getString("owner").toLowerCase(),
                        new COcocc0c0Oc.NVnVnNnN(
                           var10.getString("owner"),
                           var10.optString("target", ""),
                           var10.getDouble("x"),
                           var10.getDouble("y"),
                           var10.getDouble("z"),
                           var10.optBoolean("entity", false)
                        )
                     );
                  }
               }

               VVuuUN = true;
               break;
            case "member_update":
               JSONArray var14 = var2.optJSONArray("members");
               if (var14 == null) {
                  break;
               }

               ArrayList var7 = new ArrayList();

               for (int var8 = 0; var8 < var14.length(); var8++) {
                  var7.add(var14.getString(var8));
               }

               nuUnNvnuUu = List.copyOf(var7);
               break;
            case "member_left":
               String var13 = var2.optString("owner", "");
               if (!var13.isEmpty()) {
                  nuUnNvnuUu = nuUnNvnuUu.stream().filter(var1x -> !var1x.equalsIgnoreCase(var13)).collect(Collectors.toList());
               }

               C00OOC00oO.remove(var13.toLowerCase());
               break;
            case "marker_update":
               String var6 = var2.getString("owner");
               C00OOC00oO.put(
                  var6.toLowerCase(),
                  new COcocc0c0Oc.NVnVnNnN(
                     var6, var2.optString("target", ""), var2.getDouble("x"), var2.getDouble("y"), var2.getDouble("z"), var2.optBoolean("entity", false)
                  )
               );
               break;
            case "marker_remove":
               C00OOC00oO.remove(var2.getString("owner").toLowerCase());
               break;
            case "party_closed":
            case "kicked":
               C00OOC00oO.clear();
               break;
            case "error":
               System.out.println("[PartyWS] Ошибка: " + var2.optString("msg"));
         }

         Consumer var4 = uUnuvNvvNU;
         if (var4 != null) {
            try {
               var4.accept(var2);
            } catch (Exception var11) {
            }
         }
      } catch (Exception var12) {
      }
   }

   public void UuUVuuUu(String var1) {
      if (this.isOpen()) {
         if (var1 != null && !var1.isEmpty()) {
            if (!var1.equals(vNUvnnVnUvu)) {
               vNUvnnVnUvu = var1;

               try {
                  JSONObject var2 = new JSONObject();
                  var2.put("op", "auth");
                  var2.put("user", this.vuuuNvNuv);
                  var2.put("party_id", var1);
                  this.send(var2.toString());
               } catch (Exception var3) {
               }
            }
         }
      }
   }

   public static void UuUVuuUu(COcocc0c0Oc var0, String var1, String... var2) {
      if (var0 != null && var0.isOpen()) {
         try {
            JSONObject var3 = new JSONObject();
            var3.put("op", var1);
            var3.put("user", var0.vuuuNvNuv);
            if (var2.length >= 1 && var2[0] != null && !var2[0].isEmpty()) {
               if ("join".equals(var1)) {
                  var3.put("code", var2[0]);
               } else if ("kick".equals(var1)) {
                  var3.put("target", var2[0]);
               }
            }

            var0.send(var3.toString());
         } catch (Exception var4) {
         }
      }
   }

   public void UuUVuuUu(double var1, double var3, double var5, boolean var7, String var8) {
      if (this.isOpen()) {
         try {
            JSONObject var9 = new JSONObject();
            var9.put("op", "set_marker");
            var9.put("user", this.vuuuNvNuv);
            var9.put("x", var1);
            var9.put("y", var3);
            var9.put("z", var5);
            var9.put("entity", var7);
            var9.put("target", var8 == null ? "" : var8);
            this.send(var9.toString());
         } catch (Exception var10) {
         }
      }
   }

   public void C00OOC00oO() {
      if (this.isOpen()) {
         try {
            JSONObject var1 = new JSONObject();
            var1.put("op", "clear_marker");
            var1.put("user", this.vuuuNvNuv);
            this.send(var1.toString());
         } catch (Exception var2) {
         }
      }
   }

   public void uUnuvNvvNU() {
      if (this.isOpen()) {
         try {
            JSONObject var1 = new JSONObject();
            var1.put("op", "ping");
            this.send(var1.toString());
         } catch (Exception var2) {
         }
      }
   }

   public void onClose(int var1, String var2, boolean var3) {
      if (!vVvUvVVuuNvV) {
         VVuuUN = false;
         vNUvnnVnUvu = "";
         Thread var5 = new Thread(() -> {
            try {
               Thread.sleep(5000L);
               if (!vVvUvVVuuNvV) {
                  if (UuUVuuUu == this && !this.isOpen()) {
                     try {
                        this.reconnectBlocking();
                     } catch (InterruptedException var7) {
                        Thread.currentThread().interrupt();
                     } catch (Exception var8) {
                     }

                     return;
                  }

                  return;
               }
            } catch (InterruptedException var9) {
               Thread.currentThread().interrupt();
               return;
            } finally {
               if (Thread.currentThread() == uNNnnnuuuN) {
                  uNNnnnuuuN = null;
               }
            }
         }, "PartyWS-Reconnect-Thread");
         var5.setDaemon(true);
         uNNnnnuuuN = var5;
         var5.start();
      }
   }

   public void onError(Exception var1) {
   }

   public boolean vVvUvVVuuNvV() {
      return VVuuUN;
   }

   public static void uNNnnnuuuN() {
      vNUvnnVnUvu = "";
   }

   public static List<String> nuUnNvnuUu() {
      return nuUnNvnuUu;
   }

   private static void UuUVuuUu(Runnable var0) {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && !var1.method_18854()) {
         var1.execute(var0);
      } else {
         var0.run();
      }
   }

   public static class NVnVnNnN {
      public String UuUVuuUu;
      public String C00OOC00oO;
      public double uUnuvNvvNU;
      public double vVvUvVVuuNvV;
      public double uNNnnnuuuN;
      public long nuUnNvnuUu;
      public boolean VVuuUN;

      public NVnVnNnN(String var1, String var2, double var3, double var5, double var7, boolean var9) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2 == null ? "" : var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var5;
         this.uNNnnnuuuN = var7;
         this.nuUnNvnuUu = System.currentTimeMillis();
         this.VVuuUN = var9;
      }
   }
}
