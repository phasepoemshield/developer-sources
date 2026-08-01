package l;

import java.util.stream.Stream;

final class Helper307 {
   private Helper230 command;
   private String label;
   private Helper200 args;

   Helper307(Helper230 var1, String var2, Helper200 var3) {
      this.command = var1;
      this.label = var2;
      this.args = var3;
   }

   void method3062() {
      try {
         this.command.method262(this.label, this.args);
      } catch (Throwable var3) {
         Object var2 = var3 instanceof Helper57 ? (Helper57)var3 : new Exception2(var3);
         ((Helper57)var2).method647(this.command, this.args.method1687());
      }
   }

   Stream<String> method3063() {
      try {
         return this.command.method267(this.label, this.args);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return Stream.empty();
   }
}
