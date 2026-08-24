package oxxxde

import java.util.LinkedHashSet
import java.util.Locale
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.world.ClientWorld
import net.minecraft.scoreboard.Scoreboard
import net.minecraft.scoreboard.ScoreboardDisplaySlot
import net.minecraft.scoreboard.ScoreboardEntry
import net.minecraft.scoreboard.ScoreboardObjective
import net.minecraft.scoreboard.Team
import net.minecraft.text.MutableText
import net.minecraft.text.Text
import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ثة : دِ("AutoInvest", ظن.getPLAYER(), "Автоматически слаживает деньги в клан") {
   private final var pendingUntil: Long
   private const val INVEST_RETRY_DELAY_MS: Long = 500L
   private final var pendingBalanceBeforeInvest: Long?
   private final val balanceKeywords: List<String> = CollectionsKt.listOf("монет", "баланс", "coins", "balance")
   private final var pendingInvestAmount: Long
   private const val INVEST_COMMAND_COOLDOWN_MS: Long = 1250L
   private final val investAmount: عت = دِ.text$default(INSTANCE, "Сумма", "100000", 16, null, 8, null)
   private final val NUMBER_REGEX: Regex = Regex("\\d[\\d\\s.,_]*")
   private const val INVEST_CONFIRM_TIMEOUT_MS: Long = 4000L
   private final var nextInvestAt: Long

   @JvmStatic
   fun {
      اُ.moduleOnFuntime$default(اُ.INSTANCE, INSTANCE, null, 2, null)
   }

   public override fun onEnable() {
      this.resetState()
   }

   private fun isInvestmentApplied(currentBalance: Long): Boolean {
      return pendingBalanceBeforeInvest != null && currentBalance <= RangesKt.coerceAtLeast(pendingBalanceBeforeInvest - pendingInvestAmount, 0L)
   }

   @JvmStatic
   fun `findSidebarBalance$addCandidate`(candidates: LinkedHashSet<java.lang.String>, value: java.lang.String) {
      val sanitized: java.lang.String = INSTANCE.sanitizeScoreboardLine(value)
      if (sanitized.length() > 0) {
         candidates.add(sanitized)
      }
   }

   private fun findSidebarBalance(): Long? {
      val var10000: ClientWorld = ضك.getMc().world
      if (var10000 != null) {
         val var63: Scoreboard = var10000.getScoreboard()
         if (var63 != null) {
            val scoreboard: Scoreboard = var63
            val var64: ScoreboardObjective = var63.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR)
            if (var64 == null) {
               return null
            }

            val candidates: LinkedHashSet = LinkedHashSet()
            findSidebarBalance$addCandidate(candidates, var64.getDisplayName().getString())
            val var65: java.util.Collection = var63.getScoreboardEntries(var64)

            for (p0 in var65) {
               val var8: ScoreboardEntry = p0 as ScoreboardEntry
               findSidebarBalance$addCandidate(candidates, (p0 as ScoreboardEntry).owner())
               var var10001: Text = var8.name()
               findSidebarBalance$addCandidate(candidates, var10001.getString())
               var10001 = var8.display()
               findSidebarBalance$addCandidate(candidates, if (var10001 != null) var10001.getString() else null)
               val var66: java.lang.String = var8.owner()
               val var67: Team = scoreboard.getScoreHolderTeam(var66)
               if (var67 != null) {
                  findSidebarBalance$addCandidate(candidates, طث.getPrefix(var67).getString())
                  findSidebarBalance$addCandidate(candidates, طث.getSuffix(var67).getString())
                  val var78: MutableText = Text.literal(var8.owner())
                  val var79: MutableText = var67.decorateName(var78 as Text)
                  findSidebarBalance$addCandidate(candidates, (var79 as Text).getString())
                  var10001 = var8.name()
                  val var81: MutableText = var67.decorateName(var10001)
                  findSidebarBalance$addCandidate(candidates, (var81 as Text).getString())
               }
            }

            val var30: java.util.Iterator = candidates.iterator()

            while (true) {
               if (!var30.hasNext()) {
                  var71 = null
                  break
               }

               val var33: Any = var30.next()
               val var36: java.lang.String = var33 as java.lang.String
               val var41: java.lang.String = var33 as java.lang.String
               val var68: Locale = Locale.ROOT
               val var69: java.lang.String = var41.toLowerCase(var68)
               val var45: java.lang.String = var69
               val var42: java.lang.Iterable = balanceKeywords
               var var70: Boolean
               if (balanceKeywords is java.util.Collection && balanceKeywords.isEmpty()) {
                  var70 = false
               } else {
                  val var52: java.util.Iterator = var42.iterator()

                  while (true) {
                     if (!var52.hasNext()) {
                        var70 = false
                        break
                     }

                     if (StringsKt.contains$default(var45, var52.next() as java.lang.CharSequence, false, 2, null)) {
                        var70 = true
                        break
                     }
                  }
               }

               if (var70 && INSTANCE.parseLargestPositiveNumber(var36) != null) {
                  var71 = var33
                  break
               }
            }

            val var21: java.lang.String = var71 as java.lang.String
            if (var71 as java.lang.String != null) {
               return this.parseLargestPositiveNumber(var21)
            }

            val var34: java.util.Iterator = candidates.iterator()

            while (true) {
               if (!var34.hasNext()) {
                  var75 = null
                  break
               }

               val var37: Any = var34.next()
               val var39: java.lang.String = var37 as java.lang.String
               val var46: java.lang.String = var37 as java.lang.String
               val var72: Locale = Locale.ROOT
               val var73: java.lang.String = var46.toLowerCase(var72)
               val var50: java.lang.String = var73
               val var47: java.lang.Iterable = balanceKeywords
               var var74: Boolean
               if (balanceKeywords is java.util.Collection && balanceKeywords.isEmpty()) {
                  var74 = false
               } else {
                  val var57: java.util.Iterator = var47.iterator()

                  while (true) {
                     if (!var57.hasNext()) {
                        var74 = false
                        break
                     }

                     if (StringsKt.contains$default(var50, var57.next() as java.lang.CharSequence, false, 2, null)) {
                        var74 = true
                        break
                     }
                  }
               }

               if (var74 && INSTANCE.parseLargestPositiveNumber(var39) != null) {
                  var75 = var37
                  break
               }
            }

            return if (var75 as java.lang.String != null) this.parseLargestPositiveNumber(var75 as java.lang.String) else null
         }
      }

      return null
   }

   private fun resetState() {
      this.clearPendingInvestment()
      nextInvestAt = 0L
   }

   private fun parseLargestPositiveNumber(text: String): Long? {
      val matches: Sequence = Regex.findAll$default(NUMBER_REGEX, text, 0, 2, null)
      var largest: java.lang.Long = null

      for (`element$iv` in matches) {
         val `$this$filterTo$iv$iv`: java.lang.CharSequence = (`element$iv` as MatchResult).value
         val `destination$iv$iv`: Appendable = StringBuilder()
         var `index$iv$iv`: Int = 0

         for (var16 in `$this$filterTo$iv$iv`.length()..`index$iv$iv`) {
            val `element$iv$iv`: Char = `$this$filterTo$iv$iv`.charAt(`index$iv$iv`)
            if (Character.isDigit(`element$iv$iv`)) {
               `destination$iv$iv`.append(`element$iv$iv`)
            }
         }

         val var10000: java.lang.Long = StringsKt.toLongOrNull((`destination$iv$iv` as StringBuilder).toString())
         if (var10000 != null) {
            val candidate: Long = var10000
            if (largest == null || candidate > largest.longValue()) {
               largest = candidate
            }
         }
      }

      return largest
   }

   private fun sanitizeScoreboardLine(value: String?): String {
      var var10000: java.lang.String
      run label21@{
         if (value != null) {
            val var2: java.lang.String = StringsKt.replace$default(value, ' ', ' ', false, 4, null)
            if (var2 != null) {
               var10000 = StringsKt.trim(var2).toString()
               return@label21
            }
         }

         var10000 = null
      }

      if (var10000 == null) {
         var10000 = ""
      }

      return var10000
   }

   public override fun onDisable() {
      this.resetState()
   }

   private fun clearPendingInvestment() {
      pendingBalanceBeforeInvest = null
      pendingInvestAmount = 0L
      pendingUntil = 0L
   }

   private fun configuredInvestAmount(): Long? {
      val `$this$filterTo$iv$iv`: java.lang.CharSequence = investAmount.getValue()
      val it: Appendable = StringBuilder()
      var var7: Int = 0

      for (var8 in `$this$filterTo$iv$iv`.length()..var7) {
         val `element$iv$iv`: Char = `$this$filterTo$iv$iv`.charAt(var7)
         if (Character.isDigit(`element$iv$iv`)) {
            it.append(`element$iv$iv`)
         }
      }

      val var10000: java.lang.Long = StringsKt.toLongOrNull((it as StringBuilder).toString())
      if (var10000 != null) {
         val var13: java.lang.Long = var10000
         return if (var13.longValue() > 0L) var13 else null
      } else {
         return null
      }
   }

   private fun hasOpenGui(): Boolean {
      return صص.INSTANCE.getCustomScreen() != null || ضك.getMc().currentScreen != null
   }

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      val var2: ClientPlayerEntity = ضك.getMc().player
      if (var2 == null || ضك.getMc().world == null || !ضه.INSTANCE.isFunTimeContext() || !var2.isAlive() || var2.isSpectator()) {
         this.resetState()
      } else if (!this.hasOpenGui()) {
         val var3: java.lang.Long = this.configuredInvestAmount()
         if (var3 != null) {
            val var4: Long = var3
            val var6: java.lang.Long = this.findSidebarBalance()
            if (var6 != null) {
               val var7: Long = var6
               val var9: ClientPlayNetworkHandler = ضك.getMc().getNetworkHandler()
               if (var9 != null) {
                  val var10: Long = System.currentTimeMillis()
                  if (pendingBalanceBeforeInvest != null) {
                     if (this.isInvestmentApplied(var7)) {
                        this.clearPendingInvestment()
                     } else {
                        if (var10 < pendingUntil) {
                           return
                        }

                        this.clearPendingInvestment()
                        nextInvestAt = Math.max(nextInvestAt, var10 + (long)500)
                     }
                  }

                  if (var10 >= nextInvestAt) {
                     var9.sendChatCommand(lamda$onUpdate$1_20fdaf3e(var4))
                     pendingBalanceBeforeInvest = var7
                     pendingInvestAmount = var4
                     pendingUntil = var10 + 4000
                     nextInvestAt = var10 + 1250
                  }
               }
            }
         }
      }
   }
}
