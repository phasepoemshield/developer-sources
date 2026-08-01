package l;

import java.util.Arrays;
import java.util.stream.Stream;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public interface Helper94 {
   static Text method903() {
      MutableText var0 = Helper238.method2182();
      var0.setStyle(var0.getStyle().withColor(Formatting.GRAY));
      var0.append(" -> ");
      return var0;
   }

   default void method904(Text... var1) {
      MutableText var2 = Text.literal("");
      var2.append(method903());
      var2.append(Text.literal(" "));
      Arrays.asList(var1).forEach(var2::append);
      if (MinecraftClient.getInstance().player != null) {
         MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(var2);
      }
   }

   default void method905(String var1, Formatting var2) {
      Stream.of(var1.split("\n")).forEach(var2x -> {
         MutableText var3 = Text.literal(var2x.replace("\t", "    "));
         var3.setStyle(var3.getStyle().withColor(var2));
         this.method904(var3);
      });
   }

   default void method906(String var1) {
      this.method905(var1, Formatting.GRAY);
   }
}
