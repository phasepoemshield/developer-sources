package zenith;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.component.DataComponentTypes;

public class StringHolder_14 {
   private final String I11llI1Ill;
   private final String Illllll1lIllIIIII11I1l;
   private String displayName;
   private String l1l11Il11I1l1I1I1l1l11II = "";
   private String IlIlIl11lllI11lI1Ill1lIllI = "";
   private String II1l1lIlIll1l111IIlIIII1l1I = "";
   private boolean llII1111IIl1lIl1;
   private boolean I1l111l1ll11lIl1lIl;
   private boolean llI111IIII111lIIIll1lI1l;
   private final List<String> l1l11I11l11l1Il11I1l = new ArrayList<>();
   private final List<String> l1lI11lIIII = new ArrayList<>();
   private final Map<String, longHolder_2> l1llI1IIIIl1 = new HashMap<>();
   private longHolder_2 lll1IIIlIl1lIllll11ll = longHolder_2.lIl1IIl111llIIllIl;
   private longHolder_2 II1lIIll1I1ll1lI = longHolder_2.lIl1IIl111llIIllIl;

   public StringHolder_14(String s, String s1, String s2) {
      this.I11llI1Ill = s;
      this.Illllll1lIllIIIII11I1l = s1;
      this.displayName = s2;

      for (int i = 0; i < 9; i++) {
         this.l1l11I11l11l1Il11I1l.add("");
         this.l1lI11lIIII.add("");
      }
   }

   public boolean llI11lllIII1llI1lI11IllllI1I() {
      return this.l1l11I11l11l1Il11I1l.stream().allMatch(String::isBlank);
   }

   public List<String> IlII111Il1Il() {
      ArrayList arraylist = new ArrayList();

      for (String s : this.l1l11I11l11l1Il11I1l) {
         if (!s.isBlank() && !arraylist.contains(s)) {
            arraylist.add(s);
         }
      }

      return arraylist;
   }

   public Map<String, Integer> IlIIIII1lI1ll() {
      HashMap hashmap = new HashMap();

      for (int i = 0; i < this.l1l11I11l11l1Il11I1l.size(); i++) {
         String s = this.l1l11I11l11l1Il11I1l.get(i);
         if (!s.isBlank()) {
            String s1 = this.ZenithInternal056(i);
            hashmap.put(s1, hashmap.getOrDefault(s1, 0) + 1);
         }
      }

      return hashmap;
   }

   public int macros(String s) {
      return this.IlIIIII1lI1ll().getOrDefault(s, 0);
   }

   public void EventImpl_24(int i, String s) {
      this.l1l11I11l11l1Il11I1l.set(i, s == null ? "" : s);
   }

   public String StringHolder_13(int i) {
      return this.l1l11I11l11l1Il11I1l.get(i);
   }

   public void ZenithInternal028(int i, String s) {
      this.l1lI11lIIII.set(i, s == null ? "" : s);
   }

   public String ZenithInternal072(int i) {
      return this.l1lI11lIIII.get(i);
   }

   public String ZenithInternal056(int i) {
      String s = this.StringHolder_13(i);
      String s1 = this.ZenithInternal072(i);
      return s1.isBlank() ? s : s + "#" + s1;
   }

   public String StringHolder_18(String s) {
      int i = s.indexOf(35);
      return i == -1 ? s : s.substring(0, i);
   }

   public String ZenithInternal130(String s) {
      int i = s.indexOf(35);
      return i == -1 ? "" : s.substring(i + 1);
   }

   public String StringHolder_8(String s, Autocraft Autocraft) {
      return Autocraft.ZenithInternal021(this.StringHolder_18(s), this.ZenithInternal130(s));
   }

   public longHolder_2 GetServerHandler(String s) {
      return this.l1llI1IIIIl1.get(s);
   }

   public boolean StringHolder_8(ItemStack ItemStack, Autocraft Autocraft) {
      return Autocraft.StringHolder_8(ItemStack, this.l1l11Il11I1l1I1I1l1l11II, this.IlIlIl11lllI11lI1Ill1lIllI);
   }

   public String StringHolder_8(Autocraft Autocraft) {
      return Autocraft.ZenithInternal021(this.l1l11Il11I1l1I1I1l1l11II, this.IlIlIl11lllI11lI1Ill1lIllI);
   }

   public ItemStack EventBus(Autocraft Autocraft) {
      String s = this.II1l1lIlIll1l111IIlIIII1l1I.isBlank() ? this.l1l11Il11I1l1I1I1l1l11II : this.II1l1lIlIll1l111IIlIIII1l1I;
      Item Item = Autocraft.EventImpl_34(s);
      ItemStack ItemStack = Item == Items.AIR ? ItemStack.EMPTY : Item.getDefaultStack();
      if (!ItemStack.isEmpty() && this.llII1111IIl1lIl1) {
         ItemStack.set(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true);
      }

      return ItemStack;
   }

   public String GetSocketHandler() {
      return this.I11llI1Ill;
   }

   public String I1llI111I1IlIIlIlIII1lI1() {
      return this.Illllll1lIllIIIII11I1l;
   }

   public String getDisplayName() {
      return this.displayName;
   }

   public void GetMaxSumBuyHandler(String s) {
      this.displayName = s == null ? "" : s;
   }

   public String Ill1I1IIl1l1lIIIlll11I1I1lll1() {
      return this.l1l11Il11I1l1I1I1l1l11II;
   }

   public void FileHolder(String s) {
      this.l1l11Il11I1l1I1I1l1l11II = s == null ? "" : s;
   }

   public String l1II1ll1II1() {
      return this.IlIlIl11lllI11lI1Ill1lIllI;
   }

   public void StringHolder_31(String s) {
      this.IlIlIl11lllI11lI1Ill1lIllI = s == null ? "" : s;
   }

   public void ListHolder_10(String s) {
      this.II1l1lIlIll1l111IIlIIII1l1I = s == null ? "" : s;
   }

   public void SocketFactoryHolder_3(boolean flag) {
      this.llII1111IIl1lIl1 = flag;
   }

   public boolean lIlIlIlI111IlII1lI1I11() {
      return this.I1l111l1ll11lIl1lIl;
   }

   public boolean IIIII1lIIII11llI() {
      return !this.I1l111l1ll11lIl1lIl;
   }

   public void SocketFactoryHolder_2(boolean flag) {
      this.I1l111l1ll11lIl1lIl = flag;
   }

   public boolean IlI1I11Ill1lI1Il11IllII1ll() {
      return this.llI111IIII111lIIIll1lI1l;
   }

   public void SocketFactoryHolder(boolean flag) {
      this.llI111IIII111lIIIll1lI1l = flag;
   }

   public List<String> lIIl1I1IIl1lIl1l() {
      return this.l1l11I11l11l1Il11I1l;
   }

   public List<String> IllI1llIlI11I11II1Ill1I() {
      return this.l1lI11lIIII;
   }

   public Map<String, longHolder_2> lllII1l1I1ll11IlII1lIlll1l1l() {
      return this.l1llI1IIIIl1;
   }

   public longHolder_2 ll1l1IIlIIIIl1l11lll() {
      return this.lll1IIIlIl1lIllll11ll;
   }

   public void StringHolder_8(longHolder_2 iii11l1l1il111lii1i1iil) {
      this.lll1IIIlIl1lIllll11ll = iii11l1l1il111lii1i1iil == null ? longHolder_2.lIl1IIl111llIIllIl : iii11l1l1il111lii1i1iil;
   }

   public longHolder_2 l1IlIIllI1lllIIIIII1ll() {
      return this.II1lIIll1I1ll1lI;
   }

   public void EventBus(longHolder_2 iii11l1l1il111lii1i1iil) {
      this.II1lIIll1I1ll1lI = iii11l1l1il111lii1i1iil == null ? longHolder_2.lIl1IIl111llIIllIl : iii11l1l1il111lii1i1iil;
   }
}
