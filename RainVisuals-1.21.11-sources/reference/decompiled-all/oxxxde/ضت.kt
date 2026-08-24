package oxxxde

import java.util.ArrayList
import java.util.LinkedHashSet
import java.util.Locale
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.network.ServerInfo
import net.minecraft.client.world.ClientWorld
import net.minecraft.scoreboard.Scoreboard
import net.minecraft.scoreboard.ScoreboardDisplaySlot
import net.minecraft.scoreboard.ScoreboardEntry
import net.minecraft.scoreboard.ScoreboardObjective
import net.minecraft.scoreboard.Team
import net.minecraft.text.MutableText
import net.minecraft.text.Text
import net.minecraft.util.math.BlockPos
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object ضت : دِ("WayPoint", ظن.getRENDER(), "Waypoint Settings") {
   private final var awaitingEventDelayResponseUntil: Long
   private final var lastAutoEventDelayRequestContextKey: String?
   private final var lastKnownAnarchyNumber: Int?
   private const val EVENT_WAYPOINT_NAME: String = "Event"
   private final val eventCoordinatesRegex: Regex = Regex("\\[?(-?\\d+)\\s+(-?\\d+)\\s+(-?\\d+)\\]?")
   private final var pendingEventNameFromDelayAt: Long
   private final val eventCountdownSecondsRegex: Regex = Regex("(\\d+)\\s*(?:сек(?:унд(?:а|ы)?)?|s(?:ec(?:ond)?s?)?)", RegexOption.IGNORE_CASE)
   private final val eventNameLineRegex: Regex = Regex("\\|{3}\\s*\\[([^\\[\\]\\r\\n]+)]\\s*\\|{3}")
   private final val eventCountdownMinutesRegex: Regex = Regex("(\\d+)\\s*(?:мин(?:ут(?:а|ы)?)?|m(?:in(?:ute)?s?)?)", RegexOption.IGNORE_CASE)
   private final var deathHandled: Boolean
   private final val quickWaypointKey: ذُ = دِ.bind$default(ضت.INSTANCE, "Создать метку на месте", -1, null, 4, null)
   private const val BOXED_EVENT_HEADER: String = "╔══╦══╦══╦══╦══╦══╦══╦══╗"
   private final var pendingEventsApiName: String?

   private final val fadeWaypointHideDistance: طُ =
      دِ.slider$default(ضت.INSTANCE, "Затухание в радиусах блоков", 3.0F, 0.0F, 10.0F, 1.0F, null, 32, null).setVisible({ 
         fadeWaypointOnCloseDistance.getValue()
      })

   private const val DEFAULT_WAYPOINT_HIDE_DISTANCE: Float = 3.0F
   private const val AUTO_EVENT_DELAY_REQUEST_TICKS: Int = 40
   private final val anarchyRegex: Regex = Regex("(?:anarchy|анархия)\\s*[-#:]?\\s*(\\d{2,4})", RegexOption.IGNORE_CASE)
   private final var scheduledEventDelayRequestContextKey: String?
   private const val EVENT_DELAY_COMMAND: String = "event delay"
   private const val WAYPOINT_FADE_DISTANCE: Double = 4.0
   private final val eventDelayNameRegex: Regex = Regex("^\\s*\\[(\\d+)]\\s+([^:\\r\\n]+):\\s*$")
   private final var scheduledEventDelayRequestTick: Int = -1
   @JvmStatic
   private BlockPos lastAlivePos;
   private final var lastFunTimeSessionKey: String?
   public final val deathPoint: خذ = دِ.boolean$default(INSTANCE, "Авто-метка на месте вашей смерти", false, null, 4, null)
   private final val fadeWaypointOnCloseDistance: خذ = دِ.boolean$default(INSTANCE, "Затухание метки при приближении к ней", true, null, 4, null)
   private final var pendingEventsApiNameAt: Long
   private final var awaitingEventDelayResponse: Boolean
   private final val knownEventNames: List<Pair<String, String>> =
      CollectionsKt.listOf(
         "meteor shower" to "Meteor Shower",
         "death chest" to "Death Chest",
         "meteorite" to "Meteorite",
         "volcano" to "Volcano",
         "beacon" to "Beacon",
         "mystic" to "Mystic"
      )
      public final val autoEventPoint: خذ = دِ.boolean$default(INSTANCE, "Авто-метки на ивенты FunTime", true, null, 4, null)
   private const val EVENT_DELAY_CONTEXT_TIMEOUT_MS: Long = 6000L
   private const val AUTO_EVENT_DELAY_REQUEST_COOLDOWN_MS: Long = 15000L
   private final val removeLastWaypointKey: ذُ = دِ.bind$default(INSTANCE, "Кнопка удаления метки", -1, null, 4, null)
   private final val eventCountdownHoursRegex: Regex = Regex("(\\d+)\\s*(?:ч(?:ас(?:а|ов)?)?|h(?:ours?)?)", RegexOption.IGNORE_CASE)
   private const val DEATH_WAYPOINT_NAME: String = "Death Point"
   private final var pendingEventNameFromDelay: String?
   public final val showWaypoints: خذ = دِ.boolean$default(INSTANCE, "Отображать метки", true, null, 4, null)
   private final var lastAutoEventDelayRequestAt: Long

   private fun syncEventsApiMessage(rawMessage: String, normalizedMessage: String) {
      var var10000: Int = lastKnownAnarchyNumber
      if (lastKnownAnarchyNumber == null) {
         var10000 = this.findCurrentAnarchyNumber()
      }

      if (StringsKt.contains$default(normalizedMessage, "до следующего ивента", false, 2, null)
         || StringsKt.contains$default(normalizedMessage, "until next event", false, 2, null)) {
         var10000 = this.parseEventCountdownSeconds(normalizedMessage)
         if (var10000 != null) {
            خم.INSTANCE.syncWithLiveCountdown(var10000, var10000.intValue())
         }

         pendingEventsApiName = null
         pendingEventsApiNameAt = 0L
      } else {
         run label96@{
            val hasStatus: MatchResult = eventDelayNameRegex.matchEntire(StringsKt.trim(rawMessage).toString())
            if (hasStatus != null) {
               val pendingName: java.util.List = hasStatus.groupValues
               if (pendingName != null) {
                  val status: java.lang.String = CollectionsKt.getOrNull(pendingName, 2)
                  if (status != null) {
                     val var9: java.lang.String = StringsKt.trim(status).toString()
                     if (var9 != null) {
                        var18 = if (var9.length() > 0) var9 else null
                        return@label96
                     }
                  }
               }
            }

            var18 = null
         }

         if (var18 != null) {
            pendingEventsApiName = var18
            pendingEventsApiNameAt = System.currentTimeMillis()
         } else if (StringsKt.contains$default(normalizedMessage, "статус", false, 2, null)
            || StringsKt.contains$default(normalizedMessage, "status", false, 2, null)) {
            if (pendingEventsApiName != null) {
               val var14: java.lang.String = pendingEventsApiName
               if (System.currentTimeMillis() - pendingEventsApiNameAt > 6000L) {
                  pendingEventsApiName = null
                  pendingEventsApiNameAt = 0L
               } else {
                  val var19: شة = this.liveEventStatus(normalizedMessage)
                  if (var19 != null) {
                     خم.INSTANCE.syncWithLiveEvent(var10000, var14, var19, this.parseEventCountdownSeconds(normalizedMessage))
                  }
               }
            }
         }
      }
   }

   private fun resetEventDelayTracking(clearSession: Boolean) {
      this.clearScheduledEventDelayRequest()
      this.clearEventDelayContext()
      awaitingEventDelayResponse = false
      awaitingEventDelayResponseUntil = 0L
      if (clearSession) {
         lastFunTimeSessionKey = null
         lastKnownAnarchyNumber = null
         lastAutoEventDelayRequestContextKey = null
      }
   }

   private fun resetDeathTracking() {
      deathHandled = false
      lastAlivePos = null
   }

   public override fun toggle() {
   }

   private fun clearForServerContextSwitch() {
      this.clearScheduledEventDelayRequest()
      this.clearEventDelayContext()
      awaitingEventDelayResponse = false
      awaitingEventDelayResponseUntil = 0L
      pendingEventsApiName = null
      pendingEventsApiNameAt = 0L
      this.removeEventWaypoints()
   }

   fun extractEventCoordinates(raw: java.lang.String): BlockPos {
      val var10000: MatchResult = Regex.find$default(eventCoordinatesRegex, raw, 0, 2, null)
      if (var10000 == null) {
         null
      } else {
         val var6: Int = StringsKt.toIntOrNull(var10000.groupValues.get(1))
         if (var6 != null) {
            val x: Int = var6
            val var7: Int = StringsKt.toIntOrNull(var10000.groupValues.get(2))
            label26@
            if (var7 != null) {
               val y: Int = var7
               val var8: Int = StringsKt.toIntOrNull(var10000.groupValues.get(3))
               if (var8 != null) BlockPos(x, y, var8) else null
            } else {
               null
            }
         } else {
            null
         }
      }
   }

   private fun extractEventName(rawMessage: String, normalizedMessage: String): String? {
      var var10000: java.lang.String
      run label85@{
         val delayName: MatchResult = Regex.find$default(eventNameLineRegex, rawMessage, 0, 2, null)
         if (delayName != null) {
            val var5: java.util.List = delayName.groupValues
            if (var5 != null) {
               val `$this$firstOrNull$iv`: java.lang.String = CollectionsKt.getOrNull(var5, 1)
               if (`$this$firstOrNull$iv` != null) {
                  val `$i$f$firstOrNull`: java.lang.String = StringsKt.trim(`$this$firstOrNull$iv`).toString()
                  if (`$i$f$firstOrNull` != null) {
                     var10000 = if (`$i$f$firstOrNull`.length() > 0) `$i$f$firstOrNull` else null
                     return@label85
                  }
               }
            }
         }

         var10000 = null
      }

      if (var10000 != null) {
         return var10000
      } else {
         run label90@{
            val var14: MatchResult = eventDelayNameRegex.matchEntire(StringsKt.trim(rawMessage).toString())
            if (var14 != null) {
               val var15: java.util.List = var14.groupValues
               if (var15 != null) {
                  val var17: java.lang.String = CollectionsKt.getOrNull(var15, 2)
                  if (var17 != null) {
                     val var19: java.lang.String = StringsKt.trim(var17).toString()
                     if (var19 != null) {
                        var10000 = if (var19.length() > 0) var19 else null
                        return@label90
                     }
                  }
               }
            }

            var10000 = null
         }

         if (var10000 != null) {
            return var10000
         } else {
            val var20: java.util.Iterator = knownEventNames.iterator()

            while (true) {
               if (var20.hasNext()) {
                  val var22: Any = var20.next()
                  if (!StringsKt.contains$default(normalizedMessage, (var22 as Pair).component1() as java.lang.String, false, 2, null)) {
                     continue
                  }

                  var27 = var22
                  break
               }

               var27 = null
               break
            }

            return if (var27 as Pair != null) (var27 as Pair).second as java.lang.String else null
         }
      }
   }

   fun getAutoEventPoint(): خذ {
      autoEventPoint
   }

   fun getDeathPoint(): خذ {
      deathPoint
   }

   private fun buildEventDelayRequestContextKey(sessionKey: String, anarchyNumber: Int?): String {
      return if (anarchyNumber == null) "$sessionKey#pending" else "$sessionKey#anarchy:$anarchyNumber"
   }

   private fun parseEventCountdownSeconds(message: String): Int? {
      var var11: Int
      run label61@{
         val var10000: MatchResult = Regex.find$default(eventCountdownHoursRegex, message, 0, 2, null)
         if (var10000 != null) {
            val var8: java.util.List = var10000.groupValues
            if (var8 != null) {
               val var9: java.lang.String = CollectionsKt.getOrNull(var8, 1)
               if (var9 != null) {
                  val var10: Int = StringsKt.toIntOrNull(var9)
                  if (var10 != null) {
                     var11 = var10
                     return@label61
                  }
               }
            }
         }

         var11 = 0
      }

      run label66@{
         val var12: MatchResult = Regex.find$default(eventCountdownMinutesRegex, message, 0, 2, null)
         if (var12 != null) {
            val var13: java.util.List = var12.groupValues
            if (var13 != null) {
               val var14: java.lang.String = CollectionsKt.getOrNull(var13, 1)
               if (var14 != null) {
                  val var15: Int = StringsKt.toIntOrNull(var14)
                  if (var15 != null) {
                     var11 = var15
                     return@label66
                  }
               }
            }
         }

         var11 = 0
      }

      run label71@{
         val var17: MatchResult = Regex.find$default(eventCountdownSecondsRegex, message, 0, 2, null)
         if (var17 != null) {
            val var18: java.util.List = var17.groupValues
            if (var18 != null) {
               val var19: java.lang.String = CollectionsKt.getOrNull(var18, 1)
               if (var19 != null) {
                  val var20: Int = StringsKt.toIntOrNull(var19)
                  if (var20 != null) {
                     var11 = var20
                     return@label71
                  }
               }
            }
         }

         var11 = 0
      }

      val var5: Int = var11 * 3600 + var11 * 60 + var11
      return if (var5.intValue() > 0) var5 else null
   }

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      val var2: ClientPlayerEntity = ضك.getMc().player
      if (var2 == null) {
         this.resetDeathTracking()
         this.resetEventDelayTracking(true)
      } else if (ضك.getMc().world == null) {
         this.resetDeathTracking()
         this.resetEventDelayTracking(true)
      } else {
         this.updateEventDelayAutomation(var2)
         if (this.isPlayerAlive(var2)) {
            lastAlivePos = var2.getBlockPos()
            deathHandled = false
         } else if (!deathHandled) {
            deathHandled = true
            if (deathPoint.getValue()) {
               var var3: BlockPos = lastAlivePos
               if (lastAlivePos == null) {
                  var3 = var2.getBlockPos()
               }

               ذة.INSTANCE.put("Death Point", false, var3)
            }
         }
      }
   }

   @Commando
   public fun onKey(event: تز) {
      val var10000: Int = event.get(تز.Companion.getBUTTON())
      if (var10000 != null) {
         val button: Int = var10000
         if (!(event.get(تز.Companion.getMOUSE()) == true)) {
            if (!(event.get(تز.Companion.getRELEASE()) == true)) {
               if (ضك.getMc().player != null && ضك.getMc().world != null && ضك.getMc().currentScreen == null) {
                  if (quickWaypointKey.getValue().intValue() != -1 && quickWaypointKey.getValue().intValue() == button) {
                     ذة.INSTANCE.createQuickWaypoint()
                  } else {
                     if (removeLastWaypointKey.getValue().intValue() != -1 && removeLastWaypointKey.getValue().intValue() == button) {
                        ذة.INSTANCE.removeLastWaypoint()
                     }
                  }
               }
            }
         }
      }
   }

   private fun clearExpiredEventDelayState() {
      val now: Long = System.currentTimeMillis()
      if (awaitingEventDelayResponse && now > awaitingEventDelayResponseUntil) {
         awaitingEventDelayResponse = false
         awaitingEventDelayResponseUntil = 0L
      }

      if (pendingEventNameFromDelay != null && now - pendingEventNameFromDelayAt > 6000L) {
         this.clearEventDelayContext()
      }
   }

   fun handleIncomingMessage(message: Text) {
      var var10000: java.lang.String = message.getString()
      val var7: Locale = Locale.ROOT
      val var8: java.lang.String = var10000.toLowerCase(var7)
      this.syncEventsApiMessage(var10000, var8)
      if (autoEventPoint.getValue()) {
         if (!this.handleEventDelayMessage(var10000, var8)) {
            if (this.matchesEventMessage(var8)) {
               val var9: BlockPos = this.extractEventCoordinates(var10000)
               if (var9 != null) {
                  var10000 = this.extractEventName(var10000, var8)
                  if (var10000 == null) {
                     var10000 = "Event"
                  }

                  this.putEventWaypoint(var10000, var9)
               }
            }
         }
      }
   }

   private fun liveEventStatus(message: String): شة? {
      return if (StringsKt.contains$default(message, "начн", false, 2, null) && StringsKt.contains$default(message, "через", false, 2, null))
         شة.ACTIVATING
         else
         (
            if (StringsKt.contains$default(message, "откро", false, 2, null) && StringsKt.contains$default(message, "через", false, 2, null))
               شة.ACTIVATING
               else
               (
                  if (StringsKt.contains$default(message, "activat", false, 2, null) || StringsKt.contains$default(message, "starting", false, 2, null))
                     شة.ACTIVATING
                     else
                     (
                        if (StringsKt.contains$default(message, "лут", false, 2, null) || StringsKt.contains$default(message, "loot", false, 2, null))
                           شة.LOOTING
                           else
                           (
                              if (StringsKt.contains$default(message, "ожида", false, 2, null)
                                    || StringsKt.contains$default(message, "waiting", false, 2, null))
                                 شة.WAITING
                                 else
                                 (
                                    if (!StringsKt.contains$default(message, "открыт", false, 2, null)
                                          && !StringsKt.contains$default(message, "opened", false, 2, null))
                                       (
                                          if (!StringsKt.contains$default(message, "актив", false, 2, null)
                                                && !StringsKt.contains$default(message, "идёт", false, 2, null)
                                                && !StringsKt.contains$default(message, "running", false, 2, null)
                                                && !StringsKt.contains$default(message, "заверш", false, 2, null)
                                                && !StringsKt.contains$default(message, "закро", false, 2, null))
                                             null
                                             else
                                             شة.RUNNING
                                       )
                                       else
                                       شة.OPENED
                                 )
                           )
                     )
               )
         )
      }

   private fun removeEventWaypoints() {
      val `$this$filterTo$iv$iv`: java.lang.Iterable = ذة.INSTANCE.getWayPoints()
      val `element$iv`: java.util.Collection = ArrayList()

      for (`element$iv$iv` in `$this$filterTo$iv$iv`) {
         if ((`element$iv$iv` as تف).event) {
            `element$iv`.add(`element$iv$iv`)
         }
      }

      for (var13 in `element$iv` as java.util.List) {
         ذة.INSTANCE.remove((var13 as تف).name)
      }
   }

   fun putEventWaypoint(eventPos: java.lang.String, eventName: BlockPos) {
      this.removeEventWaypoints()
      if (ذة.INSTANCE.add(eventName, true, eventPos) === صق.ALREADY_EXISTS && !(eventName == "Event")) {
         ذة.INSTANCE.add("Event", true, eventPos)
      }
   }

   private fun handleEventDelayMessage(rawMessage: String, normalizedMessage: String): Boolean {
      this.clearExpiredEventDelayState()
      if (StringsKt.contains$default(normalizedMessage, "until next event", false, 2, null)) {
         this.removeEventWaypoints()
         this.clearEventDelayContext()
         awaitingEventDelayResponse = false
         awaitingEventDelayResponseUntil = 0L
         return true
      } else if (this.isEventDelayNameLine(rawMessage)) {
         var var7: java.lang.String = this.extractEventName(rawMessage, normalizedMessage)
         if (var7 == null) {
            var7 = "Event"
         }

         pendingEventNameFromDelay = var7
         pendingEventNameFromDelayAt = System.currentTimeMillis()
         touchEventDelayResponseTimeout$default(this, 0L, 1, null)
         return true
      } else if (!awaitingEventDelayResponse && pendingEventNameFromDelay == null) {
         return false
      } else if (StringsKt.contains$default(normalizedMessage, "[events]", false, 2, null)) {
         touchEventDelayResponseTimeout$default(this, 0L, 1, null)
         return true
      } else if (StringsKt.contains$default(rawMessage, "||", false, 2, null) && StringsKt.contains$default(normalizedMessage, "status", false, 2, null)) {
         pendingEventNameFromDelayAt = System.currentTimeMillis()
         touchEventDelayResponseTimeout$default(this, 0L, 1, null)
         return true
      } else if (StringsKt.contains$default(rawMessage, "||", false, 2, null) && StringsKt.contains$default(normalizedMessage, "coordinates", false, 2, null)) {
         val var10000: BlockPos = this.extractEventCoordinates(rawMessage)
         if (var10000 == null) {
            return false
         } else {
            var var6: java.lang.String = pendingEventNameFromDelay
            if (pendingEventNameFromDelay == null) {
               var6 = "Event"
            }

            this.putEventWaypoint(var6, var10000)
            this.clearEventDelayContext()
            awaitingEventDelayResponse = false
            awaitingEventDelayResponseUntil = 0L
            return true
         }
      } else {
         return false
      }
   }

   private fun isEventDelayNameLine(rawMessage: String): Boolean {
      return eventDelayNameRegex matches StringsKt.trim(rawMessage).toString() as java.lang.CharSequence
   }

   private fun clearScheduledEventDelayRequest() {
      scheduledEventDelayRequestTick = -1
      scheduledEventDelayRequestContextKey = null
   }

   public override fun canToggle(): Boolean {
      return false
   }

   private fun clearEventDelayContext() {
      pendingEventNameFromDelay = null
      pendingEventNameFromDelayAt = 0L
   }

   public override fun setEnabled(value: Boolean) {
      if (!super.isEnabled()) {
         super.setEnabled(true)
      }
   }

   private fun matchesEventMessage(raw: String): Boolean {
      if (StringsKt.contains$default(raw, "coordinates", false, 2, null)) {
         val var10000: java.lang.CharSequence = raw
         val var10001: Locale = Locale.ROOT
         val var4: java.lang.String = "╔══╦══╦══╦══╦══╦══╦══╦══╗".toLowerCase(var10001)
         if (StringsKt.contains$default(var10000, var4, false, 2, null)) {
            return true
         }
      }

      return StringsKt.contains$default(raw, "|||", false, 2, null) && StringsKt.contains$default(raw, "coordinates", false, 2, null)
   }

   fun isPlayerAlive(player: ClientPlayerEntity): Boolean {
      player.isAlive() && player.getHealth() > 0.0F && player.deathTime <= 0
   }

   private fun findCurrentAnarchyNumber(): Int? {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:736)
      //
      // Bytecode:
      // 000: invokestatic oxxxde/ضك.getMc ()Lnet/minecraft/client/MinecraftClient;
      // 003: getfield net/minecraft/client/MinecraftClient.world Lnet/minecraft/client/world/ClientWorld;
      // 006: dup
      // 007: ifnull 011
      // 00a: invokevirtual net/minecraft/client/world/ClientWorld.getScoreboard ()Lnet/minecraft/scoreboard/Scoreboard;
      // 00d: dup
      // 00e: ifnonnull 015
      // 011: pop
      // 012: aconst_null
      // 013: nop
      // 014: areturn
      // 015: astore 1
      // 016: aload 1
      // 017: astore 4
      // 019: getstatic net/minecraft/scoreboard/ScoreboardDisplaySlot.SIDEBAR Lnet/minecraft/scoreboard/ScoreboardDisplaySlot;
      // 01c: astore 5
      // 01e: bipush 0
      // 01f: nop
      // 020: istore 6
      // 022: aload 4
      // 024: aload 5
      // 026: invokevirtual net/minecraft/scoreboard/Scoreboard.getObjectiveForSlot (Lnet/minecraft/scoreboard/ScoreboardDisplaySlot;)Lnet/minecraft/scoreboard/ScoreboardObjective;
      // 029: dup
      // 02a: ifnonnull 031
      // 02d: pop
      // 02e: aconst_null
      // 02f: nop
      // 030: areturn
      // 031: astore 2
      // 032: new java/util/LinkedHashSet
      // 035: dup
      // 036: invokespecial java/util/LinkedHashSet.<init> ()V
      // 039: astore 3
      // 03a: aload 3
      // 03b: nop
      // 03c: aload 2
      // 03d: nop
      // 03e: invokevirtual net/minecraft/scoreboard/ScoreboardObjective.getDisplayName ()Lnet/minecraft/text/Text;
      // 041: invokeinterface net/minecraft/text/Text.getString ()Ljava/lang/String; 1
      // 046: invokestatic oxxxde/ضت.findCurrentAnarchyNumber$addCandidate (Ljava/util/LinkedHashSet;Ljava/lang/String;)V
      // 049: aload 1
      // 04a: astore 4
      // 04c: aload 2
      // 04d: nop
      // 04e: astore 5
      // 050: bipush 0
      // 051: nop
      // 052: istore 6
      // 054: aload 4
      // 056: aload 5
      // 058: invokevirtual net/minecraft/scoreboard/Scoreboard.getScoreboardEntries (Lnet/minecraft/scoreboard/ScoreboardObjective;)Ljava/util/Collection;
      // 05b: dup
      // 05c: ldc_w "listPlayerScores(...)"
      // 05f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 062: checkcast java/lang/Iterable
      // 065: astore 4
      // 067: nop
      // 068: bipush 0
      // 069: nop
      // 06a: istore 5
      // 06c: aload 4
      // 06e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 073: astore 6
      // 075: aload 6
      // 077: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07c: ifeq 194
      // 07f: aload 6
      // 081: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 086: astore 7
      // 088: aload 7
      // 08a: checkcast net/minecraft/scoreboard/ScoreboardEntry
      // 08d: astore 8
      // 08f: bipush 0
      // 090: nop
      // 091: istore 9
      // 093: aload 3
      // 094: nop
      // 095: aload 8
      // 097: invokevirtual net/minecraft/scoreboard/ScoreboardEntry.owner ()Ljava/lang/String;
      // 09a: invokestatic oxxxde/ضت.findCurrentAnarchyNumber$addCandidate (Ljava/util/LinkedHashSet;Ljava/lang/String;)V
      // 09d: aload 3
      // 09e: nop
      // 09f: aload 8
      // 0a1: astore 10
      // 0a3: bipush 0
      // 0a4: nop
      // 0a5: istore 11
      // 0a7: aload 10
      // 0a9: invokevirtual net/minecraft/scoreboard/ScoreboardEntry.name ()Lnet/minecraft/text/Text;
      // 0ac: dup
      // 0ad: ldc_w "ownerName(...)"
      // 0b0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b3: invokeinterface net/minecraft/text/Text.getString ()Ljava/lang/String; 1
      // 0b8: invokestatic oxxxde/ضت.findCurrentAnarchyNumber$addCandidate (Ljava/util/LinkedHashSet;Ljava/lang/String;)V
      // 0bb: aload 3
      // 0bc: nop
      // 0bd: aload 8
      // 0bf: invokevirtual net/minecraft/scoreboard/ScoreboardEntry.display ()Lnet/minecraft/text/Text;
      // 0c2: dup
      // 0c3: ifnull 0ce
      // 0c6: invokeinterface net/minecraft/text/Text.getString ()Ljava/lang/String; 1
      // 0cb: goto 0d1
      // 0ce: pop
      // 0cf: aconst_null
      // 0d0: nop
      // 0d1: invokestatic oxxxde/ضت.findCurrentAnarchyNumber$addCandidate (Ljava/util/LinkedHashSet;Ljava/lang/String;)V
      // 0d4: aload 1
      // 0d5: astore 11
      // 0d7: aload 8
      // 0d9: invokevirtual net/minecraft/scoreboard/ScoreboardEntry.owner ()Ljava/lang/String;
      // 0dc: dup
      // 0dd: ldc_w "owner(...)"
      // 0e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e3: astore 12
      // 0e5: bipush 0
      // 0e6: nop
      // 0e7: istore 13
      // 0e9: aload 11
      // 0eb: aload 12
      // 0ed: invokevirtual net/minecraft/scoreboard/Scoreboard.getScoreHolderTeam (Ljava/lang/String;)Lnet/minecraft/scoreboard/Team;
      // 0f0: dup
      // 0f1: ifnull 18d
      // 0f4: astore 12
      // 0f6: bipush 0
      // 0f7: nop
      // 0f8: istore 13
      // 0fa: aload 3
      // 0fb: nop
      // 0fc: aload 12
      // 0fe: invokestatic oxxxde/طث.getPrefix (Lnet/minecraft/scoreboard/Team;)Lnet/minecraft/text/Text;
      // 101: invokeinterface net/minecraft/text/Text.getString ()Ljava/lang/String; 1
      // 106: invokestatic oxxxde/ضت.findCurrentAnarchyNumber$addCandidate (Ljava/util/LinkedHashSet;Ljava/lang/String;)V
      // 109: aload 3
      // 10a: nop
      // 10b: aload 12
      // 10d: invokestatic oxxxde/طث.getSuffix (Lnet/minecraft/scoreboard/Team;)Lnet/minecraft/text/Text;
      // 110: invokeinterface net/minecraft/text/Text.getString ()Ljava/lang/String; 1
      // 115: invokestatic oxxxde/ضت.findCurrentAnarchyNumber$addCandidate (Ljava/util/LinkedHashSet;Ljava/lang/String;)V
      // 118: aload 3
      // 119: nop
      // 11a: aload 12
      // 11c: astore 14
      // 11e: aload 8
      // 120: invokevirtual net/minecraft/scoreboard/ScoreboardEntry.owner ()Ljava/lang/String;
      // 123: invokestatic net/minecraft/text/Text.literal (Ljava/lang/String;)Lnet/minecraft/text/MutableText;
      // 126: dup
      // 127: ldc_w "literal(...)"
      // 12a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 12d: checkcast net/minecraft/text/Text
      // 130: astore 15
      // 132: bipush 0
      // 133: nop
      // 134: istore 16
      // 136: aload 14
      // 138: aload 15
      // 13a: invokevirtual net/minecraft/scoreboard/Team.decorateName (Lnet/minecraft/text/Text;)Lnet/minecraft/text/MutableText;
      // 13d: dup
      // 13e: ldc_w "getFormattedName(...)"
      // 141: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 144: checkcast net/minecraft/text/Text
      // 147: invokeinterface net/minecraft/text/Text.getString ()Ljava/lang/String; 1
      // 14c: invokestatic oxxxde/ضت.findCurrentAnarchyNumber$addCandidate (Ljava/util/LinkedHashSet;Ljava/lang/String;)V
      // 14f: aload 3
      // 150: nop
      // 151: aload 12
      // 153: astore 14
      // 155: aload 8
      // 157: astore 15
      // 159: bipush 0
      // 15a: nop
      // 15b: istore 16
      // 15d: aload 15
      // 15f: invokevirtual net/minecraft/scoreboard/ScoreboardEntry.name ()Lnet/minecraft/text/Text;
      // 162: dup
      // 163: ldc_w "ownerName(...)"
      // 166: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 169: astore 15
      // 16b: nop
      // 16c: bipush 0
      // 16d: nop
      // 16e: istore 16
      // 170: aload 14
      // 172: aload 15
      // 174: invokevirtual net/minecraft/scoreboard/Team.decorateName (Lnet/minecraft/text/Text;)Lnet/minecraft/text/MutableText;
      // 177: dup
      // 178: ldc_w "getFormattedName(...)"
      // 17b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 17e: checkcast net/minecraft/text/Text
      // 181: invokeinterface net/minecraft/text/Text.getString ()Ljava/lang/String; 1
      // 186: invokestatic oxxxde/ضت.findCurrentAnarchyNumber$addCandidate (Ljava/util/LinkedHashSet;Ljava/lang/String;)V
      // 189: nop
      // 18a: goto 18f
      // 18d: pop
      // 18e: nop
      // 18f: nop
      // 190: nop
      // 191: goto 075
      // 194: nop
      // 195: aload 3
      // 196: nop
      // 197: checkcast java/lang/Iterable
      // 19a: invokestatic kotlin/collections/CollectionsKt.asSequence (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
      // 19d: new oxxxde/دل
      // 1a0: dup
      // 1a1: aload 0
      // 1a2: invokespecial oxxxde/دل.<init> (Ljava/lang/Object;)V
      // 1a5: checkcast kotlin/jvm/functions/Function1
      // 1a8: invokestatic kotlin/sequences/SequencesKt.mapNotNull (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
      // 1ab: invokestatic kotlin/sequences/SequencesKt.firstOrNull (Lkotlin/sequences/Sequence;)Ljava/lang/Object;
      // 1ae: checkcast java/lang/Integer
      // 1b1: areturn
   }

   private fun buildFunTimeSessionKey(world: Any): String {
      val var10000: ServerInfo = ضك.getMc().getCurrentServerEntry()
      var var4: java.lang.String = if (var10000 != null && var10000.address != null) StringsKt.trim(var10000.address).toString() else null
      if (var4 == null) {
         var4 = ""
      }

      return "$var4#${System.identityHashCode(world)}"
   }

   private fun scheduleEventDelayRequest(targetTick: Int, contextKey: String) {
      scheduledEventDelayRequestTick = targetTick
      scheduledEventDelayRequestContextKey = contextKey
   }

   public fun waypointAlphaByDistance(distance: Double): Float {
      if (!fadeWaypointOnCloseDistance.getValue()) {
         return 1.0F
      } else {
         val hideDistance: Double = fadeWaypointHideDistance.getValue().floatValue()
         val fadeStartDistance: Double = hideDistance + 4.0
         if (distance <= hideDistance) {
            return 0.0F
         } else if (distance >= fadeStartDistance) {
            return 1.0F
         } else {
            return if (fadeStartDistance - hideDistance <= 0.0)
               1.0F
               else
               RangesKt.coerceIn((float)((distance - hideDistance) / (fadeStartDistance - hideDistance)), 0.0F, 1.0F)
            }
      }
   }

   public fun applyLegacyBindIfNeeded(key: Int) {
      if (key != -1 && quickWaypointKey.getValue().intValue() == -1) {
         quickWaypointKey.setKey(key)
      }
   }

   fun getShowWaypoints(): خذ {
      showWaypoints
   }

   private fun trySendEventDelayRequest(contextKey: String): Boolean {
      if (ضك.getMc().currentScreen != null) {
         return false
      } else {
         val var10000: ClientPlayNetworkHandler = ضك.getMc().getNetworkHandler()
         if (var10000 == null) {
            return false
         } else {
            val now: Long = System.currentTimeMillis()
            if (contextKey == lastAutoEventDelayRequestContextKey && now - lastAutoEventDelayRequestAt < 15000L) {
               return true
            } else {
               lastAutoEventDelayRequestAt = now
               lastAutoEventDelayRequestContextKey = contextKey
               this.touchEventDelayResponseTimeout(now)
               this.clearEventDelayContext()
               var10000.sendChatCommand("event delay")
               return true
            }
         }
      }
   }

   private fun touchEventDelayResponseTimeout(now: Long = System.currentTimeMillis()) {
      awaitingEventDelayResponse = true
      awaitingEventDelayResponseUntil = now + 6000L
   }

   public override fun canBind(): Boolean {
      return false
   }

   private fun extractAnarchyNumber(raw: String): Int? {
      val var2: MatchResult = Regex.find$default(anarchyRegex, raw, 0, 2, null)
      if (var2 != null) {
         val var3: java.util.List = var2.groupValues
         if (var3 != null) {
            val var4: java.lang.String = CollectionsKt.getOrNull(var3, 1)
            if (var4 != null) {
               return StringsKt.toIntOrNull(var4)
            }
         }
      }

      return null
   }

   @JvmStatic
   fun {
      INSTANCE.setVisibleInGui({ 
         false
      })
      INSTANCE.setEnabled(true)
   }
}
