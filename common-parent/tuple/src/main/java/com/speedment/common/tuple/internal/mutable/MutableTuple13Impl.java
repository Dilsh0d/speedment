/**
 * 
 * Copyright (c) 2006-2018, Speedment, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at: 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.tuple.internal.mutable;

import com.speedment.common.tuple.MutableTuple;
import com.speedment.common.tuple.Tuple13;
import com.speedment.common.tuple.Tuple;
import com.speedment.common.tuple.TupleOfNullables;
import com.speedment.common.tuple.internal.AbstractMutableTuple;
import com.speedment.common.tuple.mutable.MutableTuple13;
import java.util.Optional;

/**
 * An implementation class of a {@link MutableTuple13}.
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TupleImplPattern
 * 
 * @param <T0>  type of element 0
 * @param <T1>  type of element 1
 * @param <T2>  type of element 2
 * @param <T3>  type of element 3
 * @param <T4>  type of element 4
 * @param <T5>  type of element 5
 * @param <T6>  type of element 6
 * @param <T7>  type of element 7
 * @param <T8>  type of element 8
 * @param <T9>  type of element 9
 * @param <T10> type of element 10
 * @param <T11> type of element 11
 * @param <T12> type of element 12
 * 
 * @author Per Minborg
 */
public final class MutableTuple13Impl<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> 
extends AbstractMutableTuple 
implements MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> {
    
    /**
     * Constructs a {@link MutableTuple} of type {@link MutableTuple13}.
     */
    public MutableTuple13Impl() {
        super(MutableTuple13Impl.class, 13);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T0> get0() {
        return Optional.ofNullable((T0) values[0]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T1> get1() {
        return Optional.ofNullable((T1) values[1]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T2> get2() {
        return Optional.ofNullable((T2) values[2]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T3> get3() {
        return Optional.ofNullable((T3) values[3]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T4> get4() {
        return Optional.ofNullable((T4) values[4]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T5> get5() {
        return Optional.ofNullable((T5) values[5]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T6> get6() {
        return Optional.ofNullable((T6) values[6]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T7> get7() {
        return Optional.ofNullable((T7) values[7]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T8> get8() {
        return Optional.ofNullable((T8) values[8]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T9> get9() {
        return Optional.ofNullable((T9) values[9]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T10> get10() {
        return Optional.ofNullable((T10) values[10]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T11> get11() {
        return Optional.ofNullable((T11) values[11]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T12> get12() {
        return Optional.ofNullable((T12) values[12]);
    }
    
    @Override
    public void set0(T0 t0) {
        values[0] = t0;
    }
    
    @Override
    public void set1(T1 t1) {
        values[1] = t1;
    }
    
    @Override
    public void set2(T2 t2) {
        values[2] = t2;
    }
    
    @Override
    public void set3(T3 t3) {
        values[3] = t3;
    }
    
    @Override
    public void set4(T4 t4) {
        values[4] = t4;
    }
    
    @Override
    public void set5(T5 t5) {
        values[5] = t5;
    }
    
    @Override
    public void set6(T6 t6) {
        values[6] = t6;
    }
    
    @Override
    public void set7(T7 t7) {
        values[7] = t7;
    }
    
    @Override
    public void set8(T8 t8) {
        values[8] = t8;
    }
    
    @Override
    public void set9(T9 t9) {
        values[9] = t9;
    }
    
    @Override
    public void set10(T10 t10) {
        values[10] = t10;
    }
    
    @Override
    public void set11(T11 t11) {
        values[11] = t11;
    }
    
    @Override
    public void set12(T12 t12) {
        values[12] = t12;
    }
}