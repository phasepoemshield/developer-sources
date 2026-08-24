package kotakbaz.rain.ui.inventory

import oxxxde.ظئ

// $VF: Compiled from heavy
internal data class SearchLayout(searchX: Float, y: Float, searchWidth: Float, actionX: Float, rowWidth: Float) {
   public final val searchWidth: Float
   public final val actionX: Float
   public final val rowWidth: Float
   public final val y: Float
   public final val searchX: Float

   public operator fun component4(): Float {
      return this.actionX
   }

   public override fun toString(): String {
      return "SearchLayout(searchX=${this.searchX}, y=${this.y}, searchWidth=${this.searchWidth}, actionX=${this.actionX}, rowWidth=${this.rowWidth})"
   }

   public operator fun component5(): Float {
      return this.rowWidth
   }

   public fun isInsideAction(x: Float, y: Float): Boolean {
      return x <= this.actionX + 27.0F && this.actionX <= x && y <= this.y + 27.0F && this.y <= y
   }

   public operator fun component3(): Float {
      return this.searchWidth
   }

   public fun isInsideSearch(x: Float, y: Float): Boolean {
      return x <= this.searchX + this.searchWidth && this.searchX <= x && y <= this.y + 27.0F && this.y <= y
   }

   public operator fun component1(): Float {
      return this.searchX
   }

   public fun copy(searchX: Float = ..., y: Float = ..., searchWidth: Float = ..., actionX: Float = ..., rowWidth: Float = ...): ظئ {
      return SearchLayout(searchX, y, searchWidth, actionX, rowWidth)
   }

   public override fun hashCode(): Int {
      return (
               ((java.lang.Float.hashCode(this.searchX) * 31 + java.lang.Float.hashCode(this.y)) * 31 + java.lang.Float.hashCode(this.searchWidth)) * 31
                  + java.lang.Float.hashCode(this.actionX)
            )
            * 31
         + java.lang.Float.hashCode(this.rowWidth)
      }

   public operator fun component2(): Float {
      return this.y
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is SearchLayout
            && java.lang.Float.compare(this.searchX, (other as SearchLayout).searchX) == 0
            && java.lang.Float.compare(this.y, (other as SearchLayout).y) == 0
            && java.lang.Float.compare(this.searchWidth, (other as SearchLayout).searchWidth) == 0
            && java.lang.Float.compare(this.actionX, (other as SearchLayout).actionX) == 0
            && java.lang.Float.compare(this.rowWidth, (other as SearchLayout).rowWidth) == 0
         }
   }

   init {
      this.searchX = searchX
      this.y = y
      this.searchWidth = searchWidth
      this.actionX = actionX
      this.rowWidth = rowWidth
   }
}
