package ru.metaculture.protection;

import java.util.ArrayList;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Arrows",
   O000000000 = "Показывает игроков через стрелочки",
   O0000000000 = Category.Visuals
)
public class Arrows extends Module {
   private static final Identifier O000000000OO0O = Identifier.of("wild", "textures/arrows/arrows.png");
   public static final BooleanSetting O000000000O = new BooleanSetting("Показ дистанции", true);
   public static final BooleanSetting O000000000O0 = new BooleanSetting("Показ игроков с бронёй", true);
   public static final BooleanSetting O000000000O00 = new BooleanSetting("Выделять таргета", true);
   public static final BooleanSetting O000000000O000 = new BooleanSetting("Анимировать", true);
   public static final NumberSetting O000000000O00O = new NumberSetting("Размер", 10.0F, 1.0F, 100.0F, 1.0F, false);
   public static final NumberSetting O000000000O0O = new NumberSetting("Дистанция от центра", 150.0F, 80.0F, 300.0F, 5.0F, false);
   public static final BooleanSetting O000000000O0O0 = new BooleanSetting("Сортировка по дистанции", false);
   public static final BooleanSetting O000000000O0OO = new BooleanSetting("Мерцать", true).O00000000(() -> !O000000000O.O0000000000());
   public static LivingEntity O000000000OO;
   public ArrayList<Arrows.W132> O000000000OO0 = new ArrayList<>();
   public ArrayList<Arrows.W133> O000000000OO00 = new ArrayList<>();

   public Arrows() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0, O000000000O00, O000000000O000, O000000000O00O, O000000000O0O, O000000000O0O0, O000000000O0OO});
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (AttackAura.O00000000OO0 != null) {
            O000000000OO = AttackAura.O00000000OO0;
         }

         if (O000000000OO != null && (!O000000000OO.isAlive() || !O0000000000.world.getPlayers().contains(O000000000OO))) {
            O000000000OO = null;
         }

         if (O0000000000.world.getPlayers() != null) {
            for (Entity var3 : O0000000000.world.getPlayers()) {
               if (var3 != null && var3 != O0000000000.player) {
                  boolean var4 = false;

                  for (Arrows.W132 var6 : this.O000000000OO0) {
                     if (var6.O000000000 == var3) {
                        var4 = true;
                        break;
                     }
                  }

                  if (!var4) {
                     this.O000000000OO0.add(new Arrows.W132(var3));
                  }
               }
            }
         }

         for (Arrows.W132 var13 : this.O000000000OO0) {
            var13.O00000000(o0000000O00O.O00000000000());
         }

         this.O000000000OO0
            .removeIf(o00000000 -> o00000000.O00000000.O0000000000000() != O0000O00OOO0OO.FORWARDS && o00000000.O00000000.O00000000000O0() == 0.0F);
         O000000O000O var12 = WildClient.O00000000.O000000000 != null ? WildClient.O00000000.O000000000.O00000000(O000000O000O.class) : null;
         if (O000000000O00.O0000000000() && var12 != null && var12.O000000000O00O.O0000000000() && var12.O0000000000000) {
            String var14 = IrcWebSocketClient.O00000000();
            ArrayList var16 = new ArrayList();

            for (IrcWebSocketClient.W356 var20 : IrcWebSocketClient.O00000000000.values()) {
               if (var20.O000000000.equals(var14)) {
                  var16.add(var20.O00000000);
               }
            }

            if (O000000O000O.O000000000O0O0 != null && !O000000O000O.O000000000O0O0.isEmpty() && !var16.contains(O000000O000O.O000000000O0O0)) {
               var16.add(O000000O000O.O000000000O0O0);
            }

            for (String var21 : (ArrayList<String>)var16) {
               boolean var7 = O0000000000.world
                  .getPlayers()
                  .stream()
                  .anyMatch(
                     abstractClientPlayerEntity -> abstractClientPlayerEntity.getName().getString().equalsIgnoreCase(var21)
                        && abstractClientPlayerEntity != O0000000000.player
                  );
               if (!var7) {
                  boolean var8 = false;

                  for (Arrows.W133 var10 : this.O000000000OO00) {
                     if (var10.O000000000.equalsIgnoreCase(var21)) {
                        var8 = true;
                        break;
                     }
                  }

                  if (!var8) {
                     this.O000000000OO00.add(new Arrows.W133(var21));
                  }
               }
            }
         }

         for (Arrows.W133 var17 : this.O000000000OO00) {
            var17.O00000000(o0000000O00O.O00000000000());
         }

         this.O000000000OO00
            .removeIf(o000000000 -> o000000000.O00000000.O0000000000000() != O0000O00OOO0OO.FORWARDS && o000000000.O00000000.O00000000000O0() == 0.0F);
      }
   }

   static int O0000000000O0() {
      if (O0000000000 != null && O0000000000.getTextureManager() != null) {
         AbstractTexture var0 = O0000000000.getTextureManager().getTexture(O000000000OO0O);
         if (var0 == null) {
            return -1;
         } else if (var0.getGlTexture() instanceof GlTexture var2) {
            int var3 = var2.getGlId();
            return var3 > 0 ? var3 : -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   static int O00000000(int i, int j) {
      return O0000O000OO000.O000000000000(i | 0xFF000000, j);
   }

   static float O00000000(String string) {
      return -RenderManager.O00000000(FontRegistry.O00000000000, string, 20.0F).O00000000 / 2.0F;
   }

   static double O00000000(double d) {
      return !O000000000O0O0.O0000000000() ? 0.0 : Math.min(O000000000O0O.O00000000000 * 0.85, Math.max(0.0, d * 0.65));
   }

   public static class W132 {
      O0000O00OOO00 O00000000 = new O0000O0O0000O(300, 1.0);
      Entity O000000000;
      float O0000000000;
      float O00000000000;
      float O000000000000;
      float O0000000000000;

      public W132(Entity entity) {
         this.O000000000 = entity;
      }

      public void O00000000() {
         if (Module.O0000000000.world != null && Module.O0000000000.player != null) {
            boolean var1 = Module.O0000000000.world.getPlayers().contains(this.O000000000);
            boolean var2 = this.O000000000.isAlive();
            boolean var3 = this.O000000000 == Module.O0000000000.player;
            boolean var4 = var1 && var2 && !var3;
            if (var4 && Arrows.O000000000O0.O0000000000() && this.O000000000 instanceof PlayerEntity var5) {
               boolean var14 = false;
               EquipmentSlot[] var7 = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};

               for (EquipmentSlot var11 : var7) {
                  ItemStack var12 = var5.getEquippedStack(var11);
                  if (var12 != null && !var12.isEmpty()) {
                     String var13 = var12.getItem().toString().toUpperCase();
                     if (var13.contains("DIAMOND") || var13.contains("NETHERITE")) {
                        var14 = true;
                        break;
                     }
                  }
               }

               if (!var14) {
                  var4 = false;
               }
            }

            this.O00000000.O000000000(var4 ? O0000O00OOO0OO.FORWARDS : O0000O00OOO0OO.BACKWARDS);
         }
      }

      public void O00000000(RenderManager o0000O00OO0O0) {
         this.O00000000();
         O0000O00OOO var2 = new O0000O00OOO(Module.O0000000000);
         float[] var3 = O0000O00O000OO.O000000000();
         float var4 = var3[0];
         float var5 = var3[1];
         if (Arrows.O000000000O000.O0000000000()) {
            this.O00000000000 = O0000O00OO0OO0.O0000000000O(this.O00000000000, var5 * 10.0F, 5.0F);
            this.O000000000000 = O0000O00OO0OO0.O0000000000O(this.O000000000000, var4 * 10.0F, 5.0F);
         } else {
            this.O00000000000 = 0.0F;
            this.O000000000000 = 0.0F;
         }

         float var6 = O000000O0O00O.O00000000 ? Module.O0000000000.gameRenderer.getCamera().getYaw() : O000000O0O00O.O0000000000;
         this.O0000000000000 = O0000O00OO0OO0.O0000000000O(this.O0000000000000, var6, 10.0F);
         boolean var7 = Arrows.O000000000O00.O0000000000() && Arrows.O000000000OO != null && this.O000000000.equals(Arrows.O000000000OO);
         if (!var7 && Arrows.O000000000O00.O0000000000()) {
            O000000O000O var8 = WildClient.O00000000.O000000000 != null ? WildClient.O00000000.O000000000.O00000000(O000000O000O.class) : null;
            if (var8 != null && var8.O000000000O00O.O0000000000() && var8.O0000000000000) {
               String var9 = this.O000000000.getName().getString();
               String var10 = IrcWebSocketClient.O00000000();

               for (IrcWebSocketClient.W356 var12 : IrcWebSocketClient.O00000000000.values()) {
                  if (var12.O000000000.equals(var10) && var12.O00000000.equals(var9)) {
                     var7 = true;
                     break;
                  }
               }

               if (O000000O000O.O000000000O0O0 != null && O000000O000O.O000000000O0O0.equals(var9)) {
                  var7 = true;
               }
            }
         }

         float var43 = var7 ? 1.5F : 1.0F;
         float var44 = this.O00000000.O00000000000O0() * (Arrows.O000000000O0O.O00000000000 * var43);
         if (Module.O0000000000.currentScreen instanceof GenericContainerScreen) {
            var44 += 200.0F;
         }

         if (Module.O0000000000.currentScreen instanceof InventoryScreen) {
            var44 += 180.0F;
         }

         if (Arrows.O000000000O000.O0000000000() && (O000000000() || Module.O0000000000.player.isInSneakingPose() || Module.O0000000000.player.isSwimming())
            || Module.O0000000000.currentScreen instanceof ChatScreen) {
            var44 += 90.0F;
         }

         this.O0000000000 = Arrows.O000000000O000.O0000000000() ? O0000O00OO0OO0.O0000000000O(this.O0000000000, var44, 6.0F) : var44;
         double var45 = this.O000000000.lastX
            + (this.O000000000.getX() - this.O000000000.lastX) * Module.O0000000000.gameRenderer.getCamera().getLastTickProgress()
            - Module.O0000000000.gameRenderer.getCamera().getPos().x;
         double var46 = this.O000000000.lastY
            + (this.O000000000.getY() - this.O000000000.lastY) * Module.O0000000000.gameRenderer.getCamera().getLastTickProgress()
            + this.O000000000.getHeight() / 2.0F
            - Module.O0000000000.gameRenderer.getCamera().getPos().y
            - Module.O0000000000.player.getEyeHeight(Module.O0000000000.player.getPose());
         double var14 = this.O000000000.lastZ
            + (this.O000000000.getZ() - this.O000000000.lastZ) * Module.O0000000000.gameRenderer.getCamera().getLastTickProgress()
            - Module.O0000000000.gameRenderer.getCamera().getPos().z;
         double var16 = Math.sqrt(var45 * var45 + var46 * var46 + var14 * var14);
         double var18 = MathHelper.cos((float)(this.O0000000000000 * (Math.PI / 180.0)));
         double var20 = MathHelper.sin((float)(this.O0000000000000 * (Math.PI / 180.0)));
         double var22 = -(var14 * var18 - var45 * var20);
         double var24 = -(var45 * var18 + var14 * var20);
         double var26 = Math.atan2(var22, var24) * 180.0 / Math.PI;
         double var28 = this.O0000000000 + Arrows.O00000000(var16) * this.O00000000.O00000000000O0();
         double var30 = Math.min(1.0, var16 / 20.0);
         double var32 = var28 * MathHelper.cos((float)Math.toRadians(var26)) + var2.O0000000000();
         double var34 = var28 * MathHelper.sin((float)Math.toRadians(var26)) + var2.O00000000000();
         var32 += this.O00000000000;
         var34 += this.O000000000000 + var30;
         int var36 = Arrows.O0000000000O0();
         if (var36 > 0) {
            int var37;
            if (var7) {
               var37 = O0000O000OO000.O00000000;
            } else if (this.O000000000 instanceof AbstractClientPlayerEntity var38 && FriendCommand.O00000000(var38.getNameForScoreboard())) {
               var37 = O0000O000OO000.O000000000;
            } else {
               var37 = O0000O000OO000.O00000000();
            }

            int var49 = (int)(this.O00000000.O00000000000O0() * 255.0F);
            if (Arrows.O000000000O.O0000000000() && Arrows.O000000000O0OO.O0000000000() && var16 > 50.0) {
               long var50 = System.currentTimeMillis() % 5000L;
               if (var50 > 2500L) {
                  var49 = 0;
               }
            }

            if (var49 > 5) {
               o0000O00OO0O0.O00000000((float)var32, (float)var34);
               o0000O00OO0O0.O000000000((float)(var26 + 90.0));
               float var51 = Arrows.O000000000O00O.O00000000000 * 2.0F;
               o0000O00OO0O0.O00000000(var36, -var51 / 2.0F, -var51 / 2.0F, var51, var51, Arrows.O00000000(var37, var49), false);
               o0000O00OO0O0.O00000000000O();
               if (Arrows.O000000000O.O0000000000()) {
                  String var40;
                  if (var16 > 100.0) {
                     var40 = "100+";
                  } else {
                     var40 = (int)var16 + "m";
                  }

                  float var41 = Arrows.O00000000(var40);
                  float var42 = Arrows.O000000000O00O.O00000000000 + 8.0F;
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var41, var42, 20.0F, var40, O0000O000OO000.O0000000000(255, 255, 255, var49));
               }

               o0000O00OO0O0.O00000000000O();
            }
         }
      }

      public static boolean O000000000() {
         float[] var0 = O0000O00O000OO.O000000000();
         return var0[0] != 0.0F || var0[1] != 0.0F;
      }
   }

   public static class W133 {
      O0000O00OOO00 O00000000 = new O0000O0O0000O(300, 1.0);
      String O000000000;
      float O0000000000;
      float O00000000000;
      float O000000000000;
      float O0000000000000;

      public W133(String string) {
         this.O000000000 = string;
      }

      public void O00000000(RenderManager o0000O00OO0O0) {
         String var2 = IrcWebSocketClient.O00000000();
         double var3 = 0.0;
         double var5 = 0.0;
         double var7 = 0.0;
         boolean var9 = false;
         long var10 = 0L;

         for (IrcWebSocketClient.W356 var13 : IrcWebSocketClient.O00000000000.values()) {
            if (var13.O00000000.equalsIgnoreCase(this.O000000000) && var13.O000000000.equals(var2)) {
               long var14 = System.currentTimeMillis() - var13.O00000000000O0;
               double var16 = MathHelper.clamp(var14 / 200.0, 0.0, 1.0);
               var3 = MathHelper.lerp(var16, var13.O0000000000000, var13.O0000000000);
               var5 = MathHelper.lerp(var16, var13.O000000000000O, var13.O00000000000);
               var7 = MathHelper.lerp(var16, var13.O00000000000O, var13.O000000000000);
               var10 = var13.O00000000000O0;
               var9 = true;
               break;
            }
         }

         if (!var9 && this.O000000000.equalsIgnoreCase(O000000O000O.O000000000O0O0)) {
            var3 = O000000O000O.O000000000O0OO;
            var5 = O000000O000O.O000000000OO;
            var7 = O000000O000O.O000000000OO0;
            var10 = System.currentTimeMillis();
            var9 = true;
         }

         long var55 = System.currentTimeMillis() - var10;
         boolean var56 = var9 && (var55 < 4000L || this.O000000000.equalsIgnoreCase(O000000O000O.O000000000O0O0));
         this.O00000000.O000000000(var56 ? O0000O00OOO0OO.FORWARDS : O0000O00OOO0OO.BACKWARDS);
         if (this.O00000000.O00000000000O0() != 0.0F) {
            O0000O00OOO var15 = new O0000O00OOO(Module.O0000000000);
            float[] var57 = O0000O00O000OO.O000000000();
            float var17 = var57[0];
            float var18 = var57[1];
            if (Arrows.O000000000O000.O0000000000()) {
               this.O00000000000 = O0000O00OO0OO0.O0000000000O(this.O00000000000, var18 * 10.0F, 5.0F);
               this.O000000000000 = O0000O00OO0OO0.O0000000000O(this.O000000000000, var17 * 10.0F, 5.0F);
            } else {
               this.O00000000000 = 0.0F;
               this.O000000000000 = 0.0F;
            }

            float var19 = O000000O0O00O.O00000000 ? Module.O0000000000.gameRenderer.getCamera().getYaw() : O000000O0O00O.O0000000000;
            this.O0000000000000 = O0000O00OO0OO0.O0000000000O(this.O0000000000000, var19, 10.0F);
            float var20 = 1.5F;
            float var21 = this.O00000000.O00000000000O0() * (Arrows.O000000000O0O.O00000000000 * var20);
            if (Module.O0000000000.currentScreen instanceof GenericContainerScreen) {
               var21 += 200.0F;
            }

            if (Module.O0000000000.currentScreen instanceof InventoryScreen) {
               var21 += 180.0F;
            }

            if (Arrows.O000000000O000.O0000000000()
                  && (Arrows.W132.O000000000() || Module.O0000000000.player.isInSneakingPose() || Module.O0000000000.player.isSwimming())
               || Module.O0000000000.currentScreen instanceof ChatScreen) {
               var21 += 90.0F;
            }

            this.O0000000000 = Arrows.O000000000O000.O0000000000() ? O0000O00OO0OO0.O0000000000O(this.O0000000000, var21, 6.0F) : var21;
            double var22 = var3 - Module.O0000000000.gameRenderer.getCamera().getPos().x;
            double var24 = var5
               + 1.0
               - Module.O0000000000.gameRenderer.getCamera().getPos().y
               - Module.O0000000000.player.getEyeHeight(Module.O0000000000.player.getPose());
            double var26 = var7 - Module.O0000000000.gameRenderer.getCamera().getPos().z;
            double var28 = Math.sqrt(var22 * var22 + var24 * var24 + var26 * var26);
            double var30 = MathHelper.cos((float)(this.O0000000000000 * (Math.PI / 180.0)));
            double var32 = MathHelper.sin((float)(this.O0000000000000 * (Math.PI / 180.0)));
            double var34 = -(var26 * var30 - var22 * var32);
            double var36 = -(var22 * var30 + var26 * var32);
            double var38 = Math.atan2(var34, var36) * 180.0 / Math.PI;
            double var40 = this.O0000000000 + Arrows.O00000000(var28) * this.O00000000.O00000000000O0();
            double var42 = Math.min(1.0, var28 / 20.0);
            double var44 = var40 * MathHelper.cos((float)Math.toRadians(var38)) + var15.O0000000000();
            double var46 = var40 * MathHelper.sin((float)Math.toRadians(var38)) + var15.O00000000000();
            var44 += this.O00000000000;
            var46 += this.O000000000000 + var42;
            int var48 = Arrows.O0000000000O0();
            if (var48 > 0) {
               int var49 = O0000O000OO000.O00000000;
               int var50 = (int)(this.O00000000.O00000000000O0() * 255.0F);
               if (var55 > 3000L && !this.O000000000.equalsIgnoreCase(O000000O000O.O000000000O0O0)) {
                  float var51 = 1.0F - (float)(var55 - 3000L) / 1000.0F;
                  var50 = (int)(var50 * MathHelper.clamp(var51, 0.0F, 1.0F));
               }

               if (Arrows.O000000000O.O0000000000() && Arrows.O000000000O0OO.O0000000000() && var28 > 50.0) {
                  long var60 = System.currentTimeMillis() % 5000L;
                  if (var60 > 2500L) {
                     var50 = 0;
                  }
               }

               if (var50 > 5) {
                  o0000O00OO0O0.O00000000((float)var44, (float)var46);
                  o0000O00OO0O0.O000000000((float)(var38 + 90.0));
                  float var61 = Arrows.O000000000O00O.O00000000000 * 2.0F;
                  o0000O00OO0O0.O00000000(var48, -var61 / 2.0F, -var61 / 2.0F, var61, var61, Arrows.O00000000(var49, var50), false);
                  o0000O00OO0O0.O00000000000O();
                  if (Arrows.O000000000O.O0000000000()) {
                     String var52 = var28 > 300.0 ? "300+" : (int)var28 + "m";
                     float var53 = Arrows.O00000000(var52);
                     float var54 = Arrows.O000000000O00O.O00000000000 + 8.0F;
                     o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var53, var54, 20.0F, var52, O0000O000OO000.O0000000000(255, 255, 255, var50));
                  }

                  o0000O00OO0O0.O00000000000O();
               }
            }
         }
      }
   }
}
