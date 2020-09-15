package service;

import org.gradle.internal.impldep.aQute.bnd.annotation.component.Component;

/**
 * 功能描述：
 *
 * @Author: xcf
 * @Date: 2020/9/2 16:49
 */

@Component
public interface ILogin {
	String loginCheck(String userName,String password);
}
