package ru.metaculture.protection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;

public class O0000O0O00OO0O {
   public static final Map<String, Integer> O00000000 = new HashMap<>();
   public static final Map<Integer, String> O000000000 = new HashMap<>();
   public static MinecraftClient O0000000000 = MinecraftClient.getInstance();

   public static boolean O00000000(int i) {
      return InputUtil.isKeyPressed(O0000000000.getWindow().getHandle(), i);
   }

   public static String O000000000(int i) {
      if (i == -1) {
         return "KEY";
      } else if (i == -200) {
         return "Wheel Up";
      } else if (i == -201) {
         return "Wheel Down";
      } else if (i == -100) {
         return "Mouse Left";
      } else if (i == -101) {
         return "Mouse Right";
      } else if (i == -102) {
         return "Mouse Middle";
      } else if (i == -103) {
         return "Mouse 4";
      } else if (i == -104) {
         return "Mouse 5";
      } else if (i == -105) {
         return "Mouse 6";
      } else if (i == -106) {
         return "Mouse 7";
      } else if (i == -107) {
         return "Mouse 8";
      } else if (i == -108) {
         return "Mouse 9";
      } else if (i == 32) {
         return "Space";
      } else if (i == 39) {
         return "Apostrophe";
      } else if (i == 44) {
         return "Comma";
      } else if (i == 45) {
         return "Minus";
      } else if (i == 46) {
         return "Period";
      } else if (i == 47) {
         return "Slash";
      } else if (i == 48) {
         return "0";
      } else if (i == 49) {
         return "1";
      } else if (i == 50) {
         return "2";
      } else if (i == 51) {
         return "3";
      } else if (i == 52) {
         return "4";
      } else if (i == 53) {
         return "5";
      } else if (i == 54) {
         return "6";
      } else if (i == 55) {
         return "7";
      } else if (i == 56) {
         return "8";
      } else if (i == 57) {
         return "9";
      } else if (i == 59) {
         return "SemiColon";
      } else if (i == 61) {
         return "Equal";
      } else if (i == 65) {
         return "A";
      } else if (i == 66) {
         return "B";
      } else if (i == 67) {
         return "C";
      } else if (i == 68) {
         return "D";
      } else if (i == 69) {
         return "E";
      } else if (i == 70) {
         return "F";
      } else if (i == 71) {
         return "G";
      } else if (i == 72) {
         return "H";
      } else if (i == 73) {
         return "I";
      } else if (i == 74) {
         return "J";
      } else if (i == 75) {
         return "K";
      } else if (i == 76) {
         return "L";
      } else if (i == 77) {
         return "M";
      } else if (i == 78) {
         return "N";
      } else if (i == 79) {
         return "O";
      } else if (i == 80) {
         return "P";
      } else if (i == 81) {
         return "Q";
      } else if (i == 82) {
         return "R";
      } else if (i == 83) {
         return "S";
      } else if (i == 84) {
         return "T";
      } else if (i == 85) {
         return "U";
      } else if (i == 86) {
         return "V";
      } else if (i == 87) {
         return "W";
      } else if (i == 88) {
         return "X";
      } else if (i == 89) {
         return "Y";
      } else if (i == 90) {
         return "Z";
      } else if (i == 91) {
         return "LeftBracket";
      } else if (i == 92) {
         return "BackSlash";
      } else if (i == 93) {
         return "RightBracket";
      } else if (i == 96) {
         return "GraveAccent";
      } else if (i == 161) {
         return "World1";
      } else if (i == 162) {
         return "World2";
      } else if (i == 256) {
         return "Escape";
      } else if (i == 257) {
         return "Enter";
      } else if (i == 258) {
         return "Tab";
      } else if (i == 259) {
         return "BackSpace";
      } else if (i == 260) {
         return "Insert";
      } else if (i == 261) {
         return "Delete";
      } else if (i == 262) {
         return "Right";
      } else if (i == 263) {
         return "Left";
      } else if (i == 264) {
         return "Down";
      } else if (i == 265) {
         return "Up";
      } else if (i == 266) {
         return "PageUp";
      } else if (i == 267) {
         return "PageDown";
      } else if (i == 268) {
         return "Home";
      } else if (i == 269) {
         return "End";
      } else if (i == 280) {
         return "CapsLock";
      } else if (i == 281) {
         return "ScrollLock";
      } else if (i == 282) {
         return "NumLock";
      } else if (i == 283) {
         return "PrintScreen";
      } else if (i == 284) {
         return "Pause";
      } else if (i == 290) {
         return "F1";
      } else if (i == 291) {
         return "F2";
      } else if (i == 292) {
         return "F3";
      } else if (i == 293) {
         return "F4";
      } else if (i == 294) {
         return "F5";
      } else if (i == 295) {
         return "F6";
      } else if (i == 296) {
         return "F7";
      } else if (i == 297) {
         return "F8";
      } else if (i == 298) {
         return "F9";
      } else if (i == 299) {
         return "F10";
      } else if (i == 300) {
         return "F11";
      } else if (i == 301) {
         return "F12";
      } else if (i == 302) {
         return "F13";
      } else if (i == 303) {
         return "F14";
      } else if (i == 304) {
         return "F15";
      } else if (i == 305) {
         return "F16";
      } else if (i == 306) {
         return "F17";
      } else if (i == 307) {
         return "F18";
      } else if (i == 308) {
         return "F19";
      } else if (i == 309) {
         return "F20";
      } else if (i == 310) {
         return "F21";
      } else if (i == 311) {
         return "F22";
      } else if (i == 312) {
         return "F23";
      } else if (i == 313) {
         return "F24";
      } else if (i == 314) {
         return "F25";
      } else if (i == 320) {
         return "NUM 0";
      } else if (i == 321) {
         return "NUM 1";
      } else if (i == 322) {
         return "NUM 2";
      } else if (i == 323) {
         return "NUM 3";
      } else if (i == 324) {
         return "NUM 4";
      } else if (i == 325) {
         return "NUM 5";
      } else if (i == 326) {
         return "NUM 6";
      } else if (i == 327) {
         return "NUM 7";
      } else if (i == 328) {
         return "NUM 8";
      } else if (i == 329) {
         return "NUM 9";
      } else if (i == 330) {
         return "Decimal";
      } else if (i == 331) {
         return "Divine";
      } else if (i == 332) {
         return "Multiply";
      } else if (i == 333) {
         return "Subtract";
      } else if (i == 334) {
         return "Add";
      } else if (i == 335) {
         return "Enter";
      } else if (i == 336) {
         return "Equal";
      } else if (i == 340) {
         return "LeftShift";
      } else if (i == 341) {
         return "LeftControl";
      } else if (i == 342) {
         return "LeftAlt";
      } else if (i == 343) {
         return "LeftSuper";
      } else if (i == 344) {
         return "RightShift";
      } else if (i == 345) {
         return "RightControl";
      } else if (i == 346) {
         return "RightAlt";
      } else if (i == 347) {
         return "RightSuper";
      } else {
         return i == 348 ? "Menu" : "error";
      }
   }

   private static void O00000000() {
      O00000000.put("A", 65);
      O00000000.put("B", 66);
      O00000000.put("C", 67);
      O00000000.put("D", 68);
      O00000000.put("E", 69);
      O00000000.put("F", 70);
      O00000000.put("G", 71);
      O00000000.put("H", 72);
      O00000000.put("I", 73);
      O00000000.put("J", 74);
      O00000000.put("K", 75);
      O00000000.put("L", 76);
      O00000000.put("M", 77);
      O00000000.put("N", 78);
      O00000000.put("O", 79);
      O00000000.put("P", 80);
      O00000000.put("Q", 81);
      O00000000.put("R", 82);
      O00000000.put("S", 83);
      O00000000.put("T", 84);
      O00000000.put("U", 85);
      O00000000.put("V", 86);
      O00000000.put("W", 87);
      O00000000.put("X", 88);
      O00000000.put("Y", 89);
      O00000000.put("Z", 90);
      O00000000.put("0", 48);
      O00000000.put("1", 49);
      O00000000.put("2", 50);
      O00000000.put("3", 51);
      O00000000.put("4", 52);
      O00000000.put("5", 53);
      O00000000.put("6", 54);
      O00000000.put("7", 55);
      O00000000.put("8", 56);
      O00000000.put("9", 57);
      O00000000.put("F1", 290);
      O00000000.put("F2", 291);
      O00000000.put("F3", 292);
      O00000000.put("F4", 293);
      O00000000.put("F5", 294);
      O00000000.put("F6", 295);
      O00000000.put("F7", 296);
      O00000000.put("F8", 297);
      O00000000.put("F9", 298);
      O00000000.put("F10", 299);
      O00000000.put("F11", 300);
      O00000000.put("F12", 301);
      O00000000.put("NUMPAD1", 321);
      O00000000.put("NUMPAD2", 322);
      O00000000.put("NUMPAD3", 323);
      O00000000.put("NUMPAD4", 324);
      O00000000.put("NUMPAD5", 325);
      O00000000.put("NUMPAD6", 326);
      O00000000.put("NUMPAD7", 327);
      O00000000.put("NUMPAD8", 328);
      O00000000.put("NUMPAD9", 329);
      O00000000.put("SPACE", 32);
      O00000000.put("ENTER", 257);
      O00000000.put("ESCAPE", 256);
      O00000000.put("HOME", 268);
      O00000000.put("INSERT", 260);
      O00000000.put("DELETE", 261);
      O00000000.put("END", 269);
      O00000000.put("PAGEUP", 266);
      O00000000.put("PAGEDOWN", 267);
      O00000000.put("RIGHT", 262);
      O00000000.put("LEFT", 263);
      O00000000.put("DOWN", 264);
      O00000000.put("UP", 265);
      O00000000.put("RIGHT_SHIFT", 344);
      O00000000.put("LEFT_SHIFT", 340);
      O00000000.put("RIGHT_CONTROL", 345);
      O00000000.put("LEFT_CONTROL", 341);
      O00000000.put("RIGHT_ALT", 346);
      O00000000.put("LEFT_ALT", 342);
      O00000000.put("RIGHT_SUPER", 347);
      O00000000.put("LEFT_SUPER", 343);
      O00000000.put("MENU", 348);
      O00000000.put("CAPS_LOCK", 280);
      O00000000.put("NUM_LOCK", 282);
      O00000000.put("SCROLL_LOCK", 281);
      O00000000.put("KP_DECIMAL", 330);
      O00000000.put("KP_DIVIDE", 331);
      O00000000.put("KP_MULTIPLY", 332);
      O00000000.put("KP_SUBTRACT", 333);
      O00000000.put("KP_PLUS", 334);
      O00000000.put("KP_ENTER", 335);
      O00000000.put("KP_EQUAL", 336);
      O00000000.put("'", 39);
      O00000000.put("/", 47);
      O00000000.put("-", 45);
      O00000000.put("+", 61);
      O00000000.put("BACK", 259);
      O00000000.put("BACKSLASH", 92);
      O00000000.put(".", 46);
      O00000000.put("COMMA", 44);
      O00000000.put("PAUSE", 284);
   }

   private static void O000000000() {
      for (Entry var1 : O00000000.entrySet()) {
         O000000000.put((Integer)var1.getValue(), (String)var1.getKey());
      }
   }

   static {
      O00000000();
      O000000000();
   }
}
