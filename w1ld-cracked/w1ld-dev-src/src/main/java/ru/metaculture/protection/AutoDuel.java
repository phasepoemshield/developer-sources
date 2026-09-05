package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_476;
import net.minecraft.class_7439;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoDuel",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Кидает за вас дуэли на ReallyWorld"
)
public class AutoDuel extends Module {
   public final VUVnvvnNN NVNnnvnuunNv = new VUVnvvnNN(
      "Режим: ",
      new vvNnnUNnVvn("Щиты", false),
      new vvNnnUNnVvn("Шипы 3", false),
      new vvNnnUNnVvn("Лук", false),
      new vvNnnUNnVvn("Тотемы", false),
      new vvNnnUNnVvn("НоДебафф", false),
      new vvNnnUNnVvn("Шары", true),
      new vvNnnUNnVvn("Классик", false),
      new vvNnnUNnVvn("Читерский рай", false),
      new vvNnnUNnVvn("Без эндер-жемчуга", false)
   );
   private final List<String> uVunuUNVVUUV = new ArrayList<>();
   private long UNnVVNvvnVvU = 0L;
   private long uNnUnnuNUnNu = 0L;
   private long NnUuNNU = 0L;
   private static final Pattern nNvNUVU = Pattern.compile("^\\w{3,16}$");
   private static final String[] UnUNuUU = new String[]{"Щиты", "Шипы 3", "Лук", "Тотемы", "НоДебафф", "Шары", "Классик", "Читерский рай", "Без эндер-жемчуга"};

   public AutoDuel() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.uVunuUNVVUUV.clear();
      this.UNnVVNvvnVvU = 0L;
      this.uNnUnnuNUnNu = System.currentTimeMillis();
      this.NnUuNNU = 0L;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.method_1562() != null) {
         this.nUUVuvU();
         List var2 = this.UuuNnUvUuv();
         long var3 = System.currentTimeMillis();
         if (var3 - this.uNnUnnuNUnNu > 800L * Math.max(var2.size(), 1)) {
            this.uVunuUNVVUUV.clear();
            this.uNnUnnuNUnNu = var3;
         }

         if (var3 - this.UNnVVNvvnVvU > 1000L) {
            for (String var6 : var2) {
               if (!this.uVunuUNVVUUV.contains(var6) && !var6.equals(uUnuvNvvNU.field_1724.method_7334().getName())) {
                  uUnuvNvvNU.method_1562().method_45730("duel " + var6);
                  this.uVunuUNVVUUV.add(var6);
                  this.UNnVVNvvnVvU = var3;
                  break;
               }
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
         String var4 = var2.comp_763().getString().toLowerCase();
         if (var4.contains("начало") && var4.contains("через") && var4.contains("секунд")
            || var4.contains("дуэли » во время поединка запрещено использовать команды")
            || var4.contains("duel") && var4.contains("during") && var4.contains("forbidden")) {
            this.a_();
         }
      }
   }

   private List<String> UuuNnUvUuv() {
      return uUnuvNvvNU.method_1562()
         .method_2880()
         .stream()
         .map(var0 -> var0.method_2966().getName())
         .filter(var0 -> nNvNUVU.matcher(var0).matches())
         .collect(Collectors.toList());
   }

   private void nUUVuvU() {
      if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
         String var7 = var1.method_25440().getString();
         long var3 = System.currentTimeMillis();
         if (var7.contains("Выбор набора") || var7.contains("Kit selection")) {
            if (var3 - this.NnUuNNU > 90L) {
               ArrayList var5 = new ArrayList();

               for (int var6 = 0; var6 < UnUNuUU.length; var6++) {
                  if (this.NVNnnvnuunNv.C00OOC00oO(UnUNuUU[var6])) {
                     var5.add(var6);
                  }
               }

               if (!var5.isEmpty()) {
                  Collections.shuffle(var5);
                  int var8 = (Integer)var5.get(0);
                  uUnuvNvvNU.field_1761.method_2906(((class_1707)var1.method_17577()).field_7763, var8, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
                  this.NnUuNNU = var3;
               }
            }
         } else if ((var7.contains("Настройка поединка") || var7.contains("Duel setup")) && var3 - this.NnUuNNU > 90L) {
            uUnuvNvvNU.field_1761.method_2906(((class_1707)var1.method_17577()).field_7763, 0, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
            this.NnUuNNU = var3;
         }
      }
   }
}
