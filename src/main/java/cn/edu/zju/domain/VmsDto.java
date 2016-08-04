package cn.edu.zju.domain;

/**
 * Created by hadoop on 2016/6/14.
 */
public class VmsDto {

    private VmData data;

    private String success;

    public VmData getData() {
        return data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public void setData(VmData data) {
        this.data = data;

    }
}
