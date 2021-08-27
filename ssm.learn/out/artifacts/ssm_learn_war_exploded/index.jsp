<%@ page import="org.apache.ibatis.io.Resources" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactoryBuilder" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="zzc.ssm.mybaits.dao.IUserDao" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="zzc.ssm.mybaits.domain.QueryVO" %>
<%@ page import="zzc.ssm.mybaits.domain.Users" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello world</h1>
<%
    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml") ;
    //2.创建SqlSessionFactory工厂
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder() ;
    SqlSessionFactory factory = builder.build(in) ;
    //3.使用工厂生产工厂Sqlsession对象
    SqlSession sessions = factory.openSession() ;
    //4.使用sqlSession创建Dao接口的代理对象 也就是DAO
    IUserDao userDao = sessions.getMapper(IUserDao.class);
    ArrayList<Integer> ids = new ArrayList<>() ;
    ids.add(1) ;
    // 通过QueryVO对查询条件进行封装
    // 根据用户id列表来查找符合条件的用户
    QueryVO queryVO = new QueryVO() ;
    queryVO.setIds(ids);
    Users users = new Users() ;
    users.setUsername("1");
    users.setSex("1");
    List<Users> users1 = userDao.findUsrById(queryVO) ;
    for(Users user : users1){
         out.println(user);
    }
    sessions.close();
    in.close();
%>
</body>
</html>
