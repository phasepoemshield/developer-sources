package oxxxde

import java.util.ArrayList
import java.util.Locale
import kotakbaz.rain.ui.inventory.FunTimeOnlineHelperController$MenuKind
import kotakbaz.rain.ui.inventory.FunTimeOnlineHelperController$ServerCandidate
import kotakbaz.rain.ui.inventory.FunTimeOnlineHelperController$State
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
import net.fabricmc.fabric.api.networking.v1.PacketSender
import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.screen.ingame.HandledScreen
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.network.ClientPlayerInteractionManager
import net.minecraft.component.DataComponentTypes
import net.minecraft.component.type.LoreComponent
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.screen.GenericContainerScreenHandler
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.slot.SlotActionType
import net.minecraft.text.Text

// $VF: Compiled from heavy
public object بم {
   private final var nextActionAt: Long
   private final val anarchyRegex: Regex = Regex("анархия\\s*[-#:]?\\s*(\\d+)", RegexOption.IGNORE_CASE)
   private const val STEP_TIMEOUT_MS: Long = 6000L
   private final val teamLoreRegex: Regex = Regex("игроков\\s+в\\s+команде\\s*:\\s*(\\d+)", RegexOption.IGNORE_CASE)
   private final var startedAt: Long
   private final var stateStartedAt: Long
   @JvmStatic
   private FunTimeOnlineHelperController$ServerCandidate bestServer;
   private final var initialized: Boolean
   private final var expectedTeam: Int = 1
   private final var clicking: Boolean
   @JvmStatic
   private FunTimeOnlineHelperController$State state = FunTimeOnlineHelperController$State.IDLE;
   private const val TOTAL_TIMEOUT_MS: Long = 25000L
   private const val ACTION_DELAY_MS: Long = 300L
   private final var teamIndex: Int
   private final val teamNameRegex: Regex = Regex("команд[аы]?\\s*[xх×]\\s*(\\d+)", RegexOption.IGNORE_CASE)
   private const val EMPTY_TEAM_WAIT_MS: Long = 900L
   private final val teamSizes: IntArray = intArrayOf(1, 2, 3, 5, 10)
   private final val onlineRegex: Regex = Regex("онлайн\\s+режима\\s*:\\s*(\\d+)\\s*/\\s*(\\d+)", RegexOption.IGNORE_CASE)

   fun findTeamSlot(teamSize: GenericContainerScreenHandler, menu: Int): Int {
      this.findSlot(menu, lambda_0@{ stack: ItemStack ->
         val var10000: Regex = teamNameRegex
         val var10001: بم = INSTANCE
         val var10002: java.lang.String = stack.getName().getString()
         val var2: MatchResult = Regex.find$default(var10000, var10001.normalize(var10002), 0, 2, null)
         if (var2 != null) {
            val var3: java.util.List = var2.groupValues
            if (var3 != null) {
               val var4: java.lang.String = CollectionsKt.getOrNull(var3, 1)
               if (var4 != null) {
                  val var7: Int = StringsKt.toIntOrNull(var4)
                  if (var7 != null && var7 == `$teamSize`) {
                     return@lambda_0 true
                  }

                  return@lambda_0 false
               }
            }
         }

         return@lambda_0 false
      })
   }

   fun joinBest(player: GenericContainerScreenHandler, now: PlayerEntity, menu: FunTimeOnlineHelperController$MenuKind, kind: Long) {
      if (kind != FunTimeOnlineHelperController$MenuKind.SERVERS) {
         this.waitOrFail(now, "Online Helper: список серверов закрыт")
      } else if (bestServer == null) {
         this.fail("Online Helper: результат поиска потерян")
      } else {
         val best: FunTimeOnlineHelperController$ServerCandidate = bestServer
         val var10: java.util.Iterator = this.serverCandidates(menu).iterator()

         var var10000: Any
         while (true) {
            if (!var10.hasNext()) {
               var10000 = null
               break
            }

            val `element$iv`: Any = var10.next()
            if ((`element$iv` as FunTimeOnlineHelperController$ServerCandidate).teamSize == best.teamSize
               && (`element$iv` as FunTimeOnlineHelperController$ServerCandidate).anarchy == best.anarchy
               && (`element$iv` as FunTimeOnlineHelperController$ServerCandidate).online > 0) {
               var10000 = (FunTimeOnlineHelperController$ServerCandidate)`element$iv`
               break
            }
         }

         var10000 = var10000
         if (var10000 == null) {
            this.waitOrFail(now, "Online Helper: анархия ${best.anarchy} больше недоступна")
         } else {
            this.click(menu, player, var10000.slot)
            this.showStatus("Online Helper: анархия ${var10000.anarchy}, онлайн ${var10000.online}/${var10000.capacity}")
            this.stop()
         }
      }
   }

   fun shouldShowButton(title: Text): Boolean {
      val var10000: FunTimeOnlineHelperController$MenuKind = this.menuKind(title)
      var10000 != null && ضه.INSTANCE.isFunTime() && (var10000 === FunTimeOnlineHelperController$MenuKind.ROOT || this.isRunning)
   }

   private fun transition(nextState: ذف, delay: Long = ...) {
      state = nextState
      stateStartedAt = System.currentTimeMillis()
      nextActionAt = stateStartedAt + delay
   }

   private fun normalize(value: String): String {
      val var10000: Locale = Locale.ROOT
      val var6: java.lang.String = value.toLowerCase(var10000)
      return StringsKt.trim(Regex("\\s+").replace(var6, " ")).toString()
   }

   public fun shouldBlockInventoryClick(): Boolean {
      return this.isRunning && !clicking
   }

   fun selectAnarchyMode(now: GenericContainerScreenHandler, menu: PlayerEntity, player: FunTimeOnlineHelperController$MenuKind, kind: Long) {
      if (kind === FunTimeOnlineHelperController$MenuKind.TEAM || kind === FunTimeOnlineHelperController$MenuKind.SERVERS) {
         transition$default(this, FunTimeOnlineHelperController$State.SELECT_TEAM, 0L, 2, null)
      } else if (kind != FunTimeOnlineHelperController$MenuKind.ROOT) {
         this.waitOrFail(now, "Online Helper: режим анархии не найден")
      } else {
         val var10000: Int = this.findSlot(menu, { stack: ItemStack ->
            val var10000: بم = INSTANCE
            val var10001: java.lang.String = stack.getName().getString()
            StringsKt.contains$default(var10000.normalize(var10001), "анархия 1.21.11", false, 2, null)
         })
         if (var10000 != null) {
            this.click(menu, player, var10000)
            transition$default(this, FunTimeOnlineHelperController$State.SELECT_TEAM, 0L, 2, null)
         } else {
            this.waitOrFail(now, "Online Helper: режим анархии 1.21.11 не найден")
         }
      }
   }

   private fun tick() {
      if (this.isRunning) {
         val now: Long = System.currentTimeMillis()
         if (now - startedAt >= 25000L) {
            this.fail("Online Helper: превышено время ожидания")
         } else if (now >= nextActionAt) {
            val player: Screen = ضك.getMc().currentScreen
            val var10000: HandledScreen = player as? HandledScreen
            if ((player as? HandledScreen) == null) {
               this.fail("Online Helper: меню было закрыто")
            } else {
               val kind: ScreenHandler = var10000.getScreenHandler()
               val var15: GenericContainerScreenHandler = kind as? GenericContainerScreenHandler
               if ((kind as? GenericContainerScreenHandler) == null) {
                  this.fail("Online Helper: неподдерживаемое меню")
               } else {
                  val var16: ClientPlayerEntity = ضك.getMc().player
                  if (var16 == null) {
                     this.stop()
                  } else if (ضه.INSTANCE.isFunTime() && var16.currentScreenHandler === var15 && ضك.getMc().interactionManager != null) {
                     val var10001: Text = var10000.getTitle()
                     val var11: FunTimeOnlineHelperController$MenuKind = this.menuKind(var10001)
                     if (var11 == null) {
                        if (now - stateStartedAt >= 6000L) {
                           this.fail("Online Helper: меню FunTime не распознано")
                        }
                     } else {
                        when (خؤ.$EnumSwitchMapping$0[state.ordinal()]) {
                           1 -> {}
                           2 -> this.selectAnarchyMode(var15, var16 as PlayerEntity, var11, now)
                           3 -> this.selectTeam(var15, var16 as PlayerEntity, var11, now)
                           4 -> this.scanTeam(var15, var16 as PlayerEntity, var11, now)
                           5 -> this.selectBestTeam(var15, var16 as PlayerEntity, var11, now)
                           6 -> this.waitForBestServer(var15, var16 as PlayerEntity, var11, now)
                           7 -> this.joinBest(var15, var16 as PlayerEntity, var11, now)
                           else -> throw NoWhenBranchMatchedException()
                        }
                     }
                  } else {
                     this.stop()
                  }
               }
            }
         }
      }
   }

   public final val statusText: String
      public final get() {
         var var10000: java.lang.String
         when (خؤ.$EnumSwitchMapping$0[state.ordinal()]) {
            1 -> var10000 = "Найти анархию с минимальным онлайном"
            2 -> var10000 = "Открываю список анархий..."
            3, 4 -> var10000 = "Проверяю команды x${expectedTeam}..."
            5, 6 -> {
               val server: FunTimeOnlineHelperController$ServerCandidate = bestServer
               var10000 = if (bestServer == null) "Выбираю лучший сервер..." else "Анархия ${bestServer.anarchy}: ${server.online}/${server.capacity}"
            }
            7 -> var10000 = "Вхожу на найденную анархию..."
            else -> throw NoWhenBranchMatchedException()
         }

         return var10000
      }


   fun selectBestTeam(kind: GenericContainerScreenHandler, player: PlayerEntity, now: FunTimeOnlineHelperController$MenuKind, menu: Long) {
      if (kind != FunTimeOnlineHelperController$MenuKind.SERVERS && kind != FunTimeOnlineHelperController$MenuKind.TEAM) {
         this.waitOrFail(now, "Online Helper: не удалось вернуться к лучшей группе")
      } else {
         val var10000: Int = this.findTeamSlot(menu, expectedTeam)
         if (var10000 != null) {
            this.click(menu, player, var10000)
            transition$default(this, FunTimeOnlineHelperController$State.WAIT_BEST_SERVER, 0L, 2, null)
         } else {
            this.waitOrFail(now, "Online Helper: команды x${expectedTeam} не найдены")
         }
      }
   }

   fun containerSize(menu: GenericContainerScreenHandler): Int {
      menu.getRows() * 9
   }

   fun selectTeam(now: GenericContainerScreenHandler, kind: PlayerEntity, menu: FunTimeOnlineHelperController$MenuKind, player: Long) {
      if (kind === FunTimeOnlineHelperController$MenuKind.ROOT) {
         this.waitOrFail(now, "Online Helper: список команд не открылся")
      } else {
         val var10000: Int = this.findTeamSlot(menu, expectedTeam)
         if (var10000 != null) {
            this.click(menu, player, var10000)
            transition$default(this, FunTimeOnlineHelperController$State.WAIT_SERVERS, 0L, 2, null)
         } else {
            this.waitOrFail(now, "Online Helper: команды x${expectedTeam} не найдены")
         }
      }
   }

   public fun initialize() {
      if (!initialized) {
         initialized = true
         ClientTickEvents.END_CLIENT_TICK.register({ it: MinecraftClient ->
            INSTANCE.tick()
         })
         ClientPlayConnectionEvents.JOIN.register({ var0: ClientPlayNetworkHandler, var1: PacketSender, var2: MinecraftClient ->
            INSTANCE.stop()
         })
         ClientPlayConnectionEvents.DISCONNECT.register({ var0: ClientPlayNetworkHandler, var1: MinecraftClient ->
            INSTANCE.stop()
         })
      }
   }

   private fun stop() {
      state = FunTimeOnlineHelperController$State.IDLE
      teamIndex = 0
      expectedTeam = ArraysKt.first(teamSizes)
      bestServer = null
      startedAt = 0L
      stateStartedAt = 0L
      nextActionAt = 0L
      clicking = false
   }

   fun toggle(menu: GenericContainerScreenHandler, title: Text) {
      if (this.isRunning) {
         this.stop()
         this.showStatus("Online Helper остановлен")
      } else if (ضه.INSTANCE.isFunTime() && this.menuKind(title) === FunTimeOnlineHelperController$MenuKind.ROOT) {
         val var10000: ClientPlayerEntity = ضك.getMc().player
         if (var10000 != null) {
            if (ضك.getMc().interactionManager != null && var10000.currentScreenHandler === menu && menu.getCursorStack().isEmpty()) {
               teamIndex = 0
               expectedTeam = ArraysKt.first(teamSizes)
               bestServer = null
               startedAt = System.currentTimeMillis()
               this.transition(FunTimeOnlineHelperController$State.SELECT_ANARCHY, 0L)
            }
         }
      }
   }

   fun menuKind(title: Text): FunTimeOnlineHelperController$MenuKind {
      val var10001: java.lang.String = title.getString()
      val value: java.lang.String = this.normalize(var10001)
      if (StringsKt.contains$default(value, "выберите тип режима", false, 2, null))
         FunTimeOnlineHelperController$MenuKind.TEAM
         else
         (
            if (StringsKt.contains$default(value, "выберите сервер", false, 2, null))
               FunTimeOnlineHelperController$MenuKind.SERVERS
               else
               (if (StringsKt.contains$default(value, "выберите режим", false, 2, null)) FunTimeOnlineHelperController$MenuKind.ROOT else null)
         )
      }

   fun click(slot: GenericContainerScreenHandler, player: PlayerEntity, menu: Int) {
      clicking = true

      try {
         val var10000: ClientPlayerInteractionManager = ضك.getMc().interactionManager
         if (var10000 != null) {
            var10000.clickSlot(menu.syncId, slot, 0, SlotActionType.PICKUP, player)
         }

         menu.sendContentUpdates()
      } finally {
         clicking = false
      }
   }

   private fun fail(message: String) {
      this.showStatus(message)
      this.stop()
   }

   private fun waitOrFail(now: Long, message: String) {
      if (now - stateStartedAt >= 6000L) {
         this.fail(message)
      }
   }

   fun findSlot(menu: GenericContainerScreenHandler, predicate: (ItemStack?) -> java.lang.Boolean): Int {
      val var5: java.util.Iterator = RangesKt.until((int)0, (int)this.containerSize(menu)).iterator()

      var var10: Any
      while (true) {
         if (!var5.hasNext()) {
            var10 = null
            break
         }

         val `element$iv`: Any = var5.next()
         val var10000: ItemStack = menu.getSlot((`element$iv` as java.lang.Number).intValue()).getStack()
         if (!var10000.isEmpty() && predicate(var10000) as java.lang.Boolean) {
            var10 = `element$iv`
            break
         }
      }

      var10 as Int
   }

   fun serverCandidates(menu: GenericContainerScreenHandler): MutableList<FunTimeOnlineHelperController$ServerCandidate> {
      val `$this$mapNotNullTo$iv$iv`: java.lang.Iterable = RangesKt.until((int)0, (int)this.containerSize(menu))
      val `destination$iv$iv`: java.util.Collection = ArrayList()
      val var9: java.util.Iterator = `$this$mapNotNullTo$iv$iv`.iterator()

      while (var9.hasNext()) {
         val slot: Int = (var9 as IntIterator).nextInt()
         val var10000: ItemStack = menu.getSlot(slot).getStack()
         var var29: FunTimeOnlineHelperController$ServerCandidate
         if (var10000.isEmpty()) {
            var29 = null
         } else {
            run label96@{
               val var30: Regex = anarchyRegex
               val var10001: بم = INSTANCE
               val var10002: java.lang.String = var10000.getName().getString()
               val lore: MatchResult = Regex.find$default(var30, var10001.normalize(var10002), 0, 2, null)
               if (lore != null) {
                  val onlineMatch: java.util.List = lore.groupValues
                  if (onlineMatch != null) {
                     val teamMatch: java.lang.String = CollectionsKt.getOrNull(onlineMatch, 1)
                     if (teamMatch != null) {
                        val online: Int = StringsKt.toIntOrNull(teamMatch)
                        if (online != null) {
                           val anarchy: Int = online
                           val var31: LoreComponent = var10000.get(DataComponentTypes.LORE) as LoreComponent
                           var var32: java.util.List = if (var31 != null) var31.lines() else null
                           if (var32 == null) {
                              var32 = CollectionsKt.emptyList()
                           }

                           val var25: java.lang.String = CollectionsKt.joinToString$default(var32, "\n", null, null, 0, null, { it: Text ->
                              val var10000: بم = INSTANCE
                              val var10001: java.lang.String = it.getString()
                              var10000.normalize(var10001) as java.lang.CharSequence
                           }, 30, null)
                           val var33: MatchResult = Regex.find$default(onlineRegex, var25, 0, 2, null)
                           if (var33 == null) {
                              var29 = null
                           } else {
                              val var34: MatchResult = Regex.find$default(teamLoreRegex, var25, 0, 2, null)
                              if (var34 == null) {
                                 var29 = null
                              } else {
                                 val var35: java.lang.String = CollectionsKt.getOrNull(var33.groupValues, 1)
                                 if (var35 != null) {
                                    val var36: Int = StringsKt.toIntOrNull(var35)
                                    if (var36 != null) {
                                       val var28: Int = var36
                                       val var37: java.lang.String = CollectionsKt.getOrNull(var33.groupValues, 2)
                                       if (var37 != null) {
                                          val var38: Int = StringsKt.toIntOrNull(var37)
                                          if (var38 != null) {
                                             val capacity: Int = var38
                                             val var39: java.lang.String = CollectionsKt.getOrNull(var34.groupValues, 1)
                                             if (var39 != null) {
                                                val var40: Int = StringsKt.toIntOrNull(var39)
                                                if (var40 != null) {
                                                   var29 = FunTimeOnlineHelperController$ServerCandidate(anarchy, var28, capacity, var40, slot)
                                                   return@label96
                                                }
                                             }

                                             var29 = null
                                             return@label96
                                          }
                                       }

                                       var29 = null
                                       return@label96
                                    }
                                 }

                                 var29 = null
                              }
                           }
                           return@label96
                        }
                     }
                  }
               }

               var29 = null
            }
         }

         if (var29 != null) {
            `destination$iv$iv`.add(var29)
         }
      }

      `destination$iv$iv` as java.util.List
   }

   fun waitForBestServer(now: GenericContainerScreenHandler, player: PlayerEntity, menu: FunTimeOnlineHelperController$MenuKind, kind: Long) {
      if (kind != FunTimeOnlineHelperController$MenuKind.SERVERS) {
         this.waitOrFail(now, "Online Helper: лучший список серверов не открылся")
      } else if (bestServer == null) {
         this.fail("Online Helper: результат поиска потерян")
      } else {
         val best: FunTimeOnlineHelperController$ServerCandidate = bestServer
         val var10: java.util.Iterator = this.serverCandidates(menu).iterator()

         var var10000: Any
         while (true) {
            if (!var10.hasNext()) {
               var10000 = null
               break
            }

            val `element$iv`: Any = var10.next()
            if ((`element$iv` as FunTimeOnlineHelperController$ServerCandidate).teamSize == best.teamSize
               && (`element$iv` as FunTimeOnlineHelperController$ServerCandidate).anarchy == best.anarchy
               && (`element$iv` as FunTimeOnlineHelperController$ServerCandidate).online > 0) {
               var10000 = (FunTimeOnlineHelperController$ServerCandidate)`element$iv`
               break
            }
         }

         var10000 = var10000
         if (var10000 == null) {
            this.waitOrFail(now, "Online Helper: анархия ${best.anarchy} не найдена")
         } else {
            bestServer = var10000
            this.transition(FunTimeOnlineHelperController$State.JOIN_BEST, 0L)
            this.joinBest(menu, player, kind, now)
         }
      }
   }

   fun isSelectorMenu(title: Text): Boolean {
      ضه.INSTANCE.isFunTime() && this.menuKind(title) != null
   }

   private fun showStatus(message: String) {
      ضك.getMc().inGameHud.setOverlayMessage(Text.literal(message) as Text, false)
   }

   public final val isRunning: Boolean
      public final get() {
         return state != FunTimeOnlineHelperController$State.IDLE
      }

}
