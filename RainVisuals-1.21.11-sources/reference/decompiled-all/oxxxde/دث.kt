package oxxxde

import net.minecraft.util.math.Vec3d
import org.joml.Quaternionf

// $VF: Compiled from heavy
private data class دث {
   public final val rotX: Float
   public final val rotY: Float
   public final val rotZDir: Float
   public final val createdAt: Long
   private Vec3d position;
   public final val spawnRotation: Quaternionf

   public operator fun component6(): Float {
      return this.rotZDir
   }

   public operator fun component3(): Quaternionf {
      return this.spawnRotation
   }

   public operator fun component1(): Long {
      return this.createdAt
   }

   public operator fun component4(): Float {
      return this.rotX
   }

   public override fun toString(): String {
      return "Particle(createdAt=${this.createdAt}, position=${this.position}, spawnRotation=${this.spawnRotation}, rotX=${this.rotX}, rotY=${this.rotY}, rotZDir=${this.rotZDir})"
   }

   public override fun hashCode(): Int {
      return (
               (
                        ((java.lang.Long.hashCode(this.createdAt) * 31 + this.position.hashCode()) * 31 + this.spawnRotation.hashCode()) * 31
                           + java.lang.Float.hashCode(this.rotX)
                     )
                     * 31
                  + java.lang.Float.hashCode(this.rotY)
            )
            * 31
         + java.lang.Float.hashCode(this.rotZDir)
      }

   public override operator fun equals(other: Any?): Boolean {
      label52@
      if (this === other) {
         return true
      } else {
         return other is دث
            && this.createdAt == (other as دث).createdAt
            && this.position == (other as دث).position
            && this.spawnRotation == (other as دث).spawnRotation
            && java.lang.Float.compare(this.rotX, (other as دث).rotX) == 0
            && java.lang.Float.compare(this.rotY, (other as دث).rotY) == 0
            && java.lang.Float.compare(this.rotZDir, (other as دث).rotZDir) == 0
         }
   }

   fun getPosition(): Vec3d {
      this.position
   }

   public operator fun component5(): Float {
      return this.rotY
   }

   fun component2(): Vec3d {
      this.position
   }

   fun دث(rotZDir: Long, spawnRotation: Vec3d, rotX: Quaternionf, createdAt: Float, position: Float, rotY: Float) {
      this.createdAt = createdAt
      this.position = position
      this.spawnRotation = spawnRotation
      this.rotX = rotX
      this.rotY = rotY
      this.rotZDir = rotZDir
   }

   fun copy(position: Long, rotX: Vec3d, rotY: Quaternionf, spawnRotation: Float, createdAt: Float, rotZDir: Float): دث {
      دث(createdAt, position, spawnRotation, rotX, rotY, rotZDir)
   }
}
