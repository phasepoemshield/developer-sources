package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.io.File;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.option.ServerList;
import net.minecraft.client.session.Session;
import net.minecraft.client.session.Session.AccountType;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.util.Window;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.lwjgl.opengl.GL11;

public final class O00000OO0OOO00 extends Screen implements O00000OO0OOOO {
   private static final O0000O000OO O00000000 = O0000O000OO.O00000000();
   private static final int O000000000 = 14;
   private static final long O0000000000 = 350L;
   private static final ScheduledExecutorService O00000000000 = Executors.newSingleThreadScheduledExecutor(runnable -> {
      Thread var1 = new Thread(runnable, "Wild-AltVaultSave");
      var1.setDaemon(true);
      return var1;
   });
   private static final String[] O000000000000 = new String[]{
      "x",
      "z",
      "q",
      "v",
      "mx",
      "im",
      "by",
      "not",
      "its",
      "real",
      "just",
      "i",
      "fx",
      "rx",
      "nx",
      "neo",
      "raw",
      "low",
      "old",
      "the",
      "mr",
      "lil",
      "big",
      "dr",
      "sir",
      "yo",
      "ez",
      "op",
      "gg",
      "yt",
      "tv",
      "wild",
      "pro",
      "uwu",
      "ya",
      "el",
      "an",
      "su",
      "ko"
   };
   private static final String[] O0000000000000 = new String[]{
      "alex",
      "dani",
      "nik",
      "max",
      "roma",
      "kir",
      "drew",
      "mark",
      "luka",
      "tim",
      "ivan",
      "mira",
      "sasha",
      "art",
      "lev",
      "egor",
      "mike",
      "tony",
      "vlad",
      "step",
      "andrew",
      "niko",
      "den",
      "semy",
      "yar",
      "kost",
      "ilya",
      "gleb",
      "dima",
      "serg",
      "matvey",
      "rad",
      "kira",
      "mila",
      "sonya",
      "kai",
      "leo",
      "rian",
      "noah",
      "mason",
      "kevin",
      "rem",
      "zen",
      "nova",
      "pixel",
      "byte",
      "void",
      "ray",
      "fox",
      "wolf",
      "moon",
      "storm",
      "rain",
      "ash",
      "raven",
      "cole",
      "liam",
      "owen",
      "eric",
      "aron",
      "milo",
      "tomas",
      "nolan",
      "ron",
      "lars",
      "vega",
      "skye",
      "jack",
      "finn",
      "theo",
      "hugo",
      "bruno",
      "diego",
      "enzo",
      "jude",
      "reed",
      "cruz",
      "jax",
      "zane",
      "ace",
      "dash",
      "blake",
      "cody",
      "trey",
      "jett",
      "knox",
      "beck",
      "reid",
      "colt",
      "gage",
      "wade",
      "zeke",
      "onyx",
      "jinx",
      "flux",
      "ghost",
      "frost",
      "blaze",
      "drake",
      "hawk",
      "lynx",
      "puma",
      "arlo",
      "remy",
      "yuki",
      "aki",
      "ren",
      "sora",
      "haru",
      "kaze",
      "mei",
      "rio",
      "neon",
      "echo",
      "dusk",
      "sage",
      "wren"
   };
   private static final String[] O000000000000O = new String[]{
      "",
      "",
      "",
      "x",
      "yy",
      "on",
      "er",
      "ix",
      "is",
      "way",
      "pro",
      "mc",
      "dev",
      "boy",
      "top",
      "live",
      "sky",
      "craft",
      "mine",
      "play",
      "hd",
      "fps",
      "low",
      "new",
      "old",
      "go",
      "run",
      "win",
      "bit",
      "core",
      "qq",
      "zz",
      "xd",
      "yt",
      "gg",
      "ez",
      "op",
      "wow",
      "god",
      "main",
      "gang",
      "ster",
      "izz",
      "us",
      "io",
      "ly",
      "ne"
   };
   private static final String[] O00000000000O = new String[]{
      "ka",
      "ki",
      "ko",
      "mi",
      "mo",
      "ra",
      "ri",
      "ro",
      "sa",
      "si",
      "so",
      "ta",
      "ti",
      "to",
      "ne",
      "ni",
      "no",
      "la",
      "li",
      "lo",
      "ve",
      "vi",
      "vo",
      "za",
      "ze",
      "zu",
      "da",
      "de",
      "du",
      "ny",
      "re",
      "xo",
      "ku",
      "ke",
      "fa",
      "fi",
      "fo",
      "ga",
      "go",
      "ha",
      "hi",
      "ho",
      "ba",
      "bo",
      "pa",
      "po",
      "wu",
      "yo",
      "ju",
      "ce",
      "dra",
      "vex",
      "zar",
      "kra",
      "nyx",
      "rox"
   };
   private final Screen O00000000000O0;
   private final O00000OO0OOOOO O00000000000OO = new O00000OO0OOOOO();
   private final List<O00000OO0OOO00.W247> O0000000000O = new ArrayList<>();
   private final Set<String> O0000000000O0 = new HashSet<>();
   private final Map<String, O00000OO0OOO00.W251> O0000000000O00 = new HashMap<>();
   private final Map<String, String> O0000000000O0O = new HashMap<>();
   private final List<O00000OO0OOO00.W250> O0000000000OO = List.of(
      new O00000OO0OOO00.W250("Login", O00000OO0OOO00.W249.USE),
      new O00000OO0OOO00.W250("Add", O00000OO0OOO00.W249.ADD_CRACKED),
      new O00000OO0OOO00.W250("Random", O00000OO0OOO00.W249.RANDOM),
      new O00000OO0OOO00.W250("Edit", O00000OO0OOO00.W249.EDIT),
      new O00000OO0OOO00.W250("Delete", O00000OO0OOO00.W249.DELETE),
      new O00000OO0OOO00.W250("Back", O00000OO0OOO00.W249.BACK)
   );
   private final O00000OO0OOO00.W252 O0000000000OO0 = new O00000OO0OOO00.W252("Username", false);
   private final O00000OO0OOO00.W263[] O0000000000OOO = new O00000OO0OOO00.W263[14];
   private final O00000OOO00 O000000000O = new O00000OOO00(O0000O000O0O00.O000000000000());
   private final O00000OOO00 O000000000O0 = new O00000OOO00(O0000O000O0O00.O000000000000());
   private float O000000000O00;
   private float O000000000O000;
   private float O000000000O00O;
   private float O000000000O0O;
   private long O000000000O0O0;
   private long O000000000O0OO;
   private long O000000000OO;
   private long O000000000OO0;
   private float O000000000OO00;
   private float O000000000OO0O;
   private float O000000000OOO;
   private float O000000000OOO0;
   private float O000000000OOOO;
   private float O00000000O;
   private float O00000000O0;
   private float O00000000O00;
   private float O00000000O000;
   private float O00000000O0000;
   private float O00000000O000O;
   private boolean O00000000O00O;
   private boolean O00000000O00O0;
   private boolean O00000000O00OO;
   private int O00000000O0O;
   private int O00000000O0O0;
   private int O00000000O0O00 = -6357021;
   private int O00000000O0O0O = -11341636;
   private Theme O00000000O0OO = Theme.AURORA;
   private boolean O00000000O0OO0;
   private int O00000000O0OOO = -1;
   private int O00000000OO = 5;
   private String O00000000OO0 = "Select an identity";
   private String O00000000OO00 = null;
   private float O00000000OO000;
   private float O00000000OO00O;
   private boolean O00000000OO0O;
   private float O00000000OO0O0;
   private float O00000000OO0OO;
   private float O00000000OOO;
   private float O00000000OOO0;
   private float O00000000OOO00;
   private float O00000000OOO0O;
   private float O00000000OOOO;
   private boolean O00000000OOOO0;
   private volatile ScheduledFuture<?> O00000000OOOOO;

   public O00000OO0OOO00(Screen screen) {
      super(Text.literal("Alt Manager"));
      this.O00000000000O0 = screen;

      for (int var2 = 0; var2 < this.O0000000000OOO.length; var2++) {
         this.O0000000000OOO[var2] = new O00000OO0OOO00.W263();
      }
   }

   public static void O00000000(MinecraftClient minecraftClient) {
      O00000OO0OOO00.W255.O00000000(minecraftClient);
   }

   protected void init() {
      super.init();
      boolean var1 = this.O000000000O0O0 != 0L;
      this.O000000000O0O0 = System.nanoTime();
      this.O000000000O0OO = this.O000000000O0O0;
      this.O000000000OO = this.O000000000O0O0;
      this.O000000000OO00 = 0.0F;
      this.O00000000O00O = false;
      this.O00000000O00O0 = false;
      this.O00000000O00OO = false;
      this.O00000000O0O = 0;
      this.O00000000O0O0 = 0;
      this.O00000000OO000 = 0.0F;
      this.O00000000OO00O = 0.0F;
      this.O000000000O.O00000000(0.0F);
      this.O000000000O0.O00000000(0.0F);
      this.O0000000000OO0.O00000000000();

      for (O00000OO0OOO00.W250 var3 : this.O0000000000OO) {
         var3.O00000000();
      }

      this.O00000000(var1);
      this.O00000000000O0();
   }

   public void resize(MinecraftClient client, int width, int height) {
      int var4 = this.O00000000O0OOO;
      float var5 = this.O00000000OO000;
      String var6 = this.O00000000OO0;
      super.resize(client, width, height);
      this.O00000000O0OOO = var4;
      this.O00000000OO000 = var5;
      this.O00000000OO00O = var5;
      this.O00000000OO0 = var6;
   }

   public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
      this.O00000000(mouseX, mouseY, deltaTicks, false);
   }

   @Override
   public void O00000000(int i, int j, float f) {
      this.O00000000(i, j, f, true);
   }

   private void O00000000(int i, int j, float f, boolean bl) {
      Window var5 = this.client == null ? null : this.client.getWindow();
      if (var5 != null && !var5.hasZeroWidthOrHeight() && var5.getFramebufferWidth() > 0 && var5.getFramebufferHeight() > 0) {
         int var6 = var5.getFramebufferWidth();
         int var7 = var5.getFramebufferHeight();
         long var8 = System.nanoTime();
         float var10 = Math.max(0.001F, Math.min(0.05F, (float)(var8 - this.O000000000O0OO) / 1.0E9F));
         this.O000000000O0OO = var8;
         this.O000000000OO00 = (float)(var8 - this.O000000000O0O0) / 1.0E9F;
         if (this.O00000000(var5, var6, var7, i, j, var8)) {
            var10 = 0.001F;
         }

         this.O000000000OO();
         this.O00000000(var5, i, j, var10, var8);
         this.O000000000(var6, var7, var10);
         this.O000000000OO0();
         float var11 = (this.O000000000OO0O / Math.max(1.0F, (float)var6) - 0.5F) * 2.0F;
         float var12 = (this.O000000000OOO / Math.max(1.0F, (float)var7) - 0.5F) * 2.0F;
         float var13 = this.O000000000O.O00000000(var11, var10);
         float var14 = this.O000000000O0.O00000000(var12, var10);
         this.O00000000(var6, var7, var13, var14, var10);
         this.O000000000O0OO();
         int var15 = GL11.glGetInteger(36006);
         MainMenuScreen.W281 var16 = this.O00000000(var6, var7, var15, var13, var14, var8);
         if (bl) {
            O0000O00O0OOO0.W373 var17 = O0000O00O0OOO0.O00000000();

            try {
               this.O00000000000OO.O00000000(var16);
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

   public boolean shouldPause() {
      return false;
   }

   public boolean shouldCloseOnEsc() {
      return false;
   }

   public void close() {
      this.O00000000(O00000OO0OOO00.W249.BACK);
   }

   public void removed() {
      if (WildClient.O000000000OO00()) {
         this.O00000000(0L);
      } else {
         this.O00000000000();
      }

      O00000OO0OOO00.W255.O00000000();
      this.O000000000OO0O();
      this.O00000000000OO.close();
      super.removed();
   }

   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      if (button == 0 && this.client != null && this.client.getWindow() != null) {
         float var6 = this.O00000000(this.client.getWindow(), mouseX);
         float var7 = this.O000000000(this.client.getWindow(), mouseY);
         long var8 = System.nanoTime();
         if (this.O00000000OOOO0) {
            float var10 = 8.0F;
            if (var6 >= this.O00000000OO0OO - var10
               && var6 <= this.O00000000OO0OO + this.O00000000OOO0 + var10
               && var7 >= this.O00000000OOO
               && var7 <= this.O00000000OOO + this.O00000000OOO00) {
               this.O00000000OO0O = true;
               if (var7 >= this.O00000000OOO0O && var7 <= this.O00000000OOO0O + this.O00000000OOOO) {
                  this.O00000000OO0O0 = var7 - this.O00000000OOO0O;
               } else {
                  this.O00000000OO0O0 = this.O00000000OOOO * 0.5F;
               }

               this.O00000000(var7);
               return true;
            }
         }

         if (this.O0000000000OO0.O00000000(var6, var7)) {
            this.O0000000000OO0.O000000000O0O = true;
            this.O0000000000OO0.O000000000O0O0 = false;
            this.O0000000000OO0.O000000000O00O = this.O0000000000OO0.O000000000O000.length();
            this.O0000000000OO0.O0000000000O0 = 1.0F;
            return true;
         } else {
            for (O00000OO0OOO00.W250 var11 : this.O0000000000OO) {
               if (var11.O000000000O000 && var11.O00000000(var6, var7)) {
                  this.O0000000000OO0.O000000000O0O = false;
                  var11.O0000000000O0 = 1.0F;
                  var11.O0000000000O00 = 1.0F;
                  this.O00000000(var11.O000000000O00);
                  return true;
               }
            }

            for (int var13 = 0; var13 < this.O0000000000O.size(); var13++) {
               O00000OO0OOO00.W247 var14 = this.O0000000000O.get(var13);
               if (!var14.O00000000O00 && var14.O00000000O000 && var14.O00000000(var6, var7)) {
                  this.O0000000000OO0.O000000000O0O = false;
                  if (this.O00000000O0OOO == var13 && var8 - this.O000000000OO0 < 360000000L) {
                     var14.O000000000O0O = 1.0F;
                     var14.O000000000O0O0 = 1.0F;
                     this.O00000000(O00000OO0OOO00.W249.USE);
                  } else {
                     this.O00000000O0OOO = var13;
                     var14.O000000000O0O0 = Math.max(var14.O000000000O0O0, 0.42F);
                     this.O00000000OO0 = "Selected identity: " + var14.O000000000;
                     this.O000000000();
                  }

                  this.O000000000OO0 = var8;
                  return true;
               }
            }

            this.O0000000000OO0.O000000000O0O = false;
            return true;
         }
      } else {
         return super.mouseClicked(mouseX, mouseY, button);
      }
   }

   public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      if (this.O00000000O() <= this.O00000000OO) {
         return true;
      } else {
         this.O00000000OO000 -= (float)verticalAmount;
         int var9 = Math.max(0, this.O00000000O() - Math.max(1, this.O00000000OO));
         this.O00000000OO000 = O000000000(this.O00000000OO000, 0.0F, (float)var9);
         return true;
      }
   }

   public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      if (this.O00000000OO0O && this.O00000000OOOO0 && this.client != null && this.client.getWindow() != null) {
         this.O00000000(this.O000000000(this.client.getWindow(), mouseY));
         return true;
      } else {
         return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
      }
   }

   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      if (button == 0 && this.O00000000OO0O) {
         this.O00000000OO0O = false;
         return true;
      } else {
         return super.mouseReleased(mouseX, mouseY, button);
      }
   }

   private void O00000000(float f) {
      float var2 = this.O00000000OOO00 - this.O00000000OOOO;
      if (!(var2 <= 0.001F)) {
         float var3 = O000000000(f - this.O00000000OO0O0, this.O00000000OOO, this.O00000000OOO + var2);
         float var4 = (var3 - this.O00000000OOO) / var2;
         int var5 = Math.max(0, this.O00000000O() - Math.max(1, this.O00000000OO));
         this.O00000000OO000 = var4 * var5;
      }
   }

   public boolean charTyped(char chr, int modifiers) {
      if (!this.O0000000000OO0.O000000000O0O) {
         return super.charTyped(chr, modifiers);
      } else if ((chr < 'A' || chr > 'Z') && (chr < 'a' || chr > 'z') && (chr < '0' || chr > '9') && chr != '_') {
         return true;
      } else {
         this.O0000000000OO0.O00000000(chr);
         return true;
      }
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 256) {
         if (this.O0000000000OO0()) {
            this.O000000000O00();
            return true;
         } else if (this.O0000000000OO0.O000000000O0O) {
            this.O0000000000OO0.O000000000O0O = false;
            this.O0000000000OO0.O000000000O0O0 = false;
            return true;
         } else {
            this.O00000000(O00000OO0OOO00.W249.BACK);
            return true;
         }
      } else {
         if (this.O0000000000OO0.O000000000O0O) {
            boolean var4 = (modifiers & 2) != 0 || (modifiers & 8) != 0;
            if (var4) {
               if (keyCode == 67) {
                  if (this.client != null && this.client.keyboard != null && !this.O0000000000OO0.O000000000O000.isEmpty()) {
                     this.client.keyboard.setClipboard(this.O0000000000OO0.O000000000O000);
                  }

                  return true;
               }

               if (keyCode == 86) {
                  if (this.client != null && this.client.keyboard != null) {
                     String var5 = this.client.keyboard.getClipboard();
                     if (var5 != null) {
                        this.O0000000000OO0.O00000000(var5.replaceAll("[^A-Za-z0-9_]", ""));
                     }
                  }

                  return true;
               }

               if (keyCode == 65) {
                  this.O0000000000OO0.O000000000O0O0 = true;
                  return true;
               }
            }

            if (keyCode == 259) {
               this.O0000000000OO0.O000000000();
               return true;
            }

            if (keyCode == 261) {
               this.O0000000000OO0.O0000000000();
               return true;
            }

            if (keyCode == 263) {
               this.O0000000000OO0.O000000000O0O0 = false;
               this.O0000000000OO0.O000000000O00O = O00000000(this.O0000000000OO0.O000000000O00O - 1, 0, this.O0000000000OO0.O000000000O000.length());
               return true;
            }

            if (keyCode == 262) {
               this.O0000000000OO0.O000000000O0O0 = false;
               this.O0000000000OO0.O000000000O00O = O00000000(this.O0000000000OO0.O000000000O00O + 1, 0, this.O0000000000OO0.O000000000O000.length());
               return true;
            }

            if (keyCode == 257 || keyCode == 335) {
               this.O00000000(O00000OO0OOO00.W249.ADD_CRACKED);
               return true;
            }
         }

         boolean var6 = (modifiers & 2) != 0 || (modifiers & 8) != 0;
         if (var6 && keyCode == 67) {
            this.O000000000O00O();
            return true;
         } else if (var6 && keyCode == 83) {
            this.O000000000O0O();
            return true;
         } else if (var6 && keyCode == 71) {
            this.O00000000(5);
            return true;
         } else if (keyCode == 257 || keyCode == 335) {
            this.O00000000(O00000OO0OOO00.W249.USE);
            return true;
         } else if (keyCode == 261) {
            this.O00000000(O00000OO0OOO00.W249.DELETE);
            return true;
         } else if (keyCode == 264) {
            this.O000000000(1);
            return true;
         } else if (keyCode == 265) {
            this.O000000000(-1);
            return true;
         } else {
            return super.keyPressed(keyCode, scanCode, modifiers);
         }
      }
   }

   private void O00000000(boolean bl) {
      this.O0000000000O.clear();
      this.O0000000000O0O.clear();
      File var2 = this.O00000000000O();
      boolean var3 = var2.exists() && !O00000OO0OOO.O0000000000(var2);

      for (O00000OO0OOO.W246 var5 : O00000OO0OOO.O00000000(var2)) {
         this.O0000000000O0O.put(var5.id(), var5.password());
         this.O0000000000O
            .add(
               new O00000OO0OOO00.W247(
                  var5.name(), O00000OO0OOO00.W248.O00000000(var5.type()), false, this.O000000000OO00, var5.id(), var5.createdAt(), var5.lastUsedAt()
               )
            );
      }

      MinecraftClient var7 = this.client == null ? MinecraftClient.getInstance() : this.client;
      if (var7 != null && var7.getSession() != null) {
         O0000O00O00OO0.O00000000(var7);
         O0000O00O00OO0.O000000000(var7)
            .filter(session -> !session.getUsername().equalsIgnoreCase(var7.getSession().getUsername()))
            .ifPresent(session -> this.O00000000(session, true));
         this.O00000000(var7.getSession(), true);
      }

      for (int var8 = 0; var8 < this.O0000000000O.size(); var8++) {
         O00000OO0OOO00.W247 var6 = this.O0000000000O.get(var8);
         var6.O0000000000O00 = bl ? -1.0F : this.O000000000OO00 + var8 * 0.045F;
         var6.O000000000OOO = bl ? 1.0F : 0.0F;
      }

      if (var3) {
         this.O0000000000();
      }
   }

   private void O000000000() {
      this.O00000000(350L);
   }

   private void O0000000000() {
      this.O00000000(0L);
   }

   private void O00000000000() {
      ScheduledFuture var1 = this.O00000000OOOOO;
      if (var1 != null) {
         var1.cancel(false);
         this.O00000000OOOOO = null;
      }

      try {
         this.O00000000OOOOO = O00000000000.schedule((Runnable)this::O000000000000, 0L, TimeUnit.MILLISECONDS);
         this.O00000000OOOOO.get(10L, TimeUnit.SECONDS);
      } catch (Throwable var6) {
      } finally {
         this.O00000000OOOOO = null;
      }
   }

   private void O00000000(long l) {
      ScheduledFuture var3 = this.O00000000OOOOO;
      if (var3 != null) {
         var3.cancel(false);
      }

      this.O00000000OOOOO = O00000000000.schedule((Runnable)this::O000000000000, l, TimeUnit.MILLISECONDS);
   }

   private void O000000000000() {
      File var1 = this.O00000000000O();
      ArrayList var2;
      String var3;
      synchronized (this.O0000000000O) {
         var2 = new ArrayList();

         for (O00000OO0OOO00.W247 var6 : this.O0000000000O) {
            if (!var6.O00000000O00 && !var6.O00000000O0 && !var6.O00000000000) {
               var2.add(
                  new O00000OO0OOO.W246(
                     var6.O00000000,
                     var6.O000000000,
                     var6.O0000000000.name(),
                     this.O0000000000O0O.getOrDefault(var6.O00000000, ""),
                     var6.O00000000000O,
                     var6.O00000000000O0
                  )
               );
            }
         }

         var3 = this.O000000000000O();
      }

      O00000OO0OOO.O00000000(var1, var2, var3);
   }

   private void O0000000000000() {
      this.O0000000000();
   }

   private String O000000000000O() {
      O00000OO0OOO00.W247 var1 = this.O000000000O0O0();
      return var1 != null && !var1.O00000000000 ? var1.O00000000 : O00000OO0OOO.O000000000(this.O00000000000O());
   }

   private File O00000000000O() {
      File var1 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000000 != null ? WildClient.O00000000.O0000000000000 : WildClient.O000000000();
      return new File(var1, "accounts.json");
   }

   private void O00000000000O0() {
      MinecraftClient var1 = this.client == null ? MinecraftClient.getInstance() : this.client;
      String var2 = var1 != null && var1.getSession() != null ? var1.getSession().getUsername() : "";
      String var3 = O00000OO0OOO.O000000000(this.O00000000000O());
      int var4 = this.O00000000(var3);
      if (var4 >= 0) {
         this.O00000000(var4, this.O0000000000O.get(var4).O000000000.equalsIgnoreCase(var2) ? "Active identity: " : "Selected identity: ");
      } else {
         int var5 = this.O000000000(var2);
         if (var5 >= 0) {
            this.O00000000(var5, "Active identity: ");
         } else if (!this.O0000000000O.isEmpty()) {
            this.O00000000(0, "Selected identity: ");
         } else {
            this.O00000000O0OOO = -1;
         }
      }
   }

   private int O00000000(String string) {
      if (string != null && !string.isBlank()) {
         for (int var2 = 0; var2 < this.O0000000000O.size(); var2++) {
            O00000OO0OOO00.W247 var3 = this.O0000000000O.get(var2);
            if (!var3.O00000000O00 && !var3.O00000000O0 && string.equals(var3.O00000000)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private int O000000000(String string) {
      if (string != null && !string.isBlank()) {
         for (int var2 = 0; var2 < this.O0000000000O.size(); var2++) {
            O00000OO0OOO00.W247 var3 = this.O0000000000O.get(var2);
            if (!var3.O00000000O00 && !var3.O00000000O0 && var3.O000000000.equalsIgnoreCase(string)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private void O00000000(int i, String string) {
      if (i >= 0 && i < this.O0000000000O.size()) {
         this.O00000000O0OOO = i;
         O00000OO0OOO00.W247 var3 = this.O0000000000O.get(this.O00000000O0OOO);
         this.O00000000OO0 = string + var3.O000000000;
         this.O000000000OOOO();
      } else {
         this.O00000000O0OOO = -1;
      }
   }

   private void O00000000000OO() {
      if (this.O0000000000OO0()) {
         this.O000000000O000();
      } else {
         String var1 = O00000000000O(this.O0000000000OO0.O000000000O000);
         if (var1.isBlank()) {
            this.O00000000OO0 = "Enter username";
            this.O0000000000OO0.O0000000000O00 = 1.0F;
         } else {
            for (int var2 = 0; var2 < this.O0000000000O.size(); var2++) {
               O00000OO0OOO00.W247 var3 = this.O0000000000O.get(var2);
               if (!var3.O00000000O00 && var3.O000000000.equalsIgnoreCase(var1)) {
                  this.O00000000O0OOO = var2;
                  var3.O000000000O0O0 = 1.0F;
                  this.O00000000OO0 = "Identity already exists";
                  this.O000000000OOOO();
                  this.O000000000();
                  return;
               }
            }

            long var5 = System.currentTimeMillis();
            O00000OO0OOO00.W247 var4 = new O00000OO0OOO00.W247(
               var1, O00000OO0OOO00.W248.CRACKED, false, this.O000000000OO00, O00000000(var1, O00000OO0OOO00.W248.CRACKED), var5, 0L
            );
            var4.O000000000O0O0 = 1.0F;
            this.O0000000000O.add(var4);
            this.O0000000000O0.add(var1.toLowerCase(Locale.ROOT));
            this.O00000000O0OOO = this.O0000000000O.size() - 1;
            this.O000000000OOOO();
            this.O0000000000OO0.O0000000000();
            this.O00000000OO0 = "Cracked identity added";
            this.O0000000000000();
         }
      }
   }

   private void O0000000000O() {
      Set var1 = this.O0000000000O0();

      for (int var2 = 0; var2 < 256; var2++) {
         String var3 = O0000000000O00();
         if (!var3.isBlank() && !var1.contains(var3.toLowerCase(Locale.ROOT))) {
            this.O0000000000(var3);
            return;
         }
      }

      String var4 = O00000000(var1);
      if (!var4.isBlank()) {
         this.O0000000000(var4);
      } else {
         this.O00000000OO0 = "Generated identity collision";
         this.O0000000000OO0.O0000000000O00 = 1.0F;
      }
   }

   private Set<String> O0000000000O0() {
      HashSet var1 = new HashSet<>(this.O0000000000O0);

      for (O00000OO0OOO00.W247 var3 : this.O0000000000O) {
         if (!var3.O00000000O00 && !var3.O00000000O0) {
            var1.add(var3.O000000000.toLowerCase(Locale.ROOT));
         }
      }

      String var4 = O00000000000O(this.O0000000000OO0.O000000000O000);
      if (!var4.isBlank()) {
         var1.add(var4.toLowerCase(Locale.ROOT));
      }

      return var1;
   }

   private void O0000000000(String string) {
      this.O0000000000O0.add(string.toLowerCase(Locale.ROOT));
      this.O0000000000OO0.O0000000000();
      this.O0000000000OO0.O00000000(string);
      this.O0000000000OO0.O000000000O0O = true;
      this.O0000000000OO0.O000000000O0O0 = true;
      this.O0000000000OO0.O0000000000O00 = 1.0F;
      this.O00000000OO0 = "Generated identity: " + string;
   }

   private static String O0000000000O00() {
      ThreadLocalRandom var0 = ThreadLocalRandom.current();

      for (int var1 = 0; var1 < 28; var1++) {
         String var2 = O0000000000000[var0.nextInt(O0000000000000.length)];
         String var3 = O0000000000000[var0.nextInt(O0000000000000.length)];
         String var4 = O000000000000[var0.nextInt(O000000000000.length)];
         String var5 = O000000000000O[var0.nextInt(O000000000000O.length)];
         String var6 = O00000000(var0, var0.nextInt(2, 5));
         String var7 = var2.substring(0, Math.min(var2.length(), var0.nextInt(2, Math.min(4, var2.length()) + 1)));
         String var8 = var3.substring(0, Math.min(var3.length(), var0.nextInt(2, Math.min(4, var3.length()) + 1)));
         String var9 = var0.nextInt(100) < 18 ? "_" : "";
         String var10 = O000000000(var0);
         String var11 = var0.nextInt(100) < 40 ? var10 : "";
         String var12 = var0.nextInt(100) < 45 ? var5 : "";

         String var13 = switch (var0.nextInt(20)) {
            case 0 -> O000000000000O(var2) + O000000000000O(var3);
            case 1 -> var4 + O000000000000O(var2);
            case 2 -> O000000000000O(var2) + var5;
            case 3 -> var2 + var9 + var10;
            case 4 -> O000000000000O(var7) + O000000000000O(var3);
            case 5 -> var2 + O000000000000O(var8);
            case 6 -> O000000000000O(var6) + (var0.nextInt(100) < 28 ? var5 : "");
            case 7 -> var6 + var9 + var10;
            case 8 -> O000000000000O(var2) + O000000000000O(var8) + var11;
            case 9 -> var4 + var9 + var6;
            case 10 -> var7 + O000000000000O(O00000000(var0, var0.nextInt(1, 3))) + var5;
            case 11 -> O00000000000(var2) + var12;
            case 12 -> O000000000000O(var2) + "_" + O000000000000O(var3);
            case 13 -> O000000000000(var2) + O000000000000O(var3);
            case 14 -> "xX" + O000000000000O(var2) + "Xx";
            case 15 -> O0000000000000(var2) + var11;
            case 16 -> O000000000000O(var4) + O000000000000O(var2) + var5;
            case 17 -> O000000000000O(var2) + O00000000000(var8);
            case 18 -> O000000000000O(var2) + O00000000(var0);
            default -> O000000000000O(var2) + var12 + (var0.nextInt(100) < 36 ? var10 : "");
         };
         var13 = O00000000000O(var13);
         if (var13.length() >= 3 && var13.length() <= 16) {
            return var13;
         }
      }

      return O00000000(Set.of());
   }

   private static String O00000000000(String string) {
      if (string != null && !string.isEmpty()) {
         StringBuilder var1 = new StringBuilder(string.length());

         for (int var2 = 0; var2 < string.length(); var2++) {
            char var3 = Character.toLowerCase(string.charAt(var2));

            var1.append(switch (var3) {
               case 'a' -> '4';
               default -> string.charAt(var2);
               case 'e' -> '3';
               case 'i' -> '1';
               case 'o' -> '0';
               case 's' -> '5';
               case 't' -> '7';
            });
         }

         return var1.toString();
      } else {
         return "";
      }
   }

   private static String O000000000000(String string) {
      if (string != null && string.length() >= 4) {
         StringBuilder var1 = new StringBuilder(string.length());

         for (int var2 = 0; var2 < string.length(); var2++) {
            char var3 = string.charAt(var2);
            boolean var4 = "aeiouAEIOU".indexOf(var3) >= 0;
            if (!var4 || var2 == 0) {
               var1.append(var3);
            }
         }

         return var1.length() < 2 ? string : var1.toString();
      } else {
         return string == null ? "" : string;
      }
   }

   private static String O0000000000000(String string) {
      return string != null && !string.isEmpty() ? string + string.charAt(string.length() - 1) : "";
   }

   private static String O00000000(ThreadLocalRandom threadLocalRandom) {
      int var1 = threadLocalRandom.nextInt(100);
      return var1 < 10 ? "0" + var1 : String.valueOf(var1);
   }

   private static String O00000000(ThreadLocalRandom threadLocalRandom, int i) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < i; var3++) {
         var2.append(O00000000000O[threadLocalRandom.nextInt(O00000000000O.length)]);
      }

      return var2.toString();
   }

   private static String O000000000(ThreadLocalRandom threadLocalRandom) {
      return switch (threadLocalRandom.nextInt(4)) {
         case 0 -> String.valueOf(threadLocalRandom.nextInt(7, 99));
         case 1 -> String.valueOf(threadLocalRandom.nextInt(100, 999));
         case 2 -> String.valueOf(threadLocalRandom.nextInt(1000, 9999));
         default -> String.valueOf(threadLocalRandom.nextInt(10, 9999));
      };
   }

   private static String O00000000(Set<String> set) {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();

      for (int var2 = 0; var2 < 64; var2++) {
         String var3 = Long.toUnsignedString(var1.nextLong(), 36);
         if (var3.length() > 8) {
            var3 = var3.substring(0, 8);
         }

         String var4 = O00000000000O("Wild" + var3);
         if (!var4.isBlank() && !set.contains(var4.toLowerCase(Locale.ROOT))) {
            return var4;
         }
      }

      return "";
   }

   private static String O000000000000O(String string) {
      if (string != null && !string.isEmpty()) {
         return string.length() == 1 ? string.toUpperCase(Locale.ROOT) : string.substring(0, 1).toUpperCase(Locale.ROOT) + string.substring(1);
      } else {
         return "";
      }
   }

   private void O0000000000O0O() {
      O00000OO0OOO00.W247 var1 = this.O000000000O0O0();
      MinecraftClient var2 = this.client == null ? MinecraftClient.getInstance() : this.client;
      if (var1 != null && var2 != null) {
         O0000O00O00OO0.O00000000(var2);
         boolean var3 = O0000O00O00OO0.O00000000(var2, var1.O000000000);
         if (!var3) {
            O0000O00O00OO0.O000000000(var2, var1.O000000000);
         }

         var1.O00000000000O0 = System.currentTimeMillis();
         var1.O000000000O0O0 = 1.0F;
         AutoLoginManager.O00000000(var1.O000000000, "");
         this.O00000000OO0 = "Active identity: " + var1.O000000000;
         this.O0000000000000();
      } else {
         this.O00000000OO0 = "Select an identity";
      }
   }

   private void O0000000000OO() {
      O00000OO0OOO00.W247 var1 = this.O000000000O0O0();
      if (var1 == null) {
         this.O00000000OO0 = "Select an identity";
      } else {
         var1.O00000000O0 = true;
         var1.O000000000OOO0 = this.O000000000OO00;
         var1.O000000000O0O0 = 1.0F;
         this.O00000000OO0 = "Identity removed";
         int var2 = this.O00000000O0OOO;
         this.O00000000O0OOO = this.O0000000000O.size() <= 1 ? -1 : (var2 >= this.O0000000000O.size() - 1 ? var2 - 1 : var2 + 1);
         this.O000000000OOOO();
         this.O0000000000000();
      }
   }

   private boolean O0000000000OO0() {
      return this.O00000000OO00 != null && this.O00000000(this.O00000000OO00) >= 0;
   }

   private boolean O0000000000OOO() {
      if (this.O0000000000OO0()) {
         return true;
      } else {
         O00000OO0OOO00.W247 var1 = this.O000000000O0O0();
         return var1 != null && !var1.O00000000000;
      }
   }

   private void O000000000O() {
      if (this.O0000000000OO0()) {
         this.O000000000O00();
      } else {
         this.O000000000O0();
      }
   }

   private void O000000000O0() {
      O00000OO0OOO00.W247 var1 = this.O000000000O0O0();
      if (var1 != null && !var1.O00000000000) {
         this.O00000000OO00 = var1.O00000000;
         this.O0000000000OO0.O0000000000();
         this.O0000000000OO0.O00000000(var1.O000000000);
         this.O0000000000OO0.O000000000O0O = true;
         this.O0000000000OO0.O000000000O0O0 = true;
         this.O0000000000OO0.O0000000000O00 = 1.0F;
         this.O00000000OO0 = "Renaming: " + var1.O000000000;
      } else {
         this.O00000000OO0 = "Select a saved identity";
         this.O0000000000OO0.O0000000000O00 = 1.0F;
      }
   }

   private void O000000000O00() {
      this.O00000000OO00 = null;
      this.O0000000000OO0.O0000000000();
      this.O0000000000OO0.O000000000O0O = false;
      this.O0000000000OO0.O000000000O0O0 = false;
      this.O00000000OO0 = "Rename cancelled";
   }

   private void O000000000O000() {
      String var1 = O00000000000O(this.O0000000000OO0.O000000000O000);
      if (var1.isBlank()) {
         this.O00000000OO0 = "Enter username";
         this.O0000000000OO0.O0000000000O00 = 1.0F;
      } else {
         int var2 = this.O00000000(this.O00000000OO00);
         if (var2 < 0) {
            this.O00000000OO00 = null;
            this.O00000000OO0 = "Identity not found";
         } else {
            O00000OO0OOO00.W247 var3 = this.O0000000000O.get(var2);

            for (int var4 = 0; var4 < this.O0000000000O.size(); var4++) {
               if (var4 != var2) {
                  O00000OO0OOO00.W247 var5 = this.O0000000000O.get(var4);
                  if (!var5.O00000000O00 && !var5.O00000000O0 && var5.O000000000.equalsIgnoreCase(var1)) {
                     this.O00000000OO0 = "Identity already exists";
                     this.O0000000000OO0.O0000000000O00 = 1.0F;
                     return;
                  }
               }
            }

            if (var3.O000000000.equals(var1)) {
               this.O00000000OO00 = null;
               this.O0000000000OO0.O0000000000();
               this.O0000000000OO0.O000000000O0O = false;
               this.O00000000OO0 = "Renamed identity";
            } else {
               String var7 = O00000000(var1, var3.O0000000000);
               String var8 = this.O0000000000O0O.getOrDefault(var3.O00000000, "");
               O00000OO0OOO00.W247 var6 = new O00000OO0OOO00.W247(var1, var3.O0000000000, false, -1.0F, var7, var3.O00000000000O, var3.O00000000000O0);
               var6.O000000000OOO = 1.0F;
               var6.O000000000O0O0 = 1.0F;
               this.O0000000000O.set(var2, var6);
               this.O0000000000O0O.remove(var3.O00000000);
               this.O0000000000O0O.put(var7, var8);
               this.O0000000000O0.add(var1.toLowerCase(Locale.ROOT));
               this.O00000000O0OOO = var2;
               this.O00000000OO00 = null;
               this.O0000000000OO0.O0000000000();
               this.O0000000000OO0.O000000000O0O = false;
               this.O00000000OO0 = "Renamed to " + var1;
               this.O0000000000000();
            }
         }
      }
   }

   private void O000000000O00O() {
      O00000OO0OOO00.W247 var1 = this.O000000000O0O0();
      if (var1 != null && this.client != null && this.client.keyboard != null) {
         this.client.keyboard.setClipboard(var1.O000000000);
         this.O00000000OO0 = "Copied: " + var1.O000000000;
      } else {
         this.O00000000OO0 = "Select an identity";
      }
   }

   private void O000000000O0O() {
      if (this.O0000000000O.size() >= 2) {
         O00000OO0OOO00.W247 var1 = this.O000000000O0O0();
         String var2 = var1 == null ? null : var1.O00000000;
         this.O0000000000O.sort((o00000000, o000000002) -> Long.compare(o000000002.O00000000000O0, o00000000.O00000000000O0));
         if (var2 != null) {
            int var3 = this.O00000000(var2);
            if (var3 >= 0) {
               this.O00000000O0OOO = var3;
            }
         }

         this.O00000000OO0 = "Sorted by last used";
         this.O000000000OOOO();
         this.O000000000();
      }
   }

   private void O00000000(int i) {
      int var2 = 0;
      long var3 = System.currentTimeMillis();

      for (int var5 = 0; var5 < i; var5++) {
         Set var6 = this.O0000000000O0();
         String var7 = O0000000000O00();
         if (var7.isBlank() || var6.contains(var7.toLowerCase(Locale.ROOT))) {
            var7 = O00000000(var6);
         }

         if (!var7.isBlank()) {
            O00000OO0OOO00.W247 var8 = new O00000OO0OOO00.W247(
               var7, O00000OO0OOO00.W248.CRACKED, false, this.O000000000OO00, O00000000(var7, O00000OO0OOO00.W248.CRACKED), var3, 0L
            );
            var8.O000000000O0O0 = 1.0F;
            this.O0000000000O.add(var8);
            this.O0000000000O0.add(var7.toLowerCase(Locale.ROOT));
            var2++;
         }
      }

      if (var2 > 0) {
         this.O00000000O0OOO = this.O0000000000O.size() - 1;
         this.O000000000OOOO();
         this.O00000000OO0 = "Added " + var2 + " identities";
         this.O0000000000000();
      } else {
         this.O00000000OO0 = "Generation collision";
         this.O0000000000OO0.O0000000000O00 = 1.0F;
      }
   }

   private O00000OO0OOO00.W247 O000000000O0O0() {
      if (this.O00000000O0OOO >= 0 && this.O00000000O0OOO < this.O0000000000O.size()) {
         O00000OO0OOO00.W247 var1 = this.O0000000000O.get(this.O00000000O0OOO);
         return !var1.O00000000O00 && !var1.O00000000O0 ? var1 : null;
      } else {
         return null;
      }
   }

   private void O000000000O0OO() {
      boolean var1 = false;

      for (int var2 = this.O0000000000O.size() - 1; var2 >= 0; var2--) {
         O00000OO0OOO00.W247 var3 = this.O0000000000O.get(var2);
         if (var3.O00000000O0 && this.O000000000OO00 - var3.O000000000OOO0 > 0.46F) {
            this.O0000000000O.remove(var2);
            var1 = true;
            if (this.O00000000O0OOO >= var2) {
               this.O00000000O0OOO--;
            }
         }
      }

      if (var1) {
         this.O00000000O0OOO = this.O0000000000O.isEmpty() ? -1 : O00000000(this.O00000000O0OOO, 0, this.O0000000000O.size() - 1);
         this.O000000000OOOO();
      }
   }

   private void O00000000(O00000OO0OOO00.W249 o0000000000) {
      MinecraftClient var2 = this.client == null ? MinecraftClient.getInstance() : this.client;
      switch (o0000000000) {
         case USE:
            this.O0000000000O0O();
            break;
         case ADD_CRACKED:
            this.O00000000000OO();
            break;
         case RANDOM:
            this.O0000000000O();
            break;
         case EDIT:
            this.O000000000O();
            break;
         case DELETE:
            this.O0000000000OO();
            break;
         case BACK:
            if (var2 != null) {
               var2.execute(() -> var2.setScreen(this.O00000000000O0));
            }
      }
   }

   private void O000000000OO() {
      Theme var1 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.AURORA;
      this.O00000000O0OO = var1;
      O0000O000OO.W351 var2 = O00000000.O000000000(var1);
      if (var2 != null) {
         this.O00000000O0O00 = var2.O0000000000();
         this.O00000000O0O0O = var2.O00000000000();
         this.O00000000O0OO0 = var2.O000000000000();
      } else {
         this.O00000000O0OO0 = false;
         Color var3 = var1.O00000000();
         this.O00000000O0O00 = 0xFF000000 | var3.getRGB() & 16777215;
         float[] var4 = Color.RGBtoHSB(var3.getRed(), var3.getGreen(), var3.getBlue(), null);
         this.O00000000O0O0O = 0xFF000000
            | Color.HSBtoRGB((var4[0] + 0.075F) % 1.0F, Math.min(1.0F, var4[1] * 1.08F), Math.min(1.0F, var4[2] * 1.18F)) & 16777215;
      }
   }

   private void O00000000(Window window, int i, int j, float f, long l) {
      float var7 = this.O00000000(window, (double)i);
      float var8 = this.O000000000(window, j);
      if (!this.O00000000O00O) {
         this.O000000000OO0O = var7;
         this.O000000000OOO = var8;
         this.O000000000OOO0 = 0.0F;
         this.O000000000OOOO = 0.0F;
         this.O00000000O00O = true;
      } else {
         float var9 = var7 - this.O000000000OO0O;
         float var10 = var8 - this.O000000000OOO;
         float var11 = O000000000(var9, var10);
         if (var11 > 0.2F) {
            this.O000000000OOO0 = O000000000(var9 / Math.max(1.0F, (float)window.getFramebufferWidth()) / f, -3.0F, 3.0F);
            this.O000000000OOOO = O000000000(var10 / Math.max(1.0F, (float)window.getFramebufferHeight()) / f, -3.0F, 3.0F);
         } else {
            float var12 = (float)Math.pow(8.0E-4F, f);
            this.O000000000OOO0 *= var12;
            this.O000000000OOOO *= var12;
         }

         this.O000000000OO0O = var7;
         this.O000000000OOO = var8;
         if (var11 > 1.5F) {
            this.O000000000OO = l;
         }
      }
   }

   private void O000000000(int i, int j, float f) {
      if (!this.O00000000O00O0) {
         this.O00000000O = this.O000000000OO0O;
         this.O00000000O0 = this.O000000000OOO;
         this.O00000000O00 = 0.0F;
         this.O00000000O000 = 0.0F;
         this.O00000000O00O0 = true;
      } else {
         float var4 = this.O00000000O;
         float var5 = this.O00000000O0;
         float var6 = O000000000(this.O000000000OO0O - this.O00000000O, this.O000000000OOO - this.O00000000O0);
         float var7 = (1.0F - (float)Math.pow(1.8E-5F, f)) * (0.58F + O000000000(var6 / 780.0F, 0.0F, 0.28F));
         this.O00000000O = this.O00000000O + (this.O000000000OO0O - this.O00000000O) * O000000000(var7, 0.028F, 0.16F);
         this.O00000000O0 = this.O00000000O0 + (this.O000000000OOO - this.O00000000O0) * O000000000(var7, 0.028F, 0.16F);
         float var8 = O000000000((this.O00000000O - var4) / Math.max(1.0F, (float)i) / f, -1.25F, 1.25F);
         float var9 = O000000000((this.O00000000O0 - var5) / Math.max(1.0F, (float)j) / f, -1.25F, 1.25F);
         float var10 = 1.0F - (float)Math.pow(0.0045F, f);
         this.O00000000O00 = this.O00000000O00 + (var8 - this.O00000000O00) * var10;
         this.O00000000O000 = this.O00000000O000 + (var9 - this.O00000000O000) * var10;
      }
   }

   private void O000000000OO0() {
      if (!this.O00000000O00OO) {
         this.O00000000O0000 = this.O00000000O;
         this.O00000000O000O = this.O00000000O0;
         this.O00000000O00OO = true;
         this.O00000000(this.O00000000O, this.O00000000O0, 0.18F);
      } else {
         float var1 = O000000000(this.O00000000O - this.O00000000O0000, this.O00000000O0 - this.O00000000O000O);
         if (var1 > 10.5F) {
            this.O00000000(this.O00000000O, this.O00000000O0, O000000000(var1 / 280.0F, 0.06F, 0.3F));
            this.O00000000O0000 = this.O00000000O;
            this.O00000000O000O = this.O00000000O0;
         }
      }
   }

   private boolean O00000000(Window window, int i, int j, int k, int l, long m) {
      if (this.O00000000O0O == i && this.O00000000O0O0 == j) {
         return false;
      } else {
         this.O00000000O0O = i;
         this.O00000000O0O0 = j;
         float var8 = O000000000(this.O00000000(window, (double)k), 0.0F, (float)i);
         float var9 = O000000000(this.O000000000(window, l), 0.0F, (float)j);
         this.O000000000OO0O = this.O00000000O = this.O00000000O0000 = var8;
         this.O000000000OOO = this.O00000000O0 = this.O00000000O000O = var9;
         this.O000000000OOO0 = this.O000000000OOOO = 0.0F;
         this.O00000000O00 = this.O00000000O000 = 0.0F;
         this.O00000000O00O = true;
         this.O00000000O00O0 = true;
         this.O00000000O00OO = true;
         this.O000000000OO = m;
         this.O00000000OO0O = false;
         this.O000000000O.O00000000(0.0F);
         this.O000000000O0.O00000000(0.0F);
         this.O00000000OO00O = this.O00000000OO000;
         this.O000000000OO00();
         this.O00000000(var8, var9, 0.12F);
         this.O000000000OOOO();
         return true;
      }
   }

   private void O000000000OO00() {
      for (O00000OO0OOO00.W263 var4 : this.O0000000000OOO) {
         var4.O00000000 = 0.0F;
         var4.O000000000 = 0.0F;
         var4.O0000000000 = -100.0F;
         var4.O00000000000 = 0.0F;
      }
   }

   private void O00000000(float f, float g, float h) {
      int var4 = 0;
      float var5 = -1.0F;

      for (int var6 = 0; var6 < this.O0000000000OOO.length; var6++) {
         float var7 = this.O000000000OO00 - this.O0000000000OOO[var6].O0000000000;
         if (this.O0000000000OOO[var6].O00000000000 <= 0.0F) {
            var4 = var6;
            break;
         }

         if (var7 > var5) {
            var5 = var7;
            var4 = var6;
         }
      }

      this.O0000000000OOO[var4].O00000000 = f;
      this.O0000000000OOO[var4].O000000000 = g;
      this.O0000000000OOO[var4].O0000000000 = this.O000000000OO00;
      this.O0000000000OOO[var4].O00000000000 = h;
   }

   private void O00000000(int i, int j, float f, float g, float h) {
      float var6 = O00000000(i, j);
      float var7 = O000000000(i * 0.25F, 280.0F * var6, 420.0F * var6);
      float var8 = O000000000(j * 0.078F, 72.0F * var6, 94.0F * var6);
      float var9 = 14.0F * var6;
      int var10 = this.O00000000O();
      this.O00000000OO = Math.max(3, Math.min(5, (int)(j * 0.46F / (var8 + var9))));
      if (var10 < this.O00000000OO && var10 > 0) {
         this.O00000000OO = Math.max(1, var10);
      }

      if (var10 == 0) {
         this.O00000000OO = 1;
      }

      int var11 = Math.max(0, var10 - Math.max(1, this.O00000000OO));
      this.O00000000OO000 = O000000000(this.O00000000OO000, 0.0F, (float)var11);
      float var12 = 1.0F - (float)Math.exp(-22.0F * h);
      this.O00000000OO00O = this.O00000000OO00O + (this.O00000000OO000 - this.O00000000OO00O) * var12;
      if (Float.isNaN(this.O00000000OO00O)) {
         this.O00000000OO00O = this.O00000000OO000;
      }

      float var13 = this.O00000000OO * var8 + Math.max(0, this.O00000000OO - 1) * var9;
      float var14 = O000000000(i * 0.3F, 320.0F * var6, 480.0F * var6);
      float var15 = 42.0F * var6;
      float var16 = 42.0F * var6;
      float var17 = 10.0F * var6;
      float var18 = O000000000(i * 0.067F, 86.0F * var6, 124.0F * var6);
      float var19 = this.O0000000000OO.size() * var18 + (this.O0000000000OO.size() - 1) * var17;
      float var20 = 28.0F * var6;
      float var21 = 18.0F * var6;
      float var22 = var13 + var20 + var15 + var21 + var16;
      float var23 = j * 0.275F + g * 1.0F * var6;
      if (var23 + var22 > j - 58.0F * var6) {
         var23 = j - var22 - 58.0F * var6;
      }

      var23 = Math.max(j * 0.19F, var23);
      float var24 = i * 0.5F + f * 1.55F * var6;
      float var25 = var24 - var7 * 0.5F;
      this.O000000000O00 = var25;
      this.O000000000O000 = var23;
      this.O000000000O00O = var7;
      this.O000000000O0O = var13;
      this.O00000000OOOO0 = var11 > 0;
      if (this.O00000000OOOO0) {
         this.O00000000OOO0 = Math.max(4.0F, 5.5F * var6);
         this.O00000000OO0OO = var24 + var7 * 0.5F + 16.0F * var6;
         this.O00000000OOO = var23;
         this.O00000000OOO00 = var13;
         float var26 = O000000000((float)this.O00000000OO / var10, 0.1F, 1.0F);
         this.O00000000OOOO = Math.max(34.0F * var6, this.O00000000OOO00 * var26);
         float var27 = this.O00000000OOO00 - this.O00000000OOOO;
         float var28 = var11 == 0 ? 0.0F : this.O00000000OO00O / var11;
         this.O00000000OOO0O = this.O00000000OOO + var27 * var28;
      }

      String var39 = this.O000000000OOO();
      int var40 = 0;

      for (int var41 = 0; var41 < this.O0000000000O.size(); var41++) {
         O00000OO0OOO00.W247 var29 = this.O0000000000O.get(var41);
         if (var29.O00000000O00) {
            var29.O00000000O000 = false;
            var29.O000000000OOO = 0.0F;
         } else {
            int var30 = var40;
            if (!var29.O00000000O0) {
               var40++;
            }

            float var31 = var30 - this.O00000000OO00O;
            var29.O00000000O000 = var31 > -1.0F && var31 < this.O00000000OO;
            var29.O0000000000O0O = var25;
            var29.O0000000000OO = var23 + var31 * (var8 + var9);
            var29.O000000000O = var7;
            var29.O000000000O0 = var8;
            var29.O000000000O00 = Math.min(var8 * 0.36F, 20.0F * var6);
            var29.O000000000OO0O = 58.0F * var6;
            var29.O000000000OOOO = var41 == this.O00000000O0OOO;
            var29.O00000000O = this.O00000000(var29, var39);
            if (!var29.O00000000O000 && !var29.O00000000O0) {
               var29.O000000000O000 = 0.0F;
               var29.O000000000O00O = var29.O000000000OOOO ? 0.42F : 0.0F;
               var29.O000000000O0O = 0.0F;
               var29.O000000000OO00 = 0.0F;
               var29.O0000000000OO0 = var29.O0000000000O0O;
               var29.O0000000000OOO = var29.O0000000000OO;
               var29.O000000000O0OO = 1.0F;
            } else {
               this.O00000000(var29, h, var6);
            }

            float var32 = var29.O0000000000OO + var8 * 0.5F;
            float var33 = var8 * 0.45F;
            float var34 = O000000000((var32 - var23 + var33) / var33, 0.0F, 1.0F);
            float var35 = O000000000((var23 + var13 + var33 - var32) / var33, 0.0F, 1.0F);
            float var36 = var34 * var35;
            float var37 = O000000000000(O000000000((this.O000000000OO00 - var29.O0000000000O00) / 0.72F, 0.0F, 1.0F));
            var29.O000000000OOO = !var29.O00000000O000 && !var29.O00000000O0
               ? 0.0F
               : var37
                  * var36
                  * (var29.O00000000O0 ? O000000000000(O000000000(1.0F - (this.O000000000OO00 - var29.O000000000OOO0) / 0.42F, 0.0F, 1.0F)) : 1.0F);
         }
      }

      float var42 = var23 + var13 + var20 + g * 0.35F * var6;
      float var43 = i * 0.5F - var14 * 0.5F + f * 1.15F * var6;
      this.O00000000(this.O0000000000OO0, var43, var42, var14, var15, var15 * 0.5F, h, var6);
      float var44 = i * 0.5F - var19 * 0.5F + f * 1.35F * var6;
      float var45 = var42 + var15 + var21;

      for (int var46 = 0; var46 < this.O0000000000OO.size(); var46++) {
         O00000OO0OOO00.W250 var47 = this.O0000000000OO.get(var46);
         var47.O000000000O000 = this.O000000000(var47.O000000000O00);
         if (var47.O000000000O00 == O00000OO0OOO00.W249.ADD_CRACKED) {
            var47.O00000000 = this.O0000000000OO0() ? "Save" : "Add";
         } else if (var47.O000000000O00 == O00000OO0OOO00.W249.EDIT) {
            var47.O00000000 = this.O0000000000OO0() ? "Cancel" : "Edit";
         }

         var47.O0000000000 = var44 + var46 * (var18 + var17);
         var47.O00000000000 = var45;
         var47.O000000000000O = var18;
         var47.O00000000000O = var16;
         var47.O00000000000O0 = var16 * 0.5F;
         var47.O000000000O = 46.0F * var6;
         var47.O000000000O0 = O000000000000(O000000000((this.O000000000OO00 - 0.38F - var46 * 0.035F) / 0.78F, 0.0F, 1.0F));
         this.O00000000(var47, h, var6, var47.O000000000O000 ? 1.0F : 0.28F);
      }
   }

   private void O00000000(O00000OO0OOO00.W252 o0000000000000, float f, float g, float h, float i, float j, float k, float l) {
      o0000000000000.O0000000000 = f;
      o0000000000000.O00000000000 = g;
      o0000000000000.O000000000000O = h;
      o0000000000000.O00000000000O = i;
      o0000000000000.O00000000000O0 = j;
      o0000000000000.O000000000O = 48.0F * l;
      o0000000000000.O000000000O0 = O000000000000(O000000000((this.O000000000OO00 - 0.3F) / 0.82F, 0.0F, 1.0F));
      this.O00000000(o0000000000000, k, l, 1.0F);
      o0000000000000.O000000000O0OO = o0000000000000.O000000000O0OO
         + ((o0000000000000.O000000000O0O ? 1.0F : 0.0F) - o0000000000000.O000000000O0OO) * (1.0F - (float)Math.pow(1.0E-4F, k));
   }

   private void O00000000(O00000OO0OOO00.W247 o00000000, float f, float g) {
      float var4 = o00000000.O00000000O0 ? O000000000000(O000000000((this.O000000000OO00 - o00000000.O000000000OOO0) / 0.42F, 0.0F, 1.0F)) : 0.0F;
      float var5 = O00000000(
         this.O000000000OO0O,
         this.O000000000OOO,
         o00000000.O0000000000O0O,
         o00000000.O0000000000OO,
         o00000000.O000000000O,
         o00000000.O000000000O0,
         o00000000.O000000000O00
      );
      float var6 = 1.0F - O000000000000(O000000000(Math.max(0.0F, var5) / Math.max(1.0F, 42.0F * g), 0.0F, 1.0F));
      boolean var7 = var5 <= 0.0F && !o00000000.O00000000O0 && o00000000.O00000000O000;
      float var8 = o00000000.O000000000OOOO ? 0.42F : 0.0F;
      o00000000.O000000000O000 = o00000000.O000000000O000 + ((var7 ? 1.0F : 0.0F) - o00000000.O000000000O000) * (1.0F - (float)Math.pow(1.0E-4F, f));
      o00000000.O000000000O00O = o00000000.O000000000O00O
         + ((o00000000.O00000000O000 ? Math.max(var6, var8) : 0.0F) - o00000000.O000000000O00O) * (1.0F - (float)Math.pow(1.5E-4F, f));
      o00000000.O000000000O0O = o00000000.O000000000O0O + (0.0F - o00000000.O000000000O0O) * (1.0F - (float)Math.pow(1.8E-5F, f));
      o00000000.O000000000O0O0 = o00000000.O000000000O0O0 + (0.0F - o00000000.O000000000O0O0) * (1.0F - (float)Math.pow(6.0E-6F, f));
      float var9 = O000000000((this.O00000000O - o00000000.O0000000000O0O) / Math.max(1.0F, o00000000.O000000000O), 0.0F, 1.0F);
      float var10 = O000000000((this.O00000000O0 - o00000000.O0000000000OO) / Math.max(1.0F, o00000000.O000000000O0), 0.0F, 1.0F);
      float var11 = 1.0F - (float)Math.pow(1.8E-4F, f);
      o00000000.O000000000OO = o00000000.O000000000OO + (var9 - o00000000.O000000000OO) * var11;
      o00000000.O000000000OO0 = o00000000.O000000000OO0 + (var10 - o00000000.O000000000OO0) * var11;
      float var12 = 1.0F + o00000000.O000000000O00O * 0.034F + (o00000000.O00000000O ? 0.008F : 0.0F) - o00000000.O000000000O0O * 0.065F - var4 * 0.2F;
      o00000000.O000000000O0OO = o00000000.O000000000000O.O00000000(var12, f);
      float var13 = var4 * o00000000.O000000000O0 * 0.35F;
      float var14 = (o00000000.O000000000OO - 0.5F) * 9.5F * g * o00000000.O000000000O00O;
      float var15 = (o00000000.O000000000OO0 - 0.5F) * 5.5F * g * o00000000.O000000000O00O - o00000000.O000000000O000 * 1.2F * g + var13;
      o00000000.O0000000000OO0 = o00000000.O0000000000O0O + var14;
      o00000000.O0000000000OOO = o00000000.O0000000000OO + var15;
      o00000000.O000000000OO00 = O000000000(
         O000000000(this.O00000000O00, this.O00000000O000) * 0.5F * o00000000.O000000000O00O + Math.abs(o00000000.O000000000000O.O000000000()) * 0.04F,
         0.0F,
         1.0F
      );
   }

   private void O00000000(O00000OO0OOO00.W253 o000000000000O, float f, float g, float h) {
      float var5 = O00000000(
         this.O000000000OO0O,
         this.O000000000OOO,
         o000000000000O.O0000000000,
         o000000000000O.O00000000000,
         o000000000000O.O000000000000O,
         o000000000000O.O00000000000O,
         o000000000000O.O00000000000O0
      );
      boolean var6 = var5 <= 0.0F && h > 0.5F;
      float var7 = 1.0F - O000000000000(O000000000(Math.max(0.0F, var5) / Math.max(1.0F, 26.0F * g), 0.0F, 1.0F));
      float var8 = var6 ? Math.max(0.72F, var7) : var7 * 0.54F;
      o000000000000O.O00000000000OO = o000000000000O.O00000000000OO
         + ((var6 ? 1.0F : 0.0F) - o000000000000O.O00000000000OO) * (1.0F - (float)Math.pow(1.0E-4F, f));
      o000000000000O.O0000000000O = o000000000000O.O0000000000O + (var8 * h - o000000000000O.O0000000000O) * (1.0F - (float)Math.pow(1.4E-4F, f));
      o000000000000O.O0000000000O0 = o000000000000O.O0000000000O0 + (0.0F - o000000000000O.O0000000000O0) * (1.0F - (float)Math.pow(1.8E-5F, f));
      o000000000000O.O0000000000O00 = o000000000000O.O0000000000O00 + (0.0F - o000000000000O.O0000000000O00) * (1.0F - (float)Math.pow(6.0E-6F, f));
      float var9 = O000000000((this.O00000000O - o000000000000O.O0000000000) / Math.max(1.0F, o000000000000O.O000000000000O), 0.0F, 1.0F);
      float var10 = O000000000((this.O00000000O0 - o000000000000O.O00000000000) / Math.max(1.0F, o000000000000O.O00000000000O), 0.0F, 1.0F);
      float var11 = 1.0F - (float)Math.pow(2.2E-4F, f);
      o000000000000O.O0000000000OO = o000000000000O.O0000000000OO + (var9 - o000000000000O.O0000000000OO) * var11;
      o000000000000O.O0000000000OO0 = o000000000000O.O0000000000OO0 + (var10 - o000000000000O.O0000000000OO0) * var11;
      float var12 = 1.0F
         + o000000000000O.O0000000000O * 0.04F
         - o000000000000O.O0000000000O0 * 0.065F
         + (o000000000000O instanceof O00000OO0OOO00.W252 var13 && var13.O000000000O0O ? 0.018F : 0.0F);
      o000000000000O.O0000000000O0O = o000000000000O.O000000000.O00000000(var12, f);
      o000000000000O.O000000000000 = o000000000000O.O0000000000 + (o000000000000O.O0000000000OO - 0.5F) * 5.0F * g * o000000000000O.O0000000000O;
      o000000000000O.O0000000000000 = o000000000000O.O00000000000
         + (o000000000000O.O0000000000OO0 - 0.5F) * 3.5F * g * o000000000000O.O0000000000O
         - o000000000000O.O00000000000OO * 1.2F * g;
      o000000000000O.O0000000000OOO = O000000000(
         O000000000(this.O00000000O00, this.O00000000O000) * 0.42F * o000000000000O.O0000000000O + Math.abs(o000000000000O.O000000000.O000000000()) * 0.04F,
         0.0F,
         1.0F
      );
   }

   private MainMenuScreen.W281 O00000000(int i, int j, int k, float f, float g, long l) {
      float var8 = Math.max(0.0F, (float)(l - this.O000000000OO) / 1.0E9F);
      float var9 = O000000000(O000000000(this.O00000000O00, this.O00000000O000), 0.0F, 3.0F);
      float var10 = Math.max((float)Math.exp(-var8 * 1.25F), O000000000(var9 * 0.22F, 0.0F, 1.0F));
      float var11 = O000000000000(O000000000(this.O000000000OO00 / 0.86F, 0.0F, 1.0F));
      float var12 = O00000000(i, j);
      ArrayList var13 = new ArrayList();

      for (O00000OO0OOO00.W247 var15 : this.O0000000000O) {
         if (!var15.O00000000O00 && var15.O00000000O000 && !(var15.O000000000OOO <= 0.001F)) {
            var13.add(
               new MainMenuScreen.W265(
                  var15.O000000000,
                  var15.O0000000000OO0,
                  var15.O0000000000OOO,
                  var15.O000000000O,
                  var15.O000000000O0,
                  var15.O000000000O00,
                  var15.O000000000O000,
                  Math.max(var15.O000000000O00O, var15.O00000000O ? 0.34F : 0.0F),
                  var15.O000000000O0O,
                  var15.O000000000OOO,
                  var15.O000000000O0O0,
                  var15.O000000000OO0O,
                  var15.O000000000O0OO,
                  var15.O000000000OO,
                  var15.O000000000OO0,
                  var15.O000000000OO00
               )
            );
         }
      }

      var13.add(this.O00000000(this.O0000000000OO0, this.O0000000000OO0.O000000000O0));

      for (O00000OO0OOO00.W250 var21 : this.O0000000000OO) {
         var13.add(this.O00000000(var21, var21.O000000000O000 ? var21.O000000000O0 : var21.O000000000O0 * 0.62F));
      }

      MainMenuScreen.W283[] var20 = new MainMenuScreen.W283[14];

      for (int var22 = 0; var22 < 14; var22++) {
         O00000OO0OOO00.W263 var16 = this.O0000000000OOO[var22];
         float var17 = Math.max(0.0F, this.O000000000OO00 - var16.O0000000000);
         float var18 = var17 > 3.1F ? 0.0F : var16.O00000000000;
         var20[var22] = new MainMenuScreen.W283(var16.O00000000 / Math.max(1.0F, (float)i), var16.O000000000 / Math.max(1.0F, (float)j), var17, var18);
      }

      return new MainMenuScreen.W281(
         i,
         j,
         k,
         this.O000000000OO00 * 0.46F,
         this.O00000000O,
         this.O00000000O0,
         this.O00000000O / Math.max(1.0F, (float)i),
         this.O00000000O0 / Math.max(1.0F, (float)j),
         this.O00000000O00 * 0.42F,
         this.O00000000O000 * 0.42F,
         var9 * 0.42F,
         O00000000000(this.O00000000O0O00),
         O000000000000(this.O00000000O0O00),
         O0000000000000(this.O00000000O0O00),
         O00000000000(this.O00000000O0O0O),
         O000000000000(this.O00000000O0O0O),
         O0000000000000(this.O00000000O0O0O),
         -f * 6.5E-4F,
         -g * 5.0E-4F,
         f * 0.75F * var12,
         g * 0.62F * var12,
         f * 1.2F * var12,
         g * 1.0F * var12,
         var10 * 0.55F,
         var10 > 0.1F ? 0.82F : 0.72F,
         0.58F + var11 * 0.18F,
         0.0F,
         this.O00000000O0OO == Theme.SAKURA_BREEZE,
         this.O00000000O0OO == Theme.VERNAL_SOLSTICE,
         this.O00000000O0OO == Theme.MIDNIGHT_AZURE,
         this.O00000000O0OO0,
         null,
         null,
         List.of(),
         List.of(),
         List.of(),
         new MainMenuScreen.W271(0.0F, 0.0F, 0.0F, 0.0F, 0.0F),
         var13,
         var20
      );
   }

   private MainMenuScreen.W265 O00000000(O00000OO0OOO00.W253 o000000000000O, float f) {
      return new MainMenuScreen.W265(
         o000000000000O.O00000000,
         o000000000000O.O000000000000,
         o000000000000O.O0000000000000,
         o000000000000O.O000000000000O,
         o000000000000O.O00000000000O,
         o000000000000O.O00000000000O0,
         o000000000000O.O00000000000OO,
         o000000000000O.O0000000000O,
         o000000000000O.O0000000000O0,
         f,
         o000000000000O.O0000000000O00,
         o000000000000O.O000000000O,
         o000000000000O.O0000000000O0O,
         o000000000000O.O0000000000OO,
         o000000000000O.O0000000000OO0,
         o000000000000O.O0000000000OOO
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
         boolean var4 = false;

         try {
            var2.O00000000(o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
            var4 = true;
            float var5 = O00000000(o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
            float var6 = O000000000000(O000000000(this.O000000000OO00 / 0.82F, 0.0F, 1.0F));
            var2.O0000000000();
            var2.O00000000(
               this.O000000000O00 - 15.0F * var5,
               this.O000000000O000 - 5.0F * var5,
               this.O000000000O00O + 30.0F * var5,
               this.O000000000O0O + 10.0F * var5,
               0.0F,
               0.0F,
               0.0F,
               0.0F
            );
            O00000OO0OOO00.W254 var7 = null;

            for (O00000OO0OOO00.W247 var9 : this.O0000000000O) {
               if (!var9.O00000000O00 && var9.O00000000O000 && var9.O000000000OOO > 0.002F) {
                  O00000OO0OOO00.W254 var10 = this.O00000000(var2, var9, var5);
                  if (var10 != null) {
                     var7 = var10;
                  }
               }
            }

            var2.O0000000000();
            var2.O0000000000000();
            if (this.O00000000OOOO0) {
               float var22 = O000000000000(O000000000(this.O000000000OO00 / 0.82F, 0.0F, 1.0F));
               var2.O00000000(
                  this.O00000000OO0OO,
                  this.O00000000OOO,
                  this.O00000000OOO0,
                  this.O00000000OOO00,
                  this.O00000000OOO0 * 0.5F,
                  this.O00000000O0OO0 ? O00000000(0.0F, 0.0F, 0.0F, 0.045F * var22) : O00000000(1.0F, 1.0F, 1.0F, 0.05F * var22)
               );
               int var25 = O00000000(this.O00000000O0O0O, this.O00000000O0O00, 0.5F, (this.O00000000OO0O ? 0.75F : 0.45F) * var22);
               var2.O00000000(this.O00000000OO0OO, this.O00000000OOO0O, this.O00000000OOO0, this.O00000000OOOO, this.O00000000OOO0 * 0.5F, var25);
            }

            this.O00000000(var2, this.O0000000000OO0, var5);

            for (O00000OO0OOO00.W250 var26 : this.O0000000000OO) {
               this.O00000000(var2, var26, var5);
            }

            float var24 = o000000000O.framebufferWidth() * 0.5F + o000000000O.uiParallaxX() * 0.12F;
            float var27 = o000000000O.framebufferHeight() * 0.126F + o000000000O.uiParallaxY() * 0.08F;
            var2.O00000000(FontRegistry.O00000000000, var24, var27, 40.0F * var5, "Alt Manager", this.O000000000(0.94F * var6), "c");
            var2.O00000000(
               FontRegistry.O00000000,
               var24,
               var27 + 30.0F * var5,
               24.0F * var5,
               this.O00000000OO0 + "  /  " + this.O000000000OOO0(),
               this.O0000000000(0.5F * var6),
               "c"
            );
            if (var7 != null) {
               try {
                  this.O00000000(var2, var7, var5, o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
               } catch (Throwable var19) {
               }
            }
         } finally {
            if (var4) {
               try {
                  var2.O000000000();
               } catch (Throwable var18) {
               }
            }

            O0000O00O0OOO0.O00000000(var3);
         }
      } catch (Throwable var21) {
      }
   }

   private O00000OO0OOO00.W254 O00000000(RenderManager o0000O00OO0O0, O00000OO0OOO00.W247 o00000000, float f) {
      float var4 = o00000000.O000000000OOO;
      float var5 = 0.5F + 0.5F * (float)Math.sin(this.O000000000OO00 * (o00000000.O00000000O ? 1.25F : 0.86F) + o00000000.O000000000.hashCode() * 0.01F);
      float var6 = O00000000000(Math.min(o00000000.O000000000O0 * 0.64F, 56.0F * f));
      float var7 = o00000000.O0000000000OO0 + 25.0F * f;
      float var8 = o00000000.O0000000000OOO + o00000000.O000000000O0 * 0.5F - var6 * 0.5F;
      this.O00000000(o0000O00OO0O0, o00000000, var7, O00000000000(var8), var6, var4, var5, f);
      float var9 = var7 + var6 + 18.0F * f;
      O00000OO0OOO00.W262 var10 = O00000OO0OOO00.W255.O00000000(o00000000.O00000000, o00000000.O000000000);
      float var12 = o00000000.O0000000000OO0 + o00000000.O000000000O - 25.0F * f - var6;
      float var13 = O00000000000(var8);
      float var14 = Math.max(88.0F * f, o00000000.O000000000O - (var9 - o00000000.O0000000000OO0) - 24.0F * f);
      if (var10 != null) {
         var14 = Math.max(54.0F * f, var12 - var9 - 14.0F * f);
      }

      float var15 = 25.0F * f;
      String var16 = O00000000(o00000000.O000000000, var14, var15, FontRegistry.O00000000000);
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000,
         var9,
         o00000000.O0000000000OOO + o00000000.O000000000O0 * 0.38F,
         var15,
         var16,
         this.O000000000((0.88F + o00000000.O000000000O00O * 0.08F) * var4)
      );
      O00000OO0OOO00.W254 var17 = null;
      if (var10 != null) {
         var17 = this.O00000000(o0000O00OO0O0, o00000000, var10, var12, var13, var6, f, var4);
      }

      String var18 = o00000000.O00000000O ? "Active session" : (o00000000.O000000000OOOO ? "Offline / Selected" : "Offline identity");
      float var19 = 18.0F * f;
      float var20 = RenderManager.O00000000(FontRegistry.O00000000, var18, var19).O00000000;
      float var21 = 22.0F * f;
      float var22 = 6.0F * f;
      float var23 = var20 + var22 + 18.0F * f;
      float var24 = o00000000.O0000000000OOO + o00000000.O000000000O0 * 0.56F;
      int var25 = o00000000.O00000000O
         ? O00000000(0.2F, 1.0F, 0.4F, 0.12F * var4)
         : (
            this.O00000000O0OO0
               ? O00000000(0.0F, 0.0F, 0.0F, (o00000000.O000000000OOOO ? 0.05F : 0.025F) * var4)
               : O00000000(1.0F, 1.0F, 1.0F, (o00000000.O000000000OOOO ? 0.08F : 0.035F) * var4)
         );
      int var26 = o00000000.O00000000O
         ? O00000000(this.O00000000O0O0O, this.O00000000O0O00, var5, var4)
         : (
            this.O00000000O0OO0
               ? O00000000(0.1F, 0.1F, 0.1F, (o00000000.O000000000OOOO ? 0.66F : 0.3F) * var4)
               : O00000000(1.0F, 1.0F, 1.0F, (o00000000.O000000000OOOO ? 0.7F : 0.25F) * var4)
         );
      int var27 = o00000000.O00000000O
         ? O00000000(0.28F, 0.62F, 0.34F, (0.8F + o00000000.O000000000O00O * 0.2F) * var4)
         : (
            this.O00000000O0OO0
               ? O00000000(0.23F, 0.23F, 0.23F, (o00000000.O000000000OOOO ? 0.82F : 0.52F) * var4)
               : O00000000(1.0F, 1.0F, 1.0F, (o00000000.O000000000OOOO ? 0.85F : 0.45F) * var4)
         );
      o0000O00OO0O0.O00000000(var9, var24, var23, var21, var21 * 0.5F, var25);
      o0000O00OO0O0.O00000000(var9 + 7.0F * f, var24 + var21 * 0.5F - var22 * 0.5F, var22, var22, var22 * 0.5F, var26);
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var9 + var22 + 12.0F * f, var24 + var21 * 0.61F, var19, var18, var27);
      return var17;
   }

   private O00000OO0OOO00.W254 O00000000(
      RenderManager o0000O00OO0O0, O00000OO0OOO00.W247 o00000000, O00000OO0OOO00.W262 o00000000000OO, float f, float g, float h, float i, float j
   ) {
      boolean var9 = this.O000000000OO0O >= f && this.O000000000OO0O <= f + h && this.O000000000OOO >= g && this.O000000000OOO <= g + h;
      float var10 = var9 ? 1.0F : Math.max(o00000000.O000000000O000 * 0.35F, o00000000.O000000000OOOO ? 0.18F : 0.0F);
      float var11 = h * 0.32F;
      int var12 = this.O00000000O0OO0 ? O00000000(1.0F, 1.0F, 1.0F, (0.3F + var10 * 0.12F) * j) : O00000000(1.0F, 1.0F, 1.0F, (0.055F + var10 * 0.06F) * j);
      int var13 = this.O00000000O0OO0 ? O00000000(0.0F, 0.0F, 0.0F, (0.045F + var10 * 0.05F) * j) : O00000000(0.0F, 0.0F, 0.0F, (0.18F + var10 * 0.08F) * j);
      int var14 = O00000000(this.O00000000O0O0O, this.O00000000O0O00, 0.45F + var10 * 0.25F, (0.18F + var10 * 0.26F) * j);
      int var15 = O00000000(this.O00000000O0O0O, this.O00000000O0O00, 0.35F + o00000000.O000000000O00O * 0.25F, (0.72F + var10 * 0.2F) * j);
      int var16 = this.O00000000O0OO0 ? O00000000(0.08F, 0.1F, 0.12F, (0.38F + var10 * 0.24F) * j) : O00000000(1.0F, 1.0F, 1.0F, (0.3F + var10 * 0.26F) * j);
      o0000O00OO0O0.O00000000(f, g, h, h, var11, var12, var12, var13, var13);
      o0000O00OO0O0.O00000000(f, g, h, h, var11, var14, Math.max(0.7F, 1.0F * i));
      O00000OO0OOO00.W251 var17 = this.O00000000(o00000000000OO);
      int var18 = var17 == null ? 0 : var17.O00000000();
      if (var18 > 0) {
         o0000O00OO0O0.O00000000(var18, f + 2.0F * i, g + 2.0F * i, h - 4.0F * i, h - 4.0F * i, 0.0F, 0.0F, 1.0F, 1.0F, h * 0.24F);
         o0000O00OO0O0.O00000000(f, g, h, h, var11, O00000000(1.0F, 1.0F, 1.0F, (0.03F + var10 * 0.03F) * j));
      } else {
         float var19 = f + h * 0.27F;
         float var20 = g + h * 0.27F;
         float var21 = h * 0.46F;
         float var22 = h * 0.13F;
         float var23 = h * 0.075F;

         for (int var24 = 0; var24 < 3; var24++) {
            float var25 = var20 + var24 * (var22 + var23);
            o0000O00OO0O0.O00000000(var19, var25, var21, var22, var22 * 0.5F, var24 == 1 ? var16 : var15);
            o0000O00OO0O0.O00000000(
               var19 + var21 - var22 * 0.75F,
               var25 + var22 * 0.3F,
               var22 * 0.4F,
               var22 * 0.4F,
               var22 * 0.2F,
               this.O00000000O0OO0 ? O00000000(1.0F, 1.0F, 1.0F, 0.62F * j) : O00000000(0.0F, 0.0F, 0.0F, 0.35F * j)
            );
         }
      }

      return var9 ? new O00000OO0OOO00.W254(o00000000000OO, f + h * 0.5F, g, j) : null;
   }

   private void O00000000(RenderManager o0000O00OO0O0, O00000OO0OOO00.W254 o00000000000O, float f, float g, float h) {
      String var6 = O00000000(O00000000000O0(o00000000000O.server.displayName()), 190.0F * f, 17.0F * f, FontRegistry.O00000000000);
      String var7 = "IP: " + O00000000(O00000000000O0(o00000000000O.server.address()), 190.0F * f, 15.0F * f, FontRegistry.O00000000);
      String var8 = "Active session: " + O000000000(o00000000000O.server.totalMs());
      float var9 = 17.0F * f;
      float var10 = 15.0F * f;
      float var11 = 12.0F * f;
      float var12 = 9.0F * f;
      float var13 = 4.0F * f;
      float var14 = RenderManager.O00000000(FontRegistry.O00000000000, var6, var9).O00000000;
      float var15 = RenderManager.O00000000(FontRegistry.O00000000, var7, var10).O00000000;
      float var16 = RenderManager.O00000000(FontRegistry.O00000000, var8, var10).O00000000;
      float var17 = Math.max(var14, Math.max(var15, var16)) + var11 * 2.0F;
      float var18 = var12 * 2.0F + var9 + var13 + var10 + var13 + var10 * 0.92F;
      float var19 = O000000000(o00000000000O.centerX() - var17 * 0.5F, 8.0F * f, g - var17 - 8.0F * f);
      float var20 = o00000000000O.topY() - var18 - 10.0F * f;
      if (var20 < 8.0F * f) {
         var20 = o00000000000O.topY() + 30.0F * f;
      }

      var20 = O000000000(var20, 8.0F * f, h - var18 - 8.0F * f);
      float var21 = o00000000000O.alpha();
      float var22 = 10.0F * f;
      o0000O00OO0O0.O00000000(
         var19, var20, var17, var18, var22, this.O00000000O0OO0 ? O00000000(1.0F, 1.0F, 1.0F, 0.88F * var21) : O00000000(0.02F, 0.025F, 0.035F, 0.86F * var21)
      );
      o0000O00OO0O0.O00000000(
         var19, var20, var17, var18, var22, O00000000(this.O00000000O0O0O, this.O00000000O0O00, 0.48F, 0.24F * var21), Math.max(0.7F, 1.0F * f)
      );
      o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var19 + var11, var20 + var12 + var9 * 0.73F, var9, var6, this.O000000000(0.92F * var21));
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var19 + var11, var20 + var12 + var9 + var13 + var10 * 0.75F, var10, var7, this.O0000000000(0.76F * var21));
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000, var19 + var11, var20 + var12 + var9 + var13 + var10 + var13 + var10 * 0.75F, var10, var8, this.O0000000000(0.7F * var21)
      );
   }

   private O00000OO0OOO00.W251 O00000000(O00000OO0OOO00.W262 o00000000000OO) {
      byte[] var2 = o00000000000OO == null ? null : o00000000000OO.favicon();
      if (var2 != null && var2.length != 0) {
         String var3 = o00000000000OO.address() + ":" + Arrays.hashCode(var2);
         O00000OO0OOO00.W251 var4 = this.O0000000000O00.get(var3);
         if (var4 != null) {
            return var4;
         } else {
            try {
               NativeImage var5 = NativeImage.read(var2);
               NativeImageBackedTexture var6 = new NativeImageBackedTexture(() -> "wild_alt_server_icon", var5);
               var6.setFilter(true, false);
               var6.upload();
               O00000OO0OOO00.W251 var7 = new O00000OO0OOO00.W251(var6);
               this.O0000000000O00.put(var3, var7);
               return var7;
            } catch (Throwable var8) {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private void O000000000OO0O() {
      for (O00000OO0OOO00.W251 var2 : this.O0000000000O00.values()) {
         var2.close();
      }

      this.O0000000000O00.clear();
   }

   private void O00000000(RenderManager o0000O00OO0O0, O00000OO0OOO00.W252 o0000000000000, float f) {
      float var4 = o0000000000000.O000000000O0;
      String var5 = o0000000000000.O000000000O00 ? "*".repeat(o0000000000000.O000000000O000.length()) : o0000000000000.O000000000O000;
      boolean var6 = var5.isBlank();
      float var7 = 22.0F * f;
      float var8 = o0000000000000.O000000000000 + var7;
      float var9 = Math.max(8.0F * f, o0000000000000.O000000000000O - var7 * 2.0F);
      float var10 = 18.0F * f;
      boolean var11 = var6 && !o0000000000000.O000000000O0O;
      String var12 = var11 ? o0000000000000.O00000000 : var5;
      int var13 = var11 ? this.O0000000000(0.42F * var4) : this.O000000000((0.78F + o0000000000000.O000000000O0OO * 0.18F) * var4);
      o0000O00OO0O0.O00000000(
         var8,
         o0000000000000.O0000000000000 + 3.0F * f,
         var9,
         o0000000000000.O00000000000O - 6.0F * f,
         o0000000000000.O00000000000O0 * 0.55F,
         o0000000000000.O00000000000O0 * 0.55F,
         o0000000000000.O00000000000O0 * 0.55F,
         o0000000000000.O00000000000O0 * 0.55F
      );
      if (!var12.isBlank()) {
         if (var11) {
            O00000000(
               o0000O00OO0O0,
               FontRegistry.O00000000,
               o0000000000000.O000000000000,
               o0000000000000.O0000000000000,
               o0000000000000.O000000000000O,
               o0000000000000.O00000000000O,
               var10,
               var12,
               var13
            );
         } else {
            float var14 = O00000000(FontRegistry.O00000000, var10, o0000000000000.O0000000000000, o0000000000000.O00000000000O);
            if (o0000000000000.O000000000O0O0) {
               float var15 = RenderManager.O00000000(FontRegistry.O00000000, var12, var10).O00000000;
               o0000O00OO0O0.O00000000(
                  O00000000000(var8 - o0000000000000.O000000000OO0 - 2.0F * f),
                  o0000000000000.O0000000000000 + o0000000000000.O00000000000O * 0.25F,
                  var15 + 4.0F * f,
                  o0000000000000.O00000000000O * 0.5F,
                  2.0F * f,
                  O00000000(0.25F, 0.55F, 0.95F, 0.45F * var4)
               );
            }

            o0000O00OO0O0.O00000000(FontRegistry.O00000000, O00000000000(var8 - o0000000000000.O000000000OO0), O00000000000(var14), var10, var12, var13);
         }
      }

      if (o0000000000000.O000000000O0O) {
         String var23 = var5.substring(0, O00000000(o0000000000000.O000000000O00O, 0, var5.length()));
         float var24 = RenderManager.O00000000(FontRegistry.O00000000, var23, var10).O00000000;
         if (o0000000000000.O000000000O0O0) {
            var24 = RenderManager.O00000000(FontRegistry.O00000000, var5, var10).O00000000;
         }

         float var16 = o0000000000000.O000000000OO0;
         float var17 = var9 - 9.0F * f;
         if (var24 - var16 > var17) {
            var16 = var24 - var17;
         }

         if (var24 - var16 < 0.0F) {
            var16 = var24;
         }

         var16 = Math.max(0.0F, var16);
         o0000000000000.O000000000OO0 = o0000000000000.O000000000OO0 + (var16 - o0000000000000.O000000000OO0) * 0.3F;
         o0000000000000.O000000000OO = o0000000000000.O000000000OO + (var24 - o0000000000000.O000000000OO) * 0.3F;
         float var18 = 0.54F + 0.46F * (float)Math.sin(this.O000000000OO00 * 5.4F);
         if (!o0000000000000.O000000000O0O0) {
            int var19 = O00000000(this.O00000000O0O0O, this.O00000000O0O00, var18, (0.42F + var18 * 0.36F) * var4);
            float var20 = var8 + o0000000000000.O000000000OO - o0000000000000.O000000000OO0 + 2.0F * f;
            float var21 = 20.0F * f;
            float var22 = o0000000000000.O0000000000000 + (o0000000000000.O00000000000O - var21) * 0.5F;
            o0000O00OO0O0.O00000000(O00000000000(var20), O00000000000(var22), Math.max(1.25F * f, 1.0F), var21, 1.0F * f, var19);
         }

         o0000O00OO0O0.O00000000(
            o0000000000000.O000000000000,
            o0000000000000.O0000000000000,
            o0000000000000.O000000000000O,
            o0000000000000.O00000000000O,
            o0000000000000.O00000000000O0,
            O00000000(this.O00000000O0O0O, this.O00000000O0O00, var18, 0.24F * var4 * (0.35F + o0000000000000.O000000000O0OO * 0.65F)),
            1.0F * f
         );
      }

      o0000O00OO0O0.O0000000000000();
   }

   private void O00000000(RenderManager o0000O00OO0O0, O00000OO0OOO00.W250 o00000000000, float f) {
      float var4 = o00000000000.O000000000O0 * (o00000000000.O000000000O000 ? 0.92F : 0.28F);
      String var5 = O00000000(o00000000000.O00000000, o00000000000.O000000000000O - 20.0F * f, 18.0F * f, FontRegistry.O00000000);
      O00000000(
         o0000O00OO0O0,
         FontRegistry.O00000000,
         o00000000000.O000000000000,
         o00000000000.O0000000000000,
         o00000000000.O000000000000O,
         o00000000000.O00000000000O,
         18.0F * f,
         var5,
         this.O000000000(var4)
      );
   }

   private void O00000000(RenderManager o0000O00OO0O0, O00000OO0OOO00.W247 o00000000, float f, float g, float h, float i) {
      float var7 = h * 0.34F;

      try {
         MinecraftClient var8 = this.client == null ? MinecraftClient.getInstance() : this.client;
         Identifier var9 = this.O00000000(var8, o00000000);
         AbstractTexture var10 = var8.getTextureManager().getTexture(var9);
         if (var10 != null && var10.getGlTexture() instanceof GlTexture var11 && var11.getGlId() > 0) {
            int var14 = var11.getGlId();
            if (o00000000.O0000000000O != var14) {
               var10.setFilter(false, false);
               GL11.glBindTexture(3553, var14);
               GL11.glTexParameteri(3553, 10241, 9728);
               GL11.glTexParameteri(3553, 10240, 9728);
               o00000000.O0000000000O = var14;
            }

            o0000O00OO0O0.O000000000000(i);
            o0000O00OO0O0.O00000000(var14, O00000000000(f), O00000000000(g), O00000000000(h), O00000000000(h), 0.125F, 0.125F, 0.25F, 0.25F, var7);
            o0000O00OO0O0.O00000000(var14, O00000000000(f), O00000000000(g), O00000000000(h), O00000000000(h), 0.625F, 0.125F, 0.75F, 0.25F, var7);
            o0000O00OO0O0.O00000000000OO();
            return;
         }
      } catch (Throwable var13) {
      }

      o0000O00OO0O0.O00000000(f, g, h, h, var7, this.O00000000O0OO0 ? O00000000(1.0F, 1.0F, 1.0F, 0.74F * i) : O00000000(0.05F, 0.06F, 0.075F, 0.78F * i));
      O00000000(o0000O00OO0O0, FontRegistry.O00000000000, f, g, h, h, h * 0.52F, o00000000.O0000000000000, this.O000000000(0.72F * i));
   }

   private void O00000000(RenderManager o0000O00OO0O0, O00000OO0OOO00.W247 o00000000, float f, float g, float h, float i, float j, float k) {
      float var9 = h * 0.34F;
      int var10 = this.O000000000(o00000000, j, i);
      o0000O00OO0O0.O00000000(f, g, h, h, var9, var10);
      this.O00000000(o0000O00OO0O0, o00000000, f, g, h, i);
      o0000O00OO0O0.O00000000(
         f,
         g,
         h,
         h,
         var9,
         O00000000(1.0F, 1.0F, 1.0F, 0.1F * i),
         O00000000(1.0F, 1.0F, 1.0F, 0.035F * i),
         O00000000(0.0F, 0.0F, 0.0F, 0.04F * i),
         O00000000(0.0F, 0.0F, 0.0F, 0.02F * i)
      );
      o0000O00OO0O0.O00000000(f, g, h, h, var9, this.O00000000O0OO0 ? O00000000(1.0F, 1.0F, 1.0F, 0.58F * i) : O00000000(1.0F, 1.0F, 1.0F, 0.16F * i), 1.0F * k);
   }

   private int O000000000(O00000OO0OOO00.W247 o00000000, float f, float g) {
      float var4 = (o00000000.O00000000O ? 0.24F : 0.12F) + o00000000.O000000000O00O * 0.1F + f * 0.05F;
      if (o00000000.O00000000O) {
         return O00000000(this.O00000000O0O0O, this.O00000000O0O00, f, var4 * g);
      } else {
         return this.O00000000O0OO0 ? O00000000(0.0F, 0.0F, 0.0F, var4 * 0.26F * g) : O00000000(0.48F, 0.58F, 0.7F, var4 * 0.72F * g);
      }
   }

   private int O000000000(float f) {
      return this.O00000000O0OO0 ? O00000000(0.1F, 0.1F, 0.1F, f) : O00000000(1.0F, 1.0F, 1.0F, f);
   }

   private int O0000000000(float f) {
      return this.O00000000O0OO0 ? O00000000(0.4F, 0.4F, 0.4F, f) : O00000000(0.8F, 0.86F, 0.9F, f);
   }

   private static void O00000000(RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, float f, float g, float h, float i, float j, String string, int k) {
      String var9 = string == null ? "" : string;
      float var10 = RenderManager.O00000000(o0000O0O00O00O, var9, j).O00000000;
      float var11 = O00000000000(f + (h - var10) * 0.5F);
      float var12 = O00000000000(O00000000(o0000O0O00O00O, j, g, i));
      o0000O00OO0O0.O00000000(o0000O0O00O00O, var11, var12, j, var9, k);
   }

   private boolean O000000000(O00000OO0OOO00.W249 o0000000000) {
      return switch (o0000000000) {
         case USE, DELETE -> this.O000000000O0O0() != null;
         case ADD_CRACKED -> !O00000000000O(this.O0000000000OO0.O000000000O000).isBlank();
         case RANDOM -> true;
         case EDIT -> this.O0000000000OOO();
         case BACK -> true;
      };
   }

   private Identifier O00000000(MinecraftClient minecraftClient, O00000OO0OOO00.W247 o00000000) {
      if (!o00000000.O0000000000O0) {
         o00000000.O00000000000OO = minecraftClient.getSkinProvider().getSkinTextures(o00000000.O000000000000).texture();
         o00000000.O0000000000O0 = true;
      }

      return o00000000.O00000000000OO;
   }

   private boolean O00000000(O00000OO0OOO00.W247 o00000000, String string) {
      return !string.isBlank() && string.equalsIgnoreCase(o00000000.O000000000);
   }

   private String O000000000OOO() {
      MinecraftClient var1 = this.client == null ? MinecraftClient.getInstance() : this.client;
      return var1 != null && var1.getSession() != null ? var1.getSession().getUsername() : "";
   }

   private String O000000000OOO0() {
      MinecraftClient var1 = this.client == null ? MinecraftClient.getInstance() : this.client;
      return var1 != null && var1.getSession() != null ? "Active: " + var1.getSession().getUsername() : "No active session";
   }

   private void O000000000(int i) {
      if (this.O00000000O() == 0) {
         this.O00000000O0OOO = -1;
         this.O00000000OO0 = "No identities";
      } else {
         int var2 = this.O00000000O0OOO < 0 ? (i >= 0 ? -1 : this.O0000000000O.size()) : this.O00000000O0OOO;

         for (int var3 = 0; var3 < this.O0000000000O.size(); var3++) {
            var2 = O00000000(var2 + i, 0, this.O0000000000O.size() - 1);
            O00000OO0OOO00.W247 var4 = this.O0000000000O.get(var2);
            if (!var4.O00000000O00 && !var4.O00000000O0) {
               this.O00000000O0OOO = var2;
               var4.O000000000O0O0 = Math.max(var4.O000000000O0O0, 0.24F);
               this.O00000000OO0 = "Selected identity: " + var4.O000000000;
               this.O000000000OOOO();
               this.O000000000();
               return;
            }

            if (i > 0 && var2 == this.O0000000000O.size() - 1 || i < 0 && var2 == 0) {
               return;
            }
         }
      }
   }

   private void O000000000OOOO() {
      if (this.O00000000O0OOO >= 0 && this.O00000000O0OOO < this.O0000000000O.size()) {
         O00000OO0OOO00.W247 var1 = this.O0000000000O.get(this.O00000000O0OOO);
         if (!var1.O00000000O00 && !var1.O00000000O0) {
            int var2 = this.O0000000000(this.O00000000O0OOO);
            int var3 = (int)Math.floor(this.O00000000OO000);
            int var4 = var3 + this.O00000000OO - 1;
            if (var2 < var3 || var2 > var4) {
               if (var2 < this.O00000000OO000) {
                  this.O00000000OO000 = var2;
               }

               if (var2 > this.O00000000OO000 + this.O00000000OO - 1.0F) {
                  this.O00000000OO000 = var2 - this.O00000000OO + 1;
               }

               int var5 = Math.max(0, this.O00000000O() - Math.max(1, this.O00000000OO));
               this.O00000000OO000 = O000000000(this.O00000000OO000, 0.0F, (float)var5);
            }
         }
      }
   }

   private int O00000000O() {
      int var1 = 0;

      for (O00000OO0OOO00.W247 var3 : this.O0000000000O) {
         if (!var3.O00000000O0 && !var3.O00000000O00) {
            var1++;
         }
      }

      return var1;
   }

   private int O0000000000(int i) {
      int var2 = 0;

      for (int var3 = 0; var3 < i; var3++) {
         if (!this.O0000000000O.get(var3).O00000000O0) {
            var2++;
         }
      }

      return var2;
   }

   private float O00000000(Window window, double d) {
      return (float)(d * window.getFramebufferWidth() / Math.max(1.0, (double)window.getScaledWidth()));
   }

   private float O000000000(Window window, double d) {
      return (float)(d * window.getFramebufferHeight() / Math.max(1.0, (double)window.getScaledHeight()));
   }

   static String O00000000000O(String string) {
      if (string == null) {
         return "";
      } else {
         String var1 = string.trim();
         int var2 = var1.indexOf(64);
         if (var2 > 0) {
            var1 = var1.substring(0, var2);
         }

         var1 = var1.replaceAll("[^A-Za-z0-9_]", "");
         if (var1.length() > 16) {
            var1 = var1.substring(0, 16);
         }

         return var1;
      }
   }

   private void O00000000(Session session, boolean bl) {
      if (session != null) {
         String var3 = O00000000000O(session.getUsername());
         if (!var3.isBlank()) {
            for (O00000OO0OOO00.W247 var5 : this.O0000000000O) {
               if (!var5.O00000000O00 && !var5.O00000000O0 && var5.O000000000.equalsIgnoreCase(var3)) {
                  return;
               }
            }

            O00000OO0OOO00.W248 var7 = session.getAccountType() == AccountType.LEGACY ? O00000OO0OOO00.W248.CRACKED : O00000OO0OOO00.W248.PREMIUM;
            long var8 = System.currentTimeMillis();
            this.O0000000000O.add(0, new O00000OO0OOO00.W247(var3, var7, bl, this.O000000000OO00, O00000000(var3, var7), var8, var8));
         }
      }
   }

   static String O00000000(String string, O00000OO0OOO00.W248 o000000000) {
      return UUID.nameUUIDFromBytes(("wild-alt-vault:" + o000000000.name() + ":" + string.toLowerCase(Locale.ROOT)).getBytes(StandardCharsets.UTF_8))
         .toString();
   }

   private static float O00000000(FontObject o0000O0O00O00O, float f, float g, float h) {
      try {
         return g + h * 0.5F + FontRegistry.O00000000(o0000O0O00O00O, 72, f * 0.5F);
      } catch (Throwable var5) {
         return g + h * 0.5F + f * 0.18F;
      }
   }

   private static float O00000000000(float f) {
      return Math.round(f);
   }

   private static String O00000000000O0(String string) {
      if (string != null && !string.isEmpty()) {
         StringBuilder var1 = new StringBuilder(string.length());

         for (int var2 = 0; var2 < string.length(); var2++) {
            char var3 = string.charAt(var2);
            if (var3 == 167) {
               var2++;
            } else if (var3 == '&' && var2 + 1 < string.length() && O00000000(string.charAt(var2 + 1))) {
               var2++;
            } else if (!Character.isISOControl(var3)) {
               var1.append(var3);
            }
         }

         return var1.toString().trim();
      } else {
         return "";
      }
   }

   private static boolean O00000000(char c) {
      return c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F' || c >= 'k' && c <= 'o' || c >= 'K' && c <= 'O' || c == 'r' || c == 'R';
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

   private static String O000000000(long l) {
      long var2 = Math.max(0L, l / 1000L);
      long var4 = var2 / 3600L;
      long var6 = var2 % 3600L / 60L;
      long var8 = var2 % 60L;
      if (var4 > 0L) {
         return var6 > 0L ? var4 + "h " + var6 + "m" : var4 + "h";
      } else if (var6 <= 0L) {
         return Math.max(1L, var8) + "s";
      } else {
         return var8 > 0L && var6 < 10L ? var6 + "m " + var8 + "s" : var6 + "m";
      }
   }

   private static float O00000000(float f, float g) {
      return O000000000(Math.min(f / 1920.0F, g / 1080.0F) * 1.16F, 0.72F, 1.38F);
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

   private static float O000000000000(float f) {
      float var1 = O000000000(f, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   private static float O000000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   static int O00000000(int i, int j, int k) {
      return Math.max(j, Math.min(k, i));
   }

   private static float O00000000000(int i) {
      return (i >> 16 & 0xFF) / 255.0F;
   }

   private static float O000000000000(int i) {
      return (i >> 8 & 0xFF) / 255.0F;
   }

   private static float O0000000000000(int i) {
      return (i & 0xFF) / 255.0F;
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

   static final class W247 {
      final String O00000000;
      final String O000000000;
      final O00000OO0OOO00.W248 O0000000000;
      final boolean O00000000000;
      final GameProfile O000000000000;
      final String O0000000000000;
      final O00000OOO00 O000000000000O = new O00000OOO00(O0000O000O0O00.O000000000000());
      final long O00000000000O;
      long O00000000000O0;
      Identifier O00000000000OO;
      int O0000000000O;
      boolean O0000000000O0;
      float O0000000000O00;
      float O0000000000O0O;
      float O0000000000OO;
      float O0000000000OO0;
      float O0000000000OOO;
      float O000000000O;
      float O000000000O0;
      float O000000000O00;
      float O000000000O000;
      float O000000000O00O;
      float O000000000O0O;
      float O000000000O0O0;
      float O000000000O0OO = 1.0F;
      float O000000000OO = 0.5F;
      float O000000000OO0 = 0.5F;
      float O000000000OO00;
      float O000000000OO0O;
      float O000000000OOO;
      float O000000000OOO0;
      boolean O000000000OOOO;
      boolean O00000000O;
      boolean O00000000O0;
      boolean O00000000O00;
      boolean O00000000O000 = true;

      W247(String string, O00000OO0OOO00.W248 o000000000, boolean bl, float f, String string2, long l, long m) {
         this.O00000000 = string2;
         this.O000000000 = string;
         this.O0000000000 = o000000000;
         this.O00000000000 = bl;
         this.O00000000000O = l;
         this.O00000000000O0 = m;
         this.O0000000000O00 = f;
         this.O000000000000 = new GameProfile(UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes(StandardCharsets.UTF_8)), string);
         this.O0000000000000 = string.isBlank() ? "?" : string.substring(0, 1).toUpperCase(Locale.ROOT);
         this.O000000000000O.O00000000(1.0F);
      }

      boolean O00000000(float f, float g) {
         return O00000OO0OOO00.O00000000(f, g, this.O0000000000O0O, this.O0000000000OO, this.O000000000O, this.O000000000O0, this.O000000000O00) <= 0.0F;
      }
   }

   static enum W248 {
      PREMIUM,
      CRACKED;

      static O00000OO0OOO00.W248 O00000000(String string) {
         if (string == null) {
            return CRACKED;
         } else {
            try {
               return valueOf(string.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException var2) {
               return CRACKED;
            }
         }
      }
   }

   static enum W249 {
      USE,
      ADD_CRACKED,
      RANDOM,
      EDIT,
      DELETE,
      BACK;
   }

   static final class W250 extends O00000OO0OOO00.W253 {
      final O00000OO0OOO00.W249 O000000000O00;
      boolean O000000000O000 = true;

      W250(String string, O00000OO0OOO00.W249 o0000000000) {
         super(string);
         this.O000000000O00 = o0000000000;
      }
   }

   static final class W251 implements AutoCloseable {
      private final NativeImageBackedTexture O00000000;

      W251(NativeImageBackedTexture nativeImageBackedTexture) {
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

   static final class W252 extends O00000OO0OOO00.W253 {
      final boolean O000000000O00;
      String O000000000O000 = "";
      int O000000000O00O;
      boolean O000000000O0O;
      boolean O000000000O0O0;
      float O000000000O0OO;
      float O000000000OO;
      float O000000000OO0;

      W252(String string, boolean bl) {
         super(string);
         this.O000000000O00 = bl;
      }

      void O00000000(String string) {
         if (this.O000000000O0O0) {
            this.O000000000O000 = "";
            this.O000000000O00O = 0;
            this.O000000000O0O0 = false;
         }

         String var2 = string.replaceAll("[^A-Za-z0-9_]", "");
         if (!var2.isEmpty()) {
            int var3 = 16 - this.O000000000O000.length();
            if (var3 > 0) {
               if (var2.length() > var3) {
                  var2 = var2.substring(0, var3);
               }

               this.O000000000O000 = this.O000000000O000.substring(0, this.O000000000O00O) + var2 + this.O000000000O000.substring(this.O000000000O00O);
               this.O000000000O00O = this.O000000000O00O + var2.length();
            }
         }
      }

      void O00000000(char c) {
         this.O00000000(String.valueOf(c));
      }

      void O000000000() {
         if (this.O000000000O0O0) {
            this.O0000000000();
         } else if (this.O000000000O00O > 0 && !this.O000000000O000.isEmpty()) {
            this.O000000000O000 = this.O000000000O000.substring(0, this.O000000000O00O - 1) + this.O000000000O000.substring(this.O000000000O00O);
            this.O000000000O00O--;
         }
      }

      void O0000000000() {
         this.O000000000O000 = "";
         this.O000000000O00O = 0;
         this.O000000000OO = this.O000000000OO0 = 0.0F;
         this.O000000000O0O0 = false;
      }

      void O00000000000() {
         this.O00000000();
         this.O000000000O0O = false;
         this.O000000000O0O0 = false;
         this.O000000000O0OO = this.O000000000OO0 = 0.0F;
         this.O000000000O00O = O00000OO0OOO00.O00000000(this.O000000000O00O, 0, this.O000000000O000.length());
      }
   }

   static class W253 {
      protected String O00000000;
      protected final O00000OOO00 O000000000 = new O00000OOO00(O0000O000O0O00.O000000000000());
      protected float O0000000000;
      protected float O00000000000;
      protected float O000000000000;
      protected float O0000000000000;
      protected float O000000000000O;
      protected float O00000000000O;
      protected float O00000000000O0;
      protected float O00000000000OO;
      protected float O0000000000O;
      protected float O0000000000O0;
      protected float O0000000000O00;
      protected float O0000000000O0O = 1.0F;
      protected float O0000000000OO = 0.5F;
      protected float O0000000000OO0 = 0.5F;
      protected float O0000000000OOO;
      protected float O000000000O;
      protected float O000000000O0;

      protected W253(String string) {
         this.O00000000 = string;
      }

      protected boolean O00000000(float f, float g) {
         return O00000OO0OOO00.O00000000(f, g, this.O0000000000, this.O00000000000, this.O000000000000O, this.O00000000000O, this.O00000000000O0) <= 0.0F;
      }

      protected void O00000000() {
         this.O00000000000OO = this.O0000000000O = this.O0000000000O0 = this.O0000000000O00 = this.O0000000000OOO = this.O000000000O0 = 0.0F;
         this.O0000000000O0O = 1.0F;
         this.O0000000000OO = this.O0000000000OO0 = 0.5F;
         this.O000000000.O00000000(1.0F);
      }
   }

   record W254(O00000OO0OOO00.W262 server, float centerX, float topY, float alpha) {
   }

   static final class W255 {
      private static final Gson O00000000 = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
      private static final long O000000000 = 10000L;
      private static final long O0000000000 = 60000L;
      private static final Map<String, O00000OO0OOO00$W256$W257> O00000000000 = new HashMap<>();
      private static final Map<String, byte[]> O000000000000 = new HashMap<>();
      private static boolean O0000000000000;
      private static boolean O000000000000O;
      private static boolean O00000000000O;
      private static String O00000000000O0 = "";
      private static String O00000000000OO = "";
      private static long O0000000000O;
      private static long O0000000000O0;

      private W255() {
      }

      static synchronized void O00000000(MinecraftClient minecraftClient) {
         O000000000();
         long var1 = System.currentTimeMillis();
         O00000OO0OOO00$W258$W259 var3 = O000000000(minecraftClient);
         String var4 = O0000000000(minecraftClient);
         if (var3 != null && !var4.isBlank()) {
            O00000OO0OOO00.W248 var5 = O00000000000(minecraftClient);
            String var6 = O00000OO0OOO00.O00000000(var4, var5);
            if (var6.equals(O00000000000O0) && var3.key().equals(O00000000000OO)) {
               long var7 = Math.min(60000L, Math.max(0L, var1 - O0000000000O));
               O0000000000O = var1;
               if (var7 > 0L) {
                  O00000000(var6, var4, var3, var7, var1);
               }

               O00000000(var1, false);
            } else {
               O00000000(var1);
               O00000000000O0 = var6;
               O00000000000OO = var3.key();
               O0000000000O = var1;
               O00000000(var6, var4, var3, 0L, var1);
               O00000000(var1, false);
            }
         } else {
            O00000000(var1);
            O00000000(var1, true);
         }
      }

      static synchronized void O00000000() {
         O000000000();
         long var0 = System.currentTimeMillis();
         O00000000(var0);
         O00000000(var0, true);
      }

      static synchronized O00000OO0OOO00.W262 O00000000(String string, String string2) {
         O000000000();
         O00000OO0OOO00$W260$W261 var2 = null;
         ArrayList var3 = new ArrayList(3);
         if (string != null && !string.isBlank()) {
            var3.add(string);
         }

         String var4 = O00000OO0OOO00.O00000000000O(string2);
         if (!var4.isBlank()) {
            var3.add(O00000OO0OOO00.O00000000(var4, O00000OO0OOO00.W248.CRACKED));
            var3.add(O00000OO0OOO00.O00000000(var4, O00000OO0OOO00.W248.PREMIUM));
         }

         HashSet var5 = new HashSet();

         for (String var7 : (ArrayList<String>)var3) {
            if (var7 != null && !var7.isBlank() && var5.add(var7)) {
               O00000OO0OOO00$W256$W257 var8 = O00000000000.get(var7);
               if (var8 != null) {
                  for (O00000OO0OOO00$W260$W261 var10 : var8.O0000000000.values()) {
                     if (var10.O000000000000 > 0L
                        && (
                           var2 == null
                              || var10.O000000000000 > var2.O000000000000
                              || var10.O000000000000 == var2.O000000000000 && var10.O0000000000000 > var2.O0000000000000
                        )) {
                        var2 = var10;
                     }
                  }
               }
            }
         }

         if (var2 == null) {
            return null;
         } else {
            byte[] var11 = var2.O00000000000 == null ? null : Arrays.copyOf(var2.O00000000000, var2.O00000000000.length);
            if ((var11 == null || var11.length == 0) && !var2.O0000000000.isBlank()) {
               var11 = O00000000(var2.O0000000000);
               if (var11 != null && var11.length > 0) {
                  var2.O00000000000 = Arrays.copyOf(var11, var11.length);
                  O00000000000O = true;
               }
            }

            return new O00000OO0OOO00.W262(var2.O00000000(), var2.O0000000000, var11, var2.O000000000000, var2.O0000000000000);
         }
      }

      private static void O00000000(long l) {
         if (!O00000000000O0.isBlank() && !O00000000000OO.isBlank() && O0000000000O > 0L) {
            O00000OO0OOO00$W256$W257 var2 = O00000000000.get(O00000000000O0);
            O00000OO0OOO00$W260$W261 var3 = var2 == null ? null : var2.O0000000000.get(O00000000000OO);
            if (var3 != null) {
               long var4 = Math.min(60000L, Math.max(0L, l - O0000000000O));
               if (var4 > 0L) {
                  var3.O000000000000 += var4;
                  var3.O0000000000000 = l;
                  O00000000000O = true;
               }
            }
         }

         O00000000000O0 = "";
         O00000000000OO = "";
         O0000000000O = 0L;
      }

      private static void O00000000(String string, String string2, O00000OO0OOO00$W258$W259 o000000000, long l, long m) {
         O00000OO0OOO00$W256$W257 var7 = O00000000000.computeIfAbsent(string, string3 -> new O00000OO0OOO00$W256$W257(string, string2));
         var7.O000000000 = string2;
         O00000OO0OOO00$W260$W261 var8 = var7.O0000000000
            .computeIfAbsent(o000000000.key(), stringx -> new O00000OO0OOO00$W260$W261(o000000000.key(), o000000000.name(), o000000000.address()));
         var8.O000000000 = o000000000.name();
         var8.O0000000000 = o000000000.address();
         if (o000000000.favicon() != null && o000000000.favicon().length > 0) {
            var8.O00000000000 = Arrays.copyOf(o000000000.favicon(), o000000000.favicon().length);
         }

         var8.O000000000000 = var8.O000000000000 + Math.max(0L, l);
         var8.O0000000000000 = m;
         O00000000000O = true;
      }

      private static O00000OO0OOO00$W258$W259 O000000000(MinecraftClient minecraftClient) {
         if (minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && minecraftClient.getNetworkHandler() != null) {
            try {
               if (minecraftClient.isConnectedToLocalServer()) {
                  return new O00000OO0OOO00$W258$W259("local:localhost", "Local Server", "localhost", null);
               }
            } catch (Throwable var8) {
            }

            ServerInfo var1 = null;

            try {
               var1 = minecraftClient.getCurrentServerEntry();
            } catch (Throwable var7) {
            }

            if (var1 == null) {
               try {
                  var1 = minecraftClient.getNetworkHandler().getServerInfo();
               } catch (Throwable var6) {
               }
            }

            if (var1 != null) {
               String var2 = O0000000000(var1.address);
               if (!var2.isBlank()) {
                  String var10 = O0000000000000(var1.name).trim();
                  if (var10.isBlank()) {
                     var10 = O000000000000(var2);
                  }

                  byte[] var4 = var1.getFavicon();
                  return new O00000OO0OOO00$W258$W259("server:" + O000000000(var2), var10, var2, var4 == null ? null : Arrays.copyOf(var4, var4.length));
               }
            }

            try {
               SocketAddress var9 = minecraftClient.getNetworkHandler().getConnection().getAddress();
               String var3 = var9 == null ? "" : O0000000000(var9.toString());
               if (!var3.isBlank()) {
                  return new O00000OO0OOO00$W258$W259("server:" + O000000000(var3), O000000000000(var3), var3, null);
               }
            } catch (Throwable var5) {
            }

            return null;
         } else {
            return null;
         }
      }

      private static String O0000000000(MinecraftClient minecraftClient) {
         try {
            return minecraftClient != null && minecraftClient.getSession() != null
               ? O00000OO0OOO00.O00000000000O(minecraftClient.getSession().getUsername())
               : "";
         } catch (Throwable var2) {
            return "";
         }
      }

      private static O00000OO0OOO00.W248 O00000000000(MinecraftClient minecraftClient) {
         try {
            if (minecraftClient != null && minecraftClient.getSession() != null && minecraftClient.getSession().getAccountType() != AccountType.LEGACY) {
               return O00000OO0OOO00.W248.PREMIUM;
            }
         } catch (Throwable var2) {
         }

         return O00000OO0OOO00.W248.CRACKED;
      }

      private static void O000000000() {
         if (!O0000000000000) {
            O0000000000000 = true;
            File var0 = O0000000000();
            if (var0 != null && var0.exists() && var0.isFile()) {
               try {
                  JsonElement var1 = JsonParser.parseString(Files.readString(var0.toPath(), StandardCharsets.UTF_8));
                  if (var1 == null || !var1.isJsonObject()) {
                     return;
                  }

                  JsonObject var2 = var1.getAsJsonObject();
                  JsonElement var3 = var2.get("accounts");
                  if (var3 == null || !var3.isJsonArray()) {
                     return;
                  }

                  for (JsonElement var5 : var3.getAsJsonArray()) {
                     if (var5.isJsonObject()) {
                        JsonObject var6 = var5.getAsJsonObject();
                        String var7 = O00000000(var6, "id", "");
                        String var8 = O00000OO0OOO00.O00000000000O(O00000000(var6, "name", ""));
                        if (!var7.isBlank()) {
                           O00000OO0OOO00$W256$W257 var9 = new O00000OO0OOO00$W256$W257(var7, var8);
                           JsonElement var10 = var6.get("servers");
                           if (var10 != null && var10.isJsonArray()) {
                              for (JsonElement var12 : var10.getAsJsonArray()) {
                                 if (var12.isJsonObject()) {
                                    JsonObject var13 = var12.getAsJsonObject();
                                    String var14 = O000000000(O00000000(var13, "key", ""));
                                    String var15 = O0000000000(O00000000(var13, "address", ""));
                                    String var16 = O0000000000000(O00000000(var13, "name", "")).trim();
                                    byte[] var17 = O00000000000(O00000000(var13, "favicon", ""));
                                    long var18 = Math.max(0L, O00000000(var13, "totalMs", 0L));
                                    long var20 = Math.max(0L, O00000000(var13, "lastActiveAt", 0L));
                                    if (!var14.isBlank() && var18 > 0L) {
                                       O00000OO0OOO00$W260$W261 var22 = new O00000OO0OOO00$W260$W261(var14, var16, var15);
                                       var22.O00000000000 = var17;
                                       var22.O000000000000 = var18;
                                       var22.O0000000000000 = var20;
                                       var9.O0000000000.put(var14, var22);
                                    }
                                 }
                              }
                           }

                           if (!var9.O0000000000.isEmpty()) {
                              O00000000000.put(var7, var9);
                           }
                        }
                     }
                  }
               } catch (Throwable var23) {
               }
            }
         }
      }

      private static void O00000000(long l, boolean bl) {
         if (O00000000000O && (bl || l - O0000000000O0 >= 10000L)) {
            File var3 = O0000000000();
            if (var3 != null) {
               try {
                  File var4 = var3.getParentFile();
                  if (var4 != null) {
                     var4.mkdirs();
                  }

                  JsonObject var5 = new JsonObject();
                  var5.addProperty("version", 1);
                  var5.addProperty("updatedAt", l);
                  JsonArray var6 = new JsonArray();

                  for (O00000OO0OOO00$W256$W257 var8 : O00000000000.values()) {
                     if (!var8.O00000000.isBlank() && !var8.O0000000000.isEmpty()) {
                        JsonObject var9 = new JsonObject();
                        var9.addProperty("id", var8.O00000000);
                        var9.addProperty("name", var8.O000000000);
                        JsonArray var10 = new JsonArray();

                        for (O00000OO0OOO00$W260$W261 var12 : var8.O0000000000.values()) {
                           if (var12.O000000000000 > 0L) {
                              JsonObject var13 = new JsonObject();
                              var13.addProperty("key", var12.O00000000);
                              var13.addProperty("name", var12.O000000000);
                              var13.addProperty("address", var12.O0000000000);
                              if (var12.O00000000000 != null && var12.O00000000000.length > 0) {
                                 var13.addProperty("favicon", Base64.getEncoder().encodeToString(var12.O00000000000));
                              }

                              var13.addProperty("totalMs", var12.O000000000000);
                              var13.addProperty("lastActiveAt", var12.O0000000000000);
                              var10.add(var13);
                           }
                        }

                        if (var10.size() > 0) {
                           var9.add("servers", var10);
                           var6.add(var9);
                        }
                     }
                  }

                  var5.add("accounts", var6);
                  Files.writeString(var3.toPath(), O00000000.toJson(var5), StandardCharsets.UTF_8);
                  O00000000000O = false;
                  O0000000000O0 = l;
               } catch (Throwable var14) {
               }
            }
         }
      }

      private static File O0000000000() {
         try {
            File var0 = WildClient.O00000000 != null ? WildClient.O00000000.O0000000000000 : new File(MinecraftClient.getInstance().runDirectory, "Wild");
            return new File(var0, "account_server_stats.json");
         } catch (Throwable var1) {
            return null;
         }
      }

      private static byte[] O00000000(String string) {
         O00000000000();
         byte[] var1 = O000000000000.get(O000000000(string));
         return var1 == null ? null : Arrays.copyOf(var1, var1.length);
      }

      private static void O00000000000() {
         if (!O000000000000O) {
            O000000000000O = true;

            try {
               MinecraftClient var0 = MinecraftClient.getInstance();
               ServerList var1 = new ServerList(var0);
               var1.loadFile();
               int var2 = var1.size();

               for (int var3 = 0; var3 < var2; var3++) {
                  ServerInfo var4 = var1.get(var3);
                  if (var4 != null && var4.address != null && !var4.address.isBlank()) {
                     byte[] var5 = var4.getFavicon();
                     if (var5 != null && var5.length != 0) {
                        O000000000000.put(O000000000(var4.address), Arrays.copyOf(var5, var5.length));
                     }
                  }
               }
            } catch (Throwable var6) {
            }
         }
      }

      private static String O000000000(String string) {
         return O0000000000(string).toLowerCase(Locale.ROOT);
      }

      private static String O0000000000(String string) {
         String var1 = O0000000000000(string).trim();
         if (var1.startsWith("/")) {
            var1 = var1.substring(1);
         }

         int var2 = var1.indexOf("<unresolved>");
         if (var2 >= 0) {
            var1 = var1.substring(0, var2) + var1.substring(var2 + "<unresolved>".length());
         }

         return var1.trim();
      }

      private static byte[] O00000000000(String string) {
         String var1 = O0000000000000(string).trim();
         if (var1.isBlank()) {
            return null;
         } else {
            try {
               return Base64.getDecoder().decode(var1);
            } catch (Throwable var3) {
               return null;
            }
         }
      }

      static String O000000000000(String string) {
         String var1 = O0000000000(string);
         int var2 = var1.indexOf(47);
         if (var2 >= 0 && var2 + 1 < var1.length()) {
            var1 = var1.substring(var2 + 1);
         }

         return var1.isBlank() ? "Server" : var1;
      }

      private static String O00000000(JsonObject jsonObject, String string, String string2) {
         try {
            JsonElement var3 = jsonObject.get(string);
            return var3 != null && !var3.isJsonNull() ? var3.getAsString() : string2;
         } catch (Throwable var4) {
            return string2;
         }
      }

      private static long O00000000(JsonObject jsonObject, String string, long l) {
         try {
            JsonElement var4 = jsonObject.get(string);
            return var4 != null && !var4.isJsonNull() ? var4.getAsLong() : l;
         } catch (Throwable var5) {
            return l;
         }
      }

      static String O0000000000000(String string) {
         return string == null ? "" : string;
      }
   }

   record W262(String displayName, String address, byte[] favicon, long totalMs, long lastActiveAt) {
   }

   static final class W263 {
      float O00000000;
      float O000000000;
      float O0000000000 = -100.0F;
      float O00000000000;
   }
}
