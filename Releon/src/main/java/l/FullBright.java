package l;

public class FullBright extends Helper242 {
   public final Setting2 brightSetting = new Setting2("Яркость", "Устанавливает значение максимальной яркости").method2086(1.0F).method2078(0.0F, 1.0F);

   public static FullBright method1961() {
      return Helper222.method1979(FullBright.class);
   }

   public FullBright() {
      super("FullBright", "Full Bright", Helper269.RENDER);
      this.setup(new Helper264[]{this.brightSetting});
   }

   @Override
   public void deactivate() {
      super.deactivate();
   }
}
