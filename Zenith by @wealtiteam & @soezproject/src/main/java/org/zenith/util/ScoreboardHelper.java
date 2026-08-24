package org.zenith.util;

import org.zenith.rotation.Rotation;

import org.zenith.ZenithClient;
import org.zenith.rotation.RotationBurstStrategy;
import org.zenith.rotation.RotationSnapStrategy;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;

public final class ScoreboardHelper {
   public static final Pattern pattern11 = Pattern.compile(
      "\u041c\u043e\u043d\u0435\u0442\u043e\u043a:\\s*([\\d][\\d\\s\\u00A0.,]*)([k\u043aK\u041a]*)"
   );

   public ScoreboardHelper() {
   }

   public static long on23(Scoreboard var0, String var1) {
      if (var0 == null) {
         return -1L;
      } else {
         ScoreboardObjective scoreboardobjective = null;
         if (var1 != null) {
            Team team = var0.getScoreHolderTeam(var1);
            if (team != null) {
               ScoreboardDisplaySlot scoreboarddisplayslot = ScoreboardDisplaySlot.fromFormatting(team.getColor());
               if (scoreboarddisplayslot != null) {
                  scoreboardobjective = var0.getObjectiveForSlot(scoreboarddisplayslot);
               }
            }
         }

         if (scoreboardobjective == null) {
            scoreboardobjective = var0.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
         }

         if (scoreboardobjective == null) {
            return -1L;
         } else {
            for (ScoreboardEntry scoreboardentry : var0.getScoreboardEntries(scoreboardobjective)) {
               if (!scoreboardentry.hidden()) {
                  Team team1 = var0.getScoreHolderTeam(scoreboardentry.owner());
                  String s = RotationSnapStrategy(Team.decorateName(team1, scoreboardentry.name()).getString());
                  long i = RotationBurstStrategy(s);
                  if (i >= 0L) {
                     return i;
                  }
               }
            }

            return -1L;
         }
      }
   }

   public static long RotationBurstStrategy(String var0) {
      Matcher matcher = pattern11.matcher(var0);
      if (!matcher.find()) {
         return -1L;
      } else {
         try {
            String s = matcher.group(1).replaceAll("[\\s\\u00A0]", "").replace(',', '.');
            String s1 = matcher.group(2);
            long i = s.chars().filter(var0x -> var0x == 46).count();
            if (i > 1L || i == 1L && s1.isEmpty() && s.length() - s.indexOf(46) - 1 == 3) {
               s = s.replace(".", "");
            }

            double d0 = Double.parseDouble(s);

            for (int j = 0; j < s1.length(); j++) {
               d0 *= 1000.0;
            }

            return Math.round(d0);
         } catch (Exception exception) {
            return -1L;
         }
      }
   }

   public static String RotationSnapStrategy(String var0) {
      StringBuilder stringbuilder = new StringBuilder(var0.length());

      for (int i = 0; i < var0.length(); i++) {
         char c0 = var0.charAt(i);
         if (c0 == 167) {
            i++;
         } else {
            stringbuilder.append(c0);
         }
      }

      return stringbuilder.toString();
   }
}
