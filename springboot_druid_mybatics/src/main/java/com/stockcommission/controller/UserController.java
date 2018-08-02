package com.stockcommission.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stockcommission.service.UserService;
import com.stockcommission.util.Result;
import com.stockcommission.util.ResultUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;

@RestController
@RequestMapping(value="/user")
@Api(tags="用户模块")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userServiceImpl;
	
	
	
	
	
	
	@ApiOperation(value="管理员查询用户的详细信息", notes="userid")
	@RequestMapping(value="/finduser", method=RequestMethod.POST)  
    public Result adminqueryuserinfor(@RequestBody String requestJson) { 
		
		try {
			JSONObject json = JSONObject.fromObject(requestJson);
			String userid = json.getString("userid");
	        return ResultUtil.success(userServiceImpl.queryuserinfor(userid));
		} catch (Exception e) {
			logger.error("adminqueryuserinfor error:" +e);
			return ResultUtil.error(-1);
		}
		
    }
	
	
}
