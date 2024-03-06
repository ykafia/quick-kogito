package com.ibm;

import org.kie.kogito.internal.process.runtime.KogitoProcessContext;

public class Tool {
    public static void callOtherBPMN(KogitoProcessContext kc){
        System.out.println(kc.getProcessInstance().getProcessId());
        try {
           kc.getKogitoProcessRuntime().startProcess("other");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
