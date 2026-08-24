package oxxxde

import java.util.ArrayList
import java.util.LinkedHashMap
import kotakbaz.rain.client.util.render.font.MsdfGlyph
import kotlin.collections.MutableMap.MutableEntry
import net.minecraft.class_2561
import net.minecraft.text.KeybindTextContent
import net.minecraft.text.Style
import net.minecraft.text.Text
import net.minecraft.text.TextColor
import net.minecraft.text.TextContent
import net.minecraft.text.TranslatableTextContent
import net.minecraft.text.PlainTextContent.Literal

// $VF: Compiled from heavy
public object سً {
   private final val glyphCache: <unrepresentable> =    // $VF: Compiled from heavy
object : LinkedHashMap<class_2561, List<غ>> {
      protected override fun removeEldestEntry(eldest: MutableEntry<class_2561, List<غ>>): Boolean {
         return this.size() > 1000
      }
   }

   private const val CACHE_LIMIT: Int = 1000

   fun parseTextToColoredGlyphs(text: Text): MutableList<MsdfGlyph.ColoredGlyph> {
      val var10000: java.util.List = glyphCache.get((Object)text) as java.util.List
      if (var10000 != null) {
         var10000
      } else {
         val out: ArrayList = ArrayList(text.getString().length())
         this.parseTextRecursive(text, -1, out)
         glyphCache.put(text, out)
         out as java.util.List
      }
   }

   fun parseTextRecursive(text: Text, currentColor: Int, out: MutableList<MsdfGlyph.ColoredGlyph>) {
      val var10000: Style = text.getStyle()
      val var17: TextColor = var10000.getColor()
      val color: Int = if (var17 != null) var17.getRgb() or -16777216 else currentColor
      val var18: TextContent = text.getContent()
      val i: java.lang.String = if (var18 is Literal)
         (var18 as Literal).string()
         else
         (
            if (var18 is TranslatableTextContent)
               (var18 as TranslatableTextContent).getKey()
               else
               (if (var18 is KeybindTextContent) (var18 as KeybindTextContent).getKey() else "")
         )
         if (i.length() == 0) {
         for (var20 in text.getSiblings()) {
            this.parseTextRecursive(var20 as Text, color, out)
         }
      } else {
         val var11: java.lang.String = سن.INSTANCE.replaceSymbols(i)
         var var12: Int = 0

         while (var12 < var11.length()) {
            val var14: Char = var11.charAt(var12)
            if ((var14 == 167 || var14 == '&') && var12 + 1 < var11.length()) {
               var12 += 2
            } else {
               out.add(MsdfGlyph.ColoredGlyph(var14, color))
               var12++
            }
         }

         for (var19 in text.getSiblings()) {
            this.parseTextRecursive(var19 as Text, color, out)
         }
      }
   }
}
