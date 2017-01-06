package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import po.Customer;
import service.CustomerService;

@Controller
//@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/findCustomer")
	@ResponseBody
	public String findCustomerByFirstName(String first_name) throws Exception {
		Customer customer = customerService.findCustomerByFirstName(first_name);
		if (customer != null) {
			// 登录成功请求主页面
			return "success";
		} else {
			// 登录失败回到登录界面
			return "fail";
		}
		
	}
}
