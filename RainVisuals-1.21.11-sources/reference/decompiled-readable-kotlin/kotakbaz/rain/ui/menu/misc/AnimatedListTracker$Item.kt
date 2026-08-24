package kotakbaz.rain.ui.menu.misc

import oxxxde.جة

// $VF: Compiled from heavy
public data class `AnimatedListTracker$Item`<T>(value: Any, position: Float, presence: Float, present: Boolean) {
   public final val position: Float
   public final val presence: Float
   public final val value: Any
   public final val present: Boolean

   public operator fun component4(): Boolean {
      return this.present
   }

   public fun copy(value: Any = ..., position: Float = ..., presence: Float = ..., present: Boolean = ...): جة<Any> {
      return AnimatedListTracker$Item<>((T)value, position, presence, present)
   }

   public operator fun component1(): Any {
      return this.value
   }

   public operator fun component2(): Float {
      return this.position
   }

   init {
      this.value = (T)value
      this.position = position
      this.presence = presence
      this.present = present
   }

   public override fun toString(): String {
      return "Item(value=${this.value}, position=${this.position}, presence=${this.presence}, present=${this.present})"
   }

   public operator fun component3(): Float {
      return this.presence
   }

   public override fun hashCode(): Int {
      return (
               ((if (this.value == null) 0 else this.value.hashCode()) * 31 + java.lang.Float.hashCode(this.position)) * 31
                  + java.lang.Float.hashCode(this.presence)
            )
            * 31
         + java.lang.Boolean.hashCode(this.present)
      }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is AnimatedListTracker$Item
            && this.value == (other as AnimatedListTracker$Item).value
            && java.lang.Float.compare(this.position, (other as AnimatedListTracker$Item).position) == 0
            && java.lang.Float.compare(this.presence, (other as AnimatedListTracker$Item).presence) == 0
            && this.present == (other as AnimatedListTracker$Item).present
         }
   }
}
