package com.github.smqtt.core.topic;

import com.github.smqtt.common.channel.MqttChannel;
import com.github.smqtt.common.topic.TopicRegistry;

/**
 * @author luxurong
 * @date 2021/3/31 13:26
 * @description 管理topic connection关系
 */
public class DefaultTopicRegistry implements TopicRegistry {


    @Override
    public void registryTopicConnection(String topic, MqttChannel mqttChannel) {

    }

    @Override
    public void clear(MqttChannel mqttChannel) {

    }


}
