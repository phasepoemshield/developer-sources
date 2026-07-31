package l;

public class Hud extends Helper242 {
   private static final int DEFAULT_HUD_COLOR = -16777216;
   public final Setting8 interfaceSettings = new Setting8("Элементы ", "HUD element visibility")
      .method2585(
         "Watermark",
         "Hot Keys",
         "Potions",
         "Staff List",
         "Target Hud",
         "Binds",
         "Cool Downs",
         "Inventory",
         "Armor",
         "Player Info",
         "Notifications",
         "Music Bar"
      )
      .method2586(
         "Watermark",
         "Hot Keys",
         "Potions",
         "Staff List",
         "Target Hud",
         "Binds",
         "Cool Downs",
         "Inventory",
         "Armor",
         "Player Info",
         "Notifications",
         "Music Bar"
      );
   public final Setting8 notificationSettings = new Setting8("Уведомления", "When notifications should appear")
      .method2585("Module Switch", "Staff Join", "Staff Leave", "Item Pick Up", "Auto Armor", "Break Shield")
      .method2586("Module Switch", "Item Pick Up", "Auto Armor", "Break Shield")
      .method2587(() -> this.interfaceSettings.method2588("Notifications"));
   public final Setting8 watermarkSettings = new Setting8("Watermark", "Watermark items")
      .method2585("Nick", "FPS", "Ping", "Time", "TPS", "Server")
      .method2586("FPS", "Ping", "TPS");
   public final Setting5 hudStyle = new Setting5("Стиль худа", "Choose the overall HUD panel style")
      .method2381("Classic", "Floating")
      .method2383("Classic");
   private final Setting3 customHud = new Setting3("Custom Icon Color", "Use chosen color only for icons").method2201(true);
   private final Setting3 ColorHud = new Setting3("Custom HUD Color", "Custom HUD colors");
   public final Setting3 liquidGlass = new Setting3("Жидкое Стекло", "Enable liquid glass for HUD panels").method2201(false);
   public final Setting7 colorSetting = new Setting7("Accent Color", "Main accent color")
      .method2555(-39623)
      .method2551(-9659651, -7569409, -23178, -33925);
   public final Setting7 colorSetting1 = new Setting7("HUD Color", "HUD color")
      .method2555(-39623)
      .method2551(-9659651, -7569409, -23178, -33925)
      .method2552(this.ColorHud::method2200);
   public final Setting2 soundVolumeSetting = new Setting2("Volume", "Volume for module switch sounds")
      .method2078(0.0F, 1.0F)
      .method2086(1.0F)
      .method2081(() -> this.interfaceSettings.method2588("Notifications"));
   public final Setting2 hotKeysAlpha = new Setting2("Hot Keys Alpha", "Hot Keys alpha")
      .method2078(0.0F, 255.0F)
      .method2086(255.0F)
      .method2081(() -> this.interfaceSettings.method2588("Hot Keys"));
   public final Setting2 coolDownsAlpha = new Setting2("CoolDowns Alpha", "CoolDowns alpha")
      .method2078(0.0F, 255.0F)
      .method2086(255.0F)
      .method2081(() -> this.interfaceSettings.method2588("Cool Downs"));
   public final Setting2 staffListAlpha = new Setting2("StaffList Alpha", "Staff List alpha")
      .method2078(0.0F, 255.0F)
      .method2086(255.0F)
      .method2081(() -> this.interfaceSettings.method2588("Staff List"));
   public final Setting2 inventoryAlpha = new Setting2("Inventory Alpha", "Inventory alpha")
      .method2078(0.0F, 255.0F)
      .method2086(255.0F)
      .method2081(() -> this.interfaceSettings.method2588("Inventory"));
   public final Setting2 watermarkAlpha = new Setting2("Watermark Alpha", "Watermark alpha")
      .method2078(0.0F, 255.0F)
      .method2086(255.0F)
      .method2081(() -> this.interfaceSettings.method2588("Watermark"));
   public final Setting2 targetHudAlpha = new Setting2("TargetHud Alpha", "Target HUD alpha")
      .method2078(0.0F, 255.0F)
      .method2086(255.0F)
      .method2081(() -> this.interfaceSettings.method2588("Target Hud"));
   public final Setting2 notificationsAlpha = new Setting2("Notifications Alpha", "Notifications alpha")
      .method2078(0.0F, 255.0F)
      .method2086(255.0F)
      .method2081(() -> this.interfaceSettings.method2588("Notifications"));
   public final Setting2 potionsAlpha = new Setting2("Potions Alpha", "Potions alpha")
      .method2078(0.0F, 255.0F)
      .method2086(255.0F)
      .method2081(() -> this.interfaceSettings.method2588("Potions"));
   public final Setting7 hotKeysRectColor = new Setting7("Hot Keys Rect", "Hot Keys panel color")
      .method2555(-15592684)
      .method2551(-15592684, -16777216, -14803426)
      .method2552(() -> this.ColorHud.method2200() && this.interfaceSettings.method2588("Hot Keys"));
   public final Setting7 coolDownsRectColor = new Setting7("CoolDowns Rect", "CoolDowns panel color")
      .method2555(-15592684)
      .method2551(-15592684, -16777216, -14803426)
      .method2552(() -> this.ColorHud.method2200() && this.interfaceSettings.method2588("Cool Downs"));
   public final Setting7 staffListRectColor = new Setting7("StaffList Rect", "Staff List panel color")
      .method2555(-15592684)
      .method2551(-15592684, -16777216, -14803426)
      .method2552(() -> this.ColorHud.method2200() && this.interfaceSettings.method2588("Staff List"));
   public final Setting7 inventoryRectColor = new Setting7("Inventory Rect", "Inventory panel color")
      .method2555(-15592684)
      .method2551(-15592684, -16777216, -14803426)
      .method2552(() -> this.ColorHud.method2200() && this.interfaceSettings.method2588("Inventory"));
   public final Setting7 watermarkRectColor = new Setting7("Watermark Rect", "Watermark panel color")
      .method2555(-16777216)
      .method2551(-15592684, -16777216, -14803426)
      .method2552(() -> this.ColorHud.method2200() && this.interfaceSettings.method2588("Watermark"));
   public final Setting7 targetHudRectColor = new Setting7("TargetHud Rect", "Target HUD panel color")
      .method2555(-16777216)
      .method2551(-15592684, -16777216, -14803426)
      .method2552(() -> this.ColorHud.method2200() && this.interfaceSettings.method2588("Target Hud"));
   public final Setting7 notificationsRectColor = new Setting7("Notifications Rect", "Notifications panel color")
      .method2555(-15592684)
      .method2551(-15592684, -16777216, -14803426)
      .method2552(() -> this.ColorHud.method2200() && this.interfaceSettings.method2588("Notifications"));
   public final Setting7 potionsRectColor = new Setting7("Potions Rect", "Potions panel color")
      .method2555(-15592684)
      .method2551(-15592684, -16777216, -14803426)
      .method2552(() -> this.ColorHud.method2200() && this.interfaceSettings.method2588("Potions"));

   public static Hud method1824() {
      return Helper222.method1979(Hud.class);
   }

   public float method1825() {
      return this.soundVolumeSetting.method2082();
   }

   public boolean method1826() {
      return true;
   }

   public int method1827() {
      return this.colorSetting.method2553();
   }

   public int method1828() {
      return this.colorSetting.method2553();
   }

   public int method1829() {
      return this.ColorHud.method2200() ? this.colorSetting1.method2553() : -16777216;
   }

   public int method1830() {
      return this.ColorHud.method2200() ? this.hotKeysRectColor.method2553() : -16777216;
   }

   public int method1831() {
      return this.ColorHud.method2200() ? this.coolDownsRectColor.method2553() : -16777216;
   }

   public int method1832() {
      return this.ColorHud.method2200() ? this.staffListRectColor.method2553() : -16777216;
   }

   public int method1833() {
      return this.ColorHud.method2200() ? this.inventoryRectColor.method2553() : -16777216;
   }

   public int method1834() {
      return this.ColorHud.method2200() ? this.watermarkRectColor.method2553() : -16777216;
   }

   public int method1835() {
      return this.ColorHud.method2200() ? this.targetHudRectColor.method2553() : -16777216;
   }

   public int method1836() {
      return this.ColorHud.method2200() ? this.notificationsRectColor.method2553() : -16777216;
   }

   public int method1837() {
      return this.ColorHud.method2200() ? this.potionsRectColor.method2553() : -16777216;
   }

   public boolean method1838() {
      return this.liquidGlass.method2200();
   }

   public boolean method1839() {
      return this.hudStyle.method2385("Floating");
   }

   private int method1840(Setting2 var1) {
      return Math.max(0, Math.min(255, Math.round(var1.method2082())));
   }

   public int method1841() {
      return this.method1840(this.hotKeysAlpha);
   }

   public int method1842() {
      return this.method1840(this.coolDownsAlpha);
   }

   public int method1843() {
      return this.method1840(this.staffListAlpha);
   }

   public int method1844() {
      return this.method1840(this.inventoryAlpha);
   }

   public int method1845() {
      return this.method1840(this.watermarkAlpha);
   }

   public int method1846() {
      return this.method1840(this.targetHudAlpha);
   }

   public int method1847() {
      return this.method1840(this.notificationsAlpha);
   }

   public int method1848() {
      return this.method1840(this.potionsAlpha);
   }

   public Hud() {
      super("Hud", Helper269.RENDER);
      this.setup(
         new Helper264[]{
            this.colorSetting,
            this.liquidGlass,
            this.hudStyle,
            this.interfaceSettings,
            this.watermarkSettings,
            this.notificationSettings,
            this.soundVolumeSetting,
            this.hotKeysRectColor,
            this.coolDownsRectColor,
            this.staffListRectColor,
            this.inventoryRectColor,
            this.watermarkRectColor,
            this.targetHudRectColor,
            this.notificationsRectColor,
            this.potionsRectColor
         }
      );
   }
}
