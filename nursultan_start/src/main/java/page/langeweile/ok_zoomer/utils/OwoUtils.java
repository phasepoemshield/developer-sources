/*
 * Decompiled with CFR 0.152.
 */
package page.langeweile.ok_zoomer.utils;

import java.util.Random;
import page.langeweile.ok_zoomer.utils.ZoomUtils;

public class OwoUtils {
    public static final String[] OWO_ARRAY = new String[]{"owo", "OwO", "uwu", "nwn", "^w^", ">w<", "Owo", "owO", ";w;", "0w0", "QwQ", "TwT", "-w-", "$w$", "@w@", "*w*", ":w:", "\u00b0w\u00b0", "\u00baw\u00ba", "\u00f3w\u00f2", "\u00f2w\u00f3", "`w\u00b4", "\u00b4w`", "~w~", "umu", "nmn", "own", "nwo", "\u00f9w\u00fa", "\u00faw\u00f9", "\u00f1w\u00f1", "UwU", "NwN", "\u00d9w\u00da", "PwP", "own", "nwo", "/w/", "\\w\\", "|w|", "#w#", "<>w<>", "'w'", "\"w\"", "\u00f6w\u00f6", "\u00f4w\u00f4", "\u00d6w\u00d6", "\u00d4w\u00d4", ".w.", "+w+", ")w(", "]w[", "}w{", "_w_", "=w=", "!w!", "YwY", "vwv", "VwV", "<w>", "\u00e7w\u00e7", "\u00c7w\u00c7", ">w>", "<w<", "\u2014w\u2014", "\u2192w\u2192", "\u2192w\u2190", "\u2190w\u2190", "KwK", "GwG", "gwg", "qwq", "AwA", "awa", "\\w/", "\u2026w\u2026", "\u00aaw\u00aa", "\u2014w\u2014", "\u00afw\u00af", "XwX", "xwx", "8w8", "\u20a2w\u20a2"};

    public static void printOwo() {
        Random random = new Random();
        ZoomUtils.LOGGER.info("[Ok Zoomer] {} what's this", (Object)OWO_ARRAY[random.nextInt(OWO_ARRAY.length)]);
    }
}

