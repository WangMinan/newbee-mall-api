/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本软件已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2021 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.api.mall.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 该类为搜索列表页商品VO，显示从整个商城或者某个单独分类内搜索出的商品数据，不显示商品原价、标签、轮播图片和字段内容
 *
 * @author 十三
 */
@Data
public class NewBeeMallSearchGoodsVO implements Serializable {

    @ApiModelProperty("商品id")
    public Long goodsId;

    @ApiModelProperty("商品名称")
    public String goodsName;

    @ApiModelProperty("商品简介")
    public String goodsIntro;

    @ApiModelProperty("商品图片地址")
    public String goodsCoverImg;

    @ApiModelProperty("商品价格")
    public Integer sellingPrice;

}
