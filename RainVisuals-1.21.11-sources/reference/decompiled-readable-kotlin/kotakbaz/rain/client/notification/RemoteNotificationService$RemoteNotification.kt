package kotakbaz.rain.client.notification

import oxxxde.ثن
import oxxxde.صظ

// $VF: Compiled from heavy
private data class `RemoteNotificationService$RemoteNotification`(id: Long, title: String, message: String, level: String, action: صظ?) {
   public final val level: String
   private RemoteNotificationService$RemoteAction action;
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

   public fun copy(id: Long = ..., title: String = ..., message: String = ..., level: String = ..., action: صظ? = ...): ثن {
      return RemoteNotificationService$RemoteNotification(id, title, message, level, action)
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

   public final val action: صظ?

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
         return other is RemoteNotificationService$RemoteNotification
            && this.id == (other as RemoteNotificationService$RemoteNotification).id
            && this.title == (other as RemoteNotificationService$RemoteNotification).title
            && this.message == (other as RemoteNotificationService$RemoteNotification).message
            && this.level == (other as RemoteNotificationService$RemoteNotification).level
            && this.action == (other as RemoteNotificationService$RemoteNotification).action
         }
   }

   init {
      this.id = id
      this.title = title
      this.message = message
      this.level = level
      this.action = action
   }
}
