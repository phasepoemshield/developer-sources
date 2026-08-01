package l;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Setting6 extends Helper264 {
   private String text = "";
   private int min = 0;
   private int max = 256;
   private Predicate<Character> characterFilter = var0 -> true;

   public Setting6(String var1, String var2) {
      super(var1, var2);
   }

   public Setting6 method2400(Supplier<Boolean> var1) {
      this.method2704(var1);
      return this;
   }

   public Setting6 method2401(Predicate<Character> var1) {
      this.characterFilter = var1 == null ? var0 -> true : var1;
      return this;
   }

   public Setting6 method2402() {
      return this.method2401(Character::isDigit);
   }

   public String method2403() {
      return this.text;
   }

   public int method2404() {
      return this.min;
   }

   public int method2405() {
      return this.max;
   }

   public Predicate<Character> method2406() {
      return this.characterFilter;
   }

   public Setting6 method2407(String var1) {
      this.text = var1;
      return this;
   }

   public Setting6 method2408(int var1) {
      this.min = var1;
      return this;
   }

   public Setting6 method2409(int var1) {
      this.max = var1;
      return this;
   }

   public Setting6 method2410(Predicate<Character> var1) {
      this.characterFilter = var1;
      return this;
   }
}
