package com.nepxion.discovery.plugin.framework.strategy;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.cloud.client.serviceregistry.Registration;

public interface RegisterStrategy extends Strategy {
    void fireRegister(Registration registration);

    void fireDeregister(Registration registration);

    void fireSetStatus(Registration registration, String status);

    void fireClose();
}