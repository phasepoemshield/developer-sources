package zenith;

import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.Text;
import net.minecraft.registry.RegistryKey;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.ComponentChanges;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.MergedComponentMap;
import zenith.zov.utility.mixin.accessors.ItemStackAccessor;

public final class PatternHolder_2 {
   private static Pattern IIIlll1lIl1l1I1II1l1l1Il1I = Pattern.compile("Цена:\\s*([\\d,\\s]+)");
   private static Pattern ll11l1ll1 = Pattern.compile("Цена:(?:.*?\\{\"text\":\"([\\d ]+)\")");
   private static Pattern I1I11IIlIl = Pattern.compile("Цена за 1 ед\\.:(?:.*?\\{\"text\":\"([\\d ]+)\")");
   private static final Map<ItemStack, NbtCompound> I11l1IlI11l1llIll1llIl1IlI = new LinkedHashMapImpl$1(100, 0.75F, true);
   public static List<String> l1l1lll1111Il1lI11l1Ill = new ArrayList<>();

   public static int ZenithInternal137(String s) {
      return SecureRandomHolder_2(ZenithInternal138(s));
   }

   private static long ZenithInternal138(String s) {
      Matcher matcher = IIIlll1lIl1l1I1II1l1l1Il1I.matcher(s);
      if (matcher.find()) {
         String s1 = matcher.group(1);
         String s2 = s1.replace(",", "").replace(" ", "");
         return PacketHolder_3(s2);
      } else {
         return Long.MAX_VALUE;
      }
   }

   public static boolean ZenithInternal070(ItemStack ItemStack) {
      return ItemStack.getCustomName().getString().contains("★");
   }

   public static int longHolder_6(ItemStack ItemStack) {
      LoreComponent LoreComponent = (LoreComponent)ItemStack.get(DataComponentTypes.LORE);
      return LoreComponent == null
         ? Integer.MAX_VALUE
         : ZenithInternal137(LoreComponent.styledLines().stream().<CharSequence>map(Text::getString).collect(Collectors.joining()));
   }

   public static int ListHolder_6(ItemStack ItemStack) {
      LoreComponent LoreComponent = (LoreComponent)ItemStack.get(DataComponentTypes.LORE);
      return LoreComponent == null
         ? Integer.MAX_VALUE
         : ZenithInternal095(LoreComponent.styledLines().stream().<CharSequence>map(Text::getString).collect(Collectors.joining()), ItemStack.getCount());
   }

   public static int ZenithInternal095(String s, int i) {
      Matcher matcher = I1I11IIlIl.matcher(s);
      if (matcher.find()) {
         String s1 = matcher.group(1).replace(" ", "");
         return SecureRandomHolder_2(PacketHolder_3(s1));
      } else {
         long j = ZenithInternal138(s);
         int k = Math.max(1, i);
         return j == Long.MAX_VALUE ? Integer.MAX_VALUE : SecureRandomHolder_2(Math.max(1L, j / (long)k));
      }
   }

   private static long PacketHolder_3(String s) {
      try {
         return Long.parseLong(s);
      } catch (NumberFormatException numberformatexception) {
         return Long.MAX_VALUE;
      }
   }

   private static int SecureRandomHolder_2(long i) {
      return i > 2147483647L ? Integer.MAX_VALUE : (int)i;
   }

   public static String SecureRandomHolder_2(ItemStack ItemStack) {
      return HostnameVerifierImpl(ItemStack).toString();
   }

   public static String longHolder_7(ItemStack ItemStack) {
      NbtComponent NbtComponent = (NbtComponent)ItemStack.get(DataComponentTypes.CUSTOM_DATA);
      if (NbtComponent != null && NbtComponent.getNbt().contains("sphereEffect")) {
         NbtElement NbtElement = NbtComponent.getNbt().get("sphereEffect");
         net.minecraft.client.MinecraftClient.getInstance().keyboard.setClipboard(NbtElement.toString());
         return NbtElement.toString();
      } else {
         return "";
      }
   }

   public static NbtCompound HostnameVerifierImpl(ItemStack ItemStack) {
      MergedComponentMap MergedComponentMap = ((ItemStackAccessor)ItemStack).getComponents();
      ComponentChanges ComponentChanges = MergedComponentMap.getChanges();
      ClientWorld ClientWorld = net.minecraft.client.MinecraftClient.getInstance().world;
      return ClientWorld == null
         ? new NbtCompound()
         : I11l1IlI11l1llIll1llIl1IlI.computeIfAbsent(
            ItemStack,
            ItemStack -> (NbtCompound)ComponentChanges.CODEC
                  .encodeStart(ClientWorld.getRegistryManager().getOps(NbtOps.INSTANCE), ComponentChanges)
                  .getOrThrow()
         );
   }

   public static String longHolder_4(ItemStack ItemStack) {
      MergedComponentMap MergedComponentMap = ((ItemStackAccessor)ItemStack).getComponents();
      ComponentChanges ComponentChanges = MergedComponentMap.getChanges();
      ClientWorld ClientWorld = net.minecraft.client.MinecraftClient.getInstance().world;
      return ClientWorld == null
         ? ""
         : I11l1IlI11l1llIll1llIl1IlI.computeIfAbsent(
               ItemStack,
               ItemStack -> (NbtCompound)ComponentChanges.CODEC
                     .encodeStart(ClientWorld.getRegistryManager().getOps(NbtOps.INSTANCE), ComponentChanges)
                     .getOrThrow()
            )
            .toString()
            .replaceAll(",?\\s*PublicBukkitValues:\\{[^}]*\\}", "")
            .replaceAll("'\\{[^']*Истeкaeт:[^']*\\}',?", "")
            .replaceAll(",?UUID:\\[I;[-0-9]+,[-0-9]+,[-0-9]+,[-0-9]+]", "")
            .replaceAll("minecraft:[0-9a-f\\-]{36}", "minecraft:UUID");
   }

   public static ArrayList<StringHolder_30> ZenithInternal045(ItemStack ItemStack) {
      ArrayList arraylist = new ArrayList();
      NbtComponent NbtComponent = (NbtComponent)ItemStack.get(DataComponentTypes.CUSTOM_DATA);
      if (NbtComponent != null && NbtComponent.getNbt().contains("Enchantments", 9)) {
         NbtList NbtList = NbtComponent.getNbt().getList("Enchantments", 10);

         for (int i = 0; i < NbtList.size(); i++) {
            NbtCompound NbtCompound = NbtList.getCompound(i);
            String s = NbtCompound.getString("id");
            int j = NbtCompound.getInt("lvl");
            arraylist.add(new ZenithInternal149(s, s, j));
         }
      }

      ItemEnchantmentsComponent ItemEnchantmentsComponent = ItemStack.getEnchantments();

      for (Entry entry : ItemEnchantmentsComponent.getEnchantmentEntries()) {
         String s1 = ((RegistryKey)((RegistryEntry)entry.getKey()).getKey().get()).getValue().toString();
         arraylist.add(new ZenithInternal150(s1, s1, entry.getIntValue()));
      }

      return arraylist;
   }

   public static boolean EventImpl_13(ScreenHandler ScreenHandler) {
      return ScreenHandler.slots.size() == 90 && ScreenHandler.getSlot(49).getStack().getItem() == Items.NETHER_STAR;
   }

   public static boolean byteHolder_2(ScreenHandler ScreenHandler) {
      return ScreenHandler.slots.size() == 63 && ScreenHandler.getSlot(0).getStack().getItem() == Items.LIME_STAINED_GLASS_PANE;
   }

   public static void EventImpl_33(int i) {
   }

   public static int ZenithInternal044(ItemStack ItemStack) {
      return ItemStack.getCount();
   }

   private PatternHolder_2() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
