package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "UseTracker",
   O0000000000 = Category.Misc,
   O000000000 = "Отслеживание тотемов/эффектов/расходников у игроков"
)
public class UseTracker extends Module {
   private static final String O000000000O = "Снос тотема";
   private static final String O000000000O0 = "Полученные зелья";
   private static final String O000000000O00 = "Съеденные предметы";
   private static final int O000000000O000 = 31;
   private static final long O000000000O00O = 500L;
   private final GroupSetting O000000000O0O = new GroupSetting(
      "Отслеживать", new BooleanSetting("Снос тотема", true), new BooleanSetting("Полученные зелья", true), new BooleanSetting("Съеденные предметы", true)
   );
   private final Map<UUID, Map<String, StatusEffectInstance>> O000000000O0O0 = new HashMap<>();
   private static final Map<UUID, Boolean> O000000000O0OO = new HashMap<>();
   private final Map<UUID, ItemStack> O000000000OO = new HashMap<>();
   private final Map<UUID, Integer> O000000000OO0 = new HashMap<>();
   private final O0000O00O0000 O000000000OO00 = new O0000O00O0000();

   public UseTracker() {
      this.O00000000(new Setting[]{this.O000000000O0O});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (this.O0000000000OO0()) {
            this.O0000000000O0();
         } else {
            this.O000000000OO.clear();
            this.O000000000OO0.clear();
         }

         if (!this.O0000000000OO()) {
            this.O000000000O0O0.clear();
         } else if (this.O000000000OO00.O000000000000(500L)) {
            this.O000000000OO00.O00000000();
            this.O0000000000O00();
         }
      } else {
         this.O0000000000OOO();
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O000000000000().equals(O0000000O000OO.W24.RECEIVE) && O0000000000.world != null && O0000000000.player != null) {
         if (o0000000O000OO.O00000000000() instanceof EntityStatusS2CPacket var2) {
            this.O00000000(var2);
         }

         if (o0000000O000OO.O00000000000() instanceof EntityStatusEffectS2CPacket var4) {
            this.O00000000(var4);
         }
      }
   }

   private void O0000000000O0() {
      HashSet var1 = new HashSet();

      for (PlayerEntity var3 : O0000000000.world.getPlayers()) {
         if (var3 != null && var3.isAlive() && !this.O000000000(var3)) {
            UUID var4 = var3.getUuid();
            var1.add(var4);
            if (var3.isUsingItem()) {
               this.O000000000OO.computeIfAbsent(var4, uUID -> var3.getActiveItem().copy());
               this.O000000000OO0.putIfAbsent(var4, var3.age);
            } else {
               ItemStack var5 = this.O000000000OO.remove(var4);
               Integer var6 = this.O000000000OO0.remove(var4);
               if (var5 != null && !var5.isEmpty() && var6 != null && var3.age - var6 >= 31) {
                  UseAction var7 = var5.getUseAction();

                  String var8 = switch (var7) {
                     case DRINK -> "выпил";
                     case EAT -> "съел";
                     default -> null;
                  };
                  if (var8 != null) {
                     String var9 = this.O00000000(var5.getName().getString());
                     String var10 = this.O00000000(var5);
                     String var11 = var10.isEmpty() ? "" : " §8(§7" + var10 + "§8)";
                     this.O000000000("§f" + var3.getName().getString() + "§7 " + var8 + " §f" + var9 + var11);
                  }
               }
            }
         }
      }

      this.O000000000OO.keySet().removeIf(uUID -> !var1.contains(uUID));
      this.O000000000OO0.keySet().removeIf(uUID -> !var1.contains(uUID));
   }

   private void O00000000(EntityStatusS2CPacket entityStatusS2CPacket) {
      if (this.O0000000000O0O() && entityStatusS2CPacket.getStatus() == 35) {
         if (entityStatusS2CPacket.getEntity(O0000000000.world) instanceof PlayerEntity var3 && !this.O000000000(var3)) {
            boolean var4 = EnchantmentHelper.hasEnchantments(var3.getOffHandStack())
               || EnchantmentHelper.hasEnchantments(var3.getMainHandStack())
               || var3.getOffHandStack().hasGlint()
               || var3.getMainHandStack().hasGlint();
            O000000000O0OO.put(var3.getUuid(), var4);
            this.O000000000("§f" + var3.getName().getString() + "§7 потерял тотем бессмертия, зачарован: " + (var4 ? "§a" : "§c") + "⬤");
         }
      }
   }

   private void O00000000(EntityStatusEffectS2CPacket entityStatusEffectS2CPacket) {
      if (this.O0000000000OO()) {
         if (O0000000000.world.getEntityById(entityStatusEffectS2CPacket.getEntityId()) instanceof PlayerEntity var3) {
            UUID var4 = var3.getUuid();
            HashMap var5 = new HashMap<>(this.O000000000O0O0.getOrDefault(var4, Map.of()));
            var5.putAll(this.O00000000(var3));
            StatusEffectInstance var6 = new StatusEffectInstance(
               entityStatusEffectS2CPacket.getEffectId(),
               entityStatusEffectS2CPacket.getDuration(),
               entityStatusEffectS2CPacket.getAmplifier(),
               entityStatusEffectS2CPacket.isAmbient(),
               entityStatusEffectS2CPacket.shouldShowParticles(),
               entityStatusEffectS2CPacket.shouldShowIcon()
            );
            String var7 = this.O00000000(entityStatusEffectS2CPacket.getEffectId(), entityStatusEffectS2CPacket.getAmplifier());
            var5.put(var7, var6);
            HashSet var8 = new HashSet();
            var8.add(var7);
            this.O00000000(var3, var5, var8);
            this.O000000000O0O0.put(var4, var5);
         }
      }
   }

   private void O0000000000O00() {
      HashSet var1 = new HashSet();

      for (PlayerEntity var3 : O0000000000.world.getPlayers()) {
         if (var3 != null && var3.isAlive()) {
            UUID var4 = var3.getUuid();
            var1.add(var4);
            Map var5 = this.O000000000O0O0.getOrDefault(var4, Map.of());
            Map var6 = this.O00000000(var3);
            HashSet var7 = new HashSet();

            for (Entry var9 : (Set<Entry>)var6.entrySet()) {
               StatusEffectInstance var10 = (StatusEffectInstance)var5.get(var9.getKey());
               if (var10 == null || this.O00000000(var10, (StatusEffectInstance)var9.getValue())) {
                  var7.add((String)var9.getKey());
               }
            }

            if (!var7.isEmpty()) {
               this.O00000000(var3, var6, var7);
            }

            this.O000000000O0O0.put(var4, var6);
         }
      }

      this.O000000000O0O0.keySet().removeIf(uUID -> !var1.contains(uUID));
   }

   private boolean O00000000(StatusEffectInstance statusEffectInstance, StatusEffectInstance statusEffectInstance2) {
      return statusEffectInstance.getAmplifier() != statusEffectInstance2.getAmplifier()
         ? true
         : statusEffectInstance2.getDuration() > statusEffectInstance.getDuration() + 20;
   }

   private void O00000000(PlayerEntity playerEntity, Map<String, StatusEffectInstance> map, Set<String> set) {
      ArrayList var4 = new ArrayList();
      this.O00000000(map, set, var4, UseTracker.W108.KILLER, "effect.minecraft.strength:3", "effect.minecraft.resistance:0");
      this.O00000000(map, set, var4, UseTracker.W108.URINE, "effect.minecraft.jump_boost:0", "effect.minecraft.speed:2");
      this.O00000000(map, set, var4, UseTracker.W108.MEDIC, "effect.minecraft.health_boost:2", "effect.minecraft.regeneration:2");
      this.O00000000(
         map,
         set,
         var4,
         UseTracker.W108.BURP,
         "effect.minecraft.blindness:0",
         "effect.minecraft.glowing:0",
         "effect.minecraft.hunger:9",
         "effect.minecraft.slowness:2",
         "effect.minecraft.wither:4"
      );
      this.O00000000(map, set, var4, UseTracker.W108.FLASH, "effect.minecraft.blindness:0", "effect.minecraft.glowing:0");
      this.O00000000(
         map,
         set,
         var4,
         UseTracker.W108.SULFURIC_ACID,
         "effect.minecraft.poison:1",
         "effect.minecraft.slowness:3",
         "effect.minecraft.weakness:2",
         "effect.minecraft.wither:4"
      );
      this.O00000000(
         map,
         set,
         var4,
         UseTracker.W108.WINNER,
         "effect.minecraft.health_boost:1",
         "effect.minecraft.invisibility:0",
         "effect.minecraft.regeneration:1",
         "effect.minecraft.resistance:0"
      );
      if (var4.isEmpty()) {
         for (String var9 : set) {
            StatusEffectInstance var7 = (StatusEffectInstance)map.get(var9);
            if (var7 != null) {
               this.O00000000(playerEntity, var7);
            }
         }
      } else {
         for (UseTracker.W108 var6 : (List<UseTracker.W108>)var4) {
            this.O00000000(playerEntity, var6);
         }
      }
   }

   private void O00000000(PlayerEntity playerEntity, StatusEffectInstance statusEffectInstance) {
      String var3 = this.O00000000(Text.translatable(((StatusEffect)statusEffectInstance.getEffectType().value()).getTranslationKey()).getString());
      int var4 = Math.max(0, statusEffectInstance.getAmplifier()) + 1;
      String var5 = this.O00000000(statusEffectInstance);
      this.O000000000("§f" + playerEntity.getName().getString() + "§7 получил §f" + var3 + " " + var4 + "§7 на §f" + var5);
   }

   private boolean O00000000(Map<String, StatusEffectInstance> map, Set<String> set, List<UseTracker.W108> list, UseTracker.W108 o000000000, String... strings) {
      HashSet var6 = new HashSet<>(Arrays.asList(strings));
      boolean var7 = var6.stream().allMatch(map::containsKey);
      boolean var8 = var6.stream().anyMatch(set::contains);
      if (var7 && var8) {
         list.add(o000000000);
         set.removeAll(var6);
         return true;
      } else {
         return false;
      }
   }

   private Map<String, StatusEffectInstance> O00000000(PlayerEntity playerEntity) {
      HashMap var2 = new HashMap();

      for (StatusEffectInstance var4 : playerEntity.getStatusEffects()) {
         var2.put(this.O00000000(var4.getEffectType(), var4.getAmplifier()), var4);
      }

      return var2;
   }

   private String O00000000(RegistryEntry<StatusEffect> registryEntry, int i) {
      return ((StatusEffect)registryEntry.value()).getTranslationKey() + ":" + i;
   }

   private void O00000000(PlayerEntity playerEntity, UseTracker.W108 o000000000) {
      this.O000000000("§f" + playerEntity.getName().getString() + "§7 получил §f" + this.O00000000(o000000000.O00000000));
   }

   private String O00000000(ItemStack itemStack) {
      PotionContentsComponent var2 = (PotionContentsComponent)itemStack.get(DataComponentTypes.POTION_CONTENTS);
      if (var2 == null) {
         return "";
      } else {
         StringBuilder var3 = new StringBuilder();

         for (StatusEffectInstance var5 : var2.getEffects()) {
            if (!var3.isEmpty()) {
               var3.append("§8, §7");
            }

            String var6 = this.O00000000(Text.translatable(((StatusEffect)var5.getEffectType().value()).getTranslationKey()).getString());
            int var7 = Math.max(0, var5.getAmplifier()) + 1;
            var3.append(var6).append(" ").append(var7).append("§7 на §f").append(this.O00000000(var5));
         }

         return var3.toString();
      }
   }

   private String O00000000(StatusEffectInstance statusEffectInstance) {
      if (statusEffectInstance.isInfinite()) {
         return "∞";
      } else {
         int var2 = statusEffectInstance.getDuration() / 20;
         int var3 = var2 / 60;
         var2 %= 60;
         return var3 > 0 ? var3 + " мин " + var2 + " сек" : var2 + " сек";
      }
   }

   private boolean O0000000000O0O() {
      return this.O000000000O0O.O000000000("Снос тотема");
   }

   private boolean O0000000000OO() {
      return this.O000000000O0O.O000000000("Полученные зелья");
   }

   private boolean O0000000000OO0() {
      return this.O000000000O0O.O000000000("Съеденные предметы");
   }

   private boolean O000000000(PlayerEntity playerEntity) {
      return O0000000000.player != null && playerEntity.getUuid().equals(O0000000000.player.getUuid());
   }

   private String O00000000(String string) {
      return string == null ? "" : string.replaceAll("§[0-9a-fk-orA-FK-OR]", "");
   }

   private void O000000000(String string) {
      ChatUtil.O00000000(string);
   }

   private void O0000000000OOO() {
      this.O000000000O0O0.clear();
      O000000000O0OO.clear();
      this.O000000000OO.clear();
      this.O000000000OO0.clear();
   }

   @Override
   public void O000000000() {
      this.O0000000000OOO();
      super.O000000000();
   }

   record W107(RegistryEntry<StatusEffect> effect, int durationSeconds, int amplifier) {
      int durationTicks() {
         return this.durationSeconds * 20;
      }
   }

   static enum W108 {
      FLASH("§6[★] §eВспышка", List.of(new UseTracker.W107(StatusEffects.BLINDNESS, 20, 0), new UseTracker.W107(StatusEffects.GLOWING, 240, 0))),
      KILLER("§4[★] §cЗелье Киллера", List.of(new UseTracker.W107(StatusEffects.RESISTANCE, 180, 0), new UseTracker.W107(StatusEffects.STRENGTH, 90, 3))),
      BURP(
         "§c[★] §6Зелье Отрыжки",
         List.of(
            new UseTracker.W107(StatusEffects.BLINDNESS, 10, 0),
            new UseTracker.W107(StatusEffects.GLOWING, 180, 0),
            new UseTracker.W107(StatusEffects.HUNGER, 90, 9),
            new UseTracker.W107(StatusEffects.SLOWNESS, 180, 2),
            new UseTracker.W107(StatusEffects.WITHER, 30, 4)
         )
      ),
      SULFURIC_ACID(
         "§2[★] §aСерная кислота",
         List.of(
            new UseTracker.W107(StatusEffects.POISON, 50, 1),
            new UseTracker.W107(StatusEffects.SLOWNESS, 90, 3),
            new UseTracker.W107(StatusEffects.WEAKNESS, 90, 2),
            new UseTracker.W107(StatusEffects.WITHER, 30, 4)
         )
      ),
      MEDIC("§5[★] §dЗелье Медика", List.of(new UseTracker.W107(StatusEffects.HEALTH_BOOST, 45, 2), new UseTracker.W107(StatusEffects.REGENERATION, 45, 2))),
      WINNER(
         "§2[★] §aЗелье Победителя",
         List.of(
            new UseTracker.W107(StatusEffects.HEALTH_BOOST, 180, 1),
            new UseTracker.W107(StatusEffects.INVISIBILITY, 900, 0),
            new UseTracker.W107(StatusEffects.REGENERATION, 60, 1),
            new UseTracker.W107(StatusEffects.RESISTANCE, 60, 0)
         )
      ),
      URINE("§3[★] §bМоча Флеша", List.of(new UseTracker.W107(StatusEffects.JUMP_BOOST, 120, 1), new UseTracker.W107(StatusEffects.SPEED, 120, 2)));

      final String O00000000;
      private final List<UseTracker.W107> O000000000;

      private W108(String string2, List<UseTracker.W107> list) {
         this.O00000000 = string2;
         this.O000000000 = list;
      }
   }
}
