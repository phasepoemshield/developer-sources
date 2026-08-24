package org.zenith.util;

import org.zenith.module.Module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;

import org.zenith.module.TargetESP;
import org.zenith.module.TotemParticles;


import com.google.gson.annotations.SerializedName;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.HoverEvent.Action;
import net.minecraft.util.Formatting;

public class ItemExt2_Var159 {
   @SerializedName("name")
   public final String string31;
   @SerializedName("key")
   public final int int128;
   @SerializedName("command")
   public final String string32;

   public ItemExt2_Var159(String var1, int var2, String var3) {
      this.string31 = var1;
      this.int128 = var2;
      this.string32 = var3;
   }

   public String name() {
      return this.string31;
   }

   public int TargetESP() {
      return this.int128;
   }

   public String TotemParticles() {
      return this.string32;
   }

   public Text toText() {
      String s = this.string31.replace("\"", "\\\"");
      MutableText mutabletext = Text.literal(" " + this.string31).formatted(Formatting.GOLD, Formatting.BOLD);
      MutableText mutabletext1 = Text.literal(" [  " + InputUtil.fromKeyCode(this.int128, 0).getLocalizedText().getString() + "  ]")
         .formatted(Formatting.AQUA);
      MutableText mutabletext2 = Text.literal(" -> " + this.string32).formatted(Formatting.GRAY);
      MutableText mutabletext3 = Text.literal("  [\u0423\u0434\u0430\u043b\u0438\u0442\u044c]")
         .formatted(Formatting.RED, Formatting.BOLD)
         .styled(
            var2x -> var2x.withHoverEvent(
                     new HoverEvent(
                        Action.SHOW_TEXT,
                        Text.literal(
                           "\u041f\u043e\u0434\u0441\u0442\u0430\u0432\u0438\u0442\u044c \u043a\u043e\u043c\u0430\u043d\u0434\u0443 \u0443\u0434\u0430\u043b\u0435\u043d\u0438\u044f \u043c\u0430\u043a\u0440\u043e\u0441\u0430 "
                              + this.string31
                        )
                     )
                  )
                  .withClickEvent(new ClickEvent(net.minecraft.text.ClickEvent.Action.SUGGEST_COMMAND, ".macro remove " + s))
         );
      return Text.empty().append(mutabletext).append(mutabletext1).append(mutabletext2).append(mutabletext3);
   }
}
