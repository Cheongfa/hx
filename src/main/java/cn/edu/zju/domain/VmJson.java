package cn.edu.zju.domain;

import java.util.List;

/**
 * Created by hadoop on 2016/6/16.
 */
public class VmJson {
    private int pageCount;
    private int pageNow;
    private List<VmEntity> vm;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public List<VmEntity> getVm() {
        return vm;
    }

    public void setVm(List<VmEntity> vm) {
        this.vm = vm;
    }
}
