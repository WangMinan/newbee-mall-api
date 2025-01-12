/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本软件已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2021 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.service;

import ltd.newbee.mall.api.mall.vo.NewBeeMallIndexConfigGoodsVO;
import ltd.newbee.mall.entity.IndexConfig;
import ltd.newbee.mall.util.PageQueryUtil;
import ltd.newbee.mall.util.PageResult;

import java.util.List;

/**
 * 该类为首页配置项业务层接口
 *
 * @author 十三
 */
public interface NewBeeMallIndexConfigService {

    /**
     * 返回固定数量的首页配置商品对象(首页调用)
     *
     * @param number
     * @return
     */
    List<NewBeeMallIndexConfigGoodsVO> getConfigGoodsesForIndex(int configType, int number);

    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getConfigsPage(PageQueryUtil pageUtil);

    /**
     * 新增首页配置项
     * @param indexConfig
     * @return
     */
    String saveIndexConfig(IndexConfig indexConfig);

    /**
     * 修改首页配置项信息
     * @param indexConfig
     * @return
     */
    String updateIndexConfig(IndexConfig indexConfig);

    /**
     * 根据id返回首页配置项
     * @param id
     * @return
     */
    IndexConfig getIndexConfigById(Long id);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    Boolean deleteBatch(Long[] ids);
}
