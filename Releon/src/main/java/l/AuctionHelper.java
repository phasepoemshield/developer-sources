package l;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.Mouse;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFW;

public class AuctionHelper extends Helper242 {
   static final long PULSE_MS = 900L;
   static final float PULSE_MIN_ALPHA = 0.35F;
   static final float PULSE_MAX_ALPHA = 1.0F;
   static final long RECALC_MIN_MS = 90L;
   static final long RECALC_IDLE_MS = 650L;
   static final int IGNORE_CONTROL_ROW_Y = 104;
   static final int PANEL_W = 260;
   static final int PANEL_PAD = 8;
   static final int PANEL_MAX = 8;
   static final int HEADER_H = 26;
   static final int ENTRY_H = 28;
   static final long BUY_KEEP_MS = 900000L;
   static final int BUY_MAX = 80;
   static final long SNAP_KEEP_MS = 12000L;
   static final int SNAP_MAX = 64;
   static final long ICON_RESOLVE_KEEP_MS = 9000L;
   static final int ICON_PENDING_MAX = 96;
   static final int TEXT_DIM = -1325400065;
   static final int TEXT_DIM2 = -1862270977;
   static final int PRICE_NUM = -1;
   static final int PRICE_DOLLAR = -11796661;
   static final Pattern NUM_PATTERN = Pattern.compile("(\\d{1,3}(?:[\\s,._]\\d{3})+|\\d+)");
   static final Pattern COUNT_X = Pattern.compile("(?i)\\bx\\s*(\\d{1,4})\\b");
   static final Pattern COUNT_PCS = Pattern.compile("(?i)\\b(\\d{1,4})\\s*(шт|штук|pcs)\\b");
   static final Pattern SELF_BUY_PATTERN = Pattern.compile("(?iu)вы\\s+успешно\\s+(?:купили|приобрели)\\s+(.+?)\\s+за\\s*\\$?\\s*([0-9][0-9\\s,._]*)");
   static final DateTimeFormatter TIME_FMT = DateTimeFormatter.ofPattern("HH:mm:ss");
   static final Identifier UTYA_GIF = Identifier.of("mre", "textures/utya.gif");
   static boolean mouseWheelInit = false;
   static Field fMouseWheel;
   static Method mMouseWheelGetter;
   static boolean tooltipInit = false;
   static Method mGetTooltip;
   static Helper231[] tooltipArgs;
   static Method mDrawItem;
   static boolean texInit = false;
   static Method mDrawTex;
   static int texMode = 0;
   static Method mGuiLayerFactory;
   static Object texFirstArg;
   static Function<Identifier, Object> guiLayerFn;
   static Class<?> guiLayerClass;
   private final Helper318 priceParser = new Helper318();
   private final Helper159 script = new Helper159();
   private Slot cheapestSlot;
   private Slot costEffectiveSlot;
   private int lastSyncId = -1;
   private long lastRecalcMs = 0L;
   private boolean dirty = false;
   private boolean recalcQueued = false;
   private final ArrayDeque<Helper237> buys = new ArrayDeque<>();
   private final ArrayDeque<Helper233> snaps = new ArrayDeque<>();
   private final ArrayDeque<Helper232> pendingIcons = new ArrayDeque<>();
   private Helper233 lastHover;
   private Helper233 lastClick;
   private boolean lmbPrev = false;
   private int mouseX = 0;
   private int mouseY = 0;
   private float buyScrollPx = 0.0F;
   private boolean buyDrag = false;
   private int buyDragStartY = 0;
   private float buyDragStartScroll = 0.0F;
   private long lastIconScanMs = 0L;
   private final int[] RED_GREEN_COLORS = new int[]{-11796661, -46261};
   private final Setting7 cheapestItemColorSetting = new Setting7("Самый дешевый предмет", "Цвет подсветки для предмета с наименьшей ценой.")
      .method2555(-11796661)
      .method2551(this.RED_GREEN_COLORS);
   private final Setting7 costEffectiveItemColorSetting = new Setting7("Экономичный предмет", "Цвет подсветки для лучшего предмета.")
      .method2555(-46261)
      .method2551(this.RED_GREEN_COLORS);
   private Helper235 utya = new Helper235(UTYA_GIF);

   public AuctionHelper() {
      super("AuctionHelper", "Auction Helper", Helper269.RENDER);
      this.setup(new Helper264[]{this.cheapestItemColorSetting, this.costEffectiveItemColorSetting});
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      Packet var2 = var1.method3895();
      if (var2 instanceof ScreenHandlerSlotUpdateS2CPacket) {
         if (mc.currentScreen instanceof GenericContainerScreen var8) {
            if (this.method2167(var8)) {
               this.dirty = true;
               if (!this.recalcQueued) {
                  this.recalcQueued = true;
                  this.script.method1314().method1307(0, () -> {
                     this.recalcQueued = false;
                     if (mc.currentScreen instanceof GenericContainerScreen var1x && this.method2167(var1x)) {
                        this.method2121(var1x);
                     }
                  });
               }
            }
         }
      } else {
         if (var2 instanceof GameMessageS2CPacket var3) {
            String var4 = var3.content() == null ? "" : var3.content().getString();
            if (var4.isEmpty()) {
               return;
            }

            Helper236 var5 = this.method2132(var4);
            if (var5 == null) {
               return;
            }

            long var6 = System.currentTimeMillis();
            this.method2124(var5, var6);
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      this.script.method1315();
      if (!this.utya.loaded
         && mc.player != null
         && mc.getResourceManager() != null
         && !(mc.currentScreen instanceof GenericContainerScreen var2 && this.method2167(var2))) {
         this.utya.method2101(mc);
      }

      long var6 = System.currentTimeMillis();
      this.method2156(var6);
      this.method2123(var6);
      this.method2126(var6);
      this.method2127(var6);
      if (mc.currentScreen instanceof GenericContainerScreen var4) {
         if (!this.method2167(var4)) {
            this.method2168();
            this.lmbPrev = false;
            this.buyDrag = false;
         } else {
            if (!this.dirty && var6 - this.lastRecalcMs >= 650L) {
               this.method2121(var4);
            }
         }
      } else {
         this.method2168();
         this.lmbPrev = false;
         this.buyDrag = false;
      }
   }

   @Helper104
   public void method2119(Event5 var1) {
      DrawContext var2 = var1.method3656();
      if (mc.currentScreen instanceof GenericContainerScreen var3 && this.method2167(var3)) {
         long var13 = System.currentTimeMillis();
         this.method2139();
         boolean var6 = GLFW.glfwGetMouseButton(mc.getWindow().getHandle(), 0) == 1;
         if (var6 && !this.lmbPrev) {
            boolean var14 = true;
         } else {
            boolean var10000 = false;
         }

         if (!var6 && this.lmbPrev) {
            boolean var16 = true;
         } else {
            boolean var15 = false;
         }

         this.method2120(var3, var13);
         int var9 = (var3.width - var1.method3658()) / 2;
         int var10 = (var3.height - var1.method3659()) / 2;
         this.method2140(var3, var9, var10, var13);
         int var11 = this.method2165(this.cheapestItemColorSetting.method2553());
         int var12 = this.method2165(this.costEffectiveItemColorSetting.method2553());
         if (this.cheapestSlot != null) {
            this.method2166(var2, var9, var10, this.cheapestSlot, var11, 0);
         }

         if (this.costEffectiveSlot != null) {
            this.method2166(var2, var9, var10, this.costEffectiveSlot, var12, 0);
         }

         this.lmbPrev = var6;
      } else {
         this.method2168();
         this.lmbPrev = false;
         this.buyDrag = false;
      }
   }

   private void method2120(GenericContainerScreen var1, long var2) {
      int var4 = var1.getScreenHandler().syncId;
      if (var4 != this.lastSyncId) {
         this.lastSyncId = var4;
         this.dirty = true;
         this.recalcQueued = false;
         this.cheapestSlot = null;
         this.costEffectiveSlot = null;
         this.buyScrollPx = 0.0F;
         this.buyDrag = false;
         this.lastHover = null;
         this.lastClick = null;
         this.snaps.clear();
      }

      if (this.dirty && var2 - this.lastRecalcMs >= 90L) {
         this.method2121(var1);
      }
   }

   private void method2121(GenericContainerScreen var1) {
      if (mc.player == null) {
         this.method2168();
      } else {
         long var2 = System.currentTimeMillis();
         DefaultedList var4 = var1.getScreenHandler().slots;
         int var5 = var4.size();
         int[] var6 = new int[var5];
         int[] var7 = new int[var5];
         Slot var8 = null;
         int var9 = Integer.MAX_VALUE;

         for (int var10 = 0; var10 < var5; var10++) {
            Slot var11 = (Slot)var4.get(var10);
            ItemStack var12 = var11.getStack();
            if (var12.isEmpty()) {
               var6[var10] = -1;
               var7[var10] = 0;
            } else if (var11.inventory == mc.player.getInventory()) {
               var6[var10] = -1;
               var7[var10] = 0;
            } else if (var11.y >= 104) {
               var6[var10] = -1;
               var7[var10] = 0;
            } else {
               int var13 = this.method2144(var12);
               if (var13 >= 0) {
                  this.method2122(this.method2142(var12, var2));
               }

               var6[var10] = var13;
               int var14 = Math.max(1, var12.getCount());
               var7[var10] = var14;
               if (var13 >= 0 && var13 < var9) {
                  var9 = var13;
                  var8 = var11;
               }
            }
         }

         Slot var22 = null;
         double var23 = Double.POSITIVE_INFINITY;
         int var24 = Integer.MAX_VALUE;

         for (int var25 = 0; var25 < var5; var25++) {
            int var15 = var6[var25];
            if (var15 >= 0) {
               Slot var16 = (Slot)var4.get(var25);
               if (var16 != var8) {
                  int var17 = Math.max(1, var7[var25]);
                  double var18 = (double)var15 / var17;
                  boolean var20 = var18 < var23 - 1.0E-9;
                  boolean var21 = Math.abs(var18 - var23) <= 1.0E-9;
                  if (var20 || var21 && var15 < var24) {
                     var23 = var18;
                     var24 = var15;
                     var22 = var16;
                  }
               }
            }
         }

         this.cheapestSlot = var8;
         this.costEffectiveSlot = var22;
         this.dirty = false;
         this.lastRecalcMs = var2;
      }
   }

   private void method2122(Helper233 var1) {
      if (var1 != null && var1.icon != null && !var1.icon.isEmpty()) {
         Helper233 var2 = this.snaps.peekLast();
         if (var2 != null && var2.nameKey.equals(var1.nameKey) && var1.timeMs - var2.timeMs <= 350L) {
            this.snaps.pollLast();
         }

         this.snaps.addLast(var1);

         while (this.snaps.size() > 64) {
            this.snaps.pollFirst();
         }
      }
   }

   private void method2123(long var1) {
      while (!this.snaps.isEmpty()) {
         Helper233 var3 = this.snaps.peekFirst();
         if (var3 != null && var1 - var3.timeMs > 12000L) {
            this.snaps.pollFirst();
            continue;
         }
         break;
      }
   }

   private void method2124(Helper236 var1, long var2) {
      Helper233 var4 = this.method2130(var1.itemName, var2);
      String var5 = var4 != null ? var4.nameKey : "chat|" + this.method2137(var1.itemName);
      String var6 = var1.itemName;
      int var7 = var1.price;
      int var8 = var1.count;
      ItemStack var9 = null;
      if (var4 != null) {
         if (var6.isEmpty()) {
            var6 = var4.displayName;
         }

         if (var7 < 0) {
            var7 = var4.price;
         }

         if (var8 <= 0) {
            var8 = var4.count;
         }

         if (var8 <= 0) {
            var8 = 1;
         }

         var9 = var4.icon.copy();
         int var10 = Math.max(1, var9.getMaxCount());
         var9.setCount(Math.min(Math.max(1, var8), var10));
      }

      if (var8 <= 0) {
         var8 = 1;
      }

      Helper237 var12 = new Helper237(var5, var6, var9, var8, var7, var2);
      this.method2155(var12);
      if (var12.icon == null || var12.icon.isEmpty()) {
         String var11 = this.method2137(var6.isEmpty() ? var1.itemName : var6);
         if (!var11.isEmpty()) {
            this.method2125(new Helper232(var5, var11, var8, var2));
         }
      }
   }

   private void method2125(Helper232 var1) {
      if (var1 != null) {
         if (!var1.key.isEmpty() && !var1.wantNorm.isEmpty()) {
            Helper232 var2 = this.pendingIcons.peekLast();
            if (var2 != null && var2.key.equals(var1.key) && var1.timeMs - var2.timeMs <= 1600L) {
               var2.wantNorm = var1.wantNorm;
               var2.count = Math.max(var2.count, var1.count);
               var2.timeMs = var1.timeMs;
            } else {
               this.pendingIcons.addLast(var1);

               while (this.pendingIcons.size() > 96) {
                  this.pendingIcons.pollFirst();
               }
            }
         }
      }
   }

   private void method2126(long var1) {
      while (!this.pendingIcons.isEmpty()) {
         Helper232 var3 = this.pendingIcons.peekFirst();
         if (var3 != null && var1 - var3.timeMs > 9000L) {
            this.pendingIcons.pollFirst();
            continue;
         }
         break;
      }
   }

   private void method2127(long var1) {
      if (mc.player != null) {
         if (!this.pendingIcons.isEmpty()) {
            if (var1 - this.lastIconScanMs >= 65L) {
               this.lastIconScanMs = var1;
               int var3 = 6;
               Iterator var4 = this.pendingIcons.iterator();

               while (var4.hasNext() && var3-- > 0) {
                  Helper232 var5 = (Helper232)var4.next();
                  if (var5 == null) {
                     var4.remove();
                  } else if (var1 - var5.timeMs > 9000L) {
                     var4.remove();
                  } else {
                     Helper237 var6 = this.method2128(var5.key);
                     if (var6 == null) {
                        var4.remove();
                     } else if (var6.icon != null && !var6.icon.isEmpty()) {
                        var4.remove();
                     } else {
                        ItemStack var7 = this.method2129(var5.wantNorm, Math.max(1, var5.count));
                        if (var7 != null && !var7.isEmpty()) {
                           ItemStack var8 = var7.copy();
                           int var9 = Math.max(1, var8.getMaxCount());
                           int var10 = Math.max(1, var6.count);
                           var8.setCount(Math.min(var10, var9));
                           var6.icon = var8;
                           var4.remove();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private Helper237 method2128(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (this.buys.isEmpty()) {
            return null;
         } else {
            Iterator var2 = this.buys.descendingIterator();

            while (var2.hasNext()) {
               Helper237 var3 = (Helper237)var2.next();
               if (var3 != null && var1.equals(var3.key)) {
                  return var3;
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   private ItemStack method2129(String var1, int var2) {
      if (mc.player == null) {
         return null;
      } else if (var1 != null && !var1.isEmpty()) {
         ItemStack var3 = null;
         int var4 = -1;
         int var5 = 0;
         int var6 = mc.player.getInventory().size();

         for (int var7 = 0; var7 < var6; var7++) {
            ItemStack var8 = mc.player.getInventory().getStack(var7);
            if (var8 != null && !var8.isEmpty()) {
               String var9 = this.method2137(this.method2143(var8));
               if (!var9.isEmpty() && this.method2131(var9, var1)) {
                  int var10 = 0;
                  if (var9.equals(var1)) {
                     var10 += 8;
                  } else if (!var9.contains(var1) && !var1.contains(var9)) {
                     var10 += 4;
                  } else {
                     var10 += 6;
                  }

                  int var11 = Math.max(1, var8.getCount());
                  if (var11 >= var2) {
                     var10 += 2;
                  }

                  var10 += Math.min(3, var11);
                  if (var10 > var4 || var10 == var4 && var11 > var5) {
                     var4 = var10;
                     var5 = var11;
                     var3 = var8;
                  }
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private Helper233 method2130(String var1, long var2) {
      String var4 = this.method2137(var1);
      if (!var4.isEmpty()) {
         if (this.lastClick != null && var2 - this.lastClick.timeMs <= 12000L && this.method2131(this.lastClick.nameNorm, var4)) {
            return this.lastClick;
         }

         if (this.lastHover != null && var2 - this.lastHover.timeMs <= 8000L && this.method2131(this.lastHover.nameNorm, var4)) {
            return this.lastHover;
         }

         Iterator var5 = this.snaps.descendingIterator();

         while (var5.hasNext()) {
            Helper233 var6 = (Helper233)var5.next();
            if (var2 - var6.timeMs > 12000L) {
               break;
            }

            if (this.method2131(var6.nameNorm, var4)) {
               return var6;
            }
         }
      }

      if (this.lastClick != null && var2 - this.lastClick.timeMs <= 12000L) {
         return this.lastClick;
      } else if (this.lastHover != null && var2 - this.lastHover.timeMs <= 8000L) {
         return this.lastHover;
      } else {
         Iterator var7 = this.snaps.descendingIterator();
         if (var7.hasNext()) {
            Helper233 var8 = (Helper233)var7.next();
            if (var2 - var8.timeMs <= 12000L) {
               return var8;
            }
         }

         return null;
      }
   }

   private boolean method2131(String var1, String var2) {
      if (var1 == null || var2 == null) {
         return false;
      } else {
         return !var1.isEmpty() && !var2.isEmpty() ? var1.contains(var2) || var2.contains(var1) : false;
      }
   }

   private Helper236 method2132(String var1) {
      String var2 = this.method2171(var1).replace(' ', ' ').trim();
      if (var2.isEmpty()) {
         return null;
      } else {
         String var3 = var2.toLowerCase();
         if (var3.contains("вы") && (var3.contains("купили") || var3.contains("приобрели"))) {
            if (!var3.contains("ошибка") && !var3.contains("не удалось") && !var3.contains("уже куп")) {
               Matcher var4 = SELF_BUY_PATTERN.matcher(var2);
               if (!var4.find()) {
                  return null;
               } else {
                  String var5 = var4.group(1) == null ? "" : var4.group(1).trim();
                  String var6 = var4.group(2) == null ? "" : var4.group(2);
                  int var7 = this.method2133(var6);
                  if (var7 < 0) {
                     var7 = this.method2133(var2);
                  }

                  int var8 = this.method2134(var2);
                  if (var8 <= 0) {
                     var8 = 1;
                  }

                  var5 = this.method2136(var5);
                  return var5.isEmpty() && var7 < 0 ? null : new Helper236(var5, var7, var8);
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   private int method2133(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         Matcher var2 = NUM_PATTERN.matcher(var1);
         if (!var2.find()) {
            return -1;
         } else {
            long var3 = this.method2138(var2.group(1));
            if (var3 <= 0L) {
               return -1;
            } else {
               return var3 > 2147483647L ? Integer.MAX_VALUE : (int)var3;
            }
         }
      } else {
         return -1;
      }
   }

   private int method2134(String var1) {
      Matcher var2 = COUNT_X.matcher(var1);
      if (var2.find()) {
         return this.method2135(var2.group(1));
      } else {
         Matcher var3 = COUNT_PCS.matcher(var1);
         return var3.find() ? this.method2135(var3.group(1)) : -1;
      }
   }

   private int method2135(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (Throwable var3) {
         return -1;
      }
   }

   private String method2136(String var1) {
      if (var1 == null) {
         return "";
      } else {
         String var2;
         for (var2 = var1.trim(); !var2.isEmpty(); var2 = var2.substring(0, var2.length() - 1).trim()) {
            char var3 = var2.charAt(var2.length() - 1);
            if (var3 != '!' && var3 != '.' && var3 != ',' && var3 != ';' && var3 != ':' && var3 != ')' && var3 != ']' && var3 != 187) {
               break;
            }
         }

         return var2;
      }
   }

   private String method2137(String var1) {
      if (var1 == null) {
         return "";
      } else {
         String var2 = this.method2171(var1).toLowerCase().trim();
         if (var2.isEmpty()) {
            return "";
         } else {
            StringBuilder var3 = new StringBuilder(var2.length());
            boolean var4 = false;

            for (int var5 = 0; var5 < var2.length(); var5++) {
               char var6 = var2.charAt(var5);
               boolean var7 = var6 <= ' ';
               if (var7) {
                  if (!var4) {
                     var3.append(' ');
                  }

                  var4 = true;
               } else {
                  var4 = false;
                  if (var6 != '!' && var6 != '.' && var6 != ',' && var6 != ';' && var6 != ':') {
                     var3.append(var6);
                  }
               }
            }

            return var3.toString().trim();
         }
      }
   }

   private long method2138(String var1) {
      long var2 = 0L;

      for (int var4 = 0; var4 < var1.length(); var4++) {
         char var5 = var1.charAt(var4);
         if (var5 >= '0' && var5 <= '9') {
            var2 = var2 * 10L + (var5 - '0');
         }
      }

      return var2;
   }

   private void method2139() {
      double var1 = mc.getWindow().getScaledWidth();
      double var3 = mc.getWindow().getScaledHeight();
      double var5 = mc.getWindow().getWidth();
      double var7 = mc.getWindow().getHeight();
      this.mouseX = (int)(mc.mouse.getX() * var1 / var5);
      this.mouseY = (int)(mc.mouse.getY() * var3 / var7);
   }

   private void method2140(GenericContainerScreen var1, int var2, int var3, long var4) {
      Slot var6 = this.method2141(var1, var2, var3, this.mouseX, this.mouseY);
      if (var6 != null) {
         ItemStack var7 = var6.getStack();
         if (!var7.isEmpty()) {
            this.lastHover = this.method2142(var7, var4);
         }
      }
   }

   private Slot method2141(GenericContainerScreen var1, int var2, int var3, int var4, int var5) {
      if (mc.player == null) {
         return null;
      } else {
         int var6 = var4 - var2;
         int var7 = var5 - var3;

         for (Slot var10 : var1.getScreenHandler().slots) {
            if (var10.inventory != mc.player.getInventory() && var10.y < 104) {
               int var11 = var10.x;
               int var12 = var10.y;
               if (var6 >= var11 && var6 < var11 + 16 && var7 >= var12 && var7 < var12 + 16) {
                  return var10;
               }
            }
         }

         return null;
      }
   }

   private Helper233 method2142(ItemStack var1, long var2) {
      ItemStack var4 = var1.copy();
      int var5 = this.method2144(var1);
      String var6 = this.method2143(var1);
      String var7 = this.method2137(var6);
      String var8 = var1.getItem().toString() + "|" + var7;
      int var9 = Math.max(1, var1.getCount());
      return new Helper233(var8, var6, var7, var4, var9, var5, var2);
   }

   private String method2143(ItemStack var1) {
      try {
         return var1.getName().getString();
      } catch (Throwable var3) {
         return "";
      }
   }

   private int method2144(ItemStack var1) {
      int var2 = -1;

      try {
         var2 = this.priceParser.method3160(var1);
      } catch (Throwable var4) {
      }

      return var2 >= 0 ? var2 : this.method2145(var1);
   }

   private int method2145(ItemStack var1) {
      try {
         int var2 = Math.max(1, var1.getCount());
         List var3 = this.method2149(var1);
         String var4 = String.join(" ", var3);
         return this.method2146(var4, var2);
      } catch (Throwable var5) {
         return -1;
      }
   }

   private int method2146(String var1, int var2) {
      if (var1 != null && !var1.isEmpty()) {
         String var3 = var1.toLowerCase();
         Matcher var4 = NUM_PATTERN.matcher(var1);
         int var5 = -1;
         long var6 = -1L;

         while (var4.find()) {
            int var8 = var4.start(1);
            int var9 = var4.end(1);
            long var10 = this.method2138(var4.group(1));
            if (var10 > 0L) {
               long var12 = this.method2148(var3, var9);
               if (var12 != 1L) {
                  var10 *= var12;
               }

               int var14 = Math.max(0, var8 - 52);
               int var15 = Math.min(var3.length(), var9 + 52);
               String var16 = var3.substring(var14, var15);
               if (this.method2147(var16)) {
                  boolean var17 = var16.contains("за шт")
                     || var16.contains("/шт")
                     || var16.contains("шт.")
                     || var16.contains(" per ")
                     || var16.contains(" each ")
                     || var16.contains("за 1")
                     || var16.contains("за шту");
                  boolean var18 = var16.contains("всего")
                     || var16.contains("итого")
                     || var16.contains("total")
                     || var16.contains("сумм")
                     || var16.contains("общ");
                  int var19 = 3;
                  if (var18) {
                     var19 += 3;
                  }

                  if (var17) {
                     var19++;
                  }

                  long var20 = var17 ? var10 * var2 : var10;
                  if (var20 > 0L && (var19 > var5 || var19 == var5 && var20 > var6)) {
                     var5 = var19;
                     var6 = var20;
                  }
               }
            }
         }

         if (var6 <= 0L) {
            return -1;
         } else {
            return var6 > 2147483647L ? Integer.MAX_VALUE : (int)var6;
         }
      } else {
         return -1;
      }
   }

   private boolean method2147(String var1) {
      return var1.contains("цена")
         || var1.contains("price")
         || var1.contains("стоим")
         || var1.contains("руб")
         || var1.contains("монет")
         || var1.contains("coins")
         || var1.contains("коин")
         || var1.contains("buy")
         || var1.contains("куп")
         || var1.contains("$")
         || var1.contains("₽");
   }

   private long method2148(String var1, int var2) {
      if (var2 >= var1.length()) {
         return 1L;
      } else {
         char var3 = var1.charAt(var2);
         char var4 = var2 + 1 < var1.length() ? var1.charAt(var2 + 1) : 0;
         if (var3 != 'k' && var3 != 1082) {
            return var3 != 'm' && var3 != 1084 ? 1L : 1000000L;
         } else {
            return var4 != 'k' && var4 != 1082 ? 1000L : 1000000L;
         }
      }
   }

   private List<String> method2149(ItemStack var1) {
      ArrayList var2 = this.method2150(var1);
      if (var2 != null && !var2.isEmpty()) {
         for (int var5 = 0; var5 < var2.size(); var5++) {
            var2.set(var5, this.method2171((String)var2.get(var5)));
         }

         return var2;
      } else {
         ArrayList var3 = new ArrayList(8);
         var3.add(this.method2143(var1));

         for (int var4 = 0; var4 < var3.size(); var4++) {
            var3.set(var4, this.method2171((String)var3.get(var4)));
         }

         return var3;
      }
   }

   private ArrayList<String> method2150(ItemStack var1) {
      try {
         if (!tooltipInit) {
            this.method2151(var1);
         }

         if (mGetTooltip != null && tooltipArgs != null) {
            Object[] var2 = new Object[tooltipArgs.length];

            for (int var3 = 0; var3 < tooltipArgs.length; var3++) {
               var2[var3] = tooltipArgs[var3].method2098(mc.player);
            }

            if (mGetTooltip.invoke(var1, var2) instanceof List var4) {
               ArrayList var5 = new ArrayList(var4.size());

               for (Object var7 : var4) {
                  if (var7 instanceof Text var8) {
                     var5.add(var8.getString());
                  } else if (var7 != null) {
                     var5.add(String.valueOf(var7));
                  }
               }

               return var5;
            } else {
               return null;
            }
         } else {
            return null;
         }
      } catch (Throwable var9) {
         return null;
      }
   }

   private void method2151(ItemStack var1) {
      tooltipInit = true;
      if (var1 != null) {
         Method[] var2 = var1.getClass().getMethods();
         Method var3 = null;
         Helper231[] var4 = null;

         for (Method var8 : var2) {
            if (List.class.isAssignableFrom(var8.getReturnType())) {
               Class[] var9 = var8.getParameterTypes();
               Helper231[] var10 = this.method2152(var9);
               if (var10 != null) {
                  try {
                     Object[] var11 = new Object[var10.length];

                     for (int var12 = 0; var12 < var10.length; var12++) {
                        var11[var12] = var10[var12].method2098(mc.player);
                     }

                     Object var15 = var8.invoke(var1, var11);
                     if (var15 instanceof List) {
                        String var13 = var8.getName();
                        if ("getTooltip".equals(var13) || var13.startsWith("method_")) {
                           mGetTooltip = var8;
                           tooltipArgs = var10;
                           return;
                        }

                        if (var3 == null) {
                           var3 = var8;
                           var4 = var10;
                        }
                     }
                  } catch (Throwable var14) {
                  }
               }
            }
         }

         mGetTooltip = var3;
         tooltipArgs = var4;
      }
   }

   private Helper231[] method2152(Class<?>[] var1) {
      if (var1 == null) {
         return null;
      } else {
         Helper231[] var2 = new Helper231[var1.length];

         for (int var3 = 0; var3 < var1.length; var3++) {
            Class var4 = var1[var3];
            if (var4 == null) {
               return null;
            }

            if (mc.player != null && var4.isAssignableFrom(mc.player.getClass())) {
               var2[var3] = Helper231.method2094();
            } else if (var4 == boolean.class || var4 == Boolean.class) {
               var2[var3] = Helper231.method2095();
            } else if (var4 == int.class || var4 == Integer.class) {
               var2[var3] = Helper231.method2096();
            } else if (var4.isEnum()) {
               Object var5 = this.method2154(var4, "NORMAL", "DEFAULT", "BASIC", "REGULAR");
               var2[var3] = Helper231.method2093(var5);
            } else {
               Object var6 = this.method2153(var4, "DEFAULT", "NORMAL", "BASIC", "REGULAR", "STANDARD");
               if (var6 != null) {
                  var2[var3] = Helper231.method2093(var6);
               } else if (var4.isInterface()) {
                  var2[var3] = Helper231.method2097(var4);
               } else {
                  var2[var3] = Helper231.method2093(null);
               }
            }
         }

         return var2;
      }
   }

   private Object method2153(Class<?> var1, String... var2) {
      try {
         for (String var6 : var2) {
            try {
               Field var7 = var1.getField(var6);
               if (var1.isAssignableFrom(var7.getType())) {
                  return var7.get(null);
               }
            } catch (Throwable var8) {
            }
         }
      } catch (Throwable var9) {
      }

      return null;
   }

   private Object method2154(Class<?> var1, String... var2) {
      try {
         Object[] var3 = var1.getEnumConstants();
         if (var3 != null && var3.length != 0) {
            for (String var7 : var2) {
               if (var7 != null) {
                  for (Object var11 : var3) {
                     if (var11 != null && var7.equalsIgnoreCase(String.valueOf(var11))) {
                        return var11;
                     }
                  }
               }
            }

            return var3[0];
         } else {
            return null;
         }
      } catch (Throwable var12) {
         return null;
      }
   }

   private void method2155(Helper237 var1) {
      Helper237 var2 = this.buys.peekLast();
      if (var2 != null && var2.key.equals(var1.key) && var1.timeMs - var2.timeMs <= 1600L) {
         var2.count = var2.count + var1.count;
         var2.timeMs = var1.timeMs;
         if (var2.totalPrice < 0 && var1.totalPrice >= 0) {
            var2.totalPrice = var1.totalPrice;
         }

         if ((var2.icon == null || var2.icon.isEmpty()) && var1.icon != null && !var1.icon.isEmpty()) {
            var2.icon = var1.icon;
         }

         if (var2.name.isEmpty() && !var1.name.isEmpty()) {
            var2.name = var1.name;
         }
      } else {
         this.buys.addLast(var1);

         while (this.buys.size() > 80) {
            this.buys.pollFirst();
         }
      }
   }

   private void method2156(long var1) {
      while (!this.buys.isEmpty()) {
         Helper237 var3 = this.buys.peekFirst();
         if (var3 != null && var1 - var3.timeMs > 900000L) {
            this.buys.pollFirst();
            continue;
         }
         break;
      }
   }

   private void method2157(DrawContext var1, int var2, int var3, int var4, int var5, long var6) {
      if (var4 > 6 && var5 > 6) {
         this.utya.method2101(mc);
         Identifier var8 = this.utya.method2102(var6);
         if (var8 != null) {
            int var9 = Math.max(1, this.utya.w);
            int var10 = Math.max(1, this.utya.h);
            byte var11 = 16;
            int var12 = Math.max(1, var4 - var11 * 2);
            int var13 = Math.max(1, var5 - var11 * 2);
            float var14 = Math.min((float)var12 / var9, (float)var13 / var10);
            var14 *= 0.72F;
            int var15 = Math.max(1, (int)(var9 * var14));
            int var16 = Math.max(1, (int)(var10 * var14));
            int var17 = var2 + (var4 - var15) / 2;
            int var18 = var3 + (var5 - var16) / 2;
            float var19 = (float)var15 / var9;
            float var20 = (float)var16 / var10;
            var1.getMatrices().push();
            var1.getMatrices().translate((float)var17, (float)var18, 0.0F);
            var1.getMatrices().scale(var19, var20, 1.0F);
            this.method2162(var1, var8, 0, 0, var9, var10, var9, var10);
            var1.getMatrices().pop();
         }
      }
   }

   private double method2158(boolean var1) {
      if (!var1) {
         return 0.0;
      } else {
         try {
            Mouse var2 = mc.mouse;
            if (!mouseWheelInit) {
               this.method2159(var2);
            }

            if (mMouseWheelGetter != null) {
               if (mMouseWheelGetter.invoke(var2) instanceof Number var9) {
                  return var9.doubleValue();
               }

               return 0.0;
            }

            if (fMouseWheel != null) {
               double var4 = fMouseWheel.get(var2) instanceof Number var6 ? var6.doubleValue() : 0.0;
               if (var4 != 0.0) {
                  Class var10 = fMouseWheel.getType();
                  if (var10 == double.class) {
                     fMouseWheel.setDouble(var2, 0.0);
                  } else if (var10 == float.class) {
                     fMouseWheel.setFloat(var2, 0.0F);
                  } else if (var10 == int.class) {
                     fMouseWheel.setInt(var2, 0);
                  }
               }

               return var4;
            }
         } catch (Throwable var7) {
         }

         return 0.0;
      }
   }

   private void method2159(Object var1) {
      mouseWheelInit = true;
      if (var1 != null) {
         try {
            for (Method var5 : var1.getClass().getMethods()) {
               if (var5.getParameterCount() == 0) {
                  Class var6 = var5.getReturnType();
                  if (var6 == double.class || var6 == float.class || var6 == int.class) {
                     String var7 = var5.getName().toLowerCase(Locale.ROOT);
                     if (var7.contains("wheel") || var7.contains("scroll") && (var7.contains("y") || var7.contains("delta"))) {
                        mMouseWheelGetter = var5;
                        return;
                     }
                  }
               }
            }
         } catch (Throwable var10) {
         }

         try {
            for (Class var11 = var1.getClass(); var11 != null && var11 != Object.class; var11 = var11.getSuperclass()) {
               for (Field var15 : var11.getDeclaredFields()) {
                  Class var16 = var15.getType();
                  if (var16 == double.class || var16 == float.class || var16 == int.class) {
                     String var8 = var15.getName().toLowerCase(Locale.ROOT);
                     if (var8.contains("eventdeltawheel")
                        || var8.contains("deltawheel")
                        || var8.contains("wheel")
                        || var8.contains("scroll") && (var8.contains("y") || var8.contains("delta"))) {
                        var15.setAccessible(true);
                        fMouseWheel = var15;
                        return;
                     }
                  }
               }
            }
         } catch (Throwable var9) {
         }
      }
   }

   private void method2160(DrawContext var1, ItemStack var2, int var3, int var4) {
      try {
         if (mDrawItem == null) {
            try {
               mDrawItem = DrawContext.class.getMethod("drawItem", ItemStack.class, int.class, int.class);
            } catch (Throwable var11) {
               for (Method var9 : DrawContext.class.getMethods()) {
                  Class[] var10 = var9.getParameterTypes();
                  if (var10.length == 3 && var10[0] == ItemStack.class && var10[1] == int.class && var10[2] == int.class) {
                     mDrawItem = var9;
                     break;
                  }
               }
            }
         }

         if (mDrawItem != null) {
            mDrawItem.invoke(var1, var2, var3, var4);
         }
      } catch (Throwable var12) {
      }
   }

   private void method2161(DrawContext var1, TextRenderer var2, String var3, int var4, int var5, int var6) {
      try {
         var1.drawTextWithShadow(var2, var3, var4, var5, var6);
      } catch (Throwable var10) {
         try {
            Method var8 = var1.getClass().getMethod("drawTextWithShadow", TextRenderer.class, String.class, int.class, int.class, int.class);
            var8.invoke(var1, var2, var3, var4, var5, var6);
         } catch (Throwable var9) {
         }
      }
   }

   private void method2162(DrawContext var1, Identifier var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var2 != null) {
         try {
            if (!texInit) {
               this.method2163();
            }

            if (mDrawTex == null) {
               return;
            }

            RenderSystem.enableBlend();
            if (texMode == 1) {
               mDrawTex.invoke(var1, var2, var3, var4, 0, 0, var5, var6, var7, var8);
               return;
            }

            if (texMode == 2) {
               mDrawTex.invoke(var1, var2, var3, var4, 0.0F, 0.0F, var5, var6, var7, var8);
               return;
            }

            if (texMode == 3) {
               mDrawTex.invoke(var1, var2, var3, var4, var5, var6);
               return;
            }

            if (texMode == 4) {
               Object var11 = texFirstArg != null ? texFirstArg : guiLayerFn;
               if (var11 == null) {
                  return;
               }

               mDrawTex.invoke(var1, var11, var2, var3, var4, 0.0F, 0.0F, var5, var6, var7, var8);
               return;
            }

            if (texMode == 5) {
               Object var9 = method2164(var2);
               if (var9 == null) {
                  return;
               }

               mDrawTex.invoke(var1, var9, var2, var3, var4, 0.0F, 0.0F, var5, var6, var7, var8);
            }
         } catch (Throwable var10) {
         }
      }
   }

   private void method2163() {
      texInit = true;
      mDrawTex = null;
      texMode = 0;
      texFirstArg = null;
      guiLayerFn = null;
      mGuiLayerFactory = null;
      guiLayerClass = null;
      Method var1 = null;
      byte var2 = 0;

      try {
         Method[] var3 = DrawContext.class.getMethods();

         for (Method var7 : var3) {
            String var8 = var7.getName();
            if ("drawTexture".equals(var8) || var8.startsWith("method_")) {
               Class[] var9 = var7.getParameterTypes();
               if (var9 != null) {
                  if (var9.length == 9
                     && var9[0] == Identifier.class
                     && var9[1] == int.class
                     && var9[2] == int.class
                     && var9[3] == int.class
                     && var9[4] == int.class) {
                     var1 = var7;
                     var2 = 1;
                     break;
                  }

                  if (var9.length == 9
                     && var9[0] == Identifier.class
                     && var9[1] == int.class
                     && var9[2] == int.class
                     && var9[3] == float.class
                     && var9[4] == float.class) {
                     var1 = var7;
                     var2 = 2;
                     break;
                  }

                  if (var9.length == 5
                     && var9[0] == Identifier.class
                     && var9[1] == int.class
                     && var9[2] == int.class
                     && var9[3] == int.class
                     && var9[4] == int.class) {
                     if (var1 == null) {
                        var1 = var7;
                        var2 = 3;
                     }
                  } else if (var9.length == 10 && var9[1] == Identifier.class && var9[2] == int.class && var9[3] == int.class) {
                     if (Function.class.isAssignableFrom(var9[0])) {
                        var1 = var7;
                        var2 = 4;
                        break;
                     }

                     if (!var9[0].isInterface()) {
                        var1 = var7;
                        var2 = 5;
                        guiLayerClass = var9[0];
                        break;
                     }
                  }
               }
            }
         }
      } catch (Throwable var11) {
      }

      if (var1 != null) {
         mDrawTex = var1;
         texMode = var2;
      }

      if (texMode == 4) {
         try {
            if (guiLayerFn == null) {
               guiLayerFn = AuctionHelper::method2164;
            }

            texFirstArg = guiLayerFn;
         } catch (Throwable var10) {
            texFirstArg = null;
         }
      }
   }

   private static Object method2164(Identifier var0) {
      try {
         if (mGuiLayerFactory == null) {
            Class var1 = guiLayerClass;
            if (var1 == null) {
               var1 = Class.forName("net.minecraft.client.render.RenderLayer");
            }

            Method[] var2 = var1.getMethods();
            Method var3 = null;

            for (Method var7 : var2) {
               if (Modifier.isStatic(var7.getModifiers())
                  && var7.getParameterCount() == 1
                  && var7.getParameterTypes()[0] == Identifier.class
                  && var1.isAssignableFrom(var7.getReturnType())) {
                  String var8 = var7.getName().toLowerCase(Locale.ROOT);
                  if (var8.contains("gui") && (var8.contains("textured") || var8.contains("texture"))) {
                     var3 = var7;
                     break;
                  }

                  if (var3 == null && var8.contains("gui")) {
                     var3 = var7;
                  }
               }
            }

            mGuiLayerFactory = var3;
         }

         return mGuiLayerFactory == null ? null : mGuiLayerFactory.invoke(null, var0);
      } catch (Throwable var9) {
         return null;
      }
   }

   private int method2165(int var1) {
      long var2 = System.currentTimeMillis();
      float var4 = (float)(var2 % 900L) / 900.0F;
      float var5 = 0.5F - 0.5F * MathHelper.cos(var4 * (float) (Math.PI * 2));
      float var6 = MathHelper.clamp(0.35F + 0.65F * var5, 0.0F, 1.0F);
      return Helper133.method1108(var1, var6);
   }

   private void method2166(DrawContext var1, int var2, int var3, Slot var4, int var5, int var6) {
      int var7 = var2 + var4.x + var6;
      int var8 = var3 + var4.y + var6;
      int var9 = 16 - var6 - var6;
      int var10 = 16 - var6 - var6;
      if (var9 > 0 && var10 > 0) {
         rectangle.method677(Helper80.method841(var1.getMatrices(), var7, var8, var9, var10).method823(var5).method840());
      }
   }

   private boolean method2167(GenericContainerScreen var1) {
      String var2 = var1.getTitle() == null ? "" : var1.getTitle().getString();
      String var3 = var2.toLowerCase(Locale.ROOT);
      if (!var3.contains("аукцион")
         && !var3.contains("аукционы")
         && !var3.contains("аук")
         && !var3.contains("поиск")
         && !var3.contains("рынок")
         && !var3.contains("лот")
         && !var3.contains("auction")
         && !var3.contains("search")
         && !var3.contains("market")
         && !var3.contains("trade")
         && !var3.contains("/ah")
         && !var3.contains(" ah")) {
         String var4 = var1.getTitle() == null ? "" : var1.getTitle().getString();
         return var4.contains("Аукцион") || var4.contains("Аукционы") || var4.contains("Поиск");
      } else {
         return true;
      }
   }

   private void method2168() {
      this.cheapestSlot = null;
      this.costEffectiveSlot = null;
      this.lastSyncId = -1;
      this.lastRecalcMs = 0L;
      this.dirty = false;
      this.recalcQueued = false;
      this.script.method1314();
      this.buyScrollPx = 0.0F;
      this.buyDrag = false;
      this.lastHover = null;
      this.lastClick = null;
      this.snaps.clear();
   }

   private String method2169(long var1) {
      LocalTime var3 = Instant.ofEpochMilli(var1).atZone(ZoneId.systemDefault()).toLocalTime();
      return TIME_FMT.format(var3);
   }

   private boolean method2170(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 < var3 + var5 && var2 >= var4 && var2 < var4 + var6;
   }

   private String method2171(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         StringBuilder var2 = new StringBuilder(var1.length());

         for (int var3 = 0; var3 < var1.length(); var3++) {
            char var4 = var1.charAt(var3);
            if (var4 == 167) {
               var3++;
            } else {
               var2.append(var4);
            }
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   private String method2172(TextRenderer var1, String var2, int var3) {
      if (var2 == null) {
         return "";
      } else if (var3 <= 0) {
         return "";
      } else if (var1.getWidth(var2) <= var3) {
         return var2;
      } else {
         String var4 = "...";
         int var5 = var1.getWidth(var4);
         if (var5 >= var3) {
            return var4;
         } else {
            for (int var6 = var2.length(); var6 > 0; var6--) {
               String var7 = var2.substring(0, var6);
               if (var1.getWidth(var7) + var5 <= var3) {
                  return var7 + var4;
               }
            }

            return var4;
         }
      }
   }

   private String method2173(int var1) {
      if (var1 > -1000 && var1 < 1000) {
         return String.valueOf(var1);
      } else {
         long var2 = var1;
         boolean var4 = var2 < 0L;
         if (var4) {
            var2 = -var2;
         }

         String var5 = String.valueOf(var2);
         int var6 = var5.length();
         StringBuilder var7 = new StringBuilder(var6 + var6 / 3);

         for (int var8 = 0; var8 < var6; var8++) {
            if (var8 > 0 && (var6 - var8) % 3 == 0) {
               var7.append('.');
            }

            var7.append(var5.charAt(var8));
         }

         return var4 ? "-" + var7 : var7.toString();
      }
   }
}
