package oxxxde

import java.util.ArrayList
import java.util.LinkedHashSet
import java.util.Locale
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
public object شْ {
   private final var startedAt: Long
   private const val MENU_OPEN_DELAY_MS: Long = 150L
   private final val visitedCategories: LinkedHashSet<String> = LinkedHashSet()
   private final var menuCommandSent: Boolean
   private final var clicking: Boolean
   private final var initialized: Boolean
   private final var awaitingMenuSince: Long
   private const val MAX_ANARCHY: Int = 74
   private const val MIN_ANARCHY: Int = 1
   private final var nextActionAt: Long
   private final var targetAnarchy: Int?
   private const val ACTION_DELAY_MS: Long = 450L
   private final var awaitingMenuFingerprint: String?
   private final val serverNumberPattern: Regex = Regex("#\\s*(\\d{1,3})(?!\\d)")
   private const val TOTAL_TIMEOUT_MS: Long = 20000L
   private final var navigationClicks: Int
   private const val MAX_NAVIGATION_CLICKS: Int = 5
   private const val LIGHT_MODE_SLOT: Int = 10
   private const val MENU_CHANGE_TIMEOUT_MS: Long = 3500L

   private fun normalize(value: String): String {
      val var10000: Locale = Locale.ROOT
      val var6: java.lang.String = value.toLowerCase(var10000)
      return StringsKt.trim(Regex("\\s+").replace(var6, " ")).toString()
   }

   private fun findTargetSlot(entries: List<طد>, target: Int): Int? {
      val var6: java.util.Iterator = entries.iterator()

      var var12: Any
      while (true) {
         if (!var6.hasNext()) {
            var12 = null
            break
         }

         val `element$iv`: Any = var6.next()
         val entry: طد = `element$iv` as طد
         val var10000: Int = INSTANCE.serverNumber((`element$iv` as طد).name)
         if (var10000 != null && var10000 == target && INSTANCE.isLightServer(entry)) {
            var12 = `element$iv`
            break
         }
      }

      return if (var12 as طد != null) (var12 as طد).slot else null
   }

   private fun tick() {
      if (targetAnarchy != null) {
         val target: Int = targetAnarchy
         val now: Long = System.currentTimeMillis()
         if (!ضه.INSTANCE.isHolyWorld()) {
            this.cancel()
         } else if (now - startedAt >= 20000L) {
            this.fail("HwAnarchyHelper: анархия $target не найдена в меню HolyWorld")
         } else if (now >= nextActionAt) {
            val menu: Screen = ضك.getMc().currentScreen
            val screen: HandledScreen = menu as? HandledScreen
            val player: ScreenHandler = if ((menu as? HandledScreen) != null) (menu as? HandledScreen).getScreenHandler() else null
            val var15: GenericContainerScreenHandler = player as? GenericContainerScreenHandler
            val var16: ClientPlayerEntity = ضك.getMc().player
            if (screen != null && var15 != null && var16 != null && ضك.getMc().interactionManager != null) {
               if (var16.currentScreenHandler === var15 && var15.getCursorStack().isEmpty()) {
                  val fingerprint: java.lang.String = this.menuFingerprint(screen, var15)
                  if (awaitingMenuFingerprint != null) {
                     if (fingerprint == awaitingMenuFingerprint) {
                        if (now - awaitingMenuSince >= 3500L) {
                           this.fail("HwAnarchyHelper: меню HolyWorld не изменилось после клика")
                        }

                        return
                     }

                     awaitingMenuFingerprint = null
                     awaitingMenuSince = 0L
                  }

                  val entries: java.util.List = this.menuEntries(var15)
                  val var23: java.lang.String = this.detectCurrentCategory(entries)
                  if (var23 != null) {
                     visitedCategories.add(var23)
                  }

                  val navigationSlot: Int = this.findTargetSlot(entries, target)
                  if (navigationSlot != null) {
                     INSTANCE.click(var15, var16 as PlayerEntity, navigationSlot.intValue())
                     INSTANCE.showStatus("HwAnarchyHelper: подключаю к анархии $target")
                     INSTANCE.cancel()
                  } else if (navigationClicks >= 5) {
                     this.fail("HwAnarchyHelper: анархия $target отсутствует в категориях Лайт анархии")
                  } else {
                     val var24: Int = this.findNavigationSlot(screen, entries)
                     if (var24 != null) {
                        this.click(var15, var16 as PlayerEntity, var24)
                        val var18: Int = navigationClicks++
                        awaitingMenuFingerprint = fingerprint
                        awaitingMenuSince = now
                        nextActionAt = now + 450L
                     } else {
                        this.fail("HwAnarchyHelper: не удалось найти анархию $target в меню")
                     }
                  }
               }
            } else if (!menuCommandSent) {
               menuCommandSent = true
               nextActionAt = now + 450L
               val var10000: ClientPlayNetworkHandler = ضك.getMc().getNetworkHandler()
               if (var10000 != null) {
                  var10000.sendChatCommand("menu")
               }
            } else {
               if (awaitingMenuFingerprint != null && now - awaitingMenuSince >= 3500L) {
                  this.fail("HwAnarchyHelper: меню HolyWorld не открылось")
               }
            }
         }
      }
   }

   private fun categoryKey(value: String): String? {
      if (!StringsKt.contains$default(value, "лайт", false, 2, null)) {
         return null
      } else {
         return if (StringsKt.contains$default(value, "соло", false, 2, null))
            "solo"
            else
            (
               if (StringsKt.contains$default(value, "дуо", false, 2, null))
                  "duo"
                  else
                  (
                     if (StringsKt.contains$default(value, "трио", false, 2, null))
                        "trio"
                        else
                        (if (StringsKt.contains$default(value, "клан", false, 2, null)) "clan" else null)
                  )
            )
         }
   }

   fun menuEntries(menu: GenericContainerScreenHandler): MutableList<طد> {
      val `$this$mapNotNullTo$iv$iv`: java.lang.Iterable = RangesKt.until((int)0, (int)(menu.getRows() * 9))
      val `destination$iv$iv`: java.util.Collection = ArrayList()
      val var9: java.util.Iterator = `$this$mapNotNullTo$iv$iv`.iterator()

      while (var9.hasNext()) {
         val slot: Int = (var9 as IntIterator).nextInt()
         val var10000: ItemStack = menu.getSlot(slot).getStack()
         val var20: طد
         if (var10000.isEmpty()) {
            var20 = null
         } else {
            val var21: شْ = INSTANCE
            val var10001: java.lang.String = var10000.getName().getString()
            val name: java.lang.String = var21.normalize(var10001)
            val var22: LoreComponent = var10000.get(DataComponentTypes.LORE) as LoreComponent
            var var23: java.util.List = if (var22 != null) var22.lines() else null
            if (var23 == null) {
               var23 = CollectionsKt.emptyList()
            }

            var20 = طد(slot, name, StringsKt.trim("$name ${CollectionsKt.joinToString$default(var23, " ", null, null, 0, null, { it: Text ->
               val var10000: شْ = INSTANCE
               val var10001: java.lang.String = it.getString()
               var10000.normalize(var10001) as java.lang.CharSequence
            }, 30, null)}").toString())
         }

         if (var20 != null) {
            `destination$iv$iv`.add(var20)
         }
      }

      `destination$iv$iv` as java.util.List
   }

   public fun request(anarchy: Int) {
      if (1 > anarchy || anarchy >= 75) {
         this.showStatus("HwAnarchyHelper: доступны анархии 1–74")
      } else if (ضه.INSTANCE.isSingleplayer()) {
         this.showStatus("HwAnarchyHelper: команда /an$anarchy распознана (тест в одиночном мире)")
      } else if (ضه.INSTANCE.isHolyWorld()) {
         targetAnarchy = anarchy
         startedAt = System.currentTimeMillis()
         nextActionAt = startedAt + 150L
         menuCommandSent = false
         navigationClicks = 0
         visitedCategories.clear()
         awaitingMenuFingerprint = null
         awaitingMenuSince = 0L
         this.showStatus("HwAnarchyHelper: ищу анархию $anarchy...")
      }
   }

   public fun shouldBlockInventoryClick(): Boolean {
      return targetAnarchy != null && !clicking
   }

   private fun showStatus(message: String) {
      ضك.getMc().inGameHud.setOverlayMessage(Text.literal(message) as Text, false)
   }

   fun findNavigationSlot(entries: HandledScreen<*>, screen: MutableList<طد>): Int {
      var var3: Int = this.findLightModeSlot(entries)
      if (var3 != null) {
         var3.intValue()
      } else {
         var3 = this.findLightModeSlotByMenuLayout(screen, entries)
         if (var3 != null) {
            var3.intValue()
         } else {
            val entry: java.util.Iterator = this.categoryEntries(entries).iterator()

            var var10000: Any
            while (true) {
               if (entry.hasNext()) {
                  val var7: Any = entry.next()
                  if (CollectionsKt.contains(visitedCategories, INSTANCE.categoryKey((var7 as طد).name))) {
                     continue
                  }

                  var10000 = var7
                  break
               }

               var10000 = null
               break
            }

            val var13: طد = var10000 as طد
            val var24: Int
            if (var10000 as طد != null) {
               val var23: java.lang.String = INSTANCE.categoryKey(var13.name)
               if (var23 != null) {
                  visitedCategories.add(var23)
               }

               var24 = var13.slot
            } else {
               var24 = null
            }

            var24
         }
      }
   }

   private fun categoryEntries(entries: List<طد>): List<طد> {
      val `$this$filterTo$iv$iv`: java.lang.Iterable = entries
      val `destination$iv$iv`: java.util.Collection = ArrayList()

      for (`element$iv$iv` in `$this$filterTo$iv$iv`) {
         if (INSTANCE.serverNumber((`element$iv$iv` as طد).name) == null
            && INSTANCE.categoryKey((`element$iv$iv` as طد).name) != null
            && StringsKt.contains$default((`element$iv$iv` as طد).name, "анарх", false, 2, null)) {
            `destination$iv$iv`.add(`element$iv$iv`)
         }
      }

      return `destination$iv$iv` as MutableList<طد>
   }

   private fun findLightModeSlot(entries: List<طد>): Int? {
      val var5: java.util.Iterator = entries.iterator()

      var var10000: Any
      while (true) {
         if (!var5.hasNext()) {
            var10000 = null
            break
         }

         val `element$iv`: Any = var5.next()
         if (INSTANCE.serverNumber((`element$iv` as طد).name) == null
            && INSTANCE.categoryKey((`element$iv` as طد).name) == null
            && StringsKt.contains$default((`element$iv` as طد).text, "лайт", false, 2, null)
            && StringsKt.contains$default((`element$iv` as طد).text, "анарх", false, 2, null)) {
            var10000 = `element$iv`
            break
         }
      }

      return if (var10000 as طد != null) (var10000 as طد).slot else null
   }

   private fun detectCurrentCategory(entries: List<طد>): String? {
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
      // 00: aload 1
      // 01: checkcast java/lang/Iterable
      // 04: invokestatic kotlin/collections/CollectionsKt.asSequence (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
      // 07: new oxxxde/خئ
      // 0a: dup
      // 0b: aload 0
      // 0c: invokespecial oxxxde/خئ.<init> (Ljava/lang/Object;)V
      // 0f: checkcast kotlin/jvm/functions/Function1
      // 12: invokestatic kotlin/sequences/SequencesKt.filter (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
      // 15: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/شْ.detectCurrentCategory$lambda$0 (Loxxxde/طد;)Ljava/lang/String;, (Loxxxde/طد;)Ljava/lang/String; ]
      // 1a: invokestatic kotlin/sequences/SequencesKt.mapNotNull (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
      // 1d: invokestatic kotlin/sequences/SequencesKt.firstOrNull (Lkotlin/sequences/Sequence;)Ljava/lang/Object;
      // 20: checkcast java/lang/String
      // 23: areturn
   }

   fun click(slot: GenericContainerScreenHandler, menu: PlayerEntity, player: Int) {
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

   private fun serverNumber(value: String): Int? {
      val var10000: MatchResult = Regex.find$default(serverNumberPattern, value, 0, 2, null)
      if (var10000 != null) {
         val var2: java.util.List = var10000.groupValues
         if (var2 != null) {
            val var3: java.lang.String = var2.get(1) as java.lang.String
            if (var3 != null) {
               return StringsKt.toIntOrNull(var3)
            }
         }
      }

      return null
   }

   fun findLightModeSlotByMenuLayout(entries: HandledScreen<*>, screen: MutableList<طد>): Int {
      val var10001: java.lang.String = screen.getTitle().getString()
      if (!StringsKt.contains$default(this.normalize(var10001), "выберите режим", false, 2, null)) {
         null
      } else {
         val var6: java.util.Iterator = entries.iterator()

         var var10000: Any
         while (true) {
            if (var6.hasNext()) {
               val `element$iv`: Any = var6.next()
               if ((`element$iv` as طد).slot != 10) {
                  continue
               }

               var10000 = `element$iv`
               break
            }

            var10000 = null
            break
         }

         if (var10000 as طد != null) (var10000 as طد).slot else null
      }
   }

   fun menuFingerprint(menu: HandledScreen<*>, screen: GenericContainerScreenHandler): java.lang.String {
      val var3: StringBuilder = StringBuilder()
      val `$this$menuFingerprint_u24lambda_u240`: StringBuilder = var3
      val var10001: شْ = INSTANCE
      val var10002: java.lang.String = screen.getTitle().getString()
      var3.append(var10001.normalize(var10002))
      var3.append('|')
      var3.append(menu.syncId)

      for (`element$iv` in INSTANCE.menuEntries(menu)) {
         val entry: طد = `element$iv` as طد
         `$this$menuFingerprint_u24lambda_u240`.append('|')
         `$this$menuFingerprint_u24lambda_u240`.append(entry.slot)
         `$this$menuFingerprint_u24lambda_u240`.append(':')
         `$this$menuFingerprint_u24lambda_u240`.append(entry.text)
      }

      var3.toString()
   }

   public fun cancel() {
      targetAnarchy = null
      startedAt = 0L
      nextActionAt = 0L
      menuCommandSent = false
      navigationClicks = 0
      visitedCategories.clear()
      awaitingMenuFingerprint = null
      awaitingMenuSince = 0L
      clicking = false
   }

   public fun initialize() {
      if (!initialized) {
         initialized = true
         ClientTickEvents.END_CLIENT_TICK.register({ it: MinecraftClient ->
            INSTANCE.tick()
         })
         ClientPlayConnectionEvents.JOIN.register({ var0: ClientPlayNetworkHandler, var1: PacketSender, var2: MinecraftClient ->
            INSTANCE.cancel()
         })
         ClientPlayConnectionEvents.DISCONNECT.register({ var0: ClientPlayNetworkHandler, var1: MinecraftClient ->
            INSTANCE.cancel()
         })
      }
   }

   private fun isLightServer(entry: طد): Boolean {
      return this.serverNumber(entry.name) != null && StringsKt.contains$default(entry.name, "лайт", false, 2, null) && this.categoryKey(entry.name) != null
   }

   private fun fail(message: String) {
      this.showStatus(message)
      this.cancel()
   }
}
