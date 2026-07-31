// Module: AutoInventory
// Category: misc
// Original class: Autoinventory
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.DataComponentTypes;
import zenith.zov.client.screens.autosbor.AutoSborScreen;

@ModuleInfo(
   name = "AutoInventory",
   category = Category.MISC,
   description = "Автоматически собирает инвентарь"
)
public class Autoinventory extends Module {
   public static final Autoinventory lIIl1Illl1IllIIl11Il1l111I1I = new Autoinventory();
   private static final int IlI1ll111l = 36;
   private static final long IIII1lIlIllIIIIlIIllII = 1000L;
   private static final long IlIlII1ll1II1I1l11lI1l = 300L;
   private static final long lllIl1lIl111 = 100L;
   private static final long l11lllIII11l1l1I11II11 = 700L;
   private static final int I1l1IIlllllI11l11IIl1Il = 45;
   private static final int ll1ll1I1l1I1II1l1111l = 50;
   private static final int Il1Il1lI1l1llI11l1 = 2;
   private static final int l1lIIlI1IIlI1l = 3;
   private static final int l11ll11IllllI1lIlll = 4;
   private static final int l1lllI11l1Ill111I1llllI1ll1l1 = 27;
   private static final int ll1I1Ill1I = 0;
   private static final String l1l1l11lllII1l1IlII1ll = "[Кyпить]";
   private static final Pattern lI1IlI111IIlIIIIlIlI1lIl = Pattern.compile("Цена за 1 ед\\.?:\\s*([\\d ]+)\\s*¤", 0);
   private static final Pattern Ill11ll11lll1Il11lIllll1lI1l1 = Pattern.compile("\\$\\s*(?:(?:Цена|Ценa):\\s*)?([0-9][\\d, ]*)", 0);
   private final GetDisplayNameHandler_2[] I1II1IIIl1lll1l = new GetDisplayNameHandler_2[36];
   private final int[] lII1III1IlIl1l1lI1l11I = new int[36];
   private final float[] lIII1I11Il1IlIIlll11llIIlll1l = new float[36];
   private final GetDisplayNameHandler_2[] IIIIll111IlI1I1I1I11I = new GetDisplayNameHandler_2[36];
   private final int[] lIl11l11l11l1ll1l1IIIIl1llllII = new int[36];
   private final float[] II11llII1l11lllIIl1I1l1 = new float[36];
   private final ModeSetting lll11l1llI11llllI1I1II = new ModeSetting("Сервер", "Забыли описание", "Funtime 1.21", "HolyWorld");
   private final ButtonSetting IIllI1lllI1IlII11l111l = new ButtonSetting("Открыть меню", this::l1II1IIIl1I11);
   private final ListHolder_3 l1II111l111l11llIlll = new ListHolder_3();
   private final List<Autoinventory$EventBus> I1I111llI11lIIl11Il1l = new ArrayList<>();
   private final longHolder lI1IIIl1II1111l11lll111IIl1III = new longHolder();
   private final longHolder IlIIlI1l1IlII1lI1l = new longHolder();
   private Autoinventory$EventBus IIII1Il1lIllIII11;
   private boolean II11IlllI1111Ill11II;
   private boolean l1lI1l1IIIIlI11lllllll11I1l;
   private boolean llIIlII1l;
   private boolean l1lII1lI11IlI1I1lIl1lII;
   private int IlllllIIll1l1I1I11I = -1;
   private int lIIll1lI1Il11lllIll;
   private Autoinventory$II1Il11l111II11IIl I11llIlIIl111;

   private Autoinventory() {
   }

   @Override
   public void onEnable() {
      this.l11IllIlI1II1lllI11l11();
      this.lI1IIIl1II1111l11lll111IIl1III.reset();
      this.IlIIlI1l1IlII1lI1l.reset();
      this.l1lI1l1IIIIlI11lllllll11I1l = false;
      this.llIIlII1l = false;
      this.l1lII1lI11IlI1I1lIl1lII = false;
      this.IlllllIIll1l1I1I11I = -1;
      this.lIIll1lI1Il11lllIll = 0;
      super.l11l1lII();
      this.IlI1l111l1IIlII1II1();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.I1I111llI11lIIl11Il1l.clear();
      this.II11IlllI1111Ill11II = false;
      this.l1lI1l1IIIIlI11lllllll11I1l = false;
      this.llIIlII1l = false;
      this.l1lII1lI11IlI1I1lIl1lII = false;
      this.IlllllIIll1l1I1I11I = -1;
      this.IIII1Il1lIllIII11 = null;
      this.lIIll1lI1Il11lllIll = 0;
      this.I11llIlIIl111 = null;
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void EventBus(EventImpl_2 i1i11liii111lill1) {
      if (this.II11IlllI1111Ill11II) {
         this.StringHolder_32(false);
      } else if (this.l1lI1l1IIIIlI11lllllll11I1l) {
         this.I111llIIlIllI11I1IlI1111IIl();
      } else if (this.llIIlII1l) {
         this.l1l1Il1l1lII1II111Ill();
      } else if (this.l1lII1lI11IlI1I1lIl1lII) {
         this.lIl1III1llI1l1l1IlIlll();
      } else if (this.lI1IIIl1II1111l11lll111IIl1III.HostnameVerifierImpl(1000L)) {
         this.IlI1l111l1IIlII1II1();
      }
   }

   private void l1II1IIIl1I11() {
      l11I1I1ll1Illll1I1l1111l1II.setScreen(new AutoSborScreen(this.Il1llllll1(), this.I11l1llIllll1lI1lll1II1I(), this.llll111llll(), this::l11lIl1l1l));
   }

   public ListHolder_3 I1llI1lIlI1Ill11I() {
      return this.l1II111l111l11llIlll;
   }

   public String l11lIl1l1l() {
      return this.lll11l1llI11llllI1I1II.Il1I11IIlllIl111l11I1I11();
   }

   private void l11IllIlI1II1lllI11l11() {
      this.I1I111llI11lIIl11Il1l.clear();
      this.II11IlllI1111Ill11II = false;
      HashMap hashmap = new HashMap();
      HashMap hashmap1 = new HashMap();
      HashMap hashmap2 = new HashMap();
      GetDisplayNameHandler_2[] ali1ll11ilil1ii1lilll1i = this.Il1llllll1();

      for (int i = 0; i < ali1ll11ilil1ii1lilll1i.length; i++) {
         GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i = ali1ll11ilil1ii1lilll1i[i];
         if (li1ll11ilil1ii1lilll1i != null && !li1ll11ilil1ii1lilll1i.getItemStack().isEmpty()) {
            String s = li1ll11ilil1ii1lilll1i.HudElement();
            if (s != null && !s.isBlank()) {
               int j = this.StringHolder_8(li1ll11ilil1ii1lilll1i, i);
               float f = this.EventBus(li1ll11ilil1ii1lilll1i, i);
               String s1 = this.EventBus(li1ll11ilil1ii1lilll1i, f);
               int k = hashmap.computeIfAbsent(s1, s2 -> this.StringHolder_8(li1ll11ilil1ii1lilll1i, f));
               int l = hashmap1.getOrDefault(s1, 0) + j;
               int i1 = hashmap2.getOrDefault(s1, k);
               hashmap1.put(s1, l);
               if (i1 >= l) {
                  hashmap2.put(s1, i1);
               } else {
                  this.I1I111llI11lIIl11Il1l.add(new Autoinventory$EventBus(li1ll11ilil1ii1lilll1i, s, l - i1, l, f));
                  hashmap2.put(s1, l);
               }
            }
         }
      }
   }

   private void IlI1l111l1IIlII1II1() {
      if (this.I1I111llI11lIIl11Il1l.isEmpty()) {
         this.II11IlllI1111Ill11II = true;
      } else {
         this.StringHolder_8(this.I1I111llI11lIIl11Il1l.removeFirst());
      }
   }

   private void StringHolder_8(Autoinventory$EventBus l1il1ili1illil1i$l1i1illlili) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.world != null
         && l11I1I1ll1Illll1I1l1111l1II.player.networkHandler != null) {
         this.IllI1I11I1l();
         this.I11llIlIIl111 = null;
         this.IIII1Il1lIllIII11 = l1il1ili1illil1i$l1i1illlili;
         l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatCommand("ah search " + this.IIII1Il1lIllIII11.lIIl111Ill11lIlI11IlIl1lIIIl);
         this.lI1IIIl1II1111l11lll111IIl1III.reset();
         this.IlIIlI1l1IlII1lI1l.reset();
         this.l1lI1l1IIIIlI11lllllll11I1l = true;
         this.IlllllIIll1l1I1I11I = -1;
      }
   }

   private void I111llIIlIllI11I1IlI1111IIl() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null && l11I1I1ll1Illll1I1l1111l1II.interactionManager != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != null
            && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler) {
            ScreenHandler ScreenHandler = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler;
            if (PatternHolder_2.EventImpl_13(ScreenHandler)) {
               if (this.IlllllIIll1l1I1I11I != ScreenHandler.syncId) {
                  this.IlllllIIll1l1I1I11I = ScreenHandler.syncId;
                  this.IlIIlI1l1IlII1lI1l.reset();
               } else if (this.IlIIlI1l1IlII1lI1l.HostnameVerifierImpl(300L)) {
                  int i = this.StringHolder_8(ScreenHandler, this.IIII1Il1lIllIII11);
                  this.IlllllIIll1l1I1I11I = -1;
                  if (i < 0) {
                     if (!this.EventImpl_24(ScreenHandler)) {
                        this.l1lI1l1IIIIlI11lllllll11I1l = false;
                        this.IlI1l111l1IIlII1II1();
                     }
                  } else if (this.I1ll1lllI11l1l1I1l1()) {
                     this.l1lI1l1IIIIlI11lllllll11I1l = false;
                     this.llIIlII1l = true;
                     this.lIIll1lI1Il11lllIll = 0;
                     this.IlllllIIll1l1I1I11I = -1;
                     this.lI1IIIl1II1111l11lll111IIl1III.reset();
                     this.IlIIlI1l1IlII1lI1l.reset();
                  } else {
                     this.l1lI1l1IIIIlI11lllllll11I1l = false;
                     this.lI1IIIl1II1111l11lll111IIl1III.reset();
                     this.llIIlII1l = true;
                     this.lIIll1lI1Il11lllIll = i;
                     this.IlIIlI1l1IlII1lI1l.reset();
                  }
               }
            }
         }
      }
   }

   private int StringHolder_8(ScreenHandler ScreenHandler, Autoinventory$EventBus l1il1ili1illil1i$l1i1illlili) {
      this.I11llIlIIl111 = null;
      Slot Slotx = null;
      long i = Long.MAX_VALUE;
      int j = Math.min(45, ScreenHandler.slots.size());

      for (int k = 0; k < j; k++) {
         Slot Slotx = ScreenHandler.getSlot(k);
         if (Slotx != null && Slotx.hasStack()) {
            ItemStack ItemStack = Slotx.getStack();
            if (l1il1ili1illil1i$l1i1illlili.I1l1I111Il1l1111IIl1Il.isBuy(ItemStack)
               && this.StringHolder_8(ItemStack, l1il1ili1illil1i$l1i1illlili.l1Il11l1l1)) {
               long l = this.EventImpl_13(ItemStack);
               if (l != Long.MAX_VALUE && l < i) {
                  Slotx = Slotx;
                  i = l;
               }
            }
         }
      }

      if (Slotx != null && l11I1I1ll1Illll1I1l1111l1II.interactionManager != null && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         int j1 = PatternHolder_2.ZenithInternal044(Slotx.getStack());
         boolean flag = !this.I1ll1lllI11l1l1I1l1() && j1 > l1il1ili1illil1i$l1i1illlili.lIIIllll1IllI111I1III;
         int k1 = Math.max(1, flag ? l1il1ili1illil1i$l1i1illlili.lIIIllll1IllI111I1III : j1);
         String s = Slotx.getStack().getName().getString();
         this.I11llIlIIl111 = new Autoinventory$II1Il11l111II11IIl(
            Slotx.getStack(),
            s != null && !s.isBlank() ? s : l1il1ili1illil1i$l1i1illlili.lIIl111Ill11lIlI11IlIl1lIIIl,
            k1,
            this.StringHolder_8(i, k1)
         );
         int i1 = flag ? 1 : 0;
         l11I1I1ll1Illll1I1l1111l1II.interactionManager
            .clickSlot(ScreenHandler.syncId, Slotx.id, i1, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
         return flag ? Math.max(0, l1il1ili1illil1i$l1i1illlili.lIIIllll1IllI111I1III - 1) : 0;
      } else {
         return -1;
      }
   }

   private void l1l1Il1l1lII1II111Ill() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null && l11I1I1ll1Illll1I1l1111l1II.interactionManager != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != null
            && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler) {
            ScreenHandler ScreenHandler = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler;
            if (PatternHolder_2.EventImpl_13(ScreenHandler)) {
               this.EventBus(ScreenHandler);
            } else if (this.I1ll1lllI11l1l1I1l1()) {
               this.EventTarget(ScreenHandler);
            } else if (l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle() != null
               && l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle().getString().contains("Покупка предмета")) {
               if (ScreenHandler.slots.size() > 4) {
                  if (this.IlllllIIll1l1I1I11I != ScreenHandler.syncId) {
                     this.IlllllIIll1l1I1I11I = ScreenHandler.syncId;
                     this.IlIIlI1l1IlII1lI1l.reset();
                  } else if (this.IlIIlI1l1IlII1lI1l.HostnameVerifierImpl(100L)) {
                     if (this.lIIll1lI1Il11lllIll >= 10) {
                        this.EventBus(ScreenHandler, 4);
                        this.lIIll1lI1Il11lllIll -= 10;
                        this.IlIIlI1l1IlII1lI1l.reset();
                     } else if (this.lIIll1lI1Il11lllIll > 0) {
                        this.EventBus(ScreenHandler, 3);
                        this.lIIll1lI1Il11lllIll--;
                        this.IlIIlI1l1IlII1lI1l.reset();
                     } else if (this.ZenithInternal028(ScreenHandler)) {
                        this.lll11l111111IllI1lllI1Illl();
                        this.llIIlII1l = false;
                        this.l1lII1lI11IlI1I1lIl1lII = true;
                        this.IlllllIIll1l1I1I11I = -1;
                        this.lI1IIIl1II1111l11lll111IIl1III.reset();
                        this.IlIIlI1l1IlII1lI1l.reset();
                     }
                  }
               }
            }
         }
      }
   }

   private void EventBus(ScreenHandler ScreenHandler) {
      if (this.IIII1Il1lIllIII11 == null) {
         this.llIIlII1l = false;
         this.lI1IIIl1II1111l11lll111IIl1III.reset();
      } else if (this.IlIIlI1l1IlII1lI1l.HostnameVerifierImpl(300L)) {
         int i = this.StringHolder_8(ScreenHandler, this.IIII1Il1lIllIII11);
         this.IlllllIIll1l1I1I11I = -1;
         if (i < 0) {
            if (!this.EventImpl_24(ScreenHandler)) {
               this.llIIlII1l = false;
               this.IlI1l111l1IIlII1II1();
            }
         } else if (this.I1ll1lllI11l1l1I1l1()) {
            this.llIIlII1l = true;
            this.lIIll1lI1Il11lllIll = 0;
            this.IlllllIIll1l1I1I11I = -1;
            this.lI1IIIl1II1111l11lll111IIl1III.reset();
            this.IlIIlI1l1IlII1lI1l.reset();
         } else {
            this.lIIll1lI1Il11lllIll = i;
            this.IlIIlI1l1IlII1lI1l.reset();
         }
      }
   }

   private void EventTarget(ScreenHandler ScreenHandler) {
      if (l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle() != null) {
         String s = l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle().getString();
         if (s.contains("Подтверждение покупки")) {
            int i = this.ZenithInternal095(ScreenHandler);
            if (i >= 0) {
               if (this.IlllllIIll1l1I1I11I != ScreenHandler.syncId) {
                  this.IlllllIIll1l1I1I11I = ScreenHandler.syncId;
                  this.IlIIlI1l1IlII1lI1l.reset();
               } else if (this.IlIIlI1l1IlII1lI1l.HostnameVerifierImpl(100L)) {
                  this.EventBus(ScreenHandler, i);
                  this.llIIlII1l = false;
                  this.l1lII1lI11IlI1I1lIl1lII = true;
                  this.IlllllIIll1l1I1I11I = -1;
                  this.lI1IIIl1II1111l11lll111IIl1III.reset();
                  this.IlIIlI1l1IlII1lI1l.reset();
               }
            }
         }
      }
   }

   private int ZenithInternal095(ScreenHandler ScreenHandler) {
      int i = this.Event(ScreenHandler);
      if (i == 27) {
         return 0;
      } else {
         return i > 27 ? this.StringHolder_8(ScreenHandler, i) : -1;
      }
   }

   private int StringHolder_8(ScreenHandler ScreenHandler, int i) {
      int j = Math.min(i, ScreenHandler.slots.size());

      for (int k = 0; k < j; k++) {
         Slot Slot = ScreenHandler.getSlot(k);
         if (Slot != null && Slot.hasStack()) {
            ItemStack ItemStack = Slot.getStack();
            if (ItemStack.getItem() == Items.PAPER && "[Кyпить]".equals(ItemStack.getName().getString())) {
               return k;
            }
         }
      }

      return -1;
   }

   private int Event(ScreenHandler ScreenHandler) {
      return Math.max(0, ScreenHandler.slots.size() - 36);
   }

   private boolean EventImpl_24(ScreenHandler ScreenHandler) {
      if (ScreenHandler.slots.size() <= 50) {
         return false;
      } else if (l11I1I1ll1Illll1I1l1111l1II.interactionManager != null && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         Slot Slot = ScreenHandler.getSlot(50);
         if (Slot != null && Slot.hasStack()) {
            if (Slot.getStack().getItem() != Items.LIME_DYE) {
               return false;
            } else {
               this.I11llIlIIl111 = null;
               l11I1I1ll1Illll1I1l1111l1II.interactionManager
                  .clickSlot(ScreenHandler.syncId, Slot.id, 0, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
               this.IlllllIIll1l1I1I11I = -1;
               this.IlIIlI1l1IlII1lI1l.reset();
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean ZenithInternal028(ScreenHandler ScreenHandler) {
      if (ScreenHandler.slots.size() > 2) {
         this.EventBus(ScreenHandler, 2);
         return true;
      } else {
         return false;
      }
   }

   private void EventBus(ScreenHandler ScreenHandler, int i) {
      if (i >= 0 && i < ScreenHandler.slots.size()) {
         if (l11I1I1ll1Illll1I1l1111l1II.interactionManager != null && l11I1I1ll1Illll1I1l1111l1II.player != null) {
            l11I1I1ll1Illll1I1l1111l1II.interactionManager
               .clickSlot(ScreenHandler.syncId, ScreenHandler.getSlot(i).id, 0, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
         }
      }
   }

   private void lll11l111111IllI1lllI1Illl() {
      if (this.I11llIlIIl111 != null) {
         this.l1II111l111l11llIlll
            .StringHolder_8(
               this.I11llIlIIl111.IIII1II1I1l11I,
               this.I11llIlIIl111.llIIIIIlIll11IlI1lIll11II,
               this.I11llIlIIl111.Ill1ll1lII1ll1lll,
               this.I11llIlIIl111.l1I111lII1I1
            );
         this.I11llIlIIl111 = null;
      }
   }

   private void lIl1III1llI1l1l1IlIlll() {
      if (this.IIII1Il1lIllIII11 == null) {
         this.l1lII1lI11IlI1I1lIl1lII = false;
         this.lI1IIIl1II1111l11lll111IIl1III.reset();
      } else {
         int i = this.StringHolder_8(this.IIII1Il1lIllIII11.I1l1I111Il1l1111IIl1Il, this.IIII1Il1lIllIII11.l1Il11l1l1);
         if (i < this.IIII1Il1lIllIII11.l11l1IlI1IIl1I1l11111l1llI1I) {
            if (this.IlIIlI1l1IlII1lI1l.HostnameVerifierImpl(700L)) {
               int j = this.IIII1Il1lIllIII11.l11l1IlI1IIl1I1l11111l1llI1I - i;
               Autoinventory$EventBus l1il1ili1illil1i$l1i1illlili = new Autoinventory$EventBus(
                  this.IIII1Il1lIllIII11.I1l1I111Il1l1111IIl1Il,
                  this.IIII1Il1lIllIII11.lIIl111Ill11lIlI11IlIl1lIIIl,
                  j,
                  this.IIII1Il1lIllIII11.l11l1IlI1IIl1I1l11111l1llI1I,
                  this.IIII1Il1lIllIII11.l1Il11l1l1
               );
               this.l1lII1lI11IlI1I1lIl1lII = false;
               this.StringHolder_8(l1il1ili1illil1i$l1i1illlili);
            }
         } else {
            this.lll11l111111IllI1lllI1Illl();
            this.l1lII1lI11IlI1I1lIl1lII = false;
            this.lI1IIIl1II1111l11lll111IIl1III.reset();
         }
      }
   }

   private long EventImpl_21(ItemStack ItemStack) {
      LoreComponent LoreComponent = (LoreComponent)ItemStack.get(DataComponentTypes.LORE);
      if (LoreComponent == null) {
         return Long.MAX_VALUE;
      } else {
         for (Text Text : LoreComponent.lines()) {
            String s = Text.getString().replace(' ', ' ');
            Matcher matcher = lI1IlI111IIlIIIIlIlI1lIl.matcher(s);
            if (matcher.find()) {
               long i = this.PacketHolder_3(matcher.group(1));
               if (i != Long.MAX_VALUE) {
                  return i;
               }
            }
         }

         long j = this.byteHolder_2(ItemStack);
         return j != Long.MAX_VALUE
            ? Math.max(1L, j / (long)Math.max(1, PatternHolder_2.ZenithInternal044(ItemStack)))
            : Long.MAX_VALUE;
      }
   }

   private long EventImpl_13(ItemStack ItemStack) {
      if (!this.I1ll1lllI11l1l1I1l1()) {
         return this.EventImpl_21(ItemStack);
      } else {
         long i = this.byteHolder_2(ItemStack);
         if (i != Long.MAX_VALUE) {
            return i;
         } else {
            long j = this.EventImpl_21(ItemStack);
            return j == Long.MAX_VALUE ? Long.MAX_VALUE : j * (long)Math.max(1, PatternHolder_2.ZenithInternal044(ItemStack));
         }
      }
   }

   private long byteHolder_2(ItemStack ItemStack) {
      LoreComponent LoreComponent = (LoreComponent)ItemStack.get(DataComponentTypes.LORE);
      if (LoreComponent == null) {
         return Long.MAX_VALUE;
      } else {
         for (Text Text : LoreComponent.lines()) {
            String s = Text.getString().replace(' ', ' ');
            Matcher matcher = Ill11ll11lll1Il11lIllll1lI1l1.matcher(s);
            if (matcher.find()) {
               long i = this.PacketHolder_3(matcher.group(1));
               if (i != Long.MAX_VALUE) {
                  return i;
               }
            }
         }

         return Long.MAX_VALUE;
      }
   }

   private long StringHolder_8(long i, int j) {
      return this.I1ll1lllI11l1l1I1l1() ? i : i * (long)j;
   }

   private long PacketHolder_3(String s) {
      try {
         return Long.parseLong(s.replace(" ", "").replace(",", ""));
      } catch (NumberFormatException numberformatexception) {
         return Long.MAX_VALUE;
      }
   }

   private int StringHolder_8(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, int i) {
      int[] aint = this.I11l1llIllll1lI1lll1II1I();
      if (i >= 0 && i < aint.length) {
         int j = aint[i];
         return Math.min(this.getCountMax(li1ll11ilil1ii1lilll1i), j > 0 ? j : this.getDefaultCount(li1ll11ilil1ii1lilll1i));
      } else {
         return this.getDefaultCount(li1ll11ilil1ii1lilll1i);
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

   private int StringHolder_8(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, float f) {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         return 0;
      } else {
         int i = 0;

         for (int j = 0; j < l11I1I1ll1Illll1I1l1111l1II.player.getInventory().size(); j++) {
            ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j);
            if (ItemStack != null && !ItemStack.isEmpty() && li1ll11ilil1ii1lilll1i.isBuy(ItemStack) && this.StringHolder_8(ItemStack, f)) {
               i += Math.max(1, ItemStack.getCount());
            }
         }

         return i;
      }
   }

   private String EventBus(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, float f) {
      return li1ll11ilil1ii1lilll1i.HudElement() + "|" + li1ll11ilil1ii1lilll1i.getItemStack().getItem() + "|" + f;
   }

   private float EventBus(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, int i) {
      if (!this.isDurabilityItem(li1ll11ilil1ii1lilll1i)) {
         return 0.0F;
      } else {
         float[] afloat = this.llll111llll();
         return i >= 0 && i < afloat.length ? afloat[i] : 0.0F;
      }
   }

   private GetDisplayNameHandler_2[] Il1llllll1() {
      return this.I1ll1lllI11l1l1I1l1() ? this.I1II1IIIl1lll1l : this.IIIIll111IlI1I1I1I11I;
   }

   private int[] I11l1llIllll1lI1lll1II1I() {
      return this.I1ll1lllI11l1l1I1l1() ? this.lII1III1IlIl1l1lI1l11I : this.lIl11l11l11l1ll1l1IIIIl1llllII;
   }

   private float[] llll111llll() {
      return this.I1ll1lllI11l1l1I1l1() ? this.lIII1I11Il1IlIIlll11llIIlll1l : this.II11llII1l11lllIIl1I1l1;
   }

   private boolean I1ll1lllI11l1l1I1l1() {
      return "Funtime 1.21".equals(this.l11lIl1l1l());
   }

   private boolean StringHolder_8(ItemStack ItemStack, float f) {
      if (f <= 0.0F) {
         return true;
      } else {
         int i = ItemStack.getMaxDamage();
         if (i <= 0) {
            return false;
         } else {
            float f1 = (float)(i - ItemStack.getDamage()) / (float)i;
            return f1 >= f;
         }
      }
   }

   private boolean isDurabilityItem(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      if (li1ll11ilil1ii1lilll1i == null || li1ll11ilil1ii1lilll1i.getItemStack().isEmpty()) {
         return false;
      } else {
         return "Шлем Солнца".equals(li1ll11ilil1ii1lilll1i.HudElement()) ? false : li1ll11ilil1ii1lilll1i.getItemStack().getMaxDamage() > 0;
      }
   }

   private void IllI1I11I1l() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != null) {
            if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler) {
               l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
            }

            l11I1I1ll1Illll1I1l1111l1II.setScreen(null);
         }
      }
   }
}
