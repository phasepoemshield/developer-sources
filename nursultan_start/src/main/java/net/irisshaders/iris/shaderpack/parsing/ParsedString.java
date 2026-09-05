/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.parsing;

public class ParsedString {
    private String text;

    public ParsedString(String string) {
        this.text = string;
    }

    public String takeNumber() {
        int n;
        if (this.isEnd()) {
            return null;
        }
        for (n = 0; n < this.text.length() && !(n + 1 < this.text.length() ? !Character.isDigit(this.text.charAt(n)) && !Character.isDigit(this.text.charAt(n + 1)) : !Character.isDigit(this.text.charAt(n))); ++n) {
        }
        if (n > 0 && n + 1 < this.text.length() && (this.text.charAt(n) == 'f' || this.text.charAt(n) == 'F')) {
            ++n;
        }
        try {
            Float.parseFloat(this.text.substring(0, n));
        }
        catch (Exception exception) {
            return null;
        }
        return this.takeCharacters(n);
    }

    public String takeWord() {
        if (this.isEnd()) {
            return null;
        }
        int n = 0;
        for (char c : this.text.toCharArray()) {
            if (!Character.isDigit(c) && !Character.isAlphabetic(c) && c != '_') break;
            ++n;
        }
        if (n == 0) {
            return null;
        }
        return this.takeCharacters(n);
    }

    public String takeRest() {
        return this.text;
    }

    public boolean isEnd() {
        return this.text.isEmpty();
    }

    public boolean takeComments() {
        if (!this.text.startsWith("//")) {
            return false;
        }
        this.text = this.text.substring(2);
        while (this.text.startsWith("/")) {
            this.text = this.text.substring(1);
        }
        return true;
    }

    public boolean takeSomeWhitespace() {
        if (this.text.isEmpty() || !Character.isWhitespace(this.text.charAt(0))) {
            return false;
        }
        this.text = this.text.trim();
        return true;
    }

    public boolean takeLiteral(String string) {
        if (!this.text.startsWith(string)) {
            return false;
        }
        this.text = this.text.substring(string.length());
        return true;
    }

    public boolean currentlyContains(String string) {
        return this.text.contains(string);
    }

    public String takeWordOrNumber() {
        String string = this.takeNumber();
        if (string == null) {
            return this.takeWord();
        }
        return string;
    }

    private String takeCharacters(int n) {
        String string = this.text.substring(0, n);
        this.text = this.text.substring(n);
        return string;
    }
}

