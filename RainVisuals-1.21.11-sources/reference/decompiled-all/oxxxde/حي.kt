package oxxxde

// $VF: Compiled from heavy
private data class حي {
   public final var positionX: Double
   public final var rotation: Float
   public final val fullStepDrag: Double
   public final val gravity: Double
   public final val drag: Double
   public final val fadeStart: Double
   public final val spawnedAtNanos: Long
   public final var velocityX: Double
   public final var grounded: Boolean
   public final var currentSize: Float
   public final var angularVelocity: Float
   public final var positionY: Double
   public final val lifeTimeNanos: Long
   public final val physics: طص
   public final var velocityZ: Double
   public final val shrinkAmount: Double
   public final var bounceCount: Int
   public final var velocityY: Double
   public final var positionZ: Double
   public final val restitution: Double
   public final val textureIndex: Int
   public final var lastUpdatedAtNanos: Long
   public final val initialSize: Float
   public final var alpha: Float
   public final var impactPulse: Float

   public operator fun component20(): Float {
      return this.currentSize
   }

   public operator fun component7(): Double {
      return this.drag
   }

   public operator fun component13(): Double {
      return this.positionX
   }

   public operator fun component14(): Double {
      return this.positionY
   }

   public operator fun component2(): Long {
      return this.spawnedAtNanos
   }

   public override operator fun equals(other: Any?): Boolean {
      label166@
      if (this === other) {
         return true
      } else {
         return other is حي
            && this.physics === (other as حي).physics
            && this.spawnedAtNanos == (other as حي).spawnedAtNanos
            && this.lastUpdatedAtNanos == (other as حي).lastUpdatedAtNanos
            && this.lifeTimeNanos == (other as حي).lifeTimeNanos
            && java.lang.Float.compare(this.initialSize, (other as حي).initialSize) == 0
            && this.textureIndex == (other as حي).textureIndex
            && java.lang.Double.compare(this.drag, (other as حي).drag) == 0
            && java.lang.Double.compare(this.gravity, (other as حي).gravity) == 0
            && java.lang.Float.compare(this.angularVelocity, (other as حي).angularVelocity) == 0
            && java.lang.Double.compare(this.fadeStart, (other as حي).fadeStart) == 0
            && java.lang.Double.compare(this.shrinkAmount, (other as حي).shrinkAmount) == 0
            && java.lang.Double.compare(this.restitution, (other as حي).restitution) == 0
            && java.lang.Double.compare(this.positionX, (other as حي).positionX) == 0
            && java.lang.Double.compare(this.positionY, (other as حي).positionY) == 0
            && java.lang.Double.compare(this.positionZ, (other as حي).positionZ) == 0
            && java.lang.Double.compare(this.velocityX, (other as حي).velocityX) == 0
            && java.lang.Double.compare(this.velocityY, (other as حي).velocityY) == 0
            && java.lang.Double.compare(this.velocityZ, (other as حي).velocityZ) == 0
            && java.lang.Double.compare(this.fullStepDrag, (other as حي).fullStepDrag) == 0
            && java.lang.Float.compare(this.currentSize, (other as حي).currentSize) == 0
            && java.lang.Float.compare(this.rotation, (other as حي).rotation) == 0
            && java.lang.Float.compare(this.alpha, (other as حي).alpha) == 0
            && java.lang.Float.compare(this.impactPulse, (other as حي).impactPulse) == 0
            && this.bounceCount == (other as حي).bounceCount
            && this.grounded == (other as حي).grounded
         }
   }

   public operator fun component3(): Long {
      return this.lastUpdatedAtNanos
   }

   public operator fun component17(): Double {
      return this.velocityY
   }

   public operator fun component18(): Double {
      return this.velocityZ
   }

   fun حي(
      lastUpdatedAtNanos: طص,
      alpha: Long,
      velocityY: Long,
      grounded: Long,
      restitution: Float,
      velocityZ: Int,
      initialSize: Double,
      spawnedAtNanos: Double,
      gravity: Float,
      impactPulse: Double,
      velocityX: Double,
      fadeStart: Double,
      physics: Double,
      angularVelocity: Double,
      shrinkAmount: Double,
      textureIndex: Double,
      rotation: Double,
      currentSize: Double,
      positionZ: Double,
      positionX: Float,
      lifeTimeNanos: Float,
      bounceCount: Float,
      drag: Float,
      positionY: Int,
      fullStepDrag: Boolean
   ) {
      this.physics = physics
      this.spawnedAtNanos = spawnedAtNanos
      this.lastUpdatedAtNanos = lastUpdatedAtNanos
      this.lifeTimeNanos = lifeTimeNanos
      this.initialSize = initialSize
      this.textureIndex = textureIndex
      this.drag = drag
      this.gravity = gravity
      this.angularVelocity = angularVelocity
      this.fadeStart = fadeStart
      this.shrinkAmount = shrinkAmount
      this.restitution = restitution
      this.positionX = positionX
      this.positionY = positionY
      this.positionZ = positionZ
      this.velocityX = velocityX
      this.velocityY = velocityY
      this.velocityZ = velocityZ
      this.fullStepDrag = fullStepDrag
      this.currentSize = currentSize
      this.rotation = rotation
      this.alpha = alpha
      this.impactPulse = impactPulse
      this.bounceCount = bounceCount
      this.grounded = grounded
   }

   public operator fun component24(): Int {
      return this.bounceCount
   }

   public operator fun component6(): Int {
      return this.textureIndex
   }

   public operator fun component23(): Float {
      return this.impactPulse
   }

   public operator fun component22(): Float {
      return this.alpha
   }

   public operator fun component19(): Double {
      return this.fullStepDrag
   }

   public operator fun component12(): Double {
      return this.restitution
   }

   public override fun toString(): String {
      return "BurstParticle(physics=${this.physics}, spawnedAtNanos=${this.spawnedAtNanos}, lastUpdatedAtNanos=${this.lastUpdatedAtNanos}, lifeTimeNanos=${this.lifeTimeNanos}, initialSize=${this.initialSize}, textureIndex=${this.textureIndex}, drag=${this.drag}, gravity=${this.gravity}, angularVelocity=${this.angularVelocity}, fadeStart=${this.fadeStart}, shrinkAmount=${this.shrinkAmount}, restitution=${this.restitution}, positionX=${this.positionX}, positionY=${this.positionY}, positionZ=${this.positionZ}, velocityX=${this.velocityX}, velocityY=${this.velocityY}, velocityZ=${this.velocityZ}, fullStepDrag=${this.fullStepDrag}, currentSize=${this.currentSize}, rotation=${this.rotation}, alpha=${this.alpha}, impactPulse=${this.impactPulse}, bounceCount=${this.bounceCount}, grounded=${this.grounded})"
   }

   public operator fun component5(): Float {
      return this.initialSize
   }

   public operator fun component16(): Double {
      return this.velocityX
   }

   public operator fun component9(): Float {
      return this.angularVelocity
   }

   public operator fun component1(): طص {
      return this.physics
   }

   public operator fun component15(): Double {
      return this.positionZ
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           (
                                                                                                                                    (
                                                                                                                                             (
                                                                                                                                                      (
                                                                                                                                                               (
                                                                                                                                                                        (
                                                                                                                                                                                 (
                                                                                                                                                                                          (
                                                                                                                                                                                                   (
                                                                                                                                                                                                            (
                                                                                                                                                                                                                     this.physics
                                                                                                                                                                                                                              .hashCode()
                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                        + java.lang.Long.hashCode(
                                                                                                                                                                                                                           this.spawnedAtNanos
                                                                                                                                                                                                                        )
                                                                                                                                                                                                                  )
                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                               + java.lang.Long.hashCode(
                                                                                                                                                                                                                  this.lastUpdatedAtNanos
                                                                                                                                                                                                               )
                                                                                                                                                                                                         )
                                                                                                                                                                                                         * 31
                                                                                                                                                                                                      + java.lang.Long.hashCode(
                                                                                                                                                                                                         this.lifeTimeNanos
                                                                                                                                                                                                      )
                                                                                                                                                                                                )
                                                                                                                                                                                                * 31
                                                                                                                                                                                             + java.lang.Float.hashCode(
                                                                                                                                                                                                this.initialSize
                                                                                                                                                                                             )
                                                                                                                                                                                       )
                                                                                                                                                                                       * 31
                                                                                                                                                                                    + Integer.hashCode(
                                                                                                                                                                                       this.textureIndex
                                                                                                                                                                                    )
                                                                                                                                                                              )
                                                                                                                                                                              * 31
                                                                                                                                                                           + java.lang.Double.hashCode(
                                                                                                                                                                              this.drag
                                                                                                                                                                           )
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + java.lang.Double.hashCode(
                                                                                                                                                                     this.gravity
                                                                                                                                                                  )
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + java.lang.Float.hashCode(
                                                                                                                                                            this.angularVelocity
                                                                                                                                                         )
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + java.lang.Double.hashCode(
                                                                                                                                                   this.fadeStart
                                                                                                                                                )
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + java.lang.Double.hashCode(
                                                                                                                                          this.shrinkAmount
                                                                                                                                       )
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + java.lang.Double.hashCode(
                                                                                                                                 this.restitution
                                                                                                                              )
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + java.lang.Double.hashCode(this.positionX)
                                                                                                               )
                                                                                                               * 31
                                                                                                            + java.lang.Double.hashCode(this.positionY)
                                                                                                      )
                                                                                                      * 31
                                                                                                   + java.lang.Double.hashCode(this.positionZ)
                                                                                             )
                                                                                             * 31
                                                                                          + java.lang.Double.hashCode(this.velocityX)
                                                                                    )
                                                                                    * 31
                                                                                 + java.lang.Double.hashCode(this.velocityY)
                                                                           )
                                                                           * 31
                                                                        + java.lang.Double.hashCode(this.velocityZ)
                                                                  )
                                                                  * 31
                                                               + java.lang.Double.hashCode(this.fullStepDrag)
                                                         )
                                                         * 31
                                                      + java.lang.Float.hashCode(this.currentSize)
                                                )
                                                * 31
                                             + java.lang.Float.hashCode(this.rotation)
                                       )
                                       * 31
                                    + java.lang.Float.hashCode(this.alpha)
                              )
                              * 31
                           + java.lang.Float.hashCode(this.impactPulse)
                     )
                     * 31
                  + Integer.hashCode(this.bounceCount)
            )
            * 31
         + java.lang.Boolean.hashCode(this.grounded)
      }

   public operator fun component8(): Double {
      return this.gravity
   }

   public fun copy(
      physics: طص = this.physics,
      spawnedAtNanos: Long = this.spawnedAtNanos,
      lastUpdatedAtNanos: Long = this.lastUpdatedAtNanos,
      lifeTimeNanos: Long = this.lifeTimeNanos,
      initialSize: Float = this.initialSize,
      textureIndex: Int = this.textureIndex,
      drag: Double = this.drag,
      gravity: Double = this.gravity,
      angularVelocity: Float = this.angularVelocity,
      fadeStart: Double = this.fadeStart,
      shrinkAmount: Double = this.shrinkAmount,
      restitution: Double = this.restitution,
      positionX: Double = this.positionX,
      positionY: Double = this.positionY,
      positionZ: Double = this.positionZ,
      velocityX: Double = this.velocityX,
      velocityY: Double = this.velocityY,
      velocityZ: Double = this.velocityZ,
      fullStepDrag: Double = this.fullStepDrag,
      currentSize: Float = this.currentSize,
      rotation: Float = this.rotation,
      alpha: Float = this.alpha,
      impactPulse: Float = this.impactPulse,
      bounceCount: Int = this.bounceCount,
      grounded: Boolean = this.grounded
   ): حي {
      return حي(
         physics,
         spawnedAtNanos,
         lastUpdatedAtNanos,
         lifeTimeNanos,
         initialSize,
         textureIndex,
         drag,
         gravity,
         angularVelocity,
         fadeStart,
         shrinkAmount,
         restitution,
         positionX,
         positionY,
         positionZ,
         velocityX,
         velocityY,
         velocityZ,
         fullStepDrag,
         currentSize,
         rotation,
         alpha,
         impactPulse,
         bounceCount,
         grounded
      )
   }

   public operator fun component11(): Double {
      return this.shrinkAmount
   }

   public operator fun component21(): Float {
      return this.rotation
   }

   public operator fun component4(): Long {
      return this.lifeTimeNanos
   }

   public operator fun component10(): Double {
      return this.fadeStart
   }

   public operator fun component25(): Boolean {
      return this.grounded
   }

   fun getPhysics(): طص {
      this.physics
   }
}
