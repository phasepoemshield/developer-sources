package Nursultan;

import java.util.function.Consumer;
import minecraft.class04157;
import minecraft.class07321;

public record class10318(class07321 center, int viewDistance) implements class04157 {
   public int L() {
      return this.center.B + this.viewDistance + 1;
   }

   public class07321 i() {
      return this.center;
   }

   public int u() {
      return this.center.Z + this.viewDistance + 1;
   }

   public int y() {
      return this.center.Z - this.viewDistance - 1;
   }

   public int N() {
      return this.center.B - this.viewDistance - 1;
   }

   public boolean N(class10318 var1) {
      return this.N() <= var1.L() && this.L() >= var1.N() && this.y() <= var1.u() && this.u() >= var1.y();
   }

   public boolean N(int var1, int var2, boolean var3) {
      return class04157.N(this.center.B, this.center.Z, this.viewDistance, var1, var2, var3);
   }

   public void N(Consumer<class07321> var1) {
      for (int var2 = this.N(); var2 <= this.L(); var2++) {
         for (int var3 = this.y(); var3 <= this.u(); var3++) {
            if (this.N(var2, var3)) {
               var1.accept(new class07321(var2, var3));
            }
         }
      }
   }

   public int R() {
      return this.viewDistance;
   }
}
