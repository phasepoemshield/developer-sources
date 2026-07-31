package zenith;

import zenith.hud.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.component.DataComponentTypes;

public final class StringHolder_15 {
   public static final String llI11lIll1I11ll1lII = "CLOUD_INV|";
   public static final int lI1lI1l1II1llIIlI1lIlIIIlI11I = 36;
   public static final int IIIIIIlIll1I1II1lIlI = 4;
   private final List<ItemStack> l1IIIllI1Ill11111l11l1I;
   private final List<ItemStack> IIIlIl1l1IlIl;
   private final ItemStack lIlII1llI11llI1IlIlllI11lI1;

   public StringHolder_15(List<ItemStack> list, List<ItemStack> list1, ItemStack ItemStack) {
      this.l1IIIllI1Ill11111l11l1I = List.copyOf(StringHolder_8(list, 36));
      this.IIIlIl1l1IlIl = List.copyOf(StringHolder_8(list1, 4));
      this.lIlII1llI11llI1IlIlllI11lI1 = ItemStack == null ? ItemStack.EMPTY : ItemStack.copy();
   }

   public List<ItemStack> Autoleave() {
      return this.l1IIIllI1Ill11111l11l1I;
   }

   public List<ItemStack> Autorespawn() {
      return this.IIIlIl1l1IlIl;
   }

   public ItemStack Autoinventory() {
      return this.lIlII1llI11llI1IlIlllI11lI1;
   }

   public ItemStack ZenithInternal064(int i) {
      return i >= 0 && i < 9 ? this.l1IIIllI1Ill11111l11l1I.get(i) : ItemStack.EMPTY;
   }

   public ItemStack ZenithInternal021(int i) {
      int j = 9 + i;
      return i >= 0 && j < 36 ? this.l1IIIllI1Ill11111l11l1I.get(j) : ItemStack.EMPTY;
   }

   public int Autotool() {
      int i = 0;

      for (int j = 9; j < 36; j++) {
         if (!this.l1IIIllI1Ill11111l11l1I.get(j).isEmpty()) {
            i++;
         }
      }

      return i;
   }

   public int Autotrap() {
      int i = 0;

      for (int j = 0; j < 9; j++) {
         if (!this.l1IIIllI1Ill11111l11l1I.get(j).isEmpty()) {
            i++;
         }
      }

      return i;
   }

   public String Autoweb() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.add("main", byteHolder(this.l1IIIllI1Ill11111l11l1I));
      jsonobject.add("armor", byteHolder(this.IIIlIl1l1IlIl));
      if (!this.lIlII1llI11llI1IlIlllI11lI1.isEmpty()) {
         jsonobject.add("off", EventTarget(this.lIlII1llI11llI1IlIlllI11lI1));
      }

      return "CLOUD_INV|" + jsonobject.toString();
   }

   public static StringHolder_15 RegistryEntryHolder(String s) {
      if (s != null && s.startsWith("CLOUD_INV|")) {
         try {
            JsonObject jsonobject = JsonParser.parseString(s.substring("CLOUD_INV|".length())).getAsJsonObject();
            List list = StringHolder_8(jsonobject.get("main"), 36);
            List list1 = StringHolder_8(jsonobject.get("armor"), 4);
            ItemStack ItemStack = jsonobject.has("off") ? StringHolder_8(jsonobject.get("off")) : ItemStack.EMPTY;
            return new StringHolder_15(list, list1, ItemStack);
         } catch (Exception exception) {
            return null;
         }
      } else {
         return null;
      }
   }

   public static StringHolder_15 Bowaimbot() {
      net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
      if (MinecraftClient != null && MinecraftClient.player != null) {
         PlayerInventory PlayerInventory = MinecraftClient.player.getInventory();
         return new StringHolder_15(
            PlayerInventory.main, PlayerInventory.armor, PlayerInventory.offHand.isEmpty() ? ItemStack.EMPTY : (ItemStack)PlayerInventory.offHand.get(0)
         );
      } else {
         return null;
      }
   }

   public int Cheststealer() {
      int i = 1;

      for (ItemStack ItemStackx : this.l1IIIllI1Ill11111l11l1I) {
         i = 31 * i + EventBus(ItemStackx);
      }

      for (ItemStack ItemStack : this.IIIlIl1l1IlIl) {
         i = 31 * i + EventBus(ItemStack);
      }

      return 31 * i + EventBus(this.lIlII1llI11llI1IlIlllI11lI1);
   }

   private static int EventBus(ItemStack ItemStack) {
      if (ItemStack != null && !ItemStack.isEmpty()) {
         Identifier Identifier = Registries.ITEM.getId(ItemStack.getItem());
         return 31 * Identifier.hashCode() + Boolean.hashCode(ItemStack.hasGlint());
      } else {
         return 0;
      }
   }

   private static JsonArray byteHolder(List<ItemStack> list) {
      JsonArray jsonarray = new JsonArray();

      for (int i = 0; i < list.size(); i++) {
         ItemStack ItemStack = (ItemStack)list.get(i);
         if (ItemStack != null && !ItemStack.isEmpty()) {
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("slot", i);
            jsonobject.add("item", EventTarget(ItemStack));
            jsonarray.add(jsonobject);
         }
      }

      return jsonarray;
   }

   private static JsonElement EventTarget(ItemStack ItemStack) {
      if (ItemStack != null && !ItemStack.isEmpty()) {
         Identifier Identifier = Registries.ITEM.getId(ItemStack.getItem());
         JsonObject jsonobject = new JsonObject();
         jsonobject.addProperty("id", "minecraft".equals(Identifier.getNamespace()) ? Identifier.getPath() : Identifier.toString());
         if (ItemStack.getCount() > 1) {
            jsonobject.addProperty("c", ItemStack.getCount());
         }

         jsonobject.addProperty("e", ItemStack.hasGlint());
         return jsonobject;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   private static List<ItemStack> StringHolder_8(JsonElement jsonelement, int i) {
      ArrayList arraylist = new ArrayList(i);

      while (arraylist.size() < i) {
         arraylist.add(ItemStack.EMPTY);
      }

      if (jsonelement != null && !jsonelement.isJsonNull()) {
         if (!jsonelement.isJsonArray()) {
            return arraylist;
         } else {
            JsonArray jsonarray = jsonelement.getAsJsonArray();
            if (StringHolder_8(jsonarray)) {
               for (int k = 0; k < jsonarray.size() && k < i; k++) {
                  arraylist.set(k, StringHolder_8(jsonarray.get(k)));
               }

               return arraylist;
            } else {
               for (JsonElement jsonelement1 : jsonarray) {
                  if (jsonelement1 != null && jsonelement1.isJsonObject()) {
                     JsonObject jsonobject = jsonelement1.getAsJsonObject();
                     if (jsonobject.has("slot")) {
                        int j;
                        try {
                           j = jsonobject.get("slot").getAsInt();
                        } catch (Exception exception) {
                           continue;
                        }

                        if (j >= 0 && j < i) {
                           arraylist.set(j, StringHolder_8(jsonobject.get("item")));
                        }
                     }
                  }
               }

               return arraylist;
            }
         }
      } else {
         return arraylist;
      }
   }

   private static boolean StringHolder_8(JsonArray jsonarray) {
      for (JsonElement jsonelement : jsonarray) {
         if (jsonelement != null && !jsonelement.isJsonNull()) {
            if (!jsonelement.isJsonObject()) {
               return true;
            }

            JsonObject jsonobject = jsonelement.getAsJsonObject();
            if (jsonobject.has("slot") && jsonobject.has("item")) {
               continue;
            }

            return true;
         }

         return true;
      }

      return false;
   }

   private static ItemStack StringHolder_8(JsonElement jsonelement) {
      if (jsonelement == null || jsonelement.isJsonNull()) {
         return ItemStack.EMPTY;
      } else if (!jsonelement.isJsonObject()) {
         return ItemStack.EMPTY;
      } else {
         JsonObject jsonobject = jsonelement.getAsJsonObject();
         if (!jsonobject.has("id")) {
            return ItemStack.EMPTY;
         } else {
            String s;
            try {
               s = jsonobject.get("id").getAsString();
            } catch (Exception exception2) {
               return ItemStack.EMPTY;
            }

            Identifier Identifier = StringHolder_6(s);
            if (Identifier == null) {
               return ItemStack.EMPTY;
            } else {
               Item Item = (Item)Registries.ITEM.get(Identifier);
               if (Item == Items.AIR) {
                  return ItemStack.EMPTY;
               } else {
                  ItemStack ItemStack = new ItemStack(Item);
                  if (jsonobject.has("c")) {
                     try {
                        ItemStack.setCount(Math.max(1, jsonobject.get("c").getAsInt()));
                     } catch (Exception exception1) {
                     }
                  }

                  if (jsonobject.has("e")) {
                     try {
                        if (jsonobject.get("e").getAsBoolean()) {
                           ItemStack.set(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true);
                        }
                     } catch (Exception exception) {
                     }
                  }

                  return ItemStack;
               }
            }
         }
      }
   }

   private static Identifier StringHolder_6(String s) {
      if (s == null) {
         return null;
      } else {
         String s1 = s.trim();
         if (s1.isEmpty()) {
            return null;
         } else {
            if (!s1.contains(":")) {
               s1 = "minecraft:" + s1;
            }

            return Identifier.tryParse(s1);
         }
      }
   }

   private static List<ItemStack> StringHolder_8(List<ItemStack> list, int i) {
      ArrayList arraylist = new ArrayList(i);
      if (list != null) {
         for (ItemStack ItemStack : list) {
            arraylist.add(ItemStack == null ? ItemStack.EMPTY : ItemStack.copy());
         }
      }

      while (arraylist.size() < i) {
         arraylist.add(ItemStack.EMPTY);
      }

      return (List<ItemStack>)(arraylist.size() > i ? arraylist.subList(0, i) : arraylist);
   }
}
