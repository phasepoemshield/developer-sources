package l;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class StaffList extends Helper119 {
   public final Map<PlayerListEntry, Helper467> list = new HashMap<>();
   private final Set<String> notifiedPlayers = new HashSet<>();
   private final Pattern namePattern = Pattern.compile("^\\w{3,16}$");
   private final Pattern numericOnlyNamePattern = Pattern.compile("^\\d{3,16}$");
   private static final Map<String, String> CHAR_TO_NAME = new HashMap<>();

   public static StaffList method4926() {
      return Helper222.method1981(StaffList.class);
   }

   public StaffList() {
      super("Staff List", 115, 40, 80, 23, true);
   }

   private int method4927() {
      return Hud.method1824().method1827();
   }

   private int method4928(int var1) {
      int var2 = this.method4927() & 16777215;
      return var2 | var1 << 24;
   }

   @Override
   public boolean method307() {
      return !this.list.isEmpty() || Helper38.method548(mc.currentScreen);
   }

   @Override
   public void method308() {
      if (mc.world != null && mc.player != null && mc.getNetworkHandler() != null) {
         Collection<net.minecraft.client.network.PlayerListEntry> var1 = mc.getNetworkHandler().getPlayerList();
         Scoreboard var2 = mc.world.getScoreboard();
         HashSet var3 = new HashSet();

         for (Helper18 var5 : Helper19.method384()) {
            String var6 = var5.getName();
            if (!var3.contains(var6) && !this.list.keySet().stream().anyMatch(var1x -> var1x.getProfile().getName().equals(var6))) {
               var1.stream().filter(var1x -> var1x.getProfile().getName().equalsIgnoreCase(var6)).findFirst().ifPresent(var3x -> {
                  this.list.put(var3x, new Animation2().method5003(150).method5004(1.0));
                  var3.add(var6);
               });
            }
         }

         ArrayList<net.minecraft.scoreboard.Team> var16 = new ArrayList<>(var2.getTeams());
         var16.sort(Comparator.comparing(Team::getName));
         Collection<net.minecraft.client.network.PlayerListEntry> var17 = mc.getNetworkHandler().getPlayerList();

         for (Team var7 : var16) {
            Collection<String> var8 = var7.getPlayerList();
            if (var8.size() == 1) {
               String var9 = (String)var8.iterator().next();
               if (this.namePattern.matcher(var9).matches() && !this.numericOnlyNamePattern.matcher(var9).matches() && !var3.contains(var9)) {
                  boolean var10 = var17.stream().anyMatch(var1x -> var1x.getProfile() != null && var9.equals(var1x.getProfile().getName()));
                  if (!var10 && !this.list.keySet().stream().anyMatch(var1x -> var1x.getProfile().getName().equals(var9))) {
                     String var11 = var7.getPrefix().getString();
                     String var12 = CHAR_TO_NAME.entrySet()
                        .stream()
                        .filter(var1x -> var11.contains(var1x.getKey()))
                        .map(Entry::getValue)
                        .findFirst()
                        .orElse("");
                     MutableText var13 = Text.empty();
                     if (Helper128.method1053()) {
                        var13.append(Text.literal(var9).formatted(Formatting.GRAY))
                           .append(Text.literal(" [").formatted(Formatting.GRAY))
                           .append(Text.literal(var12.isEmpty() ? "V" : var12).formatted(Formatting.RESET))
                           .append(Text.literal("]").formatted(Formatting.GRAY));
                     } else {
                        var13.append(Text.literal("[").formatted(Formatting.GRAY))
                           .append(Text.literal(var12.isEmpty() ? "V" : var12).formatted(Formatting.RESET))
                           .append(Text.literal("] ").formatted(Formatting.GRAY))
                           .append(Text.literal(var9).formatted(Formatting.GRAY));
                     }

                     GameProfile var14 = new GameProfile(UUID.randomUUID(), var9);
                     PlayerListEntry var15 = new PlayerListEntry(var14, mc.isInSingleplayer());
                     var15.setDisplayName(var13);
                     var15.setListOrder(Integer.MIN_VALUE);
                     this.list.put(var15, new Animation2().method5003(150).method5004(1.0));
                     var3.add(var9);
                     if (Hud.method1824().notificationSettings.method2588("Staff Join") && !this.notifiedPlayers.contains(var9)) {
                        Notifications.method1666().method1669(Text.literal(var9 + " Staff Зашел в Vanish!"), 5000L);
                        this.notifiedPlayers.add(var9);
                     }
                  }
               }
            }
         }

         this.list.entrySet().removeIf(var3x -> {
            String var4 = var3x.getKey().getProfile().getName();
            if (this.numericOnlyNamePattern.matcher(var4).matches()) {
               this.notifiedPlayers.remove(var4);
               return true;
            } else {
               boolean var5x = Helper19.method382(var4);
               boolean var6x = var1.stream().anyMatch(var1xx -> var1xx.getProfile().getName().equals(var4));
               boolean var7x = var2.getTeams().stream().flatMap(var0 -> var0.getPlayerList().stream()).anyMatch(var4::equals);
               boolean var8x = false;
               if (var5x) {
                  if (!var6x) {
                     var8x = true;
                  }
               } else if (var6x || !var7x) {
                  var8x = true;
               }

               if (var8x) {
                  var3x.getValue().method4997(Helper450.BACKWARDS);
               }

               if (var3x.getValue().method4995(Helper450.BACKWARDS)) {
                  this.notifiedPlayers.remove(var4);
                  if (!var6x && Hud.method1824().notificationSettings.method2588("Staff Leave")) {
                     Notifications.method1666().method1669(Text.literal(var4 + " Staff вышел из Vanish!"), 5000L);
                  }

                  return true;
               } else {
                  return false;
               }
            }
         });
      } else {
         this.list.clear();
      }
   }

   @Override
   public void method310(DrawContext var1) {
      if (!Helper362.method3600()) {
         this.method4929(var1);
      } else {
         this.method4930(var1);
      }
   }

   private void method4929(DrawContext var1) {
      MatrixStack var2 = var1.getMatrices();
      Helper175 var3 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var4 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var5 = Helper103.method927(17, Helper101.ICONS);
      Helper175 var6 = Helper103.method927(19, Helper101.ICONSTYPENEW);
      int var7 = this.method4927();
      int var8 = Hud.method1824().method1843();
      int var9 = this.method4928(Math.min(255, var8 + 15));
      byte var10 = 15;
      byte var11 = 2;
      int var12 = 80;
      int var13 = 0;
      Collection<net.minecraft.client.network.PlayerListEntry> var14 = Objects.requireNonNull(mc.player).networkHandler.getPlayerList();
      if (!this.list.isEmpty()) {
         for (Entry var16 : this.list.entrySet()) {
            PlayerListEntry var17 = (PlayerListEntry)var16.getKey();
            if (var17 != null) {
               float var18 = ((Helper467)var16.getValue()).method5000().floatValue();
               String var19 = var17.getProfile().getName();
               PlayerListEntry var20 = var14.stream().filter(var1x -> var1x.getProfile().getName().equals(var19)).findFirst().orElse(var17);
               String var21 = var20.getDisplayName() != null ? var20.getDisplayName().getString() : var19;
               String var22 = CHAR_TO_NAME.entrySet()
                  .stream()
                  .filter(var1x -> var21.contains(var1x.getKey()))
                  .map(Entry::getValue)
                  .findFirst()
                  .orElse("Vanish");
               float var23 = var4.method1479(var19) + var4.method1479(var22) + 25.0F + 10.0F;
               var12 = (int)Math.max(var23, (float)var12);
               var13 += (int)(11.0F * var18);
            }
         }
      }

      this.method975(var12 + 20);
      this.method976(this.list.isEmpty() ? var10 : var10 + var11 + var13 + 4);
      Helper12.method361(var2, this.method981(), this.method982(), this.method983(), var10, 4.0F, var8, Hud.method1824().method1832(), var7);
      if (!Hud.method1824().method1838()) {
         rectangle.method677(
            Helper80.method841(var2, this.method981(), this.method982(), this.method983(), var10)
               .method828(4.0F, 4.0F, 4.0F, 4.0F)
               .method835(0.1F)
               .method839(var7)
               .method823(Helper133.method1106(Hud.method1824().method1832(), var8))
               .method840()
         );
      }

      var5.method1474(var2, "E", this.method981() + 3.5F, this.method982() + 6.0F, Hud.method1824().method1828());
      var6.method1474(var2, "d", this.method981() + this.method983() - 13.0F, this.method982() + 5.5F, Hud.method1824().method1828());
      var3.method1474(var2, this.getName(), this.method981() + 16, this.method982() + 6.5F, Helper133.method1160());
      if (!this.list.isEmpty()) {
         float var34 = this.method982() + var10 + var11 - 1;
         float var35 = var13 + 4;
         Helper12.method361(var2, this.method981(), var34, this.method983(), var35, 4.0F, var8, Hud.method1824().method1832(), var7);
         if (!Hud.method1824().method1838()) {
            rectangle.method677(
               Helper80.method841(var2, this.method981(), var34, this.method983(), var35)
                  .method828(4.0F, 4.0F, 4.0F, 4.0F)
                  .method835(0.1F)
                  .method839(var7)
                  .method823(Helper133.method1106(Hud.method1824().method1832(), var8))
                  .method840()
            );
         }

         int var36 = 4;
         int var37 = Helper133.method1160();
         float var38 = this.method981() + this.method983() / 2.0F;

         for (Entry var40 : this.list.entrySet()) {
            PlayerListEntry var41 = (PlayerListEntry)var40.getKey();
            if (var41 != null) {
               String var42 = var41.getProfile().getName();
               float var24 = var34 + var36;
               float var25 = ((Helper467)var40.getValue()).method5000().floatValue();
               PlayerListEntry var26 = var14.stream().filter(var1x -> var1x.getProfile().getName().equals(var42)).findFirst().orElse(var41);
               String var27 = var26.getDisplayName() != null ? var26.getDisplayName().getString() : var42;
               String var28 = CHAR_TO_NAME.entrySet()
                  .stream()
                  .filter(var1x -> var27.contains(var1x.getKey()))
                  .map(Entry::getValue)
                  .findFirst()
                  .orElse("Vanish");
               Identifier var30 = var26.getSkinTextures().texture();
               int var31 = Helper133.method1139(var37 >> 16 & 0xFF, var37 >> 8 & 0xFF, var37 & 0xFF, 255);
               float var32 = var4.method1479(var28);
               float var33 = var24 + 4.0F;
               Helper147.method1231(
                  var2,
                  var38,
                  var33,
                  1.0F,
                  var25,
                  () -> {
                     float var11x = this.method981() + 16.0F;
                     float var12x = this.method981() + this.method983() - var32 - 4.0F;
                     float var13x = var12x - var11x - 4.0F;
                     String var14x = var42;
                     if (var4.method1479(var42) > var13x) {
                        var14x = Helper209.method1795(var42, Math.max(0.0F, var13x), var4);
                     }

                     Helper178.method1507(var1, var30, this.method981() + 4.0F, var24, 8.0F, 3.5F, 8, 8, 64, Helper133.method1157(1.0F));
                     var4.method1474(var2, var14x, var11x, var24 + 2.0F, var31);
                     float var15 = var24 + 2.0F;
                     int var16x = Hud.method1824().method1828();
                     int var17x = var16x >> 16 & 0xFF;
                     int var18x = var16x >> 8 & 0xFF;
                     int var19x = var16x & 0xFF;
                     RenderSystem.enableBlend();
                     RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
                     Identifier var20x = Identifier.of("textures/teremok/particles/bloom.png");
                     float var21x = var32 + 12.0F;
                     float var22x = 14.0F;
                     float var23x = var12x + var32 / 2.0F;
                     float var24x = var15 + 1.0F;
                     byte var25x = 4;

                     for (int var26x = var25x; var26x >= 0; var26x--) {
                        float var27x = 1.0F + var26x * 0.45F;
                        float var28x = var21x * var27x;
                        float var29 = var22x * var27x;
                        float var30x = var26x == 0 ? 0.7F : 0.35F / (var26x + 1);
                        int var31x = Helper133.method1139(var17x, var18x, var19x, (int)(var30x * 90.0F));
                        Helper178.method1513(
                           var2,
                           var20x,
                           var23x - var28x / 2.0F,
                           var23x + var28x / 2.0F,
                           var24x - var29 / 2.0F,
                           var24x + var29 / 2.0F,
                           0.0F,
                           1.0F,
                           0.0F,
                           1.0F,
                           var31x
                        );
                     }

                     RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
                     RenderSystem.disableBlend();
                     var4.method1474(var2, var28, var12x, var15, var7);
                  }
               );
               var36 += (int)(11.0F * var25);
            }
         }
      }
   }

   private void method4930(DrawContext var1) {
      MatrixStack var2 = var1.getMatrices();
      Helper175 var3 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var4 = Helper103.method927(13, Helper101.DEFAULT);
      Helper175 var5 = Helper103.method927(19, Helper101.ICONS);
      int var6 = this.method4927();
      int var7 = Hud.method1824().method1843();
      int var8 = Math.max(88, (int)var3.method1479(this.getName()) + 28);
      Collection<net.minecraft.client.network.PlayerListEntry> var9 = Objects.requireNonNull(mc.player).networkHandler.getPlayerList();

      for (Entry var11 : this.list.entrySet()) {
         PlayerListEntry var12 = (PlayerListEntry)var11.getKey();
         if (var12 != null) {
            String var13 = var12.getProfile().getName();
            PlayerListEntry var14 = var9.stream().filter(var1x -> var1x.getProfile().getName().equals(var13)).findFirst().orElse(var12);
            String var15 = var14.getDisplayName() != null ? var14.getDisplayName().getString() : var13;
            String var16 = CHAR_TO_NAME.entrySet().stream().filter(var1x -> var15.contains(var1x.getKey())).map(Entry::getValue).findFirst().orElse("Vanish");
            var8 = Math.max(var8, this.method4931(var4, var13, var16));
         }
      }

      if (this.list.isEmpty() && Helper38.method548(mc.currentScreen)) {
         var8 = Math.max(var8, this.method4931(var4, "Active Staff", "Vanish"));
      }

      int var30 = Helper362.method3601(var7);
      int var31 = Helper362.method3602(var7);
      Helper362.method3604(var2, this.method981(), this.method982(), var8, 15.0F, 4.0F, var7, var30, var31);
      var5.method1474(var2, "E", this.method981() + 5.0F, this.method982() + 6.0F, Hud.method1824().method1828());
      var3.method1474(var2, this.getName(), this.method981() + 22, this.method982() + 6.5F, Helper133.method1160());
      int var32 = 20;
      int var33 = Helper133.method1160();

      for (Entry var36 : this.list.entrySet()) {
         PlayerListEntry var38 = (PlayerListEntry)var36.getKey();
         if (var38 != null) {
            String var17 = var38.getProfile().getName();
            float var18 = this.method982() + var32;
            float var19 = ((Helper467)var36.getValue()).method5000().floatValue();
            PlayerListEntry var20 = var9.stream().filter(var1x -> var1x.getProfile().getName().equals(var17)).findFirst().orElse(var38);
            String var21 = var20.getDisplayName() != null ? var20.getDisplayName().getString() : var17;
            String var22 = CHAR_TO_NAME.entrySet().stream().filter(var1x -> var21.contains(var1x.getKey())).map(Entry::getValue).findFirst().orElse("Vanish");
            int var23 = var8;
            float var24 = this.method981();
            float var25 = var24 + var23 / 2.0F;
            Identifier var27 = var20.getSkinTextures().texture();
            int var28 = Helper133.method1139(var33 >> 16 & 0xFF, var33 >> 8 & 0xFF, var33 & 0xFF, 255);
            float var29 = var4.method1479(var22);
            Helper147.method1231(var2, var25, var18, 1.0F, var19, () -> {
               Helper362.method3604(var2, var24, var18 - 4.0F, var23, 12.0F, 4.0F, var7, var30, var31);
               Helper178.method1507(var1, var27, var24 + 4.5F, var18 - 1.5F, 8.0F, 3.5F, 8, 8, 64, Helper133.method1157(1.0F));
               var4.method1474(var2, var17, var24 + 16.0F, var18 + 1.0F, var28);
               var4.method1474(var2, var22, var24 + var23 - var29 - 6.0F, var18 + 1.0F, var6);
            });
            var32 += Math.max(1, (int)(14.0F * var19));
         }
      }

      if (this.list.isEmpty() && Helper38.method548(mc.currentScreen)) {
         float var35 = this.method982() + var32;
         String var37 = "Active Staff";
         String var39 = "Vanish";
         int var40 = var8;
         float var41 = this.method981();
         float var42 = var41 + var40 / 2.0F;
         int var43 = Helper133.method1139(var33 >> 16 & 0xFF, var33 >> 8 & 0xFF, var33 & 0xFF, 255);
         float var44 = var4.method1479(var39);
         Helper147.method1231(
            var2,
            var42,
            var35,
            1.0F,
            1.0F,
            () -> {
               Helper362.method3604(var2, var41, var35 - 4.0F, var40, 12.0F, 4.0F, var7, var30, var31);
               if (mc.getEntityRenderDispatcher().getRenderer(mc.player) instanceof LivingEntityRenderer var15x) {
                  LivingEntityRenderState var16x = (LivingEntityRenderState)var15x.getAndUpdateRenderState(mc.player, tickCounter.getTickDelta(false));
                  Identifier var17x = var15x.getTexture(var16x);
                  Helper178.method1508(
                     var1, var17x, var41 + 4.5F, var35 - 1.5F, 8.0F, 3.0F, 8, 8, 64, Helper133.method1157(1.0F), Helper133.method1137(-1, 1.0F)
                  );
               }

               var4.method1474(var2, var37, var41 + 16.0F, var35 + 1.0F, var43);
               var4.method1474(var2, var39, var41 + var40 - var44 - 6.0F, var35 + 1.0F, var6);
            }
         );
         var32 += 14;
      }

      this.method975(var8);
      this.method976(var32);
   }

   private int method4931(Helper175 var1, String var2, String var3) {
      return (int)(var1.method1479(var2) + var1.method1479(var3)) + 28;
   }

   static {
      CHAR_TO_NAME.put("к”Ђ", "player");
      CHAR_TO_NAME.put("к”„", "hero");
      CHAR_TO_NAME.put("к”€", "titan");
      CHAR_TO_NAME.put("к”’", "avenger");
      CHAR_TO_NAME.put("к”–", "overlord");
      CHAR_TO_NAME.put("к” ", "magister");
      CHAR_TO_NAME.put("к”¤", "imperator");
      CHAR_TO_NAME.put("к”Ё", "dragon");
      CHAR_TO_NAME.put("к”І", "bull");
      CHAR_TO_NAME.put("к•’", "rabbit");
      CHAR_TO_NAME.put("к”¶", "tiger");
      CHAR_TO_NAME.put("к•„", "dracula");
      CHAR_TO_NAME.put("к•–", "bunny");
      CHAR_TO_NAME.put("к•Ђ", "hydra");
      CHAR_TO_NAME.put("к•€", "cobra");
      CHAR_TO_NAME.put("к”Ѓ", "media");
      CHAR_TO_NAME.put("к”…", "yt");
      CHAR_TO_NAME.put("к• ", "d.helper");
      CHAR_TO_NAME.put("к”‰", "helper");
      CHAR_TO_NAME.put("к”“", "ml.moder");
      CHAR_TO_NAME.put("к”—", "moder");
      CHAR_TO_NAME.put("к”Ў", "moder+");
      CHAR_TO_NAME.put("к”Ґ", "st.moder");
      CHAR_TO_NAME.put("к”©", "gl.moder");
      CHAR_TO_NAME.put("к”і", "ml.admin");
      CHAR_TO_NAME.put("к”·", "admin");
   }
}
