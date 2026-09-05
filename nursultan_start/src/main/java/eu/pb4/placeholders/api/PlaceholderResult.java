/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.parsers.TextParserV1
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class06541
 */
package eu.pb4.placeholders.api;

import eu.pb4.placeholders.api.parsers.TextParserV1;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class06541;

public final class PlaceholderResult {
    private final class00392 text;
    private String string;
    private final boolean valid;

    public boolean isValid() {
        return this.valid;
    }

    private PlaceholderResult(class00392 class003922, String string) {
        if (class003922 != null) {
            this.text = class003922;
            this.valid = true;
        } else {
            this.text = class00392.y((String)("[" + (string != null ? string : "Invalid placeholder!") + "]")).y(class00405.N.N(class06541.field_1080).y(Boolean.valueOf(true)));
            this.valid = false;
        }
    }

    public static PlaceholderResult value(class00392 class003922) {
        return new PlaceholderResult(class003922, null);
    }

    public static PlaceholderResult value(String string) {
        return new PlaceholderResult(TextParserV1.DEFAULT.parseText(string, null), null);
    }

    @Deprecated
    public String string() {
        if (this.string == null) {
            this.string = this.text.getString();
        }
        return this.string;
    }

    public class00392 text() {
        return this.text;
    }

    public static PlaceholderResult invalid() {
        return new PlaceholderResult(null, null);
    }

    public static PlaceholderResult invalid(String string) {
        return new PlaceholderResult(null, string);
    }
}

