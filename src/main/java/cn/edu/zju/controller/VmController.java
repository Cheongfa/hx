package cn.edu.zju.controller;

import cn.edu.zju.domain.VmEntity;
import cn.edu.zju.domain.VmJson;
import cn.edu.zju.service.LoadVm;
import cn.edu.zju.util.Pagination;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hadoop on 2016/6/15.
 */

@Controller
@RequestMapping("/vm")
public class VmController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public String vmConf(Pagination pagination, HttpServletResponse response) throws Exception {

        response.setHeader("Access-Control-Allow-Origin", "*");
        List<VmEntity> list = LoadVm.parseXml();
        pagination.setTotalRow(list.size());
        pagination.setPageNow(2);

        //List<VmEntity> jsonList = this.getPageList(pagination, list);
        VmJson vmJson = this.getPageList(pagination, list);
        pagination.setTotalRow(list.size());//总页数

        return JSONObject.fromObject(vmJson).toString();
    }

    //public List<VmEntity> getPageList(Pagination pagination, List<VmEntity> total) throws Exception {
    public VmJson getPageList(Pagination pagination, List<VmEntity> total) throws Exception {

        List<VmEntity> jsonList = new ArrayList<VmEntity>();
        VmJson vmJson = new VmJson();

        for (int i = pagination.getStart(); i<pagination.getEnd(); i++) {
            jsonList.add(total.get(i));
        }
        vmJson.setPageCount(pagination.getPageCount());
        vmJson.setPageNow(pagination.getPageNow());
        vmJson.setVm(jsonList);
        //return jsonList;
        return vmJson;
    }

}
