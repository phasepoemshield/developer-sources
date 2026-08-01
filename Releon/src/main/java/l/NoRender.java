package l;

public class NoRender extends Helper242 {
   public final Setting8 modeSetting = new Setting8("Элементы", "Выберите элементы для игнорирования")
      .method2585("Fire", "Bad Effects", "Block Overlay", "Darkness", "Damage")
      .method2586("Fire", "Bad Effects", "Block Overlay", "Darkness", "Damage");

   public static NoRender method2708() {
      return Helper222.method1979(NoRender.class);
   }

   public NoRender() {
      super("NoRender", "No Render", Helper269.RENDER);
      this.setup(new Helper264[]{this.modeSetting});
   }
}
