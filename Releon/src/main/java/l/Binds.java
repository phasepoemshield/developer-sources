package l;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.DiffuseLighting;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Binds extends Helper119 {
   private static final int BINDS_PER_ROW = 5;
   private static final float ICON_SIZE = 16.0F;
   private static final float PADDING = 3.0F;
   private static final float SPACING = 3.0F;
   private static final float ROW_HEIGHT = 22.0F;
   private static final float BACKGROUND_ROUND = 3.0F;
   private final ServerHelper serverHelper;
   private final List<Helper461> binds = new ArrayList<>();
   private final Map<Item, Integer> itemCounts = new HashMap<>();
   private final Helper467 animation = new Animation2().method5003(300).method5004(1.0);
   private long lastFakeChange = 0L;
   private String fakeKey1 = "A";
   private String fakeKey2 = "B";
   private String fakeKey3 = "C";
   private int fakeIdx1 = 0;
   private int fakeIdx2 = 1;
   private int fakeIdx3 = 2;
   private static final Item[] FAKE_ITEMS = new Item[]{Items.ENDER_EYE, Items.SUGAR, Items.DRIED_KELP, Items.NETHERITE_SCRAP};

   public Binds() {
      super("Binds", 10, 180, 150, 40, true);
      this.serverHelper = ServerHelper.method4710();
      this.method4872();
   }

   private void method4872() {
      for (Helper444 var2 : this.serverHelper.method4736()) {
         if (var2.method4693() != null) {
            String var3 = var2.method4694().getName();
            String var4 = this.method4873(var3);
            int var5 = this.method4874(var3);
            this.binds.add(new Helper461(var2, var3, var5, var4));
         }
      }
   }

   private String method4873(String var1) {
      return switch (var1) {
         case "Зелье отрыжки" -> "отрыжки";
         case "Зелье серной кислоты" -> "серная";
         case "Зелье вспышки" -> "вспышка";
         case "Зелье мочи Флеша" -> "моча флеша";
         case "Зелье победителя" -> "победителя";
         case "Зелье агента" -> "агента";
         case "Зелье медика" -> "медика";
         case "Зелье киллера" -> "киллера";
         default -> null;
      };
   }

   private int method4874(String var1) {
      return switch (var1) {
         case "Зелье отрыжки" -> 16735488;
         case "Зелье серной кислоты" -> 49664;
         case "Зелье вспышки" -> 16777215;
         case "Зелье мочи Флеша" -> 6092799;
         case "Зелье победителя" -> 65280;
         case "Зелье агента" -> 16775936;
         case "Зелье медика" -> 16711902;
         case "Зелье киллера" -> 16711680;
         default -> -1;
      };
   }

   private ItemStack method4875(Item var1, int var2) {
      ItemStack var3 = new ItemStack(var1);
      if (var2 != -1 && var1 == Items.SPLASH_POTION) {
         var3.set(DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.empty(), Optional.of(var2), List.of(), Optional.empty()));
      }

      return var3;
   }

   private int method4876(Item var1, String var2) {
      if (!Helper38.method549() && var1 != null) {
         int var3 = 0;
         PlayerInventory var4 = mc.player.getInventory();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            ItemStack var6 = var4.getStack(var5);
            if (!var6.isEmpty()) {
               if (var2 != null && var1 == Items.SPLASH_POTION) {
                  if (var6.isOf(var1) && Helper66.method722(var6.getName()).toLowerCase().contains(var2)) {
                     var3 += var6.getCount();
                  }
               } else if (var6.isOf(var1)) {
                  var3 += var6.getCount();
               }
            }
         }

         return var3;
      } else {
         return 0;
      }
   }

   @Override
   public boolean method307() {
      return Hud.method1824().interfaceSettings.method2588("Binds")
         && Hud.method1824().state
         && !this.animation.method4995(Helper450.BACKWARDS);
   }

   @Override
   public void method308() {
      if (Helper38.method549()) {
         this.animation.method4997(Helper450.BACKWARDS);
      } else {
         List var1 = this.method4877();
         this.animation.method4997(var1.isEmpty() && !Helper38.method548(mc.currentScreen) ? Helper450.BACKWARDS : Helper450.FORWARDS);
         this.itemCounts.clear();

         for (Helper461 var3 : this.binds) {
            Item var4 = var3.keyBind.method4693();
            if (var4 != null && this.method4878(var3)) {
               this.itemCounts.put(var4, this.method4876(var4, var3.searchSubstring));
            }
         }

         long var6 = System.currentTimeMillis();
         if (var1.isEmpty() && Helper38.method548(mc.currentScreen) && var6 - this.lastFakeChange >= 1200L) {
            List var7 = List.of("A", "B", "C", "D", "E", "F", "G");
            Random var5 = new Random();
            this.fakeKey1 = (String)var7.get(var5.nextInt(var7.size()));
            this.fakeKey2 = (String)var7.get(var5.nextInt(var7.size()));
            this.fakeKey3 = (String)var7.get(var5.nextInt(var7.size()));
            this.fakeIdx1 = (this.fakeIdx1 + 1) % FAKE_ITEMS.length;
            this.fakeIdx2 = (this.fakeIdx2 + 1) % FAKE_ITEMS.length;
            this.fakeIdx3 = (this.fakeIdx3 + 1) % FAKE_ITEMS.length;
            this.lastFakeChange = var6;
         }
      }
   }

   private List<Helper461> method4877() {
      return this.binds.stream().filter(this::method4878).collect(Collectors.toList());
   }

   private boolean method4878(Helper461 var1) {
      if (Helper38.method549()) {
         return false;
      } else {
         Setting9 var2 = var1.keyBind.method4694();
         return var2.method2701() && var2.getKey() > 0;
      }
   }

   @Override
   public void method310(DrawContext var1) {
      if (this.method307()) {
         float var2 = this.animation.method5000().floatValue();
         if (!(var2 <= 0.01F)) {
            MatrixStack var3 = var1.getMatrices();
            List var4 = this.method4877();
            float var5 = this.method981();
            float var6 = this.method982();
            if (var4.isEmpty() && Helper38.method548(mc.currentScreen)) {
               this.method4879(var1, var3, var5, var6, var2);
            } else {
               this.method4880(var1, var3, var5, var6, var4, var2);
            }

            this.method975((int)this.method4884(var4));
            this.method976((int)this.method4885(var4));
         }
      }
   }

   private void method4879(DrawContext var1, MatrixStack var2, float var3, float var4, float var5) {
      int var6 = (int)(255.0F * var5);
      Helper175 var7 = Helper103.method927(11, Helper101.DEFAULT);
      Helper175 var8 = Helper103.method927(10, Helper101.DEFAULT);
      String[] var9 = new String[]{this.fakeKey1, this.fakeKey2, this.fakeKey3};
      ItemStack[] var10 = new ItemStack[]{
         new ItemStack(FAKE_ITEMS[this.fakeIdx1]), new ItemStack(FAKE_ITEMS[this.fakeIdx2]), new ItemStack(FAKE_ITEMS[this.fakeIdx3])
      };
      float var11 = 3.0F;

      for (int var12 = 0; var12 < 3; var12++) {
         float var13 = var7.method1479(var9[var12]) + 1.5F;
         float var14 = 19.0F + var13 + 3.0F + 4.0F;
         this.method4881(var1, var2, var3 + var11 - 1.0F, var4, var14, 16.0F, false);
         this.method4886(var1, var10[var12], var3 + var11 + 2.0F, var4 + 3.0F + 0.5F, 0.5F);
         float var15 = var3 + var11 + 16.0F + 3.0F;
         float var16 = var4 + 3.0F + (16.0F - var7.method1481(var9[var12])) / 2.0F;
         var7.method1474(var2, var9[var12], var15 + 1.0F, var16 + 3.0F, new Color(225, 225, 255, var6).getRGB());
         var8.method1474(var2, "64", var3 + var11 + 7.0F, var4 + 22.0F - 12.0F, new Color(255, 255, 255, var6).getRGB());
         var11 += var14 + 3.0F;
      }
   }

   private void method4880(DrawContext var1, MatrixStack var2, float var3, float var4, List<Helper461> var5, float var6) {
      int var7 = (int)Math.ceil(var5.size() / 5.0);
      int var8 = (int)(255.0F * var6);
      Helper175 var9 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var10 = Helper103.method927(11, Helper101.DEFAULT);
      Helper175 var11 = Helper103.method927(10, Helper101.DEFAULT);
      float var12 = var4;

      for (int var13 = 0; var13 < var7; var13++) {
         int var14 = var13 * 5;
         int var15 = Math.min(var14 + 5, var5.size());
         float var16 = this.method4882(var5, var14, var15, var10);
         float var17 = var13 == 0 ? 3.0F : 3.0F + (this.method4883(var5, var10) - var16) / 2.0F;

         for (int var18 = var14; var18 < var15; var18++) {
            Helper461 var19 = (Helper461)var5.get(var18);
            Item var20 = var19.keyBind.method4693();
            if (var20 != null) {
               int var21 = this.itemCounts.getOrDefault(var20, 0);
               boolean var22 = var21 == 0;
               String var23 = Helper209.method1791(var19.keyBind.method4694().getKey());
               float var24 = var10.method1479(var23) + 1.5F;
               float var25 = 19.0F + var24 + 3.0F + 4.0F;
               this.method4881(var1, var2, var3 + var17 - 1.0F, var12, var25, 16.0F, var22);
               ItemStack var26 = this.method4875(var20, var19.potionColor);
               this.method4886(var1, var26, var3 + var17 + 2.0F, var12 + 3.0F + 0.5F, 0.5F);
               float var27 = var3 + var17 + 16.0F + 3.0F;
               float var28 = var12 + 3.0F + (16.0F - var10.method1481(var23)) / 2.0F;
               var9.method1474(var2, var23, var27 + 1.0F, var28 + 3.0F, new Color(225, 225, 255, var8).getRGB());
               var11.method1474(var2, String.valueOf(var21), var3 + var17 + 7.0F, var12 + 22.0F - 12.0F, new Color(255, 255, 255, var8).getRGB());
               var17 += var25 + 3.0F;
            }
         }

         var12 += 22.0F;
      }
   }

   private void method4881(DrawContext var1, MatrixStack var2, float var3, float var4, float var5, float var6, boolean var7) {
      if (Helper362.method3600()) {
         int var10 = var7 ? new Color(70, 8, 8, 105).getRGB() : Helper362.method3601(95);
         int var11 = Helper362.method3602(110);
         rectangle.method677(
            Helper80.method841(var2, var3, var4, var5, var6).method826(3.0F).method839(var11).method825(var10, var10, var10, var10).method840()
         );
         rectangle.method677(
            Helper80.method841(var2, var3, var4, 16.0, var6)
               .method828(0.0F, 0.0F, 3.0F, 3.0F)
               .method839(var11)
               .method825(var10, var10, var10, var10)
               .method840()
         );
      } else {
         int var8 = var7 ? new Color(250, 10, 10, 35).getRGB() : new Color(18, 19, 20, 75).getRGB();
         int var9 = var7 ? new Color(20, 5, 5, 65).getRGB() : new Color(0, 2, 5, 75).getRGB();
         rectangle.method677(
            Helper80.method841(var2, var3, var4, var5, var6)
               .method826(3.0F)
               .method839(new Color(33, 33, 33, 255).getRGB())
               .method825(var8, var8, var9, var9)
               .method840()
         );
         rectangle.method677(
            Helper80.method841(var2, var3, var4, 16.0, var6)
               .method828(0.0F, 0.0F, 3.0F, 3.0F)
               .method839(new Color(33, 33, 33, 255).getRGB())
               .method825(var8, var8, var9, var9)
               .method840()
         );
      }
   }

   private float method4882(List<Helper461> var1, int var2, int var3, Helper175 var4) {
      float var5 = 0.0F;

      for (int var6 = var2; var6 < var3; var6++) {
         Helper461 var7 = (Helper461)var1.get(var6);
         String var8 = Helper209.method1791(var7.keyBind.method4694().getKey());
         float var9 = var4.method1479(var8) + 1.5F;
         var5 += 19.0F + var9 + 3.0F + 4.0F + 3.0F;
      }

      return var5 > 0.0F ? var5 - 3.0F : 0.0F;
   }

   private float method4883(List<Helper461> var1, Helper175 var2) {
      return var1.isEmpty() ? 0.0F : this.method4882(var1, 0, Math.min(5, var1.size()), var2);
   }

   private float method4884(List<Helper461> var1) {
      if (var1.isEmpty() && Helper38.method548(mc.currentScreen)) {
         Helper175 var2 = Helper103.method927(11, Helper101.DEFAULT);
         float var3 = 0.0F;
         String[] var4 = new String[]{this.fakeKey1, this.fakeKey2, this.fakeKey3};

         for (String var8 : var4) {
            var3 += 19.0F + var2.method1479(var8) + 1.5F + 3.0F + 4.0F + 3.0F;
         }

         return var3 - 3.0F + 6.0F;
      } else {
         return this.method4883(var1, Helper103.method927(11, Helper101.DEFAULT)) + 6.0F;
      }
   }

   private float method4885(List<Helper461> var1) {
      if (var1.isEmpty() && Helper38.method548(mc.currentScreen)) {
         return 22.0F;
      } else {
         int var2 = (int)Math.ceil(var1.size() / 5.0);
         return var2 * 22.0F;
      }
   }

   private void method4886(DrawContext var1, ItemStack var2, float var3, float var4, float var5) {
      MatrixStack var6 = var1.getMatrices();
      var6.push();
      var6.translate(var3, var4, 100.0F);
      var6.scale(var5, var5, 1.0F);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      DiffuseLighting.enableGuiDepthLighting();
      var1.drawItem(var2, 0, 0);
      DiffuseLighting.disableGuiDepthLighting();
      var6.pop();
   }
}
