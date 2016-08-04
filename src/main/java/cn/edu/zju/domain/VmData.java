package cn.edu.zju.domain;

import java.util.List;

/**
 * Created by hadoop on 2016/6/14.
 */
public class VmData {

    private String vmName;
    private String ip;
    private int pageCount;
    private int pageNow;

    private List<Vm> vm;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

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

    public List<Vm> getVm() {
        return vm;
    }

    public void setVm(List<Vm> vm) {
        this.vm = vm;
    }

    public String getVmName() {

        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }
}
