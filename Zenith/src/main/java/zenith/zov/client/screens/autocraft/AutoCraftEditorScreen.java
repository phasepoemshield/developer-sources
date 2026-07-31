package zenith.zov.client.screens.autocraft;

import zenith.hud.*;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.Vector2f;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ScreenImpl;
import zenith.StringHolder_14;
import zenith.ZenithInternal068;
import zenith.Autocraft;
import zenith.Menu;
import zenith.floatHolder_8;
import zenith.OnMouseClickedHandler;
import zenith.GetStartTimeHandler;
import zenith.ZenithInternal143;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiBooleanSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class AutoCraftEditorScreen extends ScreenImpl {
   private static final float panelWidth = 480.0F;
   private static final float panelHeight = 320.0F;
   private static final float topHeight = 284.0F;
   private static final float bottomHeight = 36.0F;
   private static final ByteBufferHolder topColor = GuiStyle.RIGHT_BACKGROUND;
   private static final ByteBufferHolder bottomColor = GuiStyle.LEFT_BACKGROUND;
   private static final ByteBufferHolder blurDesignTint = new ByteBufferHolder(12, 12, 12, 20);
   private static final ByteBufferHolder panelInnerColor61 = GuiStyle.FIELD_SURFACE_BACKGROUND;
   private static final ByteBufferHolder panelInnerColor122 = GuiStyle.PANEL_LEFT_BACKGROUND;
   private static final ByteBufferHolder settingsButtonIdleColor = GuiStyle.PANEL_LEFT_BACKGROUND;
   private static final ByteBufferHolder settingsButtonHoverColor = GuiStyle.DISABLE_ACTIVE_BG;
   private static final ByteBufferHolder settingsButtonActiveColor = GuiStyle.PRIMARY_COLOR;
   private static final ByteBufferHolder itemTextColor = GuiStyle.TEXT_SECONDARY;
   private static final ByteBufferHolder countColor = GuiStyle.TEXT_TERTIARY;
   private static final ByteBufferHolder searchEmptySelected = ByteBufferHolder.lllIll11l1I11Il1II11II1I11;
   private static final ByteBufferHolder searchEmptyUnselected = GuiStyle.TEXT_SECONDARY;
   private static final ByteBufferHolder arrowColor = GuiStyle.FIELD_BORDER;
   private static final ByteBufferHolder scrollTrackColor = GuiStyle.FIELD_SURFACE_BACKGROUND;
   private static final ByteBufferHolder scrollThumbColor = GuiStyle.FIELD_BORDER;
   private static final ByteBufferHolder deleteTextColor = GuiStyle.TEXT_SECONDARY;
   private static final floatHolder_5 topRadius = new floatHolder_5(
      (float)GuiStyle.ROUND.intValue(), (float)GuiStyle.ROUND.intValue(), 0.0F, 0.0F
   );
   private static final floatHolder_5 bottomRadius = new floatHolder_5(
      0.0F, 0.0F, (float)GuiStyle.ROUND.intValue(), (float)GuiStyle.ROUND.intValue()
   );
   private static final floatHolder_5 radius8 = floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue());
   private static final floatHolder_5 radius10 = floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue());
   private static final floatHolder_5 radius1 = floatHolder_5.StringHolder_30(1.0F);
   private static final floatHolder_5 radius128 = floatHolder_5.StringHolder_30(128.0F);
   private static final Font font6 = Fonts.NEW_MEDIUM.getFont(6.0F);
   private static final Font font55 = Fonts.NEW_MEDIUM.getFont(5.5F);
   private static final Font font5 = Fonts.NEW_REGULAR.getFont(5.0F);
   private static final Font font47 = Fonts.NEW_MEDIUM.getFont(4.7F);
   private static final Font font4 = Fonts.NEW_MEDIUM.getFont(4.0F);
   private static final Font iconFont6 = Fonts.NEW_ICONS.getFont(6.0F);
   private static final Font iconFont7 = Fonts.NEW_ICONS.getFont(7.0F);
   private static final float settingsPanelOffsetX = 10.0F;
   private static final float settingsPanelWidth = 128.0F;
   private static final float settingsHeaderWidth = 128.0F;
   private static final float settingsHeaderHeight = 23.0F;
   private static final float settingsPanelPadding = 8.0F;
   private static final float settingsControlGap = 6.0F;
   private static final long ribbonAppearDurationMs = 160L;
   private static final long selectionSaveDelayMs = 650L;
   private static final float ribbonAppearEpsilon = 0.001F;
   private static final float ribbonClickAppearThreshold = 0.5F;
   private static final float ribbonShiftSnapEpsilon = 0.05F;
   private static final float ribbonShiftStepFactor = 0.25F;
   private static final float ribbonShiftMinStep = 0.5F;
   private static final float ribbonPadding = 4.0F;
   private static final float ribbonItemHeight = 23.0F;
   private static final float ribbonItemGap = 4.0F;
   private static final float ribbonIconSize = 8.0F;
   private static final float ribbonIconLeftPadding = 4.0F;
   private static final float ribbonTextGapFromIcon = 4.0F;
   private static final float ribbonIconVisibilityThreshold = 12.0F;
   private static final float ribbonTextVisibilityThreshold = 24.0F;
   private static final ItemStack craftingTableStack = Items.CRAFTING_TABLE.getDefaultStack();
   private static final ItemStack chestStack = Items.CHEST.getDefaultStack();
   private final Autocraft module;
   private String searchQuery = "";
   private float bottomPresetRibbonScrollX = 0.0F;
   private float bottomPresetRibbonMaxScrollX = 0.0F;
   private boolean settingsPanelVisible = false;
   private final GetStartTimeHandler screenOpenCloseAnimation = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler settingsPanelRevealAnimation = new GetStartTimeHandler(220L, 0.0F, IReturn.ZenithInternal066);
   private final GetStartTimeHandler settingsButtonHoverAnimation = new GetStartTimeHandler(140L, 0.0F, IReturn.ZenithInternal066);
   private final GetStartTimeHandler settingsButtonActiveAnimation = new GetStartTimeHandler(180L, 0.0F, IReturn.ZenithInternal066);
   private boolean closing = false;
   private Runnable pendingCloseAction = null;
   private boolean selectionSavePending = false;
   private long selectionSaveAtMs = 0L;
   private OnMouseClickedHandler searchBox;
   private static boolean restoreUiOnNextOpen = false;
   private static String restoreSearchQuery = "";
   private static float restoreRibbonScrollX = 0.0F;
   private static boolean restoreSettingsPanelVisible = false;
   private final List<String> ingredientKeysCache = new ArrayList<>();
   private final List<GuiSetting<?>> settingsPanelControls = new ArrayList<>();
   private final Map<String, Float> ribbonItemCurrentX = new HashMap<>();
   private final Map<String, GetStartTimeHandler> ribbonItemAppearAnim = new HashMap<>();
   private String ribbonAnimationProfile = "";
   private boolean ribbonAnimationInitialized = false;

   public AutoCraftEditorScreen(Autocraft Autocraft) {
      this.module = Autocraft;
      this.initSettingsPanelControls();
      if (restoreUiOnNextOpen) {
         this.searchQuery = restoreSearchQuery == null ? "" : restoreSearchQuery;
         this.bottomPresetRibbonScrollX = Math.max(0.0F, restoreRibbonScrollX);
         this.settingsPanelVisible = restoreSettingsPanelVisible;
         OnMouseClickedHandler li111l1i1ili111111ll1iiii1 = this.getSearchBox();
         li111l1i1ili111111ll1iiii1.GetDisplayNameHandler(this.searchQuery);
         li111l1i1ili111111ll1iiii1.EventImpl_16(this.searchQuery.length());
         restoreUiOnNextOpen = false;
      }

      this.screenOpenCloseAnimation.EventBus(0.0F);
      this.settingsPanelRevealAnimation.EventBus(this.settingsPanelVisible ? 1.0F : 0.0F);
      this.settingsButtonHoverAnimation.EventBus(0.0F);
      this.settingsButtonActiveAnimation.EventBus(this.settingsPanelVisible ? 1.0F : 0.0F);
      this.ribbonAnimationProfile = this.getRibbonProfileKey();
      this.initializeRibbonAnimationState();
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      float f2 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() - 480.0F) / 2.0F;
      float f3 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() - 320.0F) / 2.0F;
      float f4 = f3 + 284.0F;
      float f5 = f2 + 240.0F;
      float f6 = f3 + 160.0F;
      this.screenOpenCloseAnimation.ZenithInternal095(this.closing ? 0.0F : 1.0F);
      float f7 = this.screenOpenCloseAnimation.ArmorHud();
      if (this.closing && f7 <= 0.001F) {
         Runnable runnable = this.pendingCloseAction == null ? this::openClickGui : this.pendingCloseAction;
         this.pendingCloseAction = null;
         this.closing = false;
         runnable.run();
      } else {
         float f8 = 0.96F + 0.04F * f7;
         iiii1ilili1l1l1lilli1liliii.getMatrices().push();
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f5, f6, 0.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f8, f8, 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-f5, -f6, 0.0F);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, f7);
         this.settingsPanelRevealAnimation.ZenithInternal095(this.settingsPanelVisible ? 1.0F : 0.0F);
         this.settingsPanelRevealAnimation.ArmorHud();
         float f9 = this.getSettingsPanelRevealProgress();
         if (f9 > 0.001F) {
            this.renderSettingsPanel(iiii1ilili1l1l1lilli1liliii, f, f1, f9);
         }

         floatHolder_8.ZenithInternal028(
            iiii1ilili1l1l1lilli1liliii.getMatrices(), f2, f3, 480.0F, 284.0F, 32.0F, topRadius, ByteBufferHolder.ll1lIllll111I1lIIl1lIl
         );
         floatHolder_8.ZenithInternal028(
            iiii1ilili1l1l1lilli1liliii.getMatrices(), f2, f4, 480.0F, 36.0F, 32.0F, bottomRadius, ByteBufferHolder.ll1lIllll111I1lIIl1lIl
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f2, f3, 480.0F, 284.0F, topRadius, topColor);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f2, f4, 480.0F, 36.0F, bottomRadius, bottomColor);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f2, f3, 480.0F, 284.0F, topRadius, blurDesignTint);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f2, f4, 480.0F, 36.0F, bottomRadius, blurDesignTint);
         this.renderMarkLabelPanel(iiii1ilili1l1l1lilli1liliii, f2, f3);
         this.renderTopItemPanel(iiii1ilili1l1l1lilli1liliii, f2, f3);
         this.renderSearchBar(iiii1ilili1l1l1lilli1liliii, f2, f3);
         this.renderSettingsButton(iiii1ilili1l1l1lilli1liliii, f2, f3, f, f1);
         this.renderCraftTablePanel(iiii1ilili1l1l1lilli1liliii, f2, f3);
         this.renderChestPanel(iiii1ilili1l1l1lilli1liliii, f2, f3);
         this.renderBottomPresetRibbon(iiii1ilili1l1l1lilli1liliii, f2, f4, 480.0F, 36.0F);
         this.renderCraftGrid(iiii1ilili1l1l1lilli1liliii, f2, f3);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
      }
   }

   private void initSettingsPanelControls() {
      this.settingsPanelControls.clear();
      float f = getSettingsControlWidth();
      this.settingsPanelControls.add(new GuiBooleanSetting(this.module.lIIIlllI11I1III1l1lIlIl(), f));
      this.settingsPanelControls.add(new GuiBooleanSetting(this.module.l1IllI11l1lI1ll11I(), f));
      this.settingsPanelControls.add(new GuiBooleanSetting(this.module.llIl1I11IIII(), f));
   }

   private void renderSettingsPanel(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f3 = this.getSettingsPanelAnimatedX(f2);
         float f4 = this.getSettingsPanelY();
         float f5 = this.getSettingsPanelW();
         float f6 = this.getSettingsPanelH();
         floatHolder_8.EventImpl_24(
            iiii1ilili1l1l1lilli1liliii.getMatrices(), f3, f4, f5, f6, 12.0F, radius10, ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f3, f4, f5, f6, radius10, zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f3, f4, f5, f6, radius10, blurDesignTint);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f3, f4, 128.0F, 23.0F, topRadius, zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
         );
         float f7 = f3 + 8.0F;
         float f8 = f4 + (23.0F - font55.height()) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font55, "Settings", f7, f8, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
         );
         float f9 = this.getSettingsContentY();
         float f10 = this.getSettingsContentX(f2);

         for (GuiSetting guisetting : this.settingsPanelControls) {
            this.renderEditorSetting(guisetting, iiii1ilili1l1l1lilli1liliii, f, f1, f10, f9, f2);
            f9 += guisetting.getHeight() + 6.0F;
         }

         f9 = this.getSettingsContentY();

         for (GuiSetting guisetting1 : this.settingsPanelControls) {
            this.renderEditorSettingPriority(guisetting1, iiii1ilili1l1l1lilli1liliii, f, f1, f10, f9, f2);
            f9 += guisetting1.getHeight() + 6.0F;
         }
      }
   }

   private void renderEditorSetting(
      GuiSetting<?> guisetting, floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4
   ) {
      Supplier supplier = guisetting.getSetting().l1l1II1I1ll11l1IlI1lI11l1();
      guisetting.getSetting().StringHolder_8(() -> true);

      try {
         guisetting.render(iiii1ilili1l1l1lilli1liliii, f, f1, f2, f3, f4);
      } finally {
         guisetting.getSetting().StringHolder_8(supplier);
      }
   }

   private void renderEditorSettingPriority(
      GuiSetting<?> guisetting, floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4
   ) {
      Supplier supplier = guisetting.getSetting().l1l1II1I1ll11l1IlI1lI11l1();
      guisetting.getSetting().StringHolder_8(() -> true);

      try {
         guisetting.renderPriority(iiii1ilili1l1l1lilli1liliii, f, f1, f2, f3, f4, this.module.Spider() ? 1.0F : 0.5F);
      } finally {
         guisetting.getSetting().StringHolder_8(supplier);
      }
   }

   private void renderMarkLabelPanel(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      float f2 = f + 4.0F;
      float f3 = f1 + 4.0F;
      float f4 = 63.5F;
      float f5 = 23.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f2, f3, 63.5F, 23.0F, radius8, panelInnerColor122);
      String s = "AutoCraft";
      float f6 = f2 + (63.5F - font6.width("AutoCraft")) / 2.0F;
      float f7 = f3 + (23.0F - font6.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font6, "AutoCraft", f6, f7, ByteBufferHolder.ll1lIllll111I1lIIl1lIl);
   }

   private void renderTopItemPanel(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      float f2 = f + 4.0F;
      float f3 = 63.5F;
      float f4 = 245.5F;
      float f5 = 23.0F;
      float f6 = f2 + 63.5F + 4.0F;
      float f7 = f1 + 4.0F;
      float f8 = 23.0F;
      float f9 = 52.5F;
      float f10 = 23.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f6, f7, 245.5F, 23.0F, radius8, panelInnerColor61);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f6, f7, 23.0F, 23.0F, radius8, panelInnerColor61);
      StringHolder_14 ill111l1iiill1ll1illi = this.module.II1111llIIl1();
      if (ill111l1iiill1ll1illi != null) {
         boolean flag = ill111l1iiill1ll1illi.IIIII1lIIII11llI();
         float f11 = f6 + 245.5F - 52.5F;
         if (flag) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(f11, f7, 52.5F, 23.0F, radius8, panelInnerColor122);
            String s = "Delete";
            float f12 = f11 + (52.5F - font6.width("Delete")) / 2.0F;
            float f13 = f7 + (23.0F - font6.height()) / 2.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(font6, "Delete", f12, f13, deleteTextColor);
         }

         ItemStack ItemStack = ill111l1iiill1ll1illi.EventBus(this.module);
         if (!ItemStack.isEmpty()) {
            float f18 = 8.0F;
            float f19 = 0.5F;
            float f14 = f6 + 7.5F;
            float f15 = f7 + 7.5F;
            iiii1ilili1l1l1lilli1liliii.getMatrices().push();
            iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f14, f15, 0.0F);
            iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.5F, 0.5F, 1.0F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(ItemStack, 0, 0);
            iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
         }

         Font font = font6;
         String s1 = ill111l1iiill1ll1illi.StringHolder_8(this.module);
         if (s1 == null || s1.isBlank()) {
            s1 = ill111l1iiill1ll1illi.getDisplayName();
         }

         if (s1 == null) {
            s1 = "";
         }

         float f20 = f6 + 23.0F + 8.0F;
         float f21 = f7 + (23.0F - font.height()) / 2.0F;
         float f16 = flag ? f11 - 4.0F : f6 + 245.5F - 6.0F;
         float f17 = f16 - f20;
         if (!(f17 <= 0.0F)) {
            if (font.width(s1) > f17) {
               while (!s1.isEmpty() && font.width(s1 + "...") > f17) {
                  s1 = s1.substring(0, s1.length() - 1);
               }

               if (!s1.isEmpty()) {
                  s1 = s1 + "...";
               }
            }

            if (!s1.isEmpty()) {
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s1, f20, f21, ByteBufferHolder.ll1lIllll111I1lIIl1lIl);
            }
         }
      }
   }

   private void renderSearchBar(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      float f2 = f + 4.0F;
      float f3 = 63.5F;
      float f4 = 245.5F;
      float f5 = f2 + 63.5F + 4.0F;
      float f6 = f5 + 245.5F + 4.0F;
      float f7 = f1 + 4.0F;
      float f8 = 128.0F;
      float f9 = 23.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f6, f7, 128.0F, 23.0F, radius8, panelInnerColor122);
      OnMouseClickedHandler li111l1i1ili111111ll1iiii1 = this.getSearchBox();
      li111l1i1ili111111ll1iiii1.setWidth(112.0F);
      ByteBufferHolder il1iliilli1l1iill = li111l1i1ili111111ll1iiii1.isSelected() ? searchEmptySelected : searchEmptyUnselected;
      li111l1i1ili111111ll1iiii1.StringHolder_8(
         iiii1ilili1l1l1lilli1liliii,
         f6 + 8.0F,
         f7 + (23.0F - li111l1i1ili111111ll1iiii1.IIl1llI1Il111I11I111II().height()) / 2.0F,
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
         il1iliilli1l1iill
      );
   }

   private void renderSettingsButton(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3) {
      float f4 = f + 4.0F;
      float f5 = 63.5F;
      float f6 = 245.5F;
      float f7 = f4 + 63.5F + 4.0F;
      float f8 = 128.0F;
      float f9 = f7 + 245.5F + 4.0F;
      float f10 = f1 + 4.0F;
      float f11 = f9 + 128.0F + 4.0F;
      float f12 = 23.0F;
      boolean flag = ZenithInternal143.StringHolder_8((double)f11, (double)f10, 23.0, 23.0, (double)f2, (double)f3);
      this.settingsButtonHoverAnimation.ZenithInternal095(flag && !this.settingsPanelVisible ? 1.0F : 0.0F);
      float f13 = this.settingsButtonHoverAnimation.ArmorHud();
      this.settingsButtonActiveAnimation.ZenithInternal095(this.settingsPanelVisible ? 1.0F : 0.0F);
      float f14 = this.settingsButtonActiveAnimation.ArmorHud();
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      ByteBufferHolder il1iliilli1l1iill = zenithstyle == null ? settingsButtonActiveColor : zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1();
      ByteBufferHolder il1iliilli1l1iill1 = settingsButtonIdleColor.StringHolder_8(settingsButtonHoverColor, f13);
      ByteBufferHolder il1iliilli1l1iill2 = il1iliilli1l1iill1.StringHolder_8(il1iliilli1l1iill, f14);
      String s = "F";
      float f15 = f11 + (23.0F - iconFont6.width("F")) / 2.0F;
      float f16 = f10 + (23.0F - iconFont6.height()) / 2.0F - 0.3F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f11, f10, 23.0F, 23.0F, radius8, il1iliilli1l1iill2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(iconFont6, "F", f15, f16, ByteBufferHolder.ll1lIllll111I1lIIl1lIl);
   }

   private void renderCraftTablePanel(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      float f2 = f1 + 4.0F;
      float f3 = 23.0F;
      float f4 = 234.0F;
      float f5 = 23.0F;
      float f6 = 23.0F;
      float f7 = f + 4.0F;
      float f8 = f2 + 23.0F + 4.0F;
      float f9 = 0.5F;
      float f10 = 8.0F;
      float f11 = f7 + 7.5F;
      float f12 = f8 + 7.5F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f7, f8, 234.0F, 23.0F, radius8, panelInnerColor61);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f7, f8, 23.0F, 23.0F, radius8, panelInnerColor61);
      iiii1ilili1l1l1lilli1liliii.getMatrices().push();
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f11, f12, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.5F, 0.5F, 1.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(craftingTableStack, 0, 0);
      iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
      float f13 = f7 + 23.0F + 8.0F;
      float f14 = f8 + (23.0F - font6.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font6, "Crafting Table", f13, f14, ByteBufferHolder.ll1lIllll111I1lIIl1lIl);
   }

   private void renderChestPanel(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      float f2 = f1 + 31.0F;
      float f3 = f + 4.0F;
      float f4 = 234.0F;
      float f5 = 234.0F;
      float f6 = 23.0F;
      float f7 = 23.0F;
      float f8 = f3 + 234.0F + 4.0F;
      float f9 = 0.5F;
      float f10 = 8.0F;
      float f11 = f8 + 7.5F;
      float f12 = f2 + 7.5F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f8, f2, 234.0F, 23.0F, radius8, panelInnerColor61);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f8, f2, 23.0F, 23.0F, radius8, panelInnerColor61);
      iiii1ilili1l1l1lilli1liliii.getMatrices().push();
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f11, f12, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.5F, 0.5F, 1.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(chestStack, 0, 0);
      iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
      float f13 = f8 + 23.0F + 8.0F;
      float f14 = f2 + (23.0F - font6.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font6, "Chest", f13, f14, ByteBufferHolder.ll1lIllll111I1lIIl1lIl);
   }

   private void renderBottomPresetRibbon(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3) {
      float f4 = f + 4.0F;
      float f5 = f1 + 4.0F;
      float f6 = f2 - 8.0F;
      float f7 = f3 - 8.0F;
      String s = "Add";
      String s1 = "M";
      boolean flag = "custom".equalsIgnoreCase(this.module.l11Il1I1lI11l());
      AutoCraftEditorScreen$RibbonLayoutData autocrafteditorscreen$ribbonlayoutdata = this.buildRibbonLayoutData(f4, f5, flag, true);
      this.bottomPresetRibbonMaxScrollX = Math.max(0.0F, autocrafteditorscreen$ribbonlayoutdata.contentWidth - f6);
      float f8 = Math.max(0.0F, Math.min(this.bottomPresetRibbonScrollX, this.bottomPresetRibbonMaxScrollX));
      if (f8 != this.bottomPresetRibbonScrollX) {
         this.bottomPresetRibbonScrollX = f8;
         autocrafteditorscreen$ribbonlayoutdata = this.buildRibbonLayoutData(f4, f5, flag, false);
      } else {
         this.bottomPresetRibbonScrollX = f8;
      }

      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)(f4 - 4.0F), (int)f5, (int)(f4 + f6 + 3.0F), (int)(f5 + f7));
      float f9 = 0.5F;
      float f10 = (23.0F - font6.height()) / 2.0F;
      float f11 = 7.5F;

      for (AutoCraftEditorScreen$RibbonItemLayout autocrafteditorscreen$ribbonitemlayout : autocrafteditorscreen$ribbonlayoutdata.items) {
         if (!autocrafteditorscreen$ribbonitemlayout.inFilter) {
            this.renderRibbonItem(iiii1ilili1l1l1lilli1liliii, autocrafteditorscreen$ribbonitemlayout, 0.5F, 7.5F, f10);
         }
      }

      for (AutoCraftEditorScreen$RibbonItemLayout autocrafteditorscreen$ribbonitemlayout1 : autocrafteditorscreen$ribbonlayoutdata.items) {
         if (autocrafteditorscreen$ribbonitemlayout1.inFilter && autocrafteditorscreen$ribbonitemlayout1.appearProgress >= 0.999F) {
            this.renderRibbonItem(iiii1ilili1l1l1lilli1liliii, autocrafteditorscreen$ribbonitemlayout1, 0.5F, 7.5F, f10);
         }
      }

      for (AutoCraftEditorScreen$RibbonItemLayout autocrafteditorscreen$ribbonitemlayout2 : autocrafteditorscreen$ribbonlayoutdata.items) {
         if (autocrafteditorscreen$ribbonitemlayout2.inFilter && autocrafteditorscreen$ribbonitemlayout2.appearProgress < 0.999F) {
            this.renderRibbonItem(iiii1ilili1l1l1lilli1liliii, autocrafteditorscreen$ribbonitemlayout2, 0.5F, 7.5F, f10);
         }
      }

      if (flag) {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            autocrafteditorscreen$ribbonlayoutdata.addX,
            autocrafteditorscreen$ribbonlayoutdata.addY,
            autocrafteditorscreen$ribbonlayoutdata.addWidth,
            autocrafteditorscreen$ribbonlayoutdata.addHeight,
            radius8,
            panelInnerColor61
         );
         float f14 = autocrafteditorscreen$ribbonlayoutdata.addX + 4.0F + (8.0F - iconFont7.width("M")) / 2.0F;
         float f15 = autocrafteditorscreen$ribbonlayoutdata.addY + (autocrafteditorscreen$ribbonlayoutdata.addHeight - iconFont7.height()) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(iconFont7, "M", f14, f15, itemTextColor);
         float f12 = autocrafteditorscreen$ribbonlayoutdata.addX + 4.0F + 8.0F + 4.0F;
         float f13 = autocrafteditorscreen$ribbonlayoutdata.addY + (autocrafteditorscreen$ribbonlayoutdata.addHeight - font6.height()) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font6, "Add", f12, f13, itemTextColor);
      }

      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      this.renderBottomScrollbar(iiii1ilili1l1l1lilli1liliii, f, f1, f3, f6);
   }

   private void renderRibbonItem(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      AutoCraftEditorScreen$RibbonItemLayout autocrafteditorscreen$ribbonitemlayout,
      float f,
      float f1,
      float f2
   ) {
      if (!(autocrafteditorscreen$ribbonitemlayout.width <= 0.001F)) {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            autocrafteditorscreen$ribbonitemlayout.currentX,
            autocrafteditorscreen$ribbonitemlayout.y,
            autocrafteditorscreen$ribbonitemlayout.width,
            autocrafteditorscreen$ribbonitemlayout.height,
            radius8,
            panelInnerColor61
         );
         float f3 = autocrafteditorscreen$ribbonitemlayout.currentX + autocrafteditorscreen$ribbonitemlayout.width;
         if (!(f3 <= autocrafteditorscreen$ribbonitemlayout.currentX)) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               (int)autocrafteditorscreen$ribbonitemlayout.currentX,
               (int)autocrafteditorscreen$ribbonitemlayout.y,
               (int)Math.ceil((double)f3),
               (int)Math.ceil((double)(autocrafteditorscreen$ribbonitemlayout.y + autocrafteditorscreen$ribbonitemlayout.height))
            );
            if (autocrafteditorscreen$ribbonitemlayout.width > 12.0F) {
               ItemStack ItemStack = autocrafteditorscreen$ribbonitemlayout.preset.EventBus(this.module);
               if (!ItemStack.isEmpty()) {
                  float f4 = autocrafteditorscreen$ribbonitemlayout.currentX + 4.0F;
                  float f5 = autocrafteditorscreen$ribbonitemlayout.y + f1;
                  iiii1ilili1l1l1lilli1liliii.getMatrices().push();
                  iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f4, f5, 0.0F);
                  iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f, f, 1.0F);
                  iiii1ilili1l1l1lilli1liliii.StringHolder_8(ItemStack, 0, 0);
                  iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
               }
            }

            if (autocrafteditorscreen$ribbonitemlayout.width > 24.0F) {
               float f6 = autocrafteditorscreen$ribbonitemlayout.currentX + 4.0F + 8.0F + 4.0F;
               float f7 = autocrafteditorscreen$ribbonitemlayout.y + f2;
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(font6, autocrafteditorscreen$ribbonitemlayout.label, f6, f7, itemTextColor);
            }

            iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
         }
      }
   }

   private void renderBottomScrollbar(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3) {
      float f4 = Math.max(0.0F, this.bottomPresetRibbonMaxScrollX);
      if (!(f4 <= 0.001F)) {
         float f5 = f + 4.0F;
         float f6 = f1 + f2 - 5.0F;
         float f7 = 472.0F;
         float f8 = 1.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f5, f6, 472.0F, 1.0F, radius128, scrollTrackColor);
         float f9 = Math.max(0.0F, Math.min(this.bottomPresetRibbonScrollX, f4));
         float f10 = f3 + f4;
         float f11 = 472.0F * (f3 / f10);
         f11 = Math.max(1.0F, Math.min(472.0F, f11));
         float f12 = 472.0F - f11;
         float f13 = f9 / f4;
         float f14 = f5 + f12 * f13;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f14, f6, f11, 1.0F, radius1, scrollThumbColor);
      }
   }

   private void renderCraftGrid(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      float f2 = f + 242.0F;
      float f3 = f1 + 31.0F;
      float f4 = 234.0F;
      float f5 = 23.0F;
      float f6 = 36.0F;
      float f7 = 2.0F;
      float f8 = 112.0F;
      float f9 = f2 + 61.0F - 160.0F;
      float f10 = f3 + 23.0F + 16.0F;
      StringHolder_14 ill111l1iiill1ll1illi = this.module.II1111llIIl1();
      float f11 = 0.75F;
      float f12 = 12.0F;

      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            float f13 = f9 + (float)j * 38.0F;
            float f14 = f10 + (float)i * 38.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(f13, f14, 36.0F, 36.0F, radius8, panelInnerColor61);
            if (ill111l1iiill1ll1illi != null) {
               int k = i * 3 + j;
               String s = ill111l1iiill1ll1illi.StringHolder_13(k);
               if (s != null && !s.isBlank()) {
                  ItemStack ItemStackx = this.module.EventImpl_34(s).getDefaultStack();
                  if (!ItemStackx.isEmpty()) {
                     float f15 = f13 + 12.0F;
                     float f16 = f14 + 12.0F;
                     iiii1ilili1l1l1lilli1liliii.getMatrices().push();
                     iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f15, f16, 0.0F);
                     iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.75F, 0.75F, 1.0F);
                     iiii1ilili1l1l1lilli1liliii.StringHolder_8(ItemStackx, 0, 0);
                     iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
                  }
               }
            }
         }
      }

      String s1 = "A";
      float f21 = f9 + 76.0F;
      float f22 = f10 + 36.0F + 2.0F;
      float f23 = f21 + 36.0F + 12.0F;
      float f24 = 3.0F;
      float f25 = f23 - iconFont7.width("A") / 2.0F + 3.0F;
      float f26 = f22 + (36.0F - iconFont7.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(iconFont7, "A", f25, f26, arrowColor);
      float f27 = 12.0F;
      float f28 = f23 + iconFont7.width("A") / 2.0F + 12.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f28, f22, 36.0F, 36.0F, radius8, panelInnerColor61);
      if (ill111l1iiill1ll1illi != null) {
         ItemStack ItemStack = ill111l1iiill1ll1illi.EventBus(this.module);
         if (ItemStack.isEmpty() && !ill111l1iiill1ll1illi.Ill1I1IIl1l1lIIIlll11I1I1lll1().isBlank()) {
            ItemStack = this.module.EventImpl_34(ill111l1iiill1ll1illi.Ill1I1IIl1l1lIIIlll11I1I1lll1()).getDefaultStack();
         }

         if (!ItemStack.isEmpty()) {
            float f17 = 0.75F;
            float f18 = 12.0F;
            float f19 = f28 + 12.0F;
            float f20 = f22 + 12.0F;
            iiii1ilili1l1l1lilli1liliii.getMatrices().push();
            iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f19, f20, 0.0F);
            iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.75F, 0.75F, 1.0F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(ItemStack, 0, 0);
            iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
         }
      }

      this.renderResourcesList(iiii1ilili1l1l1lilli1liliii, f, f10, 36.0F, 2.0F);
   }

   private void renderResourcesList(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3) {
      StringHolder_14 ill111l1iiill1ll1illi = this.module.II1111llIIl1();
      if (ill111l1iiill1ll1illi != null) {
         float f4 = f1 + f2 * 3.0F + f3 * 2.0F;
         float f5 = f + 4.0F;
         float f6 = f4 + 16.0F;
         float f7 = 472.0F;
         float f8 = 19.0F;
         float f9 = 2.0F;
         List list = this.getUniqueIngredientKeys(ill111l1iiill1ll1illi);
         float f10 = font6.height();
         float f11 = font5.height();

         for (int i = 0; i < list.size(); i++) {
            String s = (String)list.get(i);
            String s1 = ill111l1iiill1ll1illi.StringHolder_18(s);
            int j = ill111l1iiill1ll1illi.macros(s);
            float f12 = f6 + (float)i * 21.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(f5, f12, 472.0F, 19.0F, radius8, panelInnerColor61);
            float f13 = f5 + 6.0F;
            ItemStack ItemStack = this.module.EventImpl_34(s1).getDefaultStack();
            if (!ItemStack.isEmpty()) {
               float f14 = 8.0F;
               float f15 = 0.5F;
               float f17 = f12 + 5.5F;
               iiii1ilili1l1l1lilli1liliii.getMatrices().push();
               iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f13, f17, 0.0F);
               iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.5F, 0.5F, 1.0F);
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(ItemStack, 0, 0);
               iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
               f13 += 12.0F;
            }

            String s2 = ill111l1iiill1ll1illi.StringHolder_8(s, this.module);
            String s3 = "x" + j;
            float f16 = 4.0F;
            float f23 = font5.width(s3);
            float f18 = f5 + 472.0F - 6.0F;
            float f19 = Math.max(0.0F, f18 - f13 - 4.0F - f23);
            if (font6.width(s2) > f19) {
               while (!s2.isEmpty() && font6.width(s2 + "...") > f19) {
                  s2 = s2.substring(0, s2.length() - 1);
               }

               if (!s2.isEmpty()) {
                  s2 = s2 + "...";
               }
            }

            float f20 = f12 + (19.0F - f10) / 2.0F;
            float f21 = f12 + (19.0F - f11) / 2.0F;
            float f22 = f13 + font6.width(s2) + 4.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(font6, s2, f13, f20, ByteBufferHolder.ll1lIllll111I1lIIl1lIl);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(font5, s3, f22, f21, countColor);
         }
      }
   }

   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      if (this.closing) {
         return false;
      } else {
         float f = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() - 480.0F) / 2.0F;
         float f1 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() - 320.0F) / 2.0F;
         float f2 = f + 4.0F;
         float f3 = f1 + 284.0F + 4.0F;
         float f4 = 472.0F;
         float f5 = 28.0F;
         if (ZenithInternal143.StringHolder_8((double)f2, (double)f3, 472.0, 28.0, d0, d1)) {
            float f6 = (float)((Math.abs(d2) > 0.001 ? d2 : -d3) * 18.0);
            this.bottomPresetRibbonScrollX += f6;
            this.bottomPresetRibbonScrollX = Math.max(0.0F, Math.min(this.bottomPresetRibbonScrollX, this.bottomPresetRibbonMaxScrollX));
            return true;
         } else {
            return super.mouseScrolled(d0, d1, d2, d3);
         }
      }
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (!this.closing) {
         float f = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() - 480.0F) / 2.0F;
         float f1 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() - 320.0F) / 2.0F;
         if (!this.handleSettingsPanelClick(d0, d1, ill1iili11ii1l)) {
            if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
               float f2 = f + 4.0F;
               float f3 = 63.5F;
               float f4 = 245.5F;
               float f5 = f2 + 63.5F + 4.0F;
               StringHolder_14 ill111l1iiill1ll1illi = this.module.II1111llIIl1();
               if (ill111l1iiill1ll1illi != null && ill111l1iiill1ll1illi.IIIII1lIIII11llI()) {
                  float f6 = 52.5F;
                  float f7 = 23.0F;
                  float f8 = f5 + 245.5F - 52.5F;
                  float f9 = f1 + 4.0F;
                  if (ZenithInternal143.StringHolder_8((double)f8, (double)f9, 52.5, 23.0, d0, d1)) {
                     String s = ill111l1iiill1ll1illi.GetSocketHandler();
                     this.module.EventImpl_12(s);
                     this.ribbonItemCurrentX.remove(s);
                     this.ribbonItemAppearAnim.remove(s);
                     ZenithClient.getInstance().ZenithInternal115().save();
                     return;
                  }
               }

               float f17 = 128.0F;
               float f18 = f5 + 245.5F + 4.0F;
               float f19 = f1 + 4.0F;
               float f20 = 23.0F;
               if (ZenithInternal143.StringHolder_8((double)f18, (double)f19, 128.0, 23.0, d0, d1)) {
                  this.getSearchBox().setSelected(true);
               } else {
                  float f10 = f18 + 128.0F + 4.0F;
                  float f11 = f1 + 4.0F;
                  float f12 = 23.0F;
                  if (ZenithInternal143.StringHolder_8((double)f10, (double)f11, 23.0, 23.0, d0, d1)) {
                     this.settingsPanelVisible = !this.settingsPanelVisible;
                  } else {
                     float f13 = f + 4.0F;
                     float f14 = f1 + 284.0F + 4.0F;
                     float f15 = 472.0F;
                     float f16 = 28.0F;
                     if (ZenithInternal143.StringHolder_8((double)f13, (double)f14, 472.0, 28.0, d0, d1)) {
                        boolean flag = "custom".equalsIgnoreCase(this.module.l11Il1I1lI11l());
                        AutoCraftEditorScreen$RibbonLayoutData autocrafteditorscreen$ribbonlayoutdata = this.buildRibbonLayoutData(f13, f14, flag, false);

                        for (AutoCraftEditorScreen$RibbonItemLayout autocrafteditorscreen$ribbonitemlayout : autocrafteditorscreen$ribbonlayoutdata.items) {
                           if (!(autocrafteditorscreen$ribbonitemlayout.appearProgress <= 0.5F)
                              && ZenithInternal143.StringHolder_8(
                                 (double)autocrafteditorscreen$ribbonitemlayout.currentX,
                                 (double)autocrafteditorscreen$ribbonitemlayout.y,
                                 (double)autocrafteditorscreen$ribbonitemlayout.width,
                                 (double)autocrafteditorscreen$ribbonitemlayout.height,
                                 d0,
                                 d1
                              )) {
                              this.module.ZenithInternal136(autocrafteditorscreen$ribbonitemlayout.presetId);
                              this.scheduleSelectionSave();
                              return;
                           }
                        }

                        if (flag
                           && this.isAddLeftEdgeVisibleInRibbon(autocrafteditorscreen$ribbonlayoutdata.addX, f13, 472.0F)
                           && ZenithInternal143.StringHolder_8(
                              (double)autocrafteditorscreen$ribbonlayoutdata.addX,
                              (double)autocrafteditorscreen$ribbonlayoutdata.addY,
                              (double)autocrafteditorscreen$ribbonlayoutdata.addWidth,
                              (double)autocrafteditorscreen$ribbonlayoutdata.addHeight,
                              d0,
                              d1
                           )) {
                           this.rememberUiStateForNextOpen();
                           this.module.II1IlI1l11I1llI11IllI1lI1l();
                           return;
                        }
                     }

                     this.getSearchBox().setSelected(false);
                  }
               }
            }
         }
      }
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (!this.closing) {
         if (this.settingsPanelVisible) {
            for (GuiSetting guisetting : this.settingsPanelControls) {
               guisetting.onMouseReleased(d0, d1, ill1iili11ii1l);
            }

            this.saveAutoCraftSettings();
         }
      }
   }

   @Override
   public void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3) {
      if (!this.closing) {
         super.onMouseDragged(d0, d1, ill1iili11ii1l, d2, d3);
      }
   }

   public boolean charTyped(char c0, int i) {
      if (this.closing) {
         return false;
      } else if (this.getSearchBox().charTyped(c0, i)) {
         this.syncSearchFromBox();
         return true;
      } else {
         return super.charTyped(c0, i);
      }
   }

   @Override
   public void tick() {
      super.tick();
      this.syncSearchFromBox();
      this.flushSelectionSaveIfReady();
   }

   public void renderBackground(DrawContext DrawContext, int i, int j, float f) {
   }

   public boolean shouldPause() {
      return false;
   }

   private void openClickGui() {
      if (!Menu.lllIl11II111Illll1IlIll.Spider()) {
         Menu.lllIl11II111Illll1IlIll.lI1Il11I1l1III11IIlI1lI1II11I();
      } else {
         l11I1I1ll1Illll1I1l1111l1II.setScreen(ZenithClient.getInstance().ZenithInternal141());
      }
   }

   public void close() {
      if (!this.closing) {
         this.flushSelectionSaveNow();
         this.closing = true;
         this.pendingCloseAction = this::openClickGui;
      }
   }

   public boolean keyPressed(int i, int j, int k) {
      if (this.closing) {
         return false;
      } else {
         OnMouseClickedHandler li111l1i1ili111111ll1iiii1 = this.getSearchBox();
         if (li111l1i1ili111111ll1iiii1.isSelected() && i == 256) {
            li111l1i1ili111111ll1iiii1.setSelected(false);
            return true;
         } else if (li111l1i1ili111111ll1iiii1.keyPressed(i, j, k)) {
            this.syncSearchFromBox();
            return true;
         } else if (i == 256) {
            this.close();
            return true;
         } else {
            return super.keyPressed(i, j, k);
         }
      }
   }

   private float getMainPanelX() {
      return ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() - 480.0F) / 2.0F;
   }

   private float getMainPanelY() {
      return ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() - 320.0F) / 2.0F;
   }

   private float getSettingsPanelY() {
      return this.getMainPanelY();
   }

   private float getSettingsPanelW() {
      return 128.0F;
   }

   private float getSettingsPanelH() {
      float f = 0.0F;

      for (int i = 0; i < this.settingsPanelControls.size(); i++) {
         f += this.settingsPanelControls.get(i).getHeight();
         if (i < this.settingsPanelControls.size() - 1) {
            f += 6.0F;
         }
      }

      return 29.0F + f + 8.0F;
   }

   private static float getSettingsControlWidth() {
      return 112.0F;
   }

   private float getSettingsContentX(float f) {
      return this.getSettingsPanelAnimatedX(f) + 8.0F;
   }

   private float getSettingsContentY() {
      return this.getSettingsPanelY() + 23.0F + 6.0F;
   }

   private boolean handleSettingsPanelClick(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      float f = this.getSettingsPanelRevealProgress();
      if (this.settingsPanelVisible && !(f <= 0.0F)) {
         for (GuiSetting guisetting : this.settingsPanelControls) {
            if (guisetting.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
               this.saveAutoCraftSettings();
               return true;
            }
         }

         float f1 = this.getSettingsPanelAnimatedX(f);
         if (!ZenithInternal143.StringHolder_8(
            (double)f1, (double)this.getSettingsPanelY(), (double)this.getSettingsPanelW(), (double)this.getSettingsPanelH(), d0, d1
         )) {
            return false;
         } else {
            for (GuiSetting guisetting1 : this.settingsPanelControls) {
               if (guisetting1.onMouseClicked(d0, d1, ill1iili11ii1l)) {
                  this.saveAutoCraftSettings();
                  return true;
               }
            }

            this.saveAutoCraftSettings();
            return true;
         }
      } else {
         return false;
      }
   }

   private float getSettingsPanelRevealProgress() {
      return Math.max(0.0F, Math.min(1.0F, this.settingsPanelRevealAnimation.CloudFriendInfo()));
   }

   private float getSettingsPanelAnimatedX(float f) {
      float f1 = this.getMainPanelX() + 480.0F + 10.0F;
      float f2 = 138.0F;
      return f1 - (1.0F - f) * f2;
   }

   private void saveAutoCraftSettings() {
      ZenithClient.getInstance().ZenithInternal115().save();
   }

   private void scheduleSelectionSave() {
      this.selectionSavePending = true;
      this.selectionSaveAtMs = System.currentTimeMillis() + 650L;
   }

   private void flushSelectionSaveIfReady() {
      if (this.selectionSavePending && System.currentTimeMillis() >= this.selectionSaveAtMs) {
         this.flushSelectionSaveNow();
      }
   }

   private void flushSelectionSaveNow() {
      if (this.selectionSavePending) {
         this.selectionSavePending = false;
         this.saveAutoCraftSettings();
      }
   }

   private AutoCraftEditorScreen$RibbonLayoutData buildRibbonLayoutData(float f, float f1, boolean flag, boolean flag1) {
      this.ensureRibbonAnimationProfile();
      List list = this.module.booleanHolder_4(this.module.l11Il1I1lI11l());
      HashSet hashset = new HashSet();

      for (StringHolder_14 ill111l1iiill1ll1illi : list) {
         String s = ill111l1iiill1ll1illi.GetSocketHandler();
         if (s != null && !s.isBlank()) {
            hashset.add(s);
         }
      }

      this.ribbonItemAppearAnim.keySet().removeIf(s4 -> !hashset.contains(s4));
      this.ribbonItemCurrentX.keySet().removeIf(s4 -> !hashset.contains(s4));
      String s3 = this.getRibbonSearchNeedle();
      float f9 = this.getRibbonItemY(f1);
      float f10 = f;
      ArrayList arraylist = new ArrayList(list.size());

      for (StringHolder_14 ill111l1iiill1ll1illi1 : list) {
         String s1 = ill111l1iiill1ll1illi1.GetSocketHandler();
         if (s1 != null && !s1.isBlank()) {
            boolean flag2 = this.matchesRibbonSearch(ill111l1iiill1ll1illi1, s3);
            GetStartTimeHandler li1liiliill1 = this.ribbonItemAppearAnim.get(s1);
            if (li1liiliill1 == null) {
               if (!flag2) {
                  continue;
               }

               li1liiliill1 = new GetStartTimeHandler(160L, 0.0F, IReturn.ZenithInternal066);
               this.ribbonItemAppearAnim.put(s1, li1liiliill1);
            }

            if (flag1) {
               li1liiliill1.ZenithInternal095(flag2 ? 1.0F : 0.0F);
               li1liiliill1.ArmorHud();
            }

            float f2 = this.clampRibbon01(li1liiliill1.CloudFriendInfo());
            if (!flag2 && f2 < 0.001F) {
               this.ribbonItemAppearAnim.remove(s1);
               this.ribbonItemCurrentX.remove(s1);
            } else {
               String s2 = this.resolveRibbonPresetLabel(ill111l1iiill1ll1illi1);
               float f3 = this.computeRibbonItemWidth(s2);
               float f4 = f10;
               float f5 = f3 * f2;
               float f6 = 4.0F * f2;
               f10 += f5 + f6;
               float f7 = this.ribbonItemCurrentX.getOrDefault(s1, f4);
               if (flag1) {
                  f7 = this.animateRibbonCurrentX(f7, f4);
               }

               this.ribbonItemCurrentX.put(s1, f7);
               float f8 = f7 - this.bottomPresetRibbonScrollX;
               arraylist.add(new AutoCraftEditorScreen$RibbonItemLayout(ill111l1iiill1ll1illi1, s1, s2, f8, f9, f5, 23.0F, f2, flag2));
            }
         }
      }

      float f11 = Math.max(0.0F, f10 - f);
      float f12 = 0.0F;
      float f13 = f10 - this.bottomPresetRibbonScrollX;
      if (flag) {
         f12 = this.computeRibbonItemWidth("Add");
         f11 += f12;
      }

      return new AutoCraftEditorScreen$RibbonLayoutData(arraylist, f11, f13, f9, f12, 23.0F);
   }

   private void initializeRibbonAnimationState() {
      this.ribbonItemCurrentX.clear();
      this.ribbonItemAppearAnim.clear();
      List list = this.module.booleanHolder_4(this.module.l11Il1I1lI11l());
      String s = this.getRibbonSearchNeedle();
      boolean flag = l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.getWindow() != null;
      float f = flag ? this.getMainPanelX() + 4.0F : 0.0F;

      for (StringHolder_14 ill111l1iiill1ll1illi : list) {
         String s1 = ill111l1iiill1ll1illi.GetSocketHandler();
         if (s1 != null && !s1.isBlank()) {
            boolean flag1 = this.matchesRibbonSearch(ill111l1iiill1ll1illi, s);
            GetStartTimeHandler li1liiliill1 = new GetStartTimeHandler(160L, flag1 ? 1.0F : 0.0F, IReturn.ZenithInternal066);
            li1liiliill1.EventBus(flag1 ? 1.0F : 0.0F);
            this.ribbonItemAppearAnim.put(s1, li1liiliill1);
            if (flag1 && flag) {
               String s2 = this.resolveRibbonPresetLabel(ill111l1iiill1ll1illi);
               float f1 = this.computeRibbonItemWidth(s2);
               this.ribbonItemCurrentX.put(s1, f);
               f += f1 + 4.0F;
            }
         }
      }

      this.ribbonAnimationInitialized = true;
   }

   private void ensureRibbonAnimationProfile() {
      String s = this.getRibbonProfileKey();
      if (!this.ribbonAnimationInitialized || !s.equals(this.ribbonAnimationProfile)) {
         this.ribbonAnimationProfile = s;
         this.initializeRibbonAnimationState();
      }
   }

   private String getRibbonProfileKey() {
      String s = this.module.l11Il1I1lI11l();
      return s == null ? "" : s.toLowerCase(Locale.ROOT);
   }

   private String getRibbonSearchNeedle() {
      return this.searchQuery != null && !this.searchQuery.isBlank() ? this.searchQuery.toLowerCase(Locale.ROOT) : "";
   }

   private boolean matchesRibbonSearch(StringHolder_14 ill111l1iiill1ll1illi, String s) {
      if (s.isEmpty()) {
         return true;
      } else {
         String s1 = this.resolveRibbonPresetLabel(ill111l1iiill1ll1illi);
         return !s1.isBlank() && s1.toLowerCase(Locale.ROOT).contains(s);
      }
   }

   private float animateRibbonCurrentX(float f, float f1) {
      float f2 = f1 - f;
      float f3 = Math.abs(f2);
      if (f3 < 0.05F) {
         return f1;
      } else {
         float f4 = Math.max(0.5F, f3 * 0.25F);
         f4 = Math.min(f4, f3);
         return f + Math.signum(f2) * f4;
      }
   }

   private float clampRibbon01(float f) {
      return Math.max(0.0F, Math.min(1.0F, f));
   }

   private String sanitizeSearchInput(String s) {
      if (s != null && !s.isEmpty()) {
         StringBuilder stringbuilder = new StringBuilder();

         for (int i = 0; i < s.length(); i++) {
            char c0 = s.charAt(i);
            if (!Character.isISOControl(c0)) {
               stringbuilder.append(c0);
            }
         }

         return stringbuilder.toString();
      } else {
         return "";
      }
   }

   private void setSearchQuery(String s) {
      String s1 = s == null ? "" : this.sanitizeSearchInput(s);
      if (s1.length() > 64) {
         s1 = s1.substring(0, 64);
      }

      if (!s1.equals(this.searchQuery)) {
         this.searchQuery = s1;
         this.bottomPresetRibbonScrollX = 0.0F;
      }
   }

   private OnMouseClickedHandler getSearchBox() {
      if (this.searchBox == null) {
         this.searchBox = new OnMouseClickedHandler(new Vector2f(0.0F, 0.0F), font6, "Search for item...", 112.0F);
         this.searchBox.EventImpl_38(64);
      }

      return this.searchBox;
   }

   private void syncSearchFromBox() {
      OnMouseClickedHandler li111l1i1ili111111ll1iiii1 = this.getSearchBox();
      this.setSearchQuery(li111l1i1ili111111ll1iiii1.II1I11IIl());
      if (!this.searchQuery.equals(li111l1i1ili111111ll1iiii1.II1I11IIl())) {
         li111l1i1ili111111ll1iiii1.GetDisplayNameHandler(this.searchQuery);
         li111l1i1ili111111ll1iiii1.EventImpl_16(this.searchQuery.length());
      }
   }

   private void rememberUiStateForNextOpen() {
      restoreUiOnNextOpen = true;
      restoreSearchQuery = this.searchQuery;
      restoreRibbonScrollX = this.bottomPresetRibbonScrollX;
      restoreSettingsPanelVisible = this.settingsPanelVisible;
   }

   private String resolveRibbonPresetLabel(StringHolder_14 ill111l1iiill1ll1illi) {
      String s = ill111l1iiill1ll1illi.StringHolder_8(this.module);
      if (s == null || s.isBlank()) {
         s = ill111l1iiill1ll1illi.getDisplayName();
      }

      return s == null ? "" : s;
   }

   private float computeRibbonItemWidth(String s) {
      float f = 8.0F;
      float f1 = 4.0F;
      float f2 = 4.0F;
      float f3 = 6.0F;
      float f4 = 60.5F;
      return Math.max(60.5F, 16.0F + font6.width(s) + 6.0F);
   }

   private float getRibbonItemY(float f) {
      return f;
   }

   private boolean isAddLeftEdgeVisibleInRibbon(float f, float f1, float f2) {
      return f >= f1 && f <= f1 + f2;
   }

   private List<String> getUniqueIngredientKeys(StringHolder_14 ill111l1iiill1ll1illi) {
      this.ingredientKeysCache.clear();
      if (ill111l1iiill1ll1illi == null) {
         return this.ingredientKeysCache;
      } else {
         for (int i = 0; i < 9; i++) {
            String s = ill111l1iiill1ll1illi.StringHolder_13(i);
            if (s != null && !s.isBlank()) {
               String s1 = ill111l1iiill1ll1illi.ZenithInternal056(i);
               if (!this.ingredientKeysCache.contains(s1)) {
                  this.ingredientKeysCache.add(s1);
               }
            }
         }

         return this.ingredientKeysCache;
      }
   }
}
