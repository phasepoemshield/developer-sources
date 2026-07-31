package zenith;

import java.util.Locale;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.component.DataComponentTypes;

public final class StringHolder_29 {
   private static final int I1IIlll111 = 0;
   private static final int lll1lI1Il1l1IlIl = 1;
   private static final String IlII1lIIlII1lIl = "custom";
   private final Autocraft IlIIII1lIl;
   private StringHolder_16 lI1I111II1I1I1ll1l11I1lI = StringHolder_16.Il1l1I11l111Ill1lI11ll1();

   public StringHolder_29(Autocraft Autocraft) {
      this.IlIIII1lIl = Autocraft;
   }

   public boolean l1l11lIIlIlll1llI() {
      return !this.lI1I111II1I1I1ll1l11I1lI.l1IllIIlIIl11l1I1IlI1IIl11Il1l();
   }

   public String I11lllll1() {
      return this.lI1I111II1I1I1ll1l11I1lI.l1IllIIlIIl11l1I1IlI1IIl11Il1l() ? "" : this.lI1I111II1I1I1ll1l11I1lI.EventTarget(this.IlIIII1lIl);
   }

   public void reset() {
      this.lI1I111II1I1I1ll1l11I1lI = StringHolder_16.Il1l1I11l111Ill1lI11ll1();
   }

   public void I111lIlI1llIlIIl1I1l1l11lI() {
      String s = this.IlIIII1lIl.l11Il1I1lI11l();
      if (s == null || s.isBlank()) {
         s = "custom";
      }

      this.IlIIII1lIl.lIllll1IlllI1ll1ll();
      this.lI1I111II1I1I1ll1l11I1lI = new StringHolder_16(s);
      this.IlIIII1lIl.l1IlIl1lllllllI1l1();
      Autocraft.l11I1I1ll1Illll1I1l1111l1II.setScreen(null);
   }

   public boolean lIII1llIlIl1ll11lIl1I1Ill1() {
      if (this.lI1I111II1I1I1ll1l11I1lI.l1IllIIlIIl11l1I1IlI1IIl11Il1l()) {
         return false;
      } else if (Autocraft.l11I1I1ll1Illll1I1l1111l1II.player != null && Autocraft.l11I1I1ll1Illll1I1l1111l1II.world != null) {
         CraftingScreenHandler CraftingScreenHandlerx = Autocraft.l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof CraftingScreenHandler CraftingScreenHandlerx ? CraftingScreenHandlerx : null;
         if (CraftingScreenHandlerx != null && this.lI1I111II1I1I1ll1l11I1lI.IIlII1llIllllI1lI() && this.StringHolder_8(CraftingScreenHandlerx)) {
            this.lll1l1II1Illl1lIII1ll();
            return true;
         } else if (CraftingScreenHandlerx == null) {
            if (this.lI1I111II1I1I1ll1l11I1lI.IIlII1llIllllI1lI()) {
               if (this.StringHolder_8(null)) {
                  this.lll1l1II1Illl1lIII1ll();
                  return true;
               }

               this.lI1I111II1I1I1ll1l11I1lI.l111lIII11I11l1II();
            }

            return true;
         } else {
            ItemStack ItemStack = CraftingScreenHandlerx.getSlot(0).getStack();
            if (this.lI1I111II1I1I1ll1l11I1lI.IIlII1llIllllI1lI() && ItemStack.isEmpty()) {
               if (this.StringHolder_8(CraftingScreenHandlerx)) {
                  this.lll1l1II1Illl1lIII1ll();
                  return true;
               } else {
                  this.lI1I111II1I1I1ll1l11I1lI.l111lIII11I11l1II();
                  return true;
               }
            } else {
               if (!ItemStack.isEmpty() && !this.lI1I111II1I1I1ll1l11I1lI.IIlII1llIllllI1lI()) {
                  this.StringHolder_8(CraftingScreenHandlerx, ItemStack);
               }

               if (this.lI1I111II1I1I1ll1l11I1lI.IIlII1llIllllI1lI() && this.StringHolder_8(CraftingScreenHandlerx)) {
                  this.lll1l1II1Illl1lIII1ll();
               }

               return true;
            }
         }
      } else {
         return true;
      }
   }

   private void StringHolder_8(CraftingScreenHandler CraftingScreenHandler, ItemStack ItemStack) {
      String s = ZenithInternal095(ItemStackx.getItem());
      if (!s.isBlank()) {
         String s1 = this.ZenithInternal028(ItemStackx);
         String[] astring = new String[9];
         String[] astring1 = new String[9];
         int i = 0;

         for (int j = 0; j < 9; j++) {
            ItemStack ItemStackx = CraftingScreenHandler.getSlot(1 + j).getStack();
            if (ItemStackx.isEmpty()) {
               astring[j] = "";
               astring1[j] = "";
            } else {
               astring[j] = ZenithInternal095(ItemStackx.getItem());
               astring1[j] = this.ZenithInternal028(ItemStackx);
               if (!astring[j].isBlank()) {
                  i++;
               }
            }
         }

         if (i >= 2) {
            int k = this.StringHolder_8(CraftingScreenHandler, s, s1);
            this.lI1I111II1I1I1ll1l11I1lI.StringHolder_8(s, s1, astring, astring1, k);
         }
      }
   }

   private boolean StringHolder_8(CraftingScreenHandler CraftingScreenHandler) {
      if (!this.lI1I111II1I1I1ll1l11I1lI.l1IllIIlIIl11l1I1IlI1IIl11Il1l() && this.lI1I111II1I1I1ll1l11I1lI.IIlII1llIllllI1lI()) {
         int i = this.StringHolder_8(CraftingScreenHandler, this.lI1I111II1I1I1ll1l11I1lI.Ill1I1IIl1l1lIIIlll11I1I1lll1(), this.lI1I111II1I1I1ll1l11I1lI.l1II1ll1II1());
         return i > this.lI1I111II1I1I1ll1l11I1lI.I1II1I1llIl11();
      } else {
         return false;
      }
   }

   private int StringHolder_8(CraftingScreenHandler CraftingScreenHandler, String s, String s1) {
      int i = 0;

      for (int j = 0; j < 36; j++) {
         ItemStack ItemStackx = Autocraft.l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j);
         if (!ItemStackx.isEmpty() && this.IlIIII1lIl.StringHolder_8(ItemStackx, s, s1)) {
            i += ItemStackx.getCount();
         }
      }

      if (CraftingScreenHandler != null) {
         ItemStack ItemStack = CraftingScreenHandler.getCursorStack();
         if (!ItemStack.isEmpty() && this.IlIIII1lIl.StringHolder_8(ItemStack, s, s1)) {
            i += ItemStack.getCount();
         }
      }

      return i;
   }

   private String ZenithInternal028(ItemStack ItemStack) {
      if (ItemStack == null || ItemStack.isEmpty()) {
         return "";
      } else {
         return ItemStack.get(DataComponentTypes.CUSTOM_NAME) == null ? "" : ItemStack.getName().getString();
      }
   }

   private void lll1l1II1Illl1lIII1ll() {
      StringHolder_14 ill111l1iiill1ll1illi = this.StringHolder_8(this.lI1I111II1I1I1ll1l11I1lI);
      this.lI1I111II1I1I1ll1l11I1lI = StringHolder_16.Il1l1I11l111Ill1lI11ll1();
      if (!this.IlIIII1lIl.Spider()) {
         this.IlIIII1lIl.Ill1ll1I11l1lllIIl();
      }

      if (ill111l1iiill1ll1illi != null) {
         this.IlIIII1lIl.TextHolder_2("Craft saved: " + ill111l1iiill1ll1illi.getDisplayName());
      } else {
         this.IlIIII1lIl.PacketHolder("Unable to save crafted preset");
      }
   }

   private StringHolder_14 StringHolder_8(StringHolder_16 illilliliiiil1) {
      if (illilliliiiil1 != null && !illilliliiiil1.l1IllIIlIIl11l1I1IlI1IIl11Il1l() && illilliliiiil1.IIlII1llIllllI1lI()) {
         String s = illilliliiiil1.I1llI111I1IlIIlIlIII1lI1();
         if (s == null || s.isBlank()) {
            s = "custom";
         }

         String s1 = this.IlIIII1lIl.ZenithInternal021(illilliliiiil1.Ill1I1IIl1l1lIIIlll11I1I1lll1(), illilliliiiil1.l1II1ll1II1());
         String s2 = this.longHolder_3(s, s1);
         String s3 = this.longHolder_6(s2, illilliliiiil1.Ill1I1IIl1l1lIIIlll11I1I1lll1());
         String s4 = s3;
         int i = 1;

         while (this.IlIIII1lIl.ZenithInternal064(s, s4) != null) {
            s4 = s3 + "_" + i++;
         }

         StringHolder_14 ill111l1iiill1ll1illi = new StringHolder_14(s4, s, s2);
         ill111l1iiill1ll1illi.SocketFactoryHolder_2(false);
         ill111l1iiill1ll1illi.SocketFactoryHolder(false);
         ill111l1iiill1ll1illi.FileHolder(illilliliiiil1.Ill1I1IIl1l1lIIIlll11I1I1lll1());
         ill111l1iiill1ll1illi.StringHolder_31(illilliliiiil1.l1II1ll1II1());

         for (int j = 0; j < 9; j++) {
            ill111l1iiill1ll1illi.EventImpl_24(j, illilliliiiil1.GetSocketHandler(j));
            ill111l1iiill1ll1illi.ZenithInternal028(j, illilliliiiil1.ZenithInternal142(j));
         }

         this.IlIIII1lIl.ConnectThread(ill111l1iiill1ll1illi);
         this.IlIIII1lIl.ZenithException_2(s, s4);
         this.IlIIII1lIl.lI11lll1ll11I();
         ZenithClient.getInstance().ZenithInternal115().save();
         return ill111l1iiill1ll1illi;
      } else {
         return null;
      }
   }

   private String longHolder_3(String s, String s1) {
      String s2 = s1 == null ? "" : s1;
      if (s2.isBlank()) {
         s2 = "New Craft";
      }

      String s3 = s2;
      int i = 2;

      while (this.ZenithInternal070(s, s3)) {
         s3 = s2 + " " + i++;
      }

      return s3;
   }

   private boolean ZenithInternal070(String s, String s1) {
      for (StringHolder_14 ill111l1iiill1ll1illi : this.IlIIII1lIl.booleanHolder_4(s)) {
         if (ill111l1iiill1ll1illi.getDisplayName().equalsIgnoreCase(s1)) {
            return true;
         }
      }

      return false;
   }

   private String longHolder_6(String s, String s1) {
      String s2 = s == null ? "" : s.toLowerCase(Locale.ROOT).replace(" ", "_").replaceAll("[^a-z0-9_]+", "");
      if (s2.isBlank()) {
         String s3 = s1 == null ? "" : s1;
         int i = s3.indexOf(58);
         if (i != -1 && i + 1 < s3.length()) {
            s3 = s3.substring(i + 1);
         }

         s2 = s3.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9_]+", "_");
      }

      if (s2.isBlank()) {
         s2 = "item";
      }

      return "captured_" + s2;
   }

   private static String ZenithInternal095(Item Item) {
      return Item != null && Item != Items.AIR ? Registries.ITEM.getId(Item).toString() : "";
   }
}
