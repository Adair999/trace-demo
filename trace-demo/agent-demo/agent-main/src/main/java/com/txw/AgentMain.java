package com.txw;

import java.lang.instrument.Instrumentation;
public class AgentMain {
    public static void agentmain(String agentArgs, Instrumentation inst) throws Exception {
        System.out.println("premain done");
    }
}