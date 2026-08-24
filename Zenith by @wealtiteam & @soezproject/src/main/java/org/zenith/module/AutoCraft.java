package org.zenith.module;

import org.zenith.config.CosmeticManager;
import org.zenith.config.ConfigJsonUtil;
import org.zenith.core.HudPreviewItem;
import org.zenith.core.TradeGuardService;
import org.zenith.core.LineShader;
import org.zenith.core.HolyWorldClient;
import org.zenith.core.TaskQueue;
import org.zenith.event.Event01;
import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.event.MovementInputEvent;
import org.zenith.managers.CloudApi;
import org.zenith.managers.EmoteManager;
import org.zenith.managers.FriendFilter;
import org.zenith.managers.PetManager;
import org.zenith.rotation.RotationQueue;
import org.zenith.utility.render.display.base.CornerRadius;



import org.zenith.module.ModuleInfo;

import org.zenith.util.ArgbColor;
import org.zenith.base.comand.CommandManager;
import org.zenith.module.Category;
import org.zenith.util.CooldownTimer;

import org.zenith.module.Module;
import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.PotionItemBuilder;
import org.zenith.core.ProfileItemBuilder;
import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;
import org.zenith.core.ItemSpec;
import org.zenith.core.NbtItemSpec;
import org.zenith.core.NbtEditor;
import org.zenith.core.ColorAnimator;
import org.zenith.core.EnchantItemSpec;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.UiAnimation;
import org.zenith.core.TextScanner;
import org.zenith.core.Easing;
import org.zenith.core.StringCodec;
import org.zenith.util.RaycastUtils;
import org.zenith.rotation.Rotation;
import org.zenith.rotation.RotationMath;
import org.zenith.rotation.RotationTask;
import org.zenith.core.ServiceException;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.InventoryUtils;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.BlockPosEntry;
import org.zenith.core.ItemFilterRules;
import org.zenith.core.ModuleSnapshotDto;
import org.zenith.core.AnalyticsTracker;
import org.zenith.config.ProtocolMessage;
import org.zenith.core.VisualSettingsStore;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.core.EffectEngine;
import org.zenith.core.ContainerScanner;
import org.zenith.core.CloudRouter;
import org.zenith.core.FileLogger;
import org.zenith.core.CraftingExecutor;
import org.zenith.core.AutoCraftHelper;

import org.zenith.event.Event18Ext3;
import org.zenith.event.Event26;
import org.zenith.event.EventGetFogColorHook;
import org.zenith.event.EventHookTickEvent;
import org.zenith.event.EventHookWorldRender;
import org.zenith.event.EventItemRenderHook;
import org.zenith.event.EventMouseButton;
import org.zenith.event.EventPosHook;
import org.zenith.event.EventRender;
import org.zenith.event.EventRender2;
import org.zenith.event.EventRenderScreenHook;
import org.zenith.event.FovEvent;
import org.zenith.event.GameMessageEvent;
import org.zenith.event.PacketEvent;
import org.zenith.event.PacketReceiveEvent;
import org.zenith.event.PacketSendEvent;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.Setting;
import org.zenith.setting.StringSetting;

import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.autocraft.AutoCraftEditorScreen;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.BlurHudDrawContext;
import org.zenith.utility.render.display.base.CornerRadiusF;
import org.zenith.utility.render.display.base.GradientRadius;
import org.zenith.utility.render.display.base.GuiSprite;
















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
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
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.client.gui.screen.recipebook.RecipeResultCollection;
import net.minecraft.client.recipebook.ClientRecipeBook;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.CraftRequestC2SPacket;
import net.minecraft.recipe.RecipeDisplayEntry;
import net.minecraft.recipe.display.RecipeDisplay;
import net.minecraft.recipe.display.ShapedCraftingRecipeDisplay;
import net.minecraft.recipe.display.ShapelessCraftingRecipeDisplay;
import net.minecraft.recipe.display.SlotDisplay;
import net.minecraft.recipe.display.SlotDisplayContexts;
import net.minecraft.registry.Registries;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.context.ContextParameterMap;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

@ModuleInfo(
   name = "AutoCraft",
   category = Category.MISC,
   description = "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043a\u0440\u0430\u0444\u0442\u0438\u0442 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b"
)
public final class AutoCraft extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AutoCraft autoCraft = new AutoCraft();
   public static final int int19 = 0;
   public static final int int20 = 36;
   public static final String string = "servers";
   public static final long long12 = 85L;
   public static final long long13 = 600L;
   public static final float float3 = 0.5F;
   public static final int int21 = 30;
   public static final int int22 = 5;
   public static final int int23 = 5;
   public final BooleanSetting u0410U0432U0442U043eU0437U0430U0431U043eU0440U0440U0435U0441U0443U0440U0441U043eU0432 = new BooleanSetting(
      "\u0410\u0432\u0442\u043e-\u0437\u0430\u0431\u043e\u0440 \u0440\u0435\u0441\u0443\u0440\u0441\u043e\u0432", true
   );
   public final BooleanSetting u0421U043aU043bU0430U0434U044bU0432U0430U0442U044cU0438U0442U043eU0433 = new BooleanSetting(
      "\u0421\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u0442\u044c \u0438\u0442\u043e\u0433", true
   );
   public final BooleanSetting u041aU0440U0430U0444U0442U0438U0442U044cU043cU0430U043aU0441U0438U043cU0443U043c = new BooleanSetting(
      "\u041a\u0440\u0430\u0444\u0442\u0438\u0442\u044c \u043c\u0430\u043a\u0441\u0438\u043c\u0443\u043c", true
   );
   public final StringSetting u041eU0442U043aU0440U044bU0442U044cU043cU0435U043dU044eU043aU0440U0430U0444U0442U0430 = new StringSetting(
      "\u041e\u0442\u043a\u0440\u044b\u0442\u044c \u043c\u0435\u043d\u044e \u043a\u0440\u0430\u0444\u0442\u0430", this::int349
   );
   public final List<ItemFilterRules> list5 = new ArrayList<>();
   public final Map<String, RecipeDisplayEntry> map10 = new HashMap<>();
   public final Map<BlockPos, AutoCraft_Var7> map11 = new HashMap<>();
   public final List<BlockPos> list6 = new ArrayList<>();
   public final Map<String, Integer> map12 = new HashMap<>();
   public final CooldownTimer zClass0676 = new CooldownTimer();
   public final ContainerScanner zClass036 = new ContainerScanner(this);
   public final CraftingExecutor zClass068 = new CraftingExecutor(this);
   public final AutoCraftHelper zClass105 = new AutoCraftHelper(this);
   public AutoCraft_Var159 autoCraftVar159 = AutoCraft_Var159.val056;
   public String string2 = "";
   public String string3 = "";
   public String string4 = "";
   public long long14;
   public int int24;
   public int int25;
   public int int26;
   public int int27 = -1;
   public int int28 = -1;
   public int int29;
   public int int30;
   public int int31 = -1;
   public int int32;
   public boolean boolean6;
   public boolean boolean7;
   public boolean boolean8;
   public AutoCraft_Var143 autoCraftVar143 = AutoCraft_Var143.val223;
   public ItemStack itemStack2 = ItemStack.EMPTY;
   public BlockPos blockPos3;
   public BlockPos blockPos4;
   public BlockPos blockPos5;
   public BlockPos blockPos6;
   public Rotation var118;

   public AutoCraft() {
      for (Setting l1illl1lllllll1l1l1l1ili11l1 : new Setting[]{
         this.u0410U0432U0442U043eU0437U0430U0431U043eU0440U0440U0435U0441U0443U0440U0441U043eU0432, this.u0421U043aU043bU0430U0434U044bU0432U0430U0442U044cU0438U0442U043eU0433, this.u041aU0440U0430U0444U0442U0438U0442U044cU043cU0430U043aU0441U0438U043cU0443U043c
      }) {
         l1illl1lllllll1l1l1l1ili11l1.setVisible(() -> false);
      }

      this.call033();
   }

   public void call148() {
      if (minecraftClient3.player != null && minecraftClient3.world != null && minecraftClient3.interactionManager != null) {
         if (!this.zClass036.call149()) {
            this.CommandManager(false);
            this.call033();
            ItemFilterRules iiilili1lli1i11lilillliiii1iii = this.call086();
            if (iiilili1lli1i11lilillliiii1iii == null) {
               this.EventPosHook(
                  "\u0412 \u0441\u043f\u0438\u0441\u043a\u0435 \u043d\u0435\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u043d\u044b\u0445 \u0440\u0435\u0446\u0435\u043f\u0442\u043e\u0432"
               );
            } else {
               ScreenHandler screenhandler = minecraftClient3.player.currentScreenHandler;
               if (screenhandler instanceof CraftingScreenHandler craftingscreenhandler) {
                  this.on23(iiilili1lli1i11lilillliiii1iii, craftingscreenhandler);
               } else if (this.on23(screenhandler)) {
                  if (this.autoCraftVar159 != AutoCraft_Var159.val080
                     && !screenhandler.getCursorStack().isEmpty()
                     && this.zClass0676.EventModifyMouseRotationInput(85L)) {
                     this.ItemSpec(screenhandler);
                     this.zClass0676.reset();
                  } else {
                     this.on23(iiilili1lli1i11lilillliiii1iii, screenhandler);
                  }
               } else if (this.int24 > 0 && this.call150()) {
                  this.int24--;

                  this.string3 = switch (this.autoCraftVar159) {
                     case val081 -> "\u0410\u043d\u0430\u043b\u0438\u0437\u0438\u0440\u0443\u044e \u0441\u0443\u043d\u0434\u0443\u043a\u0438...";
                     case val161 -> "\u041e\u0442\u043a\u0440\u044b\u0432\u0430\u044e \u0432\u0435\u0440\u0441\u0442\u0430\u043a...";
                     default -> "\u041e\u0442\u043a\u0440\u044b\u0432\u0430\u044e \u0445\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0435...";
                  };
               } else if (this.call150()) {
                  this.call113();
               } else if (minecraftClient3.currentScreen == null) {
                  if (this.boolean6 && this.autoCraftVar159 != AutoCraft_Var159.val162) {
                     this.on23(iiilili1lli1i11lilillliiii1iii);
                  } else {
                     this.UiAnimation(iiilili1lli1i11lilillliiii1iii);
                  }
               }
            }
         }
      }
   }

   public void on23(ItemFilterRules var1, CraftingScreenHandler var2) {
      this.int24 = 0;
      this.autoCraftVar159 = AutoCraft_Var159.val488;
      this.string3 = "\u041a\u0440\u0430\u0444\u0447\u0443 " + var1.on23(this);
      if (this.zClass0676.EventModifyMouseRotationInput(85L)) {
         if (!var2.getCursorStack().isEmpty()) {
            this.ItemSpec(var2);
            this.zClass0676.reset();
         } else if (!var2.getSlot(0).getStack().isEmpty()) {
            if (!this.NbtItemSpec(var1)) {
               this.boolean8 = true;
               this.ColorAnimator(
                  "\u0418\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u044c \u0437\u0430\u043f\u043e\u043b\u043d\u0435\u043d, \u0441\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u044e \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442",
                  true
               );
            } else {
               minecraftClient3.interactionManager.clickSlot(var2.syncId, 0, 0, SlotActionType.QUICK_MOVE, minecraftClient3.player);
               this.boolean8 = true;
               this.call053();
               this.zClass0676.reset();
            }
         } else if (this.boolean8 && this.ItemSpec(var1)) {
            this.ColorAnimator(
               "\u0421\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u044e \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442 \u043a\u0440\u0430\u0444\u0442\u0430",
               true
            );
         } else if (this.int25 > 0) {
            this.int25--;
            if (this.int25 == 0) {
               String s = this.boolean8
                  ? "\u0421\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u044e \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442 \u043a\u0440\u0430\u0444\u0442\u0430"
                  : "\u041d\u0435 \u0445\u0432\u0430\u0442\u0430\u0435\u0442 \u0440\u0435\u0441\u0443\u0440\u0441\u043e\u0432 \u0438\u043b\u0438 \u0441\u0435\u0440\u0432\u0435\u0440 \u043e\u0442\u043a\u043b\u043e\u043d\u0438\u043b \u0440\u0435\u0446\u0435\u043f\u0442";
               this.ColorAnimator(s, false);
            }
         } else {
            RecipeDisplayEntry recipedisplayentry = this.map10.get(var1.getId());
            if (recipedisplayentry == null) {
               this.EventPosHook(
                  "\u0420\u0435\u0446\u0435\u043f\u0442 \u0431\u043e\u043b\u044c\u0448\u0435 \u043d\u0435 \u0434\u043e\u0441\u0442\u0443\u043f\u0435\u043d \u0432 \u043a\u043d\u0438\u0433\u0435"
               );
            } else {
               this.on23(var2, recipedisplayentry);
            }
         }
      }
   }

   public int on23(ScreenHandler var1, int var2, String var3, String var4, int var5) {
      int i = -1;
      int j = -1;
      int k = -1;
      int l = Integer.MAX_VALUE;
      int i1 = -1;
      int j1 = -1;

      for (int k1 = 0; k1 < var2; k1++) {
         Slot slot = var1.getSlot(k1);
         if (slot.hasStack() && this.on23(slot.getStack(), var3, var4)) {
            int l1 = slot.getStack().getCount();
            if (l1 == var5) {
               return k1;
            }

            if (l1 < var5 && l1 > j1) {
               j1 = l1;
               i1 = k1;
            }

            if (l1 <= var5 && l1 > j) {
               j = l1;
               i = k1;
            }

            if (l1 > var5 && l1 < l) {
               l = l1;
               k = k1;
            }
         }
      }

      if (i != -1) {
         return i;
      } else {
         return k != -1 ? k : i1;
      }
   }

   public void UiAnimation(ItemFilterRules var1, ScreenHandler var2) {
      this.string3 = "\u0421\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u044e " + var1.on23(this);
      int i = this.UiAnimation(var2);
      if (this.autoCraftVar143 != AutoCraft_Var143.val223) {
         this.UiAnimation(var2, i);
      } else if (!var2.getCursorStack().isEmpty()) {
         this.autoCraftVar143 = AutoCraft_Var143.val163;
         this.UiAnimation(var2, i);
      } else if (this.zClass0676.EventModifyMouseRotationInput(85L)) {
         int j = this.ServiceException(var1.float275(), var1.boolean178());
         if (j <= 0 && this.call054() <= 1) {
            j = this.PotionItemBuilder(var1);
         }

         if (j <= 0) {
            this.call066();
         } else {
            if (this.int28 == -1) {
               this.int28 = j;
               this.int29 = 0;
            } else if (j < this.int28) {
               this.int29 = 0;
               this.int28 = j;
            } else if (j == this.int28) {
               this.int29++;
            } else {
               this.int29 = 0;
               this.int28 = j;
            }

            if (this.on23(var1, var2, i) && this.int29 < 3) {
               for (int k = i; k < var2.slots.size(); k++) {
                  Slot slot = var2.getSlot(k);
                  if (slot.hasStack() && var1.on23(slot.getStack(), this)) {
                     this.on23(var2, k);
                     this.zClass0676.reset();
                     return;
                  }
               }

               if (this.call054() <= 1) {
                  for (int l = i; l < var2.slots.size(); l++) {
                     Slot slot1 = var2.getSlot(l);
                     if (slot1.hasStack() && !this.on23(var1, slot1.getStack())) {
                        this.on23(var2, l);
                        this.zClass0676.reset();
                        return;
                     }
                  }
               }

               this.call066();
            } else {
               this.on23(var2, this.blockPos6);
               this.call151();
            }
         }
      }
   }

   public void on23(ItemFilterRules var1) {
      this.Easing(var1);
      this.ColorAnimator(var1);
      boolean flag = this.call054() <= 1;
      boolean flag1 = this.boolean8 && this.ItemServiceBase(var1);
      boolean flag2 = flag && this.PotionItemBuilder(var1) > 0;
      boolean flag3 = this.SimpleItemBuilder(var1);
      if (this.u0421U043aU043bU0430U0434U044bU0432U0430U0442U044cU0438U0442U043eU0433.isEnabled() && (flag1 || flag3 || flag2)) {
         var optional = this.EnchantItemSpec(var1);
         if (!optional.isEmpty()) {
            this.blockPos6 = (BlockPos)optional.get();
            var1.on23(BlockPosEntry.FileLogger(this.blockPos6));
            this.string3 = flag
               ? "\u0418\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u044c \u043f\u043e\u043b\u043e\u043d, \u0441\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u044e..."
               : "\u041e\u0442\u043a\u0440\u044b\u0432\u0430\u044e \u0441\u0443\u043d\u0434\u0443\u043a-\u0441\u043a\u043b\u0430\u0434";
            if (this.on23(this.blockPos6, AutoCraft_Var159.val080)
               == AutoCraft_Var165.val082) {
               this.map11.remove(this.blockPos6);
               this.blockPos6 = null;
            }

            return;
         }

         if (flag) {
            this.PacketReceiveEvent(
               "\u0410\u0432\u0442\u043e\u043a\u0440\u0430\u0444\u0442 \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d: \u043d\u0435\u0442 \u0441\u0443\u043d\u0434\u0443\u043a\u0430 \u0441\u043e \u0441\u0432\u043e\u0431\u043e\u0434\u043d\u044b\u043c \u043c\u0435\u0441\u0442\u043e\u043c."
            );
            return;
         }

         this.boolean8 = false;
         this.string3 = "\u041d\u0435\u0442 \u0441\u0432\u043e\u0431\u043e\u0434\u043d\u043e\u0433\u043e \u0441\u043a\u043b\u0430\u0434\u0430, \u043f\u0440\u043e\u0434\u043e\u043b\u0436\u0430\u044e \u043a\u0440\u0430\u0444\u0442";
      }

      String s = this.NbtEditor(var1);
      if (this.int30 <= 0 && !s.isBlank() && !this.on23(var1, 1)) {
         this.EventPosHook("\u041d\u0435\u0442 \u043c\u0435\u0441\u0442\u0430 \u043f\u043e\u0434 \u0440\u0435\u0441\u0443\u0440\u0441\u044b");
      } else if (!s.isBlank()) {
         if (this.u0410U0432U0442U043eU0437U0430U0431U043eU0440U0440U0435U0441U0443U0440U0441U043eU0432.isEnabled()) {
            if (!this.ModuleSnapshotDto(var1.FriendFilter(s), var1.NpcCloneManager(s))) {
               this.EventPosHook(
                  "\u041d\u0435\u0442 \u043c\u0435\u0441\u0442\u0430 \u043f\u043e\u0434 \u0440\u0435\u0441\u0443\u0440\u0441\u044b"
               );
            } else {
               var optional1 = this.on23(var1, s);
               if (optional1.isPresent()) {
                  this.blockPos5 = (BlockPos)optional1.get();
                  var1.call034().put(s, BlockPosEntry.FileLogger(this.blockPos5));
                  this.string3 = "\u041e\u0442\u043a\u0440\u044b\u0432\u0430\u044e \u0441\u0443\u043d\u0434\u0443\u043a \u0441 \u0440\u0435\u0441\u0443\u0440\u0441\u0430\u043c\u0438";
                  this.string4 = s;
                  if (this.on23(this.blockPos5, AutoCraft_Var159.val109)
                     == AutoCraft_Var165.val082) {
                     this.map11.remove(this.blockPos5);
                     this.blockPos5 = null;
                     this.string4 = "";
                  }
               } else {
                  this.EventPosHook(
                     "\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0440\u0435\u0441\u0443\u0440\u0441: " + this.EventRenderScreenHook(s)
                  );
               }
            }
         } else {
            this.EventPosHook(
               "\u041d\u0435 \u0445\u0432\u0430\u0442\u0430\u0435\u0442 \u0438\u043d\u0433\u0440\u0435\u0434\u0438\u0435\u043d\u0442\u043e\u0432"
            );
         }
      } else if (this.blockPos3 != null) {
         var1.UiAnimation(BlockPosEntry.FileLogger(this.blockPos3));
         this.string3 = "\u041e\u0442\u043a\u0440\u044b\u0432\u0430\u044e \u0432\u0435\u0440\u0441\u0442\u0430\u043a";
         if (this.on23(this.blockPos3, AutoCraft_Var159.val161)
            == AutoCraft_Var165.val082) {
            this.blockPos3 = null;
         }
      } else {
         this.EventPosHook(
            "\u0420\u044f\u0434\u043e\u043c \u043d\u0435\u0442 \u0434\u043e\u0441\u0442\u0443\u043f\u043d\u043e\u0433\u043e \u0432\u0435\u0440\u0441\u0442\u0430\u043a\u0430"
         );
      }
   }

   public void CommandManager(boolean var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         long i = System.currentTimeMillis();
         if (var1 || i - this.long14 >= 600L) {
            this.long14 = i;
            ClientRecipeBook clientrecipebook = minecraftClient3.player.getRecipeBook();
            ContextParameterMap contextparametermap = SlotDisplayContexts.createParameters(minecraftClient3.world);
            var hashset = new HashSet();
            var hashmap = new HashMap();
            this.map10.clear();

            for (RecipeResultCollection reciperesultcollection : clientrecipebook.getOrderedResults()) {
               for (RecipeDisplayEntry recipedisplayentry : reciperesultcollection.getAllRecipes()) {
                  RecipeDisplay recipedisplay = recipedisplayentry.display();
                  if (this.on23(recipedisplay)) {
                     ItemStack itemstack = recipedisplay.result().getFirst(contextparametermap);
                     if (!itemstack.isEmpty() && this.PotionItemBuilder(itemstack)) {
                        AutoCraft_Var160 ii1iiil1ll111iii11ii1illlii1_Var160 = this.on23(
                           recipedisplayentry, itemstack, contextparametermap
                        );
                        String s = ii1iiil1ll111iii11ii1illlii1_Var160.id();
                        int j = (int) hashmap.merge(s, 1, (a, b) -> Integer.sum((Integer) a, (Integer) b));
                        if (j > 1) {
                           s = s + "_" + j;
                        }

                        ItemFilterRules iiilili1lli1i11lilillliiii1iii = this.FovEvent(s);
                        if (iiilili1lli1i11lilillliiii1iii == null) {
                           iiilili1lli1i11lilillliiii1iii = new ItemFilterRules(
                              s, "servers", ii1iiil1ll111iii11ii1illlii1_Var160.AutoLeave()
                           );
                           this.list5.add(iiilili1lli1i11lilillliiii1iii);
                        }

                        this.on23(iiilili1lli1i11lilillliiii1iii, ii1iiil1ll111iii11ii1illlii1_Var160);
                        this.map10.put(s, recipedisplayentry);
                        hashset.add(s);
                     }
                  }
               }
            }

            if (!hashset.isEmpty()) {
               this.list5.removeIf(var1x -> var1x.zClass016Var7() && !hashset.contains(var1x.getId()));
            }

            this.call033();
         }
      }
   }

   public void CloudResponse(JsonObject var1) {
      if (var1.has("selectedServersPreset")) {
         this.string2 = var1.get("selectedServersPreset").getAsString();
      } else if (var1.has("selectedFunTimePreset")) {
         this.string2 = var1.get("selectedFunTimePreset").getAsString();
      }

      if (var1.has("batch")) {
         this.u041aU0440U0430U0444U0442U0438U0442U044cU043cU0430U043aU0441U0438U043cU0443U043c.setEnabled(var1.get("batch").getAsBoolean());
      }

      if (var1.has("presets") && var1.get("presets").isJsonArray()) {
         for (JsonElement jsonelement : var1.getAsJsonArray("presets")) {
            if (jsonelement.isJsonObject()) {
               JsonObject jsonobject = jsonelement.getAsJsonObject();
               String s = jsonobject.has("id") ? jsonobject.get("id").getAsString() : "";
               if (!s.isBlank()) {
                  ItemFilterRules iiilili1lli1i11lilillliiii1iii = this.FovEvent(s);
                  if (iiilili1lli1i11lilillliiii1iii == null) {
                     iiilili1lli1i11lilillliiii1iii = new ItemFilterRules(s, "servers", s);
                     iiilili1lli1i11lilillliiii1iii.CosmeticManager(true);
                     iiilili1lli1i11lilillliiii1iii.EmotePlayback(true);
                     this.list5.add(iiilili1lli1i11lilillliiii1iii);
                  }

                  if (jsonobject.has("sources") && jsonobject.get("sources").isJsonObject()) {
                     JsonObject jsonobject1 = jsonobject.getAsJsonObject("sources");
                     iiilili1lli1i11lilillliiii1iii.call034().clear();

                     for (var entry : jsonobject1.entrySet()) {
                        iiilili1lli1i11lilillliiii1iii.call034()
                           .put((String)entry.getKey(), BlockPosEntry.TradeGuardService(((JsonElement)entry.getValue()).getAsJsonObject()));
                     }
                  }

                  if (jsonobject.has("output") && jsonobject.get("output").isJsonObject()) {
                     iiilili1lli1i11lilillliiii1iii.on23(BlockPosEntry.TradeGuardService(jsonobject.getAsJsonObject("output")));
                  }

                  if (jsonobject.has("workbench") && jsonobject.get("workbench").isJsonObject()) {
                     iiilili1lli1i11lilillliiii1iii.UiAnimation(BlockPosEntry.TradeGuardService(jsonobject.getAsJsonObject("workbench")));
                  }
               }
            }
         }
      }

      this.call033();
   }

   public void int349() {
      minecraftClient3.setScreen(new AutoCraftEditorScreen(this));
   }

   @Override
   public void onEnable() {
      this.zClass036.reset();
      super.onEnable();
      this.string3 = "";
      this.zClass105.reset();
      this.call042();
      this.call087();
      this.call053();
      this.call018();
      this.boolean8 = false;
      this.call067();
      this.CommandManager(true);
   }

   @Override
   public void onDisable() {
      if (minecraftClient3.player != null) {
         ScreenHandler screenhandler = minecraftClient3.player.currentScreenHandler;
         if (screenhandler instanceof ScreenHandler) {
            this.ItemSpec(screenhandler);
         }
      }

      this.autoCraftVar159 = AutoCraft_Var159.val056;
      this.string4 = "";
      this.int24 = 0;
      this.zClass036.reset();
      this.zClass068.reset();
      this.string3 = "";
      this.zClass105.reset();
      this.call042();
      this.call087();
      this.call053();
      this.call018();
      this.boolean8 = false;
      this.call055();
      super.onDisable();
   }

   @EventTarget
   public void on23(EventHookTickEvent var1) {
      if (!this.zClass068.call152()) {
         this.call148();
      }
   }

   @EventTarget
   public void ItemSpec(Event26 var1) {
      if (this.var118 != null) {
         Rotation ililiiili1ll1li11 = this.var118;
         val002.on23(
            new RotationTask(
               ililiiili1ll1li11,
               () -> val001.on23(val001.HudPreviewItem(), ililiiili1ll1li11),
               val001.HudPreviewItem()
            ),
            5,
            this
         );
      }
   }

   @EventTarget
   public void UiAnimation(EventMouseButton var1) {
      this.zClass036.Easing(var1);
   }

   @EventTarget
   public void on23(EventRender2 var1) {
      this.UiAnimation(var1);
   }

   public void on23(CraftingScreenHandler var1, RecipeDisplayEntry var2) {
      if (minecraftClient3.getNetworkHandler() == null) {
         this.EventPosHook(
            "\u041d\u0435\u0442 \u0441\u0435\u0442\u0435\u0432\u043e\u0433\u043e \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f \u043a \u0441\u0435\u0440\u0432\u0435\u0440\u0443"
         );
      } else {
         minecraftClient3.getNetworkHandler().sendPacket(new CraftRequestC2SPacket(var1.syncId, var2.id(), this.call153()));
         this.int25 = 5;
         this.string3 = "\u0417\u0430\u043f\u0440\u0430\u0448\u0438\u0432\u0430\u044e \u0440\u0435\u0446\u0435\u043f\u0442 \u0438\u0437 \u043a\u043d\u0438\u0433\u0438...";
         this.zClass0676.reset();
      }
   }

   public void call053() {
      this.int25 = 0;
   }

   public boolean on23(ScreenHandler var1) {
      return var1 instanceof GenericContainerScreenHandler || var1 instanceof ShulkerBoxScreenHandler;
   }

   public int UiAnimation(ScreenHandler var1) {
      return Math.max(0, var1.slots.size() - 36);
   }

   public boolean Easing(ScreenHandler var1) {
      if (this.int27 != var1.syncId) {
         this.int27 = var1.syncId;
         this.int26 = 5;
      }

      if (this.int26 <= 0) {
         return false;
      } else {
         this.int26--;

         this.string3 = switch (this.autoCraftVar159) {
            case val081 -> "\u0421\u0447\u0438\u0442\u044b\u0432\u0430\u044e \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u043c\u043e\u0435 \u0441\u0443\u043d\u0434\u0443\u043a\u0430...";
            case val109 -> "\u0421\u0438\u043d\u0445\u0440\u043e\u043d\u0438\u0437\u0438\u0440\u0443\u044e \u0441\u0443\u043d\u0434\u0443\u043a \u0441 \u0440\u0435\u0441\u0443\u0440\u0441\u0430\u043c\u0438...";
            case val080 -> "\u0421\u0438\u043d\u0445\u0440\u043e\u043d\u0438\u0437\u0438\u0440\u0443\u044e \u0441\u0443\u043d\u0434\u0443\u043a-\u0441\u043a\u043b\u0430\u0434...";
            default -> "\u0421\u0438\u043d\u0445\u0440\u043e\u043d\u0438\u0437\u0438\u0440\u0443\u044e \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440...";
         };
         this.zClass0676.reset();
         return true;
      }
   }

   public void call018() {
      this.int27 = -1;
      this.int26 = 0;
   }

   public void on23(ItemFilterRules var1, ScreenHandler var2) {
      if (!this.Easing(var2)) {
         this.int24 = 0;
         if (this.autoCraftVar159 == AutoCraft_Var159.val081) {
            this.on23(var2, this.blockPos4);
            minecraftClient3.player.closeHandledScreen();
            this.call018();
            this.blockPos4 = null;
            this.autoCraftVar159 = AutoCraft_Var159.val162;
            this.zClass0676.reset();
         } else if (this.autoCraftVar159 == AutoCraft_Var159.val109) {
            if (!this.string4.isBlank() && this.blockPos5 != null) {
               this.on23(var1, var2, this.string4, this.blockPos5);
            } else {
               this.ColorAnimator(this.string3, true);
            }
         } else {
            this.zClass105.call114();
            if (this.autoCraftVar159 == AutoCraft_Var159.val080) {
               if (this.blockPos6 != null) {
                  this.on23(var2, this.blockPos6);
               }

               this.UiAnimation(var1, var2);
            } else {
               minecraftClient3.player.closeHandledScreen();
               this.call018();
               this.autoCraftVar159 = AutoCraft_Var159.val056;
            }
         }
      }
   }

   public void on23(ItemFilterRules var1, ScreenHandler var2, String var3, BlockPos var4) {
      String s = var1.FriendFilter(var3);
      String s1 = var1.NpcCloneManager(var3);
      this.string3 = "\u0417\u0430\u0431\u0438\u0440\u0430\u044e " + this.ProtocolMessage(s, s1);
      if (this.zClass0676.EventModifyMouseRotationInput(85L)) {
         if (!this.zClass105.UiAnimation(var1, var3)) {
            int i = this.map12.getOrDefault(var3, var1.CloudApi(var3));
            int j = this.ServiceException(s, s1);
            if (j < i && this.ModuleSnapshotDto(s, s1)) {
               int k = this.UiAnimation(var2);
               int l = Math.max(1, i - j);
               int i1 = this.on23(var2, k, s, s1, l);
               if (i1 != -1) {
                  minecraftClient3.interactionManager.clickSlot(var2.syncId, i1, 0, SlotActionType.QUICK_MOVE, minecraftClient3.player);
                  this.zClass105.ItemSpec(var1, var3);
                  this.zClass0676.reset();
               } else {
                  int j1 = this.zClass105.ItemRegistry(var1, var3);
                  this.on23(var2, var4);
                  this.zClass105.on23(var1, var3, s, s1, j1 <= this.zClass105.call239());
                  this.ColorAnimator("\u0418\u0441\u0442\u043e\u0447\u043d\u0438\u043a \u043f\u0443\u0441\u0442: " + this.ProtocolMessage(s, s1), true);
               }
            } else {
               this.on23(var2, var4);
               this.zClass105.ItemSpec(var1, var3);
               this.ColorAnimator(this.string3, true);
            }
         }
      }
   }

   public void on23(ScreenHandler var1, int var2) {
      if (!var1.getCursorStack().isEmpty()) {
         this.autoCraftVar143 = AutoCraft_Var143.val163;
      } else {
         Slot slot = var1.getSlot(var2);
         if (slot.hasStack()) {
            this.itemStack2 = slot.getStack().copy();
            this.int31 = var2;
            this.int32 = 2;
            this.autoCraftVar143 = AutoCraft_Var143.val353;
            minecraftClient3.interactionManager.clickSlot(var1.syncId, var2, 0, SlotActionType.PICKUP, minecraftClient3.player);
         }
      }
   }

   public void UiAnimation(ScreenHandler var1, int var2) {
      if (this.autoCraftVar143 == AutoCraft_Var143.val353) {
         int j = this.Easing(var1, var2);
         if (j != -1) {
            minecraftClient3.interactionManager.clickSlot(var1.syncId, j, 0, SlotActionType.QUICK_MOVE, minecraftClient3.player);
         }

         this.int32--;
         if (this.int32 <= 0) {
            this.autoCraftVar143 = AutoCraft_Var143.val163;
         }
      } else if (this.autoCraftVar143 == AutoCraft_Var143.val163) {
         if (var1.getCursorStack().isEmpty()) {
            this.ColorAnimator(var1);
         } else {
            int i = this.ColorAnimator(var1, var2);
            if (i != -1) {
               minecraftClient3.interactionManager.clickSlot(var1.syncId, i, 0, SlotActionType.PICKUP, minecraftClient3.player);
               if (var1.getCursorStack().isEmpty()) {
                  this.ColorAnimator(var1);
               }
            } else {
               this.on23(var1, this.blockPos6);
               this.ItemRegistry(var1);
               if (!var1.getCursorStack().isEmpty()) {
                  this.string3 = "\u041d\u0435\u0442 \u043c\u0435\u0441\u0442\u0430 \u043f\u043e\u0434 hovered-\u043f\u0440\u0435\u0434\u043c\u0435\u0442";
               } else {
                  this.call151();
               }
            }
         }
      }
   }

   public void ColorAnimator(ScreenHandler var1) {
      this.on23(var1, this.blockPos6);
      this.call087();
      this.zClass0676.reset();
   }

   public int Easing(ScreenHandler var1, int var2) {
      if (this.itemStack2.isEmpty()) {
         return -1;
      } else {
         for (int i = var2; i < var1.slots.size(); i++) {
            if (i != this.int31) {
               Slot slot = var1.getSlot(i);
               if (slot.hasStack() && this.UiAnimation(slot.getStack(), this.itemStack2)) {
                  return i;
               }
            }
         }

         return -1;
      }
   }

   public int ColorAnimator(ScreenHandler var1, int var2) {
      ItemStack itemstack = var1.getCursorStack();
      if (itemstack.isEmpty()) {
         return -1;
      } else {
         for (int i = 0; i < var2; i++) {
            Slot slot = var1.getSlot(i);
            if (slot.hasStack() && this.UiAnimation(slot.getStack(), itemstack) && slot.getStack().getCount() < slot.getStack().getMaxCount()) {
               return i;
            }
         }

         for (int j = 0; j < var2; j++) {
            if (!var1.getSlot(j).hasStack()) {
               return j;
            }
         }

         return -1;
      }
   }

   public void ItemRegistry(ScreenHandler var1) {
      if (!var1.getCursorStack().isEmpty()) {
         if (this.int31 >= 0 && this.int31 < var1.slots.size()) {
            Slot slot = var1.getSlot(this.int31);
            if (!slot.hasStack() || this.UiAnimation(slot.getStack(), var1.getCursorStack())) {
               minecraftClient3.interactionManager
                  .clickSlot(var1.syncId, this.int31, 0, SlotActionType.PICKUP, minecraftClient3.player);
               return;
            }
         }

         int j = this.UiAnimation(var1);

         for (int i = j; i < var1.slots.size(); i++) {
            ItemStack itemstack = var1.getSlot(i).getStack();
            if (itemstack.isEmpty() || this.UiAnimation(itemstack, var1.getCursorStack()) && itemstack.getCount() < itemstack.getMaxCount()) {
               minecraftClient3.interactionManager.clickSlot(var1.syncId, i, 0, SlotActionType.PICKUP, minecraftClient3.player);
               return;
            }
         }
      }
   }

   public void call151() {
      if (minecraftClient3.player != null
         && minecraftClient3.player.currentScreenHandler != minecraftClient3.player.playerScreenHandler) {
         minecraftClient3.player.closeHandledScreen();
      }

      this.string3 = "\u0421\u0443\u043d\u0434\u0443\u043a \u0437\u0430\u043f\u043e\u043b\u043d\u0435\u043d, \u0438\u0449\u0443 \u0434\u0440\u0443\u0433\u043e\u0439 \u0441\u043a\u043b\u0430\u0434";
      this.autoCraftVar159 = AutoCraft_Var159.val056;
      this.blockPos6 = null;
      this.boolean8 = true;
      this.zClass0676.reset();
      this.call042();
      this.call018();
   }

   public void call066() {
      if (minecraftClient3.player != null
         && minecraftClient3.player.currentScreenHandler != minecraftClient3.player.playerScreenHandler) {
         minecraftClient3.player.closeHandledScreen();
      }

      this.autoCraftVar159 = AutoCraft_Var159.val056;
      this.blockPos6 = null;
      this.zClass0676.reset();
      this.call042();
      this.call018();
      this.boolean8 = false;
   }

   public void call067() {
      this.boolean6 = false;
      this.boolean7 = false;
      this.list6.clear();
      this.map11.clear();
      this.map12.clear();
      this.int30 = 0;
      this.blockPos4 = null;
      this.blockPos5 = null;
      this.blockPos6 = null;
      this.blockPos3 = null;
      this.boolean8 = false;
      this.autoCraftVar159 = AutoCraft_Var159.val162;
      this.call042();
      this.call055();
      this.call018();
   }

   public void UiAnimation(ItemFilterRules var1) {
      if (!this.boolean7) {
         this.call088();
      }

      if (this.list6.isEmpty()) {
         this.boolean6 = true;
         this.autoCraftVar159 = AutoCraft_Var159.val056;
         this.Easing(var1);
         this.string3 = this.map11.isEmpty()
            ? "\u0421\u0443\u043d\u0434\u0443\u043a\u0438 \u0432 \u0437\u043e\u043d\u0435 \u0434\u043e\u0441\u044f\u0433\u0430\u0435\u043c\u043e\u0441\u0442\u0438 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u044b"
            : "\u0410\u043d\u0430\u043b\u0438\u0437 \u0441\u0443\u043d\u0434\u0443\u043a\u043e\u0432 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d";
      } else {
         this.blockPos4 = this.list6.getFirst();
         this.string3 = "\u0410\u043d\u0430\u043b\u0438\u0437\u0438\u0440\u0443\u044e \u0441\u0443\u043d\u0434\u0443\u043a "
            + this.ItemSpec(this.blockPos4);
         AutoCraft_Var165 ii1iiil1ll111iii11ii1illlii1_illi1l1l1 = this.on23(
            this.blockPos4, AutoCraft_Var159.val081
         );
         if (ii1iiil1ll111iii11ii1illlii1_illi1l1l1 == AutoCraft_Var165.val354
            || ii1iiil1ll111iii11ii1illlii1_illi1l1l1 == AutoCraft_Var165.val082) {
            this.list6.removeFirst();
            if (ii1iiil1ll111iii11ii1illlii1_illi1l1l1 == AutoCraft_Var165.val082) {
               this.blockPos4 = null;
               this.zClass0676.reset();
            }
         }
      }
   }

   public void call088() {
      this.map11.clear();
      this.list6.clear();
      this.blockPos3 = null;
      this.boolean7 = true;
      double d0 = this.call115();
      BlockPos blockpos = minecraftClient3.player.getBlockPos();
      int i = (int)Math.ceil(d0);
      var arraylist = new ArrayList();
      var hashset = new HashSet();
      BlockPos.stream(blockpos.add(-i, -i, -i), blockpos.add(i, i, i))
         .map(BlockPos::toImmutable)
         .forEach(
            var3x -> {
               BlockState blockstate = minecraftClient3.world.getBlockState(var3x);
               if (blockstate.getBlock() == Blocks.CRAFTING_TABLE
                  && this.ColorAnimator(var3x) != null
                  && (
                     this.blockPos3 == null
                        || Vec3d.ofCenter(var3x).squaredDistanceTo(minecraftClient3.player.getEyePos())
                           < Vec3d.ofCenter(this.blockPos3).squaredDistanceTo(minecraftClient3.player.getEyePos())
                  )) {
                  this.blockPos3 = var3x;
               }

               if (this.ItemRegistry(var3x) && this.ColorAnimator(var3x) != null && hashset.add(this.on23(var3x, blockstate))) {
                  arraylist.add(var3x);
               }
            }
         );
      arraylist.sort(Comparator.comparingDouble(var0 -> Vec3d.ofCenter((Vec3i) var0).squaredDistanceTo(minecraftClient3.player.getEyePos())));
      this.list6.addAll(arraylist);
   }

   public BlockPos on23(BlockPos var1, BlockState var2) {
      if (var2.contains(ChestBlock.CHEST_TYPE) && var2.get(ChestBlock.CHEST_TYPE) != ChestType.SINGLE) {
         BlockPos blockpos = var1.offset(ChestBlock.getFacing(var2));
         return blockpos.asLong() < var1.asLong() ? blockpos.toImmutable() : var1.toImmutable();
      } else {
         return var1.toImmutable();
      }
   }

   public void on23(ScreenHandler var1, BlockPos var2) {
      if (var2 != null) {
         int i = this.UiAnimation(var1);
         AutoCraft_Var7 ii1iiil1ll111iii11ii1illlii1_liil11l111liil1ll = new AutoCraft_Var7(
            this, var2.toImmutable()
         );

         for (int j = 0; j < i; j++) {
            ItemStack itemstack = var1.getSlot(j).getStack();
            if (itemstack.isEmpty()) {
               ii1iiil1ll111iii11ii1illlii1_liil11l111liil1ll.int124++;
            } else {
               ii1iiil1ll111iii11ii1illlii1_liil11l111liil1ll.on23(
                  new AutoCraft_Var134(
net.minecraft.item.Item.getRawId(itemstack.getItem()), ColorAnimator(itemstack.getItem()), this.ProfileItemBuilder(itemstack), itemstack.getCount(), itemstack.getMaxCount()
                  )
               );
            }
         }

         this.map11.put(var2.toImmutable(), ii1iiil1ll111iii11ii1illlii1_liil11l111liil1ll);
      }
   }

   public void Easing(ItemFilterRules var1) {
      if (var1 != null) {
         if (this.blockPos3 != null) {
            var1.UiAnimation(BlockPosEntry.FileLogger(this.blockPos3));
         }

         for (String s : var1.string111().keySet()) {
            this.on23(var1, s).ifPresent(var2 -> var1.call034().put(s, BlockPosEntry.FileLogger(var2)));
         }

         this.EnchantItemSpec(var1).ifPresent(var1x -> var1.on23(BlockPosEntry.FileLogger(var1x)));
      }
   }

   public void ColorAnimator(ItemFilterRules var1) {
      this.map12.clear();
      this.int30 = this.ItemRegistry(var1);
      int i = Math.max(1, this.int30);

      for (var entry : var1.string111().entrySet()) {
         int j = (Integer)entry.getValue() * i;
         this.map12.put((String)entry.getKey(), j);
      }
   }

   public int ItemRegistry(ItemFilterRules var1) {
      int i = Integer.MAX_VALUE;

      for (var entry : var1.string111().entrySet()) {
         String s = (String)entry.getKey();
         int j = this.ServiceException(var1.FriendFilter(s), var1.NpcCloneManager(s))
            + this.BotFeatureRegistry(var1.FriendFilter(s), var1.NpcCloneManager(s));
         i = Math.min(i, j / Math.max(1, (Integer)entry.getValue()));
      }

      if (i != Integer.MAX_VALUE && i > 0) {
         if (!this.u041aU0440U0430U0444U0442U0438U0442U044cU043cU0430U043aU0441U0438U043cU0443U043c.isEnabled()) {
            return 1;
         } else {
            int k = 1;
            int l = i;
            int i1 = 0;

            while (k <= l) {
               int j1 = k + (l - k) / 2;
               if (this.on23(var1, j1)) {
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

   public boolean on23(ItemFilterRules var1, int var2) {
      int i = 0;
      int j = this.call054();

      for (var entry : var1.string111().entrySet()) {
         String s = (String)entry.getKey();
         String s1 = var1.FriendFilter(s);
         String s2 = var1.NpcCloneManager(s);
         int k = (Integer)entry.getValue() * var2;
         int l = this.ServiceException(s1, s2);
         int i1 = Math.max(0, k - l);
         if (i1 != 0) {
            int j1 = this.InventoryUtils(s1, s2);
            int k1 = Math.max(0, i1 - j1);
            if (k1 > 0) {
               int l1 = Math.max(1, this.Item(s1));
               i += (k1 + l1 - 1) / l1;
               if (i > j) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   public boolean call153() {
      return this.u041aU0440U0430U0444U0442U0438U0442U044cU043cU0430U043aU0441U0438U043cU0443U043c.isEnabled();
   }

   public boolean ItemSpec(ItemFilterRules var1) {
      return !this.u0421U043aU043bU0430U0434U044bU0432U0430U0442U044cU0438U0442U043eU0433.isEnabled() ? false : !this.TextScanner(var1) || this.SimpleItemBuilder(var1) || !this.NbtItemSpec(var1);
   }

   public boolean TextScanner(ItemFilterRules var1) {
      for (var entry : var1.string111().entrySet()) {
         String s = (String)entry.getKey();
         if (this.ServiceException(var1.FriendFilter(s), var1.NpcCloneManager(s)) < (Integer)entry.getValue()) {
            return false;
         }
      }

      return true;
   }

   public boolean NbtItemSpec(ItemFilterRules var1) {
      return var1.float275().isBlank()
         ? false
         : this.InventoryUtils(var1.float275(), var1.boolean178()) > 0 || this.call054() > 0;
   }

   public boolean ModuleSnapshotDto(String var1, String var2) {
      return this.InventoryUtils(var1, var2) > 0 || this.call054() > 0;
   }

   public int InventoryUtils(String var1, String var2) {
      int i = 0;

      for (int j = 0; j < 36; j++) {
         ItemStack itemstack = minecraftClient3.player.getInventory().getStack(j);
         if (!itemstack.isEmpty() && this.on23(itemstack, var1, var2)) {
            i += Math.max(0, itemstack.getMaxCount() - itemstack.getCount());
         }
      }

      return i;
   }

   public int BotFeatureRegistry(String var1, String var2) {
      int i = 0;

      for (AutoCraft_Var7 ii1iiil1ll111iii11ii1illlii1_liil11l111liil1ll : this.map11.values()) {
         i += ii1iiil1ll111iii11ii1illlii1_liil11l111liil1ll.ConfigJsonUtil(var1, var2);
      }

      return i;
   }

   public Optional<BlockPos> on23(ItemFilterRules var1, String var2) {
      String s = var1.FriendFilter(var2);
      String s1 = var1.NpcCloneManager(var2);
      return this.map11
         .values()
         .stream()
         .filter(var2x -> var2x.ConfigJsonUtil(s, s1) > 0)
         .sorted(
            Comparator.<AutoCraft_Var7>comparingInt(var2x -> var2x.ConfigJsonUtil(s, s1))
               .reversed()
               .thenComparingDouble(var0 -> Vec3d.ofCenter(var0.blockPos23).squaredDistanceTo(minecraftClient3.player.getEyePos()))
         )
         .map(var0 -> var0.blockPos23)
         .findFirst();
   }

   public Optional<BlockPos> EnchantItemSpec(ItemFilterRules var1) {
      String s = var1.float275();
      String s1 = var1.boolean178();
      return this.map11
         .values()
         .stream()
         .filter(var2x -> var2x.CloudResponse(s, s1))
         .sorted(Comparator.comparingDouble(var0 -> Vec3d.ofCenter(var0.blockPos23).squaredDistanceTo(minecraftClient3.player.getEyePos())))
         .map(var0 -> var0.blockPos23)
         .findFirst();
   }

   public AutoCraft_Var165 on23(BlockPos var1, AutoCraft_Var159 var2) {
      if (var1 != null && this.zClass0676.EventModifyMouseRotationInput(85L)) {
         BlockHitResult blockhitresult = this.ColorAnimator(var1);
         if (blockhitresult == null) {
            this.string3 = "\u041d\u0435\u0442 \u043b\u0443\u0447\u0430 \u0434\u043e \u0431\u043b\u043e\u043a\u0430 " + this.ItemSpec(var1);
            this.call055();
            return AutoCraft_Var165.val082;
         } else {
            this.var118 = RotationMath.Event01(blockhitresult.getPos());
            if (!this.Easing(var1)) {
               this.string3 = "\u041f\u043e\u0432\u043e\u0440\u0430\u0447\u0438\u0432\u0430\u044e\u0441\u044c \u043a " + this.ItemSpec(var1);
               return AutoCraft_Var165.val355;
            } else {
               EffectEngine.on23(blockhitresult, Hand.MAIN_HAND);
               this.autoCraftVar159 = var2;
               this.int24 = 30;
               this.zClass0676.reset();
               this.call018();
               this.call055();
               return AutoCraft_Var165.val354;
            }
         }
      } else {
         return AutoCraft_Var165.val355;
      }
   }

   public boolean Easing(BlockPos var1) {
      Rotation ililiiili1ll1li11 = val002.LineShader();
      BlockHitResult blockhitresult = RaycastUtils.on23(
         minecraftClient3.player.getCameraPosVec(1.0F),
         ililiiili1ll1li11,
         this.call115(),
         var1x -> var1x != null && var1x.getBlockPos().equals(var1)
      );
      return blockhitresult != null && blockhitresult.getType() != Type.MISS && blockhitresult.getBlockPos().equals(var1);
   }

   public BlockHitResult ColorAnimator(BlockPos var1) {
      Vec3d vec3d = Vec3d.ofCenter(var1);
      var arraylist = new ArrayList();
      arraylist.add(vec3d);

      for (Direction direction : Direction.values()) {
         arraylist.add(vec3d.add(Vec3d.of(direction.getVector()).multiply(0.5)));
      }

      Vec3d vec3d2 = minecraftClient3.player.getCameraPosVec(1.0F);
      double d0 = this.call115();

      for (Vec3d vec3d1 : (Iterable<Vec3d>)(Object)(arraylist)) {
         Rotation ililiiili1ll1li11 = RotationMath.Event01(vec3d1);
         BlockHitResult blockhitresult = RaycastUtils.on23(
            vec3d2, ililiiili1ll1li11, d0, var1x -> var1x != null && var1x.getBlockPos().equals(var1)
         );
         if (blockhitresult != null && blockhitresult.getType() != Type.MISS && blockhitresult.getBlockPos().equals(var1)) {
            return blockhitresult;
         }
      }

      return null;
   }

   public void call113() {
      this.call055();
      this.call018();
      if (this.autoCraftVar159 == AutoCraft_Var159.val081) {
         this.blockPos4 = null;
         this.autoCraftVar159 = AutoCraft_Var159.val162;
      } else if (this.autoCraftVar159 == AutoCraft_Var159.val109) {
         this.EventPosHook(
            "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043e\u0442\u043a\u0440\u044b\u0442\u044c \u0441\u0443\u043d\u0434\u0443\u043a \u0441 \u0440\u0435\u0441\u0443\u0440\u0441\u0430\u043c\u0438"
         );
      } else if (this.autoCraftVar159 == AutoCraft_Var159.val080) {
         this.EventPosHook(
            "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043e\u0442\u043a\u0440\u044b\u0442\u044c \u0441\u0443\u043d\u0434\u0443\u043a-\u0441\u043a\u043b\u0430\u0434"
         );
      } else {
         if (this.autoCraftVar159 == AutoCraft_Var159.val161) {
            this.EventPosHook(
               "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043e\u0442\u043a\u0440\u044b\u0442\u044c \u0432\u0435\u0440\u0441\u0442\u0430\u043a"
            );
         }
      }
   }

   public void call055() {
      this.var118 = null;
   }

   public boolean call150() {
      return this.autoCraftVar159 == AutoCraft_Var159.val081
         || this.autoCraftVar159 == AutoCraft_Var159.val109
         || this.autoCraftVar159 == AutoCraft_Var159.val080
         || this.autoCraftVar159 == AutoCraft_Var159.val161;
   }

   public boolean ItemRegistry(BlockPos var1) {
      BlockEntity blockentity = minecraftClient3.world.getBlockEntity(var1);
      return blockentity instanceof ChestBlockEntity || blockentity instanceof BarrelBlockEntity || blockentity instanceof ShulkerBoxBlockEntity;
   }

   public double call115() {
      return minecraftClient3.player.getBlockInteractionRange() + 0.15;
   }

   public String ItemSpec(BlockPos var1) {
      return var1 == null ? "?" : var1.getX() + " " + var1.getY() + " " + var1.getZ();
   }

   public boolean SimpleItemBuilder(ItemFilterRules var1) {
      if (var1.float275().isBlank()) {
         return false;
      } else {
         int i = 0;

         for (int j = 0; j < 36; j++) {
            ItemStack itemstack = minecraftClient3.player.getInventory().getStack(j);
            if (!itemstack.isEmpty() && var1.on23(itemstack, this)) {
               i++;
            }
         }

         return (float)i / 36.0F >= 0.5F;
      }
   }

   public boolean ItemServiceBase(ItemFilterRules var1) {
      return !var1.float275().isBlank() && this.ServiceException(var1.float275(), var1.boolean178()) > 0;
   }

   public String NbtEditor(ItemFilterRules var1) {
      for (var entry : var1.string111().entrySet()) {
         String s = (String)entry.getKey();
         int i = this.map12.getOrDefault(s, (Integer)entry.getValue());
         int j = this.ServiceException(var1.FriendFilter(s), var1.NpcCloneManager(s));
         if (j < i) {
            return s;
         }
      }

      return "";
   }

   public int call054() {
      int i = 0;

      for (int j = 0; j < 36; j++) {
         if (minecraftClient3.player.getInventory().getStack(j).isEmpty()) {
            i++;
         }
      }

      return i;
   }

   public int ServiceException(String var1, String var2) {
      int i = 0;

      for (int j = 0; j < 36; j++) {
         ItemStack itemstack = minecraftClient3.player.getInventory().getStack(j);
         if (!itemstack.isEmpty() && this.on23(itemstack, var1, var2)) {
            i += itemstack.getCount();
         }
      }

      return i;
   }

   public int PotionItemBuilder(ItemFilterRules var1) {
      int i = 0;

      for (int j = 0; j < 36; j++) {
         ItemStack itemstack = minecraftClient3.player.getInventory().getStack(j);
         if (!itemstack.isEmpty() && !this.on23(var1, itemstack)) {
            i += itemstack.getCount();
         }
      }

      return i;
   }

   public boolean on23(ItemFilterRules var1, ScreenHandler var2, int var3) {
      String s = var1.float275();
      String s1 = var1.boolean178();

      for (int i = 0; i < var3; i++) {
         Slot slot = var2.getSlot(i);
         if (!slot.hasStack()) {
            return true;
         }

         ItemStack itemstack = slot.getStack();
         if (this.on23(itemstack, s, s1) && itemstack.getCount() < itemstack.getMaxCount()) {
            return true;
         }
      }

      return false;
   }

   public boolean on23(ItemFilterRules var1, ItemStack var2) {
      for (var entry : var1.string111().entrySet()) {
         String s = (String)entry.getKey();
         if (this.on23(var2, var1.FriendFilter(s), var1.NpcCloneManager(s))) {
            return true;
         }
      }

      return false;
   }

   public boolean on23(Item var1, String var2) {
      return Objects.equals(Registries.ITEM.getId(var1).toString(), var2);
   }

   public boolean on23(ItemStack var1, String var2, String var3) {
      if (var1 == null || var1.isEmpty() || !this.on23(var1.getItem(), var2)) {
         return false;
      } else if (var3 != null && !var3.isBlank()) {
         String s = var1.getName().getString();
         return s.equalsIgnoreCase(var3) || s.toLowerCase(Locale.ROOT).contains(var3.toLowerCase(Locale.ROOT));
      } else {
         return true;
      }
   }

   public boolean UiAnimation(ItemStack var1, ItemStack var2) {
      if (var1 != null && var2 != null && !var1.isEmpty() && !var2.isEmpty()) {
         ItemStack itemstack = var1.copy();
         ItemStack itemstack1 = var2.copy();
         itemstack.setCount(1);
         itemstack1.setCount(1);
         return ItemStack.areItemsEqual(itemstack, itemstack1) && ItemStack.areEqual(itemstack, itemstack1);
      } else {
         return false;
      }
   }

   public void ItemSpec(ScreenHandler var1) {
      ItemStack itemstack = var1.getCursorStack();
      if (!itemstack.isEmpty()) {
         for (Slot slot : var1.slots) {
            if (slot.inventory instanceof PlayerInventory && slot.getIndex() < 36 && slot.getStack().isEmpty()) {
               minecraftClient3.interactionManager.clickSlot(var1.syncId, slot.id, 0, SlotActionType.PICKUP, minecraftClient3.player);
               return;
            }
         }

         minecraftClient3.interactionManager.clickSlot(var1.syncId, (char)-999, 0, SlotActionType.PICKUP, minecraftClient3.player);
      }
   }

   public void EventPosHook(String var1) {
      this.string3 = var1;
      this.string4 = "";
      this.autoCraftVar159 = AutoCraft_Var159.val056;
      this.zClass105.call114();
      this.call053();
      this.call055();
      this.call018();
   }

   public void ColorAnimator(String var1, boolean var2) {
      if (minecraftClient3.player != null
         && minecraftClient3.player.currentScreenHandler != minecraftClient3.player.playerScreenHandler) {
         minecraftClient3.player.closeHandledScreen();
      }

      this.blockPos5 = null;
      this.EventPosHook(var1);
      if (var2) {
         this.zClass0676.reset();
      }
   }

   public void call042() {
      this.int28 = -1;
      this.int29 = 0;
      this.call087();
   }

   public void call087() {
      this.autoCraftVar143 = AutoCraft_Var143.val223;
      this.itemStack2 = ItemStack.EMPTY;
      this.int31 = -1;
      this.int32 = 0;
   }

   public void UiAnimation(EventRender2 var1) {
      if (this.isEnabled() || this.zClass036.call149() || this.zClass068.isActive()) {
         String s;
         if (this.zClass036.call149()) {
            s = this.zClass036.call116();
         } else if (this.zClass068.isActive()) {
            s = this.zClass068.call116();
         } else {
            s = this.string3;
         }

         if (s != null && !s.isBlank()) {
            Font font = Fonts.NEW_REGULAR.getFont(8.0F);
            float f = font.width(s) + 14.0F;
            float f1 = (float)minecraftClient3.getWindow().getScaledWidth() / 2.0F - f / 2.0F;
            float f2 = (float)(minecraftClient3.getWindow().getScaledHeight() - 54);
            ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
            ArgbColor i11ii1llliilllii1i1 = zenithstyle == null
               ? new ArgbColor(14, 14, 16, 160)
               : zenithstyle.getPanelLeftBackground().getColor().EventHookWorldRender(160);
            var1.Bot()
               .drawRoundedRect(f1, f2, f, 16.0F, org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(5.0F), i11ii1llliilllii1i1);
            float f3 = f2 + (16.0F - font.height()) / 2.0F - 1.0F;
            var1.Bot().drawText(font, s, f1 + f / 2.0F - font.width(s) / 2.0F, f3, ArgbColor.var11934);
         }
      }
   }

   public AutoCraft_Var160 on23(RecipeDisplayEntry var1, ItemStack var2, ContextParameterMap var3) {
      String s = ColorAnimator(var2.getItem());
      String s1 = this.ProfileItemBuilder(var2);
      String s2 = this.ProtocolMessage(s, s1);
      String[] astring = new String[9];
      String[] astring1 = new String[9];

      for (int i = 0; i < 9; i++) {
         astring[i] = "";
         astring1[i] = "";
      }

      RecipeDisplay recipedisplay = var1.display();
      if (recipedisplay instanceof ShapedCraftingRecipeDisplay shapedcraftingrecipedisplay) {
         this.on23(shapedcraftingrecipedisplay, var3, astring, astring1);
      } else if (recipedisplay instanceof ShapelessCraftingRecipeDisplay shapelesscraftingrecipedisplay) {
         this.on23(shapelesscraftingrecipedisplay, var3, astring, astring1);
      }

      String s3 = this.on23(s, s1, astring, astring1);
      return new AutoCraft_Var160(s3, s2, s, s1, astring, astring1);
   }

   public void on23(ShapedCraftingRecipeDisplay var1, ContextParameterMap var2, String[] var3, String[] var4) {
      var list = var1.ingredients();
      int i = Math.min(3, var1.width());
      int j = Math.min(3, var1.height());

      for (int k = 0; k < j; k++) {
         for (int l = 0; l < i; l++) {
            int i1 = k * var1.width() + l;
            int j1 = k * 3 + l;
            if (i1 < list.size()) {
               this.on23((SlotDisplay)list.get(i1), var2, var3, var4, j1);
            }
         }
      }
   }

   public void on23(ShapelessCraftingRecipeDisplay var1, ContextParameterMap var2, String[] var3, String[] var4) {
      var list = var1.ingredients();

      for (int i = 0; i < Math.min(9, list.size()); i++) {
         this.on23((SlotDisplay)list.get(i), var2, var3, var4, i);
      }
   }

   public void on23(SlotDisplay var1, ContextParameterMap var2, String[] var3, String[] var4, int var5) {
      ItemStack itemstack = var1.getFirst(var2);
      if (!itemstack.isEmpty()) {
         var3[var5] = ColorAnimator(itemstack.getItem());
         var4[var5] = this.ProfileItemBuilder(itemstack);
      }
   }

   public void on23(ItemFilterRules var1, AutoCraft_Var160 var2) {
      var1.CosmeticManager(true);
      var1.EmotePlayback(true);
      var1.PetManager(var2.AutoLeave());
      var1.HolyWorldClient(var2.double123());
      var1.RotationQueue(var2.double124());
      var1.TaskQueue(var2.double123());
      var1.EmoteManager(false);

      for (int i = 0; i < 9; i++) {
         var1.Easing(i, var2.double125()[i]);
         var1.ColorAnimator(i, var2.double126()[i]);
      }
   }

   public String on23(String var1, String var2, String[] var3, String[] var4) {
      StringBuilder stringbuilder = new StringBuilder("servers").append('|').append(var1).append('|').append(var2);

      for (int i = 0; i < 9; i++) {
         stringbuilder.append('|').append(var3[i]).append('#').append(var4[i]);
      }

      String s1 = var1;
      int j = var1.indexOf(58);
      if (j != -1 && j + 1 < var1.length()) {
         s1 = var1.substring(j + 1);
      }

      String s = (var2 != null && !var2.isBlank() ? var2 : s1).toLowerCase(Locale.ROOT).replace(" ", "_").replaceAll("[^a-z0-9_]+", "_");
      if (s.isBlank()) {
         s = "recipe";
      }

      return "servers_" + s + "_" + Integer.toHexString(stringbuilder.toString().hashCode());
   }

   public boolean on23(RecipeDisplay var1) {
      return var1 instanceof ShapedCraftingRecipeDisplay || var1 instanceof ShapelessCraftingRecipeDisplay;
   }

   public boolean PotionItemBuilder(ItemStack var1) {
      if (var1.isEmpty()) {
         return false;
      } else {
         Identifier identifier = Registries.ITEM.getId(var1.getItem());
         if (!"minecraft".equals(identifier.getNamespace())) {
            return true;
         } else {
            String s = var1.getItem().getName().getString();
            String s1 = var1.getName().getString();
            return !s1.equals(s)
               || var1.contains(DataComponentTypes.CUSTOM_NAME)
               || var1.contains(DataComponentTypes.LORE)
               || var1.contains(DataComponentTypes.CUSTOM_DATA)
               || var1.contains(DataComponentTypes.CUSTOM_MODEL_DATA)
               || var1.contains(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE);
         }
      }
   }

   public String ProfileItemBuilder(ItemStack var1) {
      if (var1 != null && !var1.isEmpty()) {
         String s = var1.getItem().getName().getString();
         String s1 = var1.getName().getString();
         return s1.equals(s) ? "" : s1;
      } else {
         return "";
      }
   }

   public void call033() {
      if (this.FovEvent(this.string2) == null) {
         var list = this.call154();
         if (!list.isEmpty()) {
            this.string2 = ((ItemFilterRules)list.getFirst()).getId();
         }
      }
   }

   public List<ItemFilterRules> EventGetFogColorHook(String var1) {
      this.CommandManager(false);
      return this.call154();
   }

   public List<ItemFilterRules> call154() {
      return this.list5
         .stream()
         .filter(var0 -> var0.string112().equalsIgnoreCase("servers"))
         .sorted(Comparator.comparing(ItemFilterRules::getDisplayName))
         .toList();
   }

   public ItemFilterRules CloudRouter(String var1, String var2) {
      this.CommandManager(false);
      return this.FovEvent(var2);
   }

   public ItemFilterRules FovEvent(String var1) {
      return var1 != null && !var1.isBlank()
         ? this.list5
            .stream()
            .filter(var1x -> var1x.string112().equalsIgnoreCase("servers") && var1x.getId().equalsIgnoreCase(var1))
            .findFirst()
            .orElse(null)
         : null;
   }

   public ItemFilterRules call086() {
      return this.CloudRouter("servers", this.call068());
   }

   public ItemFilterRules call043() {
      this.call033();
      return this.FovEvent(this.call068());
   }

   public String call056() {
      return "servers";
   }

   public void EventRender(String var1) {
      this.zClass105.reset();
      this.call042();
      this.call053();
   }

   public String call068() {
      return this.string2;
   }

   public void EventItemRenderHook(String var1) {
      String s = var1 == null ? "" : var1;
      if (!this.string2.equals(s)) {
         this.string2 = s;
         this.zClass105.reset();
         this.call042();
         this.call053();
         this.call067();
      }
   }

   public ItemFilterRules EventRender2(String var1) {
      this.VisualSettingsStore(
         "\u0420\u0443\u0447\u043d\u044b\u0435 \u043f\u0440\u0435\u0441\u0435\u0442\u044b \u043e\u0442\u043a\u043b\u044e\u0447\u0435\u043d\u044b: \u0440\u0435\u0446\u0435\u043f\u0442\u044b \u0431\u0435\u0440\u0443\u0442\u0441\u044f \u0438\u0437 \u043a\u043d\u0438\u0433\u0438"
      );
      return null;
   }

   public boolean ProfileItemBuilder(ItemFilterRules var1) {
      return false;
   }

   public boolean EventHookWorldRender(String var1) {
      return false;
   }

   public void StringCodec(ItemFilterRules var1) {
      if (var1 != null) {
         this.list5.add(var1);
      }
   }

   public void Event18Ext3(String var1) {
      this.zClass036.Event18Ext3(var1);
   }

   public void call184() {
      this.zClass105.reset();
   }

   public String ProtocolMessage(String var1, String var2) {
      return var2 != null && !var2.isBlank() ? var2 : this.PacketEvent(var1);
   }

   public String EventRenderScreenHook(String var1) {
      int i = var1.indexOf(35);
      return i == -1 ? this.PacketEvent(var1) : this.ProtocolMessage(var1.substring(0, i), var1.substring(i + 1));
   }

   public void string89() {
      this.zClass036.string89();
   }

   public void path6() {
      this.zClass036.path6();
   }

   public void call395() {
      this.VisualSettingsStore(
         "\u0420\u0443\u0447\u043d\u043e\u0435 \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u043e\u0442\u043a\u043b\u044e\u0447\u0435\u043d\u043e: \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0439\u0442\u0435 \u0441\u043f\u0438\u0441\u043e\u043a \u0440\u0435\u0446\u0435\u043f\u0442\u043e\u0432"
      );
   }

   public void call240() {
      this.zClass036.call240();
   }

   public void call117() {
      this.zClass036.call117();
   }

   public void call155() {
      this.zClass036.call155();
   }

   public void AnalyticsTracker(String var1, String var2) {
      this.string2 = var2 == null ? "" : var2;
   }

   public static String ColorAnimator(Item var0) {
      return var0 != null && var0 != Items.AIR ? Registries.ITEM.getId(var0).toString() : "";
   }

   public Item GameMessageEvent(String var1) {
      if (var1 != null && !var1.isBlank()) {
         Identifier identifier = Identifier.tryParse(var1);
         return identifier != null && Registries.ITEM.containsId(identifier) ? Registries.ITEM.get(identifier) : Items.AIR;
      } else {
         return Items.AIR;
      }
   }

   public String PacketEvent(String var1) {
      Item item = this.GameMessageEvent(var1);
      return item == Items.AIR ? "\u041f\u0443\u0441\u0442\u043e" : item.getName().getString();
   }

   public BooleanSetting call428() {
      return this.u0410U0432U0442U043eU0437U0430U0431U043eU0440U0440U0435U0441U0443U0440U0441U043eU0432;
   }

   public BooleanSetting call429() {
      return this.u0421U043aU043bU0430U0434U044bU0432U0430U0442U044cU0438U0442U043eU0433;
   }

   public BooleanSetting double119() {
      return this.u041aU0440U0430U0444U0442U0438U0442U044cU043cU0430U043aU0441U0438U043cU0443U043c;
   }

   @Override
   public JsonObject save() {
      JsonObject jsonobject = super.save();
      jsonobject.add("AutoCraftData", this.int404());
      return jsonobject;
   }

   @Override
   public void load(JsonObject var1) {
      super.load(var1);
      if (var1 == null) {
         this.call033();
      } else {
         JsonObject jsonobject = null;
         if (var1.has("AutoCraftData") && var1.get("AutoCraftData").isJsonObject()) {
            jsonobject = var1.getAsJsonObject("AutoCraftData");
         } else if (var1.has("presets") || var1.has("selectedProfile")) {
            jsonobject = var1;
         }

         if (jsonobject != null) {
            this.CloudResponse(jsonobject);
         } else {
            this.call033();
         }
      }
   }

   public JsonObject int404() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("selectedProfile", "servers");
      jsonobject.addProperty("selectedServersPreset", this.string2);
      jsonobject.addProperty("batch", this.u041aU0440U0430U0444U0442U0438U0442U044cU043cU0430U043aU0441U0438U043cU0443U043c.isEnabled());
      JsonArray jsonarray = new JsonArray();

      for (ItemFilterRules iiilili1lli1i11lilillliiii1iii : new ArrayList<>(this.list5)) {
         if (this.FileLogger(iiilili1lli1i11lilillliiii1iii)) {
            JsonObject jsonobject1 = new JsonObject();
            jsonobject1.addProperty("id", iiilili1lli1i11lilillliiii1iii.getId());
            jsonobject1.addProperty("profile", "servers");
            JsonObject jsonobject2 = new JsonObject();

            for (var entry : iiilili1lli1i11lilillliiii1iii.call034().entrySet()) {
               jsonobject2.add((String)entry.getKey(), ((BlockPosEntry)entry.getValue()).toJson());
            }

            jsonobject1.add("sources", jsonobject2);
            jsonobject1.add("output", iiilili1lli1i11lilillliiii1iii.call241().toJson());
            jsonobject1.add("workbench", iiilili1lli1i11lilillliiii1iii.call156().toJson());
            jsonarray.add(jsonobject1);
         }
      }

      jsonobject.add("presets", jsonarray);
      return jsonobject;
   }

   public boolean FileLogger(ItemFilterRules var1) {
      return var1 != null
         && (!var1.call034().isEmpty() || var1.call241().isPresent() || var1.call156().isPresent());
   }

   public void PacketReceiveEvent(String var1) {
      this.string3 = var1;
      this.VisualSettingsStore(var1);
      if (minecraftClient3.player != null
         && minecraftClient3.player.currentScreenHandler != minecraftClient3.player.playerScreenHandler) {
         minecraftClient3.player.closeHandledScreen();
      }

      if (this.isEnabledRaw()) {
         this.setToggled(false);
      }
   }

   public void PacketSendEvent(String var1) {
      ZenithClient.on23().ConfigJsonUtil().on23("S", Text.literal(var1));
   }

   public void VisualSettingsStore(String var1) {
      ZenithClient.on23().ConfigJsonUtil().on23("!", Text.literal(var1));
   }

   public int Item(String var1) {
      Item item = this.GameMessageEvent(var1);
      return item == Items.AIR ? 64 : item.getDefaultStack().getMaxCount();
   }

   public boolean on23(AutoCraft_Var134 var1, String var2, String var3) {
      if (!Objects.equals(var1.double127(), var2)) {
         return false;
      } else if (var3 != null && !var3.isBlank()) {
         String s = var1.AutoLeave();
         return s.equalsIgnoreCase(var3) || s.toLowerCase(Locale.ROOT).contains(var3.toLowerCase(Locale.ROOT));
      } else {
         return true;
      }
   }
}
