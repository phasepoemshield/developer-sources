package ru.metaculture.protection;

import java.awt.Color;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import net.minecraft.client.render.Camera;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.json.JSONObject;
import org.wild.module.api.Module;

public class O000000O000O extends Module {
   private static final Identifier O000000000OO0O = Identifier.of("wild", "textures/png/skull_state_0.png");
   private static final Identifier O000000000OOO = Identifier.of("wild", "textures/png/skull_state_1.png");
   private static final Identifier O000000000OOO0 = Identifier.of("wild", "textures/png/skull_state_2.png");
   public final ModeSetting O000000000O = new ModeSetting("Отображать: ", "Только у друзей", "Всех", "Только у друзей");
   public final GroupSetting O000000000O0 = new GroupSetting(
      "Информация", new BooleanSetting("Показ в табе", true), new BooleanSetting("Показ в нейм тегах", false), new BooleanSetting("Показ лого", false)
   );
   public final BooleanSetting O000000000O00 = new BooleanSetting("Установка меток", true);
   public final KeybindSetting O000000000O000 = new KeybindSetting("Кнопка установки", -1).O00000000(this.O000000000O00::O0000000000);
   public final BooleanSetting O000000000O00O = new BooleanSetting("Фокус цели", true);
   public final BooleanSetting O000000000O0O = new BooleanSetting("Счетчик попнутых тотемов врага", true);
   public static String O000000000O0O0 = "";
   private String O000000000OOOO = "";
   private long O00000000O = 0L;
   public static double O000000000O0OO;
   public static double O000000000OO;
   public static double O000000000OO0;
   private long O00000000O0 = 0L;

   public O000000O000O() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000, this.O000000000O00O, this.O000000000O0O});
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (!O0000O00O0000O.O00000000()) {
         if (o0000000O0O0.O00000000000() == this.O000000000O000.O0000000000()) {
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (!O0000O00O0000O.O00000000()) {
         if (IrcWebSocketClient.O00000000 != null) {
            IrcWebSocketClient.O00000000.O0000000000();
         }

         if (System.currentTimeMillis() - this.O00000000O > 200L) {
            this.O00000000O = System.currentTimeMillis();
            if (O0000000000.player != null && O0000000000.world != null) {
               O0000O000OOOO.O00000000.O00000000();
               String var2 = O0000000000.world.getRegistryKey().getValue().getPath();
               float var3 = O0000000000.player.getHealth() + O0000000000.player.getAbsorptionAmount();
               boolean var4 = O0000O000OOOO.O000000000();
               IrcWebSocketClient var5 = IrcWebSocketClient.O00000000;
               if (var5 != null) {
                  var5.O00000000(
                     O0000000000.player.getX(), O0000000000.player.getY(), O0000000000.player.getZ(), var2, var3, O0000O000OOOO.O00000000.O0000000000(), var4
                  );
               }
            }
         }

         if (AttackAura.O00000000OO0 instanceof PlayerEntity var6) {
            O000000000O0O0 = var6.isAlive() && var6.getHealth() > 0.0F ? var6.getName().getString() : "";
         }

         if (!O000000000O0O0.isEmpty() && FriendCommand.O00000000(O000000000O0O0)) {
            O000000000O0O0 = "";
         }

         if (O0000000000.world != null) {
            PlayerEntity var7 = null;

            for (PlayerEntity var11 : O0000000000.world.getPlayers()) {
               if (!var11.isAlive() || var11.getHealth() <= 0.0F) {
                  IrcWebSocketClient.O000000000000.remove(var11.getName().getString());
                  if (var11.getName().getString().equalsIgnoreCase(O000000000O0O0)) {
                     O000000000O0O0 = "";
                  }
               } else if (var11.getName().getString().equalsIgnoreCase(O000000000O0O0)) {
                  var7 = var11;
               }
            }

            if (this.O000000000O00O.O0000000000() && IrcWebSocketClient.O00000000 != null && IrcWebSocketClient.O00000000.isOpen()) {
               long var10 = System.currentTimeMillis();
               if (var7 != null) {
                  O000000000O0OO = var7.getX();
                  O000000000OO = var7.getY();
                  O000000000OO0 = var7.getZ();
                  if (var10 - this.O00000000O0 > 200L) {
                     this.O00000000O0 = var10;
                     this.O00000000(O000000000O0O0, O000000000O0OO, O000000000OO, O000000000OO0);
                  }
               } else if (O000000000O0O0.isEmpty() && !this.O000000000OOOO.isEmpty()) {
                  this.O00000000O0 = var10;
                  this.O00000000("", 0.0, 0.0, 0.0);
               }
            }
         }
      }
   }

   private void O00000000(String string, double d, double e, double f) {
      try {
         JSONObject var8 = new JSONObject();
         var8.put("type", "target_sync");
         var8.put("user", O0000000000.getSession().getUsername());
         var8.put("target", string);
         var8.put("server", IrcWebSocketClient.O00000000());
         if (!string.isEmpty()) {
            var8.put("x", d);
            var8.put("y", e);
            var8.put("z", f);
         }

         IrcWebSocketClient.O00000000.send(var8.toString());
         this.O000000000OOOO = string;
      } catch (Exception var9) {
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (!O0000O00O0000O.O00000000() && this.O000000000O0O.O0000000000()) {
         if (o0000000O000OO.O00000000000() instanceof EntityStatusS2CPacket var2 && var2.getStatus() == 35) {
            Entity var9 = var2.getEntity(O0000000000.world);
            if (var9 instanceof PlayerEntity var4) {
               String var5 = var4.getName().getString();
               int var6 = IrcWebSocketClient.O000000000000.getOrDefault(var5, 0) + 1;
               IrcWebSocketClient.O000000000000.put(var5, var6);
               IrcWebSocketClient.O0000000000000.put(var5, System.currentTimeMillis());
               if (AttackAura.O00000000OO0 != null
                  && AttackAura.O00000000OO0.getId() == var9.getId()
                  && IrcWebSocketClient.O00000000 != null
                  && IrcWebSocketClient.O00000000.isOpen()) {
                  try {
                     JSONObject var7 = new JSONObject();
                     var7.put("type", "totem_pop");
                     var7.put("attacker", O0000000000.getSession().getUsername());
                     var7.put("victim", var5);
                     var7.put("count", var6);
                     var7.put("server", IrcWebSocketClient.O00000000());
                     IrcWebSocketClient.O00000000.send(var7.toString());
                  } catch (Exception var8) {
                  }
               }
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      if (!O0000O00O0000O.O00000000() && this.O000000000O00O.O0000000000()) {
         HashSet var2 = new HashSet();
         if (!O000000000O0O0.isEmpty()) {
            var2.add(O000000000O0O0);
         }

         String var3 = IrcWebSocketClient.O00000000();
         if (IrcWebSocketClient.O00000000 != null && IrcWebSocketClient.O00000000.isOpen()) {
            boolean var4 = "Только у друзей".equals(this.O000000000O.O0000000000());
            String var5 = O0000000000.getSession() != null ? O0000000000.getSession().getUsername() : "";

            for (Entry var7 : IrcWebSocketClient.O00000000000.entrySet()) {
               String var8 = (String)var7.getKey();
               IrcWebSocketClient.W356 var9 = (IrcWebSocketClient.W356)var7.getValue();
               if ((!var4 || var8.equals(var5) || FriendCommand.O00000000(var8)) && var9.O000000000.equals(var3)) {
                  var2.add(var9.O00000000);
               }
            }
         }

         if (!var2.isEmpty()) {
            float var23 = O0000000000.getRenderTickCounter().getTickProgress(true);
            long var24 = System.currentTimeMillis();

            assert O0000000000.world != null;

            for (String var26 : (HashSet<String>)var2) {
               PlayerEntity var27 = null;

               for (PlayerEntity var11 : O0000000000.world.getPlayers()) {
                  if (var11.getName().getString().equalsIgnoreCase(var26) && var11 != O0000000000.player) {
                     var27 = var11;
                     break;
                  }
               }

               if (var27 != null) {
                  this.O00000000(o0000000O00O.O00000000000(), var27, var23);
               } else {
                  double var28 = 0.0;
                  double var12 = 0.0;
                  double var14 = 0.0;
                  boolean var16 = false;
                  long var17 = 0L;
                  Iterator var19 = IrcWebSocketClient.O00000000000.values().iterator();

                  while (true) {
                     if (var19.hasNext()) {
                        IrcWebSocketClient.W356 var20 = (IrcWebSocketClient.W356)var19.next();
                        if (!var20.O00000000.equalsIgnoreCase(var26) || !var20.O000000000.equals(var3)) {
                           continue;
                        }

                        var17 = var24 - var20.O00000000000O0;
                        if (var17 >= 4000L) {
                           continue;
                        }

                        double var21 = MathHelper.clamp(var17 / 200.0, 0.0, 1.0);
                        var28 = MathHelper.lerp(var21, var20.O0000000000000, var20.O0000000000);
                        var12 = MathHelper.lerp(var21, var20.O000000000000O, var20.O00000000000);
                        var14 = MathHelper.lerp(var21, var20.O00000000000O, var20.O000000000000);
                        var16 = true;
                     }

                     if (!var16 && var26.equalsIgnoreCase(O000000000O0O0)) {
                        var28 = O000000000O0OO;
                        var12 = O000000000OO;
                        var14 = O000000000OO0;
                        var16 = true;
                     }

                     if (var16) {
                        float var29 = 1.0F;
                        if (var17 > 3000L) {
                           float var30 = 1.0F - (float)(var17 - 3000L) / 1000.0F;
                           var29 = MathHelper.clamp(var30, 0.0F, 1.0F);
                        }

                        float var31 = 20.0F;
                        this.O00000000(o0000000O00O.O00000000000(), var26, var28, var12 + 2.0, var14, var31, 20.0F, var29);
                     }
                     break;
                  }
               }
            }
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, PlayerEntity playerEntity, float f) {
      double var4 = MathHelper.lerp(f, playerEntity.lastX, playerEntity.getX());
      double var6 = MathHelper.lerp(f, playerEntity.lastY, playerEntity.getY());
      double var8 = MathHelper.lerp(f, playerEntity.lastZ, playerEntity.getZ());
      float var10 = playerEntity.getHealth() + playerEntity.getAbsorptionAmount();
      float var11 = playerEntity.getMaxHealth();
      this.O00000000(o0000O00OO0O0, playerEntity.getName().getString(), var4, var6 + playerEntity.getHeight(), var8, var10, var11, 1.0F);
   }

   private void O00000000(RenderManager o0000O00OO0O0, String string, double d, double e, double f, float g, float h, float i) {
      Camera var12 = O0000000000.gameRenderer.getCamera();
      Vec3d var13 = var12.getPos();
      Vec3d var14 = new Vec3d(d, e, f);
      if (!(var14.squaredDistanceTo(var13) < 1.0E-6)) {
         Vec3d var15 = O0000O000OOOOO.O00000000(var14);
         if (var15 != null && !(var15.z <= 0.001F) && !(var15.z > 1.0)) {
            float var16 = (float)var15.x;
            float var17 = (float)var15.y;
            long var18 = IrcWebSocketClient.O0000000000000.getOrDefault(string, 0L);
            boolean var20 = System.currentTimeMillis() - var18 < 2500L;
            Identifier var21;
            if (var20) {
               var21 = O000000000OOO0;
            } else if (g <= h / 2.0F) {
               var21 = O000000000OOO;
            } else {
               var21 = O000000000OO0O;
            }

            int var22 = this.O00000000(var21);
            if (var22 > 0 && i > 0.05F) {
               float var23 = 28.0F;
               float var24 = 15.0F;
               float var25 = var16 - var23 / 2.0F;
               float var26 = var17 - var23 - var24;
               o0000O00OO0O0.O00000000(var25, var26);
               o0000O00OO0O0.O00000000(var23 / 2.0F, var23 / 2.0F);
               o0000O00OO0O0.O000000000(1.0F, -1.0F);
               o0000O00OO0O0.O00000000(-var23 / 2.0F, -var23 / 2.0F);
               o0000O00OO0O0.O00000000(var22, 0.0F, 0.0F, var23, var23);
               o0000O00OO0O0.O00000000000O();
               o0000O00OO0O0.O00000000000O0();
               o0000O00OO0O0.O00000000000O();
               o0000O00OO0O0.O00000000000O();
            }

            if (this.O000000000O0O.O0000000000()) {
               int var27 = IrcWebSocketClient.O000000000000.getOrDefault(string, 0);
               if (var27 > 0) {
                  String var28 = var27 + " тотемов";
                  float var29 = 22.0F;
                  float var30 = RenderManager.O00000000(FontRegistry.O00000000, var28, var29).O00000000;
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000, var16 - var30 / 2.0F, var17 - 5.0F, var29, var28, this.O00000000(Color.WHITE.getRGB(), i));
               }
            }
         }
      }
   }

   private int O00000000(int i, float f) {
      int var3 = i >> 24 & 0xFF;
      int var4 = i >> 16 & 0xFF;
      int var5 = i >> 8 & 0xFF;
      int var6 = i & 0xFF;
      var3 = (int)(var3 * f);
      return RenderManager.W382.O0000000000(var4, var5, var6, var3);
   }

   private int O00000000(Identifier identifier) {
      TextureManager var2 = O0000000000.getTextureManager();
      if (var2 == null) {
         return -1;
      } else {
         AbstractTexture var3 = var2.getTexture(identifier);
         if (var3 == null) {
            return -1;
         } else if (var3.getGlTexture() instanceof GlTexture var5) {
            int var6 = var5.getGlId();
            return var6 > 0 ? var6 : -1;
         } else {
            return -1;
         }
      }
   }
}
