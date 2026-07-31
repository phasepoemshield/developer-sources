package fun.wonderful.api.utils.replace;

import java.util.regex.Pattern;
import net.minecraft.util.Formatting;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.text.MutableText;
import net.minecraft.text.TextContent;
import net.minecraft.text.PlainTextContent;

public class ReplaceUtils {
    public static Text replace(Text input, String target, String replacement) {
        if (input == null || target == null || replacement == null) {
            return input;
        }
        MutableText result = Text.empty().setStyle(input.getStyle());
        ReplaceUtils.appendReplaced(result, input, target, replacement);
        return result;
    }

    private static void appendReplaced(MutableText result, Text current, String target, String replacement) {
        TextContent content = current.getContent();
        Style style = current.getStyle();
        if (content instanceof PlainTextContent.class_2585) {
            PlainTextContent.class_2585 literal = (PlainTextContent.class_2585)content;
            Pattern pattern = Pattern.compile(Pattern.quote(target), 2);
            String replaced = pattern.matcher(literal.comp_737()).replaceAll(replacement);
            result.append((Text)Text.literal((String)replaced).setStyle(style));
        }
        for (Text sibling : current.getSiblings()) {
            ReplaceUtils.appendReplaced(result, sibling, target, replacement);
        }
    }

    public static String replaceSymbols(String string) {
        return string.replaceAll("\ua517", String.valueOf(Formatting.BLUE) + "MODER").replaceAll("\ua525", String.valueOf(Formatting.BLUE) + "ST.MODER").replaceAll("\ua521", String.valueOf(Formatting.LIGHT_PURPLE) + "MODER+").replaceAll("\ua500", String.valueOf(Formatting.GRAY) + "PLAYER").replaceAll("\ua509", String.valueOf(Formatting.YELLOW) + "HELPER").replaceAll("\u25c6", "@").replaceAll("\u2503", "|").replaceAll("\ua546", String.valueOf(Formatting.YELLOW) + "PEGAS").replaceAll("\ua538", String.valueOf(Formatting.YELLOW) + "GOD").replaceAll("\ua533", String.valueOf(Formatting.AQUA) + "Ml.admin").replaceAll("\ua505", String.valueOf(Formatting.RED) + "Y" + String.valueOf(Formatting.WHITE) + "T").replaceAll("\ua502", String.valueOf(Formatting.BLUE) + "D.MODER").replaceAll("\ua560", String.valueOf(Formatting.YELLOW) + "D.HELPER").replaceAll("\ua544", String.valueOf(Formatting.RED) + "VAMPIRE").replaceAll("\ua516", String.valueOf(Formatting.AQUA) + "OVERLORD").replaceAll("\ua548", String.valueOf(Formatting.GREEN) + "COBRA").replaceAll("\ua528", String.valueOf(Formatting.LIGHT_PURPLE) + "DRAGON").replaceAll("\ua524", String.valueOf(Formatting.RED) + "IMPERATOR").replaceAll("\ua520", String.valueOf(Formatting.GOLD) + "MAGISTER").replaceAll("\ua504", String.valueOf(Formatting.BLUE) + "HERO").replaceAll("\ua512", String.valueOf(Formatting.GREEN) + "AVENGER").replaceAll("\ua552", String.valueOf(Formatting.WHITE) + "RABBIT").replaceAll("\ua508", String.valueOf(Formatting.YELLOW) + "TITAN").replaceAll("\ua540", String.valueOf(Formatting.DARK_GREEN) + "HYDRA").replaceAll("\ua536", String.valueOf(Formatting.GOLD) + "TIGER").replaceAll("\ua532", String.valueOf(Formatting.DARK_PURPLE) + "BULL").replaceAll("\ua556", String.valueOf(Formatting.BLACK) + "BUNNY").replaceAll("\ua557\ua558", String.valueOf(Formatting.YELLOW) + "SPONSOR").replaceAll("\ud83d\udd25", "@").replaceAll("\u1d00", "A").replaceAll("\u0299", "B").replaceAll("\u1d04", "C").replaceAll("\u1d05", "D").replaceAll("\u1d07", "E").replaceAll("\u0493", "F").replaceAll("\u0262", "G").replaceAll("\u029c", "H").replaceAll("\u026a", "I").replaceAll("\u1d0a", "J").replaceAll("\u1d0b", "K").replaceAll("\u029f", "L").replaceAll("\u1d0d", "M").replaceAll("\u0274", "N").replaceAll("\ua731", "S").replaceAll("s", "S").replaceAll("\u1d0f", "O").replaceAll("\u1d18", "P").replaceAll("\u01eb", "Q").replaceAll("\u0280", "R").replaceAll("\u1d1b", "T").replaceAll("\u1d1c", "U").replaceAll("\u1d20", "V").replaceAll("\u1d21", "W").replaceAll("\ua730", "F").replaceAll("x", "X").replaceAll("\u028f", "Y").replaceAll("\u1d22", "Z");
    }

    public static Text replaceSymbols(Text text) {
        if (text.getString().contains("\ua517")) {
            text = ReplaceUtils.replace(text, "\ua517", String.valueOf(Formatting.BLUE) + "MODER");
        }
        if (text.getString().contains("\ua525")) {
            text = ReplaceUtils.replace(text, "\ua525", String.valueOf(Formatting.BLUE) + "ST.MODER");
        }
        if (text.getString().contains("\ua521")) {
            text = ReplaceUtils.replace(text, "\ua521", String.valueOf(Formatting.LIGHT_PURPLE) + "MODER+");
        }
        if (text.getString().contains("\ua500")) {
            text = ReplaceUtils.replace(text, "\ua500", String.valueOf(Formatting.GRAY) + "PLAYER");
        }
        if (text.getString().contains("\ua509")) {
            text = ReplaceUtils.replace(text, "\ua509", String.valueOf(Formatting.YELLOW) + "HELPER");
        }
        if (text.getString().contains("\u25c6")) {
            text = ReplaceUtils.replace(text, "\u25c6", "@");
        }
        if (text.getString().contains("\u2503")) {
            text = ReplaceUtils.replace(text, "\u2503", "|");
        }
        if (text.getString().contains("\ua533")) {
            text = ReplaceUtils.replace(text, "\ua533", String.valueOf(Formatting.AQUA) + "Ml.admin");
        }
        if (text.getString().contains("\ua505")) {
            text = ReplaceUtils.replace(text, "\ua505", String.valueOf(Formatting.RED) + "Y" + String.valueOf(Formatting.WHITE) + "T");
        }
        if (text.getString().contains("\ua502")) {
            text = ReplaceUtils.replace(text, "\ua502", String.valueOf(Formatting.BLUE) + "D.MODER");
        }
        if (text.getString().contains("\ua560")) {
            text = ReplaceUtils.replace(text, "\ua560", String.valueOf(Formatting.YELLOW) + "D.HELPER");
        }
        if (text.getString().contains("\ua544")) {
            text = ReplaceUtils.replace(text, "\ua544", String.valueOf(Formatting.RED) + "DRACULA");
        }
        if (text.getString().contains("\ua516")) {
            text = ReplaceUtils.replace(text, "\ua516", String.valueOf(Formatting.AQUA) + "OVERLORD");
        }
        if (text.getString().contains("\ua548")) {
            text = ReplaceUtils.replace(text, "\ua548", String.valueOf(Formatting.GREEN) + "COBRA");
        }
        if (text.getString().contains("\ua528")) {
            text = ReplaceUtils.replace(text, "\ua528", String.valueOf(Formatting.LIGHT_PURPLE) + "DRAGON");
        }
        if (text.getString().contains("\ua524")) {
            text = ReplaceUtils.replace(text, "\ua524", String.valueOf(Formatting.RED) + "IMPERATOR");
        }
        if (text.getString().contains("\ua520")) {
            text = ReplaceUtils.replace(text, "\ua520", String.valueOf(Formatting.GOLD) + "MAGISTER");
        }
        if (text.getString().contains("\ua504")) {
            text = ReplaceUtils.replace(text, "\ua504", String.valueOf(Formatting.BLUE) + "HERO");
        }
        if (text.getString().contains("\ua512")) {
            text = ReplaceUtils.replace(text, "\ua512", String.valueOf(Formatting.GREEN) + "AVENGER");
        }
        if (text.getString().contains("\ua552")) {
            text = ReplaceUtils.replace(text, "\ua552", String.valueOf(Formatting.WHITE) + "RABBIT");
        }
        if (text.getString().contains("\ua508")) {
            text = ReplaceUtils.replace(text, "\ua508", String.valueOf(Formatting.YELLOW) + "TITAN");
        }
        if (text.getString().contains("\ua540")) {
            text = ReplaceUtils.replace(text, "\ua540", String.valueOf(Formatting.DARK_GREEN) + "HYDRA");
        }
        if (text.getString().contains("\ua536")) {
            text = ReplaceUtils.replace(text, "\ua536", String.valueOf(Formatting.GOLD) + "TIGER");
        }
        if (text.getString().contains("\ua532")) {
            text = ReplaceUtils.replace(text, "\ua532", String.valueOf(Formatting.DARK_PURPLE) + "BULL");
        }
        if (text.getString().contains("\ua556")) {
            text = ReplaceUtils.replace(text, "\ua556", String.valueOf(Formatting.BLACK) + "BUNNY");
        }
        if (text.getString().contains("\ua557\ua558")) {
            text = ReplaceUtils.replace(text, "\ua557\ua558", String.valueOf(Formatting.YELLOW) + "SPONSOR");
        }
        if (text.getString().contains("\ud83d\udd25")) {
            text = ReplaceUtils.replace(text, "\ud83d\udd25", "@");
        }
        if (text.getString().contains("\u1d00")) {
            text = ReplaceUtils.replace(text, "\u1d00", "A");
        }
        if (text.getString().contains("\u0299")) {
            text = ReplaceUtils.replace(text, "\u0299", "B");
        }
        if (text.getString().contains("\u1d04")) {
            text = ReplaceUtils.replace(text, "\u1d04", "C");
        }
        if (text.getString().contains("\u1d05")) {
            text = ReplaceUtils.replace(text, "\u1d05", "D");
        }
        if (text.getString().contains("\u1d07")) {
            text = ReplaceUtils.replace(text, "\u1d07", "E");
        }
        if (text.getString().contains("\u0493")) {
            text = ReplaceUtils.replace(text, "\u0493", "F");
        }
        if (text.getString().contains("\u0262")) {
            text = ReplaceUtils.replace(text, "\u0262", "G");
        }
        if (text.getString().contains("\u029c")) {
            text = ReplaceUtils.replace(text, "\u029c", "H");
        }
        if (text.getString().contains("\u026a")) {
            text = ReplaceUtils.replace(text, "\u026a", "I");
        }
        if (text.getString().contains("\u1d0a")) {
            text = ReplaceUtils.replace(text, "\u1d0a", "J");
        }
        if (text.getString().contains("\u1d0b")) {
            text = ReplaceUtils.replace(text, "\u1d0b", "K");
        }
        if (text.getString().contains("\u029f")) {
            text = ReplaceUtils.replace(text, "\u029f", "L");
        }
        if (text.getString().contains("\u1d0d")) {
            text = ReplaceUtils.replace(text, "\u1d0d", "M");
        }
        if (text.getString().contains("\u0274")) {
            text = ReplaceUtils.replace(text, "\u0274", "N");
        }
        if (text.getString().contains("\ua731")) {
            text = ReplaceUtils.replace(text, "\ua731", "S");
        }
        if (text.getString().contains("s")) {
            text = ReplaceUtils.replace(text, "s", "S");
        }
        if (text.getString().contains("\u1d0f")) {
            text = ReplaceUtils.replace(text, "\u1d0f", "O");
        }
        if (text.getString().contains("\u1d18")) {
            text = ReplaceUtils.replace(text, "\u1d18", "P");
        }
        if (text.getString().contains("\u01eb")) {
            text = ReplaceUtils.replace(text, "\u01eb", "Q");
        }
        if (text.getString().contains("\u0280")) {
            text = ReplaceUtils.replace(text, "\u0280", "R");
        }
        if (text.getString().contains("\u1d1b")) {
            text = ReplaceUtils.replace(text, "\u1d1b", "T");
        }
        if (text.getString().contains("\u1d1c")) {
            text = ReplaceUtils.replace(text, "\u1d1c", "U");
        }
        if (text.getString().contains("\u1d20")) {
            text = ReplaceUtils.replace(text, "\u1d20", "V");
        }
        if (text.getString().contains("\u1d21")) {
            text = ReplaceUtils.replace(text, "\u1d21", "W");
        }
        if (text.getString().contains("\ua730")) {
            text = ReplaceUtils.replace(text, "\ua730", "F");
        }
        if (text.getString().contains("x")) {
            text = ReplaceUtils.replace(text, "x", "X");
        }
        if (text.getString().contains("\u028f")) {
            text = ReplaceUtils.replace(text, "\u028f", "Y");
        }
        if (text.getString().contains("\u1d22")) {
            text = ReplaceUtils.replace(text, "\u1d22", "Z");
        }
        return text;
    }
}