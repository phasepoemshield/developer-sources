/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.interval_tree;

import java.util.Comparator;
import net.caffeinemc.mods.sodium.client.util.interval_tree.Interval$Bounded;
import net.caffeinemc.mods.sodium.client.util.interval_tree.Interval$Unbounded;

public abstract class Interval<T extends Comparable<? super T>> {
    private T start;
    private T end;
    private boolean isStartInclusive;
    private boolean isEndInclusive;
    public static final Comparator<Interval> sweepLeftToRight = (interval, interval2) -> {
        int n = interval.compareStarts((Interval)interval2);
        if (n != 0) {
            return n;
        }
        n = interval.compareEnds((Interval)interval2);
        if (n != 0) {
            return n;
        }
        return interval.compareSpecialization((Interval)interval2);
    };
    public static final Comparator<Interval> sweepRightToLeft = (interval, interval2) -> {
        int n = interval2.compareEnds((Interval)interval);
        if (n != 0) {
            return n;
        }
        n = interval2.compareStarts((Interval)interval);
        if (n != 0) {
            return n;
        }
        return interval.compareSpecialization((Interval)interval2);
    };

    protected abstract Interval<T> create();

    protected Interval<T> create(T t, boolean bl, T t2, boolean bl2) {
        Interval<T> interval = this.create();
        interval.start = t;
        interval.isStartInclusive = bl;
        interval.end = t2;
        interval.isEndInclusive = bl2;
        return interval;
    }

    public Interval() {
        this.isStartInclusive = true;
        this.isEndInclusive = true;
    }

    public Interval(T t, Interval$Unbounded interval$Unbounded) {
        if (interval$Unbounded == null) {
            interval$Unbounded = Interval$Unbounded.CLOSED_RIGHT;
        }
        switch (interval$Unbounded.ordinal()) {
            case 0: {
                this.start = t;
                this.isStartInclusive = false;
                this.isEndInclusive = true;
                break;
            }
            case 1: {
                this.start = t;
                this.isStartInclusive = true;
                this.isEndInclusive = true;
                break;
            }
            case 2: {
                this.end = t;
                this.isStartInclusive = true;
                this.isEndInclusive = false;
                break;
            }
            default: {
                this.end = t;
                this.isStartInclusive = true;
                this.isEndInclusive = true;
            }
        }
    }

    public Interval(T t, T t2, Interval$Bounded interval$Bounded) {
        this.start = t;
        this.end = t2;
        if (interval$Bounded == null) {
            interval$Bounded = Interval$Bounded.CLOSED;
        }
        switch (interval$Bounded.ordinal()) {
            case 0: {
                break;
            }
            case 1: {
                this.isStartInclusive = true;
                this.isEndInclusive = true;
                break;
            }
            case 2: {
                this.isEndInclusive = true;
                break;
            }
            default: {
                this.isStartInclusive = true;
            }
        }
    }

    public boolean equals(Object object) {
        if (!(object instanceof Interval)) {
            return false;
        }
        Interval interval = (Interval)object;
        if (this.start == null ^ interval.start == null) {
            return false;
        }
        if (this.end == null ^ interval.end == null) {
            return false;
        }
        if (this.isEndInclusive ^ interval.isEndInclusive) {
            return false;
        }
        if (this.isStartInclusive ^ interval.isStartInclusive) {
            return false;
        }
        if (this.start != null && !this.start.equals(interval.start)) {
            return false;
        }
        return this.end == null || this.end.equals(interval.end);
    }

    public int hashCode() {
        int n = 31;
        int n2 = this.start == null ? 0 : this.start.hashCode();
        n2 = n * n2 + (this.end == null ? 0 : this.end.hashCode());
        n2 = n * n2 + (this.isStartInclusive ? 1 : 0);
        n2 = n * n2 + (this.isEndInclusive ? 1 : 0);
        return n2;
    }

    public boolean isEmpty() {
        if (this.start == null || this.end == null) {
            return false;
        }
        int n = this.start.compareTo(this.end);
        if (n > 0) {
            return true;
        }
        return n == 0 && (!this.isEndInclusive || !this.isStartInclusive);
    }

    public boolean contains(T t) {
        int n;
        if (this.isEmpty() || t == null) {
            return false;
        }
        int n2 = this.start == null ? 1 : t.compareTo(this.start);
        int n3 = n = this.end == null ? -1 : t.compareTo(this.end);
        if (n2 > 0 && n < 0) {
            return true;
        }
        return n2 == 0 && this.isStartInclusive || n == 0 && this.isEndInclusive;
    }

    public boolean intersects(Interval<T> interval) {
        if (interval == null) {
            return false;
        }
        Interval<T> interval2 = this.getIntersection(interval);
        return interval2 != null;
    }

    public T getEnd() {
        return this.end;
    }

    public abstract T getMidpoint();

    private int compareEnds(Interval<T> interval) {
        if (this.end == null && interval.end == null) {
            return 0;
        }
        if (this.end == null) {
            return 1;
        }
        if (interval.end == null) {
            return -1;
        }
        int n = this.end.compareTo(interval.end);
        if (n != 0) {
            return n;
        }
        if (this.isEndInclusive ^ interval.isEndInclusive) {
            return this.isEndInclusive ? 1 : -1;
        }
        return 0;
    }

    private int compareStarts(Interval<T> interval) {
        if (this.start == null && interval.start == null) {
            return 0;
        }
        if (this.start == null) {
            return -1;
        }
        if (interval.start == null) {
            return 1;
        }
        int n = this.start.compareTo(interval.start);
        if (n != 0) {
            return n;
        }
        if (this.isStartInclusive ^ interval.isStartInclusive) {
            return this.isStartInclusive ? -1 : 1;
        }
        return 0;
    }

    public boolean isStartInclusive() {
        return this.isStartInclusive;
    }

    public boolean isEndInclusive() {
        return this.isEndInclusive;
    }

    public Interval<T> getIntersection(Interval<T> interval) {
        boolean bl;
        T t;
        boolean bl2;
        T t2;
        if (interval == null || this.isEmpty() || interval.isEmpty()) {
            return null;
        }
        if (interval.start == null && this.start != null || this.start != null && this.start.compareTo(interval.start) > 0) {
            return interval.getIntersection(this);
        }
        if (!(this.end == null || interval.start == null || this.end.compareTo(interval.start) >= 0 && (this.end.compareTo(interval.start) != 0 || this.isEndInclusive && interval.isStartInclusive))) {
            return null;
        }
        if (interval.start == null) {
            t2 = null;
            bl2 = true;
        } else {
            t2 = interval.start;
            bl2 = this.start != null && interval.start.compareTo(this.start) == 0 ? interval.isStartInclusive && this.isStartInclusive : interval.isStartInclusive;
        }
        if (this.end == null) {
            t = interval.end;
            bl = interval.isEndInclusive;
        } else if (interval.end == null) {
            t = this.end;
            bl = this.isEndInclusive;
        } else {
            int n = this.end.compareTo(interval.end);
            if (n == 0) {
                t = this.end;
                bl = this.isEndInclusive && interval.isEndInclusive;
            } else if (n < 0) {
                t = this.end;
                bl = this.isEndInclusive;
            } else {
                t = interval.end;
                bl = interval.isEndInclusive;
            }
        }
        Interval<Object> interval2 = this.create(t2, bl2, t, bl);
        return interval2.isEmpty() ? null : interval2;
    }

    public T getStart() {
        return this.start;
    }

    protected int compareSpecialization(Interval<T> interval) {
        return 0;
    }

    public boolean isRightOf(T t) {
        return this.isRightOf(t, true);
    }

    public boolean isRightOf(T t, boolean bl) {
        if (t == null || this.start == null) {
            return false;
        }
        int n = t.compareTo(this.start);
        if (n != 0) {
            return n < 0;
        }
        return !this.isStartInclusive() || !bl;
    }

    public boolean isRightOf(Interval<T> interval) {
        if (interval == null || interval.isEmpty()) {
            return false;
        }
        return this.isRightOf(interval.end, interval.isEndInclusive());
    }

    public boolean isLeftOf(T t) {
        return this.isLeftOf(t, true);
    }

    public boolean isLeftOf(Interval<T> interval) {
        if (interval == null || interval.isEmpty()) {
            return false;
        }
        return this.isLeftOf(interval.start, interval.isStartInclusive());
    }

    public boolean isLeftOf(T t, boolean bl) {
        if (t == null || this.end == null) {
            return false;
        }
        int n = t.compareTo(this.end);
        if (n != 0) {
            return n > 0;
        }
        return !this.isEndInclusive() || !bl;
    }
}

