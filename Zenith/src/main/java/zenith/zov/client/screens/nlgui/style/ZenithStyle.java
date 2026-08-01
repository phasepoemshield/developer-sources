package zenith.zov.client.screens.nlgui.style;

import com.google.gson.JsonObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import zenith.ByteBufferHolder;
import zenith.Setting;
import zenith.ColorSetting;

public class ZenithStyle {
   private String name;
   private final ColorSetting primaryColor = new ColorSetting(
      "nlgui.style.color.primaryColor", "nlgui.style.color.primaryColor.desc", GuiStyle.PRIMARY_COLOR
   );
   private final ColorSetting secondaryPrimaryColor = new ColorSetting(
      "nlgui.style.color.secondaryPrimaryColor", "nlgui.style.color.secondaryPrimaryColor.desc", GuiStyle.SECONDARY_PRIMARY_COLOR
   );
   private final ColorSetting glowColor1 = new ColorSetting(
      "nlgui.style.color.glowColor1", "nlgui.style.color.glowColor1.desc", GuiStyle.PRIMARY_COLOR.EventImpl_36(70)
   );
   private final ColorSetting glowColor2 = new ColorSetting(
      "nlgui.style.color.glowColor2", "nlgui.style.color.glowColor2.desc", GuiStyle.SECONDARY_PRIMARY_COLOR.EventImpl_36(70)
   );
   private final ColorSetting friendColor = new ColorSetting(
      "nlgui.style.color.friendColor", "nlgui.style.color.friendColor.desc", GuiStyle.FRIEND_COLOR
   );
   private final ColorSetting glareColor = new ColorSetting(
      "nlgui.style.color.glareColor", "nlgui.style.color.glareColor.desc", GuiStyle.GLARE_COLOR
   );
   private final ColorSetting leftBackground = new ColorSetting(
      "nlgui.style.color.leftBackground", "nlgui.style.color.leftBackground.desc", GuiStyle.LEFT_BACKGROUND
   );
   private final ColorSetting rightBackground = new ColorSetting(
      "nlgui.style.color.rightBackground", "nlgui.style.color.rightBackground.desc", GuiStyle.RIGHT_BACKGROUND
   );
   private final ColorSetting panelLeftBackground = new ColorSetting(
      "nlgui.style.color.panelLeftBackground", "nlgui.style.color.panelLeftBackground.desc", GuiStyle.PANEL_LEFT_BACKGROUND
   );
   private final ColorSetting surfaceEnableBackground = new ColorSetting(
      "nlgui.style.color.surfaceEnableBackground", "nlgui.style.color.surfaceEnableBackground.desc", GuiStyle.SURFACE_ENABLE_BACKGROUND
   );
   private final ColorSetting headerDisableBackground = new ColorSetting(
      "nlgui.style.color.headerDisableBackground", "nlgui.style.color.headerDisableBackground.desc", GuiStyle.HEADER_DISABLE_BACKGROUND
   );
   private final ColorSetting surfaceDisableBackground = new ColorSetting(
      "nlgui.style.color.surfaceDisableBackground", "nlgui.style.color.surfaceDisableBackground.desc", GuiStyle.SURFACE_DISABLE_BACKGROUND
   );
   private final ColorSetting fieldSurfaceBackground = new ColorSetting(
      "nlgui.style.color.fieldSurfaceBackground", "nlgui.style.color.fieldSurfaceBackground.desc", GuiStyle.FIELD_SURFACE_BACKGROUND
   );
   private final ColorSetting fieldBorder = new ColorSetting(
      "nlgui.style.color.fieldBorder", "nlgui.style.color.fieldBorder.desc", GuiStyle.FIELD_BORDER
   );
   private final ColorSetting disableActiveBg = new ColorSetting(
      "nlgui.style.color.disableActiveBg", "nlgui.style.color.disableActiveBg.desc", GuiStyle.DISABLE_ACTIVE_BG
   );
   private final ColorSetting textEnable = new ColorSetting(
      "nlgui.style.color.textEnable", "nlgui.style.color.textEnable.desc", GuiStyle.TEXT_ENABLE
   );
   private final ColorSetting textTertiary = new ColorSetting(
      "nlgui.style.color.textTertiary", "nlgui.style.color.textTertiary.desc", GuiStyle.TEXT_TERTIARY
   );
   private final ColorSetting textSecondary = new ColorSetting(
      "nlgui.style.color.textSecondary", "nlgui.style.color.textSecondary.desc", GuiStyle.TEXT_SECONDARY
   );
   private final ColorSetting heartActiveBg = new ColorSetting(
      "nlgui.style.color.heartActiveBg", "nlgui.style.color.heartActiveBg.desc", GuiStyle.HEART_ACTIVE_BG
   );
   private final ColorSetting heartIcon = new ColorSetting("nlgui.style.color.heartIcon", "nlgui.style.color.heartIcon.desc", GuiStyle.HEART_ICON);
   private final ColorSetting hudBackground = new ColorSetting(
      "nlgui.style.color.hudBackground", "nlgui.style.color.hudBackground.desc", GuiStyle.HUD_BACKGROUND
   );
   private final ColorSetting headerHudBackground = new ColorSetting(
      "nlgui.style.color.headerHudBackground", "nlgui.style.color.headerHudBackground.desc", GuiStyle.HEADER_HUD_BACKGROUND
   );

   public ZenithStyle() {
      this("");
   }

   public ZenithStyle(String s) {
      this.name = s;
   }

   public void setDefaultsFromGuiStyle(ByteBufferHolder il1iliilli1l1iill) {
      this.setDefaultsFromGuiStyle();
      this.leftBackground.setColor(il1iliilli1l1iill.EventImpl_36(this.leftBackground.l1IllIl1l1llIlI11I11Il1l1l1lI1().I11Ill1I1I1llll11Il1I1I()));
      this.rightBackground.setColor(il1iliilli1l1iill.EventImpl_36(this.rightBackground.l1IllIl1l1llIlI11I11Il1l1l1lI1().I11Ill1I1I1llll11Il1I1I()));
      this.panelLeftBackground
         .setColor(il1iliilli1l1iill.EventImpl_36(this.panelLeftBackground.l1IllIl1l1llIlI11I11Il1l1l1lI1().I11Ill1I1I1llll11Il1I1I()));
      this.surfaceEnableBackground
         .setColor(il1iliilli1l1iill.EventImpl_36(this.surfaceEnableBackground.l1IllIl1l1llIlI11I11Il1l1l1lI1().I11Ill1I1I1llll11Il1I1I()));
      this.headerDisableBackground
         .setColor(il1iliilli1l1iill.EventImpl_36(this.headerDisableBackground.l1IllIl1l1llIlI11I11Il1l1l1lI1().I11Ill1I1I1llll11Il1I1I()));
      this.fieldSurfaceBackground.setColor(GuiStyle.FIELD_SURFACE_BACKGROUND);
      this.surfaceDisableBackground
         .setColor(il1iliilli1l1iill.EventImpl_36(this.surfaceDisableBackground.l1IllIl1l1llIlI11I11Il1l1l1lI1().I11Ill1I1I1llll11Il1I1I()));
      this.hudBackground.setColor(il1iliilli1l1iill.EventImpl_36(this.hudBackground.l1IllIl1l1llIlI11I11Il1l1l1lI1().I11Ill1I1I1llll11Il1I1I()));
      this.headerHudBackground
         .setColor(il1iliilli1l1iill.EventImpl_36(this.headerHudBackground.l1IllIl1l1llIlI11I11Il1l1l1lI1().I11Ill1I1I1llll11Il1I1I()));
   }

   public void setDefaultsFromGuiStyle() {
      this.leftBackground.setColor(GuiStyle.LEFT_BACKGROUND);
      this.rightBackground.setColor(GuiStyle.RIGHT_BACKGROUND);
      this.panelLeftBackground.setColor(GuiStyle.PANEL_LEFT_BACKGROUND);
      this.surfaceEnableBackground.setColor(GuiStyle.SURFACE_ENABLE_BACKGROUND);
      this.headerDisableBackground.setColor(GuiStyle.HEADER_DISABLE_BACKGROUND);
      this.fieldSurfaceBackground.setColor(GuiStyle.FIELD_SURFACE_BACKGROUND);
      this.fieldBorder.setColor(GuiStyle.FIELD_BORDER);
      this.surfaceDisableBackground.setColor(GuiStyle.SURFACE_DISABLE_BACKGROUND);
      this.textEnable.setColor(GuiStyle.TEXT_ENABLE);
      this.textTertiary.setColor(GuiStyle.TEXT_TERTIARY);
      this.textSecondary.setColor(GuiStyle.TEXT_SECONDARY);
      this.glowColor1.setColor(this.primaryColor.l1IllIl1l1llIlI11I11Il1l1l1lI1().EventImpl_36(70));
      this.glowColor2.setColor(this.secondaryPrimaryColor.l1IllIl1l1llIlI11I11Il1l1l1lI1().EventImpl_36(70));
      this.friendColor.setColor(GuiStyle.FRIEND_COLOR);
      this.glareColor.setColor(GuiStyle.GLARE_COLOR);
      this.disableActiveBg.setColor(GuiStyle.DISABLE_ACTIVE_BG);
      this.heartActiveBg.setColor(GuiStyle.HEART_ACTIVE_BG);
      this.heartIcon.setColor(GuiStyle.HEART_ICON);
   }

   public void safe(JsonObject jsonobject) {
      jsonobject.addProperty("name", this.name);
      this.leftBackground.safe(jsonobject);
      this.rightBackground.safe(jsonobject);
      this.panelLeftBackground.safe(jsonobject);
      this.surfaceEnableBackground.safe(jsonobject);
      this.headerDisableBackground.safe(jsonobject);
      this.fieldSurfaceBackground.safe(jsonobject);
      this.fieldBorder.safe(jsonobject);
      this.surfaceDisableBackground.safe(jsonobject);
      this.textEnable.safe(jsonobject);
      this.textTertiary.safe(jsonobject);
      this.textSecondary.safe(jsonobject);
      this.primaryColor.safe(jsonobject);
      this.secondaryPrimaryColor.safe(jsonobject);
      this.glowColor1.safe(jsonobject);
      this.glowColor2.safe(jsonobject);
      this.friendColor.safe(jsonobject);
      this.glareColor.safe(jsonobject);
      this.disableActiveBg.safe(jsonobject);
      this.heartActiveBg.safe(jsonobject);
      this.heartIcon.safe(jsonobject);
      this.hudBackground.safe(jsonobject);
      this.headerHudBackground.safe(jsonobject);
   }

   public void load(JsonObject jsonobject) {
      if (jsonobject.has("name")) {
         this.name = jsonobject.get("name").getAsString();
      }

      this.loadColor(jsonobject, this.leftBackground, "leftBackground");
      this.loadColor(jsonobject, this.rightBackground, "rightBackground");
      this.loadColor(jsonobject, this.panelLeftBackground, "panelLeftBackground");
      this.loadColor(jsonobject, this.surfaceEnableBackground, "surfaceEnableBackground");
      this.loadColor(jsonobject, this.headerDisableBackground, "headerDisableBackground");
      this.loadColor(jsonobject, this.fieldSurfaceBackground, "fieldSurfaceBackground");
      this.loadColor(jsonobject, this.fieldBorder, "fieldBorder");
      this.loadColor(jsonobject, this.surfaceDisableBackground, "surfaceDisableBackground");
      this.loadColor(jsonobject, this.textEnable, "textEnable");
      this.loadColor(jsonobject, this.textTertiary, "textTertiary");
      this.loadColor(jsonobject, this.textSecondary, "textSecondary");
      this.loadColor(jsonobject, this.primaryColor, "primaryColor");
      this.loadColor(jsonobject, this.secondaryPrimaryColor);
      this.loadColor(jsonobject, this.glowColor1);
      this.loadColor(jsonobject, this.glowColor2);
      this.loadColor(jsonobject, this.friendColor);
      this.loadColor(jsonobject, this.glareColor, "glareColor");
      this.loadColor(jsonobject, this.disableActiveBg, "disableActiveBg");
      this.loadColor(jsonobject, this.heartActiveBg, "heartActiveBg");
      this.loadColor(jsonobject, this.heartIcon, "heartIcon");
      this.loadColor(jsonobject, this.hudBackground, "hudBackground");
      this.loadColor(jsonobject, this.headerHudBackground, "headerHudBackground");
   }

   private void loadColor(JsonObject jsonobject, ColorSetting llil11111111l1il1ii, String... astring) {
      if (jsonobject.has(llil11111111l1il1ii.getName())) {
         llil11111111l1il1ii.ZenithException_2(jsonobject.get(llil11111111l1il1ii.getName()).getAsInt());
      } else {
         for (String s : astring) {
            if (jsonobject.has(s)) {
               llil11111111l1il1ii.ZenithException_2(jsonobject.get(s).getAsInt());
               return;
            }
         }
      }
   }

   public List<Setting> getSettings() {
      return Arrays.stream(this.getClass().getDeclaredFields()).map(field -> {
         try {
            field.setAccessible(true);
            return field.get(this);
         } catch (IllegalAccessException illegalaccessexception) {
            illegalaccessexception.printStackTrace();
            return null;
         }
      }).filter(object -> object instanceof Setting).map(object -> (Setting)object).collect(Collectors.toList());
   }

   public String getName() {
      return this.name;
   }

   public ColorSetting getPrimaryColor() {
      return this.primaryColor;
   }

   public ColorSetting getSecondaryPrimaryColor() {
      return this.secondaryPrimaryColor;
   }

   public ColorSetting getGlowColor1() {
      return this.glowColor1;
   }

   public ColorSetting getGlowColor2() {
      return this.glowColor2;
   }

   public ColorSetting getFriendColor() {
      return this.friendColor;
   }

   public ColorSetting getGlareColor() {
      return this.glareColor;
   }

   public ColorSetting getLeftBackground() {
      return this.leftBackground;
   }

   public ColorSetting getRightBackground() {
      return this.rightBackground;
   }

   public ColorSetting getPanelLeftBackground() {
      return this.panelLeftBackground;
   }

   public ColorSetting getSurfaceEnableBackground() {
      return this.surfaceEnableBackground;
   }

   public ColorSetting getHeaderDisableBackground() {
      return this.headerDisableBackground;
   }

   public ColorSetting getSurfaceDisableBackground() {
      return this.surfaceDisableBackground;
   }

   public ColorSetting getFieldSurfaceBackground() {
      return this.fieldSurfaceBackground;
   }

   public ColorSetting getFieldBorder() {
      return this.fieldBorder;
   }

   public ColorSetting getDisableActiveBg() {
      return this.disableActiveBg;
   }

   public ColorSetting getTextEnable() {
      return this.textEnable;
   }

   public ColorSetting getTextTertiary() {
      return this.textTertiary;
   }

   public ColorSetting getTextSecondary() {
      return this.textSecondary;
   }

   public ColorSetting getHeartActiveBg() {
      return this.heartActiveBg;
   }

   public ColorSetting getHeartIcon() {
      return this.heartIcon;
   }

   public ColorSetting getHudBackground() {
      return this.hudBackground;
   }

   public ColorSetting getHeaderHudBackground() {
      return this.headerHudBackground;
   }

   public void setName(String s) {
      this.name = s;
   }
}
