package l;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.client.MinecraftClient;

public class TabParser2 extends Helper214 {
   public TabParser2() {
      super("tabparser");
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      if (!var2.method1690()) {
         this.method278();
      } else {
         String var3 = var2.method1723().toLowerCase();
         if (var3.equals("dir")) {
            File var4 = new File(MinecraftClient.getInstance().runDirectory, "tabparser_results.txt");
            if (!var4.exists()) {
               Helper238.method2186("Файл с результатами парсинга не найден! Сначала запустите модуль Tab Parser.");
               return;
            }

            try {
               String var5 = System.getProperty("os.name").toLowerCase();
               if (var5.contains("win")) {
                  Runtime.getRuntime().exec("explorer /select," + var4.getAbsolutePath());
               } else if (var5.contains("mac")) {
                  Runtime.getRuntime().exec("open -R " + var4.getAbsolutePath());
               } else if (var5.contains("nix") || var5.contains("nux")) {
                  Runtime.getRuntime().exec("xdg-open " + var4.getParent());
               }

               Helper238.method2186("Файл открыт: " + var4.getName());
            } catch (IOException var6) {
               Helper238.method2186("Ошибка при открытии файла: " + var6.getMessage());
            }
         } else {
            this.method278();
         }
      }
   }

   public void method278() {
      Helper238.method2188("Пример использования команды .tabparser:");
      Helper238.method2186(".tabparser dir - Открыть файл с результатами парсинга");
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (!var2.method1690()) {
         return Stream.of("dir");
      } else if (var2.method1694()) {
         String var3 = var2.method1700().toLowerCase();
         return Stream.of("dir").filter(var1x -> var1x.startsWith(var3));
      } else {
         return Stream.empty();
      }
   }

   @Override
   public String method268() {
      return "Управляет функцией Tab Parser.";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList("Управляет модулем парсинга игроков с донатами.", "", "Использование:", ".tabparser dir - Открыть файл с результатами парсинга.");
   }
}
