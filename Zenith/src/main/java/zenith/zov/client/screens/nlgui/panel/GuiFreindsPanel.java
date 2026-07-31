package zenith.zov.client.screens.nlgui.panel;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import zenith.GetSettingsHandler;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.StringHolder_17;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.StringSetting;
import zenith.StringSetting$II1Il11l111II11IIl;
import zenith.GetStartTimeHandler;
import zenith.ModeSetting;
import zenith.StringHolder_27;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.GuiCloudFriendElement;
import zenith.zov.client.screens.nlgui.elements.GuiFriendRequestElement;
import zenith.zov.client.screens.nlgui.elements.GuiFriendRowElement;
import zenith.zov.client.screens.nlgui.elements.GuiLocalFriendElement;
import zenith.zov.client.screens.nlgui.elements.api.Element;
import zenith.zov.client.screens.nlgui.elements.setting.GuiModeSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiStringSetting;
import zenith.zov.client.screens.nlgui.panel.api.ElementPanel;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiFreindsPanel extends ElementPanel {
   private static final float HEADER_HEIGHT = 23.0F;
   private static final float ITEM_GAP = 4.0F;
   private static final float SCROLL_SPEED = 22.0F;
   private static final float SCROLL_SMOOTH = 0.25F;
   private static final float POPUP_WIDTH = 128.0F;
   private static final float POPUP_HEADER_HEIGHT = 26.0F;
   private final GetStartTimeHandler tabSwitchAnimation = new GetStartTimeHandler(220L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler headerPopupAnimation = new GetStartTimeHandler(220L, 0.0F, IReturn.ListHolder_8);
   private final List<GuiFriendRowElement> friendElements = new ArrayList<>();
   private final List<GuiFriendRequestElement> requestElements = new ArrayList<>();
   private final List<GuiFreindsPanel$RequestActionBounds> requestActionBounds = new ArrayList<>();
   private final ModeSetting addFriendModeSetting;
   private final StringSetting addFriendTextSetting;
   private final GuiModeSetting guiAddFriendMode;
   private final GuiStringSetting guiAddFriendText;
   private final GetStartTimeHandler submitHoverAnimation = new GetStartTimeHandler(220L, 0.0F, IReturn.ScreenImpl);
   private HeightHandler allFriendsTabBounds;
   private HeightHandler requestsTabBounds;
   private HeightHandler scissorBounds;
   private HeightHandler headerAddButtonBounds;
   private HeightHandler headerPopupBounds;
   private HeightHandler headerPopupCloseBounds;
   private HeightHandler headerSubmitBounds;
   private float rightDrawerProgress = 0.0F;
   private float scroll = 0.0F;
   private float scrollTarget = 0.0F;
   private boolean headerPopupExpanded = false;
   private GuiFreindsPanel$HeaderTab activeTab = GuiFreindsPanel$HeaderTab.ALL_FREINDS;

   public GuiFreindsPanel() {
      this.addFriendModeSetting = new ModeSetting("gui.friendspanel.mode", "", "gui.friendspanel.mode.cloud", "gui.friendspanel.mode.local");
      this.addFriendTextSetting = new StringSetting(
         "gui.friendspanel.target",
         "",
         "",
         "uid_or_name",
         StringSetting$II1Il11l111II11IIl.StringHolder_8(
            40, s -> s.chars().allMatch(i -> Character.isLetterOrDigit(i) || i == 95 || i == 45 || i == 46)
         )
      );
      float f = 128.0F - (float)GuiStyle.PADDING.intValue() * 4.0F;
      this.guiAddFriendMode = new GuiModeSetting(this.addFriendModeSetting, f);
      this.guiAddFriendText = new GuiStringSetting(this.addFriendTextSetting, f);
   }

   @Override
   public void tick() {
      this.syncFriendElements();
      this.syncRequestElements();
   }

   @Override
   public void renderHeader(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
         float f4 = f1 + (float)GuiStyle.PADDING.intValue() * 3.0F;
         float f5 = f2 + (23.0F - font.height()) / 2.0F;
         String s = "8";
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1, s, f4, f2 + (23.0F - font1.height()) / 2.0F - 0.2F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            "Friends",
            f4 + font1.width(s) + (float)GuiStyle.PADDING.intValue(),
            f5,
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
         Font font2 = Fonts.NEW_MEDIUM.getFont(4.8F);
         String s1 = "All Freinds";
         String s2 = "Requests";
         float f6 = (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f7 = (float)GuiStyle.PADDING.intValue();
         float f8 = font2.width(s2);
         float f9 = font2.width(s1);
         float f10 = f1 + f3 - f6 - f8;
         float f11 = f10 - f7;
         float f12 = f11 - f7 - f9;
         float f13 = f2 + (23.0F - font2.height()) / 2.0F;
         this.allFriendsTabBounds = new HeightHandler(f12 - 2.0F, f2 + 1.0F, f9 + 4.0F, 21.0F);
         this.requestsTabBounds = new HeightHandler(f10 - 2.0F, f2 + 1.0F, f8 + 4.0F, 21.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            s1,
            f12,
            f13,
            (this.activeTab == GuiFreindsPanel$HeaderTab.ALL_FREINDS
                  ? zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  : zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1())
               .ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f11, f13, 0.5F, 6.0F, zenithstyle.getDisableActiveBg().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            s2,
            f10,
            f13,
            (this.activeTab == GuiFreindsPanel$HeaderTab.REQUESTS
                  ? zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  : zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1())
               .ZenithInternal039(f)
         );
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         this.requestActionBounds.clear();
         this.scissorBounds = new HeightHandler(f1, f2, 376.0F, 295.5F - (float)GuiStyle.PADDING.intValue() * 2.0F);
         float f3 = this.tabSwitchAnimation.StringHolder_8(this.activeTab == GuiFreindsPanel$HeaderTab.REQUESTS ? 1.0F : 0.0F);
         float f4 = f3 < 0.5F ? this.getAllFriendsContentHeight() : this.getRequestsContentHeight();
         this.clampScroll(f4 + (float)GuiStyle.PADDING.intValue(), this.scissorBounds.height());
         this.scroll = this.scroll + (this.scrollTarget - this.scroll) * 0.25F;
         iiii1ilili1l1l1lilli1liliii.ListHolder_6(f1, f2, f1 + this.scissorBounds.width(), f2 + this.scissorBounds.height());
         float f5 = (1.0F - f3) * f;
         float f6 = f3 * f;
         if (f5 > 0.01F) {
            this.renderAllFriends(iiii1ilili1l1l1lilli1liliii, f5, (float)i, (float)j, f1, f2 - 14.0F * f3, zenithstyle);
         }

         if (f6 > 0.01F) {
            this.renderRequests(iiii1ilili1l1l1lilli1liliii, f6, f1, f2 + 14.0F * (1.0F - f3), zenithstyle);
         }

         iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      }
   }

   @Override
   public float getButtonWidth() {
      return 23.0F + (float)GuiStyle.PADDING.intValue();
   }

   @Override
   public void renderHeaderButtons(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3, float f4) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f5 = 23.0F;
         float f6 = f1 + f3 - f5;
         this.headerAddButtonBounds = new HeightHandler(f6, f2, f5, f5);
         float f7 = this.headerPopupAnimation.StringHolder_8(this.headerPopupExpanded ? 1.0F : 0.0F) * f * f4;
         this.rightDrawerProgress = f7;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f6,
            f2,
            f5,
            f5,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getPanelLeftBackground()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f7)
               .ZenithInternal039(f * f4)
         );
         Font font = Fonts.NEW_ICONS.getFont(5.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            "{",
            f6 + (f5 - font.width("{")) / 2.0F,
            f2 + (f5 - font.height()) / 2.0F,
            zenithstyle.getTextSecondary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f7)
               .ZenithInternal039(f * f4)
         );
      }
   }

   @Override
   public boolean onHeaderButtonsClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.headerPopupExpanded && this.guiAddFriendMode.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (ill1iili11ii1l != ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         return false;
      } else if (this.headerAddButtonBounds != null && this.headerAddButtonBounds.byteHolder(d0, d1)) {
         this.headerPopupExpanded = !this.headerPopupExpanded;
         return true;
      } else if (!this.headerPopupExpanded) {
         return false;
      } else if (this.headerPopupBounds != null && !this.headerPopupBounds.byteHolder(d0, d1)) {
         this.headerPopupExpanded = false;
         return false;
      } else if (this.headerPopupCloseBounds != null && this.headerPopupCloseBounds.StringHolder_8(d0, d1, 2.0F)) {
         this.headerPopupExpanded = false;
         return true;
      } else if (this.guiAddFriendMode.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (this.guiAddFriendText.onMouseClicked(d0, d1, ill1iili11ii1l)) {
         return true;
      } else if (this.headerSubmitBounds != null && this.headerSubmitBounds.byteHolder(d0, d1)) {
         this.submitAddFriend();
         return true;
      } else {
         return true;
      }
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      if (this.headerPopupExpanded && this.guiAddFriendMode.keyPressed(i, j, k)) {
         return true;
      } else if (this.headerPopupExpanded && this.guiAddFriendText.keyPressed(i, j, k)) {
         return true;
      } else {
         if (this.activeTab == GuiFreindsPanel$HeaderTab.ALL_FREINDS) {
            for (GuiFriendRowElement guifriendrowelement : this.friendElements) {
               if (guifriendrowelement instanceof GuiCloudFriendElement guicloudfriendelement
                  && guicloudfriendelement.hasSettings()
                  && guicloudfriendelement.keyPressed(i, j, k)) {
                  return true;
               }
            }
         }

         return super.keyPressed(i, j, k);
      }
   }

   @Override
   public boolean charTyped(char c0, int i) {
      if (this.headerPopupExpanded && this.guiAddFriendMode.charTyped(c0, i)) {
         return true;
      } else if (this.headerPopupExpanded && this.guiAddFriendText.charTyped(c0, i)) {
         return true;
      } else {
         if (this.activeTab == GuiFreindsPanel$HeaderTab.ALL_FREINDS) {
            for (GuiFriendRowElement guifriendrowelement : this.friendElements) {
               if (guifriendrowelement instanceof GuiCloudFriendElement guicloudfriendelement
                  && guicloudfriendelement.hasSettings()
                  && guicloudfriendelement.charTyped(c0, i)) {
                  return true;
               }
            }
         }

         return super.charTyped(c0, i);
      }
   }

   @Override
   public boolean onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.activeTab == GuiFreindsPanel$HeaderTab.ALL_FREINDS) {
         for (GuiFriendRowElement guifriendrowelement : this.friendElements) {
            if (guifriendrowelement instanceof GuiCloudFriendElement guicloudfriendelement) {
               guicloudfriendelement.onMouseReleased(d0, d1, ill1iili11ii1l);
            }
         }
      }

      return super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l != ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         return false;
      } else if (this.allFriendsTabBounds != null && this.allFriendsTabBounds.byteHolder(d0, d1)) {
         this.activeTab = GuiFreindsPanel$HeaderTab.ALL_FREINDS;
         this.scrollTarget = 0.0F;
         return true;
      } else if (this.requestsTabBounds != null && this.requestsTabBounds.byteHolder(d0, d1)) {
         this.activeTab = GuiFreindsPanel$HeaderTab.REQUESTS;
         this.scrollTarget = 0.0F;
         return true;
      } else {
         if (this.activeTab == GuiFreindsPanel$HeaderTab.REQUESTS) {
            StringHolder_27 liil1llili1i11il1i1illllx = this.getCloudClient();
            if (liil1llili1i11il1i1illllx == null) {
               return false;
            }

            for (GuiFreindsPanel$RequestActionBounds guifreindspanel$requestactionbounds : this.requestActionBounds) {
               if (guifreindspanel$requestactionbounds.acceptBounds.byteHolder(d0, d1)) {
                  liil1llili1i11il1i1illllx.ThreadImpl(guifreindspanel$requestactionbounds.DANGER_FIRE);
                  return true;
               }

               if (guifreindspanel$requestactionbounds.declineBounds.byteHolder(d0, d1)) {
                  liil1llili1i11il1i1illllx.WritingThread(guifreindspanel$requestactionbounds.DANGER_FIRE);
                  return true;
               }
            }
         }

         if (this.activeTab == GuiFreindsPanel$HeaderTab.ALL_FREINDS) {
            for (GuiFriendRowElement guifriendrowelement : this.friendElements) {
               HeightHandler li1il11i1iilii1iiili111li11 = guifriendrowelement.getRemoveBounds();
               if (li1il11i1iilii1iiili111li11 != null && li1il11i1iilii1iiili111li11.byteHolder(d0, d1)) {
                  if (guifriendrowelement.isCloud()) {
                     StringHolder_27 liil1llili1i11il1i1illll = this.getCloudClient();
                     if (liil1llili1i11il1i1illll != null) {
                        liil1llili1i11il1i1illll.ZenithInternal033(guifriendrowelement.getCloudUid());
                     }
                  } else {
                     ZenithClient.getInstance()
                        .StringHolder_26()
                        .ZenithInternal033(guifriendrowelement.getLocalName());
                     ZenithClient.getInstance().StringHolder_26().save();
                  }

                  return true;
               }
            }

            for (GuiFriendRowElement guifriendrowelement1 : this.friendElements) {
               if (guifriendrowelement1.getBounds() != null && guifriendrowelement1.getBounds().byteHolder(d0, d1)) {
                  if (guifriendrowelement1 instanceof GuiCloudFriendElement guicloudfriendelement
                     && guicloudfriendelement.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
                     return true;
                  }

                  if (guifriendrowelement1.onMouseClicked(d0, d1, ill1iili11ii1l)) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   @Override
   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      if (this.headerPopupExpanded && this.guiAddFriendMode.onMousePriorityScroll(d0, d1, d2, d3)) {
         return true;
      } else {
         if (this.scissorBounds != null && this.scissorBounds.byteHolder(d0, d1) && this.activeTab == GuiFreindsPanel$HeaderTab.ALL_FREINDS) {
            for (GuiFriendRowElement guifriendrowelement : this.friendElements) {
               if (guifriendrowelement.getBounds() != null
                  && guifriendrowelement.getBounds().byteHolder(d0, d1)
                  && guifriendrowelement instanceof GuiCloudFriendElement guicloudfriendelement
                  && guicloudfriendelement.hasSettings()
                  && guicloudfriendelement.onMousePriorityScroll(d0, d1, d2, d3)) {
                  return true;
               }
            }
         }

         if (this.scissorBounds != null && this.scissorBounds.byteHolder(d0, d1)) {
            float f = this.scissorBounds.height();
            float f1 = this.activeTab == GuiFreindsPanel$HeaderTab.ALL_FREINDS ? this.getAllFriendsContentHeight() : this.getRequestsContentHeight();
            if (f1 + (float)GuiStyle.PADDING.intValue() <= f) {
               return false;
            } else {
               this.scrollTarget += (float)(d3 * 22.0);
               this.clampScroll(f1 + (float)GuiStyle.PADDING.intValue(), f);
               return true;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public List<? extends Element> getElements() {
      return List.of();
   }

   @Override
   public void close() {
      this.requestActionBounds.clear();
      this.scroll = 0.0F;
      this.scrollTarget = 0.0F;
      this.headerPopupExpanded = false;
      this.headerPopupAnimation.EventTarget(0.0F);
   }

   @Override
   public boolean isRightDrawerOpen() {
      return this.headerPopupExpanded || this.headerPopupAnimation.CloudFriendInfo() > 0.01F;
   }

   @Override
   public boolean isRender() {
      return this.isRightDrawerOpen();
   }

   @Override
   public void renderRightPanel(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f2, float f, float f1, float f3) {
      if (!(this.rightDrawerProgress <= 0.01F)) {
         this.renderHeaderPopup(iiii1ilili1l1l1lilli1liliii, this.rightDrawerProgress, (float)i, (float)j, f, f1);
      }
   }

   @Override
   public void closeRightDrawer() {
      this.headerPopupExpanded = false;
   }

   private void renderHeaderPopup(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f5 = 128.0F;
         float f6 = f5 - (float)GuiStyle.PADDING.intValue() * 4.0F;
         float f7 = (float)GuiStyle.PADDING.intValue()
            + this.guiAddFriendMode.getHeight()
            + (float)GuiStyle.PADDING.intValue()
            + this.guiAddFriendText.getHeight()
            + (float)GuiStyle.PADDING.intValue() * 2.0F
            + 14.0F
            + (float)GuiStyle.PADDING.intValue();
         float f8 = 26.0F + f7;
         float f9 = f3 - (f5 + (float)GuiStyle.PADDING.intValue()) * (1.0F - f);
         this.headerPopupBounds = new HeightHandler(f9, f4, f5, f8);
         iiii1ilili1l1l1lilli1liliii.ListHolder_6(
            f3 - (float)GuiStyle.PADDING.intValue() * 3.0F, f4, f3 + f5 + (float)GuiStyle.PADDING.intValue() * 4.0F, f4 + f8
         );
         if (ZenithClient.getInstance().ZenithInternal141().getBlurPower() != 0.0F) {
            floatHolder_8.StringHolder_8(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               f9,
               f4,
               f5,
               f8,
               ZenithClient.getInstance().ZenithInternal141().getBlurPower(),
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f),
               true,
               false
            );
         }

         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f9,
            f4,
            f5,
            26.0F,
            floatHolder_5.GetDisplayNameHandler_2((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f9,
            f4 + 26.0F,
            f5,
            f8 - 26.0F,
            floatHolder_5.ZenithInternal016((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
         Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
         Font font1 = Fonts.NEW_ICONS.getFont(4.5F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            "{",
            f9 + (float)GuiStyle.PADDING.intValue() * 2.0F,
            f4 + (26.0F - font1.height()) / 2.0F,
            zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            "Add friend",
            f9 + (float)GuiStyle.PADDING.intValue() * 2.0F + font1.width("a") + (float)GuiStyle.PADDING.intValue() / 2.0F,
            f4 + (26.0F - font.height()) / 2.0F,
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
         float f10 = f9 + f5 - font1.width("2") - (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f11 = f4 + (26.0F - font1.height()) / 2.0F;
         this.headerPopupCloseBounds = new HeightHandler(f10, f11, font1.width("2"), font1.height());
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1, "2", f10, f11, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
         float f12 = f9 + (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f13 = f4 + 26.0F + (float)GuiStyle.PADDING.intValue();
         this.guiAddFriendMode.render(iiii1ilili1l1l1lilli1liliii, f1, f2, f12, f13, f);
         float f14 = f13 + this.guiAddFriendMode.getAnimHeight() + (float)GuiStyle.PADDING.intValue();
         this.guiAddFriendText.render(iiii1ilili1l1l1lilli1liliii, f1, f2, f12, f14, f);
         float f15 = f14 + this.guiAddFriendText.getAnimHeight() + (float)GuiStyle.PADDING.intValue() * 2.0F;
         this.headerSubmitBounds = new HeightHandler(f12, f15, f6, 14.0F);
         float f16 = this.submitHoverAnimation
            .StringHolder_8(this.headerSubmitBounds.byteHolder((double)f1, (double)f2) && !this.guiAddFriendMode.contains(f1, f2) ? 1.0F : 0.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            this.headerSubmitBounds.Il11lIlllI111I1l1111(),
            this.headerSubmitBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            this.headerSubmitBounds.width(),
            this.headerSubmitBounds.height(),
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
            zenithstyle.getFieldSurfaceBackground()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f16 * 0.15F)
               .ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.headerSubmitBounds.Il11lIlllI111I1l1111(),
            this.headerSubmitBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            this.headerSubmitBounds.width(),
            this.headerSubmitBounds.height(),
            0.1F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
            zenithstyle.getFieldBorder()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f16 * 0.35F)
               .ZenithInternal039(f)
         );
         Font font2 = Fonts.NEW_ICONS.getFont(5.0F);
         Font font3 = Fonts.NEW_MEDIUM.getFont(5.3F);
         String s = this.addFriendModeSetting.ClearHeadersHandler(0) ? "Add cloud" : "Add local";
         float f17 = font2.width("{") + (float)GuiStyle.PADDING.intValue() / 2.0F + font3.width(s);
         float f18 = this.headerSubmitBounds.Il11lIlllI111I1l1111() + (this.headerSubmitBounds.width() - f17) / 2.0F;
         float f19 = this.headerSubmitBounds.I1II11l1I11Illl11IIl1l1lIl1II() + (this.headerSubmitBounds.height() - font2.height()) / 2.0F + 0.28F;
         float f20 = this.headerSubmitBounds.I1II11l1I11Illl11IIl1l1lIl1II() + (this.headerSubmitBounds.height() - font3.height()) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            "{",
            f18,
            f19,
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f16)
               .ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font3,
            s,
            f18 + font2.width("{") + (float)GuiStyle.PADDING.intValue() / 2.0F,
            f20,
            zenithstyle.getTextSecondary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f16)
               .ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
         this.guiAddFriendMode.renderPriority(iiii1ilili1l1l1lilli1liliii, f1, f2, f12, f13, f, 1.0F);
      }
   }

   private void submitAddFriend() {
      String s = this.addFriendTextSetting.getValue() == null ? "" : this.addFriendTextSetting.getValue().trim();
      if (!s.isEmpty()) {
         if (this.addFriendModeSetting.ClearHeadersHandler(0)) {
            StringHolder_27 liil1llili1i11il1i1illll = this.getCloudClient();
            if (liil1llili1i11il1i1illll != null) {
               liil1llili1i11il1i1illll.BufferedOutputStreamImpl(s);
            }
         } else {
            ZenithClient.getInstance().StringHolder_26().add(s);
            ZenithClient.getInstance().StringHolder_26().save();
         }

         this.addFriendTextSetting.booleanHolder_3("");
      }
   }

   private float getAllFriendsContentHeight() {
      float f = 0.0F;
      int i = 0;

      for (GuiFriendRowElement guifriendrowelement : this.friendElements) {
         float f1 = guifriendrowelement.getVisibleAnimation().CloudFriendInfo();
         if (!(f1 <= 0.02F) || guifriendrowelement.isTargetVisible()) {
            float f2 = guifriendrowelement.isTargetVisible() ? 1.0F : f1;
            f += (guifriendrowelement.getHeight() + ITEM_GAP) * f2;
            i++;
         }
      }

      return i > 0 ? f - ITEM_GAP : 0.0F;
   }

   private float getRequestsContentHeight() {
      float f = 0.0F;
      int i = 0;

      for (GuiFriendRequestElement guifriendrequestelement : this.requestElements) {
         float f1 = guifriendrequestelement.getVisibleAnimation().CloudFriendInfo();
         if (!(f1 <= 0.02F) || guifriendrequestelement.isTargetVisible()) {
            float f2 = guifriendrequestelement.isTargetVisible() ? 1.0F : f1;
            f += (guifriendrequestelement.getHeight() + ITEM_GAP) * f2;
            i++;
         }
      }

      return i > 0 ? f - ITEM_GAP : 0.0F;
   }

   private void clampScroll(float f, float f1) {
      float f2 = f > f1 ? f1 - f : 0.0F;
      this.scrollTarget = Math.max(f2, Math.min(0.0F, this.scrollTarget));
      if (this.scroll > 0.0F) {
         this.scroll = 0.0F;
      }
   }

   private List<GuiFreindsPanel$GuiLocalFreind> getLocalFreinds() {
      Collection collection = ZenithClient.getInstance().StringHolder_26().getItems();
      if (collection != null && !collection.isEmpty()) {
         ArrayList arraylist = new ArrayList(collection.size());

         for (String s : collection) {
            if (s != null && !s.isBlank()) {
               arraylist.add(new GuiFreindsPanel$GuiLocalFreind(s.trim()));
            }
         }

         arraylist.sort(Comparator.comparing(guifreindspanel$guilocalfreind -> guifreindspanel$guilocalfreind.name.toLowerCase(Locale.ROOT)));
         return arraylist;
      } else {
         return List.of();
      }
   }

   private StringHolder_27 getCloudClient() {
      return ZenithClient.getInstance().getCloudClient();
   }

   private void syncFriendElements() {
      for (GuiFriendRowElement guifriendrowelement : this.friendElements) {
         guifriendrowelement.beginSync();
      }

      List list = ZenithClient.getInstance().StringHolder_26().ZenithInternal001();
      float f = 0.0F;

      for (GetSettingsHandler i11ll1111lil11i : list) {
         String s = "cloud:" + i11ll1111lil11i.Autoexplosion();
         Object object = this.findFriendRowByKey(s);
         if (object == null) {
            object = new GuiCloudFriendElement(i11ll1111lil11i);
            this.friendElements.add((GuiFriendRowElement)object);
         }

         ((GuiFriendRowElement)object).markPresent(f++);
      }

      for (GuiFreindsPanel$GuiLocalFreind guifreindspanel$guilocalfreind : this.getLocalFreinds()) {
         String s1 = "local:" + guifreindspanel$guilocalfreind.name;
         Object object1 = this.findFriendRowByKey(s1);
         if (object1 == null) {
            object1 = new GuiLocalFriendElement(guifreindspanel$guilocalfreind.name);
            this.friendElements.add((GuiFriendRowElement)object1);
         }

         if (object1 instanceof GuiLocalFriendElement guilocalfriendelement) {
            guilocalfriendelement.syncLocal(f++);
         }
      }

      ArrayList arraylist = new ArrayList();

      for (GuiFriendRowElement guifriendrowelement1 : this.friendElements) {
         if (guifriendrowelement1.shouldRemoveAfterSync()) {
            arraylist.add(guifriendrowelement1);
         }
      }

      this.friendElements.removeAll(arraylist);
   }

   private void syncRequestElements() {
      for (GuiFriendRequestElement guifriendrequestelement : this.requestElements) {
         guifriendrequestelement.beginSync();
      }

      for (StringHolder_17 l1111ililiii1ll1i : this.getCloudClient() != null ? this.getCloudClient().ColorSetting() : List.of()) {
         String s = "request:" + l1111ililiii1ll1i.Autoauth();
         GuiFriendRequestElement guifriendrequestelement1 = this.findRequestRowByKey(s);
         if (guifriendrequestelement1 == null) {
            guifriendrequestelement1 = new GuiFriendRequestElement(l1111ililiii1ll1i.Autoauth(), l1111ililiii1ll1i.Autocraft());
            this.requestElements.add(guifriendrequestelement1);
         }

         guifriendrequestelement1.syncFromRequest(l1111ililiii1ll1i.Autocraft());
      }

      ArrayList arraylist = new ArrayList();

      for (GuiFriendRequestElement guifriendrequestelement2 : this.requestElements) {
         if (guifriendrequestelement2.shouldRemoveAfterSync()) {
            arraylist.add(guifriendrequestelement2);
         }
      }

      this.requestElements.removeAll(arraylist);
   }

   private GuiFriendRowElement findFriendRowByKey(String s) {
      for (GuiFriendRowElement guifriendrowelement : this.friendElements) {
         if (guifriendrowelement.getEnd().equals(s)) {
            return guifriendrowelement;
         }
      }

      return null;
   }

   private GuiFriendRequestElement findRequestRowByKey(String s) {
      for (GuiFriendRequestElement guifriendrequestelement : this.requestElements) {
         if (guifriendrequestelement.next().equals(s)) {
            return guifriendrequestelement;
         }
      }

      return null;
   }

   private void renderAllFriends(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, ZenithStyle zenithstyle
   ) {
      float f5 = f3 + (float)GuiStyle.PADDING.intValue();
      float f6 = f4 + this.scroll;
      float f7 = 376.0F - (float)GuiStyle.PADDING.intValue() * 2.0F;
      this.friendElements.sort((guifriendrowelement1, guifriendrowelement2) -> Float.compare(guifriendrowelement1.getOrder(), guifriendrowelement2.getOrder()));

      for (GuiFriendRowElement guifriendrowelement : this.friendElements) {
         float f8 = guifriendrowelement.render(iiii1ilili1l1l1lilli1liliii, f1, f2, f5, f6, f7, f, zenithstyle);
         if (!(f8 <= 0.02F)) {
            if (guifriendrowelement instanceof GuiCloudFriendElement) {
               GuiCloudFriendElement guicloudfriendelement = (GuiCloudFriendElement)guifriendrowelement;
               if (guicloudfriendelement.hasSettings()) {
                  guicloudfriendelement.renderPriority(iiii1ilili1l1l1lilli1liliii, f1, f2, f5, f6, f);
               }
            }

            f6 += (guifriendrowelement.getHeight() + ITEM_GAP) * guifriendrowelement.getVisibleAnimation().CloudFriendInfo();
         }
      }
   }

   private void renderRequests(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, ZenithStyle zenithstyle) {
      Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
      float f3 = f1 + (float)GuiStyle.PADDING.intValue();
      float f4 = f2 + this.scroll;
      float f5 = 376.0F - (float)GuiStyle.PADDING.intValue() * 2.0F;
      if (this.requestElements.isEmpty()) {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, "No requests in this session", f3 + 4.0F, f4 + 6.0F, zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
      } else {
         for (GuiFriendRequestElement guifriendrequestelement : this.requestElements) {
            float f6 = guifriendrequestelement.render(iiii1ilili1l1l1lilli1liliii, f3, f4, f5, f, zenithstyle);
            if (!(f6 <= 0.02F)) {
               HeightHandler li1il11i1iilii1iiili111li11x = guifriendrequestelement.getAcceptBounds();
               HeightHandler li1il11i1iilii1iiili111li11x = guifriendrequestelement.getDeclineBounds();
               if (li1il11i1iilii1iiili111li11x != null && li1il11i1iilii1iiili111li11x != null) {
                  this.requestActionBounds
                     .add(new GuiFreindsPanel$RequestActionBounds(guifriendrequestelement.getUid(), li1il11i1iilii1iiili111li11x, li1il11i1iilii1iiili111li11x));
               }

               f4 += (guifriendrequestelement.getHeight() + ITEM_GAP) * guifriendrequestelement.getVisibleAnimation().CloudFriendInfo();
            }
         }
      }
   }
}
