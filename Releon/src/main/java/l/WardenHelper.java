package l;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class WardenHelper extends Helper242 {
   private final Setting2 criticalSeconds = new Setting2("Критическое время", "Когда секунд мало, подсветка усиливается")
      .method2086(0.9F)
      .method2078(0.1F, 5.0F);
   private final Setting2 greenAtSeconds = new Setting2("Зелёный при", "От какого значения таймер считается полностью зелёным")
      .method2086(12.0F)
      .method2078(1.0F, 60.0F);
   private final Setting2 chestScanRadius = new Setting2("Радиус сундуков", "Показывать таймер над всеми сундуками в этом радиусе")
      .method2086(24.0F)
      .method2078(6.0F, 64.0F);
   private final Setting2 timerLinkRadius = new Setting2("Радиус привязки", "Максимальная дистанция от сундука до надписи с таймером")
      .method2086(4.0F)
      .method2078(1.5F, 8.0F);
   private final Setting2 scanIntervalMs = new Setting2("Интервал скана", "Как часто пересканировать сундуки (мс)")
      .method2086(350.0F)
      .method2078(100.0F, 2000.0F);
   private final Setting3 alwaysShow = new Setting3("Показывать всегда", "Не скрывать таймер, если строка с ним пропала").method2201(true);
   private final Setting2 yOffset = new Setting2("Высота текста", "Высота таймера над сундуком").method2086(1.25F).method2078(0.4F, 3.0F);
   private final Setting2 holdMs = new Setting2("Удержание", "Сколько держать последнее значение без новых серверных обновлений (мс)")
      .method2086(5000.0F)
      .method2078(0.0F, 30000.0F);
   private final Setting7 alertColor = new Setting7("Цвет тревоги", "Цвет подсветки, когда время заканчивается")
      .method2555(-46261)
      .method2551(-46261, -34304, -11701);
   private final Pattern mmssPattern = Pattern.compile("(\\d{1,2})\\s*[:]\\s*(\\d{2})");
   private final Pattern secPattern = Pattern.compile(
      "(\\d+(?:[\\.,]\\d+)?)\\s*(?:\\u0441|\\u0441\\u0435\\u043a|\\u0441\\u0435\\u043a\\u0443\\u043d\\u0434|sec|s)\\b", 66
   );
   private BlockPos trackedChestPos;
   private boolean usePressed;
   private List<BlockPos> cachedChests = new ArrayList<>();
   private long lastChestScanMs = 0L;
   private Map<BlockPos, Helper225> chestTimers = new HashMap<>();

   public WardenHelper() {
      super("WardenHelper", "Warden Helper", Helper269.RENDER);
      this.setup(
         new Helper264[]{
            this.criticalSeconds,
            this.greenAtSeconds,
            this.chestScanRadius,
            this.timerLinkRadius,
            this.scanIntervalMs,
            this.alwaysShow,
            this.yOffset,
            this.holdMs,
            this.alertColor
         }
      );
   }

   @Override
   public void deactivate() {
      this.trackedChestPos = null;
      this.usePressed = false;
      this.cachedChests.clear();
      this.chestTimers.clear();
      this.lastChestScanMs = 0L;
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.world != null && mc.player != null) {
         boolean var2 = mc.options != null && mc.options.useKey.isPressed();
         if (var2 && !this.usePressed && mc.crosshairTarget != null && mc.crosshairTarget.getType() == Type.BLOCK) {
            BlockHitResult var3 = (BlockHitResult)mc.crosshairTarget;
            BlockPos var4 = var3.getBlockPos();
            BlockState var5 = mc.world.getBlockState(var4);
            if (this.method2000(var5.getBlock())) {
               this.trackedChestPos = var4.toImmutable();
            }
         }

         this.usePressed = var2;
         if (this.trackedChestPos != null && mc.world.getBlockState(this.trackedChestPos).isAir()) {
            this.trackedChestPos = null;
         }

         this.method1994();
         this.method1995();
      } else {
         this.trackedChestPos = null;
         this.cachedChests.clear();
         this.chestTimers.clear();
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (var1.method3894() && var1.method3895() instanceof PlayerInteractBlockC2SPacket var2 && mc.world != null) {
         BlockPos var5 = var2.getBlockHitResult().getBlockPos();
         BlockState var4 = mc.world.getBlockState(var5);
         if (this.method2000(var4.getBlock())) {
            this.trackedChestPos = var5.toImmutable();
         }
      }
   }

   @Helper104
   public void onDraw(Event20 var1) {
      if (mc.world != null && !this.cachedChests.isEmpty()) {
         boolean var2 = false;
         long var3 = System.currentTimeMillis();

         for (BlockPos var6 : this.cachedChests) {
            Helper225 var7 = this.chestTimers.get(var6);
            if (var7 != null && (this.alwaysShow.method2200() || var3 - var7.method1992() <= (long)this.holdMs.method2082())) {
               Vec3d var8 = var6.toCenterPos().add(0.0, this.yOffset.method2082(), 0.0);
               Vec3d var9 = Helper148.method1251(var8);
               if (!(var9.z <= 0.0) && !(var9.z >= 1.0)) {
                  this.method1993(var1, (float)var9.x, (float)var9.y, var7.method1990(), var7.method1991());
                  var2 = true;
               }
            }
         }

         if (!var2 && this.trackedChestPos != null) {
            Helper225 var10 = this.chestTimers.get(this.trackedChestPos);
            if (var10 != null) {
               Vec3d var11 = this.trackedChestPos.toCenterPos().add(0.0, this.yOffset.method2082(), 0.0);
               Vec3d var12 = Helper148.method1251(var11);
               if (var12.z > 0.0 && var12.z < 1.0) {
                  this.method1993(var1, (float)var12.x, (float)var12.y, var10.method1990(), var10.method1991());
               }
            }
         }
      }
   }

   private void method1993(Event20 var1, float var2, float var3, float var4, String var5) {
      float var6 = Float.isNaN(var4) ? 0.0F : Math.max(0.0F, var4);
      float var7 = Math.max(1.0F, this.greenAtSeconds.method2082());
      float var8 = MathHelper.clamp(var6 / var7, 0.0F, 1.0F);
      float var9 = MathHelper.clamp((this.criticalSeconds.method2082() - var6) / Math.max(0.1F, this.criticalSeconds.method2082()), 0.0F, 1.0F);
      MatrixStack var10 = var1.method4058().getMatrices();
      float var11 = 36.0F + var9 * 6.0F;
      float var12 = var2 - var11 / 2.0F;
      float var13 = var3 - var11 / 2.0F;
      int var14 = this.method2002(-57312, -14942380, var8);
      int var15 = this.method2002(var14, -65536, var9 * 0.7F);
      int var16 = MathHelper.clamp((int)(70.0F + (1.0F - var8) * 135.0F + var9 * 40.0F), 70, 255);
      int var17 = MathHelper.clamp((int)(110.0F + (1.0F - var8) * 120.0F + var9 * 25.0F), 110, 255);
      int var18 = MathHelper.clamp((int)(30.0F + (1.0F - var8) * 100.0F + var9 * 60.0F), 30, 210);
      blur.method677(
         Helper80.method841(var10, var12, var13, var11, var11).method826(8.0F).method838(64.0F).method823(new Color(0, 0, 0, var16).getRGB()).method840()
      );
      if (var9 > 0.0F) {
         rectangle.method677(
            Helper80.method841(var10, var12 - 2.0F, var13 - 2.0F, var11 + 4.0F, var11 + 4.0F)
               .method826(9.0F)
               .method823(this.method2001(var15, MathHelper.clamp((int)(var9 * 110.0F), 0, 110)))
               .method840()
         );
      }

      rectangle.method677(
         Helper80.method841(var10, var12, var13, var11, var11)
            .method826(8.0F)
            .method835(0.8F + var9 * 0.6F)
            .method839(this.method2001(var15, var17))
            .method823(new Color(0, 0, 0, 190).getRGB())
            .method840()
      );
      rectangle.method677(
         Helper80.method841(var10, var12 + 3.0F, var13 + 3.0F, var11 - 6.0F, var11 - 6.0F)
            .method826(6.0F)
            .method823(this.method2001(var15, var18))
            .method840()
      );
      String var19 = this.method1999(var5);
      int var20 = mc.textRenderer.getWidth(var19);
      int var21 = Math.round(var2 - var20 / 2.0F);
      int var22 = Math.round(var3 - 4.0F);
      var1.method4058().drawText(mc.textRenderer, var19, var21, var22, this.method2001(var15, 255), true);
   }

   private void method1994() {
      if (mc.world != null && mc.player != null) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.lastChestScanMs >= (long)this.scanIntervalMs.method2082()) {
            this.lastChestScanMs = var1;
            int var3 = Math.max(1, Math.round(this.chestScanRadius.method2082()));
            BlockPos var4 = mc.player.getBlockPos();
            ArrayList var5 = new ArrayList();

            for (BlockPos var7 : BlockPos.iterate(var4.add(-var3, -6, -var3), var4.add(var3, 6, var3))) {
               if (this.method2000(mc.world.getBlockState(var7).getBlock())) {
                  var5.add(var7.toImmutable());
               }
            }

            this.cachedChests = var5;
         }
      } else {
         this.cachedChests.clear();
      }
   }

   private void method1995() {
      if (mc.world != null && mc.player != null) {
         long var1 = System.currentTimeMillis();
         List<Helper224> var3 = this.method1996();
         HashMap var4 = new HashMap();
         double var5 = this.timerLinkRadius.method2082() * this.timerLinkRadius.method2082();

         for (BlockPos var8 : this.cachedChests) {
            Helper224 var9 = null;
            double var10 = Double.MAX_VALUE;
            Vec3d var12 = var8.toCenterPos();

            for (Helper224 var14 : var3) {
               double var15 = var14.method1987().squaredDistanceTo(var12);
               if (var15 <= var5 && var15 < var10) {
                  var10 = var15;
                  var9 = var14;
               }
            }

            if (var9 != null) {
               var4.put(var8, new Helper225(var9.method1988(), var9.method1989(), var1));
            } else {
               Helper225 var18 = this.chestTimers.get(var8);
               if (var18 != null && (this.alwaysShow.method2200() || var1 - var18.method1992() <= (long)this.holdMs.method2082())) {
                  var4.put(var8, var18);
               }
            }
         }

         Helper223 var17 = this.method1997();
         if (var17 != null && this.trackedChestPos != null && this.cachedChests.contains(this.trackedChestPos)) {
            var4.put(this.trackedChestPos, new Helper225(var17.method1985(), var17.method1986(), var1));
         }

         this.chestTimers = var4;
      } else {
         this.chestTimers.clear();
      }
   }

   private List<Helper224> method1996() {
      ArrayList var1 = new ArrayList();
      if (mc.world != null && mc.player != null) {
         double var2 = this.chestScanRadius.method2082();
         Vec3d var4 = mc.player.getPos();
         Box var5 = new Box(var4.x - var2, var4.y - 6.0, var4.z - var2, var4.x + var2, var4.y + 6.0, var4.z + var2);

         for (Entity var7 : mc.world.getOtherEntities(null, var5)) {
            String var8 = var7.getName() == null ? null : var7.getName().getString();
            Helper223 var9 = this.method1998(var8);
            if (var9 != null) {
               var1.add(new Helper224(var7.getPos(), var9.method1985(), var9.method1986()));
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private Helper223 method1997() {
      if (mc.currentScreen instanceof GenericContainerScreen var1) {
         String var3 = var1.getTitle() == null ? null : var1.getTitle().getString();
         return this.method1998(var3);
      } else {
         return null;
      }
   }

   private Helper223 method1998(String var1) {
      if (var1 != null && !var1.isBlank()) {
         Matcher var2 = this.mmssPattern.matcher(var1);
         if (var2.find()) {
            int var3 = this.method2003(var2.group(1), -1);
            int var4 = this.method2003(var2.group(2), -1);
            if (var3 >= 0 && var4 >= 0 && var4 < 60) {
               return new Helper223(var3 * 60.0F + var4, var2.group(0));
            }
         }

         Matcher var5 = this.secPattern.matcher(var1);
         if (var5.find()) {
            float var6 = this.method2004(var5.group(1), Float.NaN);
            if (!Float.isNaN(var6)) {
               return new Helper223(var6, var5.group(0));
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private String method1999(String var1) {
      return var1 != null && !var1.isBlank() ? var1.replace(',', '.') : "0.0с";
   }

   private boolean method2000(Block var1) {
      return var1 instanceof ChestBlock || var1 instanceof EnderChestBlock || var1 instanceof BarrelBlock || var1 instanceof ShulkerBoxBlock;
   }

   private int method2001(int var1, int var2) {
      return var1 & 16777215 | (var2 & 0xFF) << 24;
   }

   private int method2002(int var1, int var2, float var3) {
      float var4 = MathHelper.clamp(var3, 0.0F, 1.0F);
      int var5 = var1 >> 16 & 0xFF;
      int var6 = var1 >> 8 & 0xFF;
      int var7 = var1 & 0xFF;
      int var8 = var2 >> 16 & 0xFF;
      int var9 = var2 >> 8 & 0xFF;
      int var10 = var2 & 0xFF;
      int var11 = (int)(var5 + (var8 - var5) * var4);
      int var12 = (int)(var6 + (var9 - var6) * var4);
      int var13 = (int)(var7 + (var10 - var7) * var4);
      return 0xFF000000 | var11 << 16 | var12 << 8 | var13;
   }

   private int method2003(String var1, int var2) {
      try {
         return Integer.parseInt(var1);
      } catch (Exception var4) {
         return var2;
      }
   }

   private float method2004(String var1, float var2) {
      try {
         return Float.parseFloat(var1.replace(',', '.'));
      } catch (Exception var4) {
         return var2;
      }
   }
}
