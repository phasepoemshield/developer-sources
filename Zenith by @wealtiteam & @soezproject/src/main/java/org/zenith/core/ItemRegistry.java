package org.zenith.core;

import org.zenith.event.EventInjectHandleInputEvents;
import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.event.EventMouseButton;
import org.zenith.module.Speed;
import org.zenith.util.Item;
import org.zenith.util.ItemExt2;

import org.zenith.ZenithClient;

import org.zenith.event.ChatMessageEvent;
import org.zenith.event.EventGetBasicProjectionMatrixHook2;
import org.zenith.event.EventInjectPlaced;
import org.zenith.event.EventItemRenderHook;
import org.zenith.event.EventRender;
import org.zenith.event.EventRender2;
import org.zenith.event.FovEvent;
import org.zenith.event.DataChangedEvent;


import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;

public class ItemRegistry {
   public final ArrayList<ItemServiceBase> FovEvent = new ArrayList<>();
   public final ArrayList<ItemServiceBase> EventRender = new ArrayList<>();
   public final ArrayList<ItemServiceBase> EventItemRenderHook = new ArrayList<>();
   public final ArrayList<ItemServiceBase> EventRender2 = new ArrayList<>();

   public void init() {
      var list = TextScanner.UiAnimation(
         "[EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:respiration, level=3], EnchantVanilla [checked=minecraft:mending, level=1], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:aqua_affinity, level=1]]"
      );
      SimpleItemBuilder ill111ili11l = new SimpleItemBuilder(
         Items.NETHERITE_HELMET.getDefaultStack(),
         "\u0428\u043b\u0435\u043c \u043a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f",
         SoundCueKind.Item
      );
      list.forEach(ill111ili11l::on23);
      var list1 = TextScanner.UiAnimation(
         "[EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:mending, level=1]]"
      );
      SimpleItemBuilder ill111ili11l1 = new SimpleItemBuilder(
         Items.NETHERITE_CHESTPLATE.getDefaultStack(),
         "\u041d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a \u041a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f",
         SoundCueKind.Item
      );
      list1.forEach(ill111ili11l1::on23);
      SimpleItemBuilder ill111ili11l2 = new SimpleItemBuilder(
         Items.NETHERITE_LEGGINGS.getDefaultStack(),
         "\u041f\u043e\u043d\u043e\u0436\u0438 \u041a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f",
         SoundCueKind.Item
      );
      list1.forEach(ill111ili11l2::on23);
      var list2 = TextScanner.UiAnimation(
         "[EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:soul_speed, level=3], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:depth_strider, level=3], EnchantVanilla [checked=minecraft:feather_falling, level=4], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:mending, level=1]]"
      );
      SimpleItemBuilder ill111ili11l3 = new SimpleItemBuilder(
         Items.NETHERITE_BOOTS.getDefaultStack(),
         "\u0411\u043e\u0442\u0438\u043d\u043a\u0438 \u041a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f",
         SoundCueKind.Item
      );
      list2.forEach(ill111ili11l3::on23);
      var list3 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=oxidation, level=2], EnchantCustom [checked=detection, level=3], EnchantCustom [checked=poison, level=3], EnchantCustom [checked=vampirism, level=2], EnchantCustom [checked=skilled, level=3], EnchantVanilla [checked=minecraft:looting, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:fire_aspect, level=2], EnchantVanilla [checked=minecraft:sweeping_edge, level=3], EnchantVanilla [checked=minecraft:smite, level=7], EnchantVanilla [checked=minecraft:sharpness, level=7], EnchantVanilla [checked=minecraft:bane_of_arthropods, level=7], EnchantVanilla [checked=minecraft:mending, level=1]]"
      );
      SimpleItemBuilder ill111ili11l4 = new SimpleItemBuilder(
         Items.NETHERITE_SWORD.getDefaultStack(),
         "\u041c\u0435\u0447 \u041a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f",
         SoundCueKind.Item
      );
      list3.forEach(ill111ili11l4::on23);
      var list4 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=skilled, level=3], EnchantCustom [checked=smelting, level=1], EnchantCustom [checked=magnet, level=1], EnchantCustom [checked=pinger, level=1], EnchantCustom [checked=web, level=1], EnchantCustom [checked=buldozing, level=2], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:efficiency, level=10], EnchantVanilla [checked=minecraft:mending, level=1], EnchantVanilla [checked=minecraft:fortune, level=5]]"
      );
      SimpleItemBuilder ill111ili11l5 = new SimpleItemBuilder(
         Items.NETHERITE_PICKAXE.getDefaultStack(),
         "\u041a\u0438\u0440\u043a\u0430 \u041a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f",
         SoundCueKind.Item
      );
      list4.forEach(ill111ili11l5::on23);
      var list5 = TextScanner.UiAnimation(
         "[EnchantVanilla [checked=minecraft:unbreaking, level=3], EnchantVanilla [checked=minecraft:mending, level=1], EnchantVanilla [checked=minecraft:multishot, level=1], EnchantVanilla [checked=minecraft:piercing, level=5], EnchantVanilla [checked=minecraft:quick_charge, level=3]]"
      );
      SimpleItemBuilder ill111ili11l6 = new SimpleItemBuilder(
         Items.CROSSBOW.getDefaultStack(),
         "\u0410\u0440\u0431\u0430\u043b\u0435\u0442 \u041a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f",
         SoundCueKind.Item
      );
      list5.forEach(ill111ili11l6::on23);
      var list6 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=detection, level=3], EnchantCustom [checked=poison, level=3], EnchantCustom [checked=demolishing, level=1], EnchantCustom [checked=returning, level=1], EnchantCustom [checked=oxidation, level=2], EnchantCustom [checked=pulling, level=2], EnchantCustom [checked=stupor, level=3], EnchantCustom [checked=vampirism, level=2], EnchantCustom [checked=skilled, level=3], EnchantCustom [checked=scout, level=3], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:fire_aspect, level=2], EnchantVanilla [checked=minecraft:loyalty, level=3], EnchantVanilla [checked=minecraft:impaling, level=5], EnchantVanilla [checked=minecraft:channeling, level=1], EnchantVanilla [checked=minecraft:sharpness, level=7], EnchantVanilla [checked=minecraft:mending, level=1]]"
      );
      SimpleItemBuilder ill111ili11l7 = new SimpleItemBuilder(
         Items.TRIDENT.getDefaultStack(),
         "\u0422\u0440\u0435\u0437\u0443\u0431\u0435\u0446 \u041a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f",
         SoundCueKind.Item
      );
      list6.forEach(ill111ili11l7::on23);
      ItemStack itemstack = Items.SPLASH_POTION.getDefaultStack();
      itemstack.set(
         DataComponentTypes.POTION_CONTENTS,
         new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(214, 0, 191).getRGB()), List.of(), Optional.empty())
      );
      NbtEditor i1i1li111lii1 = new NbtEditor(
         itemstack,
         "\u0417\u0435\u043b\u044c\u0435 \u041c\u0435\u0434\u0438\u043a\u0430",
         SoundCueKind.Item,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:2b,duration:900,id:\"minecraft:health_boost\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:2b,duration:900,id:\"minecraft:regeneration\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack itemstack1 = Items.SPLASH_POTION.getDefaultStack();
      itemstack1.set(
         DataComponentTypes.POTION_CONTENTS,
         new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(11, 188, 4).getRGB()), List.of(), Optional.empty())
      );
      NbtEditor i1i1li111lii11 = new NbtEditor(
         itemstack1,
         "\u0417\u0435\u043b\u044c\u0435 \u041f\u043e\u0431\u0435\u0434\u0438\u0442\u0435\u043b\u044f",
         SoundCueKind.Item,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:1b,duration:3600,id:\"minecraft:health_boost\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:18000,id:\"minecraft:invisibility\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:1b,duration:1200,id:\"minecraft:regeneration\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:1200,id:\"minecraft:resistance\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack itemstack2 = Items.SPLASH_POTION.getDefaultStack();
      itemstack2.set(
         DataComponentTypes.POTION_CONTENTS,
         new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(246, 250, 78).getRGB()), List.of(), Optional.empty())
      );
      NbtEditor i1i1li111lii12 = new NbtEditor(
         itemstack2,
         "\u0417\u0435\u043b\u044c\u0435 \u0410\u0433\u0435\u043d\u0442\u0430",
         SoundCueKind.Item,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:0b,duration:18000,id:\"minecraft:fire_resistance\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:3600,id:\"minecraft:haste\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:18000,id:\"minecraft:invisibility\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:2b,duration:18000,id:\"minecraft:speed\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:2b,duration:6000,id:\"minecraft:strength\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack itemstack3 = Items.SPLASH_POTION.getDefaultStack();
      itemstack3.set(
         DataComponentTypes.POTION_CONTENTS,
         new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(135, 0, 0).getRGB()), List.of(), Optional.empty())
      );
      NbtEditor i1i1li111lii13 = new NbtEditor(
         itemstack3,
         "\u0417\u0435\u043b\u044c\u0435 \u041a\u0438\u043b\u043b\u0435\u0440\u0430",
         SoundCueKind.Item,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:0b,duration:3600,id:\"minecraft:resistance\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:3b,duration:1800,id:\"minecraft:strength\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack itemstack4 = Items.SPLASH_POTION.getDefaultStack();
      itemstack4.set(
         DataComponentTypes.POTION_CONTENTS,
         new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(164, 252, 76).getRGB()), List.of(), Optional.empty())
      );
      NbtEditor i1i1li111lii14 = new NbtEditor(
         itemstack4,
         "\u0421\u0435\u0440\u043d\u0430\u044f \u043a\u0438\u0441\u043b\u043e\u0442\u0430",
         SoundCueKind.Item,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:1b,duration:1000,id:\"minecraft:poison\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:3b,duration:1800,id:\"minecraft:slowness\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:2b,duration:1800,id:\"minecraft:weakness\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:4b,duration:600,id:\"minecraft:wither\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack itemstack5 = Items.SPLASH_POTION.getDefaultStack();
      itemstack5.set(
         DataComponentTypes.POTION_CONTENTS,
         new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(243, 59, 128).getRGB()), List.of(), Optional.empty())
      );
      NbtEditor i1i1li111lii15 = new NbtEditor(
         itemstack5,
         "\u0418\u0441\u0446\u0435\u043b",
         SoundCueKind.Item,
         "custom_potion_effects",
         "[{ambient:1b,amplifier:1b,duration:1,id:\"minecraft:instant_health\",show_icon:1b,show_particles:1b},{ambient:1b,amplifier:0b,duration:600,id:\"minecraft:regeneration\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack itemstack6 = Items.SPLASH_POTION.getDefaultStack();
      itemstack6.set(
         DataComponentTypes.POTION_CONTENTS,
         new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(new Color(16737792).getRGB()), List.of(), Optional.empty())
      );
      NbtEditor i1i1li111lii16 = new NbtEditor(
         itemstack6,
         "\u041e\u0442\u0440\u044b\u0436\u043a\u0430",
         SoundCueKind.Item,
         "CustomPotionColor",
         "16737792"
      );
      ItemStack itemstack7 = Items.TIPPED_ARROW.getDefaultStack();
      itemstack7.set(
         DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(65535), List.of(), Optional.empty())
      );
      NbtEditor i1i1li111lii17 = new NbtEditor(
         itemstack7,
         "\u041b\u0435\u0434\u044f\u043d\u0430\u044f \u0441\u0442\u0440\u0435\u043b\u0430",
         SoundCueKind.Item,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:50b,duration:100,id:\"minecraft:slowness\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:120,id:\"minecraft:weakness\",show_icon:1b,show_particles:1b}]"
      );
      ItemStack itemstack8 = Items.TIPPED_ARROW.getDefaultStack();
      itemstack8.set(
         DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(0), List.of(), Optional.empty())
      );
      NbtEditor i1i1li111lii18 = new NbtEditor(
         itemstack8,
         "\u041f\u0440\u043e\u043a\u043b\u044f\u0442\u0430\u044f \u0441\u0442\u0440\u0435\u043b\u0430",
         SoundCueKind.Item,
         "custom_potion_effects",
         "[{ambient:0b,amplifier:0b,duration:40,id:\"minecraft:blindness\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:100,id:\"minecraft:nausea\",show_icon:1b,show_particles:1b},{ambient:0b,amplifier:0b,duration:200,id:\"minecraft:weakness\",show_icon:1b,show_particles:1b}]"
      );
      NbtEditor i1i1li111lii19 = new NbtEditor(
         Items.DRIED_KELP.getDefaultStack(), "\u041f\u043b\u0430\u0441\u0442", SoundCueKind.Item, "stratum", "1b"
      );
      NbtEditor i1i1li111lii110 = new NbtEditor(
         Items.NETHERITE_SCRAP.getDefaultStack(),
         "\u0422\u0440\u0430\u043f\u043a\u0430",
         SoundCueKind.Item,
         "trap",
         "1b"
      );
      NbtEditor i1i1li111lii111 = new NbtEditor(
         Items.ENDER_EYE.getDefaultStack(),
         "\u0414\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u044f",
         SoundCueKind.Item,
         "desorientation",
         "1b"
      );
      NbtEditor i1i1li111lii112 = new NbtEditor(
         Items.SUGAR.getDefaultStack(),
         "\u042f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c",
         SoundCueKind.Item,
         "sheerdust",
         "1b"
      );
      NbtEditor i1i1li111lii113 = new NbtEditor(
         Items.PHANTOM_MEMBRANE.getDefaultStack(),
         "\u0411\u043e\u0436\u044c\u044f \u0430\u0443\u0440\u0430",
         SoundCueKind.Item,
         "godsaura",
         "1b"
      );
      ProfileItemBuilder liiili1iii1xxxx = new ProfileItemBuilder(
         "\u0421\u0444\u0435\u0440\u0430 \u0410\u043d\u0434\u0440\u043e\u043c\u0435\u0434\u044b",
         SoundCueKind.Item,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NTEwODQzNywKICAicHJvZmlsZUlkIiA6ICIzMjNiYjlkYzkwZWU0Nzk5YjUxYzE3NjRmZDRhNjI3OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOcGllIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ0ZmZlM2YzNThmMjA5YmFkOGZmZjRkYzQ4MjQ1ZDliYWYwYTAzMWIzYzFlZTZiNzU4NDYwYTMzOWIxNTE5ZTIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
      );
      ProfileItemBuilder liiili1iii1x = new ProfileItemBuilder(
         "\u0421\u0444\u0435\u0440\u0430 \u041f\u0430\u043d\u0434\u043e\u0440\u044b",
         SoundCueKind.Item,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NTY2NTExNCwKICAicHJvZmlsZUlkIiA6ICJkNzJlNGJjZDIyZGI0NjQ4OTUxNTc0M2UyYTRmMWFjMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJhdnZheSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84ZTUxZTY1ZWI0MDUyNzcyMzgyYzllNTA3YTU0YmRlZDQzZTM5Zjc1NWI1ZGRmNTViM2YzOTQ0M2NlZDQ2N2Y0IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
      );
      ProfileItemBuilder liiili1iii1xx = new ProfileItemBuilder(
         "\u0421\u0444\u0435\u0440\u0430 \u0422\u0438\u0442\u0430\u043d\u0430",
         SoundCueKind.Item,
         "ewogICJ0aW1lc3RhbXAiIDogMTc1MDM1NDQ1NTE5MiwKICAicHJvZmlsZUlkIiA6ICJkOTcwYzEzZTM4YWI0NzlhOTY1OGM1ZDQ1MjZkMTM0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcmltcHlMYWNlODUxMjciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODFlOTY5ODQ1OGI3ODQxYzk2YWU0ZjI0ZWM4NGFlMDE3MjQxMDA2NDFjNTY0ZTJhN2IxODVmNDA2ZThlZDIzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
      );
      ProfileItemBuilder liiili1iii1xxx = new ProfileItemBuilder(
         "\u0421\u0444\u0435\u0440\u0430 \u0410\u043f\u043e\u043b\u043b\u043e\u043d\u0430",
         SoundCueKind.Item,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NjYyNTM0NywKICAicHJvZmlsZUlkIiA6ICJhMjk1ODZmYmU1ZDk0Nzk2OWZjOGQ4ZGE0NzlhNDNlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJMZXZlMjQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjQxMTdiNjAxOGZlZjBkNTE1NjcyMTczZTNiMjZlNjYwZDY1MWU1ODc2YmE2ZDAzZTUzNDIyNzBjNDliZWM4MCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
      );
      liiili1iii1xxxx = new ProfileItemBuilder(
         "\u0421\u0444\u0435\u0440\u0430 \u0410\u0441\u0442\u0440\u0435\u044f",
         SoundCueKind.Item,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NTA2MjQwNywKICAicHJvZmlsZUlkIiA6ICJlMzcxMWU2Y2E0ZmY0NzA4YjY5ZjhiNGZlYzNhZjdhMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNckJ1cnN0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFhNWFhZGQ1MmE1ZmFiOTcwODgxNDUxYWRmNTZmYmI0OTNhMzU4NTZlYTk2ZjU0ZTMyZWVhNjYyZDc4N2VkMjAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
      );
      ProfileItemBuilder liiili1iii1xxxxx = new ProfileItemBuilder(
         "\u0421\u0444\u0435\u0440\u0430 \u041e\u0441\u0438\u0440\u0438\u0441\u0430",
         SoundCueKind.Item,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NjY2Mzg3NiwKICAicHJvZmlsZUlkIiA6ICI3NGEwMzQxNWY1OTI0ZTA4YjMyMGM2MmU1NGE3ZjJhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNZXp6aXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDgxMzYzNWJkODZiMTcxYmJlMTQzYWQ3MWUwOTAyMjkyNjQ5Y2IzYWI4NDQwZWQwMGY4NWNhNmNhMzgyOTkzNiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
      );
      ProfileItemBuilder liiili1iii1xxxxxx = new ProfileItemBuilder(
         "\u0421\u0444\u0435\u0440\u0430 \u0425\u0438\u043c\u0435\u0440\u044b",
         SoundCueKind.Item,
         "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NjE4MTEwOSwKICAicHJvZmlsZUlkIiA6ICJiNzRiMGQzNTBkNTk0NTU4YmYyYjBlMDJlYmE4NjE4NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJCcmFuZG9uYnBtMjg0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzlmYWJlZWQ0MjRiMjUyYTg5NDVhNjQ0MmI0NjJkNWYzMTQ3MDFhODE2ZGEyZDBhNjljY2RmY2ZkNzQ2ZTU4OGUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
      );
      NbtEditor i1i1li111lii114 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u0413\u0440\u0430\u043d\u0438",
         SoundCueKind.Item,
         "AttributeModifiers",
         "[{Amount:-4.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"\u043c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u043e\u0435 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435\",Operation:0,Slot:\"offhand\",UUID:[I;-1243469000,-221950864,-1992446485,-2021417908]},{Amount:0.15d,AttributeName:\"minecraft:generic.movement_speed\",Name:\"\u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c\",Operation:1,Slot:\"offhand\",UUID:[I;421185474,-1675802507,-1302866561,493632362]},{Amount:3.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"\u0441\u0438\u043b\u0430\",Operation:0,Slot:\"offhand\",UUID:[I;1519226946,1096501307,-1211766788,1772678932]}]"
      );
      NbtEditor i1i1li111lii115 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u0414\u0435\u0434\u0430\u043b\u0430",
         SoundCueKind.Item,
         "AttributeModifiers",
         "[{Amount:-4.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"\u043c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u043e\u0435 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435\",Operation:0,Slot:\"offhand\",UUID:[I;359257458,1778207792,-1338766924,848576712]},{Amount:5.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"\u0441\u0438\u043b\u0430\",Operation:0,Slot:\"offhand\",UUID:[I;-1723975978,-172144109,-1549361344,1422474545]}]"
      );
      NbtEditor i1i1li111lii116 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u0422\u0440\u0438\u0442\u043e\u043d\u0430",
         SoundCueKind.Item,
         "AttributeModifiers",
         "[{Amount:2.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"\u043c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u043e\u0435 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435\",Operation:0,Slot:\"offhand\",UUID:[I;1523385351,-602324415,-1760945561,-270836422]},{Amount:-2.0d,AttributeName:\"minecraft:generic.armor_toughness\",Name:\"\u0442\u0432\u0451\u0440\u0434\u043e\u0441\u0442\u044c \u0431\u0440\u043e\u043d\u0438\",Operation:0,Slot:\"offhand\",UUID:[I;1017626540,670256083,-1935748919,-786940866]},{Amount:2.0d,AttributeName:\"minecraft:generic.armor\",Name:\"\u0431\u0440\u043e\u043d\u044f\",Operation:0,Slot:\"offhand\",UUID:[I;1409389356,857884230,-1271577328,-932163262]}]"
      );
      NbtEditor i1i1li111lii117 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u0413\u0430\u0440\u043c\u043e\u043d\u0438\u0438",
         SoundCueKind.Item,
         "AttributeModifiers",
         "[{Amount:2.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"\u043c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u043e\u0435 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435\",Operation:0,Slot:\"offhand\",UUID:[I;1253805553,182601342,-1805352146,-1397322752]},{Amount:2.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"\u0441\u0438\u043b\u0430\",Operation:0,Slot:\"offhand\",UUID:[I;1648014473,711805426,-1962672765,-537567144]},{Amount:2.0d,AttributeName:\"minecraft:generic.armor\",Name:\"\u0431\u0440\u043e\u043d\u044f\",Operation:0,Slot:\"offhand\",UUID:[I;-432853915,2131774585,-1617568671,-621826558]}]"
      );
      NbtEditor i1i1li111lii118 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u0424\u0435\u043d\u0438\u043a\u0441\u0430",
         SoundCueKind.Item,
         "AttributeModifiers",
         "[{Amount:6.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"\u043c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u043e\u0435 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435\",Operation:0,Slot:\"offhand\",UUID:[I;587791282,-2058138192,-2013554380,1529824133]},{Amount:0.1d,AttributeName:\"minecraft:generic.attack_speed\",Name:\"\u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0430\u0442\u0430\u043a\u0438\",Operation:1,Slot:\"offhand\",UUID:[I;233538602,1321813146,-1704635325,1580943681]}]"
      );
      NbtEditor i1i1li111lii119 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u0415\u0445\u0438\u0434\u043d\u044b",
         SoundCueKind.Item,
         "AttributeModifiers",
         "[{Amount:-4.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"\u043c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u043e\u0435 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435\",Operation:0,Slot:\"offhand\",UUID:[I;951469257,944390782,-1639200535,1882164017]},{Amount:6.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"\u0441\u0438\u043b\u0430\",Operation:0,Slot:\"offhand\",UUID:[I;955551735,1646086503,-2027411701,279678977]},{Amount:-2.0d,AttributeName:\"minecraft:generic.armor_toughness\",Name:\"\u0442\u0432\u0451\u0440\u0434\u043e\u0441\u0442\u044c \u0431\u0440\u043e\u043d\u0438\",Operation:0,Slot:\"offhand\",UUID:[I;1301352305,-411349527,-1975888927,1331290909]},{Amount:-2.0d,AttributeName:\"minecraft:generic.armor\",Name:\"\u0431\u0440\u043e\u043d\u044f\",Operation:0,Slot:\"offhand\",UUID:[I;-1591608852,-1821816734,-1777269705,-1095126461]}]"
      );
      NbtEditor i1i1li111lii120 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u041a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f",
         SoundCueKind.Item,
         "AttributeModifiers",
         "[{Amount:4.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"\u043c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u043e\u0435 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435\",Operation:0,Slot:\"offhand\",UUID:[I;-2029680951,-1707392264,-1958707995,-389772071]},{Amount:3.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"\u0441\u0438\u043b\u0430\",Operation:0,Slot:\"offhand\",UUID:[I;430632003,-1617212859,-1216331408,-1833541566]},{Amount:2.0d,AttributeName:\"minecraft:generic.armor_toughness\",Name:\"\u0442\u0432\u0451\u0440\u0434\u043e\u0441\u0442\u044c \u0431\u0440\u043e\u043d\u0438\",Operation:0,Slot:\"offhand\",UUID:[I;-1348659832,-1401469259,-1365362331,376666792]},{Amount:2.0d,AttributeName:\"minecraft:generic.armor\",Name:\"\u0431\u0440\u043e\u043d\u044f\",Operation:0,Slot:\"offhand\",UUID:[I;897201681,1928088706,-1491637188,-648449433]}]"
      );
      NbtEditor i1i1li111lii121 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u041a\u0430\u0440\u0430\u0442\u0435\u043b\u044f",
         SoundCueKind.Item,
         "AttributeModifiers",
         "[{Amount:7.0d,AttributeName:\"minecraft:generic.attack_damage\",Name:\"\u0441\u0438\u043b\u0430\",Operation:0,Slot:\"offhand\",UUID:[I;-1651993925,-1873589036,-2067416271,-818067434]},{Amount:-4.0d,AttributeName:\"minecraft:generic.max_health\",Name:\"\u043c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u043e\u0435 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435\",Operation:0,Slot:\"offhand\",UUID:[I;-473822740,-120697814,-1795206788,-16471115]},{Amount:0.1d,AttributeName:\"minecraft:generic.movement_speed\",Name:\"\u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c\",Operation:1,Slot:\"offhand\",UUID:[I;1026697411,-1939651121,-2079096398,-1055446047]}]"
      );
      this.EventRender.add(ill111ili11l);
      this.EventRender.add(ill111ili11l1);
      this.EventRender.add(ill111ili11l2);
      this.EventRender.add(ill111ili11l3);
      this.EventRender.add(ill111ili11l4);
      this.EventRender.add(ill111ili11l5);
      this.EventRender.add(ill111ili11l6);
      this.EventRender.add(ill111ili11l7);
      this.EventRender.add(i1i1li111lii1);
      this.EventRender.add(i1i1li111lii11);
      this.EventRender.add(i1i1li111lii12);
      this.EventRender.add(i1i1li111lii13);
      this.EventRender.add(i1i1li111lii14);
      this.EventRender.add(i1i1li111lii15);
      this.EventRender.add(i1i1li111lii17);
      this.EventRender.add(i1i1li111lii18);
      this.EventRender.add(i1i1li111lii16);
      this.EventRender.add(i1i1li111lii19);
      this.EventRender.add(i1i1li111lii110);
      this.EventRender.add(i1i1li111lii111);
      this.EventRender.add(i1i1li111lii112);
      this.EventRender.add(i1i1li111lii113);
      this.EventRender.add(liiili1iii1xxxx);
      this.EventRender.add(liiili1iii1x);
      this.EventRender.add(liiili1iii1xx);
      this.EventRender.add(liiili1iii1xxx);
      this.EventRender.add(liiili1iii1xxxx);
      this.EventRender.add(liiili1iii1xxxxx);
      this.EventRender.add(liiili1iii1xxxxxx);
      this.EventRender.add(i1i1li111lii114);
      this.EventRender.add(i1i1li111lii115);
      this.EventRender.add(i1i1li111lii116);
      this.EventRender.add(i1i1li111lii117);
      this.EventRender.add(i1i1li111lii118);
      this.EventRender.add(i1i1li111lii119);
      this.EventRender.add(i1i1li111lii120);
      this.EventRender.add(i1i1li111lii121);
      this.FovEvent
         .add(
            new ItemServiceBase(
               Items.ENCHANTED_GOLDEN_APPLE.getDefaultStack(),
               "\u0417\u0430\u0447\u0430\u0440\u043e\u0432\u0430\u043d\u043d\u043e\u0435 \u0437\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e",
               SoundCueKind.ItemExt2
            )
         );
      this.FovEvent
         .add(
            new ItemServiceBase(
               Items.GOLDEN_APPLE.getDefaultStack(),
               "\u0417\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e",
               SoundCueKind.ItemExt2
            )
         );
      this.FovEvent
         .add(
            new ItemServiceBase(
               Items.FIREWORK_ROCKET.getDefaultStack(),
               "\u0424\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a",
               SoundCueKind.ItemExt2
            )
         );
      this.FovEvent
         .add(
            new ItemServiceBase(
               Items.GOLDEN_CARROT.getDefaultStack(),
               "\u0417\u043e\u043b\u043e\u0442\u0430\u044f \u043c\u043e\u0440\u043a\u043e\u0432\u044c",
               SoundCueKind.ItemExt2
            )
         );
      this.FovEvent
         .add(
            new ItemServiceBase(
               Items.ENDER_PEARL.getDefaultStack(),
               "\u042d\u043d\u0434\u0435\u0440 \u0436\u0435\u043c\u0447\u0443\u0433",
               "\u042d\u043d\u0434\u0435\u0440-\u0436\u0435\u043c\u0447\u0443\u0433",
               SoundCueKind.ItemExt2
            )
         );
      this.FovEvent
         .add(
            new ItemServiceBase(
               Items.CHORUS_FRUIT.getDefaultStack(),
               "\u041f\u043b\u043e\u0434 \u0445\u043e\u0440\u0443\u0441\u0430",
               SoundCueKind.ItemExt2
            )
         );
      this.FovEvent
         .add(
            new ItemServiceBase(
               Items.TOTEM_OF_UNDYING.getDefaultStack(),
               "\u0422\u043e\u0442\u0435\u043c \u0431\u0435\u0441\u0441\u043c\u0435\u0440\u0442\u0438\u044f",
               SoundCueKind.ItemExt2
            )
         );
      this.FovEvent
         .add(
            new ItemServiceBase(
               Items.EXPERIENCE_BOTTLE.getDefaultStack(),
               "\u041f\u0443\u0437\u044b\u0440\u0451\u043a \u043e\u043f\u044b\u0442\u0430",
               SoundCueKind.ItemExt2
            )
         );
      this.FovEvent
         .add(
            new ItemServiceBase(
               Items.ELYTRA.getDefaultStack(), "\u042d\u043b\u0438\u0442\u0440\u044b", SoundCueKind.ItemExt2
            )
         );
      this.FovEvent
         .add(
            new PotionItemBuilder(
               Items.POTION,
               Potions.TURTLE_MASTER,
               "\u0417\u0435\u043b\u044c\u0435 \u0447\u0435\u0440\u0435\u043f\u0430\u0448\u044c\u0435\u0439 \u043c\u043e\u0449\u0438",
               SoundCueKind.FriendStore
            )
         );
      this.FovEvent
         .add(
            new ItemServiceBase(
               Items.CONDUIT.getDefaultStack(),
               "\u0410\u0440\u0442\u0435\u0444\u0430\u043a\u0442",
               SoundCueKind.FriendStore
            )
         );
      list = TextScanner.UiAnimation(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=2], EnchantCustom [checked=minecraft:aqua_affinity, level=1], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:respiration, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:aqua_affinity, level=1], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:respiration, level=3], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      ill111ili11l = new SimpleItemBuilder(
         Items.NETHERITE_HELMET.getDefaultStack(), "\u0428\u043b\u0435\u043c infinity", SoundCueKind.FriendStore
      );
      list.forEach(ill111ili11l::on23);
      list1 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=2], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5]]"
      );
      ill111ili11l1 = new SimpleItemBuilder(
         Items.NETHERITE_CHESTPLATE.getDefaultStack(),
         "\u041d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a infinity",
         SoundCueKind.FriendStore
      );
      list1.forEach(ill111ili11l1::on23);
      var list7 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=2], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      SimpleItemBuilder ill111ili11l8 = new SimpleItemBuilder(
         Items.NETHERITE_LEGGINGS.getDefaultStack(),
         "\u0428\u0442\u0430\u043d\u044b infinity",
         SoundCueKind.FriendStore
      );
      list7.forEach(ill111ili11l8::on23);
      var list8 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=2], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:depth_strider, level=3], EnchantCustom [checked=minecraft:feather_falling, level=4], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:soul_speed, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:depth_strider, level=3], EnchantVanilla [checked=minecraft:feather_falling, level=4], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:soul_speed, level=3], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      SimpleItemBuilder ill111ili11l9 = new SimpleItemBuilder(
         Items.NETHERITE_BOOTS.getDefaultStack(),
         "\u0411\u043e\u0442\u0438\u043d\u043a\u0438 infinity",
         SoundCueKind.FriendStore
      );
      list8.forEach(ill111ili11l9::on23);
      var list9 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=1], EnchantCustom [checked=minecraft:aqua_affinity, level=1], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:respiration, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:aqua_affinity, level=1], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:respiration, level=3], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      SimpleItemBuilder ill111ili11l10 = new SimpleItemBuilder(
         Items.NETHERITE_HELMET.getDefaultStack(), "\u0428\u043b\u0435\u043c eternity", SoundCueKind.FriendStore
      );
      list9.forEach(ill111ili11l10::on23);
      var list10 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=enchantments:impenetrable-enchant-custom, level=1], EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5]]"
      );
      SimpleItemBuilder ill111ili11l11 = new SimpleItemBuilder(
         Items.NETHERITE_CHESTPLATE.getDefaultStack(),
         "\u041d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a eternity",
         SoundCueKind.FriendStore
      );
      list10.forEach(ill111ili11l11::on23);
      ill111ili11l6 = new SimpleItemBuilder(
         Items.NETHERITE_LEGGINGS.getDefaultStack(),
         "\u0428\u0442\u0430\u043d\u044b eternity",
         SoundCueKind.FriendStore
      );
      list10.forEach(ill111ili11l6::on23);
      list6 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=minecraft:blast_protection, level=5], EnchantCustom [checked=minecraft:depth_strider, level=3], EnchantCustom [checked=minecraft:feather_falling, level=4], EnchantCustom [checked=minecraft:fire_protection, level=5], EnchantCustom [checked=minecraft:projectile_protection, level=5], EnchantCustom [checked=minecraft:protection, level=5], EnchantCustom [checked=minecraft:soul_speed, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:depth_strider, level=3], EnchantVanilla [checked=minecraft:blast_protection, level=5], EnchantVanilla [checked=minecraft:fire_protection, level=5], EnchantVanilla [checked=minecraft:projectile_protection, level=5], EnchantVanilla [checked=minecraft:protection, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:soul_speed, level=3], EnchantVanilla [checked=minecraft:feather_falling, level=4]]"
      );
      ill111ili11l7 = new SimpleItemBuilder(
         Items.NETHERITE_BOOTS.getDefaultStack(),
         "\u0411\u043e\u0442\u0438\u043d\u043a\u0438 eternity",
         SoundCueKind.FriendStore
      );
      list6.forEach(ill111ili11l7::on23);
      NbtEditor i1i1li111lii143 = new NbtEditor(
         Items.GOLDEN_HELMET.getDefaultStack(),
         "\u0428\u043b\u0435\u043c \u0421\u043e\u043b\u043d\u0446\u0430",
         SoundCueKind.FriendStore,
         "kringeItems",
         "SunHelmet"
      );
      var list11 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=enchantments:critical-enchant-custom, level=2], EnchantCustom [checked=enchantments:destroyer-enchant-custom, level=2], EnchantCustom [checked=enchantments:rich-enchant-custom, level=1], EnchantCustom [checked=minecraft:bane_of_arthropods, level=7], EnchantCustom [checked=minecraft:fire_aspect, level=2], EnchantCustom [checked=minecraft:looting, level=5], EnchantCustom [checked=minecraft:sharpness, level=7], EnchantCustom [checked=minecraft:smite, level=7], EnchantCustom [checked=minecraft:sweeping, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:sweeping_edge, level=3], EnchantVanilla [checked=minecraft:bane_of_arthropods, level=7], EnchantVanilla [checked=minecraft:looting, level=5], EnchantVanilla [checked=minecraft:sharpness, level=7], EnchantVanilla [checked=minecraft:fire_aspect, level=2], EnchantVanilla [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:smite, level=7]]"
      );
      SimpleItemBuilder ill111ili11l12 = new SimpleItemBuilder(
         Items.NETHERITE_SWORD.getDefaultStack(), "\u041c\u0435\u0447 eternity", SoundCueKind.FriendStore
      );
      list11.forEach(ill111ili11l12::on23);
      var list12 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=enchantments:drill-enchant-custom, level=2], EnchantCustom [checked=enchantments:exp-enchant-custom, level=3], EnchantCustom [checked=enchantments:filter-enchant-custom, level=1], EnchantCustom [checked=enchantments:foundry-enchant-custom, level=1], EnchantCustom [checked=enchantments:internal-enchant-custom, level=1], EnchantCustom [checked=enchantments:magnet-enchant-custom, level=1], EnchantCustom [checked=minecraft:efficiency, level=10], EnchantCustom [checked=minecraft:fortune, level=5], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:efficiency, level=10], EnchantVanilla [checked=minecraft:fortune, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      SimpleItemBuilder ill111ili11l13 = new SimpleItemBuilder(
         Items.NETHERITE_PICKAXE.getDefaultStack(),
         "\u041a\u0438\u0440\u043a\u0430 eternity",
         SoundCueKind.FriendStore
      );
      list12.forEach(ill111ili11l13::on23);
      var list13 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=enchantments:stun-enchant-custom, level=2], EnchantCustom [checked=minecraft:multishot, level=1], EnchantCustom [checked=minecraft:piercing, level=5], EnchantCustom [checked=minecraft:quick_charge, level=3], EnchantCustom [checked=minecraft:unbreaking, level=3], EnchantVanilla [checked=minecraft:multishot, level=1], EnchantVanilla [checked=minecraft:piercing, level=5], EnchantVanilla [checked=minecraft:quick_charge, level=3], EnchantVanilla [checked=minecraft:unbreaking, level=3]]"
      );
      SimpleItemBuilder ill111ili11l14 = new SimpleItemBuilder(
         Items.CROSSBOW.getDefaultStack(),
         "\u0410\u0440\u0431\u0430\u043b\u0435\u0442 eternity",
         SoundCueKind.FriendStore
      );
      list13.forEach(ill111ili11l14::on23);
      var list14 = TextScanner.UiAnimation(
         "[EnchantCustom [checked=minecraft:impaling, level=5], EnchantCustom [checked=minecraft:looting, level=5], EnchantCustom [checked=minecraft:loyalty, level=3], EnchantCustom [checked=minecraft:unbreaking, level=5], EnchantVanilla [checked=minecraft:loyalty, level=3], EnchantVanilla [checked=minecraft:looting, level=5], EnchantVanilla [checked=minecraft:impaling, level=5], EnchantVanilla [checked=minecraft:unbreaking, level=5]]"
      );
      SimpleItemBuilder ill111ili11l15 = new SimpleItemBuilder(
         Items.TRIDENT.getDefaultStack(),
         "\u0413\u0440\u043e\u043c\u043e\u0432\u0435\u0440\u0436\u0435\u0446",
         SoundCueKind.FriendStore
      );
      list14.forEach(ill111ili11l15::on23);
      i1i1li111lii14 = new NbtEditor(
         Items.NETHERITE_SWORD.getDefaultStack(),
         "\u0424\u0430\u0440\u043c\u0435\u0440",
         SoundCueKind.FriendStore,
         "RepairCost",
         "\u0424\u0430\u0440\u043c\u0435\u0440"
      );
      NbtEditor i1i1li111lii144 = new NbtEditor(
         Items.ELYTRA.getDefaultStack(),
         "\u0411\u0440\u043e\u043d\u0435\u0432\u0430\u044f \u044d\u043b\u0438\u0442\u0440\u0430",
         SoundCueKind.FriendStore,
         "kringeItems",
         "ArmorElytra"
      );
      i1i1li111lii15 = new NbtEditor(
         Items.MAGENTA_SHULKER_BOX.getDefaultStack(),
         "\u0420\u044e\u043a\u0437\u0430\u043a 4 \u0443\u0440\u043e\u0432\u0435\u043d\u044c",
         SoundCueKind.FriendStore,
         "PublicBukkitValues",
         "litebackpacks:backpack"
      );
      NbtEditor i1i1li111lii145 = new NbtEditor(
         Items.RED_SHULKER_BOX.getDefaultStack(),
         "\u0420\u044e\u043a\u0437\u0430\u043a 3 \u0443\u0440\u043e\u0432\u0435\u043d\u044c",
         SoundCueKind.FriendStore,
         "PublicBukkitValues",
         "litebackpacks:backpack"
      );
      i1i1li111lii16 = new NbtEditor(
         Items.LIGHT_BLUE_SHULKER_BOX.getDefaultStack(),
         "\u0420\u044e\u043a\u0437\u0430\u043a 2 \u0443\u0440\u043e\u0432\u0435\u043d\u044c",
         SoundCueKind.FriendStore,
         "PublicBukkitValues",
         "litebackpacks:backpack"
      );
      NbtEditor i1i1li111lii146 = new NbtEditor(
         Items.PINK_SHULKER_BOX.getDefaultStack(),
         "\u0420\u044e\u043a\u0437\u0430\u043a 1 \u0443\u0440\u043e\u0432\u0435\u043d\u044c",
         SoundCueKind.FriendStore,
         "PublicBukkitValues",
         "litebackpacks:backpack"
      );
      i1i1li111lii17 = new NbtEditor(
         Items.EXPERIENCE_BOTTLE.getDefaultStack(),
         "\u041f\u0443\u0437\u044b\u0440\u0435\u043a \u0441 50 \u0443\u0440\u043e\u0432\u043d\u0435\u043c",
         "50",
         SoundCueKind.FriendStore,
         "holy-exp-bottle-value",
         "5345"
      );
      NbtEditor i1i1li111lii147 = new NbtEditor(
         Items.EXPERIENCE_BOTTLE.getDefaultStack(),
         "\u041f\u0443\u0437\u044b\u0440\u044c \u043e\u043f\u044b\u0442\u0430",
         SoundCueKind.FriendStore,
         "kringeItems",
         "ExpBottle"
      );
      i1i1li111lii18 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u0421\u0430\u0442\u0438\u0440\u044b",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":2,\"nbtName\":\"hms-rush\"},{\"lvl\":3,\"nbtName\":\"hms-damage\"}"
      );
      i1i1li111lii19 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d infinity",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":2,\"nbtName\":\"hms-speed\"},{\"lvl\":2,\"nbtName\":\"hms-health\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"}"
      );
      i1i1li111lii110 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d eternity",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":2,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-speed\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"}"
      );
      i1i1li111lii111 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d stinger",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":2,\"nbtName\":\"hms-damage\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"},{\"lvl\":1,\"nbtName\":\"hms-speed\"}"
      );
      i1i1li111lii112 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u043d\u0430 \u0443\u0440\u043e\u043d 3 \u0431\u0440\u043e\u043d\u044e 2",
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-damage\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"}"
      );
      i1i1li111lii113 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u043d\u0430 \u0431\u0440\u043e\u043d\u044e 3 \u0443\u0440\u043e\u043d 2",
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"}"
      );
      NbtEditor i1i1li111lii148 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u043d\u0430 \u0431\u0440\u043e\u043d\u044e 3 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c 2",
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-speed\"}"
      );
      NbtEditor i1i1li111lii149 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439 \u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u043d\u0430 \u0443\u0440\u043e\u043d 3",
         "\u0421\u0444\u0435\u0440\u0430 \u043d\u0430 \u0443\u0440\u043e\u043d 3",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-damage\"}"
      );
      NbtEditor i1i1li111lii150 = new NbtEditor(
         Items.TOTEM_OF_UNDYING.getDefaultStack(),
         "\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439 \u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u043d\u0430 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c 3",
         "\u0421\u0444\u0435\u0440\u0430 \u043d\u0430 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c 3",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-speed\"}"
      );
      liiili1iii1xxx = new ProfileItemBuilder(
         "\u0421\u0444\u0435\u0440\u0430 \u0426\u0435\u0440\u0431\u0435\u0440\u0430",
         SoundCueKind.FriendStore,
         "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjA5NWE3ZmQ5MGRhYTFiYmU3MDY5MDg5NzQwZTA1ZDBiZmM2NjI5NmVlM2M0MGVlNzFhNGUwYTY2MTZiMmJiYyJ9fX0="
      );
      liiili1iii1xxxx = new ProfileItemBuilder(
         "\u0421\u0444\u0435\u0440\u0430 \u0424\u043b\u0435\u0448\u0430",
         SoundCueKind.FriendStore,
         "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzc0MDBlYTE5ZGJkODRmNzVjMzlhZDY4MjNhYzRlZjc4NmYzOWY0OGZjNmY4NDYwMjM2NmFjMjliODM3NDIyIn19fQ=="
      );
      liiili1iii1xxxxx = new ProfileItemBuilder(
         "\u0421\u0444\u0435\u0440\u0430 \u0418\u043c\u043c\u043e\u0440\u0442\u0430\u043b\u0438\u0442\u0438",
         SoundCueKind.FriendStore,
         "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODNlZDRjZTIzOTMzZTY2ZTA0ZGYxNjA3MDY0NGY3NTk5ZWViNTUzMDdmN2VhZmU4ZDkyZjQwZmIzNTIwODYzYyJ9fX0="
      );
      liiili1iii1xxxxxx = new ProfileItemBuilder(
         "\u0421\u0444\u0435\u0440\u0430 \u0410\u0440\u043c\u043e\u0440\u0442\u0430\u043b\u0438\u0442\u0438",
         SoundCueKind.FriendStore,
         "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWE2MmI5ZGU2YTI2Yjg2ODY5Y2EyMmVhNDBmMWJkZTgwYTA0MzBhNTQ1NDdiZWNjZThmZGE4NzA3Nzc3MjU4ZiJ9fX0="
      );
      ItemStack itemstack9 = new ProfileItemBuilder(
            "",
            SoundCueKind.FriendStore,
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19"
         )
         .EventInjectHandleInputEvents();
      i1i1li111lii115 = new NbtEditor(
         itemstack9,
         "\u0421\u0444\u0435\u0440\u0430 \u043d\u0430 \u0443\u0440\u043e\u043d 3",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-damage\"}"
      );
      i1i1li111lii116 = new NbtEditor(
         itemstack9,
         "\u0421\u0444\u0435\u0440\u0430 \u043d\u0430 \u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c 3",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-speed\"}"
      );
      i1i1li111lii117 = new NbtEditor(
         itemstack9,
         "\u0421\u0444\u0435\u0440\u0430 eternity",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":2,\"nbtName\":\"hms-speed\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"}"
      );
      i1i1li111lii118 = new NbtEditor(
         itemstack9,
         "\u0421\u0444\u0435\u0440\u0430 stinger",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":1,\"nbtName\":\"hms-speed\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"}"
      );
      ItemStack itemstack10 = new ProfileItemBuilder(
            "",
            SoundCueKind.FriendStore,
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmFmZjJlYjQ5OGU1YzZhMDQ0ODRmMGM5Zjc4NWI0NDg0NzlhYjIxM2RmOTVlYzkxMTc2YTMwOGExMmFkZDcwIn19fQ=="
         )
         .EventInjectHandleInputEvents();
      i1i1li111lii120 = new NbtEditor(
         itemstack10,
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0441\u0444\u0435\u0440\u0430 \u043d\u0430 \u0443\u0440\u043e\u043d 3 \u0431\u0440\u043e\u043d\u044e 2",
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0441\u0444\u0435\u0440\u0430",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-damage\"},{\"lvl\":2,\"nbtName\":\"hms-armor\"}"
      );
      i1i1li111lii121 = new NbtEditor(
         itemstack10,
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0441\u0444\u0435\u0440\u0430 \u043d\u0430 \u0431\u0440\u043e\u043d\u044e 3 \u0443\u0440\u043e\u043d 2",
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0441\u0444\u0435\u0440\u0430",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-damage\"}"
      );
      NbtEditor i1i1li111lii122 = new NbtEditor(
         itemstack10,
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0441\u0444\u0435\u0440\u0430 \u043d\u0430 \u0431\u0440\u043e\u043d\u044e 3 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c 2",
         "\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0441\u0444\u0435\u0440\u0430",
         SoundCueKind.FriendStore,
         "sphereEffect",
         "{\"lvl\":3,\"nbtName\":\"hms-armor\"},{\"lvl\":2,\"nbtName\":\"hms-speed\"}"
      );
      NbtEditor i1i1li111lii123 = new NbtEditor(
         Items.POTION.getDefaultStack(),
         "\u0423\u043b\u0443\u0447\u0448\u0435\u043d\u043d\u043e\u0435 \u0437\u0435\u043b\u044c\u0435 \u0441\u0438\u043b\u044b",
         SoundCueKind.FriendStore,
         "custom_potion_effects",
         "minecraft:strength@2"
      );
      NbtEditor i1i1li111lii124 = new NbtEditor(
         Items.POTION.getDefaultStack(),
         "\u0423\u043b\u0443\u0447\u0448\u0435\u043d\u043d\u043e\u0435 \u0437\u0435\u043b\u044c\u0435 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u0438",
         SoundCueKind.FriendStore,
         "custom_potion_effects",
         "minecraft:speed@2"
      );
      NbtEditor i1i1li111lii125 = new NbtEditor(
         Items.POTION.getDefaultStack(),
         "\u0417\u0435\u043b\u044c\u0435 \u041f\u043e\u0431\u0435\u0434\u0438\u0442\u0435\u043b\u044f",
         SoundCueKind.FriendStore,
         "kringeItems",
         "win-potion"
      );
      NbtEditor i1i1li111lii126 = new NbtEditor(
         Items.POTION.getDefaultStack(),
         "\u0417\u0435\u043b\u044c\u0435 \u0438\u0441\u0446\u0435\u043b\u0435\u043d\u0438\u044f 2",
         "\u0417\u0435\u043b\u044c\u0435 \u0438\u0441\u0446\u0435\u043b\u0435\u043d\u0438\u0435",
         SoundCueKind.FriendStore,
         "Potion",
         "minecraft:strong_healing"
      );
      NbtEditor i1i1li111lii127 = new NbtEditor(
         Items.POPPED_CHORUS_FRUIT.getDefaultStack(),
         "\u0422\u0440\u0430\u043f\u043a\u0430",
         SoundCueKind.FriendStore,
         "pyrotechnic-item",
         "ALTERNATIVE_TRAP"
      );
      NbtEditor i1i1li111lii128 = new NbtEditor(
         Items.PRISMARINE_SHARD.getDefaultStack(),
         "\u0412\u0437\u0440\u044b\u0432\u043d\u0430\u044f \u0422\u0440\u0430\u043f\u043a\u0430",
         SoundCueKind.FriendStore,
         "pyrotechnic-item",
         "EXPLOSIVE_TRAP"
      );
      NbtEditor i1i1li111lii129 = new NbtEditor(
         Items.NETHER_STAR.getDefaultStack(),
         "\u0421\u0442\u0430\u043d",
         SoundCueKind.FriendStore,
         "pyrotechnic-item",
         "STUN_STAR"
      );
      NbtEditor i1i1li111lii130 = new NbtEditor(
         Items.SNOWBALL.getDefaultStack(),
         "\u041a\u043e\u043c \u0441\u043d\u0435\u0433\u0430",
         SoundCueKind.FriendStore,
         "kringeItems",
         "SnowBall"
      );
      NbtEditor i1i1li111lii131 = new NbtEditor(
         Items.FIRE_CHARGE.getDefaultStack(),
         "\u0412\u0437\u0440\u044b\u0432\u043d\u0430\u044f \u0448\u0442\u0443\u0447\u043a\u0430",
         SoundCueKind.FriendStore,
         "kringeItems",
         "ExplosiveStuff"
      );
      NbtEditor i1i1li111lii132 = new NbtEditor(
         Items.ORANGE_DYE.getDefaultStack(),
         "\u0420\u0443\u043d\u0430 \u0411\u0435\u0441\u0441\u043c\u0435\u0440\u0442\u0438\u0435",
         "\u0411\u0435\u0441\u0441\u043c\u0435\u0440\u0442\u0438\u0435",
         SoundCueKind.FriendStore,
         "PublicBukkitValues",
         "literunes:rune-id"
      );
      NbtEditor i1i1li111lii133 = new NbtEditor(
         Items.DIAMOND_SWORD.getDefaultStack(),
         "\u041e\u0445\u043e\u0442\u043d\u0438\u043a",
         SoundCueKind.FriendStore,
         "kringeEffect",
         "EXP_DROPPER"
      );
      NbtEditor i1i1li111lii134 = new NbtEditor(
         Items.SNOW_BLOCK.getDefaultStack(),
         "\u0421\u043d\u0435\u0433\u043e\u0432\u0438\u043a",
         SoundCueKind.FriendStore,
         "kringeEffect",
         "BLINDNESS"
      );
      NbtEditor i1i1li111lii135 = new NbtEditor(
         Items.SEA_LANTERN.getDefaultStack(),
         "\u0418\u043b\u043b\u044e\u043c\u0438\u043d\u0430\u0442\u043e\u0440",
         SoundCueKind.FriendStore,
         "kringeEffect",
         "PORTHOLE"
      );
      NbtEditor i1i1li111lii136 = new NbtEditor(
         Items.ENDER_PEARL.getDefaultStack(),
         "\u042d\u043d\u0434\u0435\u0440\u043c\u0435\u043d",
         SoundCueKind.FriendStore,
         "kringeEffect",
         "ENDERMAN"
      );
      NbtEditor i1i1li111lii137 = new NbtEditor(
         Items.PHANTOM_MEMBRANE.getDefaultStack(),
         "\u0410\u043d\u0442\u0438 \u0424\u0430\u043d\u0442\u043e\u043c",
         SoundCueKind.FriendStore,
         "kringeEffect",
         "ANTI_PHANTOM"
      );
      NbtEditor i1i1li111lii138 = new NbtEditor(
         Items.HONEY_BLOCK.getDefaultStack(),
         "\u0422\u0435\u043b\u0435\u043a\u0438\u043d\u0435\u0437",
         SoundCueKind.FriendStore,
         "kringeEffect",
         "TELEKINESIS"
      );
      NbtEditor i1i1li111lii139 = new NbtEditor(
         Items.FEATHER.getDefaultStack(),
         "\u0413\u0440\u0430\u0432\u0438\u0442\u0430\u0446\u0438\u044f",
         SoundCueKind.FriendStore,
         "kringeEffect",
         "GRAVITY"
      );
      NbtEditor i1i1li111lii140 = new NbtEditor(
         Items.WITHER_SKELETON_SKULL.getDefaultStack(),
         "\u0412\u0430\u043c\u043f\u0438\u0440\u0438\u0437\u043c",
         SoundCueKind.FriendStore,
         "kringeEffect",
         "VAMPIRISM"
      );
      NbtEditor i1i1li111lii141 = new NbtEditor(
         Items.POTION.getDefaultStack(),
         "\u0421\u043f\u0440\u0430\u0432\u0435\u0434\u043b\u0438\u0432\u043e\u0441\u0442\u044c",
         SoundCueKind.FriendStore,
         "kringeEffect",
         "JUSTICE"
      );
      NbtEditor i1i1li111lii142 = new NbtEditor(
         Items.TRIPWIRE_HOOK.getDefaultStack(),
         "\u0423\u043d\u0438\u0432\u0435\u0440\u0441\u0430\u043b\u044c\u043d\u044b\u0439 \u043a\u043b\u044e\u0447",
         SoundCueKind.FriendStore,
         "CustomModelData",
         "123433"
      );
      this.EventItemRenderHook.add(ill111ili11l);
      this.EventItemRenderHook.add(ill111ili11l1);
      this.EventItemRenderHook.add(ill111ili11l8);
      this.EventItemRenderHook.add(ill111ili11l9);
      this.EventItemRenderHook.add(ill111ili11l10);
      this.EventItemRenderHook.add(ill111ili11l11);
      this.EventItemRenderHook.add(ill111ili11l6);
      this.EventItemRenderHook.add(ill111ili11l7);
      this.EventItemRenderHook.add(i1i1li111lii143);
      this.EventItemRenderHook.add(i1i1li111lii144);
      this.EventItemRenderHook.add(ill111ili11l12);
      this.EventItemRenderHook.add(ill111ili11l13);
      this.EventItemRenderHook.add(ill111ili11l14);
      this.EventItemRenderHook.add(ill111ili11l15);
      this.EventItemRenderHook.add(liiili1iii1xxx);
      this.EventItemRenderHook.add(liiili1iii1xxxx);
      this.EventItemRenderHook.add(liiili1iii1xxxxx);
      this.EventItemRenderHook.add(liiili1iii1xxxxxx);
      this.EventItemRenderHook.add(i1i1li111lii120);
      this.EventItemRenderHook.add(i1i1li111lii121);
      this.EventItemRenderHook.add(i1i1li111lii122);
      this.EventItemRenderHook.add(i1i1li111lii115);
      this.EventItemRenderHook.add(i1i1li111lii116);
      this.EventItemRenderHook.add(i1i1li111lii117);
      this.EventItemRenderHook.add(i1i1li111lii118);
      this.EventItemRenderHook.add(i1i1li111lii18);
      this.EventItemRenderHook.add(i1i1li111lii19);
      this.EventItemRenderHook.add(i1i1li111lii110);
      this.EventItemRenderHook.add(i1i1li111lii111);
      this.EventItemRenderHook.add(i1i1li111lii112);
      this.EventItemRenderHook.add(i1i1li111lii113);
      this.EventItemRenderHook.add(i1i1li111lii148);
      this.EventItemRenderHook.add(i1i1li111lii149);
      this.EventItemRenderHook.add(i1i1li111lii150);
      this.EventItemRenderHook.add(i1i1li111lii123);
      this.EventItemRenderHook.add(i1i1li111lii124);
      this.EventItemRenderHook.add(i1i1li111lii126);
      this.EventItemRenderHook.add(i1i1li111lii125);
      this.EventItemRenderHook.add(i1i1li111lii17);
      this.EventItemRenderHook.add(i1i1li111lii15);
      this.EventItemRenderHook.add(i1i1li111lii145);
      this.EventItemRenderHook.add(i1i1li111lii16);
      this.EventItemRenderHook.add(i1i1li111lii146);
      this.EventItemRenderHook.add(i1i1li111lii127);
      this.EventItemRenderHook.add(i1i1li111lii128);
      this.EventItemRenderHook.add(i1i1li111lii129);
      this.EventItemRenderHook.add(i1i1li111lii131);
      this.EventItemRenderHook.add(i1i1li111lii130);
      this.EventItemRenderHook.add(i1i1li111lii132);
      this.EventItemRenderHook.add(i1i1li111lii147);
      this.EventItemRenderHook.add(i1i1li111lii133);
      this.EventItemRenderHook.add(i1i1li111lii134);
      this.EventItemRenderHook.add(i1i1li111lii135);
      this.EventItemRenderHook.add(i1i1li111lii136);
      this.EventItemRenderHook.add(i1i1li111lii137);
      this.EventItemRenderHook.add(i1i1li111lii138);
      this.EventItemRenderHook.add(i1i1li111lii139);
      this.EventItemRenderHook.add(i1i1li111lii140);
      this.EventItemRenderHook.add(i1i1li111lii141);
      this.EventItemRenderHook.add(i1i1li111lii142);
      this.EventItemRenderHook.add(i1i1li111lii14);
      this.EventRender2
         .add(
            new ItemServiceBase(
               Items.GUNPOWDER.getDefaultStack(), "\u041f\u043e\u0440\u043e\u0445", SoundCueKind.ItemExt2
            )
         );
      this.EventRender2
         .add(
            new NbtEditor(
               Items.PRISMARINE_CRYSTALS.getDefaultStack(),
               "\u0411\u043e\u0435\u0432\u043e\u0439 \u0444\u0440\u0430\u0433\u043c\u0435\u043d\u0442",
               SoundCueKind.FriendStore,
               "kringeItems",
               "BattleFragment"
            )
         );
      this.EventRender2
         .add(
            new NbtEditor(
               Items.CLAY.getDefaultStack(),
               "\u0412\u0437\u0440\u044b\u0432\u0447\u0430\u0442\u043e\u0435 \u0432\u0435\u0449\u0435\u0441\u0442\u0432\u043e",
               SoundCueKind.FriendStore,
               "pyrotechnic-item",
               "EXPLOSIVE_SUBSTANCE"
            )
         );
      this.EventRender2
         .add(
            new NbtEditor(
               Items.TNT.getDefaultStack(),
               "\u0414\u0438\u043d\u0430\u043c\u0438\u0442 A",
               "\u0434\u0438\u043d\u0430\u043c\u0438\u0442 \u0430",
               SoundCueKind.FriendStore,
               "pyrotechnic-item",
               "A"
            )
         );
      this.EventRender2
         .add(
            new NbtEditor(
               Items.GOLDEN_PICKAXE.getDefaultStack(),
               "\u0417\u043e\u043b\u043e\u0442\u0430\u044f \u043a\u0438\u0440\u043a\u0430 \u0414\u0436\u0435\u0439\u043a\u0430",
               SoundCueKind.FriendStore,
               "kringeItems",
               "jake-pickaxe"
            )
         );
      this.EventRender2
         .add(
            new ItemServiceBase(
               Items.NETHERITE_INGOT.getDefaultStack(),
               "\u041d\u0435\u0437\u0435\u0440\u0438\u0442\u043e\u0432\u044b\u0439 \u0441\u043b\u0438\u0442\u043e\u043a",
               SoundCueKind.FriendStore
            )
         );
      this.EventRender2
         .add(
            new NbtEditor(
               Items.TNT.getDefaultStack(),
               "\u0414\u0438\u043d\u0430\u043c\u0438\u0442 B",
               "\u0434\u0438\u043d\u0430\u043c\u0438\u0442 \u0431",
               SoundCueKind.FriendStore,
               "pyrotechnic-item",
               "B"
            )
         );
      this.EventRender2
         .add(
            new ProfileItemBuilder(
               "\u041e\u0441\u043a\u043e\u043b\u043e\u043a \u0441\u0444\u0435\u0440\u044b",
               SoundCueKind.FriendStore,
               "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmY3YmJjZTIzZTgxNjJlNDJkMjA3MDU1YjBjZTkwZjBlZDU3YjAxNWU1MjEyMTM5YWM4ZmM3ZTZkNDVkZGZjYSJ9fX0="
            )
         );
      this.EventRender2
         .add(
            new NbtEditor(
               Items.TNT.getDefaultStack(),
               "\u0414\u0438\u043d\u0430\u043c\u0438\u0442 B2",
               "\u0434\u0438\u043d\u0430\u043c\u0438\u0442 \u04312",
               SoundCueKind.FriendStore,
               "pyrotechnic-item",
               "B2"
            )
         );
      this.EventRender2
         .add(
            new NbtEditor(
               Items.TNT.getDefaultStack(),
               "\u04214 \u0412\u0437\u0420\u044b\u0412\u0447\u0410\u0442\u041a\u0430",
               "\u04414 \u0432\u0437\u0440\u044b\u0432\u0447\u0430\u0442\u043a\u0430",
               SoundCueKind.FriendStore,
               "pyrotechnic-item",
               "C4"
            )
         );
   }

   public ItemRegistry() {
      this.init();
   }

   public String on23(ItemServiceBase var1) {
      return var1.EventMouseButton() + var1.getDisplayName() + var1.EventModifyMouseRotationInput().name();
   }

   public ArrayList<ItemServiceBase> EventGetBasicProjectionMatrixHook2() {
      return this.FovEvent;
   }

   public ArrayList<ItemServiceBase> DataChangedEvent() {
      return this.EventRender;
   }

   public ArrayList<ItemServiceBase> EventInjectPlaced() {
      return this.EventItemRenderHook;
   }

   public ArrayList<ItemServiceBase> ChatMessageEvent() {
      return this.EventRender2;
   }
}
