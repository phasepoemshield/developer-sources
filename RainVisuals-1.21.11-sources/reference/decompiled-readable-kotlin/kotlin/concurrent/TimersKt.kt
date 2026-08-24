@file:JvmName(name = "TimersKt")

package kotlin.concurrent

import java.util.Date
import java.util.Timer
import java.util.TimerTask
import kotlin.internal.InlineOnly

// $VF: Compiled from Timer.kt
@InlineOnly
public inline fun fixedRateTimer(name: String? = null, daemon: Boolean = false, initialDelay: Long = 0L, period: Long, crossinline action: (TimerTask) -> Unit): Timer {
   val timer: Timer = timer(name, daemon)
   timer.scheduleAtFixedRate(   // $VF: Compiled from Timer.kt
object : TimerTask {
      public override fun run() {
         this.$action(this)
      }

      {
         this.$action = `$action`
      }
   }, initialDelay, period)
   return timer
}

@InlineOnly
public inline fun fixedRateTimer(name: String? = null, daemon: Boolean = false, startAt: Date, period: Long, crossinline action: (TimerTask) -> Unit): Timer {
   val timer: Timer = timer(name, daemon)
   timer.scheduleAtFixedRate(   // $VF: Compiled from Timer.kt
object : TimerTask {
      public override fun run() {
         this.$action(this)
      }

      {
         this.$action = `$action`
      }
   }, startAt, period)
   return timer
}

@InlineOnly
public inline fun Timer.schedule(time: Date, period: Long, crossinline action: (TimerTask) -> Unit): TimerTask {
   val task: TimerTask =    // $VF: Compiled from Timer.kt
object : TimerTask {
      public override fun run() {
         this.$action(this)
      }

      {
         this.$action = `$action`
      }
   }
   `$this$schedule`.schedule(task, time, period)
   return task
}

@InlineOnly
public inline fun timer(name: String? = null, daemon: Boolean = false, startAt: Date, period: Long, crossinline action: (TimerTask) -> Unit): Timer {
   val timer: Timer = timer(name, daemon)
   timer.schedule(   // $VF: Compiled from Timer.kt
object : TimerTask {
      public override fun run() {
         this.$action(this)
      }

      {
         this.$action = `$action`
      }
   }, startAt, period)
   return timer
}

@InlineOnly
public inline fun timerTask(crossinline action: (TimerTask) -> Unit): TimerTask {
   return    // $VF: Compiled from Timer.kt
object : TimerTask {
      public override fun run() {
         this.$action(this)
      }

      {
         this.$action = `$action`
      }
   }
}

@InlineOnly
public inline fun Timer.schedule(time: Date, crossinline action: (TimerTask) -> Unit): TimerTask {
   val task: TimerTask =    // $VF: Compiled from Timer.kt
object : TimerTask {
      public override fun run() {
         this.$action(this)
      }

      {
         this.$action = `$action`
      }
   }
   `$this$schedule`.schedule(task, time)
   return task
}

@InlineOnly
public inline fun Timer.schedule(delay: Long, period: Long, crossinline action: (TimerTask) -> Unit): TimerTask {
   val task: TimerTask =    // $VF: Compiled from Timer.kt
object : TimerTask {
      public override fun run() {
         this.$action(this)
      }

      {
         this.$action = `$action`
      }
   }
   `$this$schedule`.schedule(task, delay, period)
   return task
}

@InlineOnly
public inline fun Timer.scheduleAtFixedRate(time: Date, period: Long, crossinline action: (TimerTask) -> Unit): TimerTask {
   val task: TimerTask =    // $VF: Compiled from Timer.kt
object : TimerTask {
      public override fun run() {
         this.$action(this)
      }

      {
         this.$action = `$action`
      }
   }
   `$this$scheduleAtFixedRate`.scheduleAtFixedRate(task, time, period)
   return task
}

@InlineOnly
public inline fun timer(name: String? = null, daemon: Boolean = false, initialDelay: Long = 0L, period: Long, crossinline action: (TimerTask) -> Unit): Timer {
   val timer: Timer = timer(name, daemon)
   timer.schedule(   // $VF: Compiled from Timer.kt
object : TimerTask {
      public override fun run() {
         this.$action(this)
      }

      {
         this.$action = `$action`
      }
   }, initialDelay, period)
   return timer
}

@InlineOnly
public inline fun Timer.scheduleAtFixedRate(delay: Long, period: Long, crossinline action: (TimerTask) -> Unit): TimerTask {
   val task: TimerTask =    // $VF: Compiled from Timer.kt
object : TimerTask {
      public override fun run() {
         this.$action(this)
      }

      {
         this.$action = `$action`
      }
   }
   `$this$scheduleAtFixedRate`.scheduleAtFixedRate(task, delay, period)
   return task
}

@InlineOnly
public inline fun Timer.schedule(delay: Long, crossinline action: (TimerTask) -> Unit): TimerTask {
   val task: TimerTask =    // $VF: Compiled from Timer.kt
object : TimerTask {
      public override fun run() {
         this.$action(this)
      }

      {
         this.$action = `$action`
      }
   }
   `$this$schedule`.schedule(task, delay)
   return task
}

@PublishedApi
internal fun timer(name: String?, daemon: Boolean): Timer {
   return if (name == null) Timer(daemon) else Timer(name, daemon)
}
