package zenith.zov.client.screens.nlgui.panel;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;
import net.minecraft.client.network.ClientPlayerEntity;
import zenith.floatHolder_3;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.PathHolder;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.builder.PlayerPreview3D;
import zenith.zov.client.screens.nlgui.cosmetics.CosmeticAvatarImageCache;
import zenith.zov.client.screens.nlgui.elements.CosmeticElement;
import zenith.zov.client.screens.nlgui.elements.CosmeticSettingsElement;
import zenith.zov.client.screens.nlgui.elements.api.Element;
import zenith.zov.client.screens.nlgui.panel.api.ElementPanel;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class CosmeticElementPanel extends ElementPanel {
   private static final float SCROLL_SPEED = 22.0F;
   private static final float SCROLL_SMOOTH = 0.25F;
   private static final int COLUMNS = 3;
   private static final long COSMETIC_SYNC_INTERVAL_MS = 800L;
   private static final String COSMETICS_DIRECTORY = "cosmetics";
   private static final String AVATAR_FILE_NAME = "avatar.json";
   private static final String HEAD_PREFIX = "head-";
   private static final float RIGHT_PANEL_HEIGHT = 200.0F;
   private static final float RIGHT_HEADER_HEIGHT = 29.0F;
   private final List<CosmeticElement> elements = new ArrayList<>();
   private final List<CosmeticElement> petElements = new ArrayList<>();
   private CosmeticSettingsElement settingsElement;
   private final GetStartTimeHandler animationChangeCategory = new GetStartTimeHandler(200L, 1.0F, IReturn.ListHolder_8);
   private HeightHandler headTabBounds;
   private HeightHandler modelsTabBounds;
   private HeightHandler petsTabBounds;
   private HeightHandler settingsTabBounds;
   private CosmeticElementPanel$CosmeticCategory currentCategory = CosmeticElementPanel$CosmeticCategory.SETTINGS;
   private CosmeticElementPanel$CosmeticCategory lastCategory;
   private HeightHandler scissorBounds;
   private HeightHandler rightPreviewBounds;
   private PlayerPreview3D playerPreview3D;
   private float scroll = 0.0F;
   private float scrollTarget = 0.0F;
   private long lastSyncAt;
   private String lastSignature = "";

   @Override
   public void renderHeader(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f4 = f1 + (float)GuiStyle.PADDING.intValue() + (float)GuiStyle.PADDING.intValue() * 2.0F;
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
         float f5 = Math.min(1.0F, this.animationChangeCategory.StringHolder_8(1.0F));
         if (this.lastCategory != null) {
            float f6 = -8.0F * f5;
            this.renderHeaderTitle(font, font1, iiii1ilili1l1l1lilli1liliii, f, 1.0F - f5, f4, f2 + f6);
         }

         if (f5 > 0.0F) {
            float f7 = 8.0F * (1.0F - f5);
            this.renderHeaderTitle(font, font1, iiii1ilili1l1l1lilli1liliii, f, f5, f4, f2 + f7);
         }

         this.renderHeaderTabs(iiii1ilili1l1l1lilli1liliii, f, f1, f2, f3);
      }
   }

   private void renderHeaderTitle(Font font, Font font1, floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f4 = f1 * f;
         String s = ";";
         float f5 = f3 + (23.0F - font.height()) / 2.0F;
         float f6 = f3 + (23.0F - font1.height()) / 2.0F - 0.1F;
         float f7 = f2 + font1.width(s) + (float)GuiStyle.PADDING.intValue();
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, "Cosmetics", f7, f5, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, s, f2, f6, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4));
      }
   }

   private void renderHeaderTabs(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         Font font = Fonts.NEW_MEDIUM.getFont(4.8F);
         float f4 = (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f5 = (float)GuiStyle.PADDING.intValue();
         float f6 = f2 + (23.0F - font.height()) / 2.0F;
         float f7 = 0.5F;
         float f8 = 6.0F;
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getDisableActiveBg().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f);
         String s = "Settings";
         String s1 = "Head";
         String s2 = "Models";
         String s3 = "Pets";
         float f9 = font.width(s3);
         float f10 = font.width(s2);
         float f11 = font.width(s1);
         float f12 = font.width(s);
         float f13 = f1 + f3 - f4 - f9;
         float f14 = f13 - f5;
         float f15 = f14 - f5 - f10;
         float f16 = f15 - f5;
         float f17 = f16 - f5 - f11;
         float f18 = f17 - f5;
         float f19 = f18 - f5 - f12;
         this.settingsTabBounds = new HeightHandler(f19 - 2.0F, f2 + 1.0F, f12 + 4.0F, 21.0F);
         this.headTabBounds = new HeightHandler(f17 - 2.0F, f2 + 1.0F, f11 + 4.0F, 21.0F);
         this.modelsTabBounds = new HeightHandler(f15 - 2.0F, f2 + 1.0F, f10 + 4.0F, 21.0F);
         this.petsTabBounds = new HeightHandler(f13 - 2.0F, f2 + 1.0F, f9 + 4.0F, 21.0F);
         boolean flag = ZenithClient.getInstance().ZenithInternal071().TotemParticles();
         boolean flag1 = ZenithClient.getInstance().BlockPosHolder().ZenithInternal151();
         float f20 = 0.5F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            s,
            f19,
            f6,
            (this.currentCategory == CosmeticElementPanel$CosmeticCategory.SETTINGS
                  ? zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  : zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1())
               .ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f18, f6, f7, f8, il1iliilli1l1iill);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            s1,
            f17,
            f6,
            (this.currentCategory == CosmeticElementPanel$CosmeticCategory.HEAD
                  ? zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  : zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1())
               .ZenithInternal039(f)
         );
         if (flag) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f17, f6 + font.height() / 2.0F, f11, f20, zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f * 0.7F)
            );
         }

         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f16, f6, f7, f8, il1iliilli1l1iill);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            s2,
            f15,
            f6,
            (this.currentCategory == CosmeticElementPanel$CosmeticCategory.MODELS
                  ? zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  : zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1())
               .ZenithInternal039(f)
         );
         if (flag) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f15, f6 + font.height() / 2.0F, f10, f20, zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f * 0.7F)
            );
         }

         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f14, f6, f7, f8, il1iliilli1l1iill);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            s3,
            f13,
            f6,
            (this.currentCategory == CosmeticElementPanel$CosmeticCategory.PETS
                  ? zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  : zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1())
               .ZenithInternal039(f)
         );
         if (flag1) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f13, f6 + font.height() / 2.0F, f9, f20, zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f * 0.7F)
            );
         }
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2) {
      this.syncCosmetics();
      this.scissorBounds = new HeightHandler(f1, f2, 376.0F, 297.0F - (float)GuiStyle.PADDING.intValue() * 2.0F);
      this.animationChangeCategory.EventImpl_21(300L);
      if (this.settingsElement == null) {
         this.settingsElement = new CosmeticSettingsElement();
      }

      List list = this.currentCategory == CosmeticElementPanel$CosmeticCategory.SETTINGS
         ? Collections.emptyList()
         : this.getFilteredElements(this.currentCategory);
      float f3 = this.currentCategory == CosmeticElementPanel$CosmeticCategory.SETTINGS
         ? this.settingsElement.getHeight() + (float)GuiStyle.PADDING.intValue()
         : this.getContentHeight(list, (float)GuiStyle.PADDING.intValue());
      this.clampScroll(f3 + (float)GuiStyle.PADDING.intValue(), this.scissorBounds.height());
      this.scroll = this.scroll + (this.scrollTarget - this.scroll) * 0.25F;
      float f4 = this.animationChangeCategory.StringHolder_8(1.0F);
      if (this.animationChangeCategory.ArrayListHolder()) {
         this.lastCategory = null;
      }

      float f5 = (0.5F - f4) / 0.5F;
      if (f5 < 0.0F) {
         f5 = 0.0F;
      }

      if (f5 > 1.0F) {
         f5 = 1.0F;
      }

      float f6 = (f4 - 0.3F) / 0.7F;
      if (f6 < 0.0F) {
         f6 = 0.0F;
      }

      if (f6 > 1.0F) {
         f6 = 1.0F;
      }

      iiii1ilili1l1l1lilli1liliii.ListHolder_6(f1, f2, f1 + this.scissorBounds.width(), f2 + this.scissorBounds.height());
      floatHolder_8.IIIl1ll1l1Il1II11Ill1Il1l1I = false;
      if (this.lastCategory != null && f5 > 0.0F) {
         float f7 = f * f5;
         if (this.lastCategory == CosmeticElementPanel$CosmeticCategory.SETTINGS && this.settingsElement != null) {
            this.settingsElement.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f1 + (float)GuiStyle.PADDING.intValue(), f2 + this.scroll, f7);
         } else {
            this.renderElements(this.getFilteredElements(this.lastCategory), this.lastCategory, iiii1ilili1l1l1lilli1liliii, i, j, f7, f1, f2);
         }
      }

      if (f6 > 0.0F) {
         float f9 = f * f6;
         float f8 = 20.0F * (1.0F - f6);
         if (this.currentCategory == CosmeticElementPanel$CosmeticCategory.SETTINGS && this.settingsElement != null) {
            this.settingsElement.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f1 + (float)GuiStyle.PADDING.intValue(), f2 + this.scroll + f8, f9);
            this.settingsElement
               .renderPriority(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f1 + (float)GuiStyle.PADDING.intValue(), f2 + this.scroll + f8, f9);
         } else {
            this.renderElements(list, this.currentCategory, iiii1ilili1l1l1lilli1liliii, i, j, f9, f1, f2 + f8);
         }
      }

      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      floatHolder_8.IIIl1ll1l1Il1II11Ill1Il1l1I = true;
   }

   private void renderElements(
      List<CosmeticElement> list,
      CosmeticElementPanel$CosmeticCategory cosmeticelementpanel$cosmeticcategory,
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      int i,
      int j,
      float f,
      float f1,
      float f2
   ) {
      if (list.isEmpty()) {
         this.renderEmptyState(iiii1ilili1l1l1lilli1liliii, f, f1, f2, cosmeticelementpanel$cosmeticcategory);
      } else {
         float f3 = f1 + (float)GuiStyle.PADDING.intValue();
         float f4 = f2 + this.scroll;
         float f5 = 376.0F - (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f6 = (float)GuiStyle.PADDING.intValue();
         float f7 = (f5 - f6 * 2.0F) / 3.0F;
         float[] afloat = new float[3];
         int k = 0;

         for (CosmeticElement cosmeticelement : list) {
            int l = 0;

            for (int i1 = 1; i1 < 3; i1++) {
               if (afloat[i1] < afloat[l]) {
                  l = i1;
               }
            }

            float f9 = f3 + (float)l * (f7 + f6);
            float f8 = f4 + afloat[l];
            HeightHandler li1il11i1iilii1iiili111li11 = new HeightHandler(
               f9, f8, cosmeticelement.getWidth(), cosmeticelement.getHeight()
            );
            if (this.scissorBounds.StringHolder_8(li1il11i1iilii1iiili111li11)) {
               cosmeticelement.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f9, f8, f, k);
            }

            afloat[l] += cosmeticelement.getHeight() + f6;
            k++;
         }
      }
   }

   private void renderEmptyState(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f1,
      float f2,
      CosmeticElementPanel$CosmeticCategory cosmeticelementpanel$cosmeticcategory
   ) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         Font font = Fonts.NEW_MEDIUM.getFont(6.0F);
         Font font1 = Fonts.NEW_REGULAR.getFont(5.0F);
         float f3 = f1 + 188.0F;
         float f4 = f2 + (297.0F - (float)GuiStyle.PADDING.intValue() * 2.0F) / 2.0F;
         String s;
         String s1;
         if (cosmeticelementpanel$cosmeticcategory == CosmeticElementPanel$CosmeticCategory.PETS) {
            s = "No pets found";
            s1 = "Put avatars in Zenith/cosmetics";
         } else {
            s = "No cosmetics found";
            s1 = "Put avatars in Zenith/cosmetics";
         }

         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, s, f3 - font.width(s) / 2.0F, f4 - font.height(), zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1, s1, f3 - font1.width(s1) / 2.0F, f4 + 2.0F, zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
      }
   }

   @Override
   public boolean mouseScrolled(double d0, double d1, double d3, double d2) {
      if (this.playerPreview3D != null
         && this.rightPreviewBounds != null
         && this.rightPreviewBounds.byteHolder(d0, d1)
         && this.playerPreview3D.onMouseScrolled(d0, d1, d2)) {
         return true;
      } else if (this.scissorBounds != null && this.scissorBounds.byteHolder(d0, d1)) {
         List list = this.getFilteredElements(this.currentCategory);
         if (list.isEmpty()) {
            return false;
         } else {
            float f = this.scissorBounds.height();
            float f1 = this.getContentHeight(list, (float)GuiStyle.PADDING.intValue()) + (float)GuiStyle.PADDING.intValue();
            if (f1 <= f) {
               return false;
            } else {
               this.scrollTarget += (float)d2 * 22.0F;
               this.clampScroll(f1, f);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.playerPreview3D != null
         && this.rightPreviewBounds != null
         && this.rightPreviewBounds.byteHolder(d0, d1)
         && this.playerPreview3D.onMouseClicked(d0, d1, ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll())) {
         return true;
      } else {
         try {
            if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
               boolean flag = ZenithClient.getInstance().ZenithInternal071().TotemParticles();
               boolean flag1 = ZenithClient.getInstance().BlockPosHolder().ZenithInternal151();
               if (this.headTabBounds != null && this.headTabBounds.byteHolder(d0, d1) && !flag) {
                  this.setCategory(CosmeticElementPanel$CosmeticCategory.HEAD);
                  return true;
               }

               if (this.modelsTabBounds != null && this.modelsTabBounds.byteHolder(d0, d1) && !flag) {
                  this.setCategory(CosmeticElementPanel$CosmeticCategory.MODELS);
                  return true;
               }

               if (this.petsTabBounds != null && this.petsTabBounds.byteHolder(d0, d1) && !flag1) {
                  this.setCategory(CosmeticElementPanel$CosmeticCategory.PETS);
                  return true;
               }

               if (this.settingsTabBounds != null && this.settingsTabBounds.byteHolder(d0, d1)) {
                  this.setCategory(CosmeticElementPanel$CosmeticCategory.SETTINGS);
                  return true;
               }
            }

            if (!this.animationChangeCategory.ArrayListHolder()) {
               return false;
            }

            if (ill1iili11ii1l != ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
               return false;
            }

            if (this.scissorBounds == null || !this.scissorBounds.byteHolder(d0, d1)) {
               return false;
            }

            if (this.currentCategory == CosmeticElementPanel$CosmeticCategory.SETTINGS) {
               if (this.settingsElement != null) {
                  if (this.settingsElement.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
                     return true;
                  }

                  return this.settingsElement.onMouseClicked(d0, d1, ill1iili11ii1l);
               }

               return false;
            }

            for (CosmeticElement cosmeticelement : this.getFilteredElements(this.currentCategory)) {
               if (cosmeticelement.onMouseClicked(d0, d1, ill1iili11ii1l)) {
                  return true;
               }
            }
         } catch (Exception exception) {
            exception.printStackTrace();
         }

         return false;
      }
   }

   @Override
   public boolean onMouseDragged(double d0, double d1, int i, double d2, double d3) {
      if (this.playerPreview3D == null) {
         return false;
      } else {
         boolean flag = this.rightPreviewBounds != null && this.rightPreviewBounds.byteHolder(d0, d1);
         return (this.playerPreview3D.isDragging() || flag) && this.playerPreview3D.onMouseDragged(d0, d1, i, d2, d3);
      }
   }

   @Override
   public boolean onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.playerPreview3D != null) {
         this.playerPreview3D.onMouseReleased(d0, d1, ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll());
      }

      if (this.currentCategory == CosmeticElementPanel$CosmeticCategory.SETTINGS && this.settingsElement != null) {
         this.settingsElement.onMouseReleased(d0, d1, ill1iili11ii1l);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public List<? extends Element> getElements() {
      return this.getFilteredElements(this.currentCategory);
   }

   @Override
   public void close() {
      CosmeticAvatarImageCache.clear();
      this.playerPreview3D = null;
      this.rightPreviewBounds = null;
      this.animationChangeCategory.EventTarget(1.0F);
      this.lastCategory = null;
      this.headTabBounds = null;
      this.modelsTabBounds = null;
      this.petsTabBounds = null;
   }

   @Override
   public void tick() {
      this.syncCosmetics();
   }

   private void setCategory(CosmeticElementPanel$CosmeticCategory cosmeticelementpanel$cosmeticcategory) {
      this.setCategory(cosmeticelementpanel$cosmeticcategory, false);
   }

   private void setCategory(CosmeticElementPanel$CosmeticCategory cosmeticelementpanel$cosmeticcategory, boolean flag) {
      if (flag || this.animationChangeCategory.ArrayListHolder()) {
         if (this.currentCategory != cosmeticelementpanel$cosmeticcategory) {
            this.lastCategory = this.currentCategory;
            this.currentCategory = cosmeticelementpanel$cosmeticcategory;
            this.scrollTarget = 0.0F;
            this.scroll = 0.0F;
            this.animationChangeCategory.EventTarget(0.0F);
            this.animationChangeCategory.ZenithInternal095(1.0F);
         }
      }
   }

   private void syncCosmetics() {
      long i = System.currentTimeMillis();
      if (i - this.lastSyncAt >= 800L) {
         this.lastSyncAt = i;
         Path path = getCosmeticsDirectory();
         if (path != null) {
            List list = loadCosmetics(path);
            String s = list.stream()
               .map(cosmeticelementpanel$cosmeticentry1 -> cosmeticelementpanel$cosmeticentry1.path().toAbsolutePath().normalize().toString())
               .sorted(String.CASE_INSENSITIVE_ORDER)
               .reduce((s1, s2) -> s1 + "|" + s2)
               .orElse("");
            if (!Objects.equals(s, this.lastSignature)) {
               this.elements.clear();
               this.petElements.clear();
               PathHolder ll1l1111ll1llii11lli11lliiii1 = ZenithClient.getInstance().ZenithInternal071();
               floatHolder_3 iii1lii1li1llilllil11li1i1i1l1 = ZenithClient.getInstance()
                  .BlockPosHolder();

               for (CosmeticElementPanel$CosmeticEntry cosmeticelementpanel$cosmeticentry : list) {
                  this.elements
                     .add(
                        new CosmeticElement(
                           cosmeticelementpanel$cosmeticentry.name(),
                           cosmeticelementpanel$cosmeticentry.relativePath(),
                           cosmeticelementpanel$cosmeticentry.path(),
                           ll1l1111ll1llii11lli11lliiii1::ZenithInternal018,
                           ll1l1111ll1llii11lli11lliiii1::StringHolder_8
                        )
                     );
                  if (!cosmeticelementpanel$cosmeticentry.relativePath().toLowerCase(Locale.ROOT).startsWith("head-")) {
                     this.petElements
                        .add(
                           new CosmeticElement(
                              cosmeticelementpanel$cosmeticentry.name(),
                              cosmeticelementpanel$cosmeticentry.relativePath(),
                              cosmeticelementpanel$cosmeticentry.path(),
                              iii1lii1li1llilllil11li1i1i1l1::ZenithInternal063,
                              iii1lii1li1llilllil11li1i1i1l1::EventBus
                           )
                        );
                  }
               }

               this.lastSignature = s;
            }
         }
      }
   }

   private List<CosmeticElement> getFilteredElements(CosmeticElementPanel$CosmeticCategory cosmeticelementpanel$cosmeticcategory) {
      Object object;
      if (cosmeticelementpanel$cosmeticcategory == CosmeticElementPanel$CosmeticCategory.PETS) {
         object = new ArrayList<>(this.petElements);
      } else if (cosmeticelementpanel$cosmeticcategory == CosmeticElementPanel$CosmeticCategory.HEAD) {
         object = this.elements.stream().filter(cosmeticelement -> cosmeticelement.getRelativePath().toLowerCase(Locale.ROOT).startsWith("head-")).toList();
      } else {
         object = this.elements.stream().filter(cosmeticelement -> !cosmeticelement.getRelativePath().toLowerCase(Locale.ROOT).startsWith("head-")).toList();
      }

      String s = ZenithClient.getInstance().ZenithInternal141().getSearchValue();
      if (s != null && !s.isBlank()) {
         String s1 = s.trim().toLowerCase(Locale.ROOT);
         return object.stream()
            .filter(
               cosmeticelement -> cosmeticelement.getName().toLowerCase(Locale.ROOT).contains(s1)
                     || cosmeticelement.getRelativePath().toLowerCase(Locale.ROOT).contains(s1)
            )
            .toList();
      } else {
         return (List<CosmeticElement>)object;
      }
   }

   private float getContentHeight(List<CosmeticElement> list, float f) {
      if (list.isEmpty()) {
         return 0.0F;
      } else {
         float[] afloat = new float[3];

         for (CosmeticElement cosmeticelement : list) {
            int i = 0;

            for (int j = 1; j < 3; j++) {
               if (afloat[j] < afloat[i]) {
                  i = j;
               }
            }

            afloat[i] += cosmeticelement.getHeight() + f;
         }

         float f2 = 0.0F;

         for (float f1 : afloat) {
            if (f1 > f2) {
               f2 = f1;
            }
         }

         return Math.max(0.0F, f2 - f);
      }
   }

   private void clampScroll(float f, float f1) {
      if (f <= f1) {
         this.scrollTarget = 0.0F;
         this.scroll = 0.0F;
      } else {
         float f2 = f1 - f;
         if (this.scrollTarget < f2) {
            this.scrollTarget = f2;
         }

         if (this.scrollTarget > 0.0F) {
            this.scrollTarget = 0.0F;
         }

         if (this.scroll < f2) {
            this.scroll = f2;
         }

         if (this.scroll > 0.0F) {
            this.scroll = 0.0F;
         }
      }
   }

   private static Path getCosmeticsDirectory() {
      try {
         Path path = ZenithClient.AhHelper.toPath().resolve("cosmetics");
         Files.createDirectories(path);
         ensureCosmeticsExtracted(path);
         return path;
      } catch (Exception exception) {
         return null;
      }
   }

   private static void ensureCosmeticsExtracted(Path targetDir) {
      try {
         if (!Files.exists(targetDir)) {
            Files.createDirectories(targetDir);
         }
         try (Stream<Path> s = Files.list(targetDir)) {
            if (s.findAny().isPresent()) {
               return;
            }
         }
         java.net.URL resource = CosmeticElementPanel.class.getResource("/assets/zenith/cosmetics");
         if (resource != null) {
            if (resource.getProtocol().equals("file")) {
               Path srcPath = java.nio.file.Paths.get(resource.toURI());
               copyDirectoryRecursively(srcPath, targetDir);
            } else if (resource.getProtocol().equals("jar")) {
               java.net.URLConnection conn = resource.openConnection();
               if (conn instanceof java.net.JarURLConnection jarConn) {
                  java.util.jar.JarFile jarFile = jarConn.getJarFile();
                  java.util.Enumeration<java.util.jar.JarEntry> entries = jarFile.entries();
                  String prefix = "assets/zenith/cosmetics/";
                  while (entries.hasMoreElements()) {
                     java.util.jar.JarEntry entry = entries.nextElement();
                     if (entry.getName().startsWith(prefix) && !entry.isDirectory()) {
                        String rel = entry.getName().substring(prefix.length());
                        Path outFile = targetDir.resolve(rel);
                        Files.createDirectories(outFile.getParent());
                        try (java.io.InputStream is = jarFile.getInputStream(entry)) {
                           Files.copy(is, outFile, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                        }
                     }
                  }
               }
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   private static void copyDirectoryRecursively(Path source, Path target) throws java.io.IOException {
      try (Stream<Path> stream = Files.walk(source)) {
         stream.forEach(src -> {
            try {
               Path dest = target.resolve(source.relativize(src).toString());
               if (Files.isDirectory(src)) {
                  Files.createDirectories(dest);
               } else {
                  Files.createDirectories(dest.getParent());
                  Files.copy(src, dest, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
               }
            } catch (Exception e) {
               // ignore
            }
         });
      }
   }

   private static List<CosmeticElementPanel$CosmeticEntry> loadCosmetics(Path path) {
      ArrayList arraylist = new ArrayList();
      collectAvatarDirectories(path, arraylist);
      arraylist.sort(Comparator.comparing(path3 -> displayName(path, path3), String.CASE_INSENSITIVE_ORDER));
      ArrayList arraylist1 = new ArrayList();

      for (Path path1 : arraylist) {
         String s = path.relativize(path1).toString().replace('\\', '/');
         arraylist1.add(new CosmeticElementPanel$CosmeticEntry(displayName(path, path1), s, path1));
      }

      return arraylist1;
   }

   private static void collectAvatarDirectories(Path path, List<Path> list) {
      if (Files.isDirectory(path) && !isIgnoredDirectory(path)) {
         if (hasAvatarJson(path)) {
            list.add(path);
         } else {
            try (Stream stream = Files.list(path)) {
               stream.filter(path1 -> Files.isDirectory(path1)).forEach(path1 -> collectAvatarDirectories(path1, list));
            } catch (Exception exception) {
            }
         }
      }
   }

   private static boolean isIgnoredDirectory(Path path) {
      Path path1 = path.getFileName();
      return path1 != null && path1.toString().startsWith(".");
   }

   private static boolean hasAvatarJson(Path path) {
      try {
         boolean flag;
         try (Stream stream = Files.list(path)) {
            flag = stream.anyMatch(path1 -> path1.getFileName().toString().equalsIgnoreCase("avatar.json"));
         }

         return flag;
      } catch (Exception exception) {
         return false;
      }
   }

   private static String displayName(Path path, Path path1) {
      String s;
      if (path1.startsWith(path)) {
         s = path.relativize(path1).toString().replace('\\', '/');
      } else {
         Path path2 = path1.getFileName();
         s = path2 == null ? "Unknown" : path2.toString();
      }

      if (s.toLowerCase(Locale.ROOT).startsWith("head-")) {
         s = s.substring("head-".length());
      }

      return s.replace("/", " / ");
   }

   private static String trimToWidth(Font font, String s, float f) {
      if (s != null && !s.isEmpty() && !(font.width(s) <= f)) {
         String s1 = "...";
         float f1 = font.width(s1);
         if (f1 > f) {
            return "";
         } else {
            int i = s.length();

            while (i > 0 && font.width(s.substring(0, i)) + f1 > f) {
               i--;
            }

            return i <= 0 ? s1 : s.substring(0, i) + s1;
         }
      } else {
         return s == null ? "" : s;
      }
   }

   private static boolean samePath(Path path, Path path1) {
      return path != null && path1 != null ? path.toAbsolutePath().normalize().equals(path1.toAbsolutePath().normalize()) : false;
   }

   @Override
   public boolean isRender() {
      return true;
   }

   @Override
   public void renderRightPanel(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f4 = f * f3;
         if (!(f4 <= 0.01F)) {
            float f5 = f3 * f;
            float f6 = f1 - (float)(128 + GuiStyle.PADDING) * (1.0F - f5);
            float f7 = 171.0F;
            iiii1ilili1l1l1lilli1liliii.ListHolder_6(
               f1 - (float)GuiStyle.PADDING.intValue() * 3.0F, f2, f1 + 128.0F + (float)GuiStyle.PADDING.intValue() * 4.0F, f2 + 200.0F
            );
            if (ZenithClient.getInstance().ZenithInternal141().getBlurPower() != 0.0F) {
               floatHolder_8.StringHolder_8(
                  iiii1ilili1l1l1lilli1liliii.getMatrices(),
                  f6,
                  f2,
                  128.0F,
                  200.0F,
                  ZenithClient.getInstance().ZenithInternal141().getBlurPower(),
                  floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
                  ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f4),
                  true,
                  false
               );
            }

            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f6,
               f2,
               128.0F,
               29.0F,
               floatHolder_5.GetDisplayNameHandler_2((float)GuiStyle.ROUND.intValue()),
               zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f6,
               f2 + 29.0F,
               128.0F,
               f7,
               floatHolder_5.ZenithInternal016((float)GuiStyle.ROUND.intValue()),
               zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
            );
            Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
            Font font1 = Fonts.NEW_ICONS.getFont(4.5F);
            String s = ";";
            float f8 = f6 + (float)GuiStyle.PADDING.intValue() * 2.0F;
            float f9 = f2 + (29.0F - font.height()) / 2.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font1, s, f8, f2 + (29.0F - font1.height()) / 2.0F - 0.1F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
            );
            String s1 = this.getSelectedName();
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font,
               trimToWidth(font, s1, 128.0F - (float)GuiStyle.PADDING.intValue() * 5.0F - font1.width(s)),
               f8 + font1.width(s) + (float)GuiStyle.PADDING.intValue(),
               f9,
               zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
            );
            float f10 = f2 + 29.0F;
            float f11 = 128.0F;
            this.rightPreviewBounds = new HeightHandler(f6, f10, f11, f7);
            if (this.playerPreview3D == null) {
               this.playerPreview3D = new PlayerPreview3D(f6, f10, f11, f7);
            } else {
               this.playerPreview3D.setBounds(f6, f10, f11, f7);
            }

            ClientPlayerEntity ClientPlayerEntity = l11I1I1ll1Illll1I1l1111l1II.player;
            if (ClientPlayerEntity != null) {
               iiii1ilili1l1l1lilli1liliii.ListHolder_6(f6, f10, f6 + f11, f10 + f7);
               this.playerPreview3D.render(iiii1ilili1l1l1lilli1liliii, ClientPlayerEntity, (float)i, (float)j);
               iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
            } else {
               Font font2 = Fonts.NEW_REGULAR.getFont(5.0F);
               String s2 = "No player";
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                  font2,
                  s2,
                  f6 + (f11 - font2.width(s2)) / 2.0F,
                  f10 + (f7 - font2.height()) / 2.0F,
                  zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
               );
            }

            iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
         }
      }
   }

   private String getSelectedName() {
      Path path = ZenithClient.getInstance().ZenithInternal071().ZenithInternal018();
      if (path == null) {
         return "Cosmetic preview";
      } else {
         for (CosmeticElement cosmeticelement : this.elements) {
            if (samePath(cosmeticelement.getPath(), path)) {
               return cosmeticelement.getName();
            }
         }

         return "Cosmetic preview";
      }
   }

   public CosmeticElementPanel$CosmeticCategory getCurrentCategory() {
      return this.currentCategory;
   }
}
