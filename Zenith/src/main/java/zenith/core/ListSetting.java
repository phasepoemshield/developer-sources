package zenith;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.item.Item;
import net.minecraft.block.Block;

public class ListSetting extends Setting {
   private List<String> l11IIIIII111;
   private static final Gson lll1IlllI1lIIllll = new Gson();

   public void ByteBufferHolder_2(List<String> list) {
      this.l11IIIIII111 = list;
   }

   public ListSetting(String s, List<String> list) {
      this(s, "", list, () -> true);
   }

   public ListSetting(String s, List<String> list, Supplier<Boolean> supplier) {
      this(s, "", list, supplier);
   }

   public ListSetting(String s, String s1, List<String> list, Supplier<Boolean> supplier) {
      super(s, s1);
      this.l11IIIIII111 = list;
   }

   public List<String> I1l11l1IlI1I11ll11I1I1() {
      return this.l11IIIIII111;
   }

   public void PlayerInputHolder(String s) {
      this.l11IIIIII111.add(s);
   }

   public void remove(String s) {
      this.l11IIIIII111.remove(s);
   }

   public boolean contains(String s) {
      return this.l11IIIIII111.contains(s);
   }

   public void StringHolder_8(Block Block) {
      this.PlayerInputHolder(Block.getTranslationKey().replace("block.minecraft.", ""));
   }

   public void StringHolder_8(Item Item) {
      this.PlayerInputHolder(Item.getTranslationKey().replace("item.minecraft.", ""));
   }

   public void EventBus(Block Block) {
      this.remove(Block.getTranslationKey().replace("block.minecraft.", ""));
   }

   public void EventBus(Item Item) {
      this.remove(Item.getTranslationKey().replace("item.minecraft.", ""));
   }

   public boolean EventTarget(Block Block) {
      return this.contains(Block.getTranslationKey().replace("block.minecraft.", ""));
   }

   public boolean EventTarget(Item Item) {
      return this.contains(Item.getTranslationKey().replace("item.minecraft.", ""));
   }

   public void clear() {
      this.l11IIIIII111.clear();
   }

   @Override
   public void safe(JsonObject jsonobject) {
      jsonobject.add(String.valueOf(this.I1llIl1Il1lIII), lll1IlllI1lIIllll.toJsonTree(this.getDescription()));
   }

   @Override
   public void load(JsonObject jsonobject) {
      Type type = new ListSetting$1(this).getType();
      JsonElement jsonelement = jsonobject.get(String.valueOf(this.I1llIl1Il1lIII));
      if (jsonelement != null && jsonelement.isJsonArray()) {
         List list = (List)lll1IlllI1lIIllll.fromJson(jsonelement, type);
         this.ByteBufferHolder_2(list);
      }
   }
}
