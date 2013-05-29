/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package java.util.function;

/**
 * An operation on two {@code long} operands yielding a {@code long} result.
 * This is the primitive type specialization of {@link BinaryOperator} for
 * {@code long}.
 *
 * @see BinaryOperator
 * @since 1.8
 */
@FunctionalInterface
public interface LongBinaryOperator {

    /**
     * Returns the {@code long} result of the operation upon the {@code long}
     * operands. The parameters are named {@code left} and {@code right} for
     * operations where the order of parameters matters.
     *
     * @param left the left operand value
     * @param right  the right operand value
     * @return the result of the operation
     */
    public long applyAsLong(long left, long right);
}
