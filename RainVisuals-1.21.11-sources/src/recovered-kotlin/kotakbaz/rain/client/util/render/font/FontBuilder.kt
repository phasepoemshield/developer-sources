package kotakbaz.rain.client.util.render.font

import com.google.gson.Gson
import java.io.Closeable
import java.io.InputStream
import java.io.InputStreamReader
import java.nio.charset.StandardCharsets
import java.util.HashMap
import kotakbaz.rain.client.render.texture.texture.GLTexture
import oxxxde.اح
import oxxxde.تخ
import oxxxde.ثُ
import oxxxde.جش
import oxxxde.جً
import oxxxde.زآ
import oxxxde.زل
import oxxxde.ض
import oxxxde.ضو
import oxxxde.ظس

// $VF: Compiled from heavy
public class FontBuilder {
   private final var atlasPath: String
   private final var dataPath: String
   private final var name: String = ""

   public fun build(): جً {
      val data: FontData = this.loadFontData()
      val texture: GLTexture = this.loadFontTexture()
      val atlasWidth: Float = data.atlas.width
      val atlasHeight: Float = data.atlas.height
      val glyphs: HashMap = HashMap(data.glyphs.size())

      for (`element$iv` in data.glyphs) {
         glyphs.put((`element$iv` as FontData.GlyphData).unicode, MsdfGlyph(`element$iv` as FontData.GlyphData, atlasWidth, atlasHeight))
      }

      val var14: HashMap = HashMap()

      for (var18 in data.kernings) {
         val var19: تخ = var18 as تخ
         val var10000: Any = var14.computeIfAbsent((var18 as تخ).leftChar, { p0: Any ->
            `$tmp0`(p0) as java.util.Map
         })
         (var10000 as java.util.Map).put(var19.rightChar, var19.advance)
      }

      return Font(this.name, texture, data.atlas, data.metrics, glyphs, var14)
   }

   private fun loadFontTexture(): ض {
      val var10000: InputStream = زل.fromAssets(this.atlasPath)
      if (var10000 == null) {
         throw IllegalStateException(("Font atlas file not found: ${this.atlasPath}").toString())
      } else {
         val var2: Closeable = var10000
         var var3: java.lang.Throwable = null

         try {
            val var12: GLTexture = GLTexture.of(
               "font_${StringsKt.replace$default(this.name, '/', '_', false, 4, null)}",
               ثُ.INPUT_STREAM.load(var2 as InputStream, ضو.RGBA, زآ.SMOOTH, جش.DEFAULT)
            )
            return var12
         } catch (var10: java.lang.Throwable) {
            var3 = var10
            throw var10
         } finally {
            CloseableKt.closeFinally(var2, var3)
         }
      }
   }

   private fun loadFontData(): اح {
      val var10000: InputStream = زل.fromAssets(this.dataPath)
      if (var10000 == null) {
         throw IllegalStateException(("Font data file not found: ${this.dataPath}").toString())
      } else {
         val var2: Closeable = var10000
         var var3: java.lang.Throwable = null

         try {
            val var6: Closeable = InputStreamReader(var2 as InputStream, StandardCharsets.UTF_8)
            var var7: java.lang.Throwable = null

            try {
               val var24: FontData = Gson().fromJson(var6 as InputStreamReader, FontData.class)
               if (var24 == null) {
                  throw IllegalStateException(("Failed to parse font data: ${this.dataPath}").toString())
               } else {
                  return var24
               }
            } catch (var20: java.lang.Throwable) {
               var7 = var20
               throw var20
            } finally {
               CloseableKt.closeFinally(var6, var7)
            }
         } catch (var22: java.lang.Throwable) {
            var3 = var22
            throw var22
         } finally {
            CloseableKt.closeFinally(var2, var3)
         }
      }
   }

   public fun find(fontName: String): ظس {
      this.name = fontName
      this.dataPath = "assets/${CLIENT_ID}/fonts/$fontName.json"
      this.atlasPath = "assets/${CLIENT_ID}/fonts/$fontName.png"
      return this
   }
}
