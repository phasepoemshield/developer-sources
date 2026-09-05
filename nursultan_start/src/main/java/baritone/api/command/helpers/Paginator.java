/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.Helper
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class05216
 *  minecraft.class06541
 */
package baritone.api.command.helpers;

import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidTypeException;
import baritone.api.utils.Helper;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class05216;
import minecraft.class06541;

public class Paginator<E>
implements Helper {
    public final List<E> entries;
    public int pageSize = 8;
    public int page = 1;

    public Paginator(List<E> list) {
        this.entries = list;
    }

    public Paginator(E ... EArray) {
        this.entries = Arrays.asList(EArray);
    }

    public void display(Function<E, class00392> function, String string) {
        int n;
        int n2;
        for (n2 = n = (this.page - 1) * this.pageSize; n2 < n + this.pageSize; ++n2) {
            if (n2 < this.entries.size()) {
                this.logDirect(new class00392[]{function.apply(this.entries.get(n2))});
                continue;
            }
            this.logDirect("--", class06541.field_1063);
        }
        n2 = string != null && this.validPage(this.page - 1) ? 1 : 0;
        boolean bl = string != null && this.validPage(this.page + 1);
        class05216 class052162 = class00392.y((String)"<<");
        if (n2 != 0) {
            class052162.y(class052162.method_10866().N((class00647)new class00625(String.format("%s %d", string, this.page - 1))).N((class00395)new class00401((class00392)class00392.y((String)"Click to view previous page"))));
        } else {
            class052162.y(class052162.method_10866().N(class06541.field_1063));
        }
        class05216 class052163 = class00392.y((String)">>");
        if (bl) {
            class052163.y(class052163.method_10866().N((class00647)new class00625(String.format("%s %d", string, this.page + 1))).N((class00395)new class00401((class00392)class00392.y((String)"Click to view next page"))));
        } else {
            class052163.y(class052163.method_10866().N(class06541.field_1063));
        }
        class05216 class052164 = class00392.y((String)"");
        class052164.y(class052164.method_10866().N(class06541.field_1080));
        class052164.y((class00392)class052162);
        class052164.i(" | ");
        class052164.y((class00392)class052163);
        class052164.i(String.format(" %d/%d", this.page, this.getMaxPage()));
        this.logDirect(new class00392[]{class052164});
    }

    public void display(Function<E, class00392> function) {
        this.display(function, null);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, List<T> list, Runnable runnable, Function<T, class00392> function) throws CommandException {
        Paginator.paginate(iArgConsumer, new Paginator<T>(list), runnable, function, null);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, Paginator<T> paginator, Runnable runnable, Function<T, class00392> function) throws CommandException {
        Paginator.paginate(iArgConsumer, paginator, runnable, function, null);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, T[] TArray, Function<T, class00392> function, String string) throws CommandException {
        Paginator.paginate(iArgConsumer, Arrays.asList(TArray), null, function, string);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, List<T> list, Function<T, class00392> function, String string) throws CommandException {
        Paginator.paginate(iArgConsumer, new Paginator<T>(list), null, function, string);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, Paginator<T> paginator, Function<T, class00392> function) throws CommandException {
        Paginator.paginate(iArgConsumer, paginator, null, function, null);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, T[] TArray, Runnable runnable, Function<T, class00392> function) throws CommandException {
        Paginator.paginate(iArgConsumer, Arrays.asList(TArray), runnable, function, null);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, List<T> list, Function<T, class00392> function) throws CommandException {
        Paginator.paginate(iArgConsumer, new Paginator<T>(list), null, function, null);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, T[] TArray, Function<T, class00392> function) throws CommandException {
        Paginator.paginate(iArgConsumer, Arrays.asList(TArray), null, function, null);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, Paginator<T> paginator, Runnable runnable, Function<T, class00392> function, String string) throws CommandException {
        int n = 1;
        iArgConsumer.requireMax(1);
        if (iArgConsumer.hasAny() && !paginator.validPage(n = iArgConsumer.getAs(Integer.class).intValue())) {
            throw new CommandInvalidTypeException(iArgConsumer.consumed(), String.format("a valid page (1-%d)", paginator.getMaxPage()), iArgConsumer.consumed().getValue());
        }
        paginator.skipPages(n - paginator.page);
        if (runnable != null) {
            runnable.run();
        }
        paginator.display(function, string);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, List<T> list, Runnable runnable, Function<T, class00392> function, String string) throws CommandException {
        Paginator.paginate(iArgConsumer, new Paginator<T>(list), runnable, function, string);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, T[] TArray, Runnable runnable, Function<T, class00392> function, String string) throws CommandException {
        Paginator.paginate(iArgConsumer, Arrays.asList(TArray), runnable, function, string);
    }

    public static <T> void paginate(IArgConsumer iArgConsumer, Paginator<T> paginator, Function<T, class00392> function, String string) throws CommandException {
        Paginator.paginate(iArgConsumer, paginator, null, function, string);
    }

    public Paginator<E> skipPages(int n) {
        this.page += n;
        return this;
    }

    public boolean validPage(int n) {
        return n > 0 && n <= this.getMaxPage();
    }

    public int getMaxPage() {
        return (this.entries.size() - 1) / this.pageSize + 1;
    }

    public Paginator<E> setPageSize(int n) {
        this.pageSize = n;
        return this;
    }
}

