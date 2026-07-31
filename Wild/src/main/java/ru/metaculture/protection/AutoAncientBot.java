package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.Settings;
import baritone.api.pathing.goals.GoalNear;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.option.Perspective;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@ModuleRegister(
   O00000000 = "AutoAncientBot",
   O000000000 = "Автоматический фарм древних обломков через ТНТ",
   O0000000000 = Category.Misc
)
public class AutoAncientBot extends Module {
   private final BooleanSetting O000000000O = new BooleanSetting("Логи в чат", true);
   private final BooleanSetting O000000000O0 = new BooleanSetting("Пёрки", true);
   private final NumberSetting O000000000O00 = new NumberSetting("Мин. дистанция пёрки", 16.0F, 8.0F, 48.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O0.O0000000000());
   private final BooleanSetting O000000000O000 = new BooleanSetting("Debug", false);
   private static final int O000000000O00O = 26;
   private static final int O000000000O0O = 6;
   private static final int O000000000O0O0 = 2;
   private static final int O000000000O0OO = 36;
   private static final int O000000000OO = 36;
   private static final int O000000000OO0 = 18000;
   private static final int O000000000OO00 = 2500;
   private static final int O000000000OO0O = 2500;
   private static final int O000000000OOO = 16;
   private static final int O000000000OOO0 = 19;
   private static final int O000000000OOOO = 7000;
   private static final int O00000000O = 300;
   private static final int O00000000O0 = 3500;
   private static final int O00000000O00 = 2;
   private static final int O00000000O000 = 22000;
   private static final int O00000000O0000 = 2;
   private static final double O00000000O000O = 4.2;
   private static final float O00000000O00O = 4.0F;
   private static final float O00000000O00O0 = 140.0F;
   private static final float O00000000O00OO = 34.0F;
   private static final float O00000000O0O = 1.35F;
   private static final long O00000000O0O0 = 90L;
   private static final long O00000000O0O00 = 3000L;
   private static final long O00000000O0O0O = 9000L;
   private static final int O00000000O0OO = 2;
   private static final int O00000000O0OO0 = 4;
   private static final int O00000000O0OOO = 900;
   private static final int O00000000OO = 900;
   private static final int O00000000OO0 = 1400;
   private static final int O00000000OO00 = 8000;
   private static final int O00000000OO000 = 1400;
   private static final double O00000000OO00O = 9.0;
   private static final int O00000000OO0O = 2500;
   private static final int O00000000OO0O0 = 3;
   private static final double O00000000OO0OO = 0.03;
   private static final double O00000000OOO = 0.99;
   private static final double O00000000OOO0 = 1.5;
   private static final int O00000000OOO00 = 160;
   private static final double O00000000OOO0O = 1.8;
   private static final double O00000000OOOO = 27.0;
   private static final int O00000000OOOO0 = 2500;
   private static final int O00000000OOOOO = 1200;
   private static final int O0000000O = 2000;
   private static final int O0000000O0 = 5000;
   private static final double O0000000O00 = 25.0;
   private static final int O0000000O000 = 3500;
   private static final float O0000000O0000 = 8.0F;
   private AutoAncientBot.W55 O0000000O00000 = AutoAncientBot.W55.SEARCHING;
   private AutoAncientBot.W53 O0000000O0000O = AutoAncientBot.W53.APPROACHING;
   private final O0000O00O0000 O0000000O000O = new O0000O00O0000();
   private final O0000O00O0000 O0000000O000O0 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O000OO = new O0000O00O0000();
   private final O0000O00O0000 O0000000O00O = new O0000O00O0000();
   private final O0000O00O0000 O0000000O00O0 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O00O00 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O00O0O = new O0000O00O0000();
   private final O0000O00O0000 O0000000O00OO = new O0000O00O0000();
   private final O0000O00O0000 O0000000O00OO0 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O00OOO = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0O = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0O0 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0O00 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0O000 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0O00O = new O0000O00O0000();
   private final Set<BlockPos> O0000000O0O0O = new HashSet<>();
   private final Set<BlockPos> O0000000O0O0O0 = new HashSet<>();
   private final Map<BlockPos, Boolean> O0000000O0O0OO = new HashMap<>();
   private BlockPos O0000000O0OO;
   private BlockPos O0000000O0OO0;
   private BlockPos O0000000O0OO00;
   private BlockPos O0000000O0OO0O;
   private BlockPos O0000000O0OOO;
   private BlockPos O0000000O0OOO0;
   private BlockPos O0000000O0OOOO;
   private BlockPos O0000000OO;
   private boolean O0000000OO0;
   private boolean O0000000OO00;
   private boolean O0000000OO000;
   private boolean O0000000OO0000;
   private boolean O0000000OO000O;
   private boolean O0000000OO00O;
   private boolean O0000000OO00O0;
   private List<Block> O0000000OO00OO = List.of();
   private List<Item> O0000000OO0O = List.of();
   private double O0000000OO0O0;
   private int O0000000OO0O00;
   private int O0000000OO0O0O;
   private int O0000000OO0OO;
   private int O0000000OO0OO0;
   private BlockPos O0000000OO0OOO;
   private int O0000000OOO = -1;
   private int O0000000OOO0 = -1;
   private int O0000000OOO00 = -1;
   private int O0000000OOO000 = -1;
   private boolean O0000000OOO00O;
   private boolean O0000000OOO0O;
   private boolean O0000000OOO0O0;
   private boolean O0000000OOO0OO;
   private boolean O0000000OOOO;
   private boolean O0000000OOOO0;
   private boolean O0000000OOOO00;
   private Vec3d O0000000OOOO0O;
   private AutoAncientBot.W54 O0000000OOOOO = AutoAncientBot.W54.IDLE;
   private Vec3d O0000000OOOOO0;
   private Vec3d O0000000OOOOOO;
   private String O000000O0;
   private float O000000O00;
   private float O000000O000;
   private int O000000O0000 = -1;
   private int O000000O00000;
   private Vec3d O000000O000000;
   private boolean O000000O00000O;
   private int O000000O0000O;
   private int O000000O0000O0;
   private int O000000O0000OO;
   private int O000000O000O;
   private int O000000O000O0;
   private long O000000O000O00;

   public AutoAncientBot() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000});
   }

   @Override
   public void O00000000() {
      if (O0000000000.player != null && O0000000000.world != null) {
         AttackAura var1 = WildClient.O00000000.O000000000.O00000000(AttackAura.class);
         if (var1 != null && var1.O0000000000000) {
            ChatUtil.O00000000("[AutoAncient] Disable HitAura first.");
            this.a_();
         } else if (this.O00000000(Blocks.TNT.asItem()) != -1 && this.O00000000(Items.FLINT_AND_STEEL) != -1) {
            super.O00000000();
            if (O0000000000.options != null) {
               O0000000000.options.setPerspective(Perspective.FIRST_PERSON);
            }

            AncientXray var2 = this.O000000000O0O();
            if (var2 != null) {
               var2.O0000000000O00();
            }

            this.O000000000OO0();
            this.O0000000O0O0O.clear();
            this.O0000000O0O0O0.clear();
            this.O0000000O0O0OO.clear();
            this.O0000000O0OOO0 = null;
            this.O0000000O0OOOO = null;
            this.O0000000OO = null;
            this.O0000000O0OO = null;
            this.O0000000O0OO0 = null;
            this.O0000000O0OO00 = null;
            this.O0000000O0OO0O = null;
            this.O0000000O0OOO = null;
            this.O0000000OO0 = false;
            this.O0000000OO0O00 = 0;
            this.O0000000OOO = -1;
            this.O0000000OOO0 = -1;
            this.O0000000OOO00 = -1;
            this.O0000000OOO000 = -1;
            this.O0000000O0000O = AutoAncientBot.W53.APPROACHING;
            this.O0000000OOO0OO = false;
            this.O0000000OOOO0O = null;
            this.O0000000O00O0O.O00000000();
            this.O0000000O00OO.O00000000();
            this.O0000000O00OO0.O00000000();
            this.O0000000O00OOO.O00000000();
            this.O0000000O0O.O00000000();
            this.O0000000OOO00O = false;
            this.O0000000OOO0O = false;
            this.O0000000OOO0O0 = false;
            this.O0000000OOOO = false;
            this.O0000000OOOO0 = false;
            this.O0000000OOOO00 = false;
            this.O0000000OO00 = false;
            this.O0000000OOOOO = AutoAncientBot.W54.IDLE;
            this.O0000000OOOOO0 = null;
            this.O0000000OOOOOO = null;
            this.O000000O0 = null;
            this.O000000O0000 = -1;
            this.O000000O00000 = 0;
            this.O000000O000000 = null;
            this.O0000000O0O00.O00000000();
            this.O0000000O0O000.O00000000();
            this.O0000000O0O00O.O00000000();
            this.O0000000O000O0.O00000000();
            this.O0000000O000OO.O00000000();
            this.O0000000OO0OO = 0;
            this.O000000O00000O = false;
            this.O000000O0000O = 0;
            this.O000000O0000O0 = 0;
            this.O000000O0000OO = 0;
            this.O000000O000O = 0;
            this.O000000O000O0 = 0;
            this.O000000O000O00 = System.currentTimeMillis();
            this.O0000000OO0O0 = Math.toRadians(O0000000000.player.getYaw()) + (Math.PI / 2);
            this.O00000000(AutoAncientBot.W55.SEARCHING);
            this.O000000000("Запущен. ТНТ: " + this.O000000000(Blocks.TNT.asItem()) + ", пёрок: " + this.O000000000(Items.ENDER_PEARL));
            if (this.O000000000O0.O0000000000() && this.O00000000(Items.ENDER_PEARL) == -1) {
               this.O000000000("Пёрок в хотбаре нет — броски работать не будут.");
            }

            O000000O0O00O.O000000000 = true;
            O000000O0O00O.O00000000 = true;
            O000000O0O00O.O0000000000 = O0000000000.player.getYaw();
            O000000O0O00O.O00000000000 = O0000000000.player.getPitch();
            this.O00000000("enabled");
         } else {
            ChatUtil.O00000000("[AutoAncient] TNT and flint must be in hotbar.");
            this.a_();
         }
      } else {
         this.a_();
      }
   }

   @Override
   public void O000000000() {
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O000000000 = false;
      O000000O0O00O.O00000000 = false;
      super.O000000000();
      IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.O0000000000OO(var1);
      this.O0000000000OOO(var1);
      this.O000000000O000();
      this.O000000000O0OO();
      this.O0000000000OOO();
      if (O0000000000.options != null) {
         O0000000000.options.useKey.setPressed(false);
         O0000000000.options.attackKey.setPressed(false);
         O0000000000.options.jumpKey.setPressed(false);
      }

      var1.getMineProcess().cancel();
      var1.getBuilderProcess().onLostControl();
      this.O0000000000OO();
      var1.getSelectionManager().removeAllSelections();
      this.O0000000O0OO = null;
      if (this.O0000000OO00) {
         var1.getCommandManager().execute("resume");
         this.O0000000OO00 = false;
      }

      this.O000000000OO00();
      if (this.O000000O000O00 > 0L) {
         long var2 = Math.max(1L, (System.currentTimeMillis() - this.O000000O000O00) / 1000L);
         this.O000000000(
            "Итог: обломков "
               + this.O000000O0000OO
               + ", ТНТ "
               + this.O000000O000O
               + " (съедено "
               + this.O000000O0000O0
               + "), пёрок "
               + this.O000000O000O0
               + ", время "
               + var2 / 60L
               + " мин "
               + var2 % 60L
               + " с"
         );
         this.O000000O000O00 = 0L;
      }

      this.O00000000("disabled");
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         AncientXray var2 = this.O000000000O0O();
         if (var2 == null) {
            ChatUtil.O00000000("[AutoAncient] AncientXray module is not registered.");
            this.a_();
         } else {
            if (!var2.O0000000000000) {
               var2.O0000000000O0();
            }

            IBaritone var3 = BaritoneAPI.getProvider().getPrimaryBaritone();
            if (!this.O0000000000O00(var3)) {
               if (!this.O000000000O000(var3)) {
                  if (!this.O0000000000O0O(var3)) {
                     if (!this.O000000000O(var3)) {
                        if (!this.O0000000000OO0(var3)) {
                           if (this.O0000000O00000 != AutoAncientBot.W55.MINING
                              && this.O0000000O00000 != AutoAncientBot.W55.PLACING_TNT
                              && this.O0000000O00000 != AutoAncientBot.W55.IGNITING_TNT
                              && this.O0000000O00000 != AutoAncientBot.W55.WAITING_EXPLOSION) {
                              BlockPos var4 = this.O00000000000(var2);
                              if (var4 != null) {
                                 this.O0000000000OO();
                                 this.O000000000(var4);
                                 return;
                              }
                           }

                           switch (this.O0000000O00000) {
                              case SEARCHING:
                                 this.O00000000(var3);
                                 break;
                              case MOVING_SEARCH:
                                 this.O000000000(var3);
                                 break;
                              case MOVING_SITE:
                                 this.O0000000000(var3);
                                 break;
                              case CLEARING_SITE:
                                 this.O00000000000(var3);
                                 break;
                              case PLACING_TNT:
                                 this.O000000000000(var3);
                                 break;
                              case IGNITING_TNT:
                                 this.O0000000000000(var3);
                                 break;
                              case WAITING_EXPLOSION:
                                 this.O0000000000O0();
                                 break;
                              case WAITING_SCAN:
                                 this.O00000000(var2);
                                 break;
                              case MINING:
                                 this.O00000000(var3, var2);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.world != null) {
         AncientXray var2 = this.O000000000O0O();
         if (var2 != null) {
            if (o0000000O000OO.O00000000000() instanceof ExplosionS2CPacket var3) {
               BlockPos var7 = BlockPos.ofFloored(var3.center());
               if (this.O000000000O000(var7)) {
                  this.O0000000OO0 = true;
                  this.O0000000O0OOO = var7;
                  this.O0000000O0O0O.clear();
                  this.O0000000O0O0OO.clear();
                  this.O0000000O0O0O0.add(var7.toImmutable());
                  this.O0000000OOO0OO = false;
                  if (!var2.O0000000000000) {
                     var2.O00000000(var7, 10);
                  }

                  if (this.O0000000O00000 == AutoAncientBot.W55.WAITING_EXPLOSION) {
                     this.O000000000("Взрыв! Сканирую обломки...");
                  }

                  if (this.O0000000O00000 == AutoAncientBot.W55.WAITING_EXPLOSION || this.O0000000O00000 == AutoAncientBot.W55.WAITING_SCAN) {
                     this.O00000000(AutoAncientBot.W55.WAITING_SCAN);
                  }
               }
            } else if (o0000000O000OO.O00000000000() instanceof BlockUpdateS2CPacket var4) {
               if (this.O0000000O0OO0O != null && var4.getPos().equals(this.O0000000O0OO0O) && var4.getState().isOf(Blocks.TNT)) {
                  this.O000000O00000O = true;
               }

               if (!var2.O0000000000000) {
                  var2.O00000000(var4.getPos(), var4.getState().getBlock());
               }
            } else if (o0000000O000OO.O00000000000() instanceof ChunkDeltaUpdateS2CPacket var5) {
               var5.visitUpdates((blockPos, blockState) -> {
                  if (this.O0000000O0OO0O != null && blockPos.equals(this.O0000000O0OO0O) && blockState.isOf(Blocks.TNT)) {
                     this.O000000O00000O = true;
                  }

                  if (!var2.O0000000000000) {
                     var2.O00000000(blockPos, blockState.getBlock());
                  }
               });
            }
         }
      }
   }

   private void O00000000(IBaritone iBaritone) {
      this.O0000000000OOO();
      BlockPos var2 = this.O0000000000O00();
      if (var2 != null) {
         this.O0000000O0OO00 = var2;
         this.O00000000(iBaritone, var2);
         this.O00000000(AutoAncientBot.W55.MOVING_SITE);
         this.O000000000("Место для взрыва: " + var2.toShortString());
      } else {
         this.O0000000000O(iBaritone);
      }
   }

   private void O000000000(IBaritone iBaritone) {
      if (!this.O00000000(this.O0000000O0OO0, "лечу к зоне поиска")) {
         if (this.O000000000O0(iBaritone)) {
            this.O000000000O00(iBaritone);
         } else {
            if (this.O0000000O0OO0 == null
               || this.O000000000(this.O0000000O0OO0, 9.0)
               || this.O0000000O000O.O000000000000(18000L)
               || !this.O0000000000O0(iBaritone) && this.O0000000O000O.O000000000000(2500L)) {
               this.O0000000000OO();
               this.O00000000(AutoAncientBot.W55.SEARCHING);
            }
         }
      }
   }

   private void O0000000000(IBaritone iBaritone) {
      if (this.O0000000O0OO00 == null) {
         this.O00000000(AutoAncientBot.W55.SEARCHING);
      } else if (!this.O00000000(this.O0000000O0OO00, "лечу к месту взрыва")) {
         if (this.O000000000O0(iBaritone)) {
            this.O000000000O00(iBaritone);
         } else if (this.O0000000O000O.O000000000000(22000L)) {
            this.O0000000OO0O00++;
            this.O00000000(AutoAncientBot.W55.SEARCHING);
         } else {
            if (!this.O000000000(this.O0000000O0OO00, 10.0)) {
               if (this.O0000000000O0(iBaritone)) {
                  return;
               }

               if (!this.O0000000O000O.O000000000000(2500L)) {
                  return;
               }
            }

            this.O0000000000OO();
            if (!this.O00000000000(this.O0000000O0OO00)) {
               this.O0000000OO0O00++;
               this.O00000000(AutoAncientBot.W55.SEARCHING);
            } else {
               this.O0000000O0OO0O = this.O0000000000000(this.O0000000O0OO00);
               if (this.O0000000O0OO0O == null) {
                  this.O0000000OO0O00++;
                  this.O00000000(AutoAncientBot.W55.SEARCHING);
               } else {
                  this.O000000O0000O = 0;
                  this.O000000O00000O = false;
                  this.O0000000O0OOOO = null;
                  this.O00000000(AutoAncientBot.W55.CLEARING_SITE);
                  this.O000000000("Расчищаю площадку: " + this.O0000000O0OO0O.toShortString());
               }
            }
         }
      }
   }

   private void O00000000000(IBaritone iBaritone) {
      if (this.O0000000O0OO0O == null) {
         this.O00000000(AutoAncientBot.W55.SEARCHING);
      } else if (this.O00000000000O(this.O0000000O0OO0O)) {
         this.O0000000000OO();
         this.O0000000O0OOOO = null;
         this.O00000000(AutoAncientBot.W55.PLACING_TNT);
      } else if (this.O0000000O000O.O000000000000(14000L)) {
         this.O0000000OO0O00++;
         this.O0000000000OO();
         this.O00000000(AutoAncientBot.W55.SEARCHING);
      } else {
         BlockPos var2 = this.O00000000(this.O0000000O0OO0O);
         if (var2 == null) {
            this.O0000000OO0O00++;
            this.O0000000000OO();
            this.O00000000(AutoAncientBot.W55.SEARCHING);
         } else {
            BlockHitResult var3 = this.O0000000000O0(var2);
            if (var3 == null) {
               if (this.O000000000O0(iBaritone)) {
                  this.O000000000O00(iBaritone);
               } else {
                  this.O000000000(iBaritone, this.O0000000O0OO0O);
               }
            } else {
               AutoAncientBot.W52 var4 = this.O00000000(var3.getBlockPos(), 3000L);
               if (var4 == AutoAncientBot.W52.STUCK) {
                  this.O0000000OO0O00++;
                  this.O00000000(AutoAncientBot.W55.SEARCHING);
               } else {
                  if (var4 == AutoAncientBot.W52.NO_REACH) {
                     this.O000000000(iBaritone, this.O0000000O0OO0O);
                  }
               }
            }
         }
      }
   }

   private BlockPos O00000000(BlockPos blockPos) {
      if (!O0000000000.world.getBlockState(blockPos).isReplaceable()) {
         return blockPos;
      } else {
         return !O0000000000.world.getBlockState(blockPos.up()).isReplaceable() ? blockPos.up() : null;
      }
   }

   private void O000000000000(IBaritone iBaritone) {
      if (this.O0000000O0OO0O == null) {
         this.O00000000(AutoAncientBot.W55.SEARCHING);
      } else if (O0000000000.world.getBlockState(this.O0000000O0OO0O).isOf(Blocks.TNT)) {
         if (this.O000000O00000O) {
            if (this.O0000000O00O0.O000000000000(1400L)) {
               this.O00000000(AutoAncientBot.W55.IGNITING_TNT);
            }
         } else {
            if (this.O0000000O00O0.O000000000000(2500L)) {
               this.O000000O0000O0++;
               this.O000000O0000O++;
               this.O000000000("Сервер съел ТНТ — переставляю (#" + this.O000000O0000O0 + ")");
               this.O00000000(this.O0000000O0OO0O, 0);
               if (this.O000000O0000O >= 3) {
                  this.O000000000("ТНТ пропадает на этом месте — ищу другое");
                  this.O0000000OO0O00++;
                  this.O00000000(AutoAncientBot.W55.SEARCHING);
                  return;
               }

               this.O0000000O000O.O00000000();
               this.O0000000O00O0.O00000000();
            }
         }
      } else if (!this.O000000000O00(this.O0000000O0OO0O)) {
         if (this.O000000000O0(iBaritone)) {
            this.O000000000O00(iBaritone);
         } else {
            this.O000000000(iBaritone, this.O0000000O0OO0O);
         }
      } else {
         this.O0000000000OO();
         if (!this.O00000000000O(this.O0000000O0OO0O)) {
            this.O0000000OO0O00++;
            this.O00000000(AutoAncientBot.W55.SEARCHING);
         } else {
            Vec3d var2 = new Vec3d(this.O0000000O0OO0O.getX() + 0.5, this.O0000000O0OO0O.getY(), this.O0000000O0OO0O.getZ() + 0.5);
            O000000O0O00OO var3 = this.O00000000(var2);
            this.O00000000(var3);
            if (!(new O000000O0O00OO(O0000000000.player).O00000000(var3) > 4.0F)) {
               if (this.O0000000O00O0.O000000000000(900L)) {
                  if (!this.O00000000000O0(this.O0000000O0OO0O)) {
                     if (this.O0000000000O0O()) {
                        return;
                     }

                     this.a_();
                     return;
                  }

                  this.O0000000O00O0.O00000000();
               }

               if (this.O0000000O000O.O000000000000(8000L)) {
                  this.O0000000OO0O00++;
                  this.O00000000(AutoAncientBot.W55.SEARCHING);
               }
            }
         }
      }
   }

   private void O0000000000000(IBaritone iBaritone) {
      if (this.O0000000O0OO0O == null) {
         this.O00000000(AutoAncientBot.W55.SEARCHING);
      } else if (!O0000000000.world.getBlockState(this.O0000000O0OO0O).isOf(Blocks.TNT)) {
         if (this.O0000000O000O.O000000000000(600L)) {
            this.O0000000000OO();
            this.O0000000OO0 = false;
            this.O00000000(AutoAncientBot.W55.WAITING_EXPLOSION);
         }
      } else if (!this.O000000000O00(this.O0000000O0OO0O)) {
         if (this.O000000000O0(iBaritone)) {
            this.O000000000O00(iBaritone);
         } else {
            this.O000000000(iBaritone, this.O0000000O0OO0O);
         }
      } else {
         this.O0000000000OO();
         BlockHitResult var2 = this.O0000000000O0O(this.O0000000O0OO0O);
         if (var2 != null) {
            O000000O0O00OO var3 = this.O00000000(var2.getPos());
            this.O00000000(var3);
            if (!(new O000000O0O00OO(O0000000000.player).O00000000(var3) > 4.0F)) {
               if (this.O0000000O000O.O000000000000(1400L)) {
                  if (this.O0000000O00O0.O000000000000(900L)) {
                     if (!this.O00000000000OO(this.O0000000O0OO0O)) {
                        this.O0000000OO0O00++;
                        this.O00000000(AutoAncientBot.W55.SEARCHING);
                        return;
                     }

                     this.O0000000OO0 = false;
                     this.O000000O000O++;
                     this.O0000000000OO();
                     this.O00000000(AutoAncientBot.W55.WAITING_EXPLOSION);
                     this.O000000000("Поджёг ТНТ #" + this.O000000O000O + " (" + this.O0000000O0OO0O.toShortString() + ")");
                  }
               }
            }
         }
      }
   }

   private void O0000000000O0() {
      if (!this.O0000000OO0
         && this.O0000000O0OO0O != null
         && O0000000000.world.getBlockState(this.O0000000O0OO0O).isOf(Blocks.TNT)
         && this.O0000000O000O.O000000000000(1800L)) {
         this.O00000000(AutoAncientBot.W55.IGNITING_TNT);
      } else {
         if (this.O0000000OO0 || this.O0000000O000O.O000000000000(6500L)) {
            this.O00000000(AutoAncientBot.W55.WAITING_SCAN);
         }
      }
   }

   private void O00000000(AncientXray o00000O000OOOO) {
      if (this.O0000000O000O.O000000000000(1200L)) {
         BlockPos var2 = this.O00000000000(o00000O000OOOO);
         if (var2 != null) {
            this.O000000000(var2);
         } else if (this.O00000000(Blocks.TNT.asItem()) == -1 && this.O0000000O0OOO != null && !this.O0000000OOO0OO) {
            o00000O000OOOO.O00000000(this.O0000000O0OOO, 2);
            this.O0000000OOO0OO = true;
            this.O000000000("ТНТ закончилась — финальный скан вокруг взрыва");
            this.O0000000O000O.O00000000();
         } else {
            if (this.O0000000O000O.O000000000000(4500L)) {
               this.O000000000("Обломков рядом нет — ищу новое место");
               this.O0000000O0OOO0 = null;
               this.O0000000O0OOOO = null;
               this.O0000000O0000O = AutoAncientBot.W53.APPROACHING;
               this.O00000000(AutoAncientBot.W55.SEARCHING);
               this.O0000000000O(BaritoneAPI.getProvider().getPrimaryBaritone());
            }
         }
      }
   }

   private void O00000000(IBaritone iBaritone, AncientXray o00000O000OOOO) {
      if (this.O0000000O0000O != AutoAncientBot.W53.BREAKING) {
         this.O0000000000OOO();
      }

      List var3 = this.O000000000(o00000O000OOOO);
      if (var3.isEmpty()) {
         this.O000000000000O(iBaritone);
         this.O00000000(AutoAncientBot.W55.SEARCHING);
         this.O0000000000O(iBaritone);
      } else if (this.O0000000O0OOO0 != null && !var3.contains(this.O0000000O0OOO0)) {
         this.O000000000O0O0();
         this.O0000000000(o00000O000OOOO);
      } else if (this.O0000000O0OOO0 != null && !O0000000000.world.getBlockState(this.O0000000O0OOO0).isOf(Blocks.ANCIENT_DEBRIS)) {
         this.O000000000O0O0();
         this.O0000000000(o00000O000OOOO);
      } else {
         BlockPos var4 = this.O0000000O0OOO0 == null ? this.O00000000((List<BlockPos>)var3) : this.O0000000O0OOO0;
         if (this.O0000000O0OOO0 != null && this.O0000000O0OOO0.equals(var4)) {
            if (this.O0000000O0000O == AutoAncientBot.W53.APPROACHING) {
               this.O000000000(iBaritone, o00000O000OOOO);
            } else {
               if (this.O0000000O0000O == AutoAncientBot.W53.BREAKING) {
                  this.O0000000000(iBaritone, o00000O000OOOO);
               }
            }
         } else {
            if (this.O0000000O0OOO0 == null) {
               this.O0000000OO0O0O = 0;
            }

            this.O00000000(iBaritone, var4, true);
         }
      }
   }

   private void O00000000(IBaritone iBaritone, BlockPos blockPos, boolean bl) {
      this.O0000000O0OOO0 = blockPos.toImmutable();
      this.O0000000000OOO();
      this.O0000000000OO();
      this.O0000000O0000O = AutoAncientBot.W53.APPROACHING;
      this.O0000000OO0OO = 0;
      this.O0000000OO0OO0 = 0;
      this.O0000000OO0OOO = null;
      this.O0000000O0OOOO = null;
      this.O0000000O00O.O00000000();
      this.O0000000O00O00.O00000000();
      if (bl) {
         this.O0000000O000O.O00000000();
      }

      this.O00000000("target ore " + this.O0000000O0OOO0.toShortString());
   }

   private void O000000000000O(IBaritone iBaritone) {
      iBaritone.getMineProcess().cancel();
      iBaritone.getBuilderProcess().onLostControl();
      this.O0000000000OO();
      iBaritone.getSelectionManager().removeAllSelections();
      this.O0000000O0OOO0 = null;
      this.O0000000O0OOOO = null;
      this.O0000000O0000O = AutoAncientBot.W53.APPROACHING;
      this.O0000000000OOO();
   }

   private List<BlockPos> O000000000(AncientXray o00000O000OOOO) {
      ArrayList var2 = new ArrayList<>(o00000O000OOOO.O0000000000O0O());
      var2.removeIf(blockPos -> {
         boolean var3 = !O0000000000.world.getBlockState((BlockPos)blockPos).isOf(Blocks.ANCIENT_DEBRIS);
         if (var3) {
            o00000O000OOOO.O00000000((BlockPos)blockPos);
         }

         if (!var3 && !this.O0000000O0O0O.contains(blockPos) && this.O000000000O((BlockPos)blockPos)) {
            this.O0000000O0O0O.add(((BlockPos)blockPos).toImmutable());
            o00000O000OOOO.O00000000((BlockPos)blockPos);
            this.O000000000("Пропускаю обломок " + ((BlockPos)blockPos).toShortString() + " — замурован в лаве, не подойти");
            return true;
         } else {
            return var3 || this.O0000000O0O0O.contains(blockPos);
         }
      });
      return var2;
   }

   private BlockPos O00000000(List<BlockPos> list) {
      return list.stream()
         .min(Comparator.comparingDouble(blockPos -> O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(blockPos))))
         .orElse((BlockPos)list.get(0));
   }

   private void O000000000(IBaritone iBaritone, AncientXray o00000O000OOOO) {
      this.O0000000000OOO();
      if (this.O0000000000O00(this.O0000000O0OOO0)) {
         this.O00000000000O0(iBaritone);
      } else if (this.O0000000O00O00.O000000000000(22000L)) {
         this.O00000000(o00000O000OOOO, "не смог дойти");
      } else if (!this.O00000000(this.O0000000O0OOO0, "лечу к обломку")) {
         this.O00000000(iBaritone, this.O0000000O0OOO0, 2);
      }
   }

   private void O0000000000(IBaritone iBaritone, AncientXray o00000O000OOOO) {
      BlockHitResult var3 = this.O0000000000O0(this.O0000000O0OOO0);
      if (var3 == null) {
         this.O0000000O0OOOO = null;
         if (this.O0000000O00O0O.O000000000000(900L)) {
            this.O0000000OO0OO0++;
            if (this.O0000000OO0OO0 > 4) {
               this.O00000000(o00000O000OOOO, "не удержаться рядом (лава/обрыв)");
               return;
            }

            this.O00000000000O(iBaritone);
            this.O00000000("lost reach " + this.O0000000O0OOO0.toShortString());
         }
      } else {
         this.O0000000O00O0O.O00000000();
         BlockPos var4 = var3.getBlockPos();
         if (!var4.equals(this.O0000000OO0OOO)) {
            this.O0000000OO0OOO = var4.toImmutable();
            this.O0000000OO0OO0 = 0;
         }

         boolean var5 = var4.equals(this.O0000000O0OOO0);
         AutoAncientBot.W52 var6 = this.O00000000(var4, var5 ? 9000L : 3000L);
         if (var6 != AutoAncientBot.W52.STUCK) {
            if (this.O0000000O000O.O000000000000(18000L)) {
               if (this.O00000000000OO(iBaritone)) {
                  this.O0000000OO0O0O++;
                  this.O00000000("retry ore " + this.O0000000O0OOO0.toShortString() + " #" + this.O0000000OO0O0O);
                  this.O00000000000O(iBaritone);
                  this.O0000000O000O.O00000000();
                  return;
               }

               this.O00000000(o00000O000OOOO, "не выкопался за таймаут");
            }
         } else {
            this.O0000000OO0OO++;
            if (var5 || this.O0000000OO0OO > 2) {
               this.O00000000(o00000O000OOOO, "фантомные блоки, ресинк");
            }
         }
      }
   }

   private void O00000000000O(IBaritone iBaritone) {
      this.O0000000000OOO();
      this.O0000000O00O0O.O00000000();
      this.O0000000O0000O = AutoAncientBot.W53.APPROACHING;
      this.O0000000O00O00.O00000000();
      this.O00000000(iBaritone, this.O0000000O0OOO0, 2);
   }

   private void O00000000000O0(IBaritone iBaritone) {
      this.O0000000000OO();
      this.O0000000O0000O = AutoAncientBot.W53.BREAKING;
      this.O0000000OO0OO = 0;
      this.O0000000O0OOOO = null;
      this.O0000000O000O.O00000000();
      this.O0000000O00O0O.O00000000();
      this.O00000000("break ore " + this.O0000000O0OOO0.toShortString());
   }

   private void O000000000(BlockPos blockPos) {
      this.O0000000O0OOO0 = blockPos.toImmutable();
      this.O0000000OO0O0O = 0;
      this.O0000000O0000O = AutoAncientBot.W53.APPROACHING;
      this.O00000000(AutoAncientBot.W55.MINING);
      this.O00000000(BaritoneAPI.getProvider().getPrimaryBaritone(), this.O0000000O0OOO0, true);
      AncientXray var2 = this.O000000000O0O();
      int var3 = var2 == null ? 0 : this.O000000000(var2).size();
      this.O000000000("Иду к обломку " + this.O0000000O0OOO0.toShortString() + (var3 > 1 ? " (в очереди: " + var3 + ")" : ""));
   }

   private boolean O00000000000OO(IBaritone iBaritone) {
      if (this.O0000000O0OOO0 != null && this.O0000000OO0O0O < 2) {
         if (!O0000000000.world.getBlockState(this.O0000000O0OOO0).isOf(Blocks.ANCIENT_DEBRIS)) {
            return false;
         } else {
            double var2 = O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(this.O0000000O0OOO0));
            return iBaritone.getPathingBehavior().isPathing() || var2 <= 144.0 || this.O000000000O0O(this.O0000000O0OOO0);
         }
      } else {
         return false;
      }
   }

   private void O0000000000(AncientXray o00000O000OOOO) {
      IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
      var2.getBuilderProcess().onLostControl();
      this.O0000000000OO();
      var2.getSelectionManager().removeAllSelections();
      o00000O000OOOO.O00000000(this.O0000000O0OOO0);
      this.O0000000O0OOO0 = null;
      this.O0000000O0OOOO = null;
      this.O0000000O0000O = AutoAncientBot.W53.APPROACHING;
      this.O0000000000OOO();
   }

   private void O00000000(BlockPos blockPos, int i) {
      if (O0000000000.getNetworkHandler() != null) {
         for (int var3 = -i; var3 <= i; var3++) {
            for (int var4 = -i; var4 <= i; var4++) {
               for (int var5 = -i; var5 <= i; var5++) {
                  BlockPos var6 = blockPos.add(var3, var4, var5);
                  O0000000000.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(Action.START_DESTROY_BLOCK, var6, Direction.UP));
                  O0000000000.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(Action.ABORT_DESTROY_BLOCK, var6, Direction.UP));
               }
            }
         }
      }
   }

   private void O00000000(AncientXray o00000O000OOOO, String string) {
      if (this.O0000000O0OOO0 != null) {
         this.O0000000O0O0O.add(this.O0000000O0OOO0.toImmutable());
         o00000O000OOOO.O00000000(this.O0000000O0OOO0);
         this.O000000000("Пропускаю обломок " + this.O0000000O0OOO0.toShortString() + " — " + string);
      }

      IBaritone var3 = BaritoneAPI.getProvider().getPrimaryBaritone();
      var3.getMineProcess().cancel();
      var3.getBuilderProcess().onLostControl();
      this.O0000000000OO();
      var3.getSelectionManager().removeAllSelections();
      this.O0000000O0OOO0 = null;
      this.O0000000O0OOOO = null;
      this.O0000000O0000O = AutoAncientBot.W53.APPROACHING;
      this.O0000000000OOO();
   }

   private BlockPos O00000000000(AncientXray o00000O000OOOO) {
      return this.O000000000(o00000O000OOOO)
         .stream()
         .min(Comparator.comparingDouble(blockPos -> O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(blockPos))))
         .orElse(null);
   }

   private void O0000000000O(IBaritone iBaritone) {
      BlockPos var2 = O0000000000.player.getBlockPos();
      if (this.O0000000OO0O00 > 0 && this.O0000000OO0O00 % 4 == 0) {
         this.O0000000OO0O0++;
      }

      byte var3 = 36;
      int var4 = var2.getX() + (int)Math.round(Math.cos(this.O0000000OO0O0) * var3);
      int var5 = var2.getZ() + (int)Math.round(Math.sin(this.O0000000OO0O0) * var3);
      this.O0000000O0OO0 = new BlockPos(var4, this.O00000000000(var2.getY()), var5);
      this.O00000000(iBaritone, this.O0000000O0OO0);
      this.O0000000OO0O00++;
      this.O00000000(AutoAncientBot.W55.MOVING_SEARCH);
      this.O00000000("search " + this.O0000000O0OO0.toShortString());
   }

   private BlockPos O0000000000O00() {
      BlockPos var1 = O0000000000.player.getBlockPos();
      byte var2 = 26;
      BlockPos var3 = null;
      int var4 = Integer.MIN_VALUE;

      for (int var5 = -var2; var5 <= var2; var5 += 4) {
         for (int var6 = -var2; var6 <= var2; var6 += 4) {
            for (byte var7 = -6; var7 <= 6; var7 += 2) {
               BlockPos var8 = new BlockPos(var1.getX() + var5, var1.getY() + var7, var1.getZ() + var6);
               int var9 = this.O0000000000(var8);
               if (var9 != Integer.MIN_VALUE && (var3 == null || var9 > var4)) {
                  var3 = var8;
                  var4 = var9;
               }
            }
         }
      }

      return var3;
   }

   private int O0000000000(BlockPos blockPos) {
      if (this.O000000000000(blockPos)) {
         return Integer.MIN_VALUE;
      } else if (!this.O000000000O00O(blockPos.down())) {
         return Integer.MIN_VALUE;
      } else {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;

         for (int var6 = -5; var6 <= 5; var6++) {
            for (int var7 = -3; var7 <= 3; var7++) {
               for (int var8 = -5; var8 <= 5; var8++) {
                  BlockPos var9 = blockPos.add(var6, var7, var8);
                  BlockState var10 = O0000000000.world.getBlockState(var9);
                  Block var11 = var10.getBlock();
                  var2++;
                  if (this.O00000000(var11)) {
                     var4++;
                  } else if (var11 == Blocks.LAVA) {
                     var5++;
                  } else if (this.O000000000(var11)) {
                     var3++;
                  }
               }
            }
         }

         if (!(var3 < var2 * 0.48) && !(var4 > var2 * 0.34) && !(var5 > var2 * 0.2)) {
            double var12 = O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(blockPos));
            return var3 * 3 - var4 * 4 - var5 * 5 - (int)(var12 * 0.02) + this.O000000000000(blockPos.getY());
         } else {
            return Integer.MIN_VALUE;
         }
      }
   }

   private boolean O00000000000(BlockPos blockPos) {
      return this.O0000000000(blockPos) != Integer.MIN_VALUE;
   }

   private boolean O000000000000(BlockPos blockPos) {
      double var2 = 842.4;

      for (BlockPos var5 : this.O0000000O0O0O0) {
         if (this.O000000000(blockPos, var5) <= var2) {
            return true;
         }
      }

      return false;
   }

   private BlockPos O0000000000000(BlockPos blockPos) {
      BlockPos var2 = null;

      for (int var3 = 0; var3 <= 2; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               BlockPos var6 = blockPos.add(var4, var3, var5);
               if (this.O000000000000O(var6)) {
                  if (this.O00000000000O(var6)) {
                     return var6.toImmutable();
                  }

                  if (var2 == null) {
                     var2 = var6.toImmutable();
                  }
               }
            }
         }
      }

      if (var2 != null) {
         return var2;
      } else {
         return this.O000000000000O(blockPos) ? blockPos.toImmutable() : null;
      }
   }

   private boolean O000000000000O(BlockPos blockPos) {
      BlockState var2 = O0000000000.world.getBlockState(blockPos);
      BlockState var3 = O0000000000.world.getBlockState(blockPos.up());
      return this.O000000000O00O(blockPos.down()) && var2.getFluidState().isEmpty() && var3.getFluidState().isEmpty();
   }

   private boolean O00000000000O(BlockPos blockPos) {
      return this.O000000000O00O(blockPos.down())
         && O0000000000.world.getBlockState(blockPos).isReplaceable()
         && O0000000000.world.getBlockState(blockPos.up()).isReplaceable();
   }

   private boolean O0000000000O0O() {
      AncientXray var1 = this.O000000000O0O();
      if (var1 == null) {
         return false;
      } else {
         BlockPos var2 = this.O00000000000(var1);
         if (var2 == null) {
            return false;
         } else {
            this.O000000000(var2);
            return true;
         }
      }
   }

   private boolean O00000000000O0(BlockPos blockPos) {
      int var2 = this.O00000000(Blocks.TNT.asItem());
      if (var2 == -1) {
         ChatUtil.O00000000("[AutoAncient] TNT is missing from hotbar.");
         return false;
      } else {
         O0000O00O000O0.O00000000(var2);
         this.O000000O00000O = false;
         BlockPos var3 = blockPos.down();
         BlockHitResult var4 = new BlockHitResult(new Vec3d(blockPos.getX() + 0.5, blockPos.getY(), blockPos.getZ() + 0.5), Direction.UP, var3, false);
         O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var4);
         O0000000000.player.swingHand(Hand.MAIN_HAND);
         return true;
      }
   }

   private boolean O00000000000OO(BlockPos blockPos) {
      int var2 = this.O00000000(Items.FLINT_AND_STEEL);
      if (var2 == -1) {
         ChatUtil.O00000000("[AutoAncient] Flint and steel is missing from hotbar.");
         this.a_();
         return false;
      } else {
         BlockHitResult var3 = this.O0000000000O0O(blockPos);
         if (var3 == null) {
            return false;
         } else {
            O0000O00O000O0.O00000000(var2);
            BlockHitResult var4 = this.O0000000000OO0();
            BlockHitResult var5 = var4 != null && var4.getBlockPos().equals(blockPos) ? var4 : var3;
            O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var5);
            O0000000000.player.swingHand(Hand.MAIN_HAND);
            return true;
         }
      }
   }

   private AutoAncientBot.W52 O00000000(BlockPos blockPos, long l) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         BlockHitResult var4 = this.O0000000000O0O(blockPos);
         if (var4 != null && !(O0000000000.player.getEyePos().distanceTo(var4.getPos()) > 4.2)) {
            this.O0000000000OO();
            O000000O0O00OO var5 = this.O00000000(var4.getPos());
            this.O00000000(var5);
            if (new O000000O0O00OO(O0000000000.player).O00000000(var5) > 4.0F) {
               return AutoAncientBot.W52.AIMING;
            } else {
               BlockHitResult var6 = this.O0000000000OO0();
               BlockHitResult var7 = var6 != null && var6.getBlockPos().equals(blockPos) ? var6 : var4;
               if (!blockPos.equals(this.O0000000O0OOOO)) {
                  if (!this.O0000000O000OO.O000000000000(90L)) {
                     return AutoAncientBot.W52.AIMING;
                  }

                  O0000000000.interactionManager.attackBlock(blockPos, var7.getSide());
                  this.O0000000O0OOOO = blockPos.toImmutable();
                  this.O0000000O000O0.O00000000();
                  this.O0000000O000OO.O00000000();
               } else {
                  if (this.O0000000O000O0.O000000000000(l)) {
                     this.O0000000000O(blockPos);
                     this.O0000000O0OOOO = null;
                     return AutoAncientBot.W52.STUCK;
                  }

                  O0000000000.interactionManager.updateBlockBreakingProgress(blockPos, var7.getSide());
               }

               O0000000000.player.swingHand(Hand.MAIN_HAND);
               return AutoAncientBot.W52.BREAKING;
            }
         } else {
            return AutoAncientBot.W52.NO_REACH;
         }
      } else {
         return AutoAncientBot.W52.NO_REACH;
      }
   }

   private void O0000000000O(BlockPos blockPos) {
      if (O0000000000.getNetworkHandler() != null) {
         O0000000000.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(Action.ABORT_DESTROY_BLOCK, blockPos, Direction.DOWN));
      }
   }

   private void O0000000000OO() {
      IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
      if (var1.getPathingBehavior().isPathing() || var1.getCustomGoalProcess().isActive()) {
         var1.getPathingBehavior().cancelEverything();
      }

      this.O0000000O0OO = null;
   }

   private boolean O0000000000O0(IBaritone iBaritone) {
      return iBaritone.getPathingBehavior().isPathing() || iBaritone.getCustomGoalProcess().isActive();
   }

   private void O00000000(IBaritone iBaritone, BlockPos blockPos, int i) {
      BlockPos var4 = blockPos.toImmutable();
      boolean var5 = !var4.equals(this.O0000000O0OO);
      if (var5 || !iBaritone.getCustomGoalProcess().isActive() && this.O0000000O00O.O000000000000(600L)) {
         iBaritone.getCustomGoalProcess().setGoalAndPath(new GoalNear(var4, i));
         this.O0000000O0OO = var4;
         this.O0000000O00O.O00000000();
         if (var5) {
            this.O000000000O00O();
            this.O00000000("walk " + var4.toShortString());
         }
      }
   }

   private void O00000000(O000000O0O00OO o000000O0O00OO) {
      float var2 = new O000000O0O00OO(O0000000000.player).O00000000(o000000O0O00OO);
      float var3 = Math.max(34.0F, Math.min(140.0F, var2 * 1.35F));
      O000000O0O0O0.O00000000(o000000O0O00OO, var3, var3, var3, var3, 2, 20, false);
   }

   private O000000O0O00OO O00000000(Vec3d vec3d) {
      Vec3d var2 = O0000000000.player.getEyePos();
      double var3 = vec3d.x - var2.x;
      double var5 = vec3d.y - var2.y;
      double var7 = vec3d.z - var2.z;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)Math.toDegrees(Math.atan2(-var3, var7));
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      return new O000000O0O00OO(var11, MathHelper.clamp(var12, -90.0F, 90.0F));
   }

   private BlockHitResult O0000000000OO0() {
      double var1 = Math.toRadians(O0000000000.player.getYaw());
      double var3 = Math.toRadians(O0000000000.player.getPitch());
      double var5 = Math.cos(var3);
      Vec3d var7 = new Vec3d(-Math.sin(var1) * var5, -Math.sin(var3), Math.cos(var1) * var5);
      Vec3d var8 = O0000000000.player.getEyePos();
      Vec3d var9 = var8.add(var7.multiply(4.6000000000000005));
      BlockHitResult var10 = O0000000000.world.raycast(new RaycastContext(var8, var9, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
      return var10.getType() == Type.BLOCK ? var10 : null;
   }

   private BlockHitResult O0000000000O0(BlockPos blockPos) {
      return this.O00000000(blockPos, 4.2);
   }

   private BlockHitResult O00000000(BlockPos blockPos, double d) {
      BlockHitResult var4 = this.O0000000000O0O(blockPos);
      if (var4 == null) {
         Vec3d var5 = O0000000000.player.getEyePos();
         BlockHitResult var6 = O0000000000.world
            .raycast(new RaycastContext(var5, Vec3d.ofCenter(blockPos), ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
         if (var6.getType() != Type.BLOCK) {
            return null;
         }

         BlockPos var7 = var6.getBlockPos();
         if (!var7.equals(blockPos) && O0000000000.world.getBlockState(var7).getHardness(O0000000000.world, var7) < 0.0F) {
            return null;
         }

         var4 = var6;
      }

      return O0000000000.player.getEyePos().distanceTo(var4.getPos()) > d ? null : var4;
   }

   private boolean O0000000000O00(BlockPos blockPos) {
      return blockPos != null && this.O00000000(blockPos, 3.7) != null;
   }

   private BlockHitResult O0000000000O0O(BlockPos blockPos) {
      Vec3d var2 = O0000000000.player.getEyePos();
      double[] var3 = new double[]{0.5, 0.2, 0.8};

      for (double var7 : var3) {
         for (double var12 : var3) {
            for (double var17 : var3) {
               Vec3d var19 = new Vec3d(blockPos.getX() + var7, blockPos.getY() + var12, blockPos.getZ() + var17);
               BlockHitResult var20 = O0000000000.world.raycast(new RaycastContext(var2, var19, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
               if (var20.getType() == Type.BLOCK && var20.getBlockPos().equals(blockPos)) {
                  return var20;
               }
            }
         }
      }

      return null;
   }

   private void O0000000000OOO() {
      if (O0000000000.options != null) {
         O0000000000.options.attackKey.setPressed(false);
      }

      this.O0000000O0OOOO = null;
   }

   private boolean O0000000000O00(IBaritone iBaritone) {
      boolean var2 = PlayerHelper.O0000000000O0();
      if (var2) {
         if (!this.O0000000OO00) {
            iBaritone.getCommandManager().execute("pause");
            this.O0000000OO00 = true;
            this.O0000000000OOO();
         }

         return true;
      } else {
         if (this.O0000000OO00) {
            iBaritone.getCommandManager().execute("resume");
            this.O0000000OO00 = false;
         }

         return false;
      }
   }

   private boolean O0000000000O0O(IBaritone iBaritone) {
      if (O0000000000.player == null || O0000000000.interactionManager == null || O0000000000.options == null) {
         return false;
      } else if (this.O0000000OOOO0) {
         if (this.O000000000O() && this.O0000000OOO00 >= 0 && this.O00000000(this.O0000000OOO00) && !this.O0000000O0O.O000000000000(3500L)) {
            O0000O00O000O0.O00000000(this.O0000000OOO00);
            O0000000000.options.useKey.setPressed(true);
            if (!O0000000000.player.isUsingItem()) {
               O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            }

            return true;
         } else {
            this.O0000000000OO(iBaritone);
            return false;
         }
      } else if (!this.O000000000O()) {
         this.O0000000OOOO00 = false;
         return false;
      } else {
         int var2 = this.O000000000O0();
         if (var2 == -1) {
            if (!this.O0000000OOOO00) {
               ChatUtil.O00000000("[AutoAncient] Fire resistance potion is missing from hotbar.");
               this.O0000000OOOO00 = true;
            }

            return false;
         } else {
            this.O0000000OOOO00 = false;
            this.O0000000000OOO(iBaritone);
            this.O0000000OOOO0 = true;
            this.O0000000OOO00 = var2;
            this.O0000000OOO000 = O0000000000.player.getInventory().getSelectedSlot();
            this.O0000000O0O.O00000000();
            if (!this.O0000000OOO0O0) {
               iBaritone.getCommandManager().execute("pause");
               this.O0000000OOO0O0 = true;
            }

            this.O0000000000OOO();
            O0000O00O000O0.O00000000(this.O0000000OOO00);
            O0000000000.options.useKey.setPressed(true);
            O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            this.O00000000("drink fire res " + this.O0000000OOO00);
            return true;
         }
      }
   }

   private void O0000000000OO(IBaritone iBaritone) {
      if (O0000000000.options != null) {
         O0000000000.options.useKey.setPressed(false);
      }

      if (O0000000000.player != null && this.O0000000OOO000 >= 0 && this.O0000000OOO000 < 9) {
         O0000O00O000O0.O00000000(this.O0000000OOO000);
      }

      if (iBaritone != null && this.O0000000OOO0O0) {
         iBaritone.getCommandManager().execute("resume");
      }

      this.O0000000OOO0O0 = false;
      this.O0000000OOOO0 = false;
      this.O0000000OOO00 = -1;
      this.O0000000OOO000 = -1;
   }

   private boolean O000000000O() {
      if (O0000000000.player == null) {
         return false;
      } else {
         StatusEffectInstance var1 = O0000000000.player.getStatusEffect(StatusEffects.FIRE_RESISTANCE);
         return var1 == null || var1.getDuration() <= 300;
      }
   }

   private int O000000000O0() {
      if (O0000000000.player == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (this.O00000000(var1)) {
               return var1;
            }
         }

         return -1;
      }
   }

   private boolean O00000000(int i) {
      if (O0000000000.player != null && i >= 0 && i <= 8) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(i);
         if (!var2.isEmpty() && var2.isOf(Items.POTION)) {
            PotionContentsComponent var3 = (PotionContentsComponent)var2.get(DataComponentTypes.POTION_CONTENTS);
            if (var3 == null) {
               return false;
            } else {
               for (StatusEffectInstance var5 : var3.getEffects()) {
                  RegistryEntry var6 = var5.getEffectType();
                  if (var6.equals(StatusEffects.FIRE_RESISTANCE)) {
                     return true;
                  }
               }

               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean O0000000000OO0(IBaritone iBaritone) {
      if (O0000000000.player == null || O0000000000.interactionManager == null || O0000000000.options == null) {
         return false;
      } else if (this.O0000000OOOO) {
         if (O0000000000.player.getHungerManager().getFoodLevel() < 19
            && this.O0000000OOO >= 0
            && this.O000000000(this.O0000000OOO)
            && !this.O0000000O00OOO.O000000000000(7000L)) {
            O0000O00O000O0.O00000000(this.O0000000OOO);
            O0000000000.options.useKey.setPressed(true);
            if (!O0000000000.player.isUsingItem()) {
               O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            }

            return true;
         } else {
            this.O0000000000OOO(iBaritone);
            return false;
         }
      } else if (this.O0000000O00000 != AutoAncientBot.W55.PLACING_TNT
         && this.O0000000O00000 != AutoAncientBot.W55.IGNITING_TNT
         && this.O0000000O00000 != AutoAncientBot.W55.WAITING_EXPLOSION) {
         if (O0000000000.player.getHungerManager().getFoodLevel() <= 16 && O0000000000.player.canConsume(false)) {
            int var2 = this.O000000000O00();
            if (var2 == -1) {
               return false;
            } else {
               this.O0000000OOOO = true;
               this.O0000000OOO = var2;
               this.O0000000OOO0 = O0000000000.player.getInventory().getSelectedSlot();
               this.O0000000O00OOO.O00000000();
               if (!this.O0000000OOO0O) {
                  iBaritone.getCommandManager().execute("pause");
                  this.O0000000OOO0O = true;
               }

               this.O0000000000OOO();
               O0000O00O000O0.O00000000(this.O0000000OOO);
               O0000000000.options.useKey.setPressed(true);
               O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
               this.O00000000("eat " + this.O0000000OOO);
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void O0000000000OOO(IBaritone iBaritone) {
      if (O0000000000.options != null) {
         O0000000000.options.useKey.setPressed(false);
      }

      if (O0000000000.player != null && this.O0000000OOO0 >= 0 && this.O0000000OOO0 < 9) {
         O0000O00O000O0.O00000000(this.O0000000OOO0);
      }

      if (iBaritone != null && this.O0000000OOO0O) {
         iBaritone.getCommandManager().execute("resume");
      }

      this.O0000000OOO0O = false;
      this.O0000000OOOO = false;
      this.O0000000OOO = -1;
      this.O0000000OOO0 = -1;
   }

   private int O000000000O00() {
      if (O0000000000.player == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (this.O000000000(var1)) {
               return var1;
            }
         }

         return -1;
      }
   }

   private boolean O000000000(int i) {
      if (O0000000000.player != null && i >= 0 && i <= 8) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(i);
         return !var2.isEmpty() && var2.contains(DataComponentTypes.FOOD);
      } else {
         return false;
      }
   }

   private boolean O000000000O(IBaritone iBaritone) {
      if (O0000000000.player == null || O0000000000.world == null || O0000000000.options == null) {
         return false;
      } else if (!O0000000000.player.isInLava()) {
         if (this.O0000000OOO00O) {
            this.O000000000O000();
         }

         return false;
      } else {
         if (!this.O0000000OOO00O) {
            this.O0000000O0O00O.O00000000();
            this.O000000000("Упал в лаву — выбираюсь");
         }

         this.O0000000OOO00O = true;
         this.O0000000000OOO(iBaritone);
         this.O0000000000OOO();
         this.O0000000O0OOOO = null;
         BaritoneAPI.getSettings().assumeWalkOnLava.value = true;
         if (this.O0000000OO == null || this.O0000000O00OO0.O000000000000(2500L)) {
            BlockPos var2 = this.O0000000000(10);
            if (var2 != null) {
               this.O0000000OO = var2.toImmutable();
               this.O0000000O00OO0.O00000000();
               this.O00000000("lava escape " + this.O0000000OO.toShortString());
            }
         }

         if (this.O0000000OO != null) {
            this.O00000000(iBaritone, this.O0000000OO, 1);
         }

         if (this.O0000000OOOOO == AutoAncientBot.W54.IDLE && this.O000000000O0.O0000000000() && this.O0000000O0O00O.O000000000000(3500L)) {
            BlockPos var3 = this.O0000000000(24);
            if (var3 != null && this.O00000000(Vec3d.ofBottomCenter(var3), "выбираюсь из лавы")) {
               this.O0000000O0O00O.O00000000();
               O0000000000.options.jumpKey.setPressed(true);
               return true;
            }

            this.O0000000O0O00O.O00000000();
         }

         O0000000000.options.jumpKey.setPressed(true);
         return true;
      }
   }

   private void O000000000O000() {
      if (O0000000000.options != null) {
         O0000000000.options.jumpKey.setPressed(false);
      }

      if (this.O0000000OO000) {
         BaritoneAPI.getSettings().assumeWalkOnLava.value = false;
      }

      this.O0000000OOO00O = false;
      this.O0000000OO = null;
   }

   private BlockPos O0000000000(int i) {
      BlockPos var2 = O0000000000.player.getBlockPos();
      BlockPos var3 = null;
      double var4 = Double.MAX_VALUE;

      for (int var6 = -i; var6 <= i; var6++) {
         for (int var7 = -2; var7 <= 7; var7++) {
            for (int var8 = -i; var8 <= i; var8++) {
               BlockPos var9 = var2.add(var6, var7, var8);
               if (this.O0000000000OO(var9)) {
                  double var10 = O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(var9)) + Math.max(0, var7) * 0.6;
                  if (var10 < var4) {
                     var4 = var10;
                     var3 = var9.toImmutable();
                  }
               }
            }
         }
      }

      return var3;
   }

   private boolean O0000000000OO(BlockPos blockPos) {
      return this.O000000000O00O(blockPos.down())
         && this.O0000000000OO0(blockPos)
         && this.O0000000000OO0(blockPos.up())
         && !this.O0000000000OOO(blockPos.down())
         && !this.O0000000000OOO(blockPos)
         && !this.O0000000000OOO(blockPos.up());
   }

   private boolean O0000000000OO0(BlockPos blockPos) {
      BlockState var2 = O0000000000.world.getBlockState(blockPos);
      return var2.getFluidState().isEmpty() && var2.getCollisionShape(O0000000000.world, blockPos).isEmpty();
   }

   private boolean O0000000000OOO(BlockPos blockPos) {
      return O0000000000.world.getBlockState(blockPos).isOf(Blocks.LAVA);
   }

   private boolean O000000000O(BlockPos blockPos) {
      int var2 = 0;

      for (Direction var6 : Direction.values()) {
         BlockPos var7 = blockPos.offset(var6);
         if (this.O0000000000OOO(var7)) {
            var2++;
         } else if (this.O000000000O0(var7)) {
            return false;
         }
      }

      return var2 == 0 ? false : this.O0000000O0O0OO.computeIfAbsent(blockPos.toImmutable(), blockPosx -> this.O000000000(blockPosx, 4) == null);
   }

   private boolean O000000000O0(BlockPos blockPos) {
      BlockState var2 = O0000000000.world.getBlockState(blockPos);
      return var2.getFluidState().isEmpty() && var2.getCollisionShape(O0000000000.world, blockPos).isEmpty();
   }

   private boolean O000000000O0(IBaritone iBaritone) {
      if (O0000000000.player != null && iBaritone.getPathingBehavior().isPathing()) {
         Vec3d var2 = O0000000000.player.getPos();
         if (this.O0000000OOOO0O != null && !(var2.squaredDistanceTo(this.O0000000OOOO0O) > 0.04)) {
            return this.O0000000O00OO.O000000000000(2500L);
         } else {
            this.O0000000OOOO0O = var2;
            this.O0000000O00OO.O00000000();
            return false;
         }
      } else {
         this.O000000000O00O();
         return false;
      }
   }

   private void O000000000O00O() {
      this.O0000000OOOO0O = O0000000000.player == null ? null : O0000000000.player.getPos();
      this.O0000000O00OO.O00000000();
   }

   private void O000000000O00(IBaritone iBaritone) {
      this.O0000000000OOO();
      this.O00000000(O0000000000.player.getBlockPos(), 1);
      this.O0000000000OO();
      switch (this.O0000000O00000) {
         case MOVING_SEARCH:
            if (this.O0000000O0OO0 != null) {
               this.O00000000(iBaritone, this.O0000000O0OO0);
            }
            break;
         case MOVING_SITE:
            if (this.O0000000O0OO00 != null) {
               this.O00000000(iBaritone, this.O0000000O0OO00);
            }
            break;
         case CLEARING_SITE:
            if (this.O0000000O0OO0O != null) {
               this.O000000000(iBaritone, this.O0000000O0OO0O);
            }
            break;
         case PLACING_TNT:
         case IGNITING_TNT:
            if (this.O0000000O0OO0O != null) {
               this.O000000000(iBaritone, this.O0000000O0OO0O);
            }
      }

      this.O000000000O00O();
      this.O00000000("path rebuild");
   }

   private void O00000000(IBaritone iBaritone, BlockPos blockPos) {
      this.O00000000(iBaritone, blockPos, 1);
   }

   private void O000000000(IBaritone iBaritone, BlockPos blockPos) {
      this.O00000000(iBaritone, blockPos, 2);
   }

   private boolean O000000000O00(BlockPos blockPos) {
      return O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(blockPos)) <= 9.0;
   }

   private int O00000000000(int i) {
      return i + MathHelper.clamp(36 - i, -4, 4);
   }

   private int O000000000000(int i) {
      int var2 = Math.abs(i - 36);
      return Math.max(-120, 90 - var2 * 6);
   }

   private boolean O000000000O000(BlockPos blockPos) {
      return this.O0000000O0OO0O != null
         ? this.O00000000(blockPos, this.O0000000O0OO0O) <= 2304.0
         : this.O0000000O00000 == AutoAncientBot.W55.WAITING_EXPLOSION || this.O0000000O00000 == AutoAncientBot.W55.WAITING_SCAN;
   }

   private boolean O000000000(BlockPos blockPos, double d) {
      return O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(blockPos)) <= d;
   }

   private boolean O000000000O00O(BlockPos blockPos) {
      BlockState var2 = O0000000000.world.getBlockState(blockPos);
      return !var2.isReplaceable() && var2.getFluidState().isEmpty();
   }

   private boolean O000000000O0O(BlockPos blockPos) {
      for (Direction var5 : Direction.values()) {
         Block var6 = O0000000000.world.getBlockState(blockPos.offset(var5)).getBlock();
         if (this.O00000000(var6) || var6 == Blocks.LAVA) {
            return true;
         }
      }

      return false;
   }

   private boolean O00000000(Block block) {
      return block == Blocks.AIR || block == Blocks.CAVE_AIR || block == Blocks.VOID_AIR;
   }

   private boolean O000000000(Block block) {
      return block == Blocks.NETHERRACK
         || block == Blocks.BASALT
         || block == Blocks.SMOOTH_BASALT
         || block == Blocks.BLACKSTONE
         || block == Blocks.SOUL_SAND
         || block == Blocks.SOUL_SOIL
         || block == Blocks.GRAVEL
         || block == Blocks.NETHER_GOLD_ORE
         || block == Blocks.NETHER_QUARTZ_ORE;
   }

   private int O00000000(Item item) {
      if (O0000000000.player == null) {
         return -1;
      } else {
         for (int var2 = 0; var2 < 9; var2++) {
            if (O0000000000.player.getInventory().getStack(var2).isOf(item)) {
               return var2;
            }
         }

         return -1;
      }
   }

   private double O00000000(BlockPos blockPos, BlockPos blockPos2) {
      double var3 = blockPos.getX() - blockPos2.getX();
      double var5 = blockPos.getY() - blockPos2.getY();
      double var7 = blockPos.getZ() - blockPos2.getZ();
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   private double O000000000(BlockPos blockPos, BlockPos blockPos2) {
      double var3 = blockPos.getX() - blockPos2.getX();
      double var5 = blockPos.getZ() - blockPos2.getZ();
      return var3 * var3 + var5 * var5;
   }

   private void O00000000(AutoAncientBot.W55 o00000000000) {
      if (this.O0000000O00000 != o00000000000) {
         this.O00000000(this.O0000000O00000 + " -> " + o00000000000);
      }

      this.O0000000O00000 = o00000000000;
      this.O0000000O000O.O00000000();
      this.O0000000O00O0.O00000000();
   }

   private AncientXray O000000000O0O() {
      return WildClient.O00000000.O000000000.O00000000(AncientXray.class);
   }

   private void O00000000(String string) {
      if (this.O000000000O000.O0000000000()) {
         ChatUtil.O00000000("[AutoAncient] " + string);
      }
   }

   private void O000000000(String string) {
      if (this.O000000000O.O0000000000()) {
         ChatUtil.O00000000("[AutoAncient] " + string);
      }
   }

   private void O000000000O0O0() {
      if (this.O0000000O0OOO0 != null && this.O0000000O0000O == AutoAncientBot.W53.BREAKING) {
         if (!O0000000000.world.getBlockState(this.O0000000O0OOO0).isOf(Blocks.ANCIENT_DEBRIS)) {
            this.O000000O0000OO++;
            this.O000000000("Обломок добыт (всего: " + this.O000000O0000OO + ")");
         }
      }
   }

   private int O000000000(Item item) {
      if (O0000000000.player == null) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < 36; var3++) {
            ItemStack var4 = O0000000000.player.getInventory().getStack(var3);
            if (var4.isOf(item)) {
               var2 += var4.getCount();
            }
         }

         return var2;
      }
   }

   private boolean O000000000O000(IBaritone iBaritone) {
      if (this.O0000000OOOOO == AutoAncientBot.W54.IDLE) {
         return false;
      } else if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null && O0000000000.options != null) {
         if (O0000000000.player.isInLava()) {
            O0000000000.options.jumpKey.setPressed(true);
         }

         if (this.O000000O0000 >= 0 && this.O0000000OOOOO == AutoAncientBot.W54.AWAITING) {
            O0000O00O000O0.O00000000(this.O000000O0000);
            this.O000000O0000 = -1;
         }

         if (this.O0000000OOOOO == AutoAncientBot.W54.AIMING) {
            if (this.O0000000O0O0.O000000000000(2000L)) {
               this.O00000000("pearl aim timeout");
               this.O000000000O0OO();
               return false;
            } else {
               int var6 = this.O00000000(Items.ENDER_PEARL);
               if (var6 == -1) {
                  this.O000000000O0OO();
                  return false;
               } else {
                  O000000O0O00OO var7 = new O000000O0O00OO(this.O000000O00, this.O000000O000);
                  this.O00000000(var7);
                  if (new O000000O0O00OO(O0000000000.player).O00000000(var7) > 2.5F) {
                     return true;
                  } else {
                     Vec3d var4 = O0000000000.player.getEyePos().subtract(0.0, 0.1, 0.0);
                     AutoAncientBot.W56 var5 = this.O00000000(var4, this.O0000000OOOOO0);
                     if (var5 != null && !(var5.O0000000000 > 1.8) && this.O000000000(var5.O00000000000)) {
                        this.O000000O00 = var5.O00000000;
                        this.O000000O000 = var5.O000000000;
                        if (new O000000O0O00OO(O0000000000.player).O00000000(new O000000O0O00OO(this.O000000O00, this.O000000O000)) > 2.5F) {
                           return true;
                        } else {
                           this.O000000O0000 = O0000000000.player.getInventory().getSelectedSlot();
                           O0000O00O000O0.O00000000(var6);
                           O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
                           O0000000000.player.swingHand(Hand.MAIN_HAND);
                           this.O000000O000O0++;
                           this.O0000000O0O00.O00000000();
                           this.O0000000OOOOOO = O0000000000.player.getPos();
                           this.O0000000OOOOO = AutoAncientBot.W54.AWAITING;
                           this.O0000000O0O0.O00000000();
                           return true;
                        }
                     } else {
                        this.O00000000("pearl solution lost");
                        this.O000000000O0OO();
                        return false;
                     }
                  }
               }
            }
         } else {
            boolean var2 = this.O0000000OOOOO0 != null && O0000000000.player.squaredDistanceTo(this.O0000000OOOOO0) <= 25.0;
            boolean var3 = this.O0000000OOOOOO != null && O0000000000.player.getPos().squaredDistanceTo(this.O0000000OOOOOO) > 64.0;
            if (var2 || var3) {
               this.O000000000("Телепорт: " + this.O000000O0);
               this.O000000O00000 = 0;
               this.O000000O000000 = null;
               this.O000000000O00O(iBaritone);
               this.O000000000O0OO();
               return false;
            } else if (this.O0000000O0O0.O000000000000(5000L)) {
               this.O000000O00000++;
               this.O000000O000000 = this.O0000000OOOOO0;
               this.O000000000("Пёрка не долетела — эта цель в бане, иду пешком");
               this.O000000000O0OO();
               return false;
            } else {
               return true;
            }
         }
      } else {
         this.O000000000O0OO();
         return false;
      }
   }

   private void O000000000O00O(IBaritone iBaritone) {
      this.O00000000(O0000000000.player.getBlockPos(), 1);
      this.O0000000O0OO = null;
      if (this.O0000000O00000 == AutoAncientBot.W55.MINING) {
         this.O0000000O0000O = AutoAncientBot.W53.APPROACHING;
         this.O0000000O0OOOO = null;
         this.O0000000O00O00.O00000000();
      } else {
         this.O000000000O00(iBaritone);
      }

      this.O000000000O00O();
   }

   private void O000000000O0OO() {
      if (this.O000000O0000 >= 0) {
         O0000O00O000O0.O00000000(this.O000000O0000);
         this.O000000O0000 = -1;
      }

      this.O0000000OOOOO = AutoAncientBot.W54.IDLE;
      this.O0000000OOOOO0 = null;
      this.O000000O0 = null;
      this.O0000000OOOOOO = null;
   }

   private boolean O00000000(BlockPos blockPos, String string) {
      if (blockPos == null || !this.O000000000O0.O0000000000() || this.O0000000OOOOO != AutoAncientBot.W54.IDLE) {
         return false;
      } else if (!this.O000000000OO()) {
         return false;
      } else {
         Vec3d var3 = Vec3d.ofCenter(blockPos);
         if (var3.y - O0000000000.player.getY() > 2.5) {
            return false;
         } else {
            double var4 = var3.x - O0000000000.player.getX();
            double var6 = var3.z - O0000000000.player.getZ();
            double var8 = var4 * var4 + var6 * var6;
            double var10 = this.O000000000O00.O0000000000();
            if (var8 < var10 * var10) {
               return false;
            } else if (!this.O0000000O0O000.O000000000000(1200L)) {
               return false;
            } else {
               this.O0000000O0O000.O00000000();
               BlockPos var12 = blockPos;
               if (var8 > 729.0) {
                  Vec3d var13 = var3.subtract(O0000000000.player.getPos()).normalize();
                  var12 = BlockPos.ofFloored(O0000000000.player.getPos().add(var13.multiply(27.0)));
               }

               BlockPos var14 = this.O000000000(var12, 5);
               return var14 != null && this.O00000000(Vec3d.ofBottomCenter(var14), string);
            }
         }
      }
   }

   private boolean O000000000OO() {
      long var1 = 2500L * (1L + Math.min(this.O000000O00000, 3));
      return this.O0000000O0O00.O000000000000(var1);
   }

   private boolean O00000000(Vec3d vec3d, String string) {
      if (!this.O000000000O0.O0000000000() || this.O0000000OOOOO != AutoAncientBot.W54.IDLE || vec3d == null) {
         return false;
      } else if (O0000000000.player == null || O0000000000.interactionManager == null) {
         return false;
      } else if (this.O0000000OOOO || this.O0000000OOOO0) {
         return false;
      } else if (!this.O000000000OO()) {
         return false;
      } else if (this.O00000000(Items.ENDER_PEARL) == -1) {
         return false;
      } else {
         boolean var3 = O0000000000.player.isInLava();
         if (!var3 && O0000000000.player.getHealth() < 8.0F) {
            return false;
         } else if (!var3 && vec3d.y - O0000000000.player.getY() > 2.5) {
            return false;
         } else if (this.O000000O000000 != null && vec3d.squaredDistanceTo(this.O000000O000000) < 16.0) {
            return false;
         } else {
            Vec3d var4 = O0000000000.player.getEyePos().subtract(0.0, 0.1, 0.0);
            AutoAncientBot.W56 var5 = this.O00000000(var4, vec3d);
            if (var5 != null && !(var5.O0000000000 > 1.8) && this.O000000000(var5.O00000000000)) {
               this.O0000000OOOOO0 = vec3d;
               this.O000000O0 = string;
               this.O000000O00 = var5.O00000000;
               this.O000000O000 = var5.O000000000;
               this.O0000000OOOOO = AutoAncientBot.W54.AIMING;
               this.O0000000O0O0.O00000000();
               this.O0000000000OOO();
               this.O0000000000OO();
               this.O000000000("Кидаю пёрку: " + string + " → " + (int)Math.floor(vec3d.x) + " " + (int)Math.floor(vec3d.y) + " " + (int)Math.floor(vec3d.z));
               return true;
            } else {
               this.O00000000("pearl no solution: " + string);
               return false;
            }
         }
      }
   }

   private BlockPos O000000000(BlockPos blockPos, int i) {
      BlockPos var3 = null;
      double var4 = Double.MAX_VALUE;

      for (int var6 = -i; var6 <= i; var6++) {
         for (int var7 = -i; var7 <= i; var7++) {
            for (int var8 = -i; var8 <= i; var8++) {
               BlockPos var9 = blockPos.add(var6, var7, var8);
               if (this.O0000000000OO(var9)) {
                  double var10 = this.O00000000(var9, blockPos);
                  if (var10 < var4) {
                     var4 = var10;
                     var3 = var9.toImmutable();
                  }
               }
            }
         }
      }

      return var3;
   }

   private boolean O000000000(Vec3d vec3d) {
      BlockPos var2 = BlockPos.ofFloored(vec3d);
      if (!this.O0000000000OOO(var2) && !this.O0000000000OOO(var2.up())) {
         for (int var3 = 1; var3 <= 4; var3++) {
            BlockPos var4 = var2.down(var3);
            if (this.O0000000000OOO(var4)) {
               return false;
            }

            if (this.O000000000O00O(var4)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private AutoAncientBot.W56 O00000000(Vec3d vec3d, Vec3d vec3d2) {
      double var3 = vec3d2.x - vec3d.x;
      double var5 = vec3d2.z - vec3d.z;
      float var7 = (float)Math.toDegrees(Math.atan2(-var3, var5));
      AutoAncientBot.W56 var8 = null;

      for (float var9 = -6.0F; var9 <= 6.0F; var9 += 2.0F) {
         float var10 = var7 + var9;

         for (float var11 = -40.0F; var11 <= 80.0F; var11 += 2.0F) {
            AutoAncientBot.W56 var12 = this.O00000000(vec3d, vec3d2, var10, var11);
            if (var12 != null && (var8 == null || var12.O0000000000 < var8.O0000000000)) {
               var8 = var12;
            }
         }
      }

      if (var8 == null) {
         return null;
      } else {
         AutoAncientBot.W56 var13 = var8;

         for (float var14 = var8.O00000000 - 2.0F; var14 <= var8.O00000000 + 2.0F; var14 += 0.5F) {
            for (float var15 = var8.O000000000 - 2.0F; var15 <= var8.O000000000 + 2.0F; var15 += 0.3F) {
               AutoAncientBot.W56 var16 = this.O00000000(vec3d, vec3d2, var14, var15);
               if (var16 != null && var16.O0000000000 < var13.O0000000000) {
                  var13 = var16;
               }
            }
         }

         return var13;
      }
   }

   private AutoAncientBot.W56 O00000000(Vec3d vec3d, Vec3d vec3d2, float f, float g) {
      Vec3d var5 = this.O00000000(f, g);
      Vec3d var6 = this.O000000000(vec3d, var5);
      if (var6 == null) {
         return null;
      } else {
         double var7 = Math.sqrt(var6.squaredDistanceTo(vec3d2));
         return new AutoAncientBot.W56(MathHelper.wrapDegrees(f), MathHelper.clamp(g, -90.0F, 90.0F), var7, var6);
      }
   }

   private Vec3d O00000000(float f, float g) {
      float var3 = f * (float) (Math.PI / 180.0);
      float var4 = g * (float) (Math.PI / 180.0);
      double var5 = -MathHelper.sin(var3) * MathHelper.cos(var4);
      double var7 = -MathHelper.sin(var4);
      double var9 = MathHelper.cos(var3) * MathHelper.cos(var4);
      Vec3d var11 = new Vec3d(var5, var7, var9).normalize().multiply(1.5);
      Vec3d var12 = O0000000000.player.getMovement();
      return var11.add(var12.x, O0000000000.player.isOnGround() ? 0.0 : var12.y, var12.z);
   }

   private Vec3d O000000000(Vec3d vec3d, Vec3d vec3d2) {
      if (O0000000000.world == null) {
         return null;
      } else {
         Vec3d var3 = vec3d;
         Vec3d var4 = vec3d2;

         for (int var5 = 0; var5 < 160; var5++) {
            var4 = var4.subtract(0.0, 0.03, 0.0).multiply(0.99);
            Vec3d var6 = var3.add(var4);
            BlockHitResult var7 = O0000000000.world.raycast(new RaycastContext(var3, var6, ShapeType.COLLIDER, FluidHandling.NONE, O0000000000.player));
            if (var7.getType() != Type.MISS) {
               return var7.getPos();
            }

            var3 = var6;
         }

         return var3;
      }
   }

   private void O000000000OO0() {
      Settings var1 = BaritoneAPI.getSettings();
      this.O0000000OO0000 = (Boolean)var1.allowPlace.value;
      this.O0000000OO000O = (Boolean)var1.allowBreak.value;
      this.O0000000OO00O = (Boolean)var1.assumeWalkOnLava.value;
      this.O0000000OO00O0 = (Boolean)var1.walkWhileBreaking.value;
      List var2 = (List)var1.blocksToAvoid.value;
      this.O0000000OO00OO = (List<Block>)(Object)(var2 == null ? List.of() : new ArrayList<>(var2));
      List var3 = (List)var1.acceptableThrowawayItems.value;
      this.O0000000OO0O = (List<Item>)(Object)(var3 == null ? List.of() : new ArrayList<>(var3));
      var1.allowPlace.value = true;
      var1.allowBreak.value = true;
      var1.assumeWalkOnLava.value = false;
      var1.walkWhileBreaking.value = false;
      if (var2 != null) {
         var2.remove(Blocks.LAVA);
      }

      if (var3 != null) {
         var3.remove(Blocks.TNT.asItem());
         this.O00000000(var3, Blocks.NETHERRACK.asItem());
         this.O00000000(var3, Blocks.BLACKSTONE.asItem());
         this.O00000000(var3, Blocks.BASALT.asItem());
         this.O00000000(var3, Blocks.COBBLESTONE.asItem());
      }

      this.O0000000OO000 = true;
   }

   private void O000000000OO00() {
      if (this.O0000000OO000) {
         Settings var1 = BaritoneAPI.getSettings();
         var1.allowPlace.value = this.O0000000OO0000;
         var1.allowBreak.value = this.O0000000OO000O;
         var1.assumeWalkOnLava.value = this.O0000000OO00O;
         var1.walkWhileBreaking.value = this.O0000000OO00O0;
         List var2 = (List)var1.blocksToAvoid.value;
         if (var2 != null) {
            var2.clear();
            var2.addAll(this.O0000000OO00OO);
         }

         List var3 = (List)var1.acceptableThrowawayItems.value;
         if (var3 != null) {
            var3.clear();
            var3.addAll(this.O0000000OO0O);
         }

         this.O0000000OO000 = false;
      }
   }

   private void O00000000(List<Item> list, Item item) {
      if (!list.contains(item)) {
         list.add(item);
      }
   }

   static enum W52 {
      AIMING,
      BREAKING,
      STUCK,
      NO_REACH;
   }

   static enum W53 {
      APPROACHING,
      BREAKING;
   }

   static enum W54 {
      IDLE,
      AIMING,
      AWAITING;
   }

   static enum W55 {
      SEARCHING,
      MOVING_SEARCH,
      MOVING_SITE,
      CLEARING_SITE,
      PLACING_TNT,
      IGNITING_TNT,
      WAITING_EXPLOSION,
      WAITING_SCAN,
      MINING;
   }

   static final class W56 {
      final float O00000000;
      final float O000000000;
      final double O0000000000;
      final Vec3d O00000000000;

      W56(float f, float g, double d, Vec3d vec3d) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = d;
         this.O00000000000 = vec3d;
      }
   }
}
