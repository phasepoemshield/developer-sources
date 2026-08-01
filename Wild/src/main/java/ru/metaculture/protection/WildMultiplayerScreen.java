package ru.metaculture.protection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.multiplayer.AddServerScreen;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.gui.screen.multiplayer.DirectConnectScreen;
import net.minecraft.client.network.MultiplayerServerListPinger;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.network.ServerInfo.ServerType;
import net.minecraft.client.network.ServerInfo.Status;
import net.minecraft.client.option.ServerList;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.util.Window;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import org.lwjgl.opengl.GL11;

public final class WildMultiplayerScreen extends Screen implements O00000OO0OOOO {
   private static final O0000O000OO O00000000 = O0000O000OO.O00000000();
   private static final int O000000000 = 14;
   private static final long O0000000000 = 140L;
   private static final long O00000000000 = 70L;
   private static final ThreadFactory O000000000000 = runnable -> {
      Thread var1 = new Thread(runnable, "Wild Server Ping");
      var1.setDaemon(true);
      return var1;
   };
   private final Screen O0000000000000;
   private final O00000OO0OOOOO O000000000000O = new O00000OO0OOOOO();
   private MultiplayerServerListPinger O00000000000O = new MultiplayerServerListPinger();
   private final List<ServerInfo> O00000000000O0 = new ArrayList<>();
   private final List<WildMultiplayerScreen.W286> O00000000000OO = new ArrayList<>();
   private final Map<String, WildMultiplayerScreen.W285> O0000000000O = new HashMap<>();
   private final List<WildMultiplayerScreen.W286> O0000000000O0 = List.of(
      new WildMultiplayerScreen.W286("Join", WildMultiplayerScreen.W284.JOIN),
      new WildMultiplayerScreen.W286("Direct", WildMultiplayerScreen.W284.DIRECT),
      new WildMultiplayerScreen.W286("Add", WildMultiplayerScreen.W284.ADD),
      new WildMultiplayerScreen.W286("Edit", WildMultiplayerScreen.W284.EDIT),
      new WildMultiplayerScreen.W286("Delete", WildMultiplayerScreen.W284.DELETE),
      new WildMultiplayerScreen.W286("Proxy", WildMultiplayerScreen.W284.PROXY),
      new WildMultiplayerScreen.W286("Refresh", WildMultiplayerScreen.W284.REFRESH),
      new WildMultiplayerScreen.W286("Back", WildMultiplayerScreen.W284.BACK)
   );
   private final WildMultiplayerScreen.W287[] O0000000000O00 = new WildMultiplayerScreen.W287[14];
   private final O00000OOO00 O0000000000O0O = new O00000OOO00(O0000O000O0O00.O000000000000());
   private final O00000OOO00 O0000000000OO = new O00000OOO00(O0000O000O0O00.O000000000000());
   private ServerList O0000000000OO0;
   private long O0000000000OOO;
   private long O000000000O;
   private long O000000000O0;
   private long O000000000O00;
   private float O000000000O000;
   private float O000000000O00O;
   private float O000000000O0O;
   private float O000000000O0O0;
   private float O000000000O0OO;
   private float O000000000OO;
   private float O000000000OO0;
   private float O000000000OO00;
   private float O000000000OO0O;
   private float O000000000OOO;
   private float O000000000OOO0;
   private boolean O000000000OOOO;
   private boolean O00000000O;
   private boolean O00000000O0;
   private int O00000000O00;
   private int O00000000O000;
   private int O00000000O0000 = -6357021;
   private int O00000000O000O = -11341636;
   private Theme O00000000O00O = Theme.AURORA;
   private boolean O00000000O00O0;
   private int O00000000O00OO = -1;
   private float O00000000O0O;
   private float O00000000O0O0;
   private int O00000000O0O00 = 5;
   private int O00000000O0O0O = -1;
   private String O00000000O0OO = "Choose a server";
   private MainMenuScreen.W281 O00000000O0OO0;
   private volatile ScheduledExecutorService O00000000O0OOO;
   private final AtomicInteger O00000000OO = new AtomicInteger();
   private volatile int O00000000OO0;
   private final AtomicInteger O00000000OO00 = new AtomicInteger();
   private volatile int O00000000OO000;
   private float O00000000OO00O = -100.0F;
   private long O00000000OO0O;
   private float O00000000OO0O0;
   private float O00000000OO0OO;
   private float O00000000OOO;
   private float O00000000OOO0;
   private boolean O00000000OOO00;
   private float O00000000OOO0O;
   private float O00000000OOOO;
   private float O00000000OOOO0;
   private float O00000000OOOOO;
   private float O0000000O;
   private float O0000000O0;
   private float O0000000O00;
   private boolean O0000000O000;
   private final AtomicBoolean O0000000O0000 = new AtomicBoolean(false);

   public WildMultiplayerScreen(Screen screen) {
      super(Text.literal("Wild Multiplayer"));
      this.O0000000000000 = screen;

      for (int var2 = 0; var2 < this.O0000000000O00.length; var2++) {
         this.O0000000000O00[var2] = new WildMultiplayerScreen.W287();
      }
   }

   protected void init() {
      super.init();
      this.O0000000000OOO = System.nanoTime();
      this.O000000000O = this.O0000000000OOO;
      this.O000000000O0 = this.O0000000000OOO;
      this.O000000000OOOO = false;
      this.O00000000O = false;
      this.O00000000O0 = false;
      this.O00000000O00 = 0;
      this.O00000000O000 = 0;
      this.O00000000O0O = 0.0F;
      this.O00000000O0O0 = 0.0F;
      this.O000000000(true);
      this.O0000000000O0O.O00000000(0.0F);
      this.O0000000000OO.O00000000(0.0F);

      for (WildMultiplayerScreen.W286 var2 : this.O00000000000OO) {
         var2.O00000000();
      }

      for (WildMultiplayerScreen.W286 var4 : this.O0000000000O0) {
         var4.O00000000();
      }

      this.O000000000();
   }

   public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
      this.O00000000(mouseX, mouseY, deltaTicks, false);
   }

   @Override
   public void O00000000(int i, int j, float f) {
      this.O00000000(i, j, f, true);
   }

   public void tick() {
      super.tick();
   }

   private void O00000000(int i, int j, float f, boolean bl) {
      Window var5 = this.client == null ? null : this.client.getWindow();
      if (var5 != null && !var5.hasZeroWidthOrHeight() && var5.getFramebufferWidth() > 0 && var5.getFramebufferHeight() > 0) {
         int var6 = var5.getFramebufferWidth();
         int var7 = var5.getFramebufferHeight();
         long var8 = System.nanoTime();
         float var10 = Math.max(0.001F, Math.min(0.05F, (float)(var8 - this.O000000000O) / 1.0E9F));
         this.O000000000O = var8;
         this.O000000000O000 = (float)(var8 - this.O0000000000OOO) / 1.0E9F;
         if (this.O00000000(var5, var6, var7, i, j, var8)) {
            var10 = 0.001F;
         }

         this.O000000000000O();
         this.O00000000(var5, i, j, var10, var8);
         this.O000000000(var6, var7, var10);
         this.O00000000000O();
         float var11 = (this.O000000000O00O / Math.max(1.0F, (float)var6) - 0.5F) * 2.0F;
         float var12 = (this.O000000000O0O / Math.max(1.0F, (float)var7) - 0.5F) * 2.0F;
         float var13 = this.O0000000000O0O.O00000000(var11, var10);
         float var14 = this.O0000000000OO.O00000000(var12, var10);
         this.O00000000(var6, var7, var13, var14, var10);
         int var15 = GL11.glGetInteger(36006);
         MainMenuScreen.W281 var16 = this.O00000000(var6, var7, var15, var13, var14, var8);
         this.O00000000O0OO0 = var16;
         if (bl) {
            O0000O00O0OOO0.W373 var17 = O0000O00O0OOO0.O00000000();

            try {
               this.O000000000000O.O00000000(var16);
            } finally {
               O0000O00O0OOO0.O00000000(var17);
            }

            this.O00000000(var16);
         }
      }
   }

   public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
   }

   public void renderInGameBackground(DrawContext context) {
   }

   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      if (button == 0 && this.client != null && this.client.getWindow() != null) {
         float var6 = this.O00000000(this.client.getWindow(), mouseX);
         float var7 = this.O000000000(this.client.getWindow(), mouseY);
         long var8 = System.nanoTime();
         if (this.O0000000O000) {
            float var10 = 8.0F;
            if (var6 >= this.O00000000OOOO - var10
               && var6 <= this.O00000000OOOO + this.O00000000OOOOO + var10
               && var7 >= this.O00000000OOOO0
               && var7 <= this.O00000000OOOO0 + this.O0000000O) {
               this.O00000000OOO00 = true;
               if (var7 >= this.O0000000O0 && var7 <= this.O0000000O0 + this.O0000000O00) {
                  this.O00000000OOO0O = var7 - this.O0000000O0;
               } else {
                  this.O00000000OOO0O = this.O0000000O00 * 0.5F;
               }

               this.O00000000(var7);
               return true;
            }
         }

         for (WildMultiplayerScreen.W286 var11 : this.O0000000000O0) {
            if (var11.O000000000O0OO && var11.O000000000OO && var11.O00000000(var6, var7)) {
               var11.O0000000000O0O = 1.0F;
               var11.O0000000000OO = 1.0F;
               this.O00000000(var11.O0000000000);
               return true;
            }
         }

         for (WildMultiplayerScreen.W286 var14 : this.O00000000000OO) {
            if (var14.O000000000O0OO
               && var14.O000000000OO
               && var14.O0000000000 == WildMultiplayerScreen.W284.SERVER
               && var14.O00000000(var6, var7)
               && !(var14.O000000000O00O < 0.1F)) {
               if (this.O00000000O00OO == var14.O000000000O0O && this.O00000000O0O0O == var14.O000000000O0O && var8 - this.O000000000O00 < 360000000L) {
                  var14.O0000000000O0O = 1.0F;
                  var14.O0000000000OO = 1.0F;
                  this.O00000000(WildMultiplayerScreen.W284.JOIN);
               } else {
                  this.O00000000O00OO = var14.O000000000O0O;
                  this.O00000000O0OO = "Ready";
                  var14.O0000000000OO = Math.max(var14.O0000000000OO, 0.38F);
               }

               this.O00000000O0O0O = var14.O000000000O0O;
               this.O000000000O00 = var8;
               this.O0000000000O0O();
               return true;
            }
         }

         return true;
      } else {
         return super.mouseClicked(mouseX, mouseY, button);
      }
   }

   public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      if (this.O00000000000O0.size() <= this.O00000000O0O00) {
         return true;
      } else {
         this.O00000000OO0O = System.nanoTime();
         this.O00000000O0O -= (float)verticalAmount;
         int var9 = Math.max(0, this.O00000000000O0.size() - Math.max(1, this.O00000000O0O00));
         this.O00000000O0O = O000000000(this.O00000000O0O, 0.0F, (float)var9);
         return true;
      }
   }

   public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      if (this.O00000000OOO00 && this.O0000000O000 && this.client != null && this.client.getWindow() != null) {
         this.O00000000(this.O000000000(this.client.getWindow(), mouseY));
         return true;
      } else {
         return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
      }
   }

   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      if (button == 0 && this.O00000000OOO00) {
         this.O00000000OOO00 = false;
         return true;
      } else {
         return super.mouseReleased(mouseX, mouseY, button);
      }
   }

   private void O00000000(float f) {
      float var2 = this.O0000000O - this.O0000000O00;
      if (!(var2 <= 0.001F)) {
         float var3 = O000000000(f - this.O00000000OOO0O, this.O00000000OOOO0, this.O00000000OOOO0 + var2);
         float var4 = (var3 - this.O00000000OOOO0) / var2;
         int var5 = Math.max(0, this.O00000000000O0.size() - Math.max(1, this.O00000000O0O00));
         this.O00000000OO0O = System.nanoTime();
         this.O00000000O0O = var4 * var5;
      }
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      boolean var4 = (modifiers & 2) != 0 || (modifiers & 8) != 0;
      if (keyCode == 256) {
         this.O00000000(WildMultiplayerScreen.W284.BACK);
         return true;
      } else if (keyCode == 257 || keyCode == 335) {
         this.O00000000(WildMultiplayerScreen.W284.JOIN);
         return true;
      } else if (var4 && keyCode == 67) {
         this.O0000000000O00();
         return true;
      } else if (keyCode == 82) {
         this.O00000000(WildMultiplayerScreen.W284.REFRESH);
         return true;
      } else if (keyCode == 261) {
         this.O00000000(WildMultiplayerScreen.W284.DELETE);
         return true;
      } else if (keyCode == 264) {
         if (var4) {
            this.O0000000000(1);
         } else {
            this.O00000000000(1);
         }

         return true;
      } else if (keyCode == 265) {
         if (var4) {
            this.O0000000000(-1);
         } else {
            this.O00000000000(-1);
         }

         return true;
      } else {
         return super.keyPressed(keyCode, scanCode, modifiers);
      }
   }

   public boolean charTyped(char chr, int modifiers) {
      if (!this.O00000000000O0.isEmpty() && chr > ' ') {
         char var3 = Character.toLowerCase(chr);
         int var4 = this.O00000000O00OO < 0 ? -1 : this.O00000000O00OO;
         int var5 = this.O00000000000O0.size();

         for (int var6 = 1; var6 <= var5; var6++) {
            int var7 = ((var4 + var6) % var5 + var5) % var5;
            ServerInfo var8 = this.O00000000000O0.get(var7);
            String var9 = var8 == null ? "" : O00000000(var8.name, "");
            if (!var9.isEmpty() && Character.toLowerCase(var9.charAt(0)) == var3) {
               this.O00000000O00OO = var7;
               this.O00000000O0OO = "Jumped to " + var9;
               this.O0000000000O0O();
               return true;
            }
         }

         return true;
      } else {
         return super.charTyped(chr, modifiers);
      }
   }

   public boolean shouldPause() {
      return false;
   }

   public boolean shouldCloseOnEsc() {
      return false;
   }

   public void close() {
      this.O00000000(WildMultiplayerScreen.W284.BACK);
   }

   public void removed() {
      this.O000000000(true);
      this.O0000000000OO0();
      this.O000000000000O.close();
      super.removed();
   }

   private void O000000000() {
      MinecraftClient var1 = this.client == null ? MinecraftClient.getInstance() : this.client;
      if (var1 != null) {
         if (this.O0000000O0000.compareAndSet(false, true)) {
            this.O000000000(true);
            this.O0000000000OO0();
            this.O00000000000O0.clear();
            this.O00000000O0OO = "Loading servers...";
            ServerList var2 = new ServerList(var1);
            CompletableFuture.runAsync(() -> {
               try {
                  var2.loadFile();
               } catch (Throwable var2x) {
               }
            }).whenComplete((void_, throwable) -> var1.execute(() -> this.O00000000(var2, throwable)));
         }
      }
   }

   private void O00000000(ServerList serverList, Throwable throwable) {
      try {
         this.O0000000000OO0 = serverList;
         this.O00000000000O0.clear();

         try {
            int var3 = serverList == null ? 0 : serverList.size();

            for (int var4 = 0; var4 < var3; var4++) {
               ServerInfo var5 = serverList.get(var4);
               if (var5 != null) {
                  this.O00000000000O0.add(var5);
               }
            }
         } catch (Throwable var9) {
         }

         if (throwable != null) {
            this.O00000000O0OO = "Failed to load servers";
         }

         if (this.O00000000000O0.isEmpty()) {
            this.O00000000O00OO = -1;
            this.O00000000O0O = 0.0F;
            this.O00000000O0O0 = 0.0F;
            if (throwable == null) {
               this.O00000000O0OO = "No saved servers";
            }
         } else {
            if (this.O00000000O00OO < 0 || this.O00000000O00OO >= this.O00000000000O0.size()) {
               this.O00000000O00OO = 0;
            }

            this.O00000000O0O = O000000000(this.O00000000O0O, 0.0F, (float)Math.max(0, this.O00000000000O0.size() - this.O00000000O0O00));
            this.O0000000000O0O();
            if (throwable == null) {
               this.O00000000O0OO = "Choose a server";
            }

            this.O00000000(false);
         }
      } finally {
         this.O0000000O0000.set(false);
      }
   }

   private void O0000000000() {
      if (this.O0000000000OO0 != null) {
         try {
            this.O0000000000OO0.saveFile();
         } catch (Throwable var2) {
         }
      }
   }

   private void O00000000(boolean bl) {
      MinecraftClient var2 = this.client == null ? MinecraftClient.getInstance() : this.client;
      if (var2 != null) {
         int var3 = ++this.O00000000OO000;
         this.O000000000(false);
         ArrayList var4 = new ArrayList<>(this.O00000000000O0);
         this.O00000000OO.set(0);
         this.O00000000OO0 = var4.size();
         this.O00000000OO00.set(0);
         if (bl) {
            this.O0000000000000();
         }

         this.O00000000O0OO = bl ? "Refreshing servers..." : "Pinging servers...";
         this.O00000000(var2, var4, var3);
      }
   }

   private void O00000000(MinecraftClient minecraftClient, List<ServerInfo> list, int i) {
      if (list.isEmpty()) {
         this.O00000000000();
      } else {
         MultiplayerServerListPinger var4 = this.O00000000000O;
         ScheduledExecutorService var5 = Executors.newSingleThreadScheduledExecutor(O000000000000);
         this.O00000000O0OOO = var5;
         var5.scheduleWithFixedDelay(() -> this.O00000000(minecraftClient, var4, list, i, var5), 140L, 70L, TimeUnit.MILLISECONDS);
      }
   }

   private void O00000000(
      MinecraftClient minecraftClient,
      MultiplayerServerListPinger multiplayerServerListPinger,
      List<ServerInfo> list,
      int i,
      ScheduledExecutorService scheduledExecutorService
   ) {
      if (i == this.O00000000OO000 && !scheduledExecutorService.isShutdown()) {
         try {
            if (this.O00000000OO.get() < list.size()) {
               int var6 = this.O00000000OO.getAndIncrement();
               ServerInfo var7 = var6 < list.size() ? (ServerInfo)list.get(var6) : null;
               if (var7 == null) {
                  this.O00000000OO.set(list.size());
               } else {
                  this.O00000000(minecraftClient, multiplayerServerListPinger, var7, i);
               }
            }

            multiplayerServerListPinger.tick();
            if (this.O00000000OO.get() >= this.O00000000OO0 && this.O00000000OO00.get() <= 0) {
               minecraftClient.execute(this::O00000000000);
               O00000000(multiplayerServerListPinger);
               scheduledExecutorService.shutdown();
               if (this.O00000000O0OOO == scheduledExecutorService) {
                  this.O00000000O0OOO = null;
               }
            }
         } catch (Throwable var8) {
         }
      } else {
         O00000000(multiplayerServerListPinger);
         scheduledExecutorService.shutdown();
      }
   }

   private void O00000000(MinecraftClient minecraftClient, MultiplayerServerListPinger multiplayerServerListPinger, ServerInfo serverInfo, int i) {
      this.O00000000OO00.incrementAndGet();

      try {
         minecraftClient.execute(() -> this.O00000000(serverInfo, i));
         multiplayerServerListPinger.add(
            serverInfo,
            () -> minecraftClient.execute(() -> this.O000000000(serverInfo, i)),
            () -> minecraftClient.execute(() -> this.O0000000000(serverInfo, i))
         );
      } catch (Throwable var6) {
         minecraftClient.execute(() -> this.O0000000000(serverInfo, i));
      }
   }

   private void O00000000(ServerInfo serverInfo, int i) {
      if (i == this.O00000000OO000) {
         serverInfo.setStatus(Status.PINGING);
         serverInfo.playerCountLabel = Text.literal("...");
      }
   }

   private void O000000000(ServerInfo serverInfo, int i) {
      if (i == this.O00000000OO000) {
         CompletableFuture.runAsync(() -> {
            try {
               ServerList.updateServerListEntry(serverInfo);
            } catch (Throwable var2) {
            }
         }, Util.getMainWorkerExecutor());
         this.O00000000(i);
      }
   }

   private void O0000000000(ServerInfo serverInfo, int i) {
      if (i == this.O00000000OO000) {
         serverInfo.ping = -1L;
         serverInfo.setStatus(Status.UNREACHABLE);
         if (serverInfo.label == null || serverInfo.label.getString().isBlank()) {
            serverInfo.label = Text.literal("Cannot reach server");
         }

         serverInfo.playerCountLabel = Text.literal("-");
         this.O00000000(i);
      }
   }

   private void O00000000(int i) {
      if (i == this.O00000000OO000) {
         this.O00000000OO00.updateAndGet(ix -> Math.max(0, ix - 1));
         this.O00000000000();
      }
   }

   private void O00000000000() {
      if (this.O00000000OO.get() >= this.O00000000OO0 && this.O00000000OO00.get() <= 0) {
         if (!this.O00000000000O0.isEmpty()) {
            this.O00000000O0OO = "Servers updated";
         }
      }
   }

   private void O000000000(boolean bl) {
      if (bl) {
         this.O00000000OO000++;
      }

      ScheduledExecutorService var2 = this.O00000000O0OOO;
      this.O00000000O0OOO = null;
      MultiplayerServerListPinger var3 = this.O00000000000O;
      this.O00000000000O = new MultiplayerServerListPinger();
      this.O00000000OO.set(0);
      this.O00000000OO0 = 0;
      this.O00000000OO00.set(0);
      if (var2 != null) {
         var2.shutdownNow();
      }

      CompletableFuture.runAsync(() -> O00000000(var3), Util.getMainWorkerExecutor());
   }

   private static void O00000000(MultiplayerServerListPinger multiplayerServerListPinger) {
      try {
         multiplayerServerListPinger.cancel();
      } catch (Throwable var2) {
      }
   }

   private void O000000000000() {
      if (this.O00000000000O0.isEmpty()) {
         this.O0000000000000();
         this.O000000000();
         this.O00000000O0OO = "Refreshing servers...";
      } else {
         this.O00000000(true);
      }
   }

   private void O0000000000000() {
      this.O00000000OO00O = this.O000000000O000;

      for (WildMultiplayerScreen.W286 var2 : this.O00000000000OO) {
         if (var2.O000000000O0OO) {
            var2.O0000000000OO = Math.max(var2.O0000000000OO, 0.72F);
            var2.O0000000000O0O = Math.max(var2.O0000000000O0O, 0.16F);
            var2.O0000000000OO0 = Math.max(var2.O0000000000OO0, 0.65F);
         }
      }

      for (WildMultiplayerScreen.W286 var4 : this.O0000000000O0) {
         if (var4.O0000000000 == WildMultiplayerScreen.W284.REFRESH) {
            var4.O0000000000OO = Math.max(var4.O0000000000OO, 1.0F);
            var4.O0000000000O0O = Math.max(var4.O0000000000O0O, 0.18F);
            break;
         }
      }
   }

   private void O000000000000O() {
      Theme var1 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.AURORA;
      this.O00000000O00O = var1;
      O0000O000OO.W351 var2 = O00000000.O000000000(var1);
      if (var2 != null) {
         this.O00000000O0000 = var2.O0000000000();
         this.O00000000O000O = var2.O00000000000();
         this.O00000000O00O0 = var2.O000000000000();
      } else {
         this.O00000000O00O0 = false;
         Color var3 = var1.O00000000();
         this.O00000000O0000 = 0xFF000000 | var3.getRGB() & 16777215;
         float[] var4 = Color.RGBtoHSB(var3.getRed(), var3.getGreen(), var3.getBlue(), null);
         this.O00000000O000O = 0xFF000000
            | Color.HSBtoRGB((var4[0] + 0.075F) % 1.0F, Math.min(1.0F, var4[1] * 1.08F), Math.min(1.0F, var4[2] * 1.18F)) & 16777215;
      }
   }

   private void O00000000(Window window, int i, int j, float f, long l) {
      float var7 = this.O00000000(window, (double)i);
      float var8 = this.O000000000(window, (double)j);
      if (!this.O000000000OOOO) {
         this.O000000000O00O = var7;
         this.O000000000O0O = var8;
         this.O000000000O0O0 = 0.0F;
         this.O000000000O0OO = 0.0F;
         this.O000000000OOOO = true;
      } else {
         float var9 = var7 - this.O000000000O00O;
         float var10 = var8 - this.O000000000O0O;
         float var11 = O000000000(var9, var10);
         if (var11 > 0.2F) {
            this.O000000000O0O0 = O000000000(var9 / Math.max(1.0F, (float)window.getFramebufferWidth()) / f, -3.0F, 3.0F);
            this.O000000000O0OO = O000000000(var10 / Math.max(1.0F, (float)window.getFramebufferHeight()) / f, -3.0F, 3.0F);
         } else {
            float var12 = (float)Math.pow(8.0E-4F, f);
            this.O000000000O0O0 *= var12;
            this.O000000000O0OO *= var12;
         }

         this.O000000000O00O = var7;
         this.O000000000O0O = var8;
         if (var11 > 1.5F) {
            this.O000000000O0 = l;
         }
      }
   }

   private void O000000000(int i, int j, float f) {
      if (!this.O00000000O) {
         this.O000000000OO = this.O000000000O00O;
         this.O000000000OO0 = this.O000000000O0O;
         this.O000000000OO00 = 0.0F;
         this.O000000000OO0O = 0.0F;
         this.O00000000O = true;
      } else {
         float var4 = this.O000000000OO;
         float var5 = this.O000000000OO0;
         float var6 = O000000000(this.O000000000O00O - this.O000000000OO, this.O000000000O0O - this.O000000000OO0);
         float var7 = (1.0F - (float)Math.pow(1.8E-5F, f)) * (0.62F + O000000000(var6 / 680.0F, 0.0F, 0.32F));
         this.O000000000OO = this.O000000000OO + (this.O000000000O00O - this.O000000000OO) * O000000000(var7, 0.035F, 0.18F);
         this.O000000000OO0 = this.O000000000OO0 + (this.O000000000O0O - this.O000000000OO0) * O000000000(var7, 0.035F, 0.18F);
         float var8 = O000000000((this.O000000000OO - var4) / Math.max(1.0F, (float)i) / f, -1.35F, 1.35F);
         float var9 = O000000000((this.O000000000OO0 - var5) / Math.max(1.0F, (float)j) / f, -1.35F, 1.35F);
         float var10 = 1.0F - (float)Math.pow(0.004F, f);
         this.O000000000OO00 = this.O000000000OO00 + (var8 - this.O000000000OO00) * var10;
         this.O000000000OO0O = this.O000000000OO0O + (var9 - this.O000000000OO0O) * var10;
      }
   }

   private void O00000000000O() {
      if (!this.O00000000O0) {
         this.O000000000OOO = this.O000000000OO;
         this.O000000000OOO0 = this.O000000000OO0;
         this.O00000000O0 = true;
         this.O00000000(this.O000000000OO, this.O000000000OO0, 0.24F);
      } else {
         float var1 = O000000000(this.O000000000OO - this.O000000000OOO, this.O000000000OO0 - this.O000000000OOO0);
         if (var1 > 8.5F) {
            this.O00000000(this.O000000000OO, this.O000000000OO0, O000000000(var1 / 240.0F, 0.08F, 0.38F));
            this.O000000000OOO = this.O000000000OO;
            this.O000000000OOO0 = this.O000000000OO0;
         }
      }
   }

   private boolean O00000000(Window window, int i, int j, int k, int l, long m) {
      if (this.O00000000O00 == i && this.O00000000O000 == j) {
         return false;
      } else {
         this.O00000000O00 = i;
         this.O00000000O000 = j;
         float var8 = O000000000(this.O00000000(window, (double)k), 0.0F, (float)i);
         float var9 = O000000000(this.O000000000(window, (double)l), 0.0F, (float)j);
         this.O000000000O00O = this.O000000000OO = this.O000000000OOO = var8;
         this.O000000000O0O = this.O000000000OO0 = this.O000000000OOO0 = var9;
         this.O000000000O0O0 = this.O000000000O0OO = 0.0F;
         this.O000000000OO00 = this.O000000000OO0O = 0.0F;
         this.O000000000OOOO = true;
         this.O00000000O = true;
         this.O00000000O0 = true;
         this.O000000000O0 = m;
         this.O00000000OOO00 = false;
         this.O0000000000O0O.O00000000(0.0F);
         this.O0000000000OO.O00000000(0.0F);
         this.O00000000O0O0 = this.O00000000O0O;
         this.O00000000O0OO0 = null;
         this.O00000000000O0();
         this.O00000000(var8, var9, 0.14F);
         this.O0000000000O0O();
         return true;
      }
   }

   private void O00000000000O0() {
      for (WildMultiplayerScreen.W287 var4 : this.O0000000000O00) {
         var4.O00000000 = 0.0F;
         var4.O000000000 = 0.0F;
         var4.O0000000000 = -100.0F;
         var4.O00000000000 = 0.0F;
      }
   }

   private void O00000000(float f, float g, float h) {
      int var4 = 0;
      float var5 = -1.0F;

      for (int var6 = 0; var6 < this.O0000000000O00.length; var6++) {
         float var7 = this.O000000000O000 - this.O0000000000O00[var6].O0000000000;
         if (this.O0000000000O00[var6].O00000000000 <= 0.0F) {
            var4 = var6;
            break;
         }

         if (var7 > var5) {
            var5 = var7;
            var4 = var6;
         }
      }

      this.O0000000000O00[var4].O00000000 = f;
      this.O0000000000O00[var4].O000000000 = g;
      this.O0000000000O00[var4].O0000000000 = this.O000000000O000;
      this.O0000000000O00[var4].O00000000000 = h;
   }

   private void O00000000(int i, int j, float f, float g, float h) {
      float var6 = O00000000(i, j);
      float var7 = O000000000(i * 0.38F, 520.0F * var6, 760.0F * var6);
      float var8 = O000000000(j * 0.078F, 72.0F * var6, 94.0F * var6);
      float var9 = 14.0F * var6;
      this.O00000000O0O00 = Math.max(3, Math.min(6, (int)(j * 0.54F / (var8 + var9))));
      if (this.O00000000000O0.size() < this.O00000000O0O00 && !this.O00000000000O0.isEmpty()) {
         this.O00000000O0O00 = Math.max(1, this.O00000000000O0.size());
      }

      int var10 = Math.max(0, this.O00000000000O0.size() - Math.max(1, this.O00000000O0O00));
      this.O00000000O0O = O000000000(this.O00000000O0O, 0.0F, (float)var10);
      float var11 = 1.0F - (float)Math.exp(-22.0F * h);
      this.O00000000O0O0 = this.O00000000O0O0 + (this.O00000000O0O - this.O00000000O0O0) * var11;
      if (Float.isNaN(this.O00000000O0O0)) {
         this.O00000000O0O0 = this.O00000000O0O;
      }

      float var12 = this.O00000000O0O00 * var8 + Math.max(0, this.O00000000O0O00 - 1) * var9;
      float var13 = i * 0.5F + f * 1.65F * var6;
      float var14 = j * 0.255F + g * 1.05F * var6;
      if (var14 + var12 > j * 0.79F) {
         var14 = j * 0.79F - var12;
      }

      var14 = Math.max(j * 0.18F, var14);
      this.O00000000OO0O0 = var13 - var7 * 0.5F;
      this.O00000000OO0OO = var14;
      this.O00000000OOO = var7;
      this.O00000000OOO0 = var12;
      this.O0000000O000 = var10 > 0;
      if (this.O0000000O000) {
         this.O00000000OOOOO = Math.max(4.0F, 5.5F * var6);
         this.O00000000OOOO = var13 + var7 * 0.5F + 16.0F * var6;
         this.O00000000OOOO0 = var14;
         this.O0000000O = var12;
         float var15 = O000000000((float)this.O00000000O0O00 / this.O00000000000O0.size(), 0.1F, 1.0F);
         this.O0000000O00 = Math.max(34.0F * var6, this.O0000000O * var15);
         float var16 = this.O0000000O - this.O0000000O00;
         float var17 = var10 == 0 ? 0.0F : this.O00000000O0O0 / var10;
         this.O0000000O0 = this.O00000000OOOO0 + var16 * var17;
      }

      int var33 = (int)Math.floor(this.O00000000O0O0);
      float var34 = this.O00000000O0O0 - var33;
      int var35 = this.O00000000000O0.isEmpty() ? 1 : Math.min(this.O00000000000O0.size(), this.O00000000O0O00 + 2);

      while (this.O00000000000OO.size() < var35) {
         this.O00000000000OO.add(new WildMultiplayerScreen.W286("", WildMultiplayerScreen.W284.SERVER));
      }

      for (int var18 = 0; var18 < this.O00000000000OO.size(); var18++) {
         WildMultiplayerScreen.W286 var19 = this.O00000000000OO.get(var18);
         if (var18 >= var35) {
            var19.O000000000O0OO = false;
         } else {
            var19.O000000000O0OO = true;
            var19.O00000000000O0 = var7;
            var19.O00000000000OO = var8;
            var19.O000000000000 = var13 - var7 * 0.5F;
            var19.O0000000000000 = var14 + (var18 - var34) * (var8 + var9);
            var19.O0000000000O = Math.min(var8 * 0.36F, 20.0F * var6);
            var19.O000000000O000 = 58.0F * var6;
            var19.O000000000OO = !this.O00000000000O0.isEmpty();
            var19.O0000000000OO0 = this.O000000000(var18);
            if (this.O00000000000O0.isEmpty()) {
               var19.O00000000 = "No saved servers";
               var19.O000000000 = "Add a server or connect directly";
               var19.O000000000O0O = -1;
               var19.O000000000O0O0 = false;
               var19.O000000000O00O = O000000000(O000000000((this.O000000000O000 - 0.15F) / 0.92F, 0.0F, 1.0F));
            } else {
               int var20 = var33 + var18;
               ServerInfo var21 = var20 >= 0 && var20 < this.O00000000000O0.size() ? this.O00000000000O0.get(var20) : null;
               var19.O000000000O0O = var20;
               var19.O000000000OO = var21 != null;
               var19.O00000000 = var21 == null ? "" : O00000000(var21.name, "Unnamed server");
               var19.O000000000 = var21 == null ? "" : O00000000(var21.address, "No address");
               var19.O000000000O0O0 = var20 == this.O00000000O00OO;
               float var22 = var19.O0000000000000 + var8 * 0.5F;
               float var24 = var14 + var12;
               float var25 = var8 * 0.65F;
               float var26 = O000000000((var22 - var14 + var25) / var25, 0.0F, 1.0F);
               float var27 = O000000000((var24 + var25 - var22) / var25, 0.0F, 1.0F);
               float var28 = var26 * var27;
               var19.O000000000O00O = O000000000(O000000000((this.O000000000O000 - 0.15F - var18 * 0.045F) / 0.92F, 0.0F, 1.0F)) * var28;
               var19.O0000000000OO = Math.max(var19.O0000000000OO, var19.O0000000000OO0 * 0.34F);
            }

            this.O00000000(var19, h, var6);
         }
      }

      float var36 = 10.0F * var6;
      float var37 = O000000000(i * 0.08F, 95.0F * var6, 135.0F * var6);
      float var38 = 42.0F * var6;
      int var39 = Math.min(5, this.O0000000000O0.size());
      int var40 = this.O0000000000O0.size() - var39;
      float var23 = var39 * var37 + (var39 - 1) * var36;
      float var41 = var40 * var37 + (var40 - 1) * var36;
      float var42 = i * 0.5F - var23 * 0.5F + f * 1.35F * var6;
      float var43 = i * 0.5F - var41 * 0.5F + f * 1.35F * var6;
      float var44 = Math.min(j - var38 * 2.0F - var36 - 28.0F * var6, var14 + var12 + 24.0F * var6 + g * 0.45F * var6);

      for (int var45 = 0; var45 < this.O0000000000O0.size(); var45++) {
         WildMultiplayerScreen.W286 var29 = this.O0000000000O0.get(var45);
         var29.O000000000O0OO = true;
         var29.O00000000000O0 = var37;
         var29.O00000000000OO = var38;
         boolean var30 = var45 < var39;
         int var31 = var30 ? var45 : var45 - var39;
         var29.O000000000000 = (var30 ? var42 : var43) + var31 * (var37 + var36);
         var29.O0000000000000 = var44 + (var30 ? 0.0F : var38 + var36);
         var29.O0000000000O = Math.min(var38 * 0.42F, 18.0F * var6);
         var29.O000000000O000 = 42.0F * var6;
         var29.O000000000O00O = O000000000(O000000000((this.O000000000O000 - 0.38F - var45 * 0.035F) / 0.74F, 0.0F, 1.0F));
         var29.O000000000OO = this.O000000000(var29.O0000000000);
         var29.O000000000O0O0 = false;
         var29.O0000000000OO0 = var29.O0000000000 == WildMultiplayerScreen.W284.REFRESH ? this.O000000000(0) : 0.0F;
         this.O00000000(var29, h, var6);
      }
   }

   private float O000000000(int i) {
      float var2 = this.O000000000O000 - this.O00000000OO00O - i * 0.055F;
      if (!(var2 < 0.0F) && !(var2 > 0.86F)) {
         float var3 = O000000000(var2 / 0.86F, 0.0F, 1.0F);
         return (float)Math.sin(var3 * Math.PI) * O000000000(1.0F - var3 * 0.42F);
      } else {
         return 0.0F;
      }
   }

   private void O00000000(WildMultiplayerScreen.W286 o0000000000, float f, float g) {
      float var4 = O00000000(
         this.O000000000O00O,
         this.O000000000O0O,
         o0000000000.O000000000000,
         o0000000000.O0000000000000,
         o0000000000.O00000000000O0,
         o0000000000.O00000000000OO,
         o0000000000.O0000000000O
      );
      boolean var5 = var4 <= 0.0F;
      float var6 = o0000000000.O0000000000 == WildMultiplayerScreen.W284.SERVER ? 42.0F * g : 24.0F * g;
      float var7 = 1.0F - O000000000(O000000000(Math.max(0.0F, var4) / Math.max(1.0F, var6), 0.0F, 1.0F));
      float var8 = o0000000000.O000000000O0O0 ? 0.42F : 0.0F;
      float var9 = o0000000000.O000000000OO ? Math.max(var7, var8) : 0.0F;
      float var10 = o0000000000.O000000000OO && var5 ? 1.0F : var8 * 0.45F;
      o0000000000.O0000000000O0 = o0000000000.O0000000000O0 + (var10 - o0000000000.O0000000000O0) * (1.0F - (float)Math.pow(1.1E-4F, f));
      o0000000000.O0000000000O00 = o0000000000.O0000000000O00 + (var9 - o0000000000.O0000000000O00) * (1.0F - (float)Math.pow(1.6E-4F, f));
      o0000000000.O0000000000O0O = o0000000000.O0000000000O0O + (0.0F - o0000000000.O0000000000O0O) * (1.0F - (float)Math.pow(1.8E-5F, f));
      o0000000000.O0000000000OO = o0000000000.O0000000000OO + (0.0F - o0000000000.O0000000000OO) * (1.0F - (float)Math.pow(6.0E-6F, f));
      float var11 = O000000000((this.O000000000OO - o0000000000.O000000000000) / Math.max(1.0F, o0000000000.O00000000000O0), 0.0F, 1.0F);
      float var12 = O000000000((this.O000000000OO0 - o0000000000.O0000000000000) / Math.max(1.0F, o0000000000.O00000000000OO), 0.0F, 1.0F);
      float var13 = 1.0F - (float)Math.pow(2.5E-4F, f);
      o0000000000.O000000000O = o0000000000.O000000000O + (var11 - o0000000000.O000000000O) * var13;
      o0000000000.O000000000O0 = o0000000000.O000000000O0 + (var12 - o0000000000.O000000000O0) * var13;
      float var14 = 1.0F
         + o0000000000.O0000000000O00 * (o0000000000.O0000000000 == WildMultiplayerScreen.W284.SERVER ? 0.034F : 0.042F)
         + (o0000000000.O000000000O0O0 ? 0.008F : 0.0F)
         + o0000000000.O0000000000OO0 * 0.018F
         - o0000000000.O0000000000O0O * 0.065F;
      o0000000000.O0000000000OOO = o0000000000.O00000000000.O00000000(var14, f);
      float var15 = (1.0F - o0000000000.O000000000O00O) * (o0000000000.O0000000000 == WildMultiplayerScreen.W284.SERVER ? 18.0F : 11.0F) * g;
      float var16 = (o0000000000.O000000000O - 0.5F)
         * (o0000000000.O0000000000 == WildMultiplayerScreen.W284.SERVER ? 9.5F : 6.5F)
         * g
         * o0000000000.O0000000000O00;
      float var17 = (o0000000000.O000000000O0 - 0.5F)
            * (o0000000000.O0000000000 == WildMultiplayerScreen.W284.SERVER ? 5.5F : 4.0F)
            * g
            * o0000000000.O0000000000O00
         - o0000000000.O0000000000O0 * 1.2F * g
         + var15
         - o0000000000.O0000000000OO0 * (o0000000000.O0000000000 == WildMultiplayerScreen.W284.SERVER ? 5.0F : 2.5F) * g;
      o0000000000.O000000000000O = o0000000000.O000000000000 + var16;
      o0000000000.O00000000000O = o0000000000.O0000000000000 + var17;
      o0000000000.O000000000O00 = O000000000(
         O000000000(this.O000000000OO00, this.O000000000OO0O) * 0.46F * o0000000000.O0000000000O00
            + Math.abs(o0000000000.O00000000000.O000000000()) * 0.032F
            + o0000000000.O0000000000OO0 * 0.22F,
         0.0F,
         1.0F
      );
   }

   private MainMenuScreen.W281 O00000000(int i, int j, int k, float f, float g, long l) {
      float var8 = Math.max(0.0F, (float)(l - this.O000000000O0) / 1.0E9F);
      float var9 = O000000000(O000000000(this.O000000000OO00, this.O000000000OO0O), 0.0F, 3.0F);
      float var10 = Math.max((float)Math.exp(-var8 * 1.35F), O000000000(var9 * 0.28F, 0.0F, 1.0F));
      float var11 = O000000000(O000000000(this.O000000000O000 / 0.95F, 0.0F, 1.0F));
      float var12 = O00000000(i, j);
      float var13 = 0.0F;
      ArrayList var14 = new ArrayList();

      for (WildMultiplayerScreen.W286 var16 : this.O00000000000OO) {
         if (var16.O000000000O0OO && !(var16.O000000000O00O <= 0.01F)) {
            var13 = Math.max(var13, var16.O0000000000OO);
            var14.add(this.O00000000(var16));
         }
      }

      for (WildMultiplayerScreen.W286 var22 : this.O0000000000O0) {
         if (var22.O000000000O0OO) {
            var13 = Math.max(var13, var22.O0000000000OO);
            var14.add(this.O00000000(var22));
         }
      }

      MainMenuScreen.W283[] var21 = new MainMenuScreen.W283[14];

      for (int var23 = 0; var23 < 14; var23++) {
         WildMultiplayerScreen.W287 var17 = this.O0000000000O00[var23];
         float var18 = Math.max(0.0F, this.O000000000O000 - var17.O0000000000);
         float var19 = var18 > 3.1F ? 0.0F : var17.O00000000000;
         var21[var23] = new MainMenuScreen.W283(var17.O00000000 / Math.max(1.0F, (float)i), var17.O000000000 / Math.max(1.0F, (float)j), var18, var19);
      }

      return new MainMenuScreen.W281(
         i,
         j,
         k,
         this.O000000000O000,
         this.O000000000OO,
         this.O000000000OO0,
         this.O000000000OO / Math.max(1.0F, (float)i),
         this.O000000000OO0 / Math.max(1.0F, (float)j),
         this.O000000000OO00,
         this.O000000000OO0O,
         var9,
         O000000000000(this.O00000000O0000),
         O0000000000000(this.O00000000O0000),
         O000000000000O(this.O00000000O0000),
         O000000000000(this.O00000000O000O),
         O0000000000000(this.O00000000O000O),
         O000000000000O(this.O00000000O000O),
         -f * 0.0011F,
         -g * 9.0E-4F,
         f * 1.25F * var12,
         g * 1.05F * var12,
         f * 1.55F * var12,
         g * 1.35F * var12,
         var10,
         var10 > 0.08F ? 1.0F : 0.88F,
         var11,
         O000000000(var13, 0.0F, 1.0F),
         this.O00000000O00O == Theme.SAKURA_BREEZE,
         this.O00000000O00O == Theme.VERNAL_SOLSTICE,
         this.O00000000O00O == Theme.MIDNIGHT_AZURE,
         this.O00000000O00O0,
         null,
         null,
         List.of(),
         List.of(),
         List.of(),
         new MainMenuScreen.W271(0.0F, 0.0F, 0.0F, 0.0F, 0.0F),
         var14,
         var21
      );
   }

   private MainMenuScreen.W265 O00000000(WildMultiplayerScreen.W286 o0000000000) {
      float var2 = o0000000000.O000000000OO ? o0000000000.O000000000O00O : o0000000000.O000000000O00O * 0.62F;
      return new MainMenuScreen.W265(
         o0000000000.O00000000,
         o0000000000.O000000000000O,
         o0000000000.O00000000000O,
         o0000000000.O00000000000O0,
         o0000000000.O00000000000OO,
         o0000000000.O0000000000O,
         o0000000000.O0000000000O0,
         o0000000000.O0000000000O00,
         o0000000000.O0000000000O0O,
         var2,
         o0000000000.O0000000000OO,
         o0000000000.O000000000O000,
         o0000000000.O0000000000OOO,
         o0000000000.O000000000O,
         o0000000000.O000000000O0,
         o0000000000.O000000000O00
      );
   }

   private void O00000000(MainMenuScreen.W281 o000000000O) {
      try {
         WildClient.O000000000000O();
         RenderManager var2 = WildClient.O00000000();
         if (var2 == null) {
            return;
         }

         O0000O00O0OOO0.W373 var3 = O0000O00O0OOO0.O00000000();

         try {
            var2.O00000000(o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
            float var4 = O00000000(o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
            float var5 = o000000000O.framebufferWidth() * 0.5F + o000000000O.uiParallaxX() * 0.16F;
            float var6 = o000000000O.framebufferHeight() * 0.135F + o000000000O.uiParallaxY() * 0.1F;
            float var7 = O000000000(o000000000O.sceneEntry());
            var2.O00000000(FontRegistry.O00000000000, var5, var6, 38.0F * var4, "Multiplayer", this.O0000000000(0.92F * var7), "c");
            String var8 = this.O00000000000O0.size() == 1 ? "1 saved server" : this.O00000000000O0.size() + " saved servers";
            var2.O00000000(
               FontRegistry.O00000000, var5, var6 + 28.0F * var4, 25.0F * var4, var8 + "  /  " + this.O00000000O0OO, this.O00000000000(0.48F * var7), "c"
            );
            var2.O0000000000();
            var2.O00000000(
               this.O00000000OO0O0 - 15.0F * var4,
               this.O00000000OO0OO - 8.0F * var4,
               this.O00000000OOO + 30.0F * var4,
               this.O00000000OOO0 + 16.0F * var4,
               0.0F,
               0.0F,
               0.0F,
               0.0F
            );

            for (WildMultiplayerScreen.W286 var10 : this.O00000000000OO) {
               if (var10.O000000000O0OO && var10.O000000000O00O > 0.01F) {
                  this.O00000000(var2, var10, var4);
               }
            }

            var2.O0000000000();
            var2.O0000000000000();

            for (WildMultiplayerScreen.W286 var18 : this.O0000000000O0) {
               if (var18.O000000000O0OO) {
                  this.O000000000(var2, var18, var4);
               }
            }

            if (this.O0000000O000) {
               float var17 = O000000000(o000000000O.sceneEntry());
               var2.O00000000(
                  this.O00000000OOOO,
                  this.O00000000OOOO0,
                  this.O00000000OOOOO,
                  this.O0000000O,
                  this.O00000000OOOOO * 0.5F,
                  this.O00000000O00O0 ? O00000000(0.0F, 0.0F, 0.0F, 0.045F * var17) : O00000000(1.0F, 1.0F, 1.0F, 0.05F * var17)
               );
               int var19 = O00000000(this.O00000000O000O, this.O00000000O0000, 0.5F, (this.O00000000OOO00 ? 0.75F : 0.45F) * var17);
               var2.O00000000(this.O00000000OOOO, this.O0000000O0, this.O00000000OOOOO, this.O0000000O00, this.O00000000OOOOO * 0.5F, var19);
            }

            var2.O000000000();
         } finally {
            O0000O00O0OOO0.O00000000(var3);
         }
      } catch (Throwable var15) {
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, WildMultiplayerScreen.W286 o0000000000, float f) {
      float var4 = o0000000000.O000000000O00O * (o0000000000.O000000000OO ? 1.0F : 0.58F);
      float var5 = 25.0F * f;
      ServerInfo var6 = o0000000000.O000000000O0O >= 0 && o0000000000.O000000000O0O < this.O00000000000O0.size()
         ? this.O00000000000O0.get(o0000000000.O000000000O0O)
         : null;
      float var7 = Math.min(o0000000000.O00000000000OO * 0.62F, 54.0F * f);
      float var8 = o0000000000.O000000000000O + var5;
      float var9 = o0000000000.O00000000000O + o0000000000.O00000000000OO * 0.5F - var7 * 0.5F;
      float var10 = o0000000000.O000000000O0O0 ? 0.66F + 0.34F * (float)Math.sin(this.O000000000O000 * 2.1F) : 0.36F + 0.16F * o0000000000.O0000000000O00;
      int var11 = O00000000(
         this.O00000000O000O, this.O00000000O0000, var10, (0.1F + o0000000000.O0000000000O00 * 0.16F + (o0000000000.O000000000O0O0 ? 0.12F : 0.0F)) * var4
      );
      o0000O00OO0O0.O00000000(var8, var9, var7, var7, var7 * 0.32F, var11);
      if (o0000000000.O0000000000OO0 > 0.001F) {
         float var12 = o0000000000.O000000000000O + 26.0F * f;
         float var13 = o0000000000.O00000000000O + o0000000000.O00000000000OO - 8.0F * f;
         float var14 = (o0000000000.O00000000000O0 - 52.0F * f) * o0000000000.O0000000000OO0;
         o0000O00OO0O0.O00000000(
            var12,
            var13,
            var14,
            2.4F * f,
            1.2F * f,
            O00000000(this.O00000000O000O, this.O00000000O0000, 0.5F + o0000000000.O0000000000OO0 * 0.25F, 0.42F * var4 * o0000000000.O0000000000OO0)
         );
      }

      WildMultiplayerScreen.W285 var21 = var6 == null ? null : (this.O0000000000OO() ? this.O000000000000(var6) : this.O00000000000(var6));
      int var22 = var21 == null ? 0 : var21.O00000000();
      if (var22 > 0) {
         o0000O00OO0O0.O00000000(var22, var8 + 2.0F * f, var9 + 2.0F * f, var7 - 4.0F * f, var7 - 4.0F * f, 0.0F, 0.0F, 1.0F, 1.0F, var7 * 0.25F);
         o0000O00OO0O0.O00000000(var8, var9, var7, var7, var7 * 0.32F, O00000000(1.0F, 1.0F, 1.0F, (0.032F + o0000000000.O0000000000O00 * 0.026F) * var4));
      } else {
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000000O,
            var8 + var7 * 0.5F,
            var9 + var7 * 0.72F,
            var7 * 0.82F,
            "W",
            this.O00000000O00O0
               ? this.O0000000000((0.72F + o0000000000.O0000000000O00 * 0.2F) * var4)
               : O00000000(1.0F, 1.0F, 1.0F, (0.72F + o0000000000.O0000000000O00 * 0.2F) * var4),
            "c"
         );
      }

      float var23 = var8 + var7 + 18.0F * f;
      String var15 = var6 != null ? this.O000000000(var6) : "";
      float var16 = o0000000000.O000000000OO
         ? Math.max(72.0F * f, RenderManager.O00000000(FontRegistry.O00000000, var15, 24.0F * f).O00000000 + 24.0F * f)
         : 0.0F;
      float var17 = o0000000000.O000000000OO ? var16 + 48.0F * f : 80.0F * f;
      float var18 = o0000000000.O00000000000O0 - (var23 - o0000000000.O000000000000O) - var17;
      String var19 = O00000000(o0000000000.O00000000, var18, 25.0F * f, FontRegistry.O00000000000);
      String var20 = O00000000(o0000000000.O000000000, var18, 22.0F * f, FontRegistry.O00000000);
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000,
         var23,
         o0000000000.O00000000000O + o0000000000.O00000000000OO * 0.5F - 6.0F * f,
         25.0F * f,
         var19,
         this.O0000000000((0.88F + o0000000000.O0000000000O00 * 0.08F) * var4)
      );
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         var23,
         o0000000000.O00000000000O + o0000000000.O00000000000OO * 0.5F + 12.0F * f,
         22.0F * f,
         "IP: " + var20,
         this.O00000000000((0.4F + o0000000000.O0000000000O00 * 0.18F) * var4)
      );
      if (o0000000000.O000000000OO && var6 != null) {
         this.O00000000(o0000O00OO0O0, o0000000000, var6, f, var4);
      }
   }

   private void O000000000(RenderManager o0000O00OO0O0, WildMultiplayerScreen.W286 o0000000000, float f) {
      float var4 = o0000000000.O000000000O00O * (o0000000000.O000000000OO ? 0.88F : 0.28F);
      float var5 = o0000000000.O000000000000O + o0000000000.O00000000000O0 * 0.5F;
      float var6 = o0000000000.O00000000000O + o0000000000.O00000000000OO * 0.5F;
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var5, var6 + 4.0F * f, 26.0F * f, o0000000000.O00000000, this.O0000000000(var4), "c");
   }

   private void O00000000(RenderManager o0000O00OO0O0, WildMultiplayerScreen.W286 o0000000000, ServerInfo serverInfo, float f, float g) {
      String var6 = this.O000000000(serverInfo);
      float var7 = 24.0F * f;
      float var8 = RenderManager.O00000000(FontRegistry.O00000000, var6, 24.0F * f).O00000000;
      float var9 = Math.max(48.0F * f, var8 + 16.0F * f);
      float var10 = o0000000000.O000000000000O + o0000000000.O00000000000O0 - 24.0F * f;
      float var11 = var10 - var9;
      float var12 = o0000000000.O00000000000O + o0000000000.O00000000000OO * 0.5F - var7 * 0.5F;
      o0000O00OO0O0.O00000000(
         var11,
         var12,
         var9,
         var7,
         var7 * 0.45F,
         this.O00000000O00O0
            ? O00000000(1.0F, 1.0F, 1.0F, (0.54F + o0000000000.O0000000000O00 * 0.12F) * g)
            : O00000000(0.018F, 0.022F, 0.028F, (0.44F + o0000000000.O0000000000O00 * 0.1F) * g)
      );
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         var11 + var9 * 0.5F,
         var12 + var7 * 0.66F,
         24.0F * f,
         var6,
         this.O00000000(serverInfo, (0.72F + o0000000000.O0000000000O00 * 0.18F) * g),
         "c"
      );
   }

   private String O00000000(ServerInfo serverInfo) {
      if (serverInfo.getStatus() == Status.PINGING) {
         return "Pinging server...";
      } else if (serverInfo.getStatus() == Status.UNREACHABLE) {
         return serverInfo.label == null ? "Server is offline" : serverInfo.label.getString();
      } else if (serverInfo.getStatus() == Status.INCOMPATIBLE && serverInfo.version != null) {
         return "Version: " + serverInfo.version.getString();
      } else {
         return serverInfo.label != null && !serverInfo.label.getString().isBlank() ? serverInfo.label.getString().replace('\n', ' ') : "Waiting for response";
      }
   }

   private String O000000000(ServerInfo serverInfo) {
      if (serverInfo.getStatus() == Status.PINGING) {
         return this.O00000000000OO();
      } else {
         String var2 = this.O00000000(serverInfo.playerCountLabel);
         if (serverInfo.players == null || serverInfo.players.max() <= 0 && serverInfo.players.online() <= 0) {
            if (this.O00000000(var2)) {
               return var2;
            } else {
               return serverInfo.players != null ? serverInfo.players.online() + "/" + serverInfo.players.max() : "-";
            }
         } else {
            return serverInfo.players.online() + "/" + serverInfo.players.max();
         }
      }
   }

   private String O00000000000OO() {
      int var1 = 1 + (int)(this.O000000000O000 * 6.0F) % 3;
      return ".".repeat(var1);
   }

   private String O00000000(Text text) {
      if (text == null) {
         return "";
      } else {
         String var2 = text.getString();
         StringBuilder var3 = null;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var2.length();

         while (var5 < var6 && Character.isWhitespace(var2.charAt(var5))) {
            var5++;
         }

         while (var6 > var5 && Character.isWhitespace(var2.charAt(var6 - 1))) {
            var6--;
         }

         for (int var7 = var5; var7 < var6; var7++) {
            char var8 = var2.charAt(var7);
            boolean var9 = Character.isWhitespace(var8);
            if (var9) {
               if (!var4) {
                  if (var3 == null) {
                     var3 = new StringBuilder(var2.length());
                     var3.append(var2, var5, var7);
                  }

                  var3.append(' ');
                  var4 = true;
               }
            } else {
               if (var3 != null) {
                  var3.append(var8);
               }

               var4 = false;
            }
         }

         return var3 == null ? var2.substring(var5, var6) : var3.toString();
      }
   }

   private boolean O00000000(String string) {
      if (string != null && !string.isBlank()) {
         String var2 = string.trim();
         return !var2.equals("-") && !var2.equals("?") && !var2.equals("???") && !var2.equals("...");
      } else {
         return false;
      }
   }

   private String O0000000000(ServerInfo serverInfo) {
      if (serverInfo.getStatus() == Status.PINGING) {
         return "ping";
      } else if (serverInfo.ping >= 0L) {
         return serverInfo.ping + " ms";
      } else {
         return serverInfo.getStatus() == Status.UNREACHABLE ? "offline" : "-";
      }
   }

   private int O00000000(ServerInfo serverInfo, float f) {
      return switch (serverInfo.getStatus()) {
         case SUCCESSFUL -> O00000000(this.O00000000O000O, this.O00000000O0000, 0.35F + 0.25F * (float)Math.sin(this.O000000000O000 * 1.6F), 0.82F * f);
         case PINGING -> O00000000(0.68F, 0.76F, 0.84F, 0.62F * f);
         case INCOMPATIBLE -> O00000000(1.0F, 0.7F, 0.36F, 0.72F * f);
         case UNREACHABLE -> O00000000(1.0F, 0.32F, 0.36F, 0.72F * f);
         case INITIAL -> O00000000(0.58F, 0.64F, 0.7F, 0.54F * f);
         default -> throw new MatchException(null, null);
      };
   }

   private void O00000000(WildMultiplayerScreen.W284 o00000000) {
      MinecraftClient var2 = this.client == null ? MinecraftClient.getInstance() : this.client;
      if (var2 != null) {
         switch (o00000000) {
            case SERVER:
            default:
               break;
            case JOIN:
               var2.execute(this::O0000000000O);
               break;
            case DIRECT:
               var2.execute(() -> this.O00000000(var2));
               break;
            case ADD:
               var2.execute(() -> this.O000000000(var2));
               break;
            case EDIT:
               var2.execute(() -> this.O0000000000(var2));
               break;
            case DELETE:
               var2.execute(() -> this.O00000000000(var2));
               break;
            case PROXY:
               var2.execute(() -> var2.setScreen(new ProxyScreen(this)));
               break;
            case REFRESH:
               this.O000000000000();
               break;
            case BACK:
               var2.execute(() -> var2.setScreen(this.O0000000000000));
         }
      }
   }

   private void O0000000000O() {
      MinecraftClient var1 = this.client == null ? MinecraftClient.getInstance() : this.client;
      ServerInfo var2 = this.O0000000000O0();
      if (var1 != null && var2 != null && var2.address != null && !var2.address.isBlank()) {
         this.O00000000O0OO = "Resolving address...";
         CompletableFuture.<ServerAddress>supplyAsync(() -> ServerAddress.parse(var2.address), Util.getMainWorkerExecutor())
            .whenComplete((serverAddress, throwable) -> var1.execute(() -> {
               if (throwable == null && serverAddress != null) {
                  ConnectScreen.connect(this, var1, serverAddress, var2, false, null);
               } else {
                  this.O00000000O0OO = "Invalid server address";
               }
            }));
      } else {
         this.O00000000O0OO = "Select a server";
      }
   }

   private void O00000000(MinecraftClient minecraftClient) {
      ServerInfo var2 = new ServerInfo("Direct Server", "", ServerType.OTHER);
      minecraftClient.setScreen(
         new DirectConnectScreen(
            this,
            bl -> {
               if (bl) {
                  this.O00000000O0OO = "Resolving address...";
                  CompletableFuture.<ServerAddress>supplyAsync(() -> ServerAddress.parse(var2.address), Util.getMainWorkerExecutor())
                     .whenComplete((serverAddress, throwable) -> minecraftClient.execute(() -> {
                        if (throwable == null && serverAddress != null) {
                           ConnectScreen.connect(this, minecraftClient, serverAddress, var2, false, null);
                        } else {
                           this.O00000000O0OO = "Invalid server address";
                           minecraftClient.setScreen(this);
                        }
                     }));
               } else {
                  minecraftClient.setScreen(this);
               }
            },
            var2
         )
      );
   }

   private void O000000000(MinecraftClient minecraftClient) {
      ServerInfo var2 = new ServerInfo("Minecraft Server", "", ServerType.OTHER);
      minecraftClient.setScreen(new AddServerScreen(this, bl -> {
         if (bl && this.O0000000000OO0 != null) {
            try {
               this.O0000000000OO0.add(var2, false);
               this.O00000000000O0.add(var2);
               this.O0000000000();
               this.O00000000O00OO = this.O0000000000OO0.size() - 1;
               this.O00000000O0OO = "Server added";
            } catch (Throwable var5) {
               this.O00000000O0OO = "Failed to add server";
            }
         }

         minecraftClient.setScreen(this);
      }, var2));
   }

   private void O0000000000(MinecraftClient minecraftClient) {
      ServerInfo var2 = this.O0000000000O0();
      if (var2 != null && this.O0000000000OO0 != null && this.O00000000O00OO >= 0 && this.O00000000O00OO < this.O0000000000OO0.size()) {
         int var3 = this.O00000000O00OO;
         ServerInfo var4 = new ServerInfo(var2.name, var2.address, var2.getServerType());
         var4.copyWithSettingsFrom(var2);
         minecraftClient.setScreen(new AddServerScreen(this, bl -> {
            if (bl && this.O0000000000OO0 != null && var3 >= 0 && var3 < this.O0000000000OO0.size()) {
               try {
                  this.O0000000000OO0.set(var3, var4);
                  if (var3 < this.O00000000000O0.size()) {
                     this.O00000000000O0.set(var3, var4);
                  }

                  this.O0000000000();
                  this.O00000000O00OO = var3;
                  this.O00000000O0OO = "Server updated";
               } catch (Throwable var6) {
                  this.O00000000O0OO = "Failed to save changes";
               }
            }

            minecraftClient.setScreen(this);
         }, var4));
      } else {
         this.O00000000O0OO = "Select a server";
      }
   }

   private void O00000000000(MinecraftClient minecraftClient) {
      ServerInfo var2 = this.O0000000000O0();
      if (var2 != null && this.O0000000000OO0 != null) {
         String var3 = O00000000(var2.name, "Unnamed server");
         minecraftClient.setScreen(new ConfirmScreen(bl -> {
            if (bl && this.O0000000000OO0 != null) {
               try {
                  this.O0000000000OO0.remove(var2);
                  this.O00000000000O0.remove(var2);
                  this.O0000000000();
                  this.O00000000O00OO = Math.min(this.O00000000O00OO, Math.max(0, this.O0000000000OO0.size() - 1));
                  if (this.O0000000000OO0.size() == 0) {
                     this.O00000000O00OO = -1;
                  }

                  this.O00000000O0OO = "Server deleted";
               } catch (Throwable var5) {
                  this.O00000000O0OO = "Failed to delete server";
               }
            }

            minecraftClient.setScreen(this);
         }, Text.literal("Delete server?"), Text.literal(var3)));
      } else {
         this.O00000000O0OO = "Select a server";
      }
   }

   private ServerInfo O0000000000O0() {
      return this.O00000000O00OO >= 0 && this.O00000000O00OO < this.O00000000000O0.size() ? this.O00000000000O0.get(this.O00000000O00OO) : null;
   }

   private void O0000000000O00() {
      ServerInfo var1 = this.O0000000000O0();
      if (var1 != null && var1.address != null && !var1.address.isBlank()) {
         MinecraftClient var2 = this.client == null ? MinecraftClient.getInstance() : this.client;
         if (var2 != null && var2.keyboard != null) {
            var2.keyboard.setClipboard(var1.address);
            this.O00000000O0OO = "IP copied: " + var1.address;
         }
      } else {
         this.O00000000O0OO = "Select a server";
      }
   }

   private void O0000000000(int i) {
      if (this.O0000000000OO0 != null && this.O00000000O00OO >= 0 && this.O00000000O00OO < this.O00000000000O0.size()) {
         int var2 = this.O00000000O00OO + i;
         if (var2 >= 0 && var2 < this.O00000000000O0.size() && var2 < this.O0000000000OO0.size()) {
            try {
               ServerInfo var3 = this.O0000000000OO0.get(this.O00000000O00OO);
               ServerInfo var4 = this.O0000000000OO0.get(var2);
               this.O0000000000OO0.set(this.O00000000O00OO, var4);
               this.O0000000000OO0.set(var2, var3);
               Collections.swap(this.O00000000000O0, this.O00000000O00OO, var2);
               this.O0000000000();
               this.O00000000O00OO = var2;
               this.O00000000O0OO = "Server moved";
               this.O0000000000O0O();
            } catch (Throwable var5) {
               this.O00000000O0OO = "Failed to move server";
            }
         }
      } else {
         this.O00000000O0OO = "Select a server";
      }
   }

   private boolean O000000000(WildMultiplayerScreen.W284 o00000000) {
      boolean var2 = this.O0000000000O0() != null;

      return switch (o00000000) {
         case SERVER -> false;
         case JOIN, EDIT, DELETE -> var2;
         case DIRECT, ADD, PROXY, REFRESH, BACK -> true;
      };
   }

   private void O00000000000(int i) {
      if (this.O00000000000O0.isEmpty()) {
         this.O00000000O00OO = -1;
         this.O00000000O0OO = "No saved servers";
      } else {
         this.O00000000O00OO = O00000000(this.O00000000O00OO + i, 0, this.O00000000000O0.size() - 1);
         this.O00000000O0OO = "Ready";
         this.O0000000000O0O();
      }
   }

   private void O0000000000O0O() {
      if (this.O00000000O00OO >= 0) {
         if (this.O00000000O00OO < this.O00000000O0O) {
            this.O00000000O0O = this.O00000000O00OO;
         }

         if (this.O00000000O00OO > this.O00000000O0O + this.O00000000O0O00 - 1.0F) {
            this.O00000000O0O = this.O00000000O00OO - this.O00000000O0O00 + 1;
         }

         int var1 = Math.max(0, this.O00000000000O0.size() - Math.max(1, this.O00000000O0O00));
         this.O00000000O0O = O000000000(this.O00000000O0O, 0.0F, (float)var1);
      }
   }

   private WildMultiplayerScreen.W285 O00000000000(ServerInfo serverInfo) {
      byte[] var2 = serverInfo.getFavicon();
      if (var2 != null && var2.length != 0) {
         String var3 = this.O00000000(serverInfo, var2);
         WildMultiplayerScreen.W285 var4 = this.O0000000000O.get(var3);
         if (var4 != null) {
            return var4;
         } else {
            try {
               NativeImage var5 = NativeImage.read(var2);
               NativeImageBackedTexture var6 = new NativeImageBackedTexture(() -> "wild_server_icon", var5);
               var6.setFilter(true, false);
               var6.upload();
               WildMultiplayerScreen.W285 var7 = new WildMultiplayerScreen.W285(var6);
               this.O0000000000O.put(var3, var7);
               return var7;
            } catch (Throwable var8) {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private WildMultiplayerScreen.W285 O000000000000(ServerInfo serverInfo) {
      byte[] var2 = serverInfo.getFavicon();
      return var2 != null && var2.length != 0 ? this.O0000000000O.get(this.O00000000(serverInfo, var2)) : null;
   }

   private boolean O0000000000OO() {
      return System.nanoTime() - this.O00000000OO0O < 180000000L || Math.abs(this.O00000000O0O - this.O00000000O0O0) > 0.06F;
   }

   private String O00000000(ServerInfo serverInfo, byte[] bs) {
      return O00000000(serverInfo.address, "") + ":" + Arrays.hashCode(bs);
   }

   private void O0000000000OO0() {
      for (WildMultiplayerScreen.W285 var2 : this.O0000000000O.values()) {
         var2.close();
      }

      this.O0000000000O.clear();
   }

   private float O00000000(Window window, double d) {
      return (float)(d * window.getFramebufferWidth() / Math.max(1.0, (double)window.getScaledWidth()));
   }

   private float O000000000(Window window, double d) {
      return (float)(d * window.getFramebufferHeight() / Math.max(1.0, (double)window.getScaledHeight()));
   }

   private static String O00000000(String string, String string2) {
      return string != null && !string.isBlank() ? string : string2;
   }

   private static String O00000000(String string, float f, float g, FontObject o0000O0O00O00O) {
      if (string == null) {
         return "";
      } else if (f <= 0.0F) {
         return "";
      } else if (RenderManager.O00000000(o0000O0O00O00O, string, g).O00000000 <= f) {
         return string;
      } else {
         String var4 = "...";
         if (RenderManager.O00000000(o0000O0O00O00O, var4, g).O00000000 > f) {
            return "";
         } else {
            int var5 = 1;
            int var6 = string.length();
            int var7 = 1;

            while (var5 <= var6) {
               int var8 = var5 + var6 >>> 1;
               if (RenderManager.O00000000(o0000O0O00O00O, string.substring(0, var8) + var4, g).O00000000 <= f) {
                  var7 = var8;
                  var5 = var8 + 1;
               } else {
                  var6 = var8 - 1;
               }
            }

            return string.substring(0, var7) + var4;
         }
      }
   }

   private static float O00000000(float f, float g) {
      return O000000000(Math.min(f / 1920.0F, g / 1080.0F) * 1.08F, 0.62F, 1.2F);
   }

   static float O00000000(float f, float g, float h, float i, float j, float k, float l) {
      float var7 = h + j * 0.5F;
      float var8 = i + k * 0.5F;
      float var9 = j * 0.5F - l;
      float var10 = k * 0.5F - l;
      float var11 = Math.abs(f - var7) - var9;
      float var12 = Math.abs(g - var8) - var10;
      float var13 = Math.max(var11, 0.0F);
      float var14 = Math.max(var12, 0.0F);
      return (float)Math.sqrt(var13 * var13 + var14 * var14) + Math.min(Math.max(var11, var12), 0.0F) - l;
   }

   private static float O000000000(float f, float g) {
      return (float)Math.sqrt(f * f + g * g);
   }

   private static float O000000000(float f) {
      float var1 = O000000000(f, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   private static float O000000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private static int O00000000(int i, int j, int k) {
      return Math.max(j, Math.min(k, i));
   }

   private static float O000000000000(int i) {
      return (i >> 16 & 0xFF) / 255.0F;
   }

   private static float O0000000000000(int i) {
      return (i >> 8 & 0xFF) / 255.0F;
   }

   private static float O000000000000O(int i) {
      return (i & 0xFF) / 255.0F;
   }

   private int O0000000000(float f) {
      return this.O00000000O00O0 ? O00000000(0.1F, 0.1F, 0.1F, f) : O00000000(1.0F, 1.0F, 1.0F, f);
   }

   private int O00000000000(float f) {
      return this.O00000000O00O0 ? O00000000(0.4F, 0.4F, 0.4F, f) : O00000000(0.78F, 0.84F, 0.88F, f);
   }

   private static int O00000000(float f, float g, float h, float i) {
      int var4 = Math.round(O000000000(f, 0.0F, 1.0F) * 255.0F);
      int var5 = Math.round(O000000000(g, 0.0F, 1.0F) * 255.0F);
      int var6 = Math.round(O000000000(h, 0.0F, 1.0F) * 255.0F);
      int var7 = Math.round(O000000000(i, 0.0F, 1.0F) * 255.0F);
      return var7 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private static int O00000000(int i, int j, float f, float g) {
      float var4 = O000000000(f, 0.0F, 1.0F);
      int var5 = O0000O000OO000.O00000000000(i, j, var4);
      int var6 = Math.round(O000000000(g, 0.0F, 1.0F) * 255.0F);
      return var6 << 24 | var5;
   }

   static enum W284 {
      SERVER,
      JOIN,
      DIRECT,
      ADD,
      EDIT,
      DELETE,
      PROXY,
      REFRESH,
      BACK;
   }

   static final class W285 implements AutoCloseable {
      private final NativeImageBackedTexture O00000000;

      W285(NativeImageBackedTexture nativeImageBackedTexture) {
         this.O00000000 = nativeImageBackedTexture;
      }

      int O00000000() {
         return this.O00000000.getGlTexture() instanceof GlTexture var1 ? var1.getGlId() : 0;
      }

      @Override
      public void close() {
         this.O00000000.close();
      }
   }

   static final class W286 {
      String O00000000;
      String O000000000 = "";
      final WildMultiplayerScreen.W284 O0000000000;
      final O00000OOO00 O00000000000 = new O00000OOO00(O0000O000O0O00.O000000000000());
      float O000000000000;
      float O0000000000000;
      float O000000000000O;
      float O00000000000O;
      float O00000000000O0;
      float O00000000000OO;
      float O0000000000O;
      float O0000000000O0;
      float O0000000000O00;
      float O0000000000O0O;
      float O0000000000OO;
      float O0000000000OO0;
      float O0000000000OOO = 1.0F;
      float O000000000O = 0.5F;
      float O000000000O0 = 0.5F;
      float O000000000O00;
      float O000000000O000;
      float O000000000O00O;
      int O000000000O0O = -1;
      boolean O000000000O0O0;
      boolean O000000000O0OO;
      boolean O000000000OO = true;

      W286(String string, WildMultiplayerScreen.W284 o00000000) {
         this.O00000000 = string;
         this.O0000000000 = o00000000;
      }

      void O00000000() {
         this.O0000000000O0 = 0.0F;
         this.O0000000000O00 = 0.0F;
         this.O0000000000O0O = 0.0F;
         this.O0000000000OO = 0.0F;
         this.O0000000000OO0 = 0.0F;
         this.O0000000000OOO = 1.0F;
         this.O000000000O = 0.5F;
         this.O000000000O0 = 0.5F;
         this.O000000000O00 = 0.0F;
         this.O000000000O00O = 0.0F;
         this.O000000000O0O0 = false;
         this.O000000000O0OO = false;
         this.O000000000OO = true;
         this.O00000000000.O00000000(1.0F);
      }

      boolean O00000000(float f, float g) {
         return WildMultiplayerScreen.O00000000(f, g, this.O000000000000, this.O0000000000000, this.O00000000000O0, this.O00000000000OO, this.O0000000000O)
            <= 0.0F;
      }
   }

   static final class W287 {
      float O00000000;
      float O000000000;
      float O0000000000 = -100.0F;
      float O00000000000;
   }
}
