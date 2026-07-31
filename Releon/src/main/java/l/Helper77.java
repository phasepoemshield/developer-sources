package l;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.ClickEvent.Action;
import net.minecraft.util.Formatting;

public class Helper77<E> implements Helper94 {
   public final List<E> entries;
   public int pageSize = 8;
   public int page = 1;

   public Helper77(List<E> var1) {
      this.entries = var1;
   }

   @SafeVarargs
   public Helper77(E... var1) {
      this.entries = Arrays.asList((E[])var1);
   }

   public Helper77<E> method800(int var1) {
      this.pageSize = var1;
      return this;
   }

   public int method801() {
      return (this.entries.size() - 1) / this.pageSize + 1;
   }

   public boolean method802(int var1) {
      return var1 > 0 && var1 <= this.method801();
   }

   public void method803(int var1) {
      this.page += var1;
   }

   public void method804(Function<E, Text> var1, String var2) {
      int var3 = (this.page - 1) * this.pageSize;

      for (int var4 = var3; var4 < var3 + this.pageSize; var4++) {
         if (var4 < this.entries.size()) {
            this.method904(new Text[]{(Text)var1.apply(this.entries.get(var4))});
         } else {
            this.method905("--", Formatting.DARK_GRAY);
         }
      }

      boolean var9 = var2 != null && this.method802(this.page - 1);
      boolean var5 = var2 != null && this.method802(this.page + 1);
      MutableText var6 = Text.literal("<<");
      if (var9) {
         var6.setStyle(
            var6.getStyle()
               .withClickEvent(new ClickEvent(Action.RUN_COMMAND, String.format("%s %d", var2, this.page - 1)))
               .withHoverEvent(new HoverEvent(net.minecraft.text.HoverEvent.Action.SHOW_TEXT, Text.literal("Click to view previous page")))
         );
      } else {
         var6.setStyle(var6.getStyle().withColor(Formatting.DARK_GRAY));
      }

      MutableText var7 = Text.literal(">>");
      if (var5) {
         var7.setStyle(
            var7.getStyle()
               .withClickEvent(new ClickEvent(Action.RUN_COMMAND, String.format("%s %d", var2, this.page + 1)))
               .withHoverEvent(new HoverEvent(net.minecraft.text.HoverEvent.Action.SHOW_TEXT, Text.literal("Click to view next page")))
         );
      } else {
         var7.setStyle(var7.getStyle().withColor(Formatting.DARK_GRAY));
      }

      MutableText var8 = Text.literal("");
      var8.setStyle(var8.getStyle().withColor(Formatting.GRAY));
      var8.append(var6);
      var8.append(" | ");
      var8.append(var7);
      var8.append(String.format(" %d/%d", this.page, this.method801()));
      this.method904(new Text[]{var8});
   }

   public void method805(Function<E, Text> var1) {
      this.method804(var1, null);
   }

   public static <T> void method806(Helper219 var0, Helper77<T> var1, Runnable var2, Function<T, Text> var3, String var4) {
      int var5 = 1;
      var0.method1739(1);
      if (var0.method1690()) {
         var5 = var0.method1727(Integer.class);
         if (!var1.method802(var5)) {
            throw new Helper93(var0.method1742(), String.format("a valid page (1-%d)", var1.method801()), var0.method1742().method393());
         }
      }

      var1.method803(var5 - var1.page);
      if (var2 != null) {
         var2.run();
      }

      var1.method804(var3, var4);
   }

   public static <T> void method807(Helper219 var0, List<T> var1, Runnable var2, Function<T, Text> var3, String var4) {
      method806(var0, new Helper77(var1), var2, var3, var4);
   }

   public static <T> void method808(Helper219 var0, T[] var1, Runnable var2, Function<T, Text> var3, String var4) {
      method807(var0, Arrays.asList(var1), var2, var3, var4);
   }

   public static <T> void method809(Helper219 var0, Helper77<T> var1, Function<T, Text> var2, String var3) {
      method806(var0, var1, null, var2, var3);
   }

   public static <T> void method810(Helper219 var0, List<T> var1, Function<T, Text> var2, String var3) {
      method806(var0, new Helper77(var1), null, var2, var3);
   }

   public static <T> void method811(Helper219 var0, T[] var1, Function<T, Text> var2, String var3) {
      method807(var0, Arrays.asList(var1), null, var2, var3);
   }

   public static <T> void method812(Helper219 var0, Helper77<T> var1, Runnable var2, Function<T, Text> var3) {
      method806(var0, var1, var2, var3, null);
   }

   public static <T> void method813(Helper219 var0, List<T> var1, Runnable var2, Function<T, Text> var3) {
      method806(var0, new Helper77(var1), var2, var3, null);
   }

   public static <T> void method814(Helper219 var0, T[] var1, Runnable var2, Function<T, Text> var3) {
      method807(var0, Arrays.asList(var1), var2, var3, null);
   }

   public static <T> void method815(Helper219 var0, Helper77<T> var1, Function<T, Text> var2) {
      method806(var0, var1, null, var2, null);
   }

   public static <T> void method816(Helper219 var0, List<T> var1, Function<T, Text> var2) {
      method806(var0, new Helper77(var1), null, var2, null);
   }

   public static <T> void method817(Helper219 var0, T[] var1, Function<T, Text> var2) {
      method807(var0, Arrays.asList(var1), null, var2, null);
   }
}
