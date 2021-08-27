package spring.aop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.aop.dao.IAccountDao;
import spring.aop.service.IAccountService;
import spring.aop.utils.TransactionMannager;

/**
 * 事务控制 ：
 *      dao的事务控制已经在dao自己实现了，所以我们
 *  需要在service中实现对多个dao操作的事务控制，保持
 *  数据库的一致性。
 *
 * @author : zzc
 * @date: 2021-06-12 14:48
 **/
@Service
public class IAccountServiceImpl implements IAccountService {
    @Override
    public void findAll() {
        System.out.println("执行了查找");
    }

//    @Autowired
//    private IAccountDao iAccountDao ;
//
//    @Autowired
//    private TransactionMannager transactionMannager ;

//    /**
//     * 完整的事务流程，service实现事务控制的过程
//     */
//    @Override
//    public void findAll() {
//        try{
//            //1.开启事务
//            transactionMannager.beginTransaction();
//            //2.执行操作
//
//            //3.提交事务
//            transactionMannager.commit();
//            //4.返回结果
//
//        }catch (Exception e){
//            //5.事务回滚
//            transactionMannager.rollBack();
//        }finally {
//            //6.释放连接
//            transactionMannager.release();
//        }
//    }
}
