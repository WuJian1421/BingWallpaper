package com.example.bingwallpaper.contracts;

import com.example.bingwallpaper.baen.WallPaperBean;

import java.util.List;

/**
 * V层-实现Activity功能需求
 * 2019-11-14
 *
 * @author
 */
public interface WallPaperView {

    /**
     * 传递至Activity数据
     *
     * @param dataBeans
     */
    void getWallPaper(List<WallPaperBean.DataBean.ItemBean> dataBeans);

    /**
     * 运行加载ing...
     */
    void startLoading();

    /**
     * 结束加载ing...
     */
    void endLoading();

    /**
     * 获取成功
     */
    void getSuccess();

    /**
     * 获取失败
     */
    void getFailure();
}