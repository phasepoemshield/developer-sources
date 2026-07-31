package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class TelegramApiCommand extends Command {
   private final Gson O00000000 = new GsonBuilder().setPrettyPrinting().create();
   private final File O000000000 = new File(WildClient.O00000000.O0000000000000, "telegram.cfg");

   public TelegramApiCommand() {
      super("tapi", "телеграм API для отправки уведомлений в ТГ", ".tapi <token/chatid/test/clear/info/help/dir/load>");
      this.O00000000("token", List::of);
      this.O00000000("chatid", List::of);
      this.O00000000("test", List::of);
      this.O00000000("clear", List::of);
      this.O00000000("info", List::of);
      this.O00000000("help", List::of);
      this.O00000000("dir", List::of);
      this.O00000000("load", List::of);
      this.O00000000000O0();
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {}

   @Compile
   private void O0000000000(String[] strings) {}

   @Compile
   private void O00000000000(String[] strings) {}

   @Compile
   private void O00000000000() {}

   @Compile
   private void O000000000000() {}

   @Compile
   private void O0000000000000() {}

   @Compile
   private void O000000000000O() {}

   @Compile
   private void O00000000000O() {}

   @Compile
   private void O00000000000O0() {}

   @Compile
   private TelegramApiCommand.W22 O00000000000OO() { return null; }

   @Compile
   private void O00000000(TelegramApiCommand.W22 o00000000) throws Exception {
   }

   private void O000000000(TelegramApiCommand.W22 o00000000) {
      try {
         String var2 = "";
         String var3 = "";
         if (o00000000.O00000000 != null && !o00000000.O00000000.isEmpty()) {
            var2 = O0000O000OOO0O.O000000000(
               o00000000.O00000000,
               "gUhDvBzdE4xq5f4BxkPvxv70VY44WsuH1O6s2nZ2F9U1w9y1VVG1mXQcUfbJM2DDUCd8NvtM0L4O1t1nn8FwwAVYlChNncdagiv9UR8FpLXXF8iMAtlWY4mEnYtLHPB3"
            );
         }

         if (o00000000.O000000000 != null && !o00000000.O000000000.isEmpty()) {
            var3 = O0000O000OOO0O.O000000000(
               o00000000.O000000000,
               "gUhDvBzdE4xq5f4BxkPvxv70VY44WsuH1O6s2nZ2F9U1w9y1VVG1mXQcUfbJM2DDUCd8NvtM0L4O1t1nn8FwwAVYlChNncdagiv9UR8FpLXXF8iMAtlWY4mEnYtLHPB3"
            );
         }

         O0000000OO0O00.O00000000(var2, var3);
      } catch (Exception var4) {
         ChatUtil.O00000000("§cОшибка расшифровки данных.");
         var4.printStackTrace();
      }
   }

   static {
      Loader.initialize();
   }

   static class W22 {
      String O00000000;
      String O000000000;
   }
}
