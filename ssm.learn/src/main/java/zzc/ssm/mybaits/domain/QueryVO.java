package zzc.ssm.mybaits.domain;

import java.util.ArrayList;

/**
 * @author : zzc
 * @date: 2021-06-06 11:06
 **/
public class QueryVO {
    private Users users ;
    private ArrayList<Integer> ids ;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public ArrayList<Integer> getIds() {
        return ids;
    }

    public void setIds(ArrayList<Integer> ids) {
        this.ids = ids;
    }

    public static void main(String args[]) {

    }
}
