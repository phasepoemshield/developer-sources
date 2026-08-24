package oxxxde

import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry
import java.awt.Color
import java.util.ArrayList
import java.util.Locale
import kotakbaz.rain.module.Module
import kotlin.math.MathKt
import net.minecraft.class_238
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.world.ClientWorld
import net.minecraft.component.DataComponentTypes
import net.minecraft.component.type.LoreComponent
import net.minecraft.component.type.NbtComponent
import net.minecraft.enchantment.Enchantment
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.registry.entry.RegistryEntry
import net.minecraft.registry.tag.ItemTags
import net.minecraft.text.Text
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.HitResult
import net.minecraft.util.hit.HitResult.Type
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Box
import net.minecraft.util.math.Direction
import net.minecraft.util.math.Direction.Axis
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ذض : Module("BurHelper", PLAYER, "Показывает зону копания бульдозером") {
   private const val FADE_SPEED: Float = 9.5F
   private const val BOX_EXPANSION: Double = 0.002
   private final val bulldozerRegex: Regex = Regex("(?:бульдозер|bulldozer)[^\\p{L}\\p{N}]{0,6}(ii|2|i|1)?", SetsKt.setOf(RegexOption.IGNORE_CASE))
   private final var previewBoxes: List<class_238> = CollectionsKt.emptyList()
   private final var alpha: Float
   private final var lastFrameNanos: Long

   public override fun onEnable() {
      this.resetAnimation()
   }

   private fun approach(current: Float, target: Float, speed: Float, deltaSeconds: Float): Float {
      return current + (target - current) * RangesKt.coerceIn((float)(1.0 - Math.exp((double)(-speed * deltaSeconds))), 0.0F, 1.0F)
   }

   private fun resetAnimation() {
      previewBoxes = CollectionsKt.emptyList()
      alpha = 0.0F
      lastFrameNanos = 0L
   }

   private fun currentPreview(): List<class_238>? {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return null
      } else {
         val var19: ClientWorld = ضك.getMc().world
         if (var19 == null) {
            return null
         } else {
            val world: ClientWorld = var19
            val var10001: ItemStack = var10000.getMainHandStack()
            val level: Int = this.bulldozerLevel(var10001)
            if (level <= 0) {
               return null
            } else {
               val direction: HitResult = ضك.getMc().crosshairTarget
               val var20: BlockHitResult = direction as? BlockHitResult
               if ((direction as? BlockHitResult) == null) {
                  return null
               } else if (var20.getType() === Type.BLOCK && !var20.isAgainstWorldBorder()) {
                  val var21: BlockPos = var20.getBlockPos()
                  val origin: BlockPos = var21
                  val var22: Direction = var20.getSide()
                  val var15: Direction = var22
                  val boxes: ArrayList = ArrayList(9 * level)

                  repeat(level) { var8 ->
                     val var23: BlockPos = origin.offset(var15.getOpposite(), var8)
                     val layerCenter: BlockPos = var23

                     for (first in -1..1) {
                        for (second in -1..1) {
                           val var24: ذض = INSTANCE
                           val var10002: Axis = var15.getAxis()
                           val pos: BlockPos = var24.offsetInFacePlane(layerCenter, var10002, first, second)
                           if (world.isInBuildLimit(pos)) {
                              boxes.add(Box(pos).expand(0.002))
                           }
                        }
                     }
                  }

                  return if (!boxes.isEmpty()) boxes else null
               } else {
                  return null
               }
            }
         }
      }
   }

   private fun frameDeltaSeconds(): Float {
      val now: Long = System.nanoTime()
      if (lastFrameNanos == 0L) {
         lastFrameNanos = now
         return 0.016666668F
      } else {
         val delta: Float = (float)RangesKt.coerceAtMost((double)RangesKt.coerceAtLeast(now - lastFrameNanos, 0L) / 1.0E9, 0.1)
         lastFrameNanos = now
         return delta
      }
   }

   fun offsetInFacePlane(second: BlockPos, center: Axis, first: Int, axis: Int): BlockPos {
      var var10000: BlockPos
      when (ست.$EnumSwitchMapping$0[axis.ordinal()]) {
         1 -> var10000 = center.add(0, first, second)
         2 -> var10000 = center.add(first, 0, second)
         3 -> var10000 = center.add(first, second, 0)
         else -> throw NoWhenBranchMatchedException()
      }

      var10000
   }

   @Commando
   public fun onRender3D(event: شث) {
      val deltaSeconds: Float = this.frameDeltaSeconds()
      val target: java.util.List = this.currentPreview()
      if (target != null) {
         previewBoxes = target
      }

      alpha = this.approach(alpha, if (target != null) 1.0F else 0.0F, 9.5F, deltaSeconds)
      if (alpha <= 0.003F) {
         if (target == null) {
            previewBoxes = CollectionsKt.emptyList()
         }
      } else {
         بع.render$default(
            بع.INSTANCE,
            event,
            previewBoxes,
            null,
            Color(255, 255, 255, MathKt.roundToInt(RangesKt.coerceIn(alpha, 0.0F, 1.0F) * 255.0F)),
            1.5F,
            false,
            0.0F,
            100,
            null
         )
      }
   }

   @JvmStatic
   fun {
      اُ.moduleOnFuntime$default(اُ.INSTANCE, INSTANCE, null, 2, null)
   }

   private fun parseBulldozerLevel(text: String, fallback: Int = 1): Int? {
      val var10000: MatchResult = Regex.find$default(bulldozerRegex, text, 0, 2, null)
      if (var10000 == null) {
         return null
      } else {
         val var6: java.lang.String = CollectionsKt.getOrNull(var10000.groupValues, 1)
         val var7: java.lang.String
         if (var6 != null) {
            var7 = var6.toLowerCase(Locale.ROOT)
         } else {
            var7 = null
         }

         run label52@{
            run label51@{
               run label50@{
                  if (var7 != null) {
                     when (var7.hashCode()) {
                        49 -> {
                           if (var7.equals("1")) {
                              return@label50
                           }
                        }
                        50 -> {
                           if (var7.equals("2")) {
                              return@label51
                           }
                        }
                        105 -> {
                           if (var7.equals("i")) {
                              return@label50
                           }
                        }
                        3360 -> {
                           if (var7.equals("ii")) {
                              return@label51
                           }
                        }
                        else -> {}
                     }
                  }

                  var8 = fallback
                  return@label52
               }

               var8 = 1
               return@label52
            }

            var8 = 2
         }

         return RangesKt.coerceIn(var8, 1, 2)
      }
   }

   public override fun onDisable() {
      this.resetAnimation()
   }

   fun bulldozerLevel(stack: ItemStack): Int {
      if (!stack.isEmpty() && stack.isIn(ItemTags.PICKAXES)) {
         val var10000: java.util.Set = stack.getEnchantments().getEnchantmentEntries()

         for (it in var10000) {
            val var6: Entry = it as Entry
            val line: StringBuilder = StringBuilder()
            line.append(Enchantment.getName(var6.getKey() as RegistryEntry, var6.getIntValue()).getString())
            line.append(' ')
            line.append((var6.getKey() as RegistryEntry).getIdAsString())
            val var29: Int = INSTANCE.parseBulldozerLevel(line.toString(), var6.getIntValue())
            if (var29 != null) {
               var29.intValue()
            }
         }

         var var10001: java.lang.String = stack.getName().getString()
         val var13: Int = parseBulldozerLevel$default(this, var10001, 0, 2, null)
         if (var13 != null) {
            var13.intValue()
         } else {
            run label84@{
               val var30: LoreComponent = stack.get(DataComponentTypes.LORE) as LoreComponent
               if (var30 != null) {
                  val var31: java.util.List = var30.lines()
                  if (var31 != null) {
                     for (var23 in var31) {
                        val var24: Text = var23 as Text
                        val var32: ذض = INSTANCE
                        var10001 = var24.getString()
                        val var33: Int = parseBulldozerLevel$default(var32, var10001, 0, 2, null)
                        if (var33 != null) {
                           var33.intValue()
                        }
                     }
                  }
               }

               run label82@{
                  val var14: NbtComponent = stack.get(DataComponentTypes.CUSTOM_DATA) as NbtComponent
                  if (var14 != null) {
                     val var35: NbtCompound = var14.copyNbt()
                     if (var35 != null) {
                        var10001 = var35.toString()
                        return@label82
                     }
                  }

                  var10001 = null
               }

               if (var10001 == null) {
                  var10001 = ""
               }

               val var15: Int = parseBulldozerLevel$default(this, var10001, 0, 2, null)
               if (var15 != null) var15.intValue() else 0
            }
         }
      } else {
         0
      }
   }
}
