package com.txw;

import com.sun.tools.attach.VirtualMachine;
public class AttachMain {
    public static void main(String[] args) throws Exception {
        String jar = "F:\\tmp\\agent-main.jar"; // agentmain()方法所在jar包
        VirtualMachine vm = VirtualMachine.attach("11844"); // attach到新JVM
        vm.loadAgent(jar);
    }
}