package creation.prototype;

import java.util.ArrayList;
import java.util.List;

// Deep clone 예
public class Users implements Cloneable {
    // 사용자 정의 객체
    private List<String> userList;

    public Users(List<String> userList) {
        this.userList = userList;
    }

    public void loadData() {
        this.userList = new ArrayList();
        this.userList.add("park");
        this.userList.add("Lee");
    }

    public List<String> getUserList() {
        return this.userList;
    }

    public Users clone() throws CloneNotSupportedException {
        // 기본형 타입이 아니므로, 사용자가 복사해야 함
        List<String> temp = new ArrayList<>();
        for (String user : this.userList) {
            temp.add(user);
        }

        return new Users(temp);
    }
}
