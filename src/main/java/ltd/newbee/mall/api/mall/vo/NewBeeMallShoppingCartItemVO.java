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
 * 该类为购物车页面购物项VO，显示商品相关信息包括商品数量，以及购物项的id
 *
 * @author 十三
 */
@Data
public class NewBeeMallShoppingCartItemVO implements Serializable {

    //购物车中的购物项id
    @ApiModelProperty("购物项id")
    private Long cartItemId;

    //购物车中的商品id
    @ApiModelProperty("商品id")
    private Long goodsId;

    //购物车中的商品数量
    @ApiModelProperty("商品数量")
    private Integer goodsCount;

    //购物车中的商品名称
    @ApiModelProperty("商品名称")
    private String goodsName;

    //购物车中的商品图片
    @ApiModelProperty("商品图片")
    private String goodsCoverImg;

    //购物车中的商品价格
    @ApiModelProperty("商品价格")
    private Integer sellingPrice;
}