package zenith;

import zenith.hud.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryOps;
import net.minecraft.registry.Registries;

public class GetMaxSumBuyHandler {
   private String lII111I11I1Il111l;
   private String GetHeightHandler;
   private int count;
   private int slotId;
   private long maxSumBuy;
   private int countBuy;
   private String IlI1I1II1lI;
   private String llllIII11IIl1ll1llI1lII1I;

   public GetMaxSumBuyHandler(String s, String s1, int i, int j, long k, int l, String s2) {
      this(s, s1, i, j, k, l, s2, null);
   }

   public GetMaxSumBuyHandler(String s, String s1, int i, int j, long k, int l, String s2, String s3) {
      this.category = s;
      this.GetHeightHandler = s1;
      this.count = i;
      this.slotId = j;
      this.maxSumBuy = k;
      this.countBuy = l;
      this.description = s2;
      this.llllIII11IIl1ll1llI1lII1I = s3;
   }

   public GetMaxSumBuyHandler() {
   }

   public static GetMaxSumBuyHandler StringHolder_8(ItemStack ItemStack, String s, int i, long j, int k) {
      String s1 = Registries.ITEM.getId(ItemStack.getItem()).toString();
      String s2 = null;

      try {
         net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
         RegistryOps RegistryOps = MinecraftClient.world.getRegistryManager().getOps(JsonOps.INSTANCE);
         DataResult dataresult = ItemStack.CODEC.encodeStart(RegistryOps, ItemStack);
         if (dataresult.result().isPresent()) {
            s2 = ((JsonElement)dataresult.result().get()).toString();
         }
      } catch (Exception exception) {
      }

      return new GetMaxSumBuyHandler(s1, s, ItemStack.getCount(), i, j, k, s2);
   }

   public ItemStack ListHolder_8() {
      if (this.IlI1I1II1lI != null && !this.IlI1I1II1lI.isEmpty()) {
         try {
            net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
            JsonElement jsonelement = JsonParser.parseString(this.IlI1I1II1lI);
            RegistryOps RegistryOps = MinecraftClient.world.getRegistryManager().getOps(JsonOps.INSTANCE);
            DataResult dataresult = ItemStack.CODEC.decode(RegistryOps, jsonelement);
            if (dataresult.result().isPresent()) {
               return (ItemStack)((Pair)dataresult.result().get()).getFirst();
            }
         } catch (Exception exception) {
         }
      }

      Item Item = (Item)Registries.ITEM.get(Identifier.tryParse(this.lII111I11I1Il111l));
      return new ItemStack(Item, this.count);
   }

   public JsonObject save() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("itemId", this.lII111I11I1Il111l);
      if (this.GetHeightHandler != null) {
         jsonobject.addProperty("searchName", this.GetHeightHandler);
      }

      jsonobject.addProperty("count", this.count);
      jsonobject.addProperty("slotId", this.slotId);
      jsonobject.addProperty("maxSumBuy", this.maxSumBuy);
      jsonobject.addProperty("countBuy", this.countBuy);
      if (this.IlI1I1II1lI != null) {
         jsonobject.addProperty("componentsJson", this.IlI1I1II1lI);
      }

      if (this.llllIII11IIl1ll1llI1lII1I != null) {
         jsonobject.addProperty("extraSettingsJson", this.llllIII11IIl1ll1llI1lII1I);
      }

      return jsonobject;
   }

   public void load(JsonObject jsonobject) {
      if (jsonobject.has("itemId")) {
         this.category = jsonobject.get("itemId").getAsString();
      }

      if (jsonobject.has("searchName")) {
         this.GetHeightHandler = jsonobject.get("searchName").getAsString();
      }

      if (jsonobject.has("count")) {
         this.count = jsonobject.get("count").getAsInt();
      }

      if (jsonobject.has("slotId")) {
         this.slotId = jsonobject.get("slotId").getAsInt();
      }

      if (jsonobject.has("maxSumBuy")) {
         this.maxSumBuy = jsonobject.get("maxSumBuy").getAsLong();
      }

      if (jsonobject.has("countBuy")) {
         this.countBuy = jsonobject.get("countBuy").getAsInt();
      }

      if (jsonobject.has("componentsJson")) {
         this.description = jsonobject.get("componentsJson").getAsString();
      }

      if (jsonobject.has("extraSettingsJson")) {
         this.llllIII11IIl1ll1llI1lII1I = jsonobject.get("extraSettingsJson").getAsString();
      }
   }

   public String ListHolder_5() {
      return this.lII111I11I1Il111l;
   }

   public String HudElement() {
      return this.GetHeightHandler;
   }

   public int getCount() {
      return this.count;
   }

   public int getSlotId() {
      return this.slotId;
   }

   public long getMaxSumBuy() {
      return this.maxSumBuy;
   }

   public int getCountBuy() {
      return this.countBuy;
   }

   public String doubleHolder_4() {
      return this.IlI1I1II1lI;
   }

   public String ZenithInternal088() {
      return this.llllIII11IIl1ll1llI1lII1I;
   }

   public void ZenithInternal031(String s) {
      this.category = s;
   }

   public void EventImpl_11(String s) {
      this.GetHeightHandler = s;
   }

   public void setCount(int i) {
      this.count = i;
   }

   public void setSlotId(int i) {
      this.slotId = i;
   }

   public void setMaxSumBuy(long i) {
      this.maxSumBuy = i;
   }

   public void setCountBuy(int i) {
      this.countBuy = i;
   }

   public void StringHolder_20(String s) {
      this.description = s;
   }

   public void doubleHolder_2(String s) {
      this.llllIII11IIl1ll1llI1lII1I = s;
   }
}
