package com.funtl.apache.shardingsphere.config;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

//public final class PreciseModuloShardingTableAlgorithm implements PreciseShardingAlgorithm<Long> {
//
//    @Override
//    public String doSharding(final Collection<String> tableNames, final PreciseShardingValue<Long> shardingValue) {
//        for (String each : tableNames) {
//            if (each.endsWith(shardingValue.getValue() % 2 + "")) {
//                return each;
//            }
//        }
//        throw new UnsupportedOperationException();
//    }
//}
public  class PreciseModuloShardingTableAlgorithm {


}