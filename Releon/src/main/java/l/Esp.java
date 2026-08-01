package l;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.mob.WardenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector4d;

public class Esp extends Helper242 {
   private final Identifier TEXTURE = Identifier.of("textures/teremok/esp/container.png");
   private final List<PlayerEntity> players = new ArrayList<>();
   private final Map<RegistryKey<Enchantment>, String> encMap = new HashMap<>();
   public final Setting8 entityType = new Setting8("Тип сущности", "Сущности, которые будут отображаться")
      .method2585("Player", "Item", "TNT", "Warden")
      .method2586("Player", "Item");
   private final Setting8 playerSetting = new Setting8("Настройки игрока", "Настройки для игроков")
      .method2585("Box", "Armor", "NameTags", "Hand Items")
      .method2586("Box", "Armor", "NameTags", "Hand Items")
      .method2587(() -> this.entityType.method2588("Player"));
   public final Setting5 boxType = new Setting5("Тип", "Тип")
      .method2381("Corner", "Full", "3D Box", "Skeleton")
      .method2383("3D Box")
      .method2382(() -> this.playerSetting.method2588("Box"));
   public final Setting3 flatBoxOutline = new Setting3("Контур", "Контур для плоских боксов")
      .method2199(() -> this.playerSetting.method2588("Box") && (this.boxType.method2385("Corner") || this.boxType.method2385("Full")));
   public final Setting2 boxAlpha = new Setting2("Прозрачность", "Прозрачность бокса")
      .method2086(1.0F)
      .method2078(0.1F, 1.0F)
      .method2081(() -> this.boxType.method2385("3D Box"));
   public final Setting2 skeletonWidth = new Setting2("Толщина линий", "Толщина линий скелета")
      .method2086(2.5F)
      .method2078(2.5F, 4.0F)
      .method2081(() -> this.boxType.method2385("Skeleton"));
   public final Setting3 customColor = new Setting3("Кастомный цвет", "Использовать свой цвет вместо стандартного");
   public final Setting7 colorSetting = new Setting7("Цвет", "Выберите цвет")
      .method2555(-39623)
      .method2551(-9659651, -7569409, -23178, -33925)
      .method2552(this.customColor::method2200);
   private static final float DISTANCE = 128.0F;

   public static Esp method2022() {
      return Helper222.method1979(Esp.class);
   }

   public Esp() {
      super("Esp", "Esp", Helper269.RENDER);
      this.setup(
         new Helper264[]{
            this.entityType, this.playerSetting, this.boxType, this.flatBoxOutline, this.boxAlpha, this.skeletonWidth, this.customColor, this.colorSetting
         }
      );
   }

   @Helper104
   public void method2023(Event21 var1) {
      this.players.clear();
   }

   @Helper104
   public void onTick(Event8 var1) {
      this.players.clear();
      if (mc.world != null) {
         mc.world
            .getPlayers()
            .stream()
            .filter(var0 -> var0 != mc.player)
            .filter(var0 -> var0.getCustomName() == null || !var0.getCustomName().getString().startsWith("Ghost_"))
            .forEach(this.players::add);
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (this.entityType.method2588("Player") || this.entityType.method2588("Warden")) {
         float var2 = mc.getRenderTickCounter().getTickDelta(false);
         if (this.entityType.method2588("Player")) {
            for (PlayerEntity var4 : this.players) {
               if (var4 != null && var4 != mc.player && (var4.getCustomName() == null || !var4.getCustomName().getString().startsWith("Ghost_"))) {
                  double var5 = MathHelper.lerp((double)var2, var4.prevX, var4.getX());
                  double var7 = MathHelper.lerp((double)var2, var4.prevY, var4.getY());
                  double var9 = MathHelper.lerp((double)var2, var4.prevZ, var4.getZ());
                  Vec3d var11 = new Vec3d(var5, var7, var9);
                  float var12 = (float)mc.getEntityRenderDispatcher().camera.getPos().distanceTo(var11);
                  if (!(var12 < 1.0F)) {
                     boolean var13 = Helper309.method3075(var4);
                     int var14 = var13 ? Helper133.method1164() : Helper133.method1162();
                     int var15 = (int)(this.boxAlpha.method2082() * 255.0F);
                     int var16 = var14 & 16777215 | var15 << 24;
                     int var17 = var14 | 0xFF000000;
                     if (this.boxType.method2385("3D Box")) {
                        Box var18 = var4.getDimensions(var4.getPose()).getBoxAt(var5, var7, var9);
                        Helper183.method1546(var18, var16, 2.0F, true, true, true);
                        Helper183.method1546(var18, var17, 2.0F, true, true, true);
                     } else if (this.boxType.method2385("Skeleton") && this.playerSetting.method2588("Box") && !(var12 > 128.0F)) {
                        this.method2026(var4, var2, var14);
                     }
                  }
               }
            }
         }

         if (this.entityType.method2588("Warden") && this.boxType.method2385("3D Box")) {
            for (Entity var20 : mc.world.getEntities()) {
               if (var20 instanceof WardenEntity var21) {
                  double var6 = MathHelper.lerp((double)var2, var21.prevX, var21.getX());
                  double var8 = MathHelper.lerp((double)var2, var21.prevY, var21.getY());
                  double var10 = MathHelper.lerp((double)var2, var21.prevZ, var21.getZ());
                  Box var22 = var21.getDimensions(var21.getPose()).getBoxAt(var6, var8, var10);
                  int var23 = this.customColor.method2200() ? this.colorSetting.method2553() : -16711681;
                  int var24 = (int)(this.boxAlpha.method2082() * 255.0F);
                  int var25 = var23 & 16777215 | var24 << 24;
                  int var26 = var23 | 0xFF000000;
                  Helper183.method1546(var22, var25, 2.0F, true, true, true);
                  Helper183.method1546(var22, var26, 2.0F, true, true, true);
               }
            }
         }
      }
   }

   @Helper104
   public void onDraw(Event20 var1) {
      DrawContext var2 = var1.method4058();
      MatrixStack var3 = var2.getMatrices();
      Helper175 var4 = Helper103.method927(13, Helper101.SEMI);
      Helper175 var5 = Helper103.method927(15, Helper101.SEMI);
      if (this.entityType.method2588("Player")) {
         for (PlayerEntity var7 : this.players) {
            if (var7 != null && var7 != mc.player && (var7.getCustomName() == null || !var7.getCustomName().getString().startsWith("Ghost_"))) {
               Vector4d var8 = Helper148.method1253(var7);
               float var9 = (float)mc.getEntityRenderDispatcher().camera.getPos().distanceTo(var7.getBoundingBox().getCenter());
               boolean var10 = Helper309.method3075(var7);
               int var11 = var10 ? Helper133.method1164() : Helper133.method1162();
               if (!(var9 < 1.0F) && !Helper148.method1257(var8)) {
                  if (this.playerSetting.method2588("Box") && (this.boxType.method2385("Corner") || this.boxType.method2385("Full"))) {
                     this.method2024(var8, var11);
                  }

                  if (this.playerSetting.method2588("Armor")) {
                     this.method2025(var2, var7, var8, var4);
                  }

                  if (this.playerSetting.method2588("Hand Items")) {
                     this.method2027(var3, var7, var4, var8);
                  }

                  MutableText var12 = this.method2030(var7, var10);
                  if (Helper128.method1057()) {
                     float var13 = (float)Helper148.method1258(var8);
                     float var14 = (float)var8.y;
                     float var15 = mc.textRenderer.getWidth(var12);
                     float var16 = 9.0F;
                     float var17 = var13 - var15 / 2.0F;
                     float var18 = var14 - 11.0F;
                     blur.method677(
                        Helper80.method841(var3, var17 - 2.0F, var18 - 0.75F, var15 + 4.0F, var16 + 1.5F)
                           .method838(5.0F)
                           .method826(4.0F)
                           .method834(1.0F)
                           .method826(var16 / 4.0F)
                           .method823(Helper133.HALF_BLACK)
                           .method840()
                     );
                     var2.drawText(mc.textRenderer, var12, (int)var17, (int)var18 + 1, Helper133.method1105(255), false);
                  } else {
                     this.method2029(var3, var12, Helper148.method1258(var8), var8.y - 2.0, var4);
                  }
               }
            }
         }
      }

      for (Entity var21 : Helper38.method536()
         .sorted(Comparator.comparing(var0 -> var0 instanceof ItemEntity var1x && var1x.getStack().getName().getString().equals("empty")))
         .toList()) {
         if (var21 instanceof ItemEntity var22 && this.entityType.method2588("Item")) {
            Vector4d var27 = Helper148.method1253(var21);
            if (!Helper148.method1257(var27)) {
               ItemStack var29 = var22.getStack();
               ContainerComponent var31 = var29.get(DataComponentTypes.CONTAINER);
               List<net.minecraft.item.ItemStack> var32 = var31 != null ? var31.stream().toList() : List.of();
               net.minecraft.text.MutableText var33 = var29.getName().copy();
               if (var29.getCount() > 1) {
                  var33 = var33.append(Formatting.RESET + " [" + Formatting.RED + var29.getCount() + Formatting.GRAY + "x" + Formatting.RESET + "]");
               }

               if (!var32.isEmpty()) {
                  this.method2028(var2, var29, var32, var27);
               } else {
                  Helper175 var34 = var33.getString().equals("empty") ? var5 : var4;
                  this.method2029(var3, (Text)var33, Helper148.method1258(var27), var27.y, var34);
               }
            }
         } else if (var21 instanceof TntEntity var23 && this.entityType.method2588("TNT")) {
            Vector4d var26 = Helper148.method1253(var21);
            if (!Helper148.method1257(var26)) {
               this.method2029(var3, var23.getStyledDisplayName(), Helper148.method1258(var26), var26.y, var4);
            }
         } else if (var21 instanceof WardenEntity var24 && this.entityType.method2588("Warden")) {
            Vector4d var25 = Helper148.method1253(var24);
            if (!Helper148.method1257(var25)) {
               int var28 = this.customColor.method2200() ? this.colorSetting.method2553() : -16711681;
               if (this.boxType.method2385("Corner") || this.boxType.method2385("Full")) {
                  this.method2024(var25, var28);
               }

               MutableText var30 = Text.literal("Warden")
                  .formatted(Formatting.DARK_AQUA)
                  .append(Formatting.RESET + " [" + Formatting.RED + (int)var24.getHealth() + "❤" + Formatting.RESET + "]");
               this.method2029(var3, var30, Helper148.method1258(var25), var25.y - 2.0, var4);
            }
         }
      }
   }

   private void method2024(Vector4d var1, int var2) {
      int var3 = Helper133.HALF_BLACK;
      float var4 = (float)var1.x;
      float var5 = (float)var1.y;
      float var6 = (float)var1.z;
      float var7 = (float)var1.w;
      float var8 = (var6 - var4) / 3.0F;
      if (this.boxType.method2385("Corner")) {
         Helper178.method1516(var4 - 0.5F, var5 - 0.5F, var8, 0.5F, var2);
         Helper178.method1516(var4 - 0.5F, var5, 0.5F, var8 + 0.5F, var2);
         Helper178.method1516(var4 - 0.5F, var7 - var8 - 0.5F, 0.5F, var8, var2);
         Helper178.method1516(var4 - 0.5F, var7 - 0.5F, var8, 0.5F, var2);
         Helper178.method1516(var6 - var8 + 1.0F, var5 - 0.5F, var8, 0.5F, var2);
         Helper178.method1516(var6 + 0.5F, var5, 0.5F, var8 + 0.5F, var2);
         Helper178.method1516(var6 + 0.5F, var7 - var8 - 0.5F, 0.5F, var8, var2);
         Helper178.method1516(var6 - var8 + 1.0F, var7 - 0.5F, var8, 0.5F, var2);
         if (this.flatBoxOutline.method2200()) {
            Helper178.method1516(var4 - 1.0F, var5 - 1.0F, var8 + 1.0F, 1.5F, var3);
            Helper178.method1516(var4 - 1.0F, var5 + 0.5F, 1.5F, var8 + 0.5F, var3);
            Helper178.method1516(var4 - 1.0F, var7 - var8 - 1.0F, 1.5F, var8, var3);
            Helper178.method1516(var4 - 1.0F, var7 - 1.0F, var8 + 1.0F, 1.5F, var3);
            Helper178.method1516(var6 - var8 + 0.5F, var5 - 1.0F, var8 + 1.0F, 1.5F, var3);
            Helper178.method1516(var6, var5 + 0.5F, 1.5F, var8 + 0.5F, var3);
            Helper178.method1516(var6, var7 - var8 - 1.0F, 1.5F, var8, var3);
            Helper178.method1516(var6 - var8 + 0.5F, var7 - 1.0F, var8 + 1.0F, 1.5F, var3);
         }
      } else if (this.boxType.method2385("Full")) {
         if (this.flatBoxOutline.method2200()) {
            Helper178.method1516(var4 - 1.0F, var5 - 1.0F, var6 - var4 + 2.0F, 1.5F, var3);
            Helper178.method1516(var4 - 1.0F, var5 - 1.0F, 1.5F, var7 - var5 + 2.0F, var3);
            Helper178.method1516(var4 - 1.0F, var7 - 1.0F, var6 - var4 + 2.0F, 1.5F, var3);
            Helper178.method1516(var6 - 0.5F, var5 - 1.0F, 1.5F, var7 - var5 + 2.0F, var3);
         }

         Helper178.method1516(var4 - 0.5F, var5 - 0.5F, var6 - var4 + 1.0F, 0.5F, var2);
         Helper178.method1516(var4 - 0.5F, var5 - 0.5F, 0.5F, var7 - var5 + 1.0F, var2);
         Helper178.method1516(var4 - 0.5F, var7 - 0.5F, var6 - var4 + 1.0F, 0.5F, var2);
         Helper178.method1516(var6, var5 - 0.5F, 0.5F, var7 - var5 + 1.0F, var2);
      }
   }

   private void method2025(DrawContext var1, PlayerEntity var2, Vector4d var3, Helper175 var4) {
      MatrixStack var5 = var1.getMatrices();
      ArrayList<net.minecraft.item.ItemStack> var6 = new ArrayList<>();
      var2.getEquippedItems().forEach(var1x -> {
         if (!var1x.isEmpty()) {
            var6.add(var1x);
         }
      });
      float var7 = (float)(Helper148.method1258(var3) - var6.size() * 5.5);
      float var8 = (float)(var3.y - 8.666666666666666 - 15.0);
      if (!var6.isEmpty()) {
         var5.push();
         var5.translate(var7, var8, 0.0F);
         float var9 = -11.0F;

         for (ItemStack var11 : var6) {
            var9 += 11.0F;
            Helper178.method1502(var1, var11, var9, 0.0F, false, false, 0.5F);
         }

         var5.pop();
      }
   }

   private void method2026(PlayerEntity var1, float var2, int var3) {
      Vec3d var4 = Helper147.method1247(var1);
      float var5 = this.skeletonWidth.method2082();
      float var6 = var1.limbAnimator.getPos(var2);
      float var7 = var1.limbAnimator.getSpeed(var2);
      float var8 = MathHelper.lerpAngleDegrees(var2, var1.prevBodyYaw, var1.bodyYaw);
      float var9 = (float)Math.toRadians(-var8 + 90.0F);
      boolean var10 = var1.isSwimming() || var1.isGliding();
      float var11 = var1.isSneaking() ? 0.2F : 0.0F;
      float var12 = var10 ? 0.6F : 0.0F;
      Vec3d var13 = var4.add(0.0, 1.62F - var11 - var12, 0.0);
      Vec3d var14 = var4.add(0.0, 1.4F - var11 - var12, 0.0);
      Vec3d var15 = var4.add(0.0, 0.9F - var11 - var12, 0.0);
      Vec3d var16 = var4.add(0.0, 0.6F - var11 - var12, 0.0);
      Helper183.method1563(var13, var14, var3, var5, false);
      Helper183.method1563(var14, var15, var3, var5, false);
      Helper183.method1563(var15, var16, var3, var5, false);
      float var17 = MathHelper.cos(var6 * 0.6662F) * var7 * 0.5F;
      float var18 = MathHelper.cos(var6 * 0.6662F + (float) Math.PI) * var7 * 0.5F;
      float var19 = MathHelper.cos(var6 * 0.6662F + (float) Math.PI) * var7 * 0.7F;
      float var20 = MathHelper.cos(var6 * 0.6662F) * var7 * 0.7F;
      Vec3d var21 = var14.add(Math.sin(var9) * 0.3, -0.1, Math.cos(var9) * 0.3);
      Vec3d var22 = var21.add(
         Math.sin(var9) * 0.05 + Math.sin(var9 + (Math.PI / 2)) * var17 * 0.15,
         -0.25 - Math.abs(var17) * 0.1,
         Math.cos(var9) * 0.05 + Math.cos(var9 + (Math.PI / 2)) * var17 * 0.15
      );
      Vec3d var23 = var22.add(Math.sin(var9 + (Math.PI / 2)) * var17 * 0.1, -0.25 - Math.abs(var17) * 0.05, Math.cos(var9 + (Math.PI / 2)) * var17 * 0.1);
      Helper183.method1563(var21, var22, var3, var5, false);
      Helper183.method1563(var22, var23, var3, var5, false);
      Vec3d var24 = var14.add(-Math.sin(var9) * 0.3, -0.1, -Math.cos(var9) * 0.3);
      Vec3d var25 = var24.add(
         -Math.sin(var9) * 0.05 + Math.sin(var9 + (Math.PI / 2)) * var18 * 0.15,
         -0.25 - Math.abs(var18) * 0.1,
         -Math.cos(var9) * 0.05 + Math.cos(var9 + (Math.PI / 2)) * var18 * 0.15
      );
      Vec3d var26 = var25.add(Math.sin(var9 + (Math.PI / 2)) * var18 * 0.1, -0.25 - Math.abs(var18) * 0.05, Math.cos(var9 + (Math.PI / 2)) * var18 * 0.1);
      Helper183.method1563(var24, var25, var3, var5, false);
      Helper183.method1563(var25, var26, var3, var5, false);
      Vec3d var27 = var16.add(Math.sin(var9) * 0.15, 0.0, Math.cos(var9) * 0.15);
      Vec3d var28 = var27.add(Math.sin(var9 + (Math.PI / 2)) * var19 * 0.1, -0.35 + Math.max(0.0F, var19) * 0.05, Math.cos(var9 + (Math.PI / 2)) * var19 * 0.1);
      Vec3d var29 = var28.add(
         Math.sin(var9 + (Math.PI / 2)) * var19 * 0.08, -0.35 - Math.max(0.0F, -var19) * 0.05, Math.cos(var9 + (Math.PI / 2)) * var19 * 0.08
      );
      Helper183.method1563(var27, var28, var3, var5, false);
      Helper183.method1563(var28, var29, var3, var5, false);
      Vec3d var30 = var16.add(-Math.sin(var9) * 0.15, 0.0, -Math.cos(var9) * 0.15);
      Vec3d var31 = var30.add(Math.sin(var9 + (Math.PI / 2)) * var20 * 0.1, -0.35 + Math.max(0.0F, var20) * 0.05, Math.cos(var9 + (Math.PI / 2)) * var20 * 0.1);
      Vec3d var32 = var31.add(
         Math.sin(var9 + (Math.PI / 2)) * var20 * 0.08, -0.35 - Math.max(0.0F, -var20) * 0.05, Math.cos(var9 + (Math.PI / 2)) * var20 * 0.08
      );
      Helper183.method1563(var30, var31, var3, var5, false);
      Helper183.method1563(var31, var32, var3, var5, false);
      Helper183.method1563(var21, var24, var3, var5, false);
      Helper183.method1563(var27, var30, var3, var5, false);
   }

   private void method2027(MatrixStack var1, PlayerEntity var2, Helper175 var3, Vector4d var4) {
      double var5 = var4.w;

      for (ItemStack var8 : var2.getHandItems()) {
         if (!var8.isEmpty()) {
            MutableText var9 = Text.empty().append(var8.getName());
            if (var8.getCount() > 1) {
               var9.append(Formatting.RESET + " [" + Formatting.RED + var8.getCount() + Formatting.GRAY + "x" + Formatting.RESET + "]");
            }

            var5 += var3.method1480(var9) / 2.0F + 3.0F;
            this.method2029(var1, var9, Helper148.method1258(var4), var5, var3);
         }
      }
   }

   private void method2028(DrawContext var1, ItemStack var2, List<ItemStack> var3, Vector4d var4) {
      MatrixStack var5 = var1.getMatrices();
      short var6 = 176;
      byte var7 = 67;
      int var8 = Helper133.method1133(Helper133.method1107(((BlockItem)var2.getItem()).getBlock().getDefaultMapColor().color, 1.0F), 1.0F);
      var5.push();
      var5.translate(Helper148.method1258(var4) - var6 / 4.0, var4.w + 2.0, -200.0 + Math.cos(var4.x));
      var5.scale(0.5F, 0.5F, 1.0F);
      var1.drawTexture(RenderLayer::getGuiTextured, this.TEXTURE, 0, 0, 0.0F, 0.0F, var6, var7, var6, var7, var8);
      byte var9 = 7;
      byte var10 = 6;

      for (ItemStack var12 : var3) {
         Helper178.method1502(var1, var12, var9, var10, false, true, 1.0F);
         var9 += 18;
         if (var9 >= 165) {
            var10 += 18;
            var9 = 7;
         }
      }

      var5.pop();
   }

   private void method2029(MatrixStack var1, Text var2, double var3, double var5, Helper175 var7) {
      byte var8 = 2;
      float var9 = 0.75F;
      float var10 = var7.method1492().getSize() / 1.5F;
      float var11 = var7.method1478(var2);
      float var12 = (float)(var3 - var11 / 2.0F);
      float var13 = (float)var5 - var10;
      int var14 = this.colorSetting.method2553();
      int var15 = var14 & 16777215 | 1509949440;
      int var16 = var14 | 0xFF000000;
      if (this.customColor.method2200()) {
         rectangle.method677(
            Helper80.method841(var1, var12 - var8, var13 - var9, var11 + var8 * 2, var10 + var9 * 2.0F)
               .method826(4.5F)
               .method835(1.2F)
               .method839(var16)
               .method823(var15)
               .method840()
         );
         var7.method1471(var1, var2, var12, var13 + 3.0F);
      } else {
         rectangle.method677(
            Helper80.method841(var1, var12 - var8, var13 - var9, var11 + var8 * 2, var10 + var9 * 2.0F)
               .method826(4.5F)
               .method835(1.2F)
               .method839(new Color(0, 0, 0, 255).getRGB())
               .method823(Helper133.method1157(1.0F))
               .method840()
         );
         var7.method1471(var1, var2, var12, var13 + 3.0F);
      }
   }

   private MutableText method2030(PlayerEntity var1, boolean var2) {
      float var3 = Helper38.method529(var1);
      MutableText var4 = Text.empty();
      if (var2) {
         var4.append("[" + Formatting.GREEN + "F" + Formatting.RESET + "] ");
      }

      if (AntiBot.method4604().method4615(var1)) {
         var4.append("[" + Formatting.DARK_RED + "BOT" + Formatting.RESET + "] ");
      }

      if (this.playerSetting.method2588("NameTags")) {
         var4.append(var1.getDisplayName());
      } else {
         var4.append(var1.getName());
      }

      if (var1.getOffHandStack().getItem().equals(Items.PLAYER_HEAD) || var1.getOffHandStack().getItem().equals(Items.TOTEM_OF_UNDYING)) {
         var4.append(Formatting.RESET + this.method2031(var1.getOffHandStack()));
      }

      if (var3 >= 0.0F && var3 <= var1.getMaxHealth()) {
         var4.append(Formatting.RESET + " [" + Formatting.RED + Helper38.method527(var1) + Formatting.RESET + "]");
      }

      return var4;
   }

   private String method2031(ItemStack var1) {
      NbtComponent var2 = var1.get(DataComponentTypes.CUSTOM_DATA);
      if (Helper128.method1052() && var2 != null) {
         NbtCompound var3 = var2.copyNbt();
         if (var3.getInt("tslevel") != 0) {
            return " [" + Formatting.GOLD + var3.getString("don-item").replace("sphere-", "").toUpperCase() + Formatting.RESET + "]";
         }
      }

      return "";
   }
}
