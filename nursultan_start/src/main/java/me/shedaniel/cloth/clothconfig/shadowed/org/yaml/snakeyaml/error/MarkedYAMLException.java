/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;

public class MarkedYAMLException
extends YAMLException {
    private static final long serialVersionUID = -9119388488683035101L;
    private String context;
    private Mark contextMark;
    private String problem;
    private Mark problemMark;
    private String note;

    public MarkedYAMLException(String string, Mark mark, String string2, Mark mark2, Throwable throwable) {
        this(string, mark, string2, mark2, null, throwable);
    }

    public MarkedYAMLException(String string, Mark mark, String string2, Mark mark2) {
        this(string, mark, string2, mark2, null, null);
    }

    public MarkedYAMLException(String string, Mark mark, String string2, Mark mark2, String string3, Throwable throwable) {
        super(string + "; " + string2 + "; " + mark2, throwable);
        this.context = string;
        this.contextMark = mark;
        this.problem = string2;
        this.problemMark = mark2;
        this.note = string3;
    }

    public MarkedYAMLException(String string, Mark mark, String string2, Mark mark2, String string3) {
        this(string, mark, string2, mark2, string3, null);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.context != null) {
            stringBuilder.append(this.context);
            stringBuilder.append("\n");
        }
        if (this.contextMark != null && (this.problem == null || this.problemMark == null || this.contextMark.getName().equals(this.problemMark.getName()) || this.contextMark.getLine() != this.problemMark.getLine() || this.contextMark.getColumn() != this.problemMark.getColumn())) {
            stringBuilder.append(this.contextMark.toString());
            stringBuilder.append("\n");
        }
        if (this.problem != null) {
            stringBuilder.append(this.problem);
            stringBuilder.append("\n");
        }
        if (this.problemMark != null) {
            stringBuilder.append(this.problemMark.toString());
            stringBuilder.append("\n");
        }
        if (this.note != null) {
            stringBuilder.append(this.note);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String getMessage() {
        return this.toString();
    }

    public String getContext() {
        return this.context;
    }

    public String getProblem() {
        return this.problem;
    }

    public Mark getProblemMark() {
        return this.problemMark;
    }

    public Mark getContextMark() {
        return this.contextMark;
    }
}

