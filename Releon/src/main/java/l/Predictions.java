package l;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext.ShapeType;
import org.joml.Quaternionf;
import org.joml.Vector4i;

public class Predictions extends Helper242 {
   private Setting2 sizeSetting = new Setting2("Размер", "Размер луча").method2086(0.2F).method2078(0.01F, 1.0F);
   public Setting7 colorSetting = new Setting7("Цвет", "Выберите цвет").method2555(-39623).method2551(-9659651, -7569409, -23178, -33925);
   private final List<Helper240> points = new ArrayList<>();
   private final List<Integer> handledProjectiles = new ArrayList<>();

   public static Predictions method2289() {
      return Helper222.method1979(Predictions.class);
   }

   public Predictions() {
      super("Predictions", "Predictions", Helper269.RENDER);
      this.setup(new Helper264[]{this.sizeSetting, this.colorSetting});
   }

   @Helper104
   public void onDraw(Event20 var1) {
      DrawContext var2 = var1.method4058();
      if (mc.world != null) {
         long var3 = mc.world.getTime();
         this.points
            .removeIf(
               var3x -> {
                  Entity var4 = mc.world.getEntityById(var3x.entityId);
                  long var5 = var3 - var3x.creationTime;
                  int var7 = var3x.predictedTicks - (int)var5;
                  if (var4 != null && var7 > 0) {
                     Vec3d var8 = Helper148.method1251(var3x.pos);
                     if (!Helper148.method1255(var3x.pos)) {
                        return false;
                     } else {
                        Helper175 var9 = Helper103.method926(13);
                        double var10 = var7 * 50 / 1000.0;
                        String var12 = String.format("%.1f", var10) + " сек";
                        float var13 = var9.method1479(var12);
                        float var14 = (float)(var8.x + var13 / 2.0F - 6.0);
                        float var15 = (float)(var8.y + 4.0);
                        float var16 = 3.0F;
                        float var17 = 8.0F;
                        blur.method677(
                           Helper80.method841(var2.getMatrices(), var14 - var13 + var17 + var16, var15 - var16, var16 + var13 + var16, 10.0)
                              .method826(5.0F)
                              .method838(1313125.0F)
                              .method823(new Color(0, 0, 0, 255).getRGB())
                              .method840()
                        );
                        var9.method1474(var2.getMatrices(), var12, var14 - var13 + 8.0F + var16 * 2.0F, var15 + 0.5F, -1);
                        Helper178.method1502(var2, var3x.stack, var14 - var13 - var16 + 2.0F, var15 - var16, true, false, 0.5F);
                        return false;
                     }
                  } else {
                     return true;
                  }
               }
            );
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (mc.player != null && mc.world != null) {
         this.handledProjectiles.removeIf(var0 -> mc.world.getEntityById(var0) == null);
         this.method2290(var1.method3708(), mc.player.getHandItems(), Helper351.INSTANCE.method3483());
         this.method2292().forEach(var2 -> {
            Vec3d var3 = var2.getVelocity();
            Vec3d var4 = Helper147.method1247(var2);

            for (int var6 = 0; var6 < 300; var6++) {
               Vec3d var5 = var4;
               var4 = var4.add(var3);
               var3 = this.method2297(var2, var5, var3);
               BlockHitResult var7 = Helper324.method3226(var5, var4, ShapeType.COLLIDER, var2);
               if (var7.getType() != Type.MISS) {
                  var4 = var7.getPos();
               }

               this.method2301(var5, var4, var6);
               if (var7.getType() != Type.MISS || var4.y < -128.0) {
                  BlockHitResult var8 = var7;
                  if (var7.getType() == Type.MISS) {
                     var8 = new BlockHitResult(var4, Direction.UP, BlockPos.ofFloored(var4), false);
                  }

                  this.method2291(var1.method3708(), Collections.singletonList(var8));
                  int var10 = var2.getId();
                  if (!this.handledProjectiles.contains(var10)) {
                     this.handledProjectiles.add(var10);
                     this.method2298(var2, var4, var6);
                  }
                  break;
               }
            }
         });
      }
   }

   public void method2290(MatrixStack var1, Iterable<ItemStack> var2, Helper336 var3) {
      Item var4 = mc.player.getActiveItem().getItem();
      Iterator var5 = var2.iterator();
      if (var5.hasNext()) {
         label65: {
            ItemStack var6 = (ItemStack)var5.next();
            Object var8 = Objects.requireNonNull(var6.getItem());
         }
      }
   }

   public void method2291(MatrixStack var1, List<HitResult> var2) {
      for (HitResult var4 : var2) {
         Direction var5 = this.method2299(var4);
         int var6 = var4.getType().equals(Type.ENTITY) ? Color.RED.getRGB() : Helper133.method1162();
         double var7 = 0.3;

         Quaternionf var9 = switch (var5) {
            case WEST, EAST -> RotationAxis.POSITIVE_Z.rotationDegrees(90.0F);
            case SOUTH, NORTH -> RotationAxis.POSITIVE_X.rotationDegrees(90.0F);
            default -> new Quaternionf();
         };
         var1.push();
         var1.translate(var4.getPos().x, var4.getPos().y, var4.getPos().z);
         var1.multiply(var9);
         Entry var10 = var1.peek().copy();
         int var11 = 0;

         for (byte var12 = 90; var11 <= var12; var11++) {
            Helper183.method1564(var10, Helper147.method1242(var11, var12, var7), Helper147.method1242(var11 + 1, var12, var7), var6, var6, 1.0F, false);
         }

         Helper183.method1564(var10, new Vec3d(0.0, 0.0, -var7), new Vec3d(0.0, 0.0, var7), var6, var6, 1.0F, false);
         Helper183.method1564(var10, new Vec3d(-var7, 0.0, 0.0), new Vec3d(var7, 0.0, 0.0), var6, var6, 1.0F, false);
         var1.pop();
      }
   }

   public List<Entity> method2292() {
      return Helper38.method536()
         .filter(
            var1 -> (var1 instanceof PersistentProjectileEntity || var1 instanceof ThrownItemEntity || var1 instanceof ItemEntity) && !this.method2300(var1)
         )
         .toList();
   }

   public List<HitResult> method2293(ProjectileEntity var1, double var2, Helper336 var4) {
      return new ArrayList<>(Collections.singleton(this.method2294(var4.method3329(), var1, var2)));
   }

   public HitResult method2294(Vec3d var1, ProjectileEntity var2, double var3) {
      float var5 = MathHelper.sqrt(var1.toVector3f().lengthSquared());
      Objects.requireNonNull(var2);

      Vec3d var6 = switch (var2) {
         case ArrowEntity var9 when var9.getItemStack().getItem().equals(Items.CROSSBOW) -> Vec3d.ZERO;
         default -> mc.player.getVelocity();
      };
      return this.method2296(
         mc.player.getEyePos().add(Helper147.method1247(mc.player).subtract(mc.player.getPos())),
         var1.multiply(var3 / var5).add(var6),
         (ProjectileEntity)var2
      );
   }

   public HitResult method2295(ProjectileEntity var1) {
      return this.method2296(var1.getPos(), var1.getVelocity(), var1);
   }

   public HitResult method2296(Vec3d var1, Vec3d var2, ProjectileEntity var3) {
      for (int var5 = 0; var5 < 300; var5++) {
         Vec3d var4 = var1;
         var1 = var1.add(var2);
         var2 = this.method2297(var3, var4, var2);
         BlockHitResult var6 = Helper324.method3226(var4, var1, ShapeType.COLLIDER, var3);
         if (!var6.getType().equals(Type.MISS)) {
            return var6;
         }

         Vec3d var10 = var1;
         if (Helper38.method536()
            .filter(var1x -> var1x instanceof LivingEntity var2x && var2x != var3.getOwner() && var2x.isAlive())
            .anyMatch(var2x -> var2x.getBoundingBox().expand(0.3).intersects(var4, var10))) {
            return new Helper253(this, var1);
         }

         if (var1.y < -128.0) {
            break;
         }
      }

      return null;
   }

   public Vec3d method2297(Entity var1, Vec3d var2, Vec3d var3) {
      boolean var4 = mc.world.getFluidState(BlockPos.ofFloored(var2)).isIn(FluidTags.WATER);
      Objects.requireNonNull(var1);

      double var5 = switch (var1) {
         case TridentEntity var9 -> 0.99;
         case PersistentProjectileEntity var10 when var4 -> 0.6;
         default -> var4 ? 0.8 : 0.99;
      };
      return var3.multiply(var5).add(0.0, -var1.getFinalGravity(), 0.0);
   }

   private void method2298(Entity var1, Vec3d var2, int var3) {
      ItemStack var4 = switch (var1) {
         case ItemEntity var7 -> var7.getStack();
         case ThrownItemEntity var8 -> var8.getStack();
         case PersistentProjectileEntity var9 -> var9.getItemStack();
         default -> ItemStack.EMPTY;
      };
      this.points.add(new Helper240(var4, var2, var3, var1.getId()));
   }

   private Direction method2299(HitResult var1) {
      return var1 instanceof BlockHitResult var2 ? var2.getSide() : Direction.getFacing(var1.getPos().subtract(mc.player.getEyePos()).normalize());
   }

   private boolean method2300(Entity var1) {
      boolean var2 = var1.getX() == var1.prevX && var1.getY() == var1.prevY && var1.getZ() == var1.prevZ;
      boolean var3 = var1 instanceof ItemEntity && (var1.isOnGround() || Helper38.method540(var1.getBoundingBox().expand(2.0), Blocks.WATER));
      return var2 || var3;
   }

   private void method2301(Vec3d var1, Vec3d var2, int var3) {
      double var4 = var1.distanceTo(var2);
      int var6 = Math.max(5, Math.min(20, (int)(var4 * 20.0)));
      float var7 = this.sizeSetting.method2082() + (float)(var4 * this.sizeSetting.method2082());
      float var8 = MathHelper.clamp(1.0F - var3 / 50.0F, 0.1F, 1.0F);
      int var9 = Helper133.method1108(this.colorSetting.method2553(), (int)(var8 * 255.0F));

      for (int var10 = 0; var10 < var6; var10++) {
         float var11 = (var10 + 0.5F) / var6;
         Vec3d var12 = var1.lerp(var2, var11);
         Camera var13 = mc.getEntityRenderDispatcher().camera;
         Vec3d var14 = var13.getPos();
         Vec3d var15 = var12.subtract(var14);
         MatrixStack var16 = new MatrixStack();
         var16.push();
         var16.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var13.getPitch()));
         var16.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var13.getYaw() + 180.0F));
         var16.translate(var15.x, var15.y, var15.z);
         var16.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var13.getYaw()));
         var16.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var13.getPitch()));
         Entry var17 = var16.peek();

         for (int var18 = 0; var18 < 2; var18++) {
            float var19 = var7 * (1.0F + var18 * 0.8F);
            float var20 = var8 * (1.0F - var18 * 0.3F);
            int var21 = Helper133.method1120(var9, (int)(var20 * 255.0F));
            Vector4i var22 = new Vector4i(var21, var21, var21, var21);
            Helper183.method1568(var17, Helper183.bloom, -var19 / 2.0F, -var19 / 2.0F, var19, var19, var22, false);
         }

         var16.pop();
      }
   }
}
