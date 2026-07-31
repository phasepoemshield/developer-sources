package l;

public class ClickGui extends Helper242 {
   private static final int DEFAULT_GUI_COLOR = -9663233;
   private static final int DEFAULT_BACKGROUND_COLOR = -652994528;
   private static final int DEFAULT_TEXT_COLOR = -789000;
   private static final int DEFAULT_ENABLED_COLOR = -9663233;
   public Setting7 colorSetting = new Setting7("Цвет GUI", "Выберите цвет").method2555(-9663233).method2551(-9659651, -7569409, -23178, -33925);
   public Setting7 sliderColor = new Setting7("Цвет слайдера", "Выберите цвет").method2555(-9663233).method2551(-9659651, -7569409, -23178, -33925);
   public Setting7 moduleColor = new Setting7("Цвет модуля", "Выберите цвет").method2555(-789000).method2551(-9659651, -7569409, -23178, -33925);
   public Setting7 settingColor = new Setting7("Цвет настроек", "Выберите цвет").method2555(-9663233).method2551(-9659651, -7569409, -23178, -33925);
   public Setting7 iconColor = new Setting7("Цвет иконки", "Выберите цвет").method2555(-9663233).method2551(-9659651, -7569409, -23178, -33925);
   public Setting2 guiAlpha = new Setting2("Альфа GUI", "Прозрачность GUI").method2079(0, 255).method2086(255.0F);
   public Setting7 backgroundColorSetting = new Setting7("Цвет фона GUI", "Основной фон панелей")
      .method2555(-652994528)
      .method2551(-652994528, -870901212, -870640094, -870704614);
   public Setting7 textColorSetting = new Setting7("Цвет текста GUI", "Цвет текста в панелях")
      .method2555(-789000)
      .method2551(-789000, -1446669, -2235408, -1);
   public Setting7 enabledColorSetting = new Setting7("Цвет активного GUI", "Цвет активных модулей")
      .method2555(-9663233)
      .method2551(-9659651, -7569409, -23178, -33925);
   public Setting2 alphaSetting = new Setting2("GUI Alpha Compat", "Compat").method2078(0.15F, 1.0F).method2086(0.82F);
   private final Setting9 bind = new Setting9("Кнопка открытия ClickGUI", "Открывает ClickGUI").method2706(344);
   public Setting2 ClickGui = new Setting2("Ширина гуи", "Ширина гуи").method2079(0, 1000).method2086(400.0F);
   public Setting2 ClickGui1 = new Setting2("Высота гуи", "Высота гуи").method2079(0, 1000).method2086(300.0F);

   public static ClickGui method2650() {
      return Helper222.method1979(ClickGui.class);
   }

   public ClickGui() {
      super("ClickGui", "Click GUI", Helper269.RENDER);
      this.setup(new Helper264[]{this.bind, this.textColorSetting, this.enabledColorSetting, this.alphaSetting});
   }

   public int method2651() {
      int var1 = this.isState() ? this.colorSetting.method2553() : -9663233;
      int var2 = this.isState() ? this.guiAlpha.method2080() : 255;
      return Helper133.method1120(var1, var2);
   }

   public int method2652() {
      return Helper133.method1108(this.backgroundColorSetting.method2553(), this.alphaSetting.method2082());
   }

   public float method2653() {
      return this.alphaSetting.method2082();
   }

   public int method2654() {
      return this.textColorSetting.method2553() | 0xFF000000;
   }

   public int method2655() {
      return Helper133.method1108(this.enabledColorSetting.method2553() | 0xFF000000, this.alphaSetting.method2082());
   }

   @Override
   public int getKey() {
      return this.bind.getKey();
   }

   @Override
   public void setKey(int var1) {
      this.bind.method2706(var1);
      super.setKey(var1);
   }

   public int method2656() {
      return this.getKey();
   }
}
