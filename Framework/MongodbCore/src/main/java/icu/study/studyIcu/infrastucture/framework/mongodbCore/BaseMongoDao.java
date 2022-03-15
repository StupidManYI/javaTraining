package icu.study.studyIcu.infrastucture.framework.mongodbCore;

import icu.study.studyIcu.infrastructure.util.commonUtil.constant.DBFieldConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author 小易
 */

public abstract class BaseMongoDao<T> {

    @Autowired
    protected MongoTemplate mongoTemplate;

    /**
     * 获取当前实例的泛型类型,注意是实例化了的才可以获取到
     */
    public Class<T> getCurrentClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /**
     * 新增一个
     */
    public void insertOne(T one) {
        mongoTemplate.insert(one);
    }

    /**
     * 新增一个
     */
    public void saveOne(T one) {
        mongoTemplate.save(one);
    }


    /**
     * 新增或修改一个
     */
    public void insertOrUpdateOne(T one) {
        mongoTemplate.save(one);
    }

    /**
     * 修改一个
     */
    public int updateOne(Query query, Update update) {
        return (int) mongoTemplate.updateFirst(query, update, getCurrentClass()).getModifiedCount();
    }

    /**
     * 修改一个通过id
     */
    public int updateOneById(String id, Update update) {
        Query query = new Query(Criteria.where("_id").is(id));
        return (int) mongoTemplate.updateFirst(query, update, getCurrentClass()).getModifiedCount();
    }

    public int updateOneByUserId(String userId, Update update) {
        Query query = new Query(Criteria.where("user_id").is(userId));
        return (int) mongoTemplate.updateFirst(query, update, getCurrentClass()).getModifiedCount();
    }


    /**
     * 修改多个
     */
    public int updateMulti(Query query, Update update) {
        return (int) mongoTemplate.updateMulti(query, update, getCurrentClass()).getModifiedCount();
    }

    /**
     * 查询一个
     */
    public T selectOne(Query query) {
        return mongoTemplate.findOne(query, getCurrentClass());
    }

    /**
     * 查询id
     */
    public T selectOneById(String id) {
        Query query = new Query(Criteria.where(DBFieldConstant.MONGO_ID).is(id));
        return mongoTemplate.findOne(query, getCurrentClass());
    }

    /**
     * 查询id
     */
    public long count(Query query) {
        return mongoTemplate.count(query, getCurrentClass());
    }


    /**
     * 查询列表
     */
    public List<T> selectList(Query query) {
        return mongoTemplate.find(query, getCurrentClass());
    }

    /**
     * 查询列表
     */
    public List<T> selectList(Query query, Integer page, Integer size) {
        PageRequest pageRequest = PageRequest.of(page, size, Sort.by(Sort.Order.desc("_id")));
        query.with(pageRequest);
        return mongoTemplate.find(query, getCurrentClass());
    }

    /**
     * 查询列表
     */
    public List<T> selectList(Query query, Integer page, Integer size, Sort sort) {
        PageRequest pageRequest = PageRequest.of(page, size, sort);
        query.with(pageRequest);
        return mongoTemplate.find(query, getCurrentClass());
    }

    /**
     * 硬删除一个
     */
    public int hardDeleteOneById(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        return (int) mongoTemplate.remove(query, getCurrentClass()).getDeletedCount();
    }

    /**
     * 硬删除
     */
    public int hardDelete(Query query) {
        return (int) mongoTemplate.remove(query, getCurrentClass()).getDeletedCount();
    }

//    /**
//     * 软删除一个
//     */
//    public int softDeleteById(String id) {
//        Query query = new Query(Criteria.where("_id").is(id));
//        Update update = Update.update("is_del", true);
//        return (int) mongoTemplate.updateFirst(query, update, getCurrentClass()).getModifiedCount();
//    }
//
//    /**
//     * 软删除
//     */
//    public int softDelete(Query query) {
//        Update update = Update.update("is_del", true);
//        return (int) mongoTemplate.updateFirst(query, update, getCurrentClass()).getModifiedCount();
//    }


}