package oxxxde

import java.awt.Color
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.UUID
import kotakbaz.rain.event.events.Render3DEvent
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.render.BlinkModule$BlinkSnapshot
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import kotlin.jdk7.AutoCloseableKt
import net.minecraft.class_243
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.option.GameOptions
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.RainRenderLayers
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.util.BufferAllocator
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.math.RotationAxis
import net.minecraft.util.math.Vec3d
import org.joml.Quaternionfc
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object بَ : Module("Blink", RENDER, "Визуальные слепки игрока") {
   private const val SNAPSHOT_DELAY_MS: Long = 500L
   private const val LIMB_WIDTH: Float = 0.25F
   @JvmStatic
   private ColorSetting color;
   private final val lastPositions: HashMap<UUID, class_243> = HashMap()
   @JvmStatic
   private SliderSetting myLifetime = Module.slider$default(بَ.INSTANCE, "Время жизни", 1.5F, 1.0F, 5.0F, 0.1F, null, 32, null);
   private const val BODY_DEPTH: Float = 0.25F
   @JvmStatic
   private BooleanSetting dashedOutline = Module.boolean$default(بَ.INSTANCE, "Пунктир", false, null, 4, null);
   private final val playerSnapshots: LinkedHashMap<UUID, MutableList<خب>> = LinkedHashMap()
   private const val DASH_ANIMATION_SPEED: Float = 1.2F
   private const val HEAD_SIZE: Float = 0.5F
   private const val MIN_MOVE_DISTANCE: Double = 0.3
   @JvmStatic
   private BooleanSetting useClientColor = Module.boolean$default(INSTANCE, "Цвет клиента", false, null, 4, null).setVisible({ 
      ظث.INSTANCE.isEnabled()
   });
   private const val BUFFER_SIZE: Int = 1048576
   private const val LEG_HEIGHT: Float = 0.75F
   private const val THICKNESS_SCALE: Float = 0.005F
   private const val DASH_GAP: Float = 0.025F
   private final var lastFrameTime: Long = System.nanoTime()
   private const val MIN_THICKNESS: Float = 0.002F
   private const val MIN_SEGMENT_LENGTH: Float = 0.001F
   private final var dashOffset: Float
   @JvmStatic
   private BooleanSetting fill = Module.boolean$default(INSTANCE, "Заполнить", false, null, 4, null);
   private const val DASH_WRAP: Float = 1.0F
   private const val ARM_HEIGHT: Float = 0.7F
   private const val OUTLINE_WIDTH: Float = 1.5F
   private const val BODY_HEIGHT: Float = 0.7F
   private const val DASH_LENGTH: Float = 0.05F
   private const val MAX_SNAPSHOTS: Int = 5
   @JvmStatic
   private ClientWorld trackedWorld;
   private const val BODY_WIDTH: Float = 0.5F

   fun emitOutline(color: VertexConsumer, maxX: Entry, maxY: Float, minY: Float, minX: Float, minZ: Float, entry: Float, buffer: Float, maxZ: Color) {
      this.emitLine(buffer, entry, minX, minY, minZ, maxX, minY, minZ, color)
      this.emitLine(buffer, entry, maxX, minY, minZ, maxX, minY, maxZ, color)
      this.emitLine(buffer, entry, maxX, minY, maxZ, minX, minY, maxZ, color)
      this.emitLine(buffer, entry, minX, minY, maxZ, minX, minY, minZ, color)
      this.emitLine(buffer, entry, minX, maxY, minZ, maxX, maxY, minZ, color)
      this.emitLine(buffer, entry, maxX, maxY, minZ, maxX, maxY, maxZ, color)
      this.emitLine(buffer, entry, maxX, maxY, maxZ, minX, maxY, maxZ, color)
      this.emitLine(buffer, entry, minX, maxY, maxZ, minX, maxY, minZ, color)
      this.emitLine(buffer, entry, minX, minY, minZ, minX, maxY, minZ, color)
      this.emitLine(buffer, entry, maxX, minY, minZ, maxX, maxY, minZ, color)
      this.emitLine(buffer, entry, minX, minY, maxZ, minX, maxY, maxZ, color)
      this.emitLine(buffer, entry, maxX, minY, maxZ, maxX, maxY, maxZ, color)
   }

   fun renderHead(yaw: MatrixStack, matrices: VertexConsumer, pitch: Float, buffer: Float, color: Color) {
      matrices.push()
      matrices.translate(0.0F, 1.95F, 0.0F)
      matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(yaw) as Quaternionfc)
      matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(pitch) as Quaternionfc)
      this.renderCenteredPrism(matrices, buffer, 0.5F, 0.5F, 0.5F, color)
      matrices.pop()
   }

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      if (this.isEnabled()) {
         val var2: ClientWorld = ضك.getMc().world
         if (var2 == null) {
            clearState$default(this, null, 1, null)
         } else {
            val var3: ClientPlayerEntity = ضك.getMc().player
            if (var3 == null) {
               clearState$default(this, null, 1, null)
            } else {
               if (trackedWorld != var2) {
                  this.clearState(var2)
               }

               val var4: Long = System.currentTimeMillis()
               this.pruneExpiredSnapshots(var4)
               if (!اإ.INSTANCE.isFakePlayer(var3) && this.shouldCreateSnapshot(var3)) {
                  val var6: Vec3d = طث.getPos(var3)
                  val var7: Vec3d = lastPositions.get(var3.getUuid())
                  lastPositions.put(var3.getUuid(), var6)
                  var var8: java.util.List = playerSnapshots.get(var3.getUuid())
                  if (var8 == null) {
                     var8 = ArrayList()
                     playerSnapshots.put(var3.getUuid(), var8)
                  }

                  val var9: BlinkModule$BlinkSnapshot = CollectionsKt.lastOrNull(var8)
                  var8.add(BlinkModule$BlinkSnapshot.Companion.from(var3, var6, var4))

                  while (var8.size() > 5) {
                     var8.remove(0)
                  }
               } else {
                  playerSnapshots.remove(var3.getUuid())
                  lastPositions.remove(var3.getUuid())
               }
            }
         }
      }
   }

   private fun updateDashOffset() {
      val currentNanoTime: Long = System.nanoTime()
      val deltaSeconds: Float = (float)RangesKt.coerceAtLeast(currentNanoTime - lastFrameTime, 0L) / 1.0E9F
      lastFrameTime = currentNanoTime
      if (dashedOutline.getValue()) {
         dashOffset += deltaSeconds * 1.2F
         if (dashOffset > 1.0F) {
            dashOffset %= 1.0F
         }
      }
   }

   fun emitLine(entry: VertexConsumer, y2: Entry, x1: Float, x2: Float, z2: Float, color: Float, z1: Float, y1: Float, buffer: Color) {
      val dx: Float = Math.abs(x2 - x1)
      val dy: Float = Math.abs(y2 - y1)
      val dz: Float = Math.abs(z2 - z1)
      if (!(dx <= 0.001F) || !(dy <= 0.001F) || !(dz <= 0.001F)) {
         val half: Float = Math.max(0.0075F, 0.002F)
         this.emitSolidBox(
            buffer,
            entry,
            Math.min(x1, x2) - (if (dx <= 0.001F) half else 0.0F),
            Math.min(y1, y2) - (if (dy <= 0.001F) half else 0.0F),
            Math.min(z1, z2) - (if (dz <= 0.001F) half else 0.0F),
            Math.max(x1, x2) + (if (dx <= 0.001F) half else 0.0F),
            Math.max(y1, y2) + (if (dy <= 0.001F) half else 0.0F),
            Math.max(z1, z2) + (if (dz <= 0.001F) half else 0.0F),
            color
         )
      }
   }

   private fun snapshotLifetime(): Long {
      return (long)(myLifetime.getValue().floatValue() * 1000.0F)
   }

   fun clearState(world: ClientWorld) {
      playerSnapshots.clear()
      lastPositions.clear()
      trackedWorld = world
      dashOffset = 0.0F
      lastFrameTime = System.nanoTime()
   }

   fun emitDashedOutline(minX: VertexConsumer, color: Entry, maxX: Float, minZ: Float, maxZ: Float, entry: Float, minY: Float, buffer: Float, maxY: Color) {
      this.emitDashedLine(buffer, entry, minX, minY, minZ, maxX, minY, minZ, color)
      this.emitDashedLine(buffer, entry, maxX, minY, minZ, maxX, minY, maxZ, color)
      this.emitDashedLine(buffer, entry, maxX, minY, maxZ, minX, minY, maxZ, color)
      this.emitDashedLine(buffer, entry, minX, minY, maxZ, minX, minY, minZ, color)
      this.emitDashedLine(buffer, entry, minX, maxY, minZ, maxX, maxY, minZ, color)
      this.emitDashedLine(buffer, entry, maxX, maxY, minZ, maxX, maxY, maxZ, color)
      this.emitDashedLine(buffer, entry, maxX, maxY, maxZ, minX, maxY, maxZ, color)
      this.emitDashedLine(buffer, entry, minX, maxY, maxZ, minX, maxY, minZ, color)
      this.emitDashedLine(buffer, entry, minX, minY, minZ, minX, maxY, minZ, color)
      this.emitDashedLine(buffer, entry, maxX, minY, minZ, maxX, maxY, minZ, color)
      this.emitDashedLine(buffer, entry, minX, minY, maxZ, minX, maxY, maxZ, color)
      this.emitDashedLine(buffer, entry, maxX, minY, maxZ, maxX, maxY, maxZ, color)
   }

   fun renderPlayerSnapshot(cameraPos: Render3DEvent, color: VertexConsumer, snapshot: BlinkModule$BlinkSnapshot, event: Color, buffer: Vec3d) {
      val limbPos: Float = snapshot.limbPos
      val limbSpeed: Float = snapshot.limbSpeed
      val armLeftSwing: Float = (float)Math.sin((double)(limbPos * 0.6662F + (float) Math.PI)) * 2.0F * limbSpeed * 0.5F
      val armRightSwing: Float = (float)Math.sin((double)(limbPos * 0.6662F)) * 2.0F * limbSpeed * 0.5F
      val legLeftSwing: Float = (float)Math.sin((double)(limbPos * 0.6662F)) * 1.4F * limbSpeed
      val legRightSwing: Float = (float)Math.sin((double)(limbPos * 0.6662F + (float) Math.PI)) * 1.4F * limbSpeed
      val headYaw: Float = -(snapshot.headYaw - snapshot.bodyYaw)
      event.getMatrices().push()
      event.getMatrices().translate(snapshot.getPosition().x - cameraPos.x, snapshot.getPosition().y - cameraPos.y, snapshot.getPosition().z - cameraPos.z)
      event.getMatrices().multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F - snapshot.bodyYaw) as Quaternionfc)
      if (snapshot.gliding) {
         event.getMatrices().translate(0.0F, 1.0F, 0.0F)
         event.getMatrices().multiply(RotationAxis.POSITIVE_X.rotationDegrees(-90.0F + snapshot.pitch) as Quaternionfc)
         event.getMatrices().translate(0.0F, -1.0F, 0.0F)
      }

      this.renderHead(event.getMatrices(), buffer, headYaw, snapshot.pitch, color)
      this.renderPart(event.getMatrices(), buffer, 0.0F, 1.45F, 0.0F, 0.5F, 0.7F, 0.25F, 0.0F, color)
      this.renderPart(event.getMatrices(), buffer, -0.375F, 1.45F, 0.0F, 0.25F, 0.7F, 0.25F, armLeftSwing, color)
      this.renderPart(event.getMatrices(), buffer, 0.375F, 1.45F, 0.0F, 0.25F, 0.7F, 0.25F, armRightSwing, color)
      this.renderPart(event.getMatrices(), buffer, -0.125F, 0.75F, 0.0F, 0.25F, 0.75F, 0.25F, legLeftSwing, color)
      this.renderPart(event.getMatrices(), buffer, 0.125F, 0.75F, 0.0F, 0.25F, 0.75F, 0.25F, legRightSwing, color)
      event.getMatrices().pop()
   }

   fun renderPart(
      x: MatrixStack, color: VertexConsumer, depth: Float, width: Float, matrices: Float, buffer: Float, height: Float, y: Float, rotationX: Float, z: Color
   ) {
      matrices.push()
      matrices.translate(x, y, z)
      if (rotationX != 0.0F) {
         matrices.multiply(RotationAxis.POSITIVE_X.rotation(rotationX) as Quaternionfc)
      }

      this.renderCenteredPrism(matrices, buffer, width, height, depth, color)
      matrices.pop()
   }

   public override fun onDisable() {
      clearState$default(this, null, 1, null)
   }

   fun emitQuad(
      y1: VertexConsumer,
      z1: Entry,
      buffer: Float,
      entry: Float,
      z2: Float,
      x4: Float,
      z4: Float,
      y3: Float,
      z3: Float,
      y2: Float,
      y4: Float,
      x3: Float,
      color: Float,
      x2: Float,
      x1: Color
   ) {
      buffer.vertex(entry, x1, y1, z1).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
      buffer.vertex(entry, x2, y2, z2).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
      buffer.vertex(entry, x3, y3, z3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
      buffer.vertex(entry, x4, y4, z4).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
   }

   fun emitDashedLine(z1: VertexConsumer, y2: Entry, y1: Float, entry: Float, x1: Float, x2: Float, z2: Float, color: Float, buffer: Color) {
      val dx: Float = x2 - x1
      val dy: Float = y2 - y1
      val dz: Float = z2 - z1
      val totalLength: Float = (float)Math.sqrt((double)(dx * dx + dy * dy + (z2 - z1) * (z2 - z1)))
      if (!(totalLength <= 0.001F)) {
         val normalizedLength: Float = 0.05F / totalLength
         val normalizedPattern: Float = 0.075F / totalLength
         var offset: Float = dashOffset * 0.075F
         if (dashOffset * 0.075F > 0.075F) {
            offset %= 0.075F
         }

         // $VF: Unable to resugar Kotlin loop from Java for loop
         var t: Float = -(offset / totalLength)
         while (true) {
            if (t < 1.0F) break
            val startT: Float = RangesKt.coerceAtLeast(t, 0.0F)
            val endT: Float = RangesKt.coerceAtMost(t + normalizedLength, 1.0F)
            if (endT > startT) {
               this.emitLine(buffer, entry, x1 + dx * startT, y1 + dy * startT, z1 + dz * startT, x1 + dx * endT, y1 + dy * endT, z1 + dz * endT, color)
            }

            t += normalizedPattern
         }
      }
   }

   @Commando
   public fun onRender3D(event: شث) {
      if (this.isEnabled()) {
         val var10000: ClientWorld = ضك.getMc().world
         if (var10000 != null) {
            if (ضك.getMc().player != null) {
               if (!playerSnapshots.isEmpty()) {
                  if (trackedWorld != var10000) {
                     this.clearState(var10000)
                  } else {
                     this.updateDashOffset()
                     val now: Long = System.currentTimeMillis()
                     val var27: GameOptions = ضك.getMc().options
                     if (!طث.getPerspective(var27).isFirstPerson()) {
                        val var28: GameRenderer = ضك.getMc().gameRenderer
                        val cameraPos: Vec3d = طث.getPos(طث.getCamera(var28))
                        val var6: AutoCloseable = BufferAllocator(1048576) as AutoCloseable
                        var var7: java.lang.Throwable = null

                        try {
                           val var29: Immediate = VertexConsumerProvider.immediate(var6 as BufferAllocator)
                           val var30: VertexConsumer = var29.getBuffer(RainRenderLayers.getHitBoxQuad(true))
                           val buffer: VertexConsumer = var30

                           for (var31 in playerSnapshots.values()) {
                              val `$i$f$draw`: java.util.List = var31 as java.util.List
                              val lifetimeMs: Long = INSTANCE.snapshotLifetime()

                              for (snapshot in `$i$f$draw`) {
                                 val alpha: Float = snapshot.alpha(lifetimeMs, now)
                                 if (!(alpha <= 0.0F)) {
                                    INSTANCE.renderPlayerSnapshot(event, buffer, snapshot, بح.INSTANCE.setAlpha(INSTANCE.resolveBlinkColor(), alpha), cameraPos)
                                 }
                              }
                           }

                           var29.draw()
                        } catch (var22: java.lang.Throwable) {
                           var7 = var22
                           throw var22
                        } finally {
                           AutoCloseableKt.closeFinally(var6, var7)
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public override fun onEnable() {
      clearState$default(this, null, 1, null)
   }

   fun shouldCreateSnapshot(player: PlayerEntity): Boolean {
      if (player.isAlive() && !player.isRemoved() && !player.isInvisible() && !player.isSpectator()) {
         val var10000: GameOptions = ضك.getMc().options
         !طث.getPerspective(var10000).isFirstPerson()
      } else {
         false
      }
   }

   fun renderCenteredPrism(buffer: MatrixStack, matrices: VertexConsumer, width: Float, height: Float, color: Float, depth: Color) {
      this.renderPrism(matrices, buffer, -(width * 0.5F), -height, -(depth * 0.5F), width * 0.5F, 0.0F, depth * 0.5F, color)
   }

   fun emitSolidBox(z1: VertexConsumer, buffer: Entry, y1: Float, z2: Float, color: Float, y2: Float, entry: Float, x2: Float, x1: Color) {
      this.emitQuad(buffer, entry, x1, y1, z1, x2, y1, z1, x2, y2, z1, x1, y2, z1, color)
      this.emitQuad(buffer, entry, x1, y1, z2, x2, y1, z2, x2, y2, z2, x1, y2, z2, color)
      this.emitQuad(buffer, entry, x1, y1, z1, x1, y1, z2, x1, y2, z2, x1, y2, z1, color)
      this.emitQuad(buffer, entry, x2, y1, z1, x2, y1, z2, x2, y2, z2, x2, y2, z1, color)
      this.emitQuad(buffer, entry, x1, y1, z1, x2, y1, z1, x2, y1, z2, x1, y1, z2, color)
      this.emitQuad(buffer, entry, x1, y2, z1, x2, y2, z1, x2, y2, z2, x1, y2, z2, color)
   }

   private fun pruneExpiredSnapshots(currentTime: Long) {
      val iterator: java.util.Iterator = playerSnapshots.entrySet().iterator()

      while (iterator.hasNext()) {
         val var10000: Any = iterator.next()
         val entry: java.util.Map.Entry = var10000 as java.util.Map.Entry
         ((var10000 as java.util.Map.Entry).getValue() as java.util.List).removeIf({ p0: Any ->
            `$tmp0`(p0)
         })
         if ((entry.getValue() as java.util.List).isEmpty()) {
            iterator.remove()
         }
      }
   }

   @JvmStatic
   fun {
      val var10000: Module = INSTANCE
      val var10002: Color = Color.WHITE
      color = Module.color$default(var10000, "Цвет", var10002, null, 4, null).setVisible({ 
         !useClientColor.getValue() || !ظث.INSTANCE.isEnabled()
      })
   }

   fun renderPrism(matrices: MatrixStack, color: VertexConsumer, x2: Float, z2: Float, y2: Float, z1: Float, buffer: Float, y1: Float, x1: Color) {
      val minX: Float = Math.min(x1, x2)
      val minY: Float = Math.min(y1, y2)
      val minZ: Float = Math.min(z1, z2)
      val maxX: Float = Math.max(x1, x2)
      val maxY: Float = Math.max(y1, y2)
      val maxZ: Float = Math.max(z1, z2)
      val var10000: Entry = matrices.peek()
      if (fill.getValue()) {
         this.emitSolidBox(
            buffer,
            var10000,
            minX,
            minY,
            minZ,
            maxX,
            maxY,
            maxZ,
            Color(color.getRed(), color.getGreen(), color.getBlue(), RangesKt.coerceAtLeast(color.getAlpha() / 4, if (color.getAlpha() > 0) 1 else 0))
         )
      }

      if (dashedOutline.getValue()) {
         this.emitDashedOutline(buffer, var10000, minX, minY, minZ, maxX, maxY, maxZ, color)
      } else {
         this.emitOutline(buffer, var10000, minX, minY, minZ, maxX, maxY, maxZ, color)
      }
   }

   private fun resolveBlinkColor(): Color {
      return if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else color.getValue()
   }
}
