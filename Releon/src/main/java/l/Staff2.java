package l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Staff2 extends Helper95 {
   private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

   public Staff2() {
      super("Staff");
   }

   @Override
   public void method583(File var1) {
      File var2 = new File(var1, this.getName() + ".json");
      if (var2.exists()) {
         try {
            String var3 = Files.readString(var2.toPath());
            if (!var3.isEmpty()) {
               List var4 = (List)GSON.fromJson(var3, new Helper65(this).getType());
               Helper19.method384().clear();
               Helper19.method384().addAll(var4);
            }
         } catch (IOException var5) {
            throw new Helper122("Не удалось прочитать файл персонала", var5);
         }
      }
   }

   @Override
   public void method584(File var1) {
      File var2 = new File(var1, this.getName() + ".json");

      try {
         Files.writeString(var2.toPath(), GSON.toJson(Helper19.method384()), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
      } catch (IOException var4) {
         throw new Helper111("Не удалось сохранить файл персонала", var4);
      }
   }
}
