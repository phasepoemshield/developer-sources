package oxxxde

import java.util.Arrays

// $VF: Compiled from heavy
private data class شر(bindProgress: Float,
   contentVisibility: Float,
   effectiveOpenProgress: Float,
   settingsHeight: Float,
   moduleHeight: Float,
   settingVisibility: FloatArray,
   settingHeights: FloatArray
) {
   public final val moduleHeight: Float
   public final val bindProgress: Float
   public final val settingHeights: FloatArray
   public final val effectiveOpenProgress: Float
   public final val contentVisibility: Float
   public final val settingsHeight: Float
   public final val settingVisibility: FloatArray

   public operator fun component5(): Float {
      return this.moduleHeight
   }

   public override fun toString(): String {
      return "LayoutSnapshot(bindProgress=${this.bindProgress}, contentVisibility=${this.contentVisibility}, effectiveOpenProgress=${this.effectiveOpenProgress}, settingsHeight=${this.settingsHeight}, moduleHeight=${this.moduleHeight}, settingVisibility=${Arrays.toString(
         this.settingVisibility
      )}, settingHeights=${Arrays.toString(this.settingHeights)})"
   }

   public operator fun component4(): Float {
      return this.settingsHeight
   }

   public fun copy(
      bindProgress: Float = this.bindProgress,
      contentVisibility: Float = this.contentVisibility,
      effectiveOpenProgress: Float = this.effectiveOpenProgress,
      settingsHeight: Float = this.settingsHeight,
      moduleHeight: Float = this.moduleHeight,
      settingVisibility: FloatArray = this.settingVisibility,
      settingHeights: FloatArray = this.settingHeights
   ): شر {
      return شر(bindProgress, contentVisibility, effectiveOpenProgress, settingsHeight, moduleHeight, settingVisibility, settingHeights)
   }

   public operator fun component7(): FloatArray {
      return this.settingHeights
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (java.lang.Float.hashCode(this.bindProgress) * 31 + java.lang.Float.hashCode(this.contentVisibility)) * 31
                                             + java.lang.Float.hashCode(this.effectiveOpenProgress)
                                       )
                                       * 31
                                    + java.lang.Float.hashCode(this.settingsHeight)
                              )
                              * 31
                           + java.lang.Float.hashCode(this.moduleHeight)
                     )
                     * 31
                  + Arrays.hashCode(this.settingVisibility)
            )
            * 31
         + Arrays.hashCode(this.settingHeights)
      }

   init {
      this.bindProgress = bindProgress
      this.contentVisibility = contentVisibility
      this.effectiveOpenProgress = effectiveOpenProgress
      this.settingsHeight = settingsHeight
      this.moduleHeight = moduleHeight
      this.settingVisibility = settingVisibility
      this.settingHeights = settingHeights
   }

   public operator fun component6(): FloatArray {
      return this.settingVisibility
   }

   public override operator fun equals(other: Any?): Boolean {
      label58@
      if (this === other) {
         return true
      } else {
         return other is شر
            && java.lang.Float.compare(this.bindProgress, (other as شر).bindProgress) == 0
            && java.lang.Float.compare(this.contentVisibility, (other as شر).contentVisibility) == 0
            && java.lang.Float.compare(this.effectiveOpenProgress, (other as شر).effectiveOpenProgress) == 0
            && java.lang.Float.compare(this.settingsHeight, (other as شر).settingsHeight) == 0
            && java.lang.Float.compare(this.moduleHeight, (other as شر).moduleHeight) == 0
            && this.settingVisibility == (other as شر).settingVisibility
            && this.settingHeights == (other as شر).settingHeights
         }
   }

   public operator fun component1(): Float {
      return this.bindProgress
   }

   public operator fun component3(): Float {
      return this.effectiveOpenProgress
   }

   public operator fun component2(): Float {
      return this.contentVisibility
   }
}
