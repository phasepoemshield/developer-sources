/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09709
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class02208
 *  minecraft.class02902
 *  minecraft.class02913
 *  minecraft.class02921
 *  minecraft.class02923
 *  minecraft.class02926
 *  minecraft.class02935
 *  minecraft.class02939
 *  minecraft.class02945
 *  minecraft.class04206
 */
package minecraft;

import Nursultan.class09709;
import com.mojang.serialization.Codec;
import minecraft.class00751;
import minecraft.class02208;
import minecraft.class02468;
import minecraft.class02469;
import minecraft.class02476;
import minecraft.class02483;
import minecraft.class02487;
import minecraft.class02490;
import minecraft.class02500;
import minecraft.class02902;
import minecraft.class02913;
import minecraft.class02921;
import minecraft.class02923;
import minecraft.class02926;
import minecraft.class02935;
import minecraft.class02939;
import minecraft.class02945;
import minecraft.class04206;

public class class02482 {
    public static final class02487<class02476> N = class02482.N("damage", class02476.N);
    public static final class02487<class02490> y = class02482.N("enchantments", class02490.N);
    public static final class02487<class02468> L = class02482.N("stored_enchantments", class02468.N);
    public static final class02487<class02469> u = class02482.N("potion_contents", class02469.N);
    public static final class02487<class02483> i = class02482.N("custom_data", class02483.N);
    public static final class02487<class02902> R = class02482.N("container", class02902.N);
    public static final class02487<class02913> M = class02482.N("bundle_contents", class02913.N);
    public static final class02487<class02926> B = class02482.N("firework_explosion", class02926.N);
    public static final class02487<class02921> Z = class02482.N("fireworks", class02921.N);
    public static final class02487<class02939> z = class02482.N("writable_book_content", class02939.N);
    public static final class02487<class02945> U = class02482.N("written_book_content", class02945.N);
    public static final class02487<class02935> E = class02482.N("attribute_modifiers", class02935.N);
    public static final class02487<class02923> W = class02482.N("trim", class02923.N);
    public static final class02487<class02208> m = class02482.N("jukebox_playable", class02208.N);

    private static <T extends class02500> class02487<T> N(String string, Codec<T> codec) {
        return (class02487)class00751.N((class00751)class04206.Ns, (String)string, (Object)new class09709(codec));
    }

    public static class02487<?> N(class00751<class02487<?>> class007512) {
        return N;
    }
}

