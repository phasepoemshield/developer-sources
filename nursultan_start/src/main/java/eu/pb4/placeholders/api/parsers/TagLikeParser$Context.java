/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.api.parsers.TagLikeParser;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Scope;
import java.util.ArrayList;
import java.util.Stack;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public final class TagLikeParser$Context {
    private final Stack<TagLikeParser$Scope> stack = new Stack();
    private final TagLikeParser parser;
    int currentPos;
    String input;

    public NodeParser parser() {
        return this.parser;
    }

    TagLikeParser$Context(TagLikeParser tagLikeParser, String string) {
        this.parser = tagLikeParser;
        this.input = string;
        this.stack.push(TagLikeParser$Scope.parent());
    }

    public int size() {
        return this.stack.size() - 1;
    }

    public boolean contains(String string) {
        for (int i = 0; i < this.stack.size(); ++i) {
            if (!string.equals(((TagLikeParser$Scope)((Object)this.stack.get((int)(this.stack.size() - i - 1)))).id)) continue;
            return true;
        }
        return false;
    }

    public String input() {
        return this.input;
    }

    public void push(String string, Function<TextNode[], TextNode> function) {
        this.stack.push(TagLikeParser$Scope.enclosing(string, function));
    }

    public void pop(Predicate<String> predicate) {
        while (this.stack.size() > 1) {
            if (predicate.test(this.stack.peek().id)) {
                return;
            }
            TagLikeParser$Scope tagLikeParser$Scope = this.stack.pop();
            this.stack.peek().nodes.add(tagLikeParser$Scope.collapse(this.parser));
        }
    }

    public void pop() {
        if (this.stack.size() > 1) {
            TagLikeParser$Scope tagLikeParser$Scope = this.stack.pop();
            this.stack.peek().nodes.add(tagLikeParser$Scope.collapse(this.parser));
        }
    }

    public void pop(String string) {
        if (!this.contains(string)) {
            return;
        }
        while (this.stack.size() > 1) {
            TagLikeParser$Scope tagLikeParser$Scope = this.stack.pop();
            this.stack.peek().nodes.add(tagLikeParser$Scope.collapse(this.parser));
            if (!string.equals(tagLikeParser$Scope.id)) continue;
            return;
        }
    }

    public void pop(int n) {
        n = Math.min(n, this.stack.size() - 1);
        for (int i = 0; i < n; ++i) {
            TagLikeParser$Scope tagLikeParser$Scope = this.stack.pop();
            this.stack.peek().nodes.add(tagLikeParser$Scope.collapse(this.parser));
        }
    }

    public void pushWithParser(String string, BiFunction<TextNode[], NodeParser, TextNode> biFunction) {
        this.stack.push(TagLikeParser$Scope.enclosingParsed(string, biFunction));
    }

    public void popInclusive(Predicate<String> predicate) {
        while (this.stack.size() > 1) {
            TagLikeParser$Scope tagLikeParser$Scope = this.stack.pop();
            this.stack.peek().nodes.add(tagLikeParser$Scope.collapse(this.parser));
            if (!predicate.test(tagLikeParser$Scope.id)) continue;
            return;
        }
    }

    public int currentTagPos() {
        return this.currentPos;
    }

    public TextNode[] toTextNode() {
        while (!this.stack.isEmpty()) {
            TagLikeParser$Scope tagLikeParser$Scope = this.stack.pop();
            if (this.stack.isEmpty()) {
                return tagLikeParser$Scope.nodes().toArray(TagLikeParser.EMPTY);
            }
            this.stack.peek().nodes.add(tagLikeParser$Scope.collapse(this.parser));
        }
        return null;
    }

    public void popOnly(String string) {
        if (!this.contains(string)) {
            return;
        }
        Stack<TagLikeParser$Scope> stack = new Stack<TagLikeParser$Scope>();
        while (this.stack.size() > 1) {
            TagLikeParser$Scope tagLikeParser$Scope = this.stack.pop();
            this.stack.peek().nodes.add(tagLikeParser$Scope.collapse(this.parser));
            if (string.equals(tagLikeParser$Scope.id)) {
                while (!stack.isEmpty()) {
                    this.stack.push((TagLikeParser$Scope)((Object)stack.pop()));
                }
                return;
            }
            stack.add(new TagLikeParser$Scope(tagLikeParser$Scope.id, new ArrayList<TextNode>(), tagLikeParser$Scope.merger));
        }
    }

    public void pushParent() {
        this.stack.push(TagLikeParser$Scope.parent());
    }

    public String peekId() {
        return this.stack.peek().id;
    }

    public void addNode(TextNode textNode) {
        this.stack.peek().nodes.add(textNode);
    }
}

