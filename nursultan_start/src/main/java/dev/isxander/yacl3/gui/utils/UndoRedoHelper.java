/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.gui.utils;

import dev.isxander.yacl3.gui.utils.UndoRedoHelper$FieldState;
import java.util.ArrayList;
import java.util.List;

public class UndoRedoHelper {
    private final List<UndoRedoHelper$FieldState> history = new ArrayList<UndoRedoHelper$FieldState>();
    private int index = 0;

    public UndoRedoHelper(String string, int n, int n2) {
        this.history.add(new UndoRedoHelper$FieldState(string, n, n2));
    }

    public void save(String string, int n, int n2) {
        int n3 = this.history.size();
        this.history.subList(this.index, n3).clear();
        this.history.add(new UndoRedoHelper$FieldState(string, n, n2));
        ++this.index;
    }

    public UndoRedoHelper$FieldState undo() {
        --this.index;
        this.index = Math.max(this.index, 0);
        if (this.history.isEmpty()) {
            return null;
        }
        return this.history.get(this.index);
    }

    public UndoRedoHelper$FieldState redo() {
        if (this.index < this.history.size() - 1) {
            ++this.index;
            return this.history.get(this.index);
        }
        return null;
    }
}

