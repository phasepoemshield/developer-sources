package oxxxde

import java.awt.Color
import java.util.ArrayList
import java.util.Arrays
import java.util.Locale
import kotlin.jdk7.AutoCloseableKt
import kotlin.math.MathKt
import net.minecraft.class_238
import net.minecraft.client.font.TextRenderer
import net.minecraft.client.gui.DrawContext
import net.minecraft.client.network.AbstractClientPlayerEntity
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.RainRenderLayers
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.util.BufferAllocator
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.ActionResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Box
import net.minecraft.util.math.Vec3d
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ثك : دِ("FuntimeHelper", ظن.getPLAYER(), "Полезные утилиты для сервера FunTime") {
   private final var trapTimerStartedAt: Long
   private final val enderEyeCircle: خذ = دِ.boolean$default(INSTANCE, "Дезореинтация", true, null, 4, null)
   private const val PLAST_PITCH_THRESHOLD: Float = 45.0F
   private final val fireTornadoCircle: خذ = دِ.boolean$default(INSTANCE, "Огненный смерч", true, null, 4, null)
   private const val SMALL_CIRCLE_SEGMENTS: Int = 64
   private final val sugarDustCircle: خذ = دِ.boolean$default(INSTANCE, "Явная пыль", true, null, 4, null)
   private final val plast: خذ = دِ.boolean$default(INSTANCE, "Пласт", true, null, 4, null)
   private final val offHandNameCache: حأ = حأ()

   private final val greenInTarget: خذ = دِ.boolean$default(INSTANCE, "Изменять цвет при игроке", true, null, 4, null).setVisible({ 
      trapka.getValue() || plast.getValue()
   })

   private const val PREVIEW_OUTLINE_WIDTH: Float = 1.0F
   private final val fireTornadoKeywords: Array<String>

   private final val dragonTrap: خذ = دِ.boolean$default(INSTANCE, "Драконья трапка", true, null, 4, null).setVisible({ 
      trapka.getValue()
   })

   private const val LARGE_CIRCLE_SEGMENTS: Int = 128
   private final val trapka: خذ = دِ.boolean$default(INSTANCE, "Трапка", true, null, 4, null)
   private const val CIRCLE_LINE_WIDTH_MULTIPLIER: Float = 1.15F
   private const val TRAP_TIMER_DURATION_MS: Long = 15000L
   private final val mainHandNameCache: حأ = حأ()
   private final val sugarDustKeywords: Array<String>
   private final val godsAuraKeywords: Array<String>
   private final val enderEyeKeywords: Array<String>

   private final val timeTrap: خذ = دِ.boolean$default(INSTANCE, "Таймер трапки", true, null, 4, null).setVisible({ 
      trapka.getValue()
   })

   private final val godsAura: خذ = دِ.boolean$default(INSTANCE, "Божья аура", true, null, 4, null)

   private fun hasPlayerInBoxes(boxes: List<class_238>): Boolean {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return false
      } else {
         val player: ClientPlayerEntity = var10000
         val var16: ClientWorld = ضك.getMc().world
         if (var16 == null) {
            return false
         } else {
            val var17: java.util.List = var16.getPlayers()
            val `$this$any$iv`: java.lang.Iterable = var17
            var var20: Boolean
            if (var17 is java.util.Collection && (var17 as java.util.Collection).isEmpty()) {
               var20 = false
            } else {
               val var6: java.util.Iterator = `$this$any$iv`.iterator()

               while (true) {
                  if (!var6.hasNext()) {
                     var20 = false
                     break
                  }

                  run label79@{
                     val other: AbstractClientPlayerEntity = var6.next() as AbstractClientPlayerEntity
                     if (!(other == player)) {
                        val `$this$any$ivx`: java.lang.Iterable = boxes
                        var var18: Boolean
                        if (boxes is java.util.Collection && (boxes as java.util.Collection).isEmpty()) {
                           var18 = false
                        } else {
                           val var12: java.util.Iterator = `$this$any$ivx`.iterator()

                           while (true) {
                              if (!var12.hasNext()) {
                                 var18 = false
                                 break
                              }

                              if ((var12.next() as Box).intersects(other.getBoundingBox())) {
                                 var18 = true
                                 break
                              }
                           }
                        }

                        if (var18) {
                           var19 = true
                           return@label79
                        }
                     }

                     var19 = false
                  }

                  if (var19) {
                     var20 = true
                     break
                  }
               }
            }

            return var20
         }
      }
   }

   fun renderPlastPreview(event: شث, lineBuffer: VertexConsumer, cameraY: VertexConsumer, cameraX: Double, quadBuffer: Double, cameraZ: Double) {
      val previewBoxes: java.util.List = this.collectPlastPreviewBoxes()
      if (!previewBoxes.isEmpty()) {
         val outlineColor: Color = if (greenInTarget.getValue() && this.hasPlayerInBoxes(previewBoxes)) Color(0, 255, 0, 255) else Color(255, 255, 255, 255)
         val fillColor: Color = Color(outlineColor.getRed(), outlineColor.getGreen(), outlineColor.getBlue(), 38)

         for (worldBox in previewBoxes) {
            val var10000: Box = worldBox.offset(-cameraX, -cameraY, -cameraZ)
            تد.draw$default(تد.INSTANCE, event, quadBuffer, null, var10000, fillColor, true, false, false, 0.0F, 0.0F, 0.0F, 1028, null)
            تد.draw$default(تد.INSTANCE, event, quadBuffer, lineBuffer, var10000, outlineColor, false, true, false, 1.0F, 0.0F, 0.0F, 1024, null)
         }
      }
   }

   fun createDiagonalPlastBoxes(dirX: BlockPos, dirZ: Int, blockPos: Int): MutableList<Box> {
      val centerX: Int = blockPos.getX() + dirX * 2
      val centerZ: Int = blockPos.getZ() + dirZ * 2
      val perpDirX: Int = -dirZ
      val perpDirZ: Int = dirX
      val baseY: Int = blockPos.getY() + 1
      val `$this$map$iv`: java.lang.Iterable = IntRange(-2, 2)
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$map$iv`, 10))
      val var14: java.util.Iterator = `$this$map$iv`.iterator()

      while (var14.hasNext()) {
         val index: Int = (var14 as IntIterator).nextInt()
         `destination$iv$iv`.add(
            Box(
               (double)(centerX + index * perpDirX),
               (double)(baseY - 2),
               (double)(centerZ + index * perpDirZ),
               (double)(centerX + index * perpDirX + 1),
               (double)(baseY + 3),
               (double)(centerZ + index * perpDirZ + 1)
            )
         )
      }

      `destination$iv$iv` as java.util.List
   }

   public override fun onDisable() {
      trapTimerStartedAt = 0L
   }

   fun renderCircles(sugarDust: شث, event: Immediate, fireTornado: Boolean, enderEye: Boolean, consumers: Boolean, aura: Boolean) {
      if (enderEye) {
         this.renderCircle(event, consumers, 10.0, 128, 2.0F)
      }

      if (sugarDust) {
         this.renderCircle(event, consumers, 10.0, 128, 2.0F)
      }

      if (fireTornado) {
         this.renderCircle(event, consumers, 10.0, 128, 2.0F)
      }

      if (aura) {
         this.renderCircle(event, consumers, 2.0, 64, 3.0F)
      }
   }

   fun renderTrapTimer(context: DrawContext) {
      if (this.isEnabled() && trapka.getValue() && timeTrap.getValue()) {
         val var10000: java.lang.Double = this.remainingTrapSeconds()
         if (var10000 != null) {
            val remaining: Double = var10000
            val y: Locale = Locale.US
            val var13: Array<Any> = arrayOf(remaining)
            val var15: java.lang.String = java.lang.String.format(y, "%.1f", Arrays.copyOf(var13, var13.length))
            val text: java.lang.String = "Трапка исчезнет через: $var15"
            val var16: Int = context.getScaledWindowWidth()
            val var10001: TextRenderer = ضك.getMc().textRenderer
            context.drawTextWithShadow(
               ضك.getMc().textRenderer,
               text,
               (var16 - var10001.getWidth(text)) / 2,
               context.getScaledWindowHeight() - MathKt.roundToInt(طغ.INSTANCE.scaled(68.0F)),
               if (remaining <= 3.0) -43691 else -1250064
            )
         }
      }
   }

   private fun containsKeyword(mainName: String, offName: String, keywords: Array<String>): Boolean {
      for (keyword in keywords) {
         if (StringsKt.contains$default(mainName, keyword, false, 2, null) || StringsKt.contains$default(offName, keyword, false, 2, null)) {
            return true
         }
      }

      return false
   }

   private fun collectPlastPreviewBoxes(): List<class_238> {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return CollectionsKt.emptyList()
      } else {
         val var8: BlockPos = BlockPos.ofFloored(var10000.getX(), var10000.getY(), var10000.getZ())
         val pitch: Float = طث.getPitch(var10000 as Entity)
         if (Math.abs(pitch) > 45.0F) {
            return CollectionsKt.listOf(
               Box(
                  (double)var8.getX() - 2.0,
                  (double)var8.getY() + (if (pitch > 0.0F) -3.0 else 2.0),
                  (double)var8.getZ() - 2.0,
                  (double)var8.getX() + 3.0,
                  (double)var8.getY() + (if (pitch > 0.0F) -3.0 else 2.0) + 2.0,
                  (double)var8.getZ() + 3.0
               )
            )
         } else {
            val yOffset: Pair = this.directionFromYaw(طث.getYaw(var10000 as Entity))
            val dirX: Int = (yOffset.component1() as java.lang.Number).intValue()
            val dirZ: Int = (yOffset.component2() as java.lang.Number).intValue()
            return if (dirX != 0 && dirZ != 0)
               this.createDiagonalPlastBoxes(var8, dirX, dirZ)
               else
               CollectionsKt.listOf(this.createCardinalPlastBox(var8, dirX, dirZ))
            }
      }
   }

   @Commando
   public fun onItemUse(event: جم) {
      if (this.isEnabled() && trapka.getValue() && timeTrap.getValue()) {
         val var10000: ClientPlayerEntity = ضك.getMc().player
         if (var10000 != null) {
            if (event.getPlayer() === var10000) {
               if (!(event.getActionResult() == ActionResult.FAIL)) {
                  val var7: ItemStack = (event.getPlayer() as LivingEntity).getStackInHand(event.getHand())
                  if (var7.isOf(Items.NETHERITE_SCRAP)) {
                     trapTimerStartedAt = System.currentTimeMillis()
                  }
               }
            }
         }
      }
   }

   fun renderTrapkaCube(cameraX: شث, quadBuffer: VertexConsumer, cameraY: VertexConsumer, event: Double, lineBuffer: Double, cameraZ: Double) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         val var40: BlockPos = BlockPos.ofFloored(var10000.getX(), var10000.getY(), var10000.getZ())
         val dragonExpand: Double = if (dragonTrap.getValue()) 2.0 else 0.0
         val dragonOffset: Double = if (dragonTrap.getValue()) 1.0 else 0.0
         val x0: Double = var40.getX() - 2.0 - dragonOffset
         val y0: Double = var40.getY() - 2.0 + 2.01
         val z0: Double = var40.getZ() - 2.0 - dragonOffset
         val x1: Double = x0 + 5.01 + dragonExpand
         val y1: Double = y0 + 4.01 + dragonExpand
         val z1: Double = z0 + 5.0 + dragonExpand
         val outlineColor: Color = if (greenInTarget.getValue() && this.hasPlayerInRadius(3.1)) Color(0, 255, 0, 255) else Color(255, 255, 255, 255)
         val fillColor: Color = Color(outlineColor.getRed(), outlineColor.getGreen(), outlineColor.getBlue(), 38)
         val var41: Box = Box(x0, y0, z0, x1, y1, z1).offset(-cameraX, -cameraY, -cameraZ)
         تد.draw$default(تد.INSTANCE, event, quadBuffer, null, var41, fillColor, true, false, false, 0.0F, 0.0F, 0.0F, 1028, null)
         تد.draw$default(تد.INSTANCE, event, quadBuffer, lineBuffer, var41, outlineColor, false, true, false, 1.0F, 0.0F, 0.0F, 1024, null)
      }
   }

   private fun hasPlayerInRadius(radius: Double): Boolean {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return false
      } else {
         val player: ClientPlayerEntity = var10000
         val var12: ClientWorld = ضك.getMc().world
         if (var12 == null) {
            return false
         } else {
            val maxDistance: Float = (float)radius
            val var13: java.util.List = var12.getPlayers()
            val `$this$any$iv`: java.lang.Iterable = var13
            var var14: Boolean
            if (var13 is java.util.Collection && (var13 as java.util.Collection).isEmpty()) {
               var14 = false
            } else {
               val var8: java.util.Iterator = `$this$any$iv`.iterator()

               while (true) {
                  if (!var8.hasNext()) {
                     var14 = false
                     break
                  }

                  val other: AbstractClientPlayerEntity = var8.next() as AbstractClientPlayerEntity
                  if (!(other == player) && other.distanceTo(player as Entity) <= maxDistance) {
                     var14 = true
                     break
                  }
               }
            }

            return var14
         }
      }
   }

   private fun remainingTrapSeconds(): Double? {
      if (trapTimerStartedAt <= 0L) {
         return null
      } else {
         val remainingMs: Long = 15000L - (System.currentTimeMillis() - trapTimerStartedAt)
         if (remainingMs <= 0L) {
            trapTimerStartedAt = 0L
            return null
         } else {
            return (double)remainingMs / 1000.0
         }
      }
   }

   fun isHeld(offHand: ItemStack, item: ItemStack, mainHand: Item): Boolean {
      mainHand.isOf(item) || offHand.isOf(item)
   }

   @JvmStatic
   fun {
      اُ.moduleOnFuntime$default(اُ.INSTANCE, INSTANCE, null, 2, null)
   }

   private fun directionFromYaw(yaw: Float): Pair<Int, Int> {
      return if ((yaw % 360.0F + 360.0F) % 360.0F >= 337.5F || (yaw % 360.0F + 360.0F) % 360.0F < 22.5F)
         0 to 1
         else
         (
            if ((yaw % 360.0F + 360.0F) % 360.0F < 67.5F)
               -1 to 1
               else
               (
                  if ((yaw % 360.0F + 360.0F) % 360.0F < 112.5F)
                     -1 to 0
                     else
                     (
                        if ((yaw % 360.0F + 360.0F) % 360.0F < 157.5F)
                           -1 to -1
                           else
                           (
                              if ((yaw % 360.0F + 360.0F) % 360.0F < 202.5F)
                                 0 to -1
                                 else
                                 (
                                    if ((yaw % 360.0F + 360.0F) % 360.0F < 247.5F)
                                       1 to -1
                                       else
                                       (if ((yaw % 360.0F + 360.0F) % 360.0F < 292.5F) 1 to 0 else 1 to 1)
                                 )
                           )
                     )
               )
         )
      }

   fun renderCircle(segments: شث, radius: Immediate, lineWidth: Double, consumers: Int, event: Float) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         val var40: GameRenderer = ضك.getMc().gameRenderer
         val cameraPos: Vec3d = طث.getPos(طث.getCamera(var40))
         val var41: Vec3d = var10000.getLerpedPos(event.partialTicks)
         val centerX: Double = var41.x - cameraPos.x
         val centerY: Double = var41.y - cameraPos.y + 1.2
         val centerZ: Double = var41.z - cameraPos.z
         val adjustedLineWidth: Float = RangesKt.coerceIn(
            (float)(
               (double)(lineWidth * 1.15F)
                  / Math.max(1.0, Math.sqrt(centerX * centerX + centerY * centerY + (var41.z - cameraPos.z) * (var41.z - cameraPos.z)) / 20.0)
            ),
            1.0F,
            lineWidth * 1.15F
         )
         val layer: RenderLayer = RainRenderLayers.getDebugLineStrip((double)adjustedLineWidth)
         val var42: VertexConsumer = consumers.getBuffer(layer)
         val buffer: VertexConsumer = var42
         val color: Color = if (this.hasPlayerInRadius(radius)) Color(0, 255, 0, 230) else Color(255, 255, 255, 255)
         val var43: Entry = event.getMatrices().peek()
         val entry: Entry = var43
         var `$this$draw$iv`: Int = 0
         if (0 <= segments) {
            while (true) {
               val var44: VertexConsumer = buffer.vertex(
                     entry,
                     (float)(centerX + Math.cos((Math.PI * 2) * (double)`$this$draw$iv` / (double)segments) * radius),
                     (float)centerY,
                     (float)(centerZ + Math.sin((Math.PI * 2) * (double)`$this$draw$iv` / (double)segments) * radius)
                  )
                  .color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
                  val var45: VertexConsumer = var44.normal(entry, 0.0F, 1.0F, 0.0F)
               var45.lineWidth(adjustedLineWidth)
               if (`$this$draw$iv` == segments) {
                  break
               }

               `$this$draw$iv`++
            }
         }

         consumers.draw(layer)
      }
   }

   @Commando
   public fun onRender3D(event: شث) {
      if (this.isEnabled()) {
         val var10000: ClientPlayerEntity = ضك.getMc().player
         if (var10000 != null) {
            run label413@{
               var51 = var10000.getMainHandStack()
               var52 = var10000.getOffHandStack()
               if (trapka.getValue()) {
                  val var10003: Item = Items.NETHERITE_SCRAP
                  if (this.isHeld(var51, var52, var10003)) {
                     var53 = true
                     return@label413
                  }
               }

               var53 = false
            }

            var shouldRenderTrapka: Boolean
            run label416@{
               shouldRenderTrapka = var53
               if (plast.getValue()) {
                  val var60: Item = Items.DRIED_KELP
                  if (this.isHeld(var51, var52, var60)) {
                     var54 = true
                     return@label416
                  }
               }

               var54 = false
            }

            val shouldRenderPlast: Boolean = var54
            var var61: Item = Items.ENDER_EYE
            val directEnderEye: Boolean = this.isHeld(var51, var52, var61)
            var61 = Items.SUGAR
            val directSugarDust: Boolean = this.isHeld(var51, var52, var61)
            var61 = Items.FIRE_CHARGE
            val directFireTornado: Boolean = this.isHeld(var51, var52, var61)
            var61 = Items.PHANTOM_MEMBRANE
            val directGodsAura: Boolean = this.isHeld(var51, var52, var61)
            val needsNameFallback: Boolean = enderEyeCircle.getValue() && !directEnderEye
               || sugarDustCircle.getValue() && !directSugarDust
               || fireTornadoCircle.getValue() && !directFireTornado
               || godsAura.getValue() && !directGodsAura
               val mainName: java.lang.String = if (needsNameFallback) this.normalizedName(var51, mainHandNameCache) else ""
            val offName: java.lang.String = if (needsNameFallback) this.normalizedName(var52, offHandNameCache) else ""
            val shouldRenderEnderEye: Boolean = enderEyeCircle.getValue() && (directEnderEye || this.containsKeyword(mainName, offName, enderEyeKeywords))
            val shouldRenderSugarDust: Boolean = sugarDustCircle.getValue() && (directSugarDust || this.containsKeyword(mainName, offName, sugarDustKeywords))
            val shouldRenderFireTornado: Boolean = fireTornadoCircle.getValue()
               && (directFireTornado || this.containsKeyword(mainName, offName, fireTornadoKeywords))
               val shouldRenderGodsAura: Boolean = godsAura.getValue() && (directGodsAura || this.containsKeyword(mainName, offName, godsAuraKeywords))
            if (var53 || var54 || shouldRenderEnderEye || shouldRenderSugarDust || shouldRenderFireTornado || shouldRenderGodsAura) {
               val var55: GameRenderer = ضك.getMc().gameRenderer
               val cameraPos: Vec3d = طث.getPos(طث.getCamera(var55))
               val var19: AutoCloseable = BufferAllocator(262144) as AutoCloseable
               var var20: java.lang.Throwable = null

               try {
                  val var56: Immediate = VertexConsumerProvider.immediate(var19 as BufferAllocator)
                  val consumers: Immediate = var56
                  val var57: VertexConsumer = var56.getBuffer(RainRenderLayers.getHitBoxQuad(true))
                  val quadBuffer: VertexConsumer = var57
                  if (!shouldRenderTrapka && !shouldRenderPlast) {
                     INSTANCE.renderCircles(event, var56, shouldRenderEnderEye, shouldRenderSugarDust, shouldRenderFireTornado, shouldRenderGodsAura)
                     var56.draw()
                  } else {
                     val `$this$draw$iv`: AutoCloseable = BufferAllocator(262144) as AutoCloseable
                     var `$i$f$draw`: Int = null

                     try {
                        val var58: Immediate = VertexConsumerProvider.immediate(`$this$draw$iv` as BufferAllocator)
                        val var59: VertexConsumer = var58.getBuffer(RainRenderLayers.getHitBoxLine(1.0))
                        if (shouldRenderTrapka) {
                           INSTANCE.renderTrapkaCube(event, quadBuffer, var59, cameraPos.x, cameraPos.y, cameraPos.z)
                        }

                        if (shouldRenderPlast) {
                           INSTANCE.renderPlastPreview(event, quadBuffer, var59, cameraPos.x, cameraPos.y, cameraPos.z)
                        }

                        INSTANCE.renderCircles(event, consumers, shouldRenderEnderEye, shouldRenderSugarDust, shouldRenderFireTornado, shouldRenderGodsAura)
                        consumers.draw()
                        var58.draw()
                     } catch (var41: java.lang.Throwable) {
                        `$i$f$draw` = (int)var41
                        throw var41
                     } finally {
                        AutoCloseableKt.closeFinally(`$this$draw$iv`, `$i$f$draw`)
                     }
                  }
               } catch (var43: java.lang.Throwable) {
                  var20 = var43
                  throw var43
               } finally {
                  AutoCloseableKt.closeFinally(var19, var20)
               }
            }
         }
      }
   }

   fun normalizedName(stack: ItemStack, cache: حأ): java.lang.String {
      if (stack.isEmpty()) {
         ""
      } else {
         val componentsHash: Int = stack.getComponentChanges().hashCode()
         if (cache.getStack() != stack || cache.componentsHash != componentsHash) {
            cache.setStack(stack)
            cache.componentsHash = componentsHash
            var var10001: java.lang.String = طث.getName(stack).getString()
            val var5: Locale = Locale.ROOT
            var10001 = var10001.toLowerCase(var5)
            cache.name = var10001
         }

         cache.name
      }
   }

   fun createCardinalPlastBox(blockPos: BlockPos, dirZ: Int, dirX: Int): Box {
      val x: Double = blockPos.getX()
      val y: Double = blockPos.getY()
      val z: Double = blockPos.getZ()
      if (dirZ == 1)
         Box(x - 2.0, y - 1.0, z + 2.0, x + 3.0, y + 4.0, z + 4.0)
         else
         (
            if (dirZ == -1)
               Box(x - 2.0, y - 1.0, z - 3.0, x + 3.0, y + 4.0, z - 1.0)
               else
               (if (dirX == 1) Box(x + 2.0, y - 1.0, z - 2.0, x + 4.0, y + 4.0, z + 3.0) else Box(x - 3.0, y - 1.0, z - 2.0, x - 1.0, y + 4.0, z + 3.0))
         )
      }
}
