package zenith.zov.base.font;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.TextColor;
import zenith.Nameprotect;
import zenith.PatternHolder;

public class FormattedTextProcessor {
   public static List<FormattedTextProcessor$TextSegment> processText(Text Text, int i) {
      ArrayList arraylist = new ArrayList();
      Text.visit((Style, s) -> {
         if (!s.isEmpty()) {
            int k = extractColor(Style, i);
            if (MinecraftClient.getInstance().player != null && s.contains(MinecraftClient.getInstance().player.getNameForScoreboard())) {
               s = s.replace(MinecraftClient.getInstance().player.getNameForScoreboard(), Nameprotect.IIIlllllI1II1IIIll11I1());
            }

            boolean flag = Style.isBold();
            boolean flag1 = Style.isItalic();
            boolean flag2 = Style.isUnderlined();
            boolean flag3 = Style.isStrikethrough();
            arraylist.add(new FormattedTextProcessor$TextSegment(s, k, flag, flag1, flag2, flag3));
         }

         return Optional.empty();
      }, Style.EMPTY);
      return arraylist;
   }

   private static int extractColor(Style Style, int i) {
      TextColor TextColor = Style.getColor();
      if (TextColor != null) {
         int j = TextColor.getRgb() | 0xFF000000;
         return j != -1 ? PatternHolder.EventBus(j, PatternHolder.ZenithInternal055(i)) : i;
      } else {
         return i;
      }
   }
}
