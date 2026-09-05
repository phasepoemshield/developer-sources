/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.LegacyStringDeserializer
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer
 *  com.viaversion.viaversion.libs.mcstructs.text.utils.TextUtils
 */
package net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.rewriter;

import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.LegacyStringDeserializer;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer;
import com.viaversion.viaversion.libs.mcstructs.text.utils.TextUtils;

public class TextRewriter {
    private static final Object2ObjectMap<String, String> TRANSLATIONS = new Object2ObjectOpenHashMap(37, 0.99f);

    public static String toClient(String text) {
        TextComponent component = TextComponentSerializer.V1_6.deserialize(text);
        TextUtils.iterateAll((TextComponent)component, c -> {
            TranslationComponent translationComponent;
            if (c instanceof TranslationComponent && TRANSLATIONS.containsKey((Object)(translationComponent = (TranslationComponent)c).getKey())) {
                translationComponent.setKey((String)TRANSLATIONS.get((Object)translationComponent.getKey()));
            }
        });
        component = TextUtils.replace((TextComponent)component, c -> {
            if (c instanceof StringComponent) {
                return LegacyStringDeserializer.parse((String)c.asSingleString(), (boolean)true).setParentStyle(c.getStyle());
            }
            return c;
        });
        TextUtils.iterateAll((TextComponent)component, c -> {
            if (c instanceof TranslationComponent) {
                TranslationComponent translationComponent = (TranslationComponent)c;
                Object[] args = translationComponent.getArgs();
                for (int i = 0; i < args.length; ++i) {
                    if (args[i] == null || args[i] instanceof TextComponent) continue;
                    args[i] = new StringComponent(args[i].toString());
                }
            }
        });
        component = TextUtils.replace((TextComponent)component, TextUtils::makeURLsClickable);
        return TextComponentSerializer.V1_7.serialize(component);
    }

    static {
        TRANSLATIONS.put((Object)"menu.playdemo", (Object)"Play Demo World");
        TRANSLATIONS.put((Object)"options.ao.off", (Object)"Off");
        TRANSLATIONS.put((Object)"options.framerateLimit", (Object)"Performance");
        TRANSLATIONS.put((Object)"options.resourcepack", (Object)"Resource Packs");
        TRANSLATIONS.put((Object)"performance.max", (Object)"Max FPS");
        TRANSLATIONS.put((Object)"performance.balanced", (Object)"Balanced");
        TRANSLATIONS.put((Object)"performance.powersaver", (Object)"Power saver");
        TRANSLATIONS.put((Object)"key.forward", (Object)"Forward");
        TRANSLATIONS.put((Object)"key.left", (Object)"Left");
        TRANSLATIONS.put((Object)"key.back", (Object)"Back");
        TRANSLATIONS.put((Object)"key.right", (Object)"Right");
        TRANSLATIONS.put((Object)"key.drop", (Object)"Drop");
        TRANSLATIONS.put((Object)"key.chat", (Object)"Chat");
        TRANSLATIONS.put((Object)"key.fog", (Object)"Toggle Fog");
        TRANSLATIONS.put((Object)"key.attack", (Object)"Attack");
        TRANSLATIONS.put((Object)"key.use", (Object)"Use Item");
        TRANSLATIONS.put((Object)"key.command", (Object)"Command");
        TRANSLATIONS.put((Object)"resourcePack.title", (Object)"Select Resource Pack");
        TRANSLATIONS.put((Object)"tile.dirt.name", (Object)"Dirt");
        TRANSLATIONS.put((Object)"tile.sand.name", (Object)"Sand");
        TRANSLATIONS.put((Object)"tile.flower.name", (Object)"Flower");
        TRANSLATIONS.put((Object)"tile.rose.name", (Object)"Rose");
        TRANSLATIONS.put((Object)"item.fishRaw.name", (Object)"Raw Fish");
        TRANSLATIONS.put((Object)"item.fishCooked.name", (Object)"Cooked Fish");
        TRANSLATIONS.put((Object)"commands.give.usage", (Object)"/give <player> <item> [amount] [data]");
        TRANSLATIONS.put((Object)"commands.give.success", (Object)"Given %s (ID %s) * %s to %s");
        TRANSLATIONS.put((Object)"commands.scoreboard.objectives.add.wrongType", (Object)"Invalid objective criteria type. Valid types are: %s");
        TRANSLATIONS.put((Object)"commands.scoreboard.objectives.list.count", (Object)"Showing %s objective(s) on scoreboard");
        TRANSLATIONS.put((Object)"commands.scoreboard.players.list.count", (Object)"Showing %s tracked players on the scoreboard");
        TRANSLATIONS.put((Object)"commands.scoreboard.players.list.player.count", (Object)"Showing %s tracked objective(s) for %s");
        TRANSLATIONS.put((Object)"commands.scoreboard.teams.list.count", (Object)"Showing %s teams on the scoreboard");
        TRANSLATIONS.put((Object)"commands.scoreboard.teams.list.player.count", (Object)"Showing %s player(s) in team %s");
        TRANSLATIONS.put((Object)"commands.scoreboard.teams.empty.usage", (Object)"/scoreboard teams clear <name>");
        TRANSLATIONS.put((Object)"commands.scoreboard.teams.option.usage", (Object)"/scoreboard teams option <team> <friendlyfire|color> <value>");
        TRANSLATIONS.put((Object)"commands.weather.usage", (Object)"/weather <clear/rain/thunder> [duration in seconds]");
        TRANSLATIONS.put((Object)"mco.configure.world.subscription.extend", (Object)"Extend");
        TRANSLATIONS.put((Object)"mco.configure.world.restore.question.line1", (Object)"Your realm will be restored to a previous version");
    }

    public static String toClientDisconnect(String reason) {
        return TextComponentSerializer.V1_7.serialize((TextComponent)new StringComponent(reason));
    }
}

