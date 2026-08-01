package ru.metaculture.protection;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public final class HudConstructorScreen extends Screen {
   private static volatile boolean O00000000;
   private static final String O000000000 = "panel";
   private static final String O0000000000 = "header";
   private static final String O00000000000 = "modules";
   private static final String O000000000000 = "binds";
   private static final String O0000000000000 = "content";
   private static final String O000000000000O = "title";
   private static final String O00000000000O = "icon";
   private static final String O00000000000O0 = "slots";
   private static final String O00000000000OO = "panelRadius";
   private static final String O0000000000O = "headerRadius";
   private static final String O0000000000O0 = "contentRadius";
   private static final String O0000000000O00 = "modulesRadius";
   private static final String O0000000000O0O = "bindsRadius";
   private static final String O0000000000OO = "rowRadius";
   private static final String O0000000000OO0 = "slotRadius";
   private static final String O0000000000OOO = "padding";
   private static final String O000000000O = "gap";
   private static final String O000000000O0 = "headerHeight";
   private static final String O000000000O00 = "rowHeight";
   private static final String O000000000O000 = "titleSize";
   private static final String O000000000O00O = "iconSize";
   private static final String O000000000O0O = "bindWidth";
   private static final String O000000000O0O0 = "accentWidth";
   private static final String O000000000O0OO = "reset";
   private static final String O000000000OO = "centerX";
   private static final String O000000000OO0 = "centerY";
   private static final String O000000000OO00 = "presetSoft";
   private static final String O000000000OO0O = "presetCompact";
   private static final String O000000000OOO = "presetSharp";
   private static final String O000000000OOO0 = "CORNERS";
   private static final String O000000000OOOO = "SPACING";
   private static final String O00000000O = "SIZE";
   private static final String O00000000O0 = "TYPOGRAPHY";
   private static final String O00000000O00 = "ACTIONS";
   private static final String O00000000O000 = "PRESETS";
   private static final String O00000000O0000 = "drag surface  ·  resize corner";
   private static final String[] O00000000O000O = new String[]{"panel", "header", "modules", "binds", "content", "title", "icon"};
   private static final String[] O00000000O00O = new String[]{"panel", "header", "content", "slots", "title", "icon"};
   private static final String[] O00000000O00O0 = new String[]{"panel", "content", "slots"};
   private static final String[] O00000000O00OO = new String[]{"panel", "content", "modules"};
   private static final String[] O00000000O0O = new String[]{"panel", "content", "modules", "slots"};
   private static final String[] O00000000O0O0 = new String[]{"panel", "content", "modules", "binds"};
   private static final String[] O00000000O0O00 = new String[]{"panel", "header", "modules", "content", "title", "icon"};
   private static final String[] O00000000O0O0O = new String[]{"panel", "header", "modules", "binds", "content", "title", "icon", "slots"};
   private static final String[] O00000000O0OO = new String[]{"reset", "centerX", "centerY", "presetSoft", "presetCompact", "presetSharp"};
   private static final HudConstructorScreen.W245[] O00000000O0OO0 = new HudConstructorScreen.W245[]{
      new HudConstructorScreen.W245("panelRadius", "Panel radius", "CORNERS", 0.0F, 32.0F),
      new HudConstructorScreen.W245("headerRadius", "Header radius", "CORNERS", 0.0F, 28.0F),
      new HudConstructorScreen.W245("contentRadius", "Content radius", "CORNERS", 0.0F, 24.0F),
      new HudConstructorScreen.W245("modulesRadius", "Modules radius", "CORNERS", 0.0F, 24.0F),
      new HudConstructorScreen.W245("bindsRadius", "Binds radius", "CORNERS", 0.0F, 24.0F),
      new HudConstructorScreen.W245("rowRadius", "Row radius", "CORNERS", 0.0F, 22.0F),
      new HudConstructorScreen.W245("slotRadius", "Slot radius", "CORNERS", 0.0F, 14.0F),
      new HudConstructorScreen.W245("padding", "Padding", "SPACING", 2.0F, 18.0F),
      new HudConstructorScreen.W245("gap", "Gap", "SPACING", 0.0F, 18.0F),
      new HudConstructorScreen.W245("headerHeight", "Header height", "SIZE", 0.0F, 48.0F),
      new HudConstructorScreen.W245("rowHeight", "Row height", "SIZE", 14.0F, 42.0F),
      new HudConstructorScreen.W245("titleSize", "Title size", "TYPOGRAPHY", 14.0F, 38.0F),
      new HudConstructorScreen.W245("iconSize", "Icon size", "TYPOGRAPHY", 12.0F, 38.0F),
      new HudConstructorScreen.W245("bindWidth", "Bind column", "TYPOGRAPHY", -24.0F, 90.0F),
      new HudConstructorScreen.W245("accentWidth", "Accent width", "TYPOGRAPHY", 0.0F, 7.0F)
   };
   private static final HudConstructorScreen.W244[] O00000000O0OOO = new HudConstructorScreen.W244[]{
      new HudConstructorScreen.W244("HUD_HotKeys", "KeyBinds", "HotKeys", FontRegistry.O00000000000O, "q", HudConstructorScreen.W243.KEYBINDS, true),
      new HudConstructorScreen.W244("HUD_Inventory", "Inventory", "Inventory", FontRegistry.O000000000000, "h", HudConstructorScreen.W243.INVENTORY, true),
      new HudConstructorScreen.W244("HUD_Potions", "Potions", "Potions", FontRegistry.O000000000000, "t", HudConstructorScreen.W243.POTIONS, true),
      new HudConstructorScreen.W244("HUD_CoolDowns", "Cooldowns", "Cool Downs", FontRegistry.O000000000000, "g", HudConstructorScreen.W243.COOLDOWNS, true),
      new HudConstructorScreen.W244("HUD_Info", "Information", "PlayerInfo", FontRegistry.O000000000000, "e", HudConstructorScreen.W243.INFO, true),
      new HudConstructorScreen.W244("HUD_WaterMark", "Watermark", "Watermark", FontRegistry.O00000000000O, "W", HudConstructorScreen.W243.WATERMARK, true),
      new HudConstructorScreen.W244("HUD_ArrayList", "ArrayList", "ArrayList", FontRegistry.O00000000000O, "n", HudConstructorScreen.W243.ARRAYLIST, false),
      new HudConstructorScreen.W244("HUD_TargetHUD", "TargetHUD", "TargetHud", FontRegistry.O00000000000O, "r", HudConstructorScreen.W243.TARGET, false),
      new HudConstructorScreen.W244("hud_armor", "Armor", "Armor", FontRegistry.O000000000000, "h", HudConstructorScreen.W243.SLOTS, false),
      new HudConstructorScreen.W244("HUD_HotBar", "HotBar", "HotBar", FontRegistry.O000000000000, "h", HudConstructorScreen.W243.HOTBAR, false),
      new HudConstructorScreen.W244(
         "HUD_Notifications", "Notifications", "Notifications", FontRegistry.O00000000000O, "l", HudConstructorScreen.W243.NOTIFICATION, false
      ),
      new HudConstructorScreen.W244("HUD_MusicPlayer", "Media", "MediaPlayer", FontRegistry.O00000000000O, "m", HudConstructorScreen.W243.MEDIA, false),
      new HudConstructorScreen.W244("HUD_ServerHelper", "Server", "Server Helper", FontRegistry.O000000000000, "e", HudConstructorScreen.W243.SERVER, false)
   };
   private static final String[] O00000000OO = new String[]{"HitAura", "AutoTotem", "Speed", "InventoryMove"};
   private static final String[] O00000000OO0 = new String[]{"R", "F", "V", "G"};
   private static final String[] O00000000OO00 = new String[]{"Strength III", "Fire Resistance", "Poison II"};
   private static final String[] O00000000OO000 = new String[]{"1:58", "6:40", "0:12"};
   private static final String[] O00000000OO00O = new String[]{"Ender Pearl", "Golden Apple", "Chorus Fruit"};
   private static final String[] O00000000OO0O = new String[]{"8.4s", "2.1s", "0.7s"};
   private static final String[] O00000000OO0O0 = new String[]{"BPS", "TPS", "XYZ", "PING"};
   private static final String[] O00000000OO0OO = new String[]{"7.42", "20.0", "120 64 -80", "42 ms"};
   private static final String[] O00000000OOO = new String[]{"Module toggled", "Config saved", "Friend joined"};
   private static final String[] O00000000OOO0 = new String[]{"now", "1s", "4s"};
   private static final String[] O00000000OOO00 = new String[]{"wild", "fr1zy", "144 fps", "12:40"};
   private static final String[] O00000000OOO0O = new String[]{"W", "r", "u", "y"};
   private static final String[] O00000000OOOO = new String[]{"HitAura", "AutoTotem", "ElytraFly", "NoSlow"};
   private static final String[] O00000000OOOO0 = new String[]{"Midnight Drive", "2:18 / 3:42", "Volume"};
   private static final String[] O00000000OOOOO = new String[]{"PLAYING", "", "72%"};
   private static final String[] O0000000O = new String[]{"FunTime", "Anarchy-01", "Online"};
   private static final String[] O0000000O0 = new String[]{"EU", "42 ms", "128"};
   private static final String[] O0000000O00 = new String[]{"", "", "", ""};
   private static final String[] O0000000O000 = new String[]{
      "Keys", "Inventory", "Potions", "Cooldowns", "Info", "Watermark", "ArrayList", "Target", "Armor", "HotBar", "Alerts", "Media", "Server"
   };
   private static final String O0000000O0000 = "preview.resize";
   private final HudConstructorScreen.W242[] O0000000O00000 = new HudConstructorScreen.W242[O00000000O0OOO.length];
   private final Map<String, HudConstructorScreen.W242> O0000000O0000O = new HashMap<>();
   private final Map<String, HudConstructorScreen.W242> O0000000O000O = new HashMap<>();
   private final Map<String, HudConstructorScreen.W242> O0000000O000O0 = new HashMap<>();
   private final Map<String, O0000O00O0OO> O0000000O000OO = new HashMap<>();
   private final Map<String, O0000O00O0OO> O0000000O00O = new HashMap<>();
   private final Map<String, O0000O00O0OO> O0000000O00O0 = new HashMap<>();
   private final Map<String, String> O0000000O00O00 = new HashMap<>();
   private final O00000OO000O.W222[] O0000000O00O0O = new O00000OO000O.W222[8];
   private final O0000O00O0OO O0000000O00OO = new O0000O00O0OO();
   private final O0000O00O0OO O0000000O00OO0 = new O0000O00O0OO();
   private final O0000O00O0OO O0000000O00OOO = new O0000O00O0OO();
   private final O0000O00O0OO O0000000O0O = new O0000O00O0OO();
   private final O0000O00O0OO O0000000O0O0 = new O0000O00O0OO();
   private final O0000O00O0OO O0000000O0O00 = new O0000O00O0OO();
   private final O0000O00O0OO O0000000O0O000 = new O0000O00O0OO();
   private final O0000O00O0OO O0000000O0O00O = new O0000O00O0OO();
   private String O0000000O0O0O;
   private float O0000000O0O0O0;
   private float O0000000O0O0OO;
   private float O0000000O0OO;
   private float O0000000O0OO0;
   private float O0000000O0OO00 = 1.0F;
   private float O0000000O0OO0O = 1.0F;
   private float O0000000O0OOO;
   private float O0000000O0OOO0;
   private final float[] O0000000O0OOOO = new float[O00000000O0OOO.length];
   private final float[] O0000000OO = new float[O00000000O0OOO.length];
   private boolean O0000000OO0;
   private boolean O0000000OO00;
   private boolean O0000000OO000;
   private boolean O0000000OO0000;
   private float O0000000OO000O;
   private float O0000000OO00O;
   private float O0000000OO00O0;
   private float O0000000OO00OO;
   private float O0000000OO0O;
   private float O0000000OO0O0;
   private float O0000000OO0O00;
   private float O0000000OO0O0O;
   private float O0000000OO0OO;
   private float O0000000OO0OO0;
   private float O0000000OO0OOO;
   private float O0000000OOO;
   private boolean O0000000OOO0;
   private boolean O0000000OOO00;
   private HudConstructorScreen.W242 O0000000OOO000 = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O0000000OOO00O = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O0000000OOO0O = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O0000000OOO0O0 = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O0000000OOO0OO = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O0000000OOOO = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O0000000OOOO0 = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O0000000OOOO00 = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O0000000OOOO0O = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O0000000OOOOO = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O0000000OOOOO0 = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O0000000OOOOOO = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O000000O0 = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O000000O00 = HudConstructorScreen.W242.O000000000();
   private String O000000O000 = "panel";
   private String O000000O0000;
   private String O000000O00000;
   private int O000000O000000;
   private String O000000O00000O = "";
   private String O000000O0000O = "";
   private String O000000O0000O0 = "";
   private float O000000O0000OO = 1.0F;
   private float O000000O000O;
   private float O000000O000O0;
   private HudConstructorScreen.W242 O000000O000O00 = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O000000O000O0O = HudConstructorScreen.W242.O000000000();
   private HudConstructorScreen.W242 O000000O000OO = HudConstructorScreen.W242.O000000000();
   private static final O0000O000OO O000000O000OO0 = O0000O000OO.O00000000();
   private Theme O000000O000OOO;
   private ColorScheme O000000O00O;

   public HudConstructorScreen() {
      super(Text.literal("HUD Constructor"));
      O00000000();
      this.O0000000O00OO.O0000000000000(0.0);

      for (int var1 = 0; var1 < this.O0000000O00000.length; var1++) {
         this.O0000000O00000[var1] = HudConstructorScreen.W242.O000000000();
      }

      for (int var5 = 0; var5 < this.O0000000O00O0O.length; var5++) {
         this.O0000000O00O0O[var5] = new O00000OO000O.W222();
      }

      for (HudConstructorScreen.W245 var4 : O00000000O0OO0) {
         this.O0000000O0000O.put(var4.id, HudConstructorScreen.W242.O000000000());
      }

      for (String var10 : O00000000O0O0O) {
         this.O0000000O000O.put(var10, HudConstructorScreen.W242.O000000000());
      }

      this.O0000000O000O0.put("close", HudConstructorScreen.W242.O000000000());
      this.O0000000O000O0.put("reset", HudConstructorScreen.W242.O000000000());
      this.O0000000O000O0.put("centerX", HudConstructorScreen.W242.O000000000());
      this.O0000000O000O0.put("centerY", HudConstructorScreen.W242.O000000000());
      this.O0000000O000O0.put("presetSoft", HudConstructorScreen.W242.O000000000());
      this.O0000000O000O0.put("presetCompact", HudConstructorScreen.W242.O000000000());
      this.O0000000O000O0.put("presetSharp", HudConstructorScreen.W242.O000000000());
      this.O0000000000OO();
      this.O0000000000OO0();
      this.O0000000000OOO();
   }

   public boolean shouldPause() {
      return false;
   }

   public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
      this.O00000000000O(this.O00000000((double)mouseX), this.O000000000((double)mouseY));
      super.render(context, mouseX, mouseY, deltaTicks);
   }

   public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
   }

   public void renderInGameBackground(DrawContext context) {
   }

   public void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext, int i, int j) {
      if (!O00000OO0OO00O.O00000000()) {
         if (this.client != null) {
            this.client.setScreen(null);
         }
      } else if (o0000O00OO0O0 != null && i > 0 && j > 0) {
         this.O000000000O();
         this.O0000000O00OO.O00000000();
         this.O0000000O00OO.O00000000(1.0, 0.42F, O0000O00O0OO0O.O0000000000O0O, false);
         this.O0000000O00OO0.O00000000();
         this.O0000000O00OO0
            .O00000000(this.O000000O0000 == null && !this.O0000000OO0 && !this.O0000000OO00 ? 0.0 : 1.0, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
         float var5 = O00000000(this.O0000000O00OO.O000000000000(), 0.0F, 1.0F);
         ColorScheme var6 = this.O0000000000();
         this.O00000000(i, j);
         this.O00000000(o0000O00OO0O0, i, j, var5, var6);
         o0000O00OO0O0.O000000000000(var5);
         float var7 = 0.945F + 0.055F * var5;
         o0000O00OO0O0.O0000000000(var7, var7, i * 0.5F, j * 0.5F);
         o0000O00OO0O0.O00000000(0.0F, (1.0F - var5) * this.O00000000(24.0F));

         try {
            this.O00000000(o0000O00OO0O0, var6);
            this.O000000000(o0000O00OO0O0, var6);
            this.O0000000000(o0000O00OO0O0, var6);
            this.O00000000000(o0000O00OO0O0, var6);
         } finally {
            o0000O00OO0O0.O00000000000O();
            o0000O00OO0O0.O00000000000O0();
            o0000O00OO0O0.O00000000000OO();
         }
      }
   }

   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      this.O00000000000O(this.O00000000(mouseX), this.O000000000(mouseY));
      if (button != 0) {
         return true;
      } else {
         HudConstructorScreen.W242 var6 = this.O0000000O000O0.get("close");
         if (var6 != null && var6.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO)) {
            this.close();
            return true;
         } else {
            if (this.O000000O000O0O.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO)) {
               for (int var7 = 0; var7 < this.O0000000O00000.length; var7++) {
                  if (this.O0000000O00000[var7].O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO)) {
                     this.O000000O000000 = var7;
                     this.O000000O000 = this.O000000000(O00000000O0OOO[var7].kind);
                     this.O0000000O0OOO = 0.0F;
                     this.O0000000O0OOOO[var7] = 0.0F;
                     this.O0000000OO[var7] = 0.0F;
                     this.O0000000000OO0();
                     this.O0000000000OOO();
                     return true;
                  }
               }
            }

            String var12 = this.O0000000000000(this.O0000000O0O0O0, this.O0000000O0O0OO);
            if (var12 != null) {
               this.O00000000(var12);
               return true;
            } else {
               String var8 = this.O000000000000O(this.O0000000O0O0O0, this.O0000000O0O0OO);
               if (var8 != null) {
                  this.O000000O000 = var8;
                  this.O0000000000OOO();
                  return true;
               } else {
                  String var9 = this.O000000000000(this.O0000000O0O0O0, this.O0000000O0O0OO);
                  if (var9 != null) {
                     this.O000000O00000 = var9;
                     this.O000000000(this.O0000000O0O0O0);
                     return true;
                  } else if (this.O000000O0.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO)) {
                     this.O0000000OO00 = true;
                     this.O000000O000 = "panel";
                     this.O0000000OO000O = this.O0000000O0O0O0;
                     this.O0000000OO00O = this.O0000000O0O0OO;
                     this.O0000000OO00O0 = Math.max(1.0F, this.O0000000OOO0O0.O0000000000);
                     this.O0000000OO00OO = Math.max(1.0F, this.O0000000OOO0O0.O00000000000);
                     this.O0000000OO0O = this.O0000000OO00O0 / Math.max(0.001F, this.O0000000O0OO00);
                     this.O0000000OO0O0 = this.O0000000OO00OO / Math.max(0.001F, this.O0000000O0OO0O);
                     this.O0000000OO0O00 = O00000OO000O.O00000000().O00000000(this.O0000000000O0(), this.O0000000OO0O, this.O0000000OO0O0);
                     this.O0000000OO0O0O = Math.max(0.001F, this.O0000000O0OO00);
                     this.O0000000OO0OO = this.O0000000O0OOOO[this.O000000O000000];
                     this.O0000000OO0OO0 = this.O0000000OO[this.O000000O000000];
                     O00000OO000O.W223 var13 = O00000OO000O.O00000000().O000000000000().get(this.O0000000000O0());
                     this.O0000000OO0OOO = var13 == null ? 0.5F : var13.nx();
                     this.O0000000OOO = var13 == null ? 0.5F : var13.ny();
                     this.O0000000O0OO = this.O0000000O0O0O0;
                     this.O0000000O0OO0 = this.O0000000O0O0OO;
                     return true;
                  } else {
                     String var10 = this.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO);
                     if (var10 == null) {
                        return true;
                     } else {
                        boolean var11 = var10.equals(this.O000000O000) && this.O0000000000(var10);
                        this.O000000O000 = var10;
                        this.O0000000000OOO();
                        if (var11) {
                           this.O000000O0000 = var10;
                        } else {
                           this.O0000000OO0 = true;
                        }

                        this.O0000000O0OO = this.O0000000O0O0O0;
                        this.O0000000O0OO0 = this.O0000000O0O0OO;
                        return true;
                     }
                  }
               }
            }
         }
      }
   }

   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      this.O00000000000O(this.O00000000(mouseX), this.O000000000(mouseY));
      this.O000000O0000 = null;
      this.O0000000OO0 = false;
      this.O0000000OO00 = false;
      this.O0000000OO000 = false;
      this.O0000000OO0000 = false;
      this.O000000O00000 = null;
      this.O0000000000O00();
      return true;
   }

   public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      this.O00000000000O(this.O00000000(mouseX), this.O000000000(mouseY));
      O00000OO0OO0O.W239 var10 = this.O00000000000O0();
      if (this.O000000O00000 != null) {
         this.O000000000(this.O0000000O0O0O0);
         return true;
      } else if (this.O0000000OO00) {
         this.O0000000000(this.O0000000O0O0O0, this.O0000000O0O0OO);
         return true;
      } else if (this.O0000000OO0) {
         this.O000000000(this.O0000000O0O0O0 - this.O0000000O0OO, this.O0000000O0O0OO - this.O0000000O0OO0);
         this.O0000000O0OO = this.O0000000O0O0O0;
         this.O0000000O0OO0 = this.O0000000O0O0OO;
         return true;
      } else if (this.O000000O0000 != null) {
         float var11 = (this.O0000000O0O0O0 - this.O0000000O0OO) / Math.max(0.001F, this.O0000000O0OO00);
         float var12 = (this.O0000000O0O0OO - this.O0000000O0OO0) / Math.max(0.001F, this.O0000000O0OO0O);
         if ("title".equals(this.O000000O0000)) {
            var10.O0000000000OO0.O00000000 += var11;
            var10.O0000000000OO0.O000000000 += var12;
         } else if ("icon".equals(this.O000000O0000)) {
            var10.O0000000000OOO.O00000000 += var11;
         } else if ("modules".equals(this.O000000O0000)) {
            var10.O000000000O.O00000000 += var11;
            var10.O000000000O.O000000000 += var12;
         } else if ("binds".equals(this.O000000O0000)) {
            var10.O000000000O0.O00000000 += var11;
            var10.O000000000O0.O000000000 += var12;
         }

         var10.O000000000();
         this.O0000000OOO0 = true;
         this.O0000000000OOO();
         this.O0000000O0OO = this.O0000000O0O0O0;
         this.O0000000O0OO0 = this.O0000000O0O0OO;
         return true;
      } else {
         return true;
      }
   }

   public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      this.O00000000000O(this.O00000000(mouseX), this.O000000000(mouseY));
      if (this.O000000O000O00.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO) && this.O000000O000O0 > 0.0F) {
         this.O000000O000O = O00000000(this.O000000O000O - (float)verticalAmount * this.O00000000(28.0F), 0.0F, this.O000000O000O0);
         return true;
      } else if (this.O0000000OOOOO.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO) && this.O0000000O0OOO0 > 0.0F) {
         this.O0000000O0OOO = O00000000(this.O0000000O0OOO - (float)verticalAmount * this.O00000000(28.0F), 0.0F, this.O0000000O0OOO0);
         return true;
      } else {
         return true;
      }
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 256) {
         this.close();
         return true;
      } else if (keyCode == 82) {
         this.O0000000000000();
         return true;
      } else if (keyCode == 67) {
         this.O00000000(true, false);
         this.O0000000000O00();
         return true;
      } else {
         return super.keyPressed(keyCode, scanCode, modifiers);
      }
   }

   public void close() {
      this.O0000000000O00();
      super.close();
   }

   public void removed() {
      this.O0000000000O00();
      super.removed();
   }

   private static void O00000000() {
      if (!O00000000) {
         O00000000 = true;
         EventManager.O00000000(new Object() {
            @EventHandler(
               O00000000 = 4
            )
            public void O00000000(O0000000O00O o0000000O00O) {
               if (o0000000O00O.O0000000000() != null && o0000000O00O.O0000000000().currentScreen instanceof HudConstructorScreen var2) {
                  var2.O00000000(o0000000O00O.O00000000000(), o0000000O00O.O00000000000O(), o0000000O00O.O0000000000000(), o0000000O00O.O000000000000O());
                  if (o0000000O00O.O00000000000() != null) {
                     o0000000O00O.O00000000000().O0000000000();
                  }
               }
            }
         });
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, int i, int j, float f, ColorScheme o0000O000O0OO) {
      int var6 = o0000O000O0OO.O000000000O000() ? O00000000(12, 14, 20, Math.round(48.0F * f)) : O00000000(0, 0, 0, Math.round(96.0F * f));
      o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, 0.0F, var6);
      o0000O00OO0O0.O00000000(
         0.0F,
         0.0F,
         (float)i,
         (float)j,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(14.0F * f)),
         O00000000(0, 0, 0, Math.round(26.0F * f)),
         O00000000(0, 0, 0, Math.round(44.0F * f)),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.round(16.0F * f))
      );
      float var7 = this.O0000000O00OO0.O000000000000() * f;
      if (var7 > 0.01F) {
         int var8 = this.O000000000();
         O00000OO000O.O00000000().O00000000(i, j, this.O0000000O00O0O, var8, this.O000000O0000, this.O0000000O0O0O0, this.O0000000O0O0OO, var7);
      }
   }

   private int O000000000() {
      int var1 = 0;
      var1 = this.O00000000(var1, "panel", this.O0000000OOO0O0, "panel".equals(this.O000000O000) ? 0.78F : 0.24F);
      var1 = this.O00000000(var1, "header", this.O0000000OOO0OO, "header".equals(this.O000000O000) ? 0.72F : 0.22F);
      var1 = this.O00000000(var1, "modules", this.O0000000OOOO0, "modules".equals(this.O000000O000) ? 0.92F : 0.34F);
      var1 = this.O00000000(var1, "binds", this.O0000000OOOO00, "binds".equals(this.O000000O000) ? 0.92F : 0.34F);
      var1 = this.O00000000(var1, "title", this.O0000000OOO00O, "title".equals(this.O000000O000) ? 0.62F : 0.18F);
      var1 = this.O00000000(var1, "icon", this.O0000000OOO0O, "icon".equals(this.O000000O000) ? 0.72F : 0.2F);
      return this.O00000000(var1, "slots", this.O0000000OOOO0O, "slots".equals(this.O000000O000) ? 0.84F : 0.24F);
   }

   private int O00000000(int i, String string, HudConstructorScreen.W242 o00000000, float f) {
      if (i < this.O0000000O00O0O.length && o00000000 != null && !(o00000000.O0000000000 <= 1.0F) && !(o00000000.O00000000000 <= 1.0F)) {
         float var5 = (float)Math.sqrt(o00000000.O0000000000 * o00000000.O0000000000 + o00000000.O00000000000 * o00000000.O00000000000) * 0.52F;
         this.O0000000O00O0O[i]
            .O00000000(
               string,
               o00000000.O00000000 + o00000000.O0000000000 * 0.5F,
               o00000000.O000000000 + o00000000.O00000000000 * 0.5F,
               Math.max(24.0F, var5),
               f,
               o00000000.O0000000000,
               o00000000.O00000000000
            );
         return i + 1;
      } else {
         return i;
      }
   }

   private void O00000000(int i, int j) {
      this.O000000O0000OO = O00000000(j / 760.0F, 0.82F, 3.0F);
      float var3 = Math.max(this.O00000000(28.0F), i * 0.05F);
      float var4 = Math.max(this.O00000000(24.0F), j * 0.06F);
      float var5 = Math.max(this.O00000000(320.0F), i - var3 * 2.0F);
      float var6 = Math.max(this.O00000000(240.0F), j - var4 * 2.0F);
      float var7 = O00000000(i * 0.76F, Math.min(this.O00000000(560.0F), var5), var5);
      float var8 = O00000000(j * 0.78F, Math.min(this.O00000000(380.0F), var6), var6);
      float var9 = var7 / Math.max(1.0F, var8);
      if (var9 > 2.05F) {
         var7 = var8 * 2.05F;
      } else if (var9 < 1.34F) {
         var8 = var7 / 1.34F;
      }

      float var10 = (i - var7) * 0.5F;
      float var11 = (j - var8) * 0.5F;
      this.O0000000OOO000.O00000000(Math.round(var10), Math.round(var11), Math.round(var7), Math.round(var8));
      var10 = this.O0000000OOO000.O00000000;
      var11 = this.O0000000OOO000.O000000000;
      var7 = this.O0000000OOO000.O0000000000;
      var8 = this.O0000000OOO000.O00000000000;
      float var12 = this.O00000000(14.0F);
      float var13 = var11 + this.O00000000(52.0F);
      float var14 = var11 + var8 - var12;
      float var15 = Math.max(this.O00000000(120.0F), var14 - var13);
      float var16 = this.O00000000(12.0F);
      float var17 = var10 + var12;
      float var18 = var7 - var12 * 2.0F;
      float var19 = this.O00000000(150.0F);
      float var20 = this.O00000000(300.0F);
      float var21 = O00000000(var18 * 0.22F, Math.min(var19, var18 * 0.3F), var20);
      float var22 = O00000000(var18 * 0.26F, Math.min(var19, var18 * 0.3F), var20);
      float var23 = var18 - var21 - var22 - var16 * 2.0F;
      float var24 = var18 * 0.34F;
      if (var23 < var24 && var21 + var22 > 0.0F) {
         float var25 = var24 - var23;
         float var26 = var21 + var22;
         var21 -= var25 * (var21 / var26);
         var22 -= var25 * (var22 / var26);
         var23 = var18 - var21 - var22 - var16 * 2.0F;
      }

      this.O000000O000O00.O00000000(Math.round(var17), Math.round(var13), Math.round(var21), Math.round(var15));
      this.O000000O000OO.O00000000(Math.round(var17 + var21 + var16), Math.round(var13), Math.round(Math.max(this.O00000000(80.0F), var23)), Math.round(var15));
      this.O0000000OOOOO
         .O00000000(Math.round(var17 + var21 + var16 + this.O000000O000OO.O0000000000 + var16), Math.round(var13), Math.round(var22), Math.round(var15));
   }

   private void O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO) {
      float var3 = this.O0000000OOO000.O00000000;
      float var4 = this.O0000000OOO000.O000000000;
      float var5 = this.O0000000OOO000.O0000000000;
      float var6 = this.O0000000OOO000.O00000000000;
      float var7 = this.O00000000(18.0F);
      o0000O00OO0O0.O00000000(
         var3, var4, var5, var6, var7, this.O00000000(30.0F), this.O00000000(8.0F), O00000000(0, 0, 0, o0000O000O0OO.O000000000O000() ? 34 : 150)
      );
      o0000O00OO0O0.O00000000(
         var3, var4, var5, var6, var7, this.O00000000(6.0F), this.O00000000(5.0F), O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 14 : 24)
      );
      o0000O00OO0O0.O00000000(30.0F);
      o0000O00OO0O0.O00000000(var3, var4, var5, var6, var7, o0000O000O0OO.O000000000O000() ? 0.96F : 0.92F);
      o0000O00OO0O0.O00000000(var3, var4, var5, var6, var7, o0000O000O0OO.O0000000000000());
      o0000O00OO0O0.O00000000(var3, var4, var5, var6, var7, o0000O000O0OO.O0000000000O00(), Math.max(1.0F, this.O00000000(1.0F)));
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000,
         var3 + this.O00000000(24.0F),
         O00000000000OO(var4 + this.O00000000(30.0F), this.O00000000(21.0F)),
         this.O00000000(21.0F),
         "HUD Constructor",
         o0000O000O0OO.O000000000O()
      );
      float var8 = Math.round(this.O00000000(30.0F));
      HudConstructorScreen.W242 var9 = this.O0000000O000O0.get("close");
      var9.O00000000(Math.round(var3 + var5 - var8 - this.O00000000(16.0F)), Math.round(var4 + this.O00000000(30.0F) - var8 * 0.5F), var8, var8);
      float var10 = this.O000000000("close", var9.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO) ? 1.0F : 0.0F);
      float var11 = var9.O00000000 + var9.O0000000000 * 0.5F;
      float var12 = var9.O000000000 + var9.O00000000000 * 0.5F;
      o0000O00OO0O0.O00000000(
         var9.O00000000,
         var9.O000000000,
         var9.O0000000000,
         var9.O00000000000,
         this.O00000000(9.0F),
         ColorScheme.O00000000(
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O000() ? 14 : 10),
            ColorScheme.O00000000(o0000O000O0OO.O000000000(), 46),
            var10
         )
      );
      o0000O00OO0O0.O00000000(
         var9.O00000000,
         var9.O000000000,
         var9.O0000000000,
         var9.O00000000000,
         this.O00000000(9.0F),
         ColorScheme.O00000000(o0000O000O0OO.O0000000000O00(), ColorScheme.O00000000(o0000O000O0OO.O000000000(), 90), var10),
         1.0F
      );
      this.O00000000(
         o0000O00OO0O0,
         var11,
         var12,
         this.O00000000(5.0F),
         Math.max(1.5F, this.O00000000(2.0F)),
         ColorScheme.O00000000(O00000000(o0000O000O0OO), o0000O000O0OO.O000000000(), var10 * 0.85F)
      );
   }

   private float O00000000(float f) {
      return f * this.O000000O0000OO;
   }

   private ColorScheme O0000000000() {
      Theme var1 = null;

      try {
         if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null) {
            var1 = WildClient.O00000000.O0000000000O.O000000000();
         }
      } catch (Throwable var3) {
      }

      if (var1 == null) {
         var1 = Theme.WILD;
      }

      if (var1 != this.O000000O000OOO || this.O000000O00O == null) {
         this.O000000O000OOO = var1;
         this.O000000O00O = ColorScheme.O00000000(var1, O000000O000OO0.O0000000000(var1));
      }

      return this.O000000O00O;
   }

   private void O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      float var7 = Math.round(f);
      float var8 = Math.round(g);
      float var9 = Math.round(h);
      float var10 = Math.round(i);
      float var11 = this.O00000000(14.0F);
      int var12 = ColorScheme.O00000000(
         ColorScheme.O00000000(o0000O000O0OO.O000000000000O(), O00000000(0, 0, 0, 255), o0000O000O0OO.O000000000O000() ? 0.02F : 0.05F),
         o0000O000O0OO.O000000000O000() ? 182 : 186
      );
      o0000O00OO0O0.O00000000(
         var7, var8, var9, var10, var11, this.O00000000(16.0F), this.O00000000(2.0F), O00000000(0, 0, 0, o0000O000O0OO.O000000000O000() ? 22 : 82)
      );
      o0000O00OO0O0.O00000000(26.0F);
      o0000O00OO0O0.O00000000(var7, var8, var9, var10, var11, o0000O000O0OO.O000000000O000() ? 0.74F : 0.86F);
      o0000O00OO0O0.O00000000(var7, var8, var9, var10, var11, var12);
      o0000O00OO0O0.O00000000(var7, var8, var9, var10, var11, o0000O000O0OO.O0000000000O0(), Math.max(1.0F, this.O00000000(1.0F)));
   }

   private void O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, float f, float g, float h) {
      o0000O00OO0O0.O00000000(
         (float)Math.round(f), (float)Math.round(g), (float)Math.round(h), Math.max(1.0F, this.O00000000(1.0F)), 0.0F, o0000O000O0OO.O0000000000O0()
      );
   }

   private void O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j, float k) {
      if (!(j <= 0.0F) && !(h <= 0.0F)) {
         float var9 = O00000000(0.1F + 0.9F * k, 0.0F, 1.0F);
         float var10 = Math.max(this.O00000000(30.0F), h * (h / (h + j)));
         float var11 = g + (h - var10) * (i / Math.max(1.0F, j));
         float var12 = Math.max(1.0F, (float)Math.round(this.O00000000(2.5F)));
         float var13 = var12 * 0.5F;
         o0000O00OO0O0.O00000000(
            (float)Math.round(f),
            (float)Math.round(g),
            var12,
            (float)Math.round(h),
            var13,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), Math.round((o0000O000O0OO.O000000000O000() ? 16.0F : 10.0F) * var9))
         );
         o0000O00OO0O0.O00000000(
            (float)Math.round(f),
            (float)Math.round(var11),
            var12,
            (float)Math.round(var10),
            var13,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round((o0000O000O0OO.O000000000O000() ? 120.0F : 110.0F) * var9))
         );
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, boolean bl, boolean bl2, float f, float g) {
      String var7 = bl2 ? (bl ? "LIVE" : "OFF") : "PREVIEW";
      int var8 = bl2
         ? (bl ? o0000O000O0OO.O00000000() : ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O000() ? 120 : 110))
         : o0000O000O0OO.O0000000000();
      boolean var9 = bl2 && bl;
      float var10 = var9 ? O00000000000O0(1900.0F, 0.0F) : 0.0F;
      float var11 = this.O00000000(12.0F);
      float var12 = TextMeasureCache.O000000000(FontRegistry.O00000000000, var7, var11);
      float var13 = Math.max(1.0F, (float)Math.round(this.O00000000(6.0F)));
      float var14 = Math.round(f - var12);
      float var15 = Math.round(var14 - this.O00000000(8.0F) - var13);
      float var16 = Math.round(g - var13 * 0.5F);
      if (var9 && var10 > 0.0F) {
         o0000O00OO0O0.O00000000(
            var15,
            var16,
            var13,
            var13,
            var13 * 0.5F,
            this.O00000000(5.0F),
            this.O00000000(0.5F),
            ColorScheme.O00000000(var8, Math.round(35.0F + var10 * 120.0F))
         );
      }

      o0000O00OO0O0.O00000000(var15, var16, var13, var13, var13 * 0.5F, ColorScheme.O00000000(var8, var9 ? Math.round(170.0F + var10 * 85.0F) : 220));
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000, var14, Math.round(O00000000000OO(g, var11)), var11, var7, ColorScheme.O00000000(var8, var9 ? 235 : 210)
      );
   }

   private String[] O00000000(HudConstructorScreen.W243 o000000000) {
      return switch (o000000000) {
         case INVENTORY -> O00000000O00O;
         default -> O00000000O000O;
         case INFO, MEDIA, SERVER -> O00000000O0O00;
         case WATERMARK -> O00000000O0O0;
         case ARRAYLIST -> O00000000O00OO;
         case TARGET -> O00000000O0O;
         case SLOTS, HOTBAR -> O00000000O00O0;
      };
   }

   private String O000000000(HudConstructorScreen.W243 o000000000) {
      String[] var2 = this.O00000000(o000000000);

      for (String var6 : var2) {
         if ("panel".equals(var6)) {
            return var6;
         }
      }

      return var2[0];
   }

   private static boolean O00000000(String[] strings, String string) {
      for (String var5 : strings) {
         if (var5.equals(string)) {
            return true;
         }
      }

      return false;
   }

   private boolean O00000000(HudConstructorScreen.W244 o0000000000, String string) {
      HudConstructorScreen.W243 var3 = o0000000000.kind;
      if (var3 != HudConstructorScreen.W243.KEYBINDS || !"contentRadius".equals(string) && !"rowRadius".equals(string) && !"slotRadius".equals(string)) {
         return switch (string) {
            case "panelRadius", "padding", "gap" -> true;
            case "slotRadius" -> var3 == HudConstructorScreen.W243.INVENTORY
               || var3 == HudConstructorScreen.W243.HOTBAR
               || var3 == HudConstructorScreen.W243.SLOTS
               || var3 == HudConstructorScreen.W243.TARGET;
            case "rowRadius" -> var3 == HudConstructorScreen.W243.ARRAYLIST
               || var3 == HudConstructorScreen.W243.TARGET
               || var3 == HudConstructorScreen.W243.NOTIFICATION;
            case "contentRadius" -> var3 != HudConstructorScreen.W243.KEYBINDS && var3 != HudConstructorScreen.W243.WATERMARK;
            case "modulesRadius" -> var3 != HudConstructorScreen.W243.HOTBAR && var3 != HudConstructorScreen.W243.SLOTS;
            case "bindsRadius" -> var3 == HudConstructorScreen.W243.KEYBINDS
               || var3 == HudConstructorScreen.W243.POTIONS
               || var3 == HudConstructorScreen.W243.COOLDOWNS
               || var3 == HudConstructorScreen.W243.TARGET
               || var3 == HudConstructorScreen.W243.WATERMARK;
            case "bindWidth" -> var3 == HudConstructorScreen.W243.KEYBINDS
               || var3 == HudConstructorScreen.W243.POTIONS
               || var3 == HudConstructorScreen.W243.COOLDOWNS
               || var3 == HudConstructorScreen.W243.TARGET;
            case "accentWidth" -> var3 == HudConstructorScreen.W243.KEYBINDS
               || var3 == HudConstructorScreen.W243.POTIONS
               || var3 == HudConstructorScreen.W243.COOLDOWNS
               || var3 == HudConstructorScreen.W243.INFO;
            case "headerRadius", "headerHeight" -> var3 != HudConstructorScreen.W243.HOTBAR
               && var3 != HudConstructorScreen.W243.SLOTS
               && var3 != HudConstructorScreen.W243.WATERMARK
               && var3 != HudConstructorScreen.W243.ARRAYLIST;
            case "rowHeight" -> var3 != HudConstructorScreen.W243.HOTBAR
               && var3 != HudConstructorScreen.W243.SLOTS
               && var3 != HudConstructorScreen.W243.INVENTORY;
            case "titleSize", "iconSize" -> var3 != HudConstructorScreen.W243.ARRAYLIST
               && var3 != HudConstructorScreen.W243.HOTBAR
               && var3 != HudConstructorScreen.W243.SLOTS;
            default -> true;
         };
      } else {
         return false;
      }
   }

   private void O000000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO) {
      float var3 = this.O000000O000O00.O00000000;
      float var4 = this.O000000O000O00.O000000000;
      float var5 = this.O000000O000O00.O0000000000;
      float var6 = this.O000000O000O00.O00000000000;
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, var3, var4, var5, var6);
      float var7 = Math.round(this.O00000000(42.0F));
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000,
         var3 + this.O00000000(16.0F),
         O00000000000OO(var4 + this.O00000000(21.0F), this.O00000000(16.0F)),
         this.O00000000(16.0F),
         "Elements",
         O00000000(o0000O000O0OO)
      );
      String var8 = Integer.toString(O00000000O0OOO.length);
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         var3 + var5 - this.O00000000(16.0F) - TextMeasureCache.O000000000(FontRegistry.O00000000, var8, this.O00000000(13.0F)),
         O00000000000OO(var4 + this.O00000000(21.0F), this.O00000000(13.0F)),
         this.O00000000(13.0F),
         var8,
         O000000000(o0000O000O0OO)
      );
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, var3 + this.O00000000(14.0F), var4 + var7, var5 - this.O00000000(28.0F));
      float var9 = Math.round(var4 + var7 + this.O00000000(8.0F));
      float var10 = Math.round(Math.max(this.O00000000(40.0F), var4 + var6 - var9 - this.O00000000(8.0F)));
      this.O000000O000O0O.O00000000(Math.round(var3 + this.O00000000(4.0F)), var9, Math.round(var5 - this.O00000000(8.0F)), var10);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(
         this.O000000O000O0O.O00000000,
         this.O000000O000O0O.O000000000,
         this.O000000O000O0O.O0000000000,
         this.O000000O000O0O.O00000000000,
         this.O00000000(8.0F),
         this.O00000000(8.0F),
         this.O00000000(8.0F),
         this.O00000000(8.0F)
      );

      try {
         float var11 = Math.round(this.O00000000(38.0F));
         float var12 = Math.round(this.O00000000(4.0F));
         float var13 = Math.round(var3 + this.O00000000(10.0F));
         float var14 = Math.round(var5 - this.O00000000(20.0F));
         float var15 = Math.round(this.O00000000(26.0F));
         float var16 = var9 - this.O000000O000O;

         for (int var17 = 0; var17 < O00000000O0OOO.length; var17++) {
            HudConstructorScreen.W244 var18 = O00000000O0OOO[var17];
            HudConstructorScreen.W242 var19 = this.O0000000O00000[var17];
            float var20 = Math.round(var16);
            var19.O00000000(var13, var20, var14, var11);
            boolean var21 = var17 == this.O000000O000000;
            boolean var22 = this.O00000000(var18);
            boolean var23 = var20 + var11 >= var9 && var20 <= var9 + var10;
            if (var23) {
               float var24 = this.O000000000(var18.id, !var19.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO) && !var21 ? 0.0F : 1.0F);
               if (var21) {
                  o0000O00OO0O0.O00000000(var13, var20, var14, var11, this.O00000000(10.0F), O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 30 : 24));
                  o0000O00OO0O0.O00000000(
                     var13, var20, var14, var11, this.O00000000(10.0F), O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 66 : 50), 1.0F
                  );
                  float var25 = var11 - this.O00000000(16.0F);
                  float var26 = var20 + (var11 - var25) * 0.5F;
                  o0000O00OO0O0.O00000000(
                     (float)Math.round(var13 + this.O00000000(4.0F)),
                     (float)Math.round(var26),
                     (float)Math.round(this.O00000000(3.0F)),
                     (float)Math.round(var25),
                     this.O00000000(1.5F),
                     o0000O000O0OO.O000000000O0()
                  );
               } else if (var24 > 0.01F) {
                  o0000O00OO0O0.O00000000(
                     var13,
                     var20,
                     var14,
                     var11,
                     this.O00000000(10.0F),
                     ColorScheme.O00000000(o0000O000O0OO.O000000000O(), Math.round(var24 * (o0000O000O0OO.O000000000O000() ? 13 : 10)))
                  );
               }

               boolean var42 = !var22;
               if (var42) {
                  o0000O00OO0O0.O000000000000(o0000O000O0OO.O000000000O000() ? 0.5F : 0.4F);
               }

               int var43 = var21 ? o0000O000O0OO.O00000000000() : ColorScheme.O00000000(O000000000(o0000O000O0OO), o0000O000O0OO.O000000000O(), var24 * 0.5F);
               int var27 = var21 ? o0000O000O0OO.O000000000O() : ColorScheme.O00000000(O00000000(o0000O000O0OO), o0000O000O0OO.O000000000O(), var24 * 0.4F);
               float var28 = Math.round(var13 + this.O00000000(11.0F));
               float var29 = Math.round(var20 + (var11 - var15) * 0.5F);
               o0000O00OO0O0.O00000000(
                  var28,
                  var29,
                  var15,
                  var15,
                  this.O00000000(8.0F),
                  var21 ? O00000000(o0000O000O0OO, 40) : ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O000() ? 14 : 12)
               );
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O00000000(var28, var29, var15, var15, this.O00000000(8.0F), this.O00000000(8.0F), this.O00000000(8.0F), this.O00000000(8.0F));

               try {
                  this.O00000000(o0000O00OO0O0, var18.iconFont, var18.icon, var28, var29, var15, this.O00000000(18.0F), var43);
               } finally {
                  o0000O00OO0O0.O0000000000();
                  o0000O00OO0O0.O0000000000000();
               }

               float var30 = this.O00000000(16.0F);
               float var31 = Math.round(var28 + var15 + this.O00000000(12.0F));
               float var32 = var13 + var14 - this.O00000000(14.0F) - var31;
               String var33 = TextMeasureCache.O000000000(FontRegistry.O00000000, var18.label, var30) <= var32 ? var18.label : O0000000O000[var17];
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var31, Math.round(O00000000000OO(var20 + var11 * 0.5F, var30)), var30, var33, var27);
               if (var42) {
                  o0000O00OO0O0.O00000000000OO();
               }
            }

            var16 += var11 + var12;
         }

         float var41 = O00000000O0OOO.length * var11 + Math.max(0, O00000000O0OOO.length - 1) * var12;
         this.O000000O000O0 = Math.max(0.0F, var41 - var10);
         this.O000000O000O = O00000000(this.O000000O000O, 0.0F, this.O000000O000O0);
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }

      this.O0000000O0O000.O00000000();
      this.O0000000O0O000
         .O00000000(this.O000000O000O00.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO) ? 1.0 : 0.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
      this.O00000000(
         o0000O00OO0O0,
         o0000O000O0OO,
         var3 + var5 - this.O00000000(7.0F),
         var9,
         var10,
         this.O000000O000O,
         this.O000000O000O0,
         this.O0000000O0O000.O000000000000()
      );
   }

   private void O0000000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO) {
      float var3 = this.O000000O000OO.O00000000;
      float var4 = this.O000000O000OO.O000000000;
      float var5 = this.O000000O000OO.O0000000000;
      float var6 = this.O000000O000OO.O00000000000;
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, var3, var4, var5, var6);
      float var7 = Math.round(this.O00000000(42.0F));
      HudConstructorScreen.W244 var8 = this.O0000000000O();
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000,
         var3 + this.O00000000(16.0F),
         O00000000000OO(var4 + this.O00000000(21.0F), this.O00000000(16.0F)),
         this.O00000000(16.0F),
         var8.label,
         o0000O000O0OO.O000000000O()
      );
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, this.O00000000(var8), var8.layoutBacked, var3 + var5 - this.O00000000(16.0F), var4 + this.O00000000(21.0F));
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, var3 + this.O00000000(14.0F), var4 + var7, var5 - this.O00000000(28.0F));
      float var9 = this.O00000000(14.0F);
      float var10 = var3 + var9;
      float var11 = var4 + var7 + this.O00000000(8.0F);
      float var12 = Math.max(this.O00000000(60.0F), var5 - var9 * 2.0F);
      float var13 = Math.max(this.O00000000(60.0F), var4 + var6 - var11 - var9);
      this.O0000000OOOOOO.O00000000(Math.round(var10), Math.round(var11), Math.round(var12), Math.round(var13));
      o0000O00OO0O0.O00000000(
         this.O0000000OOOOOO.O00000000,
         this.O0000000OOOOOO.O000000000,
         this.O0000000OOOOOO.O0000000000,
         this.O0000000OOOOOO.O00000000000,
         this.O00000000(10.0F),
         this.O00000000(10.0F),
         this.O00000000(1.0F),
         O00000000(0, 0, 0, o0000O000O0OO.O000000000O000() ? 30 : 105)
      );
      o0000O00OO0O0.O00000000(
         this.O0000000OOOOOO.O00000000,
         this.O0000000OOOOOO.O000000000,
         this.O0000000OOOOOO.O0000000000,
         this.O0000000OOOOOO.O00000000000,
         this.O00000000(10.0F),
         o0000O000O0OO.O000000000O000() ? ColorScheme.O00000000(o0000O000O0OO.O000000000000O(), 170) : O00000000(2, 6, 12, 126)
      );
      o0000O00OO0O0.O00000000(
         this.O0000000OOOOOO.O00000000,
         this.O0000000OOOOOO.O000000000,
         this.O0000000OOOOOO.O0000000000,
         this.O0000000OOOOOO.O00000000000,
         this.O00000000(10.0F),
         o0000O000O0OO.O0000000000O00(),
         Math.max(1.0F, this.O00000000(1.0F))
      );
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(
         this.O0000000OOOOOO.O00000000,
         this.O0000000OOOOOO.O000000000,
         this.O0000000OOOOOO.O0000000000,
         this.O0000000OOOOOO.O00000000000,
         this.O00000000(10.0F),
         this.O00000000(10.0F),
         this.O00000000(10.0F),
         this.O00000000(10.0F)
      );

      try {
         this.O00000000(
            o0000O00OO0O0,
            this.O0000000OOOOOO.O00000000,
            this.O0000000OOOOOO.O000000000,
            this.O0000000OOOOOO.O0000000000,
            this.O0000000OOOOOO.O00000000000,
            o0000O000O0OO
         );
         this.O00000000000();
         this.O00000000(
            o0000O00OO0O0, this.O0000000OOOOOO.O00000000, this.O0000000OOOOOO.O000000000, this.O0000000OOOOOO.O0000000000, this.O0000000OOOOOO.O00000000000
         );
         this.O000000000000(o0000O00OO0O0, o0000O000O0OO);
         this.O0000000000000(o0000O00OO0O0, o0000O000O0OO);
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000,
            this.O0000000OOOOOO.O00000000 + this.O00000000(14.0F),
            this.O0000000OOOOOO.O000000000 + this.O0000000OOOOOO.O00000000000 - this.O00000000(14.0F),
            this.O00000000(12.0F),
            "drag surface  ·  resize corner",
            O000000000(o0000O000O0OO)
         );
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      switch (this.O0000000000O().kind) {
         case INVENTORY:
            this.O000000000(o0000O00OO0O0, f, g, h, i);
            break;
         case POTIONS:
            this.O00000000(
               o0000O00OO0O0, f, g, h, i, "Potions", this.O0000000000O().iconFont, this.O0000000000O().icon, O00000000OO00, O00000000OO000, 24.0F, true
            );
            break;
         case COOLDOWNS:
            this.O00000000(
               o0000O00OO0O0, f, g, h, i, "Cooldowns", this.O0000000000O().iconFont, this.O0000000000O().icon, O00000000OO00O, O00000000OO0O, 24.0F, true
            );
            break;
         case INFO:
            this.O00000000(
               o0000O00OO0O0,
               f,
               g,
               h,
               i,
               this.O0000000000O().label,
               this.O0000000000O().iconFont,
               this.O0000000000O().icon,
               O00000000OO0O0,
               O00000000OO0OO,
               24.0F,
               true
            );
            break;
         case WATERMARK:
            this.O00000000000(o0000O00OO0O0, f, g, h, i);
            break;
         case ARRAYLIST:
            this.O000000000000(o0000O00OO0O0, f, g, h, i);
            break;
         case TARGET:
            this.O0000000000000(o0000O00OO0O0, f, g, h, i);
            break;
         case SLOTS:
         case HOTBAR:
            this.O0000000000(o0000O00OO0O0, f, g, h, i);
            break;
         case NOTIFICATION:
            this.O00000000(
               o0000O00OO0O0, f, g, h, i, "Notifications", this.O0000000000O().iconFont, this.O0000000000O().icon, O00000000OOO, O00000000OOO0, 22.0F, true
            );
            break;
         case MEDIA:
            this.O00000000(
               o0000O00OO0O0, f, g, h, i, "Now Playing", this.O0000000000O().iconFont, this.O0000000000O().icon, O00000000OOOO0, O00000000OOOOO, 22.0F, true
            );
            break;
         case SERVER:
            this.O00000000(
               o0000O00OO0O0, f, g, h, i, "Server Helper", this.O0000000000O().iconFont, this.O0000000000O().icon, O0000000O, O0000000O0, 22.0F, true
            );
            break;
         default:
            this.O00000000(o0000O00OO0O0, f, g, h, i, "Binds", FontRegistry.O00000000000O, "q", O00000000OO, O00000000OO0, 22.0F, true);
      }
   }

   private void O00000000000() {
      this.O0000000OOO00O.O00000000();
      this.O0000000OOO0O.O00000000();
      this.O0000000OOO0O0.O00000000();
      this.O0000000OOO0OO.O00000000();
      this.O0000000OOOO.O00000000();
      this.O0000000OOOO0.O00000000();
      this.O0000000OOOO00.O00000000();
      this.O0000000OOOO0O.O00000000();
      this.O000000O0.O00000000();
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, ColorScheme o0000O000O0OO) {
      int var7 = O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 18 : 14);
      float var8 = Math.max(this.O00000000(20.0F), (float)Math.round(this.O00000000(26.0F)));
      float var9 = Math.max(1.0F, (float)Math.round(this.O00000000(1.5F)));

      for (float var10 = Math.round(f + var8 * 0.5F); var10 < f + h; var10 += var8) {
         for (float var11 = Math.round(g + var8 * 0.5F); var11 < g + i; var11 += var8) {
            o0000O00OO0O0.O00000000((float)Math.round(var10), (float)Math.round(var11), var9, var9, var9 * 0.5F, var7);
         }
      }

      int var12 = O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 30 : 22);
      o0000O00OO0O0.O00000000((float)Math.round(f + h * 0.5F), (float)Math.round(g), 1.0F, (float)Math.round(i), 0.0F, var12);
      o0000O00OO0O0.O00000000((float)Math.round(f), (float)Math.round(g + i * 0.5F), (float)Math.round(h), 1.0F, 0.0F, var12);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      float f,
      float g,
      float h,
      float i,
      String string,
      FontObject o0000O0O00O00O,
      String string2,
      String[] strings,
      String[] strings2,
      float j,
      boolean bl
   ) {
      O00000OO0OO0O.W239 var13 = this.O00000000000O0();
      var13.O000000000();
      HudElement var14 = this.O00000000000OO();
      boolean var15 = this.O0000000000O().kind != HudConstructorScreen.W243.ARRAYLIST;
      float var16 = this.O00000000(string, o0000O0O00O00O, string2, strings, strings2, j, bl, var13);
      float var17 = var13.O00000000000O
         + (var15 ? Math.max(0.0F, var13.O00000000000OO) + var13.O00000000000O0 : 0.0F)
         + strings.length * var13.O0000000000O
         + var13.O00000000000O;
      HudConstructorScreen.W242 var18 = this.O00000000(f, g, h, i, var16, var17);
      float var19 = var18.O00000000;
      float var20 = var18.O000000000;
      float var21 = var18.O0000000000;
      float var22 = var18.O00000000000;
      float var23 = this.O0000000O0OO00;
      float var24 = this.O0000000O0OO0O;
      float var25 = Math.min(var23, var24);
      float var26 = var13.O00000000000O * var23;
      float var27 = var13.O00000000000O * var24;
      float var28 = var15 ? var13.O00000000000OO * var24 : 0.0F;
      float var29 = var13.O00000000000O0 * var23;
      float var30 = var15 ? var13.O00000000000O0 * var24 : 0.0F;
      float var31 = var13.O0000000000O * var24;
      float var32 = var20 + var27 + var28 + var30;
      float var33 = strings.length * var31;
      float var34 = 0.0F;

      for (String var38 : strings2) {
         var34 = Math.max(var34, TextMeasureCache.O000000000(FontRegistry.O00000000, var38, j));
      }

      float var49 = bl ? Math.max(26.0F, var34 + 20.0F + var13.O0000000000O0O) * var23 : 0.0F;
      float var50 = var21 - var26 * 2.0F;
      float var51 = bl ? Math.max(30.0F, var50 - var29 - var49) : var50;
      float var52 = var19 + var26 + this.O00000000(var13.O000000000O.O00000000, "modules.x") * var23;
      float var39 = var32 + this.O00000000(var13.O000000000O.O000000000, "modules.y") * var24;
      float var40 = var19 + var26 + var51 + var29 + this.O00000000(var13.O000000000O0.O00000000, "binds.x") * var23;
      float var41 = var32 + this.O00000000(var13.O000000000O0.O000000000, "binds.y") * var24;
      this.O00000000(o0000O00OO0O0, var14, var19, var20, var21, var22, var13.O00000000 * var25, 0.95F);
      this.O0000000OOO0O0.O00000000(var19, var20, var21, var22);
      if (var15) {
         this.O0000000OOO0OO.O00000000(var19 + var26, var20 + var27, var50, var28);
         this.O00000000(
            o0000O00OO0O0,
            var14,
            this.O0000000OOO0OO.O00000000,
            this.O0000000OOO0OO.O000000000,
            this.O0000000OOO0OO.O0000000000,
            this.O0000000OOO0OO.O00000000000,
            var13.O000000000 * var25,
            false,
            0.95F
         );
      } else {
         this.O0000000OOO0OO.O00000000();
      }

      this.O0000000OOOO0.O00000000(var52, var39, var51, var33);
      this.O00000000(
         o0000O00OO0O0,
         var14,
         this.O0000000OOOO0.O00000000,
         this.O0000000OOOO0.O000000000,
         this.O0000000OOOO0.O0000000000,
         this.O0000000OOOO0.O00000000000,
         var13.O00000000000 * var25,
         true,
         0.95F
      );
      if (bl) {
         this.O0000000OOOO00.O00000000(var40, var41, var49, var33);
         this.O00000000(
            o0000O00OO0O0,
            var14,
            this.O0000000OOOO00.O00000000,
            this.O0000000OOOO00.O000000000,
            this.O0000000OOOO00.O0000000000,
            this.O0000000OOOO00.O00000000000,
            var13.O000000000000 * var25,
            true,
            0.95F
         );
         O00000000(this.O0000000OOOO, this.O0000000OOOO0, this.O0000000OOOO00);
      } else {
         this.O0000000OOOO00.O00000000();
         this.O0000000OOOO.O00000000(this.O0000000OOOO0);
      }

      if (var15) {
         this.O00000000(o0000O00OO0O0, var14, var13, var19, var20, var21, var23, var24, string, FontRegistry.O00000000000, o0000O0O00O00O, string2);
      } else {
         this.O0000000OOO00O.O00000000();
         this.O0000000OOO0O.O00000000();
      }

      for (int var42 = 0; var42 < strings.length; var42++) {
         float var43 = var39 + var42 * var31;
         float var44 = var41 + var42 * var31;
         boolean var45 = this.O0000000000O().kind == HudConstructorScreen.W243.POTIONS && var42 == 2;
         int var46 = var45 ? this.O0000000000().O000000000() : var14.O00000000000O(0.9F);
         int var47 = var45 ? ColorScheme.O00000000(this.O0000000000().O000000000(), 235) : var14.O000000000000(0.9F);
         if (var13.O0000000000OO > 0.05F) {
            o0000O00OO0O0.O00000000(
               (float)Math.round(var52 + 10.0F * var23),
               (float)Math.round(var43 + (var31 - 8.0F * var24) * 0.5F),
               Math.max(1.0F, (float)Math.round(var13.O0000000000OO * var23)),
               Math.max(1.0F, (float)Math.round(8.0F * var24)),
               Math.max(0.8F, var13.O0000000000OO * 0.5F) * var23,
               var46
            );
         }

         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var52 + 20.0F * var23, var43 + var31 * 0.5F + 4.0F * var24, j * var25, strings[var42], var47);
         if (bl) {
            float var48 = TextMeasureCache.O000000000(FontRegistry.O00000000, strings2[var42], j * var25);
            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000, var40 + (var49 - var48) * 0.5F, var44 + var31 * 0.5F + 4.0F * var24, j * var25, strings2[var42], var46
            );
         }
      }
   }

   private void O000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      O00000OO0OO0O.W239 var6 = this.O00000000000O0();
      var6.O000000000();
      HudElement var7 = this.O00000000000OO();
      float var8 = 22.0F;
      float var9 = 9.0F * var8 + var6.O00000000000O * 2.0F;
      float var10 = 3.0F * var8 + var6.O00000000000O * 2.0F;
      float var11 = TextMeasureCache.O000000000(FontRegistry.O00000000000, "Inventory", var6.O0000000000O0);
      float var12 = Math.max(var9 + var6.O00000000000O * 2.0F, var11 + 22.0F + var6.O00000000000O * 2.0F + var6.O0000000000O00 + 14.0F);
      float var13 = var6.O00000000000O + var6.O00000000000OO + var6.O00000000000O0 + var10 + var6.O00000000000O;
      HudConstructorScreen.W242 var14 = this.O00000000(f, g, h, i, var12, var13);
      float var15 = var14.O00000000;
      float var16 = var14.O000000000;
      float var17 = var14.O0000000000;
      float var18 = var14.O00000000000;
      float var19 = this.O0000000O0OO00;
      float var20 = this.O0000000O0OO0O;
      float var21 = Math.min(var19, var20);
      float var22 = var6.O00000000000O * var19;
      float var23 = var6.O00000000000O * var20;
      float var24 = var6.O00000000000OO * var20;
      float var25 = var16 + var23 + var24 + var6.O00000000000O0 * var20;
      float var26 = var17 - var22 * 2.0F;
      float var27 = var15 + var22 + this.O00000000(var6.O000000000O.O00000000, "modules.x") * var19;
      float var28 = var25 + this.O00000000(var6.O000000000O.O000000000, "modules.y") * var20;
      float var29 = var10 * var20;
      this.O00000000(o0000O00OO0O0, var7, var15, var16, var17, var18, var6.O00000000 * var21, 0.95F);
      this.O0000000OOO0O0.O00000000(var15, var16, var17, var18);
      this.O0000000OOO0OO.O00000000(var15 + var22, var16 + var23, var26, var24);
      this.O00000000(
         o0000O00OO0O0,
         var7,
         this.O0000000OOO0OO.O00000000,
         this.O0000000OOO0OO.O000000000,
         this.O0000000OOO0OO.O0000000000,
         this.O0000000OOO0OO.O00000000000,
         var6.O000000000 * var21,
         false,
         0.95F
      );
      this.O0000000OOOO0.O00000000(var27, var28, var26, var29);
      this.O0000000OOOO.O00000000(this.O0000000OOOO0);
      this.O00000000(
         o0000O00OO0O0,
         var7,
         this.O0000000OOOO0.O00000000,
         this.O0000000OOOO0.O000000000,
         this.O0000000OOOO0.O0000000000,
         this.O0000000OOOO0.O00000000000,
         var6.O0000000000 * var21,
         true,
         0.95F
      );
      this.O00000000(o0000O00OO0O0, var7, var6, var15, var16, var17, var19, var20, "Inventory", FontRegistry.O00000000000, FontRegistry.O000000000000, "h");
      float var30 = var8 * var21;
      float var31 = var27 + (var26 - 9.0F * var30) * 0.5F;
      float var32 = var28 + (var29 - 3.0F * var30) * 0.5F;
      int var33 = var7.O00000000000OO() ? O00000000(0, 0, 0, 58) : var7.O0000000000(0.72F);

      for (int var34 = 0; var34 < 3; var34++) {
         for (int var35 = 0; var35 < 9; var35++) {
            float var36 = var31 + var35 * var30;
            float var37 = var32 + var34 * var30;
            o0000O00OO0O0.O00000000(
               (float)Math.round(var36 + 1.0F),
               (float)Math.round(var37 + 1.0F),
               Math.max(1.0F, (float)Math.round(var30 - 2.0F)),
               Math.max(1.0F, (float)Math.round(var30 - 2.0F)),
               var6.O000000000000O * var21,
               var33
            );
         }
      }

      this.O0000000OOOO0O.O00000000(Math.round(var31), Math.round(var32), Math.round(9.0F * var30), Math.round(3.0F * var30));
      if (this.client != null && this.client.player != null) {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(
            this.O0000000OOOO0O.O00000000,
            this.O0000000OOOO0O.O000000000,
            this.O0000000OOOO0O.O0000000000,
            this.O0000000OOOO0O.O00000000000,
            var6.O0000000000 * var21,
            var6.O0000000000 * var21,
            var6.O0000000000 * var21,
            var6.O0000000000 * var21
         );

         try {
            int var45 = 9;
            float var46 = ItemRenderUtil.O0000000000(Math.max(0.25F, (var30 - this.O00000000(4.0F)) / 16.0F));
            float var47 = 16.0F * var46;

            for (int var48 = 0; var48 < 3; var48++) {
               for (int var38 = 0; var38 < 9; var38++) {
                  ItemStack var39 = this.client.player.getInventory().getStack(var45);
                  if (var39 != null && !var39.isEmpty()) {
                     float var40 = var31 + var38 * var30 + (var30 - var47) * 0.5F;
                     float var41 = var32 + var48 * var30 + (var30 - var47) * 0.5F;
                     ItemRenderUtil.O00000000(o0000O00OO0O0, var39, ItemRenderUtil.O00000000(var40), ItemRenderUtil.O00000000(var41), var46, var45, true, var45);
                  }

                  var45++;
               }
            }
         } finally {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }
   }

   private void O0000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      O00000OO0OO0O.W239 var6 = this.O00000000000O0();
      var6.O000000000();
      HudElement var7 = this.O00000000000OO();
      int var8 = this.O0000000000O().kind == HudConstructorScreen.W243.HOTBAR ? 9 : 4;
      float var9 = this.O0000000000O().kind == HudConstructorScreen.W243.HOTBAR ? 24.0F : 28.0F;
      float var10 = var8 * var9 + var6.O00000000000O * 2.0F;
      float var11 = var9 + var6.O00000000000O * 2.0F;
      HudConstructorScreen.W242 var12 = this.O00000000(f, g, h, i, var10, var11);
      float var13 = var12.O00000000;
      float var14 = var12.O000000000;
      float var15 = var12.O0000000000;
      float var16 = var12.O00000000000;
      float var17 = Math.min(this.O0000000O0OO00, this.O0000000O0OO0O);
      this.O00000000(o0000O00OO0O0, var7, var13, var14, var15, var16, var6.O00000000 * var17, 0.95F);
      this.O0000000OOO0O0.O00000000(var13, var14, var15, var16);
      this.O0000000OOOO0
         .O00000000(
            var13 + var6.O00000000000O * this.O0000000O0OO00,
            var14 + var6.O00000000000O * this.O0000000O0OO0O,
            var15 - var6.O00000000000O * 2.0F * this.O0000000O0OO00,
            var16 - var6.O00000000000O * 2.0F * this.O0000000O0OO0O
         );
      this.O0000000OOOO.O00000000(this.O0000000OOOO0);
      float var18 = var9 * var17;
      float var19 = var13 + (var15 - var8 * var18) * 0.5F;
      float var20 = var14 + (var16 - var18) * 0.5F;

      for (int var21 = 0; var21 < var8; var21++) {
         float var22 = var19 + var21 * var18;
         int var23 = var21 == 0 ? var7.O00000000000O(0.28F) : var7.O0000000000(0.76F);
         o0000O00OO0O0.O00000000(
            (float)Math.round(var22 + 1.0F),
            (float)Math.round(var20 + 1.0F),
            Math.max(1.0F, (float)Math.round(var18 - 2.0F)),
            Math.max(1.0F, (float)Math.round(var18 - 2.0F)),
            var6.O000000000000O * var17,
            var23
         );
      }

      this.O0000000OOOO0O.O00000000(Math.round(var19), Math.round(var20), Math.round(var8 * var18), Math.round(var18));
      if (this.client != null && this.client.player != null) {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(
            this.O0000000OOOO0O.O00000000,
            this.O0000000OOOO0O.O000000000,
            this.O0000000OOOO0O.O0000000000,
            this.O0000000OOOO0O.O00000000000,
            var6.O00000000 * var17,
            var6.O00000000 * var17,
            var6.O00000000 * var17,
            var6.O00000000 * var17
         );

         try {
            float var30 = ItemRenderUtil.O0000000000(Math.max(0.25F, (var18 - this.O00000000(5.0F)) / 16.0F));
            float var31 = 16.0F * var30;

            for (int var32 = 0; var32 < var8; var32++) {
               ItemStack var24 = this.O00000000(var32);
               if (var24 != null && !var24.isEmpty()) {
                  float var25 = var19 + var32 * var18 + (var18 - var31) * 0.5F;
                  float var26 = var20 + (var18 - var31) * 0.5F;
                  ItemRenderUtil.O00000000(o0000O00OO0O0, var24, ItemRenderUtil.O00000000(var25), ItemRenderUtil.O00000000(var26), var30, var32, true, var32);
               }
            }
         } finally {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }
   }

   private ItemStack O00000000(int i) {
      if (this.client == null || this.client.player == null) {
         return ItemStack.EMPTY;
      } else if (this.O0000000000O().kind == HudConstructorScreen.W243.HOTBAR) {
         return this.client.player.getInventory().getStack(i);
      } else {
         return switch (i) {
            case 0 -> this.client.player.getEquippedStack(EquipmentSlot.HEAD);
            case 1 -> this.client.player.getEquippedStack(EquipmentSlot.CHEST);
            case 2 -> this.client.player.getEquippedStack(EquipmentSlot.LEGS);
            case 3 -> this.client.player.getEquippedStack(EquipmentSlot.FEET);
            default -> ItemStack.EMPTY;
         };
      }
   }

   private void O00000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      O00000OO0OO0O.W239 var6 = this.O00000000000O0();
      var6.O000000000();
      HudElement var7 = this.O00000000000OO();
      float var8 = var6.O0000000000O0;
      float var9 = var6.O0000000000O;
      float var10 = var6.O00000000000O * 2.0F + var9;

      for (String var14 : O00000000OOO00) {
         var10 += var6.O00000000000O0 + TextMeasureCache.O000000000(FontRegistry.O00000000, var14, var8) + 36.0F;
      }

      float var28 = var9 + var6.O00000000000O * 2.0F;
      HudConstructorScreen.W242 var29 = this.O00000000(f, g, h, i, var10, var28);
      float var30 = var29.O00000000;
      float var31 = var29.O000000000;
      float var15 = var29.O0000000000;
      float var16 = var29.O00000000000;
      float var17 = this.O0000000O0OO00;
      float var18 = this.O0000000O0OO0O;
      float var19 = Math.min(var17, var18);
      this.O00000000(o0000O00OO0O0, var7, var30, var31, var15, var16, var6.O00000000 * var19, 0.95F);
      this.O0000000OOO0O0.O00000000(var30, var31, var15, var16);
      float var20 = var30 + var6.O00000000000O * var17;
      float var21 = var31 + var6.O00000000000O * var18;
      float var22 = var9 * var18;
      float var23 = var9 * var17;
      o0000O00OO0O0.O00000000(
         (float)Math.round(var20),
         (float)Math.round(var21),
         Math.max(1.0F, (float)Math.round(var23)),
         Math.max(1.0F, (float)Math.round(var22)),
         var6.O00000000000 * var19,
         var7.O000000000(0.95F)
      );
      float var24 = TextMeasureCache.O000000000(FontRegistry.O00000000000O, "W", var6.O0000000000O00 * var19);
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000O,
         var20 + (var23 - var24) * 0.5F,
         var21 + var22 * 0.5F + 5.5F * var18,
         var6.O0000000000O00 * var19,
         "W",
         var7.O00000000000O(0.95F)
      );
      this.O0000000OOOO0.O00000000(var20, var21, var23, var22);
      var20 += var23;

      for (int var25 = 0; var25 < O00000000OOO00.length; var25++) {
         var20 += var6.O00000000000O0 * var17;
         float var26 = TextMeasureCache.O000000000(FontRegistry.O00000000, O00000000OOO00[var25], var8 * var19);
         float var27 = var26 + 36.0F * var17;
         o0000O00OO0O0.O00000000(
            (float)Math.round(var20),
            (float)Math.round(var21),
            Math.max(1.0F, (float)Math.round(var27)),
            Math.max(1.0F, (float)Math.round(var22)),
            var6.O000000000000 * var19,
            var7.O000000000(0.88F)
         );
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000000O,
            var20 + 9.0F * var17,
            var21 + var22 * 0.5F + 5.0F * var18,
            22.0F * var19,
            O00000000OOO0O[var25],
            var7.O00000000000O(0.9F)
         );
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000, var20 + 25.0F * var17, var21 + var22 * 0.5F + 4.5F * var18, var8 * var19, O00000000OOO00[var25], var7.O000000000000(0.92F)
         );
         var20 += var27;
      }

      this.O0000000OOOO.O00000000(var30 + var6.O00000000000O * var17, var21, var15 - var6.O00000000000O * 2.0F * var17, var22);
      this.O0000000OOOO00.O00000000(this.O0000000OOOO);
   }

   private void O000000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      this.O00000000(o0000O00OO0O0, f, g, h, i, "ArrayList", FontRegistry.O00000000000O, "n", O00000000OOOO, O0000000O00, 24.0F, false);
      this.O0000000OOO0OO.O00000000();
      this.O0000000OOO00O.O00000000();
      this.O0000000OOO0O.O00000000();
   }

   private void O0000000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      O00000OO0OO0O.W239 var6 = this.O00000000000O0();
      var6.O000000000();
      HudElement var7 = this.O00000000000OO();
      float var8 = 190.0F + var6.O0000000000O0O;
      float var9 = 72.0F + var6.O00000000000O * 2.0F;
      HudConstructorScreen.W242 var10 = this.O00000000(f, g, h, i, var8, var9);
      float var11 = var10.O00000000;
      float var12 = var10.O000000000;
      float var13 = var10.O0000000000;
      float var14 = var10.O00000000000;
      float var15 = this.O0000000O0OO00;
      float var16 = this.O0000000O0OO0O;
      float var17 = Math.min(var15, var16);
      this.O00000000(o0000O00OO0O0, var7, var11, var12, var13, var14, var6.O00000000 * var17, 0.95F);
      this.O0000000OOO0O0.O00000000(var11, var12, var13, var14);
      float var18 = 46.0F * var17;
      float var19 = var11 + var6.O00000000000O * var15;
      float var20 = var12 + (var14 - var18) * 0.5F;
      o0000O00OO0O0.O00000000(
         (float)Math.round(var19),
         (float)Math.round(var20),
         Math.max(1.0F, (float)Math.round(var18)),
         Math.max(1.0F, (float)Math.round(var18)),
         var6.O000000000000O * var17 + 7.0F * var17,
         var7.O000000000(0.95F)
      );
      o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var19 + var18 * 0.32F, var20 + var18 * 0.63F, 28.0F * var17, "r", var7.O00000000000O(0.9F));
      float var21 = var19 + var18 + var6.O00000000000O0 * var15 + 8.0F * var15 + this.O00000000(var6.O000000000O.O00000000, "modules.x") * var15;
      float var22 = var12 + var6.O00000000000O * var16 + 8.0F * var16 + this.O00000000(var6.O000000000O.O000000000, "modules.y") * var16;
      o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var21, var22 + 12.0F * var16, 24.0F * var17, "Enemy", var7.O000000000000(0.95F));
      float var23 = var22 + 28.0F * var16;
      float var24 = var13 - (var21 - var11) - var6.O00000000000O * var15;
      o0000O00OO0O0.O00000000(
         (float)Math.round(var21),
         (float)Math.round(var23),
         Math.max(1.0F, (float)Math.round(var24)),
         Math.max(1.0F, (float)Math.round(8.0F * var16)),
         var6.O0000000000000 * var17,
         var7.O0000000000(0.88F)
      );
      o0000O00OO0O0.O00000000(
         (float)Math.round(var21),
         (float)Math.round(var23),
         Math.max(1.0F, (float)Math.round(var24 * 0.68F)),
         Math.max(1.0F, (float)Math.round(8.0F * var16)),
         var6.O0000000000000 * var17,
         var7.O00000000000O(0.9F)
      );
      this.O0000000OOOO0.O00000000(var21, var22, var13 - (var21 - var11) - var6.O00000000000O * var15, 44.0F * var16);
      this.O0000000OOOO0O.O00000000(var19, var20, var18, var18);
      O00000000(this.O0000000OOOO, this.O0000000OOOO0, this.O0000000OOOO0O);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      HudElement o00000O00OO00O,
      O00000OO0OO0O.W239 o00000000,
      float f,
      float g,
      float h,
      float i,
      float j,
      String string,
      FontObject o0000O0O00O00O,
      FontObject o0000O0O00O00O2,
      String string2
   ) {
      float var13 = Math.min(i, j);
      int var14 = o00000O00OO00O.O000000000000(0.95F);
      int var15 = o00000O00OO00O.O00000000000O(0.95F);
      float var16 = f + this.O00000000(o00000000.O0000000000OO0.O00000000, "title.x") * i;
      float var17 = g + this.O00000000(o00000000.O0000000000OO0.O000000000, "title.y") * j;
      float var18 = o00000000.O0000000000O0 * var13;
      o0000O00OO0O0.O00000000(o0000O0O00O00O, var16, var17, var18, string, var14);
      float var19 = TextMeasureCache.O000000000(o0000O0O00O00O, string, var18);
      this.O0000000OOO00O.O00000000(var16 - 4.0F, var17 - var18 * 0.8F, var19 + 8.0F, var18);
      float var20 = o00000000.O0000000000O00 * var13;
      float var21 = (o00000000.O0000000000OOO.O0000000000 ? f + h : f) + this.O00000000(o00000000.O0000000000OOO.O00000000, "icon.x") * i;
      float var22 = g + this.O00000000(o00000000.O0000000000OOO.O000000000, "icon.y") * j;
      float var23 = TextMeasureCache.O000000000(o0000O0O00O00O2, string2, var20);
      o0000O00OO0O0.O00000000(o0000O0O00O00O2, var21, var22, var20, string2, var15);
      this.O0000000OOO0O.O00000000(var21 - 6.0F, var22 - var20 * 0.85F, var23 + 12.0F, var20 + 4.0F);
   }

   private void O00000000(RenderManager o0000O00OO0O0, HudElement o00000O00OO00O, float f, float g, float h, float i, float j, float k) {
      o00000O00OO00O.O00000000(o0000O00OO0O0, Math.round(f), Math.round(g), Math.round(h), Math.round(i), j, k);
   }

   private void O00000000(RenderManager o0000O00OO0O0, HudElement o00000O00OO00O, float f, float g, float h, float i, float j, boolean bl, float k) {
      if (!(h <= 0.0F) && !(i <= 0.0F)) {
         f = Math.round(f);
         g = Math.round(g);
         h = Math.round(h);
         i = Math.round(i);
         if (!bl || o00000O00OO00O.O00000000000O()) {
            if (o00000O00OO00O.O0000000000O()) {
               if (bl) {
                  o00000O00OO00O.O000000000(o0000O00OO0O0, f, g, h, i, j, k);
               } else if (!o00000O00OO00O.O00000000(f, g, h, i, j, false, k, 1)) {
                  o0000O00OO0O0.O00000000(f, g, h, i, j, o00000O00OO00O.O000000000(k));
               }
            } else {
               o0000O00OO0O0.O00000000(f, g, h, i, j, bl ? o00000O00OO00O.O0000000000(k) : o00000O00OO00O.O000000000(k));
            }
         }
      }
   }

   private HudConstructorScreen.W242 O00000000(float f, float g, float h, float i, float j, float k) {
      float var7 = O00000OO000O.O00000000().O00000000(this.O0000000000O0(), j, k);
      float var8 = this.O00000000(h, i, j, k, var7);
      this.O0000000O0OO00 = var8;
      this.O0000000O0OO0O = var8;
      float var9 = Math.round(j * this.O0000000O0OO00);
      float var10 = Math.round(k * this.O0000000O0OO0O);
      float var11 = this.O0000000O0OOOO[this.O000000O000000];
      float var12 = this.O0000000OO[this.O000000O000000];
      float var13 = f + (h - var9) * 0.5F + var11;
      float var14 = g + (i - var10) * 0.5F + var12;
      float var15 = this.O00000000(10.0F);
      var13 = O00000000(var13, f + var15, Math.max(f + var15, f + h - var15 - var9));
      var14 = O00000000(var14, g + var15, Math.max(g + var15, g + i - var15 - var10));
      return this.O000000O00.O00000000(Math.round(var13), Math.round(var14), var9, var10);
   }

   private float O00000000(float f, float g, float h, float i, float j) {
      float var6 = Math.max(this.O00000000(60.0F), f - this.O00000000(72.0F));
      float var7 = Math.max(this.O00000000(60.0F), g - this.O00000000(72.0F));
      float var8 = Math.min(var6 / Math.max(1.0F, h), var7 / Math.max(1.0F, i));
      var8 = O00000000(var8 * 0.76F, 0.55F, 1.7F);
      float var9 = Math.max(0.35F, (f - this.O00000000(22.0F)) / Math.max(1.0F, h));
      float var10 = Math.max(0.35F, (g - this.O00000000(22.0F)) / Math.max(1.0F, i));
      return O00000000(var8 * j, 0.35F, Math.min(var9, var10));
   }

   private float O00000000(
      String string, FontObject o0000O0O00O00O, String string2, String[] strings, String[] strings2, float f, boolean bl, O00000OO0OO0O.W239 o00000000
   ) {
      float var9 = TextMeasureCache.O000000000(FontRegistry.O00000000000, string, o00000000.O0000000000O0);
      float var10 = 0.0F;
      float var11 = 0.0F;

      for (int var12 = 0; var12 < strings.length; var12++) {
         var10 = Math.max(var10, TextMeasureCache.O000000000(FontRegistry.O00000000, strings[var12], f));
         if (var12 < strings2.length) {
            var11 = Math.max(var11, TextMeasureCache.O000000000(FontRegistry.O00000000, strings2[var12], f));
         }
      }

      float var14 = var10 + 24.0F;
      if (bl) {
         var14 += o00000000.O00000000000O0 + var11 + 20.0F + o00000000.O0000000000O0O;
      }

      float var13 = var9 + o00000000.O0000000000O00 + 36.0F;
      return Math.max(var14 + o00000000.O00000000000O * 2.0F, var13 + o00000000.O00000000000O * 2.0F);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO) {
      O00000OO0OO0O.W239 var3 = this.O00000000000O0();
      this.O000000000000();
      float var4 = this.O0000000OOOOO.O00000000;
      float var5 = this.O0000000OOOOO.O000000000;
      float var6 = this.O0000000OOOOO.O0000000000;
      float var7 = this.O0000000OOOOO.O00000000000;
      HudConstructorScreen.W244 var8 = this.O0000000000O();
      String[] var9 = this.O00000000(var8.kind);
      if (!O00000000(var9, this.O000000O000)) {
         this.O000000O000 = var9[0];
      }

      this.O00000000(o0000O00OO0O0, o0000O000O0OO, var4, var5, var6, var7);
      float var10 = Math.round(this.O00000000(50.0F));
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000, var4 + this.O00000000(16.0F), var5 + this.O00000000(20.0F), this.O00000000(13.0F), var8.label, O000000000(o0000O000O0OO)
      );
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000,
         var4 + this.O00000000(16.0F),
         var5 + this.O00000000(39.0F),
         this.O00000000(16.0F),
         this.O0000000000O0O(),
         o0000O000O0OO.O000000000O()
      );
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, var4 + this.O00000000(14.0F), var5 + var10, var6 - this.O00000000(28.0F));
      float var11 = var5 + var10 + this.O00000000(1.0F);
      float var12 = Math.max(this.O00000000(40.0F), var5 + var7 - var11 - this.O00000000(8.0F));
      this.O0000000OOOOO0.O00000000(var4 + this.O00000000(4.0F), var11, var6 - this.O00000000(8.0F), var12);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(
         this.O0000000OOOOO0.O00000000,
         this.O0000000OOOOO0.O000000000,
         this.O0000000OOOOO0.O0000000000,
         this.O0000000OOOOO0.O00000000000,
         this.O00000000(8.0F),
         this.O00000000(8.0F),
         this.O00000000(8.0F),
         this.O00000000(8.0F)
      );
      boolean var23 = false /* VF: Semaphore variable */;

      try {
         var23 = true;
         float var13 = var4 + this.O00000000(16.0F);
         float var14 = var6 - this.O00000000(32.0F);
         float var15 = var11 + this.O00000000(12.0F) - this.O0000000O0OOO;
         if (!var8.layoutBacked) {
            var15 = this.O000000000(o0000O00OO0O0, o0000O000O0OO, var13, var15, var14);
         }

         var15 = this.O00000000(o0000O00OO0O0, o0000O000O0OO, var13, var15, var14, var9);
         var15 += this.O00000000(15.0F);
         var15 = this.O00000000(o0000O00OO0O0, o0000O000O0OO, var13, var15, var14, "ACTIONS");
         var15 = this.O0000000000(o0000O00OO0O0, o0000O000O0OO, var13, var15, var14);
         var15 += this.O00000000(15.0F);
         var15 = this.O00000000(o0000O00OO0O0, o0000O000O0OO, var13, var15, var14, "PRESETS");
         var15 = this.O00000000(o0000O00OO0O0, o0000O000O0OO, var13, var15, var14, var3);
         String var16 = null;

         for (HudConstructorScreen.W245 var20 : O00000000O0OO0) {
            if (this.O00000000(var8, var20.id)) {
               if (!var20.section.equals(var16)) {
                  var15 += this.O00000000(15.0F);
                  var15 = this.O00000000(o0000O00OO0O0, o0000O000O0OO, var13, var15, var14, var20.section);
                  var16 = var20.section;
               }

               var15 = this.O00000000(o0000O00OO0O0, o0000O000O0OO, var13, var15, var14, var20, this.O00000000(var3, var20.id));
            }
         }

         var15 += this.O00000000(6.0F);
         var15 = this.O00000000(o0000O00OO0O0, o0000O000O0OO, var13, var15);
         var15 += this.O00000000(14.0F);
         float var36 = this.O0000000OOOOO0.O000000000 + this.O0000000OOOOO0.O00000000000;
         this.O0000000O0OOO0 = Math.max(0.0F, var15 + this.O0000000O0OOO - var36);
         this.O0000000O0OOO = O00000000(this.O0000000O0OOO, 0.0F, this.O0000000O0OOO0);
         var23 = false;
      } finally {
         if (var23) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }

      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O0000000000000();
      this.O0000000O0O00O.O00000000();
      this.O0000000O0O00O
         .O00000000(this.O0000000OOOOO.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO) ? 1.0 : 0.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
      this.O00000000(
         o0000O00OO0O0,
         o0000O000O0OO,
         var4 + var6 - this.O00000000(7.0F),
         this.O0000000OOOOO0.O000000000,
         this.O0000000OOOOO0.O00000000000,
         this.O0000000O0OOO,
         this.O0000000O0OOO0,
         this.O0000000O0O00O.O000000000000()
      );
   }

   private void O000000000000() {
      for (HudConstructorScreen.W245 var4 : O00000000O0OO0) {
         this.O0000000O0000O.get(var4.id).O00000000();
      }

      for (String var11 : O00000000O0O0O) {
         this.O0000000O000O.get(var11).O00000000();
      }

      for (String var12 : O00000000O0OO) {
         this.O0000000O000O0.get(var12).O00000000();
      }
   }

   private float O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, float f, float g, float h, String string) {
      o0000O00OO0O0.O00000000(FontRegistry.O00000000000, f, g + this.O00000000(10.0F), this.O00000000(12.0F), string, O000000000(o0000O000O0OO));
      float var7 = TextMeasureCache.O000000000(FontRegistry.O00000000000, string, this.O00000000(12.0F));
      float var8 = f + var7 + this.O00000000(10.0F);
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, var8, g + this.O00000000(6.0F), Math.max(0.0F, f + h - var8));
      return g + this.O00000000(24.0F);
   }

   private float O000000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, float f, float g, float h) {
      float var6 = this.O00000000(46.0F);
      int var7 = o0000O000O0OO.O0000000000();
      o0000O00OO0O0.O00000000(
         (float)Math.round(f),
         (float)Math.round(g),
         (float)Math.round(h),
         (float)Math.round(var6),
         this.O00000000(10.0F),
         ColorScheme.O00000000(var7, o0000O000O0OO.O000000000O000() ? 26 : 20)
      );
      o0000O00OO0O0.O00000000(
         (float)Math.round(f),
         (float)Math.round(g),
         (float)Math.round(h),
         (float)Math.round(var6),
         this.O00000000(10.0F),
         ColorScheme.O00000000(var7, 72),
         1.0F
      );
      float var8 = Math.round(this.O00000000(6.0F));
      o0000O00OO0O0.O00000000((float)Math.round(f + this.O00000000(14.0F)), (float)Math.round(g + var6 * 0.5F - var8 * 0.5F), var8, var8, var8 * 0.5F, var7);
      float var9 = f + this.O00000000(14.0F) + var8 + this.O00000000(10.0F);
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000, var9, g + this.O00000000(19.0F), this.O00000000(12.5F), "Style preview", ColorScheme.O00000000(var7, 240)
      );
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000, var9, g + this.O00000000(34.0F), this.O00000000(12.0F), "Position & scale stay live", O00000000(o0000O000O0OO)
      );
      return g + var6 + this.O00000000(12.0F);
   }

   private float O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, float f, float g, float h, String[] strings) {
      int var7 = strings.length;
      int var8 = var7 <= 4 ? 1 : 2;
      int var9 = (int)Math.ceil((float)var7 / var8);
      float var10 = this.O00000000(7.0F);
      float var11 = this.O00000000(7.0F);
      float var12 = this.O00000000(33.0F);
      float var13 = this.O00000000(15.0F);
      float var14 = this.O00000000(9.0F);
      float var15 = (h - var10 * (var9 - 1)) / var9;
      HudConstructorScreen.W242 var16 = null;

      for (int var17 = 0; var17 < var7; var17++) {
         String var18 = strings[var17];
         int var19 = var17 % var9;
         int var20 = var17 / var9;
         float var21 = f + var19 * (var15 + var10);
         float var22 = g + var20 * (var12 + var11);
         HudConstructorScreen.W242 var23 = this.O0000000O000O.get(var18);
         var23.O00000000(Math.round(var21), Math.round(var22), Math.round(var15), Math.round(var12));
         if (var18.equals(this.O000000O000)) {
            var16 = var23;
         }
      }

      if (var16 != null) {
         this.O0000000O00OOO.O00000000();
         this.O0000000O0O.O00000000();
         this.O0000000O0O0.O00000000();
         this.O0000000O0O00.O00000000();
         boolean var25 = !this.O000000O000.equals(this.O0000000O0O0O);
         if (!(this.O0000000O0O0.O000000000000() <= 0.0F) && var25) {
            this.O0000000O00OOO.O00000000(var16.O00000000, 0.22F, O0000O00O0OO0O.O0000000000O, false);
            this.O0000000O0O.O00000000(var16.O000000000, 0.22F, O0000O00O0OO0O.O0000000000O, false);
            this.O0000000O0O0.O00000000(var16.O0000000000, 0.22F, O0000O00O0OO0O.O0000000000O, false);
            this.O0000000O0O00.O00000000(var16.O00000000000, 0.22F, O0000O00O0OO0O.O0000000000O, false);
            if (Math.abs(this.O0000000O00OOO.O000000000000() - var16.O00000000) < 0.6F && Math.abs(this.O0000000O0O.O000000000000() - var16.O000000000) < 0.6F) {
               this.O0000000O0O0O = this.O000000O000;
            }
         } else {
            this.O0000000O00OOO.O0000000000000(var16.O00000000);
            this.O0000000O0O.O0000000000000(var16.O000000000);
            this.O0000000O0O0.O0000000000000(var16.O0000000000);
            this.O0000000O0O00.O0000000000000(var16.O00000000000);
            this.O0000000O0O0O = this.O000000O000;
         }

         float var27 = Math.round(this.O0000000O00OOO.O000000000000());
         float var29 = Math.round(this.O0000000O0O.O000000000000());
         float var31 = Math.round(this.O0000000O0O0.O000000000000());
         float var33 = Math.round(this.O0000000O0O00.O000000000000());
         o0000O00OO0O0.O00000000(
            var27, var29, var31, var33, var14, this.O00000000(7.0F), this.O00000000(0.5F), O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 34 : 46)
         );
         o0000O00OO0O0.O00000000(var27, var29, var31, var33, var14, O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 42 : 36));
         o0000O00OO0O0.O00000000(var27, var29, var31, var33, var14, O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 98 : 76), 1.0F);
      }

      for (String var32 : strings) {
         HudConstructorScreen.W242 var34 = this.O0000000O000O.get(var32);
         boolean var35 = var32.equals(this.O000000O000);
         float var36 = this.O000000000(var32, !var34.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO) && !var35 ? 0.0F : 1.0F);
         if (!var35) {
            o0000O00OO0O0.O00000000(
               var34.O00000000,
               var34.O000000000,
               var34.O0000000000,
               var34.O00000000000,
               var14,
               ColorScheme.O00000000(
                  o0000O000O0OO.O000000000O(),
                  Math.round((o0000O000O0OO.O000000000O000() ? 12.0F : 9.0F) + var36 * (o0000O000O0OO.O000000000O000() ? 14.0F : 11.0F))
               )
            );
            o0000O00OO0O0.O00000000(var34.O00000000, var34.O000000000, var34.O0000000000, var34.O00000000000, var14, o0000O000O0OO.O0000000000O0(), 1.0F);
         }

         int var24 = var35 ? o0000O000O0OO.O000000000O() : ColorScheme.O00000000(O00000000(o0000O000O0OO), o0000O000O0OO.O000000000O(), var36 * 0.4F);
         this.O00000000(
            o0000O00OO0O0,
            FontRegistry.O00000000,
            this.O00000000000(var32),
            var34.O00000000,
            var34.O000000000,
            var34.O0000000000,
            var34.O00000000000,
            var13,
            var24
         );
      }

      return g + var8 * var12 + (var8 - 1) * var11;
   }

   private float O0000000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, float f, float g, float h) {
      float var6 = this.O00000000(8.0F);
      float var7 = (h - var6 * 2.0F) / 3.0F;
      float var8 = this.O00000000(34.0F);
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, "centerX", f, g, var7, var8, "Center X", false, false);
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, "centerY", f + var7 + var6, g, var7, var8, "Center Y", false, false);
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, "reset", f + (var7 + var6) * 2.0F, g, var7, var8, "Reset", false, false);
      return g + var8;
   }

   private float O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, float f, float g, float h, O00000OO0OO0O.W239 o00000000) {
      float var7 = this.O00000000(8.0F);
      float var8 = (h - var7 * 2.0F) / 3.0F;
      float var9 = this.O00000000(34.0F);
      int var10 = this.O00000000(o00000000);
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, "presetSoft", f, g, var8, var9, "Soft", true, var10 == 0);
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, "presetCompact", f + var8 + var7, g, var8, var9, "Compact", true, var10 == 1);
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, "presetSharp", f + (var8 + var7) * 2.0F, g, var8, var9, "Sharp", true, var10 == 2);
      return g + var9;
   }

   private int O00000000(O00000OO0OO0O.W239 o00000000) {
      if (this.O00000000(o00000000, 17.0F, 8.0F)) {
         return 0;
      } else if (this.O00000000(o00000000, 10.0F, 5.0F)) {
         return 1;
      } else {
         return this.O00000000(o00000000, 4.0F, 7.0F) ? 2 : -1;
      }
   }

   private boolean O00000000(O00000OO0OO0O.W239 o00000000, float f, float g) {
      return Math.abs(o00000000.O00000000 - f) < 1.2F && Math.abs(o00000000.O00000000000O - g) < 1.2F;
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, String string, float f, float g, float h, float i, String string2, boolean bl, boolean bl2
   ) {
      HudConstructorScreen.W242 var11 = this.O0000000O000O0.get(string);
      var11.O00000000(Math.round(f), Math.round(g), Math.round(h), Math.round(i));
      float var12 = this.O000000000(string, var11.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO) ? 1.0F : 0.0F);
      float var13 = this.O00000000(11.0F);
      int var14;
      int var15;
      int var16;
      if (bl2) {
         var14 = O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 44 : 38);
         var15 = O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 108 : 84);
         var16 = o0000O000O0OO.O000000000O();
      } else {
         int var17 = bl
            ? O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 22 : 18)
            : ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O000() ? 16 : 12);
         var14 = ColorScheme.O00000000(var17, O00000000(o0000O000O0OO, o0000O000O0OO.O000000000O000() ? 42 : 36), var12);
         var15 = ColorScheme.O00000000(o0000O000O0OO.O0000000000O0(), O00000000(o0000O000O0OO, 92), var12);
         var16 = ColorScheme.O00000000(O00000000(o0000O000O0OO), o0000O000O0OO.O000000000O(), 0.2F + var12 * 0.6F);
      }

      o0000O00OO0O0.O00000000(var11.O00000000, var11.O000000000, var11.O0000000000, var11.O00000000000, var13, var14);
      o0000O00OO0O0.O00000000(var11.O00000000, var11.O000000000, var11.O0000000000, var11.O00000000000, var13, var15, 1.0F);
      this.O00000000(
         o0000O00OO0O0,
         FontRegistry.O00000000000,
         string2,
         var11.O00000000,
         var11.O000000000,
         var11.O0000000000,
         var11.O00000000000,
         this.O00000000(15.0F),
         var16
      );
   }

   private float O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, float f, float g, float h, HudConstructorScreen.W245 o00000000000, float i) {
      float var8 = O00000000((i - o00000000000.min) / Math.max(0.001F, o00000000000.max - o00000000000.min), 0.0F, 1.0F);
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g + this.O00000000(11.0F), this.O00000000(13.5F), o00000000000.label, O00000000(o0000O000O0OO));
      String var9 = this.O0000000O00O00.get(o00000000000.id);
      if (var9 == null) {
         var9 = "";
      }

      float var10 = this.O00000000(13.5F);
      float var11 = TextMeasureCache.O000000000(FontRegistry.O00000000000, var9, var10);
      o0000O00OO0O0.O00000000(FontRegistry.O00000000000, f + h - var11, g + this.O00000000(11.0F), var10, var9, o0000O000O0OO.O00000000000());
      float var12 = Math.round(g + this.O00000000(24.0F));
      float var13 = Math.max(2.0F, (float)Math.round(this.O00000000(4.0F)));
      float var14 = Math.round(f);
      float var15 = Math.round(h);
      float var16 = var13 * 0.5F;
      float var17 = O00000000(this.O00000000(var8, o00000000000.id), 0.0F, 1.0F);
      float var18 = Math.max(0.0F, var15 * var17);
      HudConstructorScreen.W242 var19 = this.O0000000O0000O.get(o00000000000.id);
      var19.O00000000(var14, Math.round(var12 - this.O00000000(11.0F)), var15, Math.round(this.O00000000(26.0F)));
      boolean var20 = o00000000000.id.equals(this.O000000O00000);
      float var21 = this.O000000000(o00000000000.id + ".thumb", !var19.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO) && !var20 ? 0.0F : 1.0F);
      o0000O00OO0O0.O00000000(var14, var12, var15, var13, var16, o0000O000O0OO.O0000000000O00());
      if (var18 > 1.0F) {
         o0000O00OO0O0.O00000000(
            var14, var12, var18, var13, var16, this.O00000000(4.0F), this.O00000000(0.5F), O00000000(o0000O000O0OO, Math.round(36.0F + var21 * 70.0F))
         );
         o0000O00OO0O0.O00000000(var14, var12, var18, var13, var16, o0000O000O0OO.O000000000O0(), O000000000(o0000O000O0OO, 205));
      }

      float var22 = var14 + var18;
      float var23 = var12 + var13 * 0.5F;
      float var24 = this.O00000000(7.0F) + var21 * this.O00000000(1.0F);
      int var25 = Math.round((var20 ? 150.0F : 68.0F) + var21 * 95.0F);
      o0000O00OO0O0.O00000000(
         var22 - var24, var23 - var24, var24 * 2.0F, var24 * 2.0F, var24, this.O00000000(6.0F), this.O00000000(0.5F), O00000000(o0000O000O0OO, var25)
      );
      o0000O00OO0O0.O000000000(var22, var23, var24, 0.0F, 1.0F, O00000000(o0000O000O0OO, 240));
      o0000O00OO0O0.O000000000(var22, var23, var24 - this.O00000000(1.6F), 0.0F, 1.0F, o0000O000O0OO.O000000000O());
      return g + this.O00000000(40.0F);
   }

   private float O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, float f, float g) {
      O00000OO0OO0O.W241 var5 = this.O00000000000O();
      if (var5 == null) {
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000, f, g + this.O00000000(13.0F), this.O00000000(13.0F), "Drag title, modules, binds or icon", O000000000(o0000O000O0OO)
         );
         return g + this.O00000000(22.0F);
      } else if ("icon".equals(this.O000000O000)) {
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g + this.O00000000(13.0F), this.O00000000(13.0F), this.O000000O0000O0, O00000000(o0000O000O0OO));
         return g + this.O00000000(22.0F);
      } else {
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g + this.O00000000(13.0F), this.O00000000(13.0F), this.O000000O00000O, O00000000(o0000O000O0OO));
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000, f + this.O00000000(102.0F), g + this.O00000000(13.0F), this.O00000000(13.0F), this.O000000O0000O, O00000000(o0000O000O0OO)
         );
         return g + this.O00000000(22.0F);
      }
   }

   private void O000000000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO) {
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, this.O0000000OOO0O0, "panel");
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, this.O0000000OOO0OO, "header");
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, this.O0000000OOOO, "content");
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, this.O0000000OOOO0, "modules");
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, this.O0000000OOOO00, "binds");
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, this.O0000000OOOO0O, "slots");
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, this.O0000000OOO00O, "title");
      this.O00000000(o0000O00OO0O0, o0000O000O0OO, this.O0000000OOO0O, "icon");
   }

   private void O0000000000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO) {
      if (!(this.O0000000OOO0O0.O0000000000 <= 0.0F) && !(this.O0000000OOO0O0.O00000000000 <= 0.0F)) {
         if (this.O0000000OO0 && (this.O0000000OO000 || this.O0000000OO0000)) {
            int var3 = O00000000(o0000O000O0OO, 170);
            if (this.O0000000OO000) {
               o0000O00OO0O0.O00000000(
                  (float)Math.round(this.O0000000OOOOOO.O00000000 + this.O0000000OOOOOO.O0000000000 * 0.5F),
                  (float)Math.round(this.O0000000OOOOOO.O000000000),
                  Math.max(1.0F, this.O00000000(1.0F)),
                  (float)Math.round(this.O0000000OOOOOO.O00000000000),
                  0.0F,
                  var3
               );
            }

            if (this.O0000000OO0000) {
               o0000O00OO0O0.O00000000(
                  (float)Math.round(this.O0000000OOOOOO.O00000000),
                  (float)Math.round(this.O0000000OOOOOO.O000000000 + this.O0000000OOOOOO.O00000000000 * 0.5F),
                  (float)Math.round(this.O0000000OOOOOO.O0000000000),
                  Math.max(1.0F, this.O00000000(1.0F)),
                  0.0F,
                  var3
               );
            }
         }

         float var13 = !this.O0000000OO0 && !this.O0000000OO00 ? 0.0F : 1.0F;
         float var4 = Math.min(this.O00000000(10.0F), Math.min(this.O0000000OOO0O0.O0000000000, this.O0000000OOO0O0.O00000000000) * 0.25F);
         int var5 = ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(110.0F + var13 * 100.0F));
         if (var13 > 0.0F) {
            o0000O00OO0O0.O00000000(
               this.O0000000OOO0O0.O00000000,
               this.O0000000OOO0O0.O000000000,
               this.O0000000OOO0O0.O0000000000,
               this.O0000000OOO0O0.O00000000000,
               var4,
               this.O00000000(9.0F),
               this.O00000000(1.0F),
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 42)
            );
         }

         o0000O00OO0O0.O00000000(
            (float)Math.round(this.O0000000OOO0O0.O00000000),
            (float)Math.round(this.O0000000OOO0O0.O000000000),
            (float)Math.round(this.O0000000OOO0O0.O0000000000),
            (float)Math.round(this.O0000000OOO0O0.O00000000000),
            var4,
            var5,
            Math.max(1.0F, this.O00000000(1.25F))
         );
         float var6 = this.O00000000(17.0F);
         float var7 = Math.round(this.O0000000OOO0O0.O00000000 + this.O0000000OOO0O0.O0000000000 - var6 * 0.72F);
         float var8 = Math.round(this.O0000000OOO0O0.O000000000 + this.O0000000OOO0O0.O00000000000 - var6 * 0.72F);
         this.O000000O0.O00000000(var7 - this.O00000000(3.0F), var8 - this.O00000000(3.0F), var6 + this.O00000000(6.0F), var6 + this.O00000000(6.0F));
         float var9 = this.O000000000("preview.resize", !this.O000000O0.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO) && !this.O0000000OO00 ? 0.0F : 1.0F);
         float var10 = Math.max(1.0F, (float)Math.round(var6));
         o0000O00OO0O0.O00000000(
            var7,
            var8,
            var10,
            var10,
            this.O00000000(5.0F),
            ColorScheme.O00000000(ColorScheme.O00000000(o0000O000O0OO.O0000000000000(), 228), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 92), var9)
         );
         o0000O00OO0O0.O00000000(
            var7,
            var8,
            var10,
            var10,
            this.O00000000(5.0F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(105.0F + var9 * 100.0F)),
            Math.max(1.0F, this.O00000000(1.0F))
         );
         float var11 = Math.max(1.0F, this.O00000000(1.0F));
         int var12 = ColorScheme.O00000000(o0000O000O0OO.O000000000O(), Math.round(130.0F + var9 * 100.0F));
         o0000O00OO0O0.O00000000(
            (float)Math.round(var7 + this.O00000000(5.0F)),
            (float)Math.round(var8 + this.O00000000(11.0F)),
            Math.max(1.0F, (float)Math.round(this.O00000000(7.0F))),
            Math.max(1.0F, (float)Math.round(var11)),
            var11 * 0.5F,
            var12
         );
         o0000O00OO0O0.O00000000(
            (float)Math.round(var7 + this.O00000000(8.0F)),
            (float)Math.round(var8 + this.O00000000(8.0F)),
            Math.max(1.0F, (float)Math.round(this.O00000000(4.0F))),
            Math.max(1.0F, (float)Math.round(var11)),
            var11 * 0.5F,
            var12
         );
         o0000O00OO0O0.O00000000(
            (float)Math.round(var7 + this.O00000000(11.0F)),
            (float)Math.round(var8 + this.O00000000(5.0F)),
            Math.max(1.0F, (float)Math.round(var11)),
            Math.max(1.0F, (float)Math.round(var11)),
            var11 * 0.5F,
            var12
         );
      } else {
         this.O000000O0.O00000000();
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, HudConstructorScreen.W242 o00000000, String string) {
      if (o00000000 != null && !(o00000000.O0000000000 <= 0.0F) && !(o00000000.O00000000000 <= 0.0F)) {
         boolean var5 = string.equals(this.O000000O000);
         boolean var6 = o00000000.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO);
         float var7 = this.O0000000000(string, !var5 && !var6 ? 0.0F : 1.0F);
         int var8 = var5
            ? ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 210)
            : ColorScheme.O00000000(o0000O000O0OO.O000000000O(), Math.round(30.0F + var7 * 72.0F));
         o0000O00OO0O0.O00000000(
            (float)Math.round(o00000000.O00000000),
            (float)Math.round(o00000000.O000000000),
            Math.max(1.0F, (float)Math.round(o00000000.O0000000000)),
            Math.max(1.0F, (float)Math.round(o00000000.O00000000000)),
            this.O00000000(4.0F),
            var8,
            var5 ? Math.max(1.5F, this.O00000000(1.5F)) : Math.max(1.0F, this.O00000000(1.0F))
         );
      }
   }

   private String O00000000(float f, float g) {
      if (this.O0000000OOO00O.O00000000(f, g)) {
         return "title";
      } else if (this.O0000000OOO0O.O00000000(f, g)) {
         return "icon";
      } else if (this.O0000000OOOO0O.O00000000(f, g)) {
         return "slots";
      } else if (this.O0000000OOOO0.O00000000(f, g)) {
         return "modules";
      } else if (this.O0000000OOOO00.O00000000(f, g)) {
         return "binds";
      } else if (this.O0000000OOO0OO.O00000000(f, g)) {
         return "header";
      } else if (this.O0000000OOOO.O00000000(f, g)) {
         return "content";
      } else {
         return this.O0000000OOO0O0.O00000000(f, g) ? "panel" : null;
      }
   }

   private void O000000000(float f, float g) {
      if (!(this.O0000000OOOOOO.O0000000000 <= 0.0F)
         && !(this.O0000000OOOOOO.O00000000000 <= 0.0F)
         && !(this.O0000000OOO0O0.O0000000000 <= 0.0F)
         && !(this.O0000000OOO0O0.O00000000000 <= 0.0F)) {
         float var3 = this.O00000000(10.0F);
         float var4 = this.O0000000OOOOOO.O00000000 + var3;
         float var5 = this.O0000000OOOOOO.O000000000 + var3;
         float var6 = this.O0000000OOOOOO.O00000000 + this.O0000000OOOOOO.O0000000000 - this.O0000000OOO0O0.O0000000000 - var3;
         float var7 = this.O0000000OOOOOO.O000000000 + this.O0000000OOOOOO.O00000000000 - this.O0000000OOO0O0.O00000000000 - var3;
         float var8 = O00000000(this.O0000000OOO0O0.O00000000 + f, var4, Math.max(var4, var6));
         float var9 = O00000000(this.O0000000OOO0O0.O000000000 + g, var5, Math.max(var5, var7));
         float var10 = this.O00000000(7.0F);
         float var11 = this.O0000000OOOOOO.O00000000 + (this.O0000000OOOOOO.O0000000000 - this.O0000000OOO0O0.O0000000000) * 0.5F;
         float var12 = this.O0000000OOOOOO.O000000000 + (this.O0000000OOOOOO.O00000000000 - this.O0000000OOO0O0.O00000000000) * 0.5F;
         this.O0000000OO000 = Math.abs(var8 - var11) < var10;
         this.O0000000OO0000 = Math.abs(var9 - var12) < var10;
         if (this.O0000000OO000) {
            var8 = O00000000(var11, var4, Math.max(var4, var6));
         } else if (Math.abs(var8 - var4) < var10) {
            var8 = var4;
         } else if (Math.abs(var8 - var6) < var10) {
            var8 = Math.max(var4, var6);
         }

         if (this.O0000000OO0000) {
            var9 = O00000000(var12, var5, Math.max(var5, var7));
         } else if (Math.abs(var9 - var5) < var10) {
            var9 = var5;
         } else if (Math.abs(var9 - var7) < var10) {
            var9 = Math.max(var5, var7);
         }

         this.O0000000O0OOOO[this.O000000O000000] = this.O0000000O0OOOO[this.O000000O000000] + (var8 - this.O0000000OOO0O0.O00000000);
         this.O0000000OO[this.O000000O000000] = this.O0000000OO[this.O000000O000000] + (var9 - this.O0000000OOO0O0.O000000000);
         this.O00000000000(var8, var9);
      }
   }

   private void O0000000000(float f, float g) {
      float var3 = f - this.O0000000OO000O;
      float var4 = g - this.O0000000OO00O;
      float var5 = Math.max(1.0F, this.O0000000OO00O0 * this.O0000000OO00O0 + this.O0000000OO00OO * this.O0000000OO00OO);
      float var6 = 1.0F + (var3 * this.O0000000OO00O0 + var4 * this.O0000000OO00OO) / var5;
      O00000OO000O.W223 var7 = O00000OO000O.O00000000()
         .O00000000(this.O0000000000O0(), this.O0000000OO0O00 * var6, this.O0000000OO0OOO, this.O0000000OOO, this.O0000000OO0O, this.O0000000OO0O0);
      if (var7 != null) {
         float var8 = this.O00000000(this.O0000000OOOOOO.O0000000000, this.O0000000OOOOOO.O00000000000, this.O0000000OO0O, this.O0000000OO0O0, var7.scaleX());
         float var9 = var8 / this.O0000000OO0O0O;
         float var10 = this.O0000000OO00O0 * var9;
         float var11 = this.O0000000OO00OO * var9;
         this.O0000000O0OOOO[this.O000000O000000] = this.O0000000OO0OO + (var10 - this.O0000000OO00O0) * 0.5F;
         this.O0000000OO[this.O000000O000000] = this.O0000000OO0OO0 + (var11 - this.O0000000OO00OO) * 0.5F;
         this.O0000000OOO00 = true;
      }
   }

   private void O00000000000(float f, float g) {
      float var3 = this.O00000000(10.0F);
      float var4 = this.O0000000OOOOOO.O00000000 + var3;
      float var5 = this.O0000000OOOOOO.O000000000 + var3;
      float var6 = Math.max(1.0F, this.O0000000OOOOOO.O0000000000 - var3 * 2.0F - this.O0000000OOO0O0.O0000000000);
      float var7 = Math.max(1.0F, this.O0000000OOOOOO.O00000000000 - var3 * 2.0F - this.O0000000OOO0O0.O00000000000);
      float var8 = this.O0000000OOO0O0.O0000000000 / Math.max(0.001F, this.O0000000O0OO00);
      float var9 = this.O0000000OOO0O0.O00000000000 / Math.max(0.001F, this.O0000000O0OO0O);
      O00000OO000O.O00000000()
         .O0000000000(this.O0000000000O0(), O00000000((f - var4) / var6, 0.0F, 1.0F), O00000000((g - var5) / var7, 0.0F, 1.0F), var8, var9);
      this.O0000000OOO00 = true;
   }

   private String O000000000000(float f, float g) {
      if (!this.O0000000OOOOO0.O00000000(f, g)) {
         return null;
      } else {
         for (Entry var4 : this.O0000000O0000O.entrySet()) {
            if (((HudConstructorScreen.W242)var4.getValue()).O00000000(f, g)) {
               return (String)var4.getKey();
            }
         }

         return null;
      }
   }

   private String O0000000000000(float f, float g) {
      if (!this.O0000000OOOOO0.O00000000(f, g)) {
         return null;
      } else {
         for (Entry var4 : this.O0000000O000O0.entrySet()) {
            if (!"close".equals(var4.getKey()) && ((HudConstructorScreen.W242)var4.getValue()).O00000000(f, g)) {
               return (String)var4.getKey();
            }
         }

         return null;
      }
   }

   private String O000000000000O(float f, float g) {
      if (!this.O0000000OOOOO0.O00000000(f, g)) {
         return null;
      } else {
         for (Entry var4 : this.O0000000O000O.entrySet()) {
            if (((HudConstructorScreen.W242)var4.getValue()).O00000000(f, g)) {
               return (String)var4.getKey();
            }
         }

         return null;
      }
   }

   private void O000000000(float f) {
      O00000OO0OO0O.W239 var2 = this.O00000000000O0();
      HudConstructorScreen.W245 var3 = this.O000000000(this.O000000O00000);
      HudConstructorScreen.W242 var4 = this.O0000000O0000O.get(this.O000000O00000);
      if (var3 != null && var4 != null) {
         this.O00000000(var2, var3.id, this.O00000000(var4, f, var3.min, var3.max));
         var2.O000000000();
         this.O0000000O00O00.put(var3.id, O0000000000(this.O00000000(var2, var3.id)));
         this.O0000000OOO0 = true;
      }
   }

   private void O00000000(String string) {
      if ("reset".equals(string)) {
         this.O0000000000000();
      } else if ("centerX".equals(string)) {
         this.O00000000(true, false);
      } else if ("centerY".equals(string)) {
         this.O00000000(false, true);
      } else {
         O00000OO0OO0O.W239 var2 = this.O00000000000O0();
         if ("presetSoft".equals(string)) {
            this.O000000000(var2);
         } else if ("presetCompact".equals(string)) {
            this.O0000000000(var2);
         } else if ("presetSharp".equals(string)) {
            this.O00000000000(var2);
         }

         var2.O000000000();
         this.O0000000000OO0();
         this.O0000000OOO0 = true;
      }
   }

   private void O00000000(boolean bl, boolean bl2) {
      if (this.O00000000000O() == null && !"content".equals(this.O000000O000)) {
         this.O000000000(bl, bl2);
      } else {
         HudConstructorScreen.W242 var3 = this.O000000000000O();
         if (var3 != null && !(var3.O0000000000 <= 0.0F) && !(this.O0000000OOO0O0.O0000000000 <= 0.0F)) {
            O00000OO0OO0O.W239 var4 = this.O00000000000O0();
            float var5 = bl
               ? (this.O0000000OOO0O0.O00000000 + this.O0000000OOO0O0.O0000000000 * 0.5F - (var3.O00000000 + var3.O0000000000 * 0.5F))
                  / Math.max(0.001F, this.O0000000O0OO00)
               : 0.0F;
            float var6 = bl2
               ? (this.O0000000OOO0O0.O000000000 + this.O0000000OOO0O0.O00000000000 * 0.5F - (var3.O000000000 + var3.O00000000000 * 0.5F))
                  / Math.max(0.001F, this.O0000000O0OO0O)
               : 0.0F;
            if ("title".equals(this.O000000O000)) {
               var4.O0000000000OO0.O00000000 += var5;
               var4.O0000000000OO0.O000000000 += var6;
            } else if ("icon".equals(this.O000000O000)) {
               var4.O0000000000OOO.O00000000 += var5;
            } else if ("modules".equals(this.O000000O000)) {
               var4.O000000000O.O00000000 += var5;
               var4.O000000000O.O000000000 += var6;
            } else if ("binds".equals(this.O000000O000)) {
               var4.O000000000O0.O00000000 += var5;
               var4.O000000000O0.O000000000 += var6;
            } else if ("content".equals(this.O000000O000)) {
               var4.O000000000O.O00000000 += var5;
               var4.O000000000O0.O00000000 += var5;
               var4.O000000000O.O000000000 += var6;
               var4.O000000000O0.O000000000 += var6;
            }

            var4.O000000000();
            this.O0000000000OOO();
            this.O0000000OOO0 = true;
         }
      }
   }

   private void O000000000(boolean bl, boolean bl2) {
      if (!(this.O0000000OOO0O0.O0000000000 <= 0.0F)
         && !(this.O0000000OOO0O0.O00000000000 <= 0.0F)
         && !(this.O0000000OOOOOO.O0000000000 <= 0.0F)
         && !(this.O0000000OOOOOO.O00000000000 <= 0.0F)) {
         float var3 = bl
            ? this.O0000000OOOOOO.O00000000 + (this.O0000000OOOOOO.O0000000000 - this.O0000000OOO0O0.O0000000000) * 0.5F
            : this.O0000000OOO0O0.O00000000;
         float var4 = bl2
            ? this.O0000000OOOOOO.O000000000 + (this.O0000000OOOOOO.O00000000000 - this.O0000000OOO0O0.O00000000000) * 0.5F
            : this.O0000000OOO0O0.O000000000;
         this.O0000000O0OOOO[this.O000000O000000] = this.O0000000O0OOOO[this.O000000O000000] + (var3 - this.O0000000OOO0O0.O00000000);
         this.O0000000OO[this.O000000O000000] = this.O0000000OO[this.O000000O000000] + (var4 - this.O0000000OOO0O0.O000000000);
         this.O00000000000(var3, var4);
      }
   }

   private void O0000000000000() {
      O00000OO0OO0O.O000000000(this.O0000000000O0());
      this.O000000O000 = this.O000000000(this.O0000000000O().kind);
      this.O0000000O0OOO = 0.0F;
      this.O0000000O0OOOO[this.O000000O000000] = 0.0F;
      this.O0000000OO[this.O000000O000000] = 0.0F;
      this.O0000000OOO0 = false;
      this.O0000000OOO00 = false;
      this.O0000000000OO0();
      this.O0000000000OOO();
   }

   private HudConstructorScreen.W242 O000000000000O() {
      String var1 = this.O000000O000;

      return switch (var1) {
         case "header" -> this.O0000000OOO0OO;
         case "modules" -> this.O0000000OOOO0;
         case "binds" -> this.O0000000OOOO00;
         case "content" -> this.O0000000OOOO;
         case "title" -> this.O0000000OOO00O;
         case "icon" -> this.O0000000OOO0O;
         case "slots" -> this.O0000000OOOO0O;
         default -> this.O0000000OOO0O0;
      };
   }

   private O00000OO0OO0O.W241 O00000000000O() {
      O00000OO0OO0O.W239 var1 = this.O00000000000O0();
      String var2 = this.O000000O000;

      return switch (var2) {
         case "title" -> var1.O0000000000OO0;
         case "icon" -> var1.O0000000000OOO;
         case "modules" -> var1.O000000000O;
         case "binds" -> var1.O000000000O0;
         default -> null;
      };
   }

   private void O000000000(O00000OO0OO0O.W239 o00000000) {
      o00000000.O00000000 = 17.0F;
      o00000000.O000000000 = 13.0F;
      o00000000.O0000000000 = 10.0F;
      o00000000.O00000000000 = 10.0F;
      o00000000.O000000000000 = 10.0F;
      o00000000.O0000000000000 = 8.0F;
      o00000000.O000000000000O = 6.0F;
      o00000000.O00000000000O = 8.0F;
      o00000000.O00000000000O0 = 6.0F;
      o00000000.O00000000000OO = Math.max(30.0F, o00000000.O00000000000OO);
      o00000000.O0000000000O = Math.max(22.0F, o00000000.O0000000000O);
      o00000000.O0000000000O0O = 10.0F;
      o00000000.O0000000000OO = 2.4F;
   }

   private void O0000000000(O00000OO0OO0O.W239 o00000000) {
      o00000000.O00000000 = 10.0F;
      o00000000.O000000000 = 8.0F;
      o00000000.O0000000000 = 5.0F;
      o00000000.O00000000000 = 5.0F;
      o00000000.O000000000000 = 5.0F;
      o00000000.O0000000000000 = 4.0F;
      o00000000.O000000000000O = 3.0F;
      o00000000.O00000000000O = 5.0F;
      o00000000.O00000000000O0 = 3.0F;
      o00000000.O00000000000OO = Math.min(28.0F, Math.max(22.0F, o00000000.O00000000000OO));
      o00000000.O0000000000O = 18.0F;
      o00000000.O0000000000O0O = -6.0F;
      o00000000.O0000000000OO = 1.4F;
   }

   private void O00000000000(O00000OO0OO0O.W239 o00000000) {
      o00000000.O00000000 = 4.0F;
      o00000000.O000000000 = 3.0F;
      o00000000.O0000000000 = 2.0F;
      o00000000.O00000000000 = 2.0F;
      o00000000.O000000000000 = 2.0F;
      o00000000.O0000000000000 = 1.0F;
      o00000000.O000000000000O = 1.0F;
      o00000000.O00000000000O = 7.0F;
      o00000000.O00000000000O0 = 5.0F;
      o00000000.O00000000000OO = 32.0F;
      o00000000.O0000000000O = 22.0F;
      o00000000.O0000000000O0O = 0.0F;
      o00000000.O0000000000OO = 2.0F;
   }

   private HudConstructorScreen.W245 O000000000(String string) {
      for (HudConstructorScreen.W245 var5 : O00000000O0OO0) {
         if (var5.id.equals(string)) {
            return var5;
         }
      }

      return null;
   }

   private float O00000000(O00000OO0OO0O.W239 o00000000, String string) {
      return switch (string) {
         case "panelRadius" -> o00000000.O00000000;
         case "headerRadius" -> o00000000.O000000000;
         case "contentRadius" -> o00000000.O0000000000;
         case "modulesRadius" -> o00000000.O00000000000;
         case "bindsRadius" -> o00000000.O000000000000;
         case "rowRadius" -> o00000000.O0000000000000;
         case "slotRadius" -> o00000000.O000000000000O;
         case "padding" -> o00000000.O00000000000O;
         case "gap" -> o00000000.O00000000000O0;
         case "headerHeight" -> o00000000.O00000000000OO;
         case "rowHeight" -> o00000000.O0000000000O;
         case "titleSize" -> o00000000.O0000000000O0;
         case "iconSize" -> o00000000.O0000000000O00;
         case "bindWidth" -> o00000000.O0000000000O0O;
         case "accentWidth" -> o00000000.O0000000000OO;
         default -> 0.0F;
      };
   }

   private void O00000000(O00000OO0OO0O.W239 o00000000, String string, float f) {
      switch (string) {
         case "panelRadius":
            o00000000.O00000000 = f;
            break;
         case "headerRadius":
            o00000000.O000000000 = f;
            break;
         case "contentRadius":
            o00000000.O0000000000 = f;
            break;
         case "modulesRadius":
            o00000000.O00000000000 = f;
            break;
         case "bindsRadius":
            o00000000.O000000000000 = f;
            break;
         case "rowRadius":
            o00000000.O0000000000000 = f;
            break;
         case "slotRadius":
            o00000000.O000000000000O = f;
            break;
         case "padding":
            o00000000.O00000000000O = f;
            break;
         case "gap":
            o00000000.O00000000000O0 = f;
            break;
         case "headerHeight":
            o00000000.O00000000000OO = f;
            break;
         case "rowHeight":
            o00000000.O0000000000O = f;
            break;
         case "titleSize":
            o00000000.O0000000000O0 = f;
            break;
         case "iconSize":
            o00000000.O0000000000O00 = f;
            break;
         case "bindWidth":
            o00000000.O0000000000O0O = f;
            break;
         case "accentWidth":
            o00000000.O0000000000OO = f;
      }
   }

   private float O00000000(HudConstructorScreen.W242 o00000000, float f, float g, float h) {
      float var5 = o00000000.O0000000000 <= 0.0F ? 0.0F : O00000000((f - o00000000.O00000000) / o00000000.O0000000000, 0.0F, 1.0F);
      return g + (h - g) * var5;
   }

   private O00000OO0OO0O.W239 O00000000000O0() {
      return O00000OO0OO0O.O00000000(this.O0000000000O0());
   }

   private HudElement O00000000000OO() {
      String var1 = this.O0000000000O0();

      return (HudElement)(switch (var1) {
         case "HUD_Inventory" -> InventoryHud.O000000000();
         case "HUD_Potions" -> PotionsHud.O000000000();
         case "HUD_CoolDowns" -> CooldownsHud.O000000000();
         case "HUD_Info" -> InformationHud.O000000000();
         case "HUD_WaterMark" -> WatermarkHud.O000000000();
         case "HUD_ArrayList" -> ArrayListHud.O000000000();
         case "HUD_TargetHUD" -> TargetHud.O000000000();
         case "hud_armor" -> ArmorHud.O000000000();
         case "HUD_HotBar" -> HotbarHud.O000000000();
         case "HUD_Notifications" -> NotificationsHud.O000000000();
         case "HUD_MusicPlayer" -> MusicPlayerHud.O000000000();
         case "HUD_ServerHelper" -> ServerHelperHud.O000000000();
         default -> KeybindHud.O000000000();
      });
   }

   private HudConstructorScreen.W244 O0000000000O() {
      return O00000000O0OOO[Math.max(0, Math.min(O00000000O0OOO.length - 1, this.O000000O000000))];
   }

   private boolean O00000000(HudConstructorScreen.W244 o0000000000) {
      if (o0000000000 == null) {
         return false;
      } else {
         try {
            return HudModule.O000000000O.O000000000(o0000000000.settingName);
         } catch (Throwable var3) {
            return false;
         }
      }
   }

   private String O0000000000O0() {
      return this.O0000000000O().id;
   }

   private boolean O0000000000(String string) {
      return "title".equals(string) || "icon".equals(string) || "modules".equals(string) || "binds".equals(string);
   }

   private void O0000000000O00() {
      if (this.O0000000OOO0) {
         this.O0000000OOO0 = false;
         O00000OO0OO0O.O000000000000();
      }

      if (this.O0000000OOO00) {
         this.O0000000OOO00 = false;
         if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
            WildClient.O00000000.O0000000000O00.O0000000000();
         }
      }
   }

   private String O0000000000O0O() {
      String var1 = this.O000000O000;

      return switch (var1) {
         case "panel" -> "Panel";
         case "header" -> "Header";
         case "modules" -> "Modules block";
         case "binds" -> "Binds block";
         case "content" -> "Content group";
         case "icon" -> "Icon";
         case "slots" -> "Slots";
         default -> "Title";
      };
   }

   private String O00000000000(String string) {
      return switch (string) {
         case "panel" -> "Panel";
         case "header" -> "Header";
         case "modules" -> "Modules";
         case "binds" -> "Binds";
         case "content" -> "Content";
         case "icon" -> "Icon";
         case "slots" -> "Slots";
         default -> "Title";
      };
   }

   private void O0000000000OO() {
      O00000OO0OO0O.W239 var1 = this.O00000000000O0();
      this.O00000000("title.x", var1.O0000000000OO0.O00000000);
      this.O00000000("title.y", var1.O0000000000OO0.O000000000);
      this.O00000000("icon.x", var1.O0000000000OOO.O00000000);
      this.O00000000("icon.y", var1.O0000000000OOO.O000000000);
      this.O00000000("modules.x", var1.O000000000O.O00000000);
      this.O00000000("modules.y", var1.O000000000O.O000000000);
      this.O00000000("binds.x", var1.O000000000O0.O00000000);
      this.O00000000("binds.y", var1.O000000000O0.O000000000);

      for (HudConstructorScreen.W245 var5 : O00000000O0OO0) {
         float var6 = O00000000((this.O00000000(var1, var5.id) - var5.min) / Math.max(0.001F, var5.max - var5.min), 0.0F, 1.0F);
         this.O00000000(var5.id, var6);
         this.O000000000000(var5.id + ".thumb");
      }

      for (HudConstructorScreen.W244 var15 : O00000000O0OOO) {
         this.O000000000000(var15.id);
      }

      for (String var16 : O00000000O0O0O) {
         this.O000000000000(var16);
         O0000O00O0OO var17 = new O0000O00O0OO();
         var17.O0000000000000(0.0);
         this.O0000000O00O0.put(var16, var17);
      }

      for (String var12 : this.O0000000O000O0.keySet()) {
         this.O000000000000(var12);
      }

      this.O000000000000("preview.resize");
   }

   private void O00000000(String string, float f) {
      O0000O00O0OO var3 = new O0000O00O0OO();
      var3.O0000000000000(f);
      this.O0000000O000OO.put(string, var3);
   }

   private void O000000000000(String string) {
      if (!this.O0000000O00O.containsKey(string)) {
         O0000O00O0OO var2 = new O0000O00O0OO();
         var2.O0000000000000(0.0);
         this.O0000000O00O.put(string, var2);
      }
   }

   private void O0000000000OO0() {
      O00000OO0OO0O.W239 var1 = this.O00000000000O0();

      for (HudConstructorScreen.W245 var5 : O00000000O0OO0) {
         this.O0000000O00O00.put(var5.id, O0000000000(this.O00000000(var1, var5.id)));
      }
   }

   private void O0000000000OOO() {
      O00000OO0OO0O.W241 var1 = this.O00000000000O();
      if (var1 == null) {
         this.O000000O00000O = "";
         this.O000000O0000O = "";
         this.O000000O0000O0 = "";
      } else {
         this.O000000O00000O = String.format(Locale.ROOT, "X %.1f", var1.O00000000);
         this.O000000O0000O = String.format(Locale.ROOT, "Y %.1f", var1.O000000000);
         this.O000000O0000O0 = String.format(Locale.ROOT, "X %.1f    Y locked", var1.O00000000);
      }
   }

   private float O00000000(float f, String string) {
      O0000O00O0OO var3 = this.O0000000O000OO.get(string);
      if (var3 == null) {
         return f;
      } else {
         var3.O00000000();
         var3.O00000000(f, this.O000000O0000 == null ? 0.18F : 0.1F, O0000O00O0OO0O.O0000000000O0O, false);
         return var3.O000000000000();
      }
   }

   private float O000000000(String string, float f) {
      O0000O00O0OO var3 = this.O0000000O00O.get(string);
      if (var3 == null) {
         return f;
      } else {
         var3.O00000000();
         var3.O00000000(f, 0.14F, O0000O00O0OO0O.O0000000000O0O, false);
         return var3.O000000000000();
      }
   }

   private float O0000000000(String string, float f) {
      O0000O00O0OO var3 = this.O0000000O00O0.get(string);
      if (var3 == null) {
         return f;
      } else {
         var3.O00000000();
         var3.O00000000(f, 0.14F, O0000O00O0OO0O.O0000000000O0O, false);
         return var3.O000000000000();
      }
   }

   private boolean O00000000(HudConstructorScreen.W242 o00000000) {
      return o00000000 != null && o00000000.O00000000(this.O0000000O0O0O0, this.O0000000O0O0OO);
   }

   private void O00000000000O(float f, float g) {
      this.O0000000O0O0O0 = f;
      this.O0000000O0O0OO = g;
   }

   private void O000000000O() {
      if (this.client != null && this.client.getWindow() != null && this.client.mouse != null) {
         double var1 = this.client.getWindow().getFramebufferWidth();
         double var3 = this.client.getWindow().getFramebufferHeight();
         if (!(var1 <= 0.0) && !(var3 <= 0.0)) {
            double var5 = this.client.mouse.getX();
            double var7 = this.client.mouse.getY();
            if (var5 >= 0.0 && var7 >= 0.0 && var5 <= var1 + 2.0 && var7 <= var3 + 2.0) {
               this.O00000000000O((float)var5, (float)var7);
            }
         }
      }
   }

   private float O00000000(double d) {
      if (this.client != null && this.client.getWindow() != null) {
         int var3 = this.client.getWindow().getFramebufferWidth();
         int var4 = this.client.getWindow().getScaledWidth();
         return var3 > 0 && var4 > 0 ? (float)(d * var3 / Math.max(1.0, (double)var4)) : (float)d;
      } else {
         return (float)d;
      }
   }

   private float O000000000(double d) {
      if (this.client != null && this.client.getWindow() != null) {
         int var3 = this.client.getWindow().getFramebufferHeight();
         int var4 = this.client.getWindow().getScaledHeight();
         return var3 > 0 && var4 > 0 ? (float)(d * var3 / Math.max(1.0, (double)var4)) : (float)d;
      } else {
         return (float)d;
      }
   }

   private static void O00000000(HudConstructorScreen.W242 o00000000, HudConstructorScreen.W242 o000000002, HudConstructorScreen.W242 o000000003) {
      if (o00000000 != null) {
         if (o000000002 == null || o000000002.O0000000000 <= 0.0F || o000000002.O00000000000 <= 0.0F) {
            o00000000.O00000000(o000000003);
         } else if (o000000003 != null && !(o000000003.O0000000000 <= 0.0F) && !(o000000003.O00000000000 <= 0.0F)) {
            float var3 = Math.min(o000000002.O00000000, o000000003.O00000000);
            float var4 = Math.min(o000000002.O000000000, o000000003.O000000000);
            float var5 = Math.max(o000000002.O00000000 + o000000002.O0000000000, o000000003.O00000000 + o000000003.O0000000000);
            float var6 = Math.max(o000000002.O000000000 + o000000002.O00000000000, o000000003.O000000000 + o000000003.O00000000000);
            o00000000.O00000000(var3, var4, var5 - var3, var6 - var4);
         } else {
            o00000000.O00000000(o000000002);
         }
      }
   }

   private static String O0000000000(float f) {
      return String.format(Locale.ROOT, "%.1f", f);
   }

   private static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }

   private static int O00000000(int i, int j, int k, int l) {
      return RenderManager.W382.O00000000000(i, j, k, Math.max(0, Math.min(255, l)));
   }

   private static int O00000000(ColorScheme o0000O000O0OO, int i) {
      return ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.max(0, Math.min(255, i)));
   }

   private static int O000000000(ColorScheme o0000O000O0OO, int i) {
      return ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.max(0, Math.min(255, i)));
   }

   private static int O00000000(ColorScheme o0000O000O0OO) {
      return ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O000() ? 150 : 168);
   }

   private static int O000000000(ColorScheme o0000O000O0OO) {
      return ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O000() ? 128 : 98);
   }

   private static float O00000000000O0(float f, float g) {
      double var2 = (float)(System.currentTimeMillis() % (long)Math.max(1.0F, f)) / Math.max(1.0F, f);
      return (float)(0.5 + 0.5 * Math.sin((var2 + g) * Math.PI * 2.0));
   }

   private static float O00000000000OO(float f, float g) {
      return f + g * 0.3F;
   }

   private void O00000000(RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, String string, float f, float g, float h, float i, int j) {
      float var9 = TextMeasureCache.O000000000(o0000O0O00O00O, string, i);
      o0000O00OO0O0.O00000000(o0000O0O00O00O, Math.round(f + (h - var9) * 0.5F), Math.round(O00000000000OO(g + h * 0.5F, i)), i, string, j);
   }

   private void O00000000(RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, String string, float f, float g, float h, float i, float j, int k) {
      float var10 = TextMeasureCache.O000000000(o0000O0O00O00O, string, j);
      o0000O00OO0O0.O00000000(o0000O0O00O00O, Math.round(f + (h - var10) * 0.5F), Math.round(O00000000000OO(g + i * 0.5F, j)), j, string, k);
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, int j) {
      o0000O00OO0O0.O00000000(f, g);
      o0000O00OO0O0.O000000000(45.0F);
      o0000O00OO0O0.O00000000(-h, -i * 0.5F, h * 2.0F, i, i * 0.5F, j);
      o0000O00OO0O0.O000000000000O();
      o0000O00OO0O0.O000000000(-45.0F);
      o0000O00OO0O0.O00000000(-h, -i * 0.5F, h * 2.0F, i, i * 0.5F, j);
      o0000O00OO0O0.O000000000000O();
      o0000O00OO0O0.O00000000000O();
   }

   static final class W242 {
      float O00000000;
      float O000000000;
      float O0000000000;
      float O00000000000;

      W242() {
         this(0.0F, 0.0F, 0.0F, 0.0F);
      }

      W242(float f, float g, float h, float i) {
         this.O00000000(f, g, h, i);
      }

      HudConstructorScreen.W242 O00000000(float f, float g, float h, float i) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         this.O00000000000 = i;
         return this;
      }

      HudConstructorScreen.W242 O00000000(HudConstructorScreen.W242 o00000000) {
         return o00000000 == null ? this.O00000000() : this.O00000000(o00000000.O00000000, o00000000.O000000000, o00000000.O0000000000, o00000000.O00000000000);
      }

      HudConstructorScreen.W242 O00000000() {
         return this.O00000000(0.0F, 0.0F, 0.0F, 0.0F);
      }

      static HudConstructorScreen.W242 O000000000() {
         return new HudConstructorScreen.W242();
      }

      boolean O00000000(float f, float g) {
         return f >= this.O00000000 && g >= this.O000000000 && f <= this.O00000000 + this.O0000000000 && g <= this.O000000000 + this.O00000000000;
      }
   }

   static enum W243 {
      KEYBINDS,
      INVENTORY,
      POTIONS,
      COOLDOWNS,
      INFO,
      WATERMARK,
      ARRAYLIST,
      TARGET,
      SLOTS,
      HOTBAR,
      NOTIFICATION,
      MEDIA,
      SERVER;
   }

   record W244(String id, String label, String settingName, FontObject iconFont, String icon, HudConstructorScreen.W243 kind, boolean layoutBacked) {
   }

   record W245(String id, String label, String section, float min, float max) {
   }
}
