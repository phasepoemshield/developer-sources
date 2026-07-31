package zenith;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public enum StringHolder_9 {
   ll1I111Il1llIlI1l11IlI1I("module.autoPotionBrewing.fireResistance", Items.MAGMA_CREAM, Items.REDSTONE),
   l1lII1Ill("module.autoPotionBrewing.invisibility", Items.GOLDEN_CARROT, Items.FERMENTED_SPIDER_EYE, Items.REDSTONE),
   ll111lIII1l11I1111lllIlII("module.autoPotionBrewing.strength", Items.BLAZE_POWDER, Items.GLOWSTONE_DUST),
   ll11llI11IIlIll1("module.autoPotionBrewing.speed", Items.SUGAR, Items.GLOWSTONE_DUST),
   IIIllllIll111IlIII1lII1("module.autoPotionBrewing.jumpBoost", Items.RABBIT_FOOT, Items.REDSTONE);

   public final String IlI1lllII1IllIl11I1lIIIl;
   private final List<Item> lIlIIII11llIllI1lIlIl;

   private StringHolder_9(String s1, Item... aItem) {
      this.IlI1lllII1IllIl11I1lIIIl = s1;
      this.lIlIIII11llIllI1lIlIl = List.of(aItem);
   }

   public List<Item> I1I1lI111l1l1I() {
      ArrayList arraylist = new ArrayList(this.lIlIIII11llIllI1lIlIl.size() + 1);
      arraylist.add(Items.NETHER_WART);
      arraylist.addAll(this.lIlIIII11llIllI1lIlIl);
      return arraylist;
   }

   public static StringHolder_9 SupplierHolder(String s) {
      for (StringHolder_9 iii1l1lii1lliiil1ll1iill1 : values()) {
         if (iii1l1lii1lliiil1ll1iill1.IlI1lllII1IllIl11I1lIIIl.equals(s)) {
            return iii1l1lii1lliiil1ll1iill1;
         }
      }

      return ll1I111Il1llIlI1l11IlI1I;
   }
}
