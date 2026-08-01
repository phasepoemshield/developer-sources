package l;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public class Helper188 implements Helper160 {
   public final ClientWorld world;
   public Vec3d pos;
   public Vec3d velocity;
   public final boolean collideEntities;
   public boolean inGround = false;

   public Helper188(ClientWorld var1, Vec3d var2, Vec3d var3) {
      this(var1, var2, var3, true);
   }

   public Helper188(ClientWorld var1, Vec3d var2, Vec3d var3, boolean var4) {
      this.world = var1;
      this.pos = var2;
      this.velocity = var3;
      this.collideEntities = var4;
   }

   public HitResult method1619() {
      if (this.inGround) {
         return null;
      } else {
         Vec3d var1 = this.pos.add(this.velocity);
         double var2 = this.method1621() ? 0.6 : 0.99;
         this.velocity = this.velocity.multiply(var2);
         this.velocity = new Vec3d(this.velocity.x, this.velocity.y - 0.05F, this.velocity.z);
         HitResult var4 = this.method1620(this.pos, var1);
         if (var4 != null) {
            this.pos = var4.getPos();
            this.inGround = true;
            return var4;
         } else {
            this.pos = var1;
            return null;
         }
      }
   }

   private HitResult method1620(Vec3d var1, Vec3d var2) {
      ClientWorld var3 = this.world;
      ArrowEntity var4 = new ArrowEntity(this.world, this.pos.x, this.pos.y, this.pos.z, new ItemStack(Items.ARROW), null);
      BlockHitResult var5 = var3.raycast(new RaycastContext(var1, var2, ShapeType.COLLIDER, FluidHandling.NONE, var4));
      if (this.collideEntities) {
         double var6 = 0.45;
         EntityHitResult var8 = ProjectileUtil.getEntityCollision(
            this.world,
            var4,
            var1,
            var2,
            new Box(-var6, -var6, -var6, var6, var6, var6).offset(var1).stretch(var2.subtract(var1)).expand(1.0),
            var1x -> !var1x.isSpectator() && var1x.isAlive() && (var1x.canHit() || var1x != mc.player && var1x == var4)
               ? !var4.isConnectedThroughVehicle(var1x)
               : false
         );
         if (var8 != null && var8.getType() != Type.MISS) {
            return var8;
         }
      }

      return var5 != null && var5.getType() != Type.MISS ? var5 : null;
   }

   private boolean method1621() {
      return false;
   }
}
