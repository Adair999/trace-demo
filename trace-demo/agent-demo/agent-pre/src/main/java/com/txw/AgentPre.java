package com.txw;

public class AgentPre {
    public static void premain(String agentArgs) {
        System.out.println("java agent premain执行，agentArgs参数:" + agentArgs);
    }
}