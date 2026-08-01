// Module: AutoBuy
// Category: pve
// Original class: Autobuy
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.pve;

import zenith.hud.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import zenith.zov.client.screens.autobuy.AutoBuyScreen;
import zenith.zov.client.screens.autobuy.items.AutoInventoryItem;

@ModuleInfo(
   name = "AutoBuy",
   category = Category.PLAYER,
   description = "Перекупство"
)
public final class Autobuy extends Module {
   public static final Autobuy lII1l1l1lIlIl1I1III11lI11 = new Autobuy();
   private final List<Autobuy$II1Il11l111II11IIl> purchaseHistory = new ArrayList<>();
   private final ArrayList<AutoInventoryItem> l1lI1Il1l11I1Il111l1llIIIl1I1 = new ArrayList<>();
   private int llll11l11l11IlIl1III = 0;
   private Map<ItemStack, Integer> II1IlII11I1 = new HashMap<>();
   private boolean IlI1I1l1llI1I = false;
   private ItemStack llI1ll1ll1IIl11Il1llI1 = null;
   private static final Map<String, String> lIll111l111I1l11 = new HashMap<>();
   private final longHolder lI1l1l1111l1I1I1II1IIlll = new longHolder();
   private final longHolder lIl1IIlI1111IlIIlIIl1l1 = new longHolder();
   private final longHolder IlIIl11I1lllI1I1lI = new longHolder();
   private final longHolder l1111lll1l1IlI111 = new longHolder();
   private final longHolder IlllI111lllIII1Il1IllIll1Ill = new longHolder();
   private final longHolder I1ll111Ill1II1IllIIl1I = new longHolder();
   private int l1lll1IIIIII1l = 1000;
   private int I1IllI1II1l11lI1IlIII1 = 1000;
   private int lIlIlIll1I1l1III11IllI111l1IlI = 300;
   private final longHolder l1I11l1I1l1 = new longHolder();
   private final longHolder III1Ill111I1lIllll1I = new longHolder();
   private boolean I11II111l11I1II11l = false;
   private int lI1lII1IlII11IIlllI1111lI1Illl = 60000;
   private int l1I1IllIIlIlII = 5000;
   private final longHolder l1lIIl11Il = new longHolder();
   private boolean I1l11Ill11lII1lIIlIII = false;
   private int l1Il11I = 0;
   private int l11lI11llI1lIl1I1IIlllIl1IlI1I = -1;
   private int IIIIllI11l = 0;
   private SlotActionType I11Ill1ll1ll11llI1I = SlotActionType.PICKUP;
   private boolean IIII11IllllIIIIIl = false;
   private int IllIlIIl1l = 47;
   private boolean I1l1l11ll1l = false;
   private final longHolder IIII1I1III1lll1 = new longHolder();
   private int lI11l1Il11l1l1lIllI1lII = 0;
   private int l111IIlII1II11Ill1ll1IlII = 420;
   private int ll1I1Il11I1Ill11lll1IllI1Il = 880;
   private int l1111l11lIlII = 650;
   private final longHolder III11ll11Illll11lII1l = new longHolder();
   private int llI1ll1IIll1lIIIl111I11l = 0;
   private int IIl11ll11IIIllI1I11111l1I = 0;
   private final longHolder Il1II1lI = new longHolder();
   private boolean I1Il11I1111I1I1ll111IIIlIll = false;
   private int lllI1IIII11IlII111I1l1lI1l = 0;
   private boolean lIIll11Il1ll1 = false;
   private boolean ll1lI1lI1II1l1l = false;
   private int IIl1lI1I11llI11ll = 0;
   private boolean IIlIll11lllIlIlII11l11IlI = false;
   private boolean l11llIIllI1Il1 = false;
   private final longHolder IllII1lll = new longHolder();
   private boolean lI1Illl1ll11 = false;
   private int I1IlIIl1llI1lII1l1II1III11 = 0;
   private int lIl11lIllI = -1;
   private boolean l1ll1IIlIll111II1II1lII1lIl1 = false;
   private int IIllIlI1llII1l11I11111II11 = -1;
   private final longHolder Il11lIl1lIlI11IlllIl = new longHolder();
   private int llIlllI1l1lIllI1Il1l = 155;
   private int ll1l1Il1II1II = 0;
   private long Il1Il1l1IlllIIl1 = 0L;
   private final long IlI1I11lll1II1lIIIIIIl = 100L;
   private boolean I111lIIlIII1II1lII = false;
   private final longHolder Ill1111IIlII1111llII1Il1 = new longHolder();
   private final longHolder lllIIl11lI11lIllI1IllI11l = new longHolder();
   private boolean lII1Il1lllIl1l = false;
   private boolean III1lll1Il1I1lll11Il1Il1 = false;
   private final ButtonSetting l1I11111IlI1I1 = new ButtonSetting("Открыть меню", "k", () -> {
      AutoBuyScreen autobuyscreen = new AutoBuyScreen(this.l1l11l1111l1ll1lIllll1(), this.l1lI1Il1l11I1Il111l1llIIIl1I1);
      autobuyscreen.setPurchaseHistory(this.purchaseHistory);
      l11I1I1ll1Illll1I1l1111l1II.setScreen(autobuyscreen);
   });

   private Autobuy() {
   }

   @Override
   public boolean llI1lll1lIllII11I1111Illl() {
      return true;
   }

   private void I1ll111l11l1I1() {
      this.l1111l11lIlII = ZenithInternal091.ConnectThread(this.l111IIlII1II11Ill1ll1IlII, this.ll1I1Il11I1Ill11lll1IllI1Il);
   }

   @Override
   public void onEnable() {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         this.StringHolder_11(false);
      } else {
         this.lI1l1l1111l1I1I1II1IIlll.reset();
         this.lIl1IIlI1111IlIIlIIl1l1.reset();
         this.IlIIl11I1lllI1I1lI.reset();
         this.l1111lll1l1IlI111.reset();
         this.IlllI111lllIII1Il1IllIll1Ill.reset();
         this.I1ll111Ill1II1IllIIl1I.reset();
         this.l1lll1IIIIII1l = ZenithInternal091.ConnectThread(1000, 1500);
         this.I1IllI1II1l11lI1IlIII1 = ZenithInternal091.ConnectThread(845, 940);
         this.lIlIlIll1I1l1III11IllI111l1IlI = ZenithInternal091.ConnectThread(95, 630);
         this.l1I11l1I1l1.reset();
         this.III1Ill111I1lIllll1I.reset();
         this.I11II111l11I1II11l = false;
         this.lI1lII1IlII11IIlllI1111lI1Illl = ZenithInternal091.ConnectThread(59800, 120200);
         this.l1I1IllIIlIlII = ZenithInternal091.ConnectThread(4980, 10020);
         this.I1l11Ill11lII1lIIlIII = false;
         this.l1Il11I = 0;
         this.l11lI11llI1lIl1I1IIlllIl1IlI1I = -1;
         this.IIIIllI11l = 0;
         this.I11Ill1ll1ll11llI1I = SlotActionType.PICKUP;
         this.IIII11IllllIIIIIl = false;
         this.IllIlIIl1l = 47;
         this.l111IIlII1II11Ill1ll1IlII = ZenithInternal091.ConnectThread(520, 545);
         this.ll1I1Il11I1Ill11lll1IllI1Il = ZenithInternal091.ConnectThread(1120, 1180);
         this.I1ll111l11l1I1();
         this.llI1ll1IIll1lIIIl111I11l = 0;
         this.III11ll11Illll11lII1l.reset();
         this.IIllIlI1llII1l11I11111II11 = -1;
         this.Il11lIl1lIlI11IlllIl.reset();
         this.IIl11ll11IIIllI1I11111l1I = 0;
         this.I1Il11I1111I1I1ll111IIIlIll = false;
         this.lIIll11Il1ll1 = false;
         this.ll1lI1lI1II1l1l = false;
         this.IIl1lI1I11llI11ll = 0;
         this.IIlIll11lllIlIlII11l11IlI = false;
         this.l11llIIllI1Il1 = false;
         this.lI1Illl1ll11 = false;
         this.lIl11lIllI = -1;
         this.l1ll1IIlIll111II1II1lII1lIl1 = false;
         this.llI1ll1ll1IIl11Il1llI1 = null;
         this.I1l1l11ll1l = false;
         this.IIII1I1III1lll1.reset();
         this.lI11l1Il11l1l1lIllI1lII = 0;
         this.Il1Il1l1IlllIIl1 = 0L;
         this.ll1l1Il1II1II = 0;
         this.llll11l11l11IlIl1III = 0;
         this.I111lIIlIII1II1lII = false;
         this.Ill1111IIlII1111llII1Il1.reset();
         this.lllIIl11lI11lIllI1IllI11l.reset();
         this.lII1Il1lllIl1l = false;
         this.III1lll1Il1I1lll11Il1Il1 = false;
         super.l11l1lII();
      }
   }

   private int EventImpl_24(int i, int j) {
      return ZenithInternal091.ConnectThread(50, 150);
   }

   private boolean lIIll1l1IlIlII1Il() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != null) {
         int i = -1;
         int j = -1;
         int k = 0;

         for (int l = 0; l <= 44; l++) {
            try {
               Slot Slot = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getSlot(l);
               ItemStack ItemStack = Slot.getStack();
               if (ItemStack != null && !ItemStack.isEmpty()) {
                  if (i == -1) {
                     i = l;
                  }

                  j = l;
                  k++;
               }
            } catch (Exception exception) {
            }
         }

         if (k < 2) {
            return false;
         } else {
            int i1 = 44 - j;
            return i1 < i && i >= 20;
         }
      } else {
         return false;
      }
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.lI1l1l1111l1I1I1II1IIlll.reset();
      this.lIl1IIlI1111IlIIlIIl1l1.reset();
      this.IlIIl11I1lllI1I1lI.reset();
      this.l1111lll1l1IlI111.reset();
      this.IlllI111lllIII1Il1IllIll1Ill.reset();
      this.I1ll111Ill1II1IllIIl1I.reset();
      this.l1lll1IIIIII1l = 1000;
      this.I1IllI1II1l11lI1IlIII1 = 1000;
      this.l1I11l1I1l1.reset();
      this.III1Ill111I1lIllll1I.reset();
      this.I11II111l11I1II11l = false;
      this.III1lll1Il1I1lll11Il1Il1 = false;
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @Override
   public JsonObject save() {
      JsonObject jsonobject = super.save();
      JsonObject jsonobject1 = new JsonObject();

      for (AutoInventoryItem autoinventoryitem : this.l1lI1Il1l11I1Il111l1llIIIl1I1) {
         jsonobject1.add(
            autoinventoryitem.getItemBuy().HudElement()
               + autoinventoryitem.getItemBuy().getDisplayName()
               + autoinventoryitem.getItemBuy().Category().name(),
            autoinventoryitem.save()
         );
      }

      jsonobject.add("AutoBuyItems", jsonobject1);
      return jsonobject;
   }

   @Override
   public void load(JsonObject jsonobject) {
      super.load(jsonobject);
      this.l1lI1Il1l11I1Il111l1llIIIl1I1.clear();
      if (jsonobject != null && jsonobject.has("AutoBuyItems") && jsonobject.get("AutoBuyItems").isJsonObject()) {
         JsonObject jsonobject1 = jsonobject.getAsJsonObject("AutoBuyItems");

         for (Entry entry : jsonobject1.entrySet()) {
            String s = (String)entry.getKey();
            JsonObject jsonobject2 = ((JsonElement)entry.getValue()).getAsJsonObject();
            GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i = this.ZenithInternal071(s);
            if (li1ll11ilil1ii1lilll1i != null) {
               AutoInventoryItem autoinventoryitem = AutoBuyScreen.createItem(li1ll11ilil1ii1lilll1i);
               autoinventoryitem.load(jsonobject2);
               this.l1lI1Il1l11I1Il111l1llIIIl1I1.add(autoinventoryitem);
            }
         }
      }
   }

   private GetDisplayNameHandler_2 ZenithInternal071(String s) {
      for (GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i : this.l1l11l1111l1ll1lIllll1()) {
         String s1 = li1ll11ilil1ii1lilll1i.HudElement()
            + li1ll11ilil1ii1lilll1i.getDisplayName()
            + li1ll11ilil1ii1lilll1i.Category().name();
         if (s1.equals(s)) {
            return li1ll11ilil1ii1lilll1i;
         }
      }

      return null;
   }

   @EventTarget
   public void ZenithInternal028(EventImpl_22 l11llilil1) {
      if (this.Spider()) {
         if (!Autosetup.IllIl11l1IlIlIlIIIlIl1.Spider()
            || !Autosetup.IllIl11l1IlIlIlIIIlIl1.IIlI11II1lllIIIlII1lI11l1I.Spider()
            || Autosetup.IllIl11l1IlIlIlIIIlIl1.Il1IIlIllII11I1l111IIl1 >= Autosetup.IllIl11l1IlIlIlIIIlIl1.Ill11I1l111ll111ll.size()) {
            if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != null || this.lI1l1l1111l1I1I1II1IIlll.HostnameVerifierImpl((long)this.l1111l11lIlII)) {
               if (l11I1I1ll1Illll1I1l1111l1II.currentScreen == null) {
                  this.I111lIIlIII1II1lII = false;
                  this.lIIll11Il1ll1 = false;
                  this.III1lll1Il1I1lll11Il1Il1 = false;
                  if (this.lI1l1l1111l1I1I1II1IIlll.HostnameVerifierImpl(1000L)) {
                     if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
                        l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendCommand("ah");
                     }

                     this.lI1l1l1111l1I1I1II1IIlll.reset();
                  }
               } else if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != null && this.I1l11Ill11lII1lIIlIII) {
                  if (this.l1lIIl11Il.HostnameVerifierImpl((long)this.l1Il11I)) {
                     if (this.IIIIllI11l != -1) {
                        this.StringHolder_8(this.l11lI11llI1lIl1I1IIlllIl1IlI1I, this.IIIIllI11l, this.I11Ill1ll1ll11llI1I);
                     }

                     this.IllIlIIl1l = this.l11lI11llI1lIl1I1IIlllIl1IlI1I;
                     this.I1l11Ill11lII1lIIlIII = false;
                     String s1 = l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle() != null
                        ? l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle().getString()
                        : "";
                     if (s1.contains("Покупка предмета") && this.IIlIll11lllIlIlII11l11IlI && this.l1ll1IIlIll111II1II1lII1lIl1) {
                        if (this.l11llIIllI1Il1) {
                           this.llI1ll1IIll1lIIIl111I11l = ZenithInternal091.ConnectThread(320, 920);
                           this.III11ll11Illll11lII1l.reset();
                        } else {
                           this.llI1ll1IIll1lIIIl111I11l = ZenithInternal091.ConnectThread(180, 460);
                           this.III11ll11Illll11lII1l.reset();
                        }

                        if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
                           l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
                        }

                        this.lI1l1l1111l1I1I1II1IIlll.reset();
                        this.I1ll111Ill1II1IllIIl1I.reset();
                        this.lIlIlIll1I1l1III11IllI111l1IlI = ZenithInternal091.ConnectThread(85, 585);
                        this.IIl11ll11IIIllI1I11111l1I = 0;
                        this.IIlIll11lllIlIlII11l11IlI = false;
                        this.l11llIIllI1Il1 = false;
                        this.lI1Illl1ll11 = false;
                        this.lIl11lIllI = -1;
                        this.l1ll1IIlIll111II1II1lII1lIl1 = false;
                        this.III1lll1Il1I1lll11Il1Il1 = false;
                     }
                  }
               } else {
                  if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != null) {
                     String s = l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle() != null
                        ? l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle().getString()
                        : "";
                     if (!s.contains("Аукцион") && !s.contains("Покупка предмета")) {
                        this.I111lIIlIII1II1lII = false;
                     }

                     if (s.contains("Покупка предмета")) {
                        if (!this.IIlIll11lllIlIlII11l11IlI
                           && l11I1I1ll1Illll1I1l1111l1II.player != null
                           && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != null) {
                           ItemStack ItemStackx = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getSlot(13).getStack();
                           if (ItemStackx != null && !ItemStackx.isEmpty()) {
                              this.llI1ll1ll1IIl11Il1llI1 = ItemStackx.copy();
                           }

                           boolean flag3 = false;
                           if (ItemStackx != null && !ItemStackx.isEmpty()) {
                              for (AutoInventoryItem autoinventoryitem1 : this.l1lI1Il1l11I1Il111l1llIIIl1I1) {
                                 if (autoinventoryitem1.isBuy(ItemStackx)) {
                                    int j3 = PatternHolder_2.ListHolder_6(ItemStackx);
                                    if ((long)j3 < autoinventoryitem1.getMaxSumBuy()) {
                                       flag3 = true;
                                       break;
                                    }
                                 }
                              }
                           }

                           if (this.IIl11ll11IIIllI1I11111l1I == 0) {
                              this.IIl11ll11IIIllI1I11111l1I = ZenithInternal091.ConnectThread(10, 50);
                           }

                           boolean flag4 = this.I1ll111Ill1II1IllIIl1I
                              .HostnameVerifierImpl((long)(this.lIlIlIll1I1l1III11IllI111l1IlI + this.IIl11ll11IIIllI1I11111l1I));
                           if (flag4) {
                              this.l11llIIllI1Il1 = flag3;
                              this.IIlIll11lllIlIlII11l11IlI = true;
                              if (this.l11llIIllI1Il1) {
                                 int i3 = this.I1lI111ll11llII1l1lllI();
                                 this.lIl11lIllI = i3;
                                 this.I1IlIIl1llI1lII1l1II1III11 = ZenithInternal091.ConnectThread(420, 480);
                                 this.lI1Illl1ll11 = true;
                                 this.IllII1lll.reset();
                              } else {
                                 this.l1ll1IIlIll111II1II1lII1lIl1 = true;
                              }
                           }
                        }

                        if (this.lI1Illl1ll11) {
                           if (!this.IllII1lll.HostnameVerifierImpl((long)this.I1IlIIl1llI1lII1l1II1III11)) {
                              return;
                           }

                           this.lI1Illl1ll11 = false;
                           this.l1ll1IIlIll111II1II1lII1lIl1 = true;
                        }

                        if (this.IIlIll11lllIlIlII11l11IlI && this.l1ll1IIlIll111II1II1lII1lIl1) {
                           int l1 = this.l11llIIllI1Il1 ? this.lIl11lIllI : 6;
                           int i2 = this.EventImpl_24(this.IllIlIIl1l, l1);
                           this.l1Il11I = i2;
                           this.I1l11Ill11lII1lIIlIII = true;
                           this.l11lI11llI1lIl1I1IIlllIl1IlI1I = l1;
                           this.IIIIllI11l = 0;
                           this.I11Ill1ll1ll11llI1I = SlotActionType.PICKUP;
                           this.IIII11IllllIIIIIl = false;
                           this.l1lIIl11Il.reset();
                           return;
                        }

                        return;
                     }

                     if (s.contains("Аукцион")) {
                        if (!this.lIIll11Il1ll1) {
                           this.lIIll11Il1ll1 = true;
                           this.I1Il11I1111I1I1ll111IIIlIll = true;
                           this.lllI1IIII11IlII111I1l1lI1l = ZenithInternal091.ConnectThread(5950, 10050);
                           this.Il1II1lI.reset();
                           this.ll1lI1lI1II1l1l = false;
                           this.IIl1lI1I11llI11ll = 0;
                           this.I111lIIlIII1II1lII = false;
                           this.Ill1111IIlII1111llII1Il1.reset();
                           this.lllIIl11lI11lIllI1IllI11l.reset();
                           this.lII1Il1lllIl1l = false;
                           this.III1lll1Il1I1lll11Il1Il1 = false;
                        }

                        boolean flag = false;
                        if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != null) {
                           for (int i = 0; i <= 44; i++) {
                              try {
                                 Slot Slot = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getSlot(i);
                                 ItemStack ItemStackx = Slot.getStack();
                                 if (ItemStackx != null && !ItemStackx.isEmpty()) {
                                    flag = true;
                                    break;
                                 }
                              } catch (Exception exception) {
                              }
                           }
                        }

                        if (!flag) {
                           if (!this.lII1Il1lllIl1l) {
                              this.lII1Il1lllIl1l = true;
                              this.lllIIl11lI11lIllI1IllI11l.reset();
                           } else if (this.lllIIl11lI11lIllI1IllI11l.HostnameVerifierImpl(1000L)) {
                              if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
                                 l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
                              }

                              this.lI1l1l1111l1I1I1II1IIlll.reset();
                              this.lII1Il1lllIl1l = false;
                              this.III1lll1Il1I1lll11Il1Il1 = false;
                              return;
                           }
                        } else {
                           this.lII1Il1lllIl1l = false;
                        }

                        if (this.I1Il11I1111I1I1ll111IIIlIll && this.Il1II1lI.HostnameVerifierImpl((long)this.lllI1IIII11IlII111I1l1lI1l)) {
                           this.I1Il11I1111I1I1ll111IIIlIll = false;
                        }

                        if (this.I11II111l11I1II11l) {
                           return;
                        }

                        boolean flag2 = !this.III11ll11Illll11lII1l.HostnameVerifierImpl((long)this.llI1ll1IIll1lIIIl111I11l);
                        int j2 = this.l1lll1IIIIII1l;
                        if (this.I1l1l11ll1l) {
                           if (!this.IIII1I1III1lll1.HostnameVerifierImpl((long)this.lI11l1Il11l1l1lIllI1lII)) {
                              return;
                           }

                           this.I1l1l11ll1l = false;
                        }

                        if (this.IlIIl11I1lllI1I1lI.HostnameVerifierImpl((long)j2)) {
                           if (this.llll11l11l11IlIl1III >= 350) {
                              if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
                                 l11I1I1ll1Illll1I1l1111l1II.player
                                    .sendMessage(Text.literal("§c[§4AutoBuy§c] §fЭтот аккаунт скоро будет забанен"), false);
                                 l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
                              }

                              this.StringHolder_11(false);
                              return;
                           }

                           int k2 = this.EventImpl_24(this.IllIlIIl1l, 47);
                           this.l1Il11I = k2;
                           this.I1l11Ill11lII1lIIlIII = true;
                           this.l11lI11llI1lIl1I1IIlllIl1IlI1I = 47;
                           this.IIIIllI11l = 0;
                           this.I11Ill1ll1ll11llI1I = SlotActionType.PICKUP;
                           this.IIII11IllllIIIIIl = false;
                           this.l1lIIl11Il.reset();
                           this.IlIIl11I1lllI1I1lI.reset();
                           this.l1lll1IIIIII1l = ZenithInternal091.ConnectThread(1000, 1500);
                        }

                        int l2 = l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != null
                           ? l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getRevision()
                           : -1;
                        if (l2 != this.IIllIlI1llII1l11I11111II11) {
                           this.IIllIlI1llII1l11I11111II11 = l2;
                           this.Il11lIl1lIlI11IlllIl.reset();
                        }

                        int j = ZenithInternal091.ConnectThread(270, 305);
                        if (!flag2
                           && !this.III1lll1Il1I1lll11Il1Il1
                           && this.l1111lll1l1IlI111.HostnameVerifierImpl((long)j)
                           && this.Il11lIl1lIlI11IlllIl.HostnameVerifierImpl((long)this.llIlllI1l1lIllI1Il1l)) {
                           int k = -1;
                           int l = Integer.MAX_VALUE;
                           int i1 = this.IlI1lI1llIlIIlI1l1l1I1I1III1();
                           if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != null) {
                              for (int j1 = 0; j1 <= 44; j1++) {
                                 Slot Slotx = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getSlot(j1);
                                 ItemStack ItemStackx = Slotx.getStack();
                                 if (ItemStackx != null && !ItemStackx.isEmpty()) {
                                    boolean flag1 = false;

                                    for (AutoInventoryItem autoinventoryitem : this.l1lI1Il1l11I1Il111l1llIIIl1I1) {
                                       if (autoinventoryitem.isBuy(ItemStackx)) {
                                          int k1 = PatternHolder_2.ListHolder_6(ItemStackx);
                                          if ((long)k1 < autoinventoryitem.getMaxSumBuy() && k1 <= i1) {
                                             if (k1 < l) {
                                                l = k1;
                                                k = j1;
                                             }

                                             flag1 = true;
                                             break;
                                          }
                                       }
                                    }

                                    if (flag1 && l < 50) {
                                       break;
                                    }
                                 }
                              }
                           }

                           if (k != -1) {
                              this.l1Il11I = this.EventImpl_24(this.IllIlIIl1l, k);
                              this.I1l11Ill11lII1lIIlIII = true;
                              this.l11lI11llI1lIl1I1IIlllIl1IlI1I = k;
                              this.IIIIllI11l = 0;
                              this.I11Ill1ll1ll11llI1I = SlotActionType.PICKUP_ALL;
                              this.IIII11IllllIIIIIl = false;
                              this.l1lIIl11Il.reset();
                              this.III1lll1Il1I1lll11Il1Il1 = true;
                              return;
                           }

                           this.l1111lll1l1IlI111.reset();
                        }
                     } else {
                        this.I111lIIlIII1II1lII = false;
                        this.lIIll11Il1ll1 = false;
                        this.III1lll1Il1I1lll11Il1Il1 = false;
                     }
                  }
               }
            }
         }
      }
   }

   private int IlI1lI1llIlIIlI1l1l1I1I1III1() {
      long i = System.currentTimeMillis();
      if (i - this.Il1Il1l1IlllIIl1 < 100L) {
         return this.ll1l1Il1II1II;
      } else {
         try {
            if (l11I1I1ll1Illll1I1l1111l1II.player == null || l11I1I1ll1Illll1I1l1111l1II.player.getWorld() == null) {
               this.ll1l1Il1II1II = 0;
               this.Il1Il1l1IlllIIl1 = i;
               return 0;
            }

            net.minecraft.scoreboard.Scoreboard Scoreboard = l11I1I1ll1Illll1I1l1111l1II.player.getWorld().getScoreboard();
            if (Scoreboard == null) {
               this.ll1l1Il1II1II = 0;
               this.Il1Il1l1IlllIIl1 = i;
               return 0;
            }

            net.minecraft.scoreboard.ScoreboardObjective ScoreboardObjective = Scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
            if (ScoreboardObjective == null) {
               this.ll1l1Il1II1II = 0;
               this.Il1Il1l1IlllIIl1 = i;
               return 0;
            }

            Collection collection = Scoreboard.getScoreboardEntries(ScoreboardObjective);
            if (collection == null || collection.isEmpty()) {
               this.ll1l1Il1II1II = 0;
               this.Il1Il1l1IlllIIl1 = i;
               return 0;
            }

            for (ScoreboardEntry ScoreboardEntry : collection) {
               try {
                  String s = ScoreboardEntry.owner();
                  net.minecraft.scoreboard.Team Team = Scoreboard.getScoreHolderTeam(s);
                  if (Team != null) {
                     String s1 = Team.getPrefix() != null ? Team.getPrefix().getString() : "";
                     String s2 = Team.getSuffix() != null ? Team.getSuffix().getString() : "";
                     String s3 = s1 + s + s2;
                     if (s3.contains("\ud83e\ude99") || s3.toLowerCase().contains("монет") || s3.toLowerCase().contains("coin")) {
                        String s4 = s3.replaceAll("[^0-9]", "");
                        if (!s4.isEmpty()) {
                           this.ll1l1Il1II1II = Integer.parseInt(s4);
                           this.Il1Il1l1IlllIIl1 = i;
                           return this.ll1l1Il1II1II;
                        }
                     }
                  }
               } catch (Exception exception) {
               }
            }
         } catch (Exception exception1) {
         }

         this.ll1l1Il1II1II = 0;
         this.Il1Il1l1IlllIIl1 = i;
         return 0;
      }
   }

   @EventTarget
   public void EventTarget(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.longHolder_8()) {
         if (ii1l11il1i1i.Swinganimation() instanceof ScreenHandlerSlotUpdateS2CPacket || ii1l11il1i1i.Swinganimation() instanceof OpenScreenS2CPacket) {
            this.lIl1IIlI1111IlIIlIIl1l1.reset();
            if (this.Ill1111IIlII1111llII1Il1.HostnameVerifierImpl(500L)) {
               if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != null) {
                  String s = l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle() != null
                     ? l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle().getString()
                     : "";
                  if (s.contains("Аукцион") && this.lIIll1l1IlIlII1Il()) {
                     this.I111lIIlIII1II1lII = true;
                  }
               }

               this.Ill1111IIlII1111llII1Il1.reset();
            }
         }

         if (ii1l11il1i1i.Swinganimation() instanceof GameMessageS2CPacket GameMessageS2CPacket) {
            String s1 = GameMessageS2CPacket.content().getString();
            this.BlockPosHolder(s1);
            if (l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof AutoBuyScreen autobuyscreen) {
               autobuyscreen.setPurchaseHistory(this.purchaseHistory);
            }
         }
      }
   }

   private void StringHolder_8(int i, int j, SlotActionType SlotActionType) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.interactionManager != null
         && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != null) {
         this.llll11l11l11IlIl1III++;
         if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
            l11I1I1ll1Illll1I1l1111l1II.player
               .sendMessage(
                  Text.literal("§7[§6AutoBuy§7] §fКлик #§a" + this.llll11l11l11IlIl1III + " §7- §eСлот: §6" + i + " §7Кнопка: §6" + j), false
               );
         }

         this.IIlllIlIIlIIIlllll1llII1III11I();
         this.IlI1I1l1llI1I = true;
         l11I1I1ll1Illll1I1l1111l1II.interactionManager
            .clickSlot(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId, i, j, SlotActionType, l11I1I1ll1Illll1I1l1111l1II.player);
      }
   }

   private void IIlllIlIIlIIIlllll1llII1III11I() {
      this.II1IlII11I1.clear();
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.getInventory() != null) {
         for (int i = 0; i < l11I1I1ll1Illll1I1l1111l1II.player.getInventory().size(); i++) {
            ItemStack ItemStackx = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(i);
            if (ItemStackx != null && !ItemStackx.isEmpty()) {
               ItemStack ItemStackx = ItemStackx.copy();
               ItemStackx.setCount(1);
               this.II1IlII11I1.put(ItemStackx, ItemStackx.getCount());
            }
         }
      }
   }

   private ItemStack I11lII11lI11I1I1IIIl() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.getInventory() != null) {
         for (int i = 0; i < l11I1I1ll1Illll1I1l1111l1II.player.getInventory().size(); i++) {
            ItemStack ItemStackx = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(i);
            if (ItemStackx != null && !ItemStackx.isEmpty()) {
               ItemStack ItemStackx = ItemStackx.copy();
               ItemStackx.setCount(1);
               int j = ItemStackx.getCount();
               Integer integer = null;

               for (Entry entry : this.II1IlII11I1.entrySet()) {
                  if (ItemStack.areItemsEqual((ItemStack)entry.getKey(), ItemStackx) && ItemStack.areEqual((ItemStack)entry.getKey(), ItemStackx)) {
                     integer = (Integer)entry.getValue();
                     break;
                  }
               }

               if (integer == null) {
                  return ItemStackx.copy();
               }

               if (j > integer) {
                  return ItemStackx.copy();
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private ArrayList<GetDisplayNameHandler_2> l1l11l1111l1ll1lIllll1() {
      ArrayList arraylist = new ArrayList<>(ZenithClient.getInstance().ZenithInternal124().TargetPotions());
      arraylist.addAll(ZenithClient.getInstance().ZenithInternal124().AnimatedTab());
      arraylist.addAll(ZenithClient.getInstance().ZenithInternal124().ScoreBoard());
      return arraylist;
   }

   public ArrayList<AutoInventoryItem> l1I1l11l111llIIIllllllll1ll() {
      return this.l1lI1Il1l11I1Il111l1llIIIl1I1;
   }

   private int I1lI111ll11llII1l1lllI() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != null) {
         ArrayList arraylist = new ArrayList();

         for (int i = 0; i < l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.slots.size(); i++) {
            try {
               Slot Slot = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getSlot(i);
               ItemStack ItemStack = Slot.getStack();
               if (ItemStack != null && !ItemStack.isEmpty()) {
                  String s = ItemStack.getName().getString().toLowerCase();
                  if (s.contains("купить") || s.contains("buy")) {
                     arraylist.add(i);
                  }
               }
            } catch (Exception exception) {
            }
         }

         if (!arraylist.isEmpty()) {
            int j = ThreadLocalRandom.current().nextInt(arraylist.size());
            return (Integer)arraylist.get(j);
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private void BlockPosHolder(String s) {
      Pattern pattern = Pattern.compile("▶\\s*Вы купили \\[([^\\]]+)\\]\\s*x(\\d+)\\s*у\\s+([^\\s]+)\\s*за\\s+([\\d\\s]+)¤");
      Matcher matcher = pattern.matcher(s);
      if (matcher.find()) {
         String s4 = matcher.group(1);
         int k = Integer.parseInt(matcher.group(2));
         String s6 = matcher.group(3);
         String s7 = matcher.group(4).replaceAll("\\s", "");
         int i1 = Integer.parseInt(s7);
         this.addPurchase(s4, s6, k, i1);
      } else {
         Pattern pattern1 = Pattern.compile("▶\\s*Вы купили\\s+(.+?)\\s+x(\\d+)\\s+у\\s+([^\\s]+)\\s+за\\s+([\\d\\s]+)¤");
         Matcher matcher1 = pattern1.matcher(s);
         if (matcher1.find()) {
            String s5 = matcher1.group(1).trim();
            int l = Integer.parseInt(matcher1.group(2));
            String s8 = matcher1.group(3);
            String s9 = matcher1.group(4).replaceAll("\\s", "");
            int j1 = Integer.parseInt(s9);
            this.addPurchase(s5, s8, l, j1);
         } else {
            Pattern pattern2 = Pattern.compile("купили\\s+(.+?)\\s+x(\\d+)\\s+у\\s+(\\S+)\\s+за\\s+([\\d\\s]+)");
            Matcher matcher2 = pattern2.matcher(s);
            if (matcher2.find()) {
               String s1 = matcher2.group(1).trim();
               s1 = s1.replaceAll("^\\[|\\]$", "");
               int i = Integer.parseInt(matcher2.group(2));
               String s2 = matcher2.group(3);
               String s3 = matcher2.group(4).replaceAll("\\s", "");
               int j = Integer.parseInt(s3);
               this.addPurchase(s1, s2, i, j);
            }
         }
      }
   }

   private void addPurchase(String s, String s1, int i, int j) {
      String s2 = this.TimerUtilHolder_2(s);
      ItemStack ItemStack = null;
      if (this.llI1ll1ll1IIl11Il1llI1 != null && !this.llI1ll1ll1IIl11Il1llI1.isEmpty()) {
         ItemStack = this.llI1ll1ll1IIl11Il1llI1.copy();
         this.llI1ll1ll1IIl11Il1llI1 = null;
      } else if (this.IlI1I1l1llI1I) {
         ItemStack = this.I11lII11lI11I1I1IIIl();
         this.IlI1I1l1llI1I = false;
         this.II1IlII11I1.clear();
      }

      Autobuy$II1Il11l111II11IIl l111liiiiill11li1l1li1lliii$ii1il11l111ii11iil = new Autobuy$II1Il11l111II11IIl(
         s2, s1, i, j, ItemStack
      );
      this.purchaseHistory.add(0, l111liiiiill11li1l1li1lliii$ii1il11l111ii11iil);
      if (this.purchaseHistory.size() > 50) {
         this.purchaseHistory.remove(this.purchaseHistory.size() - 1);
      }
   }

   private String TimerUtilHolder_2(String s) {
      String s1 = s;
      boolean flag = false;

      for (Entry entry : lIll111l111I1l11.entrySet()) {
         if (s1.equals(entry.getKey())) {
            s1 = (String)entry.getValue();
            flag = true;
            break;
         }
      }

      if (!flag) {
         for (Entry entry1 : lIll111l111I1l11.entrySet()) {
            if (s1.contains((CharSequence)entry1.getKey())) {
               s1 = s1.replace((CharSequence)entry1.getKey(), (CharSequence)entry1.getValue());
            }
         }
      }

      s1 = this.cleanName(s1);
      return s1.isEmpty() ? this.cleanName(s) : s1;
   }

   private String cleanName(String s) {
      return s == null ? "" : s.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").trim();
   }

   static {
      lIll111l111I1l11.put("Шлем ᴇᴛᴇʀɴɪᴛʏ", "Шлем eternity");
      lIll111l111I1l11.put("Эпический талисман", "Тотем бессмертия");
      lIll111l111I1l11.put("Обычный талисман", "Тотем бессмертия");
      lIll111l111I1l11.put("Рюкзак (IV уровень)", "рюкзак 4 уровень");
      lIll111l111I1l11.put("Рюкзак (III уровень)", "рюкзак 3 уровень");
      lIll111l111I1l11.put("Поножи Iɴғɪɴɪᴛʏ", "Штаны Infinity");
      lIll111l111I1l11.put("Динамит B", "Динамит Б");
      lIll111l111I1l11.put("Сфера ᴀʀᴍᴏʀᴛᴀʟɪᴛʏ", "Сфера armortality");
      lIll111l111I1l11.put("Сфера ɪᴍᴍᴏʀᴛᴀʟɪᴛʏ", "Сфера имморталити");
      lIll111l111I1l11.put("»", "");
      lIll111l111I1l11.put("«", "");
      lIll111l111I1l11.put("Бутылек с", "");
      lIll111l111I1l11.put("ур. опыта", "");
      lIll111l111I1l11.put("(5345)", "");
      lIll111l111I1l11.put("• Броневая элитра •", "Элитры");
      lIll111l111I1l11.put("-", "");
      lIll111l111I1l11.put("Сфера sᴛɪɴɢᴇʀ", "Сфера Стингер");
      lIll111l111I1l11.put("Штаны ᴅʀᴀɢᴏɴ", "Незеритовые поножи");
      lIll111l111I1l11.put("Шлем ᴅʀᴀɢᴏɴ", "Незеритовый шлем");
      lIll111l111I1l11.put("Нагрудник ᴅʀᴀɢᴏɴ", "Незеритовый нагрудник");
      lIll111l111I1l11.put("Ботинки ᴅʀᴀɢᴏɴ", "Незеритовые ботинки");
   }
}
