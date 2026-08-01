package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import net.minecraft.util.Formatting;

public class Neuro extends Helper214 {
   private final Aura aura = Aura.getInstance();

   public Neuro(Releon var1) {
      super("neuro", "neuroaura");
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      if (!var2.method1690()) {
         this.method3024();
      } else {
         String var3 = var2.method1723().toLowerCase(Locale.US);
         switch (var3) {
            case "record":
               this.method3020(var2);
               break;
            case "play":
               this.method3021(var2);
               break;
            case "stop":
               this.method3022();
               break;
            case "fp":
               this.method3023();
               break;
            default:
               this.method3024();
         }
      }
   }

   private void method3020(Helper219 var1) {
      if (!var1.method1690()) {
         this.method905("Использование: .neuro record start <name> | .neuro record stop", Formatting.RED);
      } else {
         String var2 = var1.method1723().toLowerCase(Locale.US);
         switch (var2) {
            case "start":
               var1.method1738(1);
               String var7 = var1.method1723();
               Helper383.method3878(var7);
               this.method905("Нейро-запись '" + var7 + "' начата.", Formatting.GREEN);
               this.method905(
                  "В Aura выбери: Наводка -> Neuro Aura, Нейро режим -> Запоминающий. Аура будет бить и параллельно записывать паттерн.", Formatting.GRAY
               );
               break;
            case "stop":
               String var5 = var1.method1690() ? var1.method1723() : null;
               Helper383.method3879();
               String var6 = Helper383.method3887();
               if (var6 != null) {
                  this.method905("Запись остановлена. Паттерн '" + var6 + "' сразу поставлен на воспроизведение.", Formatting.GREEN);
                  this.method905("Теперь включи в Aura: Наводка -> Neuro Aura, Нейро режим -> Выполняющий.", Formatting.YELLOW);
               } else if (var5 != null) {
                  this.method905("Запись остановлена.", Formatting.GREEN);
               } else {
                  this.method905("Запись остановлена.", Formatting.GREEN);
               }
               break;
            default:
               this.method905("Неизвестный подрежим record: " + var2, Formatting.RED);
         }
      }
   }

   private void method3021(Helper219 var1) {
      var1.method1738(1);
      String var2 = var1.method1723();
      if (!Helper383.method3881(var2)) {
         this.method905("Паттерн '" + var2 + "' не найден.", Formatting.RED);
      } else {
         this.method905("Паттерн '" + var2 + "' включён.", Formatting.GREEN);
         this.method905("В Aura выбери: Наводка -> Neuro Aura, Нейро режим -> Выполняющий.", Formatting.YELLOW);
      }
   }

   private void method3022() {
      Helper383.method3882();
      Helper383.method3879();
      this.method905("Нейро-запись и нейро-воспроизведение выключены.", Formatting.YELLOW);
   }

   private void method3023() {
      if (!Helper3.method256()) {
         Helper3.method257();
         this.method905("FakePlayer заспавнен. Можно использовать для ручочной тренировки, но для новой Neuro Aura он уже не обязателен.", Formatting.GREEN);
      } else {
         Helper3.method258();
         this.method905("FakePlayer удалён.", Formatting.YELLOW);
      }
   }

   private void method3024() {
      this.method905("Использование .neuro:", Formatting.GRAY);
      this.method905(".neuro record start <name> - начать запись паттерна прямо в Aura", Formatting.GRAY);
      this.method905(".neuro record stop - остановить запись и сразу вооружить её для Neuro Aura", Formatting.GRAY);
      this.method905(".neuro play <name> - вручную включить сохранённый паттерн", Formatting.GRAY);
      this.method905(".neuro stop - выключить запись и воспроизведение", Formatting.GRAY);
      this.method905(".neuro fp - заспавнить/удалить fakeplayer", Formatting.GRAY);
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (!var2.method1690()) {
         return Stream.of("record", "play", "stop", "fp");
      } else if (var2.method1694()) {
         String var8 = var2.method1700().toLowerCase(Locale.US);
         return new Helper120().method999().method994("record", "play", "stop", "fp").method1000(var8).method1003();
      } else {
         String var3 = var2.method1723().toLowerCase(Locale.US);
         if (var3.equals("record") && var2.method1694()) {
            String var9;
            try {
               var9 = var2.method1700().toLowerCase(Locale.US);
            } catch (Helper106 var6) {
               var9 = "";
            }

            String var5 = var9;
            return Stream.of("start", "stop").filter(var1x -> var1x.startsWith(var5));
         } else if (var3.equals("play") && var2.method1694()) {
            String var4;
            try {
               var4 = var2.method1700().toLowerCase(Locale.US);
            } catch (Helper106 var7) {
               var4 = "";
            }

            String var5 = var4;
            return Helper383.method3886().stream().filter(var1x -> var1x.startsWith(var5));
         } else {
            return Stream.empty();
         }
      }
   }

   @Override
   public String method268() {
      return "Запись и запуск нейро-паттернов для Aura.";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "Команда управляет нейро-паттернами для режима Neuro Aura.",
         "",
         ".neuro record start <name> - начать запись паттерна в Aura",
         ".neuro record stop - закончить запись и сразу поставить её на выполнение",
         ".neuro play <name> - вручную включить сохранённый паттерн",
         ".neuro stop - остановить запись и воспроизведение",
         ".neuro fp - заспавнить/удалить fakeplayer"
      );
   }
}
