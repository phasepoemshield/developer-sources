package oxxxde

// $VF: Compiled from EventsCategoryComponent.kt
private data class ز {
   public final val status: String
   public final val name: String
   public final val highlighted: Boolean
   public final val title: String
   public final val anarchy: Int
   public final val selectionAnimation: ري

   public fun copy(
      anarchy: Int = this.anarchy,
      title: String = this.title,
      name: String = this.name,
      status: String = this.status,
      highlighted: Boolean = this.highlighted,
      selectionAnimation: ري = this.selectionAnimation
   ): ز {
      return ز(anarchy, title, name, status, highlighted, selectionAnimation)
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

   fun ز(selectionAnimation: Int, highlighted: java.lang.String, title: java.lang.String, name: java.lang.String, anarchy: Boolean, status: ري) {
      this.anarchy = anarchy
      this.title = title
      this.name = name
      this.status = status
      this.highlighted = highlighted
      this.selectionAnimation = selectionAnimation
   }

   fun getSelectionAnimation(): ري {
      this.selectionAnimation
   }

   public operator fun component4(): String {
      return this.status
   }

   public override operator fun equals(other: Any?): Boolean {
      label52@
      if (this === other) {
         return true
      } else {
         return other is ز
            && this.anarchy == (other as ز).anarchy
            && this.title == (other as ز).title
            && this.name == (other as ز).name
            && this.status == (other as ز).status
            && this.highlighted == (other as ز).highlighted
            && this.selectionAnimation == (other as ز).selectionAnimation
         }
   }
}
