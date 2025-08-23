package org.apache.rocketmq.example.test;

import org.apache.rocketmq.acl.common.AclClientRPCHook;
import org.apache.rocketmq.acl.common.SessionCredentials;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.apache.rocketmq.tools.admin.DefaultMQAdminExt;

public class mqadmin {
    public static void main(String[] args) throws MQClientException, RemotingException, MQBrokerException, InterruptedException {
//        DefaultMQAdminExt mqAdminExt = new DefaultMQAdminExt(new AclClientRPCHook(new SessionCredentials("rocketmq","12345678")));
        DefaultMQAdminExt mqAdminExt = new DefaultMQAdminExt(new AclClientRPCHook(new SessionCredentials("a111111","a111111")));
        mqAdminExt.setNamesrvAddr("127.0.0.1:9876");
        mqAdminExt.start();
//        mqAdminExt.createUser("127.0.0.1:10911","a111111","a111111","normal");
//        Object result = mqAdminExt.getUser("127.0.0.1:10911", "a111111");
        Object object = mqAdminExt.getAllProducerInfo("127.0.0.1:10911");
//        mqAdminExt.createAndUpdateTopicConfig("127.0.0.1:10911",new TopicConfig("aaa0003"));
        System.out.println();
    }
}
