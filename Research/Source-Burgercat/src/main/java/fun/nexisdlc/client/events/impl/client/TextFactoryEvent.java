package fun.nexisdlc.client.events.impl.client;

import fun.nexisdlc.client.events.api.Event;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFactoryEvent extends Event {
    String text;
    private String cachedStrippedText;
    private String cachedStrippedLower;
    private boolean cacheDirty = true;

    private static final String STANDARD_FORMAT = "§[0-9a-fA-Fk-oK-OrR]";
    private static final String HEX_COLOR = "§[xX](?:§[0-9a-fA-F]){6}";
    private static final String ANY_FORMAT = "(?:" + HEX_COLOR + "|" + STANDARD_FORMAT + ")";
    private static final String FORMAT_CODES_PATTERN = "(?:" + ANY_FORMAT + ")*";

    private static final Pattern STRIP_PATTERN = Pattern.compile(ANY_FORMAT);
    private static final Pattern LEADING_FORMAT_PATTERN = Pattern.compile("^(" + FORMAT_CODES_PATTERN + ")");

    public TextFactoryEvent(String text) {
        this.text = text;
        this.cacheDirty = true;
    }

    public void setText(String text) {
        this.text = text;
        this.cacheDirty = true;
    }

    public String getText() {
        return text;
    }

    private String getStrippedText() {
        if (!cacheDirty && cachedStrippedText != null) {
            return cachedStrippedText;
        }
        cachedStrippedText = stripFormatCodes(text);
        cachedStrippedLower = cachedStrippedText != null ? cachedStrippedText.toLowerCase(Locale.ROOT) : null;
        cacheDirty = false;
        return cachedStrippedText;
    }

    private String getStrippedLower() {
        if (cacheDirty || cachedStrippedLower == null) {
            getStrippedText();
        }
        return cachedStrippedLower;
    }

    private void markDirty() {
        cacheDirty = true;
    }

    public void replaceText(String protect, String replaced) {
        if (text == null || text.isEmpty() || protect == null || protect.isEmpty()) return;

        String strippedProtect = stripFormatCodes(protect);
        String strippedTextLower = getStrippedLower();

        if (strippedTextLower == null || strippedProtect == null || strippedProtect.isEmpty()) {
            return;
        }

        String strippedProtectLower = strippedProtect.toLowerCase(Locale.ROOT);
        if (!strippedTextLower.contains(strippedProtectLower)) {
            return;
        }

        String patternStr = buildPatternWithFormatCodes(strippedProtect);
        Pattern pattern = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String match = matcher.group();
            String leadingFormat = extractAllFormats(match);
            matcher.appendReplacement(result, Matcher.quoteReplacement(leadingFormat + replaced));
        }
        matcher.appendTail(result);
        text = result.toString();
        markDirty();
    }

    public void replaceTextContains(String protect, String replaced) {
        if (text == null || text.isEmpty() || protect == null || protect.isEmpty()) return;

        String strippedProtect = stripFormatCodes(protect);
        String strippedTextLower = getStrippedLower();

        if (strippedTextLower == null || strippedProtect == null || strippedProtect.isEmpty()) {
            return;
        }

        String strippedProtectLower = strippedProtect.toLowerCase(Locale.ROOT);
        if (!strippedTextLower.contains(strippedProtectLower)) {
            return;
        }

        String protectPattern = buildPatternWithFormatCodes(strippedProtect);

        String nonSpaceWithFormat = "(?:" + ANY_FORMAT + "|[^\\s§])*";
        String fullPattern = nonSpaceWithFormat + protectPattern + nonSpaceWithFormat;

        Pattern pattern = Pattern.compile(fullPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String match = matcher.group();
            String leadingFormat = extractAllFormats(match);
            matcher.appendReplacement(result, Matcher.quoteReplacement(leadingFormat + replaced));
        }
        matcher.appendTail(result);
        text = result.toString();
        markDirty();
    }

    public void replaceTextPartial(String protect, String replaced) {
        if (text == null || text.isEmpty() || protect == null || protect.isEmpty()) return;

        String strippedProtect = stripFormatCodes(protect);
        String strippedTextLower = getStrippedLower();

        if (strippedTextLower == null || strippedProtect == null || strippedProtect.isEmpty()) {
            return;
        }

        String strippedProtectLower = strippedProtect.toLowerCase(Locale.ROOT);
        if (!strippedTextLower.contains(strippedProtectLower)) {
            return;
        }

        String patternStr = buildPatternWithFormatCodes(strippedProtect);
        Pattern pattern = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String match = matcher.group();
            String leadingFormat = extractAllFormats(match);
            matcher.appendReplacement(result, Matcher.quoteReplacement(leadingFormat + replaced));
        }
        matcher.appendTail(result);
        text = result.toString();
        markDirty();
    }

    public void replaceTextExact(String protect, String replaced) {
        if (text == null || text.isEmpty() || protect == null || protect.isEmpty()) return;

        String strippedProtect = stripFormatCodes(protect);
        String strippedTextLower = getStrippedLower();

        if (strippedTextLower == null || strippedProtect == null || strippedProtect.isEmpty()) {
            return;
        }

        String strippedProtectLower = strippedProtect.toLowerCase(Locale.ROOT);
        if (!strippedTextLower.contains(strippedProtectLower)) {
            return;
        }

        String innerPattern = buildPatternWithFormatCodes(strippedProtect);
        String patternStr = "(?<![a-zA-Z0-9_])" + innerPattern + "(?![a-zA-Z0-9_])";
        Pattern pattern = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String match = matcher.group();
            String leadingFormat = extractAllFormats(match);
            matcher.appendReplacement(result, Matcher.quoteReplacement(leadingFormat + replaced));
        }
        matcher.appendTail(result);
        text = result.toString();
        markDirty();
    }

    private String buildPatternWithFormatCodes(String input) {
        if (input == null || input.isEmpty()) return "";

        StringBuilder pattern = new StringBuilder();
        pattern.append(FORMAT_CODES_PATTERN);

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (isRegexSpecialChar(c)) {
                pattern.append("\\");
            }
            pattern.append(c);
            pattern.append(FORMAT_CODES_PATTERN);
        }

        return pattern.toString();
    }

    private String extractAllFormats(String text) {
        if (text == null || text.isEmpty()) return "";

        StringBuilder formats = new StringBuilder();
        int i = 0;

        while (i < text.length()) {
            if (text.charAt(i) == '§' && i + 1 < text.length()) {
                char code = text.charAt(i + 1);

                if ((code == 'x' || code == 'X') && i + 13 <= text.length()) {
                    boolean isHex = true;
                    for (int j = 0; j < 6; j++) {
                        int pos = i + 2 + j * 2;
                        if (pos + 1 >= text.length() || text.charAt(pos) != '§') {
                            isHex = false;
                            break;
                        }
                        char hexChar = text.charAt(pos + 1);
                        if (!isHexChar(hexChar)) {
                            isHex = false;
                            break;
                        }
                    }
                    if (isHex) {
                        formats.append(text, i, i + 14);
                        i += 14;
                        continue;
                    }
                }

                if (isFormatChar(code)) {
                    formats.append(text.charAt(i));
                    formats.append(code);
                    i += 2;
                    continue;
                }
            }
            break;
        }

        return formats.toString();
    }

    private boolean isFormatChar(char c) {
        return (c >= '0' && c <= '9') ||
                (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F') ||
                (c >= 'k' && c <= 'o') || (c >= 'K' && c <= 'O') ||
                c == 'r' || c == 'R';
    }

    private boolean isHexChar(char c) {
        return (c >= '0' && c <= '9') ||
                (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }

    public String stripFormatCodes(String text) {
        if (text == null) return null;
        return STRIP_PATTERN.matcher(text).replaceAll("");
    }

    private boolean isRegexSpecialChar(char c) {
        return "\\^$.|?*+()[]{}".indexOf(c) != -1;
    }

    private boolean containsIgnoreCase(String text, String search) {
        if (text == null || search == null) return false;
        return text.toLowerCase().contains(search.toLowerCase());
    }

    public boolean containsIgnoreFormat(String search) {
        if (text == null || search == null) return false;
        String strippedLower = getStrippedLower();
        String strippedSearch = stripFormatCodes(search);
        if (strippedLower == null || strippedSearch == null) return false;
        return strippedLower.contains(strippedSearch.toLowerCase(Locale.ROOT));
    }
}
