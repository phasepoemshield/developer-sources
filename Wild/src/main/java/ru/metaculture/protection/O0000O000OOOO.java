package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.Text;
import org.wild.mixin.acceser.BossBarHudAccessor;

public class O0000O000OOOO {
   public static final O0000O000OOOO O00000000 = new O0000O000OOOO();
   private static final Pattern O0000000000 = Pattern.compile("(?iu)(?:анарх(?:ия|ии)?|anarchy|an)\\s*[-:#№]?\\s*(\\d{1,5})");
   private static final Pattern O00000000000 = Pattern.compile("([a-zA-Z0-9_]{3,16})");
   private static final Pattern O000000000000 = Pattern.compile("Монет:\\s*(.+)");
   private static final Pattern O0000000000000 = Pattern.compile("Токенов:\\s*(\\d+)");
   private static final Pattern O000000000000O = Pattern.compile("Ранг:\\s*(.+)");
   private static final Pattern O00000000000O = Pattern.compile("Убийств:\\s*(\\d+)");
   private static final Pattern O00000000000O0 = Pattern.compile("Смертей:\\s*(\\d+)");
   private static final Pattern O00000000000OO = Pattern.compile("Наиграно:\\s*(.+)");
   public static String O000000000 = "N/A";
   private String O0000000000O = "N/A";
   private String O0000000000O0 = "N/A";
   private String O0000000000O00 = "N/A";
   private String O0000000000O0O = "0";
   private String O0000000000OO = "0";
   private String O0000000000OO0 = "0";
   private String O0000000000OOO = "0";
   private String O000000000O = "0";
   private long O000000000O0;

   public void O00000000(long l) {
      long var3 = System.currentTimeMillis();
      if (var3 - this.O000000000O0 >= l) {
         this.O000000000O0 = var3;
         this.O00000000();
      }
   }

   public void O00000000() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      this.O0000000000O = "N/A";
      this.O0000000000O0O = "0";
      this.O0000000000OO = "0";
      this.O0000000000OO0 = "0";
      this.O0000000000OOO = "0";
      this.O000000000O = "0";
      if (var1.world != null && var1.player != null) {
         Scoreboard var2 = var1.world.getScoreboard();
         ScoreboardObjective var3 = var2.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
         if (var3 != null) {
            String var4 = var3.getDisplayName().getString();
            Matcher var5 = O0000000000.matcher(this.O00000000(var4));
            if (var5.find()) {
               this.O0000000000O = var5.group(1);
            }

            List var6 = this.O00000000(var2, var3);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               String var8 = (String)var6.get(var7);
               String var9 = this.O00000000(var8);
               if ("N/A".equals(this.O0000000000O)) {
                  Matcher var10 = O0000000000.matcher(var9);
                  if (var10.find()) {
                     this.O0000000000O = var10.group(1);
                  }
               }

               if (var7 < 5 && !var9.contains(":") && !var9.contains("=") && !var9.trim().isEmpty()) {
                  Matcher var16 = O00000000000.matcher(var9);
                  if (var16.find()) {
                     this.O0000000000O0 = var16.group(1);
                     O000000000 = this.O0000000000O0;
                  }
               }

               Matcher var17 = O000000000000O.matcher(var9);
               if (var17.find()) {
                  this.O0000000000O00 = var17.group(1).trim();
               }

               Matcher var11 = O000000000000.matcher(var9);
               if (var11.find()) {
                  String var12 = var11.group(1);
                  this.O0000000000O0O = var12.replaceAll("[^0-9]", "");
               }

               Matcher var18 = O0000000000000.matcher(var9);
               if (var18.find()) {
                  this.O0000000000OO = var18.group(1);
               }

               Matcher var13 = O00000000000O.matcher(var9);
               if (var13.find()) {
                  this.O0000000000OO0 = var13.group(1);
               }

               Matcher var14 = O00000000000O0.matcher(var9);
               if (var14.find()) {
                  this.O0000000000OOO = var14.group(1);
               }

               Matcher var15 = O00000000000OO.matcher(var9);
               if (var15.find()) {
                  this.O000000000O = var15.group(1);
               }
            }
         }
      }
   }

   private List<String> O00000000(Scoreboard scoreboard, ScoreboardObjective scoreboardObjective) {
      ArrayList var3 = new ArrayList();
      Collection var4 = scoreboard.getScoreboardEntries(scoreboardObjective);
      ArrayList var5 = new ArrayList(var4);
      var5.sort(Comparator.comparingInt(ScoreboardEntry::value).reversed());
      int var6 = Math.min(var5.size(), 15);

      for (int var7 = 0; var7 < var6; var7++) {
         ScoreboardEntry var8 = (ScoreboardEntry)var5.get(var7);
         Team var9 = scoreboard.getScoreHolderTeam(var8.owner());
         var3.add(Team.decorateName(var9, Text.literal(var8.owner())).getString());
      }

      return var3;
   }

   private String O00000000(String string) {
      return string == null ? "" : string.replaceAll("(?i)§[0-9a-fk-or]", "").trim();
   }

   public static boolean O000000000() {
      if (MinecraftAccessor.a_.inGameHud != null && MinecraftAccessor.a_.inGameHud.getBossBarHud() != null) {
         Map var0 = ((BossBarHudAccessor)MinecraftAccessor.a_.inGameHud.getBossBarHud()).getBossBars();

         for (ClientBossBar var2 : (Collection<ClientBossBar>)var0.values()) {
            String var3 = var2.getName().getString().toLowerCase();
            if (var3.contains("pvp-режим") || var3.contains("пвп")) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Generated
   public String O0000000000() {
      return this.O0000000000O;
   }

   @Generated
   public String O00000000000() {
      return this.O0000000000O0;
   }

   @Generated
   public String O000000000000() {
      return this.O0000000000O00;
   }

   @Generated
   public String O0000000000000() {
      return this.O0000000000O0O;
   }

   @Generated
   public String O000000000000O() {
      return this.O0000000000OO;
   }

   @Generated
   public String O00000000000O() {
      return this.O0000000000OO0;
   }

   @Generated
   public String O00000000000O0() {
      return this.O0000000000OOO;
   }

   @Generated
   public String O00000000000OO() {
      return this.O000000000O;
   }

   @Generated
   public long O0000000000O() {
      return this.O000000000O0;
   }
}
