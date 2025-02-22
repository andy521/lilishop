package cn.lili.modules.search.service;

import cn.lili.common.vo.PageVO;
import cn.lili.modules.search.entity.dos.EsGoodsIndex;
import cn.lili.modules.search.entity.dos.EsGoodsRelatedInfo;
import cn.lili.modules.search.entity.dto.EsGoodsSearchDTO;
import cn.lili.modules.search.entity.dto.HotWordsDTO;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * ES商品搜索业务层
 *
 * @author paulG
 * @since 2020/10/15
 **/
public interface EsGoodsSearchService {

    /**
     * 商品搜索
     *
     * @param searchDTO 搜索参数
     * @param pageVo    分页参数
     * @return 搜索结果
     */
    Page<EsGoodsIndex> searchGoods(EsGoodsSearchDTO searchDTO, PageVO pageVo);

    /**
     * 获取热门关键词
     *
     * @param count 热词数量
     * @return 热词集合
     */
    List<String> getHotWords(Integer count);

    /**
     * 设置热门关键词
     *
     * @param hotWords 热词分数
     */
    void setHotWords(HotWordsDTO hotWords);

    /**
     * 获取筛选器
     *
     * @param goodsSearch 搜索条件
     * @param pageVo      分页参数
     * @return ES商品关联
     */
    EsGoodsRelatedInfo getSelector(EsGoodsSearchDTO goodsSearch, PageVO pageVo);

    /**
     * 根据SkuID列表获取ES商品
     *
     * @param skuIds SkuId列表
     * @return ES商品列表
     */
    List<EsGoodsIndex> getEsGoodsBySkuIds(List<String> skuIds);
}
