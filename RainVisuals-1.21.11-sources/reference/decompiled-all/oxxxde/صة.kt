package oxxxde

// $VF: Compiled from FunTimeEventsApi.kt
public data class صة {
   public final val name: String
   public final val status: شة
   public final val deadlineAt: Long?
   public final val reportedSeconds: Int?
   public final val anarchy: Int
   internal final val timerIdentity: String
   public final val highlighted: Boolean

   public override fun toString(): String {
      return "Event(anarchy=${this.anarchy}, name=${this.name}, status=${this.status}, reportedSeconds=${this.reportedSeconds}, deadlineAt=${this.deadlineAt}, highlighted=${this.highlighted}, timerIdentity=${this.timerIdentity})"
   }

   public operator fun component5(): Long? {
      return this.deadlineAt
   }

   public operator fun component2(): String {
      return this.name
   }

   fun getStatus(): شة {
      this.status
   }

   public fun copy(
      anarchy: Int = this.anarchy,
      name: String = this.name,
      status: شة = this.status,
      reportedSeconds: Int? = this.reportedSeconds,
      deadlineAt: Long? = this.deadlineAt,
      highlighted: Boolean = this.highlighted,
      timerIdentity: String = this.timerIdentity
   ): صة {
      return صة(anarchy, name, status, reportedSeconds, deadlineAt, highlighted, timerIdentity)
   }

   internal operator fun component7(): String {
      return this.timerIdentity
   }

   public operator fun component4(): Int? {
      return this.reportedSeconds
   }

   fun صة(
      highlighted: Int,
      timerIdentity: java.lang.String,
      anarchy: شة,
      reportedSeconds: Int?,
      status: java.lang.Long?,
      deadlineAt: Boolean,
      name: java.lang.String
   ) {
      this.anarchy = anarchy
      this.name = name
      this.status = status
      this.reportedSeconds = reportedSeconds
      this.deadlineAt = deadlineAt
      this.highlighted = highlighted
      this.timerIdentity = timerIdentity
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 ((Integer.hashCode(this.anarchy) * 31 + this.name.hashCode()) * 31 + this.status.hashCode()) * 31
                                    + (if (this.reportedSeconds == null) 0 else this.reportedSeconds.hashCode())
                              )
                              * 31
                           + (if (this.deadlineAt == null) 0 else this.deadlineAt.hashCode())
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.highlighted)
            )
            * 31
         + this.timerIdentity.hashCode()
      }

   public fun remainingSeconds(now: Long): Int? {
      return if (this.deadlineAt != null) RangesKt.coerceAtLeast((int)((this.deadlineAt.longValue() - now + 999L) / 1000L), 0) else null
   }

   public final val known: Boolean
      public final get() {
         return this.highlighted
      }


   public override operator fun equals(other: Any?): Boolean {
      label58@
      if (this === other) {
         return true
      } else {
         return other is صة
            && this.anarchy == (other as صة).anarchy
            && this.name == (other as صة).name
            && this.status === (other as صة).status
            && this.reportedSeconds == (other as صة).reportedSeconds
            && this.deadlineAt == (other as صة).deadlineAt
            && this.highlighted == (other as صة).highlighted
            && this.timerIdentity == (other as صة).timerIdentity
         }
   }

   public fun statusText(now: Long): String {
      val remaining: Int = this.remainingSeconds(now)
      return if (remaining != null && this.status.hasCountdown)
         "${this.status.label}: ${خم.access$formatDuration(خم.INSTANCE, remaining)}"
         else
         this.status.label
      }

   public operator fun component3(): شة {
      return this.status
   }

   public operator fun component1(): Int {
      return this.anarchy
   }

   public fun sortPriority(): Int {
      return this.status.priority
   }

   public operator fun component6(): Boolean {
      return this.highlighted
   }
}
