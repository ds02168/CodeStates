package JAVA_OOP_Extend;

class Friend{ //상위클래스
    public void friendInfo(){
        System.out.println("나는 당신의 친구입니다.");
    }
}

class BoyFriend extends Friend{ //하위클래스
    @Override
    public void friendInfo() {
        System.out.println("나는 당신의 남자친구입니다.");
    }
}

class GirlFriend extends Friend{ //하위클래스
    @Override
    public void friendInfo() {
        System.out.println("나는 당신의 여자친구입니다.");
    }
}

public class FriendTest {
    public static void main(String[] args) {
        Friend friend = new Friend(); //상위클래스 참조_변수 = 상위클래스 객체
        BoyFriend boyfriend = new BoyFriend(); //하위클래스 참조_변수 = 하위클래스 객체
        Friend girlfriend = new GirlFriend(); //상위클래스 참조_변수 = 하위클래스 객체

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo(); //친구? 여자친구?
    }
}
