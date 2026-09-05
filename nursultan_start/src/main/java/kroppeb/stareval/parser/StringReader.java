/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.parser;

import kroppeb.stareval.exception.UnexpectedCharacterException;

public class StringReader {
    private final String string;
    private int nextIndex = -1;
    private int lastIndex;
    private int mark;

    public StringReader(String string) {
        this.string = string;
        this.advanceOneCharacter();
        this.skipWhitespace();
        this.lastIndex = this.nextIndex;
        this.mark();
    }

    public String substring() {
        return this.string.substring(this.mark, this.lastIndex + 1);
    }

    public char read() {
        char c = this.peek();
        this.skipOneCharacter();
        return c;
    }

    public void read(char c) throws UnexpectedCharacterException {
        char c2 = this.read();
        if (c2 != c) {
            throw new UnexpectedCharacterException(c, c2, this.getCurrentIndex());
        }
    }

    public boolean canRead() {
        return this.nextIndex < this.string.length();
    }

    public char peek() {
        return this.string.charAt(this.nextIndex);
    }

    public void mark() {
        this.mark = this.lastIndex;
    }

    public boolean tryRead(char c) {
        if (!this.canRead()) {
            return false;
        }
        char c2 = this.peek();
        if (c2 != c) {
            return false;
        }
        this.skipOneCharacter();
        return true;
    }

    public void skipWhitespace() {
        while (this.nextIndex < this.string.length() && Character.isWhitespace(this.string.charAt(this.nextIndex))) {
            ++this.nextIndex;
        }
    }

    private void advanceOneCharacter() {
        this.lastIndex = this.nextIndex;
        if (this.nextIndex >= this.string.length()) {
            return;
        }
        ++this.nextIndex;
    }

    public int getCurrentIndex() {
        return this.lastIndex;
    }

    public void skipOneCharacter() {
        this.advanceOneCharacter();
    }
}

