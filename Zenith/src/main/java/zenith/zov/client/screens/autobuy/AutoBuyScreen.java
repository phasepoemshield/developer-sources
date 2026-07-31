package zenith.zov.client.screens.autobuy;

import zenith.hud.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.Vector2f;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.ScreenImpl;
import zenith.ZenithInternal068;
import zenith.doubleHolder;
import zenith.Autobuy$II1Il11l111II11IIl;
import zenith.floatHolder_8;
import zenith.OnMouseClickedHandler;
import zenith.GetDisplayNameHandler_2;
import zenith.ZenithInternal105$Helper;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.autobuy.items.AutoInventoryArmorElytra;
import zenith.zov.client.screens.autobuy.items.AutoInventoryArtefact;
import zenith.zov.client.screens.autobuy.items.AutoInventoryBootsEternity;
import zenith.zov.client.screens.autobuy.items.AutoInventoryBootsInfinity;
import zenith.zov.client.screens.autobuy.items.AutoInventoryChestplateEternity;
import zenith.zov.client.screens.autobuy.items.AutoInventoryChestplateInfinity;
import zenith.zov.client.screens.autobuy.items.AutoInventoryElytra;
import zenith.zov.client.screens.autobuy.items.AutoInventoryHelmetEternity;
import zenith.zov.client.screens.autobuy.items.AutoInventoryHelmetInfinity;
import zenith.zov.client.screens.autobuy.items.AutoInventoryItem;
import zenith.zov.client.screens.autobuy.items.AutoInventoryLeggingsInfinity;
import zenith.zov.client.screens.autobuy.items.AutoInventoryShtaniEternity;
import zenith.zov.client.screens.autobuy.items.ExtendAutoInventoryItem;
import zenith.zov.client.screens.autobuy.items.UiItemBuy;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;

public class AutoBuyScreen extends ScreenImpl {
   private static final Path HISTORY_FILE = Paths.get("Zenith/autobuy_history.json");
   private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
   private final OnMouseClickedHandler searchBox = new OnMouseClickedHandler(
      new Vector2f(0.0F, 0.0F), Fonts.MEDIUM.getFont(7.0F), "Search...", 200.0F
   );
   private final List<UiItemBuy> libraryItems = new ArrayList<>();
   private final List<UiItemBuy> inventoryItems = new ArrayList<>();
   private final List<AutoInventoryItem> targetItems;
   private List<AutoBuyScreen$PurchaseHistory> purchaseHistory = new ArrayList<>();
   private final Map<String, AutoBuyScreen$CachedItemSettings> settingsCache = new HashMap<>();
   private final doubleHolder scrollHandler = new doubleHolder();
   private final doubleHolder historyScrollHandler = new doubleHolder();
   private boolean draggingScrollbar = false;
   private float scrollClickOffset = 0.0F;
   private UiItemBuy currentUiItemBuy = null;

   private void setSelectedItem(UiItemBuy uiitembuy) {
      this.currentUiItemBuy = uiitembuy;
      if (uiitembuy != null && !this.inventoryItems.contains(uiitembuy)) {
         String s = this.getItemKey(uiitembuy.getItemBuy().getItemBuy());
         if (this.settingsCache.containsKey(s)) {
            AutoBuyScreen$CachedItemSettings autobuyscreen$cacheditemsettings = this.settingsCache.get(s);
            uiitembuy.getItemBuy().setMaxSumBuy(autobuyscreen$cacheditemsettings.maxSumBuy);
            uiitembuy.getItemBuy().setCountBuy(autobuyscreen$cacheditemsettings.countBuy);
         }
      }
   }

   private boolean isLibItemAdded(UiItemBuy uiitembuy) {
      return this.findInventoryByLib(uiitembuy) != null;
   }

   private UiItemBuy findInventoryByLib(UiItemBuy uiitembuy) {
      for (UiItemBuy uiitembuy1 : this.inventoryItems) {
         if (uiitembuy1.getItemBuy().getItemBuy().equals(uiitembuy.getItemBuy().getItemBuy())) {
            return uiitembuy1;
         }
      }

      return null;
   }

   private void addItemToInventory(UiItemBuy uiitembuy) {
      AutoInventoryItem autoinventoryitem = createItem(uiitembuy.getItemBuy().getItemBuy());
      String s = this.getItemKey(uiitembuy.getItemBuy().getItemBuy());
      if (this.settingsCache.containsKey(s)) {
         AutoBuyScreen$CachedItemSettings autobuyscreen$cacheditemsettings = this.settingsCache.get(s);
         autoinventoryitem.setMaxSumBuy(autobuyscreen$cacheditemsettings.maxSumBuy);
         autoinventoryitem.setCountBuy(autobuyscreen$cacheditemsettings.countBuy);
      } else if (this.currentUiItemBuy != null && this.currentUiItemBuy.getItemBuy().getItemBuy().equals(uiitembuy.getItemBuy().getItemBuy())) {
         autoinventoryitem.setMaxSumBuy(this.currentUiItemBuy.getItemBuy().getMaxSumBuy());
         autoinventoryitem.setCountBuy(this.currentUiItemBuy.getItemBuy().getCountBuy());
      }

      this.targetItems.add(autoinventoryitem);
      UiItemBuy uiitembuy1 = new UiItemBuy(autoinventoryitem);
      uiitembuy1.setUseCornerBrackets(true);
      uiitembuy1.setShowPurchaseText(false);
      uiitembuy1.setUseLightBackground(true);
      this.inventoryItems.add(uiitembuy1);
      uiitembuy1.getItemBuy().setSelected(true);
      this.setSelectedItem(uiitembuy1);
   }

   public static AutoInventoryItem createItem(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      String s = li1ll11ilil1ii1lilll1i.HudElement();
      if (li1ll11ilil1ii1lilll1i.Category() == ZenithInternal105$Helper.ZenithInternal027
         && li1ll11ilil1ii1lilll1i.getItemStack().getItem() == Items.ELYTRA) {
         return new AutoInventoryElytra(li1ll11ilil1ii1lilll1i);
      } else if ("Броневая элитра".equals(s)) {
         return new AutoInventoryArmorElytra(li1ll11ilil1ii1lilll1i);
      } else if (li1ll11ilil1ii1lilll1i.getItemStack().getItem() == Items.CONDUIT) {
         return new AutoInventoryArtefact(li1ll11ilil1ii1lilll1i);
      } else if ("Шлем infinity".equals(s)) {
         return new AutoInventoryHelmetInfinity(li1ll11ilil1ii1lilll1i);
      } else if ("Нагрудник infinity".equals(s)) {
         return new AutoInventoryChestplateInfinity(li1ll11ilil1ii1lilll1i);
      } else if ("Штаны infinity".equals(s)) {
         return new AutoInventoryLeggingsInfinity(li1ll11ilil1ii1lilll1i);
      } else if ("Ботинки infinity".equals(s)) {
         return new AutoInventoryBootsInfinity(li1ll11ilil1ii1lilll1i);
      } else if ("Шлем eternity".equals(s)) {
         return new AutoInventoryHelmetEternity(li1ll11ilil1ii1lilll1i);
      } else if ("Нагрудник eternity".equals(s)) {
         return new AutoInventoryChestplateEternity(li1ll11ilil1ii1lilll1i);
      } else if ("Штаны eternity".equals(s)) {
         return new AutoInventoryShtaniEternity(li1ll11ilil1ii1lilll1i);
      } else {
         return (AutoInventoryItem)("Ботинки eternity".equals(s)
            ? new AutoInventoryBootsEternity(li1ll11ilil1ii1lilll1i)
            : new AutoInventoryItem(li1ll11ilil1ii1lilll1i));
      }
   }

   public AutoBuyScreen(List<GetDisplayNameHandler_2> list, List<AutoInventoryItem> list1) {
      this.targetItems = list1;
      this.loadHistory();

      for (AutoInventoryItem autoinventoryitem : list1) {
         String s = this.getItemKey(autoinventoryitem.getItemBuy());
         this.settingsCache.put(s, new AutoBuyScreen$CachedItemSettings(autoinventoryitem.getMaxSumBuy(), autoinventoryitem.getCountBuy()));
      }

      list.forEach(li1ll11ilil1ii1lilll1i -> {
         UiItemBuy uiitembuy1 = new UiItemBuy(createItem(li1ll11ilil1ii1lilll1i));
         uiitembuy1.setUseCornerBrackets(true);
         uiitembuy1.setShowPurchaseText(false);
         uiitembuy1.setUseLightBackground(true);
         this.libraryItems.add(uiitembuy1);
      });

      for (AutoInventoryItem autoinventoryitem1 : list1) {
         UiItemBuy uiitembuy = new UiItemBuy(autoinventoryitem1);
         uiitembuy.setUseCornerBrackets(true);
         uiitembuy.setShowPurchaseText(false);
         uiitembuy.setUseLightBackground(true);
         this.inventoryItems.add(uiitembuy);
      }

      this.initializeSelectedItem();
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      this.scrollHandler.Coordinates();
      float f2 = 24.0F;
      float f3 = 8.0F + (f2 + 4.0F) * 1.0F + 8.0F - 4.0F;
      float f4 = 18.0F * (f2 + 4.0F) + 8.0F;
      float f5 = 556.0F;
      float f6 = 264.0F;
      float f7 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() - f5) / 2.0F;
      float f8 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() - f6) / 2.0F;
      SetColorHandler_3 llliili1l1ii11i1lii1 = ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f7, f8, f5, f6, floatHolder_5.StringHolder_30(8.0F), llliili1l1ii11i1lii1.l1lII1IIl1lllll1II11l11IIl()
      );
      float f9 = f8 + 8.0F;
      float f10 = 24.0F;
      float f11 = f2 + 4.0F + 96.0F;
      float f12 = 2.0F;
      float f13 = 129.0F;
      float f14 = f11 + 4.0F + f12 + 8.0F + f13;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f7 + 8.0F, f9, f14, f10, floatHolder_5.StringHolder_30(6.0F), llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1()
      );
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f7 + 8.0F,
         f9,
         f14,
         f10,
         -0.1F,
         floatHolder_5.StringHolder_30(6.0F),
         llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
      );
      Font font = Fonts.ICONS.getFont(11.0F);
      Font font1 = Fonts.MEDIUM.getFont(8.0F);
      String s = "5";
      String s1 = "Auto Buy";
      float f15 = font.width(s);
      float f16 = 6.0F;
      float f17 = 8.0F;
      float f18 = f7 + 8.0F + f17;
      float f19 = f9 + (f10 - font.height()) / 2.0F;
      float f20 = f9 + (f10 - font1.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font,
         s,
         f18,
         f19,
         ZenithClient.getInstance().NotificationsHolder().lII111IIl1lI1I11lIIlIl1III1I().MusicInfo()
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, s1, f18 + f15 + f16, f20, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl());
      float f21 = f9 + f10 + 8.0F;
      float f22 = 129.0F;
      float f23 = 22.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f7 + 8.0F, f21, f22, f23, floatHolder_5.StringHolder_30(6.0F), llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1()
      );
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f7 + 8.0F,
         f21,
         f22,
         f23,
         -0.1F,
         floatHolder_5.StringHolder_30(6.0F),
         llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
      );
      this.searchBox
         .StringHolder_8(
            iiii1ilili1l1l1lilli1liliii,
            f7 + 8.0F + 8.0F,
            f21 + 8.0F,
            llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(),
            llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
         );
      this.searchBox.setWidth(f22 - 16.0F);
      this.searchBox.EventImpl_38(15);
      String s2 = this.searchBox.II1I11IIl().toLowerCase();
      List list = this.libraryItems.stream().filter(uiitembuy -> uiitembuy.getItemBuy().getItemBuy().HudElement().toLowerCase().contains(s2)).toList();
      this.renderLibrary(iiii1ilili1l1l1lilli1liliii, list, f7 + 8.0F, f21 + f23 + 8.0F, f2, f7, f8, f6, f, f1);
      float f24 = f7 + 8.0F + f11 + 4.0F + f12 + 8.0F + f13;
      float f25 = f24 + 6.0F;
      float f26 = f8 + 8.0F;
      float f27 = f7 + f5 - f25 - 8.0F;
      float f28 = f6 - 16.0F;
      this.renderPurchaseHistory(iiii1ilili1l1l1lilli1liliii, f25, f26, f27, f28, f2, f8, f8 + f6);
   }

   private void renderLibrary(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      List<UiItemBuy> list,
      float f,
      float f1,
      float f2,
      float f48,
      float f3,
      float f4,
      float f5,
      float f6
   ) {
      SetColorHandler_3 llliili1l1ii11i1lii1 = ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1();
      int i = list.size();
      float f7 = f2 + 4.0F;
      float f8 = (float)i * f7;
      float f9 = f2 + 4.0F + 96.0F;
      float f10 = f3 + f4 - f1;
      this.scrollHandler.ZenithInternal084((double)Math.max(0.0F, f8 - f10));
      float f11 = (float)this.scrollHandler.IIIlII1Il1l111lI1();
      float f12 = 2.0F;
      float f13 = f10 - 8.0F;
      float f14 = this.scrollHandler.l1IIlIIlI11lII1() == 0.0 ? 0.0F : (float)(this.scrollHandler.IIIlII1Il1l111lI1() / this.scrollHandler.l1IIlIIlI11lII1());
      float f15 = Math.max(f13 * (f13 / (float)((double)f13 + this.scrollHandler.l1IIlIIlI11lII1())), 20.0F);
      float f16 = Math.max(1.0F, f13 - f15);
      float f17 = f1 + f16 * f14;
      f17 = Math.min(f1 + f13, f17);
      if (this.scrollHandler.l1IIlIIlI11lII1() > 0.0) {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f + f9 + 4.0F, f1, f12, f13, floatHolder_5.StringHolder_30(0.5F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
         );
         if (f17 + f15 > f13 + f1) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f + f9 + 4.0F, f1, f12, f13, floatHolder_5.StringHolder_30(1.0F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
            );
         } else {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f + f9 + 4.0F, f17, f12, f15, floatHolder_5.StringHolder_30(1.0F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
            );
         }
      }

      float f18 = 129.0F;
      float f19 = 24.0F;
      float f20 = f4 - 16.0F - f19 - 8.0F;
      float f21 = f + f9 + 4.0F + f12 + 8.0F;
      float f22 = f3 + 8.0F + f19 + 8.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f21, f22, f18, f20, floatHolder_5.StringHolder_30(6.0F), llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1()
      );
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f21,
         f22,
         f18,
         f20,
         -0.1F,
         floatHolder_5.StringHolder_30(6.0F),
         llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
      );
      if (this.currentUiItemBuy != null) {
         float f23 = f22 + 8.0F;
         float f24 = 32.0F;
         float f25 = f21 + (f18 - f24) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f25, f23, f24, f24, floatHolder_5.StringHolder_30(6.0F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
         );
         floatHolder_8.EventTarget(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            f25,
            f23,
            f24,
            f24,
            -0.1F,
            floatHolder_5.StringHolder_30(6.0F),
            llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
         );
         boolean flag = this.inventoryItems.contains(this.currentUiItemBuy);
         if (flag) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f25, f23, f24, f24, 0.05F, 9.0F, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), floatHolder_5.StringHolder_30(6.0F)
            );
         }

         ItemStack ItemStack = this.currentUiItemBuy.getItemBuy().getItemBuy().getItemStack();
         if (ItemStack != null && !ItemStack.isEmpty()) {
            iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
            iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f25 + (f24 - 16.0F) / 2.0F, f23 + (f24 - 16.0F) / 2.0F, 0.0F);
            iiii1ilili1l1l1lilli1liliii.getMatrices().scale(1.0F, 1.0F, 1.0F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(ItemStack, 0, 0);
            iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
         }

         f23 += f24 + 8.0F;
         String s = this.currentUiItemBuy.getItemBuy().getItemBuy().getDisplayName();
         float f26 = Fonts.MEDIUM.getFont(7.0F).height();
         float f27 = Fonts.MEDIUM.getFont(7.0F).width(s);
         float f28 = f18 - 16.0F;
         if (!(f27 > f28)) {
            float f35 = f21 + (f18 - f27) / 2.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.MEDIUM.getFont(7.0F), s, f35, f23, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl());
            f23 += f26 + 8.0F;
         } else {
            String[] astring = s.split(" ");
            StringBuilder stringbuilder = new StringBuilder();

            for (String s1 : astring) {
               String s2 = stringbuilder.length() > 0 ? stringbuilder + " " + s1 : s1;
               if (Fonts.MEDIUM.getFont(7.0F).width(s2) > f28) {
                  if (stringbuilder.length() > 0) {
                     float f29 = Fonts.MEDIUM.getFont(7.0F).width(stringbuilder.toString());
                     float f30 = f21 + (f18 - f29) / 2.0F;
                     iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                        Fonts.MEDIUM.getFont(7.0F), stringbuilder.toString(), f30, f23, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl()
                     );
                     f23 += f26 + 2.0F;
                     stringbuilder = new StringBuilder(s1);
                  } else {
                     String s5 = s1.substring(0, Math.min(s1.length(), 15)) + "...";
                     float f44 = Fonts.MEDIUM.getFont(7.0F).width(s5);
                     float f31 = f21 + (f18 - f44) / 2.0F;
                     iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.MEDIUM.getFont(7.0F), s5, f31, f23, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl());
                     f23 += f26 + 2.0F;
                     stringbuilder = new StringBuilder();
                  }
               } else {
                  stringbuilder.append(stringbuilder.length() > 0 ? " " : "").append(s1);
               }
            }

            if (stringbuilder.length() > 0) {
               float f37 = Fonts.MEDIUM.getFont(7.0F).width(stringbuilder.toString());
               float f39 = f21 + (f18 - f37) / 2.0F;
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                  Fonts.MEDIUM.getFont(7.0F), stringbuilder.toString(), f39, f23, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl()
               );
               f23 += f26 + 4.0F;
            }
         }

         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f21 + 8.0F, f23, f18 - 16.0F, 1.0F, floatHolder_5.StringHolder_30(0.5F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
         );
         f23 += 8.0F;
         String s4 = "Макс. цена:";
         float f38 = Fonts.MEDIUM.getFont(7.0F).width(s4);
         float f40 = f21 + 8.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.MEDIUM.getFont(7.0F), s4, f40, f23, llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III());
         f23 += f26 + 4.0F;
         float f41 = f21 + 8.0F;
         float f42 = f18 - 16.0F;
         float f43 = 20.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f41, f23, f42, f43, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
         );
         floatHolder_8.EventTarget(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            f41,
            f23,
            f42,
            f43,
            -0.1F,
            floatHolder_5.StringHolder_30(4.0F),
            llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
         );
         float f45 = f41 + 6.0F;
         float f46 = f23 + (f43 - f26) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.MEDIUM.getFont(7.0F), "$", f45, f46, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.currentUiItemBuy
            .renderSumTextBox(
               iiii1ilili1l1l1lilli1liliii,
               f45 + 10.0F,
               f46,
               llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(),
               llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
            );
         this.currentUiItemBuy.setSumTextBoxWidth((float)((int)(f42 - 20.0F)));
         f23 += f43 + 8.0F;
         if (this.currentUiItemBuy.getItemBuy() instanceof ExtendAutoInventoryItem extendautoinventoryitem) {
            float f47 = f22 + f20 - 8.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f21, (int)f23, (int)(f21 + f18), (int)f47);

            for (MenuSetting menusetting : extendautoinventoryitem.getEnchants()) {
               if (f23 + menusetting.getHeight() <= f47) {
                  menusetting.render(
                     iiii1ilili1l1l1lilli1liliii,
                     f5,
                     f6,
                     f21 + 8.0F,
                     f23,
                     f18 - 16.0F,
                     1.0F,
                     1.0F,
                     llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(),
                     llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(),
                     llliili1l1ii11i1lii1.l1l1lIIlI1l11(),
                     llliili1l1ii11i1lii1
                  );
                  f23 += menusetting.getHeight() + 8.0F;
               }
            }

            iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
         }
      }

      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f, (int)f1, (int)(f + f9), (int)(f1 + f10));
      int j = 0;

      for (UiItemBuy uiitembuy : list) {
         float f32 = f1 + (float)j * (f2 + 4.0F) - f11;
         uiitembuy.setBounds(f, f32, f2, f2);
         boolean flag1 = this.isLibItemAdded(uiitembuy);
         uiitembuy.setUseCornerBrackets(true);
         uiitembuy.setShowPurchaseText(false);
         uiitembuy.setUseLightBackground(true);
         uiitembuy.renderSlotBar(iiii1ilili1l1l1lilli1liliii, f, f32, f2, floatHolder_5.StringHolder_30(6.0F), flag1);
         if (!flag1) {
            floatHolder_8.EventTarget(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               f,
               f32,
               f2,
               f2,
               -0.1F,
               floatHolder_5.StringHolder_30(6.0F),
               llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
            );
         }

         float f33 = f + f2 + 4.0F;
         float f34 = 96.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f33, f32, f34, f2, new floatHolder_5(6.0F, 6.0F, 6.0F, 6.0F), llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1()
         );
         floatHolder_8.EventTarget(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            f33,
            f32,
            f34,
            f2,
            -0.1F,
            new floatHolder_5(6.0F, 6.0F, 6.0F, 6.0F),
            llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
         );
         String s3 = uiitembuy.getItemBuy().getItemBuy().getDisplayName();
         if (s3.length() > 20) {
            s3 = s3.substring(0, 17) + "...";
         }

         float f36 = f32 + (f2 - Fonts.MEDIUM.getFont(7.0F).height()) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.MEDIUM.getFont(7.0F), s3, f33 + 4.0F, f36, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl());
         j++;
      }

      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
   }

   private void renderPurchaseHistory(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f31, float f3, float f4, float f5
   ) {
      SetColorHandler_3 llliili1l1ii11i1lii1 = ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1();
      Font font = Fonts.MEDIUM.getFont(7.0F);
      float f6 = f3 + 4.0F;
      float f7 = (float)this.purchaseHistory.size() * f6;
      float f8 = f5 - f1;
      this.historyScrollHandler.ZenithInternal084((double)Math.max(0.0F, f7 - f8));
      this.historyScrollHandler.Coordinates();
      float f9 = (float)this.historyScrollHandler.IIIlII1Il1l111lI1();
      float f10 = 2.0F;
      float f11 = f8 - 8.0F;
      float f12 = this.historyScrollHandler.l1IIlIIlI11lII1() == 0.0
         ? 0.0F
         : (float)(this.historyScrollHandler.IIIlII1Il1l111lI1() / this.historyScrollHandler.l1IIlIIlI11lII1());
      float f13 = Math.max(f11 * (f11 / (float)((double)f11 + this.historyScrollHandler.l1IIlIIlI11lII1())), 20.0F);
      float f14 = Math.max(1.0F, f11 - f13);
      float f15 = f1 + f14 * f12;
      f15 = Math.min(f1 + f11, f15);
      if (!this.purchaseHistory.isEmpty()) {
         float f16 = f + f2 - f10 + 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f16, f1, f10, f11, floatHolder_5.StringHolder_30(0.5F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
         );
         if (f15 + f13 > f11 + f1) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f16, f1, f10, f11, floatHolder_5.StringHolder_30(1.0F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
            );
         } else {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f16, f15, f10, f13, floatHolder_5.StringHolder_30(1.0F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
            );
         }
      }

      float f28 = f2 - f10 - 4.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f, (int)f4, (int)(f + f28), (int)f5);
      int i = 0;

      for (AutoBuyScreen$PurchaseHistory autobuyscreen$purchasehistory : this.purchaseHistory) {
         float f17 = f1 + (float)i * f6 - f9;
         if (!(f17 + f6 < f1) && !(f17 > f1 + f8)) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f, f17, f3, f3, floatHolder_5.StringHolder_30(6.0F), llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1()
            );
            floatHolder_8.EventTarget(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               f,
               f17,
               f3,
               f3,
               -0.1F,
               floatHolder_5.StringHolder_30(6.0F),
               llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
            );
            ItemStack ItemStack = autobuyscreen$purchasehistory.getItemStack();
            if (ItemStack == null || ItemStack.isEmpty()) {
               for (UiItemBuy uiitembuy : this.libraryItems) {
                  if (uiitembuy.getItemBuy().getItemBuy().HudElement().equalsIgnoreCase(autobuyscreen$purchasehistory.getItemName())) {
                     ItemStack = uiitembuy.getItemBuy().getItemBuy().getItemStack();
                     break;
                  }
               }
            }

            if (ItemStack == null || ItemStack.isEmpty()) {
               ItemStack = this.getItemStackByName(autobuyscreen$purchasehistory.getItemName());
            }

            if (ItemStack != null && !ItemStack.isEmpty()) {
               iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
               iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f + (f3 - 12.8F) / 2.0F, f17 + (f3 - 12.8F) / 2.0F, 0.0F);
               iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.8F, 0.8F, 1.0F);
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(ItemStack, 0, 0);
               iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
            } else {
               String s3 = autobuyscreen$purchasehistory.getItemName().toLowerCase();
               ByteBufferHolder il1iliilli1l1iill = llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1();
               if (s3.contains("порох")) {
                  il1iliilli1l1iill = llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III();
               } else if (s3.contains("незерит")) {
                  il1iliilli1l1iill = llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1();
               } else if (s3.contains("фрагмент")) {
                  il1iliilli1l1iill = llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl();
               } else if (s3.contains("взрывчат")) {
                  il1iliilli1l1iill = llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1();
               } else if (s3.contains("динамит")) {
                  il1iliilli1l1iill = llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1();
               }

               iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                  f + 2.0F, f17 + 2.0F, f3 - 4.0F, f3 - 4.0F, floatHolder_5.StringHolder_30(2.0F), il1iliilli1l1iill
               );
            }

            float f29 = 165.0F;
            float f30 = 24.0F;
            float f18 = f + f3 + 4.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f18, f17, f29, f30, floatHolder_5.StringHolder_30(6.0F), llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1()
            );
            floatHolder_8.EventTarget(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               f18,
               f17,
               f29,
               f30,
               -0.1F,
               floatHolder_5.StringHolder_30(6.0F),
               llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
            );
            String s = autobuyscreen$purchasehistory.getItemName();
            String s1 = "x" + autobuyscreen$purchasehistory.getAmount();
            float f19 = f18 + 8.0F;
            float f20 = f17 + (f30 - font.height()) / 2.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f19, f20, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl());
            float f21 = f18 + f29 - 8.0F - font.width(s1);
            float f22 = f17 + (f30 - font.height()) / 2.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s1, f21, f22, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl());
            float f23 = 64.0F;
            float f24 = 24.0F;
            float f25 = f18 + f29 + 4.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f25, f17, f23, f24, floatHolder_5.StringHolder_30(6.0F), llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
            String s2 = this.formatPrice(autobuyscreen$purchasehistory.getPrice()) + "$";
            float f26 = f25 + f23 / 2.0F - font.width(s2) / 2.0F;
            float f27 = f17 + (f24 - font.height()) / 2.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s2, f26, f27, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl());
            i++;
         } else {
            i++;
         }
      }

      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
   }

   private void renderInventory(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      SetColorHandler_3 llliili1l1ii11i1lii1 = ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1();
      int i = 0;
      int j = 0;

      for (int k = 0; k < 72; k++) {
         float f3 = f + (float)i * (f2 + 4.0F);
         float f4 = f1 + (float)j * (f2 + 4.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f3, f4, f2, f2, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.I1llIl11Il());

         for (UiItemBuy uiitembuy : this.inventoryItems) {
            if (uiitembuy.getItemBuy().getSlotId() == k) {
               uiitembuy.setBounds(f3, f4, f2, f2);
               uiitembuy.renderSlotBar(iiii1ilili1l1l1lilli1liliii, f3, f4, f2, floatHolder_5.StringHolder_30(4.0F));
            }
         }

         if (++i >= 18) {
            i = 0;
            j++;
         }
      }
   }

   private void initializeSelectedItem() {
      for (UiItemBuy uiitembuy : this.inventoryItems) {
         uiitembuy.getItemBuy().setSelected(true);
      }

      if (!this.inventoryItems.isEmpty()) {
         this.currentUiItemBuy = this.inventoryItems.get(0);
      } else {
         this.currentUiItemBuy = null;
      }
   }

   private void removeItemFromInventory(UiItemBuy uiitembuy) {
      AutoInventoryItem autoinventoryitem = uiitembuy.getItemBuy();
      String s = this.getItemKey(autoinventoryitem.getItemBuy());
      this.settingsCache.put(s, new AutoBuyScreen$CachedItemSettings(autoinventoryitem.getMaxSumBuy(), autoinventoryitem.getCountBuy()));
      this.targetItems.remove(uiitembuy.getItemBuy());
      this.inventoryItems.remove(uiitembuy);
      if (this.currentUiItemBuy == uiitembuy) {
         if (!this.inventoryItems.isEmpty()) {
            this.setSelectedItem(this.inventoryItems.get(0));
         } else {
            this.setSelectedItem(null);
         }
      }
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      this.searchBox.onMouseClicked(d0, d1, ill1iili11ii1l);
      float f = 24.0F;
      float f1 = 556.0F;
      float f2 = 264.0F;
      float f3 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() - f1) / 2.0F;
      float f4 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() - f2) / 2.0F;
      float f5 = 24.0F;
      float f6 = f4 + 8.0F + f5 + 8.0F;
      float f7 = 22.0F;
      float f8 = f6 + f7 + 8.0F;
      float f9 = f + 4.0F + 96.0F;
      float f10 = f3 + 8.0F + f9 + 4.0F;
      float f11 = f4 + f2 - f8 - 8.0F;
      if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl
         && d0 > (double)f10
         && d0 < (double)(f10 + 2.0F)
         && d1 > (double)f8
         && d1 < (double)(f8 + f11)) {
         float f17 = this.scrollHandler.l1IIlIIlI11lII1() == 0.0
            ? 0.0F
            : (float)(this.scrollHandler.IIIlII1Il1l111lI1() / this.scrollHandler.l1IIlIIlI11lII1());
         float f18 = Math.max(f11 * (f11 / (float)((double)f11 + this.scrollHandler.l1IIlIIlI11lII1())), 20.0F);
         float f19 = Math.max(1.0F, f11 - f18);
         float f20 = f8 + f19 * f17;
         float f13 = (float)d1;
         if (f13 >= f20 && f13 <= f20 + f18) {
            this.draggingScrollbar = true;
            this.scrollClickOffset = (float)(d1 - (double)f8);
         } else {
            float f14 = f13 - f8;
            f14 = Math.max(0.0F, Math.min(f14, f19));
            float f15 = f14 / f19;
            this.scrollHandler.ZenithInternal061(-((double)f15 * this.scrollHandler.l1IIlIIlI11lII1()));
            this.draggingScrollbar = true;
            float f16 = f8 + f14;
            this.scrollClickOffset = (float)(d1 - (double)f16);
         }
      } else {
         float f12 = f4 + f2 - 8.0F;
         if (d1 > (double)f8 && d1 < (double)f12 && d0 > (double)(f3 + 8.0F) && d0 < (double)(f3 + 8.0F + f9)) {
            for (UiItemBuy uiitembuy : this.libraryItems
               .stream()
               .filter(uiitembuy4 -> uiitembuy4.getItemBuy().getItemBuy().HudElement().toLowerCase().contains(this.searchBox.II1I11IIl().toLowerCase()))
               .toList()) {
               if (uiitembuy.getBounds() != null && uiitembuy.getBounds().byteHolder(d0, d1)) {
                  if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
                     UiItemBuy uiitembuy3 = this.findInventoryByLib(uiitembuy);
                     if (uiitembuy3 != null) {
                        this.removeItemFromInventory(uiitembuy3);
                     } else {
                        this.addItemToInventory(uiitembuy);
                     }

                     return;
                  }

                  if (ill1iili11ii1l == ZenithInternal068.lII1lI1lII1l) {
                     UiItemBuy uiitembuy1 = this.findInventoryByLib(uiitembuy);
                     if (uiitembuy1 != null) {
                        this.setSelectedItem(uiitembuy1);
                     } else {
                        this.setSelectedItem(uiitembuy);
                     }

                     return;
                  }
               }
            }
         }

         for (UiItemBuy uiitembuy2 : this.inventoryItems) {
            if (uiitembuy2.getBounds() != null && uiitembuy2.getBounds().byteHolder(d0, d1) && ill1iili11ii1l == ZenithInternal068.lII1lI1lII1l) {
               this.setSelectedItem(uiitembuy2);
               return;
            }
         }

         if (this.currentUiItemBuy != null) {
            this.currentUiItemBuy.onMouseClicked(d0, d1, ill1iili11ii1l, true);
            if (this.currentUiItemBuy.getItemBuy() instanceof ExtendAutoInventoryItem extendautoinventoryitem) {
               for (MenuSetting menusetting : extendautoinventoryitem.getEnchants()) {
                  menusetting.onMouseClicked(d0, d1, ill1iili11ii1l);
               }
            }
         }
      }
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         this.draggingScrollbar = false;
      }

      if (this.currentUiItemBuy != null) {
         this.currentUiItemBuy.onMouseReleased(d0, d1, ill1iili11ii1l);
         if (this.currentUiItemBuy.getItemBuy() instanceof ExtendAutoInventoryItem extendautoinventoryitem) {
            for (MenuSetting menusetting : extendautoinventoryitem.getEnchants()) {
               menusetting.onMouseReleased(d0, d1, ill1iili11ii1l);
            }
         }
      }

      try {
         for (UiItemBuy uiitembuy : this.inventoryItems) {
            AutoInventoryItem autoinventoryitem1 = uiitembuy.getItemBuy();
            String s = this.getItemKey(autoinventoryitem1.getItemBuy());
            this.settingsCache.put(s, new AutoBuyScreen$CachedItemSettings(autoinventoryitem1.getMaxSumBuy(), autoinventoryitem1.getCountBuy()));
         }

         if (this.currentUiItemBuy != null && !this.inventoryItems.contains(this.currentUiItemBuy)) {
            AutoInventoryItem autoinventoryitem = this.currentUiItemBuy.getItemBuy();
            String s1 = this.getItemKey(autoinventoryitem.getItemBuy());
            this.settingsCache.put(s1, new AutoBuyScreen$CachedItemSettings(autoinventoryitem.getMaxSumBuy(), autoinventoryitem.getCountBuy()));
         }

         this.targetItems.clear();

         for (UiItemBuy uiitembuy1 : this.inventoryItems) {
            this.targetItems.add(uiitembuy1.getItemBuy());
         }
      } catch (Exception exception) {
      }
   }

   public boolean charTyped(char c0, int i) {
      this.searchBox.charTyped(c0, i);
      if (this.currentUiItemBuy != null) {
         this.currentUiItemBuy.charTyped(c0, i);

         try {
            for (UiItemBuy uiitembuy : this.inventoryItems) {
               AutoInventoryItem autoinventoryitem = uiitembuy.getItemBuy();
               String s = this.getItemKey(autoinventoryitem.getItemBuy());
               this.settingsCache.put(s, new AutoBuyScreen$CachedItemSettings(autoinventoryitem.getMaxSumBuy(), autoinventoryitem.getCountBuy()));
            }

            if (this.currentUiItemBuy != null && !this.inventoryItems.contains(this.currentUiItemBuy)) {
               AutoInventoryItem autoinventoryitem1 = this.currentUiItemBuy.getItemBuy();
               String s1 = this.getItemKey(autoinventoryitem1.getItemBuy());
               this.settingsCache.put(s1, new AutoBuyScreen$CachedItemSettings(autoinventoryitem1.getMaxSumBuy(), autoinventoryitem1.getCountBuy()));
            }

            this.targetItems.clear();

            for (UiItemBuy uiitembuy1 : this.inventoryItems) {
               this.targetItems.add(uiitembuy1.getItemBuy());
            }
         } catch (Exception exception) {
         }
      }

      return super.charTyped(c0, i);
   }

   public boolean mouseScrolled(double d0, double d1, double d3, double d2) {
      if (this.currentUiItemBuy != null && this.currentUiItemBuy.onScroll(d0, d1, d2)) {
         return true;
      } else {
         float f = 24.0F;
         float f1 = 8.0F + (f + 4.0F) * 1.0F + 8.0F - 4.0F;
         float f2 = 18.0F * (f + 4.0F) + 8.0F;
         float f3 = 556.0F;
         float f4 = 264.0F;
         float f5 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() - f3) / 2.0F;
         float f6 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() - f4) / 2.0F;
         float f7 = f5 + f3 / 2.0F;
         if (d0 > (double)(f7 + 8.0F)) {
            this.historyScrollHandler.ZenithInternal101(d2 * 13.5);
            return true;
         } else {
            if (d0 < (double)(f7 - 8.0F)) {
               float f8 = f + 4.0F + 96.0F;
               float f9 = 2.0F;
               float f10 = 129.0F;
               float f11 = f5 + 8.0F + f8 + 4.0F + f9 + 8.0F;
               float f12 = f5 + 8.0F;
               float f13 = f5 + 8.0F + f8;
               float f14 = f5 + 8.0F + f8 + 4.0F;
               float f15 = f14 + f9;
               float f16 = f6 + 8.0F + 15.0F - 15.0F + 24.0F;
               float f17 = f16 + 8.0F;
               float f18 = 22.0F;
               float f19 = f17 + f18 + 8.0F;
               float f20 = f6 + f4 - 8.0F;
               boolean flag = d0 >= (double)f12 && d0 <= (double)f13 && d1 >= (double)f19 && d1 <= (double)f20;
               boolean flag1 = d0 >= (double)f14 && d0 <= (double)f15 && d1 >= (double)f19 && d1 <= (double)f20;
               if (flag || flag1) {
                  this.scrollHandler.ZenithInternal101(d2 * 13.5);
                  return true;
               }

               if (d0 >= (double)f11 && d0 <= (double)(f11 + f10)) {
                  return true;
               }
            }

            return true;
         }
      }
   }

   @Override
   public void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3) {
      if (this.draggingScrollbar && ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         float f = 24.0F;
         float f1 = 556.0F;
         float f2 = 264.0F;
         float f3 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() - f1) / 2.0F;
         float f4 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() - f2) / 2.0F;
         float f5 = 24.0F;
         float f6 = f4 + 8.0F + f5 + 8.0F;
         float f7 = 22.0F;
         float f8 = f6 + f7 + 8.0F;
         float f9 = (float)d1 - f8 - this.scrollClickOffset;
         float f10 = f4 + f2 - f8 - 8.0F;
         float f11 = Math.max(f10 * (f10 / (float)((double)f10 + this.scrollHandler.l1IIlIIlI11lII1())), 20.0F);
         float f12 = Math.max(1.0F, f10 - f11);
         f9 = Math.max(0.0F, Math.min(f9, f12));
         float f13 = f9 / f12;
         this.scrollHandler.ZenithInternal061(-((double)f13 * this.scrollHandler.l1IIlIIlI11lII1()));
      }

      if (this.currentUiItemBuy != null) {
      }

      super.onMouseDragged(d0, d1, ill1iili11ii1l, d2, d3);
   }

   public boolean keyPressed(int i, int j, int k) {
      this.searchBox.keyPressed(i, j, k);
      if (this.currentUiItemBuy != null) {
         this.currentUiItemBuy.keyPressed(i, j, k);

         try {
            for (UiItemBuy uiitembuy : this.inventoryItems) {
               AutoInventoryItem autoinventoryitem = uiitembuy.getItemBuy();
               String s = this.getItemKey(autoinventoryitem.getItemBuy());
               this.settingsCache.put(s, new AutoBuyScreen$CachedItemSettings(autoinventoryitem.getMaxSumBuy(), autoinventoryitem.getCountBuy()));
            }

            if (this.currentUiItemBuy != null && !this.inventoryItems.contains(this.currentUiItemBuy)) {
               AutoInventoryItem autoinventoryitem1 = this.currentUiItemBuy.getItemBuy();
               String s1 = this.getItemKey(autoinventoryitem1.getItemBuy());
               this.settingsCache.put(s1, new AutoBuyScreen$CachedItemSettings(autoinventoryitem1.getMaxSumBuy(), autoinventoryitem1.getCountBuy()));
            }

            this.targetItems.clear();

            for (UiItemBuy uiitembuy1 : this.inventoryItems) {
               this.targetItems.add(uiitembuy1.getItemBuy());
            }
         } catch (Exception exception) {
         }
      }

      return super.keyPressed(i, j, k);
   }

   public void renderBackground(DrawContext DrawContext, int i, int j, float f) {
   }

   public void removed() {
      try {
         this.targetItems.clear();

         for (UiItemBuy uiitembuy : this.inventoryItems) {
            this.targetItems.add(uiitembuy.getItemBuy());
         }
      } catch (Exception exception) {
      }

      super.removed();
   }

   public void setPurchaseHistory(List<?> list) {
      ArrayList arraylist = new ArrayList();

      for (Object object : list) {
         if (object instanceof AutoBuyScreen$PurchaseHistory) {
            arraylist.add((AutoBuyScreen$PurchaseHistory)object);
         } else if (object instanceof Autobuy$II1Il11l111II11IIl) {
            Autobuy$II1Il11l111II11IIl l111liiiiill11li1l1li1lliii$ii1il11l111ii11iil = (Autobuy$II1Il11l111II11IIl)object;
            ItemStack ItemStack = null;

            try {
               ItemStack = l111liiiiill11li1l1li1lliii$ii1il11l111ii11iil.getItemStack();
            } catch (Exception exception) {
            }

            AutoBuyScreen$PurchaseHistory autobuyscreen$purchasehistory = new AutoBuyScreen$PurchaseHistory(
               l111liiiiill11li1l1li1lliii$ii1il11l111ii11iil.getItemName(),
               l111liiiiill11li1l1li1lliii$ii1il11l111ii11iil.getSeller(),
               l111liiiiill11li1l1li1lliii$ii1il11l111ii11iil.getAmount(),
               l111liiiiill11li1l1li1lliii$ii1il11l111ii11iil.getPrice(),
               l111liiiiill11li1l1li1lliii$ii1il11l111ii11iil.getTimestamp(),
               ItemStack != null && !ItemStack.isEmpty() ? ItemStack.copy() : null
            );
            arraylist.add(autobuyscreen$purchasehistory);
         }
      }

      for (int i = arraylist.size() - 1; i >= 0; i--) {
         AutoBuyScreen$PurchaseHistory autobuyscreen$purchasehistory1 = (AutoBuyScreen$PurchaseHistory)arraylist.get(i);
         boolean flag = false;

         for (AutoBuyScreen$PurchaseHistory autobuyscreen$purchasehistory2 : this.purchaseHistory) {
            if (autobuyscreen$purchasehistory2.getItemName().equals(autobuyscreen$purchasehistory1.getItemName())
               && autobuyscreen$purchasehistory2.getSeller().equals(autobuyscreen$purchasehistory1.getSeller())
               && autobuyscreen$purchasehistory2.getAmount() == autobuyscreen$purchasehistory1.getAmount()
               && autobuyscreen$purchasehistory2.getPrice() == autobuyscreen$purchasehistory1.getPrice()
               && autobuyscreen$purchasehistory2.getTimestamp() == autobuyscreen$purchasehistory1.getTimestamp()) {
               flag = true;
               break;
            }
         }

         if (!flag) {
            this.purchaseHistory.add(0, autobuyscreen$purchasehistory1);
         }
      }

      while (this.purchaseHistory.size() > 50) {
         this.purchaseHistory.remove(this.purchaseHistory.size() - 1);
      }

      this.saveHistory();
   }

   public void addPurchase(String s, String s1, int i, int j) {
      this.purchaseHistory.add(0, new AutoBuyScreen$PurchaseHistory(s, s1, i, j));
      if (this.purchaseHistory.size() > 50) {
         this.purchaseHistory.remove(this.purchaseHistory.size() - 1);
      }

      this.saveHistory();
   }

   private ItemStack getItemStackByName(String s) {
      if (s == null) {
         return null;
      } else {
         String s1 = s.toLowerCase();
         if (s1.contains("шлем") || s1.contains("helmet")) {
            return new ItemStack(Items.NETHERITE_HELMET);
         } else if (s1.contains("нагрудник") || s1.contains("chestplate")) {
            return new ItemStack(Items.NETHERITE_CHESTPLATE);
         } else if (s1.contains("штан") || s1.contains("поножи") || s1.contains("leggings")) {
            return new ItemStack(Items.NETHERITE_LEGGINGS);
         } else if (s1.contains("ботинк") || s1.contains("boots")) {
            return new ItemStack(Items.NETHERITE_BOOTS);
         } else if (s1.contains("меч") || s1.contains("sword")) {
            return new ItemStack(Items.NETHERITE_SWORD);
         } else {
            return !s1.contains("кирк") && !s1.contains("pickaxe") ? null : new ItemStack(Items.NETHERITE_PICKAXE);
         }
      }
   }

   private void loadHistory() {
      try {
         if (Files.exists(HISTORY_FILE)) {
            String s = Files.readString(HISTORY_FILE, StandardCharsets.UTF_8);
            Type type = new AutoBuyScreen$1(this).getType();
            List list = (List)GSON.fromJson(s, type);
            if (list != null) {
               this.purchaseHistory.clear();
               this.purchaseHistory.addAll(list);
            }
         }
      } catch (Exception exception) {
      }
   }

   private void saveHistory() {
      try {
         Files.createDirectories(HISTORY_FILE.getParent());
         String s = GSON.toJson(this.purchaseHistory);
         Files.writeString(HISTORY_FILE, s, StandardCharsets.UTF_8);
      } catch (Exception exception) {
         System.err.println("Ошибка сохранения истории покупок: " + exception.getMessage());
         exception.printStackTrace();
      }
   }

   private String translateToRussian(String s) {
      return s;
   }

   private static String cleanName(String s) {
      return s == null ? "" : s.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").trim();
   }

   private String formatPrice(int i) {
      String s = String.valueOf(i);
      StringBuilder stringbuilder = new StringBuilder();
      int j = s.length();

      for (int k = 0; k < j; k++) {
         if (k > 0 && (j - k) % 3 == 0) {
            stringbuilder.append('.');
         }

         stringbuilder.append(s.charAt(k));
      }

      return stringbuilder.toString();
   }

   private String getItemKey(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      return li1ll11ilil1ii1lilll1i.HudElement() + li1ll11ilil1ii1lilll1i.getDisplayName() + li1ll11ilil1ii1lilll1i.Category().name();
   }
}
