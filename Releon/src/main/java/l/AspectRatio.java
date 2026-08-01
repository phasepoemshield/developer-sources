package l;

public class AspectRatio extends Helper242 {
   private final Setting2 ratioSetting = new Setting2("Соотношение", "Настройка значения соотношения сторон").method2086(1.0F).method2078(0.1F, 2.0F);

   public AspectRatio() {
      super("AspectRatio", "Aspect Ratio", Helper269.RENDER);
      this.setup(new Helper264[]{this.ratioSetting});
   }

   @Helper104
   public void method1804(Helper367 var1) {
      var1.method3640(this.ratioSetting.method2082());
      var1.method582();
   }
}
