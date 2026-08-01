package l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.network.message.LastSeenMessageList.Acknowledgment;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.text.Text;

public class TabParser extends Helper242 {
   Setting5 versionSelect = new Setting5("Версия", "1.16.5").method2381("1.16.5", "1.21.4");
   Setting8 donateSelect = new Setting8("Донат префиксы", "").method2585("Герцог", "Князь", "Принц", "Титан", "Элита", "Глава");
   List<String> anarchyServers165 = new ArrayList<>();
   List<String> anarchyServers214 = new ArrayList<>();
   Map<String, Set<String>> parsedPlayers = new ConcurrentHashMap<>();
   Map<String, Set<String>> initialPlayers = new ConcurrentHashMap<>();
   Helper333 switchTimer = Helper333.method3308();
   Helper333 scanTimer = Helper333.method3308();
   int currentServerIndex = 0;
   boolean parsing = false;
   boolean waitingForServerLoad = false;
   static final Pattern NAME_PATTERN = Pattern.compile("^\\w{3,16}$");

   public TabParser() {
      super("Tab Parser", "Tab Parser", Helper269.MISC);
      this.setup(new Helper264[]{this.versionSelect, this.donateSelect});
      this.anarchyServers165.addAll(List.of("/an102", "/an103", "/an104", "/an105", "/an106", "/an107"));

      for (int var1 = 203; var1 <= 221; var1++) {
         this.anarchyServers165.add("/an" + var1);
      }

      for (int var2 = 302; var2 <= 313; var2++) {
         this.anarchyServers165.add("/an" + var2);
      }

      this.anarchyServers165.addAll(List.of("/an502", "/an503", "/an504", "/an505", "/an506", "/an507", "/an602"));
      this.anarchyServers214.addAll(List.of("/an11", "/an12", "/an21", "/an23", "/an31", "/an32", "/an51", "/an52"));
   }

   @Override
   public void activate() {
      super.activate();
      this.method4636();
      this.method4634();
      this.currentServerIndex = 0;
      this.parsing = true;
      this.waitingForServerLoad = false;
      this.switchTimer.method3309();
      this.scanTimer.method3309();

      for (String var2 : this.donateSelect.method2590()) {
         if (!this.parsedPlayers.containsKey(var2)) {
            this.parsedPlayers.put(var2, ConcurrentHashMap.newKeySet());
         }
      }

      this.method4638();
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.parsing = false;
      Helper238.method2186("Парсинг остановлен.");
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && this.parsing) {
         if (this.waitingForServerLoad) {
            if (this.scanTimer.method3315(3000L)) {
               this.waitingForServerLoad = false;
               this.scanTimer.method3309();
            }
         } else {
            if (this.scanTimer.method3315(2000L)) {
               this.method4637();
               this.scanTimer.method3309();
            }

            if (this.switchTimer.method3315(5000L)) {
               this.method4638();
               this.switchTimer.method3309();
            }
         }
      }
   }

   private void method4634() {
      this.initialPlayers.clear();

      for (Entry var2 : this.parsedPlayers.entrySet()) {
         this.initialPlayers.put((String)var2.getKey(), new HashSet<>((Collection<? extends String>)var2.getValue()));
      }
   }

   private int method4635() {
      int var1 = 0;

      for (Entry var3 : this.parsedPlayers.entrySet()) {
         String var4 = (String)var3.getKey();
         Set<String> var5 = (Set<String>)var3.getValue();
         Set<String> var6 = this.initialPlayers.getOrDefault(var4, Collections.emptySet());

         for (String var8 : var5) {
            if (!var6.contains(var8)) {
               var1++;
            }
         }
      }

      return var1;
   }

   private void method4636() {
      this.parsedPlayers.clear();

      for (String var2 : this.donateSelect.method2590()) {
         this.parsedPlayers.put(var2, ConcurrentHashMap.newKeySet());
      }

      File var10 = method4640();
      if (var10.exists()) {
         try (BufferedReader var11 = new BufferedReader(new FileReader(var10))) {
            String var4 = null;
            int var5 = 0;

            String var3;
            while ((var3 = var11.readLine()) != null) {
               var3 = var3.trim();
               if (var3.startsWith("====") && var3.contains("донатом")) {
                  String[] var6 = var3.split("донатом");
                  if (var6.length > 1) {
                     var4 = var6[1].replace("====", "").trim();
                     if (!this.parsedPlayers.containsKey(var4)) {
                        this.parsedPlayers.put(var4, ConcurrentHashMap.newKeySet());
                     }
                  }
               } else if (!var3.isEmpty() && var4 != null && NAME_PATTERN.matcher(var3).matches()) {
                  this.parsedPlayers.get(var4).add(var3);
                  var5++;
               }
            }

            Helper238.method2186("Загружено " + var5 + " существующих записей");
         } catch (IOException var9) {
            Helper238.method2186("Ошибка при загрузке данных: " + var9.getMessage());
         }
      }
   }

   private void method4637() {
      if (mc.getNetworkHandler() != null && mc.world != null) {
         Collection<net.minecraft.client.network.PlayerListEntry> var1 = mc.getNetworkHandler().getPlayerList();
         if (var1 != null && !var1.isEmpty()) {
            for (PlayerListEntry var3 : var1) {
               String var4 = var3.getProfile().getName();
               if (NAME_PATTERN.matcher(var4).matches()) {
                  Text var5 = var3.getDisplayName();
                  if (var5 != null) {
                     String var6 = var5.getString().toLowerCase();

                     for (String var8 : this.donateSelect.method2590()) {
                        String var9 = var8.toLowerCase();
                        if (var6.contains(var9)) {
                           Set var10 = this.parsedPlayers.get(var8);
                           if (var10 != null) {
                              var10.add(var4);
                           }
                           break;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void method4638() {
      List var1 = this.versionSelect.method2385("1.21.4") ? this.anarchyServers214 : this.anarchyServers165;
      if (this.currentServerIndex >= var1.size()) {
         this.parsing = false;
         int var3 = this.method4635();
         this.method4639();
         Helper238.method2186("Успешно спарсил все анархии!");
         if (var3 > 0) {
            Helper238.method2186("Было записано " + var3 + " новых ников");
         }

         Helper238.method2186("Чтобы открыть файл с никнеймами введите .tabparser dir");
         this.setState(false);
      } else {
         String var2 = (String)var1.get(this.currentServerIndex);
         this.currentServerIndex++;
         Helper238.method2186("Переключаюсь на сервер: " + var2 + " (" + this.currentServerIndex + "/" + var1.size() + ")");
         if (mc.player != null && mc.player.networkHandler != null) {
            mc.player.networkHandler.sendPacket(new ChatMessageC2SPacket(var2, Instant.now(), 0L, null, new Acknowledgment(0, new BitSet())));
            this.waitingForServerLoad = true;
            this.scanTimer.method3309();
         }
      }
   }

   private void method4639() {
      File var1 = method4640();

      try {
         var1.getParentFile().mkdirs();

         try (BufferedWriter var2 = new BufferedWriter(new FileWriter(var1, false))) {
            List<String> var3 = Arrays.asList("Герцог", "Князь", "Принц", "Титан", "Элита", "Глава");
            int var4 = 0;

            for (String var6 : var3) {
               if (this.parsedPlayers.containsKey(var6)) {
                  Set var7 = this.parsedPlayers.get(var6);
                  if (var7 != null && !var7.isEmpty()) {
                     var2.write("==== Аккаунты с донатом " + var6 + " ====");
                     var2.newLine();
                     ArrayList<String> var8 = new ArrayList<>(var7);
                     Collections.sort(var8);

                     for (String var10 : var8) {
                        var2.write(var10);
                        var2.newLine();
                     }

                     var2.newLine();
                     var4 += var7.size();
                  }
               }
            }

            var2.flush();
            Helper238.method2186("Сохранено " + var4 + " игроков в файл");
         }
      } catch (IOException var13) {
         Helper238.method2186("Ошибка при сохранении файла: " + var13.getMessage());
         var13.printStackTrace();
      }
   }

   public static File method4640() {
      return new File(mc.runDirectory, "tabparser_results.txt");
   }
}
