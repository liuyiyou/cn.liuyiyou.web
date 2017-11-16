/**
 * <p> 
 * Copyright (C) IBALIFE Software Co.,Ltd.
 * </p>
 * <p>
 * 创建日期： 2017-11-14
 * </p>
 */
package cn.liuyiyou.web.service;

import cn.liuyiyou.web.model.User;
import cn.liuyiyou.web.model.UserExample;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * <code>user</code>管理的 DSF 服务接口定义<br>
 * 对应的数据表为 <code>user</code>
 * <p>
 * 创建日期： 2017-11-14
 * </p>
 */
public interface UserService {

    /**
     * This method was generated by MyBatis Generator，user
     *
     * @param record 数据记录
     */
    User addUser(User record);

    /**
     * This method was generated by MyBatis Generator，user
     *
     * @param id 主键
     */
    Integer delUser(Integer id);

    /**
     * 根据指定的条件删除数据库符合条件的记录，user
     *
     * @param example 动态查询条件
     * @return 删除的数据记录条数
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator，user
     *
     * @param record 数据记录
     */
    User updateUser(User record);

    /**
     * 根据指定的条件来更新符合条件的数据记录，user
     *
     * @param record 数据记录
     * @param example 动态查询条件
     * @return 更新的数据记录条数
     */
    int updateByExample(User record, UserExample example);

    /**
     * This method was generated by MyBatis Generator，user
     *
     * @param id 主键
     */
    User getByKey(Integer id);

    /**
     * 根据指定的条件查询符合条件的数据记录，user
     *
     * @param example 动态查询条件
     * @return 查询到的数据记录列表
     */
    List<User> selectByExample(UserExample example);

    /**
     * 根据指定的条件获取数据记录数，user
     *
     * @param example 动态查询条件
     * @return 符合查询条件的数据记录条数
     */
    int countByExample(UserExample example);

    /**
     * 根据指定的条件分页查询符合条件的数据记录，user
     *
     * @param example 动态查询条件
     * @return 查询到的指定页数据记录
     */
    PageInfo<User> selectByExampleWithPage(UserExample example);

    /**
     * This method was generated by MyBatis Generator，user
     *
     * @param params This parameter was generated by MyBatis Generator
     */
    PageInfo<User> selectByParamsWithPage(User params);
}