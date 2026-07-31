package l;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Helper427 {
   public static final String CHARSET = "\"\\\" ¡‰·₴≠¿×ØøАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюяє–—‘’“”„…←↑→↓ʻˌ;⁰¹³⁴⁵⁶⁷⁸⁹⁺⁻⁼⁽⁾ⁱ™ʔʕ¤¥©®µ¶¼½¾·‐‚†‡•′″‴‹›‽⁂℗−∞Є♠♣♥♦♭♮♯⚀⚁⚂⚃⚄⚅ʬ❄⏏⏻⏼⏽⭘▲▶▼◀●◦�¦ᴀʙᴄᴅᴇꜰɢʜᴊᴋʟᴍɴᴏᴘꞯʀꜱᴛᴜᴠᴡʏᴢ§ʡʢʘǀǃǂǁ☂♤♧♡♢↔∑□△▷▽◁○☆★₀₁₂₃₄₅₆₇₈₉₊₋₌₍₎∫⌀⌘⚠⓪①②③④⑤⑥⑦⑧⑨⑩⑪⑫⑬⑭⑮⑯⑰⑱⑲⑳ⒶⒷⒸⒹⒺⒻⒼⒽⒾⒿⓀⓁⓂⓃⓄⓅⓆⓇⓈⓉⓊⓋⓌⓍⓎⓏⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩ☑☒!#$%&'()*+,-./0123456789:;<=>[\\\\]^_`?@ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz{|}~£ƒªº¬«»≡±≥≤⌠⌡÷≈°∙√ⁿ²■\"";

   public Helper427() {
   }

   public static void method4382(String[] var0) {
      String var1 = "mtsdf-font/";
      Path var2 = method4384(var1);
      if (var2 == null) {
      }

      method4383(var1, var2, "iconmain");
   }

   private static void method4383(String var0, Path var1, String var2) {
      File var3 = new File(var0 + var2);
      File[] var4 = var3.listFiles((var0x, var1x) -> var1x.toLowerCase().endsWith(".ttf"));
      if (var4 != null && var4.length > 0) {
         ExecutorService var5 = Executors.newFixedThreadPool(var4.length);
         ArrayList<Process> var6 = new ArrayList<>();

         for (File var10 : var4) {
            var5.execute(
               () -> {
                  try {
                     String var4x = var10.getName().replaceFirst("[.][^.]+$", "");
                     String var5x = String.format(
                        "%s/atlas-gen.exe -font %s -charset %s/charset.txt -type mtsdf -format png -imageout %s.png -json %s.json -size 64 -square4 -pxrange 12",
                        var0,
                        var10.getAbsolutePath(),
                        var0,
                        var1.resolve(var4x.toLowerCase().replaceAll("-", "_")),
                        var1.resolve(var4x.toLowerCase().replaceAll("-", "_"))
                     );
                     Process var6x = Runtime.getRuntime().exec(var5x);
                     var6.add(var6x);
                     int var7 = var6x.waitFor();
                     if (var7 == 0) {
                        System.out.println("Атлас для шрифта " + var4x + " успешно создан.");
                     } else {
                        System.out.println("Ошибка при создании атласа для шрифта " + var4x);
                     }
                  } catch (InterruptedException | IOException var8) {
                     System.err.println("Ошибка при выполнении команды для шрифта " + var10.getName() + ": " + var8.getMessage());
                  }
               }
            );
         }

         var5.shutdown();

         try {
            if (var5.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
               System.out.println("Процесс завершён.");
            }
         } catch (InterruptedException var11) {
            System.err.println("Ошибка при ожидании завершения потоков: " + var11.getMessage());
         }

         for (Process var13 : var6) {
            var13.destroy();
         }
      } else {
         System.out.println("Не найдены файлы шрифтов в указанной папке.");
      }
   }

   private static Path method4384(String var0) {
      Path var1 = Path.of(var0 + "out");
      if (Files.notExists(var1)) {
         try {
            Files.createDirectories(var1);
         } catch (IOException var5) {
            System.err.println("Ошибка при создании папки: " + var5.getMessage());
            return null;
         }
      }

      Path var2 = Path.of(var0 + "charset.txt");
      if (Files.notExists(var2)) {
         try {
            Files.createFile(var2);
            Files.write(
               var2,
               "\"\\\" ¡‰·₴≠¿×ØøАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюяє–—‘’“”„…←↑→↓ʻˌ;⁰¹³⁴⁵⁶⁷⁸⁹⁺⁻⁼⁽⁾ⁱ™ʔʕ¤¥©®µ¶¼½¾·‐‚†‡•′″‴‹›‽⁂℗−∞Є♠♣♥♦♭♮♯⚀⚁⚂⚃⚄⚅ʬ❄⏏⏻⏼⏽⭘▲▶▼◀●◦�¦ᴀʙᴄᴅᴇꜰɢʜᴊᴋʟᴍɴᴏᴘꞯʀꜱᴛᴜᴠᴡʏᴢ§ʡʢʘǀǃǂǁ☂♤♧♡♢↔∑□△▷▽◁○☆★₀₁₂₃₄₅₆₇₈₉₊₋₌₍₎∫⌀⌘⚠⓪①②③④⑤⑥⑦⑧⑨⑩⑪⑫⑬⑭⑮⑯⑰⑱⑲⑳ⒶⒷⒸⒹⒺⒻⒼⒽⒾⒿⓀⓁⓂⓃⓄⓅⓆⓇⓈⓉⓊⓋⓌⓍⓎⓏⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩ☑☒!#$%&'()*+,-./0123456789:;<=>[\\\\]^_`?@ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz{|}~£ƒªº¬«»≡±≥≤⌠⌡÷≈°∙√ⁿ²■\""
                  .getBytes()
            );
         } catch (IOException var4) {
            System.err.println("Ошибка при создании charset.txt: " + var4.getMessage());
            return null;
         }
      }

      return var1;
   }
}
