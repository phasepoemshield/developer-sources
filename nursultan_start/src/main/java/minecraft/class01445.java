/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06069
 *  minecraft.class07049
 *  minecraft.class07536
 *  minecraft.class08036
 */
package minecraft;

import java.util.UUID;
import minecraft.class00392;
import minecraft.class06069;
import minecraft.class07049;
import minecraft.class07536;
import minecraft.class08036;

public class class01445 {
    private static final String[] N = new String[]{"Slim", "Far", "River", "Silly", "Fat", "Thin", "Fish", "Bat", "Dark", "Oak", "Sly", "Bush", "Zen", "Bark", "Cry", "Slack", "Soup", "Grim", "Hook", "Dirt", "Mud", "Sad", "Hard", "Crook", "Sneak", "Stink", "Weird", "Fire", "Soot", "Soft", "Rough", "Cling", "Scar"};
    private static final String[] y = new String[]{"Fox", "Tail", "Jaw", "Whisper", "Twig", "Root", "Finder", "Nose", "Brow", "Blade", "Fry", "Seek", "Wart", "Tooth", "Foot", "Leaf", "Stone", "Fall", "Face", "Tongue", "Voice", "Lip", "Mouth", "Snail", "Toe", "Ear", "Hair", "Beard", "Shirt", "Fist"};

    private static class06069 y(UUID uUID) {
        return class06069.y((long)(uUID.hashCode() >> 2));
    }

    private static String N(class06069 class060692, String[] stringArray) {
        return (String)class07536.N((Object[])stringArray, (class06069)class060692);
    }

    public static String N(UUID uUID) {
        class06069 class060692 = class01445.y(uUID);
        return class01445.N(class060692, N) + class01445.N(class060692, y);
    }

    public static String N(class07049 class070492) {
        if (class070492 instanceof class08036) {
            return class070492.method_74861();
        }
        class00392 class003922 = class070492.method_5797();
        if (class003922 != null) {
            return class003922.getString();
        }
        return class01445.N(class070492.method_5667());
    }
}

