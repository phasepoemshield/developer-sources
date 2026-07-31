package l;

public class SeeInvisible extends Helper242 {
   private final Setting2 alphaSetting = new Setting2("Прозрачность", "Прозрачность игрока").method2086(0.5F).method2078(0.1F, 1.0F);

   public SeeInvisible() {
      super("SeeInvisible", "See Invisible", Helper269.RENDER);
      this.setup(new Helper264[]{this.alphaSetting});
   }

   @Helper104
   public void method2810(Helper440 var1) {
      var1.method4627(Helper133.method1108(var1.method4626(), this.alphaSetting.method2082()));
      var1.method582();
   }
}
