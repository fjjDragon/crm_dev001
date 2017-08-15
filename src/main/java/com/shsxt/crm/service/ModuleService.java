package com.shsxt.crm.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.shsxt.crm.base.BaseQuery;
import com.shsxt.crm.model.Module;
import com.shsxt.crm.util.AssertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fjj on 2017/8/15.
 */
@Service
public class ModuleService {
    @Autowired
    private ModuleDao moduleDao;

    /**
     * 分页查询
     *
     * @param query
     * @return
     */
    public Map<String, Object> selectForPage(BaseQuery query) {

        // 构建分页查询对象
        PageBounds pageBounds = query.buildPageBounds();

        // 直接调用dao的查询方法
        PageList<Module> modules = moduleDao.selectForPage(pageBounds);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", modules);
        result.put("total", modules.getPaginator().getTotalCount());
        return result;

        /**
         * 添加
         * @param module
         */

    public void add(Module module) {

    }

    /**
     * 更新
     *
     * @param module
     */
    public void update(Module module) {

    }

    /**
     * 删除
     *
     * @param ids
     */
    public void delete(String ids) {

    }

    /**
     * 基本参数验证
     * @param module
     */
    private void checkParams(Module module) {
        String moduleName = module.getModuleName();
        AssertUtil.isNotEmpty(moduleName,"请输入模块名称");
        Integer orders = module.getOrders();
        AssertUtil.intIsNotEmpty(orders,"请输入排序");
        String url = module.getUrl();
        AssertUtil.isNotEmpty(url,"请输入访问路径或者方法");
        String optValue = module.getOptValue();
        AssertUtil.isNotEmpty(optValue,"请输入操作权限");
        Integer grade = module.getGrade();
        AssertUtil.intIsNotEmpty(grade,"请输入层级关系");

    }



    /**
     * 构建treePath
     * @param grade
     * @param parentId
     * @return
     */
    private String buildTreePath(Integer grade, Integer parentId) {

    }

}


