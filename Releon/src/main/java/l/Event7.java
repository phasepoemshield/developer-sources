package l;

public class Event7 implements Helper41 {
   private String text;

   public void method3674(String var1, String var2) {
      if (this.text != null && !this.text.isEmpty()) {
         if (this.text.contains(var1)
            && (
               this.text.equalsIgnoreCase(var1)
                  || this.text.contains(var1 + " ")
                  || this.text.contains(" " + var1)
                  || this.text.contains("⏏" + var1)
                  || this.text.contains(var1 + "§")
            )) {
            this.text = this.text.replace(var1, var2);
         }
      }
   }

   public void method3675(String var1) {
      this.text = var1;
   }

   public String method3676() {
      return this.text;
   }

   public Event7(String var1) {
      this.text = var1;
   }
}
