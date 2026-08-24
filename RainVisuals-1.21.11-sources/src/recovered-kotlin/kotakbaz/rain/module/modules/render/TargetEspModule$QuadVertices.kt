package kotakbaz.rain.module.modules.render

import java.awt.Color
import oxxxde.زّ

// $VF: Compiled from heavy
private data class `TargetEspModule$QuadVertices`(x1: Float,
   y1: Float,
   z1: Float,
   color1: Color,
   x2: Float,
   y2: Float,
   z2: Float,
   color2: Color,
   x3: Float,
   y3: Float,
   z3: Float,
   color3: Color,
   x4: Float,
   y4: Float,
   z4: Float,
   color4: Color
) {
   public final val color3: Color
   public final val x3: Float
   public final val x2: Float
   public final val y2: Float
   public final val z3: Float
   public final val color1: Color
   public final val color2: Color
   public final val y4: Float
   public final val x1: Float
   public final val x4: Float
   public final val z1: Float
   public final val y1: Float
   public final val z2: Float
   public final val color4: Color
   public final val z4: Float
   public final val y3: Float

   public operator fun component3(): Float {
      return this.z1
   }

   public operator fun component7(): Float {
      return this.z2
   }

   public override fun toString(): String {
      return "QuadVertices(x1=${this.x1}, y1=${this.y1}, z1=${this.z1}, color1=${this.color1}, x2=${this.x2}, y2=${this.y2}, z2=${this.z2}, color2=${this.color2}, x3=${this.x3}, y3=${this.y3}, z3=${this.z3}, color3=${this.color3}, x4=${this.x4}, y4=${this.y4}, z4=${this.z4}, color4=${this.color4})"
   }

   public operator fun component8(): Color {
      return this.color2
   }

   public override operator fun equals(other: Any?): Boolean {
      label112@
      if (this === other) {
         return true
      } else {
         return other is TargetEspModule$QuadVertices
            && java.lang.Float.compare(this.x1, (other as TargetEspModule$QuadVertices).x1) == 0
            && java.lang.Float.compare(this.y1, (other as TargetEspModule$QuadVertices).y1) == 0
            && java.lang.Float.compare(this.z1, (other as TargetEspModule$QuadVertices).z1) == 0
            && this.color1 == (other as TargetEspModule$QuadVertices).color1
            && java.lang.Float.compare(this.x2, (other as TargetEspModule$QuadVertices).x2) == 0
            && java.lang.Float.compare(this.y2, (other as TargetEspModule$QuadVertices).y2) == 0
            && java.lang.Float.compare(this.z2, (other as TargetEspModule$QuadVertices).z2) == 0
            && this.color2 == (other as TargetEspModule$QuadVertices).color2
            && java.lang.Float.compare(this.x3, (other as TargetEspModule$QuadVertices).x3) == 0
            && java.lang.Float.compare(this.y3, (other as TargetEspModule$QuadVertices).y3) == 0
            && java.lang.Float.compare(this.z3, (other as TargetEspModule$QuadVertices).z3) == 0
            && this.color3 == (other as TargetEspModule$QuadVertices).color3
            && java.lang.Float.compare(this.x4, (other as TargetEspModule$QuadVertices).x4) == 0
            && java.lang.Float.compare(this.y4, (other as TargetEspModule$QuadVertices).y4) == 0
            && java.lang.Float.compare(this.z4, (other as TargetEspModule$QuadVertices).z4) == 0
            && this.color4 == (other as TargetEspModule$QuadVertices).color4
         }
   }

   public operator fun component15(): Float {
      return this.z4
   }

   public operator fun component10(): Float {
      return this.y3
   }

   init {
      this.x1 = x1
      this.y1 = y1
      this.z1 = z1
      this.color1 = color1
      this.x2 = x2
      this.y2 = y2
      this.z2 = z2
      this.color2 = color2
      this.x3 = x3
      this.y3 = y3
      this.z3 = z3
      this.color3 = color3
      this.x4 = x4
      this.y4 = y4
      this.z4 = z4
      this.color4 = color4
   }

   public operator fun component5(): Float {
      return this.x2
   }

   public operator fun component13(): Float {
      return this.x4
   }

   public operator fun component4(): Color {
      return this.color1
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
                                                                                                                                    java.lang.Float.hashCode(
                                                                                                                                             this.x1
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + java.lang.Float.hashCode(
                                                                                                                                          this.y1
                                                                                                                                       )
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + java.lang.Float.hashCode(
                                                                                                                                 this.z1
                                                                                                                              )
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + this.color1.hashCode()
                                                                                                               )
                                                                                                               * 31
                                                                                                            + java.lang.Float.hashCode(this.x2)
                                                                                                      )
                                                                                                      * 31
                                                                                                   + java.lang.Float.hashCode(this.y2)
                                                                                             )
                                                                                             * 31
                                                                                          + java.lang.Float.hashCode(this.z2)
                                                                                    )
                                                                                    * 31
                                                                                 + this.color2.hashCode()
                                                                           )
                                                                           * 31
                                                                        + java.lang.Float.hashCode(this.x3)
                                                                  )
                                                                  * 31
                                                               + java.lang.Float.hashCode(this.y3)
                                                         )
                                                         * 31
                                                      + java.lang.Float.hashCode(this.z3)
                                                )
                                                * 31
                                             + this.color3.hashCode()
                                       )
                                       * 31
                                    + java.lang.Float.hashCode(this.x4)
                              )
                              * 31
                           + java.lang.Float.hashCode(this.y4)
                     )
                     * 31
                  + java.lang.Float.hashCode(this.z4)
            )
            * 31
         + this.color4.hashCode()
      }

   public operator fun component2(): Float {
      return this.y1
   }

   public operator fun component11(): Float {
      return this.z3
   }

   public operator fun component12(): Color {
      return this.color3
   }

   public operator fun component6(): Float {
      return this.y2
   }

   public operator fun component16(): Color {
      return this.color4
   }

   public fun copy(
      x1: Float = ...,
      y1: Float = ...,
      z1: Float = ...,
      color1: Color = ...,
      x2: Float = ...,
      y2: Float = ...,
      z2: Float = ...,
      color2: Color = ...,
      x3: Float = ...,
      y3: Float = ...,
      z3: Float = ...,
      color3: Color = ...,
      x4: Float = ...,
      y4: Float = ...,
      z4: Float = ...,
      color4: Color = ...
   ): زّ {
      return TargetEspModule$QuadVertices(x1, y1, z1, color1, x2, y2, z2, color2, x3, y3, z3, color3, x4, y4, z4, color4)
   }

   public operator fun component1(): Float {
      return this.x1
   }

   public operator fun component14(): Float {
      return this.y4
   }

   public operator fun component9(): Float {
      return this.x3
   }
}
