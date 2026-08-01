package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import lombok.Generated;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.EntityPose;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public final class O000000O0O000 implements MinecraftAccessor {
   public static double O00000000(double d, double e, double f) {
      return Math.min(f, Math.max(d, e));
   }

   public static int O00000000(int i, int j, float f) {
      return i + (int)(f * (j - i));
   }

   public static double O000000000(double d, double e, double f) {
      return d + f * (e - d);
   }

   public static HitResult O00000000(Vec3d vec3d, Vec3d vec3d2, ShapeType shapeType, FluidHandling fluidHandling) {
      return a_.world.raycast(new RaycastContext(vec3d, vec3d2, shapeType, fluidHandling, a_.player));
   }

   private static double O00000000(ClientPlayerEntity clientPlayerEntity, double d, double e) {
      double var5 = clientPlayerEntity.getX() - d;
      double var7 = clientPlayerEntity.getZ() - e;
      return MathHelper.sqrt((float)(var5 * var5 + var7 * var7));
   }

   private static boolean O00000000(ClientPlayerEntity clientPlayerEntity, double d, double e, double f) {
      Vec3d var7 = new Vec3d(d, e, f);
      return a_.world != null && O00000000(clientPlayerEntity.getEyePos(), var7, ShapeType.COLLIDER, FluidHandling.NONE).getType() != Type.BLOCK;
   }

   private static boolean O00000000(ClientPlayerEntity clientPlayerEntity, Vec3d vec3d) {
      Vec3d var2 = new Vec3d(clientPlayerEntity.getX(), clientPlayerEntity.getEyeY(), clientPlayerEntity.getZ());
      return a_.world != null && O00000000(var2, vec3d, ShapeType.COLLIDER, FluidHandling.NONE).getType() != Type.BLOCK;
   }

   private static boolean O00000000(ClientPlayerEntity clientPlayerEntity, Vec3d vec3d, float f) {
      return f == 0.0F
         ? O00000000(clientPlayerEntity, vec3d.x, vec3d.y, vec3d.z)
         : O00000000(clientPlayerEntity, vec3d.x, vec3d.y, vec3d.z)
            && O00000000(clientPlayerEntity, vec3d.x, vec3d.y + f, vec3d.z)
            && O00000000(clientPlayerEntity, vec3d.x, vec3d.y - f, vec3d.z)
            && O00000000(clientPlayerEntity, vec3d.x + f, vec3d.y, vec3d.z)
            && O00000000(clientPlayerEntity, vec3d.x - f, vec3d.y, vec3d.z)
            && O00000000(clientPlayerEntity, vec3d.x, vec3d.y, vec3d.z + f)
            && O00000000(clientPlayerEntity, vec3d.x, vec3d.y, vec3d.z - f);
   }

   public static List<Vec3d> O00000000(Box box) {
      ArrayList var1 = new ArrayList();
      double var2 = 0.01F;
      byte var4 = 17;
      byte var5 = 5;
      byte var6 = 24;
      byte var7 = 6;
      box = box.offset(-var2, -var2, -var2);
      double[] var8 = new double[]{box.maxX - box.minX, box.maxY - box.minY, (box.maxY - box.minY) / 1.05};
      double[] var9 = new double[]{box.minX + var8[0] / 2.0, box.minY, box.minZ + var8[0] / 2.0};
      double[] var10 = new double[]{box.minX, box.minY, box.minZ};
      double[] var11 = new double[]{box.maxX, box.maxY, box.maxZ};
      float var12 = (float)Math.sqrt(var8[0] * var8[0] + var8[0] * var8[0] + var8[0] * var8[0]) / 2.0F;
      ClientPlayerEntity var13 = a_.player;
      if (var13 == null) {
         return null;
      } else {
         float var14 = (float)(
            (1.0 - Math.min(var13.getPos().distanceTo(new Vec3d(var9[0], var9[1], var9[2])) / 5.0, 1.0))
               * Math.min(var13.getPos().distanceTo(new Vec3d(var9[0], var13.getY(), var9[2])) / 0.6F, 1.0)
         );
         int var15 = O00000000(var5, var4, var14);
         int var16 = O00000000(var7, var6, var14);
         float var17 = 0.0F;
         int[] var18 = IntStream.range(0, var15).toArray();
         int var19 = var18.length;

         for (int var20 = 0; var20 < var19; var20++) {
            Integer var21 = var18[var20];
            boolean var22 = var21 == 0 || var21 == var15 - 1;
            double var23 = O000000000(var10[0], var11[0], (float)var21.intValue() / (var15 - 1));
            int[] var25 = IntStream.range(0, var15).toArray();
            int var26 = var25.length;

            for (int var27 = 0; var27 < var26; var27++) {
               Integer var28 = var25[var27];
               boolean var29 = var28 == 0 || var28 == var15 - 1;
               double var30 = O000000000(var10[2], var11[2], (float)var28.intValue() / (var15 - 1));
               int[] var32 = IntStream.range(0, var16).toArray();
               int var33 = var32.length;

               for (int var34 = 0; var34 < var33; var34++) {
                  Integer var35 = var32[var34];
                  boolean var36 = var35 == 0 || var35 == var16 - 1;
                  double var37 = O000000000(var10[1], var11[1], (float)var35.intValue() / (var16 - 1));
                  Vec3d var39 = new Vec3d(var23, var37, var30);
                  if ((var22 || var29 || var36)
                     && !(var13.getPos().distanceTo(var39.add(0.0, -var13.getEyeHeight(EntityPose.STANDING), 0.0)) < var12)
                     && O00000000(var13, var39, var17)
                     && !var1.add(var39)) {
                     break;
                  }
               }
            }
         }

         return var1;
      }
   }

   private static double O00000000(Vec3d vec3d, Vec3d vec3d2) {
      double var2;
      double var4;
      double var6;
      return Math.sqrt((var2 = vec3d.x - vec3d2.x) * var2 + (var4 = vec3d.y - vec3d2.y) * var4 + (var6 = vec3d.z - vec3d2.z) * var6);
   }

   public static Vec3d O000000000(Box box) {
      return O00000000(box, true);
   }

   public static Vec3d O00000000(Box box, boolean bl) {
      if (box == null) {
         return a_.player.getEyePos();
      } else {
         double[] var2 = new double[]{box.maxX - box.minX, box.maxY - box.minY, (box.maxY - box.minY) / 1.1F};
         double[] var3 = new double[]{box.minX + var2[0] / 2.0, box.minY, box.minZ + var2[0] / 2.0};
         double[] var4 = new double[]{a_.player.getY() - var3[1], O00000000(a_.player, var3[0], var3[2])};
         double var5 = O00000000(O0000O00O0OO0O.O0000000000O0O.ease((var4[1] - var2[0] / 2.0) / (5.0 + var2[0] / 2.0)), 0.1, 0.95);
         double var7 = O00000000(var5 * var5, 0.0, 1.0);
         double var9 = O00000000(var2[2] / 2.0 * var7 + var2[2] / 2.0 * O00000000(var4[0] + var7, 0.0, 1.0), 0.0, var2[2]);
         Vec3d var11 = new Vec3d(var3[0], var3[1] + var9, var3[2]);
         if (!bl && !O00000000(a_.player, var11)) {
            var11 = var11.add(0.0, -var9 / 2.0, 0.0);
         }

         if (!(var2[1] <= 1.0) && (bl || !O00000000(a_.player, var11))) {
            List var12 = O00000000(box);
            float var13 = 1.0F - (float)Math.max(Math.min((var4[1] - 2.0) / 3.0, 1.0), 0.0);
            Vec3d var14 = new Vec3d(a_.player.getX(), a_.player.getY() + 0.6F + O000000000(var9, var9 / 2.5, var13), a_.player.getZ());
            if (var12 != null && var12.size() > 1) {
               var12.sort(Comparator.comparing(vec3d2 -> O00000000(var14, (Vec3d)vec3d2)));
            }

            return var12 != null && !var12.isEmpty() ? (Vec3d)var12.get(0) : var11;
         } else {
            return var11;
         }
      }
   }

   @Generated
   private O000000O0O000() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
