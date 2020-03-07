/*
 * ========================================================================
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */
package com.manning.junitbook.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.manning.junitbook.spring.PassengerUtil.getExpectedPassenger;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleAppTest {

    private Passenger expectedPassenger;

    @BeforeEach
    public void setUp() {
        expectedPassenger = getExpectedPassenger();
    }

    @Test
    public void testInitPassenger() {
        assertEquals("John Smith", expectedPassenger.getName());
        assertEquals("USA", expectedPassenger.getCountry().getName());
        assertEquals("US", expectedPassenger.getCountry().getCodeName());
        assertEquals("US", expectedPassenger.getCountry().getCodeName());
    }


}
