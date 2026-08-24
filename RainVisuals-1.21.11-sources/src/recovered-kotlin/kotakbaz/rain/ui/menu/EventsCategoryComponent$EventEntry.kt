package kotakbaz.rain.ui.menu

import kotakbaz.rain.client.util.animations.AnimationUtil
import oxxxde.ري
import oxxxde.ز

// $VF: Compiled from EventsCategoryComponent.kt
private data class `EventsCategoryComponent$EventEntry`(anarchy: Int,
   title: String,
   name: String,
   status: String,
   highlighted: Boolean = ...,
   selectionAnimation: ري = ...
) {
   public final val status: String
   public final val name: String
   public final val highlighted: Boolean
   public final val title: String
   public final val anarchy: Int
   private AnimationUtil selectionAnimation;

   public fun copy(anarchy: Int = ..., title: String = ..., name: String = ..., status: String = ..., highlighted: Boolean = ..., selectionAnimation: ري = ...): ز {
      return EventsCategoryComponent$EventEntry(anarchy, title, name, status, highlighted, selectionAnimation)
   }

   public operator fun component5(): Boolean {
      return this.highlighted
   }

   public operator fun component1(): Int {
      return this.anarchy
   }

   public override fun hashCode(): Int {
      return (
               (((Integer.hashCode(this.anarchy) * 31 + this.title.hashCode()) * 31 + this.name.hashCode()) * 31 + this.status.hashCode()) * 31
                  + java.lang.Boolean.hashCode(this.highlighted)
            )
            * 31
         + this.selectionAnimation.hashCode()
      }

   public operator fun component3(): String {
      return this.name
   }

   public override fun toString(): String {
      return "EventEntry(anarchy=${this.anarchy}, title=${this.title}, name=${this.name}, status=${this.status}, highlighted=${this.highlighted}, selectionAnimation=${this.selectionAnimation})"
   }

   public operator fun component6(): ري {
      return this.selectionAnimation
   }

   public operator fun component2(): String {
      return this.title
   }

   init {
      this.anarchy = anarchy
      this.title = title
      this.name = name
      this.status = status
      this.highlighted = highlighted
      this.selectionAnimation = selectionAnimation
   }

   public final val selectionAnimation: ري

   public operator fun component4(): String {
      return this.status
   }

   public override operator fun equals(other: Any?): Boolean {
      label52@
      if (this === other) {
         return true
      } else {
         return other is EventsCategoryComponent$EventEntry
            && this.anarchy == (other as EventsCategoryComponent$EventEntry).anarchy
            && this.title == (other as EventsCategoryComponent$EventEntry).title
            && this.name == (other as EventsCategoryComponent$EventEntry).name
            && this.status == (other as EventsCategoryComponent$EventEntry).status
            && this.highlighted == (other as EventsCategoryComponent$EventEntry).highlighted
            && this.selectionAnimation == (other as EventsCategoryComponent$EventEntry).selectionAnimation
         }
   }
}
