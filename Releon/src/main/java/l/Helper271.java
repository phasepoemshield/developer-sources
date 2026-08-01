package l;

import java.util.Collection;
import java.util.stream.Stream;
import net.minecraft.scoreboard.Team;

public enum Helper271 implements Helper278<Team> {
   INSTANCE;

   private Helper271() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      return new Helper120()
         .method990(this.method2740().stream().map(Team::getPlayerList).map(Object::toString).map(var0 -> var0.replaceAll("[\\[\\]]", "")))
         .method1000(var1.method1686().method1723())
         .method999()
         .method1003();
   }

   public Team method2018(Helper276 var1) {
      String var2 = var1.method1686().method1723();
      return this.method2740().stream().filter(var1x -> var1x.getName().equalsIgnoreCase(var2)).findFirst().orElse(null);
   }

   public Collection<Team> method2740() {
      return mc.world.getScoreboard().getTeams();
   }
}
