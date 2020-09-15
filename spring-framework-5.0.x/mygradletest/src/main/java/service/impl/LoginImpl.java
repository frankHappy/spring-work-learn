package service.impl;

import org.gradle.internal.impldep.aQute.bnd.annotation.component.Component;
import service.ILogin;

/**
 * 功能描述：
 *
 * @Author: xcf
 * @Date: 2020/9/2 16:50
 */
@Component
public class LoginImpl implements ILogin {
	@Override
	public String loginCheck(String userName, String password) {
		return "success";
	}
}
