package p0216.StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExample {

    public static void main(String[] args) {

        // Stack
        Stack<Coin> coinStack = new Stack<>();

        coinStack.push(new Coin(500));
        coinStack.push(new Coin(100));
        coinStack.push(new Coin(50));
        coinStack.push(new Coin(10));

        while (!coinStack.isEmpty()) {   // 동전케이스가 비었다면 반복문 종료
            Coin coin = coinStack.pop();   // 동전케이스에서 제일 위에 동전 꺼내기
            System.out.println("꺼내온 동전: " + coin.getValue() + "원");
        }

        // Queue
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSms", "제니"));
        messageQueue.offer(new Message("sendKakaoTalk", "리사"));

        while (!messageQueue.isEmpty()) {        // 메시지 큐가 비었는지 확인
            Message message = messageQueue.poll(); // 메시지 큐에서 하나의 메시지 꺼냄
            switch (message.getCommand()) {
                case "sendMail":
                    System.out.println(message.getTo() + "에게 메일을 보냅니다.");
                    break;
                case "sendSms":
                    System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
                    break;
                case "sendKakaoTalk":
                    System.out.println(message.getTo() + "에게 카톡을 보냅니다.");
                    break;
            }
        }

    }
}
