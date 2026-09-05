package ru.metaculture.protection;

public enum VnuVUNUv {
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

   private final String UuUVuuUu;
   private final String C00OOC00oO;
   private final String uUnuvNvvNU;
   private final boolean vVvUvVVuuNvV;
   private final boolean uNNnnnuuuN;
   private final boolean nuUnNvnuUu;
   private final boolean VVuuUN;
   private final boolean vNUvnnVnUvu;

   private VnuVUNUv(String var3, String var4, String var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10) {
      this.UuUVuuUu = var3;
      this.C00OOC00oO = var4;
      this.uUnuvNvvNU = var5;
      this.vVvUvVVuuNvV = var6;
      this.uNNnnnuuuN = var7;
      this.nuUnNvnuUu = var8;
      this.VVuuUN = var9;
      this.vNUvnnVnUvu = var10;
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public String C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public String uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public VnuVUNUv vVvUvVVuuNvV() {
      return switch (this) {
         case PREVIEW_ONLY -> PREVIEW_ONLY;
         case HUD, MODULE_CARD, PANEL_BACKGROUND, AUDIT_PANEL, BUTTON, HEALTH_BAR, NAMETAG, MENU_PANEL_BG, HUD_OVERLAY -> HUD;
         case ESP, CHAMS, TRAILS, ESP_OVERLAY, ENTITY_HIGHLIGHT -> ESP;
         case SKY, BACKGROUND, MENU_BACKGROUND -> BACKGROUND;
      };
   }

   public String uNNnnnuuuN() {
      return switch (this) {
         case PREVIEW_ONLY -> "System";
         case HUD, MODULE_CARD, BUTTON, HEALTH_BAR, HUD_OVERLAY -> "HUD";
         case PANEL_BACKGROUND, AUDIT_PANEL, BACKGROUND, MENU_BACKGROUND, MENU_PANEL_BG -> "Interface";
         case ESP, CHAMS, NAMETAG, TRAILS, ESP_OVERLAY, ENTITY_HIGHLIGHT -> "Entity";
         case SKY -> "World";
      };
   }

   public boolean nuUnNvnuUu() {
      return this.vVvUvVVuuNvV() == HUD || this == PANEL_BACKGROUND || this == AUDIT_PANEL || this == MENU_PANEL_BG;
   }

   public boolean VVuuUN() {
      return this.vNUvnnVnUvu;
   }

   public boolean vNUvnnVnUvu() {
      return this.vVvUvVVuuNvV() == ESP;
   }

   public boolean uVUuuVnNVU() {
      if (this.vVvUvVVuuNvV() == BACKGROUND) {
         if (this == BACKGROUND) {
            return true;
         }

         if (this == MENU_BACKGROUND) {
            return true;
         }
      }

      return false;
   }

   public boolean vuuuNvNuv() {
      return this.vVvUvVVuuNvV && (this == MENU_PANEL_BG || this == PANEL_BACKGROUND || this == AUDIT_PANEL);
   }

   public boolean nvUVNnuu() {
      return this.vVvUvVVuuNvV() == HUD;
   }

   public boolean UuuNnUvUuv() {
      return this.vVvUvVVuuNvV() == ESP && !this.VVuuUN;
   }

   public boolean nUUVuvU() {
      return this.VVuuUN;
   }

   public static VnuVUNUv[] UnUNVVVNuv() {
      return new VnuVUNUv[]{HUD, BACKGROUND, ESP};
   }

   public static VnuVUNUv UuUVuuUu(String var0) {
      if (var0 == null) {
         return PREVIEW_ONLY;
      } else {
         String var1 = var0.trim();

         for (VnuVUNUv var5 : values()) {
            if (var5.UuUVuuUu.equals(var1) || var5.name().equalsIgnoreCase(var1)) {
               return var5;
            }
         }

         return PREVIEW_ONLY;
      }
   }
}
