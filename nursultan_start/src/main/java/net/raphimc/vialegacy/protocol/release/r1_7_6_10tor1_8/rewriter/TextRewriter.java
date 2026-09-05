/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.mcstructs.snbt.SNbt
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.ItemHoverEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.ItemHoverEvent$DataHolder
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.ItemHoverEvent$LegacyHolder
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer
 *  com.viaversion.viaversion.libs.mcstructs.text.utils.TextUtils
 *  com.viaversion.viaversion.util.Key
 *  net.raphimc.vialegacy.ViaLegacy
 */
package net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.mcstructs.snbt.SNbt;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.ItemHoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer;
import com.viaversion.viaversion.libs.mcstructs.text.utils.TextUtils;
import com.viaversion.viaversion.util.Key;
import java.util.logging.Level;
import net.raphimc.vialegacy.ViaLegacy;

public class TextRewriter {
    private static final Object2ObjectMap<String, String> TRANSLATIONS = new Object2ObjectOpenHashMap(59, 0.99f);
    private static final Int2ObjectOpenHashMap<String> ID_TO_NAME = new Int2ObjectOpenHashMap(315, 0.99f);
    private final Protocol<?, ?, ?, ?> protocol;

    public String toClient(UserConnection user, String text) {
        TextComponent component = TextComponentSerializer.V1_7.deserialize(text);
        TextUtils.iterateAll((TextComponent)component, c -> {
            TranslationComponent translationComponent;
            if (c instanceof TranslationComponent && TRANSLATIONS.containsKey((Object)(translationComponent = (TranslationComponent)c).getKey())) {
                translationComponent.setKey((String)TRANSLATIONS.get((Object)translationComponent.getKey()));
            }
        });
        TextUtils.iterateAll((TextComponent)component, c -> {
            ItemHoverEvent itemHoverEvent;
            ItemHoverEvent.DataHolder patt22306$temp;
            HoverEvent patt22237$temp = c.getStyle().getHoverEvent();
            if (patt22237$temp instanceof ItemHoverEvent && (patt22306$temp = (itemHoverEvent = (ItemHoverEvent)patt22237$temp).getData()) instanceof ItemHoverEvent.LegacyHolder) {
                ItemHoverEvent.LegacyHolder legacyHolder = (ItemHoverEvent.LegacyHolder)patt22306$temp;
                try {
                    CompoundTag tag = (CompoundTag)SNbt.V1_7.deserialize(legacyHolder.getData());
                    short id = tag.getShort("id");
                    short damage = tag.getShort("Damage");
                    CompoundTag itemTag = tag.getCompoundTag("tag");
                    DataItem item = new DataItem();
                    item.setIdentifier((int)id);
                    item.setData(damage);
                    item.setTag(itemTag);
                    item = this.protocol.getItemRewriter().handleItemToClient(user, (Item)item);
                    if (!ID_TO_NAME.containsKey(item.identifier())) {
                        throw new IllegalArgumentException("Invalid item ID: " + item.identifier());
                    }
                    tag.putString("id", Key.namespaced((String)((String)ID_TO_NAME.get(item.identifier()))));
                    if (damage != item.data()) {
                        tag.putShort("Damage", item.data());
                    }
                    if (item.tag() != itemTag) {
                        tag.put("tag", (Tag)item.tag());
                    }
                    legacyHolder.setData(SNbt.V1_8.serialize((Tag)tag));
                }
                catch (Throwable e) {
                    if (Via.getConfig().logTextComponentConversionErrors()) {
                        ViaLegacy.getPlatform().getLogger().log(Level.WARNING, "Error remapping NBT in show_item:" + legacyHolder.getData(), e);
                    }
                    legacyHolder.setData("");
                }
            }
        });
        return TextComponentSerializer.V1_8.serialize(component);
    }

    public TextRewriter(Protocol<?, ?, ?, ?> protocol) {
        this.protocol = protocol;
    }

    static {
        TRANSLATIONS.put((Object)"gui.toMenu", (Object)"Back to title screen");
        TRANSLATIONS.put((Object)"generator.amplified", (Object)"Amplified");
        TRANSLATIONS.put((Object)"disconnect.loginFailedInfo.serversUnavailable", (Object)"The authentication are currently down for maintenance.");
        TRANSLATIONS.put((Object)"options.aoDesc0", (Object)"Enable faux ambient occlusion on blocks.");
        TRANSLATIONS.put((Object)"options.framerateLimitDesc0", (Object)"Selects the maximum frame rate:");
        TRANSLATIONS.put((Object)"options.framerateLimitDesc1", (Object)"35fps, 120fps, or 200+fps.");
        TRANSLATIONS.put((Object)"options.viewBobbingDesc0", (Object)"Enables view-bob when moving.");
        TRANSLATIONS.put((Object)"options.renderCloudsDesc0", (Object)"Enables the rendering of clouds.");
        TRANSLATIONS.put((Object)"options.graphicsDesc0", (Object)"'Fancy': Enables extra transparency.");
        TRANSLATIONS.put((Object)"options.graphicsDesc1", (Object)"'Fast': Suggested for lower-end hardware.");
        TRANSLATIONS.put((Object)"options.renderDistanceDesc0", (Object)"Maximum render distance. Smaller values");
        TRANSLATIONS.put((Object)"options.renderDistanceDesc1", (Object)"run better on lower-end hardware.");
        TRANSLATIONS.put((Object)"options.particlesDesc0", (Object)"Selects the overall amount of particles.");
        TRANSLATIONS.put((Object)"options.particlesDesc1", (Object)"On lower-end hardware, less is better.");
        TRANSLATIONS.put((Object)"options.advancedOpenglDesc0", (Object)"Enables occlusion queries. On AMD and Intel");
        TRANSLATIONS.put((Object)"options.advancedOpenglDesc1", (Object)"hardware, this may decrease performance.");
        TRANSLATIONS.put((Object)"options.fboEnableDesc0", (Object)"Enables the use of Framebuffer Objects.");
        TRANSLATIONS.put((Object)"options.fboEnableDesc1", (Object)"Necessary for certain Minecraft features.");
        TRANSLATIONS.put((Object)"options.postProcessEnableDesc0", (Object)"Enables post-processing. Disabling will");
        TRANSLATIONS.put((Object)"options.postProcessEnableDesc1", (Object)"result in reduction in Awesome Levels.");
        TRANSLATIONS.put((Object)"options.showCape", (Object)"Show Cape");
        TRANSLATIONS.put((Object)"options.anisotropicFiltering", (Object)"Anisotropic Filtering");
        TRANSLATIONS.put((Object)"tile.stone.name", (Object)"Stone");
        TRANSLATIONS.put((Object)"tile.sapling.roofed_oak.name", (Object)"Dark Oak Sapling");
        TRANSLATIONS.put((Object)"tile.sponge.name", (Object)"Sponge");
        TRANSLATIONS.put((Object)"tile.stairsStone.name", (Object)"Stone Stairs");
        TRANSLATIONS.put((Object)"tile.pressurePlate.name", (Object)"Pressure Plate");
        TRANSLATIONS.put((Object)"tile.fence.name", (Object)"Fence");
        TRANSLATIONS.put((Object)"tile.fenceGate.name", (Object)"Fence Gate");
        TRANSLATIONS.put((Object)"tile.trapdoor.name", (Object)"Trapdoor");
        TRANSLATIONS.put((Object)"item.doorWood.name", (Object)"Wooden Door");
        TRANSLATIONS.put((Object)"entity.Arrow.name", (Object)"arrow");
        TRANSLATIONS.put((Object)"achievement.overkill.desc", (Object)"Deal eight hearts of damage in a single hit");
        TRANSLATIONS.put((Object)"commands.generic.deprecatedId", (Object)"Warning: Using numeric IDs will not be supported in the future. Please use names, such as '%s'");
        TRANSLATIONS.put((Object)"commands.give.notFound", (Object)"There is no such item with ID %s");
        TRANSLATIONS.put((Object)"commands.effect.usage", (Object)"/effect <player> <effect> [seconds] [amplifier]");
        TRANSLATIONS.put((Object)"commands.clear.usage", (Object)"/clear <player> [item] [data]");
        TRANSLATIONS.put((Object)"commands.time.usage", (Object)"/time <set|add> <value>");
        TRANSLATIONS.put((Object)"commands.kill.usage", (Object)"/kill");
        TRANSLATIONS.put((Object)"commands.kill.success", (Object)"Ouch! That looked like it hurt");
        TRANSLATIONS.put((Object)"commands.tp.success.coordinates", (Object)"Teleported %s to %s,%s,%s");
        TRANSLATIONS.put((Object)"commands.tp.usage", (Object)"/tp [target player] <destination player> OR /tp [target player] <x> <y> <z>");
        TRANSLATIONS.put((Object)"commands.scoreboard.usage", (Object)"/scoreboard <objectives|players|teams>");
        TRANSLATIONS.put((Object)"commands.scoreboard.objectives.usage", (Object)"/scoreboard objectives <list|add|remove|setdisplay>");
        TRANSLATIONS.put((Object)"commands.scoreboard.players.usage", (Object)"/scoreboard players <set|add|remove|reset|list>");
        TRANSLATIONS.put((Object)"commands.scoreboard.players.set.usage", (Object)"/scoreboard players set <player> <objective> <score>");
        TRANSLATIONS.put((Object)"commands.scoreboard.players.add.usage", (Object)"/scoreboard players add <player> <objective> <count>");
        TRANSLATIONS.put((Object)"commands.scoreboard.players.remove.usage", (Object)"/scoreboard players remove <player> <objective> <count>");
        TRANSLATIONS.put((Object)"commands.scoreboard.players.reset.usage", (Object)"/scoreboard players reset <player>");
        TRANSLATIONS.put((Object)"commands.scoreboard.players.reset.success", (Object)"Reset all scores of player %s");
        TRANSLATIONS.put((Object)"commands.scoreboard.teams.usage", (Object)"/scoreboard teams <list|add|remove|empty|join|leave|option>");
        TRANSLATIONS.put((Object)"commands.scoreboard.teams.empty.usage", (Object)"/scoreboard teams empty");
        TRANSLATIONS.put((Object)"commands.scoreboard.teams.option.usage", (Object)"/scoreboard teams option <team> <friendlyfire|color|seeFriendlyInvisibles> <value>");
        TRANSLATIONS.put((Object)"commands.spawnpoint.usage", (Object)"/spawnpoint OR /spawnpoint <player> OR /spawnpoint <player> <x> <y> <z>");
        TRANSLATIONS.put((Object)"commands.setworldspawn.usage", (Object)"/setworldspawn OR /setworldspawn <x> <y> <z>");
        TRANSLATIONS.put((Object)"commands.gamerule.usage", (Object)"/gamerule <rule name> <value> OR /gamerule <rule name>");
        TRANSLATIONS.put((Object)"commands.testfor.usage", (Object)"/testfor <player>");
        TRANSLATIONS.put((Object)"commands.testfor.failed", (Object)"/testfor is only usable by commandblocks with analog output");
        TRANSLATIONS.put((Object)"commands.achievement.usage", (Object)"/achievement give <stat_name> [player]");
        ID_TO_NAME.put(1, (Object)"stone");
        ID_TO_NAME.put(2, (Object)"grass");
        ID_TO_NAME.put(3, (Object)"dirt");
        ID_TO_NAME.put(4, (Object)"cobblestone");
        ID_TO_NAME.put(5, (Object)"planks");
        ID_TO_NAME.put(6, (Object)"sapling");
        ID_TO_NAME.put(7, (Object)"bedrock");
        ID_TO_NAME.put(8, (Object)"flowing_water");
        ID_TO_NAME.put(9, (Object)"water");
        ID_TO_NAME.put(10, (Object)"flowing_lava");
        ID_TO_NAME.put(11, (Object)"lava");
        ID_TO_NAME.put(12, (Object)"sand");
        ID_TO_NAME.put(13, (Object)"gravel");
        ID_TO_NAME.put(14, (Object)"gold_ore");
        ID_TO_NAME.put(15, (Object)"iron_ore");
        ID_TO_NAME.put(16, (Object)"coal_ore");
        ID_TO_NAME.put(17, (Object)"log");
        ID_TO_NAME.put(18, (Object)"leaves");
        ID_TO_NAME.put(19, (Object)"sponge");
        ID_TO_NAME.put(20, (Object)"glass");
        ID_TO_NAME.put(21, (Object)"lapis_ore");
        ID_TO_NAME.put(22, (Object)"lapis_block");
        ID_TO_NAME.put(23, (Object)"dispenser");
        ID_TO_NAME.put(24, (Object)"sandstone");
        ID_TO_NAME.put(25, (Object)"noteblock");
        ID_TO_NAME.put(27, (Object)"golden_rail");
        ID_TO_NAME.put(28, (Object)"detector_rail");
        ID_TO_NAME.put(29, (Object)"sticky_piston");
        ID_TO_NAME.put(30, (Object)"web");
        ID_TO_NAME.put(31, (Object)"tallgrass");
        ID_TO_NAME.put(32, (Object)"deadbush");
        ID_TO_NAME.put(33, (Object)"piston");
        ID_TO_NAME.put(35, (Object)"wool");
        ID_TO_NAME.put(37, (Object)"yellow_flower");
        ID_TO_NAME.put(38, (Object)"red_flower");
        ID_TO_NAME.put(39, (Object)"brown_mushroom");
        ID_TO_NAME.put(40, (Object)"red_mushroom");
        ID_TO_NAME.put(41, (Object)"gold_block");
        ID_TO_NAME.put(42, (Object)"iron_block");
        ID_TO_NAME.put(43, (Object)"double_stone_slab");
        ID_TO_NAME.put(44, (Object)"stone_slab");
        ID_TO_NAME.put(45, (Object)"brick_block");
        ID_TO_NAME.put(46, (Object)"tnt");
        ID_TO_NAME.put(47, (Object)"bookshelf");
        ID_TO_NAME.put(48, (Object)"mossy_cobblestone");
        ID_TO_NAME.put(49, (Object)"obsidian");
        ID_TO_NAME.put(50, (Object)"torch");
        ID_TO_NAME.put(51, (Object)"fire");
        ID_TO_NAME.put(52, (Object)"mob_spawner");
        ID_TO_NAME.put(53, (Object)"oak_stairs");
        ID_TO_NAME.put(54, (Object)"chest");
        ID_TO_NAME.put(56, (Object)"diamond_ore");
        ID_TO_NAME.put(57, (Object)"diamond_block");
        ID_TO_NAME.put(58, (Object)"crafting_table");
        ID_TO_NAME.put(60, (Object)"farmland");
        ID_TO_NAME.put(61, (Object)"furnace");
        ID_TO_NAME.put(62, (Object)"lit_furnace");
        ID_TO_NAME.put(65, (Object)"ladder");
        ID_TO_NAME.put(66, (Object)"rail");
        ID_TO_NAME.put(67, (Object)"stone_stairs");
        ID_TO_NAME.put(69, (Object)"lever");
        ID_TO_NAME.put(70, (Object)"stone_pressure_plate");
        ID_TO_NAME.put(72, (Object)"wooden_pressure_plate");
        ID_TO_NAME.put(73, (Object)"redstone_ore");
        ID_TO_NAME.put(76, (Object)"redstone_torch");
        ID_TO_NAME.put(77, (Object)"stone_button");
        ID_TO_NAME.put(78, (Object)"snow_layer");
        ID_TO_NAME.put(79, (Object)"ice");
        ID_TO_NAME.put(80, (Object)"snow");
        ID_TO_NAME.put(81, (Object)"cactus");
        ID_TO_NAME.put(82, (Object)"clay");
        ID_TO_NAME.put(84, (Object)"jukebox");
        ID_TO_NAME.put(85, (Object)"fence");
        ID_TO_NAME.put(86, (Object)"pumpkin");
        ID_TO_NAME.put(87, (Object)"netherrack");
        ID_TO_NAME.put(88, (Object)"soul_sand");
        ID_TO_NAME.put(89, (Object)"glowstone");
        ID_TO_NAME.put(90, (Object)"portal");
        ID_TO_NAME.put(91, (Object)"lit_pumpkin");
        ID_TO_NAME.put(95, (Object)"stained_glass");
        ID_TO_NAME.put(96, (Object)"trapdoor");
        ID_TO_NAME.put(97, (Object)"monster_egg");
        ID_TO_NAME.put(98, (Object)"stonebrick");
        ID_TO_NAME.put(99, (Object)"brown_mushroom_block");
        ID_TO_NAME.put(100, (Object)"red_mushroom_block");
        ID_TO_NAME.put(101, (Object)"iron_bars");
        ID_TO_NAME.put(102, (Object)"glass_pane");
        ID_TO_NAME.put(103, (Object)"melon_block");
        ID_TO_NAME.put(106, (Object)"vine");
        ID_TO_NAME.put(107, (Object)"fence_gate");
        ID_TO_NAME.put(108, (Object)"brick_stairs");
        ID_TO_NAME.put(109, (Object)"stone_brick_stairs");
        ID_TO_NAME.put(110, (Object)"mycelium");
        ID_TO_NAME.put(111, (Object)"waterlily");
        ID_TO_NAME.put(112, (Object)"nether_brick");
        ID_TO_NAME.put(113, (Object)"nether_brick_fence");
        ID_TO_NAME.put(114, (Object)"nether_brick_stairs");
        ID_TO_NAME.put(116, (Object)"enchanting_table");
        ID_TO_NAME.put(119, (Object)"end_portal");
        ID_TO_NAME.put(120, (Object)"end_portal_frame");
        ID_TO_NAME.put(121, (Object)"end_stone");
        ID_TO_NAME.put(122, (Object)"dragon_egg");
        ID_TO_NAME.put(123, (Object)"redstone_lamp");
        ID_TO_NAME.put(125, (Object)"double_wooden_slab");
        ID_TO_NAME.put(126, (Object)"wooden_slab");
        ID_TO_NAME.put(127, (Object)"cocoa");
        ID_TO_NAME.put(128, (Object)"sandstone_stairs");
        ID_TO_NAME.put(129, (Object)"emerald_ore");
        ID_TO_NAME.put(130, (Object)"ender_chest");
        ID_TO_NAME.put(131, (Object)"tripwire_hook");
        ID_TO_NAME.put(133, (Object)"emerald_block");
        ID_TO_NAME.put(134, (Object)"spruce_stairs");
        ID_TO_NAME.put(135, (Object)"birch_stairs");
        ID_TO_NAME.put(136, (Object)"jungle_stairs");
        ID_TO_NAME.put(137, (Object)"command_block");
        ID_TO_NAME.put(138, (Object)"beacon");
        ID_TO_NAME.put(139, (Object)"cobblestone_wall");
        ID_TO_NAME.put(141, (Object)"carrots");
        ID_TO_NAME.put(142, (Object)"potatoes");
        ID_TO_NAME.put(143, (Object)"wooden_button");
        ID_TO_NAME.put(145, (Object)"anvil");
        ID_TO_NAME.put(146, (Object)"trapped_chest");
        ID_TO_NAME.put(147, (Object)"light_weighted_pressure_plate");
        ID_TO_NAME.put(148, (Object)"heavy_weighted_pressure_plate");
        ID_TO_NAME.put(151, (Object)"daylight_detector");
        ID_TO_NAME.put(152, (Object)"redstone_block");
        ID_TO_NAME.put(153, (Object)"quartz_ore");
        ID_TO_NAME.put(154, (Object)"hopper");
        ID_TO_NAME.put(155, (Object)"quartz_block");
        ID_TO_NAME.put(156, (Object)"quartz_stairs");
        ID_TO_NAME.put(157, (Object)"activator_rail");
        ID_TO_NAME.put(158, (Object)"dropper");
        ID_TO_NAME.put(159, (Object)"stained_hardened_clay");
        ID_TO_NAME.put(160, (Object)"stained_glass_pane");
        ID_TO_NAME.put(161, (Object)"leaves2");
        ID_TO_NAME.put(162, (Object)"log2");
        ID_TO_NAME.put(163, (Object)"acacia_stairs");
        ID_TO_NAME.put(164, (Object)"dark_oak_stairs");
        ID_TO_NAME.put(170, (Object)"hay_block");
        ID_TO_NAME.put(171, (Object)"carpet");
        ID_TO_NAME.put(172, (Object)"hardened_clay");
        ID_TO_NAME.put(173, (Object)"coal_block");
        ID_TO_NAME.put(174, (Object)"packed_ice");
        ID_TO_NAME.put(175, (Object)"double_plant");
        ID_TO_NAME.put(256, (Object)"iron_shovel");
        ID_TO_NAME.put(257, (Object)"iron_pickaxe");
        ID_TO_NAME.put(258, (Object)"iron_axe");
        ID_TO_NAME.put(259, (Object)"flint_and_steel");
        ID_TO_NAME.put(260, (Object)"apple");
        ID_TO_NAME.put(261, (Object)"bow");
        ID_TO_NAME.put(262, (Object)"arrow");
        ID_TO_NAME.put(263, (Object)"coal");
        ID_TO_NAME.put(264, (Object)"diamond");
        ID_TO_NAME.put(265, (Object)"iron_ingot");
        ID_TO_NAME.put(266, (Object)"gold_ingot");
        ID_TO_NAME.put(267, (Object)"iron_sword");
        ID_TO_NAME.put(268, (Object)"wooden_sword");
        ID_TO_NAME.put(269, (Object)"wooden_shovel");
        ID_TO_NAME.put(270, (Object)"wooden_pickaxe");
        ID_TO_NAME.put(271, (Object)"wooden_axe");
        ID_TO_NAME.put(272, (Object)"stone_sword");
        ID_TO_NAME.put(273, (Object)"stone_shovel");
        ID_TO_NAME.put(274, (Object)"stone_pickaxe");
        ID_TO_NAME.put(275, (Object)"stone_axe");
        ID_TO_NAME.put(276, (Object)"diamond_sword");
        ID_TO_NAME.put(277, (Object)"diamond_shovel");
        ID_TO_NAME.put(278, (Object)"diamond_pickaxe");
        ID_TO_NAME.put(279, (Object)"diamond_axe");
        ID_TO_NAME.put(280, (Object)"stick");
        ID_TO_NAME.put(281, (Object)"bowl");
        ID_TO_NAME.put(282, (Object)"mushroom_stew");
        ID_TO_NAME.put(283, (Object)"golden_sword");
        ID_TO_NAME.put(284, (Object)"golden_shovel");
        ID_TO_NAME.put(285, (Object)"golden_pickaxe");
        ID_TO_NAME.put(286, (Object)"golden_axe");
        ID_TO_NAME.put(287, (Object)"string");
        ID_TO_NAME.put(288, (Object)"feather");
        ID_TO_NAME.put(289, (Object)"gunpowder");
        ID_TO_NAME.put(290, (Object)"wooden_hoe");
        ID_TO_NAME.put(291, (Object)"stone_hoe");
        ID_TO_NAME.put(292, (Object)"iron_hoe");
        ID_TO_NAME.put(293, (Object)"diamond_hoe");
        ID_TO_NAME.put(294, (Object)"golden_hoe");
        ID_TO_NAME.put(295, (Object)"wheat_seeds");
        ID_TO_NAME.put(296, (Object)"wheat");
        ID_TO_NAME.put(297, (Object)"bread");
        ID_TO_NAME.put(298, (Object)"leather_helmet");
        ID_TO_NAME.put(299, (Object)"leather_chestplate");
        ID_TO_NAME.put(300, (Object)"leather_leggings");
        ID_TO_NAME.put(301, (Object)"leather_boots");
        ID_TO_NAME.put(302, (Object)"chainmail_helmet");
        ID_TO_NAME.put(303, (Object)"chainmail_chestplate");
        ID_TO_NAME.put(304, (Object)"chainmail_leggings");
        ID_TO_NAME.put(305, (Object)"chainmail_boots");
        ID_TO_NAME.put(306, (Object)"iron_helmet");
        ID_TO_NAME.put(307, (Object)"iron_chestplate");
        ID_TO_NAME.put(308, (Object)"iron_leggings");
        ID_TO_NAME.put(309, (Object)"iron_boots");
        ID_TO_NAME.put(310, (Object)"diamond_helmet");
        ID_TO_NAME.put(311, (Object)"diamond_chestplate");
        ID_TO_NAME.put(312, (Object)"diamond_leggings");
        ID_TO_NAME.put(313, (Object)"diamond_boots");
        ID_TO_NAME.put(314, (Object)"golden_helmet");
        ID_TO_NAME.put(315, (Object)"golden_chestplate");
        ID_TO_NAME.put(316, (Object)"golden_leggings");
        ID_TO_NAME.put(317, (Object)"golden_boots");
        ID_TO_NAME.put(318, (Object)"flint");
        ID_TO_NAME.put(319, (Object)"porkchop");
        ID_TO_NAME.put(320, (Object)"cooked_porkchop");
        ID_TO_NAME.put(321, (Object)"painting");
        ID_TO_NAME.put(322, (Object)"golden_apple");
        ID_TO_NAME.put(323, (Object)"sign");
        ID_TO_NAME.put(324, (Object)"wooden_door");
        ID_TO_NAME.put(325, (Object)"bucket");
        ID_TO_NAME.put(326, (Object)"water_bucket");
        ID_TO_NAME.put(327, (Object)"lava_bucket");
        ID_TO_NAME.put(328, (Object)"minecart");
        ID_TO_NAME.put(329, (Object)"saddle");
        ID_TO_NAME.put(330, (Object)"iron_door");
        ID_TO_NAME.put(331, (Object)"redstone");
        ID_TO_NAME.put(332, (Object)"snowball");
        ID_TO_NAME.put(333, (Object)"boat");
        ID_TO_NAME.put(334, (Object)"leather");
        ID_TO_NAME.put(335, (Object)"milk_bucket");
        ID_TO_NAME.put(336, (Object)"brick");
        ID_TO_NAME.put(337, (Object)"clay_ball");
        ID_TO_NAME.put(338, (Object)"reeds");
        ID_TO_NAME.put(339, (Object)"paper");
        ID_TO_NAME.put(340, (Object)"book");
        ID_TO_NAME.put(341, (Object)"slime_ball");
        ID_TO_NAME.put(342, (Object)"chest_minecart");
        ID_TO_NAME.put(343, (Object)"furnace_minecart");
        ID_TO_NAME.put(344, (Object)"egg");
        ID_TO_NAME.put(345, (Object)"compass");
        ID_TO_NAME.put(346, (Object)"fishing_rod");
        ID_TO_NAME.put(347, (Object)"clock");
        ID_TO_NAME.put(348, (Object)"glowstone_dust");
        ID_TO_NAME.put(349, (Object)"fish");
        ID_TO_NAME.put(350, (Object)"cooked_fished");
        ID_TO_NAME.put(351, (Object)"dye");
        ID_TO_NAME.put(352, (Object)"bone");
        ID_TO_NAME.put(353, (Object)"sugar");
        ID_TO_NAME.put(354, (Object)"cake");
        ID_TO_NAME.put(355, (Object)"bed");
        ID_TO_NAME.put(356, (Object)"repeater");
        ID_TO_NAME.put(357, (Object)"cookie");
        ID_TO_NAME.put(358, (Object)"filled_map");
        ID_TO_NAME.put(359, (Object)"shears");
        ID_TO_NAME.put(360, (Object)"melon");
        ID_TO_NAME.put(361, (Object)"pumpkin_seeds");
        ID_TO_NAME.put(362, (Object)"melon_seeds");
        ID_TO_NAME.put(363, (Object)"beef");
        ID_TO_NAME.put(364, (Object)"cooked_beef");
        ID_TO_NAME.put(365, (Object)"chicken");
        ID_TO_NAME.put(366, (Object)"cooked_chicken");
        ID_TO_NAME.put(367, (Object)"rotten_flesh");
        ID_TO_NAME.put(368, (Object)"ender_pearl");
        ID_TO_NAME.put(369, (Object)"blaze_rod");
        ID_TO_NAME.put(370, (Object)"ghast_tear");
        ID_TO_NAME.put(371, (Object)"gold_nugget");
        ID_TO_NAME.put(372, (Object)"nether_wart");
        ID_TO_NAME.put(373, (Object)"potion");
        ID_TO_NAME.put(374, (Object)"glass_bottle");
        ID_TO_NAME.put(375, (Object)"spider_eye");
        ID_TO_NAME.put(376, (Object)"fermented_spider_eye");
        ID_TO_NAME.put(377, (Object)"blaze_powder");
        ID_TO_NAME.put(378, (Object)"magma_cream");
        ID_TO_NAME.put(379, (Object)"brewing_stand");
        ID_TO_NAME.put(380, (Object)"cauldron");
        ID_TO_NAME.put(381, (Object)"ender_eye");
        ID_TO_NAME.put(382, (Object)"speckled_melon");
        ID_TO_NAME.put(383, (Object)"spawn_egg");
        ID_TO_NAME.put(384, (Object)"experience_bottle");
        ID_TO_NAME.put(385, (Object)"fire_charge");
        ID_TO_NAME.put(386, (Object)"writable_book");
        ID_TO_NAME.put(387, (Object)"written_book");
        ID_TO_NAME.put(388, (Object)"emerald");
        ID_TO_NAME.put(389, (Object)"item_frame");
        ID_TO_NAME.put(390, (Object)"flower_pot");
        ID_TO_NAME.put(391, (Object)"carrot");
        ID_TO_NAME.put(392, (Object)"potato");
        ID_TO_NAME.put(393, (Object)"baked_potato");
        ID_TO_NAME.put(394, (Object)"poisonous_potato");
        ID_TO_NAME.put(395, (Object)"map");
        ID_TO_NAME.put(396, (Object)"golden_carrot");
        ID_TO_NAME.put(397, (Object)"skull");
        ID_TO_NAME.put(398, (Object)"carrot_on_a_stick");
        ID_TO_NAME.put(399, (Object)"nether_star");
        ID_TO_NAME.put(400, (Object)"pumpkin_pie");
        ID_TO_NAME.put(401, (Object)"fireworks");
        ID_TO_NAME.put(402, (Object)"firework_charge");
        ID_TO_NAME.put(403, (Object)"enchanted_book");
        ID_TO_NAME.put(404, (Object)"comparator");
        ID_TO_NAME.put(405, (Object)"netherbrick");
        ID_TO_NAME.put(406, (Object)"quartz");
        ID_TO_NAME.put(407, (Object)"tnt_minecart");
        ID_TO_NAME.put(408, (Object)"hopper_minecart");
        ID_TO_NAME.put(417, (Object)"iron_horse_armor");
        ID_TO_NAME.put(418, (Object)"golden_horse_armor");
        ID_TO_NAME.put(419, (Object)"diamond_horse_armor");
        ID_TO_NAME.put(420, (Object)"lead");
        ID_TO_NAME.put(421, (Object)"name_tag");
        ID_TO_NAME.put(422, (Object)"command_block_minecart");
        ID_TO_NAME.put(2256, (Object)"record_13");
        ID_TO_NAME.put(2257, (Object)"record_cat");
        ID_TO_NAME.put(2258, (Object)"record_blocks");
        ID_TO_NAME.put(2259, (Object)"record_chirp");
        ID_TO_NAME.put(2260, (Object)"record_far");
        ID_TO_NAME.put(2261, (Object)"record_mall");
        ID_TO_NAME.put(2262, (Object)"record_mellohi");
        ID_TO_NAME.put(2263, (Object)"record_stal");
        ID_TO_NAME.put(2264, (Object)"record_strad");
        ID_TO_NAME.put(2265, (Object)"record_ward");
        ID_TO_NAME.put(2266, (Object)"record_11");
        ID_TO_NAME.put(2267, (Object)"record_wait");
    }
}

