package zzc.domain;

/**
 * @author : zzc
 * @date: 2021-06-07 22:39
 **/
public class User {
    private int id ;
    private String username ;
    private String truename ;
    private String password ;
    private String sex ;
    private String age ;
    private String favpr ;
    private String province ;
    private String intro ;

    public User (){

    }
    public User (int id, String username, String truename, String password, String sex, String age, String favpr, String province, String intro) {
        this.id = id;
        this.username = username;
        this.truename = truename;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.favpr = favpr;
        this.province = province;
        this.intro = intro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFavpr() {
        return favpr;
    }

    public void setFavpr(String favpr) {
        this.favpr = favpr;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", truename='" + truename + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", favpr='" + favpr + '\'' +
                ", province='" + province + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
