package ru.destra.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import net.minecraft.client.resource.language.I18n;

public class KeyNameUtil implements Function {
   public static final Map KEY_NAME_TO_CODE;
   public static final Map KEY_CODE_TO_NAME;
   private static final String KEY_MOUSE_LEFT = "key.mouse.left";
   private static final String KEY_MOUSE_RIGHT = "key.mouse.right";
   private static final String KEY_MOUSE_MIDDLE = "key.mouse.middle";
   public static final String MOUSE_BUTTON_PREFIX = "MOUSE\u0001";
   private static final String KEY_NONE = "none";
   private static final String KEY_A = "key.keyboard.a";
   private static final String KEY_B = "key.keyboard.b";
   private static final String KEY_C = "key.keyboard.c";
   private static final String KEY_D = "key.keyboard.d";
   private static final String KEY_E = "key.keyboard.e";
   private static final String KEY_F = "key.keyboard.f";
   private static final String KEY_G = "key.keyboard.g";
   private static final String KEY_H = "key.keyboard.h";
   private static final String KEY_I = "key.keyboard.i";
   private static final String KEY_J = "key.keyboard.j";
   private static final String KEY_K = "key.keyboard.k";
   private static final String KEY_L = "key.keyboard.l";
   private static final String KEY_M = "key.keyboard.m";
   private static final String KEY_N = "key.keyboard.n";
   private static final String KEY_O = "key.keyboard.o";
   private static final String KEY_P = "key.keyboard.p";
   private static final String KEY_Q = "key.keyboard.q";
   private static final String KEY_R = "key.keyboard.r";
   private static final String KEY_S = "key.keyboard.s";
   private static final String KEY_T = "key.keyboard.t";
   private static final String KEY_U = "key.keyboard.u";
   private static final String KEY_V = "key.keyboard.v";
   private static final String KEY_W = "key.keyboard.w";
   private static final String KEY_X = "key.keyboard.x";
   private static final String KEY_Y = "key.keyboard.y";
   private static final String KEY_Z = "key.keyboard.z";
   private static final String KEY_0 = "key.keyboard.0";
   private static final String KEY_1 = "key.keyboard.1";
   private static final String KEY_2 = "key.keyboard.2";
   private static final String KEY_3 = "key.keyboard.3";
   private static final String KEY_4 = "key.keyboard.4";
   private static final String KEY_5 = "key.keyboard.5";
   private static final String KEY_6 = "key.keyboard.6";
   private static final String KEY_7 = "key.keyboard.7";
   private static final String KEY_8 = "key.keyboard.8";
   private static final String KEY_9 = "key.keyboard.9";
   private static final String KEY_F1 = "key.keyboard.f1";
   private static final String KEY_F2 = "key.keyboard.f2";
   private static final String KEY_F3 = "key.keyboard.f3";
   private static final String KEY_F4 = "key.keyboard.f4";
   private static final String KEY_F5 = "key.keyboard.f5";
   private static final String KEY_F6 = "key.keyboard.f6";
   private static final String KEY_F7 = "key.keyboard.f7";
   private static final String KEY_F8 = "key.keyboard.f8";
   private static final String KEY_F9 = "key.keyboard.f9";
   private static final String KEY_F10 = "key.keyboard.f10";
   private static final String KEY_F11 = "key.keyboard.f11";
   private static final String KEY_F12 = "key.keyboard.f12";
   private static final String KEY_NUMPAD_1 = "key.keyboard.keypad.1";
   private static final String KEY_NUMPAD_2 = "key.keyboard.keypad.2";
   private static final String KEY_NUMPAD_3 = "key.keyboard.keypad.3";
   private static final String KEY_NUMPAD_4 = "key.keyboard.keypad.4";
   private static final String KEY_NUMPAD_5 = "key.keyboard.keypad.5";
   private static final String KEY_NUMPAD_6 = "key.keyboard.keypad.6";
   private static final String KEY_NUMPAD_7 = "key.keyboard.keypad.7";
   private static final String KEY_NUMPAD_8 = "key.keyboard.keypad.8";
   private static final String KEY_NUMPAD_9 = "key.keyboard.keypad.9";
   private static final String KEY_NUMPAD_0 = "key.keyboard.keypad.0";
   private static final String KEY_SPACE = "key.keyboard.space";
   private static final String KEY_ENTER = "key.keyboard.enter";
   private static final String KEY_ESCAPE = "key.keyboard.escape";
   private static final String KEY_END = "key.keyboard.end";
   private static final String KEY_INSERT = "key.keyboard.insert";
   private static final String KEY_DELETE = "key.keyboard.delete";
   private static final String KEY_PAGE_DOWN = "key.keyboard.page.down";
   private static final String KEY_UP = "key.keyboard.up";
   private static final String KEY_DOWN = "key.keyboard.down";
   private static final String KEY_RIGHT = "key.keyboard.right";
   private static final String KEY_LEFT = "key.keyboard.left";
   private static final String KEY_DOWN_ARROW = "key.keyboard.down";
   private static final String KEY_UP_ARROW = "key.keyboard.up";
   private static final String KEY_RIGHT_SHIFT = "key.keyboard.right.shift";
   private static final String KEY_LEFT_SHIFT = "key.keyboard.left.shift";
   private static final String KEY_RIGHT_CONTROL = "key.keyboard.right.control";
   private static final String KEY_LEFT_CONTROL = "key.keyboard.left.control";
   private static final String KEY_RIGHT_ALT = "key.keyboard.right.alt";
   private static final String KEY_LEFT_ALT = "key.keyboard.left.alt";
   private static final String KEY_RIGHT_SUPER = "key.keyboard.right.super";
   private static final String KEY_LEFT_SUPER = "key.keyboard.left.super";
   private static final String KEY_MENU = "key.keyboard.menu";
   private static final String KEY_INSERT2 = "key.keyboard.insert";
   private static final String KEY_CAPS_LOCK = "key.keyboard.caps.lock";
   private static final String KEY_SCROLL_LOCK = "key.keyboard.scroll.lock";
   private static final String KEY_NUM_LOCK = "key.keyboard.num.lock";
   private static final String KEY_NUMPAD_DECIMAL = "key.keyboard.keypad.decimal";
   private static final String KEY_NUMPAD_DIVIDE = "key.keyboard.keypad.divide";
   private static final String KEY_NUMPAD_MULTIPLY = "key.keyboard.keypad.multiply";
   private static final String KEY_NUMPAD_SUBTRACT = "key.keyboard.keypad.subtract";
   private static final String KEY_NUMPAD_ADD = "key.keyboard.keypad.add";
   private static final String KEY_NUMPAD_ENTER = "key.keyboard.keypad.enter";
   private static final String KEY_NUMPAD_EQUAL = "key.keyboard.keypad.equal";
   private static final String KEY_SEMICOLON = "key.keyboard.semicolon";
   private static final String KEY_APOSTROPHE = "key.keyboard.apostrophe";
   private static final String KEY_SLASH = "key.keyboard.slash";
   private static final String KEY_MINUS = "key.keyboard.minus";
   private static final String KEY_LEFT_BRACKET = "key.keyboard.left.bracket";
   private static final String KEY_RIGHT_BRACKET = "key.keyboard.right.bracket";
   private static final String KEY_EQUAL = "key.keyboard.equal";
   private static final String KEY_BACKSPACE = "key.keyboard.backspace";
   private static final String KEY_BACKSLASH = "key.keyboard.backslash";
   private static final String KEY_PERIOD = "key.keyboard.period";
   private static final String KEY_COMMA = "key.keyboard.comma";
   private static final String KEY_PRINT_SCREEN = "key.keyboard.print.screen";
   private static final String KEY_PAUSE = "key.keyboard.pause";
   private static final String KEY_GRAVE_ACCENT = "key.keyboard.grave.accent";

   public static void init() {
      KEY_NAME_TO_CODE.clear();
      KEY_CODE_TO_NAME.clear();
      populateKeyNameMap();
      buildReverseMap();
   }

   private static void populateKeyNameMap() {
      KEY_NAME_TO_CODE.put(KEY_A, 65);
      KEY_NAME_TO_CODE.put(KEY_B, 66);
      KEY_NAME_TO_CODE.put(KEY_C, 67);
      KEY_NAME_TO_CODE.put(KEY_D, 68);
      KEY_NAME_TO_CODE.put(KEY_E, 69);
      KEY_NAME_TO_CODE.put(KEY_F, 70);
      KEY_NAME_TO_CODE.put(KEY_G, 71);
      KEY_NAME_TO_CODE.put(KEY_H, 72);
      KEY_NAME_TO_CODE.put(KEY_I, 73);
      KEY_NAME_TO_CODE.put(KEY_J, 74);
      KEY_NAME_TO_CODE.put(KEY_K, 75);
      KEY_NAME_TO_CODE.put(KEY_L, 76);
      KEY_NAME_TO_CODE.put(KEY_M, 77);
      KEY_NAME_TO_CODE.put(KEY_N, 78);
      KEY_NAME_TO_CODE.put(KEY_O, 79);
      KEY_NAME_TO_CODE.put(KEY_P, 80);
      KEY_NAME_TO_CODE.put(KEY_Q, 81);
      KEY_NAME_TO_CODE.put(KEY_R, 82);
      KEY_NAME_TO_CODE.put(KEY_S, 83);
      KEY_NAME_TO_CODE.put(KEY_T, 84);
      KEY_NAME_TO_CODE.put(KEY_U, 85);
      KEY_NAME_TO_CODE.put(KEY_V, 86);
      KEY_NAME_TO_CODE.put(KEY_W, 87);
      KEY_NAME_TO_CODE.put(KEY_X, 88);
      KEY_NAME_TO_CODE.put(KEY_Y, 89);
      KEY_NAME_TO_CODE.put(KEY_Z, 90);
      KEY_NAME_TO_CODE.put(KEY_0, 48);
      KEY_NAME_TO_CODE.put(KEY_1, 49);
      KEY_NAME_TO_CODE.put(KEY_2, 50);
      KEY_NAME_TO_CODE.put(KEY_3, 51);
      KEY_NAME_TO_CODE.put(KEY_4, 52);
      KEY_NAME_TO_CODE.put(KEY_5, 53);
      KEY_NAME_TO_CODE.put(KEY_6, 54);
      KEY_NAME_TO_CODE.put(KEY_7, 55);
      KEY_NAME_TO_CODE.put(KEY_8, 56);
      KEY_NAME_TO_CODE.put(KEY_9, 57);
      KEY_NAME_TO_CODE.put(KEY_F1, 290);
      KEY_NAME_TO_CODE.put(KEY_F2, 291);
      KEY_NAME_TO_CODE.put(KEY_F3, 292);
      KEY_NAME_TO_CODE.put(KEY_F4, 293);
      KEY_NAME_TO_CODE.put(KEY_F5, 294);
      KEY_NAME_TO_CODE.put(KEY_F6, 295);
      KEY_NAME_TO_CODE.put(KEY_F7, 296);
      KEY_NAME_TO_CODE.put(KEY_F8, 297);
      KEY_NAME_TO_CODE.put(KEY_F9, 298);
      KEY_NAME_TO_CODE.put(KEY_F10, 299);
      KEY_NAME_TO_CODE.put(KEY_F11, 300);
      KEY_NAME_TO_CODE.put(KEY_F12, 301);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_1, 321);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_2, 322);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_3, 323);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_4, 324);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_5, 325);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_6, 326);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_7, 327);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_8, 328);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_9, 329);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_0, 320);
      KEY_NAME_TO_CODE.put(KEY_SPACE, 32);
      KEY_NAME_TO_CODE.put(KEY_ENTER, 257);
      KEY_NAME_TO_CODE.put(KEY_ESCAPE, 256);
      KEY_NAME_TO_CODE.put(KEY_END, 268);
      KEY_NAME_TO_CODE.put(KEY_INSERT, 260);
      KEY_NAME_TO_CODE.put(KEY_DELETE, 261);
      KEY_NAME_TO_CODE.put(KEY_PAGE_DOWN, 269);
      KEY_NAME_TO_CODE.put(KEY_UP, 266);
      KEY_NAME_TO_CODE.put(KEY_DOWN, 267);
      KEY_NAME_TO_CODE.put(KEY_RIGHT, 262);
      KEY_NAME_TO_CODE.put(KEY_LEFT, 263);
      KEY_NAME_TO_CODE.put(KEY_DOWN_ARROW, 264);
      KEY_NAME_TO_CODE.put(KEY_UP_ARROW, 265);
      KEY_NAME_TO_CODE.put(KEY_RIGHT_SHIFT, 344);
      KEY_NAME_TO_CODE.put(KEY_LEFT_SHIFT, 340);
      KEY_NAME_TO_CODE.put(KEY_RIGHT_CONTROL, 345);
      KEY_NAME_TO_CODE.put(KEY_LEFT_CONTROL, 341);
      KEY_NAME_TO_CODE.put(KEY_RIGHT_ALT, 346);
      KEY_NAME_TO_CODE.put(KEY_LEFT_ALT, 342);
      KEY_NAME_TO_CODE.put(KEY_RIGHT_SUPER, 347);
      KEY_NAME_TO_CODE.put(KEY_LEFT_SUPER, 343);
      KEY_NAME_TO_CODE.put(KEY_MENU, 348);
      KEY_NAME_TO_CODE.put(KEY_INSERT2, 280);
      KEY_NAME_TO_CODE.put(KEY_CAPS_LOCK, 258);
      KEY_NAME_TO_CODE.put(KEY_SCROLL_LOCK, 282);
      KEY_NAME_TO_CODE.put(KEY_NUM_LOCK, 281);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_DECIMAL, 330);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_DIVIDE, 331);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_MULTIPLY, 332);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_SUBTRACT, 333);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_ADD, 334);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_ENTER, 335);
      KEY_NAME_TO_CODE.put(KEY_NUMPAD_EQUAL, 336);
      KEY_NAME_TO_CODE.put(KEY_SEMICOLON, 59);
      KEY_NAME_TO_CODE.put(KEY_APOSTROPHE, 39);
      KEY_NAME_TO_CODE.put(KEY_SLASH, 47);
      KEY_NAME_TO_CODE.put(KEY_MINUS, 45);
      KEY_NAME_TO_CODE.put(KEY_LEFT_BRACKET, 91);
      KEY_NAME_TO_CODE.put(KEY_RIGHT_BRACKET, 93);
      KEY_NAME_TO_CODE.put(KEY_EQUAL, 61);
      KEY_NAME_TO_CODE.put(KEY_BACKSPACE, 259);
      KEY_NAME_TO_CODE.put(KEY_BACKSLASH, 92);
      KEY_NAME_TO_CODE.put(KEY_PERIOD, 46);
      KEY_NAME_TO_CODE.put(KEY_COMMA, 44);
      KEY_NAME_TO_CODE.put(KEY_PRINT_SCREEN, 284);
      KEY_NAME_TO_CODE.put(KEY_PAUSE, 283);
      KEY_NAME_TO_CODE.put(KEY_GRAVE_ACCENT, 96);
   }

   static {
      KEY_NAME_TO_CODE = new HashMap();
      KEY_CODE_TO_NAME = new HashMap();
      populateKeyNameMap();
      buildReverseMap();
   }

   public static Integer getKeyCode(String var0) {
      return (Integer) KEY_NAME_TO_CODE.getOrDefault(var0, Integer.valueOf(-1));
   }

   public static String getMouseButtonName(int var0) {
      if (var0 <= 5 && var0 > -1) {
         String var1;
         switch (var0) {
            case 0:
               var1 = I18n.translate(KEY_MOUSE_LEFT, new Object[0]);
               break;
            case 1:
               var1 = I18n.translate(KEY_MOUSE_RIGHT, new Object[0]);
               break;
            case 2:
               var1 = I18n.translate(KEY_MOUSE_MIDDLE, new Object[0]);
               break;
            default:
               var1 = "MOUSE" + var0;
         }

         return var1;
      } else {
         return getKeyName(var0);
      }
   }

   private static void buildReverseMap() {
      for (Object var1Obj : KEY_NAME_TO_CODE.entrySet()) {
         Entry var1 = (Entry) var1Obj;
         KEY_CODE_TO_NAME.put((Integer)var1.getValue(), (String)var1.getKey());
      }
   }

   public static String getKeyName(int var0) {
      return (String) KEY_CODE_TO_NAME.getOrDefault(var0, KEY_NONE);
   }

   @Override
   public Object apply(Object var1) {
      return var1;
   }
}
