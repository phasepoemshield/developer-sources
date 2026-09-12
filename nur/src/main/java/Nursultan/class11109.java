package Nursultan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.LongStream;
import minecraft.class00392;
import minecraft.class00496;
import minecraft.class00524;
import minecraft.class04453;
import minecraft.class04459;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;

public class class11109 implements class11819 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public static Object y_0 = new Pattern[]{Pattern.compile("\\$\\s*.*?(\\d{1,3}(?:,\\d{3})*)")};

   private void M() {
      Long var1 = (Long)((Function)this.N_3)
         .apply(
            ((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3)
               .T
               .stream()
               .limit(45L)
               .<class06584>map(class06937::i)
               .filter(var1x -> ((class11882)this.N_4).test(var1x))
               .mapToLong(class11109::y)
               .filter(var0 -> var0 > 0L)
         );
      if (var1 > 0L) {
         DecimalFormat var2 = new DecimalFormat("$###,###");
         var2.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
         String var3 = var2.format(var1);
         class11303.y(class00392.y(((class11882)this.N_4).R()).N(class06541.field_1080).i(" ").y(class00392.y(var3).N(class06541.field_1054)));
         ((class11882)this.N_4).Z().N(String.valueOf(var1));
      }
   }

   private void M(int var1) {
      if (var1 != 0 && (Integer)this.N_5 <= 0) {
         this.N_7 = true;
         this.N_6 = Integer.MAX_VALUE;
      }
   }

   private static void P() {
      y_0 = null;
   }

   public class11109() {
      this.m();
      this.N_0 = class06202.Nq();
   }

   static {
      y();
      P();
   }

   private void B() {
      this.N_4 = (class11882)((Queue)this.N_2).poll();
      if ((class11882)this.N_4 != null) {
         class11910.N("/ah search " + ((class11882)this.N_4).R());
         this.N_6 = 60;
         this.N_5 = 1;
      }
   }

   private void i() {
      this.N();
   }

   private void m() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_5 = 0;
         this.N_6 = 0;
         this.N_7 = false;
      }
   }

   private void U() {
      if ((class11882)this.N_4 != null) {
         this.M();
      }

      this.N_5 = 18;
      ((class04453)((class06202)this.N_0).T_4).method_7346();
      this.N_4 = (class11882)((Queue)this.N_2).poll();
      if ((class11882)this.N_4 == null) {
         ((CompletableFuture)this.N_1).complete(null);
      }

      this.N_7 = false;
   }

   private void u() {
      if ((class11882)this.N_4 != null) {
         class11910.N("/ah search " + ((class11882)this.N_4).R());
         this.N_6 = 60;
      }
   }

   @Override
   public void y(Object var1) {
      if ((CompletableFuture)this.N_1 != null && !((CompletableFuture)this.N_1).isDone()) {
         switch (var1) {
            case null:
            default:
               break;
            case class10992 var4:
               this.W();
               break;
            case class09343 var5:
               this.i();
               break;
            case class00524 var6:
               this.M(var6.N());
               break;
            case class00496 var7:
               this.M(var7.N());
               break;
            case class04459 var8:
               this.N(var8);
         }
      }
   }

   private static void y() {
   }

   private static long y(class06584 var0) {
      String var1 = String.join(", ", class11929.E(var0));
      Pattern[] var2 = (Pattern[])y_0;
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; var4++) {
         Matcher var6 = var2[var4].matcher(var1);
         if (var6.find()) {
            return Long.parseLong(var6.group(1).replaceAll("[,\\s]", "")) / (long)var0.c();
         }
      }

      return -1L;
   }

   private void N(class04459 var1) {
      String var2 = var1.N().getString().toLowerCase();
      if (var2.contains("не существует")) {
         this.N_5 = 18;
         this.N_4 = (class11882)((Queue)this.N_2).poll();
      } else if (var2.contains("после входа на режим необходимо") && var2.contains("сек.")) {
         ((Queue)this.N_2).add((class11882)this.N_4);
         String var3 = var2.replaceAll("\\D+", "");
         int var4 = 20;

         try {
            int var5 = Integer.parseInt(var3);
            var4 += var4 * (var5 + 3);
         } catch (NumberFormatException var6) {
         }

         this.N_5 = var4;
      } else if (var2.contains("команда недоступна в режиме afk")) {
         ((Queue)this.N_2).add((class11882)this.N_4);
         this.N_5 = 60;
      }
   }

   public CompletableFuture<Void> N(Collection<class11882> var1, Function<LongStream, Long> var2) {
      this.N_2 = new LinkedList(var1);
      this.N_3 = var2;
      this.N();
      this.N_1 = new CompletableFuture();
      this.N_4 = (class11882)((Queue)this.N_2).poll();
      if (((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b != 0) {
         ((class04453)((class06202)this.N_0).T_4).method_7346();
         this.N_5 = 60;
      }

      return (CompletableFuture<Void>)this.N_1;
   }

   public void N() {
      if ((CompletableFuture)this.N_1 != null && !((CompletableFuture)this.N_1).isDone()) {
         ((CompletableFuture)this.N_1).cancel(false);
      }

      this.N_7 = false;
      this.N_6 = Integer.MAX_VALUE;
      this.N_5 = 10;
      this.N_4 = null;
   }

   private void W() {
      this.N_5 = (Integer)this.N_5 - 1;
      this.N_6 = (Integer)this.N_6 - 1;
      if ((Boolean)this.N_7) {
         this.U();
      }

      if ((Integer)this.N_5 == 0) {
         this.u();
      }

      if ((Integer)this.N_6 <= 0) {
         this.B();
      }
   }
}
