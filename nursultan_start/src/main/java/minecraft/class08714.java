/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10463
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.jtracy.Zone
 *  com.mojang.logging.LogUtils
 *  minecraft.class02253
 *  minecraft.class04643
 *  minecraft.class07529
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10463;
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import minecraft.class02253;
import minecraft.class04643;
import minecraft.class07529;
import minecraft.class08693;
import org.slf4j.Logger;

public class class08714
implements class04643 {
    private static final Logger N = LogUtils.getLogger();
    private static final StackWalker L = StackWalker.getInstance(Set.of(StackWalker.Option.RETAIN_CLASS_REFERENCE), 5);
    private final List<Zone> u = new ArrayList<Zone>();
    private final Map<String, class08693> i = new HashMap<String, class08693>();
    private final String R = Thread.currentThread().getName();

    public void L() {
        if (this.u.isEmpty()) {
            N.error("Tried to pop one too many times! Mismatched push() and pop()?");
            return;
        }
        ((Zone)this.u.removeLast()).close();
    }

    public void L(String string) {
        this.u().addText(string);
    }

    private Zone u() {
        return (Zone)this.u.getLast();
    }

    public void y() {
        Iterator<class08693> var1 = this.i.values().iterator();
        while (var1.hasNext()) {
            var1.next().N(0);
        }
    }

    public void y(Supplier<String> supplier) {
        this.L();
        this.N(supplier.get());
    }

    public void y(String string) {
        this.L();
        this.N(string);
    }

    public void N(int n) {
        this.u().setColor(n);
    }

    public void N(long l) {
        this.u().addValue(l);
    }

    public void N(String string, int n) {
        this.i.computeIfAbsent(string, string2 -> new class08693(this.R + " " + string)).y(n);
    }

    public void N(String string) {
        Optional optional;
        String string2 = "";
        String string3 = "";
        int n = 0;
        if (class07529.ND && (optional = L.walk(stream -> stream.filter(stackFrame -> stackFrame.getDeclaringClass() != class08714.class && stackFrame.getDeclaringClass() != class10463.class).findFirst())).isPresent()) {
            StackWalker.StackFrame stackFrame = (StackWalker.StackFrame)optional.get();
            string2 = stackFrame.getMethodName();
            string3 = stackFrame.getFileName();
            n = stackFrame.getLineNumber();
        }
        optional = TracyClient.beginZone((String)string, (String)string2, (String)string3, (int)n);
        this.u.add((Zone)optional);
    }

    public void N(class02253 class022532) {
    }

    public void N(Supplier<String> supplier, int n) {
        this.N(supplier.get(), n);
    }

    public void N(Supplier<String> supplier) {
        this.N(supplier.get());
    }

    public void N() {
    }
}

