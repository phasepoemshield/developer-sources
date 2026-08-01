package l;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;

public class Inventory extends Helper119 {
   List<ItemStack> stacks = new ArrayList<>();

   public Inventory() {
      super("Inventory", 385, 40, 123, 60, true);
   }

   private int method3130() {
      return Hud.method1824().method1827();
   }

   private int method3131(int var1) {
      int var2 = this.method3130() & 16777215;
      return var2 | var1 << 24;
   }

   @Override
   public boolean method307() {
      return !this.stacks.stream().filter(var0 -> !var0.isEmpty()).toList().isEmpty() || Helper38.method548(mc.currentScreen);
   }

   @Override
   public void method308() {
      this.stacks = IntStream.range(9, 36).mapToObj(var0 -> mc.player.inventory.getStack(var0)).toList();
   }

   @Override
   public void method310(DrawContext var1) {
      if (!Helper362.method3600()) {
         this.method3132(var1);
      } else {
         this.method3133(var1);
      }
   }

   private void method3132(DrawContext var1) {
      MatrixStack var2 = var1.getMatrices();
      Helper175 var3 = Helper103.method927(14, Helper101.DEFAULT);
      Helper175 var4 = Helper103.method927(12, Helper101.DEFAULT);
      Helper175 var5 = Helper103.method927(20, Helper101.ICONS);
      int var6 = this.method3130();
      int var7 = Hud.method1824().method1844();
      int var8 = this.method3131(Math.min(255, var7 + 15));
      int var9 = this.method3131(Math.max(0, var7 - 15));
      long var10 = this.stacks.stream().filter(var0 -> !var0.isEmpty()).mapToInt(ItemStack::getCount).sum();
      String var12 = String.valueOf(var10);
      float var13 = var4.method1479(var12);
      float var14 = var13 + 6.0F;
      Helper12.method361(
         var2, this.method981(), this.method982(), this.method983(), this.method984(), 5.0F, var7, Hud.method1824().method1833(), var6
      );
      if (!Hud.method1824().method1838()) {
         rectangle.method677(
            Helper80.method841(var2, this.method981(), this.method982(), this.method983(), this.method984())
               .method828(5.0F, 5.0F, 5.0F, 5.0F)
               .method835(0.1F)
               .method839(var6)
               .method823(Helper133.method1106(Hud.method1824().method1833(), var7))
               .method840()
         );
      }

      var5.method1474(var2, "F", this.method981() + 4.5F, this.method982() + 6, Hud.method1824().method1828());
      var3.method1474(var2, this.getName(), this.method981() + 18, this.method982() + 6.5F, Helper133.method1160());
      byte var15 = 20;
      byte var16 = 4;
      byte var17 = 9;
      int var18 = 0;

      for (ItemStack var20 : this.stacks) {
         float var21 = this.method981() + var16 + 1;
         float var22 = this.method982() + var15 + 1.0F;
         if (var18 % var17 != var17 - 1) {
            rectangle.method677(Helper80.method841(var2, var21 + 10.0F, var22, 0.5, 9.0).method823(Helper133.method1159(0.1F)).method826(0.0F).method840());
         }

         if (var18 < this.stacks.size() - var17) {
            rectangle.method677(
               Helper80.method841(var2, var21 - 0.5F, var22 + 10.0F, 9.0, 0.5).method823(Helper133.method1159(0.1F)).method826(0.0F).method840()
            );
         }

         Helper178.method1502(var1, var20, var21 - 1.0F, var22 - 1.0F, false, true, 0.5F);
         var16 += 13;
         if (++var18 % var17 == 0) {
            var15 += 13;
            var16 = 4;
         }
      }
   }

   private void method3133(DrawContext var1) {
      MatrixStack var2 = var1.getMatrices();
      Helper175 var3 = Helper103.method927(14, Helper101.DEFAULT);
      Helper175 var4 = Helper103.method927(20, Helper101.ICONS);
      int var5 = Hud.method1824().method1844();
      int var6 = this.method983();
      byte var7 = 15;
      int var8 = this.method982() + 19;
      int var9 = this.method984() - 19;
      int var10 = Helper362.method3601(var5);
      int var11 = Helper362.method3602(var5);
      Helper362.method3604(var2, this.method981(), this.method982(), var6, var7, 4.0F, var5, var10, var11);
      Helper362.method3604(var2, this.method981(), var8, var6, var9, 4.0F, var5, var10, var11);
      var4.method1474(var2, "F", this.method981() + 4.5F, this.method982() + 6, Hud.method1824().method1828());
      var3.method1474(var2, this.getName(), this.method981() + 22, this.method982() + 6.5F, Helper133.method1160());
      byte var12 = 20;
      byte var13 = 4;
      byte var14 = 9;
      int var15 = 0;

      for (ItemStack var17 : this.stacks) {
         float var18 = this.method981() + var13 + 1;
         float var19 = this.method982() + var12 + 1.0F;
         if (var15 % var14 != var14 - 1) {
            rectangle.method677(
               Helper80.method841(var2, var18 + 10.0F, var19, 0.5, 9.0).method823(Helper133.method1159(0.08F)).method826(0.0F).method840()
            );
         }

         if (var15 < this.stacks.size() - var14) {
            rectangle.method677(
               Helper80.method841(var2, var18 - 0.5F, var19 + 10.0F, 9.0, 0.5).method823(Helper133.method1159(0.08F)).method826(0.0F).method840()
            );
         }

         Helper178.method1502(var1, var17, var18 - 1.0F, var19 - 1.0F, false, true, 0.5F);
         var13 += 13;
         if (++var15 % var14 == 0) {
            var12 += 13;
            var13 = 4;
         }
      }
   }
}
