package l;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

public class Helper337 {
   private static final Helper337 INSTANCE = new Helper337();
   private List<PlayerEntity> cachedPlayers = new ArrayList<>();
   private int playerCacheTick = 0;
   private static final int PLAYER_CACHE_INTERVAL = 5;
   private List<Entity> cachedEntities = new ArrayList<>();
   private int entityCacheTick = 0;
   private static final int ENTITY_CACHE_INTERVAL = 3;
   private final Map<Integer, Double> distanceCache = new ConcurrentHashMap<>();
   private final Map<Integer, Boolean> visibilityCache = new ConcurrentHashMap<>();
   private int tickCounter = 0;

   private Helper337() {
   }

   public static Helper337 method3337() {
      return INSTANCE;
   }

   public void method3338() {
      this.tickCounter++;
      this.distanceCache.clear();
      this.visibilityCache.clear();
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1.world == null) {
         this.cachedPlayers.clear();
         this.cachedEntities.clear();
      } else {
         if (this.tickCounter % 5 == 0) {
            this.cachedPlayers = new ArrayList<>(var1.world.getPlayers());
            this.playerCacheTick = this.tickCounter;
         }

         if (this.tickCounter % 3 == 0) {
            this.cachedEntities = new ArrayList<>();
            var1.world.getEntities().forEach(this.cachedEntities::add);
            this.entityCacheTick = this.tickCounter;
         }
      }
   }

   public List<PlayerEntity> method3339() {
      return this.cachedPlayers;
   }

   public List<Entity> method3340() {
      return this.cachedEntities;
   }

   public double method3341(Entity var1, Entity var2) {
      if (var1 != null && var2 != null) {
         int var3 = Objects.hash(var1.getId(), var2.getId());
         return this.distanceCache.computeIfAbsent(var3, var2x -> (double)var1.distanceTo(var2));
      } else {
         return Double.MAX_VALUE;
      }
   }

   public boolean method3342(Entity var1, boolean var2) {
      return var1 == null ? var2 : this.visibilityCache.computeIfAbsent(var1.getId(), var1x -> var2);
   }

   public void method3343(Entity var1, boolean var2) {
      if (var1 != null) {
         this.visibilityCache.put(var1.getId(), var2);
      }
   }

   public void method3344() {
      this.cachedPlayers.clear();
      this.cachedEntities.clear();
      this.distanceCache.clear();
      this.visibilityCache.clear();
      this.tickCounter = 0;
   }
}
