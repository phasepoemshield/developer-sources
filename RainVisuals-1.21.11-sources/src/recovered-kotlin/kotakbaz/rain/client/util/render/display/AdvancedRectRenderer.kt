package kotakbaz.rain.client.util.render.display

import java.awt.Color
import kotakbaz.rain.client.render.main.program.GlProgram
import kotakbaz.rain.client.render.main.program.uniform.a
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.SamplerUniform
import kotakbaz.rain.client.render.main.vertex.DrawMode
import kotakbaz.rain.client.render.main.vertex.element.A
import kotakbaz.rain.client.render.main.vertex.element.VertexElement
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder
import kotakbaz.rain.client.render.texture.GlTex
import kotakbaz.rain.client.util.color.QuadColor
import kotakbaz.rain.client.util.render.engine.controls.RectType
import kotakbaz.rain.client.util.render.engine.controls.TextureSampler
import kotlin.jvm.internal.Intrinsics
import org.joml.Vector3f
import org.joml.Vector4f
import org.joml.Vector4fc
import oxxxde.اق
import oxxxde.ان
import oxxxde.بح
import oxxxde.بد
import oxxxde.جِ
import oxxxde.ذر
import oxxxde.رص
import oxxxde.زج
import oxxxde.سا
import oxxxde.سة
import oxxxde.شم
import oxxxde.طأ
import oxxxde.طج
import oxxxde.طي
import oxxxde.ظب

// $VF: Compiled from heavy
public class AdvancedRectRenderer : RectRenderer {
   private VertexElement eMix;
   private GlTex[] glTexKeys;
   private final val currentPos: Vector3f
   private RectType rectType = RectType.BASIC;
   private VertexElement eBorderW;
   private VertexElement eBotRight;
   private VertexElement eBorderC;
   private VertexElement eType;
   private final var borderWidth: Float
   @JvmStatic
   private VertexFormat VERTEX_FORMAT = VertexFormat.builder()
      .element("TopRightColor", A.FLOAT, 4)
      .element("TopLeftColor", A.FLOAT, 4)
      .element("BottomRightColor", A.FLOAT, 4)
      .element("BottomLeftColor", A.FLOAT, 4)
      .element("Texture", A.FLOAT, 2)
      .element("Size", A.FLOAT, 2)
      .element("Radius", A.FLOAT, 4)
      .element("Mix", A.FLOAT, 1)
      .element("Alpha", A.FLOAT, 1)
      .element("Mode", A.FLOAT, 1)
      .element("BorderWidth", A.FLOAT, 1)
      .element("BorderColor", A.FLOAT, 4)
      .element("Type", A.FLOAT, 1)
      .element("Scissor", A.FLOAT, 4)
      .build();
   private VertexElement eTopLeft;
   private SamplerUniform textureUniform;
   @JvmStatic
   private Color TRANSPARENT = Color(0, 0, 0, 0);
   private VertexElement eScissor;
   @JvmStatic
   public اق Companion = اق(null);
   private VertexElement eRadius;
   private final val dataBuffer: FloatArray
   private VertexElement eTexture;
   private final var alpha: Float
   private TextureSampler[] textureIdSamplers;
   private VertexElement eBotLeft;
   private final val textureIdKeys: IntArray = IntArray(64)
   private final var mix: Float
   private VertexElement eTopRight;
   private final var borderColor: Color
   private VertexElement eMode;
   private VertexElement eAlpha;
   private TextureSampler[] glTexSamplers;
   private TextureSampler currentSampler;
   private final val colorBuffer: FloatArray
   private VertexElement eSize;
   private final var pixelGridSize: Float

   public fun borderColor(color: Color): زج {
      this.borderColor = color
      return this
   }

   private fun samplerFor(textureId: Int): ظب {
      val index: Int = (textureId xor textureId ushr 16) and this.textureIdSamplers.length - 1
      val cached: TextureSampler = this.textureIdSamplers[(textureId xor textureId ushr 16) and this.textureIdSamplers.length - 1]
      if (this.textureIdSamplers[(textureId xor textureId ushr 16) and this.textureIdSamplers.length - 1] != null && this.textureIdKeys[index] == textureId) {
         return cached
      } else {
         val var4: TextureSampler = TextureSampler(textureId)
         this.textureIdKeys[index] = textureId
         this.textureIdSamplers[index] = var4
         return var4
      }
   }

   public fun round(r: Vector4f): زج {
      this.getCachedRadius().set(r as Vector4fc)
      return this
   }

   public fun color(c1: Color, c2: Color, c3: Color, c4: Color): زج {
      this.getCachedColor().set(c1, c2, c3, c4)
      return this
   }

   public override fun drawMode(): شم {
      return DrawMode.QUADS
   }

   public fun color(color: Color): زج {
      this.getCachedColor().set(color)
      return this
   }

   public fun type(type: رص): زج {
      this.rectType = type
      return this
   }

   public fun pixelated(gridSize: Float): زج {
      this.pixelGridSize = RangesKt.coerceAtLeast(gridSize, 0.0F)
      return this
   }

   public override fun name(): String {
      return "advanced-rect"
   }

   public fun border(width: Float, color: Color): زج {
      this.borderWidth = width
      this.borderColor = color
      return this
   }

   public fun texture(sampler: ظب?): زج {
      if (sampler == null) {
         if (!this.currentSampler.hasTextureId(0)) {
            this.currentSampler = this.samplerFor(0)
         }
      } else if (!(this.currentSampler == sampler)) {
         this.currentSampler = sampler
      }

      this.rectType = RectType.TEXTURE
      return this
   }

   public fun drawTexture(
      x: Float,
      y: Float,
      width: Float,
      height: Float,
      color: سة,
      mix: Float,
      alpha: Float,
      u: Float,
      v: Float,
      texW: Float,
      texH: Float,
      radius: Vector4f
   ) {
      this.rectType = RectType.TEXTURE
      this.drawConst(x, y, width, height, color, radius, mix, u, v, texW, texH, alpha, this.borderWidth, this.borderColor)
   }

   private fun samplerFor(texture: طج): ظب {
      val index: Int = System.identityHashCode(texture) and this.glTexSamplers.length - 1
      val cached: TextureSampler = this.glTexSamplers[index]
      if (this.glTexKeys[index] === texture && this.glTexSamplers[index] != null) {
         return cached
      } else {
         val var4: TextureSampler = TextureSampler(texture)
         this.glTexKeys[index] = texture
         this.glTexSamplers[index] = var4
         return var4
      }
   }

   public override fun load() {
      if (this.getGlProgram() == null) {
         this.setGlProgram(this.createShaderBuilder(this.name(), this.shader(), this.shader()).sampler("uTexture").build())
      }

      val vf: VertexFormat = VERTEX_FORMAT
      var var10001: VertexElement = VERTEX_FORMAT.getVertexElement("TopRightColor")
      this.eTopRight = var10001
      var10001 = vf.getVertexElement("TopLeftColor")
      this.eTopLeft = var10001
      var10001 = vf.getVertexElement("BottomRightColor")
      this.eBotRight = var10001
      var10001 = vf.getVertexElement("BottomLeftColor")
      this.eBotLeft = var10001
      var10001 = vf.getVertexElement("Texture")
      this.eTexture = var10001
      var10001 = vf.getVertexElement("Size")
      this.eSize = var10001
      var10001 = vf.getVertexElement("Radius")
      this.eRadius = var10001
      var10001 = vf.getVertexElement("Mix")
      this.eMix = var10001
      var10001 = vf.getVertexElement("Alpha")
      this.eAlpha = var10001
      var10001 = vf.getVertexElement("Mode")
      this.eMode = var10001
      var10001 = vf.getVertexElement("BorderWidth")
      this.eBorderW = var10001
      var10001 = vf.getVertexElement("BorderColor")
      this.eBorderC = var10001
      var10001 = vf.getVertexElement("Type")
      this.eType = var10001
      var10001 = vf.getVertexElement("Scissor")
      this.eScissor = var10001
      val var15: GlProgram = this.getGlProgram()
      val var16: طي = var15.getUniform("uTexture", a.SAMPLER)
      this.textureUniform = var16 as SamplerUniform
   }

   public fun drawTexture(
      x: Float,
      y: Float,
      width: Float,
      height: Float,
      color: Color,
      mix: Float,
      alpha: Float,
      u: Float,
      v: Float,
      texW: Float,
      texH: Float,
      radius: Vector4f
   ) {
      this.getCachedColor().set(color)
      this.drawTexture(x, y, width, height, this.getCachedColor(), mix, alpha, u, v, texW, texH, radius)
   }

   public fun drawTexture(
      x: Float,
      y: Float,
      width: Float,
      height: Float,
      color: Color,
      mix: Float,
      alpha: Float,
      u: Float,
      v: Float,
      texW: Float,
      texH: Float,
      radius: Float
   ) {
      this.getCachedColor().set(color)
      this.getCachedRadius().set(radius, radius, radius, radius)
      this.drawTexture(x, y, width, height, this.getCachedColor(), mix, alpha, u, v, texW, texH, this.getCachedRadius())
   }

   public override fun shader(): String {
      return "rect/rectangle"
   }

   public fun drawRect(x: Float, y: Float, width: Float, height: Float, color: Color, radius: Float) {
      this.getCachedColor().set(color)
      this.getCachedRadius().set(radius, radius, radius, radius)
      this.drawRect(x, y, width, height, this.getCachedColor(), this.getCachedRadius(), 0.0F, TRANSPARENT)
   }

   public fun texture(id: Int): زج {
      if (!this.currentSampler.hasTextureId(id)) {
         this.currentSampler = this.samplerFor(id)
      }

      this.rectType = RectType.TEXTURE
      return this
   }

   public fun drawRect(x: Float, y: Float, width: Float, height: Float, color: سة, radius: Vector4f) {
      this.drawRect(x, y, width, height, color, radius, 0.0F, TRANSPARENT)
   }

   protected override fun uploadVertex(builder: ان, x: Float, y: Float, width: Float, height: Float, radius: Float, index: Int, extra: FloatArray) {
      val mode: Float = extra[0]
val mix: Float = extra[1]
val u: Float = extra[2]
val v: Float = extra[3]
val texW: Float = extra[4]
val texH: Float = extra[5]
val alpha: Float = extra[6]
val bw: Float = extra[7]
val u2: Float = u + texW
val v2: Float = v + texH
var curU: Float = 0.0F
var curV: Float = 0.0F
      when (index) {
         0 -> {
            curU = u
            curV = v2
         }
         1 -> {
            curU = u
            curV = v
         }
         2 -> {
            curU = u2
            curV = v
         }
         3 -> {
            curU = u2
            curV = v2
         }
         else -> {
            curU = 0.0F
            curV = 0.0F
         }
      }

      val rx: Float = extra[28]
      val ry: Float = extra[29]
      val rz: Float = extra[30]
      val rw: Float = extra[31]
      val sc: Vector4f = جِ.INSTANCE.getCurrentScissorValues()
      this.currentPos.set(x, y, 0.0F)
      بد.INSTANCE.transformPosition(this.currentPos)
      var var10000: MeshBuilder = builder.vertex(this.currentPos.x, this.currentPos.y, this.currentPos.z)
      var var10001: VertexElement = this.eTopRight
      if (this.eTopRight == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eTopRight")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, extra[12], extra[13], extra[14], extra[15])
      var10001 = this.eTopLeft
      if (this.eTopLeft == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eTopLeft")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, extra[16], extra[17], extra[18], extra[19])
      var10001 = this.eBotRight
      if (this.eBotRight == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eBotRight")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, extra[20], extra[21], extra[22], extra[23])
      var10001 = this.eBotLeft
      if (this.eBotLeft == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eBotLeft")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, extra[24], extra[25], extra[26], extra[27])
      var10001 = this.eTexture
      if (this.eTexture == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eTexture")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, curU, curV)
      var10001 = this.eSize
      if (this.eSize == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eSize")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, width, height)
      var10001 = this.eRadius
      if (this.eRadius == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eRadius")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, rx, rz, ry, rw)
      var10001 = this.eMix
      if (this.eMix == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eMix")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, mix)
      var10001 = this.eAlpha
      if (this.eAlpha == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eAlpha")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, alpha)
      var10001 = this.eMode
      if (this.eMode == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eMode")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, mode)
      var10001 = this.eBorderW
      if (this.eBorderW == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eBorderW")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, bw)
      var10001 = this.eBorderC
      if (this.eBorderC == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eBorderC")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, extra[8], extra[9], extra[10], extra[11])
      var10001 = this.eType
      if (this.eType == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eType")
         var10001 = null
      }

      var10000 = var10000.elementFloat(var10001, (float)this.rectType.value)
      var10001 = this.eScissor
      if (this.eScissor == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eScissor")
         var10001 = null
      }

      var10000.elementFloat(var10001, sc.x, sc.y, sc.z, sc.w)
   }

   public fun draw(x: Float, y: Float, width: Float, height: Float) {
      if (this.rectType === RectType.TEXTURE) {
         this.drawTexture(x, y, width, height, this.getCachedColor(), this.mix, this.alpha, 0.0F, 0.0F, 1.0F, 1.0F, this.getCachedRadius())
      } else {
         this.drawRect(x, y, width, height, this.getCachedColor(), this.getCachedRadius(), this.borderWidth, this.borderColor)
      }
   }

   public fun borderWidth(width: Float): زج {
      this.borderWidth = width
      return this
   }

   public fun drawRect(x: Float, y: Float, width: Float, height: Float, color: سة, radius: Vector4f, borderWidth: Float, borderColor: Color) {
      this.rectType = RectType.BASIC
      if (!this.currentSampler.hasTextureId(0)) {
         this.currentSampler = this.samplerFor(0)
      }

      this.drawConst(x, y, width, height, color, radius, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, borderWidth, borderColor)
   }

   public fun round(r: Float): زج {
      this.getCachedRadius().set(r, r, r, r)
      return this
   }

   public fun texture(tex: طج): زج {
      if (!this.currentSampler.hasGlTex(tex)) {
         this.currentSampler = this.samplerFor(tex)
      }

      this.rectType = RectType.TEXTURE
      return this
   }

   public override fun renderBatch(mesh: طأ?, state: Any?) {
      if (state is TextureSampler) {
         val var10000: TextureSampler = state as TextureSampler
         var var10001: SamplerUniform = this.textureUniform
         if (this.textureUniform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textureUniform")
            var10001 = null
         }

         var10000.apply(var10001)
      } else if (state is Int) {
         var var3: SamplerUniform = this.textureUniform
         if (this.textureUniform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textureUniform")
            var3 = null
         }

         var3.set((state as java.lang.Number).intValue())
      }

      super.renderBatch(mesh, state)
   }

   public fun alpha(a: Float): زج {
      this.alpha = a
      return this
   }

   public fun drawRect(x: Float, y: Float, width: Float, height: Float, color: Color, radius: Vector4f) {
      val var7: QuadColor = this.getCachedColor()
      var7.set(color)
      this.drawRect(x, y, width, height, var7, radius, 0.0F, TRANSPARENT)
   }

   private fun drawConst(
      x: Float,
      y: Float,
      width: Float,
      height: Float,
      color: سة,
      radius: Vector4f,
      mix: Float,
      u: Float,
      v: Float,
      texW: Float,
      texH: Float,
      alpha: Float,
      borderWidth: Float,
      borderColor: Color
   ) {
      val var10000: MeshBuilder = ذر.INSTANCE.DISPATCHER.getBuilder(this.getCurrentPipeline(), this, this.currentSampler)
      if (var10000 != null) {
         val coords: Vector4f = this.calcSmoothness(x, y, width, height)
         بح.INSTANCE.normalizeInto(color.color1, this.colorBuffer)
         System.arraycopy(this.colorBuffer, 0, this.dataBuffer, 12, 4)
         بح.INSTANCE.normalizeInto(color.color2, this.colorBuffer)
         System.arraycopy(this.colorBuffer, 0, this.dataBuffer, 16, 4)
         بح.INSTANCE.normalizeInto(color.color3, this.colorBuffer)
         System.arraycopy(this.colorBuffer, 0, this.dataBuffer, 20, 4)
         بح.INSTANCE.normalizeInto(color.color4, this.colorBuffer)
         System.arraycopy(this.colorBuffer, 0, this.dataBuffer, 24, 4)
         بح.INSTANCE.normalizeInto(borderColor, this.colorBuffer)
         System.arraycopy(this.colorBuffer, 0, this.dataBuffer, 8, 4)
         this.dataBuffer[0] = this.pixelGridSize
         this.dataBuffer[1] = mix
         this.dataBuffer[2] = u
         this.dataBuffer[3] = v
         this.dataBuffer[4] = texW
         this.dataBuffer[5] = texH
         this.dataBuffer[6] = alpha
         this.dataBuffer[7] = borderWidth
         this.dataBuffer[28] = radius.x
         this.dataBuffer[29] = radius.y
         this.dataBuffer[30] = radius.z
         this.dataBuffer[31] = radius.w
         this.buildQuad(var10000, coords.x, coords.y, coords.z, coords.w, radius, this.dataBuffer)
      }
   }

   public override fun vertexFormat(): سا {
      val var10000: VertexFormat = VERTEX_FORMAT
      return var10000
   }
}
