package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "NameTags",
   O000000000 = "Теги сущностей",
   O0000000000 = Category.Visuals
)
public class NameTags extends Module {
   private static final float O00000000O00OO = 0.0625F;
   private static final long O00000000O0O = 250L;
   public final ModeSetting O000000000O = new ModeSetting("Режим отображения", "Legacy", "Legacy", "New");
   private static final int O00000000O0O0 = RenderManager.W382.O0000000000(88, 220, 116, 255);
   private static final String O00000000O0O00 = "Игроки";
   private static final String O00000000O0O0O = "Голые";
   private static final String O00000000O0OO = "Мобы";
   private static final String O00000000O0OO0 = "Животные";
   private static final String O00000000O0OOO = "Предметы";
   public final GroupSetting O000000000O0 = new GroupSetting(
         "Цели",
         new BooleanSetting("Игроки", true),
         new BooleanSetting("Голые", true),
         new BooleanSetting("Мобы", false),
         new BooleanSetting("Животные", false),
         new BooleanSetting("Предметы", false)
      )
      .O00000000(() -> this.O000000000O.O000000000("New"));
   public final GroupSetting O000000000O00 = new GroupSetting("Тип", new BooleanSetting("Player", true), new BooleanSetting("Hologram", true))
      .O00000000(() -> this.O000000000O.O000000000("New"));
   public final BooleanSetting O000000000O000 = new BooleanSetting("Броня", true)
      .O00000000(() -> this.O000000000O.O000000000("Legacy") && !this.O000000000O0.O000000000("Игроки"));
   public final BooleanSetting O000000000O00O = new BooleanSetting("Правая рука", true)
      .O00000000(() -> this.O000000000O.O000000000("Legacy") && !this.O000000000O0.O000000000("Игроки"));
   public final BooleanSetting O000000000O0O = new BooleanSetting("Левая рука", true)
      .O00000000(() -> this.O000000000O.O000000000("Legacy") && !this.O000000000O0.O000000000("Игроки"));
   public final BooleanSetting O000000000O0O0 = new BooleanSetting("Эффекты", true).O00000000(() -> !this.O000000000O.O000000000("Legacy"));
   public final BooleanSetting O000000000O0OO = new BooleanSetting("Полоса HP", true).O00000000(() -> !this.O000000000O.O000000000("Legacy"));
   public final BooleanSetting O000000000OO = new BooleanSetting("Невидимки", true).O00000000(() -> this.O000000000O.O000000000("Legacy"));
   public final BooleanSetting O000000000OO0 = new BooleanSetting("Инфо при наводке", true).O00000000(() -> this.O000000000O.O000000000("Legacy"));
   public final NumberSetting O000000000OO00 = new NumberSetting("Размер", 1.2F, 0.75F, 1.9F, 0.05F, true)
      .O00000000(() -> this.O000000000O.O000000000("Legacy"));
   public final NumberSetting O000000000OO0O = new NumberSetting("Радиус деталей", 11.0F, 2.0F, 32.0F, 0.5F, false)
      .O00000000(() -> this.O000000000O.O000000000("Legacy"));
   public final ModeSetting O000000000OOO = new ModeSetting("Режим обводки", "Боксы", "Боксы", "Скелет", "Не рендерить")
      .O00000000(() -> !this.O000000000O.O000000000("Legacy"));
   public final ModeSetting O000000000OOO0 = new ModeSetting("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр", "Неоморфизм", "Феррофлюид")
      .O00000000(() -> this.O000000000O.O000000000("New"));
   public final BooleanSetting O000000000OOOO = new BooleanSetting("Показывать голову", true).O00000000(() -> this.O000000000O.O000000000("New"));
   public final BooleanSetting O00000000O = new BooleanSetting("Отображать полные имена", false).O00000000(() -> this.O000000000O.O000000000("New"));
   public final BooleanSetting O00000000O0 = new BooleanSetting("Подсветка предметов", true).O00000000(() -> this.O000000000O.O000000000("New"));
   public final BooleanSetting O00000000O00 = new BooleanSetting("Тень плашек", true).O00000000(() -> this.O000000000O.O000000000("New"));
   public final BooleanSetting O00000000O000 = new BooleanSetting("Градиент текста", false).O00000000(() -> this.O000000000O.O000000000("New"));
   public final BooleanSetting O00000000O0000 = new BooleanSetting("Цвет предмета в градиенте", true)
      .O00000000(() -> this.O000000000O.O000000000("New") || !this.O00000000O000.O0000000000());
   public final ColorSetting O00000000O000O = new ColorSetting("Второй цвет текста", 47.0F, 0.45F, 1.0F)
      .O000000000(() -> this.O000000000O.O000000000("New") || !this.O00000000O000.O0000000000());
   public final NumberSetting O00000000O00O = new NumberSetting("Скорость градиента", 1.0F, 0.2F, 3.0F, 0.1F, false)
      .O00000000(() -> this.O000000000O.O000000000("New") || !this.O00000000O000.O0000000000());
   public final NumberSetting O00000000O00O0 = new NumberSetting("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true);
   private final O00000O0O00OOO O00000000OO = new O00000O0O00OOO();
   private final Map<PlayerEntity, NameTags.W181> O00000000OO0 = new HashMap<>();
   private final Map<LivingEntity, NameTags.W181> O00000000OO00 = new HashMap<>();
   private final Map<ItemEntity, NameTags.W181> O00000000OO000 = new HashMap<>();
   private final Map<Integer, NameTags.W178> O00000000OO00O = new HashMap<>();
   private final List<NameTags.W180> O00000000OO0O = new ArrayList<>();
   private final Set<Integer> O00000000OO0O0 = new HashSet<>();
   private final List<ItemStack> O00000000OO0OO = new ArrayList<>();
   private final List<ItemStack> O00000000OOO = new ArrayList<>();
   private final MatrixStack O00000000OOO0 = new MatrixStack();
   private final Vector3f O00000000OOO00 = new Vector3f();
   private final List<NameTags.W179> O00000000OOO0O = new ArrayList<>();
   private final Map<String, Float> O00000000OOOO = new HashMap<>();
   private final Map<Integer, Long> O00000000OOOO0 = new HashMap<>();
   private final O0000000OOO00 O00000000OOOOO = new O0000000OOO00() {};
   private boolean O0000000O = false;
   private float O0000000O0 = 0.0F;
   private float O0000000O00 = 0.0F;
   private float O0000000O000 = 0.0F;
   private float O0000000O0000 = 0.0F;
   private float O0000000O00000 = 0.0F;
   private boolean O0000000O0000O = false;
   private boolean O0000000O000O = false;
   private long O0000000O000O0 = 0L;
   private int O0000000O000OO;
   private int O0000000O00O;
   private int O0000000O00O0;
   private int O0000000O00O00;
   private int O0000000O00O0O;
   private int O0000000O00OO;
   private static final O0000O000OO O0000000O00OO0 = O0000O000OO.O00000000();

   public NameTags() {
      this.O00000000(
         new Setting[]{
            this.O000000000O,
            this.O000000000O0,
            this.O000000000O00,
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO,
            this.O000000000OO0,
            this.O000000000OO00,
            this.O000000000OO0O,
            this.O000000000OOO,
            this.O00000000O00O0,
            this.O000000000OOO0,
            this.O000000000OOOO,
            this.O00000000O,
            this.O00000000O0,
            this.O00000000O00,
            this.O00000000O000,
            this.O00000000O0000,
            this.O00000000O000O,
            this.O00000000O00O
         }
      );
      this.O00000000OOOOO.O00000000(this.O000000000O0);
      this.O00000000OOOOO.O00000000(this.O000000000O00);
      this.O00000000OOOOO.O00000000(this.O000000000O000);
      this.O00000000OOOOO.O00000000(this.O000000000O00O);
      this.O00000000OOOOO.O00000000(this.O000000000O0O);
      this.O00000000OOOOO.O00000000(this.O000000000O0O0);
      this.O00000000OOOOO.O00000000(this.O000000000O0OO);
      this.O00000000OOOOO.O00000000(this.O000000000OOO);
      this.O00000000OOOOO.O00000000(this.O00000000O00O0);
      this.O00000000OOOOO.O00000000(this.O000000000OOO0);
      this.O00000000OOOOO.O00000000(this.O000000000OOOO);
      this.O00000000OOOOO.O00000000(this.O00000000O);
      this.O00000000OOOOO.O00000000(this.O00000000O0);
      this.O00000000OOOOO.O00000000(this.O00000000O00);
      this.O00000000OOOOO.O00000000(this.O00000000O000);
      this.O00000000OOOOO.O00000000(this.O00000000O0000);
      this.O00000000OOOOO.O00000000(this.O00000000O000O);
      this.O00000000OOOOO.O00000000(this.O00000000O00O);
   }

   @Override
   public void O00000000() {
      this.O00000000OO.O00000000();
      this.O00000000OOOO0.clear();
      this.O00000000OOOO.clear();
      this.O00000000OO00O.clear();
      super.O00000000();
   }

   @Override
   public void O000000000() {
      this.O00000000OO.O00000000();
      this.O00000000OOOO0.clear();
      this.O00000000OOOO.clear();
      this.O00000000OO00O.clear();
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O000O o0000000O000O) {
      this.O00000000OO.O00000000();
      this.O00000000OO0.clear();
      this.O00000000OO00.clear();
      this.O00000000OO000.clear();
      this.O00000000OO0O.clear();
      this.O00000000OO00O.clear();
      this.O00000000OOOO.clear();
      this.O00000000OOOO0.clear();
   }

   @EventHandler(
      O00000000 = 0
   )
   public void O00000000(O0000000O00O o0000000O00O) {
      if (this.O0000000000000 && !(O0000000000.currentScreen instanceof InventoryScreen)) {
         if (this.O000000000O.O000000000("New")) {
            this.O00000000OO.O00000000(o0000000O00O, this);
         } else {
            this.O000000000(o0000000O00O);
         }
      }
   }

   public boolean O00000000(int i) {
      return this.O0000000000000 && i == 60;
   }

   private void O000000000(O0000000O00O o0000000O00O) {
      if (O0000000000.world != null && O0000000000.player != null) {
         this.O0000000000O0();
         this.O00000000OOO0O.clear();
         float var2 = O0000000000.getRenderTickCounter().getTickProgress(true);
         this.O00000000(var2);
         this.O0000000000O00();
         RenderManager var3 = o0000000O00O.O00000000000();
         DrawContext var4 = o0000000O00O.O00000000000O();
         this.O00000000OO0O.clear();
         float var5 = (float)O0000000000.mouse.getX();
         float var6 = (float)O0000000000.mouse.getY();
         boolean var7 = O0000000000.currentScreen instanceof ChatScreen;
         Set var8 = this.O00000000OO0O0;
         var8.clear();
         if (!this.O00000000OO0.isEmpty() || !this.O00000000OO00.isEmpty() || !this.O00000000OO000.isEmpty()) {
            for (Entry var10 : this.O00000000OO0.entrySet()) {
               PlayerEntity var11 = (PlayerEntity)var10.getKey();
               NameTags.W181 var12 = (NameTags.W181)var10.getValue();
               if (!this.O00000000(var12)) {
                  var8.add(var11.getId());
                  this.O00000000OOOO0.putIfAbsent(var11.getId(), System.currentTimeMillis());
                  float var13 = MathHelper.clamp((float)(System.currentTimeMillis() - this.O00000000OOOO0.get(var11.getId())) / 300.0F, 0.0F, 1.0F);
                  this.O00000000(var3, var4, var11, var12, var5, var6, var7, var2, var13);
               }
            }

            for (Entry var19 : this.O00000000OO00.entrySet()) {
               LivingEntity var22 = (LivingEntity)var19.getKey();
               NameTags.W181 var25 = (NameTags.W181)var19.getValue();
               if (!this.O00000000(var25)) {
                  var8.add(var22.getId());
                  this.O00000000OOOO0.putIfAbsent(var22.getId(), System.currentTimeMillis());
                  float var28 = MathHelper.clamp((float)(System.currentTimeMillis() - this.O00000000OOOO0.get(var22.getId())) / 300.0F, 0.0F, 1.0F);
                  if (!(var22 instanceof VillagerEntity var14 && this.O00000000(var3, var14, var25, var28))) {
                     this.O00000000(var3, var22, var25, var5, var6, var7, var28);
                  }
               }
            }

            for (Entry var20 : this.O00000000OO000.entrySet()) {
               ItemEntity var23 = (ItemEntity)var20.getKey();
               NameTags.W181 var26 = (NameTags.W181)var20.getValue();
               if (!this.O00000000(var26)) {
                  var8.add(var23.getId());
                  this.O00000000OOOO0.putIfAbsent(var23.getId(), System.currentTimeMillis());
                  float var29 = MathHelper.clamp((float)(System.currentTimeMillis() - this.O00000000OOOO0.get(var23.getId())) / 300.0F, 0.0F, 1.0F);
                  ItemStack var32 = var23.getStack();
                  this.O00000000(var3, var23, var26, var32, var29);
               }
            }
         }

         this.O00000000OOOO0.keySet().retainAll(var8);
         this.O00000000(var3, var4);
         if (var7) {
            boolean var18 = GLFW.glfwGetMouseButton(O0000000000.getWindow().getHandle(), 0) == 1;
            boolean var21 = GLFW.glfwGetMouseButton(O0000000000.getWindow().getHandle(), 1) == 1;
            boolean var24 = var18 && !this.O0000000O0000O;
            boolean var27 = var21 && !this.O0000000O000O;
            this.O0000000O0000O = var18;
            this.O0000000O000O = var21;
            if ((var24 || var27) && System.currentTimeMillis() - this.O0000000O000O0 > 150L) {
               this.O0000000O000O0 = System.currentTimeMillis();
               boolean var30 = false;

               for (NameTags.W179 var15 : this.O00000000OOO0O) {
                  if (this.O00000000(var5, var6, var15.x, var15.y, var15.w, var15.h)) {
                     var30 = true;
                     if (var24) {
                        this.O0000000O = !this.O0000000O;
                        if (this.O0000000O) {
                           this.O0000000O0 = var15.x;
                           this.O0000000O00 = var15.y;
                           this.O0000000O000 = var15.w;
                           this.O0000000O0000 = var15.h;
                        }
                     } else if (var15.playerName != null) {
                        FriendCommand.O000000000(var15.playerName);
                     }
                     break;
                  }
               }

               if (var24 && !var30 && this.O0000000O) {
                  boolean var34 = this.O00000000(var5, var6, this.O0000000O0 - 250.0F, this.O0000000O00 - 150.0F, 600.0F, 500.0F);
                  if (!var34) {
                     this.O0000000O = false;
                  }
               }
            }

            float var31 = this.O0000000O ? 1.0F : 0.0F;
            this.O0000000O00000 = this.O0000000O00000 + (var31 - this.O0000000O00000) * 0.15F;
            if (this.O0000000O00000 > 0.01F) {
               O00000O0O00O.O00000000(
                  var3,
                  this.O00000000OOOOO,
                  this.O0000000O0,
                  this.O0000000O00,
                  this.O0000000O000,
                  this.O0000000O0000,
                  O0000000000.getWindow().getScaledWidth(),
                  O0000000000.getWindow().getScaledHeight(),
                  this.O0000000O00000,
                  var5,
                  var6,
                  var24,
                  var18
               );
            }
         } else {
            this.O0000000O = false;
            this.O0000000O00000 = 0.0F;
            this.O0000000O0000O = false;
            this.O0000000O000O = false;
         }
      }
   }

   private void O0000000000O0() {
      float var1 = this.O00000000O00O0.O0000000000();
      String var2 = this.O000000000OOO0.O0000000000();
      if (var2.equals("Светлый")) {
         this.O0000000O000OO = RenderManager.W382.O0000000000(240, 240, 245, (int)(255.0F * var1));
         this.O0000000O00O = RenderManager.W382.O0000000000(220, 220, 225, (int)(200.0F * var1));
         this.O0000000O00O0 = RenderManager.W382.O0000000000(200, 200, 200, (int)(180.0F * var1));
         this.O0000000O00O00 = RenderManager.W382.O0000000000(170, 170, 170, (int)(255.0F * var1));
         this.O0000000O00O0O = RenderManager.W382.O0000000000(30, 30, 30, 255);
         this.O0000000O00OO = RenderManager.W382.O0000000000(100, 100, 100, 255);
      } else if (var2.equals("Блюр")) {
         this.O0000000O000OO = RenderManager.W382.O0000000000(10, 10, 10, (int)(120.0F * var1));
         this.O0000000O00O = RenderManager.W382.O0000000000(30, 30, 30, (int)(90.0F * var1));
         this.O0000000O00O0 = RenderManager.W382.O0000000000(255, 255, 255, (int)(40.0F * var1));
         this.O0000000O00O00 = RenderManager.W382.O0000000000(255, 255, 255, (int)(90.0F * var1));
         this.O0000000O00O0O = RenderManager.W382.O0000000000(250, 250, 250, 255);
         this.O0000000O00OO = RenderManager.W382.O0000000000(200, 200, 200, 255);
      } else if (var2.equals("Неоморфизм")) {
         this.O0000000O000OO = O00000OOOO00O0.O00000000(var1);
         this.O0000000O00O = O00000OOOO00O0.O00000000(var1);
         this.O0000000O00O0 = RenderManager.W382.O0000000000(0, 0, 0, 0);
         this.O0000000O00O00 = RenderManager.W382.O0000000000(0, 0, 0, 0);
         this.O0000000O00O0O = O00000OOOO00O0.O000000000(1.0F);
         this.O0000000O00OO = O00000OOOO00O0.O0000000000(1.0F);
      } else {
         this.O0000000O000OO = RenderManager.W382.O0000000000(25, 25, 26, (int)(255.0F * var1));
         this.O0000000O00O = RenderManager.W382.O0000000000(35, 35, 35, (int)(170.0F * var1));
         this.O0000000O00O0 = RenderManager.W382.O0000000000(78, 78, 78, (int)(176.0F * var1));
         this.O0000000O00O00 = RenderManager.W382.O0000000000(120, 120, 120, (int)(255.0F * var1));
         this.O0000000O00O0O = RenderManager.W382.O0000000000(240, 240, 240, 255);
         this.O0000000O00OO = RenderManager.W382.O0000000000(200, 200, 200, 255);
      }

      this.O00000000(var1, var2);
   }

   private void O00000000(float f, String string) {
      Theme var3 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
      boolean var4 = "Светлый".equals(string) || O0000000O00OO0.O0000000000(var3) || O00000OOOO00O0.O00000000000();
      ColorScheme var5 = ColorScheme.O00000000(var3, var4);
      int var6 = O0000O000OO000.O0000000000(var5.O000000000O0(), var5.O000000000O00(), 0.42F);
      if (var4 && !"Неоморфизм".equals(string)) {
         this.O0000000O000OO = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-196865, var5.O000000000O0(), 0.026F), (int)(184.0F * f));
         this.O0000000O00O = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-1, var5.O000000000O00(), 0.04F), (int)(210.0F * f));
         this.O0000000O00O0 = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-15261133, var6, 0.34F), (int)(48.0F * f));
         this.O0000000O00O00 = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-15261133, var6, 0.56F), (int)(92.0F * f));
         this.O0000000O00O0O = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-15722718, var5.O000000000O0(), 0.035F), 255);
         this.O0000000O00OO = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-12168086, var5.O000000000O00(), 0.055F), 255);
      } else if ("Феррофлюид".equals(string)) {
         this.O0000000O000OO = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-15657182, var5.O000000000O0(), 0.1F), (int)(230.0F * f));
         this.O0000000O00O = O0000O000OO000.O00000000(O0000O000OO000.O0000000000(-15393492, var5.O000000000O00(), 0.14F), (int)(235.0F * f));
         this.O0000000O00O0 = O0000O000OO000.O00000000(var6, (int)(72.0F * f));
         this.O0000000O00O00 = O0000O000OO000.O00000000(var6, (int)(122.0F * f));
         this.O0000000O00O0O = RenderManager.W382.O0000000000(246, 248, 255, 255);
         this.O0000000O00OO = RenderManager.W382.O0000000000(188, 197, 214, 255);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      PlayerEntity playerEntity,
      NameTags.W181 o000000000000,
      float f,
      float g,
      boolean bl,
      float h,
      float i
   ) {
      float var10 = (float)MathHelper.clamp(16.0 / Math.max(o000000000000.distance(), 12.0), 0.75, 1.15);
      float var11 = Math.abs(o000000000000.feetY() - o000000000000.headY());
      float var12 = Math.max(4.0F * var10, o000000000000.boxRight() - o000000000000.boxLeft());
      float var13 = o000000000000.boxLeft();
      float var14 = Math.min(o000000000000.headY(), o000000000000.feetY());
      float var15 = 6.0F * var10;
      String var16 = playerEntity.getGameProfile() != null ? playerEntity.getGameProfile().getName() : playerEntity.getName().getString();
      String var17 = ProtectInfo.O0000000000(var16);
      String var18 = TargetHud.O00000000(playerEntity);
      int var19 = TargetHud.O00000000(playerEntity, RenderManager.W382.O00000000(255, 70, 70), 255);
      boolean var20 = FriendCommand.O00000000(var16);
      if (this.O000000000OOO.O000000000("Боксы")) {
         float var21 = var12 * 0.25F;
         float var22 = Math.max(1.0F, 1.5F * var10);
         long var23 = System.currentTimeMillis();
         float var25 = (float)(Math.sin(var23 / 200.0) + 1.0) / 2.0F;
         int var26 = this.O00000000(RenderManager.W382.O0000000000(150, 150, 150, 150), RenderManager.W382.O0000000000(255, 255, 255, 220), var25 * 0.4F);
         var26 = this.O00000000(var26, i);
         o0000O00OO0O0.O00000000(var13, var14, var21, var22, 0.0F, var26);
         o0000O00OO0O0.O00000000(var13, var14, var22, var21, 0.0F, var26);
         o0000O00OO0O0.O00000000(var13 + var12 - var21, var14, var21, var22, 0.0F, var26);
         o0000O00OO0O0.O00000000(var13 + var12 - var22, var14, var22, var21, 0.0F, var26);
         o0000O00OO0O0.O00000000(var13, var14 + var11 - var22, var21, var22, 0.0F, var26);
         o0000O00OO0O0.O00000000(var13, var14 + var11 - var21, var22, var21, 0.0F, var26);
         o0000O00OO0O0.O00000000(var13 + var12 - var21, var14 + var11 - var22, var21, var22, 0.0F, var26);
         o0000O00OO0O0.O00000000(var13 + var12 - var22, var14 + var11 - var21, var22, var21, 0.0F, var26);
      } else if (this.O000000000OOO.O000000000("Скелет")) {
         this.O00000000(o0000O00OO0O0, playerEntity, i);
      } else {
         this.O000000000OOO.O000000000("Не рендерить");
      }

      float var60 = TargetHud.O00000000((LivingEntity)playerEntity);
      String var61 = Integer.toString(Math.round(var60));
      String var62 = " HP";
      String var24 = var20 ? "[FRIEND] " : "";
      float var63 = 22.0F * var10;
      float var65 = 22.0F * var10;
      float var27 = 16.0F * var10;
      float var28 = 6.0F * var10;
      float var29 = 4.0F * var10;
      float var30 = 22.0F * var10;
      float var31 = var24.isEmpty() ? 0.0F : RenderManager.O00000000(FontRegistry.O00000000, var24, var63).O00000000;
      float var32 = RenderManager.O00000000(FontRegistry.O00000000, var17, var63).O00000000;
      float var33 = var18.isEmpty() ? 0.0F : RenderManager.O00000000(FontRegistry.O00000000, var18, var65).O00000000;
      float var34 = RenderManager.O00000000(FontRegistry.O00000000, var61, var63).O00000000;
      float var35 = RenderManager.O00000000(FontRegistry.O00000000, var62, var63).O00000000;
      float var36 = var31 + (var18.isEmpty() ? 0.0F : var33 + var29) + var32 + var29 + var34 + var35;
      float var37 = var36 + var28 * 2.0F;
      float var38 = var37 + (this.O000000000OOOO.O0000000000() ? var30 + var29 : 0.0F);
      float var39 = o000000000000.screenX() - var38 / 2.0F;
      float var40 = var14 - var30 - 8.0F * var10;
      List var41 = this.O00000000OO0OO;
      var41.clear();
      if (this.O000000000O000.O0000000000()) {
         ItemStack var42 = playerEntity.getEquippedStack(EquipmentSlot.HEAD);
         if (!var42.isEmpty()) {
            var41.add(var42);
         }

         ItemStack var43 = playerEntity.getEquippedStack(EquipmentSlot.CHEST);
         if (!var43.isEmpty()) {
            var41.add(var43);
         }

         ItemStack var44 = playerEntity.getEquippedStack(EquipmentSlot.LEGS);
         if (!var44.isEmpty()) {
            var41.add(var44);
         }

         ItemStack var45 = playerEntity.getEquippedStack(EquipmentSlot.FEET);
         if (!var45.isEmpty()) {
            var41.add(var45);
         }
      }

      if (!var41.isEmpty()) {
         float var66 = 18.0F * var10;
         float var71 = 4.0F * var10;
         float var75 = var41.size() * var66 + (var41.size() - 1) * var71;
         float var77 = o000000000000.screenX() - var75 / 2.0F;
         float var46 = var40 - var66 - 6.0F * var10;
         int var47 = 0;

         for (ItemStack var49 : (Iterable<ItemStack>)var41) {
            this.O00000000(o0000O00OO0O0, var77, var46, var66, var66, var15, i, var49);
            this.O00000000(playerEntity, var49, var77 + var10, var46 + var10, var47, var10, 0);
            var77 += var66 + var71;
            var47++;
         }
      }

      float var67 = var39;
      if (this.O000000000OOOO.O0000000000()) {
         this.O00000000(o0000O00OO0O0, var39, var40, var30, var30, var15, i, 0.0F);
         float var72 = var30 - 4.0F * var10;
         this.O00000000(o0000O00OO0O0, playerEntity, var39 + 2.0F * var10, var40 + 2.0F * var10, var72, i);
         var67 = var39 + (var30 + var29);
      }

      if (var20) {
         int var73 = this.O00000000(RenderManager.W382.O0000000000(25, 80, 25, 255), i);
         o0000O00OO0O0.O00000000(var67, var40, var37, var30, var15, var73);
      } else {
         this.O00000000(o0000O00OO0O0, var67, var40, var37, var30, var15, i, 0.0F);
      }

      this.O00000000OOO0O.add(new NameTags.W179(var67, var40, var37, var30, var16));
      var67 += var28;
      float var74 = var40 + 15.0F * var10;
      if (!var24.isEmpty()) {
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var67, var74, var63, var24, this.O00000000(RenderManager.W382.O0000000000(60, 150, 255, 255), i));
         var67 += var31;
      }

      if (!var18.isEmpty()) {
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var67, var74, var65, var18, this.O00000000(var19, i));
         var67 += var33 + var29;
      }

      this.O00000000(o0000O00OO0O0, FontRegistry.O00000000, var67, var74, var63, var17, this.O00000000(var20 ? O00000000O0O0 : this.O0000000O00O0O, i));
      var67 += var32 + var29;
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var67, var74, var63, var61, this.O00000000(this.O00000000(var60, playerEntity.getMaxHealth()), i));
      var67 += var34;
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var67, var74, var63, var62, this.O00000000(RenderManager.W382.O0000000000(150, 150, 150, 255), i));
      float var76 = MathHelper.clamp(var60 / playerEntity.getMaxHealth(), 0.0F, 1.0F);
      int var78 = this.O00000000(RenderManager.W382.O0000000000(60, 150, 255, 255), i);
      float var79 = 2.0F * var10;
      float var80 = var13 - var79 - 4.0F * var10;
      if (this.O000000000O0OO.O0000000000()) {
         o0000O00OO0O0.O00000000(var80, var14, var79, var11, 1.0F, this.O00000000(RenderManager.W382.O0000000000(0, 0, 0, 100), i));
         float var81 = var11 * var76;
         o0000O00OO0O0.O00000000(var80, var14 + (var11 - var81), var79, var81, 1.0F, var78);
      }

      float var82 = var13 + var12 + 8.0F * var10;
      float var83 = var14;
      float var50 = 20.0F * var10;
      if (this.O000000000O0O0.O0000000000()) {
         for (StatusEffectInstance var52 : playerEntity.getStatusEffects()) {
            String var53 = Text.translatable(var52.getTranslationKey()).getString();
            int var54 = var52.getAmplifier() + 1;
            String var55 = var53 + (var54 > 1 ? " " + var54 : "");
            int var56 = ((StatusEffect)var52.getEffectType().value()).isBeneficial() ? this.O0000000O00O0O : RenderManager.W382.O0000000000(255, 60, 60, 255);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var82, var83 + 10.0F * var10, var50, var55, this.O00000000(var56, i));
            var83 += 12.0F * var10;
         }
      }

      List var84 = this.O00000000OOO;
      var84.clear();
      if (this.O000000000O0O.O0000000000() && !playerEntity.getOffHandStack().isEmpty()) {
         var84.add(playerEntity.getOffHandStack());
      }

      if (this.O000000000O00O.O0000000000() && !playerEntity.getMainHandStack().isEmpty()) {
         var84.add(playerEntity.getMainHandStack());
      }

      float var85 = var14 + var11 + 6.0F * var10;
      float var86 = 22.0F * var10;
      float var87 = 4.0F * var10;
      if (this.O00000000O.O0000000000()) {
         float var88 = var85;

         for (int var90 = 0; var90 < var84.size(); var90++) {
            var88 += this.O00000000(o0000O00OO0O0, playerEntity, (ItemStack)var84.get(var90), o000000000000.screenX(), var88, var10, i, 99 + var90, 1)
               + 3.0F * var10;
         }
      } else {
         float var89 = var84.size() * var86 + Math.max(0, var84.size() - 1) * var87;
         float var91 = o000000000000.screenX() - var89 / 2.0F;

         for (int var57 = 0; var57 < var84.size(); var57++) {
            ItemStack var58 = (ItemStack)var84.get(var57);
            this.O00000000(o0000O00OO0O0, var91, var85, var86, var86, var15, i, var58);
            float var59 = 3.0F * var10;
            this.O00000000(playerEntity, var58, var91 + var59, var85 + var59, 99 + var57, var10, 1);
            var91 += var86 + var87;
         }
      }
   }

   private float O00000000(RenderManager o0000O00OO0O0, PlayerEntity playerEntity, ItemStack itemStack, float f, float g, float h, float i, int j, int k) {
      float var10 = 22.0F * h;
      float var12 = 4.0F * h;
      float var13 = 7.0F * h;
      float var14 = 18.0F * h;
      float var15 = Math.max(70.0F * h, Math.min(190.0F * h, O0000000000.getWindow().getFramebufferWidth() * 0.28F));
      String var16 = this.O00000000(this.O00000000(itemStack, true), var14, var15);
      float var17 = RenderManager.O00000000(FontRegistry.O000000000, var16, var14).O00000000;
      float var18 = var17 + var13 * 2.0F;
      float var19 = var10 + var12 + var18;
      float var20 = f - var19 / 2.0F;
      float var21 = 6.0F * h;
      this.O00000000(o0000O00OO0O0, var20, g, var10, var10, var21, i, itemStack);
      this.O00000000(playerEntity, itemStack, var20 + 3.0F * h, g + 3.0F * h, j, h, k);
      float var22 = var20 + var10 + var12;
      this.O00000000(o0000O00OO0O0, var22, g, var18, var10, var21, i, itemStack);
      this.O00000000(o0000O00OO0O0, FontRegistry.O000000000, var22 + var13, g + 15.0F * h, var14, var16, itemStack, j, i);
      return var10;
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k, ItemStack itemStack) {
      if (this.O00000000O0.O0000000000()) {
         int var9 = this.O00000000(itemStack, k);
         o0000O00OO0O0.O00000000(f, g, h, i, j, 5.0F, 1.0F, this.O00000000(var9, 0.55F));
      }

      this.O00000000(o0000O00OO0O0, f, g, h, i, j, k, 0.0F);
   }

   public static void O00000000(PlayerEntityRenderState playerEntityRenderState, PlayerEntityModel playerEntityModel, MatrixStack matrixStack) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         NameTags var3 = WildClient.O00000000.O000000000.O00000000(NameTags.class);
         if (var3 != null) {
            var3.O000000000(playerEntityRenderState, playerEntityModel, matrixStack);
         }
      }
   }

   private void O000000000(PlayerEntityRenderState playerEntityRenderState, PlayerEntityModel playerEntityModel, MatrixStack matrixStack) {
      if (this.O0000000000000 && O0000000000 != null && O0000000000.player != null && O0000000000.world != null) {
         if (!(O0000000000.currentScreen instanceof InventoryScreen)) {
            if (this.O000000000O.O000000000("Legacy") && this.O000000000OOO.O000000000("Скелет")) {
               if (playerEntityRenderState != null && playerEntityModel != null && matrixStack != null) {
                  if (!playerEntityRenderState.spectator && !playerEntityRenderState.invisible && !playerEntityRenderState.invisibleToPlayer) {
                     if (playerEntityRenderState.id != O0000000000.player.getId() || O0000000000.options.getPerspective() != Perspective.FIRST_PERSON) {
                        Vec3d var4 = O0000000000.gameRenderer.getCamera().getPos();
                        ArrayList var5 = new ArrayList(14);
                        Vec3d var6 = this.O00000000(playerEntityModel.body, matrixStack, var4, 0.0F, 0.0F, 0.0F);
                        Vec3d var7 = this.O00000000(playerEntityModel.body, matrixStack, var4, 0.0F, 6.0F, 0.0F);
                        Vec3d var8 = this.O00000000(playerEntityModel.body, matrixStack, var4, 0.0F, 12.0F, 0.0F);
                        Vec3d var9 = this.O00000000(playerEntityModel.head, matrixStack, var4, 0.0F, -8.0F, 0.0F);
                        Vec3d var10 = this.O00000000(playerEntityModel.head, matrixStack, var4, 0.0F, 0.0F, 0.0F);
                        Vec3d var11 = this.O00000000(playerEntityModel.rightArm, matrixStack, var4, 0.0F, 0.0F, 0.0F);
                        Vec3d var12 = this.O00000000(playerEntityModel.rightArm, matrixStack, var4, 0.0F, 4.5F, 0.0F);
                        Vec3d var13 = this.O00000000(playerEntityModel.rightArm, matrixStack, var4, 0.0F, 10.0F, 0.0F);
                        Vec3d var14 = this.O00000000(playerEntityModel.leftArm, matrixStack, var4, 0.0F, 0.0F, 0.0F);
                        Vec3d var15 = this.O00000000(playerEntityModel.leftArm, matrixStack, var4, 0.0F, 4.5F, 0.0F);
                        Vec3d var16 = this.O00000000(playerEntityModel.leftArm, matrixStack, var4, 0.0F, 10.0F, 0.0F);
                        Vec3d var17 = this.O00000000(playerEntityModel.rightLeg, matrixStack, var4, 0.0F, 0.0F, 0.0F);
                        Vec3d var18 = this.O00000000(playerEntityModel.rightLeg, matrixStack, var4, 0.0F, 6.0F, 0.0F);
                        Vec3d var19 = this.O00000000(playerEntityModel.rightLeg, matrixStack, var4, 0.0F, 12.0F, 0.0F);
                        Vec3d var20 = this.O00000000(playerEntityModel.leftLeg, matrixStack, var4, 0.0F, 0.0F, 0.0F);
                        Vec3d var21 = this.O00000000(playerEntityModel.leftLeg, matrixStack, var4, 0.0F, 6.0F, 0.0F);
                        Vec3d var22 = this.O00000000(playerEntityModel.leftLeg, matrixStack, var4, 0.0F, 12.0F, 0.0F);
                        this.O00000000(var5, var6, var7);
                        this.O00000000(var5, var7, var8);
                        this.O00000000(var5, var9, var10);
                        this.O00000000(var5, var14, var11);
                        this.O00000000(var5, var20, var17);
                        this.O00000000(var5, var14, var15);
                        this.O00000000(var5, var15, var16);
                        this.O00000000(var5, var11, var12);
                        this.O00000000(var5, var12, var13);
                        this.O00000000(var5, var20, var21);
                        this.O00000000(var5, var21, var22);
                        this.O00000000(var5, var17, var18);
                        this.O00000000(var5, var18, var19);
                        if (!var5.isEmpty()) {
                           this.O00000000OO00O.put(playerEntityRenderState.id, new NameTags.W178(var5, System.currentTimeMillis()));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private Vec3d O00000000(ModelPart modelPart, MatrixStack matrixStack, Vec3d vec3d, float f, float g, float h) {
      this.O00000000OOO0.loadIdentity();
      this.O00000000OOO0.peek().getPositionMatrix().set(matrixStack.peek().getPositionMatrix());
      modelPart.applyTransform(this.O00000000OOO0);
      Matrix4f var7 = this.O00000000OOO0.peek().getPositionMatrix();
      Vector3f var8 = this.O00000000OOO00.set(f * 0.0625F, g * 0.0625F, h * 0.0625F);
      var7.transformPosition(var8);
      return vec3d.add(var8.x, var8.y, var8.z);
   }

   private void O00000000(List<NameTags.W177> list, Vec3d vec3d, Vec3d vec3d2) {
      if (vec3d != null && vec3d2 != null) {
         list.add(new NameTags.W177(vec3d, vec3d2));
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, PlayerEntity playerEntity, float f) {
      NameTags.W178 var4 = this.O00000000OO00O.get(playerEntity.getId());
      if (var4 != null && System.currentTimeMillis() - var4.capturedAt() <= 250L) {
         for (NameTags.W177 var6 : var4.bones()) {
            this.O00000000(o0000O00OO0O0, var6.start(), var6.end(), f);
         }
      }
   }

   private void O0000000000O00() {
      long var1 = System.currentTimeMillis();
      this.O00000000OO00O.entrySet().removeIf(entry -> var1 - entry.getValue().capturedAt() > 250L);
   }

   private void O00000000(RenderManager o0000O00OO0O0, Vec3d vec3d, Vec3d vec3d2, float f) {
      Vec3d var5 = this.O00000000(vec3d.x, vec3d.y, vec3d.z);
      Vec3d var6 = this.O00000000(vec3d2.x, vec3d2.y, vec3d2.z);
      if (var5 != null && var6 != null) {
         double var7 = O0000000000.gameRenderer.getCamera().getPos().distanceTo(vec3d);
         float var9 = MathHelper.clamp((float)(12.0 / Math.max(var7, 1.0)), 1.0F, 10.0F);
         float var10 = f * this.O00000000O00O0.O0000000000();
         int var11 = this.O00000000(RenderManager.W382.O0000000000(200, 200, 210, 255), var10);
         float var12 = (float)Math.hypot(var6.x - var5.x, var6.y - var5.y);
         float var13 = (float)Math.toDegrees(Math.atan2(var6.y - var5.y, var6.x - var5.x));
         o0000O00OO0O0.O00000000((float)var5.x, (float)var5.y);
         o0000O00OO0O0.O000000000(var13);
         if (!(var7 > 12.0) && !(var9 < 2.0F)) {
            int var14 = this.O00000000(RenderManager.W382.O0000000000(20, 20, 20, 180), var10);
            int var15 = this.O00000000(RenderManager.W382.O0000000000(255, 255, 255, 255), var10);
            o0000O00OO0O0.O00000000(0.0F, -var9 * 0.3F, var12, var9 * 0.6F, 0.0F, var11);
            o0000O00OO0O0.O00000000(0.0F, -var9 * 0.1F, var12, var9 * 0.2F, 0.0F, var15);
         } else {
            o0000O00OO0O0.O00000000(0.0F, -var9 / 2.0F, var12, var9, 0.0F, var11);
         }

         o0000O00OO0O0.O000000000000O();
         o0000O00OO0O0.O00000000000O();
      }
   }

   private Vec3d O00000000(double d, double e, double f) {
      Camera var7 = O0000000000.gameRenderer.getCamera();
      Vec3d var8 = new Vec3d(d, e, f);
      if (var8.squaredDistanceTo(var7.getPos()) < 1.0E-6) {
         return null;
      } else {
         Vec3d var9 = O0000O000OOOOO.O00000000(var8);
         return !(var9.z <= 0.001F) && !(var9.z > 1.0) ? var9 : null;
      }
   }

   private void O00000000(float f) {
      this.O00000000OO0.clear();
      this.O00000000OO00.clear();
      this.O00000000OO000.clear();
      if (O0000000000.world != null && O0000000000.player != null) {
         if (this.O000000000O0.O000000000("Игроки")) {
            this.O000000000(f);
         }

         if (this.O000000000O0.O000000000("Мобы") || this.O000000000O0.O000000000("Животные") || this.O0000000000OO()) {
            this.O0000000000(f);
         }

         if (this.O000000000O0.O000000000("Предметы")) {
            this.O00000000000(f);
         }
      }
   }

   private void O000000000(float f) {
      for (PlayerEntity var3 : O0000000000.world.getPlayers()) {
         if (var3 != null
            && var3.isAlive()
            && (var3 != O0000000000.player || !O0000000000.options.getPerspective().isFirstPerson())
            && (this.O000000000O0.O000000000("Голые") || var3.getArmor() != 0 || var3 == O0000000000.player)) {
            NameTags.W181 var4 = this.O00000000(f, var3, var3.getHeight() + 0.2, 0.02);
            if (var4 != null) {
               this.O00000000OO0.put(var3, var4);
            }
         }
      }
   }

   private void O0000000000(float f) {
      AutoVillageTrade var2 = this.O0000000000O0O();

      for (Entity var4 : O0000000000.world.getEntities()) {
         if (var4 instanceof LivingEntity var5
            && var5.isAlive()
            && var5 != O0000000000.player
            && !(var5 instanceof PlayerEntity)
            && !(var5 instanceof ArmorStandEntity)) {
            boolean var6 = var5 instanceof VillagerEntity var7 && var2 != null && var2.O00000000(var7) != null;
            if ((!this.O00000000(var5) || this.O000000000O0.O000000000("Мобы") || var6)
               && (!this.O000000000(var5) || this.O000000000O0.O000000000("Животные"))
               && (this.O00000000(var5) || this.O000000000(var5) || var6)) {
               NameTags.W181 var8 = this.O00000000(f, var5, var5.getHeight() + 0.18, 0.02);
               if (var8 != null) {
                  this.O00000000OO00.put(var5, var8);
               }
            }
         }
      }
   }

   private void O00000000000(float f) {
      for (Entity var3 : O0000000000.world.getEntities()) {
         if (var3 instanceof ItemEntity var4 && var4.isAlive() && !var4.getStack().isEmpty()) {
            NameTags.W181 var5 = this.O00000000(f, var4, 0.52, 0.0);
            if (var5 != null) {
               this.O00000000OO000.put(var4, var5);
            }
         }
      }
   }

   private NameTags.W181 O00000000(float f, Entity entity, double d, double e) {
      Camera var7 = O0000000000.gameRenderer.getCamera();
      Vec3d var8 = var7.getPos();
      Vec3d var9 = entity.getLerpedPos(f);
      Box var10 = entity.getBoundingBox();
      Vec3d var11 = entity.getPos();
      Box var12 = var10.offset(var9.x - var11.x, var9.y - var11.y, var9.z - var11.z);
      Box var13 = new Box(var12.minX - 0.02, var9.y + e, var12.minZ - 0.02, var12.maxX + 0.02, var9.y + d, var12.maxZ + 0.02);
      NameTags.W181 var14 = this.O00000000(var13, var8);
      if (var14 != null) {
         return var14;
      } else {
         Vec3d var15 = new Vec3d(var9.x, var9.y + d, var9.z);
         Vec3d var16 = new Vec3d(var9.x, var9.y + e, var9.z);
         if (var15.squaredDistanceTo(var8) < 1.0E-6) {
            return null;
         } else {
            Vec3d var17 = O0000O000OOOOO.O00000000(var15);
            Vec3d var18 = O0000O000OOOOO.O00000000(var16);
            if (var17.z <= 0.001F || var17.z > 1.0) {
               return null;
            } else if (!(var18.z <= 0.001F) && !(var18.z > 1.0)) {
               double var19 = var8.distanceTo(var15);
               float var21 = Math.abs((float)var18.y - (float)var17.y);
               float var22 = var21 * 0.45F;
               float var23 = (float)var17.x;
               return new NameTags.W181(var23, (float)var17.y, (float)var18.y, (float)var17.z, var19, var23 - var22 / 2.0F, var23 + var22 / 2.0F);
            } else {
               return null;
            }
         }
      }
   }

   private NameTags.W181 O00000000(Box box, Vec3d vec3d) {
      float var3 = Float.POSITIVE_INFINITY;
      float var4 = Float.POSITIVE_INFINITY;
      float var5 = Float.NEGATIVE_INFINITY;
      float var6 = Float.NEGATIVE_INFINITY;
      float var7 = 0.0F;
      double var8 = (box.minX + box.maxX) * 0.5;
      double var10 = (box.minY + box.maxY) * 0.5;
      double var12 = (box.minZ + box.maxZ) * 0.5;

      for (int var14 = 0; var14 < 2; var14++) {
         double var15 = var14 == 0 ? box.minX : box.maxX;

         for (int var17 = 0; var17 < 2; var17++) {
            double var18 = var17 == 0 ? box.minY : box.maxY;

            for (int var20 = 0; var20 < 2; var20++) {
               double var21 = var20 == 0 ? box.minZ : box.maxZ;
               Vec3d var23 = O0000O000OOOOO.O00000000(new Vec3d(var15, var18, var21));
               if (var23 == null || var23.z <= 0.001F || var23.z > 1.0) {
                  return null;
               }

               var3 = Math.min(var3, (float)var23.x);
               var4 = Math.min(var4, (float)var23.y);
               var5 = Math.max(var5, (float)var23.x);
               var6 = Math.max(var6, (float)var23.y);
               var7 += (float)var23.z;
            }
         }
      }

      if (Float.isFinite(var3) && Float.isFinite(var4) && Float.isFinite(var5) && Float.isFinite(var6)) {
         double var24 = vec3d.distanceTo(new Vec3d(var8, var10, var12));
         return new NameTags.W181((var3 + var5) * 0.5F, var4, var6, var7 / 8.0F, var24, var3, var5);
      } else {
         return null;
      }
   }

   private boolean O00000000(NameTags.W181 o000000000000) {
      return o000000000000 == null || o000000000000.depth() <= 0.001F || o000000000000.depth() > 1.0F;
   }

   private int O00000000(float f, float g) {
      float var3 = MathHelper.clamp(f / Math.max(1.0F, g), 0.0F, 1.0F);
      int var4 = var3 >= 0.5F ? (int)(255.0F * (1.0F - var3) * 2.0F) : 255;
      int var5 = var3 >= 0.5F ? 255 : (int)(255.0F * var3 * 2.0F);
      return RenderManager.W382.O0000000000(var4, var5, 50, 255);
   }

   private boolean O00000000(RenderManager o0000O00OO0O0, VillagerEntity villagerEntity, NameTags.W181 o000000000000, float f) {
      AutoVillageTrade var5 = this.O0000000000O0O();
      if (var5 == null) {
         return false;
      } else {
         AutoVillageTrade.W77 var6 = var5.O00000000(villagerEntity);
         if (var6 != null && var6.itemStack() != null && !var6.itemStack().isEmpty()) {
            ItemStack var7 = var6.itemStack();
            float var8 = (float)MathHelper.clamp(16.0 / Math.max(o000000000000.distance(), 12.0), 0.75, 1.15);
            float var9 = 6.0F * var8;
            float var10 = 18.0F * var8;
            float var11 = 22.0F * var8;
            float var12 = 4.0F * var8;
            float var13 = 6.0F * var8;
            String var14 = var6.price() + " изумр. · x" + var6.availableAmount();
            float var15 = RenderManager.O00000000(FontRegistry.O000000000, var14, var10).O00000000;
            float var16 = var15 + var13 * 2.0F;
            float var17 = var11 + var12 + var16;
            float var18 = o000000000000.screenX() - var17 / 2.0F;
            float var19 = o000000000000.headY() - 18.0F * var8;
            this.O00000000(o0000O00OO0O0, var18, var19, var11, var11, var9, f, var7);
            float var20 = (var11 - 16.0F * var8) / 2.0F;
            this.O00000000(O0000000000.player, var7, var18 + var20, var19 + var20, villagerEntity.getId(), var8, 0);
            float var21 = var18 + var11 + var12;
            this.O00000000(o0000O00OO0O0, var21, var19, var16, var11, var9, f, var7);
            this.O00000000(o0000O00OO0O0, FontRegistry.O000000000, var21 + var13, var19 + 15.0F * var8, var10, var14, var7, villagerEntity.getId(), f);
            return true;
         } else {
            return false;
         }
      }
   }

   private AutoVillageTrade O0000000000O0O() {
      return WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null ? WildClient.O00000000.O000000000.O00000000(AutoVillageTrade.class) : null;
   }

   private boolean O0000000000OO() {
      AutoVillageTrade var1 = this.O0000000000O0O();
      return var1 != null && var1.O0000000000000;
   }

   private void O00000000(RenderManager o0000O00OO0O0, LivingEntity livingEntity, NameTags.W181 o000000000000, float f, float g, boolean bl, float h) {
      float var8 = (float)MathHelper.clamp(6.0 / Math.max(o000000000000.distance(), 1.0), 0.45, 1.0);
      float var9 = 6.0F * var8;
      String var10 = ProtectInfo.O0000000000(livingEntity.getName().getString());
      float var11 = livingEntity.getHealth() + livingEntity.getAbsorptionAmount();
      float var12 = livingEntity.getMaxHealth();
      String var13 = " " + String.format("%.1f", var11).replace(',', '.');
      if (var13.endsWith(".0")) {
         var13 = var13.substring(0, var13.length() - 2);
      }

      float var14 = 22.0F * var8;
      float var15 = RenderManager.O00000000(FontRegistry.O00000000, var10, var14).O00000000;
      float var16 = RenderManager.O00000000(FontRegistry.O00000000, var13, var14).O00000000;
      float var17 = this.O000000000OOOO.O0000000000() ? 14.0F * var8 : 0.0F;
      float var18 = this.O000000000OOOO.O0000000000() ? 4.0F * var8 : 0.0F;
      float var19 = var17 + var18 + var15 + var16;
      float var20 = var19 + 16.0F * var8;
      float var21 = 17.0F * var8;
      float var22 = o000000000000.screenX() - var20 / 2.0F;
      float var23 = o000000000000.headY() - 18.0F * var8;
      boolean var24 = bl && this.O00000000(f, g, var22, var23, var20, var21);
      String var25 = livingEntity.getUuidAsString();
      float var26 = this.O00000000OOOO.getOrDefault(var25, 0.0F);
      float var27 = var24 && !this.O0000000O ? 1.0F : 0.0F;
      var26 += (var27 - var26) * 0.15F;
      this.O00000000OOOO.put(var25, var26);
      this.O00000000(o0000O00OO0O0, var22, var23, var20, var21, var9, h, var26);
      float var28 = o000000000000.screenX() - var19 / 2.0F;
      if (this.O000000000OOOO.O0000000000()) {
         this.O00000000(o0000O00OO0O0, livingEntity, var28, var23 + 1.5F * var8, var17, h);
         var28 += var17 + var18;
      }

      this.O00000000(o0000O00OO0O0, FontRegistry.O00000000, var28, var23 + 12.2F * var8, var14, var10, this.O00000000(this.O0000000O00OO, h));
      var28 += var15;
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var28, var23 + 12.2F * var8, var14, var13, this.O00000000(this.O00000000(var11, var12), h));
   }

   private void O00000000(RenderManager o0000O00OO0O0, String string, float f, float g, float h, float i) {
      if (O0000000000.getNetworkHandler() != null) {
         PlayerListEntry var7 = null;

         for (PlayerListEntry var9 : O0000000000.getNetworkHandler().getPlayerList()) {
            if (var9.getProfile().getName().equalsIgnoreCase(string)) {
               var7 = var9;
               break;
            }
         }

         if (var7 != null) {
            try {
               Identifier var13 = var7.getSkinTextures().texture();
               AbstractTexture var14 = O0000000000.getTextureManager().getTexture(var13);
               if (var14 != null && var14.getGlTexture() instanceof GlTexture var10 && var10.getGlId() > 0) {
                  int var15 = var10.getGlId();
                  GlStateManager._bindTexture(var15);
                  o0000O00OO0O0.O000000000000(i);
                  o0000O00OO0O0.O00000000(var15, f, g, h, h, 0.125F, 0.125F, 0.25F, 0.25F, 3.0F);
                  o0000O00OO0O0.O00000000(var15, f, g, h, h, 0.625F, 0.125F, 0.75F, 0.25F, 3.0F);
                  o0000O00OO0O0.O00000000000OO();
               }
            } catch (Throwable var12) {
            }
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, LivingEntity livingEntity, float f, float g, float h, float i) {
      boolean var7 = false;
      if (livingEntity instanceof PlayerEntity var8) {
         if (var8 instanceof AbstractClientPlayerEntity var9) {
            try {
               Identifier var10 = var9.getSkinTextures().texture();
               AbstractTexture var11 = O0000000000.getTextureManager().getTexture(var10);
               if (var11 != null && var11.getGlTexture() instanceof GlTexture var12 && var12.getGlId() > 0) {
                  int var38 = var12.getGlId();
                  GlStateManager._bindTexture(var38);
                  o0000O00OO0O0.O000000000000(i);
                  o0000O00OO0O0.O00000000(var38, f, g, h, h, 0.125F, 0.125F, 0.25F, 0.25F, 3.0F);
                  o0000O00OO0O0.O00000000(var38, f, g, h, h, 0.625F, 0.125F, 0.75F, 0.25F, 3.0F);
                  o0000O00OO0O0.O00000000000OO();
                  var7 = true;
               }
            } catch (Throwable var19) {
            }
         }

         if (!var7 && O0000000000.getNetworkHandler() != null) {
            PlayerListEntry var22 = null;

            for (PlayerListEntry var29 : O0000000000.getNetworkHandler().getPlayerList()) {
               if (var29.getProfile().getId().equals(var8.getUuid()) || var29.getProfile().getName().equalsIgnoreCase(var8.getName().getString())) {
                  var22 = var29;
                  break;
               }
            }

            if (var22 != null) {
               try {
                  Identifier var26 = var22.getSkinTextures().texture();
                  AbstractTexture var30 = O0000000000.getTextureManager().getTexture(var26);
                  if (var30 != null && var30.getGlTexture() instanceof GlTexture var34 && var34.getGlId() > 0) {
                     int var40 = var34.getGlId();
                     GlStateManager._bindTexture(var40);
                     o0000O00OO0O0.O000000000000(i);
                     o0000O00OO0O0.O00000000(var40, f, g, h, h, 0.125F, 0.125F, 0.25F, 0.25F, 3.0F);
                     o0000O00OO0O0.O00000000(var40, f, g, h, h, 0.625F, 0.125F, 0.75F, 0.25F, 3.0F);
                     o0000O00OO0O0.O00000000000OO();
                     var7 = true;
                  }
               } catch (Throwable var18) {
               }
            }
         }
      } else {
         try {
            EntityRenderer var23 = O0000000000.getEntityRenderDispatcher().getRenderer(livingEntity);
            Identifier var27 = null;

            for (Method var14 : var23.getClass().getMethods()) {
               if (var14.getReturnType() == Identifier.class
                  && var14.getParameterCount() == 1
                  && var14.getParameterTypes()[0].isAssignableFrom(livingEntity.getClass())) {
                  var14.setAccessible(true);
                  var27 = (Identifier)var14.invoke(var23, livingEntity);
                  break;
               }
            }

            if (var27 != null) {
               AbstractTexture var32 = O0000000000.getTextureManager().getTexture(var27);
               if (var32 != null && var32.getGlTexture() instanceof GlTexture var36 && var36.getGlId() > 0) {
                  int var43 = var36.getGlId();
                  GlStateManager._bindTexture(var43);
                  o0000O00OO0O0.O000000000000(i);
                  float var45 = 0.125F;
                  float var15 = 0.125F;
                  float var16 = 0.25F;
                  float var17 = 0.25F;
                  if (livingEntity instanceof AnimalEntity) {
                     var45 = 0.0F;
                     var15 = 0.125F;
                     var16 = 0.125F;
                     var17 = 0.25F;
                  }

                  o0000O00OO0O0.O00000000(var43, f, g, h, h, var45, var15, var16, var17, 3.0F);
                  o0000O00OO0O0.O00000000000OO();
                  var7 = true;
               }
            }
         } catch (Throwable var20) {
         }
      }

      if (!var7) {
         int var21 = this.O00000000(O0000O000OO000.O0000000000(30, 30, 30, 120), i);
         o0000O00OO0O0.O00000000(f, g, h, h, 4.0F, var21);
         String var24 = ProtectInfo.O0000000000(livingEntity.getName().getString());
         String var28 = var24.isEmpty() ? "?" : var24.substring(0, 1).toUpperCase();
         int var33 = this.O00000000(O0000O000OO000.O0000000000(200, 200, 200, 200), i);
         float var37 = h * 0.65F;
         float var44 = RenderManager.O00000000(FontRegistry.O00000000000, var28, var37).O00000000;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, f + (h - var44) / 2.0F, g + h / 2.0F + var37 * 0.35F, var37, var28, var33);
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, ItemEntity itemEntity, NameTags.W181 o000000000000, ItemStack itemStack, float f) {
      float var6 = (float)MathHelper.clamp(16.0 / Math.max(o000000000000.distance(), 12.0), 0.75, 1.15);
      float var7 = 6.0F * var6;
      float var8 = 20.0F * var6;
      String var9 = this.O00000000(
         this.O00000000(itemStack, this.O00000000O.O0000000000()),
         var8,
         Math.max(86.0F * var6, Math.min(190.0F * var6, O0000000000.getWindow().getFramebufferWidth() * 0.3F))
      );
      float var10 = 22.0F * var6;
      float var11 = 4.0F * var6;
      float var12 = RenderManager.O00000000(FontRegistry.O000000000, var9, var8).O00000000;
      float var13 = 6.0F * var6;
      float var14 = var12 + var13 * 2.0F;
      float var15 = var10 + var11 + var14;
      float var16 = o000000000000.screenX() - var15 / 2.0F;
      float var17 = o000000000000.headY() - 12.0F * var6;
      this.O00000000(o0000O00OO0O0, var16, var17, var10, var10, var7, f, itemStack);
      float var18 = (var10 - 16.0F * var6) / 2.0F;
      this.O00000000(O0000000000.player, itemStack, var16 + var18, var17 + var18, itemEntity.getId(), var6, 0);
      float var19 = var16 + var10 + var11;
      this.O00000000(o0000O00OO0O0, var19, var17, var14, var10, var7, f, itemStack);
      this.O00000000(o0000O00OO0O0, FontRegistry.O000000000, var19 + var13, var17 + 15.0F * var6, var8, var9, itemStack, itemEntity.getId(), f);
   }

   private void O00000000(RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, float f, float g, float h, String string, int i) {
      if (!this.O00000000O000.O0000000000()) {
         o0000O00OO0O0.O00000000(o0000O0O00O00O, f, g, h, string, i);
      } else {
         int var8 = RenderManager.W382.O0000000000O(this.O00000000O000O.O00000000000O(), i >>> 24 & 0xFF);
         o0000O00OO0O0.O00000000(o0000O0O00O00O, f, g, h, string, i, var8, this.O0000000000OO0());
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, float f, float g, float h, String string, ItemStack itemStack, int i, float j) {
      if (!this.O00000000O000.O0000000000()) {
         o0000O00OO0O0.O00000000(o0000O0O00O00O, f, g, h, string, this.O000000000(itemStack, j));
      } else if (!this.O00000000O0000.O0000000000()) {
         this.O00000000(o0000O00OO0O0, o0000O0O00O00O, f, g, h, string, this.O000000000(itemStack, j));
      } else {
         int[] var10 = ItemRenderUtil.O00000000(itemStack, i);
         if (var10 == null) {
            var10 = ItemRenderUtil.O00000000();
         }

         int var11 = Math.round(255.0F * MathHelper.clamp(j, 0.0F, 1.0F));
         int var12 = RenderManager.W382.O0000000000(0, 0, 0, Math.round(185.0F * MathHelper.clamp(j, 0.0F, 1.0F)));
         o0000O00OO0O0.O00000000(o0000O0O00O00O, f + Math.max(0.45F, h * 0.035F), g + Math.max(0.45F, h * 0.035F), h, string, var12);
         o0000O00OO0O0.O00000000(
            o0000O0O00O00O,
            f,
            g,
            h,
            string,
            RenderManager.W382.O0000000000O(var10[0], var11),
            RenderManager.W382.O0000000000O(var10[1], var11),
            this.O0000000000OO0()
         );
      }
   }

   private float O0000000000OO0() {
      float var1 = Math.max(600.0F, 2600.0F / Math.max(0.1F, this.O00000000O00O.O0000000000()));
      return (float)(System.currentTimeMillis() % (long)var1) / var1;
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k, float l) {
      if (!(k <= 0.05F)) {
         if (this.O000000000OOO0.O0000000000().equals("Неоморфизм")) {
            float var9 = k * this.O00000000O00O0.O0000000000();
            float var10 = 4.8F + l * 1.8F;
            float var11 = 16.0F + l * 4.0F;
            float var12 = 0.72F + l * 0.12F;
            if (O00000OOOO00O0.O00000000(null, f, g, h, i, j, var10, var11, var12, 1, false, var9)) {
               return;
            }
         }

         if (this.O000000000OOO0.O0000000000().equals("Блюр")) {
            o0000O00OO0O0.O00000000(23.0F);
            o0000O00OO0O0.O00000000(f, g, h, i, j, k * this.O00000000O00O0.O0000000000());
         }

         int var13 = this.O00000000(this.O0000000O00O0, this.O0000000O00O00, l);
         int var15 = this.O00000000(this.O0000000O000OO, this.O0000000O00O, l);
         var15 = this.O00000000(var15, k);
         var13 = this.O00000000(var13, k);
         if (this.O00000000O00.O0000000000()) {
            o0000O00OO0O0.O00000000(f, g, h, i, j, this.O0000000000OOO() ? 7.0F : 5.0F, 1.0F, this.O000000000000(k));
         }

         o0000O00OO0O0.O00000000(f, g, h, i, j, var15);
         o0000O00OO0O0.O00000000(f, g, h, i, j, var13, 1.0F);
      }
   }

   private boolean O0000000000OOO() {
      Theme var1 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
      return "Светлый".equals(this.O000000000OOO0.O0000000000()) || O0000000O00OO0.O0000000000(var1) || O00000OOOO00O0.O00000000000();
   }

   private int O000000000000(float f) {
      if (!this.O0000000000OOO()) {
         return this.O00000000(RenderManager.W382.O0000000000(0, 0, 0, 120), f);
      } else {
         Theme var2 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
         ColorScheme var3 = ColorScheme.O00000000(var2, true);
         int var4 = O0000O000OO000.O0000000000(-10787208, var3.O000000000O00(), 0.1F);
         return O0000O000OO000.O00000000(var4, (int)(48.0F * Math.max(0.0F, Math.min(1.0F, f * this.O00000000O00O0.O0000000000()))));
      }
   }

   private int O00000000(int i, int j, float f) {
      int var4 = i >> 24 & 0xFF;
      int var5 = i >> 16 & 0xFF;
      int var6 = i >> 8 & 0xFF;
      int var7 = i & 0xFF;
      int var8 = j >> 24 & 0xFF;
      int var9 = j >> 16 & 0xFF;
      int var10 = j >> 8 & 0xFF;
      int var11 = j & 0xFF;
      int var12 = (int)(var4 + (var8 - var4) * f);
      int var13 = (int)(var5 + (var9 - var5) * f);
      int var14 = (int)(var6 + (var10 - var6) * f);
      int var15 = (int)(var7 + (var11 - var7) * f);
      return RenderManager.W382.O0000000000(var13, var14, var15, var12);
   }

   private void O00000000(PlayerEntity playerEntity, ItemStack itemStack, float f, float g, int i, float h, int j) {
      if (itemStack != null && !itemStack.isEmpty()) {
         this.O00000000OO0O.add(new NameTags.W180(playerEntity, itemStack.copy(), f, g, i, h, j));
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      if (!this.O00000000OO0O.isEmpty()) {
         this.O00000000OO0O.sort(Comparator.comparingInt(NameTags.W180::priority));

         for (NameTags.W180 var4 : this.O00000000OO0O) {
            ItemRenderUtil.O00000000(o0000O00OO0O0, var4.stack(), var4.x(), var4.y(), var4.scale(), var4.seed(), false, var4.priority());
         }

         this.O00000000OO0O.clear();
      }
   }

   private boolean O00000000(LivingEntity livingEntity) {
      return livingEntity instanceof Monster || livingEntity instanceof SlimeEntity || livingEntity instanceof VillagerEntity;
   }

   private boolean O000000000(LivingEntity livingEntity) {
      return livingEntity instanceof AnimalEntity;
   }

   private int O00000000(ItemStack itemStack, float f) {
      boolean var3 = itemStack != null && !itemStack.isEmpty() && itemStack.contains(DataComponentTypes.CUSTOM_NAME);
      int var4 = this.O000000000(itemStack, f);
      int var5 = var3
         ? RenderManager.W382.O0000000000(
            RenderManager.W382.O0000000000O00(var4), RenderManager.W382.O0000000000O0O(var4), RenderManager.W382.O0000000000OO(var4), 210
         )
         : RenderManager.W382.O0000000000(142, 148, 158, 135);
      return this.O00000000(var5, f);
   }

   private int O000000000(ItemStack itemStack, float f) {
      int var3 = RenderManager.W382.O0000000000(220, 255, 245, 255);
      if (itemStack != null && !itemStack.isEmpty()) {
         int[] var4 = new int[]{var3};

         try {
            Text var5 = itemStack.getName();
            var5.visit((style, string) -> {
               TextColor var3x = style.getColor();
               if (var3x != null && string != null && !string.isBlank()) {
                  var4[0] = RenderManager.W382.O0000000000(var3x.getRgb() >> 16 & 0xFF, var3x.getRgb() >> 8 & 0xFF, var3x.getRgb() & 0xFF, 255);
                  return Optional.of(Boolean.TRUE);
               } else {
                  return Optional.empty();
               }
            }, Style.EMPTY);
         } catch (Throwable var6) {
         }

         return this.O00000000(var4[0], f);
      } else {
         return this.O00000000(var3, f);
      }
   }

   private String O00000000(ItemStack itemStack, boolean bl) {
      if (itemStack != null && !itemStack.isEmpty()) {
         int var3 = Math.max(1, itemStack.getCount());
         String var4 = itemStack.getName().getString().replaceAll("§.", "").replaceAll("\\p{Cntrl}", "").replaceAll("\\s+", " ").trim();
         if (var4.isEmpty()) {
            var4 = "Предмет";
         }

         if (!bl && var4.length() > 22) {
            var4 = var4.substring(0, 19).trim() + "...";
         }

         return var4 + (var3 > 1 ? " x" + var3 : "");
      } else {
         return "Пусто";
      }
   }

   private String O00000000(String string, float f, float g) {
      if (string == null || string.isEmpty()) {
         return "";
      } else if (RenderManager.O00000000(FontRegistry.O000000000, string, f).O00000000 <= g) {
         return string;
      } else {
         String var4 = "...";
         float var5 = RenderManager.O00000000(FontRegistry.O000000000, var4, f).O00000000;
         int var6 = string.length();

         while (var6 > 0 && RenderManager.O00000000(FontRegistry.O000000000, string.substring(0, var6), f).O00000000 + var5 > g) {
            var6--;
         }

         return var6 <= 0 ? var4 : string.substring(0, var6).trim() + var4;
      }
   }

   private int O00000000(int i, float f) {
      int var3 = i >> 24 & 0xFF;
      int var4 = i >> 16 & 0xFF;
      int var5 = i >> 8 & 0xFF;
      int var6 = i & 0xFF;
      return RenderManager.W382.O0000000000(var4, var5, var6, (int)(var3 * f));
   }

   private boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && f <= h + j && g >= i && g <= i + k;
   }

   record W177(Vec3d start, Vec3d end) {
   }

   record W178(List<NameTags.W177> bones, long capturedAt) {
   }

   record W179(float x, float y, float w, float h, String playerName) {
   }

   record W180(PlayerEntity player, ItemStack stack, float x, float y, int seed, float scale, int priority) {
   }

   record W181(float screenX, float headY, float feetY, float depth, double distance, float boxLeft, float boxRight) {
   }
}
