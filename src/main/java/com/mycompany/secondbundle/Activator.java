package com.mycompany.secondbundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

    public void start(BundleContext bc) throws Exception {
        ServiceRegistration timeServReg= bc.registerService(TabService.class.getName(), new TabServiceSimple(), null);
    }

    public void stop(BundleContext context) throws Exception {
        // TODO add deactivation code here
    }

}
