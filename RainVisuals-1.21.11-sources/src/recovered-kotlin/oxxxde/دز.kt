package oxxxde

import java.util.Comparator
import kotakbaz.rain.client.notification.RemoteNotificationService$RemoteNotification

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
internal class دز<T> : Comparator {
   override final fun compare(a: T, b: T): Int {
      ComparisonsKt.compareValues((a as RemoteNotificationService$RemoteNotification).id, (b as RemoteNotificationService$RemoteNotification).id)
   }
}
