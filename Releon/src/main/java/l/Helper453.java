package l;

public class Helper453 extends Widget33 {
   private final Setting3 setting;

   @Override
   protected int getKey() {
      return this.setting.getKey();
   }

   @Override
   protected void setKey(int var1) {
      this.setting.method2202(var1);
   }

   @Override
   protected int getType() {
      return this.setting.getType();
   }

   @Override
   protected void setType(int var1) {
      this.setting.method2203(var1);
   }

   public Helper453(Setting3 var1) {
      this.setting = var1;
   }
}
