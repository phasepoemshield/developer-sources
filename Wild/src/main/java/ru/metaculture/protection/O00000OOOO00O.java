package ru.metaculture.protection;

public enum O00000OOOO00O {
   PREVIEW_ONLY("preview", "Preview", "live editor preview", false, false, false, false, false),
   HUD("hud", "HUD", "screen-space HUD shader", false, true, false, false, true),
   MODULE_CARD("module_card", "Module Card", "module row surface and hover body", false, true, false, false, true),
   PANEL_BACKGROUND("panel_background", "Panel Background", "dock and settings panel surface", true, false, false, false, true),
   AUDIT_PANEL("audit_panel", "Audit Panel", "verification and diagnostics panel surface", true, true, false, false, false),
   BUTTON("button", "Button", "interactive button surface", false, true, false, false, true),
   HEALTH_BAR("health_bar", "Health Bar", "bar fill and shield style shader", false, true, false, false, true),
   ESP("esp", "ESP", "entity silhouette shader", false, false, true, false, true),
   CHAMS("chams", "Chams", "model-space entity material overlay", false, false, true, true, true),
   SKY("sky", "Sky", "world sky and atmospheric pass", false, false, false, false, true),
   NAMETAG("nametag", "Nametag", "billboard nametag surface", false, true, false, true, true),
   TRAILS("trails", "Trails", "motion trail ribbon material", false, false, true, true, true),
   BACKGROUND("background", "Background", "full-screen interface background", true, false, false, false, true),
   MENU_BACKGROUND("menu_bg", "Menu Background", "legacy full ClickGUI background", true, false, false, false, false),
   MENU_PANEL_BG("menu_panel", "Panel Background", "legacy panel surface", true, false, false, false, false),
   HUD_OVERLAY("hud_overlay", "HUD Overlay", "legacy HUD overlay", false, true, false, false, false),
   ESP_OVERLAY("esp_overlay", "ESP Overlay", "legacy ESP fill", false, false, true, false, false),
   ENTITY_HIGHLIGHT("entity_highlight", "Entity Highlight", "legacy entity highlight", false, false, false, true, false);

   private final String O00000000;
   private final String O000000000;
   private final String O0000000000;
   private final boolean O00000000000;
   private final boolean O000000000000;
   private final boolean O0000000000000;
   private final boolean O000000000000O;
   private final boolean O00000000000O;

   private O00000OOOO00O(String string2, String string3, String string4, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
      this.O00000000 = string2;
      this.O000000000 = string3;
      this.O0000000000 = string4;
      this.O00000000000 = bl;
      this.O000000000000 = bl2;
      this.O0000000000000 = bl3;
      this.O000000000000O = bl4;
      this.O00000000000O = bl5;
   }

   public String O00000000() {
      return this.O00000000;
   }

   public String O000000000() {
      return this.O000000000;
   }

   public String O0000000000() {
      return this.O0000000000;
   }

   public O00000OOOO00O O00000000000() {
      return switch (this) {
         case PREVIEW_ONLY -> PREVIEW_ONLY;
         case HUD, MODULE_CARD, PANEL_BACKGROUND, AUDIT_PANEL, BUTTON, HEALTH_BAR, NAMETAG, MENU_PANEL_BG, HUD_OVERLAY -> HUD;
         case ESP, CHAMS, TRAILS, ESP_OVERLAY, ENTITY_HIGHLIGHT -> ESP;
         case SKY, BACKGROUND, MENU_BACKGROUND -> BACKGROUND;
      };
   }

   public String O000000000000() {
      return switch (this) {
         case PREVIEW_ONLY -> "System";
         case HUD, MODULE_CARD, BUTTON, HEALTH_BAR, HUD_OVERLAY -> "HUD";
         case PANEL_BACKGROUND, AUDIT_PANEL, BACKGROUND, MENU_BACKGROUND, MENU_PANEL_BG -> "Interface";
         case ESP, CHAMS, NAMETAG, TRAILS, ESP_OVERLAY, ENTITY_HIGHLIGHT -> "Entity";
         case SKY -> "World";
      };
   }

   public boolean O0000000000000() {
      return this.O00000000000() == HUD || this == PANEL_BACKGROUND || this == AUDIT_PANEL || this == MENU_PANEL_BG;
   }

   public boolean O000000000000O() {
      return this.O00000000000O;
   }

   public boolean O00000000000O() {
      return this.O00000000000() == ESP;
   }

   public boolean O00000000000O0() {
      return this.O00000000000() == BACKGROUND && (this == BACKGROUND || this == MENU_BACKGROUND);
   }

   public boolean O00000000000OO() {
      return this.O00000000000 && (this == MENU_PANEL_BG || this == PANEL_BACKGROUND || this == AUDIT_PANEL);
   }

   public boolean O0000000000O() {
      return this.O00000000000() == HUD;
   }

   public boolean O0000000000O0() {
      return this.O00000000000() == ESP && !this.O000000000000O;
   }

   public boolean O0000000000O00() {
      return this.O000000000000O;
   }

   public static O00000OOOO00O[] O0000000000O0O() {
      return new O00000OOOO00O[]{HUD, BACKGROUND, ESP};
   }

   public static O00000OOOO00O O00000000(String string) {
      if (string == null) {
         return PREVIEW_ONLY;
      } else {
         String var1 = string.trim();

         for (O00000OOOO00O var5 : values()) {
            if (var5.O00000000.equals(var1) || var5.name().equalsIgnoreCase(var1)) {
               return var5;
            }
         }

         return PREVIEW_ONLY;
      }
   }
}
