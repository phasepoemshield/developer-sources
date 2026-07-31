// Module: ServerHelper
// Category: misc
// Original class: Serverhelper
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType4;
import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType5;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ParticleS2CPacket;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.BlockPos.TimerCallbackSerializer9;
import net.minecraft.client.render.VertexFormat.LootPool96;
import net.minecraft.client.particle.ExplosionSmokeParticle.DynamicEntry4;
import org.apache.commons.lang3.StringUtils;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;

@ModuleInfo(
   name = "ServerHelper",
   category = Category.MISC,
   description = ""
)
public final class Serverhelper extends Module {
   private final Map<BlockPos, BlockState> II11IIl1Il1111lllI1 = new HashMap<>();
   private final List<Serverhelper$EventBus> II1IIIIl1Il1 = new ArrayList<>();
   private final List<Serverhelper$EventTarget> IlIlllIl11ll1lI11l1IlI1lllI111 = new ArrayList<>();
   private final List<Serverhelper$II1Il11l111II11IIl> lI1I1lll1Il1l1IIlIl1IlI111llI1 = new ArrayList<>();
   private final Map<BlockPos, Boolean> llI1II1Illl11l1I1IIIII1 = new HashMap<>();
   private final Map<BlockPos, Boolean> l1Il1I111I11l11 = new HashMap<>();
   private static final long lI111lll11I11II = 1000L;
   private final Map<BlockPos, Long> lIl111IIIIllIlIIIlI = new HashMap<>();
   private final Map<BlockPos, Long> IIIIlll1lll1IlIlIl = new HashMap<>();
   public static final Serverhelper l1l1l111I1lI11Il = new Serverhelper();
   private final ModeSetting l1lll1III1IIIl11IIl1ll1I1IIl = new ModeSetting(
      "Server", "module.serverHelper.serverMode.desc", "Auto", "HolyWorld", "FunTime", "ReallyWorld"
   );
   private final BooleanSetting l1lIIIl1l1I1ll11III1II11 = new BooleanSetting(
      "module.serverHelper.consumablesSetting", "module.serverHelper.consumablesSetting.desc", true, () -> this.I1ll1lllI11l1l1I1l1() || this.III11I1lI1I()
   );
   private final BooleanSetting I11IIlIl1II111lIIIIlIIll = new BooleanSetting(
      "module.serverHelper.autoPointSetting", "module.serverHelper.autoPointSetting.desc", true, this::I1ll1lllI11l1l1I1l1
   );
   private final BindSetting lllIllIII1I11II1lIIll1IIlIll = new BindSetting(
      "module.serverHelper.shulkerKey", "module.serverHelper.shulkerKey.desc", -1, this::III11I1lI1I
   );
   private Slot l1IIl1IIl1lIlll = null;
   private final longHolder I1lII1IIIllI11IIIllIIlll1 = new longHolder();

   private Serverhelper() {
      this.initialize();
   }

   public boolean lI11IIIl111lI1IIII1lIIII() {
      return this.l1lll1III1IIIl11IIl1ll1I1IIl.ClearHeadersHandler(0)
         ? ZenithClient.getInstance().SupplierHolder().lI11IIIl111lI1IIII1lIIII()
         : this.l1lll1III1IIIl11IIl1ll1I1IIl.ClearHeadersHandler(3);
   }

   public boolean I1ll1lllI11l1l1I1l1() {
      return this.l1lll1III1IIIl11IIl1ll1I1IIl.ClearHeadersHandler(0)
         ? ZenithClient.getInstance().SupplierHolder().Ill1I11IIIlllIIllII1lIl()
         : this.l1lll1III1IIIl11IIl1ll1I1IIl.ClearHeadersHandler(2);
   }

   public boolean III11I1lI1I() {
      return this.l1lll1III1IIIl11IIl1ll1I1IIl.ClearHeadersHandler(0)
         ? ZenithClient.getInstance().SupplierHolder().III11I1lI1I()
         : this.l1lll1III1IIIl11IIl1ll1I1IIl.ClearHeadersHandler(1);
   }

   public void initialize() {
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.FIREWORK_STAR,
               new BindSetting("module.serverHelper.antiFly", "module.serverHelper.antiFly.desc", this::lI11IIIl111lI1IIII1lIIII),
               0.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.FLOWER_BANNER_PATTERN,
               new BindSetting("module.serverHelper.scrollExp", "module.serverHelper.scrollExp.desc", this::lI11IIIl111lI1IIII1lIIII),
               0.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.PRISMARINE_SHARD,
               new BindSetting("module.serverHelper.explosiveTrap", "module.serverHelper.explosiveTrap.desc", this::III11I1lI1I),
               5.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.POPPED_CHORUS_FRUIT,
               new BindSetting("module.serverHelper.normalTrap", "module.serverHelper.normalTrap.desc", this::III11I1lI1I),
               0.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.NETHER_STAR,
               new BindSetting("module.serverHelper.stun", "module.serverHelper.stun.desc", this::III11I1lI1I),
               30.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.FIRE_CHARGE,
               new BindSetting("module.serverHelper.explosiveThing", "module.serverHelper.explosiveThing.desc", this::III11I1lI1I),
               0.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.SNOWBALL,
               new BindSetting(
                  "module.serverHelper.snowball", "module.serverHelper.snowball.desc", () -> this.I1ll1lllI11l1l1I1l1() || this.III11I1lI1I()
               ),
               0.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.PHANTOM_MEMBRANE,
               new BindSetting("module.serverHelper.holyAura", "module.serverHelper.holyAura.desc", this::I1ll1lllI11l1l1I1l1),
               0.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.NETHERITE_SCRAP,
               new BindSetting("module.serverHelper.trap", "module.serverHelper.trap.desc", this::I1ll1lllI11l1l1I1l1),
               0.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.DRIED_KELP,
               new BindSetting("module.serverHelper.plast", "module.serverHelper.plast.desc", this::I1ll1lllI11l1l1I1l1),
               0.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.SUGAR,
               new BindSetting("module.serverHelper.clearDust", "module.serverHelper.clearDust.desc", this::I1ll1lllI11l1l1I1l1),
               10.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.FIRE_CHARGE,
               new BindSetting("module.serverHelper.fireTornado", "module.serverHelper.fireTornado.desc", this::I1ll1lllI11l1l1I1l1),
               10.0F,
               new booleanHolder_5()
            )
         );
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .add(
            new Serverhelper$II1Il11l111II11IIl(
               Items.ENDER_EYE,
               new BindSetting("module.serverHelper.disorient", "module.serverHelper.disorient.desc", this::I1ll1lllI11l1l1I1l1),
               10.0F,
               new booleanHolder_5()
            )
         );
   }

   @Override
   public List<Setting> getSettings() {
      ArrayList arraylist = new ArrayList<>(
         List.of(this.l1lll1III1IIIl11IIl1ll1I1IIl, this.l1lIIIl1l1I1ll11III1II11, this.I11IIlIl1II111lIIIIlIIll, this.lllIllIII1I11II1lIIll1IIlIll)
      );
      arraylist.addAll(this.lI1I1lll1Il1l1IIlIl1IlI111llI1.stream().map(Serverhelper$II1Il11l111II11IIl::II11l11I1111II1lIlIlll111Il).toList());
      return arraylist;
   }

   @EventTarget
   public void StringHolder_8(KeyEvent i111liliill1iii1iiii1) {
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .stream()
         .filter(
            i11iill1lli1li11il1illi1$ii1il11l111ii11iil -> i111liliill1iii1iiii1.StringHolder_5(
                     i11iill1lli1li11il1illi1$ii1il11l111ii11iil.IIIl1l1I111I1II1lllll111I1I.Elytramotion()
                  )
                  && i11iill1lli1li11il1illi1$ii1il11l111ii11iil.IIIl1l1I111I1II1lllll111I1I.isVisible()
                  && ListHolder_5.EventImpl_13(i11iill1lli1li11il1illi1$ii1il11l111ii11iil.Ill1lIIlII1llIl1lIlll1lI1) != null
         )
         .forEach(i11iill1lli1li11il1illi1$ii1il11l111ii11iil -> i11iill1lli1li11il1illi1$ii1il11l111ii11iil.Ill1IIIlIIIIllIlIIl.ZenithInternal023(true));
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .stream()
         .filter(
            i11iill1lli1li11il1illi1$ii1il11l111ii11iil -> i111liliill1iii1iiii1.longHolder_3(
                     i11iill1lli1li11il1illi1$ii1il11l111ii11iil.IIIl1l1I111I1II1lllll111I1I.Elytramotion()
                  )
                  && i11iill1lli1li11il1illi1$ii1il11l111ii11iil.IIIl1l1I111I1II1lllll111I1I.isVisible()
         )
         .forEach(i11iill1lli1li11il1illi1$ii1il11l111ii11iil -> {
            if (this.ZenithInternal044(i11iill1lli1li11il1illi1$ii1il11l111ii11iil.I1I1I1I11111llII11111IIlI1l1I)) {
               ListHolder_5.byteHolder_2(i11iill1lli1li11il1illi1$ii1il11l111ii11iil.Ill1lIIlII1llIl1lIlll1lI1);
            }

            i11iill1lli1li11il1illi1$ii1il11l111ii11iil.Ill1IIIlIIIIllIlIIl.ZenithInternal023(false);
         });
      if (i111liliill1iii1iiii1.longHolder_3(this.lllIllIII1I11II1lIIll1IIlIll.Elytramotion())) {
         Slot Slot = ListHolder_5.EventBus((Predicate<Slot>)(Slot -> {
            if (Slotx.getStack().getItem() instanceof BlockItem BlockItem && BlockItem.getBlock() instanceof ShulkerBoxBlock) {
               return true;
            }

            return false;
         }));
         if (Slot == null) {
            ZenithClient.getInstance()
               .ZenithInternal015()
               .StringHolder_8(
                  "M",
                  Text.of(
                     Text.of("Шалкер")
                        .copy()
                        .setStyle(
                           Style.EMPTY
                              .withColor(
                                 II1l111II1Il11II111llllIl1.NotificationsHolder()
                                    .IllIlIll11lIlI1()
                                    .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                                    .lllIlll1Ill111l111Il11II11lII()
                              )
                        )
                        .append(
                           Text.of("не найден")
                              .copy()
                              .setStyle(
                                 Style.EMPTY
                                    .withColor(
                                       II1l111II1Il11II111llllIl1.NotificationsHolder()
                                          .IllIlIll11lIlI1()
                                          .I1111IIl1ll1l111lIIl111lIl()
                                          .lllIlll1Ill111l111Il11II11lII()
                                    )
                              )
                        )
                  )
               );
            return;
         }

         this.l1IIl1IIl1lIlll = Slot;
         AtomicLongHolder$EventBus illlli1liiiil1i1lll111$l1i1illlili = new AtomicLongHolder$EventBus(Serverhelper.class);
         illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(
            EventImpl_16.class,
            illil11l111il11ili1il -> {
               if (!l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                  ListHolder_5.StringHolder_8(Slot, Hand.MAIN_HAND, false);
                  ListHolder_5.IIl1IlI1l11Il();
                  return true;
               } else {
                  return false;
               }
            }
         );
         illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(EventImpl_16.class, illil11l111il11ili1il -> true);
         illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(
            ZenithInternal111.class,
            lii11l11i1lil11ii11ii1il1lll -> {
               if (lii11l11i1lil11ii11ii1il1lll.Event()) {
                  return false;
               } else if (!l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                  ZenithInternal066.EventBus(Hand.MAIN_HAND);
                  lii11l11i1lil11ii11ii1il1lll.ZenithInternal069();
                  this.I1lII1IIIllI11IIIllIIlll1.reset();
                  return true;
               } else {
                  return false;
               }
            }
         );
         illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(
            EventImpl_16.class,
            illil11l111il11ili1il -> {
               if (!l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                  if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler) {
                     if (this.I1lII1IIIllI11IIIllIIlll1.HostnameVerifierImpl(1000L)) {
                        ListHolder_5.StringHolder_8(Slot, Hand.MAIN_HAND, true);
                        ListHolder_5.IIl1IlI1l11Il();
                        return true;
                     }
                  } else {
                     this.I1lII1IIIllI11IIIllIIlll1.longHolder_4(0L);
                  }

                  return false;
               } else {
                  return false;
               }
            }
         );
         illlli1liiiil1i1lll111$l1i1illlili.EventBus(PlayerInputHolder.class, ili11i1il11 -> {
            ili11i1il11.Creeperfarm();
            return true;
         });
         ZenithClient.getInstance().ModuleHolder().StringHolder_8(illlli1liiiil1i1lll111$l1i1illlili);
      }
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (this.l1lIIIl1l1I1ll11III1II11.Spider()) {
         if (ZenithClient.getInstance().SupplierHolder().Ill1I11IIIlllIIllII1lIl()
            && ii1l11il1i1i.Swinganimation() instanceof ChunkDeltaUpdateS2CPacket ChunkDeltaUpdateS2CPacket) {
            ChunkDeltaUpdateS2CPacket.visitUpdates((BlockPos, BlockState) -> this.II11IIl1Il1111lllI1.put(BlockPos.add(0, 0, 0), BlockState));
            ChunkDeltaUpdateS2CPacket.visitUpdates((BlockPos, BlockState) -> {
               net.minecraft.util.math.Vec3d Vec3dx = BlockPos.add(0, 0, 0).toCenterPos();
               if (this.II11IIl1Il1111lllI1.size() > 50 && this.II11IIl1Il1111lllI1.size() < 600) {
                  if (this.StringHolder_4(BlockPos.up(2))) {
                     this.StringHolder_8(Items.NETHERITE_SCRAP, Vec3dx, (double)(System.currentTimeMillis() + 15000L));
                  } else if (this.ByteBufferHolder_2(BlockPos.up(3))) {
                     this.StringHolder_8(Items.NETHERITE_SCRAP, Vec3dx, (double)(System.currentTimeMillis() + 30000L));
                  }
               }
            });
         }

         if (ii1l11il1i1i.Swinganimation() instanceof PlaySoundS2CPacket PlaySoundS2CPacket
            && ZenithClient.getInstance().SupplierHolder().III11I1lI1I()
            && PlaySoundS2CPacket.getSound().getKey().isPresent()
            && ((RegistryKey)PlaySoundS2CPacket.getSound().getKey().get()).getValue().getPath().equals("block.beacon.deactivate")) {
            this.StringHolder_8(
               Items.NETHER_STAR,
               new net.minecraft.util.math.Vec3d(PlaySoundS2CPacket.getX(), PlaySoundS2CPacket.getY(), PlaySoundS2CPacket.getZ()),
               (double)(System.currentTimeMillis() + 15000L)
            );
         }

         if (ZenithClient.getInstance().SupplierHolder().III11I1lI1I()
            && ii1l11il1i1i.Swinganimation() instanceof ParticleS2CPacket ParticleS2CPacket) {
            Class oclass = ((ParticleFactory)l11I1I1ll1Illll1I1l1111l1II.particleManager
                  .factories
                  .get(Registries.PARTICLE_TYPE.getRawId(ParticleS2CPacket.getParameters().getType())))
               .getClass();
            if (oclass == DynamicEntry4.class) {
               this.StringHolder_8(
                  Items.PRISMARINE_SHARD,
                  new net.minecraft.util.math.Vec3d(ParticleS2CPacket.getX(), ParticleS2CPacket.getY(), ParticleS2CPacket.getZ()),
                  (double)(System.currentTimeMillis() + 11000L)
               );
            }
         }
      }

      if (ii1l11il1i1i.Swinganimation() instanceof GameMessageS2CPacket GameMessageS2CPacket
         && this.I11IIlIl1II111lIIIIlIIll.Spider()
         && this.I11IIlIl1II111lIIIIlIIll.l1l1II1I1ll11l1IlI1lI11l1().get()) {
         Text Text = GameMessageS2CPacket.content();
         String s = Text.toString();
         String s1 = Text.getString();
         String s2 = StringUtils.substringBetween(s1, "|||   [", "]   ");
         if (s2 != null) {
            String s3 = StringUtils.substringBetween(s, "value='/gps ", "'");
            String s4 = StringUtils.substringBetween(s1, "Уровень лута: ", "\n ║");
            String s5 = StringUtils.substringBetween(s1, "Призван игроком: ", "\n ║");
            if (s3 != null) {
               String[] astring = s3.split(" ");
               net.minecraft.util.math.Vec3d Vec3d = BlockPos.ofFloored(
                     (double)Integer.parseInt(astring[0]), (double)Integer.parseInt(astring[1]), (double)Integer.parseInt(astring[2])
                  )
                  .toCenterPos();
               switch (s2) {
                  case "Мистический сундук":
                     this.StringHolder_8(s2, s4, s5, Vec3d, "overworld", 300, 0);
                     break;
                  case "Вулкан":
                     this.StringHolder_8(s2, s4, s5, Vec3d, "overworld", 300, 120);
                     break;
                  case "Метеоритный дождь":
                  case "Маяк убийца":
                  case "Мистический Алтарь":
                     this.StringHolder_8(s2, s4, s5, Vec3d, "overworld", 360, 0);
                     break;
                  case "Загадочный маяк":
                     this.StringHolder_8(s2, s4, s5, Vec3d, "overworld", 60, 180);
               }
            } else {
               switch (s2) {
                  case "Сундук смерти":
                     this.StringHolder_8(s2, s4, s5, BlockPos.ofFloored(-155.0, 64.0, 205.0).toCenterPos(), "lobby", 300, 0);
                     break;
                  case "Адская резня":
                     this.StringHolder_8(s2, s4, s5, BlockPos.ofFloored(48.0, 87.0, 73.0).toCenterPos(), "lobby", 180, 120);
               }
            }
         }
      }
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_34 ll1li1l111llllli1) {
      long i = System.currentTimeMillis();
      if (i % 5000L < 16L) {
         this.IIll1I111();
      }

      BlockPos BlockPos = l11I1I1ll1Illll1I1l1111l1II.player.getBlockPos();
      net.minecraft.util.math.Vec3d Vec3d = net.minecraft.util.math.Vec3d.ZERO;
      MatrixStack MatrixStack = ll1li1l111llllli1.Norender();
      this.lI1I1lll1Il1l1IIlIl1IlI111llI1
         .stream()
         .filter(i11iill1lli1li11il1illi1$ii1il11l111ii11iil -> i11iill1lli1li11il1illi1$ii1il11l111ii11iil.Ill1IIIlIIIIllIlIIl.isValue())
         .forEach(
            i11iill1lli1li11il1illi1$ii1il11l111ii11iil -> {
               String s = i11iill1lli1li11il1illi1$ii1il11l111ii11iil.IIIl1l1I111I1II1lllll111I1I.getName();
               switch (s) {
                  case "Трапка":
                  case "Обыч трапка":
                     this.StringHolder_8(
                        BlockPos,
                        Vec3d,
                        1.99F,
                        ZenithClient.getInstance()
                           .floatHolder_3()
                           .getClientColor(90)
                           .lllIlll1Ill111l111Il11II11lII()
                     );
                     break;
                  case "Дезорент":
                  case "Огненный смерч":
                  case "Явная пыль":
                     this.StringHolder_8(
                        MatrixStack, i11iill1lli1li11il1illi1$ii1il11l111ii11iil.I1I1I1I11111llII11111IIlI1l1I, PatternHolder.Ill11lllIIlI1111I
                     );
                     break;
                  case "Взрывная штука":
                     this.StringHolder_8(
                        MatrixStack,
                        5.0F,
                        ZenithClient.getInstance()
                           .floatHolder_3()
                           .getClientColor(90)
                           .lllIlll1Ill111l111Il11II11lII()
                     );
                     break;
                  case "Пласт":
                     float f = MathHelper.wrapDegrees(l11I1I1ll1Illll1I1l1111l1II.player.getYaw());
                     if (Math.abs(l11I1I1ll1Illll1I1l1111l1II.player.getPitch()) > 60.0F) {
                        BlockPos BlockPosx = BlockPos.up().offset(l11I1I1ll1Illll1I1l1111l1II.player.getFacing(), 3);
                        net.minecraft.util.math.Vec3d Vec3dx = net.minecraft.util.math.Vec3d.of(BlockPosx.east(3).south(3).down())
                           .add(Vec3d);
                        net.minecraft.util.math.Vec3d Vec3dxx = net.minecraft.util.math.Vec3d.of(BlockPosx.west(2).north(2).up())
                           .add(Vec3d);
                        ListHolder_2.StringHolder_8(
                           new net.minecraft.util.math.Box(Vec3dx, Vec3dxx),
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(90)
                              .lllIlll1Ill111l111Il11II11lII(),
                           3.0F,
                           true,
                           true,
                           true
                        );
                     } else if (f <= -157.5F || f >= 157.5F) {
                        BlockPos BlockPosx = BlockPos.north(3).up();
                        net.minecraft.util.math.Vec3d Vec3dx = net.minecraft.util.math.Vec3d.of(BlockPosx.down(2).east(3))
                           .add(Vec3d);
                        net.minecraft.util.math.Vec3d Vec3dxx = net.minecraft.util.math.Vec3d.of(BlockPosx.up(3).west(2).south(2))
                           .add(Vec3d);
                        ListHolder_2.StringHolder_8(
                           new net.minecraft.util.math.Box(Vec3dx, Vec3dxx),
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(90)
                              .lllIlll1Ill111l111Il11II11lII(),
                           3.0F,
                           true,
                           true,
                           true
                        );
                     } else if (f <= -112.5F) {
                        this.StringHolder_8(
                           BlockPos.east(5).south().down(),
                           Vec3d,
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(90)
                              .lllIlll1Ill111l111Il11II11lII(),
                           -1,
                           true
                        );
                     } else if (f <= -67.5F) {
                        BlockPos BlockPosx = BlockPos.east(2).up();
                        net.minecraft.util.math.Vec3d Vec3dx = net.minecraft.util.math.Vec3d.of(BlockPosx.down(2).south(3))
                           .add(Vec3d);
                        net.minecraft.util.math.Vec3d Vec3dxx = net.minecraft.util.math.Vec3d.of(BlockPosx.up(3).north(2).east(2))
                           .add(Vec3d);
                        ListHolder_2.StringHolder_8(
                           new net.minecraft.util.math.Box(Vec3dx, Vec3dxx),
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(90)
                              .lllIlll1Ill111l111Il11II11lII(),
                           3.0F,
                           true,
                           true,
                           true
                        );
                     } else if (f <= -22.5F) {
                        this.StringHolder_8(
                           BlockPos.east(5).down(),
                           Vec3d,
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(90)
                              .lllIlll1Ill111l111Il11II11lII(),
                           1,
                           false
                        );
                     } else if ((double)f >= -22.5 && (double)f <= 22.5) {
                        BlockPos BlockPosx = BlockPos.south(2).up();
                        net.minecraft.util.math.Vec3d Vec3dx = net.minecraft.util.math.Vec3d.of(BlockPosx.down(2).east(3))
                           .add(Vec3d);
                        net.minecraft.util.math.Vec3d Vec3dxx = net.minecraft.util.math.Vec3d.of(BlockPosx.up(3).west(2).south(2))
                           .add(Vec3d);
                        ListHolder_2.StringHolder_8(
                           new net.minecraft.util.math.Box(Vec3dx, Vec3dxx),
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(90)
                              .lllIlll1Ill111l111Il11II11lII(),
                           3.0F,
                           true,
                           true,
                           true
                        );
                     } else if (f <= 67.5F) {
                        this.StringHolder_8(
                           BlockPos.west(4).down(),
                           Vec3d,
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(90)
                              .lllIlll1Ill111l111Il11II11lII(),
                           1,
                           true
                        );
                     } else if (f <= 112.5F) {
                        BlockPos BlockPosx = BlockPos.west(3).up();
                        net.minecraft.util.math.Vec3d Vec3dx = net.minecraft.util.math.Vec3d.of(BlockPosx.down(2).south(3))
                           .add(Vec3d);
                        net.minecraft.util.math.Vec3d Vec3dxx = net.minecraft.util.math.Vec3d.of(BlockPosx.up(3).north(2).east(2))
                           .add(Vec3d);
                        ListHolder_2.StringHolder_8(
                           new net.minecraft.util.math.Box(Vec3dx, Vec3dxx),
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(90)
                              .lllIlll1Ill111l111Il11II11lII(),
                           3.0F,
                           true,
                           true,
                           true
                        );
                     } else if (f <= 157.5F) {
                        this.StringHolder_8(
                           BlockPos.west(4).south().down(),
                           Vec3d,
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(90)
                              .lllIlll1Ill111l111Il11II11lII(),
                           -1,
                           false
                        );
                     }
                     break;
                  case "Взрывная трапка":
                     this.StringHolder_8(BlockPos, Vec3d, 3.99F, PatternHolder.Ill11lllIIlI1111I);
                     break;
                  case "Стан":
                     this.StringHolder_8(BlockPos, Vec3d, 15.01F, PatternHolder.Ill11lllIIlI1111I);
                     break;
                  case "Снежок":
                     Predictions.l1l1IIIIl1IIllIIIlI.StringHolder_8(MatrixStack, List.of(Items.SNOWBALL.getDefaultStack()));
               }
            }
         );
      this.IlIlllIl11ll1lI11l1IlI1lllI111
         .forEach(
            i11iill1lli1li11il1illi1$illi1l1l1 -> {
               if (i11iill1lli1li11il1illi1$illi1l1l1.I1Il1l1l1I1I1lIlII1III1lIIl == Items.NETHER_STAR) {
                  this.StringHolder_8(
                     BlockPos.ofFloored(i11iill1lli1li11il1illi1$illi1l1l1.I11l1I1II),
                     Vec3d,
                     15.01F,
                     ZenithClient.getInstance()
                        .floatHolder_3()
                        .getClientColor(90)
                        .lllIlll1Ill111l111Il11II11lII()
                  );
               }
            }
         );
   }

   @EventTarget
   public void onDraw(EventImpl_5 i1iilll1lili11lll11l11li1l) {
      DrawContextImpl lliii11l1lllil = i1iilll1lili11lll11l11li1l.HitParticles();
      MatrixStack MatrixStack = lliii11l1lllil.getMatrices();
      this.IlIlllIl11ll1lI11l1IlI1lllI111
         .forEach(
            i11iill1lli1li11il1illi1$illi1l1l1 -> {
               double d0 = (i11iill1lli1li11il1illi1$illi1l1l1.IIl1l1llII1ll1I1 - (double)System.currentTimeMillis()) / 1000.0;
               net.minecraft.util.math.Vec3d Vec3d = ZenithInternal094.ListHolder_6(i11iill1lli1li11il1illi1$illi1l1l1.I11l1I1II);
               String s = doubleHolder_3.EventImpl_13(d0, 0.1F) + "с";
               Font font = Fonts.MEDIUM.getFont(10.0F);
               float f = font.width(s);
               float f1 = (float)(Vec3d.x - (double)(f / 2.0F));
               float f2 = (float)Vec3d.y;
               float f3 = 2.0F;
               if (ZenithInternal094.SecureRandomHolder_2(i11iill1lli1li11il1illi1$illi1l1l1.I11l1I1II)
                  && i11iill1lli1li11il1illi1$illi1l1l1.Ill1lI1IIIl1ll1IIlIlIll
                     == ZenithClient.getInstance().SupplierHolder().lIl1l1l11ll1lI1I1I()
                  && ZenithClient.getInstance()
                     .SupplierHolder()
                     .I1lllI1I1II11I()
                     .equals(i11iill1lli1li11il1illi1$illi1l1l1.I1I111IIl111Il1l11IlIl1lll1)) {
                  floatHolder_8.Event(
                     i1iilll1lili11lll11l11li1l.HitParticles().getMatrices(),
                     f1 - 4.0F,
                     f2 - 4.0F,
                     16.8F + font.width(s) + 8.0F,
                     20.8F,
                     22.0F,
                     floatHolder_5.StringHolder_30(4.0F),
                     ByteBufferHolder.ll1lIllll111I1lIIl1lIl
                  );
                  i1iilll1lili11lll11l11li1l.HitParticles()
                     .StringHolder_8(
                        f1 - 4.0F,
                        f2 - 4.0F,
                        16.8F + font.width(s) + 8.0F,
                        20.8F,
                        floatHolder_5.StringHolder_30(4.0F),
                        ZenithClient.getInstance()
                           .floatHolder_3()
                           .getCurrentStyle()
                           .getHudBackground()
                           .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                     );
                  floatHolder_8.EventBus(
                     i1iilll1lili11lll11l11li1l.HitParticles().getMatrices(),
                     f1 - 4.0F,
                     f2 - 4.0F,
                     16.8F + font.width(s) + 8.0F,
                     20.8F,
                     0.1F,
                     10.0F,
                     ZenithClient.getInstance()
                        .floatHolder_3()
                        .getCurrentStyle()
                        .getPrimaryColor()
                        .l1IllIl1l1llIlI11I11Il1l1l1lI1(),
                     floatHolder_5.StringHolder_30(4.0F)
                  );
                  i1iilll1lili11lll11l11li1l.HitParticles()
                     .StringHolder_8(
                        font,
                        s,
                        f1 + 12.8F + 4.0F,
                        f2 + 2.5F,
                        ZenithClient.getInstance()
                           .floatHolder_3()
                           .getCurrentStyle()
                           .getPrimaryColor()
                           .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                     );
                  i1iilll1lili11lll11l11li1l.HitParticles().getMatrices().push();
                  i1iilll1lili11lll11l11li1l.HitParticles().getMatrices().translate(f1, f2, 0.0F);
                  i1iilll1lili11lll11l11li1l.HitParticles().getMatrices().scale(0.8F, 0.8F, 1.0F);
                  i1iilll1lili11lll11l11li1l.HitParticles()
                     .StringHolder_8(i11iill1lli1li11il1illi1$illi1l1l1.I1Il1l1l1I1I1lIlII1III1lIIl.getDefaultStack(), 0, 0);
                  i1iilll1lili11lll11l11li1l.HitParticles().getMatrices().pop();
               }
            }
         );
      this.II1IIIIl1Il1
         .forEach(
            i11iill1lli1li11il1illi1$l1i1illlili -> {
               net.minecraft.util.math.Vec3d Vec3d = ZenithInternal094.ListHolder_6(i11iill1lli1li11il1illi1$l1i1illlili.l11I1IllI1II1II);
               double d0 = (i11iill1lli1li11il1illi1$l1i1illlili.l1IlI1lIlI11I1I1I - (double)System.currentTimeMillis()) / 1000.0;
               double d1 = (i11iill1lli1li11il1illi1$l1i1illlili.I11l11IIII - (double)System.currentTimeMillis()) / 1000.0;
               String s = " ["
                  + doubleHolder_3.EventImpl_13(
                     l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera.getPos().distanceTo(i11iill1lli1li11il1illi1$l1i1illlili.l11I1IllI1II1II), 0.1
                  )
                  + "m]";
               String s1 = d0 > 0.0
                  ? ("До начала: " + doubleHolder_3.EventImpl_13(d0, d0 < 30.0 ? 0.1F : 1.0) + "с").replace(".0", "")
                  : (d1 > 0.0 ? ("До конца: " + doubleHolder_3.EventImpl_13(d1, d1 < 30.0 ? 0.1F : 1.0) + "с").replace(".0", "") : "Конец ивента!");
               if (ZenithInternal094.SecureRandomHolder_2(i11iill1lli1li11il1illi1$l1i1illlili.l11I1IllI1II1II)
                  && i11iill1lli1li11il1illi1$l1i1illlili.ll1I11ll1l11l11IlI1l1I
                     == ZenithClient.getInstance().SupplierHolder().lIl1l1l11ll1lI1I1I()
                  && ZenithClient.getInstance()
                     .SupplierHolder()
                     .I1lllI1I1II11I()
                     .equals(i11iill1lli1li11il1illi1$l1i1illlili.lIl1111Il1I1lIl1IIIIl1IlIIII)) {
                  ArrayList arraylist = new ArrayList<>(Collections.singletonList(i11iill1lli1li11il1illi1$l1i1illlili.lI1ll1Ill1111I11 + s));
                  if (i11iill1lli1li11il1illi1$l1i1illlili.lI111II1Il11l1IIIllI11I1lll11 != null) {
                     arraylist.add("Призван: " + Formatting.GOLD + i11iill1lli1li11il1illi1$l1i1illlili.lI111II1Il11l1IIIllI11I1lll11);
                  }

                  arraylist.add(s1);
                  if (i11iill1lli1li11il1illi1$l1i1illlili.lIlIl1111lI1I11llIl1 != null) {
                     arraylist.add(i11iill1lli1li11il1illi1$l1i1illlili.lIlIl1111lI1I11llIl1);
                  }
               }
            }
         );
      this.IlIlllIl11ll1lI11l1IlI1lllI111
         .removeIf(i11iill1lli1li11il1illi1$illi1l1l1 -> i11iill1lli1li11il1illi1$illi1l1l1.IIl1l1llII1ll1I1 - (double)System.currentTimeMillis() <= 0.0);
      this.II1IIIIl1Il1
         .removeIf(
            i11iill1lli1li11il1illi1$l1i1illlili -> i11iill1lli1li11il1illi1$l1i1illlili.I11l11IIII + 90000.0 - (double)System.currentTimeMillis() <= 0.0
         );
   }

   private void StringHolder_8(BlockPos BlockPos, net.minecraft.util.math.Vec3d Vec3d, float f, int i) {
      net.minecraft.util.math.Box Box = new net.minecraft.util.math.Box(BlockPos.up())
         .offset(Vec3d)
         .contract(0.0, 0.2F, 0.0)
         .expand((double)f);
      boolean flag = l11I1I1ll1Illll1I1l1111l1II.world
         .getPlayers()
         .stream()
         .anyMatch(
            AbstractClientPlayerEntity -> AbstractClientPlayerEntity != l11I1I1ll1Illll1I1l1111l1II.player
                  && Box.intersects(AbstractClientPlayerEntity.getBoundingBox())
                  && !ZenithClient.getInstance()
                     .StringHolder_26()
                     .StringHolder_15(AbstractClientPlayerEntity.getGameProfile().getName())
         );
      ListHolder_2.StringHolder_8(
         Box,
         flag
            ? ZenithClient.getInstance()
               .floatHolder_3()
               .getCurrentStyle()
               .getPrimaryColor()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .lllIlll1Ill111l111Il11II11lII()
            : i,
         3.0F,
         true,
         true,
         true
      );
   }

   private void StringHolder_8(MatrixStack MatrixStack, float f, int i) {
      float f1 = l11I1I1ll1Illll1I1l1111l1II.player.getWidth() / 2.0F;
      int j = this.ZenithInternal044(f)
         ? ZenithClient.getInstance()
            .floatHolder_3()
            .getCurrentStyle()
            .getPrimaryColor()
            .l1IllIl1l1llIlI11I11Il1l1l1lI1()
            .lllIlll1Ill111l111Il11II11lII()
         : i;
      net.minecraft.util.math.Vec3d Vec3dxxxx = doubleHolder_3.ZenithInternal021(l11I1I1ll1Illll1I1l1111l1II.player).add((double)f1, 0.02, (double)f1);
      net.minecraft.util.math.Vec3d Vec3dx = Vec3dxxxx.subtract(l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera.getPos());
      GL11.glEnable(2881);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.disableCull();
      RenderSystem.blendFunc(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE_MINUS_CONSTANT_ALPHA);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.TRIANGLE_STRIP, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
      int k = 0;

      for (byte b0 = 90; k <= b0; k++) {
         net.minecraft.util.math.Vec3d Vec3dxx = doubleHolder_3.StringHolder_8((float)k, (float)b0, (double)f);
         net.minecraft.util.math.Vec3d Vec3dxxx = doubleHolder_3.StringHolder_8((float)(k + 1), (float)b0, (double)f);
         ListHolder_2.StringHolder_8(
            MatrixStack,
            BufferBuilder,
            Vec3dx.add(Vec3dxx),
            Vec3dx.add(Vec3dxx.x, Vec3dxx.y + 2.0, Vec3dxx.z),
            PatternHolder.EventBus(j, 0.2F),
            PatternHolder.EventBus(j, 0.0F)
         );
         ListHolder_2.StringHolder_8(Vec3dxxxx.add(Vec3dxx), Vec3dxxxx.add(Vec3dxxx), j, 2.0F, true);
      }

      k = 0;

      for (byte b1 = 90; k <= b1; k++) {
         net.minecraft.util.math.Vec3d Vec3dxx = doubleHolder_3.StringHolder_8((float)k, (float)b1, (double)f);
         ListHolder_2.StringHolder_8(
            MatrixStack,
            BufferBuilder,
            Vec3dx.add(Vec3dxx),
            Vec3dx.add(Vec3dxx.x, Vec3dxx.y - 2.0, Vec3dxx.z),
            PatternHolder.EventBus(j, 0.2F),
            PatternHolder.EventBus(j, 0.0F)
         );
      }

      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      GL11.glDisable(2881);
   }

   private void StringHolder_8(MatrixStack MatrixStack, Font font, List<String> list, net.minecraft.util.math.Vec3d Vec3d) {
      float f = 0.0F;

      for (int i = 0; i < list.size(); i++) {
         String s = (String)list.get(i);
         float f1 = font.width(s);
         float f2 = (float)(Vec3d.x - (double)(f1 / 2.0F));
         f += 10.0F;
      }
   }

   public void StringHolder_8(BlockPos BlockPos, net.minecraft.util.math.Vec3d Vec3d, int i, int j, boolean flag) {
      net.minecraft.util.math.Vec3d Vec3dx = net.minecraft.util.math.Vec3d.of(BlockPos).add(Vec3dx);
      float f = 2.0F;
      int k = PatternHolder.EventBus(i, 0.15F);
      this.StringHolder_8(Vec3dx, i, f, j, flag);
      this.StringHolder_8(Vec3dx, i, f, j, flag);
      this.EventBus(Vec3dx, i, f, j, flag);
      this.StringHolder_8(Vec3dx, k, j, flag);
      this.StringHolder_8(Vec3dx, k, j, flag);
      this.EventBus(Vec3dx, k, j, flag);
   }

   private void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, int i, float f, int j, boolean flag) {
      float f1 = flag ? (float)j : (float)(-j);
      net.minecraft.util.math.Vec3d Vec3dx;
      ListHolder_2.StringHolder_8(Vec3dxxxx, Vec3dx = Vec3dxxxx.add((double)f1, 0.0, 0.0), i, f, true);

      for (int k = 0; k < 4; k++) {
         net.minecraft.util.math.Vec3d Vec3dxx;
         ListHolder_2.StringHolder_8(Vec3dx, Vec3dxx = Vec3dx.add(0.0, 0.0, (double)j), i, f, true);
         ListHolder_2.StringHolder_8(Vec3dxx, Vec3dx = Vec3dxx.add((double)f1, 0.0, 0.0), i, f, true);
      }

      net.minecraft.util.math.Vec3d Vec3dxx;
      ListHolder_2.StringHolder_8(Vec3dx, Vec3dxx = Vec3dx.add(0.0, 0.0, (double)j), i, f, true);
      ListHolder_2.StringHolder_8(Vec3dxx, Vec3dx = Vec3dxx.add((double)(f1 * -2.0F), 0.0, 0.0), i, f, true);

      for (int l = 0; l < 3; l++) {
         net.minecraft.util.math.Vec3d Vec3dxxx;
         ListHolder_2.StringHolder_8(Vec3dx, Vec3dxxx = Vec3dx.add(0.0, 0.0, (double)(j * -1)), i, f, true);
         ListHolder_2.StringHolder_8(Vec3dxxx, Vec3dx = Vec3dxxx.add((double)(f1 * -1.0F), 0.0, 0.0), i, f, true);
      }

      ListHolder_2.StringHolder_8(Vec3dx, Vec3dx.add(0.0, 0.0, (double)(j * -2)), i, f, true);
   }

   private void EventBus(net.minecraft.util.math.Vec3d Vec3d, int i, float f, int j, boolean flag) {
      float f1 = flag ? (float)j : (float)(-j);
      ListHolder_2.StringHolder_8(Vec3dxx, Vec3dxx.add(0.0, 5.0, 0.0), i, f, true);
      net.minecraft.util.math.Vec3d Vec3dx;
      ListHolder_2.StringHolder_8(
         Vec3dx = Vec3dxx.add((double)f1, 0.0, 0.0), Vec3dx.add(0.0, 5.0, 0.0), i, f, true
      );

      for (int k = 0; k < 4; k++) {
         ListHolder_2.StringHolder_8(
            Vec3dx = Vec3dx.add((double)f1, 0.0, (double)j), Vec3dx.add(0.0, 5.0, 0.0), i, f, true
         );
      }

      ListHolder_2.StringHolder_8(
         Vec3dxx = Vec3dx.add(0.0, 0.0, (double)j), Vec3dxx.add(0.0, 5.0, 0.0), i, f, true
      );
      net.minecraft.util.math.Vec3d Vec3dxx;
      ListHolder_2.StringHolder_8(
         Vec3dxx = Vec3dxx.add((double)(f1 * -2.0F), 0.0, 0.0), Vec3dxx.add(0.0, 5.0, 0.0), i, f, true
      );

      for (int l = 0; l < 3; l++) {
         ListHolder_2.StringHolder_8(
            Vec3dxx = Vec3dxx.add((double)(f1 * -1.0F), 0.0, (double)(j * -1)), Vec3dxx.add(0.0, 5.0, 0.0), i, f, true
         );
      }
   }

   private void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, int i, int j, boolean flag) {
      Vec3dx = Vec3dx.add(0.0, 0.001, 0.0);
      float f = flag ? (float)j : (float)(-j);
      ListHolder_2.StringHolder_8(
         Vec3dx,
         Vec3dx.add((double)f, 0.0, 0.0),
         Vec3dx.add((double)f, 0.0, (double)(j * 2)),
         Vec3dx.add(0.0, 0.0, (double)(j * 2)),
         i,
         true
      );

      for (int k = 0; k < 3; k++) {
         ListHolder_2.StringHolder_8(
            Vec3dx = Vec3dx.add((double)f, 0.0, (double)j),
            Vec3dx.add((double)f, 0.0, 0.0),
            Vec3dx.add((double)f, 0.0, (double)(j * 2)),
            Vec3dx.add(0.0, 0.0, (double)(j * 2)),
            i,
            true
         );
      }

      net.minecraft.util.math.Vec3d Vec3dx;
      ListHolder_2.StringHolder_8(
         Vec3dx = Vec3dx.add((double)f, 0.0, (double)j),
         Vec3dx.add((double)f, 0.0, 0.0),
         Vec3dx.add((double)f, 0.0, (double)j),
         Vec3dx.add(0.0, 0.0, (double)j),
         i,
         true
      );
   }

   private void EventBus(net.minecraft.util.math.Vec3d Vec3d, int i, int j, boolean flag) {
      float f = flag ? (float)j : (float)(-j);
      ListHolder_2.StringHolder_8(
         Vec3dxxxx,
         Vec3dxxxx.add((double)f, 0.0, 0.0),
         Vec3dxxxx.add((double)f, 5.0, 0.0),
         Vec3dxxxx.add(0.0, 5.0, 0.0),
         i,
         true
      );

      for (int k = 0; k < 4; k++) {
         net.minecraft.util.math.Vec3d Vec3dx;
         ListHolder_2.StringHolder_8(
            Vec3dx = Vec3dxxxx.add((double)f, 0.0, 0.0),
            Vec3dx.add(0.0, 0.0, (double)j),
            Vec3dx.add(0.0, 5.0, (double)j),
            Vec3dx.add(0.0, 5.0, 0.0),
            i,
            true
         );
         ListHolder_2.StringHolder_8(
            Vec3dxxxx = Vec3dx.add(0.0, 0.0, (double)j),
            Vec3dxxxx.add((double)f, 0.0, 0.0),
            Vec3dxxxx.add((double)f, 5.0, 0.0),
            Vec3dxxxx.add(0.0, 5.0, 0.0),
            i,
            true
         );
      }

      net.minecraft.util.math.Vec3d Vec3dx;
      ListHolder_2.StringHolder_8(
         Vec3dx = Vec3dxxxx.add((double)f, 0.0, 0.0),
         Vec3dx.add(0.0, 0.0, (double)j),
         Vec3dx.add(0.0, 5.0, (double)j),
         Vec3dx.add(0.0, 5.0, 0.0),
         i,
         true
      );
      ListHolder_2.StringHolder_8(
         Vec3dxxxx = Vec3dx.add(0.0, 0.0, (double)j),
         Vec3dxxxx.add((double)(f * -2.0F), 0.0, 0.0),
         Vec3dxxxx.add((double)(f * -2.0F), 5.0, 0.0),
         Vec3dxxxx.add(0.0, 5.0, 0.0),
         i,
         true
      );
      Vec3dxxxx = Vec3dxxxx.add((double)(f * -1.0F), 0.0, 0.0);

      for (int l = 0; l < 3; l++) {
         net.minecraft.util.math.Vec3d Vec3dxx;
         ListHolder_2.StringHolder_8(
            Vec3dxx = Vec3dxxxx.add((double)(f * -1.0F), 0.0, 0.0),
            Vec3dxx.add(0.0, 0.0, (double)(j * -1)),
            Vec3dxx.add(0.0, 5.0, (double)(j * -1)),
            Vec3dxx.add(0.0, 5.0, 0.0),
            i,
            true
         );
         ListHolder_2.StringHolder_8(
            Vec3dxxxx = Vec3dxx.add(0.0, 0.0, (double)(j * -1)),
            Vec3dxxxx.add((double)(f * -1.0F), 0.0, 0.0),
            Vec3dxxxx.add((double)(f * -1.0F), 5.0, 0.0),
            Vec3dxxxx.add(0.0, 5.0, 0.0),
            i,
            true
         );
      }

      net.minecraft.util.math.Vec3d Vec3dxx;
      ListHolder_2.StringHolder_8(
         Vec3dxx = Vec3dxxxx.add((double)(f * -1.0F), 0.0, 0.0),
         Vec3dxx.add(0.0, 0.0, (double)(j * -2)),
         Vec3dxx.add(0.0, 5.0, (double)(j * -2)),
         Vec3dxx.add(0.0, 5.0, 0.0),
         i,
         true
      );
   }

   private void StringHolder_8(String s, String s1, String s2, net.minecraft.util.math.Vec3d Vec3d, String s3, int i, int j) {
      if (this.II1IIIIl1Il1.stream().noneMatch(i11iill1lli1li11il1illi1$l1i1illlili -> i11iill1lli1li11il1illi1$l1i1illlili.l11I1IllI1II1II.equals(Vec3d))) {
         long k = System.currentTimeMillis() + (long)i * 1000L;
         long l = k + (long)j * 1000L;
         this.II1IIIIl1Il1
            .add(
               new Serverhelper$EventBus(
                  s,
                  s1,
                  s2,
                  Vec3d,
                  s3,
                  ZenithClient.getInstance().SupplierHolder().lIl1l1l11ll1lI1I1I(),
                  (double)k,
                  (double)l
               )
            );
      }
   }

   private void StringHolder_8(Item Item, net.minecraft.util.math.Vec3d Vec3d, double d0) {
      if (this.IlIlllIl11ll1lI11l1IlI1lllI111
         .stream()
         .noneMatch(i11iill1lli1li11il1illi1$illi1l1l1 -> i11iill1lli1li11il1illi1$illi1l1l1.I11l1I1II.equals(Vec3d))) {
         this.IlIlllIl11ll1lI11l1IlI1lllI111
            .add(
               new Serverhelper$EventTarget(
                  Item,
                  Vec3d,
                  ZenithClient.getInstance().SupplierHolder().I1lllI1I1II11I(),
                  ZenithClient.getInstance().SupplierHolder().lIl1l1l11ll1lI1I1I(),
                  d0
               )
            );
      }
   }

   private Vector4f StringHolder_8(Font font, List<String> list, int i, float f) {
      if (i == 0) {
         float f4 = font.width((String)list.get(i + 1));
         return f4 >= f ? new Vector4f(2.0F, 0.0F, 2.0F, 0.0F) : new Vector4f(2.0F);
      } else if (i == list.size() - 1) {
         float f3 = font.width((String)list.get(i - 1));
         return f3 >= f ? new Vector4f(0.0F, 2.0F, 0.0F, 2.0F) : new Vector4f(2.0F);
      } else {
         float f1 = font.width((String)list.get(i - 1));
         float f2 = font.width((String)list.get(i + 1));
         return f1 >= f ? (f2 >= f ? new Vector4f() : new Vector4f(0.0F, 2.0F, 0.0F, 2.0F)) : new Vector4f(2.0F);
      }
   }

   private boolean ZenithInternal044(float f) {
      return f == 0.0F
         || l11I1I1ll1Illll1I1l1111l1II.world
            .getPlayers()
            .stream()
            .anyMatch(
               AbstractClientPlayerEntity -> AbstractClientPlayerEntity != l11I1I1ll1Illll1I1l1111l1II.player
                     && !ZenithClient.getInstance()
                        .StringHolder_26()
                        .StringHolder_15(AbstractClientPlayerEntity.getGameProfile().getName())
                     && l11I1I1ll1Illll1I1l1111l1II.player.distanceTo(AbstractClientPlayerEntity) <= f
            );
   }

   private boolean StringHolder_4(BlockPos BlockPos) {
      long i = System.currentTimeMillis();
      if (this.lIl111IIIIllIlIIIlI.containsKey(BlockPos) && i - this.lIl111IIIIllIlIIIlI.get(BlockPos) < 1000L) {
         return this.llI1II1Illl11l1I1IIIII1.get(BlockPos);
      } else {
         boolean flag = this.ZenithInternal128(BlockPos);
         this.llI1II1Illl11l1I1IIIII1.put(BlockPos, flag);
         this.lIl111IIIIllIlIIIlI.put(BlockPos, i);
         return flag;
      }
   }

   private boolean ZenithInternal128(BlockPos BlockPos) {
      int i = 0;

      for (BlockPos BlockPosx : ZenithInternal066.StringHolder_8(BlockPosx, 2.0F)) {
         if (doubleHolder_3.byteHolder_2(BlockPosx.toCenterPos(), BlockPosx.toCenterPos()) < 2.0) {
            BlockState BlockStatex = this.II11IIl1Il1111lllI1.get(BlockPosx);
            if (BlockStatex != null && !BlockStatex.isAir()) {
               i++;
            }
         } else if (!BlockPosx.equals(BlockPosx.up(2).north().east())
            && !BlockPosx.equals(BlockPosx.up(2).north().west())
            && !BlockPosx.equals(BlockPosx.up(2).south().east())
            && !BlockPosx.equals(BlockPosx.up(2).south().west())) {
            BlockState BlockState = this.II11IIl1Il1111lllI1.get(BlockPosx);
            if (BlockState == null || BlockState.isAir()) {
               i++;
            }
         }

         if (i > 1) {
            return false;
         }
      }

      return true;
   }

   private boolean ByteBufferHolder_2(BlockPos BlockPos) {
      long i = System.currentTimeMillis();
      if (this.IIIIlll1lll1IlIlIl.containsKey(BlockPos) && i - this.IIIIlll1lll1IlIlIl.get(BlockPos) < 1000L) {
         return this.l1Il1I111I11l11.get(BlockPos);
      } else {
         boolean flag = this.ConnectThread(BlockPos);
         this.l1Il1I111I11l11.put(BlockPos, flag);
         this.IIIIlll1lll1IlIlIl.put(BlockPos, i);
         return flag;
      }
   }

   private boolean ConnectThread(BlockPos BlockPos) {
      int i = 0;

      for (BlockPos BlockPosx : ZenithInternal066.StringHolder_8(BlockPosx, 3.0F)) {
         if (Math.abs(BlockPosx.getX() - BlockPosx.getX()) <= 2
            && Math.abs(BlockPosx.getY() - BlockPosx.getY()) <= 2
            && Math.abs(BlockPosx.getZ() - BlockPosx.getZ()) <= 2) {
            BlockState BlockState = this.II11IIl1Il1111lllI1.get(BlockPosx);
            if (BlockState != null && !BlockState.isAir()) {
               i++;
            }
         } else if (!BlockPosx.equals(BlockPosx.up(3))) {
            BlockState BlockStatex = this.II11IIl1Il1111lllI1.get(BlockPosx);
            if (BlockStatex == null || BlockStatex.isAir()) {
               i++;
            }
         }

         if (i > 1) {
            return false;
         }
      }

      return true;
   }

   private static boolean StringHolder_8(BlockState BlockState) {
      return BlockState != null && !BlockState.isAir();
   }

   private void IIll1I111() {
      long i = System.currentTimeMillis();
      this.lIl111IIIIllIlIIIlI.entrySet().removeIf(entry -> i - entry.getValue() > 1000L);
      this.llI1II1Illl11l1I1IIIII1.entrySet().removeIf(entry -> !this.lIl111IIIIllIlIIIlI.containsKey(entry.getKey()));
      this.IIIIlll1lll1IlIlIl.entrySet().removeIf(entry -> i - entry.getValue() > 1000L);
      this.l1Il1I111I11l11.entrySet().removeIf(entry -> !this.IIIIlll1lll1IlIlIl.containsKey(entry.getKey()));
      if (this.llI1II1Illl11l1I1IIIII1.size() > 1000) {
         this.llI1II1Illl11l1I1IIIII1.clear();
         this.lIl111IIIIllIlIIIlI.clear();
      }

      if (this.l1Il1I111I11l11.size() > 1000) {
         this.l1Il1I111I11l11.clear();
         this.IIIIlll1lll1IlIlIl.clear();
      }
   }

   private boolean StringHolder_8(BlockPos BlockPos, byte[][][] abyte, int i, int j) {
      int k = 0;
      TimerCallbackSerializer9 TimerCallbackSerializer9 = new TimerCallbackSerializer9();

      for (int l = -i; l <= i; l++) {
         for (int i1 = -i; i1 <= i; i1++) {
            for (int j1 = -i; j1 <= i; j1++) {
               byte b0 = abyte[l + i][i1 + i][j1 + i];
               if (b0 != -1) {
                  TimerCallbackSerializer9.set(BlockPos.getX() + j1, BlockPos.getY() + l, BlockPos.getZ() + i1);
                  BlockState BlockState = this.II11IIl1Il1111lllI1.get(TimerCallbackSerializer9);
                  boolean flag = StringHolder_8(BlockState);
                  if (b0 == 1 && !flag || b0 == 0 && flag) {
                     if (++k > j) {
                        return false;
                     }
                  }
               }
            }
         }
      }

      return true;
   }

   public List<Serverhelper$II1Il11l111II11IIl> I1II1l1IIl1I1lIIIlIIl1I1III() {
      return Collections.unmodifiableList(this.lI1I1lll1Il1l1IIlIl1IlI111llI1);
   }

   public BindSetting llI11I1IlIl1I1l1l1ll1lIlI() {
      return this.lllIllIII1I11II1lIIll1IIlIll;
   }

   public Slot ll1lIIIIIl1() {
      return ListHolder_5.EventBus((Predicate<Slot>)(Slot -> {
         if (Slot.getStack().getItem() instanceof BlockItem BlockItem && BlockItem.getBlock() instanceof ShulkerBoxBlock) {
            return true;
         }

         return false;
      }));
   }
}
