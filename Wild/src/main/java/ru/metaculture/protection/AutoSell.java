package ru.metaculture.protection;

import java.util.Locale;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoSell",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматически выставляет предметы на продажу"
)
public class AutoSell extends Module {
   public static AutoSell O000000000O;
   private static final String O000000000O0OO = "По одной штуке";
   private static final String O000000000OO = "Все сразу";
   private static final String O000000000OO0 = "Одна цена";
   private static final int O000000000OO00 = 9;
   private static final long O000000000OO0O = 5000L;
   private static final long O000000000OOO = 12000L;
   private static final long O000000000OOO0 = 5000L;
   private ModeSetting O000000000OOOO = new ModeSetting("Сервер", "FunTime", "HolyWorld", "FunTime");
   public final ModeSetting O000000000O0 = new ModeSetting("Режим", "По бинду", "По бинду", "Авто");
   public final ModeSetting O000000000O00 = new ModeSetting("Режим продажи", "По одной штуке", "По одной штуке", "Все сразу", "Одна цена");
   public final NumberSetting O000000000O000 = new NumberSetting("Наценка %", 10.0F, 0.0F, 100.0F, 10.0F, false)
      .O00000000(() -> !this.O000000000O0.O000000000("По бинду") || this.O000000000O00.O000000000("Одна цена"));
   public final KeybindSetting O000000000O00O = new KeybindSetting("Бинд продажи", -1).O00000000(() -> !this.O000000000O0.O000000000("По бинду"));
   public final TextSetting O000000000O0O = new TextSetting("Цена одной продажи", "1000")
      .O00000000(32)
      .O00000000(() -> !this.O000000000O00.O000000000("Одна цена"));
   public final ModeSetting O000000000O0O0 = new ModeSetting("Выкладка одной цены", "По одной штуке", "По одной штуке", "Все сразу")
      .O00000000(() -> !this.O000000000O00.O000000000("Одна цена"));
   private final O0000O00O0000 O00000000O = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000O00 = new O0000O00O0000();
   private static final long O00000000O000 = 1000L;
   private static final long O00000000O0000 = 4000L;
   private static final long O00000000O000O = 1000L;
   private AutoSell.W75 O00000000O00O = AutoSell.W75.IDLE;
   private boolean O00000000O00O0 = false;
   private long O00000000O00OO = 0L;
   private String O00000000O0O = "";
   private boolean O00000000O0O0 = false;
   private String O00000000O0O00 = "";
   private String O00000000O0O0O = "";
   private Item O00000000O0OO = Items.AIR;
   private int O00000000O0OO0 = 0;
   private boolean O00000000O0OOO = false;
   private String O00000000OO = "";
   private String O00000000OO0 = "";
   private Item O00000000OO00 = Items.AIR;
   private boolean O00000000OO000 = false;
   private int O00000000OO00O = 0;
   private boolean O00000000OO0O = false;
   private boolean O00000000OO0O0 = false;
   private boolean O00000000OO0OO = false;
   private int O00000000OOO = 0;
   private int O00000000OOO0 = 0;
   private int O00000000OOO00 = 0;
   private int O00000000OOO0O = 0;
   private int O00000000OOOO = 9;
   private boolean O00000000OOOO0 = false;
   private boolean O00000000OOOOO = false;
   private boolean O0000000O = false;
   private int O0000000O0 = 0;
   private long O0000000O00 = 0L;
   private long O0000000O000 = 0L;
   private long O0000000O0000 = 0L;
   private long O0000000O00000 = 0L;
   private int O0000000O0000O = -1;

   public AutoSell() {
      O000000000O = this;
      this.O00000000(
         new Setting[]{
            this.O000000000OOOO, this.O000000000O0, this.O000000000O000, this.O000000000O00O, this.O000000000O00, this.O000000000O0O, this.O000000000O0O0
         }
      );
   }

   public boolean O0000000000O0() {
      return this.O000000000O0.O000000000("Авто");
   }

   public boolean O0000000000O00() {
      return this.O000000000OO00();
   }

   @Override
   public void O00000000() {
      super.O00000000();
      O000000OO000OO.O00000000(false);
      O000000OO000OO.O000000000(false);
      O000000OO000OO.O00000000();
      this.O0000000000O0O();
      this.O00000000O.O00000000();
   }

   @Override
   public void O000000000() {
      super.O000000000();
      if (this.O00000000O00O0) {
         O000000OO000OO.O00000000(false);
      }

      if (O000000OO000OO.O0000000000000()) {
         O000000OO000OO.O000000000(false);
      }

      O000000OO000OO.O00000000();
      this.O0000000000O0O();
   }

   public void O0000000000O0O() {
      this.O00000000O00O = AutoSell.W75.IDLE;
      this.O00000000O00O0 = false;
      this.O00000000O00OO = 0L;
      this.O00000000O0O = "";
      this.O00000000O0O0 = false;
      this.O00000000O0O00 = "";
      this.O00000000O0O0O = "";
      this.O00000000O0OO = Items.AIR;
      this.O00000000O0OO0 = 0;
      this.O00000000O0OOO = false;
      this.O00000000OO = "";
      this.O00000000OO0 = "";
      this.O00000000OO00 = Items.AIR;
      this.O00000000OO000 = false;
      this.O00000000OO00O = 0;
      this.O00000000OO0O = false;
      this.O00000000OO0O0 = false;
      this.O00000000OO0OO = false;
      this.O00000000OOO = 0;
      this.O00000000OOO0 = 0;
      this.O00000000OOO00 = 0;
      this.O00000000OOO0O = 0;
      this.O00000000OOOO = 9;
      this.O00000000OOOO0 = false;
      this.O00000000OOOOO = false;
      this.O0000000O = false;
      this.O0000000O0 = 0;
      this.O0000000O000 = 0L;
      this.O0000000O0000 = 0L;
      this.O0000000O00000 = 0L;
      this.O0000000O0000O = -1;
   }

   public static void O0000000000OO() {
      if (O000000000O != null) {
         O000000000O.O0000000000O0O();
      }
   }

   private void O0000000000OO0() {
      this.O0000000000(true);
   }

   private void O0000000000(boolean bl) {
      this.O0000000000O0O();
      this.O00000000O.O00000000();
      if (this.O000000000OO00()
         || this.O00000000O000()
         || !bl
         || !this.O0000000000O0()
         || !O000000OO000OO.O000000000000O()
         || !this.O00000000O00O0()
         || !this.O00000000O00OO()
         || !this.O0000000000OOO()) {
         O000000OO000OO.O00000000(true);
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (this.O000000000O0.O000000000("По бинду")
         && o0000000O0O0.O00000000000() == this.O000000000O00O.O0000000000()
         && !this.O00000000O00O0
         && O0000000000.player != null) {
         if (!this.O00000000000(O0000000000.player.getMainHandStack())) {
            ChatUtil.O00000000("§3[AutoSell] §fВозьмите предмет в руку");
            return;
         }

         this.O0000000000OOO();
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         boolean var2 = O000000OO000OO.O000000000000();
         boolean var3 = O000000OO000OO.O000000000000O();
         if (this.O0000000000O0() && this.O000000000OO00() && !this.O00000000O00O0) {
            if (this.O00000000O.O000000000000(500L)) {
               if (O000000OO000OO.O0000000000()) {
                  this.O00000000O00O0 = true;
                  this.O000000000OO0();
                  return;
               }

               if (var3) {
                  if (!this.O00000000O0OOO && !this.O00000000000(O0000000000.player.getMainHandStack())) {
                     this.O00000000O00OO();
                  }

                  if (!this.O0000000000OOO()) {
                     this.O00000000("§c[AutoSell] §fДля режима одной цены возьмите нужный предмет в руку или дождитесь покупки AutoBuy.");
                     this.O00000000O.O00000000();
                  }
               }
            }
         } else if (this.O0000000000O0() && !this.O00000000O00O0 && (!this.O00000000O000() || var2) && this.O00000000O.O000000000000(500L) && var3) {
            if (this.O00000000O000()) {
               if (!this.O0000000000OOO() && var2) {
                  O000000OO000OO.O00000000(true);
               }
            } else if (this.O00000000O00OO()) {
               this.O0000000000OOO();
            } else if (var2) {
               O000000OO000OO.O00000000(true);
            }
         }

         if (this.O00000000O00O0) {
            if (this.O000000000OO00() && this.O00000000O00O == AutoSell.W75.IDLE) {
               this.O000000000O0O();
               if (!this.O00000000O00O0 || this.O00000000O00O == AutoSell.W75.IDLE) {
                  return;
               }
            }

            switch (this.O00000000O00O) {
               case PREPARING:
                  if (this.O000000000OO00()) {
                     if (this.O00000000O000()) {
                        ChatUtil.O00000000("§c[AutoSell] §fРежим одной цены через sellgui доступен только для FunTime.");
                        this.O0000000000(false);
                        return;
                     }

                     if (O0000000000.currentScreen != null) {
                        this.O00000000O0();
                        this.O00000000O0.O00000000();
                        return;
                     }

                     if (!this.O000000000OO0O()) {
                        this.O0000000000OO0();
                        return;
                     }

                     if (!this.O000000000OOO()) {
                        this.O0000000000OO0();
                        return;
                     }

                     this.O00000000O00O = AutoSell.W75.SELLGUI_SELLING;
                     this.O00000000O0.O00000000();
                  } else if (this.O00000000O000()) {
                     if (O0000000000.currentScreen != null) {
                        this.O00000000O0();
                     }

                     this.O00000000O0000();
                     if ((!this.O00000000000(O0000000000.player.getMainHandStack()) || !this.O000000000000(O0000000000.player.getMainHandStack()))
                        && !this.O00000000O00OO()) {
                        if (this.O00000000O00.O000000000000(4000L)) {
                           this.O00000000000(true);
                        }

                        return;
                     }

                     this.O00000000O0OO0 = 0;
                     this.O00000000O00O = AutoSell.W75.HOLY_SELLING;
                     this.O00000000O0.O00000000();
                     this.O00000000O00.O00000000();
                  } else {
                     if (this.O0000000000O0()) {
                        if (!this.O00000000000(O0000000000.player.getMainHandStack()) && !this.O00000000O00OO()) {
                           this.O0000000000OO0();
                           return;
                        }
                     } else if (!this.O00000000000(O0000000000.player.getMainHandStack())) {
                        this.O0000000000OO0();
                        return;
                     }

                     if (this.O000000000O00.O000000000("По одной штуке")) {
                        this.O00000000O00O = AutoSell.W75.SPLITTING;
                     } else {
                        this.O00000000O00O = AutoSell.W75.SEARCHING;
                     }

                     this.O00000000O0.O00000000();
                  }
                  break;
               case SPLITTING:
                  if (this.O00000000O0.O000000000000(150L)) {
                     if (this.O00000000O000O()) {
                        this.O00000000O00O = AutoSell.W75.SEARCHING;
                     } else {
                        this.O0000000000OO0();
                     }

                     this.O00000000O0.O00000000();
                  }
                  break;
               case SEARCHING:
                  if (this.O00000000O0.O000000000000(50L)) {
                     ItemStack var10 = O0000000000.player.getMainHandStack();
                     if (var10.isEmpty()) {
                        this.O00000000O00O = AutoSell.W75.PREPARING;
                        return;
                     }

                     if (this.O000000000O00.O000000000("По одной штуке") && var10.getCount() > 1) {
                        this.O00000000O00O = AutoSell.W75.SPLITTING;
                        return;
                     }

                     String var12 = this.O0000000000000(var10);
                     if (var12.isEmpty()) {
                        ChatUtil.O00000000("§3[AutoSell] Не удалось определить имя предмета");
                        this.O0000000000OO0();
                        return;
                     }

                     this.O00000000O0O = var12;
                     if (O0000000000.currentScreen != null) {
                        if (O0000000000.currentScreen instanceof GenericContainerScreen var6) {
                           this.O0000000O0000O = ((GenericContainerScreenHandler)var6.getScreenHandler()).syncId;
                        }

                        this.O00000000O0();
                        this.O00000000O0.O00000000();
                        return;
                     }

                     this.O000000000O();
                     this.O00000000O00O = AutoSell.W75.SCANNING;
                     this.O00000000O0.O00000000();
                     this.O00000000O00.O00000000();
                  }
                  break;
               case SCANNING:
                  if (O0000000000.currentScreen instanceof GenericContainerScreen var9 && this.O0000000000000(var9)) {
                     if (this.O00000000O0.O000000000000(350L)) {
                        try {
                           this.O00000000000O0(var9);
                        } catch (Exception var8) {
                           this.O0000000000OO0();
                        }
                     }
                  } else {
                     if (this.O00000000O00() && this.O00000000O00.O000000000000(900L)) {
                        if (O0000000000.currentScreen != null) {
                           this.O00000000O0();
                        } else {
                           this.O000000000O();
                        }

                        this.O00000000O00.O00000000();
                     }

                     if (this.O00000000O0.O000000000000(this.O00000000O00() ? 6500L : 2000L)) {
                        this.O0000000000OO0();
                     }
                  }
                  break;
               case SELLING:
                  if (this.O00000000O0.O000000000000(50L)) {
                     if (this.O00000000O00OO > 0L) {
                        this.O000000000O0();
                     }

                     this.O00000000O00O = AutoSell.W75.FINISHING;
                     this.O00000000O0.O00000000();
                     this.O00000000O00.O00000000();
                  }
                  break;
               case FINISHING:
                  if (this.O00000000O00() && this.O00000000O00OO > 0L && this.O00000000O00.O000000000000(900L)) {
                     this.O000000000O0();
                     this.O00000000O00.O00000000();
                  }

                  if (this.O00000000O0.O000000000000(this.O00000000O00() ? 10000L : 8000L)) {
                     ChatUtil.O00000000("§e[AutoSell] §fНет ответа от аукциона, возвращаю AutoBuy.");
                     this.O0000000000(false);
                  }
                  break;
               case SELLGUI_SELLING:
                  this.O000000000000(false);
                  break;
               case SELLGUI_WAITING_RESULT:
                  this.O0000000000000(false);
                  break;
               case RESALE_SEARCH_OWN_AH:
                  this.O000000000O0O0();
                  break;
               case RESALE_WAITING_OWN_AH:
                  this.O000000000O0OO();
                  break;
               case RESALE_TAKE_ITEM:
                  this.O000000000OO();
                  break;
               case RESALE_SELLING:
                  this.O000000000000(true);
                  break;
               case RESALE_WAIT_SELL_RESULT:
                  this.O0000000000000(true);
                  break;
               case HOLY_SELLING:
                  if (this.O00000000O00.O000000000000(4000L)) {
                     this.O00000000000(true);
                  } else if (!this.O00000000000(O0000000000.player.getMainHandStack()) || !this.O000000000000(O0000000000.player.getMainHandStack())) {
                     this.O00000000O0OO0 = 0;
                     this.O00000000O00O = AutoSell.W75.PREPARING;
                     this.O00000000O0.O00000000();
                  } else if (this.O00000000O0OO0 == 0) {
                     this.O000000000O00();
                     this.O00000000O0OO0 = 1;
                     this.O00000000O0.O00000000();
                  } else if (this.O00000000O0OO0 == 1 && this.O00000000O0.O000000000000(1000L)) {
                     this.O000000000O000();
                     this.O00000000O0OO0 = 2;
                     this.O00000000O0.O00000000();
                  }
                  break;
               case HOLY_OPENING_AUCTION:
                  if (O0000000000.currentScreen instanceof GenericContainerScreen var4 && this.O00000000(var4)) {
                     this.O00000000000(false);
                  } else if (this.O00000000O0.O000000000000(1000L)) {
                     this.O000000000O00O();
                     this.O00000000O0.O00000000();
                  }
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
         String var5 = var2.content().getString();
         if (!this.O00000000000O(var5)) {
            if (this.O000000000000O(var5)) {
               O000000OO000OO.O00000000000OO();
               if (this.O00000000O00O0) {
                  if (this.O000000000OO00()) {
                     int var6 = Math.max(1, this.O00000000OOO0);
                     this.O00000000OOO00 += var6;
                     if (this.O00000000OOOOO) {
                        this.O00000000OOOO = Math.max(1, Math.min(this.O00000000OOOO, this.O00000000OOO00));
                     }

                     this.O00000000OOO0O = Math.max(0, this.O00000000OOO0O - var6);
                     this.O00000000OOO0 = 0;
                     this.O00000000OOOOO = false;
                     this.O00000000OO0O0 = false;
                     this.O00000000OO0O = true;
                     this.O0000000O0000 = System.currentTimeMillis();
                     return;
                  }

                  if (this.O00000000O000()) {
                     this.O000000000O00O();
                     this.O00000000O00O = AutoSell.W75.HOLY_OPENING_AUCTION;
                     this.O00000000O0.O00000000();
                     this.O00000000O00.O00000000();
                  } else {
                     this.O0000000000(true);
                  }
               }
            } else if (var5.contains("Не удалось выставить") && var5.contains("освободите хранилище")) {
               O000000OO000OO.O0000000000O();
               if (this.O00000000O00O0) {
                  if (this.O000000000OO00()) {
                     this.O00000000OO0O0 = true;
                     this.O00000000OOO0 = 0;
                     this.O00000000OOOOO = false;
                     return;
                  }

                  ChatUtil.O00000000("§c[AutoSell] Хранилище заполнено. Продажа приостановлена.");
                  this.O0000000000(false);
               }
            }
         } else {
            O000000OO000OO.O0000000000O0();
            if (this.O000000000OO00() && (this.O00000000O00O0 || this.O00000000OOO00 > 0)) {
               int var4 = this.O000000000(var5);
               this.O00000000OOO00 = Math.max(0, this.O00000000OOO00 - var4);
               this.O00000000OOO0O += var4;
               this.O0000000O0000 = System.currentTimeMillis();
               if (this.O00000000O00O0) {
                  this.O00000000O00O = AutoSell.W75.IDLE;
                  this.O00000000O0.O00000000();
               }

               return;
            }

            if (this.O00000000O00O0) {
               if (this.O00000000O000()) {
                  this.O00000000000(true);
               } else {
                  this.O0000000000(false);
               }
            }
         }
      }
   }

   private boolean O0000000000OOO() {
      if (this.O000000000OO00()) {
         if (this.O00000000O000()) {
            ChatUtil.O00000000("§c[AutoSell] §fРежим одной цены через sellgui доступен только для FunTime.");
            return false;
         }

         if (this.O00000000O() <= 0L) {
            ChatUtil.O00000000("§c[AutoSell] §fЦена одной продажи не задана.");
            return false;
         }

         if (!this.O000000000OO0O()) {
            return false;
         }
      } else if (this.O00000000O000() && !this.O00000000O0000()) {
         return false;
      }

      if (!O000000OO000OO.O00000000000O()) {
         return false;
      } else {
         if (this.O000000000OO00()) {
            this.O00000000OOO00 = 0;
            this.O00000000OOO0O = 0;
            this.O00000000OOOO = 9;
            this.O0000000O0000 = 0L;
            this.O00000000OOO0 = 0;
            this.O00000000OOOOO = false;
         }

         this.O00000000O00O0 = true;
         this.O00000000O00O = AutoSell.W75.PREPARING;
         this.O00000000O0.O00000000();
         this.O00000000O00.O00000000();
         return true;
      }
   }

   private void O000000000O() {
      if (O0000000000.player != null && !this.O00000000O0O.isEmpty()) {
         O0000000000.player.networkHandler.sendChatCommand("ah search " + this.O00000000O0O);
      }
   }

   private void O000000000O0() {
      if (O0000000000.player != null && this.O00000000O00OO > 0L) {
         O0000000000.player.networkHandler.sendChatCommand("ah sell " + this.O00000000O00OO);
      }
   }

   private void O00000000000(boolean bl) {
      this.O0000000000O0O();
      this.O00000000O.O00000000();
      O000000OO000OO.O00000000(bl);
   }

   private void O000000000O00() {
      if (O0000000000.player != null) {
         if (O0000000000.currentScreen != null) {
            O0000000000.player.closeScreen();
         }

         O0000000000.player.networkHandler.sendChatCommand("ah sell auto");
      }
   }

   private void O000000000O000() {
      if (O0000000000.player != null) {
         O0000000000.player.networkHandler.sendChatCommand("ah sell auto confirm");
      }
   }

   private void O000000000O00O() {
      if (O0000000000.player != null) {
         O0000000000.player.networkHandler.sendChatCommand("ah");
      }
   }

   private boolean O00000000(GenericContainerScreen genericContainerScreen) {
      if (genericContainerScreen == null) {
         return false;
      } else if (AutoBuy.O000000000O != null && AutoBuy.O000000000O.O00000000(genericContainerScreen)) {
         return true;
      } else {
         String var2 = this.O0000000000000(genericContainerScreen.getTitle().getString()).toLowerCase(Locale.ROOT);
         return var2.contains("аукцион") || var2.contains("auction");
      }
   }

   private void O000000000O0O() {
      if (this.O00000000OO0O0) {
         this.O000000000OO0();
      } else if (this.O00000000OOO0O > 0 && this.O000000000OOO()) {
         if (this.O00000000OOO00 < this.O00000000OOOO) {
            this.O00000000O00O = AutoSell.W75.SELLGUI_SELLING;
            this.O00000000O0.O00000000();
         } else {
            if (System.currentTimeMillis() - this.O0000000O0000 >= 5000L) {
               this.O000000000OO0();
            }
         }
      } else if (this.O00000000OOO00 > 0) {
         if (this.O000000000OOO() && this.O00000000OOO00 < this.O00000000OOOO) {
            this.O00000000O00O = AutoSell.W75.SELLGUI_SELLING;
            this.O00000000O0.O00000000();
         } else {
            if (System.currentTimeMillis() - this.O0000000O0000 >= 5000L) {
               this.O000000000OO0();
            }
         }
      } else if (this.O000000000OOO()) {
         this.O00000000O00O = AutoSell.W75.SELLGUI_SELLING;
         this.O00000000O0.O00000000();
      } else {
         this.O000000000000O(true);
      }
   }

   private void O000000000000(boolean bl) {
      if (this.O00000000O0.O000000000000(50L)) {
         if (this.O00000000OO0O0) {
            this.O000000000OO0();
         } else {
            long var2 = this.O00000000O();
            if (var2 <= 0L) {
               ChatUtil.O00000000("§c[AutoSell] §fЦена одной продажи не задана.");
               this.O000000000000O(false);
            } else if (this.O000000000OO0O() && this.O000000000OOO()) {
               if (O0000000000.currentScreen instanceof GenericContainerScreen var4 && this.O000000000000(var4)) {
                  this.O00000000(var4, bl);
               } else if (O0000000000.currentScreen != null) {
                  this.O00000000O0();
                  this.O00000000O0.O00000000();
               } else if (this.O000000000OOO0()) {
                  this.O000000000OOOO();
                  this.O00000000OO0O = false;
                  this.O00000000OO0O0 = false;
                  this.O00000000(var2);
                  this.O00000000O00O = bl ? AutoSell.W75.RESALE_WAIT_SELL_RESULT : AutoSell.W75.SELLGUI_WAITING_RESULT;
                  this.O00000000O0.O00000000();
                  this.O00000000O00.O00000000();
               }
            } else {
               this.O00000000O00O = AutoSell.W75.IDLE;
               this.O00000000O0.O00000000();
            }
         }
      }
   }

   private void O0000000000000(boolean bl) {
      if (this.O00000000OO0O0) {
         this.O000000000OO0();
      } else if (O0000000000.currentScreen instanceof GenericContainerScreen var2 && this.O000000000000(var2)) {
         this.O00000000(var2, bl);
      } else if (this.O00000000OO0O) {
         this.O00000000OO0O = false;
         this.O000000000OOOO();
         this.O00000000O00O = this.O00000000OOO00 > 0
            ? AutoSell.W75.IDLE
            : (this.O000000000OOO() ? (bl ? AutoSell.W75.RESALE_SELLING : AutoSell.W75.SELLGUI_SELLING) : AutoSell.W75.IDLE);
         this.O00000000O0.O00000000();
      } else {
         if (this.O00000000O0.O000000000000(12000L)) {
            this.O00000000O0();
            this.O00000000OOO0 = 0;
            this.O00000000O00O = this.O00000000OOO00 > 0
               ? AutoSell.W75.IDLE
               : (this.O000000000OOO() ? (bl ? AutoSell.W75.RESALE_SELLING : AutoSell.W75.SELLGUI_SELLING) : AutoSell.W75.IDLE);
            if (this.O00000000O00O == AutoSell.W75.IDLE && this.O00000000OOO00 <= 0) {
               this.O000000000000O(false);
            }

            this.O00000000O0.O00000000();
         }
      }
   }

   private void O000000000O0O0() {
      long var1 = System.currentTimeMillis();
      if (var1 >= this.O0000000O00000) {
         if (O0000000000.currentScreen != null) {
            this.O00000000O0();
            this.O0000000O00000 = var1 + 350L;
         } else if (!this.O0000000O && !this.O00000000OO0OO && this.O000000000OOO()) {
            this.O00000000O00O = AutoSell.W75.RESALE_SELLING;
            this.O00000000O0.O00000000();
         } else {
            this.O00000000OO0OO = false;
            if (O0000000000.player == null) {
               this.O000000000000O(false);
            } else {
               this.O0000000O0++;
               this.O00000000(O0000000000.player.getName().getString(), this.O0000000O0);
               this.O00000000OOO = 0;
               this.O00000000O00O = AutoSell.W75.RESALE_WAITING_OWN_AH;
               this.O00000000O0.O00000000();
               this.O00000000O00.O00000000();
            }
         }
      }
   }

   private void O000000000O0OO() {
      if (O0000000000.currentScreen instanceof GenericContainerScreen var1 && this.O000000000000O(var1)) {
         this.O00000000O00O = AutoSell.W75.RESALE_TAKE_ITEM;
         this.O00000000O0.O00000000();
      } else if (this.O00000000O00.O000000000000(18000L)) {
         ChatUtil.O00000000("§c[AutoSell] §fТаймаут поиска своих товаров.");
         this.O000000000000O(false);
      } else if (O0000000000.currentScreen != null && this.O00000000O0.O000000000000(1200L)) {
         this.O00000000O0();
         this.O00000000O00O = AutoSell.W75.RESALE_SEARCH_OWN_AH;
         this.O0000000O00000 = System.currentTimeMillis() + 350L;
         this.O00000000O0.O00000000();
      } else if (this.O00000000O0.O000000000000(4000L)) {
         this.O00000000O00O = AutoSell.W75.RESALE_SEARCH_OWN_AH;
         this.O0000000O00000 = System.currentTimeMillis();
         this.O00000000O0.O00000000();
      }
   }

   private void O000000000OO() {
      if (this.O00000000O0.O000000000000(200L)) {
         if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
            if (!this.O000000000000O(var1)) {
               if (this.O00000000O0.O000000000000(10000L)) {
                  this.O00000000O0();
                  this.O00000000O00O = AutoSell.W75.RESALE_SEARCH_OWN_AH;
                  this.O00000000O0.O00000000();
               }
            } else {
               int var3 = this.O000000000(var1);
               if (var3 != -1) {
                  this.O00000000(var1, var3, 0, SlotActionType.QUICK_MOVE);
                  this.O00000000OOO = 0;
                  this.O00000000O0.O00000000();
               } else if (this.O00000000OOO++ < 2) {
                  this.O00000000O0.O00000000();
               } else {
                  this.O00000000O0();
                  this.O00000000OO0O0 = false;
                  if (!this.O000000000OOO()) {
                     ChatUtil.O00000000("§e[AutoSell] §fСвои лоты не найдены, предметов в инвентаре нет.");
                     this.O000000000000O(true);
                  } else {
                     this.O0000000O = false;
                     this.O00000000O00O = AutoSell.W75.RESALE_SELLING;
                     this.O00000000O0.O00000000();
                  }
               }
            }
         } else {
            this.O00000000O00O = AutoSell.W75.RESALE_SEARCH_OWN_AH;
            this.O00000000O0.O00000000();
         }
      }
   }

   private void O00000000(GenericContainerScreen genericContainerScreen, boolean bl) {
      ScreenHandler var3 = genericContainerScreen.getScreenHandler();
      int var4 = this.O00000000000O(genericContainerScreen);
      if (this.O00000000OO000) {
         if (this.O00000000O0.O000000000000(1500L)) {
            this.O00000000O0();
         }
      } else {
         int var5 = 0;

         for (int var6 = this.O00000000000O(bl); var5 < 4 && this.O00000000OO00O < var6; var5++) {
            int var7 = this.O0000000000(genericContainerScreen);
            int var8 = this.O00000000(var3, var4);
            if (var7 == -1) {
               this.O00000000OOOO0 = true;
               break;
            }

            if (var8 == -1) {
               break;
            }

            if (this.O000000000O0O0.O000000000("По одной штуке")) {
               if (!this.O00000000(var3, var8, var7)) {
                  break;
               }
            } else {
               O0000000000.interactionManager.clickSlot(var3.syncId, var8, 0, SlotActionType.PICKUP, O0000000000.player);
               O0000000000.interactionManager.clickSlot(var3.syncId, var7, 0, SlotActionType.PICKUP, O0000000000.player);
            }

            this.O00000000OO00O++;
         }

         if (var5 > 0) {
            this.O00000000O0.O00000000();
         } else if (this.O00000000OO00O > 0) {
            int var9 = this.O00000000000(genericContainerScreen);
            if (var9 != -1) {
               this.O00000000(genericContainerScreen, var9, 0, SlotActionType.PICKUP);
               this.O00000000OO000 = true;
               this.O00000000OOO0 = this.O00000000OO00O;
               this.O00000000OOOOO = this.O00000000OOOO0;
               if (this.O00000000OOOO0) {
                  this.O00000000OOOO = Math.max(1, this.O00000000OO00O);
               }

               this.O00000000O0.O00000000();
            } else {
               if (this.O00000000O0.O000000000000(3000L)) {
                  this.O00000000O0();
                  this.O00000000O00O = bl ? AutoSell.W75.RESALE_SELLING : AutoSell.W75.SELLGUI_SELLING;
                  this.O00000000O0.O00000000();
               }
            }
         } else {
            this.O00000000O0();
            if (this.O00000000OOOO0 && this.O00000000OOO00 > 0) {
               this.O00000000OOOO = Math.max(1, Math.min(this.O00000000OOOO, this.O00000000OOO00));
               this.O00000000("§e[AutoSell] §fВ sellgui нет свободных слотов, жду перевыставление.");
            }

            this.O00000000O00O = bl ? AutoSell.W75.RESALE_SEARCH_OWN_AH : AutoSell.W75.IDLE;
            if (this.O00000000O00O == AutoSell.W75.IDLE && this.O00000000OOO00 <= 0) {
               this.O000000000000O(true);
            } else {
               this.O00000000O0.O00000000();
            }
         }
      }
   }

   private void O000000000OO0() {
      this.O00000000OO0O0 = false;
      this.O00000000OO0O = false;
      this.O00000000OO0OO = true;
      this.O0000000O = true;
      this.O00000000OOO = 0;
      this.O00000000OOO00 = 0;
      this.O00000000OOO0O = 0;
      this.O00000000OOOO0 = false;
      this.O00000000OOOOO = false;
      this.O0000000O0 = 0;
      this.O0000000O00000 = System.currentTimeMillis() + 350L;
      this.O000000000OOOO();
      this.O00000000O00O = AutoSell.W75.RESALE_SEARCH_OWN_AH;
      this.O00000000O0.O00000000();
      this.O00000000O00.O00000000();
      this.O00000000O0();
      O000000OO000OO.O00000000(false);
      O000000OO000OO.O00000000000O0();
   }

   private void O000000000000O(boolean bl) {
      if (O000000OO000OO.O0000000000000()) {
         O000000OO000OO.O000000000(bl);
      }

      this.O0000000000(bl);
   }

   private boolean O000000000OO00() {
      return this.O000000000O00.O000000000("Одна цена");
   }

   private void O00000000(String string) {
      long var2 = System.currentTimeMillis();
      if (var2 - this.O0000000O000 >= 3000L) {
         this.O0000000O000 = var2;
         ChatUtil.O00000000(string);
      }
   }

   private boolean O000000000OO0O() {
      if (this.O00000000O0OOO) {
         return true;
      } else if (O0000000000.player != null && this.O00000000000(O0000000000.player.getMainHandStack())) {
         this.O00000000(O0000000000.player.getMainHandStack());
         return true;
      } else {
         AutoBuy.W62 var1 = AutoBuy.O0000000000O0O();
         if (var1 != null) {
            this.O00000000O0OOO = true;
            this.O00000000OO = var1.O000000000 == null ? "" : var1.O000000000;
            this.O00000000OO0 = var1.O00000000 == null ? "" : var1.O00000000;
            this.O00000000OO00 = Items.AIR;
            return true;
         } else {
            return false;
         }
      }
   }

   private void O00000000(ItemStack itemStack) {
      if (this.O00000000000(itemStack)) {
         this.O00000000O0OOO = true;
         this.O00000000OO = this.O0000000000000(itemStack);
         this.O00000000OO0 = itemStack.getName().getString();
         this.O00000000OO00 = itemStack.getItem();
      }
   }

   private boolean O000000000OOO() {
      if (O0000000000.player == null) {
         return false;
      } else if (this.O000000000(O0000000000.player.getMainHandStack())) {
         return true;
      } else {
         for (int var1 = 0; var1 < 36; var1++) {
            if (this.O000000000(O0000000000.player.getInventory().getStack(var1))) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean O000000000(ItemStack itemStack) {
      if (this.O00000000000(itemStack) && this.O00000000O0OOO) {
         if (this.O00000000OO00 != Items.AIR && itemStack.getItem() != this.O00000000OO00) {
            return false;
         } else {
            String var2 = this.O000000000000(this.O0000000000000(itemStack));
            String var3 = this.O000000000000(this.O00000000OO);
            String var4 = this.O000000000000(this.O00000000OO0);
            if (var3.isEmpty() && var4.isEmpty()) {
               return true;
            } else {
               if (!var2.isEmpty()) {
                  if (var2.equals(var3) || var2.equals(var4) || !var3.isEmpty() && (var2.contains(var3) || var3.contains(var2))) {
                     return true;
                  }

                  if (!var4.isEmpty()) {
                     if (var2.contains(var4)) {
                        return true;
                     }

                     if (var4.contains(var2)) {
                        return true;
                     }
                  }
               }

               return false;
            }
         }
      } else {
         return false;
      }
   }

   private int O00000000(ScreenHandler screenHandler, int i) {
      for (int var3 = i; var3 < screenHandler.slots.size(); var3++) {
         Slot var4 = screenHandler.getSlot(var3);
         if (var4.hasStack() && this.O000000000(var4.getStack())) {
            return var3;
         }
      }

      return -1;
   }

   private int O000000000(GenericContainerScreen genericContainerScreen) {
      int var2 = this.O00000000000O(genericContainerScreen);

      for (int var3 = 0; var3 < var2; var3++) {
         Slot var4 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var3);
         if (var4.hasStack() && this.O000000000(var4.getStack())) {
            return var3;
         }
      }

      return -1;
   }

   private int O0000000000(GenericContainerScreen genericContainerScreen) {
      int var2 = Math.min(9, this.O00000000000O(genericContainerScreen));

      for (int var3 = 0; var3 < var2; var3++) {
         Slot var4 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var3);
         if (!var4.hasStack()) {
            return var3;
         }
      }

      return -1;
   }

   private int O00000000000(GenericContainerScreen genericContainerScreen) {
      int var2 = this.O00000000000O(genericContainerScreen);
      int var3 = -1;

      for (int var4 = var2 - 1; var4 >= 0; var4--) {
         Slot var5 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var4);
         if (var5.hasStack()) {
            ItemStack var6 = var5.getStack();
            String var7 = this.O0000000000000(var6.getName().getString()).toLowerCase(Locale.ROOT);
            if (var6.isOf(Items.LIME_DYE)
               || var6.isOf(Items.GREEN_DYE)
               || var6.isOf(Items.LIME_STAINED_GLASS_PANE)
               || var6.isOf(Items.GREEN_STAINED_GLASS_PANE)) {
               return var4;
            }

            if (var7.contains("выстав") || var7.contains("продать") || var7.contains("подтверд")) {
               var3 = var4;
            }
         }
      }

      return var3;
   }

   private boolean O000000000000(GenericContainerScreen genericContainerScreen) {
      if (genericContainerScreen == null) {
         return false;
      } else {
         String var2 = this.O0000000000000(genericContainerScreen.getTitle().getString()).toLowerCase(Locale.ROOT);
         return var2.contains("продажа") || var2.contains("sellgui") || var2.contains("sell gui");
      }
   }

   private boolean O0000000000000(GenericContainerScreen genericContainerScreen) {
      if (genericContainerScreen != null && ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).syncId != this.O0000000O0000O) {
         if (AhHelper.O00000000(genericContainerScreen)) {
            return true;
         } else {
            int var2 = Math.min(45, ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots.size());

            for (int var3 = 0; var3 < var2; var3++) {
               if (O00000000(((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var3)) > 0L) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean O000000000000O(GenericContainerScreen genericContainerScreen) {
      if (genericContainerScreen != null && O0000000000.player != null) {
         String var2 = this.O0000000000000(genericContainerScreen.getTitle().getString()).toLowerCase(Locale.ROOT);
         String var3 = this.O0000000000000(O0000000000.player.getName().getString()).toLowerCase(Locale.ROOT);
         return AhHelper.O00000000(genericContainerScreen)
            || var2.contains(var3)
            || var2.contains("мои товары")
            || var2.contains("мои предметы")
            || var2.contains("поиск:");
      } else {
         return false;
      }
   }

   private int O00000000000O(GenericContainerScreen genericContainerScreen) {
      int var2 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getRows();
      int var3 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots.size();
      return Math.max(0, Math.min(var2 * 9, var3));
   }

   private void O00000000(GenericContainerScreen genericContainerScreen, int i, int j, SlotActionType slotActionType) {
      O0000000000.interactionManager
         .clickSlot(((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).syncId, i, j, slotActionType, O0000000000.player);
   }

   private boolean O00000000(ScreenHandler screenHandler, int i, int j) {
      if (O0000000000.interactionManager != null && O0000000000.player != null) {
         O0000000000.interactionManager.clickSlot(screenHandler.syncId, i, 0, SlotActionType.PICKUP, O0000000000.player);
         if (screenHandler.getCursorStack().isEmpty()) {
            return false;
         } else {
            O0000000000.interactionManager.clickSlot(screenHandler.syncId, j, 1, SlotActionType.PICKUP, O0000000000.player);
            if (!screenHandler.getCursorStack().isEmpty()) {
               O0000000000.interactionManager.clickSlot(screenHandler.syncId, i, 0, SlotActionType.PICKUP, O0000000000.player);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private void O00000000(String string, int i) {
      if (O0000000000.player != null && string != null && !string.isBlank()) {
         String var3 = "ah " + string.trim();
         O0000000000.player.networkHandler.sendChatCommand(var3);
      }
   }

   private boolean O000000000OOO0() {
      return System.currentTimeMillis() - this.O0000000O00 >= 5000L;
   }

   private void O00000000(long l) {
      if (O0000000000.player != null) {
         O0000000000.player.networkHandler.sendChatCommand("ah sellgui " + l);
         this.O0000000O00 = System.currentTimeMillis();
      }
   }

   private void O000000000OOOO() {
      this.O00000000OO000 = false;
      this.O00000000OO00O = 0;
      this.O00000000OOO0 = 0;
      this.O00000000OOOO0 = false;
      this.O00000000OOOOO = false;
   }

   private long O00000000O() {
      return this.O00000000000(this.O000000000O0O.O0000000000());
   }

   private int O00000000000O(boolean bl) {
      if (bl) {
         return Integer.MAX_VALUE;
      } else {
         int var2 = Math.max(1, this.O00000000OOOO - this.O00000000OOO00);
         if (this.O00000000OOO0O > 0) {
            return Math.max(1, Math.min(this.O00000000OOO0O, var2));
         } else {
            return this.O00000000OOO00 > 0 ? var2 : Integer.MAX_VALUE;
         }
      }
   }

   private int O000000000(String string) {
      if (string == null) {
         return 1;
      } else {
         String var2 = this.O0000000000000(string).toLowerCase(Locale.ROOT);
         int var3 = var2.indexOf(" за ");
         if (var3 > 0) {
            var2 = var2.substring(0, var3);
         }

         int var4 = this.O00000000(var2, "x");
         if (var4 > 0) {
            return var4;
         } else {
            var4 = this.O00000000(var2, "х");
            if (var4 > 0) {
               return var4;
            } else {
               var4 = this.O000000000(var2, "предмет");
               if (var4 > 0) {
                  return var4;
               } else {
                  var4 = this.O000000000(var2, "шт");
                  return var4 > 0 ? var4 : 1;
               }
            }
         }
      }
   }

   private int O00000000(String string, String string2) {
      int var3 = string.indexOf(string2);
      if (var3 < 0) {
         return 0;
      } else {
         String var4 = string.substring(var3 + string2.length()).replaceFirst("[^0-9]*", "").replaceFirst("[^0-9].*$", "");
         return this.O0000000000(var4);
      }
   }

   private int O000000000(String string, String string2) {
      int var3 = string.indexOf(string2);
      if (var3 <= 0) {
         return 0;
      } else {
         String var4 = string.substring(0, var3).trim();
         String var5 = var4.replaceFirst("^.*?([0-9]+)\\s*$", "$1");
         return var5.equals(var4) && !var5.matches("[0-9]+") ? 0 : this.O0000000000(var5);
      }
   }

   private int O0000000000(String string) {
      if (string != null && !string.isBlank()) {
         try {
            return Math.max(0, Integer.parseInt(string));
         } catch (NumberFormatException var3) {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private long O00000000000(String string) {
      if (string == null) {
         return 0L;
      } else {
         String var2 = string.toLowerCase(Locale.ROOT).replace(" ", "").replace("_", "").replace(",", "").replace(".", "");
         long var3 = 1L;
         if (var2.endsWith("тысяч")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 5);
         } else if (var2.endsWith("тысячи")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 6);
         } else if (var2.endsWith("тысяча")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 6);
         } else if (var2.endsWith("тыс")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 3);
         } else if (var2.endsWith("k") || var2.endsWith("к")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 1);
         } else if (var2.endsWith("m") || var2.endsWith("м")) {
            var3 = 1000000L;
            var2 = var2.substring(0, var2.length() - 1);
         }

         String var5 = var2.replaceAll("[^0-9]", "");
         if (var5.isEmpty()) {
            return 0L;
         } else {
            try {
               return Math.multiplyExact(Long.parseLong(var5), var3);
            } catch (NumberFormatException | ArithmeticException var7) {
               return 0L;
            }
         }
      }
   }

   private void O00000000O0() {
      if (O0000000000.player != null) {
         O0000000000.player.closeHandledScreen();
      }
   }

   private boolean O00000000O00() {
      return AutoBuy.O000000000O != null && AutoBuy.O000000000O.O000000000O00O.O000000000("FunTime");
   }

   private boolean O00000000O000() {
      return this.O000000000OO00()
         ? this.O000000000OOOO.O000000000("HolyWorld")
         : this.O000000000OOOO.O000000000("HolyWorld") || AutoBuy.O000000000O != null && AutoBuy.O000000000O.O000000000O00O.O000000000("HolyWorld");
   }

   private boolean O00000000O0000() {
      if (!this.O00000000O000()) {
         return true;
      } else if (this.O00000000O0O0) {
         return true;
      } else {
         AutoBuy.W62 var1 = AutoBuy.O0000000000O0O();
         if (var1 != null) {
            this.O00000000O0O0 = true;
            this.O00000000O0O00 = var1.O000000000 == null ? "" : var1.O000000000;
            this.O00000000O0O0O = var1.O00000000 == null ? "" : var1.O00000000;
            this.O00000000O0OO = Items.AIR;
            return true;
         } else if (O0000000000.player != null && this.O00000000000(O0000000000.player.getMainHandStack())) {
            this.O0000000000(O0000000000.player.getMainHandStack());
            return true;
         } else {
            return false;
         }
      }
   }

   private void O0000000000(ItemStack itemStack) {
      if (this.O00000000000(itemStack)) {
         this.O00000000O0O0 = true;
         this.O00000000O0O00 = this.O0000000000000(itemStack);
         this.O00000000O0O0O = itemStack.getName().getString();
         this.O00000000O0OO = itemStack.getItem();
      }
   }

   private boolean O00000000O000O() {
      if (O0000000000.player != null && O0000000000.interactionManager != null && O0000000000.player.playerScreenHandler != null) {
         ItemStack var1 = O0000000000.player.getMainHandStack();
         if (var1.isEmpty()) {
            return false;
         } else if (var1.getCount() == 1) {
            return true;
         } else {
            int var2 = this.O00000000O00O();
            if (var2 == -1) {
               ChatUtil.O00000000("§3[AutoSell] Нет места для стака");
               return false;
            } else {
               int var3 = O0000000000.player.getInventory().getSelectedSlot() + 36;
               O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var3, 0, SlotActionType.PICKUP, O0000000000.player);
               O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var3, 1, SlotActionType.PICKUP, O0000000000.player);
               O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var2, 0, SlotActionType.PICKUP, O0000000000.player);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private int O00000000O00O() {
      if (O0000000000.player == null) {
         return -1;
      } else {
         for (int var1 = 9; var1 < 36; var1++) {
            if (O0000000000.player.getInventory().getStack(var1).isEmpty()) {
               return var1;
            }
         }

         for (int var2 = 36; var2 < 45; var2++) {
            if (var2 != O0000000000.player.getInventory().getSelectedSlot() + 36 && O0000000000.player.getInventory().getStack(var2 - 36).isEmpty()) {
               return var2;
            }
         }

         return -1;
      }
   }

   private boolean O00000000O00O0() {
      if (O0000000000.player == null) {
         return false;
      } else if (this.O00000000000(O0000000000.player.getMainHandStack())) {
         return true;
      } else {
         for (int var1 = 0; var1 < 36; var1++) {
            if (this.O00000000000(O0000000000.player.getInventory().getStack(var1))) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean O00000000O00OO() {
      if (O0000000000.player != null && O0000000000.interactionManager != null && O0000000000.player.playerScreenHandler != null) {
         if (this.O00000000O000()) {
            if (!this.O00000000O0000()) {
               return false;
            }

            if (this.O00000000O0O0) {
               return this.O00000000O0O();
            }
         }

         if (this.O00000000000(O0000000000.player.getMainHandStack())) {
            return true;
         } else {
            for (int var1 = 0; var1 < 9; var1++) {
               if (this.O00000000000(O0000000000.player.getInventory().getStack(var1))) {
                  O0000O00O000O0.O00000000(var1);
                  this.O00000000O0.O00000000();
                  return true;
               }
            }

            for (int var2 = 9; var2 < 36; var2++) {
               if (this.O00000000000(O0000000000.player.getInventory().getStack(var2))) {
                  O0000000000.interactionManager
                     .clickSlot(
                        O0000000000.player.playerScreenHandler.syncId,
                        var2,
                        O0000000000.player.getInventory().getSelectedSlot(),
                        SlotActionType.SWAP,
                        O0000000000.player
                     );
                  this.O00000000O0.O00000000();
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean O00000000O0O() {
      if (O0000000000.player != null && O0000000000.interactionManager != null && O0000000000.player.playerScreenHandler != null) {
         ItemStack var1 = O0000000000.player.getMainHandStack();
         if (this.O000000000000(var1)) {
            this.O0000000000(var1);
            return true;
         } else {
            for (int var2 = 0; var2 < 9; var2++) {
               ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
               if (this.O000000000000(var3)) {
                  this.O0000000000(var3);
                  O0000O00O000O0.O00000000(var2);
                  this.O00000000O0.O00000000();
                  return true;
               }
            }

            int var5 = O0000000000.player.getInventory().getSelectedSlot();

            for (int var6 = 9; var6 < 36; var6++) {
               ItemStack var4 = O0000000000.player.getInventory().getStack(var6);
               if (this.O000000000000(var4)) {
                  this.O0000000000(var4);
                  O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var6, var5, SlotActionType.SWAP, O0000000000.player);
                  this.O00000000O0.O00000000();
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean O00000000000(ItemStack itemStack) {
      return itemStack != null && !itemStack.isEmpty() && itemStack.getItem() != Items.AIR;
   }

   private boolean O000000000000(ItemStack itemStack) {
      if (this.O00000000000(itemStack) && this.O00000000O0O0) {
         if (this.O00000000O0OO != Items.AIR && itemStack.getItem() != this.O00000000O0OO) {
            return false;
         } else {
            O000000OOOO000.W120 var2 = O000000OOOO000.O0000000000(this.O00000000O0O00);
            if (var2 == null) {
               var2 = O000000OOOO000.O0000000000(this.O00000000O0O0O);
            }

            if (var2 != null && O000000OOOO000.O00000000(var2, itemStack, O000000OOOO000.O000000000000(itemStack), O000000OOOO000.O0000000000000(itemStack))) {
               return true;
            } else {
               String var3 = this.O000000000000(this.O0000000000000(itemStack));
               String var4 = this.O000000000000(this.O00000000O0O00);
               String var5 = this.O000000000000(this.O00000000O0O0O);
               return var4.isEmpty() && var5.isEmpty()
                  ? true
                  : !var3.isEmpty()
                     && (
                        var3.equals(var4)
                           || var3.equals(var5)
                           || !var4.isEmpty() && (var3.contains(var4) || var4.contains(var3))
                           || !var5.isEmpty() && (var3.contains(var5) || var5.contains(var3))
                     );
            }
         }
      } else {
         return false;
      }
   }

   private void O00000000000O0(GenericContainerScreen genericContainerScreen) {
      double var2 = Double.MAX_VALUE;
      boolean var4 = false;
      int var5 = Math.min(45, ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots.size());

      for (int var6 = 0; var6 < var5; var6++) {
         Slot var7 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var6);
         if (var7.hasStack()) {
            long var8 = O00000000(var7);
            if (var8 > 0L) {
               int var10 = Math.max(1, var7.getStack().getCount());
               double var11 = (double)var8 / var10;
               if (var11 < var2) {
                  var2 = var11;
                  var4 = true;
               }
            }
         }
      }

      String var19 = O0000000000.player != null ? this.O0000000000000(O0000000000.player.getMainHandStack()) : "";
      int var20 = O0000000000.player != null ? Math.max(1, O0000000000.player.getMainHandStack().getCount()) : 1;
      int var21 = this.O000000000O00.O000000000("Все сразу") ? var20 : 1;
      long var9 = AutoBuy.O00000000(var19);
      long var22 = var9 > 0L ? Math.max(1L, (long)Math.ceil(var9 * 1.02 * var21)) : 1L;
      if (O0000000000.player != null) {
         O0000000000.player.closeScreen();
      }

      if (var4) {
         long var13 = this.O000000000O00.O000000000("Все сразу") ? (long)(var2 * var20) : (long)var2;
         long var15;
         if (this.O0000000000O0()) {
            var15 = var13 - 1L;
            if (var9 > 0L && var15 < var22) {
               var15 = var22;
            }

            if (var15 < 1L) {
               var15 = 1L;
            }
         } else {
            double var17 = 1.0 + this.O000000000O000.O0000000000() / 100.0;
            var15 = (long)(var13 * var17);
         }

         this.O00000000O00OO = var15;
         this.O00000000O00O = AutoSell.W75.SELLING;
         this.O00000000O0.O00000000();
      } else if (this.O0000000000O0() && var9 > 0L) {
         this.O00000000O00OO = var22;
         this.O00000000O00O = AutoSell.W75.SELLING;
         this.O00000000O0.O00000000();
      } else {
         ChatUtil.O00000000("§3[AutoSell] Конкурентов нет, ставьте вручную");
         this.O0000000000(false);
      }
   }

   private String O0000000000000(ItemStack itemStack) {
      String var2 = itemStack.getName().getString();
      if (var2.contains("TIER WHITE")) {
         return "вайт";
      } else if (var2.contains("TIER BLACK")) {
         return "блэк";
      } else if (var2.contains("Рассадник монстров")) {
         return "Спавнер";
      } else if (var2.contains("Прогрузчик чанков [1x1]")) {
         return "Прогрузчик чанков";
      } else if (var2.contains("Яйцо призыва зомби-крестьянина")) {
         return "Яйцо зомби-крестьянина";
      } else {
         String var3 = var2.replaceAll("(?i)§.", "")
            .replaceAll("(?i)&.", "")
            .replace(' ', ' ')
            .replaceAll("\\[[^\\]]*]", " ")
            .replaceAll("[★✦✧✪✫✬✭✮✯✰❄☃⚒☠❤❣♕♛♜♞♟\ud83c\udf79]", " ")
            .replace("xxx", " ")
            .replaceAll("\\s+", " ")
            .trim();
         if (var3.isEmpty()) {
            var3 = this.O0000000000000(itemStack.getItem().getName().getString());
         }

         return var3;
      }
   }

   private String O000000000000(String string) {
      return O000000OOOO000.O000000000000O(this.O0000000000000(string)).toLowerCase(Locale.ROOT).replaceAll("[^\\p{L}\\p{N}]+", "");
   }

   private String O0000000000000(String string) {
      return string == null ? "" : string.replaceAll("§.", "").replace(' ', ' ').trim();
   }

   private boolean O000000000000O(String string) {
      if (string == null) {
         return false;
      } else {
         String var2 = this.O0000000000000(string).toLowerCase(Locale.ROOT);
         return var2.contains("выстав") && var2.contains("продаж");
      }
   }

   private boolean O00000000000O(String string) {
      if (string == null) {
         return false;
      } else {
         String var2 = this.O0000000000000(string).toLowerCase(Locale.ROOT);
         return !var2.contains("у вас купили") || !var2.contains("на /ah") && !var2.contains(" за ")
            ? var2.contains("купил у вас") && var2.contains(" за ") && (var2.contains("¤") || var2.contains("$"))
            : true;
      }
   }

   public static long O00000000(Slot slot) {
      if (!slot.hasStack()) {
         return 0L;
      } else {
         ItemStack var1 = slot.getStack();
         LoreComponent var2 = (LoreComponent)var1.getComponents().get(DataComponentTypes.LORE);
         if (var2 != null) {
            for (Text var4 : var2.lines()) {
               String var5 = var4.getString();
               if (var5.contains("$") || var5.contains("Цена")) {
                  String var6 = var5.replaceAll("[^0-9]", "");
                  if (!var6.isEmpty()) {
                     try {
                        return Long.parseLong(var6);
                     } catch (NumberFormatException var8) {
                     }
                  }
               }
            }
         }

         return 0L;
      }
   }

   static enum W75 {
      IDLE,
      PREPARING,
      SPLITTING,
      SEARCHING,
      SCANNING,
      SELLING,
      FINISHING,
      SELLGUI_SELLING,
      SELLGUI_WAITING_RESULT,
      RESALE_SEARCH_OWN_AH,
      RESALE_WAITING_OWN_AH,
      RESALE_TAKE_ITEM,
      RESALE_SELLING,
      RESALE_WAIT_SELL_RESULT,
      HOLY_SELLING,
      HOLY_OPENING_AUCTION;
   }
}
