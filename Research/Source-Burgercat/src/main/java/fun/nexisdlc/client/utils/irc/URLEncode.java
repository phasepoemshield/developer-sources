package fun.nexisdlc.client.utils.irc;

import java.nio.charset.StandardCharsets;

/**
 * Простой URL Encoder для кодирования параметров
 */
public class URLEncode {
    
    public static String encode(String s) {
        if (s == null) return "";
        
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isSafeChar(c)) {
                sb.append(c);
            } else {
                byte[] bytes = String.valueOf(c).getBytes(StandardCharsets.UTF_8);
                for (byte b : bytes) {
                    sb.append('%');
                    sb.append(toHex((b >> 4) & 0xF));
                    sb.append(toHex(b & 0xF));
                }
            }
        }
        return sb.toString();
    }
    
    private static boolean isSafeChar(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9') ||
               c == '-' || c == '_' || c == '.' || c == '~';
    }
    
    private static char toHex(int n) {
        return n < 10 ? (char) ('0' + n) : (char) ('A' + (n - 10));
    }
}
