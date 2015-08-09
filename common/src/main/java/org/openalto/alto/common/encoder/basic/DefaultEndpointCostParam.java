package org.openalto.alto.common.encoder.basic;

import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

import org.openalto.alto.common.type.CostType;
import org.openalto.alto.common.type.EndpointAddress;

public class DefaultEndpointCostParam
        extends CostFilterParam<EndpointAddress<?>> {

    public DefaultEndpointCostParam(CostType type) {
        super(type);
    }

}
