package zenith;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import zenith.zov.client.screens.autobuy.items.AutoInventoryItem;

@ModuleInfo(
   name = "AutoSetup",
   category = Category.MISC,
   description = "Автоматически ставит цены для AutoBuy"
)
public final class Autosetup extends Module {
   public static final Autosetup IllIl11l1IlIlIlIIIlIl1 = new Autosetup();
   private final longHolder lI1IIIIl1IllllII1 = new longHolder();
   private final longHolder I11llllll1Il = new longHolder();
   private final longHolder llIIl11IIlIlIIl11lIIl1l11I1 = new longHolder();
   public final List<String> Ill11I1l111ll111ll = new ArrayList<>();
   private final List<String> Illl111lI1l1111lIIl1 = new ArrayList<>();
   public int Il1IIlIllII11I1l111IIl1 = 0;
   private boolean Ill11I11I1I = false;
   private int lll1lll1lll1l1lII1I1111IIII = -1;
   private boolean IIIIlIll1II1I1Ill = false;
   private int l11Ill1llII1l = 1500;
   private int lII1lI111 = 1000;
   private final longHolder III1llIIllIll1Ill = new longHolder();
   private final int lIIIlllIIl1l11ll = 1000;
   private final NumberSetting l11111IlIlIl111I = new NumberSetting(
      "Множитель цены", 0.7F, 0.1F, 0.9F, 0.05F, "module.autoParse.priceMultiplier.desc", "x"
   );
   public final BooleanSetting IIlI11II1lllIIIlII1lI11l1I = new BooleanSetting(
      "10 минут", "module.autoParse.tenMinutesMode.desc", false
   );
   private final longHolder l1lllll1l1llIl1IllIlllIl111 = new longHolder();

   @Override
   public boolean llI1lll1lIllII11I1111Illl() {
      return true;
   }

   @Override
   public void onEnable() {
      this.Ill11I1l111ll111ll.clear();
      this.Il1IIlIllII11I1l111IIl1 = 0;
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
         this.l1Il1IIl11ll1l1lI1I1I1I();
         this.lI1IIIIl1IllllII1.reset();
         this.I11llllll1Il.reset();
         this.llIIl11IIlIlIIl11lIIl1l11I1.reset();
         this.l1lllll1l1llIl1IllIlllIl111.reset();
         this.l11Ill1llII1l = ZenithInternal091.ConnectThread(1000, 1500);
         this.lII1lI111 = ZenithInternal091.ConnectThread(2000, 2500);
         this.Ill11I11I1I = false;
         this.lll1lll1lll1l1lII1I1111IIII = -1;
         this.IIIIlIll1II1I1Ill = true;
         super.l11l1lII();
      } else {
         this.StringHolder_11(false);
      }
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (this.Spider()) {
         if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() == null) {
            this.lI1Il11I1l1III11IIlI1lI1II11I();
         } else {
            if (this.IIlI11II1lllIIIlII1lI11l1I.Spider() && this.Il1IIlIllII11I1l111IIl1 >= this.Ill11I1l111ll111ll.size()) {
               if (!this.l1lllll1l1llIl1IllIlllIl111.HostnameVerifierImpl(600000L)) {
                  return;
               }

               this.Il1IIlIllII11I1l111IIl1 = 0;
               this.lll1lll1lll1l1lII1I1111IIII = -1;
               this.Ill11I11I1I = false;
               this.IIIIlIll1II1I1Ill = true;
               this.l1lllll1l1llIl1IllIlllIl111.reset();
            }

            if (this.I11IlllIlI1l1ll1lI1IIll1I11I1()) {
               this.l1Il1IIl11ll1l1lI1I1I1I();
            }

            if (!this.Ill11I1l111ll111ll.isEmpty()) {
               if (this.Il1IIlIllII11I1l111IIl1 >= this.Ill11I1l111ll111ll.size()) {
                  this.lI1Il11I1l1III11IIlI1lI1II11I();
               } else {
                  if (!this.Ill11I11I1I && (this.IIIIlIll1II1I1Ill || this.lI1IIIIl1IllllII1.HostnameVerifierImpl((long)this.l11Ill1llII1l))) {
                     String s = this.Ill11I1l111ll111ll.get(this.Il1IIlIllII11I1l111IIl1);
                     l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendCommand("ah search " + s);
                     this.Ill11I11I1I = true;
                     this.lll1lll1lll1l1lII1I1111IIII = this.Il1IIlIllII11I1l111IIl1;
                     this.llIIl11IIlIlIIl11lIIl1l11I1.reset();
                     this.lI1IIIIl1IllllII1.reset();
                     this.IIIIlIll1II1I1Ill = false;
                     this.l11Ill1llII1l = ZenithInternal091.ConnectThread(1000, 1500);
                  }

                  if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != null) {
                     String s4 = l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle() != null
                        ? l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle().getString()
                        : "";
                     if (s4.contains("Аукцион") && this.I11llllll1Il.HostnameVerifierImpl((long)this.lII1lI111)) {
                        String s1 = null;
                        if (this.lll1lll1lll1l1lII1I1111IIII >= 0 && this.lll1lll1lll1l1lII1I1111IIII < this.Ill11I1l111ll111ll.size()) {
                           s1 = this.Ill11I1l111ll111ll.get(this.lll1lll1lll1l1lII1I1111IIII);
                        } else if (this.Il1IIlIllII11I1l111IIl1 < this.Ill11I1l111ll111ll.size()) {
                           s1 = this.Ill11I1l111ll111ll.get(this.Il1IIlIllII11I1l111IIl1);
                        } else if (this.Il1IIlIllII11I1l111IIl1 > 0 && this.Il1IIlIllII11I1l111IIl1 - 1 < this.Ill11I1l111ll111ll.size()) {
                           s1 = this.Ill11I1l111ll111ll.get(this.Il1IIlIllII11I1l111IIl1 - 1);
                        }

                        AutoInventoryItem autoinventoryitem = null;
                        if (s1 != null) {
                           for (AutoInventoryItem autoinventoryitem1 : Autobuy.lII1l1l1lIlIl1I1III11lI11.l1I1l11l111llIIIllllllll1ll()) {
                              GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1ix = autoinventoryitem1.getItemBuy();
                              if (li1ll11ilil1ii1lilll1ix != null && s1.equals(li1ll11ilil1ii1lilll1ix.HudElement())) {
                                 autoinventoryitem = autoinventoryitem1;
                                 break;
                              }
                           }
                        }

                        if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != null) {
                           int i = Integer.MAX_VALUE;

                           for (int j = 0; j <= 44; j++) {
                              Slot Slot = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getSlot(j);
                              ItemStack ItemStack = Slot.getStack();
                              if (ItemStack != null && !ItemStack.isEmpty() && autoinventoryitem != null) {
                                 boolean flag = autoinventoryitem.isBuy(ItemStack);
                                 if (!flag && autoinventoryitem.getItemBuy() != null) {
                                    String s2 = ItemStack.getName() != null ? ItemStack.getName().getString() : "";
                                    String s3 = autoinventoryitem.getItemBuy().HudElement();
                                    if (!s3.isEmpty() && !s2.isEmpty()) {
                                       flag = s2.toLowerCase().contains(s3.toLowerCase());
                                    }
                                 }

                                 if (flag) {
                                    int l = PatternHolder_2.ListHolder_6(ItemStack);
                                    if (l != Integer.MAX_VALUE && l < i) {
                                       i = l;
                                    }
                                 }
                              }
                           }

                           if (autoinventoryitem != null && i != Integer.MAX_VALUE) {
                              long k = (long)Math.max(1, Math.round((float)i * this.l11111IlIlIl111I.lll1lI1llll1IIllIIIII1lll()));
                              autoinventoryitem.setMaxSumBuy(k);

                              try {
                                 GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i = autoinventoryitem.getItemBuy();
                                 String s5 = li1ll11ilil1ii1lilll1i != null
                                    ? (
                                       li1ll11ilil1ii1lilll1i.getDisplayName() != null
                                          ? li1ll11ilil1ii1lilll1i.getDisplayName()
                                          : li1ll11ilil1ii1lilll1i.HudElement()
                                    )
                                    : "?";
                                 TextHolder.EventImpl_27("поставил цену: " + k + ", предмету: " + s5);
                              } catch (Exception exception1) {
                              }

                              this.Ill11I11I1I = false;
                              if (this.lll1lll1lll1l1lII1I1111IIII >= 0) {
                                 this.Il1IIlIllII11I1l111IIl1 = this.lll1lll1lll1l1lII1I1111IIII + 1;
                              } else {
                                 this.Il1IIlIllII11I1l111IIl1++;
                              }

                              this.lll1lll1lll1l1lII1I1111IIII = -1;

                              try {
                                 if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
                                    l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
                                 }
                              } catch (Exception exception) {
                              }

                              this.IIIIlIll1II1I1Ill = false;
                              this.l11Ill1llII1l = 1000;
                              this.lI1IIIIl1IllllII1.reset();
                           }
                        }

                        this.I11llllll1Il.reset();
                        this.lII1lI111 = ZenithInternal091.ConnectThread(2000, 2500);
                     }
                  }

                  if (this.Ill11I11I1I && this.llIIl11IIlIlIIl11lIIl1l11I1.HostnameVerifierImpl(5000L)) {
                     this.Ill11I11I1I = false;
                     if (this.lll1lll1lll1l1lII1I1111IIII >= 0) {
                        this.Il1IIlIllII11I1l111IIl1 = this.lll1lll1lll1l1lII1I1111IIII + 1;
                     } else {
                        this.Il1IIlIllII11I1l111IIl1++;
                     }

                     this.lll1lll1lll1l1lII1I1111IIII = -1;
                     this.IIIIlIll1II1I1Ill = true;
                     this.lI1IIIIl1IllllII1.reset();
                     this.llIIl11IIlIlIIl11lIIl1l11I1.reset();
                  }
               }
            }
         }
      }
   }

   private boolean I11IlllIlI1l1ll1lI1IIll1I11I1() {
      ArrayList arraylist = new ArrayList();
      ArrayList arraylist1 = new ArrayList();

      for (AutoInventoryItem autoinventoryitem : Autobuy.lII1l1l1lIlIl1I1III11lI11.l1I1l11l111llIIIllllllll1ll()) {
         if (autoinventoryitem != null) {
            GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i = autoinventoryitem.getItemBuy();
            if (li1ll11ilil1ii1lilll1i != null) {
               String s = li1ll11ilil1ii1lilll1i.HudElement();
               if (s != null && !s.isEmpty()) {
                  if (autoinventoryitem.isSelected()) {
                     if (!arraylist.contains(s)) {
                        arraylist.add(s);
                     }
                  } else if (!arraylist1.contains(s)) {
                     arraylist1.add(s);
                  }
               }
            }
         }
      }

      ArrayList arraylist2 = !arraylist.isEmpty() ? arraylist : arraylist1;
      if (arraylist2.size() != this.Illl111lI1l1111lIIl1.size()) {
         return true;
      } else {
         for (int i = 0; i < arraylist2.size(); i++) {
            if (!((String)arraylist2.get(i)).equals(this.Illl111lI1l1111lIIl1.get(i))) {
               return true;
            }
         }

         return false;
      }
   }

   private void l1Il1IIl11ll1l1lI1I1I1I() {
      ArrayList arraylist = new ArrayList();
      ArrayList arraylist1 = new ArrayList();
      ArrayList arraylist2 = new ArrayList();

      for (AutoInventoryItem autoinventoryitem : Autobuy.lII1l1l1lIlIl1I1III11lI11.l1I1l11l111llIIIllllllll1ll()) {
         if (autoinventoryitem != null) {
            GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i = autoinventoryitem.getItemBuy();
            if (li1ll11ilil1ii1lilll1i != null) {
               String s = li1ll11ilil1ii1lilll1i.HudElement();
               if (s != null && !s.isEmpty()) {
                  if (autoinventoryitem.isSelected()) {
                     if (!arraylist1.contains(s)) {
                        arraylist1.add(s);
                     }
                  } else if (!arraylist2.contains(s)) {
                     arraylist2.add(s);
                  }
               }
            }
         }
      }

      ArrayList arraylist3 = !arraylist1.isEmpty() ? arraylist1 : arraylist2;
      arraylist.addAll(arraylist3);
      if (!arraylist.equals(this.Ill11I1l111ll111ll)) {
         this.Ill11I1l111ll111ll.clear();
         this.Ill11I1l111ll111ll.addAll(arraylist);
         this.Illl111lI1l1111lIIl1.clear();
         this.Illl111lI1l1111lIIl1.addAll(this.Ill11I1l111ll111ll);
         if (this.Il1IIlIllII11I1l111IIl1 >= this.Ill11I1l111ll111ll.size() || this.Il1IIlIllII11I1l111IIl1 == 0 && !this.Ill11I11I1I) {
            this.Il1IIlIllII11I1l111IIl1 = 0;
            this.lll1lll1lll1l1lII1I1111IIII = -1;
            this.Ill11I11I1I = false;
            this.IIIIlIll1II1I1Ill = true;
         }
      }
   }
}
