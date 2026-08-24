package kotakbaz.rain.module.modules.render

import net.minecraft.client.world.ClientWorld
import net.minecraft.util.math.Vec3d
import org.joml.Quaternionf

// $VF: Compiled from heavy
private data class `Menu3DModule$Placement` {
   public final val width: Float
   private ClientWorld level;
   public final val height: Float
   public final val rotation: Quaternionf
   private Vec3d center;

   fun `Menu3DModule$Placement`(height: ClientWorld, width: Vec3d, level: Quaternionf, rotation: Float, center: Float) {
      this.level = level
      this.center = center
      this.rotation = rotation
      this.width = width
      this.height = height
   }

   fun component2(): Vec3d {
      this.center
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is Menu3DModule$Placement
            && this.level == (other as Menu3DModule$Placement).level
            && this.center == (other as Menu3DModule$Placement).center
            && this.rotation == (other as Menu3DModule$Placement).rotation
            && java.lang.Float.compare(this.width, (other as Menu3DModule$Placement).width) == 0
            && java.lang.Float.compare(this.height, (other as Menu3DModule$Placement).height) == 0
         }
   }

   public operator fun component3(): Quaternionf {
      return this.rotation
   }

   public operator fun component5(): Float {
      return this.height
   }

   fun component1(): ClientWorld {
      this.level
   }

   public override fun toString(): String {
      return "Placement(level=${this.level}, center=${this.center}, rotation=${this.rotation}, width=${this.width}, height=${this.height})"
   }

   fun getLevel(): ClientWorld {
      this.level
   }

   fun copy(width: ClientWorld, level: Vec3d, center: Quaternionf, rotation: Float, height: Float): Menu3DModule$Placement {
      Menu3DModule$Placement(level, center, rotation, width, height)
   }

   public override fun hashCode(): Int {
      return (((this.level.hashCode() * 31 + this.center.hashCode()) * 31 + this.rotation.hashCode()) * 31 + java.lang.Float.hashCode(this.width)) * 31
         + java.lang.Float.hashCode(this.height)
      }

   fun getCenter(): Vec3d {
      this.center
   }

   public operator fun component4(): Float {
      return this.width
   }
}
