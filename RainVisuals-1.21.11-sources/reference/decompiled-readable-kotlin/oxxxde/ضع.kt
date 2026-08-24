package oxxxde

import com.mojang.blaze3d.opengl.GlStateManager
import java.awt.Color
import java.util.ArrayList
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.render.HitWavesModule$Wave
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import net.minecraft.block.BlockState
import net.minecraft.block.PlantBlock
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.RainRenderLayers
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.util.BufferAllocator
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.client.world.ClientWorld
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Box
import net.minecraft.util.math.Position
import net.minecraft.util.math.Vec3d
import net.minecraft.world.BlockView
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object ضع : Module("HitWaves", RENDER, "Визуальная волна при ударе") {
   @JvmStatic
   private SliderSetting speed = Module.slider$default(ضع.INSTANCE, "Скорость", 20.0F, 10.0F, 18.0F, 0.5F, null, 32, null);
   private const val FILLED_ALPHA_SCALE: Float = 0.35F
   private const val BUFFER_SIZE: Int = 262144
   @JvmStatic
   private SliderSetting radius = Module.slider$default(ضع.INSTANCE, "Радиус", 10.0F, 8.0F, 16.0F, 0.5F, null, 32, null);
   private const val WAVE_THICKNESS: Float = 1.0F
   private const val END_FADE_PORTION: Float = 0.35F
   private final val waves: ArrayList<ٍ> = ArrayList()
   @JvmStatic
   private BooleanSetting useClientColor = Module.boolean$default(INSTANCE, "Цвет клиента", false, null, 4, null).setVisible({ 
      ظث.INSTANCE.isEnabled()
   });
   @JvmStatic
   private BooleanSetting hh = Module.boolean$default(INSTANCE, "Обводка", true, null, 4, null);
   @JvmStatic
   private ColorSetting waveColor;
   private const val OUTLINE_WIDTH: Float = 0.015F

   public override fun onEnable() {
      waves.clear()
   }

   fun addVertex(z: VertexConsumer, alpha: Entry, x: Float, entry: Float, blue: Float, buffer: Int, green: Int, y: Int, red: Int) {
      buffer.vertex(entry, x, y, z).color(red, green, blue, alpha)
   }

   fun spawnWave(color: Vec3d, radius: Float, speed: Float, center: Color) {
      waves.add(
         HitWavesModule$Wave(
            center, radius, speed, radius / Math.max(0.1F, speed), color, System.currentTimeMillis(), this.collectSurfaceBlocks(center, radius)
         )
      )
   }

   fun isSurfaceBlock(state: BlockState, aboveState: BlockState, pos: BlockPos): Boolean {
      val var10000: ClientWorld = ضك.getMc().world
      var10000 != null && !state.isAir() && aboveState.isAir() && !state.getCollisionShape(var10000 as BlockView, pos).isEmpty()
   }

   @JvmStatic
   fun {
      val var10000: Module = INSTANCE
      val var10002: Color = Color.WHITE
      waveColor = Module.color$default(var10000, "Цвет", var10002, null, 4, null).setVisible({ 
         !useClientColor.getValue() || !ظث.INSTANCE.isEnabled()
      })
   }

   private fun selectedColor(): Color {
      return if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else waveColor.getValue()
   }

   fun drawWireframeBox(buffer: MatrixStack, green: VertexConsumer, box: Box, blue: Float, matrices: Int, alpha: Int, width: Int, red: Int) {
      val minX: Float = (float)box.minX
      val minY: Float = (float)box.minY
      val minZ: Float = (float)box.minZ
      val maxX: Float = (float)box.maxX
      val maxY: Float = (float)box.maxY
      val maxZ: Float = (float)box.maxZ
      this.addBoxVertices(matrices, buffer, minX - width, minY, minZ - width, minX + width, maxY, minZ + width, red, green, blue, alpha)
      this.addBoxVertices(matrices, buffer, maxX - width, minY, minZ - width, maxX + width, maxY, minZ + width, red, green, blue, alpha)
      this.addBoxVertices(matrices, buffer, minX - width, minY, maxZ - width, minX + width, maxY, maxZ + width, red, green, blue, alpha)
      this.addBoxVertices(matrices, buffer, maxX - width, minY, maxZ - width, maxX + width, maxY, maxZ + width, red, green, blue, alpha)
      this.addBoxVertices(matrices, buffer, minX, minY - width, minZ - width, maxX, minY + width, minZ + width, red, green, blue, alpha)
      this.addBoxVertices(matrices, buffer, minX, minY - width, maxZ - width, maxX, minY + width, maxZ + width, red, green, blue, alpha)
      this.addBoxVertices(matrices, buffer, minX, maxY - width, minZ - width, maxX, maxY + width, minZ + width, red, green, blue, alpha)
      this.addBoxVertices(matrices, buffer, minX, maxY - width, maxZ - width, maxX, maxY + width, maxZ + width, red, green, blue, alpha)
      this.addBoxVertices(matrices, buffer, minX - width, minY - width, minZ, minX + width, minY + width, maxZ, red, green, blue, alpha)
      this.addBoxVertices(matrices, buffer, maxX - width, minY - width, minZ, maxX + width, minY + width, maxZ, red, green, blue, alpha)
      this.addBoxVertices(matrices, buffer, minX - width, maxY - width, minZ, minX + width, maxY + width, maxZ, red, green, blue, alpha)
      this.addBoxVertices(matrices, buffer, maxX - width, maxY - width, minZ, maxX + width, maxY + width, maxZ, red, green, blue, alpha)
   }

   private fun computeAlphaForBlock(wave: ٍ, distance: Float, waveFront: Float): Float {
      val baseAlpha: Float = Math.min((float)wave.color.getAlpha() / 255.0F, 0.8F)
      val distanceToWave: Float = Math.abs(distance - waveFront)
      return if (distanceToWave > 1.0F) 0.0F else baseAlpha * (1.0F - distanceToWave / 1.0F)
   }

   fun addBoxVertices(
      maxY: MatrixStack,
      green: VertexConsumer,
      alpha: Float,
      maxZ: Float,
      maxX: Float,
      minX: Float,
      minY: Float,
      matrices: Float,
      red: Int,
      buffer: Int,
      minZ: Int,
      blue: Int
   ) {
      val var10000: Entry = matrices.peek()
      this.addVertex(buffer, var10000, minX, minY, minZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, minY, minZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, minY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, minX, minY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, minX, maxY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, maxY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, maxY, minZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, minX, maxY, minZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, minX, minY, minZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, minX, maxY, minZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, maxY, minZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, minY, minZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, minY, minZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, maxY, minZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, maxY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, minY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, minY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, maxX, maxY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, minX, maxY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, minX, minY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, minX, minY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, minX, maxY, maxZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, minX, maxY, minZ, red, green, blue, alpha)
      this.addVertex(buffer, var10000, minX, minY, minZ, red, green, blue, alpha)
   }

   fun collectSurfaceBlocks(radius: Vec3d, center: Float): MutableList<BlockPos> {
      val var10000: ClientWorld = ضك.getMc().world
      if (var10000 == null) {
         CollectionsKt.emptyList()
      } else {
         val world: ClientWorld = var10000
         val result: ArrayList = ArrayList()
         val limit: Int = (int)Math.ceil((double)radius)
         val var17: BlockPos = BlockPos.ofFloored(center as Position)
         val origin: BlockPos = var17
         val radiusSquared: Float = radius * radius
         var x: Int = -limit
         if (-limit <= limit) {
            while (true) {
               var y: Int = -limit
               if (-limit <= limit) {
                  while (true) {
                     var z: Int = -limit
                     if (-limit <= limit) {
                        while (true) {
                           val var18: BlockPos = origin.add(x, y, z)
                           if (!(
                              Vec3d((double)var18.getX() + 0.5, (double)var18.getY() + 0.5, (double)var18.getZ() + 0.5).squaredDistanceTo(center)
                                 > radiusSquared
                           )) {
                              var surfacePos: BlockPos = var18
                              val var19: BlockState = world.getBlockState(var18)
                              var state: BlockState = var19
                              if (var19.getBlock() is PlantBlock) {
                                 val var20: BlockPos = var18.down()
                                 val var21: BlockState = world.getBlockState(var20)
                                 if (!var21.isAir()) {
                                    surfacePos = var20
                                    state = var21
                                 }
                              }

                              val var10001: BlockState = world.getBlockState(surfacePos.up())
                              if (this.isSurfaceBlock(var10001, state, surfacePos)) {
                                 result.add(surfacePos)
                              }
                           }

                           if (z == limit) {
                              break
                           }

                           z++
                        }
                     }

                     if (y == limit) {
                        break
                     }

                     y++
                  }
               }

               if (x == limit) {
                  break
               }

               x++
            }
         }

         result as java.util.List
      }
   }

   @Commando
   public fun onAttack(event: ذم) {
      if (this.isEnabled()) {
         if (ضك.getMc().world != null) {
            this.spawnWave(طث.getPos(event.getEntity()), radius.getValue().floatValue(), speed.getValue().floatValue(), this.selectedColor())
         }
      }
   }

   public override fun onDisable() {
      waves.clear()
   }

   @Commando
   public fun onRender3D(event: شث) {
      if (this.isEnabled() && !waves.isEmpty()) {
         val allocator: BufferAllocator = BufferAllocator(262144)
         val var10000: GameRenderer = ضك.getMc().gameRenderer
         val cameraPos: Vec3d = طث.getPos(طث.getCamera(var10000))
         val now: Long = System.currentTimeMillis()
         GlStateManager._enableBlend()
         GlStateManager._blendFuncSeparate(770, 771, 1, 0)
         GlStateManager._enableDepthTest()
         GlStateManager._disableCull()

         try {
            val var35: Immediate = VertexConsumerProvider.immediate(allocator)
            val var36: VertexConsumer = var35.getBuffer(RainRenderLayers.getHitBoxQuad(true))
            val boxBuffer: VertexConsumer = var36
            event.getMatrices().push()
            event.getMatrices().translate(-cameraPos.x, -cameraPos.y, -cameraPos.z)
            val var37: java.util.Iterator = waves.iterator()
            val iterator: java.util.Iterator = var37

            while (iterator.hasNext()) {
               val var38: Any = iterator.next()
               val `$this$draw$iv`: HitWavesModule$Wave = var38 as HitWavesModule$Wave
               val `$i$f$draw`: Float = (float)(now - (var38 as HitWavesModule$Wave).startTime) / 1000.0F
               if (`$i$f$draw` > `$this$draw$iv`.durationSeconds) {
                  iterator.remove()
               } else {
                  val waveFront: Float = Math.min(`$i$f$draw` * `$this$draw$iv`.speed, `$this$draw$iv`.radius)
                  val endFade: Float = RangesKt.coerceIn(
                     (`$this$draw$iv`.durationSeconds - `$i$f$draw`) / RangesKt.coerceAtLeast(`$this$draw$iv`.durationSeconds * 0.35F, 0.001F), 0.0F, 1.0F
                  )

                  for (blockPos in `$this$draw$iv`.blocks) {
                     val distance: Float = (float)Math.sqrt(
                        Vec3d((double)blockPos.getX() + 0.5, (double)blockPos.getY() + 0.5, (double)blockPos.getZ() + 0.5)
                           .squaredDistanceTo(`$this$draw$iv`.getCenter())
                     )
                     if (!(distance > `$this$draw$iv`.radius)) {
                        val alpha: Float = this.computeAlphaForBlock(`$this$draw$iv`, distance, waveFront) * endFade
                        if (!(alpha <= 0.0F)) {
                           val filledAlpha: Int = RangesKt.coerceIn((int)(150.0F * alpha * 0.35F), 0, 255)
                           val baseColor: Color = `$this$draw$iv`.color
                           val var39: Box = Box(blockPos).expand(0.002)
                           this.drawSolidBox(event.getMatrices(), boxBuffer, var39, baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), filledAlpha)
                           if (hh.getValue()) {
                              val var33: Color = Color(
                                 RangesKt.coerceAtMost(baseColor.getRed() + 40, 255),
                                 RangesKt.coerceAtMost(baseColor.getGreen() + 40, 255),
                                 RangesKt.coerceAtMost(baseColor.getBlue() + 40, 255),
                                 RangesKt.coerceIn((int)(255.0F * alpha), 0, 255)
                              )
                              val var10001: MatrixStack = event.getMatrices()
                              val var10003: Box = Box(blockPos).expand(0.005)
                              this.drawWireframeBox(var10001, boxBuffer, var10003, 0.015F, var33.getRed(), var33.getGreen(), var33.getBlue(), var33.getAlpha())
                           }
                        }
                     }
                  }
               }
            }

            event.getMatrices().pop()
            var35.draw()
         } finally {
            allocator.close()
            GlStateManager._enableCull()
            GlStateManager._disableBlend()
         }
      }
   }

   fun drawSolidBox(box: MatrixStack, alpha: VertexConsumer, matrices: Box, red: Int, blue: Int, green: Int, buffer: Int) {
      this.addBoxVertices(
         matrices, buffer, (float)box.minX, (float)box.minY, (float)box.minZ, (float)box.maxX, (float)box.maxY, (float)box.maxZ, red, green, blue, alpha
      )
   }
}
