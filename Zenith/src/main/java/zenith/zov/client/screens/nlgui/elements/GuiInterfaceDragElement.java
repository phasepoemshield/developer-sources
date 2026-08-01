package zenith.zov.client.screens.nlgui.elements;

import zenith.hud.*;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.util.math.MathHelper;
import zenith.HudElement;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.Setting;
import zenith.HootBar;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.ContainerSetting;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.InterfaceElement;
import zenith.zov.client.screens.nlgui.elements.setting.GuiWindowSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiInterfaceDragElement extends InterfaceElement {
   private static final float HEADER_HEIGHT = 23.0F;
   private final HudElement draggableElement;
   private final GetStartTimeHandler animationEnable = new GetStartTimeHandler(200L, IReturn.ScreenImpl);
   private final GuiWindowSetting guiWindowSetting;
   private float animationPosX = 0.0F;
   private float animationPosY = 0.0F;
   private float lastX = 0.0F;
   private float lastY = 0.0F;
   private int lastIndex = -1;
   private boolean animated = false;
   private boolean positionInitialized = false;
   private HeightHandler bounds;
   private HeightHandler headerBounds;
   private HeightHandler toggleBounds;
   private float settingX;
   private float settingY;

   public GuiInterfaceDragElement(HudElement ii11l1l11lil1i1) {
      this.draggableElement = ii11l1l11lil1i1;
      if (ii11l1l11lil1i1.Spider()) {
         this.animationEnable.EventBus(1.0F);
      }

      Setting[] al1i111illi1i1 = ii11l1l11lil1i1.getSettings().toArray(new Setting[0]);
      ContainerSetting lliiii1iil1li = new ContainerSetting(this.getDisplayName(), "", () -> true, al1i111illi1i1);
      this.guiWindowSetting = new GuiWindowSetting(lliiii1iil1li, this.getWidth() - (float)(GuiStyle.PADDING * 4));
   }

   @Override
   public String getName() {
      return this.draggableElement.getName();
   }

   public HudElement getDraggableElement() {
      return this.draggableElement;
   }

   public void setSettingsExpanded(boolean flag) {
      this.guiWindowSetting.setExpanded(flag);
   }

   @Override
   public float getHeight() {
      return 23.0F + (float)GuiStyle.PADDING.intValue() * 2.0F + this.getPreviewHeight() + (float)GuiStyle.PADDING.intValue() * 2.0F;
   }

   @Override
   public float getWidth() {
      return 182.0F;
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, int i) {
      if (!this.positionInitialized) {
         this.animationPosX = f2;
         this.animationPosY = f3;
         this.lastX = f2;
         this.lastY = f3;
         this.lastIndex = i;
         this.positionInitialized = true;
      } else if ((f2 != this.lastX || f3 != this.lastY) && i != this.lastIndex) {
         this.animated = true;
         this.lastX = f2;
         this.lastY = f3;
      }

      if (this.animated) {
         this.animationPosX = (float)Math.round(MathHelper.lerp(0.4F, this.animationPosX, f2));
         this.animationPosY = (float)Math.round(MathHelper.lerp(0.4F, this.animationPosY, f3));
         if (Math.abs(this.animationPosX - f2) < 2.0F && Math.abs(this.animationPosY - f3) < 2.0F) {
            this.animated = false;
         } else {
            f2 = this.animationPosX;
            f3 = this.animationPosY;
         }
      } else {
         this.animationPosX = f2;
         this.animationPosY = f3;
      }

      this.lastIndex = i;
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         this.animationEnable.ZenithInternal101(this.draggableElement.Spider());
         float f5 = this.animationEnable.CloudFriendInfo();
         float f6 = this.getWidth();
         float f7 = this.getHeight();
         this.bounds = new HeightHandler(f2, f3, f6, f7);
         this.headerBounds = new HeightHandler(f2, f3, f6, 23.0F);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f6,
            f7,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getSurfaceDisableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f6,
            23.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getHeaderDisableBackground()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getSurfaceEnableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f5)
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         Font font = Fonts.NEW_MEDIUM.getFont(6.0F);
         Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
         float f8 = f2 + (float)GuiStyle.PADDING.intValue() * 2.0F + (font1.width("O") + (float)GuiStyle.PADDING.intValue()) * f5;
         float f9 = f3 + (23.0F - font.height()) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            this.getName(),
            f8,
            f9,
            zenithstyle.getTextSecondary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f5)
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            "O",
            f2 + (float)GuiStyle.PADDING.intValue() * 2.0F,
            f3 + (23.0F - font1.height()) / 2.0F,
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f5)
               .ZenithInternal039(f4)
         );
         float f10 = 12.0F;
         float f11 = 7.0F;
         float f12 = f2 + f6 - (float)GuiStyle.PADDING.intValue() * 2.0F - f10;
         float f13 = f3 + (float)GuiStyle.PADDING.intValue() * 2.0F;
         this.toggleBounds = new HeightHandler(f12, f13, f10, f11);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f12,
            f13,
            f10,
            f11,
            floatHolder_5.StringHolder_30(2.5F),
            zenithstyle.getDisableActiveBg()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f5)
               .ZenithInternal039(f4)
         );
         float f14 = MathHelper.lerp(f5, 1.0F, f10 - 1.0F - 5.0F);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f12 + f14,
            f13 + 1.0F,
            5.0F,
            5.0F,
            floatHolder_5.StringHolder_30(1.5F),
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f5)
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         this.settingX = f12 - (float)GuiStyle.PADDING.intValue() - this.guiWindowSetting.getWidth();
         this.settingY = f3 + (23.0F - this.guiWindowSetting.getHeight()) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.ListHolder_6(
            this.settingX + 100.0F, this.settingY - 1.0F, this.settingX + this.getWidth(), this.settingY + this.getHeight()
         );
         this.guiWindowSetting.render(iiii1ilili1l1l1lilli1liliii, f, f1, this.settingX, this.settingY, f4);
         iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
         float f15 = MathHelper.lerp(f5, 0.5F, 1.0F);
         RenderSystem.setShaderColor(1.0F * f15, 1.0F * f15, 1.0F * f15, f4 * f4);
         this.renderPreview(iiii1ilili1l1l1lilli1liliii, zenithstyle, f2, f3, f4);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   @Override
   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f3, float f4, float f2) {
      this.guiWindowSetting.renderPriority(iiii1ilili1l1l1lilli1liliii, f, f1, this.settingX, this.settingY, f2, 1.0F);
   }

   @Override
   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      return this.guiWindowSetting.onMousePriorityClicked(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.guiWindowSetting.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (ill1iili11ii1l != ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         return false;
      } else if (this.toggleBounds != null && this.toggleBounds.byteHolder(d0, d1)) {
         this.draggableElement.lI1Il11I1l1III11IIlI1lI1II11I();
         return true;
      } else if (this.headerBounds != null && this.headerBounds.byteHolder(d0, d1)) {
         this.draggableElement.lI1Il11I1l1III11IIlI1lI1II11I();
         return true;
      } else {
         return this.bounds != null && this.bounds.byteHolder(d0, d1);
      }
   }

   @Override
   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      return this.guiWindowSetting.onMousePriorityScroll(d0, d1, d2, d3);
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      this.guiWindowSetting.onMouseReleased(d0, d1, ill1iili11ii1l);
      super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      return this.guiWindowSetting.keyPressed(i, j, k) ? true : super.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      return this.guiWindowSetting.charTyped(c0, i) ? true : super.charTyped(c0, i);
   }

   private void renderPreview(floatHolder_4 iiii1ilili1l1l1lilli1liliii, ZenithStyle zenithstyle, float f, float f1, float f2) {
      float f3 = f + (float)GuiStyle.PADDING.intValue() * 2.0F;
      float f4 = f1 + 23.0F + (float)GuiStyle.PADDING.intValue() * 2.0F;
      float f5 = this.getWidth() - (float)GuiStyle.PADDING.intValue() * 4.0F;
      float f6 = this.getPreviewHeight();
      if (!(f5 <= 0.0F) && !(f6 <= 0.0F)) {
         float f7 = this.sanitizeSize(this.draggableElement.lI11l1IIl1II11l11lI11());
         float f8 = this.sanitizeSize(this.draggableElement.lll1lI1I1l1l());
         if (!(f7 <= 0.0F) && !(f8 <= 0.0F)) {
            float f9 = (float)GuiStyle.PADDING.intValue();
            float f10 = Math.max(1.0F, f5 - f9 * 2.0F);
            float f11 = Math.max(1.0F, f6 - f9 * 2.0F);
            float f12 = f3 + f9;
            float f13 = f4 + f9;
            float f14 = Math.min(1.0F, Math.min(f10 / f7, f11 / f8));
            if (!Float.isFinite(f14) || f14 <= 0.0F) {
               f14 = 1.0F;
            }

            f14 *= f2 * f2;
            float f15 = f7 * f14;
            float f16 = f8 * f14;
            float f17 = f12 + (f10 - f15) / 2.0F;
            float f18 = f13 + (f11 - f16) / 2.0F;
            if (this.draggableElement instanceof HootBar) {
               iiii1ilili1l1l1lilli1liliii.ListHolder_6(
                  0.0F, f1 + 23.0F + (float)GuiStyle.PADDING.intValue(), f12 + f10 + 100.0F, f13 + f11 + (float)GuiStyle.PADDING.intValue()
               );
            }

            iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
            iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f17, f18, 0.0F);
            iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f14, f14, 1.0F);
            iiii1ilili1l1l1lilli1liliii.getMatrices()
               .translate(-this.draggableElement.l1l11Il1l11IlllIIllI(), -this.draggableElement.I1llllIIIIllIl(), 0.0F);

            try {
               this.draggableElement.StringHolder_8(iiii1ilili1l1l1lilli1liliii);
            } catch (Exception exception) {
            } finally {
               iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
               if (this.draggableElement instanceof HootBar) {
                  iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
               }
            }
         }
      }
   }

   private float sanitizeSize(float f) {
      return !Float.isFinite(f) ? 0.0F : Math.max(0.0F, f);
   }

   private float getPreviewHeight() {
      float f = this.sanitizeSize(this.draggableElement.lll1lI1I1l1l());
      return f <= 0.0F ? (float)(-GuiStyle.PADDING * 4) : f;
   }

   private String getDisplayName() {
      String s = this.draggableElement.getName();
      String s1 = ZenithClient.getInstance().StringHolder_31().translate(s);
      if (s1 != null && !s1.isBlank() && !s1.equals(s)) {
         return s1;
      } else {
         int i = s.lastIndexOf(46);
         String s2 = i >= 0 ? s.substring(i + 1) : s;
         s2 = s2.replace('_', ' ').trim();
         return s2.isEmpty() ? "Hud element" : Character.toUpperCase(s2.charAt(0)) + s2.substring(1);
      }
   }
}
