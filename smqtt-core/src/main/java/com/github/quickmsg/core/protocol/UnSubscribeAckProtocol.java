package com.github.quickmsg.core.protocol;

import com.github.quickmsg.common.channel.MqttChannel;
import com.github.quickmsg.common.protocol.Protocol;
import io.netty.handler.codec.mqtt.MqttMessageType;
import io.netty.handler.codec.mqtt.MqttUnsubAckMessage;
import reactor.core.publisher.Mono;
import reactor.util.context.ContextView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luxurong
 * @date 2021/3/29 14:05
 * @description  client handler
 */
public class UnSubscribeAckProtocol implements Protocol<MqttUnsubAckMessage> {

    private static List<MqttMessageType> MESSAGE_TYPE_LIST = new ArrayList<>();

    static {
        MESSAGE_TYPE_LIST.add(MqttMessageType.UNSUBACK);
    }

    @Override
    public Mono<Void> parseProtocol(MqttUnsubAckMessage message, MqttChannel mqttChannel, ContextView contextView) {
        return mqttChannel.cancelRetry(MqttMessageType.UNSUBSCRIBE,message.variableHeader().messageId());
    }

    @Override
    public List<MqttMessageType> getMqttMessageTypes() {
        return MESSAGE_TYPE_LIST;
    }


}
