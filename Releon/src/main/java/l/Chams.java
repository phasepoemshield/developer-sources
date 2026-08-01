package l;

import java.awt.Color;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.entity.player.PlayerEntity;

public class Chams extends Helper242 {
   private final Setting8 targets = new Setting8("Цели", "Кого подсвечивать").method2585("Все", "Враги", "Друзья").method2586("Все");
   private final Setting3 useThemeColor = new Setting3("Цвет темы", "Использовать цвет клиента").method2201(true);
   private final Setting7 customColor = new Setting7("Цвет", "Кастомный цвет chams")
      .method2550(new Color(255, 100, 100, 255).getRGB())
      .method2552(() -> !this.useThemeColor.method2200());
   private final Setting2 alpha = new Setting2("Прозрачность", "Прозрачность линий").method2086(160.0F).method2078(10.0F, 255.0F);
   private final Setting2 fillAlpha = new Setting2("Прозрачность заливки", "Прозрачность заливки боксов").method2086(50.0F).method2078(5.0F, 255.0F);
   private final Setting2 lineWidth = new Setting2("Толщина линий", "Толщина линий").method2086(1.5F).method2078(0.5F, 5.0F);
   private final Setting2 layers = new Setting2("Слои", "Количество слоёв").method2086(1.0F).method2078(1.0F, 3.0F);
   private final Setting3 throughWalls = new Setting3("Сквозь стены", "Рисовать через стены").method2201(true);

   public Chams() {
      super("Chams", "Chams", Helper269.RENDER);
      this.setup(
         new Helper264[]{this.targets, this.useThemeColor, this.customColor, this.alpha, this.fillAlpha, this.lineWidth, this.layers, this.throughWalls}
      );
   }

   public static Chams method2439() {
      return Helper222.method1979(Chams.class);
   }

   public boolean method2440(PlayerEntityRenderState var1) {
      return this.method2441(this.method2450(var1));
   }

   public boolean method2441(PlayerEntity var1) {
      if (!this.isState() || var1 == null || mc.player == null) {
         return false;
      } else if (var1 == mc.player && mc.options.getPerspective().isFirstPerson()) {
         return false;
      } else {
         boolean var2 = Helper309.method3075(var1);
         return this.targets.method2588("Враги") && var2 ? false : !this.targets.method2588("Друзья") || var2;
      }
   }

   public int method2442(PlayerEntity var1, int var2) {
      return this.method2449(var1, var2);
   }

   public int method2443(PlayerEntity var1, int var2) {
      return this.method2449(var1, var2);
   }

   public boolean method2444() {
      return this.throughWalls.method2200();
   }

   public float method2445() {
      return this.lineWidth.method2082();
   }

   public int method2446() {
      return Math.max(1, (int)this.layers.method2082());
   }

   public int method2447() {
      return Math.max(10, (int)this.alpha.method2082());
   }

   public int method2448() {
      return Math.max(5, (int)this.fillAlpha.method2082());
   }

   private int method2449(PlayerEntity var1, int var2) {
      if (var1 != null && Helper309.method3075(var1)) {
         return new Color(0, 220, 80, var2).getRGB();
      } else {
         int var3 = this.useThemeColor.method2200() ? Helper133.method1162() : this.customColor.method2554();
         return Helper133.method1106(var3, var2);
      }
   }

   private PlayerEntity method2450(PlayerEntityRenderState var1) {
      if (mc.world == null) {
         return null;
      } else {
         return mc.world.getEntityById(var1.id) instanceof PlayerEntity var3 ? var3 : null;
      }
   }
}
