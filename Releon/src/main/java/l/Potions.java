package l;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class Potions extends Helper119 {
   private final List<Helper460> list = new ArrayList<>();
   private static final RegistryEntry<StatusEffect>[] NEGATIVE_EFFECTS = new RegistryEntry[]{
      StatusEffects.POISON,
      StatusEffects.WITHER,
      StatusEffects.NAUSEA,
      StatusEffects.BLINDNESS,
      StatusEffects.HUNGER,
      StatusEffects.SLOWNESS,
      StatusEffects.MINING_FATIGUE,
      StatusEffects.INSTANT_DAMAGE,
      StatusEffects.WEAKNESS,
      StatusEffects.LEVITATION,
      StatusEffects.UNLUCK,
      StatusEffects.BAD_OMEN
   };
   private long lastEffectChange = 0L;
   private RegistryEntry<StatusEffect> currentRandomEffect = StatusEffects.SPEED;

   public Potions() {
      super("Potions", 150, 40, 80, 23, true);
   }

   private int method4855() {
      return Hud.method1824().method1827();
   }

   private int method4856(int var1) {
      int var2 = this.method4855() & 16777215;
      return var2 | var1 << 24;
   }

   @Override
   public boolean method307() {
      return !this.list.isEmpty() || Helper38.method548(mc.currentScreen);
   }

   @Override
   public void method308() {
      this.list.removeIf(var0 -> var0.anim.method4995(Helper450.BACKWARDS));
      this.list.forEach(var0 -> var0.effect.update(mc.player, null));
      if (this.list.isEmpty() && Helper38.method548(mc.currentScreen)) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.lastEffectChange >= 1000L) {
            ArrayList var3 = new ArrayList();

            for (Identifier var5 : Registries.STATUS_EFFECT.getIds()) {
               Registries.STATUS_EFFECT.getEntry(var5).ifPresent(var3::add);
            }

            if (!var3.isEmpty()) {
               this.currentRandomEffect = (RegistryEntry<StatusEffect>)var3.get(new Random().nextInt(var3.size()));
               this.lastEffectChange = var1;
            }
         }
      }
   }

   @Override
   public void method309(Helper386 var1) {
      switch (var1.method3895()) {
         case EntityStatusEffectS2CPacket var4:
            if (!Helper38.method549() && var4.getEntityId() == Objects.requireNonNull(mc.player).getId()) {
               RegistryEntry var8 = var4.getEffectId();
               this.list.removeIf(var1x -> var1x.effect.getEffectType().getIdAsString().equals(var8.getIdAsString()));
               this.list
                  .add(
                     new Helper460(
                        new StatusEffectInstance(
                           var8, var4.getDuration(), var4.getAmplifier(), var4.isAmbient(), var4.shouldShowParticles(), var4.shouldShowIcon()
                        ),
                        new Animation2().method5003(150).method5004(1.0)
                     )
                  );
            }
            break;
         case RemoveEntityStatusEffectS2CPacket var5:
            this.list
               .stream()
               .filter(var1x -> var1x.effect.getEffectType().getIdAsString().equals(var5.effect().getIdAsString()))
               .forEach(var0 -> var0.anim.method4997(Helper450.BACKWARDS));
            break;
         case PlayerRespawnS2CPacket var6:
            this.list.clear();
            this.method4857();
            break;
         case GameJoinS2CPacket var7:
            this.list.clear();
            this.method4857();
            break;
         default:
      }
   }

   private void method4857() {
      if (mc.player != null) {
         for (StatusEffectInstance var2 : mc.player.getStatusEffects()) {
            this.list.add(new Helper460(var2, new Animation2().method5003(150).method5004(1.0)));
         }
      }
   }

   @Override
   public void method310(DrawContext var1) {
      if (!Helper362.method3600()) {
         this.method4858(var1);
      } else {
         this.method4859(var1);
      }
   }

   public void method4858(DrawContext var1) {
      MatrixStack var2 = var1.getMatrices();
      Helper175 var3 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var4 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var5 = Helper103.method927(16, Helper101.ICONS);
      Helper175 var6 = Helper103.method927(19, Helper101.ICONRICHREG);
      int var7 = this.method4855();
      int var8 = Hud.method1824().method1848();
      int var9 = this.method4856(Math.min(255, var8 + 15));
      int var10 = this.method4856(Math.max(0, var8 - 15));
      byte var11 = 15;
      byte var12 = 2;
      int var13 = 80;
      int var14 = 0;
      if (!this.list.isEmpty()) {
         for (Helper460 var16 : this.list) {
            StatusEffectInstance var17 = var16.effect;
            float var18 = var16.anim.method5000().floatValue();
            int var19 = var17.getAmplifier();
            String var20 = var17.getEffectType().value().getName().getString();
            String var21 = this.method4861(var17);
            String var22 = var19 > 0 ? " " + (var19 + 1) : "";
            float var23 = var4.method1479(var21);
            int var24 = (int)Math.max(var4.method1479(var20 + var22) + var23 + 26.0F, var4.method1479(var20 + var22) + 25.0F + 10.0F);
            var13 = Math.max(var24, var13);
            var14 += (int)(11.0F * var18);
         }
      }

      this.method975(var13 + 10);
      this.method976(this.list.isEmpty() ? var11 : var11 + var12 + var14 + 4);
      Helper12.method361(var2, this.method981(), this.method982(), this.method983(), var11, 4.0F, var8, Hud.method1824().method1837(), var7);
      if (!Hud.method1824().method1838()) {
         rectangle.method677(
            Helper80.method841(var2, this.method981(), this.method982(), this.method983(), var11)
               .method828(4.0F, 4.0F, 4.0F, 4.0F)
               .method835(0.1F)
               .method839(var7)
               .method823(Helper133.method1106(Hud.method1824().method1837(), var8))
               .method840()
         );
      }

      var5.method1474(var2, "C", this.method981() + 3.5F, this.method982() + 6.5F, Hud.method1824().method1828());
      var6.method1474(var2, "D", this.method981() + this.method983() - 13, this.method982() + 6.0F, Hud.method1824().method1828());
      var3.method1474(var2, this.getName(), this.method981() + 16, this.method982() + 6.5F, Helper133.method1160());
      if (!this.list.isEmpty()) {
         float var35 = this.method982() + var11 + var12 - 1;
         float var36 = var14 + 4;
         Helper12.method361(var2, this.method981(), var35, this.method983(), var36, 4.0F, var8, Hud.method1824().method1837(), var7);
         if (!Hud.method1824().method1838()) {
            rectangle.method677(
               Helper80.method841(var2, this.method981(), var35, this.method983(), var36)
                  .method828(4.0F, 4.0F, 4.0F, 4.0F)
                  .method835(0.1F)
                  .method839(var7)
                  .method823(Helper133.method1106(Hud.method1824().method1837(), var8))
                  .method840()
            );
         }

         int var37 = 4;
         int var38 = Helper133.method1160();
         int var39 = var7;

         for (Helper460 var41 : this.list) {
            StatusEffectInstance var42 = var41.effect;
            float var43 = var41.anim.method5000().floatValue();
            float var44 = var35 + var37;
            int var25 = var42.getAmplifier();
            String var26 = var42.getEffectType().value().getName().getString();
            String var27 = this.method4861(var42);
            boolean var28 = this.method4862(var42.getEffectType());
            int var29 = var28 ? Helper133.method1139(255, 85, 75, 255) : var38;
            int var30 = 255;
            if (var42.getDuration() <= 200 && var42.getDuration() > 0) {
               double var31 = 0.5 + 0.5 * Math.cos((Math.PI * 2) * (System.currentTimeMillis() % 700L) / 700.0);
               var30 = (int)(100.0 + 155.0 * var31);
            } else if (var42.getDuration() == 0) {
               var30 = 0;
            }

            int var45 = var28 ? Helper133.method1139(255, 85, 75, var30) : Helper133.method1139(var29 >> 16 & 0xFF, var29 >> 8 & 0xFF, var29 & 0xFF, var30);
            float var32 = var4.method1479(var27);
            float var33 = this.method981() + this.method983() / 2.0F;
            float var34 = var44 + 4.0F;
            Helper147.method1231(
               var2,
               var33,
               var34,
               1.0F,
               var43,
               () -> {
                  float var11x = this.method981() + this.method983() - var32 - 4.0F;
                  float var12x = var44 + 2.0F;
                  float var13x = this.method981() + 4.0F;
                  float var14x = this.method981() + 16.0F;
                  String var15 = var25 > 0 ? " " + (var25 + 1) : "";
                  float var16x = var4.method1479(var26 + var15);
                  float var17x = var11x - var14x - 3.0F;
                  String var18x = var26;
                  if (var16x > var17x) {
                     var18x = Helper209.method1795(var26, Math.max(0.0F, var17x), var4);
                     var15 = "";
                  }

                  Helper178.method1510(var2, mc.getStatusEffectSpriteManager().getSprite(var42.getEffectType()), var13x, var44 - 0.8F, 8.0F, 8, var45);
                  var4.method1474(var2, var18x, var14x, var44 + 2.0F, var45);
                  if (!var15.isEmpty()) {
                     var4.method1474(var2, var15, var14x + var4.method1479(var18x), var44 + 2.5F, var45);
                  }

                  int var19x = Hud.method1824().method1828();
                  int var20x = var19x >> 16 & 0xFF;
                  int var21x = var19x >> 8 & 0xFF;
                  int var22x = var19x & 0xFF;
                  RenderSystem.enableBlend();
                  RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
                  Identifier var23x = Identifier.of("textures/teremok/particles/bloom.png");
                  float var24x = var32 + 12.0F;
                  float var25x = 14.0F;
                  float var26x = var11x + var32 / 2.0F;
                  float var27x = var12x + 1.0F;
                  byte var28x = 4;

                  for (int var29x = var28x; var29x >= 0; var29x--) {
                     float var30x = 1.0F + var29x * 0.45F;
                     float var31x = var24x * var30x;
                     float var32x = var25x * var30x;
                     float var33x = var29x == 0 ? 0.7F : 0.35F / (var29x + 1);
                     int var34x = Helper133.method1139(var20x, var21x, var22x, (int)(var33x * 90.0F));
                     Helper178.method1513(
                        var2,
                        var23x,
                        var26x - var31x / 2.0F,
                        var26x + var31x / 2.0F,
                        var27x - var32x / 2.0F,
                        var27x + var32x / 2.0F,
                        0.0F,
                        1.0F,
                        0.0F,
                        1.0F,
                        var34x
                     );
                  }

                  RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
                  RenderSystem.disableBlend();
                  var4.method1474(var2, var27, var11x, var12x, var39);
               }
            );
            var37 += (int)(11.0F * var43);
         }
      }
   }

   private void method4859(DrawContext var1) {
      MatrixStack var2 = var1.getMatrices();
      Helper175 var3 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var4 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var5 = Helper103.method927(17, Helper101.ICONS);
      int var6 = this.method4855();
      int var7 = Hud.method1824().method1848();
      int var8 = Math.max(72, (int)var3.method1479(this.getName()) + 28);
      if (this.list.isEmpty() && Helper38.method548(mc.currentScreen)) {
         var8 = Math.max(var8, this.method4860(var4, "Active effect", "", "**:**"));
      } else {
         for (Helper460 var10 : this.list) {
            StatusEffectInstance var11 = var10.effect;
            String var12 = var11.getEffectType().value().getName().getString();
            String var13 = var11.getAmplifier() > 0 ? " " + (var11.getAmplifier() + 1) : "";
            String var14 = this.method4861(var11);
            var8 = Math.max(var8, this.method4860(var4, var12, var13, var14));
         }
      }

      int var32 = Helper133.method1139(0, 0, 0, var7);
      int var33 = Helper133.method1139(0, 0, 0, Math.min(255, var7 + 25));
      Helper362.method3604(var2, this.method981(), this.method982(), var8, 15.0F, 4.0F, var7, var32, var33);
      var5.method1474(var2, "C", this.method981() + 5.0F, this.method982() + 6.5F, Hud.method1824().method1828());
      var3.method1474(var2, this.getName(), this.method981() + 22, this.method982() + 6.5F, Helper133.method1160());
      int var34 = 20;
      int var35 = Helper133.method1160();
      int var36 = var6;
      if (this.list.isEmpty() && Helper38.method548(mc.currentScreen)) {
         float var37 = this.method982() + var34;
         String var38 = "Active effect";
         String var39 = "**:**";
         int var40 = var8;
         float var41 = this.method981();
         float var42 = var41 + var40 / 2.0F;
         float var43 = var4.method1479(var39);
         Helper147.method1231(
            var2,
            var42,
            var37,
            1.0F,
            1.0F,
            () -> {
               Helper362.method3604(var2, var41, var37 - 4.0F, var40, 12.0F, 4.0F, var7, var32, var33);
               Helper178.method1510(
                  var2, mc.getStatusEffectSpriteManager().getSprite(this.currentRandomEffect), var41 + 3.5F, (int)var37 - 2, 8.0F, 8, Helper133.method1160()
               );
               var4.method1474(var2, var38, var41 + 16.0F, var37 + 1.0F, var35);
               var4.method1474(var2, var39, var41 + var40 - var43 - 6.0F, var37 + 1.0F, var6);
            }
         );
         var34 += 14;
      } else {
         for (Helper460 var16 : this.list) {
            StatusEffectInstance var17 = var16.effect;
            float var18 = var16.anim.method5000().floatValue();
            float var19 = this.method982() + var34;
            int var20 = var17.getAmplifier();
            String var21 = var17.getEffectType().value().getName().getString();
            String var22 = this.method4861(var17);
            boolean var23 = this.method4862(var17.getEffectType());
            int var24 = var23 ? Helper133.method1139(255, 85, 75, 255) : var35;
            int var25 = 255;
            if (var17.getDuration() <= 200 && var17.getDuration() > 0) {
               double var26 = 0.5 + 0.5 * Math.cos((Math.PI * 2) * (System.currentTimeMillis() % 700L) / 700.0);
               var25 = (int)(100.0 + 155.0 * var26);
            } else if (var17.getDuration() == 0) {
               var25 = 0;
            }

            int var44 = var23 ? Helper133.method1139(255, 85, 75, var25) : Helper133.method1139(var24 >> 16 & 0xFF, var24 >> 8 & 0xFF, var24 & 0xFF, var25);
            float var27 = var4.method1479(var22);
            int var28 = var23 ? Helper133.method1123(var32, Helper133.method1139(120, 22, 22, var7), 0.32F) : var32;
            int var29 = var8;
            float var30 = this.method981();
            float var31 = var30 + var29 / 2.0F;
            Helper147.method1231(var2, var31, var19, 1.0F, var18, () -> {
               Helper362.method3604(var2, var30, var19 - 4.0F, var29, 12.0F, 4.0F, var7, var28, var33);
               Helper178.method1510(var2, mc.getStatusEffectSpriteManager().getSprite(var17.getEffectType()), var30 + 3.5F, (int)var19 - 2, 8.0F, 8, var44);
               var4.method1474(var2, var21, var30 + 16.0F, var19 + 1.0F, var44);
               if (var20 > 0) {
                  String var15 = " " + (var20 + 1);
                  var4.method1474(var2, var15, var30 + 16.0F + var4.method1479(var21), var19 + 1.0F, var44);
               }

               var4.method1474(var2, var22, var30 + var29 - var27 - 6.0F, var19 + 1.0F, var36);
            });
            var34 += Math.max(1, (int)(14.0F * var18));
         }
      }

      this.method975(var8);
      this.method976(var34);
   }

   private int method4860(Helper175 var1, String var2, String var3, String var4) {
      return (int)var1.method1479(var2 + var3 + var4) + 30;
   }

   private String method4861(StatusEffectInstance var1) {
      int var2 = var1.getDuration();
      int var3 = var2 / 1200;
      return !var1.isInfinite() && var3 <= 60 ? var3 + ":" + String.format("%02d", var2 % 1200 / 20) : "**:**";
   }

   private boolean method4862(RegistryEntry<StatusEffect> var1) {
      for (RegistryEntry var5 : NEGATIVE_EFFECTS) {
         if (var1 == var5) {
            return true;
         }
      }

      return false;
   }
}
