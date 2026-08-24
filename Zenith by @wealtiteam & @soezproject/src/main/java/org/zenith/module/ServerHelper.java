package org.zenith.module;

import org.zenith.config.ConfigJsonUtil;
import org.zenith.core.ItemRegistry;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.TextScanner;
import org.zenith.core.MediaTrackInfo;
import org.zenith.core.FileLogger;
import org.zenith.core.CloudApiClient;
import org.zenith.event.Event49;
import org.zenith.event.EventMixin_modifySetScreenArg;
import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.utility.render.display.base.CornerRadius;



import org.zenith.module.ModuleInfo;

import org.zenith.util.ArgbColor;
import org.zenith.module.Category;
import org.zenith.util.ColorUtils;
import org.zenith.util.CooldownTimer;

import org.zenith.util.MathUtils;
import org.zenith.module.Module;
import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.PotionItemBuilder;
import org.zenith.core.ProfileItemBuilder;
import org.zenith.ZenithClient;
import org.zenith.core.ItemSpec;
import org.zenith.core.NbtEditor;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.core.StringCodec;
import org.zenith.render.ScreenProjection;
import org.zenith.util.ScreenUtils;
import org.zenith.render.ShapeRenderer;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.render.WorldRender;
import org.zenith.core.EffectEngine;
import org.zenith.core.TaskQueueWorker;

import org.zenith.event.Event19;
import org.zenith.event.EventHookWorldRender;
import org.zenith.event.EventInjectHandleInputEvents;
import org.zenith.event.EventRender2;
import org.zenith.event.EventTriggerKeyEvent;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.PacketEvent;
import org.zenith.event.RefreshCacheEvent;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.Setting;
import org.zenith.setting.StringSetting2;

import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.BlurHudDrawContext;
import org.zenith.utility.render.display.base.CustomDrawContext;
import org.zenith.utility.render.display.base.GuiSprite;
















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.particle.ExplosionSmokeParticle.Factory;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.data.DataTracker.SerializedEntry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.ParticleS2CPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.particle.EntityEffectParticleEffect;
import net.minecraft.registry.Registries;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;
import org.apache.commons.lang3.StringUtils;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;

@ModuleInfo(
   name = "ServerHelper",
   category = Category.MISC,
   description = ""
)
public final class ServerHelper extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public final Map<BlockPos, BlockState> map27 = new HashMap<>();
   public final List<ServerHelper_Var165> list75 = new ArrayList<>();
   public final List<ServerHelper_Var160> list76 = new ArrayList<>();
   public final List<ServerHelper_Var143> list77 = new ArrayList<>();
   public final Map<Integer, ServerHelper_Var159> map28 = new HashMap<>();
   public final Map<BlockPos, Boolean> map29 = new HashMap<>();
   public final Map<BlockPos, Boolean> map30 = new HashMap<>();
   public static final long long131 = 1000L;
   public final Map<BlockPos, Long> map31 = new HashMap<>();
   public final Map<BlockPos, Long> map32 = new HashMap<>();
   public static final ServerHelper serverHelper = new ServerHelper();
   public final ModeSetting3 server = new ModeSetting3(
      "Server", "module.serverHelper.serverMode.desc", "Auto", "HolyWorld", "FunTime", "ReallyWorld"
   );
   public final BooleanSetting consumablesSetting = new BooleanSetting(
      "module.serverHelper.consumablesSetting",
      "module.serverHelper.consumablesSetting.desc",
      true,
      () -> this.boolean182() || this.call003()
   );
   public final BooleanSetting autoPointSetting = new BooleanSetting(
      "module.serverHelper.autoPointSetting", "module.serverHelper.autoPointSetting.desc", true, this::boolean182
   );
   public final BooleanSetting hitDisplaySetting = new BooleanSetting(
      "module.serverHelper.hitDisplaySetting", "module.serverHelper.hitDisplaySetting.desc", true, this::call003
   );
   public final StringSetting2 shulkerKey = new StringSetting2(
      "module.serverHelper.shulkerKey", "module.serverHelper.shulkerKey.desc", -1, this::call003
   );
   public Slot slot = null;
   public final CooldownTimer zClass06734 = new CooldownTimer();

   public ServerHelper() {
      this.initialize();
   }

   public boolean call030() {
      return this.server.is(0)
         ? ZenithClient.on23().CloudApiClient().call030()
         : this.server.is(3);
   }

   public boolean boolean182() {
      return this.server.is(0)
         ? ZenithClient.on23().CloudApiClient().soundEvent7()
         : this.server.is(2);
   }

   public boolean call003() {
      return this.server.is(0)
         ? ZenithClient.on23().CloudApiClient().call003()
         : this.server.is(1);
   }

   public void initialize() {
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.FIREWORK_STAR,
               new StringSetting2("module.serverHelper.antiFly", "module.serverHelper.antiFly.desc", this::call030),
               0.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.FLOWER_BANNER_PATTERN,
               new StringSetting2("module.serverHelper.scrollExp", "module.serverHelper.scrollExp.desc", this::call030),
               0.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.PRISMARINE_SHARD,
               new StringSetting2("module.serverHelper.explosiveTrap", "module.serverHelper.explosiveTrap.desc", this::call003),
               5.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.POPPED_CHORUS_FRUIT,
               new StringSetting2("module.serverHelper.normalTrap", "module.serverHelper.normalTrap.desc", this::call003),
               0.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.NETHER_STAR,
               new StringSetting2("module.serverHelper.stun", "module.serverHelper.stun.desc", this::call003),
               30.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.FIRE_CHARGE,
               new StringSetting2("module.serverHelper.explosiveThing", "module.serverHelper.explosiveThing.desc", this::call003),
               0.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.SNOWBALL,
               new StringSetting2(
                  "module.serverHelper.snowball", "module.serverHelper.snowball.desc", () -> this.boolean182() || this.call003()
               ),
               0.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.PHANTOM_MEMBRANE,
               new StringSetting2("module.serverHelper.holyAura", "module.serverHelper.holyAura.desc", this::boolean182),
               0.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.NETHERITE_SCRAP,
               new StringSetting2("module.serverHelper.trap", "module.serverHelper.trap.desc", this::boolean182),
               0.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.DRIED_KELP,
               new StringSetting2("module.serverHelper.plast", "module.serverHelper.plast.desc", this::boolean182),
               0.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.SUGAR,
               new StringSetting2("module.serverHelper.clearDust", "module.serverHelper.clearDust.desc", this::boolean182),
               10.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.FIRE_CHARGE,
               new StringSetting2("module.serverHelper.fireTornado", "module.serverHelper.fireTornado.desc", this::boolean182),
               10.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.ENDER_EYE,
               new StringSetting2("module.serverHelper.disorient", "module.serverHelper.disorient.desc", this::boolean182),
               10.0F,
               new BooleanValue()
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.SPLASH_POTION,
               new StringSetting2("module.serverHelper.radiationPotion", "module.serverHelper.radiationPotion.desc", this::boolean182),
               10.0F,
               new BooleanValue(),
               var0 -> ScreenUtils.on23(var0.getStack(), "potion-radiation")
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.SPLASH_POTION,
               new StringSetting2("module.serverHelper.drowsinessPotion", "module.serverHelper.drowsinessPotion.desc", this::boolean182),
               10.0F,
               new BooleanValue(),
               var0 -> ScreenUtils.on23(var0.getStack(), "potion-drowsiness")
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.SPLASH_POTION,
               new StringSetting2("module.serverHelper.assassinPotion", "module.serverHelper.assassinPotion.desc", this::boolean182),
               0.0F,
               new BooleanValue(),
               var0 -> ScreenUtils.on23(var0.getStack(), "potion-assassin")
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.SPLASH_POTION,
               new StringSetting2("module.serverHelper.paladinPotion", "module.serverHelper.paladinPotion.desc", this::boolean182),
               0.0F,
               new BooleanValue(),
               var0 -> ScreenUtils.on23(var0.getStack(), "potion-paladin")
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.SPLASH_POTION,
               new StringSetting2("module.serverHelper.ragePotion", "module.serverHelper.ragePotion.desc", this::boolean182),
               0.0F,
               new BooleanValue(),
               var0 -> ScreenUtils.on23(var0.getStack(), "potion-rage")
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.SPLASH_POTION,
               new StringSetting2("module.serverHelper.holyWaterPotion", "module.serverHelper.holyWaterPotion.desc", this::boolean182),
               0.0F,
               new BooleanValue(),
               var0 -> ScreenUtils.on23(var0.getStack(), "potion-holy-water")
            )
         );
      this.list77
         .add(
            new ServerHelper_Var143(
               Items.SPLASH_POTION,
               new StringSetting2("module.serverHelper.popperPotion", "module.serverHelper.popperPotion.desc", this::boolean182),
               10.0F,
               new BooleanValue(),
               var0 -> ScreenUtils.on23(var0.getStack(), "potion-popper")
            )
         );
   }

   @Override
   public List<Setting> getSettings() {
      List<Setting> arraylist = new ArrayList<>(
         List.of(this.server, this.consumablesSetting, this.autoPointSetting, this.hitDisplaySetting, this.shulkerKey)
      );
      arraylist.addAll(this.list77.stream().map(ServerHelper_Var143::double22).toList());
      return arraylist;
   }

   @EventTarget
   public void on23(EventTriggerKeyEvent var1) {
      this.list77
         .stream()
         .filter(
            var1x -> var1.ItemRegistry(var1x.stringSetting2().getKeyCode())
                  && var1x.stringSetting2().isVisible()
                  && var1x.int156() != null
         )
         .forEach(var0 -> var0.var4().setValue(true));
      this.list77
         .stream()
         .filter(var1x -> var1.ItemSpec(var1x.stringSetting2().getKeyCode()) && var1x.stringSetting2().isVisible())
         .forEach(var1x -> {
            if (this.Event19(var1x.float93())) {
               ScreenUtils.UiAnimation(var1x.double21(), var1x.double36());
            }

            var1x.var4().setValue(false);
         });
      if (var1.ItemSpec(this.shulkerKey.getKeyCode())) {
         Slot slot = ScreenUtils.ColorAnimator(var0 -> {
            if (var0.getStack().getItem() instanceof BlockItem blockitem && blockitem.getBlock() instanceof ShulkerBoxBlock) {
               return true;
            }

            return false;
         });
         if (slot == null) {
            ZenithClient.on23()
               .ConfigJsonUtil()
               .on23(
                  "M",
                  Text.of(
                     Text.of("\u0428\u0430\u043b\u043a\u0435\u0440")
                        .copy()
                        .setStyle(Style.EMPTY.withColor(val003.TextScanner().getCurrentStyle().getPrimaryColor().getIntColor()))
                        .append(
                           Text.of(" \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d")
                              .copy()
                              .setStyle(
                                 Style.EMPTY
                                    .withColor(val003.TextScanner().getCurrentStyle().getTextEnable().getColor().call001())
                              )
                        )
                  )
               );
            return;
         }

         this.slot = slot;
         TaskQueueWorker ll1ill11111i_l1i1illlili = new TaskQueueWorker(ServerHelper.class);
         ll1ill11111i_l1i1illlili.on23(
            EventInjectHandleInputEvents.class,
            var1x -> {
               if (!minecraftClient3.player.lastPlayerInput.jump()
                  && !minecraftClient3.player.isSprinting()
                  && !minecraftClient3.player.lastPlayerInput.forward()
                  && !minecraftClient3.player.lastPlayerInput.backward()
                  && !minecraftClient3.player.lastPlayerInput.left()
                  && !minecraftClient3.player.lastPlayerInput.right()) {
                  ScreenUtils.on23(slot, Hand.MAIN_HAND, false);
                  ScreenUtils.closeScreen();
                  return true;
               } else {
                  return false;
               }
            }
         );
         ll1ill11111i_l1i1illlili.on23(EventInjectHandleInputEvents.class, var0 -> true);
         ll1ill11111i_l1i1illlili.on23(
            RefreshCacheEvent.class,
            var1x -> {
               if (var1x.isCancelled()) {
                  return false;
               } else if (!minecraftClient3.player.lastPlayerInput.jump()
                  && !minecraftClient3.player.isSprinting()
                  && !minecraftClient3.player.lastPlayerInput.forward()
                  && !minecraftClient3.player.lastPlayerInput.backward()
                  && !minecraftClient3.player.lastPlayerInput.left()
                  && !minecraftClient3.player.lastPlayerInput.right()) {
                  EffectEngine.useItem(Hand.MAIN_HAND);
                  var1x.cancel();
                  this.zClass06734.reset();
                  return true;
               } else {
                  return false;
               }
            }
         );
         ll1ill11111i_l1i1illlili.on23(
            EventInjectHandleInputEvents.class,
            var2x -> {
               if (!minecraftClient3.player.lastPlayerInput.jump()
                  && !minecraftClient3.player.isSprinting()
                  && !minecraftClient3.player.lastPlayerInput.forward()
                  && !minecraftClient3.player.lastPlayerInput.backward()
                  && !minecraftClient3.player.lastPlayerInput.left()
                  && !minecraftClient3.player.lastPlayerInput.right()) {
                  if (minecraftClient3.player.currentScreenHandler instanceof PlayerScreenHandler) {
                     if (this.zClass06734.EventModifyMouseRotationInput(1000L)) {
                        ScreenUtils.on23(slot, Hand.MAIN_HAND, true);
                        ScreenUtils.closeScreen();
                        return true;
                     }
                  } else {
                     this.zClass06734.EventMixin_modifySetScreenArg(0L);
                  }

                  return false;
               } else {
                  return false;
               }
            }
         );
         ll1ill11111i_l1i1illlili.UiAnimation(MovementInputEvent.class, var0 -> {
            var0.NoSlow();
            return true;
         });
         ZenithClient.on23().FileLogger().on23(ll1ill11111i_l1i1illlili);
      }
   }

   @EventTarget
   public void onPacket(PacketEvent var1) {
      this.SimpleItemBuilder(var1);
      if (this.consumablesSetting.isEnabled()) {
         if (ZenithClient.on23().CloudApiClient().soundEvent7()
            && var1.ItemScroller() instanceof ChunkDeltaUpdateS2CPacket chunkdeltaupdates2cpacket) {
            chunkdeltaupdates2cpacket.visitUpdates((var1x, var2x) -> this.map27.put(var1x.add(0, 0, 0), var2x));
            chunkdeltaupdates2cpacket.visitUpdates((var1x, var2x) -> {
               Vec3d vec3d1 = var1x.add(0, 0, 0).toCenterPos();
               if (this.map27.size() > 50 && this.map27.size() < 600) {
                  if (this.NbtEditor(var1x.up(2))) {
                     this.on23(Items.NETHERITE_SCRAP, vec3d1, (double)(System.currentTimeMillis() + 15000L));
                  } else if (this.ProfileItemBuilder(var1x.up(3))) {
                     this.on23(Items.NETHERITE_SCRAP, vec3d1, (double)(System.currentTimeMillis() + 30000L));
                  }
               }
            });
         }

         if (var1.ItemScroller() instanceof PlaySoundS2CPacket playsounds2cpacket
            && ZenithClient.on23().CloudApiClient().call003()
            && playsounds2cpacket.getSound().getKey().isPresent()
            && playsounds2cpacket.getSound().getKey().get().getValue().getPath().equals("block.beacon.deactivate")) {
            this.on23(
               Items.NETHER_STAR,
               new Vec3d(playsounds2cpacket.getX(), playsounds2cpacket.getY(), playsounds2cpacket.getZ()),
               (double)(System.currentTimeMillis() + 15000L)
            );
         }

         if (ZenithClient.on23().CloudApiClient().call003()
            && var1.ItemScroller() instanceof ParticleS2CPacket particles2cpacket) {
            Class oclass = minecraftClient3.particleManager
               .factories
               .get(Registries.PARTICLE_TYPE.getRawId(particles2cpacket.getParameters().getType()))
               .getClass();
            if (oclass == Factory.class) {
               this.on23(
                  Items.PRISMARINE_SHARD,
                  new Vec3d(particles2cpacket.getX(), particles2cpacket.getY(), particles2cpacket.getZ()),
                  (double)(System.currentTimeMillis() + 11000L)
               );
            }
         }
      }

      if (var1.ItemScroller() instanceof GameMessageS2CPacket gamemessages2cpacket
         && this.autoPointSetting.isEnabled()
         && this.autoPointSetting.getVisible().get()) {
         Text text = gamemessages2cpacket.content();
         String s = text.toString();
         String s1 = text.getString();
         String s2 = StringUtils.substringBetween(s1, "|||   [", "]   ");
         if (s2 != null) {
            String s3 = StringUtils.substringBetween(s, "value='/gps ", "'");
            String s4 = StringUtils.substringBetween(s1, "\u0423\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: ", "\n \u2551");
            String s5 = StringUtils.substringBetween(s1, "\u041f\u0440\u0438\u0437\u0432\u0430\u043d \u0438\u0433\u0440\u043e\u043a\u043e\u043c: ", "\n \u2551");
            if (s3 != null) {
               String[] astring = s3.split(" ");
               Vec3d vec3d = BlockPos.ofFloored(
                     (double)Integer.parseInt(astring[0]), (double)Integer.parseInt(astring[1]), (double)Integer.parseInt(astring[2])
                  )
                  .toCenterPos();
               switch (s2) {
                  case "\u041c\u0438\u0441\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0441\u0443\u043d\u0434\u0443\u043a":
                     this.on23(s2, s4, s5, vec3d, "overworld", 300, 0);
                     break;
                  case "\u0412\u0443\u043b\u043a\u0430\u043d":
                     this.on23(s2, s4, s5, vec3d, "overworld", 300, 120);
                     break;
                  case "\u041c\u0435\u0442\u0435\u043e\u0440\u0438\u0442\u043d\u044b\u0439 \u0434\u043e\u0436\u0434\u044c":
                  case "\u041c\u0430\u044f\u043a \u0443\u0431\u0438\u0439\u0446\u0430":
                  case "\u041c\u0438\u0441\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0410\u043b\u0442\u0430\u0440\u044c":
                     this.on23(s2, s4, s5, vec3d, "overworld", 360, 0);
                     break;
                  case "\u0417\u0430\u0433\u0430\u0434\u043e\u0447\u043d\u044b\u0439 \u043c\u0430\u044f\u043a":
                     this.on23(s2, s4, s5, vec3d, "overworld", 60, 180);
               }
            } else {
               switch (s2) {
                  case "\u0421\u0443\u043d\u0434\u0443\u043a \u0441\u043c\u0435\u0440\u0442\u0438":
                     this.on23(s2, s4, s5, BlockPos.ofFloored(-155.0, 64.0, 205.0).toCenterPos(), "lobby", 300, 0);
                     break;
                  case "\u0410\u0434\u0441\u043a\u0430\u044f \u0440\u0435\u0437\u043d\u044f":
                     this.on23(s2, s4, s5, BlockPos.ofFloored(48.0, 87.0, 73.0).toCenterPos(), "lobby", 180, 120);
               }
            }
         }
      }
   }

   @EventTarget
   public void ColorAnimator(EventHookWorldRender var1) {
      long i = System.currentTimeMillis();
      if (i % 5000L < 16L) {
         this.call174();
      }

      BlockPos blockpos = minecraftClient3.player.getBlockPos();
      Vec3d vec3d = Vec3d.ZERO;
      MatrixStack matrixstack = var1.ClanUpgrade();
      this.list77
         .stream()
         .filter(var0 -> var0.var4().isValue())
         .forEach(
            var4x -> {
               String s = var4x.stringSetting2().getName();
               switch (s) {
                  case "\u0422\u0440\u0430\u043f\u043a\u0430":
                  case "\u041e\u0431\u044b\u0447 \u0442\u0440\u0430\u043f\u043a\u0430":
                     this.on23(
                        blockpos, vec3d, 1.99F, ZenithClient.on23().TextScanner().getClientColor(90).call001()
                     );
                     break;
                  case "\u0414\u0435\u0437\u043e\u0440\u0435\u043d\u0442":
                  case "\u041e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0441\u043c\u0435\u0440\u0447":
                  case "\u042f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c":
                  case "\u0417\u0435\u043b\u044c\u0435 \u0440\u0430\u0434\u0438\u0430\u0446\u0438\u0438":
                  case "\u0421\u043d\u043e\u0442\u0432\u043e\u0440\u043d\u043e\u0435":
                  case "\u0425\u043b\u043e\u043f\u0443\u0448\u043a\u0430":
                     this.on23(matrixstack, var4x.float93(), ColorUtils.int390);
                     break;
                  case "\u0412\u0437\u0440\u044b\u0432\u043d\u0430\u044f \u0448\u0442\u0443\u043a\u0430":
                     this.on23(
                        matrixstack, 5.0F, ZenithClient.on23().TextScanner().getClientColor(90).call001()
                     );
                     break;
                  case "\u041f\u043b\u0430\u0441\u0442":
                     float f = MathHelper.wrapDegrees(minecraftClient3.player.getYaw());
                     if (Math.abs(minecraftClient3.player.getPitch()) > 60.0F) {
                        BlockPos blockpos1 = blockpos.up().offset(minecraftClient3.player.getFacing(), 3);
                        Vec3d vec3d1 = Vec3d.of(blockpos1.east(3).south(3).down()).add(vec3d);
                        Vec3d vec3d2 = Vec3d.of(blockpos1.west(2).north(2).up()).add(vec3d);
                        WorldRender.on23(
                           new Box(vec3d1, vec3d2),
                           ZenithClient.on23().TextScanner().getClientColor(90).call001(),
                           3.0F,
                           true,
                           true,
                           true
                        );
                     } else if (f <= -157.5F || f >= 157.5F) {
                        BlockPos blockpos5 = blockpos.north(3).up();
                        Vec3d vec3d6 = Vec3d.of(blockpos5.down(2).east(3)).add(vec3d);
                        Vec3d vec3d10 = Vec3d.of(blockpos5.up(3).west(2).south(2)).add(vec3d);
                        WorldRender.on23(
                           new Box(vec3d6, vec3d10),
                           ZenithClient.on23().TextScanner().getClientColor(90).call001(),
                           3.0F,
                           true,
                           true,
                           true
                        );
                     } else if (f <= -112.5F) {
                        this.on23(
                           blockpos.east(5).south().down(),
                           vec3d,
                           ZenithClient.on23().TextScanner().getClientColor(90).call001(),
                           -1,
                           true
                        );
                     } else if (f <= -67.5F) {
                        BlockPos blockpos2 = blockpos.east(2).up();
                        Vec3d vec3d3 = Vec3d.of(blockpos2.down(2).south(3)).add(vec3d);
                        Vec3d vec3d7 = Vec3d.of(blockpos2.up(3).north(2).east(2)).add(vec3d);
                        WorldRender.on23(
                           new Box(vec3d3, vec3d7),
                           ZenithClient.on23().TextScanner().getClientColor(90).call001(),
                           3.0F,
                           true,
                           true,
                           true
                        );
                     } else if (f <= -22.5F) {
                        this.on23(
                           blockpos.east(5).down(),
                           vec3d,
                           ZenithClient.on23().TextScanner().getClientColor(90).call001(),
                           1,
                           false
                        );
                     } else if ((double)f >= -22.5 && (double)f <= 22.5) {
                        BlockPos blockpos4 = blockpos.south(2).up();
                        Vec3d vec3d5 = Vec3d.of(blockpos4.down(2).east(3)).add(vec3d);
                        Vec3d vec3d9 = Vec3d.of(blockpos4.up(3).west(2).south(2)).add(vec3d);
                        WorldRender.on23(
                           new Box(vec3d5, vec3d9),
                           ZenithClient.on23().TextScanner().getClientColor(90).call001(),
                           3.0F,
                           true,
                           true,
                           true
                        );
                     } else if (f <= 67.5F) {
                        this.on23(
                           blockpos.west(4).down(),
                           vec3d,
                           ZenithClient.on23().TextScanner().getClientColor(90).call001(),
                           1,
                           true
                        );
                     } else if (f <= 112.5F) {
                        BlockPos blockpos3 = blockpos.west(3).up();
                        Vec3d vec3d4 = Vec3d.of(blockpos3.down(2).south(3)).add(vec3d);
                        Vec3d vec3d8 = Vec3d.of(blockpos3.up(3).north(2).east(2)).add(vec3d);
                        WorldRender.on23(
                           new Box(vec3d4, vec3d8),
                           ZenithClient.on23().TextScanner().getClientColor(90).call001(),
                           3.0F,
                           true,
                           true,
                           true
                        );
                     } else if (f <= 157.5F) {
                        this.on23(
                           blockpos.west(4).south().down(),
                           vec3d,
                           ZenithClient.on23().TextScanner().getClientColor(90).call001(),
                           -1,
                           false
                        );
                     }
                     break;
                  case "\u0412\u0437\u0440\u044b\u0432\u043d\u0430\u044f \u0442\u0440\u0430\u043f\u043a\u0430":
                     this.on23(blockpos, vec3d, 3.99F, ColorUtils.int390);
                     break;
                  case "\u0421\u0442\u0430\u043d":
                     this.on23(blockpos, vec3d, 15.01F, ColorUtils.int390);
                     break;
                  case "\u0421\u043d\u0435\u0436\u043e\u043a":
                     Predictions.predictions.on23(matrixstack, Predictions.list74);
               }
            }
         );
      this.list76
         .forEach(
            var2x -> {
               if (var2x.item4() == Items.NETHER_STAR) {
                  this.on23(
                     BlockPos.ofFloored(var2x.vec3d28()),
                     vec3d,
                     15.01F,
                     ZenithClient.on23().TextScanner().getClientColor(90).call001()
                  );
               }
            }
         );
   }

   @EventTarget
   public void onDraw(EventRender2 var1) {
      CustomDrawContext customdrawcontext = var1.Bot();
      MatrixStack matrixstack = customdrawcontext.getMatrices();
      if (this.hitDisplaySetting.isEnabled() && this.hitDisplaySetting.getVisible().get()) {
         this.Easing(customdrawcontext);
      }

      this.list76
         .forEach(
            var1x -> {
               double d0 = (var1x.double47() - (double)System.currentTimeMillis()) / 1000.0;
               Vec3d vec3d = ScreenProjection.Event19(var1x.vec3d28());
               String s = MathUtils.ItemServiceBase(d0, 0.1F) + "\u0441";
               Font font = Fonts.MEDIUM.getFont(10.0F);
               float f = font.width(s);
               float f1 = (float)(vec3d.x - (double)(f / 2.0F));
               float f2 = (float)vec3d.y;
               float f3 = 2.0F;
               if (ScreenProjection.Event49(var1x.vec3d28())
                  && var1x.int166() == ZenithClient.on23().CloudApiClient().getAnarchy()
                  && ZenithClient.on23().CloudApiClient().call425().equals(var1x.string59())) {
                  ShapeRenderer.ItemRegistry(
                     var1.Bot().getMatrices(),
                     f1 - 4.0F,
                     f2 - 4.0F,
                     16.8F + font.width(s) + 8.0F,
                     20.8F,
                     22.0F,
                     org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(4.0F),
                     ArgbColor.var11934
                  );
                  var1.Bot()
                     .drawRoundedRect(
                        f1 - 4.0F,
                        f2 - 4.0F,
                        16.8F + font.width(s) + 8.0F,
                        20.8F,
                        org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(4.0F),
                        ZenithClient.on23().TextScanner().getCurrentStyle().getHudBackground().getColor()
                     );
                  ShapeRenderer.UiAnimation(
                     var1.Bot().getMatrices(),
                     f1 - 4.0F,
                     f2 - 4.0F,
                     16.8F + font.width(s) + 8.0F,
                     20.8F,
                     0.1F,
                     10.0F,
                     ZenithClient.on23().TextScanner().getCurrentStyle().getPrimaryColor().getColor(),
                     org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(4.0F)
                  );
                  var1.Bot()
                     .drawText(
                        font,
                        s,
                        f1 + 12.8F + 4.0F,
                        f2 + 2.5F,
                        ZenithClient.on23().TextScanner().getCurrentStyle().getPrimaryColor().getColor()
                     );
                  var1.Bot().getMatrices().push();
                  var1.Bot().getMatrices().translate(f1, f2, 0.0F);
                  var1.Bot().getMatrices().scale(0.8F, 0.8F, 1.0F);
                  var1.Bot().drawItem(var1x.item4().getDefaultStack(), 0, 0);
                  var1.Bot().getMatrices().pop();
               }
            }
         );
      this.list75
         .forEach(
            var0 -> {
               Vec3d vec3d = ScreenProjection.Event19(var0.vec3d27());
               double d0 = (var0.double45() - (double)System.currentTimeMillis()) / 1000.0;
               double d1 = (var0.double46() - (double)System.currentTimeMillis()) / 1000.0;
               String s = " ["
                  + MathUtils.ItemServiceBase(
                     minecraftClient3.getEntityRenderDispatcher().camera.getPos().distanceTo(var0.vec3d27()), 0.1
                  )
                  + "m]";
               String s1 = d0 > 0.0
                  ? ("\u0414\u043e \u043d\u0430\u0447\u0430\u043b\u0430: "
                        + MathUtils.ItemServiceBase(d0, d0 < 30.0 ? 0.1F : 1.0)
                        + "\u0441")
                     .replace(".0", "")
                  : (
                     d1 > 0.0
                        ? ("\u0414\u043e \u043a\u043e\u043d\u0446\u0430: "
                              + MathUtils.ItemServiceBase(d1, d1 < 30.0 ? 0.1F : 1.0)
                              + "\u0441")
                           .replace(".0", "")
                        : "\u041a\u043e\u043d\u0435\u0446 \u0438\u0432\u0435\u043d\u0442\u0430!"
                  );
               if (ScreenProjection.Event49(var0.vec3d27())
                  && var0.int165() == ZenithClient.on23().CloudApiClient().getAnarchy()
                  && ZenithClient.on23().CloudApiClient().call425().equals(var0.string58())) {
                  var arraylist = new ArrayList(Collections.singletonList(var0.string55() + s));
                  if (var0.string57() != null) {
                     arraylist.add("\u041f\u0440\u0438\u0437\u0432\u0430\u043d: " + Formatting.GOLD + var0.string57());
                  }

                  arraylist.add(s1);
                  if (var0.string56() != null) {
                     arraylist.add(var0.string56());
                  }
               }
            }
         );
      this.list76.removeIf(var0 -> var0.double47() - (double)System.currentTimeMillis() <= 0.0);
      this.list75.removeIf(var0 -> var0.double46() + 90000.0 - (double)System.currentTimeMillis() <= 0.0);
   }

   public void SimpleItemBuilder(PacketEvent var1) {
      if (this.hitDisplaySetting.isEnabled() && this.hitDisplaySetting.getVisible().get() && minecraftClient3.world != null) {
         long i = System.currentTimeMillis();
         if (var1.ItemScroller() instanceof EntityTrackerUpdateS2CPacket entitytrackerupdates2cpacket) {
            this.on23(entitytrackerupdates2cpacket, i);
         }
      } else {
         this.map28.clear();
      }
   }

   public void on23(EntityTrackerUpdateS2CPacket var1, long var2) {
      for (SerializedEntry serializedentry : var1.trackedValues()) {
         if (serializedentry.id() == 10) {
            if (this.ItemSpec(serializedentry.value())) {
               ServerHelper_Var159 l1il1ili1illil1i_ii1il11l111ii11iil = this.map28.get(var1.id());
               if (l1il1ili1illil1i_ii1il11l111ii11iil == null || l1il1ili1illil1i_ii1il11l111ii11iil.int155() <= var2) {
                  this.map28.put(var1.id(), new ServerHelper_Var159(var2, var2 + 10000L));
               }
            }

            return;
         }
      }
   }

   public boolean ItemSpec(Object var1) {
      return var1 instanceof List<?> list
         ? list.stream().filter(EntityEffectParticleEffect.class::isInstance).map(EntityEffectParticleEffect.class::cast).anyMatch(this::on23)
         : false;
   }

   public boolean on23(EntityEffectParticleEffect var1) {
      return Math.abs(var1.getRed() - 0.29411766F) <= 1.0E-4F
         && Math.abs(var1.getGreen() - 0.34509805F) <= 1.0E-4F
         && Math.abs(var1.getBlue() - 0.4117647F) <= 1.0E-4F;
   }

   public void Easing(CustomDrawContext var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         long i = System.currentTimeMillis();
         this.map28
            .entrySet()
            .removeIf(
               var2x -> var2x.getValue().int155() <= i
                     || !(minecraftClient3.world.getEntityById(var2x.getKey()) instanceof PlayerEntity)
            );

         for (PlayerEntity playerentity : minecraftClient3.world.getPlayers()) {
            if (playerentity != minecraftClient3.player) {
               ServerHelper_Var159 l1il1ili1illil1i_ii1il11l111ii11iil = this.map28.get(playerentity.getId());
               if (l1il1ili1illil1i_ii1il11l111ii11iil != null && l1il1ili1illil1i_ii1il11l111ii11iil.int155() > i) {
                  Vec3d vec3d = MathUtils.CloudResponse(playerentity).add(0.0, (double)playerentity.getHeight() * 0.5, 0.0);
                  if (ScreenProjection.Event49(vec3d)) {
                     Vec3d vec3d1 = ScreenProjection.Event19(vec3d);
                     if (!(vec3d1.z <= 0.0) && !(vec3d1.z >= 1.0)) {
                        float f = 18.0F;
                        float f1 = MathHelper.clamp((float)(l1il1ili1illil1i_ii1il11l111ii11iil.int155() - i) / 10000.0F, 0.0F, 1.0F);
                        float f2 = this.on23(l1il1ili1illil1i_ii1il11l111ii11iil, i);
                        float f3 = (float)vec3d1.x - f / 2.0F;
                        float f4 = (float)vec3d1.y - f / 2.0F;
                        this.on23(var1, f3, f4, f, f1, f2);
                     }
                  }
               }
            }
         }
      }
   }

   public float on23(ServerHelper_Var159 var1, long var2) {
      float f = MathHelper.clamp((float)(var2 - var1.call106()) / 250.0F, 0.0F, 1.0F);
      float f1 = MathHelper.clamp((float)(var1.int155() - var2) / 250.0F, 0.0F, 1.0F);
      return Math.min(f, f1);
   }

   public void on23(CustomDrawContext var1, float var2, float var3, float var4, float var5, float var6) {
      ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var6);

      try {
         var1.drawArcBorder(var2, var3, var4, var4, 1.0F, 360.0F, 0.5F, zenithstyle.getFieldBorder().getColor());
         var1.drawArcBorder(var2, var3, var4, var4, 1.0F, 360.0F * var5, 0.5F, zenithstyle.getPrimaryColor().getColor());
         float f = 0.65F;
         float f1 = (var4 - 16.0F * f) / 2.0F;
         var1.getMatrices().push();
         var1.getMatrices().translate(var2 + f1, var3 + f1, 0.0F);
         var1.getMatrices().scale(f, f, 1.0F);
         var1.drawItem(Items.SNOWBALL.getDefaultStack(), 0, 0);
         var1.getMatrices().pop();
      } finally {
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   public void on23(BlockPos var1, Vec3d var2, float var3, int var4) {
      Box box = new Box(var1.up()).offset(var2).contract(0.0, 0.2F, 0.0).expand((double)var3);
      boolean flag = minecraftClient3.world
         .getPlayers()
         .stream()
         .anyMatch(
            var1x -> var1x != minecraftClient3.player
                  && box.intersects(var1x.getBoundingBox())
                  && !ZenithClient.on23().MediaTrackInfo().isFriend(var1x.getGameProfile().getName())
         );
      WorldRender.on23(
         box,
         flag ? ZenithClient.on23().TextScanner().getCurrentStyle().getPrimaryColor().getColor().call001() : var4,
         3.0F,
         true,
         true,
         true
      );
   }

   public void on23(MatrixStack var1, float var2, int var3) {
      float f = minecraftClient3.player.getWidth() / 2.0F;
      int i = this.Event19(var2)
         ? ZenithClient.on23().TextScanner().getCurrentStyle().getPrimaryColor().getColor().call001()
         : var3;
      Vec3d vec3d = MathUtils.CloudResponse(minecraftClient3.player).add((double)f, 0.02, (double)f);
      Vec3d vec3d1 = vec3d.subtract(minecraftClient3.getEntityRenderDispatcher().camera.getPos());
      GL11.glEnable(2881);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.disableCull();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.TRIANGLE_STRIP, VertexFormats.POSITION_COLOR);
      int j = 0;

      for (byte b0 = 90; j <= b0; j++) {
         Vec3d vec3d2 = MathUtils.on23((float)j, (float)b0, (double)var2);
         Vec3d vec3d3 = MathUtils.on23((float)(j + 1), (float)b0, (double)var2);
         WorldRender.on23(
            var1,
            bufferbuilder,
            vec3d1.add(vec3d2),
            vec3d1.add(vec3d2.x, vec3d2.y + 2.0, vec3d2.z),
            ColorUtils.ColorAnimator(i, 0.2F),
            ColorUtils.ColorAnimator(i, 0.0F)
         );
         WorldRender.on23(vec3d.add(vec3d2), vec3d.add(vec3d3), i, 2.0F, true);
      }

      j = 0;

      for (byte b1 = 90; j <= b1; j++) {
         Vec3d vec3d4 = MathUtils.on23((float)j, (float)b1, (double)var2);
         WorldRender.on23(
            var1,
            bufferbuilder,
            vec3d1.add(vec3d4),
            vec3d1.add(vec3d4.x, vec3d4.y - 2.0, vec3d4.z),
            ColorUtils.ColorAnimator(i, 0.2F),
            ColorUtils.ColorAnimator(i, 0.0F)
         );
      }

      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      GL11.glDisable(2881);
   }

   public void on23(MatrixStack var1, Font var2, List<String> var3, Vec3d var4) {
      float f = 0.0F;

      for (int i = 0; i < var3.size(); i++) {
         String s = (String)var3.get(i);
         float f1 = var2.width(s);
         float f2 = (float)(var4.x - (double)(f1 / 2.0F));
         f += 10.0F;
      }
   }

   public void on23(BlockPos var1, Vec3d var2, int var3, int var4, boolean var5) {
      Vec3d vec3d = Vec3d.of(var1).add(var2);
      float f = 2.0F;
      int i = ColorUtils.ColorAnimator(var3, 0.15F);
      this.on23(vec3d, var3, f, var4, var5);
      this.on23(vec3d, var3, f, var4, var5);
      this.UiAnimation(vec3d, var3, f, var4, var5);
      this.on23(vec3d, i, var4, var5);
      this.on23(vec3d, i, var4, var5);
      this.UiAnimation(vec3d, i, var4, var5);
   }

   public void on23(Vec3d var1, int var2, float var3, int var4, boolean var5) {
      float f = var5 ? (float)var4 : (float)(-var4);
      Vec3d vec3d;
      WorldRender.on23(var1, vec3d = var1.add((double)f, 0.0, 0.0), var2, var3, true);

      for (int i = 0; i < 4; i++) {
         Vec3d vec3d1;
         WorldRender.on23(vec3d, vec3d1 = vec3d.add(0.0, 0.0, (double)var4), var2, var3, true);
         WorldRender.on23(vec3d1, vec3d = vec3d1.add((double)f, 0.0, 0.0), var2, var3, true);
      }

      Vec3d vec3d2;
      WorldRender.on23(vec3d, vec3d2 = vec3d.add(0.0, 0.0, (double)var4), var2, var3, true);
      WorldRender.on23(vec3d2, vec3d = vec3d2.add((double)(f * -2.0F), 0.0, 0.0), var2, var3, true);

      for (int j = 0; j < 3; j++) {
         Vec3d vec3d3;
         WorldRender.on23(vec3d, vec3d3 = vec3d.add(0.0, 0.0, (double)(var4 * -1)), var2, var3, true);
         WorldRender.on23(vec3d3, vec3d = vec3d3.add((double)(f * -1.0F), 0.0, 0.0), var2, var3, true);
      }

      WorldRender.on23(vec3d, vec3d.add(0.0, 0.0, (double)(var4 * -2)), var2, var3, true);
   }

   public void UiAnimation(Vec3d var1, int var2, float var3, int var4, boolean var5) {
      float f = var5 ? (float)var4 : (float)(-var4);
      WorldRender.on23(var1, var1.add(0.0, 5.0, 0.0), var2, var3, true);
      Vec3d vec3d;
      WorldRender.on23(vec3d = var1.add((double)f, 0.0, 0.0), vec3d.add(0.0, 5.0, 0.0), var2, var3, true);

      for (int i = 0; i < 4; i++) {
         WorldRender.on23(vec3d = vec3d.add((double)f, 0.0, (double)var4), vec3d.add(0.0, 5.0, 0.0), var2, var3, true);
      }

      WorldRender.on23(var1 = vec3d.add(0.0, 0.0, (double)var4), var1.add(0.0, 5.0, 0.0), var2, var3, true);
      Vec3d vec3d1;
      WorldRender.on23(vec3d1 = var1.add((double)(f * -2.0F), 0.0, 0.0), vec3d1.add(0.0, 5.0, 0.0), var2, var3, true);

      for (int j = 0; j < 3; j++) {
         WorldRender.on23(vec3d1 = vec3d1.add((double)(f * -1.0F), 0.0, (double)(var4 * -1)), vec3d1.add(0.0, 5.0, 0.0), var2, var3, true);
      }
   }

   public void on23(Vec3d var1, int var2, int var3, boolean var4) {
      var1 = var1.add(0.0, 0.001, 0.0);
      float f = var4 ? (float)var3 : (float)(-var3);
      WorldRender.on23(
         var1, var1.add((double)f, 0.0, 0.0), var1.add((double)f, 0.0, (double)(var3 * 2)), var1.add(0.0, 0.0, (double)(var3 * 2)), var2, true
      );

      for (int i = 0; i < 3; i++) {
         WorldRender.on23(
            var1 = var1.add((double)f, 0.0, (double)var3),
            var1.add((double)f, 0.0, 0.0),
            var1.add((double)f, 0.0, (double)(var3 * 2)),
            var1.add(0.0, 0.0, (double)(var3 * 2)),
            var2,
            true
         );
      }

      Vec3d vec3d;
      WorldRender.on23(
         vec3d = var1.add((double)f, 0.0, (double)var3),
         vec3d.add((double)f, 0.0, 0.0),
         vec3d.add((double)f, 0.0, (double)var3),
         vec3d.add(0.0, 0.0, (double)var3),
         var2,
         true
      );
   }

   public void UiAnimation(Vec3d var1, int var2, int var3, boolean var4) {
      float f = var4 ? (float)var3 : (float)(-var3);
      WorldRender.on23(var1, var1.add((double)f, 0.0, 0.0), var1.add((double)f, 5.0, 0.0), var1.add(0.0, 5.0, 0.0), var2, true);

      for (int i = 0; i < 4; i++) {
         Vec3d vec3d;
         WorldRender.on23(
            vec3d = var1.add((double)f, 0.0, 0.0), vec3d.add(0.0, 0.0, (double)var3), vec3d.add(0.0, 5.0, (double)var3), vec3d.add(0.0, 5.0, 0.0), var2, true
         );
         WorldRender.on23(
            var1 = vec3d.add(0.0, 0.0, (double)var3), var1.add((double)f, 0.0, 0.0), var1.add((double)f, 5.0, 0.0), var1.add(0.0, 5.0, 0.0), var2, true
         );
      }

      Vec3d vec3d1;
      WorldRender.on23(
         vec3d1 = var1.add((double)f, 0.0, 0.0), vec3d1.add(0.0, 0.0, (double)var3), vec3d1.add(0.0, 5.0, (double)var3), vec3d1.add(0.0, 5.0, 0.0), var2, true
      );
      WorldRender.on23(
         var1 = vec3d1.add(0.0, 0.0, (double)var3),
         var1.add((double)(f * -2.0F), 0.0, 0.0),
         var1.add((double)(f * -2.0F), 5.0, 0.0),
         var1.add(0.0, 5.0, 0.0),
         var2,
         true
      );
      var1 = var1.add((double)(f * -1.0F), 0.0, 0.0);

      for (int j = 0; j < 3; j++) {
         Vec3d vec3d2;
         WorldRender.on23(
            vec3d2 = var1.add((double)(f * -1.0F), 0.0, 0.0),
            vec3d2.add(0.0, 0.0, (double)(var3 * -1)),
            vec3d2.add(0.0, 5.0, (double)(var3 * -1)),
            vec3d2.add(0.0, 5.0, 0.0),
            var2,
            true
         );
         WorldRender.on23(
            var1 = vec3d2.add(0.0, 0.0, (double)(var3 * -1)),
            var1.add((double)(f * -1.0F), 0.0, 0.0),
            var1.add((double)(f * -1.0F), 5.0, 0.0),
            var1.add(0.0, 5.0, 0.0),
            var2,
            true
         );
      }

      Vec3d vec3d3;
      WorldRender.on23(
         vec3d3 = var1.add((double)(f * -1.0F), 0.0, 0.0),
         vec3d3.add(0.0, 0.0, (double)(var3 * -2)),
         vec3d3.add(0.0, 5.0, (double)(var3 * -2)),
         vec3d3.add(0.0, 5.0, 0.0),
         var2,
         true
      );
   }

   public void on23(String var1, String var2, String var3, Vec3d var4, String var5, int var6, int var7) {
      if (this.list75.stream().noneMatch(var1x -> var1x.vec3d27().equals(var4))) {
         long i = System.currentTimeMillis() + (long)var6 * 1000L;
         long j = i + (long)var7 * 1000L;
         this.list75
            .add(
               new ServerHelper_Var165(
                  var1, var2, var3, var4, var5, ZenithClient.on23().CloudApiClient().getAnarchy(), (double)i, (double)j
               )
            );
      }
   }

   public void on23(Item var1, Vec3d var2, double var3) {
      if (this.list76.stream().noneMatch(var1x -> var1x.vec3d28().equals(var2))) {
         this.list76
            .add(
               new ServerHelper_Var160(
                  var1,
                  var2,
                  ZenithClient.on23().CloudApiClient().call425(),
                  ZenithClient.on23().CloudApiClient().getAnarchy(),
                  var3
               )
            );
      }
   }

   public Vector4f on23(Font var1, List<String> var2, int var3, float var4) {
      if (var3 == 0) {
         float f3 = var1.width((String)var2.get(var3 + 1));
         return f3 >= var4 ? new Vector4f(2.0F, 0.0F, 2.0F, 0.0F) : new Vector4f(2.0F);
      } else if (var3 == var2.size() - 1) {
         float f2 = var1.width((String)var2.get(var3 - 1));
         return f2 >= var4 ? new Vector4f(0.0F, 2.0F, 0.0F, 2.0F) : new Vector4f(2.0F);
      } else {
         float f = var1.width((String)var2.get(var3 - 1));
         float f1 = var1.width((String)var2.get(var3 + 1));
         return f >= var4 ? (f1 >= var4 ? new Vector4f() : new Vector4f(0.0F, 2.0F, 0.0F, 2.0F)) : new Vector4f(2.0F);
      }
   }

   public boolean Event19(float var1) {
      return var1 == 0.0F
         || minecraftClient3.world
            .getPlayers()
            .stream()
            .anyMatch(
               var1x -> var1x != minecraftClient3.player
                     && !ZenithClient.on23().MediaTrackInfo().isFriend(var1x.getGameProfile().getName())
                     && minecraftClient3.player.distanceTo(var1x) <= var1
            );
   }

   public boolean NbtEditor(BlockPos var1) {
      long i = System.currentTimeMillis();
      if (this.map31.containsKey(var1) && i - this.map31.get(var1) < 1000L) {
         return this.map29.get(var1);
      } else {
         boolean flag = this.PotionItemBuilder(var1);
         this.map29.put(var1, flag);
         this.map31.put(var1, i);
         return flag;
      }
   }

   public boolean PotionItemBuilder(BlockPos var1) {
      int i = 0;

      for (BlockPos blockpos : EffectEngine.on23(var1, 2.0F)) {
         if (MathUtils.PotionItemBuilder(blockpos.toCenterPos(), var1.toCenterPos()) < 2.0) {
            BlockState blockstate = this.map27.get(blockpos);
            if (blockstate != null && !blockstate.isAir()) {
               i++;
            }
         } else if (!blockpos.equals(var1.up(2).north().east())
            && !blockpos.equals(var1.up(2).north().west())
            && !blockpos.equals(var1.up(2).south().east())
            && !blockpos.equals(var1.up(2).south().west())) {
            BlockState blockstate1 = this.map27.get(blockpos);
            if (blockstate1 == null || blockstate1.isAir()) {
               i++;
            }
         }

         if (i > 1) {
            return false;
         }
      }

      return true;
   }

   public boolean ProfileItemBuilder(BlockPos var1) {
      long i = System.currentTimeMillis();
      if (this.map32.containsKey(var1) && i - this.map32.get(var1) < 1000L) {
         return this.map30.get(var1);
      } else {
         boolean flag = this.StringCodec(var1);
         this.map30.put(var1, flag);
         this.map32.put(var1, i);
         return flag;
      }
   }

   public boolean StringCodec(BlockPos var1) {
      int i = 0;

      for (BlockPos blockpos : EffectEngine.on23(var1, 3.0F)) {
         if (Math.abs(blockpos.getX() - var1.getX()) <= 2 && Math.abs(blockpos.getY() - var1.getY()) <= 2 && Math.abs(blockpos.getZ() - var1.getZ()) <= 2) {
            BlockState blockstate1 = this.map27.get(blockpos);
            if (blockstate1 != null && !blockstate1.isAir()) {
               i++;
            }
         } else if (!blockpos.equals(var1.up(3))) {
            BlockState blockstate = this.map27.get(blockpos);
            if (blockstate == null || blockstate.isAir()) {
               i++;
            }
         }

         if (i > 1) {
            return false;
         }
      }

      return true;
   }

   public static boolean on23(BlockState var0) {
      return var0 != null && !var0.isAir();
   }

   public void call174() {
      long i = System.currentTimeMillis();
      this.map31.entrySet().removeIf(var2 -> i - var2.getValue() > 1000L);
      this.map29.entrySet().removeIf(var1x -> !this.map31.containsKey(var1x.getKey()));
      this.map32.entrySet().removeIf(var2 -> i - var2.getValue() > 1000L);
      this.map30.entrySet().removeIf(var1x -> !this.map32.containsKey(var1x.getKey()));
      if (this.map29.size() > 1000) {
         this.map29.clear();
         this.map31.clear();
      }

      if (this.map30.size() > 1000) {
         this.map30.clear();
         this.map32.clear();
      }
   }

   public boolean on23(BlockPos var1, byte[][][] var2, int var3, int var4) {
      int i = 0;
      Mutable mutable = new Mutable();

      for (int j = -var3; j <= var3; j++) {
         for (int k = -var3; k <= var3; k++) {
            for (int l = -var3; l <= var3; l++) {
               byte b0 = var2[j + var3][k + var3][l + var3];
               if (b0 != -1) {
                  mutable.set(var1.getX() + l, var1.getY() + j, var1.getZ() + k);
                  BlockState blockstate = this.map27.get(mutable);
                  boolean flag = on23(blockstate);
                  if (b0 == 1 && !flag || b0 == 0 && flag) {
                     if (++i > var4) {
                        return false;
                     }
                  }
               }
            }
         }
      }

      return true;
   }

   public List<ServerHelper_Var143> double18() {
      return Collections.unmodifiableList(this.list77);
   }

   public StringSetting2 int153() {
      return this.shulkerKey;
   }

   public Slot int154() {
      return ScreenUtils.ColorAnimator(var0 -> {
         if (var0.getStack().getItem() instanceof BlockItem blockitem && blockitem.getBlock() instanceof ShulkerBoxBlock) {
            return true;
         }

         return false;
      });
   }
}
