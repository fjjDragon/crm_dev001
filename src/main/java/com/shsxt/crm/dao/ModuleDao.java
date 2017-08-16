package com.shsxt.crm.dao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.shsxt.crm.model.Module;
import org.apache.ibatis.annotations.Select;

/**
 * Created by fjj on 2017/8/16.
 */
public interface ModuleDao {

    PageList<Module> selectForPage(PageBounds pageBounds);

    Module findByOptValue(String optValue);

    void insert(Module module);

    Module findById(Integer id);

    void update(Module moduleFromDB);

    void deleteBatch(String ids);
}
