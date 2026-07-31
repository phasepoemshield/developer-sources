package zenith.zov.client.screens.nlgui.elements;

import zenith.hud.*;

import net.minecraft.client.util.math.Vector2f;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.floatHolder_8;
import zenith.OnMouseClickedHandler;
import zenith.ZenithInternal097$Helper;
import zenith.ZenithInternal096$EventBus;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.ModeSetting;
import zenith.ZenithInternal134$Helper;
import zenith.IsPriorityHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.InterfaceElement;
import zenith.zov.client.screens.nlgui.elements.setting.GuiModeSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiConfigElement extends InterfaceElement {
   private static final float HEIGHT = 34.0F;
   private static final float HEADER_HEIGHT = 23.0F;
   private static final long DOUBLE_CLICK_MS = 260L;
   private final Runnable onChanged;
   private final OnMouseClickedHandler nameBox;
   private IsPriorityHandler config;
   private String displayName;
   private final GetStartTimeHandler animationVisible = new GetStartTimeHandler(220L, IReturn.ScreenImpl);
   private final GetStartTimeHandler heartAnimation = new GetStartTimeHandler(300L, IReturn.ScreenImpl);
   private final GetStartTimeHandler deleteAnimation = new GetStartTimeHandler(300L, IReturn.ScreenImpl);
   private final GetStartTimeHandler loadAnimation = new GetStartTimeHandler(300L, IReturn.ScreenImpl);
   private final GetStartTimeHandler loadButtonAnimation = new GetStartTimeHandler(220L, IReturn.ScreenImpl);
   private final GetStartTimeHandler animationPosX = new GetStartTimeHandler(150L, IReturn.ListHolder_8);
   private final GetStartTimeHandler animationPosY = new GetStartTimeHandler(150L, IReturn.ListHolder_8);
   private final GetStartTimeHandler animationExpanded = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private final GetStartTimeHandler focusAnimation = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private final ModeSetting loadMode = new ModeSetting(
      "gui.configelement.mode", "", "gui.configelement.mode.all", "gui.configelement.mode.ignoreBinds", "gui.configelement.mode.onlyThemes"
   );
   private GuiModeSetting guiLoadMode = new GuiModeSetting(this.loadMode, this.getWidth() - (float)(GuiStyle.PADDING * 4));
   private HeightHandler bounds;
   private HeightHandler nameBounds;
   private HeightHandler buttonBounds;
   private HeightHandler deleteBounds;
   private HeightHandler heartBounds;
   private HeightHandler popupBounds;
   private HeightHandler popupExitBounds;
   private boolean expanded;
   private boolean editingName;
   private boolean deleting;
   private boolean deleteCommitted;
   private long lastNameClick;
   private boolean animated;
   private boolean positionInitialized;
   private float lastX;
   private float lastY;
   private int lastIndex;

   public GuiConfigElement(IsPriorityHandler lillllii11iiill11i, Runnable runnable) {
      this.config = lillllii11iiill11i;
      this.onChanged = runnable;
      this.displayName = lillllii11iiill11i.getName();
      this.nameBox = new OnMouseClickedHandler(new Vector2f(0.0F, 0.0F), Fonts.NEW_MEDIUM.getFont(5.5F), "config", 60.0F);
      this.nameBox.StringHolder_8(ZenithInternal097$Helper.IIIll1l11I);
      this.nameBox.StringHolder_8(ZenithInternal096$EventBus.Ill11lIl1lll111llll1II11);
      this.nameBox.EventImpl_38(28);
      this.nameBox.GetDisplayNameHandler(this.displayName);
      this.nameBox.EventImpl_16(this.displayName.length());
   }

   @Override
   public String getName() {
      return this.displayName;
   }

   @Override
   public float getHeight() {
      return 34.0F;
   }

   @Override
   public float getWidth() {
      return 120.0F;
   }

   public boolean isPriority() {
      return this.config.isPriority();
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, int i) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         f4 *= this.animationVisible.StringHolder_8(this.deleting ? 0.0F : 1.0F);
         if (this.deleting && !this.deleteCommitted && this.animationVisible.CloudFriendInfo() <= 0.02F) {
            this.deleteCommitted = true;
            if (ZenithClient.getInstance().ZenithInternal115().StringHolder_17(this.config.getName())
               && this.onChanged != null) {
               this.onChanged.run();
            } else {
               this.deleting = false;
               this.deleteCommitted = false;
            }
         }

         if (!this.positionInitialized) {
            this.animationPosX.EventTarget(f2);
            this.animationPosY.EventTarget(f3);
            this.lastX = f2;
            this.lastY = f3;
            this.positionInitialized = true;
            this.lastIndex = i;
         } else if ((f2 != this.lastX || f3 != this.lastY) && i != this.lastIndex) {
            this.animated = true;
            this.animationPosX.ZenithInternal095(f2);
            this.animationPosY.ZenithInternal095(f3);
            this.lastX = f2;
            this.lastY = f3;
         }

         if (this.animated) {
            f2 = this.animationPosX.StringHolder_8(f2);
            f3 = this.animationPosY.StringHolder_8(f3);
            if (this.animationPosX.ArrayListHolder() && this.animationPosY.ArrayListHolder()) {
               this.animated = false;
            }
         } else {
            this.animationPosX.EventTarget(f2);
            this.animationPosY.EventTarget(f3);
         }

         this.lastIndex = i;
         float f5 = this.getWidth();
         this.bounds = new HeightHandler(f2, f3, f5, 34.0F);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f5,
            34.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getSurfaceDisableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f5,
            34.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getHeaderDisableBackground()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getSurfaceEnableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1(), 0.65F)
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.NEW_MEDIUM.getFont(4.8F);
         Font font2 = Fonts.NEW_ICONS.getFont(4.8F);
         float f6 = f2 + (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f7 = f3 + (23.0F - font.height()) / 2.0F;
         float f8 = Math.max(12.0F, f5 - (float)GuiStyle.PADDING.intValue() * 4.0F - 15.0F);
         this.nameBounds = new HeightHandler(f6 - 1.0F, f3, f8 + 2.0F, 23.0F);
         if (this.editingName) {
            this.nameBox.StringHolder_8(font);
            this.nameBox.setWidth(f8);
            this.nameBox
               .StringHolder_8(
                  iiii1ilili1l1l1lilli1liliii,
                  f6,
                  f7,
                  zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4),
                  zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
               );
         } else {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font, this.displayName, f6, f7, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
            );
         }

         float f9 = 7.0F;
         float f10 = f2 + f5 - (float)GuiStyle.PADDING.intValue() * 2.0F - f9 - (float)GuiStyle.PADDING.intValue() - f9;
         float f11 = f3 + (float)GuiStyle.PADDING.intValue() * 2.0F;
         this.heartBounds = new HeightHandler(f10, f11, f9, f9);
         this.deleteBounds = new HeightHandler(f10 + f9 + (float)GuiStyle.PADDING.intValue(), f11, f9, f9);
         this.deleteAnimation.ZenithInternal101(this.deleteBounds.byteHolder((double)f, (double)f1));
         this.loadAnimation.ZenithInternal101(this.bounds.byteHolder((double)f, (double)f1));
         this.heartAnimation
            .StringHolder_8(this.config.isPriority() ? 1.0F : (this.heartBounds.byteHolder((double)f, (double)f1) ? 0.5F : 0.0F));
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f10,
            f11,
            f9,
            f9,
            floatHolder_5.StringHolder_30(1.5F),
            zenithstyle.getDisableActiveBg()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getHeartActiveBg().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.heartAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.deleteBounds.Il11lIlllI111I1l1111(),
            this.deleteBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f9,
            f9,
            floatHolder_5.StringHolder_30(1.5F),
            zenithstyle.getDisableActiveBg().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         Font font3 = Fonts.NEW_ICONS.getFont(5.0F);
         Font font4 = Fonts.NEW_ICONS.getFont(4.3F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font3,
            "U",
            f10 + 1.0F,
            f11 + 1.5F,
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11
               .StringHolder_8(zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1(), 1.0F - this.heartAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font4,
            "V",
            f10 + 1.05F,
            f11 + 1.78F,
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11
               .StringHolder_8(zenithstyle.getHeartIcon().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.heartAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font4,
            "[",
            this.deleteBounds.Il11lIlllI111I1l1111() + (this.deleteBounds.width() - font4.width("[")) / 2.0F,
            f11 + 1.5F,
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.deleteAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         float f12 = f3 + 34.0F - (float)GuiStyle.PADDING.intValue() * 2.0F - font1.height();
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            "a",
            f2 + (float)GuiStyle.PADDING.intValue() * 2.0F,
            f12 + 0.46F,
            zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         String s = this.translate("gui.configelement.local");
         String s1 = this.translate("gui.configelemen.load");
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            s,
            f2 + (float)GuiStyle.PADDING.intValue() * 2.0F + font2.width("a") + (float)GuiStyle.PADDING.intValue() / 2.0F,
            f12,
            zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         float f13 = font1.width(s1);
         float f14 = font2.width("n");
         float f15 = f14 + (float)GuiStyle.PADDING.intValue() / 2.0F + f13;
         float f16 = f2 + f5 - f15 - (float)GuiStyle.PADDING.intValue() * 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            "n",
            f16,
            f12 + 0.4F,
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.loadAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            s1,
            f16 + f14 + (float)GuiStyle.PADDING.intValue() / 2.0F,
            f12,
            zenithstyle.getTextSecondary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.loadAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
      }
   }

   @Override
   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f20, float f21, float f2) {
      float f3 = this.animationExpanded.StringHolder_8(this.expanded ? 1.0F : 0.0F);
      if (!(f3 <= 0.001F) && this.bounds != null) {
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         if (zenithstyle != null) {
            float f4 = 120.0F;
            float f5 = 26.0F;
            float f6 = (float)(GuiStyle.PADDING * 5 + 14 + 14);
            float f7 = f5 + f6;
            float f8 = this.bounds.Il11lIlllI111I1l1111();
            float f9 = this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() + this.bounds.height() + (float)GuiStyle.PADDING.intValue();
            this.popupBounds = new HeightHandler(f8, f9, f4, f7);
            f2 *= f3;
            iiii1ilili1l1l1lilli1liliii.getMatrices().push();
            iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f8 + f4 / 2.0F, f9, 0.0F);
            iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f3, f3, 1.0F);
            iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-(f8 + f4 / 2.0F), -f9, 0.0F);
            floatHolder_8.EventImpl_24(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               f8,
               f9,
               f4,
               f7,
               12.0F,
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f8,
               f9,
               f4,
               f5,
               floatHolder_5.StringHolder_19((float)GuiStyle.ROUND.intValue(), (float)GuiStyle.ROUND.intValue()),
               zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f8,
               f9 + f5,
               f4,
               f6,
               floatHolder_5.ZenithInternal061((float)GuiStyle.ROUND.intValue(), (float)GuiStyle.ROUND.intValue()),
               zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            Font font = Fonts.NEW_ICONS.getFont(5.0F);
            Font font1 = Fonts.NEW_MEDIUM.getFont(5.4F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font,
               "n",
               f8 + (float)GuiStyle.PADDING.intValue() * 2.0F,
               f9 + (f5 - font.height()) / 2.0F,
               zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font1,
               this.translate("gui.configelement.loadType"),
               f8 + (float)GuiStyle.PADDING.intValue() * 2.0F + font.width("n") + (float)GuiStyle.PADDING.intValue() / 2.0F,
               f9 + (f5 - font1.height()) / 2.0F,
               zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            Font font2 = Fonts.NEW_ICONS.getFont(4.0F);
            float f10 = f8 + f4 - font2.width("2") - (float)GuiStyle.PADDING.intValue() * 2.0F;
            float f11 = f9 + (float)GuiStyle.PADDING.intValue() + font2.height();
            this.popupExitBounds = new HeightHandler(f10, f11, 5.0F, 5.0F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font2, "2", f10, f11, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            float f12 = f8 + (float)(GuiStyle.PADDING * 2);
            float f13 = f9 + f5 + (float)GuiStyle.PADDING.intValue();
            this.guiLoadMode.render(iiii1ilili1l1l1lilli1liliii, f, f1, f12, f13, f2);
            float f14 = f13 + this.guiLoadMode.getAnimHeight() + (float)(GuiStyle.PADDING * 2);
            this.buttonBounds = new HeightHandler(f12, f14, this.guiLoadMode.getWidth(), 14.0F);
            float f15 = this.loadButtonAnimation
               .StringHolder_8(this.buttonBounds.byteHolder((double)f, (double)f1) && !this.guiLoadMode.contains(f, f1) ? 1.0F : 0.0F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               this.buttonBounds.Il11lIlllI111I1l1111(),
               this.buttonBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               this.buttonBounds.width(),
               this.buttonBounds.height(),
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getFieldSurfaceBackground()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f15 * 0.15F)
                  .ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.EventBus(
               this.buttonBounds.Il11lIlllI111I1l1111(),
               this.buttonBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               this.buttonBounds.width(),
               this.buttonBounds.height(),
               0.1F,
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getFieldBorder()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f15 * 0.35F)
                  .ZenithInternal039(f2)
            );
            Font font3 = Fonts.NEW_ICONS.getFont(5.0F);
            Font font4 = Fonts.NEW_MEDIUM.getFont(5.3F);
            String s = this.translate("gui.configelemen.load");
            float f16 = font3.width("a") + (float)GuiStyle.PADDING.intValue() / 2.0F + font4.width(s);
            float f17 = this.buttonBounds.Il11lIlllI111I1l1111() + (this.buttonBounds.width() - f16) / 2.0F;
            float f18 = this.buttonBounds.I1II11l1I11Illl11IIl1l1lIl1II() + (this.buttonBounds.height() - font3.height()) / 2.0F + 0.28F;
            float f19 = this.buttonBounds.I1II11l1I11Illl11IIl1l1lIl1II() + (this.buttonBounds.height() - font4.height()) / 2.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font3,
               "a",
               f17,
               f18,
               zenithstyle.getTextTertiary()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f15)
                  .ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font4,
               s,
               f17 + font3.width("a") + (float)GuiStyle.PADDING.intValue() / 2.0F,
               f19,
               zenithstyle.getTextSecondary()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f15)
                  .ZenithInternal039(f2)
            );
            this.guiLoadMode.renderPriority(iiii1ilili1l1l1lilli1liliii, f, f1, f12, f13, f2, 1.0F);
            iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
         }
      }
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.deleting) {
         return true;
      } else if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl && this.deleteBounds != null && this.deleteBounds.byteHolder(d0, d1)
         )
       {
         this.deleting = true;
         this.editingName = false;
         this.nameBox.setSelected(false);
         return true;
      } else if (this.heartBounds != null && this.heartBounds.byteHolder(d0, d1)) {
         this.config.Tridentaimbot();
         return true;
      } else if (this.nameBox.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         if (this.nameBox.isSelected() && !this.editingName) {
            this.beginEdit();
         }

         return true;
      } else if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         this.expanded = !this.expanded;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (!this.expanded || this.popupBounds == null) {
         return false;
      } else if (this.guiLoadMode.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (!this.popupBounds.byteHolder(d0, d1)) {
         this.expanded = false;
         return false;
      } else if (this.popupExitBounds != null && this.popupExitBounds.StringHolder_8(d0, d1, 2.0F)) {
         this.expanded = false;
         return true;
      } else if (this.guiLoadMode.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl && this.buttonBounds != null && this.buttonBounds.byteHolder(d0, d1)
         )
       {
         this.loadByMode();
         return true;
      } else {
         return true;
      }
   }

   @Override
   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      return this.expanded && this.guiLoadMode.onMousePriorityScroll(d0, d1, d2, d3);
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      this.guiLoadMode.onMouseReleased(d0, d1, ill1iili11ii1l);
      super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      if (this.editingName) {
         if (i == 257 || i == 335) {
            this.finishEdit(true);
            return true;
         } else if (i == 256) {
            this.finishEdit(false);
            return true;
         } else {
            return this.nameBox.keyPressed(i, j, k);
         }
      } else {
         return this.guiLoadMode.keyPressed(i, j, k) ? true : super.keyPressed(i, j, k);
      }
   }

   @Override
   public boolean charTyped(char c0, int i) {
      if (this.editingName) {
         return this.nameBox.charTyped(c0, i);
      } else {
         return this.guiLoadMode.charTyped(c0, i) ? true : super.charTyped(c0, i);
      }
   }

   private void beginEdit() {
      this.expanded = false;
      this.editingName = true;
      this.nameBox.GetDisplayNameHandler(this.displayName);
      this.nameBox.EventImpl_16(this.displayName.length());
      this.nameBox.setSelected(true);
   }

   private void finishEdit(boolean flag) {
      this.editingName = false;
      this.nameBox.setSelected(false);
      if (!flag) {
         this.nameBox.GetDisplayNameHandler(this.displayName);
         this.nameBox.EventImpl_16(this.displayName.length());
      } else {
         String s = this.nameBox.II1I11IIl() == null ? "" : this.nameBox.II1I11IIl().trim();
         if (!s.isEmpty() && !s.equals(this.displayName)) {
            if (ZenithClient.getInstance().ZenithInternal115().ByteBufferHolder_2(this.config.getName(), s)) {
               IsPriorityHandler lillllii11iiill11i = ZenithClient.getInstance()
                  .ZenithInternal115()
                  .GetSettingsHandler(s);
               if (lillllii11iiill11i != null) {
                  this.config = lillllii11iiill11i;
               }

               this.displayName = s;
               if (this.onChanged != null) {
                  this.onChanged.run();
               }
            } else {
               this.nameBox.GetDisplayNameHandler(this.displayName);
               this.nameBox.EventImpl_16(this.displayName.length());
            }
         } else {
            this.nameBox.GetDisplayNameHandler(this.displayName);
            this.nameBox.EventImpl_16(this.displayName.length());
         }
      }
   }

   private void loadByMode() {
      String s = this.loadMode.Il1I11IIlllIl111l11I1I11();

      ZenithInternal134$Helper lillll1l1ii1il1il$ii1il11l111ii11iil = switch (s) {
         case "gui.configelement.mode.ignoreBinds" -> ZenithInternal134$Helper.lI1II1lII1IlIIIlll1Ill1;
         case "gui.configelement.mode.onlyThemes" -> ZenithInternal134$Helper.IllIIlIIl11111Il1I1l1I11l1;
         default -> ZenithInternal134$Helper.lIII1Il1l1I1l1111l1IllIl;
      };
      ZenithClient.getInstance()
         .ZenithInternal115()
         .StringHolder_8(this.config.getName(), lillll1l1ii1il1il$ii1il11l111ii11iil);
      this.expanded = false;
   }

   private String translate(String s) {
      return ZenithClient.getInstance().StringHolder_31().translate(s);
   }
}
