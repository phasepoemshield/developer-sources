/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Container;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Container$Table;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Container$TableArray;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Identifier;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Keys;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Keys$Key;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results$Errors;

class Results {
    final Results$Errors errors = new Results$Errors();
    private final Set<String> tables = new HashSet<String>();
    private final Deque<Container> stack = new ArrayDeque<Container>();

    Map<String, Object> consume() {
        Container container = this.stack.getLast();
        this.stack.clear();
        return ((Container$Table)container).consume();
    }

    Results() {
        this.stack.push(new Container$Table(""));
    }

    void addValue(String string, Object object, AtomicInteger atomicInteger) {
        Container container = this.stack.peek();
        if (object instanceof Map) {
            String string2 = this.getInlineTablePath(string);
            if (string2 == null) {
                this.startTable(string, atomicInteger);
            } else if (string2.isEmpty()) {
                this.startTables(Identifier.from(string, null), atomicInteger);
            } else {
                this.startTables(Identifier.from(string2, null), atomicInteger);
            }
            Map map = (Map)object;
            for (Map.Entry entry : map.entrySet()) {
                this.addValue((String)entry.getKey(), entry.getValue(), atomicInteger);
            }
            this.stack.pop();
        } else if (container.accepts(string)) {
            container.put(string, object);
        } else if (container.get(string) instanceof Container) {
            this.errors.keyDuplicatesTable(string, atomicInteger);
        } else {
            this.errors.duplicateKey(string, atomicInteger != null ? atomicInteger.get() : -1);
        }
    }

    private Container startTable(String string, AtomicInteger atomicInteger) {
        Container$Table container$Table = new Container$Table(string);
        this.addValue(string, container$Table, atomicInteger);
        this.stack.push(container$Table);
        return container$Table;
    }

    private Container startTable(String string, boolean bl, AtomicInteger atomicInteger) {
        Container$Table container$Table = new Container$Table(string, bl);
        this.addValue(string, container$Table, atomicInteger);
        this.stack.push(container$Table);
        return container$Table;
    }

    void startTableArray(Identifier identifier, AtomicInteger atomicInteger) {
        String string = identifier.getBareName();
        while (this.stack.size() > 1) {
            this.stack.pop();
        }
        Keys$Key[] keys$KeyArray = Keys.split(string);
        for (int i = 0; i < keys$KeyArray.length; ++i) {
            Container container;
            String string2 = keys$KeyArray[i].name;
            Container container2 = this.stack.peek();
            if (container2.get(string2) instanceof Container$TableArray) {
                container = (Container$TableArray)container2.get(string2);
                this.stack.push(container);
                if (i == keys$KeyArray.length - 1) {
                    ((Container$TableArray)container).put(string2, new Container$Table());
                }
                this.stack.push(((Container$TableArray)container).getCurrent());
                container2 = this.stack.peek();
                continue;
            }
            if (container2.get(string2) instanceof Container$Table && i < keys$KeyArray.length - 1) {
                container = (Container)container2.get(string2);
                this.stack.push(container);
                continue;
            }
            if (container2.accepts(string2)) {
                container = i == keys$KeyArray.length - 1 ? new Container$TableArray() : new Container$Table();
                this.addValue(string2, container, atomicInteger);
                this.stack.push(container);
                if (!(container instanceof Container$TableArray)) continue;
                this.stack.push(((Container$TableArray)container).getCurrent());
                continue;
            }
            this.errors.duplicateTable(string, atomicInteger.get());
            break;
        }
    }

    private String getInlineTablePath(String string) {
        Iterator<Container> iterator = this.stack.descendingIterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (iterator.hasNext()) {
            Container container = iterator.next();
            if (container instanceof Container$TableArray) {
                return null;
            }
            Container$Table container$Table = (Container$Table)container;
            if (container$Table.name == null) break;
            if (stringBuilder.length() > 0) {
                stringBuilder.append('.');
            }
            stringBuilder.append(container$Table.name);
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append('.');
        }
        stringBuilder.append(string).insert(0, '[').append(']');
        return stringBuilder.toString();
    }

    void startTables(Identifier identifier, AtomicInteger atomicInteger) {
        String string = identifier.getBareName();
        while (this.stack.size() > 1) {
            this.stack.pop();
        }
        Keys$Key[] keys$KeyArray = Keys.split(string);
        for (int i = 0; i < keys$KeyArray.length; ++i) {
            String string2 = keys$KeyArray[i].name;
            Container container = this.stack.peek();
            if (container.get(string2) instanceof Container) {
                Container container2 = (Container)container.get(string2);
                if (i == keys$KeyArray.length - 1 && !container2.isImplicit()) {
                    this.errors.duplicateTable(string, atomicInteger.get());
                    return;
                }
                this.stack.push(container2);
                if (!(this.stack.peek() instanceof Container$TableArray)) continue;
                this.stack.push(((Container$TableArray)this.stack.peek()).getCurrent());
                continue;
            }
            if (container.accepts(string2)) {
                this.startTable(string2, i < keys$KeyArray.length - 1, atomicInteger);
                continue;
            }
            this.errors.tableDuplicatesKey(string2, atomicInteger);
            break;
        }
    }
}

