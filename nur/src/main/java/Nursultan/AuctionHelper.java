package Nursultan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00496;
import minecraft.class00524;
import minecraft.class02484;
import minecraft.class02710;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07050;
import minecraft.class07314;
import minecraft.class07482;
import minecraft.class08394;
import minecraft.class08562;
import org.apache.commons.lang3.StringUtils;

@class11080(
   L = "AuctionHelper",
   y = class11072.MISC,
   N = class11106.HELPER
)
public class AuctionHelper extends class11067 {
   public static Object L_0 = new Pattern[]{Pattern.compile("\\$\\s*.*?(\\d{1,3}(?:,\\d{3})*)"), Pattern.compile("▍ (?:Текущая цена|Цена): ([\\d ]+)¤")};
   public static Object L_1 = new String[]{"поиск:", "аукционы", "аукцион", " п: ", "漢:"};
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public boolean u_init;

   public AuctionHelper() {
      this.m();
      this.u_0 = class11524.N(this, "profitable-color", -11104513);
      this.u_1 = class11524.N(this, "profitable-items-count", 3.0F, 1.0F, 5.0F, 1.0F);
      this.u_2 = class11524.N(this, "open-auction-from-item", class12002.UNKNOWN);
      this.u_3 = class11524.N(this, "show-item-price", true);
      this.u_4 = new HashSet();
      this.u_5 = Comparator.comparingLong(var1 -> {
         long var2 = this.N(var1.i());
         int var4 = var1.i().c();
         return var4 == 0 ? Long.MAX_VALUE : (long)Math.round((float)var2 / (float)var4 / 10.0F) * 10L;
      });
   }

   static {
      n();
   }

   private static void n() {
      L_0 = null;
      L_1 = null;
   }

   private void m() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_6 = false;
      }
   }

   private void j() {
      this.m();
      if ((class05096)((class06202)super.y_0).v_3 != null) {
         String var1 = ((class05096)((class06202)super.y_0).v_3).method_25440().getString().toLowerCase();
         if (!this.Y(var1)) {
            ((Set)this.u_4).clear();
         } else {
            Stream<class06937> var2 = this.N((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3)
               .stream()
               .filter(var1x -> this.y(var1x.i()));
            this.N(var2);
         }
      }
   }

   private boolean y(class06584 var1) {
      if (var1.N(class06570.vv)) {
         class08562 var2 = (class08562)var1.a_(class02484.v, class08562.L);
         if (var2.y().size() > 5) {
            return false;
         }
      }

      String var6 = String.join(", ", class11929.E(var1));
      Pattern[] var3 = (Pattern[])L_0;
      int var4 = var3.length;

      for (int var5 = 0; var5 < var4; var5++) {
         if (var3[var5].matcher(var6).find()) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void y() {
      this.m();
      this.u_6 = false;
      super.y();
   }

   @class11782
   public void N(class11361 var1) {
      this.m();
      if (((class11507)this.u_3).i()) {
         class06584 var2 = var1.y();
         if (var2.c() > 1) {
            List<class00392> var3 = var1.N();

            for (int var4 = 0; var4 < var3.size(); var4++) {
               String var6 = var3.get(var4).getString();
               if (var6.contains(" Ценa") || var6.contains(" Цена")) {
                  String var7 = var6.replaceAll("[^0-9]", "");
                  DecimalFormat var8 = new DecimalFormat("§a$ §fЗа штуку §a$###,###");
                  var8.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
                  double var9 = (double)Long.parseLong(var7) / (double)var2.c();
                  String var11 = var8.format(var9);
                  var3.add(var4 + 1, class00392.y(var11));
               }
            }

            var1.N(var3);
         }
      }
   }

   @class11782
   public void N(class11359 var1) {
      this.m();
      this.u_6 = false;
   }

   private List<class06937> N(class07482 var1) {
      return var1.T.stream().limit(45L).filter(var0 -> {
         class06584 var1x = var0.i();
         return var0.R() && !var1x.R();
      }).toList();
   }

   private long N(class06584 var1) {
      String var2 = String.join(", ", class11929.E(var1));
      Pattern[] var3 = (Pattern[])L_0;
      int var4 = var3.length;

      for (int var5 = 0; var5 < var4; var5++) {
         Matcher var7 = var3[var5].matcher(var2);
         if (var7.find()) {
            return Long.parseLong(var7.group(1).replaceAll("[,\\s]", ""));
         }
      }

      return 0L;
   }

   @class11782
   public void N(class10961 var1) {
      this.m();
      class00381 var10000 = var1.N();
      Objects.requireNonNull(var10000);
      class00381<?> var3 = var10000;
      switch (var3) {
         case class00496 var5:
            if (((class00496)var3).N() != 0) {
               this.u_6 = true;
            }
            break;
         case class00524 var6:
            if (((class00524)var3).N() != 0) {
               this.u_6 = true;
            }
            break;
      }
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.m();
      if (((class11527)this.u_2).N(var1)) {
         for (class07050 var5 : class07050.values()) {
            class06584 var6 = ((class04453)((class06202)super.y_0).T_4).method_5998(var5);
            if (var6.B() != class06570.N) {
               String var7 = class06541.N(var6.d().getString()).replaceAll("[^\\p{L} \\-]", "").trim();
               var7 = var7.replaceAll(" (?i)xxx (?i)", "").replaceAll(" (?i)xxx$", "").replaceAll("^xxx (?i)", "");
               var7 = StringUtils.normalizeSpace(var7);
               class11910.N("/ah search " + var7);
               break;
            }
         }
      }
   }

   @class11782
   public void N(class11380 var1) {
      this.m();
      if ((Boolean)this.u_6) {
         this.j();
         this.u_6 = false;
      }
   }

   private void N(Stream<class06937> var1) {
      this.m();
      List var2 = var1.toList();
      ((Set)this.u_4).clear();
      var2.stream()
         .filter(class06937::R)
         .sorted(
            Comparator.<class06937>comparingLong(
                  var0 -> ((class02710)var0.i().y().a_(class02484.P, class02710.N)).N().stream().anyMatch(var0x -> var0x.N(var0xx -> var0xx == class07314.B))
                        ? 1L
                        : 0L
               )
               .thenComparing((Comparator<? super class06937>)this.u_5)
         )
         .limit((long)((class11504)this.u_1).i().intValue())
         .forEach(var1x -> {
            this.m();
            ((Set)this.u_4).add(new class11564(var1x, 1L));
         });
   }

   @class11782
   public void N(class10951 var1) {
      this.m();
      String var2 = var1.N().toLowerCase();
      if (!this.Y(var2)) {
         ((Set)this.u_4).clear();
      } else {
         for (class11564 var4 : (Set)this.u_4) {
            int var5 = (int)(55.0 + 200.0 * Math.sin((double)System.currentTimeMillis() / 60.0) / 2.0 + 0.5);
            class06937 var6 = var4.y();
            var1.y().N(class08394.NH, var6.i, var6.R, var6.i + 16, var6.R + 16, class11300.N(((class11515)this.u_0).i(), var5));
         }
      }
   }

   private boolean Y(String var1) {
      return Arrays.<String>stream((String[])L_1).anyMatch(var1::contains);
   }
}
