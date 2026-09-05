/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.context.StringRange
 *  com.mojang.brigadier.suggestion.Suggestion
 *  com.mojang.brigadier.suggestion.Suggestions
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00390
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 */
package minecraft;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00390;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07248;
import minecraft.class07280;

public final class class07232
extends Record
implements class00381<class07280> {
    private final int id;
    private final int start;
    private final int length;
    private final List<class07248> suggestions;
    public static final class02362<class04247, class07232> N = class02362.N((class02362)class02389.B, class07232::y, (class02362)class02389.B, class07232::L, (class02362)class02389.B, class07232::u, (class02362)class07248.N.N_33(class02389.N()), class07232::M, class07232::new);

    public int L() {
        return this.start;
    }

    public List<class07248> M() {
        return this.suggestions;
    }

    public class07232(int n, Suggestions suggestions) {
        this(n, suggestions.getRange().getStart(), suggestions.getRange().getLength(), suggestions.getList().stream().map(suggestion -> new class07248(suggestion.getText(), Optional.ofNullable(suggestion.getTooltip()).map(class00390::N))).toList());
    }

    public class07232(int n, int n2, int n3, List<class07248> list) {
        this.id = n;
        this.start = n2;
        this.length = n3;
        this.suggestions = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07232.class, "id;start;length;suggestions", "id", "start", "length", "suggestions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07232.class, "id;start;length;suggestions", "id", "start", "length", "suggestions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07232.class, "id;start;length;suggestions", "id", "start", "length", "suggestions"}, this);
    }

    public int u() {
        return this.length;
    }

    public int y() {
        return this.id;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public Suggestions N() {
        StringRange stringRange = StringRange.between((int)this.start, (int)(this.start + this.length));
        return new Suggestions(stringRange, this.suggestions.stream().map(class072482 -> new Suggestion(stringRange, class072482.N(), (Message)class072482.y().orElse(null))).toList());
    }

    public class02897<class07232> method_65080() {
        return class04248.T;
    }
}

