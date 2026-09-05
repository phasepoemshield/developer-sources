/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class00392
 *  minecraft.class07018
 *  org.lwjgl.glfw.GLFW
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Locale;
import java.util.function.BiFunction;
import minecraft.class00392;
import minecraft.class04671;
import minecraft.class07018;
import org.lwjgl.glfw.GLFW;

public final class class04648
extends Enum<class04648> {
    public static final /* enum */ class04648 field_1668 = new class04648("key.keyboard", (n, string) -> {
        if (field_44919.equals(string)) {
            return class00392.L((String)string);
        }
        String string2 = GLFW.glfwGetKeyName((int)n, (int)-1);
        return string2 != null ? class00392.y((String)string2.toUpperCase(Locale.ROOT)) : class00392.L((String)string);
    });
    public static final /* enum */ class04648 field_1671 = new class04648("scancode", (n, string) -> {
        String string2 = GLFW.glfwGetKeyName((int)-1, (int)n);
        return string2 != null ? class00392.y((String)string2) : class00392.L((String)string);
    });
    public static final /* enum */ class04648 field_1672 = new class04648("key.mouse", (n, string) -> class07018.y().N(string) ? class00392.L((String)string) : class00392.N((String)"key.mouse", (Object[])new Object[]{n + 1}));
    private static final String field_44919 = "key.keyboard.unknown";
    private final Int2ObjectMap<class04671> field_1674 = new Int2ObjectOpenHashMap();
    final String field_1673;
    final BiFunction<Integer, String, class00392> field_24197;
    private static final /* synthetic */ class04648[] field_1670;

    private class04648(String string2, BiFunction<Integer, String, class00392> biFunction) {
        this.field_1673 = string2;
        this.field_24197 = biFunction;
    }

    public static class04648[] values() {
        return (class04648[])field_1670.clone();
    }

    public static class04648 valueOf(String string) {
        return Enum.valueOf(class04648.class, string);
    }

    public class04671 N(int n2) {
        return (class04671)this.field_1674.computeIfAbsent(n2, n -> {
            int n2 = n;
            if (this == field_1672) {
                ++n2;
            }
            String string = this.field_1673 + "." + n2;
            return new class04671(string, this, n);
        });
    }

    private static /* synthetic */ class04648[] N() {
        return new class04648[]{field_1668, field_1671, field_1672};
    }

    private static void N(class04648 class046482, String string, int n) {
        class04671 class046712 = new class04671(string, class046482, n);
        class046482.field_1674.put(n, (Object)class046712);
    }

    static {
        field_1670 = class04648.N();
        class04648.N(field_1668, field_44919, -1);
        class04648.N(field_1672, "key.mouse.left", 0);
        class04648.N(field_1672, "key.mouse.right", 1);
        class04648.N(field_1672, "key.mouse.middle", 2);
        class04648.N(field_1672, "key.mouse.4", 3);
        class04648.N(field_1672, "key.mouse.5", 4);
        class04648.N(field_1672, "key.mouse.6", 5);
        class04648.N(field_1672, "key.mouse.7", 6);
        class04648.N(field_1672, "key.mouse.8", 7);
        class04648.N(field_1668, "key.keyboard.0", 48);
        class04648.N(field_1668, "key.keyboard.1", 49);
        class04648.N(field_1668, "key.keyboard.2", 50);
        class04648.N(field_1668, "key.keyboard.3", 51);
        class04648.N(field_1668, "key.keyboard.4", 52);
        class04648.N(field_1668, "key.keyboard.5", 53);
        class04648.N(field_1668, "key.keyboard.6", 54);
        class04648.N(field_1668, "key.keyboard.7", 55);
        class04648.N(field_1668, "key.keyboard.8", 56);
        class04648.N(field_1668, "key.keyboard.9", 57);
        class04648.N(field_1668, "key.keyboard.a", 65);
        class04648.N(field_1668, "key.keyboard.b", 66);
        class04648.N(field_1668, "key.keyboard.c", 67);
        class04648.N(field_1668, "key.keyboard.d", 68);
        class04648.N(field_1668, "key.keyboard.e", 69);
        class04648.N(field_1668, "key.keyboard.f", 70);
        class04648.N(field_1668, "key.keyboard.g", 71);
        class04648.N(field_1668, "key.keyboard.h", 72);
        class04648.N(field_1668, "key.keyboard.i", 73);
        class04648.N(field_1668, "key.keyboard.j", 74);
        class04648.N(field_1668, "key.keyboard.k", 75);
        class04648.N(field_1668, "key.keyboard.l", 76);
        class04648.N(field_1668, "key.keyboard.m", 77);
        class04648.N(field_1668, "key.keyboard.n", 78);
        class04648.N(field_1668, "key.keyboard.o", 79);
        class04648.N(field_1668, "key.keyboard.p", 80);
        class04648.N(field_1668, "key.keyboard.q", 81);
        class04648.N(field_1668, "key.keyboard.r", 82);
        class04648.N(field_1668, "key.keyboard.s", 83);
        class04648.N(field_1668, "key.keyboard.t", 84);
        class04648.N(field_1668, "key.keyboard.u", 85);
        class04648.N(field_1668, "key.keyboard.v", 86);
        class04648.N(field_1668, "key.keyboard.w", 87);
        class04648.N(field_1668, "key.keyboard.x", 88);
        class04648.N(field_1668, "key.keyboard.y", 89);
        class04648.N(field_1668, "key.keyboard.z", 90);
        class04648.N(field_1668, "key.keyboard.f1", 290);
        class04648.N(field_1668, "key.keyboard.f2", 291);
        class04648.N(field_1668, "key.keyboard.f3", 292);
        class04648.N(field_1668, "key.keyboard.f4", 293);
        class04648.N(field_1668, "key.keyboard.f5", 294);
        class04648.N(field_1668, "key.keyboard.f6", 295);
        class04648.N(field_1668, "key.keyboard.f7", 296);
        class04648.N(field_1668, "key.keyboard.f8", 297);
        class04648.N(field_1668, "key.keyboard.f9", 298);
        class04648.N(field_1668, "key.keyboard.f10", 299);
        class04648.N(field_1668, "key.keyboard.f11", 300);
        class04648.N(field_1668, "key.keyboard.f12", 301);
        class04648.N(field_1668, "key.keyboard.f13", 302);
        class04648.N(field_1668, "key.keyboard.f14", 303);
        class04648.N(field_1668, "key.keyboard.f15", 304);
        class04648.N(field_1668, "key.keyboard.f16", 305);
        class04648.N(field_1668, "key.keyboard.f17", 306);
        class04648.N(field_1668, "key.keyboard.f18", 307);
        class04648.N(field_1668, "key.keyboard.f19", 308);
        class04648.N(field_1668, "key.keyboard.f20", 309);
        class04648.N(field_1668, "key.keyboard.f21", 310);
        class04648.N(field_1668, "key.keyboard.f22", 311);
        class04648.N(field_1668, "key.keyboard.f23", 312);
        class04648.N(field_1668, "key.keyboard.f24", 313);
        class04648.N(field_1668, "key.keyboard.f25", 314);
        class04648.N(field_1668, "key.keyboard.num.lock", 282);
        class04648.N(field_1668, "key.keyboard.keypad.0", 320);
        class04648.N(field_1668, "key.keyboard.keypad.1", 321);
        class04648.N(field_1668, "key.keyboard.keypad.2", 322);
        class04648.N(field_1668, "key.keyboard.keypad.3", 323);
        class04648.N(field_1668, "key.keyboard.keypad.4", 324);
        class04648.N(field_1668, "key.keyboard.keypad.5", 325);
        class04648.N(field_1668, "key.keyboard.keypad.6", 326);
        class04648.N(field_1668, "key.keyboard.keypad.7", 327);
        class04648.N(field_1668, "key.keyboard.keypad.8", 328);
        class04648.N(field_1668, "key.keyboard.keypad.9", 329);
        class04648.N(field_1668, "key.keyboard.keypad.add", 334);
        class04648.N(field_1668, "key.keyboard.keypad.decimal", 330);
        class04648.N(field_1668, "key.keyboard.keypad.enter", 335);
        class04648.N(field_1668, "key.keyboard.keypad.equal", 336);
        class04648.N(field_1668, "key.keyboard.keypad.multiply", 332);
        class04648.N(field_1668, "key.keyboard.keypad.divide", 331);
        class04648.N(field_1668, "key.keyboard.keypad.subtract", 333);
        class04648.N(field_1668, "key.keyboard.down", 264);
        class04648.N(field_1668, "key.keyboard.left", 263);
        class04648.N(field_1668, "key.keyboard.right", 262);
        class04648.N(field_1668, "key.keyboard.up", 265);
        class04648.N(field_1668, "key.keyboard.apostrophe", 39);
        class04648.N(field_1668, "key.keyboard.backslash", 92);
        class04648.N(field_1668, "key.keyboard.comma", 44);
        class04648.N(field_1668, "key.keyboard.equal", 61);
        class04648.N(field_1668, "key.keyboard.grave.accent", 96);
        class04648.N(field_1668, "key.keyboard.left.bracket", 91);
        class04648.N(field_1668, "key.keyboard.minus", 45);
        class04648.N(field_1668, "key.keyboard.period", 46);
        class04648.N(field_1668, "key.keyboard.right.bracket", 93);
        class04648.N(field_1668, "key.keyboard.semicolon", 59);
        class04648.N(field_1668, "key.keyboard.slash", 47);
        class04648.N(field_1668, "key.keyboard.space", 32);
        class04648.N(field_1668, "key.keyboard.tab", 258);
        class04648.N(field_1668, "key.keyboard.left.alt", 342);
        class04648.N(field_1668, "key.keyboard.left.control", 341);
        class04648.N(field_1668, "key.keyboard.left.shift", 340);
        class04648.N(field_1668, "key.keyboard.left.win", 343);
        class04648.N(field_1668, "key.keyboard.right.alt", 346);
        class04648.N(field_1668, "key.keyboard.right.control", 345);
        class04648.N(field_1668, "key.keyboard.right.shift", 344);
        class04648.N(field_1668, "key.keyboard.right.win", 347);
        class04648.N(field_1668, "key.keyboard.enter", 257);
        class04648.N(field_1668, "key.keyboard.escape", 256);
        class04648.N(field_1668, "key.keyboard.backspace", 259);
        class04648.N(field_1668, "key.keyboard.delete", 261);
        class04648.N(field_1668, "key.keyboard.end", 269);
        class04648.N(field_1668, "key.keyboard.home", 268);
        class04648.N(field_1668, "key.keyboard.insert", 260);
        class04648.N(field_1668, "key.keyboard.page.down", 267);
        class04648.N(field_1668, "key.keyboard.page.up", 266);
        class04648.N(field_1668, "key.keyboard.caps.lock", 280);
        class04648.N(field_1668, "key.keyboard.pause", 284);
        class04648.N(field_1668, "key.keyboard.scroll.lock", 281);
        class04648.N(field_1668, "key.keyboard.menu", 348);
        class04648.N(field_1668, "key.keyboard.print.screen", 283);
        class04648.N(field_1668, "key.keyboard.world.1", 161);
        class04648.N(field_1668, "key.keyboard.world.2", 162);
    }
}

