package zenith;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.resource.Resource;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.DataComponentTypes;

@ModuleInfo(
   name = "AH Helper",
   category = Category.PLAYER,
   description = "РїРѕРјРѕС‰РЅРёРє РІ РїРѕРёСЃРєРµ РґРµС€РµРІС‹С… РїСЂРµРґРјРµС‚РѕРІ"
)
public final class AhHelper extends Module {
   private static final Pattern lII1l1I11llIlIlI1I = Pattern.compile("[А-Яа-яЁё]+", 0);
   public static final AhHelper Ill1lII1l1ll1I1lIl1lIl = new AhHelper();
   private final ColorSetting I11ll111IlllIll1I1I1l1llll1 = new ColorSetting(
      "module.ahHelper.cheapSlotColor", "module.ahHelper.cheapSlotColor.desc", new ByteBufferHolder(64, 255, 64, 140)
   );
   private final ColorSetting lI1III1IIlIl1 = new ColorSetting(
      "module.ahHelper.goodSlotColor", "module.ahHelper.goodSlotColor.desc", new ByteBufferHolder(255, 255, 64, 140)
   );
   private final ModeSetting IIlIlIll1I1I1l1I = new ModeSetting(
      "module.ahHelper.serverMode",
      "module.ahHelper.serverMode.desc",
      "module.ahHelper.serverAuto",
      "module.ahHelper.serverHolyWorld",
      "module.ahHelper.serverFunTime"
   );
   private final BooleanSetting II11IlllIl1l = new BooleanSetting(
      "module.ahHelper.autoConfirm", "module.ahHelper.autoConfirm.desc", true, this::III11I1lI1I
   );
   private final ModeSetting lll11Il11IlI1l1I1 = new ModeSetting(
      "module.ahHelper.priceFind", "module.ahHelper.priceFind.desc", this::III11I1lI1I, "module.ahHelper.priceFindAutoSell", "module.ahHelper.priceFindSearch"
   );
   private final NumberSetting I111l11l1lIlll1lI111llIIl111II = new NumberSetting(
      "module.ahHelper.discount", 0.95F, 0.1F, 1.0F, 0.01F, "module.ahHelper.discount.desc", "x"
   );
   private final BindSetting lI1llll1 = new BindSetting("module.ahHelper.sellKeyHw", "module.ahHelper.sellKeyHw.desc", -1);
   private final longHolder IlIl1lIl1lllIl1lIl1111lI1lI111 = new longHolder();
   private final longHolder IIIl1l1lI11llIlllII1l1lIl1lI1 = new longHolder();
   private final Map<String, String> IIII1II1IIII11II1 = new HashMap<>();
   private boolean IIll1llIllIl1 = false;
   private AhHelper$II1Il11l111II11IIl I1I1llllIIIl1 = AhHelper$II1Il11l111II11IIl.lI1l1I1I1IlIllI;
   private ItemStack II1111IIIIl1IlIll111l1 = ItemStack.EMPTY;
   private String searchQuery = "";
   private long l1l1Il11I1IIIIll111II = -1L;
   private int llIIl1lI1lIl1III111I1lIlIl = 1;

   private AhHelper() {
   }

   @Override
   public void onEnable() {
      this.Il1llIII1l1I11();
      super.l11l1lII();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.Il1llIII1l1I11();
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void StringHolder_8(KeyEvent i111liliill1iii1iiii1) {
      if (this.Spider() && this.lI1llll1.Elytramotion() != -1 && this.lI1llll1.isVisible()) {
         if (i111liliill1iii1iiii1.StringHolder_5(this.lI1llll1.Elytramotion())) {
            this.IIl1I1lIIl1IIIIIII();
         }
      }
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (this.Spider() && l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
         switch (this.I1I1llllIIIl1) {
            case II1I11lIl1l:
               this.Illl1ll11lI1I();
               break;
            case I111lIIlll1Illll1I:
               this.ll1III();
         }
      }
   }

   @EventTarget
   public void EventBus(TextHolder_2 l1li1l1111ii111i11l) {
      if ((this.II11IlllIl1l.isVisible() && this.II11IlllIl1l.Spider() || this.I1I1llllIIIl1 == AhHelper$II1Il11l111II11IIl.III11Il1l1l)
         && l1li1l1111ii111i11l.Shaderesp().getString().startsWith("▶ Введите /ah sell auto confirm,")) {
         l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendChatCommand("ah sell auto confirm");
         this.I1I1llllIIIl1 = AhHelper$II1Il11l111II11IIl.lI1l1I1I1IlIllI;
      }
   }

   public void StringHolder_8(net.minecraft.client.gui.DrawContext DrawContext, Slot Slot) {
      DrawContext.fill(
         Slot.x,
         Slot.y,
         Slot.x + 16,
         Slot.y + 16,
         this.I11ll111IlllIll1I1I1l1llll1.II11II1lIlIl1IIIlII1I1()
      );
   }

   public void EventBus(net.minecraft.client.gui.DrawContext DrawContext, Slot Slot) {
      DrawContext.fill(
         Slot.x, Slot.y, Slot.x + 16, Slot.y + 16, this.lI1III1IIlIl1.II11II1lIlIl1IIIlII1I1()
      );
   }

   private void IIl1I1lIIl1IIIIIII() {
      if (this.I1I1llllIIIl1 == AhHelper$II1Il11l111II11IIl.lI1l1I1I1IlIllI) {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack();
         if (ItemStack != null && !ItemStack.isEmpty()) {
            this.II1111IIIIl1IlIll111l1 = ItemStack.copy();
            this.searchQuery = "";
            this.l1l1Il11I1IIIIll111II = -1L;
            this.llIIl1lI1lIl1III111I1lIlIl = this.l1I1111ll11lI1lllI1() ? 2 : 1;
            if (this.l1I1111ll11lI1lllI1()) {
               this.searchQuery = this.ByteBufferHolder_2(this.II1111IIIIl1IlIll111l1);
               if (this.searchQuery.isEmpty()) {
                  TextHolder.floatHolder_11("Не удалось получить имя предмета для поиска");
                  this.Il1llIII1l1I11();
                  return;
               }
            }

            this.lIII1l1I1lIllI1llIIlIlll();
            this.IlIl1lIl1lllIl1lIl1111lI1lI111.reset();
            this.IIIl1l1lI11llIlllII1l1lIl1lI1.reset();
         } else {
            TextHolder.floatHolder_11("Возьми предмет в руку");
         }
      }
   }

   private void lIII1l1I1lIllI1llIIlIlll() {
      if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
         if (this.III11I1lI1I()) {
            if (this.lll11Il11IlI1l1I1.ClearHeadersHandler(0)) {
               l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendCommand("ah sell auto");
               this.I1I1llllIIIl1 = AhHelper$II1Il11l111II11IIl.III11Il1l1l;
            } else {
               l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendCommand("ah search");
               this.I1I1llllIIIl1 = AhHelper$II1Il11l111II11IIl.II1I11lIl1l;
            }
         } else {
            if (this.l1I1111ll11lI1lllI1()) {
               l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendCommand("ah search " + this.searchQuery);
               this.I1I1llllIIIl1 = AhHelper$II1Il11l111II11IIl.II1I11lIl1l;
            }
         }
      }
   }

   private void Illl1ll11lI1I() {
      if (this.IIIl1l1lI11llIlllII1l1lIl1lI1.HostnameVerifierImpl(250L)) {
         Integer integer = this.IIl1l1II1I11IllI1I111Ill1();
         if (integer == null) {
            if (this.IlIl1lIl1lllIl1lIl1111lI1lI111.HostnameVerifierImpl(5000L)) {
               TextHolder.floatHolder_11("Не удалось найти цену на аукционе");
               this.Il1llIII1l1I11();
            }
         } else {
            this.l1l1Il11I1IIIIll111II = Math.max(
               1L, (long)Math.round((float)integer.intValue() * this.I111l11l1lIlll1lI111llIIl111II.lll1lI1llll1IIllIIIII1lll())
            );
            if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.currentScreen != null) {
               l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
            }

            TextHolder.EventImpl_27("Найдена цена: " + this.l1l1Il11I1IIIIll111II);
            this.I1I1llllIIIl1 = AhHelper$II1Il11l111II11IIl.I111lIIlll1Illll1I;
            this.IlIl1lIl1lllIl1lIl1111lI1lI111.reset();
            this.IIIl1l1lI11llIlllII1l1lIl1lI1.reset();
         }
      }
   }

   private void ll1III() {
      if (this.l1l1Il11I1IIIIll111II <= 0L) {
         this.Il1llIII1l1I11();
      } else if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() == null) {
         this.Il1llIII1l1I11();
      } else if (l11I1I1ll1Illll1I1l1111l1II.currentScreen == null || this.IlIl1lIl1lllIl1lIl1111lI1lI111.HostnameVerifierImpl(1500L)) {
         if (this.IIIl1l1lI11llIlllII1l1lIl1lI1.HostnameVerifierImpl(250L)) {
            l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendCommand("ah sell " + this.l1l1Il11I1IIIIll111II);
            this.Il1llIII1l1I11();
         }
      }
   }

   private Integer IIl1l1II1I11IllI1I111Ill1() {
      if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != null
         && l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != null) {
         ArrayList arraylist = new ArrayList();
         int i = Math.min(45, l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.slots.size());

         for (int j = 0; j < i; j++) {
            Slot Slot = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getSlot(j);
            ItemStack ItemStack = Slot.getStack();
            if (ItemStack != null && !ItemStack.isEmpty()) {
               long k = this.ZenithInternal128(ItemStack);
               if (k != Long.MAX_VALUE) {
                  arraylist.add((int)Math.min(2147483647L, k));
               }
            }
         }

         if (arraylist.isEmpty()) {
            return null;
         } else {
            arraylist.sort(Comparator.naturalOrder());
            int l = Math.min(Math.max(0, this.llIIl1lI1lIl1III111I1lIlIl - 1), arraylist.size() - 1);
            return (Integer)arraylist.get(l) * this.II1111IIIIl1IlIll111l1.getCount();
         }
      } else {
         return null;
      }
   }

   private long ZenithInternal128(ItemStack ItemStack) {
      int i = PatternHolder_2.longHolder_6(ItemStack);
      if (i == Integer.MAX_VALUE) {
         return Long.MAX_VALUE;
      } else {
         LoreComponent LoreComponent = (LoreComponent)ItemStack.get(DataComponentTypes.LORE);
         return LoreComponent != null
               && LoreComponent.styledLines().stream().<CharSequence>map(Text::getString).collect(Collectors.joining()).contains("только полностью.")
            ? Long.MAX_VALUE
            : (long)(i / ItemStack.getCount());
      }
   }

   private String ByteBufferHolder_2(ItemStack ItemStack) {
      if (ItemStack != null && !ItemStack.isEmpty()) {
         if (ItemStack.getCustomName() != null) {
            String s = this.NotificationsHolder(ItemStack.getName().getString());
            if (!s.isEmpty()) {
               return s;
            }
         }

         return this.floatHolder_3(this.ModuleManager(ItemStack.getItem().getTranslationKey()));
      } else {
         return "";
      }
   }

   private String ModuleManager(String s) {
      this.l11l11lII11lIl1l();
      String s1 = this.IIII1II1IIII11II1.get(s);
      return s1 != null && !s1.isEmpty() ? s1 : I18n.translate(s, new Object[0]);
   }

   private void l11l11lII11lIl1l() {
      if (!this.IIll1llIllIl1 && l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.getResourceManager() != null) {
         this.IIll1llIllIl1 = true;
         Optional optional = l11I1I1ll1Illll1I1l1111l1II.getResourceManager().getResource(Identifier.of("minecraft", "lang/ru_ru.json"));
         if (!optional.isEmpty()) {
            try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(((Resource)optional.get()).getInputStream(), StandardCharsets.UTF_8))) {
               JsonObject jsonobject = JsonParser.parseReader(bufferedreader).getAsJsonObject();

               for (Entry entry : jsonobject.entrySet()) {
                  if (((JsonElement)entry.getValue()).isJsonPrimitive()) {
                     this.IIII1II1IIII11II1.put((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
                  }
               }
            } catch (Exception exception) {
            }
         }
      }
   }

   private String NotificationsHolder(String s) {
      if (s != null && !s.isEmpty()) {
         Matcher matcher = lII1l1I11llIlIlI1I.matcher(s);

         StringBuilder stringbuilder;
         for (stringbuilder = new StringBuilder(); matcher.find(); stringbuilder.append(matcher.group())) {
            if (stringbuilder.length() > 0) {
               stringbuilder.append(' ');
            }
         }

         return this.floatHolder_3(stringbuilder.toString());
      } else {
         return "";
      }
   }

   private String floatHolder_3(String s) {
      return s == null ? "" : s.trim().replaceAll("\\s+", " ");
   }

   private String MinecraftClientHolder_5(String s) {
      return this.floatHolder_3(s).toLowerCase(Locale.ROOT).replace('ё', 'е');
   }

   private String II11l111l1IllII() {
      return l11I1I1ll1Illll1I1l1111l1II.currentScreen != null && l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle() != null
         ? l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle().getString()
         : "";
   }

   private boolean III11I1lI1I() {
      return II1l111II1Il11II111llllIl1.SupplierHolder().III11I1lI1I();
   }

   private boolean l1I1111ll11lI1lllI1() {
      return II1l111II1Il11II111llllIl1.SupplierHolder().Ill1I11IIIlllIIllII1lIl();
   }

   private void Il1llIII1l1I11() {
      this.I1I1llllIIIl1 = AhHelper$II1Il11l111II11IIl.lI1l1I1I1IlIllI;
      this.II1111IIIIl1IlIll111l1 = ItemStack.EMPTY;
      this.searchQuery = "";
      this.l1l1Il11I1IIIIll111II = -1L;
      this.llIIl1lI1lIl1III111I1lIlIl = 1;
      this.IlIl1lIl1lllIl1lIl1111lI1lI111.reset();
      this.IIIl1l1lI11llIlllII1l1lIl1lI1.reset();
   }

   public boolean I1III1I11l() {
      return false;
   }

   public ColorSetting lIIlIllIl11ll() {
      return this.I11ll111IlllIll1I1I1l1llll1;
   }

   public ColorSetting lI11Il1IIllII11IIl111lIllII() {
      return this.lI1III1IIlIl1;
   }

   public ModeSetting l11II11I1111I1l1IllII1l() {
      return this.IIlIlIll1I1I1l1I;
   }

   public BooleanSetting IlIlI1lIl11I1IlII1Il11lII1l() {
      return this.II11IlllIl1l;
   }

   public ModeSetting lIII11lI1lI111I() {
      return this.lll11Il11IlI1l1I1;
   }

   public NumberSetting I11I1II1llI1l() {
      return this.I111l11l1lIlll1lI111llIIl111II;
   }

   public BindSetting l1lIIII1IIIIl1lI1I1II1l1l11II1() {
      return this.lI1llll1;
   }

   public longHolder llllII11IllIIl1IIllIIl1I() {
      return this.IlIl1lIl1lllIl1lIl1111lI1lI111;
   }

   public longHolder III11llI111I() {
      return this.IIIl1l1lI11llIlllII1l1lIl1lI1;
   }

   public Map<String, String> l1llIlllIl11() {
      return this.IIII1II1IIII11II1;
   }

   public boolean l111l11I1II1IIlllI1Il1() {
      return this.IIll1llIllIl1;
   }

   public AhHelper$II1Il11l111II11IIl ll1I11ll1I111lI() {
      return this.I1I1llllIIIl1;
   }

   public ItemStack llIlI111II1lI() {
      return this.II1111IIIIl1IlIll111l1;
   }

   public String I1IlIIlIIllI1l1IlI111lI1IlII() {
      return this.searchQuery;
   }

   public long IIlllllIllIIllIlll1l1l1l1() {
      return this.l1l1Il11I1IIIIll111II;
   }

   public int Il11I111Il11llIII() {
      return this.llIIl1lI1lIl1III111I1lIlIl;
   }
}
