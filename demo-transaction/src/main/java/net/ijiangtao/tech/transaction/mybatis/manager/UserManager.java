package net.ijiangtao.tech.transaction.mybatis.manager;

import net.ijiangtao.tech.transaction.mybatis.entity.UserEntity;

import java.util.List;

/**
 * User
 *
 * @author ijiangtao
 * @create 2019-08-15 15:10
 **/
public interface UserManager {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    Long insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

    void batchInsert(List<UserEntity> users);

    void test1(UserEntity user);

    void test2(UserEntity user);

    void test3(UserEntity user3, UserEntity user4);

    void test4(UserEntity user3);
}
