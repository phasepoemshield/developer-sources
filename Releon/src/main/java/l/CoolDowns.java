package l;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class CoolDowns extends Helper119 {
   public final List<Helper6> list = new ArrayList<>();
   private long lastItemChange = 0L;
   private int currentItemIndex = 0;
   private static final Item[] EXAMPLE_ITEMS = new Item[]{
      Items.ENDER_EYE,
      Items.ENDER_PEARL,
      Items.SUGAR,
      Items.MACE,
      Items.ENCHANTED_GOLDEN_APPLE,
      Items.TRIDENT,
      Items.CROSSBOW,
      Items.DRIED_KELP,
      Items.NETHERITE_SCRAP
   };

   public static CoolDowns method304() {
      return Helper222.method1981(CoolDowns.class);
   }

   public CoolDowns() {
      super("Cool Downs", 10, 40, 80, 23, true);
   }

   private int method305() {
      return Hud.method1824().method1827();
   }

   private int method306(int var1) {
      int var2 = this.method305() & 16777215;
      return var2 | var1 << 24;
   }

   @Override
   public boolean method307() {
      return !this.list.isEmpty() || Helper38.method548(mc.currentScreen);
   }

   @Override
   public void method308() {
      this.list.removeIf(var0 -> var0.anim.method4995(Helper450.BACKWARDS));
      this.list
         .stream()
         .filter(var0 -> !Objects.requireNonNull(mc.player).getItemCooldownManager().isCoolingDown(var0.item.getDefaultStack()))
         .forEach(var0 -> var0.anim.method4997(Helper450.BACKWARDS));
      if (this.list.isEmpty() && Helper38.method548(mc.currentScreen)) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.lastItemChange >= 1000L) {
            this.currentItemIndex = (this.currentItemIndex + 1) % EXAMPLE_ITEMS.length;
            this.lastItemChange = var1;
         }
      }
   }

   @Override
   public void method309(Helper386 var1) {
      if (!Helper38.method549()) {
         switch (var1.method3895()) {
            case CooldownUpdateS2CPacket var4:
               Item var6 = Registries.ITEM.get(var4.cooldownGroup());
               this.list.stream().filter(var1x -> var1x.item.equals(var6)).forEach(var0 -> var0.anim.method4997(Helper450.BACKWARDS));
               if (var4.cooldown() != 0) {
                  this.list.add(new Helper6(var6, new Helper339().method3360(-var4.cooldown() * 50L), new Animation2().method5003(150).method5004(1.0)));
               }
               break;
            case PlayerRespawnS2CPacket var5:
               this.list.clear();
               break;
            default:
         }
      }
   }

   @Override
   public void method310(DrawContext var1) {
      if (!Helper362.method3600()) {
         this.method311(var1);
      } else {
         this.method312(var1);
      }
   }

   private void method311(DrawContext var1) {
      MatrixStack var2 = var1.getMatrices();
      Helper175 var3 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var4 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var5 = Helper103.method927(17, Helper101.ICONS);
      Helper175 var6 = Helper103.method927(19, Helper101.ICONSTYPENEW);
      int var7 = this.method305();
      int var8 = Hud.method1824().method1842();
      int var9 = this.method306(Math.min(255, var8 + 15));
      byte var10 = 15;
      byte var11 = 2;
      int var12 = 110;
      int var13 = 0;
      if (!this.list.isEmpty()) {
         for (Helper6 var15 : this.list) {
            float var16 = var15.anim.method5000().floatValue();
            String var17 = var15.item.getDefaultStack().getName().getString();
            long var18 = var15.time.method3359();
            int var20 = (int)Math.max(-2147483648L, Math.min(2147483647L, -var18 / 1000L));
            String var21 = Helper209.method1794(var20);
            int var22 = (int)var4.method1479(var17 + var21) + 30;
            var12 = Math.max(var22, var12);
            var13 += (int)(11.0F * var16);
         }
      }

      this.method975(var12 + 10);
      this.method976(this.list.isEmpty() ? var10 : var10 + var11 + var13 + 4);
      Helper12.method361(var2, this.method981(), this.method982(), this.method983(), var10, 4.0F, var8, Hud.method1824().method1831(), var7);
      if (!Hud.method1824().method1838()) {
         rectangle.method677(
            Helper80.method841(var2, this.method981(), this.method982(), this.method983(), var10)
               .method828(4.0F, 4.0F, 4.0F, 4.0F)
               .method835(0.1F)
               .method839(var7)
               .method823(Helper133.method1106(Hud.method1824().method1831(), var8))
               .method840()
         );
      }

      var5.method1474(var2, "D", this.method981() + 3.5F, this.method982() + 6.0F, Hud.method1824().method1828());
      var6.method1474(var2, "e", this.method981() + this.method983() - 13.0F, this.method982() + 5.5F, Hud.method1824().method1828());
      var3.method1474(var2, "CoolDowns", this.method981() + 16, this.method982() + 6.5F, Helper133.method1160());
      if (!this.list.isEmpty()) {
         float var31 = this.method982() + var10 + var11 - 1;
         float var32 = var13 + 4;
         Helper12.method361(var2, this.method981(), var31, this.method983(), var32, 4.0F, var8, Hud.method1824().method1831(), var7);
         if (!Hud.method1824().method1838()) {
            rectangle.method677(
               Helper80.method841(var2, this.method981(), var31, this.method983(), var32)
                  .method828(4.0F, 4.0F, 4.0F, 4.0F)
                  .method835(0.1F)
                  .method839(var7)
                  .method823(Helper133.method1106(Hud.method1824().method1831(), var8))
                  .method840()
            );
         }

         int var33 = 4;
         int var34 = Helper133.method1160();
         int var35 = var7;
         float var19 = this.method981() + this.method983() / 2.0F;

         for (Helper6 var37 : this.list) {
            float var38 = var37.anim.method5000().floatValue();
            float var23 = var31 + var33;
            long var24 = var37.time.method3359();
            int var26 = (int)Math.max(-2147483648L, Math.min(2147483647L, -var24 / 1000L));
            String var27 = var37.item.getDefaultStack().getName().getString();
            String var28 = Helper209.method1794(var26);
            float var29 = var4.method1479(var28);
            float var30 = var23 + 4.0F;
            Helper147.method1231(
               var2,
               var19,
               var30,
               1.0F,
               var38,
               () -> {
                  float var10x = 0.5F;
                  float var11x = this.method981() + 16.0F;
                  float var12x = this.method981() + this.method983() - var29 - 4.0F;
                  float var13x = var12x - var11x - 4.0F;
                  String var14 = var27;
                  if (var4.method1479(var27) > var13x) {
                     var14 = Helper209.method1795(var27, Math.max(0.0F, var13x), var4);
                  }

                  Helper178.method1503(var2, var37.item.getDefaultStack(), this.method981() + 4.0F, var23, false, var10x);
                  var4.method1474(var2, var14, var11x, var23 + 2.0F, var34);
                  float var15x = var23 + 2.0F;
                  int var16x = Hud.method1824().method1828();
                  int var17x = var16x >> 16 & 0xFF;
                  int var18x = var16x >> 8 & 0xFF;
                  int var19x = var16x & 0xFF;
                  RenderSystem.enableBlend();
                  RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
                  Identifier var20x = Identifier.of("textures/teremok/particles/bloom.png");
                  float var21x = var29 + 12.0F;
                  float var22x = 14.0F;
                  float var23x = var12x + var29 / 2.0F;
                  float var24x = var15x + 1.0F;
                  byte var25 = 4;

                  for (int var26x = var25; var26x >= 0; var26x--) {
                     float var27x = 1.0F + var26x * 0.45F;
                     float var28x = var21x * var27x;
                     float var29x = var22x * var27x;
                     float var30x = var26x == 0 ? 0.7F : 0.35F / (var26x + 1);
                     int var31x = Helper133.method1139(var17x, var18x, var19x, (int)(var30x * 90.0F));
                     Helper178.method1513(
                        var2,
                        var20x,
                        var23x - var28x / 2.0F,
                        var23x + var28x / 2.0F,
                        var24x - var29x / 2.0F,
                        var24x + var29x / 2.0F,
                        0.0F,
                        1.0F,
                        0.0F,
                        1.0F,
                        var31x
                     );
                  }

                  RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
                  RenderSystem.disableBlend();
                  var4.method1474(var2, var28, var12x, var15x, var35);
               }
            );
            var33 += (int)(11.0F * var38);
         }
      }
   }

   private void method312(DrawContext var1) {
      MatrixStack var2 = var1.getMatrices();
      Helper175 var3 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var4 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var5 = Helper103.method927(21, Helper101.ICONS);
      int var6 = this.method305();
      int var7 = Hud.method1824().method1842();
      int var8 = Math.max(92, (int)var3.method1479(this.getName()) + 28);
      if (this.list.isEmpty() && Helper38.method548(mc.currentScreen)) {
         var8 = Math.max(var8, this.method313(var4, "Active CoolDown", "**:**"));
      } else {
         for (Helper6 var10 : this.list) {
            String var11 = var10.item.getDefaultStack().getName().getString();
            String var12 = Helper209.method1794((int)Math.max(0L, -var10.time.method3359() / 1000L));
            var8 = Math.max(var8, this.method313(var4, var11, var12));
         }
      }

      int var27 = Helper362.method3601(var7);
      int var28 = Helper362.method3602(var7);
      Helper362.method3604(var2, this.method981(), this.method982(), var8, 15.0F, 4.0F, var7, var27, var28);
      var5.method1474(var2, "D", this.method981() + 4.0F, this.method982() + 5.5F, Hud.method1824().method1828());
      var3.method1474(var2, "CoolDowns", this.method981() + 22, this.method982() + 6.5F, Helper133.method1160());
      int var29 = Helper133.method1160();
      int var30 = var6;
      int var13 = 20;
      if (this.list.isEmpty() && Helper38.method548(mc.currentScreen)) {
         float var31 = this.method982() + var13;
         Item var32 = EXAMPLE_ITEMS[this.currentItemIndex];
         String var33 = "Active CoolDown";
         String var34 = "**:**";
         int var35 = var8;
         float var19 = this.method981();
         float var37 = var19 + var35 / 2.0F;
         float var38 = var4.method1479(var34);
         Helper147.method1231(var2, var37, var31, 1.0F, 1.0F, () -> {
            Helper362.method3604(var2, var19, var31 - 4.0F, var35, 12.0F, 4.0F, var7, var27, var28);
            Helper178.method1503(var2, var32.getDefaultStack(), var19 + 3.5F, var31 - 3.0F, false, 0.5F);
            var4.method1474(var2, var33, var19 + 16.0F, var31 + 1.0F, var29);
            var4.method1474(var2, var34, var19 + var35 - var38 - 6.0F, var31 + 1.0F, var6);
         });
         var13 += 14;
      } else {
         for (Helper6 var15 : this.list) {
            float var16 = var15.anim.method5000().floatValue();
            float var17 = this.method982() + var13;
            long var18 = var15.time.method3359();
            int var20 = 0;
            if (var18 >= -2147483648L && var18 <= 2147483647L) {
               var20 = (int)(-var18 / 1000L);
            } else {
               var20 = var18 < 0L ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            String var21 = var15.item.getDefaultStack().getName().getString();
            String var22 = Helper209.method1794(var20);
            int var23 = var8;
            float var24 = this.method981();
            float var25 = var24 + var23 / 2.0F;
            float var26 = var4.method1479(var22);
            Helper147.method1231(var2, var25, var17, 1.0F, var16, () -> {
               Helper362.method3604(var2, var24, var17 - 4.0F, var23, 12.0F, 4.0F, var7, var27, var28);
               Helper178.method1503(var2, var15.item.getDefaultStack(), var24 + 3.5F, var17 - 3.0F, false, 0.5F);
               var4.method1474(var2, var21, var24 + 16.0F, var17 + 1.0F, var29);
               var4.method1474(var2, var22, var24 + var23 - var26 - 6.0F, var17 + 1.0F, var30);
            });
            var13 += Math.max(1, (int)(14.0F * var16));
         }
      }

      this.method975(var8);
      this.method976(var13);
   }

   private int method313(Helper175 var1, String var2, String var3) {
      return (int)var1.method1479(var2 + var3) + 30;
   }
}
