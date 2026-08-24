package oxxxde

// $VF: Compiled from heavy
private data class ثن {
   public final val level: String
   public final val action: صظ?
   public final val title: String
   public final val message: String
   public final val id: Long

   public override fun hashCode(): Int {
      return (((java.lang.Long.hashCode(this.id) * 31 + this.title.hashCode()) * 31 + this.message.hashCode()) * 31 + this.level.hashCode()) * 31
         + (if (this.action == null) 0 else this.action.hashCode())
      }

   public operator fun component2(): String {
      return this.title
   }

   public fun copy(id: Long = this.id, title: String = this.title, message: String = this.message, level: String = this.level, action: صظ? = this.action): ثن {
      return ثن(id, title, message, level, action)
   }

   public operator fun component3(): String {
      return this.message
   }

   public operator fun component1(): Long {
      return this.id
   }

   public operator fun component5(): صظ? {
      return this.action
   }

   fun getAction(): صظ? {
      this.action
   }

   public operator fun component4(): String {
      return this.level
   }

   public override fun toString(): String {
      return "RemoteNotification(id=${this.id}, title=${this.title}, message=${this.message}, level=${this.level}, action=${this.action})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is ثن
            && this.id == (other as ثن).id
            && this.title == (other as ثن).title
            && this.message == (other as ثن).message
            && this.level == (other as ثن).level
            && this.action == (other as ثن).action
         }
   }

   fun ثن(message: Long, title: java.lang.String, level: java.lang.String, id: java.lang.String, action: صظ?) {
      this.id = id
      this.title = title
      this.message = message
      this.level = level
      this.action = action
   }
}
