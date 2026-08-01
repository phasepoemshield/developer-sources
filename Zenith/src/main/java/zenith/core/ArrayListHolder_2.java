package zenith;

import zenith.hud.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.potion.Potions;
import net.minecraft.component.DataComponentTypes;
import zenith.zov.client.screens.autobuy.items.AutoInventoryItem;

public class ArrayListHolder_2 {
   private final ArrayList<GetDisplayNameHandler_2> ZenithInternal004 = new ArrayList<>();
   private final ArrayList<GetDisplayNameHandler_2> SimpleFramebufferHolder = new ArrayList<>();
   private final ArrayList<GetDisplayNameHandler_2> floatHolder_13 = new ArrayList<>();
   private final ArrayList<GetDisplayNameHandler_2> StringHolder_3 = new ArrayList<>();

   public ArrayListHolder_2() {
      this.init();
   }

   private void init() {
      List list = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:respiration, level=3], EnchantVanilla [checked=minecraft:mending, level=1], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:aqua_affinity, level=1]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll = new ArrayListHolder(
         Items.NETHERITE_HELMET.getDefaultStack(), "Шлем крушителя", ZenithInternal105$Helper.DrawContextImpl
      );
      list.forEach(i1iiilll11l1llil1ll::StringHolder_8);
      List list1 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:mending, level=1]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll1 = new ArrayListHolder(
         Items.NETHERITE_CHESTPLATE.getDefaultStack(), "Нагрудник Крушителя", ZenithInternal105$Helper.DrawContextImpl
      );
      list1.forEach(i1iiilll11l1llil1ll1::StringHolder_8);
      ArrayListHolder i1iiilll11l1llil1ll2 = new ArrayListHolder(
         Items.NETHERITE_LEGGINGS.getDefaultStack(), "Поножи Крушителя", ZenithInternal105$Helper.DrawContextImpl
      );
      list1.forEach(i1iiilll11l1llil1ll2::StringHolder_8);
      List list2 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:soul_speed, level=3], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:depth_strider, level=3], EnchantVanilla [checked=minecraft:feather_falling, level=4], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:mending, level=1]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll3 = new ArrayListHolder(
         Items.NETHERITE_BOOTS.getDefaultStack(), "Ботинки Крушителя", ZenithInternal105$Helper.DrawContextImpl
      );
      list2.forEach(i1iiilll11l1llil1ll3::StringHolder_8);
      List list3 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=oxidation, level=2], EnchantCustom [checked=detection, level=3], EnchantCustom [checked=poison, level=3], EnchantCustom [checked=vampirism, level=2], EnchantCustom [checked=skilled, level=3], EnchantVanilla [checked=minecraft:looting, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:fire_aspect, level=2], EnchantVanilla [checked=minecraft:sweeping_edge, level=3], EnchantVanilla [checked=minecraft:smite, level=7], EnchantVanilla [checked=minecraft:sharpness, level=7], EnchantVanilla [checked=minecraft:bane_of_arthropods, level=7], EnchantVanilla [checked=minecraft:mending, level=1]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll4 = new ArrayListHolder(
         Items.NETHERITE_SWORD.getDefaultStack(), "Меч Крушителя", ZenithInternal105$Helper.DrawContextImpl
      );
      list3.forEach(i1iiilll11l1llil1ll4::StringHolder_8);
      List list4 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=skilled, level=3], EnchantCustom [checked=smelting, level=1], EnchantCustom [checked=magnet, level=1], EnchantCustom [checked=pinger, level=1], EnchantCustom [checked=web, level=1], EnchantCustom [checked=buldozing, level=2], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:efficiency, level=10], EnchantVanilla [checked=minecraft:mending, level=1], EnchantVanilla [checked=minecraft:fortune, level=5]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll5 = new ArrayListHolder(
         Items.NETHERITE_PICKAXE.getDefaultStack(), "Кирка Крушителя", ZenithInternal105$Helper.DrawContextImpl
      );
      list4.forEach(i1iiilll11l1llil1ll5::StringHolder_8);
      List list5 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantVanilla [checked=minecraft:unbreaking, level=3], EnchantVanilla [checked=minecraft:mending, level=1], EnchantVanilla [checked=minecraft:multishot, level=1], EnchantVanilla [checked=minecraft:piercing, level=5], EnchantVanilla [checked=minecraft:quick_charge, level=3]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll6 = new ArrayListHolder(
         Items.CROSSBOW.getDefaultStack(), "Арбалет Крушителя", ZenithInternal105$Helper.DrawContextImpl
      );
      list5.forEach(i1iiilll11l1llil1ll6::StringHolder_8);
      List list6 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=detection, level=3], EnchantCustom [checked=poison, level=3], EnchantCustom [checked=demolishing, level=1], EnchantCustom [checked=returning, level=1], EnchantCustom [checked=oxidation, level=2], EnchantCustom [checked=pulling, level=2], EnchantCustom [checked=stupor, level=3], EnchantCustom [checked=vampirism, level=2], EnchantCustom [checked=skilled, level=3], EnchantCustom [checked=scout, level=3], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:fire_aspect, level=2], EnchantVanilla [checked=minecraft:loyalty, level=3], EnchantVanilla [checked=minecraft:impaling, level=5], EnchantVanilla [checked=minecraft:channeling, level=1], EnchantVanilla [checked=minecraft:sharpness, level=7], EnchantVanilla [checked=minecraft:mending, level=1]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll7 = new ArrayListHolder(
         Items.TRIDENT.getDefaultStack(), "Трезубец Крушителя", ZenithInternal105$Helper.DrawContextImpl
      );
      list6.forEach(i1iiilll11l1llil1ll7::StringHolder_8);
      ItemStack ItemStackxxxxxxxxxx = Items.SPLASH_POTION.getDefaultStack();
      ItemStackxxxxxxxxxx.set(
         DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(214, 0, 191).getRGB()), List.of(), Optional.empty())
      );
      ZenithInternal016 i1i1li1illl1i1il = new ZenithInternal016(
         ItemStackxxxxxxxxxx,
         "Зелье Медика",
         ZenithInternal105$Helper.DrawContextImpl,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:2b,duration:900,id:\"minecraft:health_boost\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:2b,duration:900,id:\"minecraft:regeneration\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack ItemStackx = Items.SPLASH_POTION.getDefaultStack();
      ItemStackx.set(
         DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(11, 188, 4).getRGB()), List.of(), Optional.empty())
      );
      ZenithInternal016 i1i1li1illl1i1il1 = new ZenithInternal016(
         ItemStackx,
         "Зелье Победителя",
         ZenithInternal105$Helper.DrawContextImpl,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:1b,duration:3600,id:\"minecraft:health_boost\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:18000,id:\"minecraft:invisibility\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:1b,duration:1200,id:\"minecraft:regeneration\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:1200,id:\"minecraft:resistance\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack ItemStackxx = Items.SPLASH_POTION.getDefaultStack();
      ItemStackxx.set(
         DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(246, 250, 78).getRGB()), List.of(), Optional.empty())
      );
      ZenithInternal016 i1i1li1illl1i1il2 = new ZenithInternal016(
         ItemStackxx,
         "Зелье Агента",
         ZenithInternal105$Helper.DrawContextImpl,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:0b,duration:18000,id:\"minecraft:fire_resistance\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:3600,id:\"minecraft:haste\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:18000,id:\"minecraft:invisibility\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:2b,duration:18000,id:\"minecraft:speed\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:2b,duration:6000,id:\"minecraft:strength\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack ItemStackxxx = Items.SPLASH_POTION.getDefaultStack();
      ItemStackxxx.set(
         DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(135, 0, 0).getRGB()), List.of(), Optional.empty())
      );
      ZenithInternal016 i1i1li1illl1i1il3 = new ZenithInternal016(
         ItemStackxxx,
         "Зелье Киллера",
         ZenithInternal105$Helper.DrawContextImpl,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:0b,duration:3600,id:\"minecraft:resistance\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:3b,duration:1800,id:\"minecraft:strength\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack ItemStackxxxx = Items.SPLASH_POTION.getDefaultStack();
      ItemStackxxxx.set(
         DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(164, 252, 76).getRGB()), List.of(), Optional.empty())
      );
      ZenithInternal016 i1i1li1illl1i1il4 = new ZenithInternal016(
         ItemStackxxxx,
         "Серная кислота",
         ZenithInternal105$Helper.DrawContextImpl,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:1b,duration:1000,id:\"minecraft:poison\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:3b,duration:1800,id:\"minecraft:slowness\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:2b,duration:1800,id:\"minecraft:weakness\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:4b,duration:600,id:\"minecraft:wither\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack ItemStackxxxxx = Items.SPLASH_POTION.getDefaultStack();
      ItemStackxxxxx.set(
         DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(243, 59, 128).getRGB()), List.of(), Optional.empty())
      );
      ZenithInternal016 i1i1li1illl1i1il5 = new ZenithInternal016(
         ItemStackxxxxx,
         "Исцел",
         ZenithInternal105$Helper.DrawContextImpl,
         "custom_potion_effects",
         "[{ambient:1b,amplifier:1b,duration:1,id:\"minecraft:instant_health\",show_icon:1b,show_particles:1b},{ambient:1b,amplifier:0b,duration:600,id:\"minecraft:regeneration\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack ItemStackxxxxxx = Items.SPLASH_POTION.getDefaultStack();
      ItemStackxxxxxx.set(
         DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(16737792).getRGB()), List.of(), Optional.empty())
      );
      ZenithInternal016 i1i1li1illl1i1il6 = new ZenithInternal016(
         ItemStackxxxxxx, "Отрыжка", ZenithInternal105$Helper.DrawContextImpl, "CustomPotionColor", "16737792"
      );
      ItemStack ItemStackxxxxxxx = Items.TIPPED_ARROW.getDefaultStack();
      ItemStackxxxxxxx.set(
         DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(65535), List.of(), Optional.empty())
      );
      ZenithInternal016 i1i1li1illl1i1il7 = new ZenithInternal016(
         ItemStackxxxxxxx,
         "Ледяная стрела",
         ZenithInternal105$Helper.DrawContextImpl,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:50b,duration:100,id:\"minecraft:slowness\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:120,id:\"minecraft:weakness\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack ItemStackxxxxxxxx = Items.TIPPED_ARROW.getDefaultStack();
      ItemStackxxxxxxxx.set(DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(0), List.of(), Optional.empty()));
      ZenithInternal016 i1i1li1illl1i1il8 = new ZenithInternal016(
         ItemStackxxxxxxxx,
         "Проклятая стрела",
         ZenithInternal105$Helper.DrawContextImpl,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:0b,duration:40,id:\"minecraft:blindness\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:100,id:\"minecraft:nausea\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:200,id:\"minecraft:weakness\",show_icon:1b,show_particles:1b}]"
      );
      ZenithInternal016 i1i1li1illl1i1il9 = new ZenithInternal016(
         Items.DRIED_KELP.getDefaultStack(), "Пласт", ZenithInternal105$Helper.DrawContextImpl, "stratum", "1b"
      );
      ZenithInternal016 i1i1li1illl1i1il10 = new ZenithInternal016(
         Items.NETHERITE_SCRAP.getDefaultStack(), "Трапка", ZenithInternal105$Helper.DrawContextImpl, "trap", "1b"
      );
      ZenithInternal016 i1i1li1illl1i1il11 = new ZenithInternal016(
         Items.ENDER_EYE.getDefaultStack(), "Дезориентация", ZenithInternal105$Helper.DrawContextImpl, "desorientation", "1b"
      );
      ZenithInternal016 i1i1li1illl1i1il12 = new ZenithInternal016(
         Items.SUGAR.getDefaultStack(), "Явная пыль", ZenithInternal105$Helper.DrawContextImpl, "sheerdust", "1b"
      );
      ZenithInternal016 i1i1li1illl1i1il13 = new ZenithInternal016(
         Items.PHANTOM_MEMBRANE.getDefaultStack(), "Божья аура", ZenithInternal105$Helper.DrawContextImpl, "godsaura", "1b"
      );
      StringHolder_6 i1lil1ii11ll111l1li1il = new StringHolder_6(
         "Сфера Андромеды",
         ZenithInternal105$Helper.DrawContextImpl,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NTEwODQzNywKICAicHJvZmlsZUlkIiA6ICIzMjNiYjlkYzkwZWU0Nzk5YjUxYzE3NjRmZDRhNjI3OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOcGllIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ0ZmZlM2YzNThmMjA5YmFkOGZmZjRkYzQ4MjQ1ZDliYWYwYTAzMWIzYzFlZTZiNzU4NDYwYTMzOWIxNTE5ZTIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
      );
      StringHolder_6 i1lil1ii11ll111l1li1il1 = new StringHolder_6(
         "Сфера Пандоры",
         ZenithInternal105$Helper.DrawContextImpl,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NTY2NTExNCwKICAicHJvZmlsZUlkIiA6ICJkNzJlNGJjZDIyZGI0NjQ4OTUxNTc0M2UyYTRmMWFjMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJhdnZheSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84ZTUxZTY1ZWI0MDUyNzcyMzgyYzllNTA3YTU0YmRlZDQzZTM5Zjc1NWI1ZGRmNTViM2YzOTQ0M2NlZDQ2N2Y0IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
      );
      StringHolder_6 i1lil1ii11ll111l1li1il2 = new StringHolder_6(
         "Сфера Титана",
         ZenithInternal105$Helper.DrawContextImpl,
         "ewogICJ0aW1lc3RhbXAiIDogMTc1MDM1NDQ1NTE5MiwKICAicHJvZmlsZUlkIiA6ICJkOTcwYzEzZTM4YWI0NzlhOTY1OGM1ZDQ1MjZkMTM0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcmltcHlMYWNlODUxMjciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODFlOTY5ODQ1OGI3ODQxYzk2YWU0ZjI0ZWM4NGFlMDE3MjQxMDA2NDFjNTY0ZTJhN2IxODVmNDA2ZThlZDIzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
      );
      StringHolder_6 i1lil1ii11ll111l1li1il3 = new StringHolder_6(
         "Сфера Аполлона",
         ZenithInternal105$Helper.DrawContextImpl,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NjYyNTM0NywKICAicHJvZmlsZUlkIiA6ICJhMjk1ODZmYmU1ZDk0Nzk2OWZjOGQ4ZGE0NzlhNDNlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJMZXZlMjQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjQxMTdiNjAxOGZlZjBkNTE1NjcyMTczZTNiMjZlNjYwZDY1MWU1ODc2YmE2ZDAzZTUzNDIyNzBjNDliZWM4MCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
      );
      StringHolder_6 i1lil1ii11ll111l1li1il4 = new StringHolder_6(
         "Сфера Астрея",
         ZenithInternal105$Helper.DrawContextImpl,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NTA2MjQwNywKICAicHJvZmlsZUlkIiA6ICJlMzcxMWU2Y2E0ZmY0NzA4YjY5ZjhiNGZlYzNhZjdhMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNckJ1cnN0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFhNWFhZGQ1MmE1ZmFiOTcwODgxNDUxYWRmNTZmYmI0OTNhMzU4NTZlYTk2ZjU0ZTMyZWVhNjYyZDc4N2VkMjAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
      );
      StringHolder_6 i1lil1ii11ll111l1li1il5 = new StringHolder_6(
         "Сфера Осириса",
         ZenithInternal105$Helper.DrawContextImpl,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NjY2Mzg3NiwKICAicHJvZmlsZUlkIiA6ICI3NGEwMzQxNWY1OTI0ZTA4YjMyMGM2MmU1NGE3ZjJhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNZXp6aXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDgxMzYzNWJkODZiMTcxYmJlMTQzYWQ3MWUwOTAyMjkyNjQ5Y2IzYWI4NDQwZWQwMGY4NWNhNmNhMzgyOTkzNiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
      );
      StringHolder_6 i1lil1ii11ll111l1li1il6 = new StringHolder_6(
         "Сфера Химеры",
         ZenithInternal105$Helper.DrawContextImpl,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NjE4MTEwOSwKICAicHJvZmlsZUlkIiA6ICJiNzRiMGQzNTBkNTk0NTU4YmYyYjBlMDJlYmE4NjE4NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJCcmFuZG9uYnBtMjg0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzlmYWJlZWQ0MjRiMjUyYTg5NDVhNjQ0MmI0NjJkNWYzMTQ3MDFhODE2ZGEyZDBhNjljY2RmY2ZkNzQ2ZTU4OGUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
      );
      ZenithInternal016 i1i1li1illl1i1il14 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман Грани",
         ZenithInternal105$Helper.DrawContextImpl,
         "AttributeModifiers",
         "[{Amount:-4.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"максимальное здоровье\",Operation:0,Slot:\"offhand\",UUID:[I;-1243469000,-221950864,-1992446485,-2021417908]},{Amount:0.15d,AttributeName:\"minecraft:generic.movement_speed\",Name:\"скорость\",Operation:1,Slot:\"offhand\",UUID:[I;421185474,-1675802507,-1302866561,493632362]},{Amount:3.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"сила\",Operation:0,Slot:\"offhand\",UUID:[I;1519226946,1096501307,-1211766788,1772678932]}]"
      );
      ZenithInternal016 i1i1li1illl1i1il15 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман Дедала",
         ZenithInternal105$Helper.DrawContextImpl,
         "AttributeModifiers",
         "[{Amount:-4.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"максимальное здоровье\",Operation:0,Slot:\"offhand\",UUID:[I;359257458,1778207792,-1338766924,848576712]},{Amount:5.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"сила\",Operation:0,Slot:\"offhand\",UUID:[I;-1723975978,-172144109,-1549361344,1422474545]}]"
      );
      ZenithInternal016 i1i1li1illl1i1il16 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман Тритона",
         ZenithInternal105$Helper.DrawContextImpl,
         "AttributeModifiers",
         "[{Amount:2.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"максимальное здоровье\",Operation:0,Slot:\"offhand\",UUID:[I;1523385351,-602324415,-1760945561,-270836422]},{Amount:-2.0d,AttributeName:\"minecraft:generic.armor_toughness\",Name:\"твёрдость брони\",Operation:0,Slot:\"offhand\",UUID:[I;1017626540,670256083,-1935748919,-786940866]},{Amount:2.0d,AttributeName:\"minecraft:generic.armor\",Name:\"броня\",Operation:0,Slot:\"offhand\",UUID:[I;1409389356,857884230,-1271577328,-932163262]}]"
      );
      ZenithInternal016 i1i1li1illl1i1il17 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман Гармонии",
         ZenithInternal105$Helper.DrawContextImpl,
         "AttributeModifiers",
         "[{Amount:2.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"максимальное здоровье\",Operation:0,Slot:\"offhand\",UUID:[I;1253805553,182601342,-1805352146,-1397322752]},{Amount:2.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"сила\",Operation:0,Slot:\"offhand\",UUID:[I;1648014473,711805426,-1962672765,-537567144]},{Amount:2.0d,AttributeName:\"minecraft:generic.armor\",Name:\"броня\",Operation:0,Slot:\"offhand\",UUID:[I;-432853915,2131774585,-1617568671,-621826558]}]"
      );
      ZenithInternal016 i1i1li1illl1i1il18 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман Феникса",
         ZenithInternal105$Helper.DrawContextImpl,
         "AttributeModifiers",
         "[{Amount:6.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"максимальное здоровье\",Operation:0,Slot:\"offhand\",UUID:[I;587791282,-2058138192,-2013554380,1529824133]},{Amount:0.1d,AttributeName:\"minecraft:generic.attack_speed\",Name:\"скорость атаки\",Operation:1,Slot:\"offhand\",UUID:[I;233538602,1321813146,-1704635325,1580943681]}]"
      );
      ZenithInternal016 i1i1li1illl1i1il19 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман Ехидны",
         ZenithInternal105$Helper.DrawContextImpl,
         "AttributeModifiers",
         "[{Amount:-4.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"максимальное здоровье\",Operation:0,Slot:\"offhand\",UUID:[I;951469257,944390782,-1639200535,1882164017]},{Amount:6.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"сила\",Operation:0,Slot:\"offhand\",UUID:[I;955551735,1646086503,-2027411701,279678977]},{Amount:-2.0d,AttributeName:\"minecraft:generic.armor_toughness\",Name:\"твёрдость брони\",Operation:0,Slot:\"offhand\",UUID:[I;1301352305,-411349527,-1975888927,1331290909]},{Amount:-2.0d,AttributeName:\"minecraft:generic.armor\",Name:\"броня\",Operation:0,Slot:\"offhand\",UUID:[I;-1591608852,-1821816734,-1777269705,-1095126461]}]"
      );
      ZenithInternal016 i1i1li1illl1i1il20 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман Крушителя",
         ZenithInternal105$Helper.DrawContextImpl,
         "AttributeModifiers",
         "[{Amount:4.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"максимальное здоровье\",Operation:0,Slot:\"offhand\",UUID:[I;-2029680951,-1707392264,-1958707995,-389772071]},{Amount:3.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"сила\",Operation:0,Slot:\"offhand\",UUID:[I;430632003,-1617212859,-1216331408,-1833541566]},{Amount:2.0d,AttributeName:\"minecraft:generic.armor_toughness\",Name:\"твёрдость брони\",Operation:0,Slot:\"offhand\",UUID:[I;-1348659832,-1401469259,-1365362331,376666792]},{Amount:2.0d,AttributeName:\"minecraft:generic.armor\",Name:\"броня\",Operation:0,Slot:\"offhand\",UUID:[I;897201681,1928088706,-1491637188,-648449433]}]"
      );
      ZenithInternal016 i1i1li1illl1i1il21 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман Карателя",
         ZenithInternal105$Helper.DrawContextImpl,
         "AttributeModifiers",
         "[{Amount:7.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"сила\",Operation:0,Slot:\"offhand\",UUID:[I;-1651993925,-1873589036,-2067416271,-818067434]},{Amount:-4.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"максимальное здоровье\",Operation:0,Slot:\"offhand\",UUID:[I;-473822740,-120697814,-1795206788,-16471115]},{Amount:0.1d,AttributeName:\"minecraft:generic.movement_speed\",Name:\"скорость\",Operation:1,Slot:\"offhand\",UUID:[I;1026697411,-1939651121,-2079096398,-1055446047]}]"
      );
      this.SimpleFramebufferHolder.add(i1iiilll11l1llil1ll);
      this.SimpleFramebufferHolder.add(i1iiilll11l1llil1ll1);
      this.SimpleFramebufferHolder.add(i1iiilll11l1llil1ll2);
      this.SimpleFramebufferHolder.add(i1iiilll11l1llil1ll3);
      this.SimpleFramebufferHolder.add(i1iiilll11l1llil1ll4);
      this.SimpleFramebufferHolder.add(i1iiilll11l1llil1ll5);
      this.SimpleFramebufferHolder.add(i1iiilll11l1llil1ll6);
      this.SimpleFramebufferHolder.add(i1iiilll11l1llil1ll7);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il1);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il2);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il3);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il4);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il5);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il7);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il8);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il6);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il9);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il10);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il11);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il12);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il13);
      this.SimpleFramebufferHolder.add(i1lil1ii11ll111l1li1il);
      this.SimpleFramebufferHolder.add(i1lil1ii11ll111l1li1il1);
      this.SimpleFramebufferHolder.add(i1lil1ii11ll111l1li1il2);
      this.SimpleFramebufferHolder.add(i1lil1ii11ll111l1li1il3);
      this.SimpleFramebufferHolder.add(i1lil1ii11ll111l1li1il4);
      this.SimpleFramebufferHolder.add(i1lil1ii11ll111l1li1il5);
      this.SimpleFramebufferHolder.add(i1lil1ii11ll111l1li1il6);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il14);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il15);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il16);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il17);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il18);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il19);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il20);
      this.SimpleFramebufferHolder.add(i1i1li1illl1i1il21);
      this.ZenithInternal004
         .add(
            new GetDisplayNameHandler_2(
               Items.ENCHANTED_GOLDEN_APPLE.getDefaultStack(), "Зачарованное золотое яблоко", ZenithInternal105$Helper.ZenithInternal027
            )
         );
      this.ZenithInternal004
         .add(new GetDisplayNameHandler_2(Items.GOLDEN_APPLE.getDefaultStack(), "Золотое яблоко", ZenithInternal105$Helper.ZenithInternal027));
      this.ZenithInternal004
         .add(new GetDisplayNameHandler_2(Items.FIREWORK_ROCKET.getDefaultStack(), "Фейерверк", ZenithInternal105$Helper.ZenithInternal027));
      this.ZenithInternal004
         .add(new GetDisplayNameHandler_2(Items.GOLDEN_CARROT.getDefaultStack(), "Золотая морковь", ZenithInternal105$Helper.ZenithInternal027));
      this.ZenithInternal004
         .add(new GetDisplayNameHandler_2(Items.ENDER_PEARL.getDefaultStack(), "Эндер жемчуг", ZenithInternal105$Helper.ZenithInternal027));
      this.ZenithInternal004
         .add(new GetDisplayNameHandler_2(Items.CHORUS_FRUIT.getDefaultStack(), "Плод хоруса", ZenithInternal105$Helper.ZenithInternal027));
      this.ZenithInternal004
         .add(new GetDisplayNameHandler_2(Items.TOTEM_OF_UNDYING.getDefaultStack(), "Тотем бессмертия", ZenithInternal105$Helper.ZenithInternal027));
      this.ZenithInternal004
         .add(new GetDisplayNameHandler_2(Items.EXPERIENCE_BOTTLE.getDefaultStack(), "Пузырёк опыта", ZenithInternal105$Helper.ZenithInternal027));
      this.ZenithInternal004
         .add(new GetDisplayNameHandler_2(Items.ELYTRA.getDefaultStack(), "Элитры", ZenithInternal105$Helper.ZenithInternal027));
      this.ZenithInternal004
         .add(
            new RegistryEntryHolder(
               Items.POTION, Potions.TURTLE_MASTER, "Зелье черепашьей мощи", ZenithInternal105$Helper.IdentifierHolder_2
            )
         );
      this.ZenithInternal004
         .add(
            new GetDisplayNameHandler_2(Items.CONDUIT.getDefaultStack(), "Артефакт", ZenithInternal105$Helper.IdentifierHolder_2)
         );
      list = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=2], EnchantCustom [checked=minecraft:aqua_affinity, level=1], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:respiration, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:aqua_affinity, level=1], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:respiration, level=3], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      i1iiilll11l1llil1ll = new ArrayListHolder(
         Items.NETHERITE_HELMET.getDefaultStack(), "Шлем infinity", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list.forEach(i1iiilll11l1llil1ll::StringHolder_8);
      list1 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=2], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5]]"
      );
      i1iiilll11l1llil1ll1 = new ArrayListHolder(
         Items.NETHERITE_CHESTPLATE.getDefaultStack(), "Нагрудник infinity", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list1.forEach(i1iiilll11l1llil1ll1::StringHolder_8);
      List list7 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=2], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll8 = new ArrayListHolder(
         Items.NETHERITE_LEGGINGS.getDefaultStack(), "Штаны infinity", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list7.forEach(i1iiilll11l1llil1ll8::StringHolder_8);
      List list8 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=2], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:depth_strider, level=3], EnchantCustom [checked=minecraft:feather_falling, level=4], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:soul_speed, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:depth_strider, level=3], EnchantVanilla [checked=minecraft:feather_falling, level=4], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:soul_speed, level=3], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll9 = new ArrayListHolder(
         Items.NETHERITE_BOOTS.getDefaultStack(), "Ботинки infinity", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list8.forEach(i1iiilll11l1llil1ll9::StringHolder_8);
      List list9 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=1], EnchantCustom [checked=minecraft:aqua_affinity, level=1], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:respiration, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:aqua_affinity, level=1], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:respiration, level=3], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll10 = new ArrayListHolder(
         Items.NETHERITE_HELMET.getDefaultStack(), "Шлем eternity", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list9.forEach(i1iiilll11l1llil1ll10::StringHolder_8);
      List list10 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=1], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll11 = new ArrayListHolder(
         Items.NETHERITE_CHESTPLATE.getDefaultStack(), "Нагрудник eternity", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list10.forEach(i1iiilll11l1llil1ll11::StringHolder_8);
      i1iiilll11l1llil1ll6 = new ArrayListHolder(
         Items.NETHERITE_LEGGINGS.getDefaultStack(), "Штаны eternity", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list10.forEach(i1iiilll11l1llil1ll6::StringHolder_8);
      list6 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:depth_strider, level=3], EnchantCustom [checked=minecraft:feather_falling, level=4], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:soul_speed, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:depth_strider, level=3], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:soul_speed, level=3], EnchantVanilla [checked=minecraft:feather_falling, level=4]]"
      );
      i1iiilll11l1llil1ll7 = new ArrayListHolder(
         Items.NETHERITE_BOOTS.getDefaultStack(), "Ботинки eternity", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list6.forEach(i1iiilll11l1llil1ll7::StringHolder_8);
      ZenithInternal016 i1i1li1illl1i1il43 = new ZenithInternal016(
         Items.GOLDEN_HELMET.getDefaultStack(), "Шлем Солнца", ZenithInternal105$Helper.IdentifierHolder_2, "kringeItems", "SunHelmet"
      );
      List list11 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=enchantments:critical-enchant-custom, level=2], EnchantCustom [checked=enchantments:destroyer-enchant-custom, level=2], EnchantCustom [checked=enchantments:rich-enchant-custom, level=1], EnchantCustom [checked=minecraft:bane_of_arthropods, level=7], EnchantCustom [checked=minecraft:fire_aspect, level=2], EnchantCustom [checked=minecraft:looting, level=5], EnchantCustom [checked=minecraft:sharpness, level=7], EnchantCustom [checked=minecraft:smite, level=7], EnchantCustom [checked=minecraft:sweeping, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:sweeping_edge, level=3], EnchantVanilla [checked=minecraft:bane_of_arthropods, level=7], EnchantVanilla [checked=minecraft:looting, level=5], EnchantVanilla [checked=minecraft:sharpness, level=7], EnchantVanilla [checked=minecraft:fire_aspect, level=2], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:smite, level=7]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll12 = new ArrayListHolder(
         Items.NETHERITE_SWORD.getDefaultStack(), "Меч eternity", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list11.forEach(i1iiilll11l1llil1ll12::StringHolder_8);
      List list12 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=enchantments:drill-enchant-custom, level=2], EnchantCustom [checked=enchantments:exp-enchant-custom, level=3], EnchantCustom [checked=enchantments:filter-enchant-custom, level=1], EnchantCustom [checked=enchantments:foundry-enchant-custom, level=1], EnchantCustom [checked=enchantments:internal-enchant-custom, level=1], EnchantCustom [checked=enchantments:magnet-enchant-custom, level=1], EnchantCustom [checked=minecraft:efficiency, level=10], EnchantCustom [checked=minecraft:fortune, level=5], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:efficiency, level=10], EnchantVanilla [checked=minecraft:fortune, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll13 = new ArrayListHolder(
         Items.NETHERITE_PICKAXE.getDefaultStack(), "Кирка eternity", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list12.forEach(i1iiilll11l1llil1ll13::StringHolder_8);
      List list13 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=enchantments:stun-enchant-custom, level=2], EnchantCustom [checked=minecraft:multishot, level=1], EnchantCustom [checked=minecraft:piercing, level=5], EnchantCustom [checked=minecraft:quick_charge, level=3], EnchantCustom [checked=minecraft:unbreaking, level=3], EnchantVanilla [checked=minecraft:multishot, level=1], EnchantVanilla [checked=minecraft:piercing, level=5], EnchantVanilla [checked=minecraft:quick_charge, level=3], EnchantVanilla [checked=minecraft:unbreaking, level=3]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll14 = new ArrayListHolder(
         Items.CROSSBOW.getDefaultStack(), "Арбалет eternity", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list13.forEach(i1iiilll11l1llil1ll14::StringHolder_8);
      List list14 = ZenithInternal153.GetPayloadLengthHandler(
         "[EnchantCustom [checked=minecraft:impaling, level=5], EnchantCustom [checked=minecraft:looting, level=5], EnchantCustom [checked=minecraft:loyalty, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:loyalty, level=3], EnchantVanilla [checked=minecraft:looting, level=5], EnchantVanilla [checked=minecraft:impaling, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      ArrayListHolder i1iiilll11l1llil1ll15 = new ArrayListHolder(
         Items.TRIDENT.getDefaultStack(), "Громовержец", ZenithInternal105$Helper.IdentifierHolder_2
      );
      list14.forEach(i1iiilll11l1llil1ll15::StringHolder_8);
      i1i1li1illl1i1il4 = new ZenithInternal016(
         Items.NETHERITE_SWORD.getDefaultStack(), "Фармер", ZenithInternal105$Helper.IdentifierHolder_2, "RepairCost", "Фармер"
      );
      ZenithInternal016 i1i1li1illl1i1il44 = new ZenithInternal016(
         Items.ELYTRA.getDefaultStack(),
         "Броневая элитра",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "kringeItems",
         "ArmorElytra"
      );
      i1i1li1illl1i1il5 = new ZenithInternal016(
         Items.MAGENTA_SHULKER_BOX.getDefaultStack(),
         "Рюкзак 4 уровень",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "PublicBukkitValues",
         "litebackpacks:backpack"
      );
      ZenithInternal016 i1i1li1illl1i1il45 = new ZenithInternal016(
         Items.RED_SHULKER_BOX.getDefaultStack(),
         "Рюкзак 3 уровень",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "PublicBukkitValues",
         "litebackpacks:backpack"
      );
      i1i1li1illl1i1il6 = new ZenithInternal016(
         Items.LIGHT_BLUE_SHULKER_BOX.getDefaultStack(),
         "Рюкзак 2 уровень",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "PublicBukkitValues",
         "litebackpacks:backpack"
      );
      ZenithInternal016 i1i1li1illl1i1il46 = new ZenithInternal016(
         Items.PINK_SHULKER_BOX.getDefaultStack(),
         "Рюкзак 1 уровень",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "PublicBukkitValues",
         "litebackpacks:backpack"
      );
      i1i1li1illl1i1il7 = new ZenithInternal016(
         Items.EXPERIENCE_BOTTLE.getDefaultStack(),
         "Пузырек с 50 уровнем",
         "50",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "holy-exp-bottle-value",
         "5345"
      );
      ZenithInternal016 i1i1li1illl1i1il47 = new ZenithInternal016(
         Items.EXPERIENCE_BOTTLE.getDefaultStack(), "Пузырь опыта", ZenithInternal105$Helper.IdentifierHolder_2, "kringeItems", "ExpBottle"
      );
      i1i1li1illl1i1il8 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман Сатиры",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":2,\"nbtName\":\"hms-rush\"},{\"lvl\":3,\"nbtName\":\"hms-damage\"}"
      );
      i1i1li1illl1i1il9 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман infinity",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":2,\"nbtName\":\"hms-speed\"},{\"lvl\":2,\"nbtName\":\"hms-health\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"}"
      );
      i1i1li1illl1i1il10 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман eternity",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":2,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-speed\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"}"
      );
      i1i1li1illl1i1il11 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Талисман stinger",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":2,\"nbtName\":\"hms-damage\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"},{\"lvl\":1,\"nbtName\":\"hms-speed\"}"
      );
      i1i1li1illl1i1il12 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Мифический талисман на урон 3 броню 2",
         "Мифический талисман",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-damage\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"}"
      );
      i1i1li1illl1i1il13 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Мифический талисман на броню 3 урон 2",
         "Мифический талисман",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"}"
      );
      ZenithInternal016 i1i1li1illl1i1il48 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Мифический талисман на броню 3 скорость 2",
         "Мифический талисман",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-speed\"}"
      );
      ZenithInternal016 i1i1li1illl1i1il49 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Легендарный талисман на урон 3",
         "Сфера на урон 3",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-damage\"}"
      );
      ZenithInternal016 i1i1li1illl1i1il50 = new ZenithInternal016(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "Легендарный талисман на скорость 3",
         "Сфера на скорость 3",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-speed\"}"
      );
      i1lil1ii11ll111l1li1il3 = new StringHolder_6(
         "Сфера Цербера",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjA5NWE3ZmQ5MGRhYTFiYmU3MDY5MDg5NzQwZTA1ZDBiZmM2NjI5NmVlM2M0MGVlNzFhNGUwYTY2MTZiMmJiYyJ9fX0="
      );
      i1lil1ii11ll111l1li1il4 = new StringHolder_6(
         "Сфера Флеша",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzc0MDBlYTE5ZGJkODRmNzVjMzlhZDY4MjNhYzRlZjc4NmYzOWY0OGZjNmY4NDYwMjM2NmFjMjliODM3NDIyIn19fQ=="
      );
      i1lil1ii11ll111l1li1il5 = new StringHolder_6(
         "Сфера Имморталити",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODNlZDRjZTIzOTMzZTY2ZTA0ZGYxNjA3MDY0NGY3NTk5ZWViNTUzMDdmN2VhZmU4ZDkyZjQwZmIzNTIwODYzYyJ9fX0="
      );
      i1lil1ii11ll111l1li1il6 = new StringHolder_6(
         "Сфера Арморталити",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWE2MmI5ZGU2YTI2Yjg2ODY5Y2EyMmVhNDBmMWJkZTgwYTA0MzBhNTQ1NDdiZWNjZThmZGE4NzA3Nzc3MjU4ZiJ9fX0="
      );
      ItemStack ItemStackxxxxxxxxx = new StringHolder_6(
            "",
            ZenithInternal105$Helper.IdentifierHolder_2,
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19"
         )
         .getItemStack();
      i1i1li1illl1i1il15 = new ZenithInternal016(
         ItemStackxxxxxxxxx,
         "Сфера на урон 3",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-damage\"}"
      );
      i1i1li1illl1i1il16 = new ZenithInternal016(
         ItemStackxxxxxxxxx,
         "Сфера на Скорость 3",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-speed\"}"
      );
      i1i1li1illl1i1il17 = new ZenithInternal016(
         ItemStackxxxxxxxxx,
         "Сфера eternity",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":2,\"nbtName\":\"hms-speed\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"}"
      );
      i1i1li1illl1i1il18 = new ZenithInternal016(
         ItemStackxxxxxxxxx,
         "Сфера stinger",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":1,\"nbtName\":\"hms-speed\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"}"
      );
      ItemStack ItemStackxxxxxxxxxx = new StringHolder_6(
            "",
            ZenithInternal105$Helper.IdentifierHolder_2,
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmFmZjJlYjQ5OGU1YzZhMDQ0ODRmMGM5Zjc4NWI0NDg0NzlhYjIxM2RmOTVlYzkxMTc2YTMwOGExMmFkZDcwIn19fQ=="
         )
         .getItemStack();
      i1i1li1illl1i1il20 = new ZenithInternal016(
         ItemStackxxxxxxxxxx,
         "Мифическая сфера на урон 3 броню 2",
         "Мифическая сфера",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-damage\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"}"
      );
      i1i1li1illl1i1il21 = new ZenithInternal016(
         ItemStackxxxxxxxxxx,
         "Мифическая сфера на броню 3 урон 2",
         "Мифическая сфера",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"}"
      );
      ZenithInternal016 i1i1li1illl1i1il22 = new ZenithInternal016(
         ItemStackxxxxxxxxxx,
         "Мифическая сфера на броню 3 скорость 2",
         "Мифическая сфера",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-speed\"}"
      );
      ZenithInternal016 i1i1li1illl1i1il23 = new ZenithInternal016(
         Items.POTION.getDefaultStack(),
         "Улучшенное зелье силы",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "custom_potion_effects",
         "minecraft:strength"
      );
      ZenithInternal016 i1i1li1illl1i1il24 = new ZenithInternal016(
         Items.POTION.getDefaultStack(),
         "Улучшенное зелье скорости",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "custom_potion_effects",
         "minecraft:speed"
      );
      ZenithInternal016 i1i1li1illl1i1il25 = new ZenithInternal016(
         Items.POTION.getDefaultStack(),
         "Зелье Победителя",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "kringeItems",
         "win-potion"
      );
      ZenithInternal016 i1i1li1illl1i1il26 = new ZenithInternal016(
         Items.POTION.getDefaultStack(),
         "Зелье исцеления 2",
         "Зелье исцеление",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "Potion",
         "minecraft:strong_healing"
      );
      ZenithInternal016 i1i1li1illl1i1il27 = new ZenithInternal016(
         Items.POPPED_CHORUS_FRUIT.getDefaultStack(),
         "Трапка",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "pyrotechnic-item",
         "ALTERNATIVE_TRAP"
      );
      ZenithInternal016 i1i1li1illl1i1il28 = new ZenithInternal016(
         Items.PRISMARINE_SHARD.getDefaultStack(),
         "Взрывная Трапка",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "pyrotechnic-item",
         "EXPLOSIVE_TRAP"
      );
      ZenithInternal016 i1i1li1illl1i1il29 = new ZenithInternal016(
         Items.NETHER_STAR.getDefaultStack(), "Стан", ZenithInternal105$Helper.IdentifierHolder_2, "pyrotechnic-item", "STUN_STAR"
      );
      ZenithInternal016 i1i1li1illl1i1il30 = new ZenithInternal016(
         Items.SNOWBALL.getDefaultStack(), "Ком снега", ZenithInternal105$Helper.IdentifierHolder_2, "kringeItems", "SnowBall"
      );
      ZenithInternal016 i1i1li1illl1i1il31 = new ZenithInternal016(
         Items.FIRE_CHARGE.getDefaultStack(),
         "Взрывная штучка",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "kringeItems",
         "ExplosiveStuff"
      );
      ZenithInternal016 i1i1li1illl1i1il32 = new ZenithInternal016(
         Items.ORANGE_DYE.getDefaultStack(),
         "Руна Бессмертие",
         "Бессмертие",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "PublicBukkitValues",
         "literunes:rune-id"
      );
      ZenithInternal016 i1i1li1illl1i1il33 = new ZenithInternal016(
         Items.DIAMOND_SWORD.getDefaultStack(), "Охотник", ZenithInternal105$Helper.IdentifierHolder_2, "kringeEffect", "EXP_DROPPER"
      );
      ZenithInternal016 i1i1li1illl1i1il34 = new ZenithInternal016(
         Items.SNOW_BLOCK.getDefaultStack(), "Снеговик", ZenithInternal105$Helper.IdentifierHolder_2, "kringeEffect", "BLINDNESS"
      );
      ZenithInternal016 i1i1li1illl1i1il35 = new ZenithInternal016(
         Items.SEA_LANTERN.getDefaultStack(), "Иллюминатор", ZenithInternal105$Helper.IdentifierHolder_2, "kringeEffect", "PORTHOLE"
      );
      ZenithInternal016 i1i1li1illl1i1il36 = new ZenithInternal016(
         Items.ENDER_PEARL.getDefaultStack(), "Эндермен", ZenithInternal105$Helper.IdentifierHolder_2, "kringeEffect", "ENDERMAN"
      );
      ZenithInternal016 i1i1li1illl1i1il37 = new ZenithInternal016(
         Items.PHANTOM_MEMBRANE.getDefaultStack(),
         "Анти Фантом",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "kringeEffect",
         "ANTI_PHANTOM"
      );
      ZenithInternal016 i1i1li1illl1i1il38 = new ZenithInternal016(
         Items.HONEY_BLOCK.getDefaultStack(),
         "Телекинез",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "kringeEffect",
         "TELEKINESIS"
      );
      ZenithInternal016 i1i1li1illl1i1il39 = new ZenithInternal016(
         Items.FEATHER.getDefaultStack(), "Гравитация", ZenithInternal105$Helper.IdentifierHolder_2, "kringeEffect", "GRAVITY"
      );
      ZenithInternal016 i1i1li1illl1i1il40 = new ZenithInternal016(
         Items.WITHER_SKELETON_SKULL.getDefaultStack(), "Вампиризм", ZenithInternal105$Helper.IdentifierHolder_2, "kringeEffect", "VAMPIRISM"
      );
      ZenithInternal016 i1i1li1illl1i1il41 = new ZenithInternal016(
         Items.POTION.getDefaultStack(),
         "Справедливость",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "kringeEffect",
         "JUSTICE"
      );
      ZenithInternal016 i1i1li1illl1i1il42 = new ZenithInternal016(
         Items.TRIPWIRE_HOOK.getDefaultStack(),
         "Универсальный ключ",
         ZenithInternal105$Helper.IdentifierHolder_2,
         "CustomModelData",
         "123433"
      );
      this.floatHolder_13.add(i1iiilll11l1llil1ll);
      this.floatHolder_13.add(i1iiilll11l1llil1ll1);
      this.floatHolder_13.add(i1iiilll11l1llil1ll8);
      this.floatHolder_13.add(i1iiilll11l1llil1ll9);
      this.floatHolder_13.add(i1iiilll11l1llil1ll10);
      this.floatHolder_13.add(i1iiilll11l1llil1ll11);
      this.floatHolder_13.add(i1iiilll11l1llil1ll6);
      this.floatHolder_13.add(i1iiilll11l1llil1ll7);
      this.floatHolder_13.add(i1i1li1illl1i1il43);
      this.floatHolder_13.add(i1i1li1illl1i1il44);
      this.floatHolder_13.add(i1iiilll11l1llil1ll12);
      this.floatHolder_13.add(i1iiilll11l1llil1ll13);
      this.floatHolder_13.add(i1iiilll11l1llil1ll14);
      this.floatHolder_13.add(i1iiilll11l1llil1ll15);
      this.floatHolder_13.add(i1lil1ii11ll111l1li1il3);
      this.floatHolder_13.add(i1lil1ii11ll111l1li1il4);
      this.floatHolder_13.add(i1lil1ii11ll111l1li1il5);
      this.floatHolder_13.add(i1lil1ii11ll111l1li1il6);
      this.floatHolder_13.add(i1i1li1illl1i1il20);
      this.floatHolder_13.add(i1i1li1illl1i1il21);
      this.floatHolder_13.add(i1i1li1illl1i1il22);
      this.floatHolder_13.add(i1i1li1illl1i1il15);
      this.floatHolder_13.add(i1i1li1illl1i1il16);
      this.floatHolder_13.add(i1i1li1illl1i1il17);
      this.floatHolder_13.add(i1i1li1illl1i1il18);
      this.floatHolder_13.add(i1i1li1illl1i1il8);
      this.floatHolder_13.add(i1i1li1illl1i1il9);
      this.floatHolder_13.add(i1i1li1illl1i1il10);
      this.floatHolder_13.add(i1i1li1illl1i1il11);
      this.floatHolder_13.add(i1i1li1illl1i1il12);
      this.floatHolder_13.add(i1i1li1illl1i1il13);
      this.floatHolder_13.add(i1i1li1illl1i1il48);
      this.floatHolder_13.add(i1i1li1illl1i1il49);
      this.floatHolder_13.add(i1i1li1illl1i1il50);
      this.floatHolder_13.add(i1i1li1illl1i1il23);
      this.floatHolder_13.add(i1i1li1illl1i1il24);
      this.floatHolder_13.add(i1i1li1illl1i1il26);
      this.floatHolder_13.add(i1i1li1illl1i1il25);
      this.floatHolder_13.add(i1i1li1illl1i1il7);
      this.floatHolder_13.add(i1i1li1illl1i1il5);
      this.floatHolder_13.add(i1i1li1illl1i1il45);
      this.floatHolder_13.add(i1i1li1illl1i1il6);
      this.floatHolder_13.add(i1i1li1illl1i1il46);
      this.floatHolder_13.add(i1i1li1illl1i1il27);
      this.floatHolder_13.add(i1i1li1illl1i1il28);
      this.floatHolder_13.add(i1i1li1illl1i1il29);
      this.floatHolder_13.add(i1i1li1illl1i1il31);
      this.floatHolder_13.add(i1i1li1illl1i1il30);
      this.floatHolder_13.add(i1i1li1illl1i1il32);
      this.floatHolder_13.add(i1i1li1illl1i1il47);
      this.floatHolder_13.add(i1i1li1illl1i1il33);
      this.floatHolder_13.add(i1i1li1illl1i1il34);
      this.floatHolder_13.add(i1i1li1illl1i1il35);
      this.floatHolder_13.add(i1i1li1illl1i1il36);
      this.floatHolder_13.add(i1i1li1illl1i1il37);
      this.floatHolder_13.add(i1i1li1illl1i1il38);
      this.floatHolder_13.add(i1i1li1illl1i1il39);
      this.floatHolder_13.add(i1i1li1illl1i1il40);
      this.floatHolder_13.add(i1i1li1illl1i1il41);
      this.floatHolder_13.add(i1i1li1illl1i1il42);
      this.floatHolder_13.add(i1i1li1illl1i1il4);
      this.StringHolder_3
         .add(new GetDisplayNameHandler_2(Items.GUNPOWDER.getDefaultStack(), "Порох", ZenithInternal105$Helper.ZenithInternal027));
      this.StringHolder_3
         .add(
            new ZenithInternal016(
               Items.PRISMARINE_CRYSTALS.getDefaultStack(),
               "Боевой фрагмент",
               ZenithInternal105$Helper.IdentifierHolder_2,
               "kringeItems",
               "BattleFragment"
            )
         );
      this.StringHolder_3
         .add(
            new ZenithInternal016(
               Items.CLAY.getDefaultStack(),
               "Взрывчатое вещество",
               ZenithInternal105$Helper.IdentifierHolder_2,
               "pyrotechnic-item",
               "EXPLOSIVE_SUBSTANCE"
            )
         );
      this.StringHolder_3
         .add(
            new ZenithInternal016(
               Items.TNT.getDefaultStack(),
               "Динамит A",
               "динамит а",
               ZenithInternal105$Helper.IdentifierHolder_2,
               "pyrotechnic-item",
               "A"
            )
         );
      this.StringHolder_3
         .add(
            new ZenithInternal016(
               Items.GOLDEN_PICKAXE.getDefaultStack(),
               "Золотая кирка Джейка",
               ZenithInternal105$Helper.IdentifierHolder_2,
               "kringeItems",
               "jake-pickaxe"
            )
         );
      this.StringHolder_3
         .add(
            new GetDisplayNameHandler_2(
               Items.NETHERITE_INGOT.getDefaultStack(), "Незеритовый слиток", ZenithInternal105$Helper.IdentifierHolder_2
            )
         );
      this.StringHolder_3
         .add(
            new ZenithInternal016(
               Items.TNT.getDefaultStack(),
               "Динамит B",
               "динамит б",
               ZenithInternal105$Helper.IdentifierHolder_2,
               "pyrotechnic-item",
               "B"
            )
         );
      this.StringHolder_3
         .add(
            new StringHolder_6(
               "Осколок сферы",
               ZenithInternal105$Helper.IdentifierHolder_2,
               "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmY3YmJjZTIzZTgxNjJlNDJkMjA3MDU1YjBjZTkwZjBlZDU3YjAxNWU1MjEyMTM5YWM4ZmM3ZTZkNDVkZGZjYSJ9fX0="
            )
         );
      this.StringHolder_3
         .add(
            new ZenithInternal016(
               Items.TNT.getDefaultStack(),
               "Динамит B2",
               "динамит б2",
               ZenithInternal105$Helper.IdentifierHolder_2,
               "pyrotechnic-item",
               "B2"
            )
         );
      this.StringHolder_3
         .add(
            new ZenithInternal016(
               Items.TNT.getDefaultStack(),
               "С4 ВзРыВчАтКа",
               "с4 взрывчатка",
               ZenithInternal105$Helper.IdentifierHolder_2,
               "pyrotechnic-item",
               "C4"
            )
         );
   }

   private String StringHolder_8(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      return li1ll11ilil1ii1lilll1i.HudElement() + li1ll11ilil1ii1lilll1i.getDisplayName() + li1ll11ilil1ii1lilll1i.Category().name();
   }

   public List<AutoInventoryItem> Notifications() {
      return Autobuy.lII1l1l1lIlIl1I1III11lI11.l1I1l11l111llIIIllllllll1ll();
   }

   public boolean EventBus(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      String s = this.StringHolder_8(li1ll11ilil1ii1lilll1i);

      for (AutoInventoryItem autoinventoryitem : Autobuy.lII1l1l1lIlIl1I1III11lI11.l1I1l11l111llIIIllllllll1ll()) {
         String s1 = autoinventoryitem.getItemBuy().HudElement()
            + autoinventoryitem.getItemBuy().getDisplayName()
            + autoinventoryitem.getItemBuy().Category().name();
         if (s1.equals(s)) {
            return true;
         }
      }

      return false;
   }

   public AutoInventoryItem StringHolder_8(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, long i, int j) {
      String s = this.StringHolder_8(li1ll11ilil1ii1lilll1i);

      for (AutoInventoryItem autoinventoryitem : Autobuy.lII1l1l1lIlIl1I1III11lI11.l1I1l11l111llIIIllllllll1ll()) {
         String s1 = autoinventoryitem.getItemBuy().HudElement()
            + autoinventoryitem.getItemBuy().getDisplayName()
            + autoinventoryitem.getItemBuy().Category().name();
         if (s1.equals(s)) {
            autoinventoryitem.setMaxSumBuy(i);
            autoinventoryitem.setCountBuy(j);
            ZenithClient.getInstance().ZenithInternal115().StringHolder_24("current_config");
            return autoinventoryitem;
         }
      }

      AutoInventoryItem autoinventoryitem1 = new AutoInventoryItem(li1ll11ilil1ii1lilll1i);
      autoinventoryitem1.setMaxSumBuy(i);
      autoinventoryitem1.setCountBuy(j);
      autoinventoryitem1.setSelected(true);
      Autobuy.lII1l1l1lIlIl1I1III11lI11.l1I1l11l111llIIIllllllll1ll().add(autoinventoryitem1);
      ZenithClient.getInstance().ZenithInternal115().StringHolder_24("current_config");
      return autoinventoryitem1;
   }

   public void StringHolder_8(AutoInventoryItem autoinventoryitem) {
      if (autoinventoryitem != null) {
         if (!this.EventBus(autoinventoryitem.getItemBuy())) {
            autoinventoryitem.setSelected(true);
            Autobuy.lII1l1l1lIlIl1I1III11lI11.l1I1l11l111llIIIllllllll1ll().add(autoinventoryitem);
            ZenithClient.getInstance().ZenithInternal115().StringHolder_24("current_config");
         }
      }
   }

   public boolean EventTarget(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      String s = this.StringHolder_8(li1ll11ilil1ii1lilll1i);
      boolean flag = Autobuy.lII1l1l1lIlIl1I1III11lI11
         .l1I1l11l111llIIIllllllll1ll()
         .removeIf(
            autoinventoryitem -> (autoinventoryitem.getItemBuy().HudElement()
                     + autoinventoryitem.getItemBuy().getDisplayName()
                     + autoinventoryitem.getItemBuy().Category().name())
                  .equals(s)
         );
      if (flag) {
         ZenithClient.getInstance().ZenithInternal115().StringHolder_24("current_config");
      }

      return flag;
   }

   public GetDisplayNameHandler_2 booleanHolder(String s) {
      if (s == null) {
         return null;
      } else {
         for (GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1ixx : this.ZenithInternal004) {
            if (li1ll11ilil1ii1lilll1ixx.HudElement().equals(s)) {
               return li1ll11ilil1ii1lilll1ixx;
            }
         }

         for (GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1ix : this.SimpleFramebufferHolder) {
            if (li1ll11ilil1ii1lilll1ix.HudElement().equals(s)) {
               return li1ll11ilil1ii1lilll1ix;
            }
         }

         for (GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1ixx : this.floatHolder_13) {
            if (li1ll11ilil1ii1lilll1ixx.HudElement().equals(s)) {
               return li1ll11ilil1ii1lilll1ixx;
            }
         }

         return null;
      }
   }

   public ArrayList<GetDisplayNameHandler_2> AnimatedTab() {
      return this.ZenithInternal004;
   }

   public ArrayList<GetDisplayNameHandler_2> Potions() {
      return this.SimpleFramebufferHolder;
   }

   public ArrayList<GetDisplayNameHandler_2> TargetPotions() {
      return this.floatHolder_13;
   }

   public ArrayList<GetDisplayNameHandler_2> ScoreBoard() {
      return this.StringHolder_3;
   }
}
