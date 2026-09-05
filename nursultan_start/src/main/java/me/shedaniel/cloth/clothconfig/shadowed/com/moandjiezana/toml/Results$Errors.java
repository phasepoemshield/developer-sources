/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Identifier;

class Results$Errors {
    private final StringBuilder sb = new StringBuilder();

    Results$Errors() {
    }

    public String toString() {
        return this.sb.toString();
    }

    public void add(Results$Errors results$Errors) {
        this.sb.append((CharSequence)results$Errors.sb);
    }

    void invalidKey(String string, int n) {
        this.sb.append("Invalid key on line ").append(n).append(": ").append(string);
    }

    boolean hasErrors() {
        return this.sb.length() > 0;
    }

    public void heterogenous(String string, int n) {
        this.sb.append(string).append(" becomes a heterogeneous array on line ").append(n);
    }

    void unterminated(String string, String string2, int n) {
        this.sb.append("Unterminated value on line ").append(n).append(": ").append(string).append(" = ").append(string2.trim());
    }

    void invalidValue(String string, String string2, int n) {
        this.sb.append("Invalid value on line ").append(n).append(": ").append(string).append(" = ").append(string2);
    }

    void duplicateKey(String string, int n) {
        this.sb.append("Duplicate key");
        if (n > -1) {
            this.sb.append(" on line ").append(n);
        }
        this.sb.append(": ").append(string);
    }

    public void tableDuplicatesKey(String string, AtomicInteger atomicInteger) {
        this.sb.append("Key already exists for table defined on line ").append(atomicInteger.get()).append(": [").append(string).append("]");
    }

    void duplicateTable(String string, int n) {
        this.sb.append("Duplicate table definition on line ").append(n).append(": [").append(string).append("]");
    }

    public void keyDuplicatesTable(String string, AtomicInteger atomicInteger) {
        this.sb.append("Table already exists for key defined on line ").append(atomicInteger.get()).append(": ").append(string);
    }

    void invalidTable(String string, int n) {
        this.sb.append("Invalid table definition on line ").append(n).append(": ").append(string).append("]");
    }

    void emptyImplicitTable(String string, int n) {
        this.sb.append("Invalid table definition due to empty implicit table name: ").append(string);
    }

    void invalidTableArray(String string, int n) {
        this.sb.append("Invalid table array definition on line ").append(n).append(": ").append(string);
    }

    void unterminatedKey(String string, int n) {
        this.sb.append("Key is not followed by an equals sign on line ").append(n).append(": ").append(string);
    }

    void invalidTextAfterIdentifier(Identifier identifier, char c, int n) {
        this.sb.append("Invalid text after key ").append(identifier.getName()).append(" on line ").append(n).append(". Make sure to terminate the value or add a comment (#).");
    }
}

