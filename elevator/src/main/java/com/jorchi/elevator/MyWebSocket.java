package com.jorchi.elevator;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;



@ServerEndpoint(value = "/websocket",encoders = {EncodeClass.class})
@Component
public class MyWebSocket {

//    private Logger logger= LoggerFactory.getLogger(this.getClass());
    private static int onlineCount = 0;

    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
    private static CopyOnWriteArraySet<MyWebSocket> webSocketSet = new CopyOnWriteArraySet<MyWebSocket>();


    private Session session;

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        //加入set中
        webSocketSet.add(this);
        addOnlineCount();
        //在线数加1

       /* try {
           // sendMessage("有新连接加入！当前在线人数为" + getOnlineCount());
        } catch (IOException e) {
//            logger.error("IO异常");
            //System.out.println("");
        }*/
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        //从set中删除
        webSocketSet.remove(this);
        subOnlineCount();           //在线数减1
//        logger.info("有一连接关闭！当前在线人数为" + getOnlineCount());
        //System.out.println();
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message) {
       // System.out.println();
//        logger.info("来自客户端的消息:" + message);
    }

    public static void sendInfo(String message) throws IOException {
        for (MyWebSocket item : webSocketSet) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                continue;
            }
        }
    }
    public void sendMessage(Object message) throws IOException {
        for (MyWebSocket item : webSocketSet) {

           // item.session.getAsyncRemote().sendText(message);
            item.session.getAsyncRemote().sendObject(message);
        }
    }

    public static void sendMessageAll(String message) {


            for (MyWebSocket item : webSocketSet) {
                item.session.getAsyncRemote().sendText(message);
            }


    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        MyWebSocket.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        MyWebSocket.onlineCount--;
    }

}
