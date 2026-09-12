package Nursultan;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.regex.Pattern;
import minecraft.class00176;
import minecraft.class00381;
import minecraft.class00486;
import minecraft.class00524;
import minecraft.class00539;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05873;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07510;
import minecraft.class07843;
import minecraft.class08082;

public class class11158 extends class11127 implements class11801<AutoJoin> {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public boolean L_init;

   private boolean L(String var1) {
      this.B();
      String var2 = "#" + ((class11533)this.L_0).i();
      int var3 = var1.indexOf(var2);

      while (var3 != -1) {
         int var4 = var3 + var2.length();
         if (var4 >= var1.length() || !Character.isDigit(var1.charAt(var4))) {
            return true;
         }

         var3 = var1.indexOf(var2, var4);
      }

      return false;
   }

   private void M() {
      int var1 = class11281.R(class06570.jJ);
      if (!class11281.y(var1)) {
         class11322.i(var1);
         class11499 var2 = class11505.N();
         ((class03443)((class06202)super.N_0).T_2)
            .N((class03448)((class06202)super.N_0).T_3, var1x -> new class07843(class07050.field_5808, var1x, var2.y(), var2.R()));
      }
   }

   public class11158(AutoJoin var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.B();
   }

   private void B() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = (short)0;
         this.L_2 = 0;
         this.L_3 = 0;
         this.L_4 = 0;
      }
   }

   private void m() {
      this.B();
      this.L_4 = 0;
      this.L_1 = Short.valueOf((short)-1);
      this.L_2 = -1;
      this.L_3 = -1;
      this.L_5 = null;
   }

   @Override
   public void y(Object var1) {
      this.B();
      if (var1 instanceof class10996) {
         this.L_4 = (Integer)this.L_4 - 1;
         if ((class00176)this.L_5 != null) {
            if ((Integer)this.L_4 < 0) {
               Int2ObjectOpenHashMap var3 = new Int2ObjectOpenHashMap();
               var3.put((Short)this.L_1, (class00176)this.L_5);
               class11910.N(new class00539((Integer)this.L_2, (Integer)this.L_3, (Short)this.L_1, (byte)0, class07510.field_7790, var3, (class00176)this.L_5));
               this.L_4 = 40;
            }
         } else {
            this.M();
         }
      } else if (var1 instanceof class10990 var2) {
         class00381<?> var3 = var2.u();
         switch (var3) {
            case null:
            default:
               break;
            case class00524 var6:
               ((class06202)super.N_0).execute(() -> {
                  this.B();
                  if ((class04453)((class06202)super.N_0).T_4 != null && ((class06202)super.N_0).NE() != null) {
                     List<class06584> var2x = var6.L();

                     for (int var3x = 0; var3x < var2x.size(); var3x++) {
                        String var5 = var2x.get(var3x).d().getString();
                        int var6x = var6.N();
                        int var7x = var6.y();
                        if (var5.contains("ГРИФЕРСКОЕ ВЫЖИВАНИЕ")) {
                           class00176 var8x = class00176.y(var2x.get(var3x), ((class06202)super.N_0).NE().Q());
                           Int2ObjectOpenHashMap var9x = new Int2ObjectOpenHashMap();
                           var9x.put(var3x, var8x);
                           class11910.N(new class00539(var6x, var7x, (short)var3x, (byte)0, class07510.field_7790, var9x, var8x));
                           break;
                        }

                        if (this.L(var5)) {
                           this.L_2 = var6x;
                           this.L_3 = var7x;
                           this.L_1 = (short)var3x;
                           this.L_5 = class00176.y(var2x.get(var3x), ((class06202)super.N_0).NE().Q());
                           break;
                        }
                     }
                  }
               });
               break;
            case class05873 var7:
               var2.N();
               break;
            case class00486 var8:
               this.m();
               var2.N();
               break;
            case class08082 var9:
               ((class06202)super.N_0).execute(() -> ((AutoJoin)super.y_0).N(false));
         }
      }
   }

   @Override
   public void N() {
      this.m();
   }

   public void N(AutoJoin var1) {
      this.B();
      this.L_0 = (class11533)class11524.N(var1, "grief", "1", Pattern.compile("^[1-9]\\d{0,18}$")).N(var1x -> this.U());
   }

   @Override
   public void b_() {
      this.m();
      super.b_();
   }
}
