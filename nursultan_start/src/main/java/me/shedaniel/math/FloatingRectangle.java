/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.builder.ReflectionToStringBuilder
 */
package me.shedaniel.math;

import me.shedaniel.math.Dimension;
import me.shedaniel.math.FloatingDimension;
import me.shedaniel.math.FloatingPoint;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FloatingRectangle
implements Cloneable {
    public double x;
    public double y;
    public double width;
    public double height;

    public FloatingRectangle union(FloatingRectangle floatingRectangle) {
        double d = this.width;
        double d2 = this.height;
        if (d < 0.0 || d2 < 0.0) {
            return new FloatingRectangle(floatingRectangle);
        }
        double d3 = floatingRectangle.width;
        double d4 = floatingRectangle.height;
        if (d3 < 0.0 || d4 < 0.0) {
            return new FloatingRectangle(this);
        }
        double d5 = this.x;
        double d6 = this.y;
        d += d5;
        d2 += d6;
        double d7 = floatingRectangle.x;
        double d8 = floatingRectangle.y;
        d3 += d7;
        d4 += d8;
        if (d5 > d7) {
            d5 = d7;
        }
        if (d6 > d8) {
            d6 = d8;
        }
        if (d < d3) {
            d = d3;
        }
        if (d2 < d4) {
            d2 = d4;
        }
        d -= d5;
        d2 -= d6;
        if (d > Double.MAX_VALUE) {
            d = Double.MAX_VALUE;
        }
        if (d2 > Double.MAX_VALUE) {
            d2 = Double.MAX_VALUE;
        }
        return new FloatingRectangle(d5, d6, (int)d, (int)d2);
    }

    public Dimension getSize() {
        return new Dimension(this.width, this.height);
    }

    public FloatingRectangle(Point point) {
        this(point.x, point.y, 0.0, 0.0);
    }

    public FloatingRectangle(FloatingPoint floatingPoint) {
        this(floatingPoint.x, floatingPoint.y, 0.0, 0.0);
    }

    public FloatingRectangle(FloatingPoint floatingPoint, FloatingDimension floatingDimension) {
        this(floatingPoint.x, floatingPoint.y, floatingDimension.width, floatingDimension.height);
    }

    public FloatingRectangle(Dimension dimension) {
        this(0.0, 0.0, dimension.width, dimension.height);
    }

    public FloatingRectangle(FloatingDimension floatingDimension) {
        this(0.0, 0.0, floatingDimension.width, floatingDimension.height);
    }

    public FloatingRectangle(double d, double d2, double d3, double d4) {
        this.x = d;
        this.y = d2;
        this.width = d3;
        this.height = d4;
    }

    public FloatingRectangle(int n, int n2) {
        this(0.0, 0.0, n, n2);
    }

    public FloatingRectangle(Rectangle rectangle) {
        this(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public FloatingRectangle() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public FloatingRectangle(FloatingRectangle floatingRectangle) {
        this(floatingRectangle.x, floatingRectangle.y, floatingRectangle.width, floatingRectangle.height);
    }

    public FloatingRectangle(FloatingPoint floatingPoint, Dimension dimension) {
        this(floatingPoint.x, floatingPoint.y, dimension.width, dimension.height);
    }

    public FloatingRectangle(Point point, FloatingDimension floatingDimension) {
        this(point.x, point.y, floatingDimension.width, floatingDimension.height);
    }

    public FloatingRectangle(Point point, Dimension dimension) {
        this(point.x, point.y, dimension.width, dimension.height);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof FloatingRectangle) {
            object = (FloatingRectangle)object;
            return this.x == ((FloatingRectangle)object).x && this.y == ((FloatingRectangle)object).y && this.width == ((FloatingRectangle)object).width && this.height == ((FloatingRectangle)object).height;
        }
        return super.equals(object);
    }

    public String toString() {
        return ReflectionToStringBuilder.reflectionToString((Object)this);
    }

    public int hashCode() {
        int n = 31 + Double.hashCode(this.x);
        n = n * 31 + Double.hashCode(this.y);
        n = n * 31 + Double.hashCode(this.width);
        n = n * 31 + Double.hashCode(this.height);
        return n;
    }

    public FloatingRectangle clone() {
        return this.getFloatingBounds();
    }

    public boolean isEmpty() {
        return this.width <= 0.0 || this.height <= 0.0;
    }

    public void add(Point point) {
        this.add(point.x, point.y);
    }

    public void add(FloatingRectangle floatingRectangle) {
        double d = this.width;
        double d2 = this.height;
        if (d < 0.0 || d2 < 0.0) {
            this.reshape(floatingRectangle.x, floatingRectangle.y, floatingRectangle.width, floatingRectangle.height);
        }
        double d3 = floatingRectangle.width;
        double d4 = floatingRectangle.height;
        if (d3 < 0.0 || d4 < 0.0) {
            return;
        }
        double d5 = this.x;
        double d6 = this.y;
        d += d5;
        d2 += d6;
        double d7 = floatingRectangle.x;
        double d8 = floatingRectangle.y;
        d3 += d7;
        d4 += d8;
        if (d5 > d7) {
            d5 = d7;
        }
        if (d6 > d8) {
            d6 = d8;
        }
        if (d < d3) {
            d = d3;
        }
        if (d2 < d4) {
            d2 = d4;
        }
        d -= d5;
        d2 -= d6;
        if (d > Double.MAX_VALUE) {
            d = Double.MAX_VALUE;
        }
        if (d2 > Double.MAX_VALUE) {
            d2 = Double.MAX_VALUE;
        }
        this.reshape(d5, d6, (int)d, (int)d2);
    }

    public void add(FloatingPoint floatingPoint) {
        this.add(floatingPoint.x, floatingPoint.y);
    }

    public void add(double d, double d2) {
        if (this.width < 0.0 || this.height < 0.0) {
            this.x = d;
            this.y = d2;
            FloatingRectangle floatingRectangle = this;
            floatingRectangle.height = 0.0;
            floatingRectangle.width = 0.0;
            return;
        }
        double d3 = this.x;
        double d4 = this.y;
        double d5 = this.width;
        double d6 = this.height;
        d5 += d3;
        d6 += d4;
        if (d3 > d) {
            d3 = d;
        }
        if (d4 > d2) {
            d4 = d2;
        }
        if (d5 < d) {
            d5 = d;
        }
        if (d6 < d2) {
            d6 = d2;
        }
        d5 -= d3;
        d6 -= d4;
        if (d5 > Double.MAX_VALUE) {
            d5 = Double.MAX_VALUE;
        }
        if (d6 > Double.MAX_VALUE) {
            d6 = Double.MAX_VALUE;
        }
        this.reshape(d3, d4, (int)d5, (int)d6);
    }

    public boolean contains(Point point) {
        return this.contains(point.x, point.y);
    }

    public boolean contains(double d, double d2, double d3, double d4) {
        return this.contains(d, d2) && this.contains(d3, d4);
    }

    public boolean contains(FloatingRectangle floatingRectangle) {
        return this.contains(floatingRectangle.x, floatingRectangle.y, floatingRectangle.width, floatingRectangle.height);
    }

    public boolean contains(Rectangle rectangle) {
        return this.contains(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public boolean contains(double d, double d2) {
        return this.inside((int)d, (int)d2);
    }

    public boolean contains(int n, int n2) {
        return this.inside(n, n2);
    }

    public boolean contains(FloatingPoint floatingPoint) {
        return this.contains(floatingPoint.x, floatingPoint.y);
    }

    public Rectangle getBounds() {
        return new Rectangle(this.x, this.y, this.width, this.height);
    }

    public Point getLocation() {
        return new Point(this.x, this.y);
    }

    public void resize(double d, double d2) {
        this.width = d;
        this.height = d2;
    }

    public void grow(double d, double d2) {
        double d3 = this.x;
        double d4 = this.y;
        double d5 = this.width;
        double d6 = this.height;
        d5 += d3;
        d6 += d4;
        d3 -= d;
        d4 -= d2;
        d5 += d;
        d6 += d2;
        if (d5 < d3) {
            double d7;
            d5 -= d3;
            if (d7 < Double.MIN_VALUE) {
                d5 = Double.MIN_VALUE;
            }
            if (d3 < Double.MIN_VALUE) {
                d3 = Double.MIN_VALUE;
            } else if (d3 > Double.MAX_VALUE) {
                d3 = Double.MAX_VALUE;
            }
        } else {
            double d8;
            if (d3 < Double.MIN_VALUE) {
                d3 = Double.MIN_VALUE;
            } else if (d3 > Double.MAX_VALUE) {
                d3 = Double.MAX_VALUE;
            }
            d5 -= d3;
            if (d8 < Double.MIN_VALUE) {
                d5 = Double.MIN_VALUE;
            } else if (d5 > Double.MAX_VALUE) {
                d5 = Double.MAX_VALUE;
            }
        }
        if (d6 < d4) {
            double d9;
            d6 -= d4;
            if (d9 < Double.MIN_VALUE) {
                d6 = Double.MIN_VALUE;
            }
            if (d4 < Double.MIN_VALUE) {
                d4 = Double.MIN_VALUE;
            } else if (d4 > Double.MAX_VALUE) {
                d4 = Double.MAX_VALUE;
            }
        } else {
            double d10;
            if (d4 < Double.MIN_VALUE) {
                d4 = Double.MIN_VALUE;
            } else if (d4 > Double.MAX_VALUE) {
                d4 = Double.MAX_VALUE;
            }
            d6 -= d4;
            if (d10 < Double.MIN_VALUE) {
                d6 = Double.MIN_VALUE;
            } else if (d6 > Double.MAX_VALUE) {
                d6 = Double.MAX_VALUE;
            }
        }
        this.reshape((int)d3, (int)d4, (int)d5, (int)d6);
    }

    public void move(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public void setSize(double d, double d2) {
        this.resize(d, d2);
    }

    public void setSize(Dimension dimension) {
        this.setSize(dimension.width, dimension.height);
    }

    public void setSize(FloatingDimension floatingDimension) {
        this.setSize(floatingDimension.width, floatingDimension.height);
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    public boolean intersects(FloatingRectangle floatingRectangle) {
        double d = this.width;
        double d2 = this.height;
        double d3 = floatingRectangle.width;
        double d4 = floatingRectangle.height;
        if (d3 <= 0.0 || d4 <= 0.0 || d <= 0.0 || d2 <= 0.0) {
            return false;
        }
        double d5 = this.x;
        double d6 = this.y;
        double d7 = floatingRectangle.x;
        double d8 = floatingRectangle.y;
        return ((d3 += d7) < d7 || d3 > d5) && ((d4 += d8) < d8 || d4 > d6) && ((d += d5) < d5 || d > d7) && ((d2 += d6) < d6 || d2 > d8);
    }

    public void reshape(double d, double d2, double d3, double d4) {
        this.x = d;
        this.y = d2;
        this.width = d3;
        this.height = d4;
    }

    public void setBounds(double d, double d2, double d3, double d4) {
        this.reshape(d, d2, d3, d4);
    }

    public void setBounds(Rectangle rectangle) {
        this.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public void setBounds(FloatingRectangle floatingRectangle) {
        this.setBounds(floatingRectangle.x, floatingRectangle.y, floatingRectangle.width, floatingRectangle.height);
    }

    public boolean inside(double d, double d2) {
        double d3 = this.x;
        double d4 = this.y;
        return !this.isEmpty() && d >= d3 && d <= d3 + this.width && d2 >= d4 && d2 <= d4 + this.height;
    }

    public void setLocation(double d, double d2) {
        this.move(d, d2);
    }

    public void setLocation(FloatingPoint floatingPoint) {
        this.setLocation(floatingPoint.x, floatingPoint.y);
    }

    public void setLocation(Point point) {
        this.setLocation(point.x, point.y);
    }

    public FloatingRectangle intersection(FloatingRectangle floatingRectangle) {
        double d = this.x;
        double d2 = this.y;
        double d3 = floatingRectangle.x;
        double d4 = floatingRectangle.y;
        double d5 = d + this.width;
        double d6 = d2 + this.height;
        double d7 = d3 + floatingRectangle.width;
        double d8 = d4 + floatingRectangle.height;
        if (d < d3) {
            d = d3;
        }
        if (d2 < d4) {
            d2 = d4;
        }
        if (d5 > d7) {
            d5 = d7;
        }
        if (d6 > d8) {
            d6 = d8;
        }
        d5 -= d;
        d6 -= d2;
        if (d5 < Double.MIN_VALUE) {
            d5 = Double.MIN_VALUE;
        }
        if (d6 < Double.MIN_VALUE) {
            d6 = Double.MIN_VALUE;
        }
        return new FloatingRectangle(d, d2, (int)d5, (int)d6);
    }

    public void translate(double d, double d2) {
        this.x += d;
        this.y += d2;
    }

    public double getWidth() {
        return this.width;
    }

    public double getMaxY() {
        return this.y + this.height;
    }

    public double getCenterY() {
        return this.y + this.height / 2.0;
    }

    public double getCenterX() {
        return this.x + this.width / 2.0;
    }

    public double getMaxX() {
        return this.x + this.width;
    }

    public FloatingRectangle getFloatingBounds() {
        return new FloatingRectangle(this.x, this.y, this.width, this.height);
    }

    public double getHeight() {
        return this.height;
    }

    public double getMinX() {
        return this.x;
    }

    public double getMinY() {
        return this.y;
    }

    public FloatingPoint getFloatingLocation() {
        return new FloatingPoint(this.x, this.y);
    }
}

