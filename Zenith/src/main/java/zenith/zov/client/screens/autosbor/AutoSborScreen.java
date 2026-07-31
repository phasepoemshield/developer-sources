package zenith.zov.client.screens.autosbor;

import zenith.hud.*;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.registry.Registries;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.TextHolder;
import zenith.StringHolder$Helper_3;
import zenith.IReturn;
import zenith.ScreenImpl;
import zenith.ZenithInternal068;
import zenith.GetStartTimeHandler;
import zenith.GetDisplayNameHandler_2;
import zenith.GetMaxSumBuyHandler;
import zenith.GetServerHandler;
import zenith.zov.client.screens.autosbor.panels.ItemListPanel;
import zenith.zov.client.screens.autosbor.panels.body.SborHeader;
import zenith.zov.client.screens.autosbor.panels.body.main.SborInventory;
import zenith.zov.client.screens.autosbor.panels.body.main.SborKits;
import zenith.zov.client.screens.autosbor.panels.body.main.SborPurchaseHistoryPanel;

public class AutoSborScreen extends ScreenImpl {
   private static final float leftPanelWidth = 136.0F;
   private static final float rightPanelWidth = 344.0F;
   private static final float panelWidth = 480.0F;
   private static final float panelHeight = 320.0F;
   private static final floatHolder_5 panelRadius = floatHolder_5.StringHolder_30(10.0F);
   private static final floatHolder_5 leftPanelRadius = floatHolder_5.FinishThread(10.0F, 10.0F);
   private static final floatHolder_5 rightPanelRadius = floatHolder_5.ZenithInternal064(10.0F, 10.0F);
   private static final long screenAnimationDuration = 180L;
   private static final float screenAnimationEpsilon = 0.001F;
   private static final int inventorySlotCount = 36;
   private static final float defaultMinDurability = 0.8F;
   private final ItemListPanel itemListPanel;
   private final SborHeader sborHeader = new SborHeader();
   private final SborKits sborKits;
   private final SborPurchaseHistoryPanel sborPurchaseHistoryPanel = new SborPurchaseHistoryPanel();
   private final SborInventory sborInventory;
   private final GetStartTimeHandler screenAnimation = new GetStartTimeHandler(180L, 0.0F, IReturn.doubleHolder_4);
   private final long[] slotPrices = new long[36];
   private final int[] slotCounts;
   private final float[] slotMinDurabilities;
   private GetDisplayNameHandler_2 draggedItem;
   private int draggedSlotIndex = -1;
   private int selectedPriceSlotIndex = -1;
   private float dragOffsetX;
   private float dragOffsetY;
   private long draggedItemPrice = 0L;
   private int draggedItemCount = 1;
   private float draggedItemMinDurability = 0.8F;
   private final Supplier<String> serverSupplier;
   private boolean closing = false;

   public AutoSborScreen(GetDisplayNameHandler_2[] ali1ll11ilil1ii1lilll1i, int[] aint, float[] afloat, Supplier<String> supplier) {
      this.slotCounts = aint;
      this.slotMinDurabilities = afloat;
      this.serverSupplier = supplier;
      this.itemListPanel = new ItemListPanel(supplier);
      this.sborKits = new SborKits(supplier);
      this.sborInventory = new SborInventory(ali1ll11ilil1ii1lilll1i);
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      float f2 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() - 480.0F) / 2.0F;
      float f3 = ((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() - 320.0F) / 2.0F;
      float f4 = this.screenAnimation.StringHolder_8(this.closing ? 0.0F : 1.0F);
      if (this.closing && f4 <= 0.001F) {
         l11I1I1ll1Illll1I1l1111l1II.setScreen(null);
      } else {
         float f5 = f2 + 240.0F;
         float f6 = f3 + 160.0F;
         float f7 = 0.94F + 0.06F * f4;
         iiii1ilili1l1l1lilli1liliii.getMatrices().push();
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f5, f6, 0.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f7, f7, 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-f5, -f6, 0.0F);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         boolean flag = this.isItemSettingsVisible();
         this.renderPanels(iiii1ilili1l1l1lilli1liliii, f2, f3, f4);
         this.itemListPanel.render(iiii1ilili1l1l1lilli1liliii, f2, f3, f4);
         this.sborHeader.render(iiii1ilili1l1l1lilli1liliii, f2, f3, f4);
         this.sborInventory
            .render(iiii1ilili1l1l1lilli1liliii, f2, f3, f, f1, this.slotCounts, this.selectedPriceSlotIndex, this.isDurabilitySettingsVisible(), f4);
         this.sborPurchaseHistoryPanel.render(iiii1ilili1l1l1lilli1liliii, f2, f3, flag, f4);
         this.sborKits.render(iiii1ilili1l1l1lilli1liliii, f2, f3, flag, f4);
         this.renderDraggedItem(iiii1ilili1l1l1lilli1liliii, f, f1, f4);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
      }
   }

   private void renderPanels(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      AutoSborStyle.drawBlur(iiii1ilili1l1l1lilli1liliii, f, f1, 480.0F, 320.0F, panelRadius, f2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f, f1, 136.0F, 320.0F, leftPanelRadius, AutoSborStyle.leftBackground().ZenithInternal039(f2));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f + 136.0F, f1, 344.0F, 320.0F, rightPanelRadius, AutoSborStyle.rightBackground().ZenithInternal039(f2));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f, f1, 480.0F, 320.0F, panelRadius, AutoSborStyle.headerSurface().EventImpl_36(20).ZenithInternal039(f2)
      );
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (!this.closing && this.screenAnimation.ArrayListHolder()) {
         if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
            GetServerHandler lll111iiili1il1l1ill1il1lx = this.sborKits.getDeleteKitAt(d0, d1);
            if (lll111iiili1il1l1ill1il1lx != null) {
               this.deleteKit(lll111iiili1il1l1ill1il1lx);
               return;
            }

            GetServerHandler lll111iiili1il1l1ill1il1lx = this.sborKits.getKitAt(d0, d1);
            if (lll111iiili1il1l1ill1il1lx != null) {
               this.loadKit(lll111iiili1il1l1ill1il1lx);
               return;
            }

            GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1ix = this.itemListPanel.getItemAt(d0, d1);
            if (li1ll11ilil1ii1lilll1ix != null) {
               this.startDragging(li1ll11ilil1ii1lilll1ix, -1, true);
               return;
            }

            int i = this.sborInventory.getSlotIndex(d0, d1);
            if (i >= 0) {
               li1ll11ilil1ii1lilll1ix = this.sborInventory.getItem(i);
               if (li1ll11ilil1ii1lilll1ix != null) {
                  this.sborInventory.clearSlot(i);
                  this.startDragging(li1ll11ilil1ii1lilll1ix, i, false);
                  return;
               }

               this.clearSelectedItem();
               return;
            }

            if (this.sborInventory.isCreateHovered(d0, d1)) {
               this.saveKit();
               return;
            }
         }

         if (ill1iili11ii1l == ZenithInternal068.lII1lI1lII1l) {
            int j = this.sborInventory.getSlotIndex(d0, d1);
            if (j >= 0) {
               GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1ix = this.sborInventory.getItem(j);
               if (li1ll11ilil1ii1lilll1ix != null) {
                  this.syncCurrentItemSettings();
                  this.selectItem(j, li1ll11ilil1ii1lilll1ix);
               } else {
                  this.clearSelectedItem();
               }

               return;
            }
         }

         if (!this.sborInventory.onMouseClicked(d0, d1, ill1iili11ii1l)) {
            if (!this.itemListPanel.onMouseClicked(d0, d1, ill1iili11ii1l)) {
               if (!this.sborHeader.onMouseClicked(d0, d1, ill1iili11ii1l)) {
                  super.onMouseClicked(d0, d1, ill1iili11ii1l);
               }
            }
         }
      }
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (!this.closing) {
         this.itemListPanel.onMouseReleased(ill1iili11ii1l);
         this.sborInventory.onMouseReleased(d0, d1, ill1iili11ii1l);
         if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl && this.draggedItem != null) {
            int i = this.sborInventory.getSlotIndex(d0, d1);
            if (i >= 0) {
               this.sborInventory.setItem(i, this.draggedItem);
               this.slotPrices[i] = this.draggedItemPrice;
               this.slotCounts[i] = this.draggedItemCount;
               this.slotMinDurabilities[i] = this.isDurabilityItem(this.draggedItem) ? this.draggedItemMinDurability : 0.0F;
               this.selectItem(i, this.draggedItem);
               this.stopDragging();
            } else {
               if (this.draggedSlotIndex >= 0 && !this.itemListPanel.isListHovered(d0, d1)) {
                  this.sborInventory.setItem(this.draggedSlotIndex, this.draggedItem);
                  this.slotPrices[this.draggedSlotIndex] = this.draggedItemPrice;
                  this.slotCounts[this.draggedSlotIndex] = this.draggedItemCount;
                  this.slotMinDurabilities[this.draggedSlotIndex] = this.isDurabilityItem(this.draggedItem) ? this.draggedItemMinDurability : 0.0F;
                  this.selectItem(this.draggedSlotIndex, this.draggedItem);
               }

               this.stopDragging();
            }
         } else {
            super.onMouseReleased(d0, d1, ill1iili11ii1l);
         }
      }
   }

   @Override
   public void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3) {
      if (!this.closing) {
         this.itemListPanel.onMouseDragged(d1, ill1iili11ii1l);
         super.onMouseDragged(d0, d1, ill1iili11ii1l, d2, d3);
      }
   }

   public boolean keyPressed(int i, int j, int k) {
      if (this.closing || !this.screenAnimation.ArrayListHolder()) {
         return false;
      } else if (this.sborInventory.keyPressed(i, j, k)) {
         return true;
      } else if (this.itemListPanel.keyPressed(i, j, k)) {
         return true;
      } else if (this.sborHeader.keyPressed(i, j, k)) {
         this.syncCurrentItemSettings();
         return true;
      } else {
         return super.keyPressed(i, j, k);
      }
   }

   public boolean charTyped(char c0, int i) {
      if (this.closing || !this.screenAnimation.ArrayListHolder()) {
         return false;
      } else if (this.sborInventory.charTyped(c0, i)) {
         return true;
      } else if (this.itemListPanel.charTyped(c0, i)) {
         return true;
      } else if (this.sborHeader.charTyped(c0, i)) {
         this.syncCurrentItemSettings();
         return true;
      } else {
         return super.charTyped(c0, i);
      }
   }

   public void renderBackground(DrawContext DrawContext, int i, int j, float f) {
   }

   public boolean shouldPause() {
      return false;
   }

   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      if (this.closing || !this.screenAnimation.ArrayListHolder()) {
         return false;
      } else if (this.sborPurchaseHistoryPanel.mouseScrolled(d0, d1, d3)) {
         return true;
      } else if (this.sborKits.mouseScrolled(d0, d1, d3)) {
         return true;
      } else {
         return this.itemListPanel.mouseScrolled(d0, d1, d3) ? true : super.mouseScrolled(d0, d1, d2, d3);
      }
   }

   public void close() {
      if (!this.closing) {
         this.syncCurrentItemSettings();
         this.closing = true;
         this.stopDragging();
      }
   }

   private void renderDraggedItem(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      if (this.draggedItem != null) {
         this.itemListPanel.renderDraggedItem(iiii1ilili1l1l1lilli1liliii, this.draggedItem, f - this.dragOffsetX, f1 - this.dragOffsetY, f2);
      }
   }

   private void startDragging(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, int i, boolean flag) {
      this.syncCurrentItemSettings();
      this.draggedItem = li1ll11ilil1ii1lilll1i;
      this.draggedSlotIndex = i;
      this.draggedItemPrice = i >= 0 ? this.slotPrices[i] : 0L;
      this.draggedItemCount = i >= 0 ? this.getSlotCount(i, li1ll11ilil1ii1lilll1i) : this.getDefaultCount(li1ll11ilil1ii1lilll1i);
      this.draggedItemMinDurability = i >= 0 ? this.getSlotMinDurability(i) : 0.8F;
      if (i >= 0) {
         this.slotPrices[i] = 0L;
         this.slotCounts[i] = 0;
         this.slotMinDurabilities[i] = 0.0F;
      }

      this.selectedPriceSlotIndex = -1;
      this.hideSelectedItem();
      if (flag) {
         this.itemListPanel.setDraggedItem(li1ll11ilil1ii1lilll1i);
      }

      this.dragOffsetX = this.itemListPanel.getItemPanelSize() / 2.0F;
      this.dragOffsetY = this.itemListPanel.getItemPanelSize() / 2.0F;
   }

   private void stopDragging() {
      this.draggedItem = null;
      this.draggedSlotIndex = -1;
      this.itemListPanel.setDraggedItem(null);
   }

   private void syncCurrentItemSettings() {
      long i = this.sborHeader.getPrice();
      int j = this.sborInventory.getCount();
      if (this.draggedItem != null) {
         this.draggedItemPrice = i;
         this.draggedItemCount = this.isStackable(this.draggedItem) ? j : this.getDefaultCount(this.draggedItem);
         this.draggedItemMinDurability = this.isDurabilityItem(this.draggedItem) ? this.sborInventory.getMinDurability() : 0.8F;
      } else {
         if (this.selectedPriceSlotIndex >= 0 && this.selectedPriceSlotIndex < this.slotPrices.length) {
            GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i = this.sborInventory.getItem(this.selectedPriceSlotIndex);
            this.slotPrices[this.selectedPriceSlotIndex] = i;
            this.slotCounts[this.selectedPriceSlotIndex] = this.isStackable(li1ll11ilil1ii1lilll1i) ? j : 0;
            this.slotMinDurabilities[this.selectedPriceSlotIndex] = this.isDurabilityItem(li1ll11ilil1ii1lilll1i)
               ? this.sborInventory.getMinDurability()
               : 0.0F;
         }
      }
   }

   private void clearSelectedItem() {
      this.syncCurrentItemSettings();
      this.selectedPriceSlotIndex = -1;
      this.hideSelectedItem();
   }

   private void selectItem(int i, GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      this.selectedPriceSlotIndex = i;
      this.sborHeader.setSelectedItem(li1ll11ilil1ii1lilll1i);
      this.sborHeader.setPrice(this.slotPrices[i]);
      this.sborInventory.setCountMax(this.getCountMax(li1ll11ilil1ii1lilll1i));
      this.sborInventory.setCount(this.getSlotCount(i, li1ll11ilil1ii1lilll1i));
      this.sborInventory.setCountVisible(this.isStackable(li1ll11ilil1ii1lilll1i));
      this.sborInventory.setMinDurability(this.getSlotMinDurability(i));
      this.sborInventory.setDurabilityVisible(this.isDurabilityItem(li1ll11ilil1ii1lilll1i));
   }

   private void hideSelectedItem() {
      this.sborHeader.setSelectedItem(null);
      this.sborHeader.setPrice(0L);
      this.sborInventory.setCountMax(64);
      this.sborInventory.setCountVisible(false);
      this.sborInventory.setMinDurability(0.8F);
      this.sborInventory.setDurabilityVisible(false);
   }

   private void saveKit() {
      this.syncCurrentItemSettings();
      String s = this.sborInventory.getInventoryName();
      if (s.isBlank()) {
         TextHolder.StringHolder_8(StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Введите имя кита");
      } else {
         String s1 = this.getServer();
         if (ZenithClient.getInstance().ModuleManager().CallableImpl(s, s1) != null) {
            TextHolder.StringHolder_8(
               StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Кит с именем '" + s + "' уже существует"
            );
         } else {
            ArrayList arraylist = new ArrayList();

            for (int i = 0; i < 36; i++) {
               GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i = this.sborInventory.getItem(i);
               if (li1ll11ilil1ii1lilll1i != null && !li1ll11ilil1ii1lilll1i.getItemStack().isEmpty()) {
                  GetMaxSumBuyHandler lill1l111l1l11ii11i1ii11ii1 = GetMaxSumBuyHandler.StringHolder_8(
                     li1ll11ilil1ii1lilll1i.getItemStack(),
                     li1ll11ilil1ii1lilll1i.HudElement(),
                     i,
                     this.slotPrices[i],
                     this.getSlotCount(i, li1ll11ilil1ii1lilll1i)
                  );
                  if (this.isDurabilityItem(li1ll11ilil1ii1lilll1i)) {
                     lill1l111l1l11ii11i1ii11ii1.doubleHolder_2(this.createDurabilitySettings(this.getSlotMinDurability(i)));
                  }

                  arraylist.add(lill1l111l1l11ii11i1ii11ii1);
               }
            }

            if (arraylist.isEmpty()) {
               TextHolder.StringHolder_8(StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Кит пуст");
            } else {
               GetServerHandler lll111iiili1il1l1ill1il1l = ZenithClient.getInstance()
                  .ModuleManager()
                  .StringHolder_8(s, arraylist, s1);
               if (lll111iiili1il1l1ill1il1l != null) {
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.IIlIllllI1lIlll11l, "Кит '" + s + "' сохранен"
                  );
               } else {
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Не удалось сохранить кит '" + s + "'"
                  );
               }
            }
         }
      }
   }

   private void deleteKit(GetServerHandler lll111iiili1il1l1ill1il1l) {
      if (lll111iiili1il1l1ill1il1l != null) {
         String s = lll111iiili1il1l1ill1il1l.getName();
         if (ZenithClient.getInstance().ModuleManager().EventBus(lll111iiili1il1l1ill1il1l)) {
            this.sborKits.removePreview(lll111iiili1il1l1ill1il1l);
            TextHolder.StringHolder_8(StringHolder$Helper_3.IIlIllllI1lIlll11l, "Кит '" + s + "' удален");
         } else {
            TextHolder.StringHolder_8(
               StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Не удалось удалить кит '" + s + "'"
            );
         }
      }
   }

   private void loadKit(GetServerHandler lll111iiili1il1l1ill1il1l) {
      this.stopDragging();
      this.selectedPriceSlotIndex = -1;
      this.hideSelectedItem();
      Arrays.fill(this.slotPrices, 0L);
      Arrays.fill(this.slotCounts, 0);
      Arrays.fill(this.slotMinDurabilities, 0.0F);

      for (int i = 0; i < 36; i++) {
         this.sborInventory.clearSlot(i);
      }

      for (GetMaxSumBuyHandler lill1l111l1l11ii11i1ii11ii1 : lll111iiili1il1l1ill1il1l.ZenithInternal066()) {
         int j = lill1l111l1l11ii11i1ii11ii1.getSlotId();
         if (j >= 0 && j < 36) {
            GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i = this.findItemBuy(lill1l111l1l11ii11i1ii11ii1);
            if (li1ll11ilil1ii1lilll1i != null && !li1ll11ilil1ii1lilll1i.getItemStack().isEmpty()) {
               this.sborInventory.setItem(j, li1ll11ilil1ii1lilll1i);
               this.slotPrices[j] = lill1l111l1l11ii11i1ii11ii1.getMaxSumBuy();
               this.slotCounts[j] = lill1l111l1l11ii11i1ii11ii1.getCountBuy();
               this.slotMinDurabilities[j] = this.isDurabilityItem(li1ll11ilil1ii1lilll1i) ? this.readMinDurability(lill1l111l1l11ii11i1ii11ii1) : 0.0F;
            }
         }
      }
   }

   private GetDisplayNameHandler_2 findItemBuy(GetMaxSumBuyHandler lill1l111l1l11ii11i1ii11ii1) {
      ArrayList arraylist = new ArrayList();
      if ("Funtime 1.21".equals(this.getServer())) {
         arraylist.addAll(ZenithClient.getInstance().ZenithInternal124().Potions());
      } else {
         arraylist.addAll(ZenithClient.getInstance().ZenithInternal124().TargetPotions());
      }

      arraylist.addAll(ZenithClient.getInstance().ZenithInternal124().AnimatedTab());

      for (GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i : arraylist) {
         if (li1ll11ilil1ii1lilll1i.HudElement().equals(lill1l111l1l11ii11i1ii11ii1.HudElement())) {
            if (lill1l111l1l11ii11i1ii11ii1.ListHolder_5() == null || lill1l111l1l11ii11i1ii11ii1.ListHolder_5().isBlank()) {
               return li1ll11ilil1ii1lilll1i;
            }

            if (Registries.ITEM
               .getId(li1ll11ilil1ii1lilll1i.getItemStack().getItem())
               .toString()
               .equals(lill1l111l1l11ii11i1ii11ii1.ListHolder_5())) {
               return li1ll11ilil1ii1lilll1i;
            }
         }
      }

      return null;
   }

   private String getServer() {
      return this.serverSupplier == null ? "HolyWorld" : this.serverSupplier.get();
   }

   private String createDurabilitySettings(float f) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("maxDamage", f);
      return jsonobject.toString();
   }

   private float readMinDurability(GetMaxSumBuyHandler lill1l111l1l11ii11i1ii11ii1) {
      if (lill1l111l1l11ii11i1ii11ii1.ZenithInternal088() != null && !lill1l111l1l11ii11i1ii11ii1.ZenithInternal088().isBlank()) {
         try {
            JsonObject jsonobject = JsonParser.parseString(lill1l111l1l11ii11i1ii11ii1.ZenithInternal088()).getAsJsonObject();
            if (jsonobject.has("maxDamage")) {
               return jsonobject.get("maxDamage").getAsFloat();
            }
         } catch (Exception exception) {
         }

         return 0.8F;
      } else {
         return 0.8F;
      }
   }

   private int getSlotCount(int i, GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      if (!this.isStackable(li1ll11ilil1ii1lilll1i)) {
         return this.getDefaultCount(li1ll11ilil1ii1lilll1i);
      } else {
         int j = i >= 0 && i < this.slotCounts.length ? this.slotCounts[i] : 0;
         return j > 0 ? j : this.getDefaultCount(li1ll11ilil1ii1lilll1i);
      }
   }

   private int getDefaultCount(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      return li1ll11ilil1ii1lilll1i != null && !li1ll11ilil1ii1lilll1i.getItemStack().isEmpty()
         ? Math.max(1, li1ll11ilil1ii1lilll1i.getItemStack().getCount())
         : 1;
   }

   private int getCountMax(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      if (li1ll11ilil1ii1lilll1i != null && !li1ll11ilil1ii1lilll1i.getItemStack().isEmpty()) {
         return li1ll11ilil1ii1lilll1i.getItemStack().getItem() == Items.ENDER_PEARL ? 16 : 64;
      } else {
         return 64;
      }
   }

   private float getSlotMinDurability(int i) {
      if (i >= 0 && i < this.slotMinDurabilities.length) {
         float f = this.slotMinDurabilities[i];
         return f > 0.0F ? f : 0.8F;
      } else {
         return 0.8F;
      }
   }

   private boolean isStackable(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      return li1ll11ilil1ii1lilll1i != null && !li1ll11ilil1ii1lilll1i.getItemStack().isEmpty()
         ? li1ll11ilil1ii1lilll1i.getItemStack().getMaxCount() > 1 || this.isPotion(li1ll11ilil1ii1lilll1i.getItemStack().getItem())
         : false;
   }

   private boolean isDurabilityItem(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      if (li1ll11ilil1ii1lilll1i == null || li1ll11ilil1ii1lilll1i.getItemStack().isEmpty()) {
         return false;
      } else {
         return "Шлем Солнца".equals(li1ll11ilil1ii1lilll1i.HudElement()) ? false : li1ll11ilil1ii1lilll1i.getItemStack().getMaxDamage() > 0;
      }
   }

   private boolean isPotion(Item Item) {
      return Item == Items.POTION || Item == Items.SPLASH_POTION || Item == Items.LINGERING_POTION;
   }

   private boolean isCountSettingsVisible() {
      return this.selectedPriceSlotIndex >= 0 && this.isStackable(this.sborInventory.getItem(this.selectedPriceSlotIndex));
   }

   private boolean isDurabilitySettingsVisible() {
      return this.selectedPriceSlotIndex >= 0 && this.isDurabilityItem(this.sborInventory.getItem(this.selectedPriceSlotIndex));
   }

   private boolean isItemSettingsVisible() {
      return this.isCountSettingsVisible() || this.isDurabilitySettingsVisible();
   }
}
