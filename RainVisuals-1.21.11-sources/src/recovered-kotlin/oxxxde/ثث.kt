package oxxxde

import java.util.ArrayDeque
import java.util.ArrayList
import java.util.Comparator
import kotakbaz.rain.ui.inventory.ChestSorterController$Click
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
import net.fabricmc.fabric.api.networking.v1.PacketSender
import net.minecraft.class_1799
import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.screen.ingame.HandledScreen
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.network.ClientPlayerInteractionManager
import net.minecraft.component.DataComponentTypes
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.BlockItem
import net.minecraft.item.BowItem
import net.minecraft.item.CrossbowItem
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.TridentItem
import net.minecraft.registry.Registries
import net.minecraft.screen.GenericContainerScreenHandler
import net.minecraft.screen.slot.Slot
import net.minecraft.screen.slot.SlotActionType
import net.minecraft.text.Text
import net.minecraft.text.TextContent
import net.minecraft.text.TranslatableTextContent

// $VF: Compiled from heavy
public object ثث {
   private final val COMBAT_SUPPLIES: Set<String> =
      SetsKt.setOf(
         "totem_of_undying",
         "enchanted_golden_apple",
         "golden_apple",
         "end_crystal",
         "ender_pearl",
         "wind_charge",
         "arrow",
         "spectral_arrow",
         "tipped_arrow",
         "firework_rocket"
      )
      private final var nextClickAt: Long
   private final val MOB_DROPS: Set<String> =
      SetsKt.setOf(
         "rotten_flesh",
         "bone",
         "spider_eye",
         "string",
         "gunpowder",
         "slime_ball",
         "magma_cream",
         "blaze_rod",
         "blaze_powder",
         "ghast_tear",
         "ender_eye",
         "phantom_membrane",
         "rabbit_hide",
         "rabbit_foot",
         "feather",
         "leather",
         "ink_sac",
         "glow_ink_sac",
         "scute",
         "armadillo_scute",
         "nautilus_shell",
         "shulker_shell",
         "nether_star"
      )
      private final val RESOURCE_BLOCKS: Set<String> =
      SetsKt.setOf(
         "coal_block",
         "raw_copper_block",
         "raw_iron_block",
         "raw_gold_block",
         "copper_block",
         "iron_block",
         "gold_block",
         "diamond_block",
         "emerald_block",
         "lapis_block",
         "netherite_block",
         "amethyst_block"
      )
      private final var stopRequested: Boolean
   private final val FUNCTIONAL_ITEMS: Set<String> =
      SetsKt.setOf(
         "crafting_table",
         "furnace",
         "anvil",
         "blast_furnace",
         "smoker",
         "stonecutter",
         "cartography_table",
         "fletching_table",
         "smithing_table",
         "grindstone",
         "loom",
         "enchanting_table",
         "brewing_stand",
         "cauldron",
         "beacon",
         "lodestone",
         "respawn_anchor",
         "end_portal_frame",
         "jukebox"
      )
      private final val pendingClicks: ArrayDeque<رُ> = ArrayDeque()
   private final val REDSTONE_ITEMS: Set<String> =
      SetsKt.setOf(
         "redstone",
         "redstone_torch",
         "repeater",
         "comparator",
         "lever",
         "target",
         "daylight_detector",
         "tripwire_hook",
         "lightning_rod",
         "crafter",
         "dispenser",
         "dropper",
         "note_block"
      )

   private final val stackComparator: Comparator<class_1799> =
      { first: ItemStack, second: ItemStack ->
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
         //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
         //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
         //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
         //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:210)
         //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
         //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
         //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
      }

   private final var initialized: Boolean
   private final val RESOURCES: Set<String> =
      SetsKt.setOf(
         "coal",
         "charcoal",
         "diamond",
         "emerald",
         "lapis_lazuli",
         "quartz",
         "amethyst_shard",
         "echo_shard",
         "prismarine_shard",
         "prismarine_crystals",
         "netherite_scrap",
         "ancient_debris",
         "clay_ball",
         "flint"
      )
      private final val NATURE_ITEMS: Set<String> =
      SetsKt.setOf(
         "grass_block",
         "dirt",
         "coarse_dirt",
         "rooted_dirt",
         "podzol",
         "mycelium",
         "mud",
         "clay",
         "sand",
         "red_sand",
         "gravel",
         "moss_block",
         "moss_carpet",
         "vine",
         "lily_pad",
         "cactus",
         "sugar_cane",
         "bamboo",
         "kelp"
      )
      private const val CLICK_DELAY_MS: Long = 90L
   private final var clicking: Boolean
   @JvmStatic
   private GenericContainerScreenHandler activeMenu;

   private fun pickup(slot: Int): رُ {
      return ChestSorterController$Click(slot, 0, SlotActionType.PICKUP)
   }

   public final val isSorting: Boolean
      public final get() {
         return activeMenu != null
      }


   fun sameKind(second: ItemStack, first: ItemStack): Boolean {
      if (!first.isEmpty() && !second.isEmpty()) ItemStack.areItemsAndComponentsEqual(first, second) else first.isEmpty() && second.isEmpty()
   }

   fun toggle(menu: GenericContainerScreenHandler) {
      if (activeMenu === menu) {
         this.requestStop()
      } else {
         this.start(menu)
      }
   }

   private fun isMobDrop(path: String): Boolean {
      return MOB_DROPS.contains(path) || StringsKt.endsWith$default(path, "_spawn_egg", false, 2, null)
   }

   fun recoveryClick(menu: GenericContainerScreenHandler): ChestSorterController$Click {
      var var10000: Int = menu.getCursorStack()
      val carried: ItemStack = var10000
      val size: Int = this.containerSize(menu)
      val `$i$f$firstOrNull`: java.util.Iterator = RangesKt.until((int)0, (int)size).iterator()

      while (true) {
         if (!`$i$f$firstOrNull`.hasNext()) {
            var10000 = null
            break
         }

         val `element$iv`: Any = `$i$f$firstOrNull`.next()
         val var20: Slot = menu.getSlot((`element$iv` as java.lang.Number).intValue())
         val var21: ثث = INSTANCE
         val var10001: ItemStack = var20.getStack()
         if (var21.sameKind(var10001, carried) && var20.getStack().getCount() < var20.getMaxItemCount(carried) && var20.canInsert(carried)) {
            var10000 = (Integer)`element$iv`
            break
         }
      }

      val mergeTarget: Int = var10000
      if (var10000 != null) {
         this.pickup(mergeTarget)
      } else {
         val var16: java.util.Iterator = RangesKt.until((int)0, (int)size).iterator()

         while (true) {
            if (!var16.hasNext()) {
               var10000 = null
               break
            }

            val var17: Any = var16.next()
            val var23: Slot = menu.getSlot((var17 as java.lang.Number).intValue())
            if (var23.getStack().isEmpty() && var23.canInsert(carried)) {
               var10000 = (Integer)var17
               break
            }
         }

         if (var10000 as Int != null) this.pickup(var10000) else null
      }
   }

   public final val isStopping: Boolean
      public final get() {
         return this.isSorting && stopRequested
      }


   fun registryPath(stack: ItemStack): java.lang.String {
      val var10000: java.lang.String = Registries.ITEM.getId(stack.getItem()).getPath()
      var10000
   }

   fun containerSize(menu: GenericContainerScreenHandler): Int {
      menu.getRows() * 9
   }

   private fun isRedstone(path: String): Boolean {
      return REDSTONE_ITEMS.contains(path)
         || StringsKt.contains$default(path, "piston", false, 2, null)
         || StringsKt.contains$default(path, "observer", false, 2, null)
         || StringsKt.contains$default(path, "sensor", false, 2, null)
         || StringsKt.endsWith$default(path, "_rail", false, 2, null)
      }

   private fun requestStop() {
      stopRequested = true
      if (pendingClicks.isEmpty()) {
         var var1: Boolean
         run label26@{
            if (activeMenu != null) {
               val var10000: ItemStack = activeMenu.getCursorStack()
               if (var10000 != null) {
                  var1 = var10000.isEmpty()
                  return@label26
               }
            }

            var1 = false
         }

         if (var1) {
            this.stopImmediately()
         }
      }
   }

   fun nextMerge(player: GenericContainerScreenHandler, menu: PlayerEntity): MutableList<ChestSorterController$Click> {
      val size: Int = this.containerSize(menu)

      repeat(size) { target ->
         var var10000: Slot = menu.getSlot(target)
         val targetSlot: Slot = var10000
         val var13: ItemStack = var10000.getStack()
         val targetStack: ItemStack = var13
         if (!var13.isEmpty() && var13.getCount() < var10000.getMaxItemCount(var13)) {
            for (source in target + 1..size) {
               var10000 = menu.getSlot(source)
               val var15: ItemStack = var10000.getStack()
               if (!var15.isEmpty() && this.sameKind(targetStack, var15) && var10000.canTakeItems(player) && targetSlot.canInsert(var15)) {
                  val targetLimit: Int = targetSlot.getMaxItemCount(var15)
                  val clicks: ArrayList = CollectionsKt.arrayListOf(this.pickup(source), this.pickup(target))
                  if (targetStack.getCount() + var15.getCount() > targetLimit) {
                     clicks.add(this.pickup(source))
                  }

                  clicks as java.util.List
               }
            }
         }
      }

      null
   }

   fun nextSort(menu: GenericContainerScreenHandler, player: PlayerEntity): MutableList<ChestSorterController$Click> {
      val size: Int = this.containerSize(menu)
      val target: java.lang.Iterable = RangesKt.until((int)0, (int)size)
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(target, 10))
      val `$i$f$firstOrNull`: java.util.Iterator = target.iterator()

      while (`$i$f$firstOrNull`.hasNext()) {
         `destination$iv$iv`.add(menu.getSlot((`$i$f$firstOrNull` as IntIterator).nextInt()).getStack().copy())
      }

      val desired: java.util.List = CollectionsKt.sortedWith(`destination$iv$iv`, stackComparator)

      repeat(size) { var16 ->
         var var10000: Int = menu.getSlot(var16).getStack()
         var var10002: Any = desired.get(var16)
         if (!this.sameKind(var10000, var10002 as ItemStack)) {
            val var21: java.util.Iterator = RangesKt.until((int)(var16 + 1), (int)size).iterator()

            while (true) {
               if (!var21.hasNext()) {
                  var10000 = null
                  break
               }

               var var22: Any
               run label65@{
                  var22 = var21.next()
                  val var23: Int = (var22 as java.lang.Number).intValue()
                  val var24: ثث = INSTANCE
                  var var10001: ItemStack = menu.getSlot(var23).getStack()
                  var10002 = desired.get(var16)
                  if (var24.sameKind(var10001, var10002 as ItemStack)) {
                     val var25: ثث = INSTANCE
                     var10001 = menu.getSlot(var23).getStack()
                     var10002 = desired.get(var23)
                     if (!var25.sameKind(var10001, var10002 as ItemStack)) {
                        var26 = true
                        return@label65
                     }
                  }

                  var26 = false
               }

               if (var26) {
                  var10000 = (Integer)var22
                  break
               }
            }

            var10000 = var10000
            if (var10000 != null) {
               this.swapClicks(menu, player, var16, var10000)
            }
         }
      }

      null
   }

   fun category(stack: ItemStack): Int {
      val var10000: Item = stack.getItem()
      val path: java.lang.String = this.registryPath(stack)
      if (stack.get(DataComponentTypes.WEAPON) != null
            || stack.get(DataComponentTypes.BLOCKS_ATTACKS) != null
            || stack.get(DataComponentTypes.PIERCING_WEAPON) != null
            || stack.get(DataComponentTypes.KINETIC_WEAPON) != null
            || var10000 is BowItem
            || var10000 is CrossbowItem
            || var10000 is TridentItem)
         0
         else
         (
            if (stack.get(DataComponentTypes.EQUIPPABLE) != null)
               1
               else
               (
                  if (stack.get(DataComponentTypes.TOOL) != null)
                     2
                     else
                     (
                        if (this.isCombatSupply(path))
                           3
                           else
                           (
                              if (stack.get(DataComponentTypes.POTION_CONTENTS) != null)
                                 4
                                 else
                                 (
                                    if (stack.get(DataComponentTypes.FOOD) != null || stack.get(DataComponentTypes.CONSUMABLE) != null)
                                       5
                                       else
                                       (
                                          if (this.isResource(path))
                                             6
                                             else
                                             (
                                                if (this.isRedstone(path))
                                                   7
                                                   else
                                                   (
                                                      if (stack.get(DataComponentTypes.CONTAINER) == null
                                                            && stack.get(DataComponentTypes.BUNDLE_CONTENTS) == null
                                                            && !this.isStorage(path))
                                                         (
                                                            if (this.isFunctional(path))
                                                               9
                                                               else
                                                               (
                                                                  if (this.isNature(path))
                                                                     10
                                                                     else
                                                                     (if (var10000 is BlockItem) 11 else (if (this.isMobDrop(path)) 12 else 13))
                                                               )
                                                         )
                                                         else
                                                         8
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               )
         )
      }

   private fun tick() {
      if (activeMenu != null) {
         val menu: GenericContainerScreenHandler = activeMenu
         val player: ClientPlayerEntity = ضك.getMc().player
         if (!this.isValid(menu, player as PlayerEntity)) {
            this.stopImmediately()
         } else {
            val now: Long = System.currentTimeMillis()
            if (now >= nextClickAt) {
               if (pendingClicks.isEmpty()) {
                  if (!menu.getCursorStack().isEmpty()) {
                     val operation: ChestSorterController$Click = this.recoveryClick(menu)
                     if (operation == null) {
                        this.stopImmediately()
                        return
                     }

                     pendingClicks.add(operation)
                  } else {
                     if (stopRequested) {
                        this.stopImmediately()
                        return
                     }

                     var var10000: java.util.List = this.nextMerge(menu, player as PlayerEntity)
                     if (var10000 == null) {
                        var10000 = this.nextSort(menu, player as PlayerEntity)
                     }

                     if (var10000 == null) {
                        this.stopImmediately()
                        return
                     }

                     pendingClicks.addAll(var10000)
                  }
               }

               val var10002: PlayerEntity = player as PlayerEntity
               val var10003: Any = pendingClicks.removeFirst()
               this.performClick(menu, var10002, var10003 as ChestSorterController$Click)
               nextClickAt = now + 90L
               if (pendingClicks.isEmpty() && stopRequested && menu.getCursorStack().isEmpty()) {
                  this.stopImmediately()
               }
            }
         }
      }
   }

   fun start(menu: GenericContainerScreenHandler) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         if (ضك.getMc().currentScreen is HandledScreen && ضك.getMc().interactionManager != null) {
            if (var10000.currentScreenHandler === menu && menu.getCursorStack().isEmpty()) {
               this.stopImmediately()
               activeMenu = menu
               nextClickAt = 0L
            }
         }
      }
   }

   fun subcategory(stack: ItemStack): Int {
      val path: java.lang.String = this.registryPath(stack)
var var10000: Int
      when (this.category(stack)) {
         0 -> var10000 = if (StringsKt.endsWith$default(path, "_sword", false, 2, null))
               0
               else
               (
                  if (!StringsKt.endsWith$default(path, "_axe", false, 2, null) && !(path == "mace"))
                     (if (path == "trident") 2 else (if (path == "bow") 3 else (if (path == "crossbow") 4 else (if (path == "shield") 5 else 6))))
                     else
                     1
               )
            1 -> var10000 = if (!StringsKt.endsWith$default(path, "_helmet", false, 2, null) && !(path == "turtle_helmet"))
               (
                  if (StringsKt.endsWith$default(path, "_chestplate", false, 2, null))
                     1
                     else
                     (
                        if (StringsKt.endsWith$default(path, "_leggings", false, 2, null))
                           2
                           else
                           (if (StringsKt.endsWith$default(path, "_boots", false, 2, null)) 3 else (if (path == "elytra") 4 else 5))
                     )
               )
               else
               0
            2 -> var10000 = if (StringsKt.endsWith$default(path, "_pickaxe", false, 2, null))
               0
               else
               (
                  if (StringsKt.endsWith$default(path, "_axe", false, 2, null))
                     1
                     else
                     (
                        if (StringsKt.endsWith$default(path, "_shovel", false, 2, null))
                           2
                           else
                           (
                              if (StringsKt.endsWith$default(path, "_hoe", false, 2, null))
                                 3
                                 else
                                 (
                                    if (path == "shears")
                                       4
                                       else
                                       (if (path == "fishing_rod") 5 else (if (path == "flint_and_steel") 6 else (if (path == "brush") 7 else 8)))
                                 )
                           )
                     )
               )
            3 -> {
            run label372@{
               when (path.hashCode()) {
                  -1714618722 -> {
                     if (path.equals("tipped_arrow")) {
                        return@label372
                     }
                  }
                  -1606277878 -> {
                     if (path.equals("totem_of_undying")) {
                        0
                     }
                  }
                  -1361787956 -> {
                     if (path.equals("firework_rocket")) {
                        7
                     }
                  }
                  -749231089 -> {
                     if (path.equals("ender_pearl")) {
                        4
                     }
                  }
                  -3788636 -> {
                     if (path.equals("golden_apple")) {
                        2
                     }
                  }
                  34789067 -> {
                     if (path.equals("wind_charge")) {
                        5
                     }
                  }
                  93090825 -> {
                     if (path.equals("arrow")) {
                        return@label372
                     }
                  }
                  675258059 -> {
                     if (path.equals("enchanted_golden_apple")) {
                        1
                     }
                  }
                  1803855826 -> {
                     if (path.equals("end_crystal")) {
                        3
                     }
                  }
                  2052608366 -> {
                     if (path.equals("spectral_arrow")) {
                        return@label372
                     }
                  }
                  else -> {}
               }

               var10000 = 8
               break
            }

            var10000 = 6
            break
         }
         4 -> {
            when (path.hashCode()) {
               -1714618722 -> {
                  if (path.equals("tipped_arrow")) {
                     3
                  }
               }
               -982431341 -> {
                  if (path.equals("potion")) {
                     0
                  }
               }
               402451051 -> {
                  if (path.equals("splash_potion")) {
                     1
                  }
               }
               2038150131 -> {
                  if (path.equals("lingering_potion")) {
                     2
                  }
               }
               else -> {}
            }

            var10000 = 4
            break
         }
         5, 9 -> var10000 = 0
         6 -> var10000 = if (StringsKt.endsWith$default(path, "_ore", false, 2, null) || path == "ancient_debris")
               0
               else
               (
                  if (StringsKt.startsWith$default(path, "raw_", false, 2, null))
                     1
                     else
                     (
                        if (!StringsKt.endsWith$default(path, "_ingot", false, 2, null) && !(path == "netherite_scrap"))
                           (
                              if (StringsKt.endsWith$default(path, "_nugget", false, 2, null))
                                 3
                                 else
                                 (if (StringsKt.endsWith$default(path, "_block", false, 2, null)) 4 else 5)
                           )
                           else
                           2
                     )
               )
            7 -> var10000 = if (path == "redstone")
               0
               else
               (
                  if (path == "redstone_torch")
                     1
                     else
                     (
                        if (!(path == "repeater") && !(path == "comparator"))
                           (
                              if (StringsKt.contains$default(path, "piston", false, 2, null))
                                 3
                                 else
                                 (
                                    if (!StringsKt.contains$default(path, "observer", false, 2, null)
                                          && !StringsKt.contains$default(path, "sensor", false, 2, null))
                                       (if (StringsKt.contains$default(path, "rail", false, 2, null)) 5 else 6)
                                       else
                                       4
                                 )
                           )
                           else
                           2
                     )
               )
            8 -> var10000 = if (StringsKt.contains$default(path, "shulker_box", false, 2, null))
               0
               else
               (
                  if (path == "bundle")
                     1
                     else
                     (if (!StringsKt.contains$default(path, "chest", false, 2, null) && !(path == "barrel")) (if (path == "hopper") 3 else 4) else 2)
               )
            10 -> var10000 = if (StringsKt.contains$default(path, "sapling", false, 2, null) || StringsKt.contains$default(path, "propagule", false, 2, null))
               0
               else
               (
                  if (StringsKt.contains$default(path, "seed", false, 2, null))
                     1
                     else
                     (
                        if (StringsKt.contains$default(path, "flower", false, 2, null)
                              || StringsKt.contains$default(path, "tulip", false, 2, null)
                              || path == "dandelion"
                              || path == "poppy")
                           2
                           else
                           (
                              if (StringsKt.contains$default(path, "leaves", false, 2, null))
                                 3
                                 else
                                 (
                                    if (!StringsKt.contains$default(path, "mushroom", false, 2, null)
                                          && !StringsKt.contains$default(path, "fungus", false, 2, null))
                                       5
                                       else
                                       4
                                 )
                           )
                     )
               )
            11 -> var10000 = if (StringsKt.endsWith$default(path, "_log", false, 2, null)
                  || StringsKt.endsWith$default(path, "_wood", false, 2, null)
                  || StringsKt.endsWith$default(path, "_stem", false, 2, null)
                  || StringsKt.endsWith$default(path, "_hyphae", false, 2, null))
               0
               else
               (
                  if (StringsKt.endsWith$default(path, "_planks", false, 2, null))
                     1
                     else
                     (
                        if (StringsKt.endsWith$default(path, "_slab", false, 2, null))
                           2
                           else
                           (
                              if (StringsKt.endsWith$default(path, "_stairs", false, 2, null))
                                 3
                                 else
                                 (
                                    if (!StringsKt.endsWith$default(path, "_wall", false, 2, null)
                                          && !StringsKt.endsWith$default(path, "_fence", false, 2, null))
                                       (
                                          if (StringsKt.contains$default(path, "glass", false, 2, null))
                                             5
                                             else
                                             (
                                                if (!StringsKt.contains$default(path, "wool", false, 2, null)
                                                      && !StringsKt.contains$default(path, "carpet", false, 2, null)
                                                      && !StringsKt.contains$default(path, "concrete", false, 2, null)
                                                      && !StringsKt.contains$default(path, "terracotta", false, 2, null))
                                                   7
                                                   else
                                                   6
                                             )
                                       )
                                       else
                                       4
                                 )
                           )
                     )
               )
            else -> var10000 = 0
      }

      var10000
   }

   fun isChestScreen(title: Text): Boolean {
      val var3: TextContent = title.getContent()
      val var10000: TranslatableTextContent = var3 as? TranslatableTextContent
      if ((var3 as? TranslatableTextContent) != null) {
         val var4: java.lang.String = var10000.getKey()
         if (var4 != null) {
            var4 == "container.chest" || var4 == "container.chestDouble"
         }
      }

      false
   }

   fun swapClicks(menu: GenericContainerScreenHandler, source: PlayerEntity, target: Int, player: Int): MutableList<ChestSorterController$Click> {
      val var10000: Slot = menu.getSlot(target)
      val var12: Slot = menu.getSlot(source)
      val var13: ItemStack = var10000.getStack()
      val var14: ItemStack = var12.getStack()
      label45@
      if (var13.isEmpty()) {
         if (var12.canTakeItems(player) && var10000.canInsert(var14)) CollectionsKt.listOf(this.pickup(source), this.pickup(target)) else null
      } else {
         label44@
         if (var14.isEmpty()) {
            if (var10000.canTakeItems(player) && var12.canInsert(var13)) CollectionsKt.listOf(this.pickup(target), this.pickup(source)) else null
         } else {
            label43@
            if (!var12.canTakeItems(player) || !var10000.canTakeItems(player)) {
               null
            } else {
               if (var10000.canInsert(var14) && var12.canInsert(var13))
                  CollectionsKt.listOf(this.pickup(source), this.pickup(target), this.pickup(source))
                  else
                  null
               }
         }
      }
   }

   private fun isFunctional(path: String): Boolean {
      return FUNCTIONAL_ITEMS.contains(path)
         || StringsKt.endsWith$default(path, "_furnace", false, 2, null)
         || StringsKt.endsWith$default(path, "_anvil", false, 2, null)
      }

   fun performClick(player: GenericContainerScreenHandler, menu: PlayerEntity, click: ChestSorterController$Click) {
      clicking = true

      try {
         val var10000: ClientPlayerInteractionManager = ضك.getMc().interactionManager
         if (var10000 != null) {
            var10000.clickSlot(menu.syncId, click.slot, click.button, click.getType(), player)
         }

         menu.sendContentUpdates()
      } finally {
         clicking = false
      }
   }

   fun registryName(stack: ItemStack): java.lang.String {
      val var10000: java.lang.String = Registries.ITEM.getId(stack.getItem()).toString()
      var10000
   }

   fun isValid(menu: GenericContainerScreenHandler, player: PlayerEntity): Boolean {
      player != null && ضك.getMc().interactionManager != null && ضك.getMc().currentScreen is HandledScreen && player.currentScreenHandler === menu
   }

   private fun isResource(path: String): Boolean {
      return RESOURCES.contains(path)
         || RESOURCE_BLOCKS.contains(path)
         || StringsKt.startsWith$default(path, "raw_", false, 2, null)
         || StringsKt.endsWith$default(path, "_ore", false, 2, null)
         || StringsKt.endsWith$default(path, "_ingot", false, 2, null)
         || StringsKt.endsWith$default(path, "_nugget", false, 2, null)
      }

   private fun isNature(path: String): Boolean {
      return NATURE_ITEMS.contains(path)
         || StringsKt.contains$default(path, "sapling", false, 2, null)
         || StringsKt.contains$default(path, "propagule", false, 2, null)
         || StringsKt.contains$default(path, "leaves", false, 2, null)
         || StringsKt.contains$default(path, "seed", false, 2, null)
         || StringsKt.contains$default(path, "flower", false, 2, null)
         || StringsKt.contains$default(path, "tulip", false, 2, null)
         || StringsKt.contains$default(path, "mushroom", false, 2, null)
         || StringsKt.contains$default(path, "fungus", false, 2, null)
      }

   public fun initialize() {
      if (!initialized) {
         initialized = true
         ClientTickEvents.END_CLIENT_TICK.register({ it: MinecraftClient ->
            INSTANCE.tick()
         })
         ClientPlayConnectionEvents.JOIN.register({ var0: ClientPlayNetworkHandler, var1: PacketSender, var2: MinecraftClient ->
            INSTANCE.stopImmediately()
         })
         ClientPlayConnectionEvents.DISCONNECT.register({ var0: ClientPlayNetworkHandler, var1: MinecraftClient ->
            INSTANCE.stopImmediately()
         })
      }
   }

   private fun isCombatSupply(path: String): Boolean {
      return COMBAT_SUPPLIES.contains(path) || StringsKt.endsWith$default(path, "_arrow", false, 2, null)
   }

   fun materialRank(stack: ItemStack): Int {
      val path: java.lang.String = this.registryPath(stack)
      if (StringsKt.contains$default(path, "netherite", false, 2, null))
         0
         else
         (
            if (StringsKt.contains$default(path, "diamond", false, 2, null))
               1
               else
               (
                  if (StringsKt.contains$default(path, "iron", false, 2, null))
                     2
                     else
                     (
                        if (StringsKt.contains$default(path, "chainmail", false, 2, null))
                           3
                           else
                           (
                              if (StringsKt.contains$default(path, "gold", false, 2, null))
                                 4
                                 else
                                 (
                                    if (StringsKt.contains$default(path, "stone", false, 2, null))
                                       5
                                       else
                                       (
                                          if (StringsKt.contains$default(path, "copper", false, 2, null))
                                             6
                                             else
                                             (
                                                if (StringsKt.contains$default(path, "wooden", false, 2, null))
                                                   7
                                                   else
                                                   (if (StringsKt.contains$default(path, "leather", false, 2, null)) 8 else 9)
                                             )
                                       )
                                 )
                           )
                     )
               )
         )
      }

   private fun isStorage(path: String): Boolean {
      return path == "barrel"
         || path == "hopper"
         || path == "bundle"
         || StringsKt.contains$default(path, "chest", false, 2, null)
         || StringsKt.contains$default(path, "shulker_box", false, 2, null)
      }

   public fun shouldBlockInventoryClick(): Boolean {
      return this.isSorting && !clicking
   }

   private fun stopImmediately() {
      activeMenu = null
      pendingClicks.clear()
      nextClickAt = 0L
      stopRequested = false
      clicking = false
   }
}
