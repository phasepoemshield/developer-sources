package zenith;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import net.minecraft.recipe.display.RecipeDisplay;
import net.minecraft.recipe.RecipeDisplayEntry;
import net.minecraft.recipe.display.ShapedCraftingRecipeDisplay;
import net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay;
import net.minecraft.recipe.display.SlotDisplay;
import net.minecraft.util.context.ContextParameterMap;
import net.minecraft.recipe.display.SlotDisplayContexts;
import net.minecraft.util.Hand;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.text.Text;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.ChestType;
import net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket;
import net.minecraft.util.Identifier;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.gui.screen.recipebook.RecipeResultCollection;
import net.minecraft.registry.Registries;
import net.minecraft.component.DataComponentTypes;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.autocraft.AutoCraftEditorScreen;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

@ModuleInfo(
   name = "AutoCraft",
   category = Category.MISC,
   description = "Автоматически крафтит предметы"
)
public final class Autocraft extends Module {
   public static final Autocraft II111lIIll1Ill1IlI1 = new Autocraft();
   private static final int lIIIlIIl1llI1IllI1l1 = 0;
   private static final int I1lllI11l1111lIl111ll = 10;
   private static final int I11Il1Il11IllI1I1lIl1II1l1I1 = 45;
   private static final String I11ll1II11ll = "servers";
   private static final long l11I1l1II1l = 85L;
   private static final long I1III1I11I11l1l1lIIIll1 = 600L;
   private static final float l1I1I1l1I = 0.5F;
   private static final int lIllIlI1111lll1lI = 30;
   private static final int I111l1lIl1l = 5;
   private static final int I11IIIIl111111I1Ill1 = 5;
   private final BooleanSetting IllIll111l = new BooleanSetting("Авто-забор ресурсов", true);
   private final BooleanSetting I1II1IlI1l1ll1l1l1l = new BooleanSetting("Складывать итог", true);
   private final BooleanSetting I1I1lllII11ll111I = new BooleanSetting("Крафтить максимум", true);
   private final ButtonSetting llIIlIlIIll11lIIlIll11Il11 = new ButtonSetting("Открыть меню крафта", this::II1I11I1l111);
   private final List<StringHolder_14> ll1IIIl1IIlI1I11IlII1Il1II = new ArrayList<>();
   private final Map<String, RecipeDisplayEntry> I111Il11l1I111l1I1l = new HashMap<>();
   private final Map<BlockPos, Autocraft$Event> I11I11ll1IllIIlIII1 = new HashMap<>();
   private final List<BlockPos> l1111IIlI1llI11l1 = new ArrayList<>();
   private final Map<String, Integer> IlllIIlI1111lII1I1lI = new HashMap<>();
   private final longHolder Il1I1lll111 = new longHolder();
   private final IsBindingHandler I1111l11lllII = new IsBindingHandler(this);
   private final StringHolder_29 lll1llllIl1IIIlI1 = new StringHolder_29(this);
   private final AutocraftHolder lII1llI1I1I1I11lIlIll = new AutocraftHolder(this);
   private Autocraft$II1Il11l111II11IIl llIllII1IIll1ll1I1I1lIIIl = Autocraft$II1Il11l111II11IIl.llI1ll1l1l11lIIlIlI111;
   private String lIllll1IIIl1l1lIIll11111111lII = "";
   private String l1lIlllIIl = "";
   private String I1I11IlII111II1ll1lIl11 = "";
   private long IIlllI1II111l1II11;
   private int I1I1I1lIlIIl11IIIlIIll;
   private int ll1IIl1l1IlIIIl;
   private int lIIIlI111I1I;
   private int IIlII11l1I1I11ll = -1;
   private int lIIl111111l1I11l11I11l1l1Il = -1;
   private int lIIIII1IIlIll1Il11;
   private int II1I1III1IIlI1IlI;
   private int lllIIll1IIIIllllI1111111ll = -1;
   private int IlIlIIl1ll11;
   private boolean I1I1l11111llI111IIlI;
   private boolean II1IIlII1Il1l1I;
   private boolean ll11I1I1I111l;
   private Autocraft$EventBus l11lllII1ll1IIlllIlI1IlI = Autocraft$EventBus.lll11111llI1lI11I;
   private ItemStack llllI111I111I1III11l = ItemStack.EMPTY;
   private BlockPos I111111II11l;
   private BlockPos lI11l1III11lll;
   private BlockPos Ill11IllI1;
   private BlockPos II11l1IIll1I1lII1lIll1l;
   private floatHolder_6 l1ll1II111lI;

   private Autocraft() {
      for (Setting l1i111illi1i1 : new Setting[]{this.IllIll111l, this.I1II1IlI1l1ll1l1l1l, this.I1I1lllII11ll111I}) {
         l1i111illi1i1.StringHolder_8(() -> false);
      }

      this.lI11lll1ll11I();
   }

   private void II1I11I1l111() {
      l11I1I1ll1Illll1I1l1111l1II.setScreen(new AutoCraftEditorScreen(this));
   }

   @Override
   public void onEnable() {
      this.I1111l11lllII.reset();
      super.l11l1lII();
      this.l1lIlllIIl = "";
      this.lII1llI1I1I1I11lIlIll.reset();
      this.lll1lI111I1lII1I1I1lllI1();
      this.Il1lIl111lIlll1Illll();
      this.lI1111IlIIllllI1I1llIl1();
      this.II1Illl11l1I1lIlIIIIllI1IIllI();
      this.ll11I1I1I111l = false;
      this.II1l11I11I1IIlIlII11l11l();
      this.ReadingThread(true);
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         ScreenHandler ScreenHandler = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler;
         if (ScreenHandler instanceof ScreenHandler) {
            this.StringHolder_8(ScreenHandler);
         }
      }

      this.llIllII1IIll1ll1I1I1lIIIl = Autocraft$II1Il11l111II11IIl.llI1ll1l1l11lIIlIlI111;
      this.I1I11IlII111II1ll1lIl11 = "";
      this.I1I1I1lIlIIl11IIIlIIll = 0;
      this.I1111l11lllII.reset();
      this.lll1llllIl1IIIlI1.reset();
      this.l1lIlllIIl = "";
      this.lII1llI1I1I1I11lIlIll.reset();
      this.lll1lI111I1lII1I1I1lllI1();
      this.Il1lIl111lIlll1Illll();
      this.lI1111IlIIllllI1I1llIl1();
      this.II1Illl11l1I1lIlIIIIllI1IIllI();
      this.ll11I1I1I111l = false;
      this.lIlIl11l1lll1l1I1l1l1ll1IlI1();
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void StringHolder_8(EventImpl_2 i1i11liii111lill1) {
      if (!this.lll1llllIl1IIIlI1.lIII1llIlIl1ll11lIl1I1Ill1()) {
         this.lI11I1llllIIlIll();
      }
   }

   @EventTarget
   public void Event(EventImpl_30 ll1iil11ii) {
      if (this.l1ll1II111lI != null) {
         floatHolder_6 il1ll111liili1ll11liil = this.l1ll1II111lI;
         II1ll1II1l11lI.StringHolder_8(
            new SupplierHolder(
               il1ll111liili1ll11liil,
               () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil),
               llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()
            ),
            5,
            this
         );
      }
   }

   @EventTarget
   public void EventBus(EventImpl_38 lllll1l1iliiiiiiililii11) {
      this.I1111l11lllII.EventTarget(lllll1l1iliiiiiiililii11);
   }

   @EventTarget
   public void StringHolder_8(EventImpl_12 il1i1iiii1l11iii11l11) {
      this.EventBus(il1i1iiii1l11iii11l11);
   }

   public void lI11I1llllIIlIll() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null && l11I1I1ll1Illll1I1l1111l1II.interactionManager != null) {
         if (!this.I1111l11lllII.isBinding()) {
            this.ReadingThread(false);
            this.lI11lll1ll11I();
            StringHolder_14 ill111l1iiill1ll1illi = this.lI1l1I1IIII();
            if (ill111l1iiill1ll1illi == null) {
               this.floatHolder_10("В списке нет серверных рецептов");
            } else if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof CraftingScreenHandler CraftingScreenHandler) {
               this.StringHolder_8(ill111l1iiill1ll1illi, CraftingScreenHandler);
            } else if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof GenericContainerScreenHandler GenericContainerScreenHandler) {
               if (this.llIllII1IIll1ll1I1I1lIIIl != Autocraft$II1Il11l111II11IIl.l1I1l1I11I1lIll1l1l1I1Il1
                  && !GenericContainerScreenHandler.getCursorStack().isEmpty()
                  && this.Il1I1lll111.HostnameVerifierImpl(85L)) {
                  this.StringHolder_8((ScreenHandler)GenericContainerScreenHandler);
                  this.Il1I1lll111.reset();
               } else {
                  this.StringHolder_8(ill111l1iiill1ll1illi, GenericContainerScreenHandler);
               }
            } else if (this.I1I1I1lIlIIl11IIIlIIll > 0 && this.llll1lIIIIIl11II11l1lI11lIl1()) {
               this.I1I1I1lIlIIl11IIIlIIll--;

               this.l1lIlllIIl = switch (this.llIllII1IIll1ll1I1I1lIIIl) {
                  case IlIlIll111 -> "Анализирую сундуки...";
                  case IIIll1llIlI1Il1Il1IIlII1 -> "Открываю верстак...";
                  default -> "Открываю хранилище...";
               };
            } else if (this.llll1lIIIIIl11II11l1lI11lIl1()) {
               this.IIlll1lIII1l1II();
            } else if (this.I1I1l11111llI111IIlI && this.llIllII1IIll1ll1I1I1lIIIl != Autocraft$II1Il11l111II11IIl.I111l1Il11l1l) {
               this.StringHolder_8(ill111l1iiill1ll1illi);
            } else {
               this.EventBus(ill111l1iiill1ll1illi);
            }
         }
      }
   }

   private void StringHolder_8(StringHolder_14 ill111l1iiill1ll1illi, CraftingScreenHandler CraftingScreenHandler) {
      this.llIllII1IIll1ll1I1I1lIIIl = Autocraft$II1Il11l111II11IIl.Il11Illl11Il1I;
      this.l1lIlllIIl = "Крафчу " + ill111l1iiill1ll1illi.StringHolder_8(this);
      if (this.Il1I1lll111.HostnameVerifierImpl(85L)) {
         if (!CraftingScreenHandler.getCursorStack().isEmpty()) {
            this.StringHolder_8(CraftingScreenHandler);
            this.Il1I1lll111.reset();
         } else if (!CraftingScreenHandler.getSlot(0).getStack().isEmpty()) {
            if (!this.EventImpl_21(ill111l1iiill1ll1illi)) {
               this.ll11I1I1I111l = true;
               this.Event("Инвентарь заполнен, складываю результат", true);
            } else {
               l11I1I1ll1Illll1I1l1111l1II.interactionManager.clickSlot(CraftingScreenHandler.syncId, 0, 0, SlotActionType.QUICK_MOVE, l11I1I1ll1Illll1I1l1111l1II.player);
               this.ll11I1I1I111l = true;
               this.lI1111IlIIllllI1I1llIl1();
               this.Il1I1lll111.reset();
            }
         } else if (this.ll11I1I1I111l && this.EventImpl_24(ill111l1iiill1ll1illi)) {
            this.Event("Складываю результат крафта", true);
         } else if (this.ll1IIl1l1IlIIIl > 0) {
            this.ll1IIl1l1IlIIIl--;
            if (this.ll1IIl1l1IlIIIl == 0) {
               String s = this.ll11I1I1I111l ? "Складываю результат крафта" : "Не хватает ресурсов или сервер отклонил рецепт";
               this.Event(s, false);
            }
         } else {
            RecipeDisplayEntry RecipeDisplayEntry = this.I111Il11l1I111l1I1l.get(ill111l1iiill1ll1illi.GetSocketHandler());
            if (RecipeDisplayEntry == null) {
               this.floatHolder_10("Рецепт больше не доступен в книге");
            } else {
               this.StringHolder_8(CraftingScreenHandler, RecipeDisplayEntry);
            }
         }
      }
   }

   private void StringHolder_8(CraftingScreenHandler CraftingScreenHandler, RecipeDisplayEntry RecipeDisplayEntry) {
      if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() == null) {
         this.floatHolder_10("Нет сетевого подключения к серверу");
      } else {
         l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendPacket(new CraftRequestC2SPacket(CraftingScreenHandler.syncId, RecipeDisplayEntry.id(), this.l111Illlll11I1IIIl()));
         this.ll1IIl1l1IlIIIl = 5;
         this.l1lIlllIIl = "Запрашиваю рецепт из книги...";
         this.Il1I1lll111.reset();
      }
   }

   private void lI1111IlIIllllI1I1llIl1() {
      this.ll1IIl1l1IlIIIl = 0;
   }

   private boolean StringHolder_8(GenericContainerScreenHandler GenericContainerScreenHandler) {
      if (this.IIlII11l1I1I11ll != GenericContainerScreenHandler.syncId) {
         this.IIlII11l1I1I11ll = GenericContainerScreenHandler.syncId;
         this.lIIIlI111I1I = 5;
      }

      if (this.lIIIlI111I1I <= 0) {
         return false;
      } else {
         this.lIIIlI111I1I--;

         this.l1lIlllIIl = switch (this.llIllII1IIll1ll1I1I1lIIIl) {
            case IlIlIll111 -> "Считываю содержимое сундука...";
            case ll1l1IIlIII1111 -> "Синхронизирую сундук с ресурсами...";
            case l1I1l1I11I1lIll1l1l1I1Il1 -> "Синхронизирую сундук-склад...";
            default -> "Синхронизирую контейнер...";
         };
         this.Il1I1lll111.reset();
         return true;
      }
   }

   private void II1Illl11l1I1lIlIIIIllI1IIllI() {
      this.IIlII11l1I1I11ll = -1;
      this.lIIIlI111I1I = 0;
   }

   private void StringHolder_8(StringHolder_14 ill111l1iiill1ll1illi, GenericContainerScreenHandler GenericContainerScreenHandler) {
      if (!this.StringHolder_8(GenericContainerScreenHandler)) {
         this.I1I1I1lIlIIl11IIIlIIll = 0;
         if (this.llIllII1IIll1ll1I1I1lIIIl == Autocraft$II1Il11l111II11IIl.IlIlIll111) {
            this.StringHolder_8(GenericContainerScreenHandler, this.lI11l1III11lll);
            l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
            this.II1Illl11l1I1lIlIIIIllI1IIllI();
            this.lI11l1III11lll = null;
            this.llIllII1IIll1ll1I1I1lIIIl = Autocraft$II1Il11l111II11IIl.I111l1Il11l1l;
            this.Il1I1lll111.reset();
         } else if (this.llIllII1IIll1ll1I1I1lIIIl == Autocraft$II1Il11l111II11IIl.ll1l1IIlIII1111) {
            if (!this.I1I11IlII111II1ll1lIl11.isBlank() && this.Ill11IllI1 != null) {
               this.StringHolder_8(ill111l1iiill1ll1illi, GenericContainerScreenHandler, this.I1I11IlII111II1ll1lIl11, this.Ill11IllI1);
            } else {
               this.Event(this.l1lIlllIIl, true);
            }
         } else {
            this.lII1llI1I1I1I11lIlIll.l1lIlI1I1IIIIIlIIIlII11II();
            if (this.llIllII1IIll1ll1I1I1lIIIl == Autocraft$II1Il11l111II11IIl.l1I1l1I11I1lIll1l1l1I1Il1) {
               if (this.II11l1IIll1I1lII1lIll1l != null) {
                  this.StringHolder_8(GenericContainerScreenHandler, this.II11l1IIll1I1lII1lIll1l);
               }

               this.EventBus(ill111l1iiill1ll1illi, GenericContainerScreenHandler);
            } else {
               l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
               this.II1Illl11l1I1lIlIIIIllI1IIllI();
               this.llIllII1IIll1ll1I1I1lIIIl = Autocraft$II1Il11l111II11IIl.llI1ll1l1l11lIIlIlI111;
            }
         }
      }
   }

   private void StringHolder_8(StringHolder_14 ill111l1iiill1ll1illi, GenericContainerScreenHandler GenericContainerScreenHandler, String s, BlockPos BlockPos) {
      String s1 = ill111l1iiill1ll1illi.StringHolder_18(s);
      String s2 = ill111l1iiill1ll1illi.ZenithInternal130(s);
      this.l1lIlllIIl = "Забираю " + this.ZenithInternal021(s1, s2);
      if (this.Il1I1lll111.HostnameVerifierImpl(85L)) {
         if (!this.lII1llI1I1I1I11lIlIll.EventBus(ill111l1iiill1ll1illi, s)) {
            int i = this.IlllIIlI1111lII1I1lI.getOrDefault(s, ill111l1iiill1ll1illi.macros(s));
            int j = this.FinishThread(s1, s2);
            if (j < i && this.ZenithInternal084(s1, s2)) {
               int k = GenericContainerScreenHandler.getInventory().size();
               int l = Math.max(1, i - j);
               int i1 = this.StringHolder_8(GenericContainerScreenHandler, k, s1, s2, l);
               if (i1 != -1) {
                  l11I1I1ll1Illll1I1l1111l1II.interactionManager
                     .clickSlot(GenericContainerScreenHandler.syncId, i1, 0, SlotActionType.QUICK_MOVE, l11I1I1ll1Illll1I1l1111l1II.player);
                  this.lII1llI1I1I1I11lIlIll.EventImpl_24(ill111l1iiill1ll1illi, s);
                  this.Il1I1lll111.reset();
               } else {
                  int j1 = this.lII1llI1I1I1I11lIlIll.Event(ill111l1iiill1ll1illi, s);
                  this.StringHolder_8(GenericContainerScreenHandler, BlockPos);
                  this.lII1llI1I1I1I11lIlIll.StringHolder_8(ill111l1iiill1ll1illi, s, s1, s2, j1 <= this.lII1llI1I1I1I11lIlIll.l11I111Il11I());
                  this.Event("Источник пуст: " + this.ZenithInternal021(s1, s2), true);
               }
            } else {
               this.StringHolder_8(GenericContainerScreenHandler, BlockPos);
               this.lII1llI1I1I1I11lIlIll.EventImpl_24(ill111l1iiill1ll1illi, s);
               this.Event(this.l1lIlllIIl, true);
            }
         }
      }
   }

   private int StringHolder_8(GenericContainerScreenHandler GenericContainerScreenHandler, int i, String s, String s1, int j) {
      int k = -1;
      int l = -1;
      int i1 = -1;
      int j1 = Integer.MAX_VALUE;
      int k1 = -1;
      int l1 = -1;

      for (int i2 = 0; i2 < i; i2++) {
         Slot Slot = GenericContainerScreenHandler.getSlot(i2);
         if (Slot.hasStack() && this.StringHolder_8(Slot.getStack(), s, s1)) {
            int j2 = Slot.getStack().getCount();
            if (j2 == j) {
               return i2;
            }

            if (j2 < j && j2 > l1) {
               l1 = j2;
               k1 = i2;
            }

            if (j2 <= j && j2 > l) {
               l = j2;
               k = i2;
            }

            if (j2 > j && j2 < j1) {
               j1 = j2;
               i1 = i2;
            }
         }
      }

      if (k != -1) {
         return k;
      } else {
         return i1 != -1 ? i1 : k1;
      }
   }

   private void EventBus(StringHolder_14 ill111l1iiill1ll1illi, GenericContainerScreenHandler GenericContainerScreenHandler) {
      this.l1lIlllIIl = "Складываю " + ill111l1iiill1ll1illi.StringHolder_8(this);
      int i = GenericContainerScreenHandler.getInventory().size();
      if (this.l11lllII1ll1IIlllIlI1IlI != Autocraft$EventBus.lll11111llI1lI11I) {
         this.EventBus(GenericContainerScreenHandler, i);
      } else if (!GenericContainerScreenHandler.getCursorStack().isEmpty()) {
         this.l11lllII1ll1IIlllIlI1IlI = Autocraft$EventBus.l11lIII1I1lll11Il1;
         this.EventBus(GenericContainerScreenHandler, i);
      } else if (this.Il1I1lll111.HostnameVerifierImpl(85L)) {
         int j = this.FinishThread(ill111l1iiill1ll1illi.Ill1I1IIl1l1lIIIlll11I1I1lll1(), ill111l1iiill1ll1illi.l1II1ll1II1());
         if (j <= 0 && this.lI1IlIII1lIl1lIIIlll1Ill() <= 1) {
            j = this.ZenithInternal128(ill111l1iiill1ll1illi);
         }

         if (j <= 0) {
            this.lI1llIl1lI1Il11lll11ll1I11l1();
         } else {
            if (this.lIIl111111l1I11l11I11l1l1Il == -1) {
               this.lIIl111111l1I11l11I11l1l1Il = j;
               this.lIIIII1IIlIll1Il11 = 0;
            } else if (j < this.lIIl111111l1I11l11I11l1l1Il) {
               this.lIIIII1IIlIll1Il11 = 0;
               this.lIIl111111l1I11l11I11l1l1Il = j;
            } else if (j == this.lIIl111111l1I11l11I11l1l1Il) {
               this.lIIIII1IIlIll1Il11++;
            } else {
               this.lIIIII1IIlIll1Il11 = 0;
               this.lIIl111111l1I11l11I11l1l1Il = j;
            }

            if (this.StringHolder_8(ill111l1iiill1ll1illi, GenericContainerScreenHandler, i) && this.lIIIII1IIlIll1Il11 < 3) {
               for (int k = i; k < GenericContainerScreenHandler.slots.size(); k++) {
                  Slot Slotx = GenericContainerScreenHandler.getSlot(k);
                  if (Slotx.hasStack() && ill111l1iiill1ll1illi.StringHolder_8(Slotx.getStack(), this)) {
                     this.StringHolder_8(GenericContainerScreenHandler, k);
                     this.Il1I1lll111.reset();
                     return;
                  }
               }

               if (this.lI1IlIII1lIl1lIIIlll1Ill() <= 1) {
                  for (int l = i; l < GenericContainerScreenHandler.slots.size(); l++) {
                     Slot Slot = GenericContainerScreenHandler.getSlot(l);
                     if (Slot.hasStack() && !this.StringHolder_8(ill111l1iiill1ll1illi, Slot.getStack())) {
                        this.StringHolder_8(GenericContainerScreenHandler, l);
                        this.Il1I1lll111.reset();
                        return;
                     }
                  }
               }

               this.lI1llIl1lI1Il11lll11ll1I11l1();
            } else {
               this.StringHolder_8(GenericContainerScreenHandler, this.II11l1IIll1I1lII1lIll1l);
               this.llI1II11l11lllIl1();
            }
         }
      }
   }

   private void StringHolder_8(GenericContainerScreenHandler GenericContainerScreenHandler, int i) {
      if (!GenericContainerScreenHandler.getCursorStack().isEmpty()) {
         this.l11lllII1ll1IIlllIlI1IlI = Autocraft$EventBus.l11lIII1I1lll11Il1;
      } else {
         Slot Slot = GenericContainerScreenHandler.getSlot(i);
         if (Slot.hasStack()) {
            this.llllI111I111I1III11l = Slot.getStack().copy();
            this.lllIIll1IIIIllllI1111111ll = i;
            this.IlIlIIl1ll11 = 2;
            this.l11lllII1ll1IIlllIlI1IlI = Autocraft$EventBus.lI1Illll1IIIIIl1l111llllI1lI1;
            l11I1I1ll1Illll1I1l1111l1II.interactionManager.clickSlot(GenericContainerScreenHandler.syncId, i, 0, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
         }
      }
   }

   private void EventBus(GenericContainerScreenHandler GenericContainerScreenHandler, int i) {
      if (this.l11lllII1ll1IIlllIlI1IlI == Autocraft$EventBus.lI1Illll1IIIIIl1l111llllI1lI1) {
         int k = this.EventTarget(GenericContainerScreenHandler, i);
         if (k != -1) {
            l11I1I1ll1Illll1I1l1111l1II.interactionManager.clickSlot(GenericContainerScreenHandler.syncId, k, 0, SlotActionType.QUICK_MOVE, l11I1I1ll1Illll1I1l1111l1II.player);
         }

         this.IlIlIIl1ll11--;
         if (this.IlIlIIl1ll11 <= 0) {
            this.l11lllII1ll1IIlllIlI1IlI = Autocraft$EventBus.l11lIII1I1lll11Il1;
         }
      } else if (this.l11lllII1ll1IIlllIlI1IlI == Autocraft$EventBus.l11lIII1I1lll11Il1) {
         if (GenericContainerScreenHandler.getCursorStack().isEmpty()) {
            this.EventBus(GenericContainerScreenHandler);
         } else {
            int j = this.ZenithInternal095(GenericContainerScreenHandler, i);
            if (j != -1) {
               l11I1I1ll1Illll1I1l1111l1II.interactionManager.clickSlot(GenericContainerScreenHandler.syncId, j, 0, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
               if (GenericContainerScreenHandler.getCursorStack().isEmpty()) {
                  this.EventBus(GenericContainerScreenHandler);
               }
            } else {
               this.StringHolder_8(GenericContainerScreenHandler, this.II11l1IIll1I1lII1lIll1l);
               this.EventTarget(GenericContainerScreenHandler);
               if (!GenericContainerScreenHandler.getCursorStack().isEmpty()) {
                  this.l1lIlllIIl = "Нет места под hovered-предмет";
               } else {
                  this.llI1II11l11lllIl1();
               }
            }
         }
      }
   }

   private void EventBus(GenericContainerScreenHandler GenericContainerScreenHandler) {
      this.StringHolder_8(GenericContainerScreenHandler, this.II11l1IIll1I1lII1lIll1l);
      this.Il1lIl111lIlll1Illll();
      this.Il1I1lll111.reset();
   }

   private int EventTarget(GenericContainerScreenHandler GenericContainerScreenHandler, int i) {
      if (this.llllI111I111I1III11l.isEmpty()) {
         return -1;
      } else {
         for (int j = i; j < GenericContainerScreenHandler.slots.size(); j++) {
            if (j != this.lllIIll1IIIIllllI1111111ll) {
               Slot Slot = GenericContainerScreenHandler.getSlot(j);
               if (Slot.hasStack() && this.StringHolder_8(Slot.getStack(), this.llllI111I111I1III11l)) {
                  return j;
               }
            }
         }

         return -1;
      }
   }

   private int ZenithInternal095(GenericContainerScreenHandler GenericContainerScreenHandler, int i) {
      ItemStack ItemStack = GenericContainerScreenHandler.getCursorStack();
      if (ItemStack.isEmpty()) {
         return -1;
      } else {
         for (int j = 0; j < i; j++) {
            Slot Slot = GenericContainerScreenHandler.getSlot(j);
            if (Slot.hasStack()
               && this.StringHolder_8(Slot.getStack(), ItemStack)
               && Slot.getStack().getCount() < Slot.getStack().getMaxCount()) {
               return j;
            }
         }

         for (int k = 0; k < i; k++) {
            if (!GenericContainerScreenHandler.getSlot(k).hasStack()) {
               return k;
            }
         }

         return -1;
      }
   }

   private void EventTarget(GenericContainerScreenHandler GenericContainerScreenHandler) {
      if (!GenericContainerScreenHandler.getCursorStack().isEmpty()) {
         if (this.lllIIll1IIIIllllI1111111ll >= 0 && this.lllIIll1IIIIllllI1111111ll < GenericContainerScreenHandler.slots.size()) {
            Slot Slot = GenericContainerScreenHandler.getSlot(this.lllIIll1IIIIllllI1111111ll);
            if (!Slot.hasStack() || this.StringHolder_8(Slot.getStack(), GenericContainerScreenHandler.getCursorStack())) {
               l11I1I1ll1Illll1I1l1111l1II.interactionManager
                  .clickSlot(GenericContainerScreenHandler.syncId, this.lllIIll1IIIIllllI1111111ll, 0, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
            }
         }
      }
   }

   private void llI1II11l11lllIl1() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler) {
         l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
      }

      this.l1lIlllIIl = "Сундук заполнен, ищу другой склад";
      this.llIllII1IIll1ll1I1I1lIIIl = Autocraft$II1Il11l111II11IIl.llI1ll1l1l11lIIlIlI111;
      this.II11l1IIll1I1lII1lIll1l = null;
      this.ll11I1I1I111l = true;
      this.Il1I1lll111.reset();
      this.lll1lI111I1lII1I1I1lllI1();
      this.II1Illl11l1I1lIlIIIIllI1IIllI();
   }

   private void lI1llIl1lI1Il11lll11ll1I11l1() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler) {
         l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
      }

      this.llIllII1IIll1ll1I1I1lIIIl = Autocraft$II1Il11l111II11IIl.llI1ll1l1l11lIIlIlI111;
      this.II11l1IIll1I1lII1lIll1l = null;
      this.Il1I1lll111.reset();
      this.lll1lI111I1lII1I1I1lllI1();
      this.II1Illl11l1I1lIlIIIIllI1IIllI();
      this.ll11I1I1I111l = false;
   }

   private void StringHolder_8(StringHolder_14 ill111l1iiill1ll1illi) {
      this.EventTarget(ill111l1iiill1ll1illi);
      this.ZenithInternal095(ill111l1iiill1ll1illi);
      boolean flag = this.lI1IlIII1lIl1lIIIlll1Ill() <= 1;
      boolean flag1 = this.ll11I1I1I111l && this.byteHolder(ill111l1iiill1ll1illi);
      boolean flag2 = flag && this.ZenithInternal128(ill111l1iiill1ll1illi) > 0;
      boolean flag3 = this.byteHolder_2(ill111l1iiill1ll1illi);
      if (this.I1II1IlI1l1ll1l1l1l.Spider() && (flag1 || flag3 || flag2)) {
         Optional optional = this.EventImpl_13(ill111l1iiill1ll1illi);
         if (!optional.isEmpty()) {
            this.II11l1IIll1I1lII1lIll1l = (BlockPos)optional.get();
            ill111l1iiill1ll1illi.StringHolder_8(longHolder_2.CallableImpl(this.II11l1IIll1I1lII1lIll1l));
            this.l1lIlllIIl = flag ? "Инвентарь полон, складываю..." : "Открываю сундук-склад";
            this.StringHolder_8(this.II11l1IIll1I1lII1lIll1l, Autocraft$II1Il11l111II11IIl.l1I1l1I11I1lIll1l1l1I1Il1);
            return;
         }

         if (flag) {
            this.EventImpl_37("Автокрафт остановлен: нет сундука со свободным местом.");
            return;
         }

         this.ll11I1I1I111l = false;
         this.l1lIlllIIl = "Нет свободного склада, продолжаю крафт";
      }

      String s = this.StringHolder_4(ill111l1iiill1ll1illi);
      if (this.II1I1III1IIlI1IlI <= 0 && !s.isBlank() && !this.StringHolder_8(ill111l1iiill1ll1illi, 1)) {
         this.floatHolder_10("Нет места под ресурсы");
      } else if (!s.isBlank()) {
         if (this.IllIll111l.Spider()) {
            Optional optional1 = this.StringHolder_8(ill111l1iiill1ll1illi, s);
            if (optional1.isPresent()) {
               this.Ill11IllI1 = (BlockPos)optional1.get();
               ill111l1iiill1ll1illi.lllII1l1I1ll11IlII1lIlll1l1l().put(s, longHolder_2.CallableImpl(this.Ill11IllI1));
               this.l1lIlllIIl = "Открываю сундук с ресурсами";
               this.I1I11IlII111II1ll1lIl11 = s;
               this.StringHolder_8(this.Ill11IllI1, Autocraft$II1Il11l111II11IIl.ll1l1IIlIII1111);
            } else {
               this.floatHolder_10("Не найден ресурс: " + this.EventImpl_5(s));
            }
         } else {
            this.floatHolder_10("Не хватает ингредиентов");
         }
      } else if (this.I111111II11l != null) {
         ill111l1iiill1ll1illi.EventBus(longHolder_2.CallableImpl(this.I111111II11l));
         this.l1lIlllIIl = "Открываю верстак";
         this.StringHolder_8(this.I111111II11l, Autocraft$II1Il11l111II11IIl.IIIll1llIlI1Il1Il1IIlII1);
      } else {
         this.floatHolder_10("Рядом нет доступного верстака");
      }
   }

   private void II1l11I11I1IIlIlII11l11l() {
      this.I1I1l11111llI111IIlI = false;
      this.II1IIlII1Il1l1I = false;
      this.l1111IIlI1llI11l1.clear();
      this.I11I11ll1IllIIlIII1.clear();
      this.IlllIIlI1111lII1I1lI.clear();
      this.II1I1III1IIlI1IlI = 0;
      this.lI11l1III11lll = null;
      this.Ill11IllI1 = null;
      this.II11l1IIll1I1lII1lIll1l = null;
      this.I111111II11l = null;
      this.ll11I1I1I111l = false;
      this.llIllII1IIll1ll1I1I1lIIIl = Autocraft$II1Il11l111II11IIl.I111l1Il11l1l;
      this.lll1lI111I1lII1I1I1lllI1();
      this.lIlIl11l1lll1l1I1l1l1ll1IlI1();
      this.II1Illl11l1I1lIlIIIIllI1IIllI();
   }

   private void EventBus(StringHolder_14 ill111l1iiill1ll1illi) {
      if (!this.II1IIlII1Il1l1I) {
         this.I11l111111();
      }

      if (this.l1111IIlI1llI11l1.isEmpty()) {
         this.I1I1l11111llI111IIlI = true;
         this.llIllII1IIll1ll1I1I1lIIIl = Autocraft$II1Il11l111II11IIl.llI1ll1l1l11lIIlIlI111;
         this.EventTarget(ill111l1iiill1ll1illi);
         this.l1lIlllIIl = this.I11I11ll1IllIIlIII1.isEmpty() ? "Сундуки в зоне досягаемости не найдены" : "Анализ сундуков завершен";
      } else {
         this.lI11l1III11lll = this.l1111IIlI1llI11l1.getFirst();
         this.l1lIlllIIl = "Анализирую сундук " + this.EventImpl_24(this.lI11l1III11lll);
         Autocraft$EventTarget Autocraft$illi1l1l1 = this.StringHolder_8(this.lI11l1III11lll, Autocraft$II1Il11l111II11IIl.IlIlIll111);
         if (Autocraft$illi1l1l1 == Autocraft$EventTarget.lI1IIlIIIlI1l11Il || Autocraft$illi1l1l1 == Autocraft$EventTarget.I1llIll111l1lll111lIIII1lII) {
            this.l1111IIlI1llI11l1.removeFirst();
            if (Autocraft$illi1l1l1 == Autocraft$EventTarget.I1llIll111l1lll111lIIII1lII) {
               this.lI11l1III11lll = null;
               this.Il1I1lll111.reset();
            }
         }
      }
   }

   private void I11l111111() {
      this.I11I11ll1IllIIlIII1.clear();
      this.l1111IIlI1llI11l1.clear();
      this.I111111II11l = null;
      this.II1IIlII1Il1l1I = true;
      double d0 = this.IlllIlI1I111IIIlI1I1llI1l();
      BlockPos BlockPos = l11I1I1ll1Illll1I1l1111l1II.player.getBlockPos();
      int i = (int)Math.ceil(d0);
      ArrayList arraylist = new ArrayList();
      HashSet hashset = new HashSet();
      BlockPos.stream(BlockPos.add(-i, -i, -i), BlockPos.add(i, i, i))
         .<BlockPos>map(BlockPos::toImmutable)
         .forEach(
            BlockPos -> {
               BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPosx);
               if (BlockState.getBlock() == Blocks.CRAFTING_TABLE
                  && this.ZenithInternal095(BlockPosx) != null
                  && (
                     this.I111111II11l == null
                        || net.minecraft.util.math.Vec3d.ofCenter(BlockPosx).squaredDistanceTo(l11I1I1ll1Illll1I1l1111l1II.player.getEyePos())
                           < net.minecraft.util.math.Vec3d.ofCenter(this.I111111II11l).squaredDistanceTo(l11I1I1ll1Illll1I1l1111l1II.player.getEyePos())
                  )) {
                  this.I111111II11l = BlockPosx;
               }

               if (this.Event(BlockPosx) && this.ZenithInternal095(BlockPosx) != null && hashset.add(this.StringHolder_8(BlockPosx, BlockState))
                  )
                {
                  arraylist.add(BlockPosx);
               }
            }
         );
      arraylist.sort(
         Comparator.comparingDouble(
            BlockPos -> net.minecraft.util.math.Vec3d.ofCenter(BlockPosx).squaredDistanceTo(l11I1I1ll1Illll1I1l1111l1II.player.getEyePos())
         )
      );
      this.l1111IIlI1llI11l1.addAll(arraylist);
   }

   private BlockPos StringHolder_8(BlockPos BlockPos, BlockState BlockState) {
      if (BlockState.contains(ChestBlock.CHEST_TYPE) && BlockState.get(ChestBlock.CHEST_TYPE) != ChestType.SINGLE) {
         BlockPos BlockPosx = BlockPosx.offset(ChestBlock.getFacing(BlockState));
         return BlockPosx.asLong() < BlockPosx.asLong() ? BlockPosx.toImmutable() : BlockPosx.toImmutable();
      } else {
         return BlockPosx.toImmutable();
      }
   }

   private void StringHolder_8(GenericContainerScreenHandler GenericContainerScreenHandler, BlockPos BlockPos) {
      if (BlockPos != null) {
         int i = GenericContainerScreenHandler.getInventory().size();
         Autocraft$Event Autocraft$liil11l111liil1ll = new Autocraft$Event(this, BlockPos.toImmutable());

         for (int j = 0; j < i; j++) {
            ItemStack ItemStack = GenericContainerScreenHandler.getSlot(j).getStack();
            if (ItemStack.isEmpty()) {
               Autocraft$liil11l111liil1ll.lIIl11111IIlI1lI1Il1I11lI1++;
            } else {
               Autocraft$liil11l111liil1ll.StringHolder_8(
                  new Autocraft$l1IIl11lI(
                     j, ZenithInternal095(ItemStack.getItem()), this.ZenithInternal028(ItemStack), ItemStack.getCount(), ItemStack.getMaxCount()
                  )
               );
            }
         }

         this.I11I11ll1IllIIlIII1.put(BlockPos.toImmutable(), Autocraft$liil11l111liil1ll);
      }
   }

   private void EventTarget(StringHolder_14 ill111l1iiill1ll1illi) {
      if (ill111l1iiill1ll1illi != null) {
         if (this.I111111II11l != null) {
            ill111l1iiill1ll1illi.EventBus(longHolder_2.CallableImpl(this.I111111II11l));
         }

         for (String s : ill111l1iiill1ll1illi.IlIIIII1lI1ll().keySet()) {
            this.StringHolder_8(ill111l1iiill1ll1illi, s)
               .ifPresent(BlockPos -> ill111l1iiill1ll1illi.lllII1l1I1ll11IlII1lIlll1l1l().put(s, longHolder_2.CallableImpl(BlockPos)));
         }

         this.EventImpl_13(ill111l1iiill1ll1illi)
            .ifPresent(BlockPos -> ill111l1iiill1ll1illi.StringHolder_8(longHolder_2.CallableImpl(BlockPos)));
      }
   }

   private void ZenithInternal095(StringHolder_14 ill111l1iiill1ll1illi) {
      this.IlllIIlI1111lII1I1lI.clear();
      this.II1I1III1IIlI1IlI = this.Event(ill111l1iiill1ll1illi);
      int i = Math.max(1, this.II1I1III1IIlI1IlI);

      for (Entry entry : ill111l1iiill1ll1illi.IlIIIII1lI1ll().entrySet()) {
         int j = (Integer)entry.getValue() * i;
         this.IlllIIlI1111lII1I1lI.put((String)entry.getKey(), j);
      }
   }

   private int Event(StringHolder_14 ill111l1iiill1ll1illi) {
      int i = Integer.MAX_VALUE;

      for (Entry entry : ill111l1iiill1ll1illi.IlIIIII1lI1ll().entrySet()) {
         String s = (String)entry.getKey();
         int j = this.FinishThread(ill111l1iiill1ll1illi.StringHolder_18(s), ill111l1iiill1ll1illi.ZenithInternal130(s))
            + this.ZenithInternal061(ill111l1iiill1ll1illi.StringHolder_18(s), ill111l1iiill1ll1illi.ZenithInternal130(s));
         i = Math.min(i, j / Math.max(1, (Integer)entry.getValue()));
      }

      if (i != Integer.MAX_VALUE && i > 0) {
         if (!this.I1I1lllII11ll111I.Spider()) {
            return 1;
         } else {
            int k = 1;
            int l = i;
            int i1 = 0;

            while (k <= l) {
               int j1 = k + (l - k) / 2;
               if (this.StringHolder_8(ill111l1iiill1ll1illi, j1)) {
                  i1 = j1;
                  k = j1 + 1;
               } else {
                  l = j1 - 1;
               }
            }

            return i1;
         }
      } else {
         return 0;
      }
   }

   private boolean StringHolder_8(StringHolder_14 ill111l1iiill1ll1illi, int i) {
      int j = 0;
      int k = this.lI1IlIII1lIl1lIIIlll1Ill();

      for (Entry entry : ill111l1iiill1ll1illi.IlIIIII1lI1ll().entrySet()) {
         String s = (String)entry.getKey();
         String s1 = ill111l1iiill1ll1illi.StringHolder_18(s);
         String s2 = ill111l1iiill1ll1illi.ZenithInternal130(s);
         int l = (Integer)entry.getValue() * i;
         int i1 = this.FinishThread(s1, s2);
         int j1 = Math.max(0, l - i1);
         if (j1 != 0) {
            int k1 = this.StringHolder_19(s1, s2);
            int l1 = Math.max(0, j1 - k1);
            if (l1 > 0) {
               int i2 = Math.max(1, this.PacketHolder_2(s1));
               j += (l1 + i2 - 1) / i2;
               if (j > k) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   private boolean l111Illlll11I1IIIl() {
      return true;
   }

   private boolean EventImpl_24(StringHolder_14 ill111l1iiill1ll1illi) {
      return !this.I1II1IlI1l1ll1l1l1l.Spider()
         ? false
         : !this.ZenithInternal028(ill111l1iiill1ll1illi) || this.byteHolder_2(ill111l1iiill1ll1illi) || !this.EventImpl_21(ill111l1iiill1ll1illi);
   }

   private boolean ZenithInternal028(StringHolder_14 ill111l1iiill1ll1illi) {
      for (Entry entry : ill111l1iiill1ll1illi.IlIIIII1lI1ll().entrySet()) {
         String s = (String)entry.getKey();
         if (this.FinishThread(ill111l1iiill1ll1illi.StringHolder_18(s), ill111l1iiill1ll1illi.ZenithInternal130(s)) < (Integer)entry.getValue()) {
            return false;
         }
      }

      return true;
   }

   private boolean EventImpl_21(StringHolder_14 ill111l1iiill1ll1illi) {
      return ill111l1iiill1ll1illi.Ill1I1IIl1l1lIIIlll11I1I1lll1().isBlank()
         ? false
         : this.StringHolder_19(ill111l1iiill1ll1illi.Ill1I1IIl1l1lIIIlll11I1I1lll1(), ill111l1iiill1ll1illi.l1II1ll1II1()) > 0
            || this.lI1IlIII1lIl1lIIIlll1Ill() > 0;
   }

   private boolean ZenithInternal084(String s, String s1) {
      return this.StringHolder_19(s, s1) > 0 || this.lI1IlIII1lIl1lIIIlll1Ill() > 0;
   }

   private int StringHolder_19(String s, String s1) {
      int i = 0;

      for (int j = 0; j < 36; j++) {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j);
         if (!ItemStack.isEmpty() && this.StringHolder_8(ItemStack, s, s1)) {
            i += Math.max(0, ItemStack.getMaxCount() - ItemStack.getCount());
         }
      }

      return i;
   }

   private int ZenithInternal061(String s, String s1) {
      int i = 0;

      for (Autocraft$Event Autocraft$liil11l111liil1ll : this.I11I11ll1IllIIlIII1.values()) {
         i += Autocraft$liil11l111liil1ll.ClearHeadersHandler(s, s1);
      }

      return i;
   }

   private Optional<BlockPos> StringHolder_8(StringHolder_14 ill111l1iiill1ll1illi, String s) {
      String s1 = ill111l1iiill1ll1illi.StringHolder_18(s);
      String s2 = ill111l1iiill1ll1illi.ZenithInternal130(s);
      return this.I11I11ll1IllIIlIII1
         .values()
         .stream()
         .filter(Autocraft$liil11l111liil1ll -> Autocraft$liil11l111liil1ll.ClearHeadersHandler(s1, s2) > 0)
         .sorted(
            Comparator.<Autocraft$Event>comparingInt(
                  Autocraft$liil11l111liil1ll -> Autocraft$liil11l111liil1ll.ClearHeadersHandler(s1, s2)
               )
               .reversed()
               .thenComparingDouble(
                  Autocraft$liil11l111liil1ll -> net.minecraft.util.math.Vec3d.ofCenter(Autocraft$liil11l111liil1ll.I1lI1IIIl11I1lll1Ill1)
                        .squaredDistanceTo(l11I1I1ll1Illll1I1l1111l1II.player.getEyePos())
               )
         )
         .map(Autocraft$liil11l111liil1ll -> Autocraft$liil11l111liil1ll.I1lI1IIIl11I1lll1Ill1)
         .findFirst();
   }

   private Optional<BlockPos> EventImpl_13(StringHolder_14 ill111l1iiill1ll1illi) {
      String s = ill111l1iiill1ll1illi.Ill1I1IIl1l1lIIIlll11I1I1lll1();
      String s1 = ill111l1iiill1ll1illi.l1II1ll1II1();
      return this.I11I11ll1IllIIlIII1
         .values()
         .stream()
         .filter(Autocraft$liil11l111liil1ll -> Autocraft$liil11l111liil1ll.StringHolder_5(s, s1))
         .sorted(
            Comparator.comparingDouble(
               Autocraft$liil11l111liil1ll -> net.minecraft.util.math.Vec3d.ofCenter(Autocraft$liil11l111liil1ll.I1lI1IIIl11I1lll1Ill1)
                     .squaredDistanceTo(l11I1I1ll1Illll1I1l1111l1II.player.getEyePos())
            )
         )
         .map(Autocraft$liil11l111liil1ll -> Autocraft$liil11l111liil1ll.I1lI1IIIl11I1lll1Ill1)
         .findFirst();
   }

   private Autocraft$EventTarget StringHolder_8(BlockPos BlockPos, Autocraft$II1Il11l111II11IIl Autocraft$ii1il11l111ii11iil) {
      if (BlockPos != null && this.Il1I1lll111.HostnameVerifierImpl(85L)) {
         BlockHitResult BlockHitResult = this.ZenithInternal095(BlockPos);
         if (BlockHitResult == null) {
            this.l1lIlllIIl = "Нет луча до блока " + this.EventImpl_24(BlockPos);
            this.lIlIl11l1lll1l1I1l1l1ll1IlI1();
            return Autocraft$EventTarget.I1llIll111l1lll111lIIII1lII;
         } else {
            this.l1ll1II111lI = ZenithInternal131.longHolder_6(BlockHitResult.getPos());
            if (!this.EventTarget(BlockPos)) {
               this.l1lIlllIIl = "Поворачиваюсь к " + this.EventImpl_24(BlockPos);
               return Autocraft$EventTarget.l1I1I1II11I;
            } else {
               ZenithInternal066.StringHolder_8(BlockHitResult, Hand.MAIN_HAND);
               this.llIllII1IIll1ll1I1I1lIIIl = Autocraft$ii1il11l111ii11iil;
               this.I1I1I1lIlIIl11IIIlIIll = 30;
               this.Il1I1lll111.reset();
               this.II1Illl11l1I1lIlIIIIllI1IIllI();
               this.lIlIl11l1lll1l1I1l1l1ll1IlI1();
               return Autocraft$EventTarget.lI1IIlIIIlI1l11Il;
            }
         }
      } else {
         return Autocraft$EventTarget.l1I1I1II11I;
      }
   }

   private boolean EventTarget(BlockPos BlockPos) {
      floatHolder_6 il1ll111liili1ll11liil = II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1();
      BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(
         l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F),
         il1ll111liili1ll11liil,
         this.IlllIlI1I111IIIlI1I1llI1l(),
         BlockHitResult -> BlockHitResultx != null && BlockHitResultx.getBlockPos().equals(BlockPos)
      );
      return BlockHitResult != null && BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS && BlockHitResult.getBlockPos().equals(BlockPos);
   }

   private BlockHitResult ZenithInternal095(BlockPos BlockPos) {
      net.minecraft.util.math.Vec3d Vec3dxx = net.minecraft.util.math.Vec3d.ofCenter(BlockPos);
      ArrayList arraylist = new ArrayList();
      arraylist.add(Vec3dxx);

      for (Direction Direction : Direction.values()) {
         arraylist.add(Vec3dxx.add(net.minecraft.util.math.Vec3d.of(Direction.getVector()).multiply(0.5)));
      }

      net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
      double d0 = this.IlllIlI1I111IIIlI1I1llI1l();

      for (net.minecraft.util.math.Vec3d Vec3dxx : arraylist) {
         floatHolder_6 il1ll111liili1ll11liil = ZenithInternal131.longHolder_6(Vec3dxx);
         BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(
            Vec3dx, il1ll111liili1ll11liil, d0, BlockHitResult -> BlockHitResultx != null && BlockHitResultx.getBlockPos().equals(BlockPos)
         );
         if (BlockHitResult != null && BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS && BlockHitResult.getBlockPos().equals(BlockPos)) {
            return BlockHitResult;
         }
      }

      return null;
   }

   private void IIlll1lIII1l1II() {
      this.lIlIl11l1lll1l1I1l1l1ll1IlI1();
      this.II1Illl11l1I1lIlIIIIllI1IIllI();
      if (this.llIllII1IIll1ll1I1I1lIIIl == Autocraft$II1Il11l111II11IIl.IlIlIll111) {
         this.lI11l1III11lll = null;
         this.llIllII1IIll1ll1I1I1lIIIl = Autocraft$II1Il11l111II11IIl.I111l1Il11l1l;
      } else if (this.llIllII1IIll1ll1I1I1lIIIl == Autocraft$II1Il11l111II11IIl.ll1l1IIlIII1111) {
         this.floatHolder_10("Не удалось открыть сундук с ресурсами");
      } else if (this.llIllII1IIll1ll1I1I1lIIIl == Autocraft$II1Il11l111II11IIl.l1I1l1I11I1lIll1l1l1I1Il1) {
         this.floatHolder_10("Не удалось открыть сундук-склад");
      } else {
         if (this.llIllII1IIll1ll1I1I1lIIIl == Autocraft$II1Il11l111II11IIl.IIIll1llIlI1Il1Il1IIlII1) {
            this.floatHolder_10("Не удалось открыть верстак");
         }
      }
   }

   private void lIlIl11l1lll1l1I1l1l1ll1IlI1() {
      this.l1ll1II111lI = null;
   }

   private boolean llll1lIIIIIl11II11l1lI11lIl1() {
      return this.llIllII1IIll1ll1I1I1lIIIl == Autocraft$II1Il11l111II11IIl.IlIlIll111
         || this.llIllII1IIll1ll1I1I1lIIIl == Autocraft$II1Il11l111II11IIl.ll1l1IIlIII1111
         || this.llIllII1IIll1ll1I1I1lIIIl == Autocraft$II1Il11l111II11IIl.l1I1l1I11I1lIll1l1l1I1Il1
         || this.llIllII1IIll1ll1I1I1lIIIl == Autocraft$II1Il11l111II11IIl.IIIll1llIlI1Il1Il1IIlII1;
   }

   private boolean Event(BlockPos BlockPos) {
      BlockEntity BlockEntity = l11I1I1ll1Illll1I1l1111l1II.world.getBlockEntity(BlockPos);
      return BlockEntity instanceof ChestBlockEntity || BlockEntity instanceof BarrelBlockEntity || BlockEntity instanceof ShulkerBoxBlockEntity;
   }

   private double IlllIlI1I111IIIlI1I1llI1l() {
      return l11I1I1ll1Illll1I1l1111l1II.player.getBlockInteractionRange() + 0.15;
   }

   private String EventImpl_24(BlockPos BlockPos) {
      return BlockPos == null ? "?" : BlockPos.getX() + " " + BlockPos.getY() + " " + BlockPos.getZ();
   }

   private boolean byteHolder_2(StringHolder_14 ill111l1iiill1ll1illi) {
      if (ill111l1iiill1ll1illi.Ill1I1IIl1l1lIIIlll11I1I1lll1().isBlank()) {
         return false;
      } else {
         int i = 0;

         for (int j = 0; j < 36; j++) {
            ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j);
            if (!ItemStack.isEmpty() && ill111l1iiill1ll1illi.StringHolder_8(ItemStack, this)) {
               i++;
            }
         }

         return (float)i / 36.0F >= 0.5F;
      }
   }

   private boolean byteHolder(StringHolder_14 ill111l1iiill1ll1illi) {
      return !ill111l1iiill1ll1illi.Ill1I1IIl1l1lIIIlll11I1I1lll1().isBlank()
         && this.FinishThread(ill111l1iiill1ll1illi.Ill1I1IIl1l1lIIIlll11I1I1lll1(), ill111l1iiill1ll1illi.l1II1ll1II1()) > 0;
   }

   private String StringHolder_4(StringHolder_14 ill111l1iiill1ll1illi) {
      for (Entry entry : ill111l1iiill1ll1illi.IlIIIII1lI1ll().entrySet()) {
         String s = (String)entry.getKey();
         int i = this.IlllIIlI1111lII1I1lI.getOrDefault(s, (Integer)entry.getValue());
         int j = this.FinishThread(ill111l1iiill1ll1illi.StringHolder_18(s), ill111l1iiill1ll1illi.ZenithInternal130(s));
         if (j < i) {
            return s;
         }
      }

      return "";
   }

   private int lI1IlIII1lIl1lIIIlll1Ill() {
      int i = 0;

      for (int j = 0; j < 36; j++) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j).isEmpty()) {
            i++;
         }
      }

      return i;
   }

   private int FinishThread(String s, String s1) {
      int i = 0;

      for (int j = 0; j < 36; j++) {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j);
         if (!ItemStack.isEmpty() && this.StringHolder_8(ItemStack, s, s1)) {
            i += ItemStack.getCount();
         }
      }

      return i;
   }

   private int ZenithInternal128(StringHolder_14 ill111l1iiill1ll1illi) {
      int i = 0;

      for (int j = 0; j < 36; j++) {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j);
         if (!ItemStack.isEmpty() && !this.StringHolder_8(ill111l1iiill1ll1illi, ItemStack)) {
            i += ItemStack.getCount();
         }
      }

      return i;
   }

   private boolean StringHolder_8(StringHolder_14 ill111l1iiill1ll1illi, GenericContainerScreenHandler GenericContainerScreenHandler, int i) {
      String s = ill111l1iiill1ll1illi.Ill1I1IIl1l1lIIIlll11I1I1lll1();
      String s1 = ill111l1iiill1ll1illi.l1II1ll1II1();

      for (int j = 0; j < i; j++) {
         Slot Slot = GenericContainerScreenHandler.getSlot(j);
         if (!Slot.hasStack()) {
            return true;
         }

         ItemStack ItemStack = Slot.getStack();
         if (this.StringHolder_8(ItemStack, s, s1) && ItemStack.getCount() < ItemStack.getMaxCount()) {
            return true;
         }
      }

      return false;
   }

   private boolean StringHolder_8(StringHolder_14 ill111l1iiill1ll1illi, ItemStack ItemStack) {
      for (Entry entry : ill111l1iiill1ll1illi.IlIIIII1lI1ll().entrySet()) {
         String s = (String)entry.getKey();
         if (this.StringHolder_8(ItemStack, ill111l1iiill1ll1illi.StringHolder_18(s), ill111l1iiill1ll1illi.ZenithInternal130(s))) {
            return true;
         }
      }

      return false;
   }

   private boolean StringHolder_8(Item Item, String s) {
      return Objects.equals(Registries.ITEM.getId(Item).toString(), s);
   }

   public boolean StringHolder_8(ItemStack ItemStack, String s, String s1) {
      if (ItemStack == null || ItemStack.isEmpty() || !this.StringHolder_8(ItemStack.getItem(), s)) {
         return false;
      } else if (s1 != null && !s1.isBlank()) {
         String s2 = ItemStack.getName().getString();
         return s2.equalsIgnoreCase(s1) || s2.toLowerCase(Locale.ROOT).contains(s1.toLowerCase(Locale.ROOT));
      } else {
         return true;
      }
   }

   private boolean StringHolder_8(ItemStack ItemStack, ItemStack ItemStack) {
      if (ItemStackxxx != null && ItemStackxx != null && !ItemStackxxx.isEmpty() && !ItemStackxx.isEmpty()) {
         ItemStack ItemStackx = ItemStackxxx.copy();
         ItemStack ItemStackxx = ItemStackxx.copy();
         ItemStackx.setCount(1);
         ItemStackxx.setCount(1);
         return ItemStack.areItemsEqual(ItemStackx, ItemStackxx) && ItemStack.areEqual(ItemStackx, ItemStackxx);
      } else {
         return false;
      }
   }

   private void StringHolder_8(ScreenHandler ScreenHandler) {
      ItemStack ItemStack = ScreenHandler.getCursorStack();
      if (!ItemStack.isEmpty()) {
         for (int i = 10; i <= 45 && i < ScreenHandler.slots.size(); i++) {
            if (ScreenHandler.getSlot(i).getStack().isEmpty()) {
               l11I1I1ll1Illll1I1l1111l1II.interactionManager.clickSlot(ScreenHandler.syncId, i, 0, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
               return;
            }
         }

         l11I1I1ll1Illll1I1l1111l1II.interactionManager
            .clickSlot(ScreenHandler.syncId, (char)-999, 0, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
      }
   }

   private void floatHolder_10(String s) {
      this.l1lIlllIIl = s;
      this.I1I11IlII111II1ll1lIl11 = "";
      this.llIllII1IIll1ll1I1I1lIIIl = Autocraft$II1Il11l111II11IIl.llI1ll1l1l11lIIlIlI111;
      this.lII1llI1I1I1I11lIlIll.l1lIlI1I1IIIIIlIIIlII11II();
      this.lI1111IlIIllllI1I1llIl1();
      this.lIlIl11l1lll1l1I1l1l1ll1IlI1();
      this.II1Illl11l1I1lIlIIIIllI1IIllI();
   }

   private void Event(String s, boolean flag) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler) {
         l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
      }

      this.Ill11IllI1 = null;
      this.floatHolder_10(s);
      if (flag) {
         this.Il1I1lll111.reset();
      }
   }

   private void lll1lI111I1lII1I1I1lllI1() {
      this.lIIl111111l1I11l11I11l1l1Il = -1;
      this.lIIIII1IIlIll1Il11 = 0;
      this.Il1lIl111lIlll1Illll();
   }

   private void Il1lIl111lIlll1Illll() {
      this.l11lllII1ll1IIlllIlI1IlI = Autocraft$EventBus.lll11111llI1lI11I;
      this.llllI111I111I1III11l = ItemStack.EMPTY;
      this.lllIIll1IIIIllllI1111111ll = -1;
      this.IlIlIIl1ll11 = 0;
   }

   private void EventBus(EventImpl_12 il1i1iiii1l11iii11l11) {
      if (this.Spider() || this.I1111l11lllII.isBinding() || this.lll1llllIl1IIIlI1.l1l11lIIlIlll1llI()) {
         String s;
         if (this.I1111l11lllII.isBinding()) {
            s = this.I1111l11lllII.I11lllll1();
         } else if (this.lll1llllIl1IIIlI1.l1l11lIIlIlll1llI()) {
            s = this.lll1llllIl1IIIlI1.I11lllll1();
         } else {
            s = this.l1lIlllIIl;
         }

         if (s != null && !s.isBlank()) {
            Font font = Fonts.NEW_REGULAR.getFont(8.0F);
            float f = font.width(s) + 14.0F;
            float f1 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() / 2.0F - f / 2.0F;
            float f2 = (float)(l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() - 54);
            ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
            ByteBufferHolder il1iliilli1l1iill = zenithstyle == null
               ? new ByteBufferHolder(14, 14, 16, 160)
               : zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().EventImpl_36(160);
            il1i1iiii1l11iii11l11.HitParticles().StringHolder_8(f1, f2, f, 16.0F, floatHolder_5.StringHolder_30(5.0F), il1iliilli1l1iill);
            float f3 = f2 + (16.0F - font.height()) / 2.0F - 1.0F;
            il1i1iiii1l11iii11l11.HitParticles().StringHolder_8(font, s, f1 + f / 2.0F - font.width(s) / 2.0F, f3, ByteBufferHolder.ll1lIllll111I1lIIl1lIl);
         }
      }
   }

   private void ReadingThread(boolean flag) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         long i = System.currentTimeMillis();
         if (flag || i - this.IIlllI1II111l1II11 >= 600L || this.I111Il11l1I111l1I1l.isEmpty()) {
            this.IIlllI1II111l1II11 = i;
            net.minecraft.client.recipebook.ClientRecipeBook ClientRecipeBook = l11I1I1ll1Illll1I1l1111l1II.player.getRecipeBook();
            ContextParameterMap ContextParameterMap = SlotDisplayContexts.createParameters(l11I1I1ll1Illll1I1l1111l1II.world);
            HashSet hashset = new HashSet();
            HashMap hashmap = new HashMap();
            this.I111Il11l1I111l1I1l.clear();

            for (RecipeResultCollection RecipeResultCollection : ClientRecipeBook.getOrderedResults()) {
               for (RecipeDisplayEntry RecipeDisplayEntry : RecipeResultCollection.getAllRecipes()) {
                  RecipeDisplay RecipeDisplay = RecipeDisplayEntry.display();
                  if (this.StringHolder_8(RecipeDisplay)) {
                     ItemStack ItemStack = RecipeDisplay.result().getFirst(ContextParameterMap);
                     if (!ItemStack.isEmpty() && this.EventImpl_24(ItemStack)) {
                        Autocraft$l1lll11l1l Autocraft$l1lll11l1l = this.StringHolder_8(RecipeDisplayEntry, ItemStack, ContextParameterMap);
                        String s = Autocraft$l1lll11l1l.Autoexplosion();
                        int j = hashmap.merge(s, 1, Integer::sum);
                        if (j > 1) {
                           s = s + "_" + j;
                        }

                        StringHolder_14 ill111l1iiill1ll1illi = this.EventImpl_18(s);
                        if (ill111l1iiill1ll1illi == null) {
                           ill111l1iiill1ll1illi = new StringHolder_14(s, "servers", Autocraft$l1lll11l1l.I11Il11Il11Il1ll1ll1());
                           this.ll1IIIl1IIlI1I11IlII1Il1II.add(ill111l1iiill1ll1illi);
                        }

                        this.StringHolder_8(ill111l1iiill1ll1illi, Autocraft$l1lll11l1l);
                        this.I111Il11l1I111l1I1l.put(s, RecipeDisplayEntry);
                        hashset.add(s);
                     }
                  }
               }
            }

            this.ll1IIIl1IIlI1I11IlII1Il1II
               .removeIf(
                  ill111l1iiill1ll1illi1 -> ill111l1iiill1ll1illi1.lIlIlIlI111IlII1lI1I11()
                        && !hashset.contains(ill111l1iiill1ll1illi1.GetSocketHandler())
               );
            this.lI11lll1ll11I();
         }
      }
   }

   private Autocraft$l1lll11l1l StringHolder_8(RecipeDisplayEntry RecipeDisplayEntry, ItemStack ItemStack, ContextParameterMap ContextParameterMap) {
      String s = ZenithInternal095(ItemStack.getItem());
      String s1 = this.ZenithInternal028(ItemStack);
      String s2 = this.ZenithInternal021(s, s1);
      String[] astring = new String[9];
      String[] astring1 = new String[9];

      for (int i = 0; i < 9; i++) {
         astring[i] = "";
         astring1[i] = "";
      }

      RecipeDisplay RecipeDisplay = RecipeDisplayEntry.display();
      if (RecipeDisplay instanceof ShapedCraftingRecipeDisplay ShapedCraftingRecipeDisplay) {
         this.StringHolder_8(ShapedCraftingRecipeDisplay, ContextParameterMap, astring, astring1);
      } else if (RecipeDisplay instanceof ShapelessCraftingRecipeDisplay ShapelessCraftingRecipeDisplay) {
         this.StringHolder_8(ShapelessCraftingRecipeDisplay, ContextParameterMap, astring, astring1);
      }

      String s3 = this.StringHolder_8(s, s1, astring, astring1);
      return new Autocraft$l1lll11l1l(s3, s2, s, s1, astring, astring1);
   }

   private void StringHolder_8(ShapedCraftingRecipeDisplay ShapedCraftingRecipeDisplay, ContextParameterMap ContextParameterMap, String[] astring, String[] astring1) {
      List list = ShapedCraftingRecipeDisplay.ingredients();
      int i = Math.min(3, ShapedCraftingRecipeDisplay.width());
      int j = Math.min(3, ShapedCraftingRecipeDisplay.height());

      for (int k = 0; k < j; k++) {
         for (int l = 0; l < i; l++) {
            int i1 = k * ShapedCraftingRecipeDisplay.width() + l;
            int j1 = k * 3 + l;
            if (i1 < list.size()) {
               this.StringHolder_8((SlotDisplay)list.get(i1), ContextParameterMap, astring, astring1, j1);
            }
         }
      }
   }

   private void StringHolder_8(ShapelessCraftingRecipeDisplay ShapelessCraftingRecipeDisplay, ContextParameterMap ContextParameterMap, String[] astring, String[] astring1) {
      List list = ShapelessCraftingRecipeDisplay.ingredients();

      for (int i = 0; i < Math.min(9, list.size()); i++) {
         this.StringHolder_8((SlotDisplay)list.get(i), ContextParameterMap, astring, astring1, i);
      }
   }

   private void StringHolder_8(SlotDisplay SlotDisplay, ContextParameterMap ContextParameterMap, String[] astring, String[] astring1, int i) {
      ItemStack ItemStack = SlotDisplay.getFirst(ContextParameterMap);
      if (!ItemStack.isEmpty()) {
         astring[i] = ZenithInternal095(ItemStack.getItem());
         astring1[i] = this.ZenithInternal028(ItemStack);
      }
   }

   private void StringHolder_8(StringHolder_14 ill111l1iiill1ll1illi, Autocraft$l1lll11l1l Autocraft$l1lll11l1l) {
      ill111l1iiill1ll1illi.SocketFactoryHolder_2(true);
      ill111l1iiill1ll1illi.SocketFactoryHolder(true);
      ill111l1iiill1ll1illi.GetMaxSumBuyHandler(Autocraft$l1lll11l1l.I11Il11Il11Il1ll1ll1());
      ill111l1iiill1ll1illi.FileHolder(Autocraft$l1lll11l1l.llllI111ll1Il1I11ll111l1l1());
      ill111l1iiill1ll1illi.StringHolder_31(Autocraft$l1lll11l1l.IIIlIIIl1lII1IIIIII1ll1IIIl());
      ill111l1iiill1ll1illi.ListHolder_10(Autocraft$l1lll11l1l.llllI111ll1Il1I11ll111l1l1());
      ill111l1iiill1ll1illi.SocketFactoryHolder_3(false);

      for (int i = 0; i < 9; i++) {
         ill111l1iiill1ll1illi.EventImpl_24(i, Autocraft$l1lll11l1l.l1II1llI1IlIIlIIlI11l1()[i]);
         ill111l1iiill1ll1illi.ZenithInternal028(i, Autocraft$l1lll11l1l.Il1I1IlIllIllI1lIlIl1l1llIIIIl()[i]);
      }
   }

   private String StringHolder_8(String s, String s1, String[] astring, String[] astring1) {
      StringBuilder stringbuilder = new StringBuilder("servers").append('|').append(s).append('|').append(s1);

      for (int i = 0; i < 9; i++) {
         stringbuilder.append('|').append(astring[i]).append('#').append(astring1[i]);
      }

      String s3 = s;
      int j = s.indexOf(58);
      if (j != -1 && j + 1 < s.length()) {
         s3 = s.substring(j + 1);
      }

      String s2 = (s1 != null && !s1.isBlank() ? s1 : s3).toLowerCase(Locale.ROOT).replace(" ", "_").replaceAll("[^a-z0-9_]+", "_");
      if (s2.isBlank()) {
         s2 = "recipe";
      }

      return "servers_" + s2 + "_" + Integer.toHexString(stringbuilder.toString().hashCode());
   }

   private boolean StringHolder_8(RecipeDisplay RecipeDisplay) {
      return RecipeDisplay instanceof ShapedCraftingRecipeDisplay || RecipeDisplay instanceof ShapelessCraftingRecipeDisplay;
   }

   private boolean EventImpl_24(ItemStack ItemStack) {
      if (ItemStack.isEmpty()) {
         return false;
      } else {
         Identifier Identifier = Registries.ITEM.getId(ItemStack.getItem());
         if (!"minecraft".equals(Identifier.getNamespace())) {
            return true;
         } else {
            String s = ItemStack.getItem().getName().getString();
            String s1 = ItemStack.getName().getString();
            return !s1.equals(s)
               || ItemStack.contains(DataComponentTypes.CUSTOM_NAME)
               || ItemStack.contains(DataComponentTypes.LORE)
               || ItemStack.contains(DataComponentTypes.CUSTOM_DATA)
               || ItemStack.contains(DataComponentTypes.CUSTOM_MODEL_DATA)
               || ItemStack.contains(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE);
         }
      }
   }

   private String ZenithInternal028(ItemStack ItemStack) {
      if (ItemStack != null && !ItemStack.isEmpty()) {
         String s = ItemStack.getItem().getName().getString();
         String s1 = ItemStack.getName().getString();
         return s1.equals(s) ? "" : s1;
      } else {
         return "";
      }
   }

   public void lI11lll1ll11I() {
      if (this.EventImpl_18(this.lIllll1IIIl1l1lIIll11111111lII) == null) {
         List list = this.lIII1Il1lll1IlI1I1lI();
         this.lIllll1IIIl1l1lIIll11111111lII = list.isEmpty() ? "" : ((StringHolder_14)list.getFirst()).GetSocketHandler();
      }
   }

   public List<StringHolder_14> booleanHolder_4(String s) {
      this.ReadingThread(false);
      return this.lIII1Il1lll1IlI1I1lI();
   }

   private List<StringHolder_14> lIII1Il1lll1IlI1I1lI() {
      return this.ll1IIIl1IIlI1I11IlII1Il1II
         .stream()
         .filter(ill111l1iiill1ll1illi -> ill111l1iiill1ll1illi.I1llI111I1IlIIlIlIII1lI1().equalsIgnoreCase("servers"))
         .sorted(Comparator.comparing(StringHolder_14::getDisplayName))
         .toList();
   }

   public StringHolder_14 ZenithInternal064(String s1, String s) {
      this.ReadingThread(false);
      return this.EventImpl_18(s);
   }

   private StringHolder_14 EventImpl_18(String s) {
      return s != null && !s.isBlank()
         ? this.ll1IIIl1IIlI1I11IlII1Il1II
            .stream()
            .filter(
               ill111l1iiill1ll1illi -> ill111l1iiill1ll1illi.I1llI111I1IlIIlIlIII1lI1().equalsIgnoreCase("servers")
                     && ill111l1iiill1ll1illi.GetSocketHandler().equalsIgnoreCase(s)
            )
            .findFirst()
            .orElse(null)
         : null;
   }

   public StringHolder_14 lI1l1I1IIII() {
      return this.ZenithInternal064("servers", this.IIlII11lll11I1IlllIlll1I11l11l());
   }

   public StringHolder_14 II1111llIIl1() {
      this.lI11lll1ll11I();
      return this.EventImpl_18(this.IIlII11lll11I1IlllIlll1I11l11l());
   }

   public String l11Il1I1lI11l() {
      return "servers";
   }

   public void floatHolder_2(String s) {
      this.lII1llI1I1I1I11lIlIll.reset();
      this.lll1lI111I1lII1I1I1lllI1();
      this.lI1111IlIIllllI1I1llIl1();
   }

   public String IIlII11lll11I1IlllIlll1I11l11l() {
      return this.lIllll1IIIl1l1lIIll11111111lII;
   }

   public void ZenithInternal136(String s) {
      String s1 = s == null ? "" : s;
      if (!this.lIllll1IIIl1l1lIIll11111111lII.equals(s1)) {
         this.lIllll1IIIl1l1lIIll11111111lII = s1;
         this.lII1llI1I1I1I11lIlIll.reset();
         this.lll1lI111I1lII1I1I1lllI1();
         this.lI1111IlIIllllI1I1llIl1();
         this.II1l11I11I1IIlIlII11l11l();
      }
   }

   public StringHolder_14 EventImpl_28(String s) {
      this.PacketHolder("Ручные пресеты отключены: рецепты берутся из книги");
      return null;
   }

   public boolean ByteBufferHolder_2(StringHolder_14 ill111l1iiill1ll1illi) {
      return false;
   }

   public boolean EventImpl_12(String s) {
      return false;
   }

   public void ConnectThread(StringHolder_14 ill111l1iiill1ll1illi) {
      if (ill111l1iiill1ll1illi != null) {
         this.ll1IIIl1IIlI1I11IlII1Il1II.add(ill111l1iiill1ll1illi);
      }
   }

   public void EventImpl_23(String s) {
      this.I1111l11lllII.EventImpl_23(s);
   }

   public void l1llII1IIlIlIIlI1() {
      this.lII1llI1I1I1I11lIlIll.reset();
   }

   public String ZenithInternal021(String s, String s1) {
      return s1 != null && !s1.isBlank() ? s1 : this.ZenithInternal014(s);
   }

   public String EventImpl_5(String s) {
      int i = s.indexOf(35);
      return i == -1 ? this.ZenithInternal014(s) : this.ZenithInternal021(s.substring(0, i), s.substring(i + 1));
   }

   public void IIlIIl1I111lIl11l() {
      this.I1111l11lllII.IIlIIl1I111lIl11l();
   }

   public void I1l1I1I11Il1IllIl1() {
      this.I1111l11lllII.I1l1I1I11Il1IllIl1();
   }

   public void II1IlI1l11I1llI11IllI1lI1l() {
      this.PacketHolder("Ручное добавление отключено: используйте список рецептов");
   }

   public void lIllll1IlllI1ll1ll() {
      this.I1111l11lllII.lIllll1IlllI1ll1ll();
   }

   public void l1IlIl1lllllllI1l1() {
      this.I1111l11lllII.l1IlIl1lllllllI1l1();
   }

   public void Ill1ll1I11l1lllIIl() {
      this.I1111l11lllII.Ill1ll1I11l1lllIIl();
   }

   public void ZenithException_2(String s1, String s) {
      this.lIllll1IIIl1l1lIIll11111111lII = s == null ? "" : s;
   }

   private static String ZenithInternal095(Item Item) {
      return Item != null && Item != Items.AIR ? Registries.ITEM.getId(Item).toString() : "";
   }

   public Item EventImpl_34(String s) {
      if (s != null && !s.isBlank()) {
         Identifier Identifier = Identifier.tryParse(s);
         return Identifier != null && Registries.ITEM.containsId(Identifier)
            ? (Item)Registries.ITEM.get(Identifier)
            : Items.AIR;
      } else {
         return Items.AIR;
      }
   }

   public String ZenithInternal014(String s) {
      Item Item = this.EventImpl_34(s);
      return Item == Items.AIR ? "Пусто" : Item.getName().getString();
   }

   public BooleanSetting lIIIlllI11I1III1l1lIlIl() {
      return this.IllIll111l;
   }

   public BooleanSetting l1IllI11l1lI1ll11I() {
      return this.I1II1IlI1l1ll1l1l1l;
   }

   public BooleanSetting llIl1I11IIII() {
      return this.I1I1lllII11ll111I;
   }

   @Override
   public JsonObject save() {
      JsonObject jsonobject = super.save();
      jsonobject.add("AutoCraftData", this.lIl1lllI1l1I1IllI1());
      return jsonobject;
   }

   @Override
   public void load(JsonObject jsonobject) {
      super.load(jsonobject);
      if (jsonobject == null) {
         this.lI11lll1ll11I();
      } else {
         JsonObject jsonobject1 = null;
         if (jsonobject.has("AutoCraftData") && jsonobject.get("AutoCraftData").isJsonObject()) {
            jsonobject1 = jsonobject.getAsJsonObject("AutoCraftData");
         } else if (jsonobject.has("presets") || jsonobject.has("selectedProfile")) {
            jsonobject1 = jsonobject;
         }

         if (jsonobject1 != null) {
            this.StringHolder_4(jsonobject1);
         } else {
            this.lI11lll1ll11I();
         }
      }
   }

   public JsonObject lIl1lllI1l1I1IllI1() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("selectedProfile", "servers");
      jsonobject.addProperty("selectedServersPreset", this.lIllll1IIIl1l1lIIll11111111lII);
      jsonobject.addProperty("batch", this.I1I1lllII11ll111I.Spider());
      JsonArray jsonarray = new JsonArray();

      for (StringHolder_14 ill111l1iiill1ll1illi : new ArrayList<>(this.ll1IIIl1IIlI1I11IlII1Il1II)) {
         if (this.CallableImpl(ill111l1iiill1ll1illi)) {
            JsonObject jsonobject1 = new JsonObject();
            jsonobject1.addProperty("id", ill111l1iiill1ll1illi.GetSocketHandler());
            jsonobject1.addProperty("profile", "servers");
            JsonObject jsonobject2 = new JsonObject();

            for (Entry entry : ill111l1iiill1ll1illi.lllII1l1I1ll11IlII1lIlll1l1l().entrySet()) {
               jsonobject2.add((String)entry.getKey(), ((longHolder_2)entry.getValue()).toJson());
            }

            jsonobject1.add("sources", jsonobject2);
            jsonobject1.add("output", ill111l1iiill1ll1illi.ll1l1IIlIIIIl1l11lll().toJson());
            jsonobject1.add("workbench", ill111l1iiill1ll1illi.l1IlIIllI1lllIIIIII1ll().toJson());
            jsonarray.add(jsonobject1);
         }
      }

      jsonobject.add("presets", jsonarray);
      return jsonobject;
   }

   public void StringHolder_4(JsonObject jsonobject) {
      if (jsonobject.has("selectedServersPreset")) {
         this.lIllll1IIIl1l1lIIll11111111lII = jsonobject.get("selectedServersPreset").getAsString();
      } else if (jsonobject.has("selectedFunTimePreset")) {
         this.lIllll1IIIl1l1lIIll11111111lII = jsonobject.get("selectedFunTimePreset").getAsString();
      }

      if (jsonobject.has("batch")) {
         this.I1I1lllII11ll111I.StringHolder_11(jsonobject.get("batch").getAsBoolean());
      }

      if (jsonobject.has("presets") && jsonobject.get("presets").isJsonArray()) {
         for (JsonElement jsonelement : jsonobject.getAsJsonArray("presets")) {
            if (jsonelement.isJsonObject()) {
               JsonObject jsonobject1 = jsonelement.getAsJsonObject();
               String s = jsonobject1.has("id") ? jsonobject1.get("id").getAsString() : "";
               if (!s.isBlank()) {
                  StringHolder_14 ill111l1iiill1ll1illi = this.EventImpl_18(s);
                  if (ill111l1iiill1ll1illi == null) {
                     ill111l1iiill1ll1illi = new StringHolder_14(s, "servers", s);
                     ill111l1iiill1ll1illi.SocketFactoryHolder_2(true);
                     ill111l1iiill1ll1illi.SocketFactoryHolder(true);
                     this.ll1IIIl1IIlI1I11IlII1Il1II.add(ill111l1iiill1ll1illi);
                  }

                  if (jsonobject1.has("sources") && jsonobject1.get("sources").isJsonObject()) {
                     JsonObject jsonobject2 = jsonobject1.getAsJsonObject("sources");
                     ill111l1iiill1ll1illi.lllII1l1I1ll11IlII1lIlll1l1l().clear();

                     for (Entry entry : jsonobject2.entrySet()) {
                        ill111l1iiill1ll1illi.lllII1l1I1ll11IlII1lIlll1l1l()
                           .put((String)entry.getKey(), longHolder_2.ZenithInternal128(((JsonElement)entry.getValue()).getAsJsonObject()));
                     }
                  }

                  if (jsonobject1.has("output") && jsonobject1.get("output").isJsonObject()) {
                     ill111l1iiill1ll1illi.StringHolder_8(longHolder_2.ZenithInternal128(jsonobject1.getAsJsonObject("output")));
                  }

                  if (jsonobject1.has("workbench") && jsonobject1.get("workbench").isJsonObject()) {
                     ill111l1iiill1ll1illi.EventBus(longHolder_2.ZenithInternal128(jsonobject1.getAsJsonObject("workbench")));
                  }
               }
            }
         }
      }

      this.lI11lll1ll11I();
   }

   private boolean CallableImpl(StringHolder_14 ill111l1iiill1ll1illi) {
      return ill111l1iiill1ll1illi != null
         && (
            !ill111l1iiill1ll1illi.lllII1l1I1ll11IlII1lIlll1l1l().isEmpty()
               || ill111l1iiill1ll1illi.ll1l1IIlIIIIl1l11lll().Il11I1IIIlI1111IIIIl()
               || ill111l1iiill1ll1illi.l1IlIIllI1lllIIIIII1ll().Il11I1IIIlI1111IIIIl()
         );
   }

   private void EventImpl_37(String s) {
      this.l1lIlllIIl = s;
      this.PacketHolder(s);
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler) {
         l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
      }

      if (this.Spider()) {
         this.StringHolder_32(false);
      }
   }

   public void TextHolder_2(String s) {
      ZenithClient.getInstance().ZenithInternal015().StringHolder_8("S", Text.literal(s));
   }

   public void PacketHolder(String s) {
      ZenithClient.getInstance().ZenithInternal015().StringHolder_8("!", Text.literal(s));
   }

   private int PacketHolder_2(String s) {
      Item Item = this.EventImpl_34(s);
      return Item == Items.AIR ? 64 : Item.getDefaultStack().getMaxCount();
   }

   private boolean StringHolder_8(Autocraft$l1IIl11lI Autocraft$l1iil11li, String s, String s1) {
      if (!Objects.equals(Autocraft$l1iil11li.lI1l1lIl1I1111l1llIl1(), s)) {
         return false;
      } else if (s1 != null && !s1.isBlank()) {
         String s2 = Autocraft$l1iil11li.I11Il11Il11Il1ll1ll1();
         return s2.equalsIgnoreCase(s1) || s2.toLowerCase(Locale.ROOT).contains(s1.toLowerCase(Locale.ROOT));
      } else {
         return true;
      }
   }
}
