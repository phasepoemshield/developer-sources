package l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Macro2 extends Helper95 {
   private final Helper7 macroRepository;

   public Macro2(Helper7 var1) {
      super("Macro");
      this.macroRepository = var1;
   }

   @Override
   public void method584(File var1) {
      Gson var2 = new GsonBuilder().setPrettyPrinting().create();
      File var3 = new File(var1, this.getName() + ".json");

      try {
         try (FileWriter var4 = new FileWriter(var3)) {
            var2.toJson(this.macroRepository.macroList, var4);
         }
      } catch (IOException | JsonIOException var9) {
         throw new Helper111(String.format("Failed to save %s to file", this.getName()), var9);
      }
   }

   @Override
   public void method583(File var1) {
      Gson var2 = new Gson();
      File var3 = new File(var1, this.getName() + ".json");

      try {
         try (FileReader var4 = new FileReader(var3)) {
            Helper8[] var5 = (Helper8[])var2.fromJson(var4, Helper8[].class);
            this.macroRepository.macroList.clear();
            this.macroRepository.macroList.addAll(Arrays.asList(var5));
         }
      } catch (IOException var9) {
         throw new Helper122(String.format("Failed to load %s from file", this.getName()), var9);
      } catch (JsonSyntaxException var10) {
         throw new Helper122(String.format("JSON syntax error, %s config cannot be loaded", this.getName()), var10);
      } catch (JsonIOException var11) {
         throw new Helper122(String.format("JSON IO error, %s config cannot be loaded", this.getName()), var11);
      }
   }
}
