package org.zenith.base.filemanager.impl.way;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;













import com.google.gson.annotations.SerializedName;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.text.HoverEvent.Action;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;

public class Way {
   @SerializedName("name")
   public final String name;
   @SerializedName("pos")
   public final BlockPos pos;
   @SerializedName("server")
   public final String server;

   public Way(String var1, BlockPos var2, String var3) {
      this.name = var1;
      this.pos = var2;
      this.server = var3;
   }

   public String name() {
      return this.name;
   }

   public BlockPos pos() {
      return this.pos;
   }

   public String server() {
      return this.server;
   }

   public Text toText() {
      String s = this.pos.getX() + " " + this.pos.getY() + " " + this.pos.getZ();
      String s1 = this.name.replace("\"", "\\\"");
      MutableText mutabletext = Text.literal("? " + this.name);
      mutabletext.setStyle(
         Style.EMPTY
            .withBold(true)
            .withColor(TextColor.fromRgb(16765286))
            .withHoverEvent(
               new HoverEvent(
                  Action.SHOW_TEXT, Text.literal("\u041c\u0435\u0441\u0442\u043e: " + this.name + "\n\u0421\u0435\u0440\u0432\u0435\u0440: " + this.server)
               )
            )
      );
      MutableText mutabletext1 = Text.literal("  \u27e8" + this.pos.getX() + ", " + this.pos.getY() + ", " + this.pos.getZ() + "\u27e9");
      mutabletext1.setStyle(
         Style.EMPTY
            .withColor(TextColor.fromRgb(1149618))
            .withHoverEvent(
               new HoverEvent(
                  Action.SHOW_TEXT,
                  Text.literal(
                     "\u041d\u0430\u0436\u043c\u0438, \u0447\u0442\u043e\u0431\u044b \u0441\u043a\u043e\u043f\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b"
                  )
               )
            )
            .withClickEvent(new ClickEvent(net.minecraft.text.ClickEvent.Action.COPY_TO_CLIPBOARD, s))
      );
      MutableText mutabletext2 = Text.literal("  @" + this.server);
      mutabletext2.setStyle(Style.EMPTY.withColor(Formatting.GRAY));
      MutableText mutabletext3 = Text.literal("  [\u0423\u0434\u0430\u043b\u0438\u0442\u044c]");
      mutabletext3.setStyle(
         Style.EMPTY
            .withBold(true)
            .withColor(TextColor.fromRgb(15681391))
            .withHoverEvent(
               new HoverEvent(
                  Action.SHOW_TEXT,
                  Text.literal(
                     "\u041f\u043e\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u044c \u043a\u043e\u043c\u0430\u043d\u0434\u0443 \u0443\u0434\u0430\u043b\u0435\u043d\u0438\u044f \u0442\u043e\u0447\u043a\u0438 "
                        + this.name
                  )
               )
            )
            .withClickEvent(new ClickEvent(net.minecraft.text.ClickEvent.Action.SUGGEST_COMMAND, ".way remove " + s1))
      );
      return Text.empty().append(mutabletext).append(mutabletext1).append(mutabletext2).append(mutabletext3);
   }
}
