package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from FunTimeEventsApi.kt
public enum class شة(label: String, hasCountdown: Boolean, priority: Int) {
   LOOTING("Можно забирать лут", false, 0),
   RUNNING("Активен", true, 2),
   WAITING("Ожидает игроков", false, 4),
   IDLE("Нет активных событий", false, 6),
   OPENED("Открыт", false, 1),
   UPCOMING("Появится через", true, 5),
   ACTIVATING("Начнётся через", true, 3);

   public final val priority: Int
   public final val hasCountdown: Boolean
   public final val label: String

   init {
      this.label = label
      this.hasCountdown = hasCountdown
      this.priority = priority
   }

   @JvmStatic
   fun getEntries(): EnumEntries<شة> {
      $ENTRIES
   }
}
