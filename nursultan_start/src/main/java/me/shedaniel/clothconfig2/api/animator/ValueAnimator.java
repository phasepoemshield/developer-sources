/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.ConventionValueAnimator
 *  me.shedaniel.clothconfig2.api.animator.DoubleValueAnimatorImpl
 *  me.shedaniel.clothconfig2.api.animator.MappingValueAnimator
 *  me.shedaniel.clothconfig2.api.animator.NumberAnimator
 *  me.shedaniel.clothconfig2.api.animator.ProgressValueAnimator
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimator
 *  me.shedaniel.math.Color
 *  me.shedaniel.math.Dimension
 *  me.shedaniel.math.FloatingDimension
 *  me.shedaniel.math.FloatingPoint
 *  me.shedaniel.math.FloatingRectangle
 *  me.shedaniel.math.Point
 *  me.shedaniel.math.Rectangle
 */
package me.shedaniel.clothconfig2.api.animator;

import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.animator.ConventionValueAnimator;
import me.shedaniel.clothconfig2.api.animator.DoubleValueAnimatorImpl;
import me.shedaniel.clothconfig2.api.animator.MappingValueAnimator;
import me.shedaniel.clothconfig2.api.animator.NumberAnimator;
import me.shedaniel.clothconfig2.api.animator.ProgressValueAnimator;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimator;
import me.shedaniel.clothconfig2.api.animator.ValueProvider;
import me.shedaniel.math.Color;
import me.shedaniel.math.Dimension;
import me.shedaniel.math.FloatingDimension;
import me.shedaniel.math.FloatingPoint;
import me.shedaniel.math.FloatingRectangle;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;

public interface ValueAnimator<T>
extends ValueProvider<T> {
    default public <R> ValueAnimator<R> map(Function<T, R> function, Function<R, T> function2) {
        return new MappingValueAnimator(this, function, function2);
    }

    public ValueAnimator<T> setTarget(T var1);

    public static ProgressValueAnimator<Boolean> ofBoolean() {
        return ValueAnimator.ofBoolean(50.0);
    }

    public static ProgressValueAnimator<Boolean> ofBoolean(double d) {
        return ProgressValueAnimator.mapProgress(ValueAnimator.ofDouble(), d2 -> d2 > d / 100.0, bl -> bl != false ? 100.0 : 0.0);
    }

    public static ProgressValueAnimator<Boolean> ofBoolean(boolean bl) {
        return ValueAnimator.ofBoolean().setAs((Object)bl);
    }

    public static ProgressValueAnimator<Boolean> ofBoolean(double d, boolean bl) {
        return ValueAnimator.ofBoolean(d).setAs((Object)bl);
    }

    public static NumberAnimator<Long> ofLong(long l) {
        return ValueAnimator.ofLong().setAs(l);
    }

    public static NumberAnimator<Long> ofLong() {
        return ValueAnimator.ofDouble().asLong();
    }

    public static NumberAnimator<Integer> ofInt(int n) {
        return ValueAnimator.ofInt().setAs(n);
    }

    public static NumberAnimator<Integer> ofInt() {
        return ValueAnimator.ofDouble().asInt();
    }

    public static ValueAnimator<Point> ofPoint() {
        return RecordValueAnimator.of(ValueAnimator.ofInt(), ValueAnimator.ofInt(), Point::new, (point, recordValueAnimatorArgs$Setter, recordValueAnimatorArgs$Setter2) -> {
            recordValueAnimatorArgs$Setter.set(point.x);
            recordValueAnimatorArgs$Setter2.set(point.y);
        });
    }

    public static ValueAnimator<Point> ofPoint(Point point) {
        return ValueAnimator.ofPoint().setAs(point);
    }

    public ValueAnimator<T> setTo(T var1, long var2);

    default public ValueAnimator<T> setAs(T t) {
        return this.setTo(t, -1L);
    }

    public static NumberAnimator<Double> ofDouble(double d) {
        return new DoubleValueAnimatorImpl(d);
    }

    public static NumberAnimator<Double> ofDouble() {
        return new DoubleValueAnimatorImpl(0.0);
    }

    public static ValueAnimator<Color> ofColor() {
        return RecordValueAnimator.of(ValueAnimator.ofInt(), ValueAnimator.ofInt(), ValueAnimator.ofInt(), ValueAnimator.ofInt(), Color::ofRGBA, (color, recordValueAnimatorArgs$Setter, recordValueAnimatorArgs$Setter2, recordValueAnimatorArgs$Setter3, recordValueAnimatorArgs$Setter4) -> {
            recordValueAnimatorArgs$Setter.set(color.getRed());
            recordValueAnimatorArgs$Setter2.set(color.getGreen());
            recordValueAnimatorArgs$Setter3.set(color.getBlue());
            recordValueAnimatorArgs$Setter4.set(color.getAlpha());
        });
    }

    public static ValueAnimator<Color> ofColor(Color color) {
        return ValueAnimator.ofColor().setAs(color);
    }

    public static NumberAnimator<Float> ofFloat() {
        return ValueAnimator.ofDouble().asFloat();
    }

    public static NumberAnimator<Float> ofFloat(float f) {
        return ValueAnimator.ofFloat().setAs(f);
    }

    public static ValueAnimator<Rectangle> ofRectangle() {
        return RecordValueAnimator.of(ValueAnimator.ofInt(), ValueAnimator.ofInt(), ValueAnimator.ofInt(), ValueAnimator.ofInt(), Rectangle::new, (rectangle, recordValueAnimatorArgs$Setter, recordValueAnimatorArgs$Setter2, recordValueAnimatorArgs$Setter3, recordValueAnimatorArgs$Setter4) -> {
            recordValueAnimatorArgs$Setter.set(rectangle.x);
            recordValueAnimatorArgs$Setter2.set(rectangle.y);
            recordValueAnimatorArgs$Setter3.set(rectangle.width);
            recordValueAnimatorArgs$Setter4.set(rectangle.height);
        });
    }

    public static ValueAnimator<Rectangle> ofRectangle(Rectangle rectangle) {
        return ValueAnimator.ofRectangle().setAs(rectangle);
    }

    public static ValueAnimator<Dimension> ofDimension(Dimension dimension) {
        return ValueAnimator.ofDimension().setAs(dimension);
    }

    public static ValueAnimator<Dimension> ofDimension() {
        return RecordValueAnimator.of(ValueAnimator.ofInt(), ValueAnimator.ofInt(), Dimension::new, (dimension, recordValueAnimatorArgs$Setter, recordValueAnimatorArgs$Setter2) -> {
            recordValueAnimatorArgs$Setter.set(dimension.width);
            recordValueAnimatorArgs$Setter2.set(dimension.height);
        });
    }

    @Deprecated
    public static ValueAnimator<Point> ofDimension(Point point) {
        return ValueAnimator.ofPoint().setAs(point);
    }

    public static ValueAnimator<FloatingPoint> ofFloatingPoint() {
        return RecordValueAnimator.of(ValueAnimator.ofDouble(), ValueAnimator.ofDouble(), FloatingPoint::new, (floatingPoint, recordValueAnimatorArgs$Setter, recordValueAnimatorArgs$Setter2) -> {
            recordValueAnimatorArgs$Setter.set(floatingPoint.x);
            recordValueAnimatorArgs$Setter2.set(floatingPoint.y);
        });
    }

    public static ValueAnimator<FloatingPoint> ofFloatingPoint(FloatingPoint floatingPoint) {
        return ValueAnimator.ofFloatingPoint().setAs(floatingPoint);
    }

    default public ValueAnimator<T> withConvention(Supplier<T> supplier, long l) {
        return new ConventionValueAnimator(this, supplier, l);
    }

    @Override
    default public void completeImmediately() {
        this.setAs(this.target());
    }

    public static long typicalTransitionTime() {
        return 700L;
    }

    public static ValueAnimator<FloatingDimension> ofFloatingDimension(FloatingDimension floatingDimension) {
        return ValueAnimator.ofFloatingDimension().setAs(floatingDimension);
    }

    @Deprecated
    public static ValueAnimator<FloatingPoint> ofFloatingDimension(FloatingPoint floatingPoint) {
        return ValueAnimator.ofFloatingPoint().setAs(floatingPoint);
    }

    public static ValueAnimator<FloatingDimension> ofFloatingDimension() {
        return RecordValueAnimator.of(ValueAnimator.ofDouble(), ValueAnimator.ofDouble(), FloatingDimension::new, (floatingDimension, recordValueAnimatorArgs$Setter, recordValueAnimatorArgs$Setter2) -> {
            recordValueAnimatorArgs$Setter.set(floatingDimension.width);
            recordValueAnimatorArgs$Setter2.set(floatingDimension.height);
        });
    }

    public static ValueAnimator<FloatingRectangle> ofFloatingRectangle(FloatingRectangle floatingRectangle) {
        return ValueAnimator.ofFloatingRectangle().setAs(floatingRectangle);
    }

    public static ValueAnimator<FloatingRectangle> ofFloatingRectangle() {
        return RecordValueAnimator.of(ValueAnimator.ofDouble(), ValueAnimator.ofDouble(), ValueAnimator.ofDouble(), ValueAnimator.ofDouble(), FloatingRectangle::new, (floatingRectangle, recordValueAnimatorArgs$Setter, recordValueAnimatorArgs$Setter2, recordValueAnimatorArgs$Setter3, recordValueAnimatorArgs$Setter4) -> {
            recordValueAnimatorArgs$Setter.set(floatingRectangle.x);
            recordValueAnimatorArgs$Setter2.set(floatingRectangle.y);
            recordValueAnimatorArgs$Setter3.set(floatingRectangle.width);
            recordValueAnimatorArgs$Setter4.set(floatingRectangle.height);
        });
    }
}

