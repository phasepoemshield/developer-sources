package ru.metaculture.protection;

import java.awt.Color;
import java.util.List;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.math.Vector2f;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class GpsCommand extends Command {
   public static Vector2f O00000000 = new Vector2f(Float.MAX_VALUE, Float.MAX_VALUE);
   public static float O000000000 = Float.MAX_VALUE;
   public static String O0000000000 = "Метка";
   private static volatile boolean O00000000000;
   private final O0000O00OOO00 O000000000000 = new O0000O0O0000O(300, 1.0);
   private boolean O0000000000000;

   public GpsCommand() {
      super("gps", "Добавление меток, для ивентов и тд", ".gps off | .gps <x> <z> | .gps <x> <y> <z> [название]");
      this.O00000000("off", List::of);
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      if (strings.length == 1 && strings[0].equalsIgnoreCase("off")) {
         this.O000000000000();
         return;
      }

      try {
         if (strings.length == 2) {
            O00000000(Float.parseFloat(strings[0]), Float.parseFloat(strings[1]));
         } else if (strings.length >= 3) {
            float var2 = Float.parseFloat(strings[0]);
            float var3 = Float.parseFloat(strings[1]);
            float var4 = Float.parseFloat(strings[2]);
            String var5 = strings.length > 3 ? String.join(" ", java.util.Arrays.copyOfRange(strings, 3, strings.length)) : "Метка";
            O00000000(var2, var3, var4, var5);
         } else {
            ChatUtil.O00000000("§cИспользование: §f" + this.O0000000000());
         }
      } catch (NumberFormatException var6) {
         ChatUtil.O00000000("§cКоординаты GPS должны быть числами. Использование: §f" + this.O0000000000());
      }
   }

   @Compile
   private void O000000000000() {
      O00000000 = new Vector2f(Float.MAX_VALUE, Float.MAX_VALUE);
      O000000000 = Float.MAX_VALUE;
      O0000000000 = "Метка";
      O00000000000 = false;
      this.O0000000000000 = false;
      ChatUtil.O00000000("§7[GPS] Метка удалена.");
   }

   public static void O00000000(float f, float g) {
      O00000000 = new Vector2f(f, g);
      O000000000 = Float.MAX_VALUE;
      O0000000000 = "Метка";
      O00000000000 = false;
      ChatUtil.O00000000("§a[GPS] Метка установлена на X: " + f + " Z: " + g);
   }

   public static void O00000000(float f, float g, float h, String string) {
      O00000000 = new Vector2f(f, h);
      O000000000 = g;
      O0000000000 = string;
      O00000000000 = false;
      ChatUtil.O00000000("§a[GPS] Метка '" + string + "' установлена на X: " + f + " Y: " + g + " Z: " + h);
   }

   public static void O00000000000() {
      O00000000000 = true;
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
         String var4 = var2.content().getString().toLowerCase();
         if (var4.contains("заверш") || var4.contains("окончен") || var4.contains("время вышло") || var4.contains("вы у цели")) {
            O00000000000();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      RenderManager var2 = o0000000O00O.O00000000000();
      if (O00000000.getX() != Float.MAX_VALUE && O00000000.getY() != Float.MAX_VALUE) {
         if (!this.O0000000000000 && this.O000000000000.O0000000000000() != O0000O00OOO0OO.FORWARDS) {
            this.O000000000000.O000000000(O0000O00OOO0OO.FORWARDS);
         }

         if (a_.player != null && a_.world != null) {
            double var3 = a_.gameRenderer.getCamera().getPos().x;
            double var5 = a_.gameRenderer.getCamera().getPos().y;
            double var7 = a_.gameRenderer.getCamera().getPos().z;
            double var9 = O00000000.getX();
            double var11 = O00000000.getY();
            double var13 = O000000000 == Float.MAX_VALUE ? a_.player.getY() + 1.5 : O000000000;
            double var15 = var9 - var3;
            double var17 = var13 - var5;
            double var19 = var11 - var7;
            double var21 = Math.sqrt(var15 * var15 + var17 * var17 + var19 * var19);
            if (var21 <= 3.75 || O00000000000) {
               this.O0000000000000 = true;
               O00000000000 = false;
               this.O000000000000.O000000000(O0000O00OOO0OO.BACKWARDS);
            } else if (var21 > 5.5) {
               this.O0000000000000 = false;
            }

            if (this.O0000000000000 && this.O000000000000.O00000000000O0() <= 0.02) {
               O00000000 = new Vector2f(Float.MAX_VALUE, Float.MAX_VALUE);
               O000000000 = Float.MAX_VALUE;
               O0000000000 = "Метка";
               this.O0000000000000 = false;
            } else {
               Vec3d var23 = new Vec3d(var9, var13, var11);
               Vec3d var24 = O0000O000OOOOO.O00000000(var23);
               boolean var25 = var24 != null && var24.z > 0.001F && var24.z <= 1.0;
               O0000O00OOO var26 = new O0000O00OOO(a_);
               if (var25) {
                  float var27 = (float)var24.x;
                  float var28 = (float)var24.y;
                  float var29 = (float)Math.max(0.6, 1.2 - var21 / 150.0) * Math.max(0.0F, this.O000000000000.O00000000000O0());
                  var2.O00000000(var27, var28);
                  var2.O000000000(var29, var29);
                  float var30 = 85.0F;
                  int var31 = O0000O000OO000.O0000000000(255, 255, 255, (int)(255.0F * this.O000000000000.O00000000000O0()));
                  float var32 = RenderManager.O00000000(FontRegistry.O000000000000O, "B", var30).O00000000;
                  var2.O00000000(FontRegistry.O000000000000O, -var32 / 2.0F, -45.0F, var30, "B", var31);
                  float var33 = 30.0F;
                  float var34 = RenderManager.O00000000(FontRegistry.O00000000, O0000000000, var33).O00000000;
                  int var35 = O0000O000OO000.O0000000000(255, 255, 255, (int)(255.0F * this.O000000000000.O00000000000O0()));
                  var2.O00000000(FontRegistry.O00000000, -var34 / 2.0F, -20.0F, var33, O0000000000, var35);
                  String var36 = String.format("%.1fM", var21);
                  float var37 = 35.0F;
                  float var38 = RenderManager.O00000000(FontRegistry.O00000000, var36, var37).O00000000;
                  int var39 = new Color(200, 200, 200, (int)(220.0F * this.O000000000000.O00000000000O0())).getRGB();
                  var2.O00000000(FontRegistry.O00000000, -var38 / 2.0F, 0.0F, var37, var36, var39);
                  var2.O00000000000O();
                  var2.O00000000000O();
               } else {
                  float var67 = a_.gameRenderer.getCamera().getYaw();
                  double var68 = MathHelper.cos((float)Math.toRadians(var67));
                  double var69 = MathHelper.sin((float)Math.toRadians(var67));
                  double var70 = -(var19 * var68 - var15 * var69);
                  double var71 = -(var15 * var68 + var19 * var69);
                  double var72 = Math.atan2(var70, var71) * 180.0 / Math.PI;
                  float var73 = this.O000000000000.O00000000000O0() * 180.0F;
                  double var74 = var26.O0000000000();
                  double var41 = var26.O00000000000();
                  double var43 = var73 * MathHelper.cos((float)Math.toRadians(var72));
                  double var45 = var73 * MathHelper.sin((float)Math.toRadians(var72));
                  double var47 = Math.min(1.0, var21 / 20.0);
                  double var49 = var74 + var43;
                  double var51 = var41 + var45 + var47;
                  Identifier var53 = Identifier.of("wild", "/textures/arrows/arrows.png");
                  if (a_.getTextureManager().getTexture(var53).getGlTexture() instanceof GlTexture var55) {
                     int var56 = var55.getGlId();
                     if (var56 > 0) {
                        int var57 = O0000O000OO000.O0000000000(255, 255, 255, (int)(255.0F * this.O000000000000.O00000000000O0()));
                        int var58 = (int)(this.O000000000000.O00000000000O0() * 255.0F);
                        Color var59 = RenderManager.W382.O0000000000O0(
                           RenderManager.W382.O0000000000(RenderManager.W382.O0000000000000(1, 1), this.O000000000000.O00000000000O0() * 50.0F)
                        );
                        var2.O00000000((float)var49, (float)var51);
                        var2.O000000000((float)(var72 + 90.0));
                        var2.O00000000(0.5F, -1.0F, 0.1F, 0.1F, 5.0F, 8.0F, 0.1F, var59.getRGB());
                        var2.O000000000000(var58);
                        var2.O00000000(var56, -16.0F, -16.0F, 32.0F, 32.0F, var57, false);
                        var2.O00000000000OO();
                        var2.O00000000000O();
                        float var60 = 22.0F;
                        float var61 = RenderManager.O00000000(FontRegistry.O00000000, O0000000000, var60).O00000000;
                        int var62 = O0000O000OO000.O0000000000(255, 255, 255, (int)(255.0F * this.O000000000000.O00000000000O0()));
                        var2.O00000000(FontRegistry.O00000000, -var61 / 2.0F, 25.0F, var60, O0000000000, var62);
                        String var63 = String.format("%.1fм", var21);
                        float var64 = 25.0F;
                        float var65 = RenderManager.O00000000(FontRegistry.O00000000, var63, var64).O00000000;
                        int var66 = new Color(200, 200, 200, (int)(220.0F * this.O000000000000.O00000000000O0())).getRGB();
                        var2.O00000000(FontRegistry.O00000000, -var65 / 2.0F, 40.0F, var64, var63, var66);
                        var2.O00000000000O();
                     }
                  }
               }
            }
         }
      } else {
         this.O0000000000000 = false;
         if (this.O000000000000.O00000000000O0() > 0.0F) {
            this.O000000000000.O000000000(O0000O00OOO0OO.BACKWARDS);
         }
      }
   }

   static {
      Loader.initialize();
   }
}
