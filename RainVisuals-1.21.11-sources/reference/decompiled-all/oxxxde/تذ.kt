package oxxxde

// $VF: Compiled from heavy
private data class تذ(scale: Float,
   width: Float,
   height: Float,
   headerHeight: Float,
   rowHeight: Float,
   margin: Float,
   headerTextSize: Float,
   rowTextSize: Float,
   settingHeight: Float,
   settingGap: Float,
   cornerRadius: Float,
   headerCornerRadius: Float
) {
   public final val cornerRadius: Float
   public final val rowHeight: Float
   public final val settingHeight: Float
   public final val height: Float
   public final val scale: Float
   public final val margin: Float
   public final val settingGap: Float
   public final val headerCornerRadius: Float
   public final val rowTextSize: Float
   public final val width: Float
   public final val headerTextSize: Float
   public final val headerHeight: Float

   public operator fun component6(): Float {
      return this.margin
   }

   public operator fun component7(): Float {
      return this.headerTextSize
   }

   public fun settingsBlockHeight(): Float {
      return this.settingHeight * 5 + this.settingGap * RangesKt.coerceAtLeast(4, 0)
   }

   public operator fun component1(): Float {
      return this.scale
   }

   public operator fun component12(): Float {
      return this.headerCornerRadius
   }

   public fun copy(
      scale: Float = this.scale,
      width: Float = this.width,
      height: Float = this.height,
      headerHeight: Float = this.headerHeight,
      rowHeight: Float = this.rowHeight,
      margin: Float = this.margin,
      headerTextSize: Float = this.headerTextSize,
      rowTextSize: Float = this.rowTextSize,
      settingHeight: Float = this.settingHeight,
      settingGap: Float = this.settingGap,
      cornerRadius: Float = this.cornerRadius,
      headerCornerRadius: Float = this.headerCornerRadius
   ): تذ {
      return تذ(scale, width, height, headerHeight, rowHeight, margin, headerTextSize, rowTextSize, settingHeight, settingGap, cornerRadius, headerCornerRadius)
   }

   public operator fun component3(): Float {
      return this.height
   }

   public operator fun component8(): Float {
      return this.rowTextSize
   }

   public operator fun component10(): Float {
      return this.settingGap
   }

   public fun rowDividerWidth(): Float {
      return this.scaled(1.2F)
   }

   public override operator fun equals(other: Any?): Boolean {
      label88@
      if (this === other) {
         return true
      } else {
         return other is تذ
            && java.lang.Float.compare(this.scale, (other as تذ).scale) == 0
            && java.lang.Float.compare(this.width, (other as تذ).width) == 0
            && java.lang.Float.compare(this.height, (other as تذ).height) == 0
            && java.lang.Float.compare(this.headerHeight, (other as تذ).headerHeight) == 0
            && java.lang.Float.compare(this.rowHeight, (other as تذ).rowHeight) == 0
            && java.lang.Float.compare(this.margin, (other as تذ).margin) == 0
            && java.lang.Float.compare(this.headerTextSize, (other as تذ).headerTextSize) == 0
            && java.lang.Float.compare(this.rowTextSize, (other as تذ).rowTextSize) == 0
            && java.lang.Float.compare(this.settingHeight, (other as تذ).settingHeight) == 0
            && java.lang.Float.compare(this.settingGap, (other as تذ).settingGap) == 0
            && java.lang.Float.compare(this.cornerRadius, (other as تذ).cornerRadius) == 0
            && java.lang.Float.compare(this.headerCornerRadius, (other as تذ).headerCornerRadius) == 0
         }
   }

   public fun rowLeadingSize(): Float {
      return this.rowTextSize + this.scaled(1.0F)
   }

   public operator fun component9(): Float {
      return this.settingHeight
   }

   public fun scaled(value: Float): Float {
      return value * this.scale
   }

   public operator fun component4(): Float {
      return this.headerHeight
   }

   public operator fun component2(): Float {
      return this.width
   }

   init {
      this.scale = scale
      this.width = width
      this.height = height
      this.headerHeight = headerHeight
      this.rowHeight = rowHeight
      this.margin = margin
      this.headerTextSize = headerTextSize
      this.rowTextSize = rowTextSize
      this.settingHeight = settingHeight
      this.settingGap = settingGap
      this.cornerRadius = cornerRadius
      this.headerCornerRadius = headerCornerRadius
   }

   public fun rowLeadingGap(): Float {
      return this.scaled(6.0F)
   }

   public operator fun component5(): Float {
      return this.rowHeight
   }

   public override fun toString(): String {
      return "AvatarPopupMetrics(scale=${this.scale}, width=${this.width}, height=${this.height}, headerHeight=${this.headerHeight}, rowHeight=${this.rowHeight}, margin=${this.margin}, headerTextSize=${this.headerTextSize}, rowTextSize=${this.rowTextSize}, settingHeight=${this.settingHeight}, settingGap=${this.settingGap}, cornerRadius=${this.cornerRadius}, headerCornerRadius=${this.headerCornerRadius})"
   }

   public operator fun component11(): Float {
      return this.cornerRadius
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
                                                                                                java.lang.Float.hashCode(this.scale) * 31
                                                                                                   + java.lang.Float.hashCode(this.width)
                                                                                             )
                                                                                             * 31
                                                                                          + java.lang.Float.hashCode(this.height)
                                                                                    )
                                                                                    * 31
                                                                                 + java.lang.Float.hashCode(this.headerHeight)
                                                                           )
                                                                           * 31
                                                                        + java.lang.Float.hashCode(this.rowHeight)
                                                                  )
                                                                  * 31
                                                               + java.lang.Float.hashCode(this.margin)
                                                         )
                                                         * 31
                                                      + java.lang.Float.hashCode(this.headerTextSize)
                                                )
                                                * 31
                                             + java.lang.Float.hashCode(this.rowTextSize)
                                       )
                                       * 31
                                    + java.lang.Float.hashCode(this.settingHeight)
                              )
                              * 31
                           + java.lang.Float.hashCode(this.settingGap)
                     )
                     * 31
                  + java.lang.Float.hashCode(this.cornerRadius)
            )
            * 31
         + java.lang.Float.hashCode(this.headerCornerRadius)
      }
}
