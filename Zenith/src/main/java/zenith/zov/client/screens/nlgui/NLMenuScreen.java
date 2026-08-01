package zenith.zov.client.screens.nlgui;

import zenith.hud.*;

import com.google.gson.JsonObject;
import net.minecraft.text.Text;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.Vector2f;
import zenith.HudElement;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.ZenithClient$II1Il11l111II11IIl;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.ZenithInternal076;
import zenith.floatHolder_8;
import zenith.OnMouseClickedHandler;
import zenith.ZenithInternal097$Helper;
import zenith.ZenithInternal096$EventBus;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.panel.ClientPanel;
import zenith.zov.client.screens.nlgui.panel.CosmeticElementPanel;
import zenith.zov.client.screens.nlgui.panel.GeneralPanel;
import zenith.zov.client.screens.nlgui.panel.GuiConfigPanel;
import zenith.zov.client.screens.nlgui.panel.GuiFreindsPanel;
import zenith.zov.client.screens.nlgui.panel.GuiModulePanel;
import zenith.zov.client.screens.nlgui.panel.InterfacePanel;
import zenith.zov.client.screens.nlgui.panel.InterfacePanel$InterfaceCategory;
import zenith.zov.client.screens.nlgui.panel.MiscPanel;
import zenith.zov.client.screens.nlgui.panel.ProfilePanel;
import zenith.zov.client.screens.nlgui.panel.api.ElementPanel;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class NLMenuScreen extends Screen implements ZenithInternal076 {
   private final GetStartTimeHandler animationClose = new GetStartTimeHandler(300L, 0.0F, IReturn.StringHolder_9);
   private GeneralPanel generalPanel;
   private ProfilePanel profilePanel;
   private ClientPanel clientPanel;
   private MiscPanel miscPanel;
   private GuiModulePanel guiModulePanel;
   private GuiFreindsPanel guiFreindsPanel;
   private InterfacePanel interfacePanel;
   private GuiConfigPanel guiConfigPanel;
   private CosmeticElementPanel cosmeticElementPanel;
   private NLMenuScreen$ElementsType type = NLMenuScreen$ElementsType.CATEGORY;
   private boolean closing = false;
   public static final float widthPanel = 480.0F;
   public static final float heightPanel = 320.0F;
   public static final float leftWidthPanel = 104.0F;
   public static final float rightWidthPanel = 376.0F;
   // $VF: renamed from: x float
   private float field_453;
   // $VF: renamed from: y float
   private float field_454;
   private boolean init = false;
   private OnMouseClickedHandler searchField;
   private HeightHandler profileBounds;
   private HeightHandler clientBounds;
   private boolean restoreClientPanelAfterRightPanel = false;
   float alpha = 0.0F;
   private final GetStartTimeHandler setTypeAnimation = new GetStartTimeHandler(220L, 1.0F, IReturn.ScreenImpl);
   private NLMenuScreen$ElementsType prevType;

   public NLMenuScreen() {
      super(Text.literal("NLMenu"));
   }

   protected void init() {
      this.animationClose.EventBus(0.0F);
      this.animationClose.StringHolder_8(1.0F);
      this.ensurePanelsInitialized();
      this.closing = false;
      if (this.searchField == null) {
         this.searchField = new OnMouseClickedHandler(new Vector2f(0.0F, 0.0F), Fonts.MEDIUM.getFont(7.0F), "Search for elements...", 100.0F);
         this.searchField.StringHolder_8(ZenithInternal097$Helper.III11IIl1l1l1lI);
         this.searchField.StringHolder_8(ZenithInternal096$EventBus.Ill11lIl1lll111llll1II11);
      }
   }

   public void renderTop(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f = (float)GuiStyle.ROUND.intValue();
         float f1 = this.animationClose.StringHolder_8(this.closing ? 0.0F : 1.0F);
         this.field_453 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() / 2.0F - 240.0F;
         this.field_454 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() / 1.9F - 160.0F;
         float f2 = this.getGuiScale();
         float f3 = this.field_453 + 240.0F;
         float f4 = this.field_454 + 160.0F;
         i = (int)(((float)i - f3) / f2 + f3);
         j = (int)(((float)j - f4) / f2 + f4);
         iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f3, f4, 0.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f2, f2, 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-f3, -f4, 0.0F);
         if (this.profilePanel.isRender()) {
            this.profilePanel
               .render(iiii1ilili1l1l1lilli1liliii, i, j, f1, this.field_453 - 128.0F - (float)(GuiStyle.PADDING * 2), this.field_454 + 320.0F - 190.0F);
         }

         float f5 = this.field_453 + 480.0F + (float)(GuiStyle.PADDING * 2);
         float f6 = this.field_454;
         ElementPanel elementpanel = this.type.getPanelSupplier().get();
         ElementPanel elementpanel1 = this.prevType != null ? this.prevType.getPanelSupplier().get() : null;
         float f7 = this.setTypeAnimation.CloudFriendInfo();
         boolean flag = elementpanel.isRender() && f7 > 0.001F;
         boolean flag1 = elementpanel1 != null && elementpanel1.isRender() && 1.0F - f7 > 0.001F;
         this.updateClientPanelVisibilityForRightPanels(flag || flag1);
         if (this.clientPanel.isRender()) {
            this.clientPanel.render(iiii1ilili1l1l1lilli1liliii, i, j, f1, f5, f6);
         }

         if (elementpanel1 != null && elementpanel1.isRender()) {
            elementpanel1.renderRightPanel(iiii1ilili1l1l1lilli1liliii, i, j, f1 * (1.0F - f7), f5, f6, 1.0F - f7);
         }

         if (elementpanel.isRender()) {
            elementpanel.renderRightPanel(iiii1ilili1l1l1lilli1liliii, i, j, f1 * f7, f5, f6, f7);
         }

         float f8 = this.getBlurPower();
         if (f8 != 0.0F) {
            floatHolder_8.StringHolder_8(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               this.field_453,
               this.field_454,
               480.0F,
               320.0F,
               f8,
               floatHolder_5.StringHolder_30(f),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f1),
               true,
               false
            );
         }

         floatHolder_8.StringHolder_8(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            ZenithClient.StringHolder_10("menu/jebriksheet.png"),
            this.field_453,
            this.field_454,
            480.0F,
            320.0F,
            floatHolder_5.StringHolder_30(f),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(0.0F * f1)
         );
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f1);
         ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f1);
         ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f1);
         ByteBufferHolder il1iliilli1l1iill3 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f1);
         ByteBufferHolder il1iliilli1l1iill4 = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f1);
         ByteBufferHolder il1iliilli1l1iill5 = zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f1);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            this.field_453, this.field_454, 104.0F, 320.0F, floatHolder_5.FinishThread(f, f), il1iliilli1l1iill
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            this.field_453 + 104.0F, this.field_454, 376.0F, 320.0F, floatHolder_5.ZenithInternal064(f, f), il1iliilli1l1iill1
         );
         float f9 = (float)GuiStyle.PADDING.intValue();
         float f10 = 96.0F;
         float f11 = this.field_454 + f9;
         float f12 = this.field_453 + f9;
         float f13 = f11 + 23.0F + f9;
         float f14 = this.field_454 + 320.0F - f9 - 30.0F;
         iiii1ilili1l1l1lilli1liliii.EventBus(f12, f11, f10, 23.0F, floatHolder_5.StringHolder_30(f), il1iliilli1l1iill2);
         this.profileBounds = new HeightHandler(f12, f14, f10, 30.0F);
         iiii1ilili1l1l1lilli1liliii.EventBus(f12, f14, f10, 30.0F, floatHolder_5.StringHolder_30(f), il1iliilli1l1iill2);
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         String s = "5";
         Font font = Fonts.ICONS.getFont(6.0F);
         Font font1 = Fonts.NEW_MEDIUM.getFont(6.0F);
         float f15 = font.width(s);
         float f16 = font1.width("Zenith");
         float f17 = f15 + f9 + f16;
         float f18 = f12 + (f10 - f17) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f18, f11 + (23.0F - font.height()) / 2.0F - 0.2F, il1iliilli1l1iill3);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, "Zenith", f18 + f15 + f9, f11 + (23.0F - font1.height()) / 2.0F, il1iliilli1l1iill4);
         Font font3 = Fonts.NEW_MEDIUM.getFont(5.0F);
         font = Fonts.NEW_REGULAR.getFont(5.0F);
         float f22 = this.field_453 + f9 * 3.0F;
         f15 = 14.0F;
         f16 = f14 + f9 * 2.0F;
         floatHolder_8.StringHolder_8(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            ZenithClient.StringHolder_10("icons/avatar.png"),
            f22,
            f16,
            f15,
            f15,
            floatHolder_5.StringHolder_30(4.0F),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f1)
         );
         f17 = f22 + f15 + f9;
         ZenithClient$II1Il11l111II11IIl iiil1llll1liili1lilii1l1li1iii$ii1il11l111ii11iil = ZenithClient.getInstance()
            .ListHolder_7();
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font3, iiil1llll1liili1lilii1l1li1iii$ii1il11l111ii11iil.getUsername(), f17, f16 + 1.0F, il1iliilli1l1iill4
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, "till: LifeTime", f17, f16 + f15 - font.height() - 1.0F, il1iliilli1l1iill5);
         if (this.setTypeAnimation.ArrayListHolder() && this.prevType != null) {
            this.prevType.getPanelSupplier().get().close();
            this.prevType = null;
         } else {
            this.setTypeAnimation.StringHolder_8(1.0F);
         }

         float f20 = 241.0F;
         float f21 = this.field_453 + 104.0F + (float)GuiStyle.PADDING.intValue();
         float f23 = 23.0F;
         f15 = this.field_453 + 480.0F - (float)GuiStyle.PADDING.intValue() - f23;
         f16 = elementpanel.getButtonWidth();
         f17 = elementpanel1 != null ? elementpanel1.getButtonWidth() : 0.0F;
         f18 = f17 * (1.0F - f7) + f16 * f7;
         float f19 = f20 - f18;
         if (f19 < 60.0F) {
            f19 = 60.0F;
         }

         iiii1ilili1l1l1lilli1liliii.EventBus(
            f21, f11, f19, 23.0F, floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()), il1iliilli1l1iill2
         );
         this.clientBounds = new HeightHandler(f15, f11, f23, f23);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f15,
            f11,
            f23,
            f23,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getPanelLeftBackground()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.clientPanel.getAnimationProgress())
               .ZenithInternal039(f1)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         if (elementpanel1 != null) {
            elementpanel1.renderHeader(iiii1ilili1l1l1lilli1liliii, i, j, f1 * (1.0F - f7), this.field_453 + 104.0F, f11, f19);
         }

         elementpanel.renderHeader(iiii1ilili1l1l1lilli1liliii, i, j, f1 * f7, this.field_453 + 104.0F, f11, f19);
         this.renderSearh(iiii1ilili1l1l1lilli1liliii, i, j, f21 + f19 + (float)GuiStyle.PADDING.intValue(), f11, f1);
         Font font2 = Fonts.NEW_ICONS.getFont(5.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            "k",
            f15 + (f23 - font2.width("k")) / 2.0F,
            f11 + (f23 - font2.height()) / 2.0F,
            zenithstyle.getTextSecondary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.clientPanel.getAnimationProgress())
               .ZenithInternal039(f1)
         );
         if (elementpanel1 != null && f17 > 0.01F) {
            elementpanel1.renderHeaderButtons(
               iiii1ilili1l1l1lilli1liliii, i, j, f1 * (1.0F - f7), f15 - (float)GuiStyle.PADDING.intValue() - f17, f11, f17, 1.0F - f7
            );
         }

         if (f16 > 0.01F) {
            elementpanel.renderHeaderButtons(iiii1ilili1l1l1lilli1liliii, i, j, f1 * f7, f15 - (float)GuiStyle.PADDING.intValue() - f16, f11, f16, f7);
         }

         this.generalPanel.render(iiii1ilili1l1l1lilli1liliii, i, j, f1, f12, f13);
         this.miscPanel.render(iiii1ilili1l1l1lilli1liliii, i, j, f1, f12, f13 + 112.0F + f9);
         if (elementpanel1 != null) {
            elementpanel1.render(iiii1ilili1l1l1lilli1liliii, i, j, f1 * (1.0F - f7), this.field_453 + 104.0F, f13);
         }

         elementpanel.render(iiii1ilili1l1l1lilli1liliii, i, j, f1 * f7, this.field_453 + 104.0F, f13);
         iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
      }
   }

   private void renderSearh(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f3 = 96.0F;
         float f4 = 23.0F;
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f,
            f1,
            f3,
            f4,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.NEW_ICONS.getFont(5.0F);
         this.searchField.StringHolder_8(font);
         this.searchField.setWidth(f3 - (float)(GuiStyle.PADDING * 6));
         this.searchField
            .StringHolder_8(
               iiii1ilili1l1l1lilli1liliii,
               f + (float)(GuiStyle.PADDING * 2),
               f1 + (f4 - font.height()) / 2.0F,
               zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2),
               zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            "S",
            f + f3 - font1.width("S") - (float)(GuiStyle.PADDING * 2),
            f1 + (f4 - font1.height()) / 2.0F,
            zenithstyle.getTextSecondary().HostnameVerifierImpl(f2)
         );
      }
   }

   public void resetSearch() {
      if (this.searchField != null) {
         this.searchField.GetDisplayNameHandler("");
         this.searchField.setSelected(false);
         this.searchField.EventImpl_16(0);
      }
   }

   public String getSearchValue() {
      return this.searchField == null ? "" : this.searchField.II1I11IIl();
   }

   public void openHudElementSettings(HudElement ii11l1l11lil1i1) {
      if (ii11l1l11lil1i1 != null) {
         this.ensurePanelsInitialized();
         this.resetSearch();
         this.setType(NLMenuScreen$ElementsType.INTERFACE);
         this.interfacePanel.openHudElementSettings(ii11l1l11lil1i1);
      }
   }

   public ClientPanel getClientPanel() {
      return this.clientPanel;
   }

   private void updateClientPanelVisibilityForRightPanels(boolean flag) {
      if (flag) {
         if (this.clientPanel.isExpanded()) {
            this.clientPanel.setExpanded(false);
            this.restoreClientPanelAfterRightPanel = true;
         }
      } else {
         if (this.restoreClientPanelAfterRightPanel) {
            this.clientPanel.setExpanded(true);
            this.restoreClientPanelAfterRightPanel = false;
         }
      }
   }

   public boolean mouseDragged(double d0, double d1, int i, double d2, double d3) {
      return this.getType().getPanelSupplier().get().onMouseDragged(d0, d1, i, d2, d3) ? true : super.mouseDragged(d0, d1, i, d2, d3);
   }

   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      float f = this.getGuiScale();
      float f1 = this.field_453 + 240.0F;
      float f2 = this.field_454 + 160.0F;
      d0 = (double)((int)((d0 - (double)f1) / (double)f + (double)f1));
      d1 = (double)((int)((d1 - (double)f2) / (double)f + (double)f2));
      this.type.getPanelSupplier().get().mouseScrolled(d0, d1, d2, d3);
      return super.mouseScrolled(d0, d1, d2, d3);
   }

   public boolean keyPressed(int i, int j, int k) {
      if (this.searchField.keyPressed(i, j, k)) {
         return true;
      } else if (this.getType().getPanelSupplier().get().keyPressed(i, j, k)) {
         return true;
      } else {
         if (i == 256 && !this.closing) {
            this.closing = true;
            this.mouseReleased(0.0, 0.0, 0);
            this.mouseReleased(0.0, 0.0, 0);
            this.mouseReleased(0.0, 0.0, 0);
            ZenithClient.getInstance()
               .MinecraftClientHolder_5()
               .StringHolder_8(ZenithClient.getInstance().MinecraftClientHolder_5().lIII1l1I1lIllI1llIIlIlll);
         }

         return super.keyPressed(i, j, k);
      }
   }

   public boolean charTyped(char c0, int i) {
      if (this.searchField.charTyped(c0, i)) {
         return true;
      } else {
         return this.getType().getPanelSupplier().get().charTyped(c0, i) ? true : super.charTyped(c0, i);
      }
   }

   public boolean mouseClicked(double d0, double d1, int i) {
      float f = this.getGuiScale();
      float f1 = this.field_453 + 240.0F;
      float f2 = this.field_454 + 160.0F;
      d0 = (double)((int)((d0 - (double)f1) / (double)f + (double)f1));
      d1 = (double)((int)((d1 - (double)f2) / (double)f + (double)f2));
      ZenithInternal068 ill1iili11ii1l = ZenithInternal068.StringHolder_24(i);
      if (this.searchField.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else {
         try {
            ElementPanel elementpanel = this.getType().getPanelSupplier().get();
            if (elementpanel.onHeaderButtonsClicked(d0, d1, ill1iili11ii1l)) {
               return true;
            }

            if (elementpanel.onMouseClicked(d0, d1, ill1iili11ii1l)) {
               return true;
            }
         } catch (Exception exception) {
            exception.printStackTrace();
         }

         if (this.profileBounds != null && this.profileBounds.byteHolder(d0, d1)) {
            this.profilePanel.toggleExpanded();
         }

         if (this.profilePanel.isRender() && this.profilePanel.onMouseClicked(d0, d1, ill1iili11ii1l)) {
            return true;
         } else if (this.clientBounds != null && this.clientBounds.byteHolder(d0, d1)) {
            ElementPanel elementpanel1 = this.getType().getPanelSupplier().get();
            if (elementpanel1.isRender() || elementpanel1.isRightDrawerOpen()) {
               elementpanel1.closeRightDrawer();
               if (this.prevType != null) {
                  this.prevType.getPanelSupplier().get().closeRightDrawer();
               }
            }

            boolean flag = this.clientPanel.isExpanded();
            this.clientPanel.toggleExpanded();
            if (!flag && this.clientPanel.isExpanded()) {
               elementpanel1.closeRightDrawer();
               if (this.prevType != null) {
                  this.prevType.getPanelSupplier().get().closeRightDrawer();
               }
            }

            return true;
         } else if (this.clientPanel.isRender() && this.clientPanel.onMouseClicked(d0, d1, ill1iili11ii1l)) {
            return true;
         } else if (this.generalPanel.onMouseClicked(d0, d1, ill1iili11ii1l)) {
            this.resetSearch();
            return true;
         } else if (this.miscPanel.onMouseClicked(d0, d1, ill1iili11ii1l)) {
            this.resetSearch();
            return true;
         } else {
            return super.mouseClicked(d0, d1, i);
         }
      }
   }

   public boolean mouseReleased(double d0, double d1, int i) {
      float f = this.getGuiScale();
      float f1 = this.field_453 + 240.0F;
      float f2 = this.field_454 + 160.0F;
      d0 = (double)((int)((d0 - (double)f1) / (double)f + (double)f1));
      d1 = (double)((int)((d1 - (double)f2) / (double)f + (double)f2));
      if (this.getType().getPanelSupplier().get().onMouseReleased(d0, d1, ZenithInternal068.StringHolder_24(i))) {
         return true;
      } else {
         return this.clientPanel.onMouseReleased(d0, d1, ZenithInternal068.StringHolder_24(i)) ? true : super.mouseReleased(d0, d1, i);
      }
   }

   public void tick() {
      if (this.closing && this.animationClose.CloudFriendInfo() == 0.0F) {
         this.close();
      }

      this.getType().getPanelSupplier().get().tick();
      super.tick();
   }

   public void removed() {
      this.closing = true;
      this.mouseReleased(0.0, 0.0, 0);
      this.mouseReleased(0.0, 0.0, 0);
      this.mouseReleased(0.0, 0.0, 0);
      super.removed();
   }

   public void render(DrawContext DrawContext, int i, int j, float f) {
   }

   public void renderBackground(DrawContext DrawContext, int i, int j, float f) {
   }

   public boolean isRenderHud() {
      return l11I1I1ll1Illll1I1l1111l1II.currentScreen == this
         && !this.closing
         && this.getType() == NLMenuScreen$ElementsType.INTERFACE
         && this.interfacePanel.getCurrentCategory() == InterfacePanel$InterfaceCategory.field_443;
   }

   public boolean isFinish() {
      return this.animationClose.CloudFriendInfo() == 0.0F && this.closing;
   }

   public void initialize() {
      this.ensurePanelsInitialized();
   }

   public boolean isShortMode() {
      return !this.clientPanel.getRenderDescription().getSetting().Spider();
   }

   public boolean isRenderIcon() {
      return this.clientPanel.getRenderIcon().getSetting().Spider();
   }

   public float getGuiScale() {
      if (this.clientPanel == null) {
         return 1.0F;
      } else {
         float f = this.clientPanel.getGuiScale().getApplayValue() / 100.0F;
         float f1 = 0.35F;
         float f2 = 100.0F;
         float f3 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth();
         float f4 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight();
         float f5 = f3 / (480.0F + f2);
         float f6 = f4 / (320.0F + f2);
         float f7 = Math.min(f5, f6);
         if (Float.isNaN(f) || Float.isInfinite(f)) {
            return 1.0F;
         } else if (f7 <= 0.0F) {
            return f1;
         } else {
            return f7 < f1 ? f7 : MathHelper.clamp(f, f1, f7);
         }
      }
   }

   public void safe(JsonObject jsonobject) {
      this.ensurePanelsInitialized();
      JsonObject jsonobject1 = new JsonObject();
      jsonobject1.addProperty("type", this.type.name());
      JsonObject jsonobject2 = new JsonObject();
      this.profilePanel.safe(jsonobject2);
      jsonobject1.add("profilePanel", jsonobject2);
      JsonObject jsonobject3 = new JsonObject();
      this.clientPanel.safe(jsonobject3);
      jsonobject1.add("clientPanel", jsonobject3);
      jsonobject.add("NLMenuScreen", jsonobject1);
   }

   public void load(JsonObject jsonobject) {
      this.ensurePanelsInitialized();
      if (jsonobject.has("NLMenuScreen") && jsonobject.get("NLMenuScreen").isJsonObject()) {
         JsonObject jsonobject1 = jsonobject.getAsJsonObject("NLMenuScreen");
         if (jsonobject1.has("type")) {
            try {
               this.setType(NLMenuScreen$ElementsType.valueOf(jsonobject1.get("type").getAsString()));
            } catch (IllegalArgumentException illegalargumentexception) {
            }
         }

         if (jsonobject1.has("profilePanel") && jsonobject1.get("profilePanel").isJsonObject()) {
            this.profilePanel.load(jsonobject1.getAsJsonObject("profilePanel"));
         }

         if (jsonobject1.has("clientPanel") && jsonobject1.get("clientPanel").isJsonObject()) {
            this.clientPanel.load(jsonobject1.getAsJsonObject("clientPanel"));
         }
      }
   }

   private void ensurePanelsInitialized() {
      if (!this.init) {
         this.guiModulePanel = new GuiModulePanel();
         this.guiFreindsPanel = new GuiFreindsPanel();
         this.interfacePanel = new InterfacePanel();
         this.guiConfigPanel = new GuiConfigPanel();
         this.cosmeticElementPanel = new CosmeticElementPanel();
         this.generalPanel = new GeneralPanel();
         this.profilePanel = new ProfilePanel();
         this.clientPanel = new ClientPanel();
         this.miscPanel = new MiscPanel();
         this.init = true;
      }
   }

   public float getBlurPower() {
      return this.clientPanel.getBlurStrength().getSetting().lll1lI1llll1IIllIIIII1lll();
   }

   public void setType(NLMenuScreen$ElementsType nlmenuscreen$elementstype) {
      if (nlmenuscreen$elementstype != this.type) {
         this.setTypeAnimation.EventTarget(0.0F);
         this.setTypeAnimation.StringHolder_8(1.0F);
         this.prevType = this.type;
         this.type = nlmenuscreen$elementstype;
      }
   }

   public GuiModulePanel getGuiModulePanel() {
      return this.guiModulePanel;
   }

   public GuiFreindsPanel getGuiFreindsPanel() {
      return this.guiFreindsPanel;
   }

   public InterfacePanel getInterfacePanel() {
      return this.interfacePanel;
   }

   public GuiConfigPanel getGuiConfigPanel() {
      return this.guiConfigPanel;
   }

   public CosmeticElementPanel getCosmeticElementPanel() {
      return this.cosmeticElementPanel;
   }

   public NLMenuScreen$ElementsType getType() {
      return this.type;
   }
}
