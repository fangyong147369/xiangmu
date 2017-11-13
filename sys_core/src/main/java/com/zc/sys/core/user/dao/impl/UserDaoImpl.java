package com.zc.sys.core.user.dao.impl;
import org.springframework.stereotype.Repository;

import com.zc.sys.common.dao.jpa.BaseDaoImpl;
import com.zc.sys.common.model.jpa.QueryParam;
import com.zc.sys.common.util.validate.StringUtil;
import com.zc.sys.core.user.dao.UserDao;
import com.zc.sys.core.user.entity.User;
import com.zc.sys.core.user.model.UserModel;
/**
 * 用户
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月09日
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	/**
	 * 计数
	 * @param model
	 * @return
	 */
	@Override
	public int countByModel(UserModel model) {
		QueryParam param = QueryParam.getInstance();
		if (model != null) {
			if (!StringUtil.isBlank(model.getMobile())) {
				param.addParam("mobile", model.getMobile());
			}
			if(!StringUtil.isBlank(model.getCardNo())){
				param.addParam("cardNo", model.getCardNo());
			}
			if(model.getRealNameState() != null){
				param.addParam("userIdentify.realNameState", model.getRealNameState());
			}
		}
		return super.countByCriteria(param);
	}

}