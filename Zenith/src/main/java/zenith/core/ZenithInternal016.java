package zenith;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.DataComponentTypes;

public class ZenithInternal016 extends GetDisplayNameHandler_2 {
   private final Map<String, String> HeightHandler;

   public ZenithInternal016(ItemStack ItemStack, String s, String s1, ZenithInternal105$Helper li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil) {
      super(ItemStack, s, s1, li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil);
      this.HeightHandler = new HashMap<>();
   }

   public ZenithInternal016(
      ItemStack ItemStack, String s, ZenithInternal105$Helper li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil, Map<String, String> map
   ) {
      super(ItemStack, s, li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil);
      this.HeightHandler = map;
   }

   public ZenithInternal016(
      ItemStack ItemStack, String s, ZenithInternal105$Helper li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil, String s1, String s2
   ) {
      super(ItemStack, s, li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil);
      this.HeightHandler = new HashMap<>();
      this.HeightHandler.put(s1, s2);
   }

   public ZenithInternal016(
      ItemStack ItemStack, String s, String s1, ZenithInternal105$Helper li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil, String s2, String s3
   ) {
      super(ItemStack, s, s1, li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil);
      this.HeightHandler = new HashMap<>();
      this.HeightHandler.put(s2, s3);
   }

   @Override
   public boolean isBuy(ItemStack ItemStack) {
      if (!super.isBuy(ItemStack)) {
         return false;
      } else {
         NbtComponent NbtComponent = (NbtComponent)ItemStack.get(DataComponentTypes.CUSTOM_DATA);
         if (NbtComponent == null) {
            return false;
         } else {
            NbtCompound NbtCompound = NbtComponent.getNbt();

            for (Entry entry : this.HeightHandler.entrySet()) {
               String s = (String)entry.getKey();
               String s1 = (String)entry.getValue();
               if (!NbtCompound.contains(s)) {
                  return false;
               }

               String s2 = NbtCompound.get(s).toString().replaceAll(",?UUID:\\[I;[-0-9]+,[-0-9]+,[-0-9]+,[-0-9]+]", "");
               String s3 = s1.replaceAll(",?UUID:\\[I;[-0-9]+,[-0-9]+,[-0-9]+,[-0-9]+]", "");
               if (!s2.contains(s3)) {
                  return false;
               }

               boolean flag = s3.startsWith("{") || s3.startsWith("[");
               if (!flag && s2.matches(".*\".*\".*")) {
                  String s4 = "\"" + s3 + "\"";
                  if (!s2.contains(s4)) {
                     return false;
                  }
               }
            }

            return true;
         }
      }
   }
}
