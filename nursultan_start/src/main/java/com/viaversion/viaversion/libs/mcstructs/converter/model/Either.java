/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 */
package com.viaversion.viaversion.libs.mcstructs.converter.model;

import java.util.function.Function;
import javax.annotation.Nonnull;

public interface Either<L, R> {
    public static <T> T unwrap(Either<? extends T, ? extends T> either) {
        return either.isLeft() ? either.getLeft() : either.getRight();
    }

    public boolean equals(Object var1);

    public String toString();

    public int hashCode();

    public <ML, MR> Either<ML, MR> map(Function<L, ML> var1, Function<R, MR> var2);

    public static <L, R> Either<L, R> left(@Nonnull L left) {
        return new Left(left);
    }

    public static <L, R> Either<L, R> right(@Nonnull R right) {
        return new Right(right);
    }

    public Either<R, L> swap();

    public <T> T xmap(Function<L, T> var1, Function<R, T> var2);

    public L getLeft();

    public R getRight();

    public boolean isLeft();

    public boolean isRight();

    public static class Right<L, R>
    implements Either<L, R> {
        private final R right;

        private Right(R right) {
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Right)) {
                return false;
            }
            Right other = (Right)o;
            if (!other.canEqual(this)) {
                return false;
            }
            R this$right = this.getRight();
            R other$right = other.getRight();
            return !(this$right == null ? other$right != null : !this$right.equals(other$right));
        }

        @Override
        public String toString() {
            return "Right{" + this.getRight() + "}";
        }

        @Override
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            R $right = this.getRight();
            result = result * 59 + ($right == null ? 43 : $right.hashCode());
            return result;
        }

        @Override
        public <ML, MR> Either<ML, MR> map(Function<L, ML> leftMapper, Function<R, MR> rightMapper) {
            return Either.right(rightMapper.apply(this.right));
        }

        @Override
        public Either<R, L> swap() {
            return Either.left(this.right);
        }

        @Override
        public <T> T xmap(Function<L, T> leftMapper, Function<R, T> rightMapper) {
            return rightMapper.apply(this.right);
        }

        @Override
        public L getLeft() {
            return null;
        }

        @Override
        public R getRight() {
            return this.right;
        }

        @Override
        public boolean isLeft() {
            return false;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Right;
        }

        @Override
        public boolean isRight() {
            return true;
        }
    }

    public static class Left<L, R>
    implements Either<L, R> {
        private final L left;

        private Left(L left) {
            this.left = left;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Left)) {
                return false;
            }
            Left other = (Left)o;
            if (!other.canEqual(this)) {
                return false;
            }
            L this$left = this.getLeft();
            L other$left = other.getLeft();
            return !(this$left == null ? other$left != null : !this$left.equals(other$left));
        }

        @Override
        public String toString() {
            return "Left{" + this.getLeft() + "}";
        }

        @Override
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            L $left = this.getLeft();
            result = result * 59 + ($left == null ? 43 : $left.hashCode());
            return result;
        }

        @Override
        public <ML, MR> Either<ML, MR> map(Function<L, ML> leftMapper, Function<R, MR> rightMapper) {
            return Either.left(leftMapper.apply(this.getLeft()));
        }

        @Override
        public Either<R, L> swap() {
            return Either.right(this.left);
        }

        @Override
        public <T> T xmap(Function<L, T> leftMapper, Function<R, T> rightMapper) {
            return leftMapper.apply(this.getLeft());
        }

        @Override
        public L getLeft() {
            return this.left;
        }

        @Override
        public R getRight() {
            return null;
        }

        @Override
        public boolean isLeft() {
            return true;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Left;
        }

        @Override
        public boolean isRight() {
            return false;
        }
    }
}

