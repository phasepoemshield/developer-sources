package Nursultan;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;
import minecraft.class00869;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06581;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11457 {
   public Object N_0;
   public Object N_1;
   public static Object y_0 = LogManager.getLogger(String.class);

   public Stream<class11882> L() {
      return ((Map)this.N_0).values().stream();
   }

   private static String M(String var0) {
      return new class12018("autobuy.name").N(var0).N();
   }

   public class11457() {
      this.R();
      this.N_0 = new LinkedHashMap();
      this.N_1 = new HashMap();
      class11938.L().y(this);
      this.u();
      this.z();
      this.W();
      this.U();
   }

   static {
      i();
   }

   private static void i() {
      y_0 = null;
   }

   private void U() {
      ((ExecutorService)class11938.L_1).submit(() -> {
         LinkedHashMap var1 = new LinkedHashMap();
         int var2 = 0;

         for (class11664 var4 : class11107.y()) {
            class11882 var5 = (class11882)((Map)this.N_0).get(M(var4.u()));
            if (var5 != null) {
               try {
                  var1.put(var5, var4.N().t());
               } catch (Exception var7) {
                  var1.put(var5, class06570.y.E().t());
                  var2++;
                  ((Logger)y_0).error(var7, var7);
               }
            }
         }

         int var8 = var2;
         class06202.Nq().execute(() -> {
            var1.forEach((var0x, var1xx) -> var0x.N(var1xx));

            for (int var2x = 0; var2x < var8; var2x++) {
               class11303.y(class11921.N("error-please-report").N(class06541.field_1061));
            }
         });
      });
   }

   private void z() {
      this.N(new class09241(class06570.sT.E(), "elytra", "Элитры", class11165.OTHER));
      this.N(new class09241(class06570.la.E(), "totem-of-undying", "Тотем бессмертия", class11165.OTHER));
      this.N(class06570.be, "enchanted-golden-apple", "Зачарованное золотое яблоко");
      this.N(class06570.bV, "golden-apple", "Золотое яблоко");
      this.N(class06570.sS, "apple", "Яблоко");
      this.N(class06570.TE, "netherite-ingot", "Незеритовый слиток");
      this.N(class00869.Tz.B(), "ancient-debris", "Древние обломки");
      this.N(class06570.GB, "experience-bottle", "Пузырёк опыта");
      this.N(class06570.bN, "gunpowder", "Порох");
      this.N(class06570.nU, "blaze-rod", "Огненный стержень");
      this.N(class06570.nz, "ender-pearl", "Эндер жемчуг");
      this.N(class06570.TN, "diamond", "Алмаз");
      this.N(class06570.TU, "gold-ingot", "Золотой слиток");
      this.N(class06570.NX, "gold-block", "Золотой блок");
      this.N(class06570.Nk.B(), "diamond-ore", "Алмазная руда");
      this.N(class06570.NG.B(), "emerald-ore", "Изумрудная руда");
      this.N(class06570.Bw.B(), "beacon", "Маяк");
      this.N(class06570.tf, "blaze-spawn-egg", "Яйцо призыва всполоха");
      this.N(class06570.tC, "ghast-spawn-egg", "Яйцо призыва гаста");
      this.N(class06570.Gi, "enderman-spawn-egg", "Яйцо призыва эндермена");
      this.N(class06570.tJ, "creeper-spawn-egg", "Яйцо призыва пиглина");
      this.N(class06570.nk, "pig-spawn-egg", "Яйцо призыва свиньи");
      this.N(class06570.nY, "sheep-spawn-egg", "Яйцо призыва овцы");
      this.N(class06570.tW, "villager-spawn-egg", "Яйцо призыва крестьянина");
      this.N(class06570.nw, "cow-spawn-egg", "Яйцо призыва коровы");
      this.N(class06570.tY, "zombie-villager-spawn-egg", "Яйцо призыва зомби-крестьянина");
      this.N(class06570.GQ, "dragon-head", "Голова дракона");
      this.N(class06570.Gz, "wind-charge", "Заряд ветра");
      this.N(class06570.NK, "heavy-core", "Навершие булавы");
   }

   private void u() {
      for (class11664 var2 : class11107.y()) {
         class10938 var3 = new class10938(var2.i().E(), var2.u(), var2.y(), var2.L());
         this.N(var3);
      }
   }

   public Map<String, class11882> y() {
      return (Map<String, class11882>)this.N_0;
   }

   public Optional<class11882> N(String var1) {
      class11882 var2 = (class11882)((Map)this.N_0).get(var1);
      if (var2 == null) {
         var2 = (class11882)((Map)this.N_1).get(var1);
      }

      return Optional.ofNullable(var2);
   }

   public Map<String, class11882> N() {
      return (Map<String, class11882>)this.N_1;
   }

   private void N(class06581 var1, String var2, String var3) {
      class11882 var4 = new class11882(var1.E(), var2, var3, class11165.OTHER);
      this.N(var4);
   }

   private void N(class11882 var1) {
      ((Map)this.N_0).put(var1.L().N(), var1);
      ((Map)this.N_1).put(var1.R(), var1);
   }

   private void W() {
      class11646 var1 = new class11646(class06570.zS.E(), "shulker", "Шалкер", class11165.OTHER);
      this.N(var1);
   }

   private void R() {
   }
}
