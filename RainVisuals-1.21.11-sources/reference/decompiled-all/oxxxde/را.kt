package oxxxde

import net.minecraft.text.MutableText
import net.minecraft.text.Style
import net.minecraft.text.StyleSpriteSource
import net.minecraft.text.Text
import net.minecraft.text.TextColor
import net.minecraft.text.StyleSpriteSource.Font
import net.minecraft.util.Identifier

// $VF: Compiled from heavy
public object را {
   private const val TAB_SPACER: String = "  "
   @JvmStatic
   private Font font = Font(Identifier.of("rain", "socials"));
   private const val GLYPH: String = "\ue001"
   private const val INSERTION: String = "rain-social"

   @JvmStatic
   fun icon(): Text {
      INSTANCE.createIcon()
   }

   @JvmStatic
   fun mark(name: Text): Text {
      val var10000: MutableText = Text.empty().styled({ style: Style ->
         style.withInsertion("rain-social")
      }).append(INSTANCE.createIcon()).append(name)
      var10000 as Text
   }

   @JvmStatic
   fun markForTab(name: Text): Text {
      val var10000: MutableText = Text.empty().styled({ style: Style ->
         style.withInsertion("rain-social")
      }).append(Text.literal("  ") as Text).append(name)
      var10000 as Text
   }

   @JvmStatic
   fun isMarked(name: Text): Boolean {
      val var10000: java.lang.String = name.getString()
      StringsKt.indexOf$default(var10000, "\ue001", 0, false, 6, null) >= 0 || name.getStyle().getInsertion() == "rain-social"
   }

   fun createIcon(): Text {
      val var10000: MutableText = Text.literal("\ue001").styled({ style: Style ->
         style.withFont(font as StyleSpriteSource).withColor(TextColor.fromRgb(16777215))
      })
      var10000 as Text
   }
}
