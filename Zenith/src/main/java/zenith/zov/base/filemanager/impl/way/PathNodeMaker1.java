package zenith.zov.base.filemanager.impl.way;

import com.google.gson.annotations.SerializedName;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.Text;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.Style;
import net.minecraft.text.MutableText;
import net.minecraft.text.TextColor;
import net.minecraft.text.ClickEvent.PairList9;
import net.minecraft.text.HoverEvent.EditWorldScreen7;

// $VF: renamed from: zenith.zov.base.filemanager.impl.way.Way
public class PathNodeMaker1 {
   @SerializedName("name")
   private final String name;
   // $VF: renamed from: pos net.minecraft.util.math.BlockPos
   @SerializedName("pos")
   private final BlockPos BLUE_MARKER;
   @SerializedName("server")
   private final String server;

   public PathNodeMaker1(String s, BlockPos BlockPos, String s1) {
      this.name = s;
      this.BLUE_MARKER = BlockPos;
      this.server = s1;
   }

   public String name() {
      return this.name;
   }

   // $VF: renamed from: pos () net.minecraft.util.math.BlockPos
   public BlockPos getNodePosition() {
      return this.BLUE_MARKER;
   }

   public String server() {
      return this.server;
   }

   public Text toText() {
      String s = this.BLUE_MARKER.getX() + " " + this.BLUE_MARKER.getY() + " " + this.BLUE_MARKER.getZ();
      String s1 = this.name.replace("\"", "\\\"");
      MutableText MutableTextxxx = Text.literal("? " + this.name);
      MutableTextxxx.setStyle(
         Style.EMPTY
            .withBold(true)
            .withColor(TextColor.fromRgb(16765286))
            .withHoverEvent(new HoverEvent(EditWorldScreen7.SHOW_TEXT, Text.literal("Место: " + this.name + "\nСервер: " + this.server)))
      );
      MutableText MutableTextx = Text.literal(
         "  ⟨" + this.BLUE_MARKER.getX() + ", " + this.BLUE_MARKER.getY() + ", " + this.BLUE_MARKER.getZ() + "⟩"
      );
      MutableTextx.setStyle(
         Style.EMPTY
            .withColor(TextColor.fromRgb(1149618))
            .withHoverEvent(new HoverEvent(EditWorldScreen7.SHOW_TEXT, Text.literal("Нажми, чтобы скопировать координаты")))
            .withClickEvent(new ClickEvent(PairList9.COPY_TO_CLIPBOARD, s))
      );
      MutableText MutableTextxx = Text.literal("  @" + this.server);
      MutableTextxx.setStyle(Style.EMPTY.withColor(Formatting.GRAY));
      MutableText MutableTextxxx = Text.literal("  [Удалить]");
      MutableTextxxx.setStyle(
         Style.EMPTY
            .withBold(true)
            .withColor(TextColor.fromRgb(15681391))
            .withHoverEvent(new HoverEvent(EditWorldScreen7.SHOW_TEXT, Text.literal("Подставить команду удаления точки " + this.name)))
            .withClickEvent(new ClickEvent(PairList9.SUGGEST_COMMAND, ".way remove " + s1))
      );
      return Text.empty().append(MutableTextxxx).append(MutableTextx).append(MutableTextxx).append(MutableTextxxx);
   }
}
