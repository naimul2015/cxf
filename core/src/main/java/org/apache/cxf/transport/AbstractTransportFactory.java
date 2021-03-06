/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.transport;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Helper methods for {@link DestinationFactory}s and {@link ConduitInitiator}s.
 */
public abstract class AbstractTransportFactory {
    private List<String> transportIds;

    public AbstractTransportFactory() {
    }
    public AbstractTransportFactory(List<String> ids) {
        transportIds = ids;
    }

    public final List<String> getTransportIds() {
        return transportIds;
    }

    public void setTransportIds(List<String> transportIds) {
        this.transportIds = transportIds;
    }

    public Set<String> getUriPrefixes() {
        return Collections.emptySet();
    }
}
