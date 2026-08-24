package kotakbaz.rain.client.draggable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotakbaz.rain.client.draggable.animation.AnimationUtil
import kotakbaz.rain.client.draggable.animation.Easing
import kotakbaz.rain.module.Module
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.Window
import oxxxde.ثٌ
import oxxxde.حل
import oxxxde.دِ
import oxxxde.ضش
import oxxxde.ظذ

// $VF: Compiled from heavy
public class Draggable private constructor() {
   public final var width: Float
   private Module module;

   @SerializedName("y")
   @Expose
   public final var y: Float

   private final var targetY: Float

   public final var hasStoredPosition: Boolean
      private set

   private final var targetX: Float

   @Expose
   @SerializedName("x")
   public final var x: Float

   public final var height: Float
   private final var offsetX: Float
   private final var horizontalCenterLocked: Boolean
   private AnimationUtil yAnimation;
   private final var offsetY: Float

   public final var isDragging: Boolean
      private set

   private AnimationUtil xAnimation = AnimationUtil();

   @SerializedName("name")
   @Expose
   public final lateinit var name: String
      private set

   public fun onDraw() {
      if (this.isDragging) {
         val pos: HudAlignment$Pos = ضش.INSTANCE
            .snap(this, if (this.horizontalCenterLocked) this.centeredX() else (float)this.mouseX() - this.offsetX, (float)this.mouseY() - this.offsetY)
            this.targetX = if (this.horizontalCenterLocked) this.centeredX() else pos.x
         this.targetY = pos.y
         this.clampTarget()
      } else if (this.horizontalCenterLocked) {
         this.targetX = this.centeredX()
         this.clampTarget()
      }

      this.xAnimation.update()
      this.yAnimation.update()
      this.xAnimation.run(this.targetX, 70L, Easing.SINE_OUT)
      this.yAnimation.run(this.targetY, 70L, Easing.SINE_OUT)
      this.x = this.roundToHalf(this.xAnimation.get())
      this.y = this.roundToHalf(this.yAnimation.get())
   }

   public fun isHovering(): Boolean {
      return this.hovered((float)this.mouseX(), (float)this.mouseY(), this.x, this.y, this.width, this.height)
   }

   private fun clampTarget() {
      val var10000: MinecraftClient = MinecraftClient.getInstance()
      if (var10000 != null) {
         val var6: Window = var10000.getWindow()
         if (var6 != null) {
            val screenWidth: Float = var6.getScaledWidth()
            val screenHeight: Float = var6.getScaledHeight()
            if (this.targetX < 3.0F) {
               this.targetX = 3.0F
            }

            if (this.targetY < 3.0F) {
               this.targetY = 3.0F
            }

            if (this.targetX + this.width > screenWidth - 3.0F) {
               this.targetX = screenWidth - this.width - 3.0F
            }

            if (this.targetY + this.height > screenHeight - 3.0F) {
               this.targetY = screenHeight - this.height - 3.0F
            }
         }
      }
   }

   init {
      this.yAnimation = AnimationUtil()
   }

   public fun restoreTo(x: Float, y: Float) {
      this.snapTo(x, y)
      this.hasStoredPosition = true
   }

   public fun mouseX(): Int {
      return حل.INSTANCE.mouseX()
   }

   public fun mouseY(): Int {
      return حل.INSTANCE.mouseY()
   }

   public fun lockHorizontalCenter(): ظذ {
      this.horizontalCenterLocked = true
      return this
   }

   private fun hovered(mouseX: Float, mouseY: Float, x: Float, y: Float, width: Float, height: Float): Boolean {
      return mouseX >= x && mouseY >= y && mouseX <= x + width && mouseY <= y + height
   }

   private fun roundToHalf(value: Float): Float {
      return (float)Math.rint((double)(value * 2.0F)) / 2.0F
   }

   public constructor(module: دِ, name: String, initialXVal: Float, initialYVal: Float) : this() {
      this.module = module
      this.name = name
      this.snapTo(initialXVal, initialYVal)
   }

   private fun centeredX(): Float {
      val var10000: Window = MinecraftClient.getInstance().getWindow()
      return this.roundToHalf(((float)var10000.getScaledWidth() - this.width) / 2.0F)
   }

   public fun onClick(button: Int, action: Int) {
      if (button == 0 && this.isHovering() && action == 1) {
         val var10000: java.util.Collection = ثٌ.INSTANCE.draggables.values()
         val `$this$any$iv`: java.lang.Iterable = var10000
         var var10: Boolean
         if ((var10000 as java.util.Collection).isEmpty()) {
            var10 = false
         } else {
            val var6: java.util.Iterator = `$this$any$iv`.iterator()

            while (true) {
               if (!var6.hasNext()) {
                  var10 = false
                  break
               }

               if ((var6.next() as Draggable).isDragging) {
                  var10 = true
                  break
               }
            }
         }

         if (!var10) {
            this.isDragging = true
            this.offsetX = this.mouseX() - this.x
            this.offsetY = this.mouseY() - this.y
         }
      } else if (button == 0 && action == 0) {
         this.isDragging = false
      }
   }

   public final lateinit var module: دِ
      private set

   public fun snapTo(x: Float, y: Float) {
      val snappedX: Float = this.roundToHalf(x)
      val snappedY: Float = this.roundToHalf(y)
      this.x = snappedX
      this.y = snappedY
      this.targetX = snappedX
      this.targetY = snappedY
      this.xAnimation.snap((double)snappedX)
      this.yAnimation.snap((double)snappedY)
   }
}
