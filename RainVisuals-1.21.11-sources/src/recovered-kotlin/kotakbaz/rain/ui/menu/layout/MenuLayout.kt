package kotakbaz.rain.ui.menu.layout

import oxxxde.زْ
import oxxxde.طس

// $VF: Compiled from heavy
public data class MenuLayout(x: Float,
   y: Float,
   width: Float,
   height: Float,
   panelWidth: Float,
   uiPadding: Float,
   topBarHeight: Float,
   sidebarPadding: Float,
   sidebarItemCount: Int,
   configMode: Boolean,
   pointsMode: Boolean,
   configCloudMode: Boolean = false
) {
   public final val configCloudMode: Boolean
   public final val width: Float
   public final val topBarHeight: Float
   public final val y: Float
   public final val x: Float
   public final val pointsMode: Boolean
   public final val sidebarItemCount: Int
   public final val panelWidth: Float
   public final val uiPadding: Float
   public final val height: Float
   public final val configMode: Boolean
   public final val sidebarPadding: Float

   public final val moduleStartOffset: Float
      public final get() {
         return this.contentInset + this.topBarHeight + this.uiPadding
      }


   public operator fun component11(): Boolean {
      return this.pointsMode
   }

   public final val topBarConfigAuxButtonX: Float
      public final get() {
         return this.topBarConfigCreateButtonX + this.topBarConfigButtonSize + this.topBarConfigButtonsGap
      }


   public final val contentInset: Float
      public final get() {
         return this.panelWidth / 5.0F
      }


   public operator fun component9(): Int {
      return this.sidebarItemCount
   }

   public fun categorySlot(index: Int, padding: Float): طس {
      val safePadding: Float = RangesKt.coerceAtLeast(padding, 0.0F)
      val size: Float = this.sidebarSlotSize(safePadding)
      return CategorySlot(
         this.x + (this.panelWidth - size) * 0.5F,
         this.y + this.headerHeight + this.uiPadding * -0.3F + safePadding + index * (size * 0.93F + safePadding),
         size
      )
   }

   public final val topBarInfoToActionsGap: Float
      public final get() {
         return if (!(this.topBarConfigButtonSize > 0.0F) && (!(this.topBarSearchWidth > 0.0F) || !(this.topBarSearchWidth < this.contentWidth)))
            0.0F
            else
            this.topBarGap
         }


   public final val topBarSearchWidthFactor: Float
      public final get() {
         return 0.36666667F
      }


   public final val topBarInfoX: Float
      public final get() {
         return this.contentLeft
      }


   public final val contentLeft: Float
      public final get() {
         return this.x + this.panelWidth + this.uiPadding
      }


   public final val scrollBarY: Float
      public final get() {
         return this.y + this.moduleStartOffset
      }


   public final val scrollBarHeight: Float
      public final get() {
         return this.height - this.moduleStartOffset - this.uiPadding * 2.0F
      }


   public final val logoSize: Float
      public final get() {
         return this.sidebarSlotSize(this.sidebarPadding) * 0.47F
      }


   private fun sidebarSlotSize(padding: Float): Float {
      val safePadding: Float = RangesKt.coerceAtLeast(padding, 0.0F)
      val baseSize: Float = RangesKt.coerceAtLeast(this.panelWidth - 12.0F, 0.0F)
      return if (this.sidebarItemCount <= 0)
         baseSize
         else
         Math.min(
            baseSize,
            RangesKt.coerceAtLeast(this.height - this.headerHeight - safePadding * (float)(this.sidebarItemCount + 3), 0.0F)
               / ((float)this.sidebarItemCount + 0.84F)
         )
      }

   public operator fun component1(): Float {
      return this.x
   }

   public operator fun component2(): Float {
      return this.y
   }

   public final val scrollBarX: Float
      public final get() {
         return this.x + this.width - this.uiPadding * 2.0F
      }


   public operator fun component10(): Boolean {
      return this.configMode
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
                                                                                                java.lang.Float.hashCode(this.x) * 31
                                                                                                   + java.lang.Float.hashCode(this.y)
                                                                                             )
                                                                                             * 31
                                                                                          + java.lang.Float.hashCode(this.width)
                                                                                    )
                                                                                    * 31
                                                                                 + java.lang.Float.hashCode(this.height)
                                                                           )
                                                                           * 31
                                                                        + java.lang.Float.hashCode(this.panelWidth)
                                                                  )
                                                                  * 31
                                                               + java.lang.Float.hashCode(this.uiPadding)
                                                         )
                                                         * 31
                                                      + java.lang.Float.hashCode(this.topBarHeight)
                                                )
                                                * 31
                                             + java.lang.Float.hashCode(this.sidebarPadding)
                                       )
                                       * 31
                                    + Integer.hashCode(this.sidebarItemCount)
                              )
                              * 31
                           + java.lang.Boolean.hashCode(this.configMode)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.pointsMode)
            )
            * 31
         + java.lang.Boolean.hashCode(this.configCloudMode)
      }

   init {
      this.x = x
      this.y = y
      this.width = width
      this.height = height
      this.panelWidth = panelWidth
      this.uiPadding = uiPadding
      this.topBarHeight = topBarHeight
      this.sidebarPadding = sidebarPadding
      this.sidebarItemCount = sidebarItemCount
      this.configMode = configMode
      this.pointsMode = pointsMode
      this.configCloudMode = configCloudMode
   }

   public final val contentWidth: Float
      public final get() {
         return RangesKt.coerceAtLeast(this.contentRight - this.contentLeft, 0.0F)
      }


   public operator fun component7(): Float {
      return this.topBarHeight
   }

   public final val logoY: Float
      public final get() {
         return this.y + (this.headerHeight * 0.5F - this.logoSize * 0.5F) + this.uiPadding * -0.3F
      }


   public final val headerHeight: Float
      public final get() {
         return this.panelWidth
      }


   public fun isInsideTopBarSearchInput(mouseX: Float, mouseY: Float): Boolean {
      label28@
      if (!(this.topBarSearchWidth <= 0.0F) && !(this.topBarHeight <= 0.0F)) {
         return !(mouseY < this.topBarY)
            && !(mouseY > this.topBarY + this.topBarHeight)
            && mouseX <= this.topBarSearchX + this.topBarSearchWidth
            && this.topBarSearchX <= mouseX
         } else {
         return false
      }
   }

   public operator fun component4(): Float {
      return this.height
   }

   public final val topBarInfoWidth: Float
      public final get() {
         return if (this.configMode)
            RangesKt.coerceAtLeast(
               this.contentWidth
                  - this.topBarConfigButtonSize * (float)this.topBarConfigButtonCount
                  - this.topBarInfoToActionsGap
                  - this.topBarConfigButtonsGap * (float)RangesKt.coerceAtLeast(this.topBarConfigButtonCount - 1, 0),
               0.0F
            )
            else
            RangesKt.coerceAtLeast(this.contentWidth - this.topBarSearchWidth - this.topBarInfoToActionsGap, 0.0F)
         }


   public fun isInsideTopBarConfigAuxAction(mouseX: Float, mouseY: Float): Boolean {
      return !(this.topBarConfigButtonSize <= 0.0F)
         && mouseX >= this.topBarConfigAuxButtonX
         && mouseX <= this.topBarConfigAuxButtonX + this.topBarConfigButtonSize
         && mouseY >= this.topBarY
         && mouseY <= this.topBarY + this.topBarHeight
      }

   public fun isInsideTopBarFolderAction(mouseX: Float, mouseY: Float): Boolean {
      return !(this.topBarConfigButtonSize <= 0.0F)
         && mouseX >= this.topBarFolderButtonX
         && mouseX <= this.topBarFolderButtonX + this.topBarConfigButtonSize
         && mouseY >= this.topBarFolderButtonY
         && mouseY <= this.topBarFolderButtonY + this.topBarHeight
      }

   public final val avatarY: Float
      public final get() {
         return this.y + this.height - this.uiPadding - this.avatarSize - 5.0F
      }


   public final val topBarConfigButtonCount: Int
      public final get() {
         return if (!this.configMode) 0 else 2
      }


   public override operator fun equals(other: Any?): Boolean {
      label88@
      if (this === other) {
         return true
      } else {
         return other is MenuLayout
            && java.lang.Float.compare(this.x, (other as MenuLayout).x) == 0
            && java.lang.Float.compare(this.y, (other as MenuLayout).y) == 0
            && java.lang.Float.compare(this.width, (other as MenuLayout).width) == 0
            && java.lang.Float.compare(this.height, (other as MenuLayout).height) == 0
            && java.lang.Float.compare(this.panelWidth, (other as MenuLayout).panelWidth) == 0
            && java.lang.Float.compare(this.uiPadding, (other as MenuLayout).uiPadding) == 0
            && java.lang.Float.compare(this.topBarHeight, (other as MenuLayout).topBarHeight) == 0
            && java.lang.Float.compare(this.sidebarPadding, (other as MenuLayout).sidebarPadding) == 0
            && this.sidebarItemCount == (other as MenuLayout).sidebarItemCount
            && this.configMode == (other as MenuLayout).configMode
            && this.pointsMode == (other as MenuLayout).pointsMode
            && this.configCloudMode == (other as MenuLayout).configCloudMode
         }
   }

   public final val topBarConfigButtonsGap: Float
      public final get() {
         return if (this.topBarConfigButtonSize > 0.0F) this.topBarGap else 0.0F
      }


   public final val topBarSearchWidth: Float
      public final get() {
         return if (this.configMode) 0.0F else RangesKt.coerceIn(this.contentWidth * this.topBarSearchWidthFactor, 0.0F, this.contentWidth)
      }


   public operator fun component5(): Float {
      return this.panelWidth
   }

   public final val contentRight: Float
      public final get() {
         return this.x + this.width - this.panelWidth / 3.0F
      }


   public final val topBarFolderButtonY: Float
      public final get() {
         return this.topBarY
      }


   public final val radius: Float
      public final get() {
         return this.height * 0.04F
      }


   public operator fun component12(): Boolean {
      return this.configCloudMode
   }

   public operator fun component3(): Float {
      return this.width
   }

   public final val topBarGap: Float
      public final get() {
         return this.uiPadding
      }


   public operator fun component6(): Float {
      return this.uiPadding
   }

   public final val avatarX: Float
      public final get() {
         return this.x + (this.panelWidth - this.avatarSize) * 0.5F
      }


   public final val topBarFolderButtonX: Float
      public final get() {
         return this.topBarConfigAuxButtonX
      }


   public fun copy(
      x: Float = ...,
      y: Float = ...,
      width: Float = ...,
      height: Float = ...,
      panelWidth: Float = ...,
      uiPadding: Float = ...,
      topBarHeight: Float = ...,
      sidebarPadding: Float = ...,
      sidebarItemCount: Int = ...,
      configMode: Boolean = ...,
      pointsMode: Boolean = ...,
      configCloudMode: Boolean = ...
   ): زْ {
      return MenuLayout(x, y, width, height, panelWidth, uiPadding, topBarHeight, sidebarPadding, sidebarItemCount, configMode, pointsMode, configCloudMode)
   }

   public final val topBarConfigCreateButtonX: Float
      public final get() {
         return this.topBarInfoX + this.topBarInfoWidth + this.topBarInfoToActionsGap
      }


   public override fun toString(): String {
      return "MenuLayout(x=${this.x}, y=${this.y}, width=${this.width}, height=${this.height}, panelWidth=${this.panelWidth}, uiPadding=${this.uiPadding}, topBarHeight=${this.topBarHeight}, sidebarPadding=${this.sidebarPadding}, sidebarItemCount=${this.sidebarItemCount}, configMode=${this.configMode}, pointsMode=${this.pointsMode}, configCloudMode=${this.configCloudMode})"
   }

   public fun isInsideTopBarConfigCreateAction(mouseX: Float, mouseY: Float): Boolean {
      return !(this.topBarConfigButtonSize <= 0.0F)
         && mouseX >= this.topBarConfigCreateButtonX
         && mouseX <= this.topBarConfigCreateButtonX + this.topBarConfigButtonSize
         && mouseY >= this.topBarY
         && mouseY <= this.topBarY + this.topBarHeight
      }

   public final val topBarSearchX: Float
      public final get() {
         return this.topBarInfoX + this.topBarInfoWidth + this.topBarInfoToActionsGap
      }


   public final val avatarSize: Float
      public final get() {
         return if (this.sidebarItemCount > 0) this.sidebarSlotSize(this.sidebarPadding) * 0.84F else 0.0F
      }


   public final val topBarY: Float
      public final get() {
         return this.y + this.contentInset
      }


   public operator fun component8(): Float {
      return this.sidebarPadding
   }

   public final val topBarConfigButtonSize: Float
      public final get() {
         return if (this.configMode && this.contentWidth >= this.topBarHeight * this.topBarConfigButtonCount + this.topBarGap * this.topBarConfigButtonCount)
            this.topBarHeight
            else
            0.0F
         }

}
