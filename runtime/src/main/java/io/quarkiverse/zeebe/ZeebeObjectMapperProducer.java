package io.quarkiverse.zeebe;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

import io.camunda.zeebe.client.api.JsonMapper;
import io.camunda.zeebe.client.impl.ZeebeObjectMapper;
import io.quarkus.arc.DefaultBean;
import io.quarkus.arc.Unremovable;

@Singleton
public class ZeebeObjectMapperProducer {

    @Produces
    @Singleton
    @Unremovable
    @DefaultBean
    public JsonMapper defaultZeebeObjectMapper() {
        return new ZeebeObjectMapper();
    }
}
