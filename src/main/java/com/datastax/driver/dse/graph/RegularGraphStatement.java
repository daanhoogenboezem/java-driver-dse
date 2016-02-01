/*
 *      Copyright (C) 2012-2015 DataStax Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.datastax.driver.dse.graph;

import com.datastax.driver.core.RegularStatement;
import com.datastax.driver.core.Statement;

/**
 * A regular (non-prepared and non batched) Graph statement.
 * <p/>
 * This class represents a Graph query string along with Graph query options (and optionally
 * Graph values). It can be extended, but {@link SimpleGraphStatement}
 * is provided as a simple implementation to build a {@code RegularGraphStatement} directly
 * from its query string.
 */
public abstract class RegularGraphStatement extends GraphStatement {

    /**
     * Returns the Graph query string for this statement.
     *
     * @return The Graph query string for this statement.
     */
    public abstract String getQueryString();

    /**
     * Returns an executable {@link RegularStatement} object
     * corresponding to this RegularGraphStatement.
     *
     * @return An executable {@link Statement}.
     */
    @Override
    public abstract RegularStatement unwrap();

}

