package zenith;

import com.google.gson.annotations.SerializedName;
import net.minecraft.util.Formatting;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.Text;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.Style;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.MutableText;
import net.minecraft.text.ClickEvent.PairList9;
import net.minecraft.text.HoverEvent.EditWorldScreen7;

public class StringHolder$Helper_13 {
   @SerializedName("name")
   private final String l1I11Il1lllI;
   @SerializedName("key")
   private final int lI1Il11I1l1III11IIlI1lI1II11I;
   @SerializedName("command")
   private final String llIII1ll1IlllllIlI;

   public StringHolder$Helper_13(String s, int i, String s1) {
      this.l1I11Il1lllI = s;
      this.lI1Il11I1l1III11IIlI1lI1II11I = i;
      this.llIII1ll1IlllllIlI = s1;
   }

   public String name() {
      return this.l1I11Il1lllI;
   }

   public int ZenithInternal120() {
      return this.lI1Il11I1l1III11IIlI1lI1II11I;
   }

   public String TextHolder() {
      return this.llIII1ll1IlllllIlI;
   }

   public Text toText() {
      String s = this.l1I11Il1lllI.replace("\"", "\\\"");
      MutableText MutableTextxxx = Text.literal(" " + this.l1I11Il1lllI).formatted(new Formatting[]{Formatting.GOLD, Formatting.BOLD});
      MutableText MutableTextx = Text.literal(
            " [  " + InputUtil.fromKeyCode(this.lI1Il11I1l1III11IIlI1lI1II11I, 0).getLocalizedText().getString() + "  ]"
         )
         .formatted(Formatting.AQUA);
      MutableText MutableTextxx = Text.literal(" -> " + this.llIII1ll1IlllllIlI).formatted(Formatting.GRAY);
      MutableText MutableTextxxx = Text.literal("  [Удалить]")
         .formatted(new Formatting[]{Formatting.RED, Formatting.BOLD})
         .styled(
            Style -> Style.withHoverEvent(
                     new HoverEvent(EditWorldScreen7.SHOW_TEXT, Text.literal("Подставить команду удаления макроса " + this.l1I11Il1lllI))
                  )
                  .withClickEvent(new ClickEvent(PairList9.SUGGEST_COMMAND, ".macro remove " + s))
         );
      return Text.empty().append(MutableTextxxx).append(MutableTextx).append(MutableTextxx).append(MutableTextxxx);
   }
}
