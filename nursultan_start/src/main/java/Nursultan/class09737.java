/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.locationtech.jts.geom.Coordinate
 *  org.locationtech.jts.geom.Geometry
 *  org.locationtech.jts.geom.GeometryFactory
 *  org.locationtech.jts.geom.LineString
 *  org.locationtech.jts.geom.Point
 *  org.locationtech.jts.geom.Polygon
 *  org.locationtech.jts.operation.polygonize.Polygonizer
 *  org.locationtech.jts.operation.union.UnaryUnionOp
 */
package Nursultan;

import Nursultan.class09716;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.LineString;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.operation.polygonize.Polygonizer;
import org.locationtech.jts.operation.union.UnaryUnionOp;

final class class09737 {
    private static final double N = 6.0E-4;
    private static final double y = 1.0E-7;
    private static final GeometryFactory L = new GeometryFactory();

    private class09737() {
    }

    private static void N(List<Coordinate[]> list, List<Coordinate> list2) {
        if (list2 == null || list2.size() < 3) {
            return;
        }
        Coordinate coordinate = list2.get(0);
        Coordinate coordinate2 = list2.get(list2.size() - 1);
        if (coordinate.x != coordinate2.x || coordinate.y != coordinate2.y) {
            list2.add(new Coordinate(coordinate.x, coordinate.y));
        }
        if (list2.size() >= 4) {
            list.add(list2.toArray(new Coordinate[0]));
        }
    }

    private static long N(Geometry geometry) {
        long l = class09716.y();
        for (int i = 0; i < geometry.getNumGeometries(); ++i) {
            Geometry geometry2 = geometry.getGeometryN(i);
            if (!(geometry2 instanceof Polygon)) continue;
            Polygon polygon = (Polygon)geometry2;
            class09737.N(l, polygon.getExteriorRing().getCoordinates());
            for (int j = 0; j < polygon.getNumInteriorRing(); ++j) {
                class09737.N(l, polygon.getInteriorRingN(j).getCoordinates());
            }
        }
        return l;
    }

    private static void N(long l, Coordinate[] coordinateArray) {
        if (coordinateArray.length < 4) {
            return;
        }
        long l2 = class09716.L(l);
        for (int i = 0; i < coordinateArray.length - 1; ++i) {
            Coordinate coordinate = coordinateArray[i];
            Coordinate coordinate2 = coordinateArray[i + 1];
            if (!(Math.abs(coordinate.x - coordinate2.x) >= 1.0E-7) && !(Math.abs(coordinate.y - coordinate2.y) >= 1.0E-7)) continue;
            class09716.N(l2, coordinate.x, coordinate.y, coordinate2.x, coordinate2.y);
        }
    }

    private static List<Coordinate[]> N(Path2D.Double double_) {
        ArrayList<Coordinate[]> arrayList = new ArrayList<Coordinate[]>();
        PathIterator pathIterator = double_.getPathIterator(null, 6.0E-4);
        double[] dArray = new double[6];
        ArrayList<Coordinate> arrayList2 = null;
        while (!pathIterator.isDone()) {
            switch (pathIterator.currentSegment(dArray)) {
                case 0: {
                    class09737.N(arrayList, arrayList2);
                    arrayList2 = new ArrayList<Coordinate>();
                    arrayList2.add(new Coordinate(dArray[0], dArray[1]));
                    break;
                }
                case 1: {
                    if (arrayList2 == null) break;
                    arrayList2.add(new Coordinate(dArray[0], dArray[1]));
                    break;
                }
                case 4: {
                    class09737.N(arrayList, arrayList2);
                    arrayList2 = null;
                    break;
                }
            }
            pathIterator.next();
        }
        class09737.N(arrayList, arrayList2);
        return arrayList;
    }

    static long N(long l) {
        Geometry geometry;
        Geometry geometry2;
        Path2D.Double double_ = class09716.y(l);
        if (double_ == null) {
            return 0L;
        }
        List<Coordinate[]> var3 = class09737.N(double_);
        if (var3.isEmpty()) {
            return 0L;
        }
        ArrayList<LineString> arrayList = new ArrayList<LineString>(var3.size());
        for (Coordinate[] polygonizer2 : var3) {
            arrayList.add(L.createLineString(polygonizer2));
        }
        try {
            geometry2 = L.buildGeometry(arrayList).union();
        }
        catch (RuntimeException runtimeException) {
            return 0L;
        }
        Polygonizer polygonizer = new Polygonizer();
        polygonizer.add(geometry2);
        Collection collection = polygonizer.getPolygons();
        if (collection.isEmpty()) {
            return 0L;
        }
        ArrayList<Polygon> arrayList2 = new ArrayList<Polygon>();
        for (Polygon runtimeException : collection) {
            Point point = runtimeException.getInteriorPoint();
            if (class09737.N(point.getX(), point.getY(), var3) == 0) continue;
            arrayList2.add(runtimeException);
        }
        if (arrayList2.isEmpty()) {
            return 0L;
        }
        try {
            geometry = UnaryUnionOp.union(arrayList2);
        }
        catch (RuntimeException runtimeException) {
            geometry = L.buildGeometry(arrayList2).buffer(0.0);
        }
        if (geometry == null || geometry.isEmpty()) {
            return 0L;
        }
        return class09737.N(geometry);
    }

    private static double N(Coordinate coordinate, Coordinate coordinate2, double d, double d2) {
        return (coordinate2.x - coordinate.x) * (d2 - coordinate.y) - (d - coordinate.x) * (coordinate2.y - coordinate.y);
    }

    private static int N(double d, double d2, List<Coordinate[]> list) {
        int n = 0;
        for (Coordinate[] coordinateArray : list) {
            for (int i = 0; i < coordinateArray.length - 1; ++i) {
                Coordinate coordinate = coordinateArray[i];
                Coordinate coordinate2 = coordinateArray[i + 1];
                if (coordinate.y <= d2) {
                    if (!(coordinate2.y > d2) || !(class09737.N(coordinate, coordinate2, d, d2) > 0.0)) continue;
                    ++n;
                    continue;
                }
                if (!(coordinate2.y <= d2) || !(class09737.N(coordinate, coordinate2, d, d2) < 0.0)) continue;
                --n;
            }
        }
        return n;
    }
}

