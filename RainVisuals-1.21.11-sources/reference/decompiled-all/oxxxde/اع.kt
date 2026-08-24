package oxxxde

// $VF: Compiled from heavy
private data class اع(notifications: List<ثن>, nextCursor: Long, latestId: Long, hasMore: Boolean) {
   public final val hasMore: Boolean
   public final val nextCursor: Long
   public final val latestId: Long
   public final val notifications: List<ثن>

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is اع
            && this.notifications == (other as اع).notifications
            && this.nextCursor == (other as اع).nextCursor
            && this.latestId == (other as اع).latestId
            && this.hasMore == (other as اع).hasMore
         }
   }

   public operator fun component4(): Boolean {
      return this.hasMore
   }

   public override fun hashCode(): Int {
      return ((this.notifications.hashCode() * 31 + java.lang.Long.hashCode(this.nextCursor)) * 31 + java.lang.Long.hashCode(this.latestId)) * 31
         + java.lang.Boolean.hashCode(this.hasMore)
      }

   public operator fun component3(): Long {
      return this.latestId
   }

   public fun copy(
      notifications: List<ثن> = this.notifications,
      nextCursor: Long = this.nextCursor,
      latestId: Long = this.latestId,
      hasMore: Boolean = this.hasMore
   ): اع {
      return اع(notifications, nextCursor, latestId, hasMore)
   }

   public operator fun component1(): List<ثن> {
      return this.notifications
   }

   public operator fun component2(): Long {
      return this.nextCursor
   }

   public override fun toString(): String {
      return "NotificationResponse(notifications=${this.notifications}, nextCursor=${this.nextCursor}, latestId=${this.latestId}, hasMore=${this.hasMore})"
   }

   init {
      this.notifications = notifications
      this.nextCursor = nextCursor
      this.latestId = latestId
      this.hasMore = hasMore
   }
}
