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
import me.shedaniel.math.FloatingRectangle;
import me.shedaniel.math.Point;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Rectangle
implements Cloneable {
    public int x;
    public int y;
    public int width;
    public int height;

    public Rectangle union(Rectangle rectangle) {
        long l = this.width;
        long l2 = this.height;
        if ((l | l2) < 0L) {
            return new Rectangle(rectangle);
        }
        long l3 = rectangle.width;
        long l4 = rectangle.height;
        if ((l3 | l4) < 0L) {
            return new Rectangle(this);
        }
        int n = this.x;
        int n2 = this.y;
        l += (long)n;
        l2 += (long)n2;
        int n3 = rectangle.x;
        int n4 = rectangle.y;
        l3 += (long)n3;
        l4 += (long)n4;
        if (n > n3) {
            n = n3;
        }
        if (n2 > n4) {
            n2 = n4;
        }
        if (l < l3) {
            l = l3;
        }
        if (l2 < l4) {
            l2 = l4;
        }
        l2 -= (long)n2;
        if ((l -= (long)n) > Integer.MAX_VALUE) {
            l = Integer.MAX_VALUE;
        }
        if (l2 > Integer.MAX_VALUE) {
            l2 = Integer.MAX_VALUE;
        }
        return new Rectangle(n, n2, (int)l, (int)l2);
    }

    public Dimension getSize() {
        return new Dimension(this.width, this.height);
    }

    public Rectangle(FloatingPoint floatingPoint) {
        this(floatingPoint.x, floatingPoint.y, 0.0, 0.0);
    }

    public Rectangle(Dimension dimension) {
        this(0, 0, dimension.width, dimension.height);
    }

    public Rectangle(Point point) {
        this(point.x, point.y, 0, 0);
    }

    public Rectangle(FloatingDimension floatingDimension) {
        this(0.0, 0.0, floatingDimension.width, floatingDimension.height);
    }

    public Rectangle(double d, double d2, double d3, double d4) {
        this((int)Math.round(d), (int)Math.round(d2), (int)Math.round(d3), (int)Math.round(d4));
    }

    public Rectangle(int n, int n2, int n3, int n4) {
        this.x = n;
        this.y = n2;
        this.width = n3;
        this.height = n4;
    }

    public Rectangle(int n, int n2) {
        this(0, 0, n, n2);
    }

    public Rectangle(FloatingRectangle floatingRectangle) {
        this(floatingRectangle.x, floatingRectangle.y, floatingRectangle.width, floatingRectangle.height);
    }

    public Rectangle() {
        this(0, 0, 0, 0);
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public Rectangle(FloatingPoint floatingPoint, FloatingDimension floatingDimension) {
        this(floatingPoint.x, floatingPoint.y, floatingDimension.width, floatingDimension.height);
    }

    public Rectangle(FloatingPoint floatingPoint, Dimension dimension) {
        this(floatingPoint.x, floatingPoint.y, (double)dimension.width, (double)dimension.height);
    }

    public Rectangle(Point point, FloatingDimension floatingDimension) {
        this((double)point.x, (double)point.y, floatingDimension.width, floatingDimension.height);
    }

    public Rectangle(Point point, Dimension dimension) {
        this(point.x, point.y, dimension.width, dimension.height);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof Rectangle) {
            object = (Rectangle)object;
            return this.x == ((Rectangle)object).x && this.y == ((Rectangle)object).y && this.width == ((Rectangle)object).width && this.height == ((Rectangle)object).height;
        }
        return super.equals(object);
    }

    public String toString() {
        return ReflectionToStringBuilder.reflectionToString((Object)this);
    }

    public int hashCode() {
        int n = 31 + this.x;
        n = n * 31 + this.y;
        n = n * 31 + this.width;
        n = n * 31 + this.height;
        return n;
    }

    public Rectangle clone() {
        return this.getBounds();
    }

    public boolean isEmpty() {
        return this.width <= 0 || this.height <= 0;
    }

    public void add(int n, int n2) {
        if ((this.width | this.height) < 0) {
            this.x = n;
            this.y = n2;
            Rectangle rectangle = this;
            rectangle.height = 0;
            rectangle.width = 0;
            return;
        }
        int n3 = this.x;
        int n4 = this.y;
        long l = this.width;
        long l2 = this.height;
        l += (long)n3;
        l2 += (long)n4;
        if (n3 > n) {
            n3 = n;
        }
        if (n4 > n2) {
            n4 = n2;
        }
        if (l < (long)n) {
            l = n;
        }
        if (l2 < (long)n2) {
            l2 = n2;
        }
        l2 -= (long)n4;
        if ((l -= (long)n3) > Integer.MAX_VALUE) {
            l = Integer.MAX_VALUE;
        }
        if (l2 > Integer.MAX_VALUE) {
            l2 = Integer.MAX_VALUE;
        }
        this.reshape(n3, n4, (int)l, (int)l2);
    }

    public void add(Point point) {
        this.add(point.x, point.y);
    }

    public void add(FloatingPoint floatingPoint) {
        this.add((int)floatingPoint.x, (int)floatingPoint.y);
    }

    public void add(Rectangle rectangle) {
        long l;
        long l2;
        long l3 = this.width;
        long l4 = this.height;
        if ((l3 | l4) < 0L) {
            this.reshape(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
        }
        if (((l2 = (long)rectangle.width) | (l = (long)rectangle.height)) < 0L) {
            return;
        }
        int n = this.x;
        int n2 = this.y;
        l3 += (long)n;
        l4 += (long)n2;
        int n3 = rectangle.x;
        int n4 = rectangle.y;
        l2 += (long)n3;
        l += (long)n4;
        if (n > n3) {
            n = n3;
        }
        if (n2 > n4) {
            n2 = n4;
        }
        if (l3 < l2) {
            l3 = l2;
        }
        if (l4 < l) {
            l4 = l;
        }
        l4 -= (long)n2;
        if ((l3 -= (long)n) > Integer.MAX_VALUE) {
            l3 = Integer.MAX_VALUE;
        }
        if (l4 > Integer.MAX_VALUE) {
            l4 = Integer.MAX_VALUE;
        }
        this.reshape(n, n2, (int)l3, (int)l4);
    }

    public boolean contains(FloatingRectangle floatingRectangle) {
        return this.contains((int)floatingRectangle.x, (int)floatingRectangle.y, (int)floatingRectangle.width, (int)floatingRectangle.height);
    }

    public boolean contains(double d, double d2) {
        return this.inside((int)d, (int)d2);
    }

    public boolean contains(int n, int n2, int n3, int n4) {
        return this.contains(n, n2) && this.contains(n3, n4);
    }

    public boolean contains(Rectangle rectangle) {
        return this.contains(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public boolean contains(Point point) {
        return this.contains(point.x, point.y);
    }

    public boolean contains(FloatingPoint floatingPoint) {
        return this.contains(floatingPoint.x, floatingPoint.y);
    }

    public boolean contains(int n, int n2) {
        return this.inside(n, n2);
    }

    public Rectangle getBounds() {
        return new Rectangle(this.x, this.y, this.width, this.height);
    }

    public Point getLocation() {
        return new Point(this.x, this.y);
    }

    public void resize(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public void grow(int n, int n2) {
        long l = this.x;
        long l2 = this.y;
        long l3 = this.width;
        long l4 = this.height;
        l3 += l;
        l4 += l2;
        l2 -= (long)n2;
        l4 += (long)n2;
        if ((l3 += (long)n) < (l -= (long)n)) {
            if ((l3 -= l) < Integer.MIN_VALUE) {
                l3 = Integer.MIN_VALUE;
            }
            if (l < Integer.MIN_VALUE) {
                l = Integer.MIN_VALUE;
            } else if (l > Integer.MAX_VALUE) {
                l = Integer.MAX_VALUE;
            }
        } else {
            if (l < Integer.MIN_VALUE) {
                l = Integer.MIN_VALUE;
            } else if (l > Integer.MAX_VALUE) {
                l = Integer.MAX_VALUE;
            }
            if ((l3 -= l) < Integer.MIN_VALUE) {
                l3 = Integer.MIN_VALUE;
            } else if (l3 > Integer.MAX_VALUE) {
                l3 = Integer.MAX_VALUE;
            }
        }
        if (l4 < l2) {
            if ((l4 -= l2) < Integer.MIN_VALUE) {
                l4 = Integer.MIN_VALUE;
            }
            if (l2 < Integer.MIN_VALUE) {
                l2 = Integer.MIN_VALUE;
            } else if (l2 > Integer.MAX_VALUE) {
                l2 = Integer.MAX_VALUE;
            }
        } else {
            if (l2 < Integer.MIN_VALUE) {
                l2 = Integer.MIN_VALUE;
            } else if (l2 > Integer.MAX_VALUE) {
                l2 = Integer.MAX_VALUE;
            }
            if ((l4 -= l2) < Integer.MIN_VALUE) {
                l4 = Integer.MIN_VALUE;
            } else if (l4 > Integer.MAX_VALUE) {
                l4 = Integer.MAX_VALUE;
            }
        }
        this.reshape((int)l, (int)l2, (int)l3, (int)l4);
    }

    public void move(int n, int n2) {
        this.x = n;
        this.y = n2;
    }

    public void setSize(FloatingDimension floatingDimension) {
        this.setSize(floatingDimension.width, floatingDimension.height);
    }

    public void setSize(Dimension dimension) {
        this.setSize(dimension.width, dimension.height);
    }

    public void setSize(int n, int n2) {
        this.resize(n, n2);
    }

    public void setSize(double d, double d2) {
        this.resize((int)Math.round(d), (int)Math.round(d2));
    }

    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    public boolean intersects(Rectangle rectangle) {
        int n = this.width;
        int n2 = this.height;
        int n3 = rectangle.width;
        int n4 = rectangle.height;
        if (n3 <= 0 || n4 <= 0 || n <= 0 || n2 <= 0) {
            return false;
        }
        int n5 = this.x;
        int n6 = this.y;
        int n7 = rectangle.x;
        int n8 = rectangle.y;
        return !((n3 += n7) >= n7 && n3 <= n5 || (n4 += n8) >= n8 && n4 <= n6 || (n += n5) >= n5 && n <= n7 || (n2 += n6) >= n6 && n2 <= n8);
    }

    public void reshape(int n, int n2, int n3, int n4) {
        this.x = n;
        this.y = n2;
        this.width = n3;
        this.height = n4;
    }

    public void setBounds(FloatingRectangle floatingRectangle) {
        this.setBounds(floatingRectangle.x, floatingRectangle.y, floatingRectangle.width, floatingRectangle.height);
    }

    public void setBounds(Rectangle rectangle) {
        this.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public void setBounds(double d, double d2, double d3, double d4) {
        this.setBounds((int)Math.round(d), (int)Math.round(d2), (int)Math.round(d3), (int)Math.round(d4));
    }

    public void setBounds(int n, int n2, int n3, int n4) {
        this.reshape(n, n2, n3, n4);
    }

    public boolean inside(int n, int n2) {
        int n3 = this.x;
        int n4 = this.y;
        return !this.isEmpty() && n >= n3 && n <= n3 + this.width && n2 >= n4 && n2 <= n4 + this.height;
    }

    public void setLocation(double d, double d2) {
        this.move((int)Math.round(d), (int)Math.round(d2));
    }

    public void setLocation(int n, int n2) {
        this.move(n, n2);
    }

    public void setLocation(FloatingPoint floatingPoint) {
        this.setLocation(floatingPoint.x, floatingPoint.y);
    }

    public void setLocation(Point point) {
        this.setLocation(point.x, point.y);
    }

    public Rectangle intersection(Rectangle rectangle) {
        int n = this.x;
        int n2 = this.y;
        int n3 = rectangle.x;
        int n4 = rectangle.y;
        long l = n;
        l += (long)this.width;
        long l2 = n2;
        l2 += (long)this.height;
        long l3 = n3;
        l3 += (long)rectangle.width;
        long l4 = n4;
        l4 += (long)rectangle.height;
        if (n < n3) {
            n = n3;
        }
        if (n2 < n4) {
            n2 = n4;
        }
        if (l > l3) {
            l = l3;
        }
        if (l2 > l4) {
            l2 = l4;
        }
        l2 -= (long)n2;
        if ((l -= (long)n) < Integer.MIN_VALUE) {
            l = Integer.MIN_VALUE;
        }
        if (l2 < Integer.MIN_VALUE) {
            l2 = Integer.MIN_VALUE;
        }
        return new Rectangle(n, n2, (int)l, (int)l2);
    }

    public void translate(int n, int n2) {
        this.x += n;
        this.y += n2;
    }

    public int getWidth() {
        return this.width;
    }

    public int getMaxY() {
        return this.y + this.height;
    }

    public int getCenterY() {
        return this.y + this.height / 2;
    }

    public int getCenterX() {
        return this.x + this.width / 2;
    }

    public int getMaxX() {
        return this.x + this.width;
    }

    public FloatingRectangle getFloatingBounds() {
        return new FloatingRectangle(this.x, this.y, this.width, this.height);
    }

    public FloatingDimension getFloatingSize() {
        return new FloatingDimension(this.width, this.height);
    }

    public int getHeight() {
        return this.height;
    }

    public int getMinX() {
        return this.x;
    }

    public int getMinY() {
        return this.y;
    }

    public FloatingPoint getFloatingLocation() {
        return new FloatingPoint(this.x, this.y);
    }
}

